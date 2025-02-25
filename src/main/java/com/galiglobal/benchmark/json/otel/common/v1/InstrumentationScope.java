package com.galiglobal.benchmark.json.otel.common.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstrumentationScope {
    @JsonProperty("name")
    private String name;

    @JsonProperty("version")
    private String version;

    @JsonProperty("attributes")
    private List<KeyValue> attributes;

    @JsonProperty("droppedAttributesCount")
    private Integer droppedAttributesCount;

    // Default constructor for Jackson
    public InstrumentationScope() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

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