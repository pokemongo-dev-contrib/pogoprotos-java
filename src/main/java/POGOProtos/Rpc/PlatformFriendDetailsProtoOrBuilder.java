// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformFriendDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformFriendDetailsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 1;</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 1;</code>
   * @return The player.
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProto getPlayer();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 1;</code>
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder getPlayerOrBuilder();

  /**
   * <code>bytes friend_visible_data = 2;</code>
   * @return The friendVisibleData.
   */
  com.google.protobuf.ByteString getFriendVisibleData();

  /**
   * <code>int32 score = 3;</code>
   * @return The score.
   */
  int getScore();

  /**
   * <code>bytes data_with_me = 4;</code>
   * @return The dataWithMe.
   */
  com.google.protobuf.ByteString getDataWithMe();
}
