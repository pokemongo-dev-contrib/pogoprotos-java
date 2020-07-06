// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface QuestPokemonEncounterProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.QuestPokemonEncounterProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string quest_id = 1;</code>
   * @return The questId.
   */
  java.lang.String getQuestId();
  /**
   * <code>string quest_id = 1;</code>
   * @return The bytes for questId.
   */
  com.google.protobuf.ByteString
      getQuestIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonProto getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter_type = 3;</code>
   * @return The enum numeric value on the wire for encounterType.
   */
  int getEncounterTypeValue();
  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter_type = 3;</code>
   * @return The encounterType.
   */
  POGOProtos.Rpc.EncounterType getEncounterType();

  /**
   * <code>bool is_hidden_ditto = 4;</code>
   * @return The isHiddenDitto.
   */
  boolean getIsHiddenDitto();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto ditto = 5;</code>
   * @return Whether the ditto field is set.
   */
  boolean hasDitto();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto ditto = 5;</code>
   * @return The ditto.
   */
  POGOProtos.Rpc.PokemonProto getDitto();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto ditto = 5;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getDittoOrBuilder();
}