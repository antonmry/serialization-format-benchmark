package com.galiglobal.benchmark.json.otel.common.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrayValue {
    @JsonProperty("values")
    private List<AnyValue> values;

    // Default constructor for Jackson
    public ArrayValue() {}

    public List<AnyValue> getValues() {
        return values;
    }

    public void setValues(List<AnyValue> values) {
        this.values = values;
    }
}