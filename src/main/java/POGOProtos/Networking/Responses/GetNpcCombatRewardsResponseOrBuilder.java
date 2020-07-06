// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetNpcCombatRewardsResponse.proto

package POGOProtos.Networking.Responses;

public interface GetNpcCombatRewardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GetNpcCombatRewardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GetNpcCombatRewardsResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GetNpcCombatRewardsResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.GetNpcCombatRewardsResponse.Result getResult();

  /**
   * <code>.POGOProtos.Enums.CombatRewardStatus reward_status = 2;</code>
   * @return The enum numeric value on the wire for rewardStatus.
   */
  int getRewardStatusValue();
  /**
   * <code>.POGOProtos.Enums.CombatRewardStatus reward_status = 2;</code>
   * @return The rewardStatus.
   */
  POGOProtos.Enums.CombatRewardStatus getRewardStatus();

  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 3;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 3;</code>
   * @return The rewards.
   */
  POGOProtos.Inventory.Loot getRewards();
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 3;</code>
   */
  POGOProtos.Inventory.LootOrBuilder getRewardsOrBuilder();

  /**
   * <code>int32 number_rewarded_npc_battles_today = 4;</code>
   * @return The numberRewardedNpcBattlesToday.
   */
  int getNumberRewardedNpcBattlesToday();
}