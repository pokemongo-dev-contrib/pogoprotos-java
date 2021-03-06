// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ClientPerformanceSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClientPerformanceSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_local_disk_caching = 1;</code>
   * @return The enableLocalDiskCaching.
   */
  boolean getEnableLocalDiskCaching();

  /**
   * <code>int32 max_number_local_battle_parties = 2;</code>
   * @return The maxNumberLocalBattleParties.
   */
  int getMaxNumberLocalBattleParties();

  /**
   * <code>bool multi_pokemon_battle_party_select = 3;</code>
   * @return The multiPokemonBattlePartySelect.
   */
  boolean getMultiPokemonBattlePartySelect();

  /**
   * <code>bool use_whole_match_for_filter_key = 4;</code>
   * @return The useWholeMatchForFilterKey.
   */
  boolean getUseWholeMatchForFilterKey();
}
