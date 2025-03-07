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
public final class StringValue extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static StringValue getRootAsStringValue(ByteBuffer _bb) { return getRootAsStringValue(_bb, new StringValue()); }
  public static StringValue getRootAsStringValue(ByteBuffer _bb, StringValue obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StringValue __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String value() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createStringValue(FlatBufferBuilder builder,
      int valueOffset) {
    builder.startTable(1);
    StringValue.addValue(builder, valueOffset);
    return StringValue.endStringValue(builder);
  }

  public static void startStringValue(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(0, valueOffset, 0); }
  public static int endStringValue(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StringValue get(int j) { return get(new StringValue(), j); }
    public StringValue get(StringValue obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

