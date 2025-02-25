/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.galiglobal.benchmark.avro.otel;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class InstrumentationScope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1268584516678441704L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InstrumentationScope\",\"namespace\":\"com.galiglobal.benchmark.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"attributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"KeyValue\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"AnyValue\",\"fields\":[{\"name\":\"stringValue\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"boolValue\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"intValue\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"doubleValue\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"arrayValue\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ArrayValue\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"AnyValue\"},\"default\":[]}]}],\"default\":null},{\"name\":\"kvlistValue\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"KeyValueList\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"KeyValue\"},\"default\":[]}]}],\"default\":null},{\"name\":\"bytesValue\",\"type\":[\"null\",\"bytes\"],\"default\":null}]}}]}},\"default\":[]},{\"name\":\"droppedAttributesCount\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InstrumentationScope> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InstrumentationScope> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<InstrumentationScope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<InstrumentationScope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<InstrumentationScope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this InstrumentationScope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a InstrumentationScope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a InstrumentationScope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static InstrumentationScope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private java.lang.CharSequence version;
  private java.util.List<KeyValue> attributes;
  private int droppedAttributesCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InstrumentationScope() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param version The new value for version
   * @param attributes The new value for attributes
   * @param droppedAttributesCount The new value for droppedAttributesCount
   */
  public InstrumentationScope(java.lang.CharSequence name, java.lang.CharSequence version, java.util.List<KeyValue> attributes, java.lang.Integer droppedAttributesCount) {
    this.name = name;
    this.version = version;
    this.attributes = attributes;
    this.droppedAttributesCount = droppedAttributesCount;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return version;
    case 2: return attributes;
    case 3: return droppedAttributesCount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: version = (java.lang.CharSequence)value$; break;
    case 2: attributes = (java.util.List<KeyValue>)value$; break;
    case 3: droppedAttributesCount = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.CharSequence getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.CharSequence value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'attributes' field.
   * @return The value of the 'attributes' field.
   */
  public java.util.List<KeyValue> getAttributes() {
    return attributes;
  }


  /**
   * Sets the value of the 'attributes' field.
   * @param value the value to set.
   */
  public void setAttributes(java.util.List<KeyValue> value) {
    this.attributes = value;
  }

  /**
   * Gets the value of the 'droppedAttributesCount' field.
   * @return The value of the 'droppedAttributesCount' field.
   */
  public int getDroppedAttributesCount() {
    return droppedAttributesCount;
  }


  /**
   * Sets the value of the 'droppedAttributesCount' field.
   * @param value the value to set.
   */
  public void setDroppedAttributesCount(int value) {
    this.droppedAttributesCount = value;
  }

  /**
   * Creates a new InstrumentationScope RecordBuilder.
   * @return A new InstrumentationScope RecordBuilder
   */
  public static InstrumentationScope.Builder newBuilder() {
    return new InstrumentationScope.Builder();
  }

  /**
   * Creates a new InstrumentationScope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InstrumentationScope RecordBuilder
   */
  public static InstrumentationScope.Builder newBuilder(InstrumentationScope.Builder other) {
    if (other == null) {
      return new InstrumentationScope.Builder();
    } else {
      return new InstrumentationScope.Builder(other);
    }
  }

  /**
   * Creates a new InstrumentationScope RecordBuilder by copying an existing InstrumentationScope instance.
   * @param other The existing instance to copy.
   * @return A new InstrumentationScope RecordBuilder
   */
  public static InstrumentationScope.Builder newBuilder(InstrumentationScope other) {
    if (other == null) {
      return new InstrumentationScope.Builder();
    } else {
      return new InstrumentationScope.Builder(other);
    }
  }

  /**
   * RecordBuilder for InstrumentationScope instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InstrumentationScope>
    implements org.apache.avro.data.RecordBuilder<InstrumentationScope> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence version;
    private java.util.List<KeyValue> attributes;
    private int droppedAttributesCount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(InstrumentationScope.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.attributes)) {
        this.attributes = data().deepCopy(fields()[2].schema(), other.attributes);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.droppedAttributesCount)) {
        this.droppedAttributesCount = data().deepCopy(fields()[3].schema(), other.droppedAttributesCount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing InstrumentationScope instance
     * @param other The existing instance to copy.
     */
    private Builder(InstrumentationScope other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attributes)) {
        this.attributes = data().deepCopy(fields()[2].schema(), other.attributes);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.droppedAttributesCount)) {
        this.droppedAttributesCount = data().deepCopy(fields()[3].schema(), other.droppedAttributesCount);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public InstrumentationScope.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public InstrumentationScope.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.CharSequence getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public InstrumentationScope.Builder setVersion(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.version = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public InstrumentationScope.Builder clearVersion() {
      version = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributes' field.
      * @return The value.
      */
    public java.util.List<KeyValue> getAttributes() {
      return attributes;
    }


    /**
      * Sets the value of the 'attributes' field.
      * @param value The value of 'attributes'.
      * @return This builder.
      */
    public InstrumentationScope.Builder setAttributes(java.util.List<KeyValue> value) {
      validate(fields()[2], value);
      this.attributes = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'attributes' field has been set.
      * @return True if the 'attributes' field has been set, false otherwise.
      */
    public boolean hasAttributes() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'attributes' field.
      * @return This builder.
      */
    public InstrumentationScope.Builder clearAttributes() {
      attributes = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'droppedAttributesCount' field.
      * @return The value.
      */
    public int getDroppedAttributesCount() {
      return droppedAttributesCount;
    }


    /**
      * Sets the value of the 'droppedAttributesCount' field.
      * @param value The value of 'droppedAttributesCount'.
      * @return This builder.
      */
    public InstrumentationScope.Builder setDroppedAttributesCount(int value) {
      validate(fields()[3], value);
      this.droppedAttributesCount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'droppedAttributesCount' field has been set.
      * @return True if the 'droppedAttributesCount' field has been set, false otherwise.
      */
    public boolean hasDroppedAttributesCount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'droppedAttributesCount' field.
      * @return This builder.
      */
    public InstrumentationScope.Builder clearDroppedAttributesCount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InstrumentationScope build() {
      try {
        InstrumentationScope record = new InstrumentationScope();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.version = fieldSetFlags()[1] ? this.version : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.attributes = fieldSetFlags()[2] ? this.attributes : (java.util.List<KeyValue>) defaultValue(fields()[2]);
        record.droppedAttributesCount = fieldSetFlags()[3] ? this.droppedAttributesCount : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InstrumentationScope>
    WRITER$ = (org.apache.avro.io.DatumWriter<InstrumentationScope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InstrumentationScope>
    READER$ = (org.apache.avro.io.DatumReader<InstrumentationScope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.version == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.version);
    }

    long size0 = this.attributes.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (KeyValue e0: this.attributes) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeInt(this.droppedAttributesCount);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.version = null;
      } else {
        this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);
      }

      long size0 = in.readArrayStart();
      java.util.List<KeyValue> a0 = this.attributes;
      if (a0 == null) {
        a0 = new SpecificData.Array<KeyValue>((int)size0, SCHEMA$.getField("attributes").schema());
        this.attributes = a0;
      } else a0.clear();
      SpecificData.Array<KeyValue> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<KeyValue>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          KeyValue e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new KeyValue();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      this.droppedAttributesCount = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.version = null;
          } else {
            this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);
          }
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<KeyValue> a0 = this.attributes;
          if (a0 == null) {
            a0 = new SpecificData.Array<KeyValue>((int)size0, SCHEMA$.getField("attributes").schema());
            this.attributes = a0;
          } else a0.clear();
          SpecificData.Array<KeyValue> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<KeyValue>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              KeyValue e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new KeyValue();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 3:
          this.droppedAttributesCount = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










