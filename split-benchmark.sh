#!/bin/bash

# Create Protobuf results
jq '[.[] | select(.benchmark | contains("ProtoLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Proto"; "")]' benchmark-results.json > 1-protobuf.json

# Create Thrift results
jq '[.[] | select(.benchmark | contains("ThriftLogs")) | select(.benchmark | contains("sizeOfSerializedData") | not) | .benchmark |= sub("Thrift"; "")]' benchmark-results.json > 0-thrift.json

# Verify split worked
echo "Protobuf results count: $(jq '. | length' 1-protobuf.json)"
echo "Thrift results count: $(jq '. | length' 0-thrift.json)"
