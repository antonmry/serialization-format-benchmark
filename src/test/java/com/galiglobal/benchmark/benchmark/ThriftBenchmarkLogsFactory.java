package com.galiglobal.benchmark.benchmark;

import com.galiglobal.benchmark.thrift.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.thrift.otel.logs.v1.LogRecord;
import com.galiglobal.benchmark.thrift.otel.logs.v1.ScopeLogs;
import com.galiglobal.benchmark.thrift.otel.logs.v1.SeverityNumber;
import net.bytebuddy.utility.RandomString;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ThriftBenchmarkLogsFactory {

    public static ScopeLogs getScopeLogs(List<LogRecord> logs) {
        ScopeLogs scopeLogs = new ScopeLogs();
        scopeLogs.setLog_records(logs);
        scopeLogs.setSchema_url("http://example.com/schema/1.0");
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
        record.setTime_unix_nano(System.nanoTime());
        record.setObserved_time_unix_nano(System.nanoTime());
        record.setSeverity_number(SeverityNumber.SEVERITY_NUMBER_DEBUG3);
        record.setSeverity_text("INFO");
        
        AnyValue body = new AnyValue();
        body.setString_value(getRandomString());
        record.setBody(body);
        
        record.setSpan_id(ByteBuffer.wrap(getRandomString().getBytes()));
        record.setTrace_id(ByteBuffer.wrap(getRandomString().getBytes()));
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
        scopeLogs.setLog_records(logs);
        scopeLogs.setSchema_url("http://example.com/schema/1.0");
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
        record.setTime_unix_nano(1000000000L * index);
        record.setObserved_time_unix_nano(1000000000L * index);
        record.setSeverity_number(SeverityNumber.SEVERITY_NUMBER_DEBUG2);
        record.setSeverity_text("INFO");
        
        AnyValue body = new AnyValue();
        body.setString_value("message-" + index);
        record.setBody(body);
        
        record.setSpan_id(ByteBuffer.wrap(("span" + index).getBytes()));
        record.setTrace_id(ByteBuffer.wrap(("trace" + index).getBytes()));
        return record;
    }
}