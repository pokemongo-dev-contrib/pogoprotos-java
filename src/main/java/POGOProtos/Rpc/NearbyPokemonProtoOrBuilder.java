// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface NearbyPokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.NearbyPokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pokedex_number = 1;</code>
   * @return The pokedexNumber.
   */
  int getPokedexNumber();

  /**
   * <code>float distance_meters = 2;</code>
   * @return The distanceMeters.
   */
  float getDistanceMeters();

  /**
   * <code>fixed64 encounter_id = 3;</code>
   * @return The encounterId.
   */
  long getEncounterId();

  /**
   * <code>string fort_id = 4;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 4;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>string fort_image_url = 5;</code>
   * @return The fortImageUrl.
   */
  java.lang.String getFortImageUrl();
  /**
   * <code>string fort_image_url = 5;</code>
   * @return The bytes for fortImageUrl.
   */
  com.google.protobuf.ByteString
      getFortImageUrlBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();
}
