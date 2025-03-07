// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.galiglobal.benchmark.proto.otel.common.v1;

public interface AnyValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.AnyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string string_value = 1;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <code>string string_value = 1;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <code>string string_value = 1;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>bool bool_value = 2;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <code>bool bool_value = 2;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <code>int64 int_value = 3;</code>
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();
  /**
   * <code>int64 int_value = 3;</code>
   * @return The intValue.
   */
  long getIntValue();

  /**
   * <code>double double_value = 4;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <code>double double_value = 4;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   * @return Whether the arrayValue field is set.
   */
  boolean hasArrayValue();
  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   * @return The arrayValue.
   */
  ArrayValue getArrayValue();
  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   */
  ArrayValueOrBuilder getArrayValueOrBuilder();

  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   * @return Whether the kvlistValue field is set.
   */
  boolean hasKvlistValue();
  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   * @return The kvlistValue.
   */
  KeyValueList getKvlistValue();
  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   */
  KeyValueListOrBuilder getKvlistValueOrBuilder();

  /**
   * <code>bytes bytes_value = 7;</code>
   * @return Whether the bytesValue field is set.
   */
  boolean hasBytesValue();
  /**
   * <code>bytes bytes_value = 7;</code>
   * @return The bytesValue.
   */
  com.google.protobuf.ByteString getBytesValue();

  public AnyValue.ValueCase getValueCase();
}
