// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface TelemetryCommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TelemetryCommon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>string correlation_vector = 2;</code>
   * @return The correlationVector.
   */
  java.lang.String getCorrelationVector();
  /**
   * <code>string correlation_vector = 2;</code>
   * @return The bytes for correlationVector.
   */
  com.google.protobuf.ByteString
      getCorrelationVectorBytes();

  /**
   * <code>string event_id = 3;</code>
   * @return The eventId.
   */
  java.lang.String getEventId();
  /**
   * <code>string event_id = 3;</code>
   * @return The bytes for eventId.
   */
  com.google.protobuf.ByteString
      getEventIdBytes();

  /**
   * <code>int64 client_timestamp_ms = 4;</code>
   * @return The clientTimestampMs.
   */
  long getClientTimestampMs();
}