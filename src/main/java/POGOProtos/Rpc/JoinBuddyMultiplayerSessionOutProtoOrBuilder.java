// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface JoinBuddyMultiplayerSessionOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.JoinBuddyMultiplayerSessionOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.JoinBuddyMultiplayerSessionOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.JoinBuddyMultiplayerSessionOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.JoinBuddyMultiplayerSessionOutProto.Result getResult();

  /**
   * <code>bytes arbe_join_token = 2;</code>
   * @return The arbeJoinToken.
   */
  com.google.protobuf.ByteString getArbeJoinToken();

  /**
   * <code>int64 generation_timestamp = 3;</code>
   * @return The generationTimestamp.
   */
  long getGenerationTimestamp();

  /**
   * <code>int32 max_players = 4;</code>
   * @return The maxPlayers.
   */
  int getMaxPlayers();
}
