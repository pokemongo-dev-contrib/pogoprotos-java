// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface IncenseAttributesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.IncenseAttributesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 incense_lifetime_seconds = 1;</code>
   * @return The incenseLifetimeSeconds.
   */
  int getIncenseLifetimeSeconds();

  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return A list containing the pokemonType.
   */
  java.util.List<POGOProtos.Rpc.HoloPokemonType> getPokemonTypeList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return The count of pokemonType.
   */
  int getPokemonTypeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @param index The index of the element to return.
   * @return The pokemonType at the given index.
   */
  POGOProtos.Rpc.HoloPokemonType getPokemonType(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return A list containing the enum numeric values on the wire for pokemonType.
   */
  java.util.List<java.lang.Integer>
  getPokemonTypeValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of pokemonType at the given index.
   */
  int getPokemonTypeValue(int index);

  /**
   * <code>float pokemon_incense_type_probability = 3;</code>
   * @return The pokemonIncenseTypeProbability.
   */
  float getPokemonIncenseTypeProbability();

  /**
   * <code>int32 standing_time_between_encounters_sec = 4;</code>
   * @return The standingTimeBetweenEncountersSec.
   */
  int getStandingTimeBetweenEncountersSec();

  /**
   * <code>int32 moving_time_between_encounter_sec = 5;</code>
   * @return The movingTimeBetweenEncounterSec.
   */
  int getMovingTimeBetweenEncounterSec();

  /**
   * <code>int32 distance_required_for_shorter_interval_meters = 6;</code>
   * @return The distanceRequiredForShorterIntervalMeters.
   */
  int getDistanceRequiredForShorterIntervalMeters();

  /**
   * <code>int32 pokemon_attracted_length_sec = 7;</code>
   * @return The pokemonAttractedLengthSec.
   */
  int getPokemonAttractedLengthSec();

  /**
   * <code>repeated .POGOProtos.Rpc.SpawnTablePokemonProto spawn_table = 8;</code>
   */
  java.util.List<POGOProtos.Rpc.SpawnTablePokemonProto> 
      getSpawnTableList();
  /**
   * <code>repeated .POGOProtos.Rpc.SpawnTablePokemonProto spawn_table = 8;</code>
   */
  POGOProtos.Rpc.SpawnTablePokemonProto getSpawnTable(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.SpawnTablePokemonProto spawn_table = 8;</code>
   */
  int getSpawnTableCount();
  /**
   * <code>repeated .POGOProtos.Rpc.SpawnTablePokemonProto spawn_table = 8;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.SpawnTablePokemonProtoOrBuilder> 
      getSpawnTableOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.SpawnTablePokemonProto spawn_table = 8;</code>
   */
  POGOProtos.Rpc.SpawnTablePokemonProtoOrBuilder getSpawnTableOrBuilder(
      int index);

  /**
   * <code>float spawn_table_probability = 9;</code>
   * @return The spawnTableProbability.
   */
  float getSpawnTableProbability();
}
