// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CombatGlobalSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CombatGlobalSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_combat = 1;</code>
   * @return The enableCombat.
   */
  boolean getEnableCombat();

  /**
   * <code>int32 maximum_daily_rewarded_battles = 2;</code>
   * @return The maximumDailyRewardedBattles.
   */
  int getMaximumDailyRewardedBattles();

  /**
   * <code>bool enable_combat_stat_stages = 3;</code>
   * @return The enableCombatStatStages.
   */
  boolean getEnableCombatStatStages();

  /**
   * <code>uint32 minimum_player_level = 4;</code>
   * @return The minimumPlayerLevel.
   */
  int getMinimumPlayerLevel();

  /**
   * <code>int32 maximum_daily_npc_rewarded_battles = 5;</code>
   * @return The maximumDailyNpcRewardedBattles.
   */
  int getMaximumDailyNpcRewardedBattles();

  /**
   * <code>int32 active_combat_update_interval_ms = 6;</code>
   * @return The activeCombatUpdateIntervalMs.
   */
  int getActiveCombatUpdateIntervalMs();

  /**
   * <code>int32 waiting_for_player_update_interval_ms = 7;</code>
   * @return The waitingForPlayerUpdateIntervalMs.
   */
  int getWaitingForPlayerUpdateIntervalMs();

  /**
   * <code>int32 ready_for_battle_update_interval_ms = 8;</code>
   * @return The readyForBattleUpdateIntervalMs.
   */
  int getReadyForBattleUpdateIntervalMs();

  /**
   * <code>int32 pre_move_submit_window_ms = 9;</code>
   * @return The preMoveSubmitWindowMs.
   */
  int getPreMoveSubmitWindowMs();

  /**
   * <code>int32 post_move_submit_window_ms = 10;</code>
   * @return The postMoveSubmitWindowMs.
   */
  int getPostMoveSubmitWindowMs();

  /**
   * <code>bool enable_sockets = 11;</code>
   * @return The enableSockets.
   */
  boolean getEnableSockets();

  /**
   * <code>bool enable_spin_minigame = 12;</code>
   * @return The enableSpinMinigame.
   */
  boolean getEnableSpinMinigame();

  /**
   * <code>bool enable_quick_swap_v2 = 13;</code>
   * @return The enableQuickSwapV2.
   */
  boolean getEnableQuickSwapV2();

  /**
   * <code>bool deprecated_vs_seeker_setting = 14;</code>
   * @return The deprecatedVsSeekerSetting.
   */
  boolean getDeprecatedVsSeekerSetting();

  /**
   * <code>int32 vs_seeker_walking_dist_poll_duration_ms = 15;</code>
   * @return The vsSeekerWalkingDistPollDurationMs.
   */
  int getVsSeekerWalkingDistPollDurationMs();

  /**
   * <code>int32 vs_seeker_player_min_level = 16;</code>
   * @return The vsSeekerPlayerMinLevel.
   */
  int getVsSeekerPlayerMinLevel();

  /**
   * <code>int32 matchmaking_poll_duration_ms = 17;</code>
   * @return The matchmakingPollDurationMs.
   */
  int getMatchmakingPollDurationMs();

  /**
   * <code>bool enable_particle_minigame = 18;</code>
   * @return The enableParticleMinigame.
   */
  boolean getEnableParticleMinigame();

  /**
   * <code>bool enable_vs_seeker_upgrade_iap = 19;</code>
   * @return The enableVsSeekerUpgradeIap.
   */
  boolean getEnableVsSeekerUpgradeIap();

  /**
   * <code>bool enable_flyout_animations = 20;</code>
   * @return The enableFlyoutAnimations.
   */
  boolean getEnableFlyoutAnimations();

  /**
   * <code>bool enable_battle_hub = 21;</code>
   * @return The enableBattleHub.
   */
  boolean getEnableBattleHub();

  /**
   * <code>int32 matchmaking_timeout_duration_ms = 22;</code>
   * @return The matchmakingTimeoutDurationMs.
   */
  int getMatchmakingTimeoutDurationMs();

  /**
   * <code>int64 planned_downtime_timestamp_ms = 23;</code>
   * @return The plannedDowntimeTimestampMs.
   */
  long getPlannedDowntimeTimestampMs();

  /**
   * <code>int32 latency_compensation_threshold_ms = 24;</code>
   * @return The latencyCompensationThresholdMs.
   */
  int getLatencyCompensationThresholdMs();
}
