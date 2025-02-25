package com.galiglobal.benchmark.json.otel.common.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnyValue {
    @JsonProperty("stringValue")
    private String stringValue;

    @JsonProperty("boolValue")
    private Boolean boolValue;

    @JsonProperty("intValue")
    private Long intValue;

    @JsonProperty("doubleValue")
    private Double doubleValue;

    @JsonProperty("arrayValue")
    private ArrayValue arrayValue;

    @JsonProperty("kvlistValue")
    private KeyValueList kvlistValue;

    @JsonProperty("bytesValue")
    private String bytesValue;  // base64 encoded

    // Default constructor for Jackson
    public AnyValue() {}

    // Getters and setters
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public Long getIntValue() {
        return intValue;
    }

    public void setIntValue(Long intValue) {
        this.intValue = intValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public ArrayValue getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(ArrayValue arrayValue) {
        this.arrayValue = arrayValue;
    }

    public KeyValueList getKvlistValue() {
        return kvlistValue;
    }

    public void setKvlistValue(KeyValueList kvlistValue) {
        this.kvlistValue = kvlistValue;
    }

    public String getBytesValue() {
        return bytesValue;
    }

    public void setBytesValue(String bytesValue) {
        this.bytesValue = bytesValue;
    }
}