// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ChangeTeamOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ChangeTeamOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ChangeTeamOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.ChangeTeamOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.ChangeTeamOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto updated_player = 2;</code>
   * @return Whether the updatedPlayer field is set.
   */
  boolean hasUpdatedPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto updated_player = 2;</code>
   * @return The updatedPlayer.
   */
  POGOProtos.Rpc.ClientPlayerProto getUpdatedPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto updated_player = 2;</code>
   */
  POGOProtos.Rpc.ClientPlayerProtoOrBuilder getUpdatedPlayerOrBuilder();
}
