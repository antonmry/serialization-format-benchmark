package com.galiglobal.benchmark.json.otel.logs.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.galiglobal.benchmark.json.otel.resource.v1.Resource;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceLogs {
    @JsonProperty("resource")
    private Resource resource;

    @JsonProperty("scopeLogs")
    private List<ScopeLogs> scopeLogs;

    @JsonProperty("schemaUrl")
    private String schemaUrl;

    // Default constructor for Jackson
    public ResourceLogs() {}

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<ScopeLogs> getScopeLogs() {
        return scopeLogs;
    }

    public void setScopeLogs(List<ScopeLogs> scopeLogs) {
        this.scopeLogs = scopeLogs;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }
}