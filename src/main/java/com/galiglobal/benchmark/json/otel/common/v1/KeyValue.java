package com.galiglobal.benchmark.json.otel.common.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyValue {
    @JsonProperty("key")
    private String key;

    @JsonProperty("value")
    private AnyValue value;

    // Default constructor for Jackson
    public KeyValue() {}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AnyValue getValue() {
        return value;
    }

    public void setValue(AnyValue value) {
        this.value = value;
    }
}