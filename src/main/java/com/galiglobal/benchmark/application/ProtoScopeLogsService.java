package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.proto.otel.logs.v1.ScopeLogs;
import com.google.protobuf.InvalidProtocolBufferException;

public class ProtoScopeLogsService implements ScopeLogsService<ScopeLogs, InvalidProtocolBufferException> {

    public byte[] serialize(ScopeLogs scopeLogs) throws InvalidProtocolBufferException {
        return scopeLogs.toByteArray();
    }

    public ScopeLogs deserialize(byte[] serializedScopeLogs) throws InvalidProtocolBufferException {
        return ScopeLogs.parseFrom(serializedScopeLogs);
    }

    public void printSerializedSize(ScopeLogs scopeLogs) throws InvalidProtocolBufferException {
        System.out.printf("Serialized scoped logs with log records count: %s has size: %s%n", scopeLogs.getLogRecordsList().size(), serialize(scopeLogs).length);
    }
}
