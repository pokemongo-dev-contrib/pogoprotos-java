// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface AcceptCombatChallengeOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AcceptCombatChallengeOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.AcceptCombatChallengeOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.AcceptCombatChallengeOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.AcceptCombatChallengeOutProto.Result getResult();

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
}
