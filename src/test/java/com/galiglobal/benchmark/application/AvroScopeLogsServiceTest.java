package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.avro.otel.ScopeLogs;
import com.galiglobal.benchmark.avro.otel.LogRecord;
import com.galiglobal.benchmark.avro.otel.InstrumentationScope;
import com.galiglobal.benchmark.avro.otel.SeverityNumber;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AvroScopeLogsServiceTest {

    private final AvroScopeLogsService service = new AvroScopeLogsService();

    @Test
    void testSerializeAndDeserialize() throws IOException {
        // Given
        LogRecord logRecord = LogRecord.newBuilder()
            .setTimeUnixNano(System.currentTimeMillis() * 1_000_000)
            .setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_INFO)
            .setSeverityText("INFO")
            .setBody(null)
            .setAttributes(Collections.emptyList())
            .setDroppedAttributesCount(0)
            .setFlags(0)
            .setTraceId(ByteBuffer.allocate(0))
            .setSpanId(ByteBuffer.allocate(0))
            .build();

        InstrumentationScope scope = InstrumentationScope.newBuilder()
            .setName("test-scope")
            .setVersion(null)
            .setAttributes(Collections.emptyList())
            .setDroppedAttributesCount(0)
            .build();

        ScopeLogs original = ScopeLogs.newBuilder()
            .setScope(scope)
            .setLogRecords(Collections.singletonList(logRecord))
            .setSchemaUrl("test-schema-url")
            .build();

        // When
        byte[] serialized = service.serialize(original);
        ScopeLogs deserialized = service.deserialize(serialized);

        // Then
        assertNotNull(serialized);
        assertNotNull(deserialized);
        assertEquals(original.getLogRecords().size(), deserialized.getLogRecords().size());
        assertEquals(original.getSchemaUrl(), deserialized.getSchemaUrl().toString());
        assertEquals(original.getScope().getName(), deserialized.getScope().getName().toString());
    }
}
