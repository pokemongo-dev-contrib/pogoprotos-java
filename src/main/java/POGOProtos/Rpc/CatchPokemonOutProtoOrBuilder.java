// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CatchPokemonOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CatchPokemonOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CatchPokemonOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.CatchPokemonOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.CatchPokemonOutProto.Status getStatus();

  /**
   * <code>double miss_percent = 2;</code>
   * @return The missPercent.
   */
  double getMissPercent();

  /**
   * <code>fixed64 captured_pokemon_id = 3;</code>
   * @return The capturedPokemonId.
   */
  long getCapturedPokemonId();

  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 4;</code>
   * @return Whether the scores field is set.
   */
  boolean hasScores();
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 4;</code>
   * @return The scores.
   */
  POGOProtos.Rpc.CaptureScoreProto getScores();
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 4;</code>
   */
  POGOProtos.Rpc.CaptureScoreProtoOrBuilder getScoresOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CatchPokemonOutProto.CaptureReason capture_reason = 5;</code>
   * @return The enum numeric value on the wire for captureReason.
   */
  int getCaptureReasonValue();
  /**
   * <code>.POGOProtos.Rpc.CatchPokemonOutProto.CaptureReason capture_reason = 5;</code>
   * @return The captureReason.
   */
  POGOProtos.Rpc.CatchPokemonOutProto.CaptureReason getCaptureReason();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId display_pokedex_id = 6;</code>
   * @return The enum numeric value on the wire for displayPokedexId.
   */
  int getDisplayPokedexIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId display_pokedex_id = 6;</code>
   * @return The displayPokedexId.
   */
  POGOProtos.Rpc.HoloPokemonId getDisplayPokedexId();

  /**
   * <code>int32 throws_remaining = 7;</code>
   * @return The throwsRemaining.
   */
  int getThrowsRemaining();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();
}
