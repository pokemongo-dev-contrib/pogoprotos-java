// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetFacebookFriendListOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetFacebookFriendListOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetFacebookFriendListOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetFacebookFriendListOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetFacebookFriendListOutProto.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto friend = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto> 
      getFriendList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto friend = 2;</code>
   */
  POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto getFriend(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto friend = 2;</code>
   */
  int getFriendCount();
  /**
   * <code>repeated .POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto friend = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProtoOrBuilder> 
      getFriendOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProto friend = 2;</code>
   */
  POGOProtos.Rpc.GetFacebookFriendListOutProto.FacebookFriendProtoOrBuilder getFriendOrBuilder(
      int index);

  /**
   * <code>string next_cursor = 3;</code>
   * @return The nextCursor.
   */
  java.lang.String getNextCursor();
  /**
   * <code>string next_cursor = 3;</code>
   * @return The bytes for nextCursor.
   */
  com.google.protobuf.ByteString
      getNextCursorBytes();
}