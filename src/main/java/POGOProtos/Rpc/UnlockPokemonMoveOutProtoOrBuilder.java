// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UnlockPokemonMoveOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UnlockPokemonMoveOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.UnlockPokemonMoveOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.UnlockPokemonMoveOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.UnlockPokemonMoveOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto unlocked_pokemon = 2;</code>
   * @return Whether the unlockedPokemon field is set.
   */
  boolean hasUnlockedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto unlocked_pokemon = 2;</code>
   * @return The unlockedPokemon.
   */
  POGOProtos.Rpc.PokemonProto getUnlockedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto unlocked_pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getUnlockedPokemonOrBuilder();
}
