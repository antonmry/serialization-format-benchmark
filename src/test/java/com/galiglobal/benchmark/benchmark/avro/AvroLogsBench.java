package com.galiglobal.benchmark.benchmark.avro;

import com.galiglobal.benchmark.application.AvroScopeLogsService;
import com.galiglobal.benchmark.avro.otel.ScopeLogs;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.util.List;

import static com.galiglobal.benchmark.benchmark.BenchmarkConfig.*;
import static com.galiglobal.benchmark.benchmark.avro.AvroBenchmarkLogsFactory.*;

@State(Scope.Benchmark)
public class AvroLogsBench {

    private final AvroScopeLogsService avroScopeLogsService = new AvroScopeLogsService();

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeSmallThroughput(SmallScopeLogs input) throws IOException {
        avroScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeBigThroughput(BigScopeLogs input) throws IOException {
        avroScopeLogsService.serialize(input.scopeLogs);
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeSmallThroughput(SmallScopeLogs input, Blackhole blackhole) throws IOException {
        byte[] serialized = avroScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(avroScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = WARMUP_ITERATIONS, time = WARMUP_TIME)
    @Fork(FORK_COUNT)
    @Measurement(iterations = MEASUREMENT_ITERATIONS, time = MEASUREMENT_TIME)
    @BenchmarkMode(Mode.Throughput)
    public void serializeAndDeserializeBigThroughput(BigScopeLogs input, Blackhole blackhole) throws IOException {
        byte[] serialized = avroScopeLogsService.serialize(input.scopeLogs);
        blackhole.consume(avroScopeLogsService.deserialize(serialized));
    }

    @Benchmark
    @Warmup(iterations = 0)
    @Fork(0)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.SingleShotTime)
    public void sizeOfSerializedData(Parameters parameters) throws IOException {
        avroScopeLogsService.printSerializedSize(getFixedScopeLogs(getManyFixedLogRecords(parameters.scopeLogsSize)));
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
