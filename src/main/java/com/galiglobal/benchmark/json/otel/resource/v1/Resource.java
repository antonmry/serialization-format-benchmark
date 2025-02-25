package com.galiglobal.benchmark.json.otel.resource.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.galiglobal.benchmark.json.otel.common.v1.KeyValue;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {
    @JsonProperty("attributes")
    private List<KeyValue> attributes;

    @JsonProperty("droppedAttributesCount")
    private Integer droppedAttributesCount;

    // Default constructor for Jackson
    public Resource() {}

    public List<KeyValue> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<KeyValue> attributes) {
        this.attributes = attributes;
    }

    public Integer getDroppedAttributesCount() {
        return droppedAttributesCount;
    }

    public void setDroppedAttributesCount(Integer droppedAttributesCount) {
        this.droppedAttributesCount = droppedAttributesCount;
    }
}