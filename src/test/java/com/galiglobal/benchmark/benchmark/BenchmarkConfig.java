package com.galiglobal.benchmark.benchmark;

/**
 * Common configuration values for benchmarks.
 */
public final class BenchmarkConfig {
    private BenchmarkConfig() {
        // Utility class, no instantiation
    }

    /**
     * Number of iterations for benchmark measurements
     */
    public static final int MEASUREMENT_ITERATIONS = 1;

    /**
     * Time in seconds for each measurement iteration
     */
    public static final int MEASUREMENT_TIME = 1;
}