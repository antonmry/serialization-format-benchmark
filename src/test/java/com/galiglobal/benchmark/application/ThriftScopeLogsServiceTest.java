package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.thrift.otel.logs.v1.ScopeLogs;
import org.apache.thrift.TException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.galiglobal.benchmark.benchmark.ThriftBenchmarkLogsFactory.getLogRecord;
import static com.galiglobal.benchmark.benchmark.ThriftBenchmarkLogsFactory.getScopeLogs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ThriftScopeLogsServiceTest {

    private final ThriftScopeLogsService service = new ThriftScopeLogsService();

    @Test
    void testSerializeAndDeserialize() throws TException {
        // Given
        ScopeLogs original = getScopeLogs(List.of(getLogRecord()));

        // When
        byte[] serialized = service.serialize(original);
        ScopeLogs deserialized = service.deserialize(serialized);

        // Then
        assertNotNull(serialized);
        assertNotNull(deserialized);
        assertEquals(original.getLog_recordsSize(), deserialized.getLog_recordsSize());
        assertEquals(original.getSchema_url(), deserialized.getSchema_url());
    }
}