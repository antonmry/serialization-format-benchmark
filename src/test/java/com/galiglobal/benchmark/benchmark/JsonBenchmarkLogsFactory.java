package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.json.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.json.otel.logs.v1.LogRecord;
import com.galiglobal.benchmark.json.otel.logs.v1.ScopeLogs;
import com.galiglobal.benchmark.json.otel.logs.v1.SeverityNumber;
import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;

public class JsonBenchmarkLogsFactory {

    public static ScopeLogs getScopeLogs(List<LogRecord> logs) {
        ScopeLogs scopeLogs = new ScopeLogs();
        scopeLogs.setLogRecords(logs);
        scopeLogs.setSchemaUrl("http://example.com/schema/1.0");
        return scopeLogs;
    }

    public static List<LogRecord> getManyLogRecords(int numberOfLogRecords) {
        List<LogRecord> logs = new ArrayList<>();
        for (int i = 0; i < numberOfLogRecords; i++) {
            logs.add(getLogRecord());
        }
        return logs;
    }

    public static LogRecord getLogRecord() {
        LogRecord record = new LogRecord();
        record.setTimeUnixNano(String.valueOf(System.nanoTime()));
        record.setObservedTimeUnixNano(String.valueOf(System.nanoTime()));
        record.setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG3);
        record.setSeverityText("INFO");

        AnyValue body = new AnyValue();
        body.setStringValue(getRandomString());
        record.setBody(body);

        record.setSpanId(getRandomString());
        record.setTraceId(getRandomString());

        return record;
    }

    public static String getRandomString() {
        return RandomString.make(getRandomInt());
    }

    public static int getRandomInt() {
        return (int) ((Math.random() * (13 - 3)) + 3);
    }

    public static ScopeLogs getFixedScopeLogs(List<LogRecord> logs) {
        ScopeLogs scopeLogs = new ScopeLogs();
        scopeLogs.setLogRecords(logs);
        scopeLogs.setSchemaUrl("http://example.com/schema/1.0");
        return scopeLogs;
    }

    public static List<LogRecord> getManyFixedLogRecords(int numberOfLogRecords) {
        List<LogRecord> logs = new ArrayList<>();
        for (int i = 0; i < numberOfLogRecords; i++) {
            logs.add(getFixedLogRecord(i));
        }
        return logs;
    }

    public static LogRecord getFixedLogRecord(int index) {
        LogRecord record = new LogRecord();
        record.setTimeUnixNano(String.valueOf(1000000000L * index));
        record.setObservedTimeUnixNano(String.valueOf(1000000000L * index));
        record.setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_DEBUG2);
        record.setSeverityText("INFO");

        AnyValue body = new AnyValue();
        body.setStringValue("message-" + index);
        record.setBody(body);

        record.setSpanId("span" + index);
        record.setTraceId("trace" + index);

        return record;
    }
}