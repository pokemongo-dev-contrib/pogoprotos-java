// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetNpcCombatRewardsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetNpcCombatRewardsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string combat_npc_trainer_template_id = 1;</code>
   * @return The combatNpcTrainerTemplateId.
   */
  java.lang.String getCombatNpcTrainerTemplateId();
  /**
   * <code>string combat_npc_trainer_template_id = 1;</code>
   * @return The bytes for combatNpcTrainerTemplateId.
   */
  com.google.protobuf.ByteString
      getCombatNpcTrainerTemplateIdBytes();

  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState finish_state = 2;</code>
   * @return The enum numeric value on the wire for finishState.
   */
  int getFinishStateValue();
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState finish_state = 2;</code>
   * @return The finishState.
   */
  POGOProtos.Rpc.CombatPlayerFinishState getFinishState();

  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);

  /**
   * <code>string combat_id = 4;</code>
   * @return The combatId.
   */
  java.lang.String getCombatId();
  /**
   * <code>string combat_id = 4;</code>
   * @return The bytes for combatId.
   */
  com.google.protobuf.ByteString
      getCombatIdBytes();

  /**
   * <code>.POGOProtos.Rpc.CombatQuestUpdateProto combat_quest_update = 5;</code>
   * @return Whether the combatQuestUpdate field is set.
   */
  boolean hasCombatQuestUpdate();
  /**
   * <code>.POGOProtos.Rpc.CombatQuestUpdateProto combat_quest_update = 5;</code>
   * @return The combatQuestUpdate.
   */
  POGOProtos.Rpc.CombatQuestUpdateProto getCombatQuestUpdate();
  /**
   * <code>.POGOProtos.Rpc.CombatQuestUpdateProto combat_quest_update = 5;</code>
   */
  POGOProtos.Rpc.CombatQuestUpdateProtoOrBuilder getCombatQuestUpdateOrBuilder();
}
