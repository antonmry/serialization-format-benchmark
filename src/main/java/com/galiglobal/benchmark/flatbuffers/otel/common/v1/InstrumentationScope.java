// automatically generated by the FlatBuffers compiler, do not modify

package com.galiglobal.benchmark.flatbuffers.otel.common.v1;

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
public final class InstrumentationScope extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static InstrumentationScope getRootAsInstrumentationScope(ByteBuffer _bb) { return getRootAsInstrumentationScope(_bb, new InstrumentationScope()); }
  public static InstrumentationScope getRootAsInstrumentationScope(ByteBuffer _bb, InstrumentationScope obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public InstrumentationScope __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String version() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer versionAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer versionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public KeyValue attributes(int j) { return attributes(new KeyValue(), j); }
  public KeyValue attributes(KeyValue obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int attributesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public KeyValue.Vector attributesVector() { return attributesVector(new KeyValue.Vector()); }
  public KeyValue.Vector attributesVector(KeyValue.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public long droppedAttributesCount() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createInstrumentationScope(FlatBufferBuilder builder,
      int nameOffset,
      int versionOffset,
      int attributesOffset,
      long droppedAttributesCount) {
    builder.startTable(4);
    InstrumentationScope.addDroppedAttributesCount(builder, droppedAttributesCount);
    InstrumentationScope.addAttributes(builder, attributesOffset);
    InstrumentationScope.addVersion(builder, versionOffset);
    InstrumentationScope.addName(builder, nameOffset);
    return InstrumentationScope.endInstrumentationScope(builder);
  }

  public static void startInstrumentationScope(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addVersion(FlatBufferBuilder builder, int versionOffset) { builder.addOffset(1, versionOffset, 0); }
  public static void addAttributes(FlatBufferBuilder builder, int attributesOffset) { builder.addOffset(2, attributesOffset, 0); }
  public static int createAttributesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAttributesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDroppedAttributesCount(FlatBufferBuilder builder, long droppedAttributesCount) { builder.addInt(3, (int) droppedAttributesCount, (int) 0L); }
  public static int endInstrumentationScope(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public InstrumentationScope get(int j) { return get(new InstrumentationScope(), j); }
    public InstrumentationScope get(InstrumentationScope obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

