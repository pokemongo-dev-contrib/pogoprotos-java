// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/BuddyPokemonLogEntry.proto

package POGOProtos.Data.Logs;

public interface BuddyPokemonLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Logs.BuddyPokemonLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result getResult();

  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
   * @return The enum numeric value on the wire for pokemonType.
   */
  int getPokemonTypeValue();
  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
   * @return The pokemonType.
   */
  POGOProtos.Enums.PokemonId getPokemonType();

  /**
   * <code>int32 amount = 3;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Data.PokemonDisplay getPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   */
  POGOProtos.Data.PokemonDisplayOrBuilder getPokemonDisplayOrBuilder();

  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  long getPokemonId();
}