// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/EvolvePokemonTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface EvolvePokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.EvolvePokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.Telemetry.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   */
  POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry evolved_pokemon = 2;</code>
   * @return Whether the evolvedPokemon field is set.
   */
  boolean hasEvolvedPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry evolved_pokemon = 2;</code>
   * @return The evolvedPokemon.
   */
  POGOProtos.Data.Telemetry.PokemonTelemetry getEvolvedPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry evolved_pokemon = 2;</code>
   */
  POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getEvolvedPokemonOrBuilder();
}