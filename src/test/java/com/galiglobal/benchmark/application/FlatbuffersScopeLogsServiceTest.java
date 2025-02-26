package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.ScopeLogs;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.flatbuffers.FlatbuffersBenchmarkLogsFactory.getScopeLogs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FlatbuffersScopeLogsServiceTest {

    private final FlatbuffersScopeLogsService service = new FlatbuffersScopeLogsService();

    @Test
    void testSerializeAndDeserialize() {
        // Given
        ScopeLogs original = getScopeLogs(List.of("test message"));

        // When
        byte[] serialized = service.serialize(original);
        ScopeLogs deserialized = service.deserialize(serialized);

        // Then
        assertNotNull(serialized);
        assertNotNull(deserialized);
        assertEquals(original.logRecordsLength(), deserialized.logRecordsLength());
        assertEquals(original.schemaUrl(), deserialized.schemaUrl());
    }
}