// Copyright 2019, OpenTelemetry Authors
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

namespace java io.opentelemetry.proto.common.v1

// AnyValue is used to represent any type of attribute value.
union AnyValue {
    1: string string_value,
    2: bool bool_value,
    3: i64 int_value,
    4: double double_value,
    5: ArrayValue array_value,
    6: KeyValueList kvlist_value,
    7: binary bytes_value
}

// ArrayValue is a list of AnyValue messages
struct ArrayValue {
    1: list<AnyValue> values
}

// KeyValueList is a list of KeyValue messages
struct KeyValueList {
    1: list<KeyValue> values
}

// KeyValue is a key-value pair that is used to store attributes
struct KeyValue {
    1: string key,
    2: AnyValue value
}

// InstrumentationScope represents the instrumentation scope information
struct InstrumentationScope {
    1: string name,
    2: string version,
    3: list<KeyValue> attributes,
    4: i32 dropped_attributes_count
}