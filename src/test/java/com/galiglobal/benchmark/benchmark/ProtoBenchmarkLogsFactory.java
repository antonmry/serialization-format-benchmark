package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.proto.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.proto.otel.logs.v1.LogRecord;
import com.galiglobal.benchmark.proto.otel.logs.v1.ScopeLogs;
import com.galiglobal.benchmark.proto.otel.logs.v1.SeverityNumber;
import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;

public class ProtoBenchmarkLogsFactory {

    public static ScopeLogs getScopeLogs(List<LogRecord> logs) {
        return ScopeLogs.newBuilder()
            .addAllLogRecords(logs)
            .setSchemaUrl("http://example.com/schema/1.0")
            .build();
    }

    public static List<LogRecord> getManyLogRecords(int numberOfLogRecords) {
        List<LogRecord> logs = new ArrayList<>();
        for (int i = 0; i < numberOfLogRecords; i++) {
            logs.add(getLogRecord());
        }
        return logs;
    }

    public static LogRecord getLogRecord() {
        return LogRecord.newBuilder()
            .setTimeUnixNano(System.nanoTime())
            .setObservedTimeUnixNano(System.nanoTime())
            .setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG3) // SEVERITY_NUMBER_INFO
            .setSeverityText("INFO")
            .setBody(AnyValue.newBuilder().setStringValue(getRandomString()).build())
            .setSpanId(com.google.protobuf.ByteString.copyFromUtf8(getRandomString()))
            .setTraceId(com.google.protobuf.ByteString.copyFromUtf8(getRandomString()))
            .build();
    }

    public static String getRandomString() {
        return RandomString.make(getRandomInt());
    }

    public static int getRandomInt() {
        return (int) ((Math.random() * (13 - 3)) + 3);
    }

    public static ScopeLogs getFixedScopeLogs(List<LogRecord> logs) {
        return ScopeLogs.newBuilder()
            .addAllLogRecords(logs)
            .setSchemaUrl("http://example.com/schema/1.0")
            .build();
    }

    public static List<LogRecord> getManyFixedLogRecords(int numberOfLogRecords) {
        List<LogRecord> logs = new ArrayList<>();
        for (int i = 0; i < numberOfLogRecords; i++) {
            logs.add(getFixedLogRecord(i));
        }
        return logs;
    }

    public static LogRecord getFixedLogRecord(int index) {

        return LogRecord.newBuilder()
            .setTimeUnixNano(1000000000L * index)
            .setObservedTimeUnixNano(1000000000L * index)
            .setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG2)
            .setSeverityText("INFO")
            .setBody(AnyValue.newBuilder().setStringValue("message-" + index).build())
            .setSpanId(com.google.protobuf.ByteString.copyFromUtf8("span" + index))
            .setTraceId(com.google.protobuf.ByteString.copyFromUtf8("trace" + index))
            .build();
    }
}