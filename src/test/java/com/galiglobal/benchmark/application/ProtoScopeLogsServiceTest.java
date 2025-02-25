package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.proto.otel.logs.v1.ScopeLogs;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.proto.ProtoBenchmarkLogsFactory.getLogRecord;
import static com.galiglobal.benchmark.benchmark.proto.ProtoBenchmarkLogsFactory.getScopeLogs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProtoScopeLogsServiceTest {

    private final ProtoScopeLogsService service = new ProtoScopeLogsService();

    @Test
    void testSerializeAndDeserialize() throws InvalidProtocolBufferException {
        // Given
        ScopeLogs original = getScopeLogs(List.of(getLogRecord()));

        // When
        byte[] serialized = service.serialize(original);
        ScopeLogs deserialized = service.deserialize(serialized);

        // Then
        assertNotNull(serialized);
        assertNotNull(deserialized);
        assertEquals(original.getLogRecordsCount(), deserialized.getLogRecordsCount());
        assertEquals(original.getSchemaUrl(), deserialized.getSchemaUrl());
    }
}