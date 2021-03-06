// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetCombatResultsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetCombatResultsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetCombatResultsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetCombatResultsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetCombatResultsOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.CombatRewardStatus reward_status = 2;</code>
   * @return The enum numeric value on the wire for rewardStatus.
   */
  int getRewardStatusValue();
  /**
   * <code>.POGOProtos.Rpc.CombatRewardStatus reward_status = 2;</code>
   * @return The rewardStatus.
   */
  POGOProtos.Rpc.CombatRewardStatus getRewardStatus();

  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 3;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 3;</code>
   * @return The rewards.
   */
  POGOProtos.Rpc.LootProto getRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 3;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.LeveledUpFriendsProto friend_level_up = 4;</code>
   * @return Whether the friendLevelUp field is set.
   */
  boolean hasFriendLevelUp();
  /**
   * <code>.POGOProtos.Rpc.LeveledUpFriendsProto friend_level_up = 4;</code>
   * @return The friendLevelUp.
   */
  POGOProtos.Rpc.LeveledUpFriendsProto getFriendLevelUp();
  /**
   * <code>.POGOProtos.Rpc.LeveledUpFriendsProto friend_level_up = 4;</code>
   */
  POGOProtos.Rpc.LeveledUpFriendsProtoOrBuilder getFriendLevelUpOrBuilder();

  /**
   * <code>int32 number_rewarded_battles_today = 5;</code>
   * @return The numberRewardedBattlesToday.
   */
  int getNumberRewardedBattlesToday();

  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState combat_player_finish_state = 6;</code>
   * @return The enum numeric value on the wire for combatPlayerFinishState.
   */
  int getCombatPlayerFinishStateValue();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState combat_player_finish_state = 6;</code>
   * @return The combatPlayerFinishState.
   */
  POGOProtos.Rpc.CombatPlayerFinishState getCombatPlayerFinishState();

  /**
   * <code>.POGOProtos.Rpc.GetCombatResultsOutProto.CombatRematchProto combat_rematch = 7;</code>
   * @return Whether the combatRematch field is set.
   */
  boolean hasCombatRematch();
  /**
   * <code>.POGOProtos.Rpc.GetCombatResultsOutProto.CombatRematchProto combat_rematch = 7;</code>
   * @return The combatRematch.
   */
  POGOProtos.Rpc.GetCombatResultsOutProto.CombatRematchProto getCombatRematch();
  /**
   * <code>.POGOProtos.Rpc.GetCombatResultsOutProto.CombatRematchProto combat_rematch = 7;</code>
   */
  POGOProtos.Rpc.GetCombatResultsOutProto.CombatRematchProtoOrBuilder getCombatRematchOrBuilder();
}
