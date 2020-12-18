// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface WithNpcCombatProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.WithNpcCombatProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool requires_win = 1;</code>
   * @return The requiresWin.
   */
  boolean getRequiresWin();

  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @return A list containing the combatNpcTrainerId.
   */
  java.util.List<java.lang.String>
      getCombatNpcTrainerIdList();
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @return The count of combatNpcTrainerId.
   */
  int getCombatNpcTrainerIdCount();
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @param index The index of the element to return.
   * @return The combatNpcTrainerId at the given index.
   */
  java.lang.String getCombatNpcTrainerId(int index);
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the combatNpcTrainerId at the given index.
   */
  com.google.protobuf.ByteString
      getCombatNpcTrainerIdBytes(int index);
}
