// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RpcSocketResponseTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RpcSocketResponseTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float window_duration = 1;</code>
   * @return The windowDuration.
   */
  float getWindowDuration();

  /**
   * <code>repeated .POGOProtos.Rpc.RpcSocketResponseTime response_timings = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.RpcSocketResponseTime> 
      getResponseTimingsList();
  /**
   * <code>repeated .POGOProtos.Rpc.RpcSocketResponseTime response_timings = 2;</code>
   */
  POGOProtos.Rpc.RpcSocketResponseTime getResponseTimings(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.RpcSocketResponseTime response_timings = 2;</code>
   */
  int getResponseTimingsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.RpcSocketResponseTime response_timings = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.RpcSocketResponseTimeOrBuilder> 
      getResponseTimingsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.RpcSocketResponseTime response_timings = 2;</code>
   */
  POGOProtos.Rpc.RpcSocketResponseTimeOrBuilder getResponseTimingsOrBuilder(
      int index);
}