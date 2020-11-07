// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface MapSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MapSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double pokemon_visible_range = 1;</code>
   * @return The pokemonVisibleRange.
   */
  double getPokemonVisibleRange();

  /**
   * <code>double poke_nav_range_meters = 2;</code>
   * @return The pokeNavRangeMeters.
   */
  double getPokeNavRangeMeters();

  /**
   * <code>double encounter_range_meters = 3;</code>
   * @return The encounterRangeMeters.
   */
  double getEncounterRangeMeters();

  /**
   * <code>float get_map_objects_min_refresh_seconds = 4;</code>
   * @return The getMapObjectsMinRefreshSeconds.
   */
  float getGetMapObjectsMinRefreshSeconds();

  /**
   * <code>float get_map_objects_max_refresh_seconds = 5;</code>
   * @return The getMapObjectsMaxRefreshSeconds.
   */
  float getGetMapObjectsMaxRefreshSeconds();

  /**
   * <code>float get_map_objects_min_distance_meters = 6;</code>
   * @return The getMapObjectsMinDistanceMeters.
   */
  float getGetMapObjectsMinDistanceMeters();

  /**
   * <code>string google_maps_api_key = 7;</code>
   * @return The googleMapsApiKey.
   */
  java.lang.String getGoogleMapsApiKey();
  /**
   * <code>string google_maps_api_key = 7;</code>
   * @return The bytes for googleMapsApiKey.
   */
  com.google.protobuf.ByteString
      getGoogleMapsApiKeyBytes();

  /**
   * <code>int32 min_nearby_hide_sightings = 8;</code>
   * @return The minNearbyHideSightings.
   */
  int getMinNearbyHideSightings();

  /**
   * <code>bool enable_special_weather = 9;</code>
   * @return The enableSpecialWeather.
   */
  boolean getEnableSpecialWeather();

  /**
   * <code>float special_weather_probability = 10;</code>
   * @return The specialWeatherProbability.
   */
  float getSpecialWeatherProbability();

  /**
   * <code>string google_maps_client_id = 11;</code>
   * @return The googleMapsClientId.
   */
  java.lang.String getGoogleMapsClientId();
  /**
   * <code>string google_maps_client_id = 11;</code>
   * @return The bytes for googleMapsClientId.
   */
  com.google.protobuf.ByteString
      getGoogleMapsClientIdBytes();

  /**
   * <code>bool enable_encounter_v2 = 12;</code>
   * @return The enableEncounterV2.
   */
  boolean getEnableEncounterV2();
}
