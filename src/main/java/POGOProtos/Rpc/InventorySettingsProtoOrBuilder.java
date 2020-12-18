// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface InventorySettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventorySettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 max_pokemon = 1;</code>
   * @return The maxPokemon.
   */
  int getMaxPokemon();

  /**
   * <code>int32 max_bag_items = 2;</code>
   * @return The maxBagItems.
   */
  int getMaxBagItems();

  /**
   * <code>int32 base_pokemon = 3;</code>
   * @return The basePokemon.
   */
  int getBasePokemon();

  /**
   * <code>int32 base_bag_items = 4;</code>
   * @return The baseBagItems.
   */
  int getBaseBagItems();

  /**
   * <code>int32 base_eggs = 5;</code>
   * @return The baseEggs.
   */
  int getBaseEggs();

  /**
   * <code>int32 max_team_changes = 6;</code>
   * @return The maxTeamChanges.
   */
  int getMaxTeamChanges();

  /**
   * <code>int64 team_change_item_reset_period_in_days = 7;</code>
   * @return The teamChangeItemResetPeriodInDays.
   */
  long getTeamChangeItemResetPeriodInDays();

  /**
   * <code>int64 max_item_boost_duration_ms = 8;</code>
   * @return The maxItemBoostDurationMs.
   */
  long getMaxItemBoostDurationMs();

  /**
   * <code>int32 default_sticker_max_count = 9;</code>
   * @return The defaultStickerMaxCount.
   */
  int getDefaultStickerMaxCount();

  /**
   * <code>bool enable_eggs_not_inventory = 10;</code>
   * @return The enableEggsNotInventory.
   */
  boolean getEnableEggsNotInventory();

  /**
   * <code>int32 special_egg_overflow_spots = 11;</code>
   * @return The specialEggOverflowSpots.
   */
  int getSpecialEggOverflowSpots();

  /**
   * <code>bool enable_overflow_spot_sliding = 12;</code>
   * @return The enableOverflowSpotSliding.
   */
  boolean getEnableOverflowSpotSliding();
}
