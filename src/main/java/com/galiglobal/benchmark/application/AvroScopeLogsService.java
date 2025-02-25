package com.galiglobal.benchmark.application;

import com.galiglobal.benchmark.avro.otel.ScopeLogs;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroScopeLogsService implements ScopeLogsService<ScopeLogs, IOException> {

    private final SpecificDatumWriter<ScopeLogs> writer;
    private final SpecificDatumReader<ScopeLogs> reader;

    public AvroScopeLogsService() {
        var schema = ScopeLogs.getClassSchema();
        var specificData = new org.apache.avro.specific.SpecificData(ScopeLogs.class.getClassLoader());
        specificData.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());

        // Configure for specific record handling
        specificData.setCustomCoders(true);

        this.writer = new SpecificDatumWriter<>(schema, specificData);
        this.reader = new SpecificDatumReader<>(schema, schema, specificData);
    }

    @Override
    public byte[] serialize(ScopeLogs scopeLogs) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(baos, null);
        writer.write(scopeLogs, encoder);
        encoder.flush();
        return baos.toByteArray();
    }

    @Override
    public ScopeLogs deserialize(byte[] bytes) throws IOException {
        BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(bytes, null);
        ScopeLogs scopeLogs = new ScopeLogs();
        return reader.read(scopeLogs, decoder);
    }

    @Override
    public void printSerializedSize(ScopeLogs scopeLogs) throws IOException {
        byte[] bytes = serialize(scopeLogs);
        System.out.println("Serialized size (bytes): " + bytes.length);
    }
}
