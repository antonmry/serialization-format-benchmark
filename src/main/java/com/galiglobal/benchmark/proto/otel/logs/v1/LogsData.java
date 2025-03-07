// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs.proto

package com.galiglobal.benchmark.proto.otel.logs.v1;

/**
 * <pre>
 * LogsData represents the logs data that can be stored in a persistent storage,
 * OR can be embedded by other protocols that transfer OTLP logs data but do not
 * implement the OTLP protocol.
 * The main difference between this message and collector protocol is that
 * in this message there will not be any "control" or "metadata" specific to
 * OTLP protocol.
 * When new fields are added into this message, the OTLP request MUST be updated
 * as well.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.logs.v1.LogsData}
 */
public final class LogsData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.logs.v1.LogsData)
    LogsDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogsData.newBuilder() to construct.
  private LogsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogsData() {
    resourceLogs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogsData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LogsProto.internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LogsProto.internal_static_opentelemetry_proto_logs_v1_LogsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LogsData.class, LogsData.Builder.class);
  }

  public static final int RESOURCE_LOGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ResourceLogs> resourceLogs_;
  /**
   * <pre>
   * An array of ResourceLogs.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ResourceLogs> getResourceLogsList() {
    return resourceLogs_;
  }
  /**
   * <pre>
   * An array of ResourceLogs.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ResourceLogsOrBuilder>
      getResourceLogsOrBuilderList() {
    return resourceLogs_;
  }
  /**
   * <pre>
   * An array of ResourceLogs.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
   */
  @java.lang.Override
  public int getResourceLogsCount() {
    return resourceLogs_.size();
  }
  /**
   * <pre>
   * An array of ResourceLogs.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
   */
  @java.lang.Override
  public ResourceLogs getResourceLogs(int index) {
    return resourceLogs_.get(index);
  }
  /**
   * <pre>
   * An array of ResourceLogs.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
   */
  @java.lang.Override
  public ResourceLogsOrBuilder getResourceLogsOrBuilder(
      int index) {
    return resourceLogs_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < resourceLogs_.size(); i++) {
      output.writeMessage(1, resourceLogs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceLogs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, resourceLogs_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof LogsData)) {
      return super.equals(obj);
    }
    LogsData other = (LogsData) obj;

    if (!getResourceLogsList()
        .equals(other.getResourceLogsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResourceLogsCount() > 0) {
      hash = (37 * hash) + RESOURCE_LOGS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceLogsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LogsData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LogsData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LogsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LogsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LogsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LogsData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LogsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LogsData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LogsData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LogsData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LogsData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LogsData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(LogsData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * LogsData represents the logs data that can be stored in a persistent storage,
   * OR can be embedded by other protocols that transfer OTLP logs data but do not
   * implement the OTLP protocol.
   * The main difference between this message and collector protocol is that
   * in this message there will not be any "control" or "metadata" specific to
   * OTLP protocol.
   * When new fields are added into this message, the OTLP request MUST be updated
   * as well.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.logs.v1.LogsData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.logs.v1.LogsData)
      LogsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LogsProto.internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LogsProto.internal_static_opentelemetry_proto_logs_v1_LogsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LogsData.class, LogsData.Builder.class);
    }

    // Construct using io.opentelemetry.proto.logs.v1.LogsData.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (resourceLogsBuilder_ == null) {
        resourceLogs_ = java.util.Collections.emptyList();
      } else {
        resourceLogs_ = null;
        resourceLogsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LogsProto.internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor;
    }

    @java.lang.Override
    public LogsData getDefaultInstanceForType() {
      return LogsData.getDefaultInstance();
    }

    @java.lang.Override
    public LogsData build() {
      LogsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public LogsData buildPartial() {
      LogsData result = new LogsData(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(LogsData result) {
      if (resourceLogsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceLogs_ = java.util.Collections.unmodifiableList(resourceLogs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceLogs_ = resourceLogs_;
      } else {
        result.resourceLogs_ = resourceLogsBuilder_.build();
      }
    }

    private void buildPartial0(LogsData result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof LogsData) {
        return mergeFrom((LogsData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LogsData other) {
      if (other == LogsData.getDefaultInstance()) return this;
      if (resourceLogsBuilder_ == null) {
        if (!other.resourceLogs_.isEmpty()) {
          if (resourceLogs_.isEmpty()) {
            resourceLogs_ = other.resourceLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceLogsIsMutable();
            resourceLogs_.addAll(other.resourceLogs_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceLogs_.isEmpty()) {
          if (resourceLogsBuilder_.isEmpty()) {
            resourceLogsBuilder_.dispose();
            resourceLogsBuilder_ = null;
            resourceLogs_ = other.resourceLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceLogsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceLogsFieldBuilder() : null;
          } else {
            resourceLogsBuilder_.addAllMessages(other.resourceLogs_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ResourceLogs m =
                  input.readMessage(
                      ResourceLogs.parser(),
                      extensionRegistry);
              if (resourceLogsBuilder_ == null) {
                ensureResourceLogsIsMutable();
                resourceLogs_.add(m);
              } else {
                resourceLogsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<ResourceLogs> resourceLogs_ =
      java.util.Collections.emptyList();
    private void ensureResourceLogsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceLogs_ = new java.util.ArrayList<ResourceLogs>(resourceLogs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ResourceLogs, ResourceLogs.Builder, ResourceLogsOrBuilder> resourceLogsBuilder_;

    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public java.util.List<ResourceLogs> getResourceLogsList() {
      if (resourceLogsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceLogs_);
      } else {
        return resourceLogsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public int getResourceLogsCount() {
      if (resourceLogsBuilder_ == null) {
        return resourceLogs_.size();
      } else {
        return resourceLogsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public ResourceLogs getResourceLogs(int index) {
      if (resourceLogsBuilder_ == null) {
        return resourceLogs_.get(index);
      } else {
        return resourceLogsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder setResourceLogs(
        int index, ResourceLogs value) {
      if (resourceLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLogsIsMutable();
        resourceLogs_.set(index, value);
        onChanged();
      } else {
        resourceLogsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder setResourceLogs(
        int index, ResourceLogs.Builder builderForValue) {
      if (resourceLogsBuilder_ == null) {
        ensureResourceLogsIsMutable();
        resourceLogs_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceLogsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder addResourceLogs(ResourceLogs value) {
      if (resourceLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLogsIsMutable();
        resourceLogs_.add(value);
        onChanged();
      } else {
        resourceLogsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder addResourceLogs(
        int index, ResourceLogs value) {
      if (resourceLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceLogsIsMutable();
        resourceLogs_.add(index, value);
        onChanged();
      } else {
        resourceLogsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder addResourceLogs(
        ResourceLogs.Builder builderForValue) {
      if (resourceLogsBuilder_ == null) {
        ensureResourceLogsIsMutable();
        resourceLogs_.add(builderForValue.build());
        onChanged();
      } else {
        resourceLogsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder addResourceLogs(
        int index, ResourceLogs.Builder builderForValue) {
      if (resourceLogsBuilder_ == null) {
        ensureResourceLogsIsMutable();
        resourceLogs_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceLogsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder addAllResourceLogs(
        java.lang.Iterable<? extends ResourceLogs> values) {
      if (resourceLogsBuilder_ == null) {
        ensureResourceLogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceLogs_);
        onChanged();
      } else {
        resourceLogsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder clearResourceLogs() {
      if (resourceLogsBuilder_ == null) {
        resourceLogs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceLogsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public Builder removeResourceLogs(int index) {
      if (resourceLogsBuilder_ == null) {
        ensureResourceLogsIsMutable();
        resourceLogs_.remove(index);
        onChanged();
      } else {
        resourceLogsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public ResourceLogs.Builder getResourceLogsBuilder(
        int index) {
      return getResourceLogsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public ResourceLogsOrBuilder getResourceLogsOrBuilder(
        int index) {
      if (resourceLogsBuilder_ == null) {
        return resourceLogs_.get(index);  } else {
        return resourceLogsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public java.util.List<? extends ResourceLogsOrBuilder>
         getResourceLogsOrBuilderList() {
      if (resourceLogsBuilder_ != null) {
        return resourceLogsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceLogs_);
      }
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public ResourceLogs.Builder addResourceLogsBuilder() {
      return getResourceLogsFieldBuilder().addBuilder(
          ResourceLogs.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public ResourceLogs.Builder addResourceLogsBuilder(
        int index) {
      return getResourceLogsFieldBuilder().addBuilder(
          index, ResourceLogs.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of ResourceLogs.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.logs.v1.ResourceLogs resource_logs = 1;</code>
     */
    public java.util.List<ResourceLogs.Builder>
         getResourceLogsBuilderList() {
      return getResourceLogsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ResourceLogs, ResourceLogs.Builder, ResourceLogsOrBuilder>
        getResourceLogsFieldBuilder() {
      if (resourceLogsBuilder_ == null) {
        resourceLogsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ResourceLogs, ResourceLogs.Builder, ResourceLogsOrBuilder>(
                resourceLogs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        resourceLogs_ = null;
      }
      return resourceLogsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.logs.v1.LogsData)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.logs.v1.LogsData)
  private static final LogsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LogsData();
  }

  public static LogsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogsData>
      PARSER = new com.google.protobuf.AbstractParser<LogsData>() {
    @java.lang.Override
    public LogsData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LogsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogsData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public LogsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

