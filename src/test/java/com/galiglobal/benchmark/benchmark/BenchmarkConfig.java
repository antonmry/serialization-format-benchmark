package com.galiglobal.benchmark.benchmark;

/**
 * Common configuration values for benchmarks.
 */
public final class BenchmarkConfig {
    /**
     * Number of warmup iterations before benchmark measurements
     */
    public static final int WARMUP_ITERATIONS = 1;
    /**
     * Time in seconds for each warmup iteration
     */
    public static final int WARMUP_TIME = 1;
    /**
     * Number of iterations for benchmark measurements
     */
    public static final int MEASUREMENT_ITERATIONS = 3;
    /**
     * Time in seconds for each measurement iteration
     */
    public static final int MEASUREMENT_TIME = 3;
    /**
     * Number of benchmark forks to run
     */
    public static final int FORK_COUNT = 1;

    private BenchmarkConfig() {
        // Utility class, no instantiation
    }
}
