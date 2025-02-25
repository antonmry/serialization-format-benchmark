package com.galiglobal.benchmark.json.otel.logs.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogsData {
    @JsonProperty("resourceLogs")
    private List<ResourceLogs> resourceLogs;

    // Default constructor for Jackson
    public LogsData() {}

    public List<ResourceLogs> getResourceLogs() {
        return resourceLogs;
    }

    public void setResourceLogs(List<ResourceLogs> resourceLogs) {
        this.resourceLogs = resourceLogs;
    }
}