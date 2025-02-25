package com.galiglobal.benchmark.json.otel.logs.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.galiglobal.benchmark.json.otel.common.v1.AnyValue;
import com.galiglobal.benchmark.json.otel.common.v1.KeyValue;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogRecord {
    @JsonProperty("timeUnixNano")
    private String timeUnixNano;

    @JsonProperty("observedTimeUnixNano")
    private String observedTimeUnixNano;

    @JsonProperty("severityNumber")
    private SeverityNumber severityNumber;

    @JsonProperty("severityText")
    private String severityText;

    @JsonProperty("body")
    private AnyValue body;

    @JsonProperty("attributes")
    private List<KeyValue> attributes;

    @JsonProperty("droppedAttributesCount")
    private Integer droppedAttributesCount;

    @JsonProperty("flags")
    private Integer flags;

    @JsonProperty("traceId")
    private String traceId;

    @JsonProperty("spanId")
    private String spanId;

    @JsonProperty("eventName")
    private String eventName;

    // Default constructor for Jackson
    public LogRecord() {}

    public String getTimeUnixNano() {
        return timeUnixNano;
    }

    public void setTimeUnixNano(String timeUnixNano) {
        this.timeUnixNano = timeUnixNano;
    }

    public String getObservedTimeUnixNano() {
        return observedTimeUnixNano;
    }

    public void setObservedTimeUnixNano(String observedTimeUnixNano) {
        this.observedTimeUnixNano = observedTimeUnixNano;
    }

    public SeverityNumber getSeverityNumber() {
        return severityNumber;
    }

    public void setSeverityNumber(SeverityNumber severityNumber) {
        this.severityNumber = severityNumber;
    }

    public String getSeverityText() {
        return severityText;
    }

    public void setSeverityText(String severityText) {
        this.severityText = severityText;
    }

    public AnyValue getBody() {
        return body;
    }

    public void setBody(AnyValue body) {
        this.body = body;
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

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}