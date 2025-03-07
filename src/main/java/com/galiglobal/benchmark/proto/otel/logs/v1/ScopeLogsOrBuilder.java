// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs.proto

package com.galiglobal.benchmark.proto.otel.logs.v1;

import com.galiglobal.benchmark.proto.otel.common.v1.InstrumentationScope;
import com.galiglobal.benchmark.proto.otel.common.v1.InstrumentationScopeOrBuilder;

public interface ScopeLogsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.logs.v1.ScopeLogs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instrumentation scope information for the logs in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   * <pre>
   * The instrumentation scope information for the logs in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   * @return The scope.
   */
  InstrumentationScope getScope();
  /**
   * <pre>
   * The instrumentation scope information for the logs in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   */
  InstrumentationScopeOrBuilder getScopeOrBuilder();

  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2;</code>
   */
  java.util.List<LogRecord>
      getLogRecordsList();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2;</code>
   */
  LogRecord getLogRecords(int index);
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2;</code>
   */
  int getLogRecordsCount();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2;</code>
   */
  java.util.List<? extends LogRecordOrBuilder>
      getLogRecordsOrBuilderList();
  /**
   * <pre>
   * A list of log records.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.logs.v1.LogRecord log_records = 2;</code>
   */
  LogRecordOrBuilder getLogRecordsOrBuilder(
      int index);

  /**
   * <pre>
   * The Schema URL, if known. This is the identifier of the Schema that the log data
   * is recorded in. Notably, the last part of the URL path is the version number of the
   * schema: http[s]://server[:port]/path/&lt;version&gt;. To learn more about Schema URL see
   * https://opentelemetry.io/docs/specs/otel/schemas/#schema-url
   * This schema_url applies to all logs in the "logs" field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The schemaUrl.
   */
  java.lang.String getSchemaUrl();
  /**
   * <pre>
   * The Schema URL, if known. This is the identifier of the Schema that the log data
   * is recorded in. Notably, the last part of the URL path is the version number of the
   * schema: http[s]://server[:port]/path/&lt;version&gt;. To learn more about Schema URL see
   * https://opentelemetry.io/docs/specs/otel/schemas/#schema-url
   * This schema_url applies to all logs in the "logs" field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}
