// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface JoinLobbyProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.JoinLobbyProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 raid_seed = 1;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();

  /**
   * <code>string gym_id = 2;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 2;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @return A list containing the lobbyId.
   */
  java.util.List<java.lang.Integer> getLobbyIdList();
  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @return The count of lobbyId.
   */
  int getLobbyIdCount();
  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @param index The index of the element to return.
   * @return The lobbyId at the given index.
   */
  int getLobbyId(int index);

  /**
   * <code>bool private = 4;</code>
   * @return The private.
   */
  boolean getPrivate();

  /**
   * <code>double player_lat_degrees = 5;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 6;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();

  /**
   * <code>double gym_lat_degrees = 7;</code>
   * @return The gymLatDegrees.
   */
  double getGymLatDegrees();

  /**
   * <code>double gym_lng_degrees = 8;</code>
   * @return The gymLngDegrees.
   */
  double getGymLngDegrees();

  /**
   * <code>bool use_remote_pass = 9;</code>
   * @return The useRemotePass.
   */
  boolean getUseRemotePass();

  /**
   * <code>string inviter_id = 10;</code>
   * @return The inviterId.
   */
  java.lang.String getInviterId();
  /**
   * <code>string inviter_id = 10;</code>
   * @return The bytes for inviterId.
   */
  com.google.protobuf.ByteString
      getInviterIdBytes();
}
