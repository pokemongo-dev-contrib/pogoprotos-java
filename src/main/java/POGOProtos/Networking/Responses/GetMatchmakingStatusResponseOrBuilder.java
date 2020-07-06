// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetMatchmakingStatusResponse.proto

package POGOProtos.Networking.Responses;

public interface GetMatchmakingStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GetMatchmakingStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GetMatchmakingStatusResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GetMatchmakingStatusResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.GetMatchmakingStatusResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return Whether the challenge field is set.
   */
  boolean hasChallenge();
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return The challenge.
   */
  POGOProtos.Data.Combat.CombatChallenge getChallenge();
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   */
  POGOProtos.Data.Combat.CombatChallengeOrBuilder getChallengeOrBuilder();

  /**
   * <code>string queue_id = 3;</code>
   * @return The queueId.
   */
  java.lang.String getQueueId();
  /**
   * <code>string queue_id = 3;</code>
   * @return The bytes for queueId.
   */
  com.google.protobuf.ByteString
      getQueueIdBytes();
}