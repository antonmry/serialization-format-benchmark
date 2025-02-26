package com.galiglobal.benchmark.benchmark.flatbuffers;

import com.galiglobal.benchmark.application.FlatbuffersScopeLogsService;
import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.ScopeLogs;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.BenchmarkConfig.*;
import static com.galiglobal.benchmark.benchmark.flatbuffers.FlatbuffersBenchmarkLogsFactory.*;

@State(Scope.Benchmark)
public class FlatbuffersLogsBench {

    private final FlatbuffersScopeLogsService flatbuffersScopeLogsService = new FlatbuffersScopeLogsService();

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeSmallThroughput(SmallScopeLogs input) {
        flatbuffersScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeBigThroughput(BigScopeLogs input) {
        flatbuffersScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeSmallThroughput(SmallScopeLogs input, Blackhole blackhole) {
        byte[] serialized = flatbuffersScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(flatbuffersScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBigThroughput(BigScopeLogs input, Blackhole blackhole) {
        byte[] serialized = flatbuffersScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(flatbuffersScopeLogsService.deserialize(serialized));
    }

    @State(Scope.Benchmark)
    public static class SmallScopeLogs {
        public ScopeLogs scopeLogs;

        @Setup(Level.Invocation)
        public void setUp() {
            scopeLogs = getScopeLogs(List.of("test message"));
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
}
