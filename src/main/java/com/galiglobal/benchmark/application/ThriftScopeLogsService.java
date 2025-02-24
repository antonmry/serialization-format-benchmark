package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.thrift.otel.logs.v1.ScopeLogs;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TSerializer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;

public class ThriftScopeLogsService {

    public byte[] serialize(ScopeLogs scopeLogs) throws TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        return serializer.serialize(scopeLogs);
    }

    public ScopeLogs deserialize(byte[] serializedScopeLogs) throws TException {
        TDeserializer deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        ScopeLogs scopeLogs = new ScopeLogs();
        deserializer.deserialize(scopeLogs, serializedScopeLogs);
        return scopeLogs;
    }

    public void printSerializedSize(ScopeLogs scopeLogs) throws TException {
        System.out.printf("Serialized scoped logs with log records count: %s has size: %s%n", 
            scopeLogs.getLog_recordsSize(), 
            serialize(scopeLogs).length);
    }
}
