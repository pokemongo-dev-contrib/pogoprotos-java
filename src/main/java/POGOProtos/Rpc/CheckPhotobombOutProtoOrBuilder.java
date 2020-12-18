// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CheckPhotobombOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CheckPhotobombOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.CheckPhotobombOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for photobombPokemonId.
   */
  int getPhotobombPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
   * @return The photobombPokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getPhotobombPokemonId();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   * @return Whether the photobombPokemonDisplay field is set.
   */
  boolean hasPhotobombPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   * @return The photobombPokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPhotobombPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPhotobombPokemonDisplayOrBuilder();

  /**
   * <code>fixed64 encounter_id = 4;</code>
   * @return The encounterId.
   */
  long getEncounterId();

  /**
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
