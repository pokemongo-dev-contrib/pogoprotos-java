// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/AcceptFriendInviteResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public interface AcceptFriendInviteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Social.Responses.AcceptFriendInviteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.AcceptFriendInviteResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.AcceptFriendInviteResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.Social.Responses.AcceptFriendInviteResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Player.PlayerSummary friend = 2;</code>
   * @return Whether the friend field is set.
   */
  boolean hasFriend();
  /**
   * <code>.POGOProtos.Data.Player.PlayerSummary friend = 2;</code>
   * @return The friend.
   */
  POGOProtos.Data.Player.PlayerSummary getFriend();
  /**
   * <code>.POGOProtos.Data.Player.PlayerSummary friend = 2;</code>
   */
  POGOProtos.Data.Player.PlayerSummaryOrBuilder getFriendOrBuilder();
}