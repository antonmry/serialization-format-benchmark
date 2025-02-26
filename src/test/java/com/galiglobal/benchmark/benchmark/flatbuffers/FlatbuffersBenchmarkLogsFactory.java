package com.galiglobal.benchmark.benchmark.flatbuffers;

import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.LogRecord;
import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.ScopeLogs;
import com.galiglobal.benchmark.flatbuffers.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.flatbuffers.otel.common.v1.AnyValueUnion;
import com.galiglobal.benchmark.flatbuffers.otel.common.v1.StringValue;
import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.SeverityNumber;
import com.google.flatbuffers.FlatBufferBuilder;
import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;

public class FlatbuffersBenchmarkLogsFactory {
    public static ScopeLogs getScopeLogs(List<String> messages) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        List<Integer> logOffsets = new ArrayList<>();
        for (String message : messages) {
            String randomId = getRandomString();
            logOffsets.add(createLogRecordOffset(builder, message, randomId, randomId, "INFO"));
        }

        int schemaUrlOffset = builder.createString("http://example.com/schema/1.0");
        int logRecordsVector = ScopeLogs.createLogRecordsVector(builder, logOffsets.stream().mapToInt(i -> i).toArray());

        ScopeLogs.startScopeLogs(builder);
        ScopeLogs.addSchemaUrl(builder, schemaUrlOffset);
        ScopeLogs.addLogRecords(builder, logRecordsVector);
        int scopeLogsOffset = ScopeLogs.endScopeLogs(builder);

        builder.finish(scopeLogsOffset);
        return ScopeLogs.getRootAsScopeLogs(builder.dataBuffer());
    }

    private static int createLogRecordOffset(FlatBufferBuilder builder, String body, String spanId, String traceId, String severityText) {
        int bodyOffset = createAnyValueOffset(builder, body);
        int spanIdOffset = builder.createByteVector(spanId.getBytes());
        int traceIdOffset = builder.createByteVector(traceId.getBytes());
        int severityTextOffset = builder.createString(severityText);

        LogRecord.startLogRecord(builder);
        LogRecord.addTimeUnixNano(builder, System.nanoTime());
        LogRecord.addObservedTimeUnixNano(builder, System.nanoTime());
        LogRecord.addSeverityNumber(builder, SeverityNumber.DEBUG3);
        LogRecord.addSeverityText(builder, severityTextOffset);
        LogRecord.addBody(builder, bodyOffset);
        LogRecord.addSpanId(builder, spanIdOffset);
        LogRecord.addTraceId(builder, traceIdOffset);
        return LogRecord.endLogRecord(builder);
    }

    private static int createAnyValueOffset(FlatBufferBuilder builder, String value) {
        int stringValueOffset = builder.createString(value);

        // Create StringValue
        StringValue.startStringValue(builder);
        StringValue.addValue(builder, stringValueOffset);
        int strValueOffset = StringValue.endStringValue(builder);

        // Create AnyValue with StringValue
        AnyValue.startAnyValue(builder);
        AnyValue.addValueType(builder, AnyValueUnion.StringValue);
        AnyValue.addValue(builder, strValueOffset);
        return AnyValue.endAnyValue(builder);
    }

    public static List<String> getManyLogRecords(int numberOfLogRecords) {
        List<String> messages = new ArrayList<>();
        for (int i = 0; i < numberOfLogRecords; i++) {
            messages.add(getRandomString());
        }
        return messages;
    }

    public static LogRecord getLogRecord(String message) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        String randomId = getRandomString();
        int logRecordOffset = createLogRecordOffset(builder, message, randomId, randomId, "INFO");
        builder.finish(logRecordOffset);
        return LogRecord.getRootAsLogRecord(builder.dataBuffer());
    }

    public static String getRandomString() {
        return RandomString.make(getRandomInt());
    }

    public static int getRandomInt() {
        return (int) ((Math.random() * (13 - 3)) + 3);
    }
}
