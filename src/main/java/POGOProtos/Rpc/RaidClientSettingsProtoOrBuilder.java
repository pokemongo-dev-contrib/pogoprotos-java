// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface RaidClientSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RaidClientSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool remote_raid_enabled = 1;</code>
   * @return The remoteRaidEnabled.
   */
  boolean getRemoteRaidEnabled();

  /**
   * <code>int32 max_remote_raid_passes = 2;</code>
   * @return The maxRemoteRaidPasses.
   */
  int getMaxRemoteRaidPasses();

  /**
   * <code>float remote_damage_modifier = 3;</code>
   * @return The remoteDamageModifier.
   */
  float getRemoteDamageModifier();

  /**
   * <code>int32 remote_raids_min_player_level = 4;</code>
   * @return The remoteRaidsMinPlayerLevel.
   */
  int getRemoteRaidsMinPlayerLevel();

  /**
   * <code>int32 max_num_friend_invites = 5;</code>
   * @return The maxNumFriendInvites.
   */
  int getMaxNumFriendInvites();

  /**
   * <code>int32 friend_invite_cutoff_time_sec = 6;</code>
   * @return The friendInviteCutoffTimeSec.
   */
  int getFriendInviteCutoffTimeSec();

  /**
   * <code>bool can_invite_friends_in_person = 7;</code>
   * @return The canInviteFriendsInPerson.
   */
  boolean getCanInviteFriendsInPerson();

  /**
   * <code>bool can_invite_friends_remotely = 8;</code>
   * @return The canInviteFriendsRemotely.
   */
  boolean getCanInviteFriendsRemotely();

  /**
   * <code>int32 max_players_per_lobby = 9;</code>
   * @return The maxPlayersPerLobby.
   */
  int getMaxPlayersPerLobby();

  /**
   * <code>int32 max_remote_players_per_lobby = 10;</code>
   * @return The maxRemotePlayersPerLobby.
   */
  int getMaxRemotePlayersPerLobby();

  /**
   * <code>int64 invite_cooldown_duration_millis = 11;</code>
   * @return The inviteCooldownDurationMillis.
   */
  long getInviteCooldownDurationMillis();

  /**
   * <code>int32 max_num_friend_invites_per_action = 12;</code>
   * @return The maxNumFriendInvitesPerAction.
   */
  int getMaxNumFriendInvitesPerAction();

  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_raid_levels_for_friend_invites = 13;</code>
   * @return A list containing the unsupportedRaidLevelsForFriendInvites.
   */
  java.util.List<POGOProtos.Rpc.RaidLevel> getUnsupportedRaidLevelsForFriendInvitesList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_raid_levels_for_friend_invites = 13;</code>
   * @return The count of unsupportedRaidLevelsForFriendInvites.
   */
  int getUnsupportedRaidLevelsForFriendInvitesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_raid_levels_for_friend_invites = 13;</code>
   * @param index The index of the element to return.
   * @return The unsupportedRaidLevelsForFriendInvites at the given index.
   */
  POGOProtos.Rpc.RaidLevel getUnsupportedRaidLevelsForFriendInvites(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_raid_levels_for_friend_invites = 13;</code>
   * @return A list containing the enum numeric values on the wire for unsupportedRaidLevelsForFriendInvites.
   */
  java.util.List<java.lang.Integer>
  getUnsupportedRaidLevelsForFriendInvitesValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_raid_levels_for_friend_invites = 13;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of unsupportedRaidLevelsForFriendInvites at the given index.
   */
  int getUnsupportedRaidLevelsForFriendInvitesValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_remote_raid_levels = 14;</code>
   * @return A list containing the unsupportedRemoteRaidLevels.
   */
  java.util.List<POGOProtos.Rpc.RaidLevel> getUnsupportedRemoteRaidLevelsList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_remote_raid_levels = 14;</code>
   * @return The count of unsupportedRemoteRaidLevels.
   */
  int getUnsupportedRemoteRaidLevelsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_remote_raid_levels = 14;</code>
   * @param index The index of the element to return.
   * @return The unsupportedRemoteRaidLevels at the given index.
   */
  POGOProtos.Rpc.RaidLevel getUnsupportedRemoteRaidLevels(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_remote_raid_levels = 14;</code>
   * @return A list containing the enum numeric values on the wire for unsupportedRemoteRaidLevels.
   */
  java.util.List<java.lang.Integer>
  getUnsupportedRemoteRaidLevelsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel unsupported_remote_raid_levels = 14;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of unsupportedRemoteRaidLevels at the given index.
   */
  int getUnsupportedRemoteRaidLevelsValue(int index);
}
