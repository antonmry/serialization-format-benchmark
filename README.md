# Serialization Format Benchmark

A comprehensive benchmark comparing different serialization formats for performance analysis.

## Overview

This project provides benchmarks for various serialization formats commonly used in modern streaming pipelines:
- JSON (using Jackson)
- Protocol Buffers
- Apache Thrift
- Apache Avro
- FlatBuffers

## Technologies

- [Java 23](https://openjdk.org/projects/jdk/23/)
- [JMH](https://github.com/openjdk/jmh) (Java Microbenchmark Harness)
- [Gradle](https://gradle.org/)
- Various serialization libraries:
  - [Jackson](https://github.com/FasterXML/jackson) (JSON)
  - [Protocol Buffers](https://protobuf.dev/)
  - [Apache Thrift](https://thrift.apache.org/)
  - [Apache Avro](https://avro.apache.org/)
  - [FlatBuffers](https://google.github.io/flatbuffers/)

## Running the Benchmarks

1. Ensure you have Java 23 installed
2. Run the benchmarks using Gradle:
   ```bash
   ./gradlew jmh
   ```

The results will be available in:
- Human-readable format: `build/reports/jmh/human.txt`
- JSON format: `build/reports/jmh/results.txt`
- Visualized results: `docs/index.html`

## Project Structure

```
├── src/
│   ├── main/java/          # Main source code
│   └── test/java/          # Benchmark implementations
├── docs/
│   ├── benchmark-results.json  # Latest benchmark results
│   └── index.html             # Results visualization
└── build.gradle           # Project configuration
```

## Results

The benchmark results are visualized in `docs/index.html`, which provides an interactive view of:
- Serialization/Deserialization performance
- Memory usage
- Comparative analysis between formats

For the latest results, open `docs/index.html` in a web browser after running the benchmarks.