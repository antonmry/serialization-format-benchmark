/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.galiglobal.benchmark.avro.otel;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ArrayValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1107335368176556766L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayValue\",\"namespace\":\"com.galiglobal.benchmark.avro\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnyValue\",\"fields\":[{\"name\":\"stringValue\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"boolValue\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"intValue\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"doubleValue\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"arrayValue\",\"type\":[\"null\",\"ArrayValue\"],\"default\":null},{\"name\":\"kvlistValue\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"KeyValueList\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"KeyValue\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"AnyValue\"}]}},\"default\":[]}]}],\"default\":null},{\"name\":\"bytesValue\",\"type\":[\"null\",\"bytes\"],\"default\":null}]}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ArrayValue> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ArrayValue> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ArrayValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ArrayValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ArrayValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ArrayValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ArrayValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ArrayValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ArrayValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<AnyValue> values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ArrayValue() {}

  /**
   * All-args constructor.
   * @param values The new value for values
   */
  public ArrayValue(java.util.List<AnyValue> values) {
    this.values = values;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return values;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: values = (java.util.List<AnyValue>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'values' field.
   * @return The value of the 'values' field.
   */
  public java.util.List<AnyValue> getValues() {
    return values;
  }


  /**
   * Sets the value of the 'values' field.
   * @param value the value to set.
   */
  public void setValues(java.util.List<AnyValue> value) {
    this.values = value;
  }

  /**
   * Creates a new ArrayValue RecordBuilder.
   * @return A new ArrayValue RecordBuilder
   */
  public static ArrayValue.Builder newBuilder() {
    return new ArrayValue.Builder();
  }

  /**
   * Creates a new ArrayValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ArrayValue RecordBuilder
   */
  public static ArrayValue.Builder newBuilder(ArrayValue.Builder other) {
    if (other == null) {
      return new ArrayValue.Builder();
    } else {
      return new ArrayValue.Builder(other);
    }
  }

  /**
   * Creates a new ArrayValue RecordBuilder by copying an existing ArrayValue instance.
   * @param other The existing instance to copy.
   * @return A new ArrayValue RecordBuilder
   */
  public static ArrayValue.Builder newBuilder(ArrayValue other) {
    if (other == null) {
      return new ArrayValue.Builder();
    } else {
      return new ArrayValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for ArrayValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ArrayValue>
    implements org.apache.avro.data.RecordBuilder<ArrayValue> {

    private java.util.List<AnyValue> values;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ArrayValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing ArrayValue instance
     * @param other The existing instance to copy.
     */
    private Builder(ArrayValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'values' field.
      * @return The value.
      */
    public java.util.List<AnyValue> getValues() {
      return values;
    }


    /**
      * Sets the value of the 'values' field.
      * @param value The value of 'values'.
      * @return This builder.
      */
    public ArrayValue.Builder setValues(java.util.List<AnyValue> value) {
      validate(fields()[0], value);
      this.values = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'values' field has been set.
      * @return True if the 'values' field has been set, false otherwise.
      */
    public boolean hasValues() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'values' field.
      * @return This builder.
      */
    public ArrayValue.Builder clearValues() {
      values = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ArrayValue build() {
      try {
        ArrayValue record = new ArrayValue();
        record.values = fieldSetFlags()[0] ? this.values : (java.util.List<AnyValue>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ArrayValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<ArrayValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ArrayValue>
    READER$ = (org.apache.avro.io.DatumReader<ArrayValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.values.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (AnyValue e0: this.values) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<AnyValue> a0 = this.values;
      if (a0 == null) {
        a0 = new SpecificData.Array<AnyValue>((int)size0, SCHEMA$.getField("values").schema());
        this.values = a0;
      } else a0.clear();
      SpecificData.Array<AnyValue> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<AnyValue>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          AnyValue e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new AnyValue();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<AnyValue> a0 = this.values;
          if (a0 == null) {
            a0 = new SpecificData.Array<AnyValue>((int)size0, SCHEMA$.getField("values").schema());
            this.values = a0;
          } else a0.clear();
          SpecificData.Array<AnyValue> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<AnyValue>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              AnyValue e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new AnyValue();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










