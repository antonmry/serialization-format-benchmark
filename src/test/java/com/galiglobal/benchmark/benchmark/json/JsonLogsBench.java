package com.galiglobal.benchmark.benchmark.json;

import com.galiglobal.benchmark.application.JsonScopeLogsService;
import com.galiglobal.benchmark.json.otel.logs.v1.ScopeLogs;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.util.List;

import static com.galiglobal.benchmark.benchmark.BenchmarkConfig.*;
import static com.galiglobal.benchmark.benchmark.json.JsonBenchmarkLogsFactory.*;

@State(Scope.Benchmark)
public class JsonLogsBench {

    private final JsonScopeLogsService jsonScopeLogsService = new JsonScopeLogsService();

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeSmallThroughput(SmallScopeLogs input) throws IOException {
        jsonScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeBigThroughput(BigScopeLogs input) throws IOException {
        jsonScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeSmallThroughput(SmallScopeLogs input, Blackhole blackhole) throws IOException {
        byte[] serialized = jsonScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(jsonScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBigThroughput(BigScopeLogs input, Blackhole blackhole) throws IOException {
        byte[] serialized = jsonScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(jsonScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = 0)
    @Fork(0)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.SingleShotTime)
    public void sizeOfSerializedData(Parameters parameters) throws IOException {
        jsonScopeLogsService.printSerializedSize(getFixedScopeLogs(getManyFixedLogRecords(parameters.scopeLogsSize)));
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
