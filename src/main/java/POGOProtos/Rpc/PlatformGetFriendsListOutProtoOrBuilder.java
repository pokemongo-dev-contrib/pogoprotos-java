// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformGetFriendsListOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformGetFriendsListOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendsListOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendsListOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.PlatformGetFriendsListOutProto.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto friend = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto> 
      getFriendList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto friend = 2;</code>
   */
  POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto getFriend(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto friend = 2;</code>
   */
  int getFriendCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto friend = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProtoOrBuilder> 
      getFriendOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProto friend = 2;</code>
   */
  POGOProtos.Rpc.PlatformGetFriendsListOutProto.FriendProtoOrBuilder getFriendOrBuilder(
      int index);
}
