// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface MegaEvolvePokemonOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MegaEvolvePokemonOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.MegaEvolvePokemonOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.MegaEvolvePokemonOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.MegaEvolvePokemonOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto evolved_pokemon = 2;</code>
   * @return Whether the evolvedPokemon field is set.
   */
  boolean hasEvolvedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto evolved_pokemon = 2;</code>
   * @return The evolvedPokemon.
   */
  POGOProtos.Rpc.PokemonProto getEvolvedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto evolved_pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getEvolvedPokemonOrBuilder();

  /**
   * <code>int32 exp_awarded = 3;</code>
   * @return The expAwarded.
   */
  int getExpAwarded();
}
