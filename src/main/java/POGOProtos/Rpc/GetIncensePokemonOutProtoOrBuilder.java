// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetIncensePokemonOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetIncensePokemonOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetIncensePokemonOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetIncensePokemonOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetIncensePokemonOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonTypeId.
   */
  int getPokemonTypeIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type_id = 2;</code>
   * @return The pokemonTypeId.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemonTypeId();

  /**
   * <code>double lat = 3;</code>
   * @return The lat.
   */
  double getLat();

  /**
   * <code>double lng = 4;</code>
   * @return The lng.
   */
  double getLng();

  /**
   * <code>string encounter_location = 5;</code>
   * @return The encounterLocation.
   */
  java.lang.String getEncounterLocation();
  /**
   * <code>string encounter_location = 5;</code>
   * @return The bytes for encounterLocation.
   */
  com.google.protobuf.ByteString
      getEncounterLocationBytes();

  /**
   * <code>fixed64 encounter_id = 6;</code>
   * @return The encounterId.
   */
  long getEncounterId();

  /**
   * <code>int64 disappear_time_ms = 7;</code>
   * @return The disappearTimeMs.
   */
  long getDisappearTimeMs();

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
