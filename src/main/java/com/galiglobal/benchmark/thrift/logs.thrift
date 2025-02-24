// Copyright 2020, OpenTelemetry Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

namespace java io.opentelemetry.proto.logs.v1

include "common.thrift"
include "resource.thrift"

// Possible values for LogRecord.SeverityNumber
enum SeverityNumber {
    SEVERITY_NUMBER_UNSPECIFIED = 0,
    SEVERITY_NUMBER_TRACE = 1,
    SEVERITY_NUMBER_TRACE2 = 2,
    SEVERITY_NUMBER_TRACE3 = 3,
    SEVERITY_NUMBER_TRACE4 = 4,
    SEVERITY_NUMBER_DEBUG = 5,
    SEVERITY_NUMBER_DEBUG2 = 6,
    SEVERITY_NUMBER_DEBUG3 = 7,
    SEVERITY_NUMBER_DEBUG4 = 8,
    SEVERITY_NUMBER_INFO = 9,
    SEVERITY_NUMBER_INFO2 = 10,
    SEVERITY_NUMBER_INFO3 = 11,
    SEVERITY_NUMBER_INFO4 = 12,
    SEVERITY_NUMBER_WARN = 13,
    SEVERITY_NUMBER_WARN2 = 14,
    SEVERITY_NUMBER_WARN3 = 15,
    SEVERITY_NUMBER_WARN4 = 16,
    SEVERITY_NUMBER_ERROR = 17,
    SEVERITY_NUMBER_ERROR2 = 18,
    SEVERITY_NUMBER_ERROR3 = 19,
    SEVERITY_NUMBER_ERROR4 = 20,
    SEVERITY_NUMBER_FATAL = 21,
    SEVERITY_NUMBER_FATAL2 = 22,
    SEVERITY_NUMBER_FATAL3 = 23,
    SEVERITY_NUMBER_FATAL4 = 24
}

// Constants for LogRecord.flags bit field
const i32 LOG_RECORD_FLAGS_DO_NOT_USE = 0
const i32 LOG_RECORD_FLAGS_TRACE_FLAGS_MASK = 0x000000FF

// A log record according to OpenTelemetry Log Data Model
struct LogRecord {
    1: i64 time_unix_nano,
    2: SeverityNumber severity_number,
    3: string severity_text,
    5: common.AnyValue body,
    6: list<common.KeyValue> attributes,
    7: i32 dropped_attributes_count,
    8: i32 flags,
    9: binary trace_id,
    10: binary span_id,
    11: i64 observed_time_unix_nano,
    12: string event_name
}

// A collection of Logs produced by a Scope
struct ScopeLogs {
    1: common.InstrumentationScope scope,
    2: list<LogRecord> log_records,
    3: string schema_url
}

// A collection of ScopeLogs from a Resource
struct ResourceLogs {
    1: resource.Resource resource,
    2: list<ScopeLogs> scope_logs,
    3: string schema_url
}

// LogsData represents the logs data that can be stored in a persistent storage
struct LogsData {
    1: list<ResourceLogs> resource_logs
}