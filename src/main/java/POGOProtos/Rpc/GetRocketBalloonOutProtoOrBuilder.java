// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetRocketBalloonOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetRocketBalloonOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetRocketBalloonOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetRocketBalloonOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetRocketBalloonOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.RocketBalloonDisplayProto display = 2;</code>
   * @return Whether the display field is set.
   */
  boolean hasDisplay();
  /**
   * <code>.POGOProtos.Rpc.RocketBalloonDisplayProto display = 2;</code>
   * @return The display.
   */
  POGOProtos.Rpc.RocketBalloonDisplayProto getDisplay();
  /**
   * <code>.POGOProtos.Rpc.RocketBalloonDisplayProto display = 2;</code>
   */
  POGOProtos.Rpc.RocketBalloonDisplayProtoOrBuilder getDisplayOrBuilder();
}
