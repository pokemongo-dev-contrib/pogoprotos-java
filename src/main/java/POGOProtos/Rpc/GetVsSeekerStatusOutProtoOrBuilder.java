// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetVsSeekerStatusOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetVsSeekerStatusOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return Whether the vsSeeker field is set.
   */
  boolean hasVsSeeker();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return The vsSeeker.
   */
  POGOProtos.Rpc.VsSeekerAttributesProto getVsSeeker();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   */
  POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder getVsSeekerOrBuilder();

  /**
   * <code>bool season_ended = 3;</code>
   * @return The seasonEnded.
   */
  boolean getSeasonEnded();

  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   * @return Whether the combatLog field is set.
   */
  boolean hasCombatLog();
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   * @return The combatLog.
   */
  POGOProtos.Rpc.CombatLogProto getCombatLog();
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   */
  POGOProtos.Rpc.CombatLogProtoOrBuilder getCombatLogOrBuilder();
}
