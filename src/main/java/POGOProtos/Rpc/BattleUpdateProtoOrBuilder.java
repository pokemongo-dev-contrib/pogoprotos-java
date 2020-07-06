// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface BattleUpdateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BattleUpdateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 1;</code>
   * @return Whether the battleLog field is set.
   */
  boolean hasBattleLog();
  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 1;</code>
   * @return The battleLog.
   */
  POGOProtos.Rpc.BattleLogProto getBattleLog();
  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 1;</code>
   */
  POGOProtos.Rpc.BattleLogProtoOrBuilder getBattleLogOrBuilder();

  /**
   * <code>string battle_id = 2;</code>
   * @return The battleId.
   */
  java.lang.String getBattleId();
  /**
   * <code>string battle_id = 2;</code>
   * @return The bytes for battleId.
   */
  com.google.protobuf.ByteString
      getBattleIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 3;</code>
   * @return Whether the activeDefender field is set.
   */
  boolean hasActiveDefender();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 3;</code>
   * @return The activeDefender.
   */
  POGOProtos.Rpc.PokemonInfo getActiveDefender();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 3;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getActiveDefenderOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 4;</code>
   * @return Whether the activeAttacker field is set.
   */
  boolean hasActiveAttacker();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 4;</code>
   * @return The activeAttacker.
   */
  POGOProtos.Rpc.PokemonInfo getActiveAttacker();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 4;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getActiveAttackerOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone highest_friendship_milestone = 5;</code>
   * @return The enum numeric value on the wire for highestFriendshipMilestone.
   */
  int getHighestFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone highest_friendship_milestone = 5;</code>
   * @return The highestFriendshipMilestone.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getHighestFriendshipMilestone();
}