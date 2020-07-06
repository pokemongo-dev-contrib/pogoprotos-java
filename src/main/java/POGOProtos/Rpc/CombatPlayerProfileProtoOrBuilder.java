// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface CombatPlayerProfileProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CombatPlayerProfileProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string player_id = 1;</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <code>string player_id = 1;</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto public_profile = 2;</code>
   * @return Whether the publicProfile field is set.
   */
  boolean hasPublicProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto public_profile = 2;</code>
   * @return The publicProfile.
   */
  POGOProtos.Rpc.PlayerPublicProfileProto getPublicProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto public_profile = 2;</code>
   */
  POGOProtos.Rpc.PlayerPublicProfileProtoOrBuilder getPublicProfileOrBuilder();

  /**
   * <code>repeated string combat_league_template_id = 3;</code>
   * @return A list containing the combatLeagueTemplateId.
   */
  java.util.List<java.lang.String>
      getCombatLeagueTemplateIdList();
  /**
   * <code>repeated string combat_league_template_id = 3;</code>
   * @return The count of combatLeagueTemplateId.
   */
  int getCombatLeagueTemplateIdCount();
  /**
   * <code>repeated string combat_league_template_id = 3;</code>
   * @param index The index of the element to return.
   * @return The combatLeagueTemplateId at the given index.
   */
  java.lang.String getCombatLeagueTemplateId(int index);
  /**
   * <code>repeated string combat_league_template_id = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the combatLeagueTemplateId at the given index.
   */
  com.google.protobuf.ByteString
      getCombatLeagueTemplateIdBytes(int index);

  /**
   * <code>fixed64 buddy_pokemon_id = 4;</code>
   * @return The buddyPokemonId.
   */
  long getBuddyPokemonId();

  /**
   * <code>.POGOProtos.Rpc.CombatPlayerProfileProto.Location location = 5;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerProfileProto.Location location = 5;</code>
   * @return The location.
   */
  POGOProtos.Rpc.CombatPlayerProfileProto.Location getLocation();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerProfileProto.Location location = 5;</code>
   */
  POGOProtos.Rpc.CombatPlayerProfileProto.LocationOrBuilder getLocationOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 6;</code>
   * @return Whether the combatPlayerPreferences field is set.
   */
  boolean hasCombatPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 6;</code>
   * @return The combatPlayerPreferences.
   */
  POGOProtos.Rpc.CombatPlayerPreferencesProto getCombatPlayerPreferences();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto combat_player_preferences = 6;</code>
   */
  POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder getCombatPlayerPreferencesOrBuilder();
}