package com.galiglobal.benchmark.json.otel.common.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyValueList {
    @JsonProperty("values")
    private List<KeyValue> values;

    // Default constructor for Jackson
    public KeyValueList() {}

    public List<KeyValue> getValues() {
        return values;
    }

    public void setValues(List<KeyValue> values) {
        this.values = values;
    }
}