// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetMatchmakingStatusOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetMatchmakingStatusOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   * @return Whether the challenge field is set.
   */
  boolean hasChallenge();
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   * @return The challenge.
   */
  POGOProtos.Rpc.CombatChallengeProto getChallenge();
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   */
  POGOProtos.Rpc.CombatChallengeProtoOrBuilder getChallengeOrBuilder();

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
