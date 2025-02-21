package com.galiglobal.benchmark.application;

import com.google.protobuf.InvalidProtocolBufferException;
import com.galiglobal.benchmark.proto.model.Library;

public class ProtoLibraryService {

    public byte[] serialize(Library library) {
        return library.toByteArray();
    }

    public Library deserialize(byte[] serializedLibrary) throws InvalidProtocolBufferException {
        return Library.parseFrom(serializedLibrary);
    }

    public void printSerializedSize(Library library) {
        System.out.printf("Serialized library with book count: %s has size: %s%n", library.getBooksList().size(), serialize(library).length);
    }
}
