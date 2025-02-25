package com.galiglobal.benchmark.application;

/**
 * Generic interface for handling scope logs serialization and deserialization.
 *
 * @param <T> The type of ScopeLogs (either Protocol Buffers or Thrift)
 * @param <E> The type of Exception that can be thrown during serialization/deserialization
 */
public interface ScopeLogsService<T, E extends Exception> {
    
    /**
     * Serializes a ScopeLogs object into a byte array.
     *
     * @param scopeLogs the ScopeLogs object to serialize
     * @return the serialized byte array
     * @throws E if serialization fails
     */
    byte[] serialize(T scopeLogs) throws E;

    /**
     * Deserializes a byte array into a ScopeLogs object.
     *
     * @param serializedScopeLogs the byte array to deserialize
     * @return the deserialized ScopeLogs object
     * @throws E if deserialization fails
     */
    T deserialize(byte[] serializedScopeLogs) throws E;

    /**
     * Prints the size of the serialized ScopeLogs object.
     *
     * @param scopeLogs the ScopeLogs object to analyze
     * @throws E if serialization fails during size calculation
     */
    void printSerializedSize(T scopeLogs) throws E;
}