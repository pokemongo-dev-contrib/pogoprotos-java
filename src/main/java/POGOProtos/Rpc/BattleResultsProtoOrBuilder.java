// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BattleResultsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BattleResultsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   * @return Whether the gymState field is set.
   */
  boolean hasGymState();
  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   * @return The gymState.
   */
  POGOProtos.Rpc.GymStateProto getGymState();
  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   */
  POGOProtos.Rpc.GymStateProtoOrBuilder getGymStateOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.BattleParticipantProto attackers = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.BattleParticipantProto> 
      getAttackersList();
  /**
   * <code>repeated .POGOProtos.Rpc.BattleParticipantProto attackers = 2;</code>
   */
  POGOProtos.Rpc.BattleParticipantProto getAttackers(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.BattleParticipantProto attackers = 2;</code>
   */
  int getAttackersCount();
  /**
   * <code>repeated .POGOProtos.Rpc.BattleParticipantProto attackers = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.BattleParticipantProtoOrBuilder> 
      getAttackersOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.BattleParticipantProto attackers = 2;</code>
   */
  POGOProtos.Rpc.BattleParticipantProtoOrBuilder getAttackersOrBuilder(
      int index);

  /**
   * <code>repeated int32 player_xp_awarded = 3;</code>
   * @return A list containing the playerXpAwarded.
   */
  java.util.List<java.lang.Integer> getPlayerXpAwardedList();
  /**
   * <code>repeated int32 player_xp_awarded = 3;</code>
   * @return The count of playerXpAwarded.
   */
  int getPlayerXpAwardedCount();
  /**
   * <code>repeated int32 player_xp_awarded = 3;</code>
   * @param index The index of the element to return.
   * @return The playerXpAwarded at the given index.
   */
  int getPlayerXpAwarded(int index);

  /**
   * <code>int64 next_defender_pokemon_id = 4;</code>
   * @return The nextDefenderPokemonId.
   */
  long getNextDefenderPokemonId();

  /**
   * <code>int32 gym_points_delta = 5;</code>
   * @return The gymPointsDelta.
   */
  int getGymPointsDelta();

  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status = 6;</code>
   * @return Whether the gymStatus field is set.
   */
  boolean hasGymStatus();
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status = 6;</code>
   * @return The gymStatus.
   */
  POGOProtos.Rpc.GymStatusAndDefendersProto getGymStatus();
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status = 6;</code>
   */
  POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder getGymStatusOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.ParticipationProto participation = 7;</code>
   */
  java.util.List<POGOProtos.Rpc.ParticipationProto> 
      getParticipationList();
  /**
   * <code>repeated .POGOProtos.Rpc.ParticipationProto participation = 7;</code>
   */
  POGOProtos.Rpc.ParticipationProto getParticipation(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ParticipationProto participation = 7;</code>
   */
  int getParticipationCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ParticipationProto participation = 7;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ParticipationProtoOrBuilder> 
      getParticipationOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ParticipationProto participation = 7;</code>
   */
  POGOProtos.Rpc.ParticipationProtoOrBuilder getParticipationOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.LootProto raid_item_rewards = 8;</code>
   */
  java.util.List<POGOProtos.Rpc.LootProto> 
      getRaidItemRewardsList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto raid_item_rewards = 8;</code>
   */
  POGOProtos.Rpc.LootProto getRaidItemRewards(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto raid_item_rewards = 8;</code>
   */
  int getRaidItemRewardsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto raid_item_rewards = 8;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.LootProtoOrBuilder> 
      getRaidItemRewardsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto raid_item_rewards = 8;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getRaidItemRewardsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.RaidEncounterProto post_raid_encounter = 9;</code>
   */
  java.util.List<POGOProtos.Rpc.RaidEncounterProto> 
      getPostRaidEncounterList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidEncounterProto post_raid_encounter = 9;</code>
   */
  POGOProtos.Rpc.RaidEncounterProto getPostRaidEncounter(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.RaidEncounterProto post_raid_encounter = 9;</code>
   */
  int getPostRaidEncounterCount();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidEncounterProto post_raid_encounter = 9;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.RaidEncounterProtoOrBuilder> 
      getPostRaidEncounterOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidEncounterProto post_raid_encounter = 9;</code>
   */
  POGOProtos.Rpc.RaidEncounterProtoOrBuilder getPostRaidEncounterOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.AwardedGymBadge gym_badge = 10;</code>
   */
  java.util.List<POGOProtos.Rpc.AwardedGymBadge> 
      getGymBadgeList();
  /**
   * <code>repeated .POGOProtos.Rpc.AwardedGymBadge gym_badge = 10;</code>
   */
  POGOProtos.Rpc.AwardedGymBadge getGymBadge(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.AwardedGymBadge gym_badge = 10;</code>
   */
  int getGymBadgeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.AwardedGymBadge gym_badge = 10;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.AwardedGymBadgeOrBuilder> 
      getGymBadgeOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.AwardedGymBadge gym_badge = 10;</code>
   */
  POGOProtos.Rpc.AwardedGymBadgeOrBuilder getGymBadgeOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.LootProto default_raid_item_rewards = 11;</code>
   */
  java.util.List<POGOProtos.Rpc.LootProto> 
      getDefaultRaidItemRewardsList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto default_raid_item_rewards = 11;</code>
   */
  POGOProtos.Rpc.LootProto getDefaultRaidItemRewards(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto default_raid_item_rewards = 11;</code>
   */
  int getDefaultRaidItemRewardsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto default_raid_item_rewards = 11;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.LootProtoOrBuilder> 
      getDefaultRaidItemRewardsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootProto default_raid_item_rewards = 11;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getDefaultRaidItemRewardsOrBuilder(
      int index);

  /**
   * <code>int64 field1 = 12;</code>
   * @return The field1.
   */
  long getField1();
}
