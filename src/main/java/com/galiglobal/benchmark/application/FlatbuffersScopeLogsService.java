package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.ScopeLogs;
import com.google.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;

public class FlatbuffersScopeLogsService implements ScopeLogsService<ScopeLogs, RuntimeException> {
    
    @Override
    public byte[] serialize(ScopeLogs scopeLogs) throws RuntimeException {
        ByteBuffer bb = scopeLogs.getByteBuffer();
        byte[] bytes = new byte[bb.remaining()];
        bb.get(bytes);
        return bytes;
    }

    @Override
    public ScopeLogs deserialize(byte[] serializedScopeLogs) throws RuntimeException {
        ByteBuffer bb = ByteBuffer.wrap(serializedScopeLogs);
        return ScopeLogs.getRootAsScopeLogs(bb);
    }

    @Override
    public void printSerializedSize(ScopeLogs scopeLogs) throws RuntimeException {
        System.out.printf("Serialized scoped logs with log records count: %s has size: %s%n", 
            scopeLogs.logRecordsLength(), 
            serialize(scopeLogs).length);
    }
}