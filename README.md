protoc --java_out=logs/ *.proto


thrift -r --gen java logs.thrift
thrift -r --gen java resource.thrift
thrift -r --gen java common.thrift

AVRO_DIR="src/main/java/com/galiglobal/benchmark/avro"

avro-tools compile schema \
  "$AVRO_DIR/AnyValue.avsc" \
  "$AVRO_DIR/SeverityNumber.avsc" \
  "$AVRO_DIR/InstrumentationScope.avsc" \
  "$AVRO_DIR/Resource.avsc" \
  "$AVRO_DIR/LogRecord.avsc" \
  "$AVRO_DIR/ScopeLogs.avsc" \
  "$AVRO_DIR/ResourceLogs.avsc" \
  "$AVRO_DIR/LogsData.avsc" \
  "$AVRO_DIR"

