package com.galiglobal.benchmark.benchmark;

import com.google.protobuf.InvalidProtocolBufferException;
import com.galiglobal.benchmark.application.ProtoLibraryService;
import com.galiglobal.benchmark.proto.model.Library;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkDataFactory.getBook;
import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkDataFactory.getFixedLibrary;
import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkDataFactory.getLibrary;
import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkDataFactory.getManyBooks;
import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkDataFactory.getManyFixedBooks;

@State(Scope.Benchmark)
public class ProtoBenchSimple {

    private final ProtoLibraryService protoLibraryService = new ProtoLibraryService();

    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(3)
    @Measurement(iterations = 3, time = 3)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBigThroughput(BigLibrary input, Blackhole blackhole) throws InvalidProtocolBufferException {
        byte[] serialized = protoLibraryService.serialize(input.library);
        blackhole.consume(protoLibraryService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = 0)
    @Fork(0)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.SingleShotTime)
    public void sizeOfSerializedData(Parameters parameters) {
        protoLibraryService.printSerializedSize(getFixedLibrary(getManyFixedBooks(parameters.librarySize)));
    }

    @State(Scope.Benchmark)
    public static class SmallLibrary {
        public Library library;

        @Setup(Level.Invocation)
        public void setUp() {
            library = getLibrary(List.of(getBook()));
        }
    }

    @State(Scope.Benchmark)
    public static class BigLibrary {
        public Library library;

        @Setup(Level.Invocation)
        public void setUp() {
            library = getLibrary(getManyBooks(1000));
        }
    }

    @State(Scope.Benchmark)
    public static class Parameters {

        @Param({"1", "10", "1000", "1000000"})
        public int librarySize;
    }
}
