// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface EvolvePokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.EvolvePokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   */
  POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry evolved_pokemon = 2;</code>
   * @return Whether the evolvedPokemon field is set.
   */
  boolean hasEvolvedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry evolved_pokemon = 2;</code>
   * @return The evolvedPokemon.
   */
  POGOProtos.Rpc.PokemonTelemetry getEvolvedPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry evolved_pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonTelemetryOrBuilder getEvolvedPokemonOrBuilder();
}
