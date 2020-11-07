// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SetLobbyVisibilityProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SetLobbyVisibilityProto)
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
}
