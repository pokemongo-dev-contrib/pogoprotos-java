// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface WithPvpCombatProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.WithPvpCombatProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool requires_win = 1;</code>
   * @return The requiresWin.
   */
  boolean getRequiresWin();

  /**
   * <code>repeated string combat_league_template_id = 2;</code>
   * @return A list containing the combatLeagueTemplateId.
   */
  java.util.List<java.lang.String>
      getCombatLeagueTemplateIdList();
  /**
   * <code>repeated string combat_league_template_id = 2;</code>
   * @return The count of combatLeagueTemplateId.
   */
  int getCombatLeagueTemplateIdCount();
  /**
   * <code>repeated string combat_league_template_id = 2;</code>
   * @param index The index of the element to return.
   * @return The combatLeagueTemplateId at the given index.
   */
  java.lang.String getCombatLeagueTemplateId(int index);
  /**
   * <code>repeated string combat_league_template_id = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the combatLeagueTemplateId at the given index.
   */
  com.google.protobuf.ByteString
      getCombatLeagueTemplateIdBytes(int index);
}