// automatically generated by the FlatBuffers compiler, do not modify

package com.galiglobal.benchmark.flatbuffers.otel.logs.v1;

import com.galiglobal.benchmark.flatbuffers.otel.resource.v1.Resource;
import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class ResourceLogs extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static ResourceLogs getRootAsResourceLogs(ByteBuffer _bb) { return getRootAsResourceLogs(_bb, new ResourceLogs()); }
  public static ResourceLogs getRootAsResourceLogs(ByteBuffer _bb, ResourceLogs obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ResourceLogs __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public Resource resource() { return resource(new Resource()); }
  public Resource resource(Resource obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ScopeLogs scopeLogs(int j) { return scopeLogs(new ScopeLogs(), j); }
  public ScopeLogs scopeLogs(ScopeLogs obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int scopeLogsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ScopeLogs.Vector scopeLogsVector() { return scopeLogsVector(new ScopeLogs.Vector()); }
  public ScopeLogs.Vector scopeLogsVector(ScopeLogs.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String schemaUrl() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer schemaUrlAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer schemaUrlInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createResourceLogs(FlatBufferBuilder builder,
      int resourceOffset,
      int scopeLogsOffset,
      int schemaUrlOffset) {
    builder.startTable(3);
    ResourceLogs.addSchemaUrl(builder, schemaUrlOffset);
    ResourceLogs.addScopeLogs(builder, scopeLogsOffset);
    ResourceLogs.addResource(builder, resourceOffset);
    return ResourceLogs.endResourceLogs(builder);
  }

  public static void startResourceLogs(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addResource(FlatBufferBuilder builder, int resourceOffset) { builder.addOffset(0, resourceOffset, 0); }
  public static void addScopeLogs(FlatBufferBuilder builder, int scopeLogsOffset) { builder.addOffset(1, scopeLogsOffset, 0); }
  public static int createScopeLogsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startScopeLogsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSchemaUrl(FlatBufferBuilder builder, int schemaUrlOffset) { builder.addOffset(2, schemaUrlOffset, 0); }
  public static int endResourceLogs(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ResourceLogs get(int j) { return get(new ResourceLogs(), j); }
    public ResourceLogs get(ResourceLogs obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

