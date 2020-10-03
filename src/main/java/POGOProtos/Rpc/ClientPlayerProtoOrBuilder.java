// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ClientPlayerProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClientPlayerProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 creation_time_ms = 1;</code>
   * @return The creationTimeMs.
   */
  long getCreationTimeMs();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 team = 5;</code>
   * @return The team.
   */
  int getTeam();

  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 7;</code>
   * @return A list containing the tutorialComplete.
   */
  java.util.List<POGOProtos.Rpc.TutorialCompletion> getTutorialCompleteList();
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 7;</code>
   * @return The count of tutorialComplete.
   */
  int getTutorialCompleteCount();
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 7;</code>
   * @param index The index of the element to return.
   * @return The tutorialComplete at the given index.
   */
  POGOProtos.Rpc.TutorialCompletion getTutorialComplete(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 7;</code>
   * @return A list containing the enum numeric values on the wire for tutorialComplete.
   */
  java.util.List<java.lang.Integer>
  getTutorialCompleteValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 7;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tutorialComplete at the given index.
   */
  int getTutorialCompleteValue(int index);

  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto player_avatar_proto = 8;</code>
   * @return Whether the playerAvatarProto field is set.
   */
  boolean hasPlayerAvatarProto();
  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto player_avatar_proto = 8;</code>
   * @return The playerAvatarProto.
   */
  POGOProtos.Rpc.PlayerAvatarProto getPlayerAvatarProto();
  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto player_avatar_proto = 8;</code>
   */
  POGOProtos.Rpc.PlayerAvatarProtoOrBuilder getPlayerAvatarProtoOrBuilder();

  /**
   * <code>int32 max_pokemon_storage = 9;</code>
   * @return The maxPokemonStorage.
   */
  int getMaxPokemonStorage();

  /**
   * <code>int32 max_item_storage = 10;</code>
   * @return The maxItemStorage.
   */
  int getMaxItemStorage();

  /**
   * <code>.POGOProtos.Rpc.DailyBonusProto daily_bonus_proto = 11;</code>
   * @return Whether the dailyBonusProto field is set.
   */
  boolean hasDailyBonusProto();
  /**
   * <code>.POGOProtos.Rpc.DailyBonusProto daily_bonus_proto = 11;</code>
   * @return The dailyBonusProto.
   */
  POGOProtos.Rpc.DailyBonusProto getDailyBonusProto();
  /**
   * <code>.POGOProtos.Rpc.DailyBonusProto daily_bonus_proto = 11;</code>
   */
  POGOProtos.Rpc.DailyBonusProtoOrBuilder getDailyBonusProtoOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped_badge_proto = 12;</code>
   * @return Whether the equippedBadgeProto field is set.
   */
  boolean hasEquippedBadgeProto();
  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped_badge_proto = 12;</code>
   * @return The equippedBadgeProto.
   */
  POGOProtos.Rpc.EquippedBadgeProto getEquippedBadgeProto();
  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped_badge_proto = 12;</code>
   */
  POGOProtos.Rpc.EquippedBadgeProtoOrBuilder getEquippedBadgeProtoOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.ContactSettingsProto contact_settings_proto = 13;</code>
   * @return Whether the contactSettingsProto field is set.
   */
  boolean hasContactSettingsProto();
  /**
   * <code>.POGOProtos.Rpc.ContactSettingsProto contact_settings_proto = 13;</code>
   * @return The contactSettingsProto.
   */
  POGOProtos.Rpc.ContactSettingsProto getContactSettingsProto();
  /**
   * <code>.POGOProtos.Rpc.ContactSettingsProto contact_settings_proto = 13;</code>
   */
  POGOProtos.Rpc.ContactSettingsProtoOrBuilder getContactSettingsProtoOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_balance = 14;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformCurrencyQuantityProto> 
      getCurrencyBalanceList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_balance = 14;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProto getCurrencyBalance(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_balance = 14;</code>
   */
  int getCurrencyBalanceCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_balance = 14;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder> 
      getCurrencyBalanceOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_balance = 14;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder getCurrencyBalanceOrBuilder(
      int index);

  /**
   * <code>int32 remaining_codename_claims = 15;</code>
   * @return The remainingCodenameClaims.
   */
  int getRemainingCodenameClaims();

  /**
   * <code>.POGOProtos.Rpc.BuddyPokemonProto buddy_pokemon_proto = 16;</code>
   * @return Whether the buddyPokemonProto field is set.
   */
  boolean hasBuddyPokemonProto();
  /**
   * <code>.POGOProtos.Rpc.BuddyPokemonProto buddy_pokemon_proto = 16;</code>
   * @return The buddyPokemonProto.
   */
  POGOProtos.Rpc.BuddyPokemonProto getBuddyPokemonProto();
  /**
   * <code>.POGOProtos.Rpc.BuddyPokemonProto buddy_pokemon_proto = 16;</code>
   */
  POGOProtos.Rpc.BuddyPokemonProtoOrBuilder getBuddyPokemonProtoOrBuilder();

  /**
   * <code>int64 battle_lockout_end_ms = 17;</code>
   * @return The battleLockoutEndMs.
   */
  long getBattleLockoutEndMs();

  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto secondary_player_avatar_proto = 18;</code>
   * @return Whether the secondaryPlayerAvatarProto field is set.
   */
  boolean hasSecondaryPlayerAvatarProto();
  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto secondary_player_avatar_proto = 18;</code>
   * @return The secondaryPlayerAvatarProto.
   */
  POGOProtos.Rpc.PlayerAvatarProto getSecondaryPlayerAvatarProto();
  /**
   * <code>.POGOProtos.Rpc.PlayerAvatarProto secondary_player_avatar_proto = 18;</code>
   */
  POGOProtos.Rpc.PlayerAvatarProtoOrBuilder getSecondaryPlayerAvatarProtoOrBuilder();

  /**
   * <code>bool name_is_blacklisted = 19;</code>
   * @return The nameIsBlacklisted.
   */
  boolean getNameIsBlacklisted();

  /**
   * <code>.POGOProtos.Rpc.SocialPlayerSettingsProto social_player_settings = 20;</code>
   * @return Whether the socialPlayerSettings field is set.
   */
  boolean hasSocialPlayerSettings();
  /**
   * <code>.POGOProtos.Rpc.SocialPlayerSettingsProto social_player_settings = 20;</code>
   * @return The socialPlayerSettings.
   */
  POGOProtos.Rpc.SocialPlayerSettingsProto getSocialPlayerSettings();
  /**
   * <code>.POGOProtos.Rpc.SocialPlayerSettingsProto social_player_settings = 20;</code>
   */
  POGOProtos.Rpc.SocialPlayerSettingsProtoOrBuilder getSocialPlayerSettingsOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 21;</code>
   * @return Whether the combatPlayerPreferences field is set.
   */
  boolean hasCombatPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 21;</code>
   * @return The combatPlayerPreferences.
   */
  POGOProtos.Rpc.CombatPlayerPreferencesProto getCombatPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 21;</code>
   */
  POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder getCombatPlayerPreferencesOrBuilder();

  /**
   * <code>string player_support_id = 22;</code>
   * @return The playerSupportId.
   */
  java.lang.String getPlayerSupportId();
  /**
   * <code>string player_support_id = 22;</code>
   * @return The bytes for playerSupportId.
   */
  com.google.protobuf.ByteString
      getPlayerSupportIdBytes();

  /**
   * <code>.POGOProtos.Rpc.TeamChangeInfoProto team_change_info = 23;</code>
   * @return Whether the teamChangeInfo field is set.
   */
  boolean hasTeamChangeInfo();
  /**
   * <code>.POGOProtos.Rpc.TeamChangeInfoProto team_change_info = 23;</code>
   * @return The teamChangeInfo.
   */
  POGOProtos.Rpc.TeamChangeInfoProto getTeamChangeInfo();
  /**
   * <code>.POGOProtos.Rpc.TeamChangeInfoProto team_change_info = 23;</code>
   */
  POGOProtos.Rpc.TeamChangeInfoProtoOrBuilder getTeamChangeInfoOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId consumed_eevee_easter_eggs = 24;</code>
   * @return A list containing the consumedEeveeEasterEggs.
   */
  java.util.List<POGOProtos.Rpc.HoloPokemonId> getConsumedEeveeEasterEggsList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId consumed_eevee_easter_eggs = 24;</code>
   * @return The count of consumedEeveeEasterEggs.
   */
  int getConsumedEeveeEasterEggsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId consumed_eevee_easter_eggs = 24;</code>
   * @param index The index of the element to return.
   * @return The consumedEeveeEasterEggs at the given index.
   */
  POGOProtos.Rpc.HoloPokemonId getConsumedEeveeEasterEggs(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId consumed_eevee_easter_eggs = 24;</code>
   * @return A list containing the enum numeric values on the wire for consumedEeveeEasterEggs.
   */
  java.util.List<java.lang.Integer>
  getConsumedEeveeEasterEggsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId consumed_eevee_easter_eggs = 24;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of consumedEeveeEasterEggs at the given index.
   */
  int getConsumedEeveeEasterEggsValue(int index);

  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 25;</code>
   * @return Whether the combatLog field is set.
   */
  boolean hasCombatLog();
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 25;</code>
   * @return The combatLog.
   */
  POGOProtos.Rpc.CombatLogProto getCombatLog();
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 25;</code>
   */
  POGOProtos.Rpc.CombatLogProtoOrBuilder getCombatLogOrBuilder();

  /**
   * <code>int64 time_zone_offset_ms = 26;</code>
   * @return The timeZoneOffsetMs.
   */
  long getTimeZoneOffsetMs();

  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData buddy_observed_data = 27;</code>
   * @return Whether the buddyObservedData field is set.
   */
  boolean hasBuddyObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData buddy_observed_data = 27;</code>
   * @return The buddyObservedData.
   */
  POGOProtos.Rpc.BuddyObservedData getBuddyObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData buddy_observed_data = 27;</code>
   */
  POGOProtos.Rpc.BuddyObservedDataOrBuilder getBuddyObservedDataOrBuilder();

  /**
   * <code>string helpshift_user_id = 28;</code>
   * @return The helpshiftUserId.
   */
  java.lang.String getHelpshiftUserId();
  /**
   * <code>string helpshift_user_id = 28;</code>
   * @return The bytes for helpshiftUserId.
   */
  com.google.protobuf.ByteString
      getHelpshiftUserIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PlayerPreferencesProto player_preferences = 29;</code>
   * @return Whether the playerPreferences field is set.
   */
  boolean hasPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.PlayerPreferencesProto player_preferences = 29;</code>
   * @return The playerPreferences.
   */
  POGOProtos.Rpc.PlayerPreferencesProto getPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.PlayerPreferencesProto player_preferences = 29;</code>
   */
  POGOProtos.Rpc.PlayerPreferencesProtoOrBuilder getPlayerPreferencesOrBuilder();
}
