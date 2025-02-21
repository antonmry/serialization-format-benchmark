package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.application.ProtoScopeLogsService;
import com.galiglobal.benchmark.proto.otel.logs.v1.ScopeLogs;
import com.google.protobuf.InvalidProtocolBufferException;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.ProtoBenchmarkLogsFactory.*;

@State(Scope.Benchmark)
public class ProtoBenchSimple {

    private final ProtoScopeLogsService protoScopeLogsService = new ProtoScopeLogsService();

    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(3)
    @Measurement(iterations = 3, time = 3)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBigThroughput(BigScopeLogs input, Blackhole blackhole) throws InvalidProtocolBufferException {
        byte[] serialized = protoScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(protoScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = 0)
    @Fork(0)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.SingleShotTime)
    public void sizeOfSerializedData(Parameters parameters) {
        protoScopeLogsService.printSerializedSize(getFixedScopeLogs(getManyFixedLogRecords(parameters.scopeLogsSize)));
    }

    @State(Scope.Benchmark)
    public static class SmallScopeLogs {
        public ScopeLogs scopeLogs;

        @Setup(Level.Invocation)
        public void setUp() {
            scopeLogs = getScopeLogs(List.of(getLogRecord()));
        }
    }

    @State(Scope.Benchmark)
    public static class BigScopeLogs {
        public ScopeLogs scopeLogs;

        @Setup(Level.Invocation)
        public void setUp() {
            scopeLogs = getScopeLogs(getManyLogRecords(1000));
        }
    }

    @State(Scope.Benchmark)
    public static class Parameters {
        @Param({"1", "10", "1000", "1000000"})
        public int scopeLogsSize;
    }
}