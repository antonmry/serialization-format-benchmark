package com.galiglobal.benchmark.benchmark;

import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.VerboseMode;

public class BenchmarkRunner {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
            .include(JsonLogsBench.class.getSimpleName())
            .include(ProtoLogsBench.class.getSimpleName())
            .include(ThriftLogsBench.class.getSimpleName())
            .include(AvroLogsBench.class.getSimpleName())
            .verbosity(VerboseMode.NORMAL)
            .addProfiler(GCProfiler.class)
            .resultFormat(org.openjdk.jmh.results.format.ResultFormatType.JSON)
            .result("benchmark-results.json")
           .build();

        new Runner(opt).run();
    }
}
