// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package com.galiglobal.benchmark.proto.otel.resource.v1;

import com.galiglobal.benchmark.proto.otel.common.v1.CommonProto;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016resource.proto\022\037opentelemetry.proto.re" +
      "source.v1\032\014common.proto\"i\n\010Resource\022;\n\na" +
      "ttributes\030\001 \003(\0132\'.opentelemetry.proto.co" +
      "mmon.v1.KeyValue\022 \n\030dropped_attributes_c" +
      "ount\030\002 \001(\rB\203\001\n\"io.opentelemetry.proto.re" +
      "source.v1B\rResourceProtoP\001Z*go.opentelem" +
      "etry.io/proto/otlp/resource/v1\252\002\037OpenTel" +
      "emetry.Proto.Resource.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CommonProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_resource_v1_Resource_descriptor,
        new java.lang.String[] { "Attributes", "DroppedAttributesCount", });
    CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
