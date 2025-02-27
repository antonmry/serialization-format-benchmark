package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.flatbuffers.otel.logs.v1.ScopeLogs;
import com.google.flatbuffers.FlatBufferBuilder;
import java.nio.ByteBuffer;

public class FlatbuffersScopeLogsService implements ScopeLogsService<ScopeLogs, RuntimeException> {

    @Override
    public byte[] serialize(ScopeLogs scopeLogs) throws RuntimeException {
        ByteBuffer bb = scopeLogs.getByteBuffer();
        // Create a new buffer and copy the data to simulate real serialization cost
        ByteBuffer copy = ByteBuffer.allocate(bb.remaining());
        copy.put(bb);
        copy.flip();
        byte[] bytes = new byte[copy.remaining()];
        copy.get(bytes);
        return bytes;
    }

    @Override
    public ScopeLogs deserialize(byte[] serializedScopeLogs) throws RuntimeException {
        // Create a new buffer and copy the data to simulate real deserialization cost
        ByteBuffer copy = ByteBuffer.allocate(serializedScopeLogs.length);
        copy.put(serializedScopeLogs);
        copy.flip();
        return ScopeLogs.getRootAsScopeLogs(copy);
    }

    @Override
    public void printSerializedSize(ScopeLogs scopeLogs) throws RuntimeException {
        System.out.printf("Serialized scoped logs with log records count: %s has size: %s%n", 
            scopeLogs.logRecordsLength(), 
            serialize(scopeLogs).length);
    }
}
