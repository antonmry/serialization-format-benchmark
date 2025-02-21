package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.application.AvroLibraryService;
import com.galiglobal.benchmark.avro.model.Library;
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

import static com.galiglobal.benchmark.benchmark.AvroBenchmarkDataFactory.getBook;
import static com.galiglobal.benchmark.benchmark.AvroBenchmarkDataFactory.getFixedLibrary;
import static com.galiglobal.benchmark.benchmark.AvroBenchmarkDataFactory.getLibrary;
import static com.galiglobal.benchmark.benchmark.AvroBenchmarkDataFactory.getManyBooks;
import static com.galiglobal.benchmark.benchmark.AvroBenchmarkDataFactory.getManyFixedBooks;

@State(Scope.Benchmark)
public class AvroBenchSimple {

    private final AvroLibraryService libraryService = new AvroLibraryService();

    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(3)
    @Measurement(iterations = 3, time = 3)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBig(BigLibrary input, Blackhole blackhole) {
        byte[] serialized = libraryService.serialize(input.library);
        blackhole.consume(libraryService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = 0)
    @Fork(0)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.SingleShotTime)
    public void sizeOfSerializedData(Parameters parameters) {
        libraryService.printSerializedSize(getFixedLibrary(getManyFixedBooks(parameters.librarySize)));
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
