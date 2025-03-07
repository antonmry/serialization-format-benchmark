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
public class KeyValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -496327117926827393L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KeyValue\",\"namespace\":\"com.galiglobal.benchmark.avro\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"AnyValue\",\"fields\":[{\"name\":\"stringValue\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"boolValue\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"intValue\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"doubleValue\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"arrayValue\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ArrayValue\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"AnyValue\"},\"default\":[]}]}],\"default\":null},{\"name\":\"kvlistValue\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"KeyValueList\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"KeyValue\"},\"default\":[]}]}],\"default\":null},{\"name\":\"bytesValue\",\"type\":[\"null\",\"bytes\"],\"default\":null}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KeyValue> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KeyValue> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<KeyValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<KeyValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<KeyValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this KeyValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a KeyValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a KeyValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static KeyValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence key;
  private AnyValue value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KeyValue() {}

  /**
   * All-args constructor.
   * @param key The new value for key
   * @param value The new value for value
   */
  public KeyValue(java.lang.CharSequence key, AnyValue value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.CharSequence)value$; break;
    case 1: value = (AnyValue)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'key' field.
   * @return The value of the 'key' field.
   */
  public java.lang.CharSequence getKey() {
    return key;
  }


  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public AnyValue getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(AnyValue value) {
    this.value = value;
  }

  /**
   * Creates a new KeyValue RecordBuilder.
   * @return A new KeyValue RecordBuilder
   */
  public static KeyValue.Builder newBuilder() {
    return new KeyValue.Builder();
  }

  /**
   * Creates a new KeyValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KeyValue RecordBuilder
   */
  public static KeyValue.Builder newBuilder(KeyValue.Builder other) {
    if (other == null) {
      return new KeyValue.Builder();
    } else {
      return new KeyValue.Builder(other);
    }
  }

  /**
   * Creates a new KeyValue RecordBuilder by copying an existing KeyValue instance.
   * @param other The existing instance to copy.
   * @return A new KeyValue RecordBuilder
   */
  public static KeyValue.Builder newBuilder(KeyValue other) {
    if (other == null) {
      return new KeyValue.Builder();
    } else {
      return new KeyValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for KeyValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KeyValue>
    implements org.apache.avro.data.RecordBuilder<KeyValue> {

    private java.lang.CharSequence key;
    private AnyValue value;
    private AnyValue.Builder valueBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(KeyValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasValueBuilder()) {
        this.valueBuilder = AnyValue.newBuilder(other.getValueBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing KeyValue instance
     * @param other The existing instance to copy.
     */
    private Builder(KeyValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      this.valueBuilder = null;
    }

    /**
      * Gets the value of the 'key' field.
      * @return The value.
      */
    public java.lang.CharSequence getKey() {
      return key;
    }


    /**
      * Sets the value of the 'key' field.
      * @param value The value of 'key'.
      * @return This builder.
      */
    public KeyValue.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'key' field has been set.
      * @return True if the 'key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'key' field.
      * @return This builder.
      */
    public KeyValue.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public AnyValue getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public KeyValue.Builder setValue(AnyValue value) {
      validate(fields()[1], value);
      this.valueBuilder = null;
      this.value = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'value' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public AnyValue.Builder getValueBuilder() {
      if (valueBuilder == null) {
        if (hasValue()) {
          setValueBuilder(AnyValue.newBuilder(value));
        } else {
          setValueBuilder(AnyValue.newBuilder());
        }
      }
      return valueBuilder;
    }

    /**
     * Sets the Builder instance for the 'value' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public KeyValue.Builder setValueBuilder(AnyValue.Builder value) {
      clearValue();
      valueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'value' field has an active Builder instance
     * @return True if the 'value' field has an active Builder instance
     */
    public boolean hasValueBuilder() {
      return valueBuilder != null;
    }

    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public KeyValue.Builder clearValue() {
      value = null;
      valueBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KeyValue build() {
      try {
        KeyValue record = new KeyValue();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (valueBuilder != null) {
          try {
            record.value = this.valueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("value"));
            throw e;
          }
        } else {
          record.value = fieldSetFlags()[1] ? this.value : (AnyValue) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KeyValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<KeyValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KeyValue>
    READER$ = (org.apache.avro.io.DatumReader<KeyValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.key);

    this.value.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);

      if (this.value == null) {
        this.value = new AnyValue();
      }
      this.value.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);
          break;

        case 1:
          if (this.value == null) {
            this.value = new AnyValue();
          }
          this.value.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










