protoc --java_out=logs/ *.proto


thrift -r --gen java logs.thrift
thrift -r --gen java resource.thrift
thrift -r --gen java common.thrift
