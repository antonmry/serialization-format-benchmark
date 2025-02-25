package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.avro.otel.ScopeLogs;
import com.galiglobal.benchmark.avro.otel.LogRecord;
import com.galiglobal.benchmark.avro.otel.AnyValue;
import com.galiglobal.benchmark.avro.otel.SeverityNumber;
import net.bytebuddy.utility.RandomString;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AvroBenchmarkLogsFactory {

    public static ScopeLogs getScopeLogs(List<LogRecord> logs) {
        return ScopeLogs.newBuilder()
            .setLogRecords(logs)
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
            .setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG3)
            .setSeverityText("INFO")
            .setBody(AnyValue.newBuilder().setStringValue(getRandomString()).build())
            .setSpanId(ByteBuffer.wrap(getRandomString().getBytes()))
            .setTraceId(ByteBuffer.wrap(getRandomString().getBytes()))
            .setAttributes(Collections.emptyList())
            .setDroppedAttributesCount(0)
            .setFlags(0)
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
            .setLogRecords(logs)
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
            .setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG2)
            .setSeverityText("INFO")
            .setBody(AnyValue.newBuilder().setStringValue("message-" + index).build())
            .setSpanId(ByteBuffer.wrap(("span" + index).getBytes()))
            .setTraceId(ByteBuffer.wrap(("trace" + index).getBytes()))
            .setAttributes(Collections.emptyList())
            .setDroppedAttributesCount(0)
            .setFlags(0)
            .build();
    }
}
