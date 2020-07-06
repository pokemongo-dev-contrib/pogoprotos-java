// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/CombatMoveSettings.proto

package POGOProtos.Settings.Master;

public interface CombatMoveSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.CombatMoveSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.PokemonMove unique_id = 1;</code>
   * @return The enum numeric value on the wire for uniqueId.
   */
  int getUniqueIdValue();
  /**
   * <code>.POGOProtos.Enums.PokemonMove unique_id = 1;</code>
   * @return The uniqueId.
   */
  POGOProtos.Enums.PokemonMove getUniqueId();

  /**
   * <code>.POGOProtos.Enums.PokemonType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.POGOProtos.Enums.PokemonType type = 2;</code>
   * @return The type.
   */
  POGOProtos.Enums.PokemonType getType();

  /**
   * <code>float power = 3;</code>
   * @return The power.
   */
  float getPower();

  /**
   * <code>string vfx_name = 4;</code>
   * @return The vfxName.
   */
  java.lang.String getVfxName();
  /**
   * <code>string vfx_name = 4;</code>
   * @return The bytes for vfxName.
   */
  com.google.protobuf.ByteString
      getVfxNameBytes();

  /**
   * <code>int32 duration_turns = 5;</code>
   * @return The durationTurns.
   */
  int getDurationTurns();

  /**
   * <code>int32 energy_delta = 6;</code>
   * @return The energyDelta.
   */
  int getEnergyDelta();

  /**
   * <code>.POGOProtos.Data.Combat.CombatMoveBuffs buffs = 7;</code>
   * @return Whether the buffs field is set.
   */
  boolean hasBuffs();
  /**
   * <code>.POGOProtos.Data.Combat.CombatMoveBuffs buffs = 7;</code>
   * @return The buffs.
   */
  POGOProtos.Data.Combat.CombatMoveBuffs getBuffs();
  /**
   * <code>.POGOProtos.Data.Combat.CombatMoveBuffs buffs = 7;</code>
   */
  POGOProtos.Data.Combat.CombatMoveBuffsOrBuilder getBuffsOrBuilder();
}