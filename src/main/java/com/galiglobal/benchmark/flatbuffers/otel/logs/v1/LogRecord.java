// automatically generated by the FlatBuffers compiler, do not modify

package com.galiglobal.benchmark.flatbuffers.otel.logs.v1;

import com.galiglobal.benchmark.flatbuffers.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.flatbuffers.otel.common.v1.KeyValue;
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
public final class LogRecord extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static LogRecord getRootAsLogRecord(ByteBuffer _bb) { return getRootAsLogRecord(_bb, new LogRecord()); }
  public static LogRecord getRootAsLogRecord(ByteBuffer _bb, LogRecord obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public LogRecord __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long timeUnixNano() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long observedTimeUnixNano() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public int severityNumber() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String severityText() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer severityTextAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer severityTextInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public AnyValue body() { return body(new AnyValue()); }
  public AnyValue body(AnyValue obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public KeyValue attributes(int j) { return attributes(new KeyValue(), j); }
  public KeyValue attributes(KeyValue obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int attributesLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public KeyValue.Vector attributesVector() { return attributesVector(new KeyValue.Vector()); }
  public KeyValue.Vector attributesVector(KeyValue.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public long droppedAttributesCount() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long flags() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int traceId(int j) { int o = __offset(20); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int traceIdLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector traceIdVector() { return traceIdVector(new ByteVector()); }
  public ByteVector traceIdVector(ByteVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer traceIdAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer traceIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }
  public int spanId(int j) { int o = __offset(22); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int spanIdLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector spanIdVector() { return spanIdVector(new ByteVector()); }
  public ByteVector spanIdVector(ByteVector obj) { int o = __offset(22); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer spanIdAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public ByteBuffer spanIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 1); }
  public String eventName() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer eventNameAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public ByteBuffer eventNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 1); }

  public static int createLogRecord(FlatBufferBuilder builder,
      long timeUnixNano,
      long observedTimeUnixNano,
      int severityNumber,
      int severityTextOffset,
      int bodyOffset,
      int attributesOffset,
      long droppedAttributesCount,
      long flags,
      int traceIdOffset,
      int spanIdOffset,
      int eventNameOffset) {
    builder.startTable(11);
    LogRecord.addObservedTimeUnixNano(builder, observedTimeUnixNano);
    LogRecord.addTimeUnixNano(builder, timeUnixNano);
    LogRecord.addEventName(builder, eventNameOffset);
    LogRecord.addSpanId(builder, spanIdOffset);
    LogRecord.addTraceId(builder, traceIdOffset);
    LogRecord.addFlags(builder, flags);
    LogRecord.addDroppedAttributesCount(builder, droppedAttributesCount);
    LogRecord.addAttributes(builder, attributesOffset);
    LogRecord.addBody(builder, bodyOffset);
    LogRecord.addSeverityText(builder, severityTextOffset);
    LogRecord.addSeverityNumber(builder, severityNumber);
    return LogRecord.endLogRecord(builder);
  }

  public static void startLogRecord(FlatBufferBuilder builder) { builder.startTable(11); }
  public static void addTimeUnixNano(FlatBufferBuilder builder, long timeUnixNano) { builder.addLong(0, timeUnixNano, 0L); }
  public static void addObservedTimeUnixNano(FlatBufferBuilder builder, long observedTimeUnixNano) { builder.addLong(1, observedTimeUnixNano, 0L); }
  public static void addSeverityNumber(FlatBufferBuilder builder, int severityNumber) { builder.addByte(2, (byte) severityNumber, (byte) 0); }
  public static void addSeverityText(FlatBufferBuilder builder, int severityTextOffset) { builder.addOffset(3, severityTextOffset, 0); }
  public static void addBody(FlatBufferBuilder builder, int bodyOffset) { builder.addOffset(4, bodyOffset, 0); }
  public static void addAttributes(FlatBufferBuilder builder, int attributesOffset) { builder.addOffset(5, attributesOffset, 0); }
  public static int createAttributesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAttributesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDroppedAttributesCount(FlatBufferBuilder builder, long droppedAttributesCount) { builder.addInt(6, (int) droppedAttributesCount, (int) 0L); }
  public static void addFlags(FlatBufferBuilder builder, long flags) { builder.addInt(7, (int) flags, (int) 0L); }
  public static void addTraceId(FlatBufferBuilder builder, int traceIdOffset) { builder.addOffset(8, traceIdOffset, 0); }
  public static int createTraceIdVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createTraceIdVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startTraceIdVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addSpanId(FlatBufferBuilder builder, int spanIdOffset) { builder.addOffset(9, spanIdOffset, 0); }
  public static int createSpanIdVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createSpanIdVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startSpanIdVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addEventName(FlatBufferBuilder builder, int eventNameOffset) { builder.addOffset(10, eventNameOffset, 0); }
  public static int endLogRecord(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public LogRecord get(int j) { return get(new LogRecord(), j); }
    public LogRecord get(LogRecord obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

