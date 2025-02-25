#!/bin/bash

# Create JSON results
jq '[.[] | select(.benchmark | contains("JsonLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Json"; "")]' benchmark-results.json > 0-json.json

# Create Thrift results
jq '[.[] | select(.benchmark | contains("ThriftLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Thrift"; "")]' benchmark-results.json > 1-thrift.json

# Create Avro results
jq '[.[] | select(.benchmark | contains("AvroLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Avro"; "")]' benchmark-results.json > 2-avro.json

# Create Protobuf results
jq '[.[] | select(.benchmark | contains("ProtoLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Proto"; "")]' benchmark-results.json > 3-protobuf.json

# Verify split worked
echo "JSON results count: $(jq '. | length' 0-json.json)"
echo "Thrift results count: $(jq '. | length' 1-thrift.json)"
echo "Avro results count: $(jq '. | length' 2-avro.json)"
echo "Protobuf results count: $(jq '. | length' 3-protobuf.json)"
