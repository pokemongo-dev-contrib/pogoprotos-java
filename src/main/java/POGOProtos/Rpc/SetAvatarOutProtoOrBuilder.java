// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SetAvatarOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SetAvatarOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.SetAvatarOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.SetAvatarOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.SetAvatarOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return The player.
   */
  POGOProtos.Rpc.ClientPlayerProto getPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   */
  POGOProtos.Rpc.ClientPlayerProtoOrBuilder getPlayerOrBuilder();
}
