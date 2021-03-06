// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CombatLeagueProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CombatLeagueProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>bool enabled = 2;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto unlock_condition = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto> 
      getUnlockConditionList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto unlock_condition = 3;</code>
   */
  POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto getUnlockCondition(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto unlock_condition = 3;</code>
   */
  int getUnlockConditionCount();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto unlock_condition = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProtoOrBuilder> 
      getUnlockConditionOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProto unlock_condition = 3;</code>
   */
  POGOProtos.Rpc.CombatLeagueProto.UnlockConditionProtoOrBuilder getUnlockConditionOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto pokemon_condition = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto> 
      getPokemonConditionList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto pokemon_condition = 4;</code>
   */
  POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto getPokemonCondition(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto pokemon_condition = 4;</code>
   */
  int getPokemonConditionCount();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto pokemon_condition = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProtoOrBuilder> 
      getPokemonConditionOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProto pokemon_condition = 4;</code>
   */
  POGOProtos.Rpc.CombatLeagueProto.PokemonConditionProtoOrBuilder getPokemonConditionOrBuilder(
      int index);

  /**
   * <code>string icon_url = 5;</code>
   * @return The iconUrl.
   */
  java.lang.String getIconUrl();
  /**
   * <code>string icon_url = 5;</code>
   * @return The bytes for iconUrl.
   */
  com.google.protobuf.ByteString
      getIconUrlBytes();

  /**
   * <code>int32 pokemon_count = 6;</code>
   * @return The pokemonCount.
   */
  int getPokemonCount();

  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId banned_pokemon = 7;</code>
   * @return A list containing the bannedPokemon.
   */
  java.util.List<POGOProtos.Rpc.HoloPokemonId> getBannedPokemonList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId banned_pokemon = 7;</code>
   * @return The count of bannedPokemon.
   */
  int getBannedPokemonCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId banned_pokemon = 7;</code>
   * @param index The index of the element to return.
   * @return The bannedPokemon at the given index.
   */
  POGOProtos.Rpc.HoloPokemonId getBannedPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId banned_pokemon = 7;</code>
   * @return A list containing the enum numeric values on the wire for bannedPokemon.
   */
  java.util.List<java.lang.Integer>
  getBannedPokemonValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId banned_pokemon = 7;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of bannedPokemon at the given index.
   */
  int getBannedPokemonValue(int index);

  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType badge_type = 8;</code>
   * @return The enum numeric value on the wire for badgeType.
   */
  int getBadgeTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType badge_type = 8;</code>
   * @return The badgeType.
   */
  POGOProtos.Rpc.HoloBadgeType getBadgeType();

  /**
   * <code>int32 minigame_defense_chance_limit = 9;</code>
   * @return The minigameDefenseChanceLimit.
   */
  int getMinigameDefenseChanceLimit();

  /**
   * <code>string battle_party_combat_league_template_id = 10;</code>
   * @return The battlePartyCombatLeagueTemplateId.
   */
  java.lang.String getBattlePartyCombatLeagueTemplateId();
  /**
   * <code>string battle_party_combat_league_template_id = 10;</code>
   * @return The bytes for battlePartyCombatLeagueTemplateId.
   */
  com.google.protobuf.ByteString
      getBattlePartyCombatLeagueTemplateIdBytes();

  /**
   * <code>.POGOProtos.Rpc.CombatLeagueProto.LeagueType league_type = 11;</code>
   * @return The enum numeric value on the wire for leagueType.
   */
  int getLeagueTypeValue();
  /**
   * <code>.POGOProtos.Rpc.CombatLeagueProto.LeagueType league_type = 11;</code>
   * @return The leagueType.
   */
  POGOProtos.Rpc.CombatLeagueProto.LeagueType getLeagueType();

  /**
   * <code>string border_color_hex = 12;</code>
   * @return The borderColorHex.
   */
  java.lang.String getBorderColorHex();
  /**
   * <code>string border_color_hex = 12;</code>
   * @return The bytes for borderColorHex.
   */
  com.google.protobuf.ByteString
      getBorderColorHexBytes();

  /**
   * <code>bool allow_temp_evos = 13;</code>
   * @return The allowTempEvos.
   */
  boolean getAllowTempEvos();
}
