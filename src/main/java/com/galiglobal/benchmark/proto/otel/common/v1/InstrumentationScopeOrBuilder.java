// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.galiglobal.benchmark.proto.otel.common.v1;

public interface InstrumentationScopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.InstrumentationScope)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Additional attributes that describe the scope. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<KeyValue>
      getAttributesList();
  /**
   * <pre>
   * Additional attributes that describe the scope. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  KeyValue getAttributes(int index);
  /**
   * <pre>
   * Additional attributes that describe the scope. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Additional attributes that describe the scope. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<? extends KeyValueOrBuilder>
      getAttributesOrBuilderList();
  /**
   * <pre>
   * Additional attributes that describe the scope. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  KeyValueOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <code>uint32 dropped_attributes_count = 4;</code>
   * @return The droppedAttributesCount.
   */
  int getDroppedAttributesCount();
}
