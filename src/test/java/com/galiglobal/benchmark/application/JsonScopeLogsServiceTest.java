package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.json.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.json.otel.common.v1.KeyValue;
import com.galiglobal.benchmark.json.otel.logs.v1.LogRecord;
import com.galiglobal.benchmark.json.otel.logs.v1.ScopeLogs;
import com.galiglobal.benchmark.json.otel.logs.v1.SeverityNumber;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonScopeLogsServiceTest {

    private final JsonScopeLogsService service = new JsonScopeLogsService();

    private LogRecord getLogRecord() {
        LogRecord record = new LogRecord();
        record.setTimeUnixNano("1234567890000000000");
        record.setObservedTimeUnixNano("1234567890000000001");
        record.setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_INFO);
        record.setSeverityText("INFO");
        
        AnyValue body = new AnyValue();
        body.setStringValue("Test log message");
        record.setBody(body);

        KeyValue attribute = new KeyValue();
        attribute.setKey("test_key");
        AnyValue value = new AnyValue();
        value.setStringValue("test_value");
        attribute.setValue(value);
        record.setAttributes(List.of(attribute));

        return record;
    }

    private ScopeLogs getScopeLogs(List<LogRecord> records) {
        ScopeLogs scopeLogs = new ScopeLogs();
        scopeLogs.setLogRecords(records);
        scopeLogs.setSchemaUrl("https://opentelemetry.io/schemas/1.0.0");
        return scopeLogs;
    }

    @Test
    void testSerializeAndDeserialize() throws IOException {
        // Given
        ScopeLogs original = getScopeLogs(List.of(getLogRecord()));

        // When
        byte[] serialized = service.serialize(original);
        ScopeLogs deserialized = service.deserialize(serialized);

        // Then
        assertNotNull(serialized);
        assertNotNull(deserialized);
        assertEquals(original.getLogRecords().size(), deserialized.getLogRecords().size());
        assertEquals(original.getSchemaUrl(), deserialized.getSchemaUrl());
        
        // Verify log record contents
        LogRecord originalRecord = original.getLogRecords().get(0);
        LogRecord deserializedRecord = deserialized.getLogRecords().get(0);
        assertEquals(originalRecord.getTimeUnixNano(), deserializedRecord.getTimeUnixNano());
        assertEquals(originalRecord.getSeverityNumber(), deserializedRecord.getSeverityNumber());
        assertEquals(originalRecord.getBody().getStringValue(), deserializedRecord.getBody().getStringValue());
    }
}