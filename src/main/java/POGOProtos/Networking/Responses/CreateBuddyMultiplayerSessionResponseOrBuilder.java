// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CreateBuddyMultiplayerSessionResponse.proto

package POGOProtos.Networking.Responses;

public interface CreateBuddyMultiplayerSessionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.CreateBuddyMultiplayerSessionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plfe_session_id = 1;</code>
   * @return The plfeSessionId.
   */
  java.lang.String getPlfeSessionId();
  /**
   * <code>string plfe_session_id = 1;</code>
   * @return The bytes for plfeSessionId.
   */
  com.google.protobuf.ByteString
      getPlfeSessionIdBytes();

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

  /**
   * <code>.POGOProtos.Networking.Responses.CreateBuddyMultiplayerSessionResponse.Result result = 5;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.CreateBuddyMultiplayerSessionResponse.Result result = 5;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.CreateBuddyMultiplayerSessionResponse.Result getResult();
}