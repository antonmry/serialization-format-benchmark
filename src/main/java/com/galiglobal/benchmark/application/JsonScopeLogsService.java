package com.galiglobal.benchmark.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galiglobal.benchmark.json.otel.logs.v1.ScopeLogs;
import java.io.IOException;

public class JsonScopeLogsService implements ScopeLogsService<ScopeLogs, IOException> {
    private final ObjectMapper objectMapper;

    public JsonScopeLogsService() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public byte[] serialize(ScopeLogs scopeLogs) throws IOException {
        return objectMapper.writeValueAsBytes(scopeLogs);
    }

    @Override
    public ScopeLogs deserialize(byte[] serializedScopeLogs) throws IOException {
        return objectMapper.readValue(serializedScopeLogs, ScopeLogs.class);
    }

    @Override
    public void printSerializedSize(ScopeLogs scopeLogs) throws IOException {
        System.out.printf("Serialized scoped logs with log records count: %s has size: %s%n",
            scopeLogs.getLogRecords().size(), serialize(scopeLogs).length);
    }
}
