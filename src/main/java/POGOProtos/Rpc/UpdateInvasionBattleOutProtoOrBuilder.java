// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UpdateInvasionBattleOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UpdateInvasionBattleOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.InvasionStatus.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return The rewards.
   */
  POGOProtos.Rpc.LootProto getRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder();

  /**
   * <code>bool map_fragment_upgraded = 3;</code>
   * @return The mapFragmentUpgraded.
   */
  boolean getMapFragmentUpgraded();
}
