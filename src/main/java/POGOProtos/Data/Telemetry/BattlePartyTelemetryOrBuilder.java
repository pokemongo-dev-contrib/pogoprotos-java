// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/BattlePartyTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface BattlePartyTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.BattlePartyTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
   * @return The enum numeric value on the wire for battlePartyClickId.
   */
  int getBattlePartyClickIdValue();
  /**
   * <code>.POGOProtos.Enums.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
   * @return The battlePartyClickId.
   */
  POGOProtos.Enums.BattlePartyTelemetryIds getBattlePartyClickId();

  /**
   * <code>int32 battle_party_count = 2;</code>
   * @return The battlePartyCount.
   */
  int getBattlePartyCount();

  /**
   * <code>int32 battle_party_number = 3;</code>
   * @return The battlePartyNumber.
   */
  int getBattlePartyNumber();
}