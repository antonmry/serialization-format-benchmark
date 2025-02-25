package com.galiglobal.benchmark.json.otel.logs.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.galiglobal.benchmark.json.otel.common.v1.InstrumentationScope;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScopeLogs {
    @JsonProperty("scope")
    private InstrumentationScope scope;

    @JsonProperty("logRecords")
    private List<LogRecord> logRecords;

    @JsonProperty("schemaUrl")
    private String schemaUrl;

    // Default constructor for Jackson
    public ScopeLogs() {}

    public InstrumentationScope getScope() {
        return scope;
    }

    public void setScope(InstrumentationScope scope) {
        this.scope = scope;
    }

    public List<LogRecord> getLogRecords() {
        return logRecords;
    }

    public void setLogRecords(List<LogRecord> logRecords) {
        this.logRecords = logRecords;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }
}