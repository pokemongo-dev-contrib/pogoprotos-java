// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PokemonSearchTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonSearchTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonSearchTelemetry.PokemonSearchSourceId pokemon_search_source_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonSearchSourceId.
   */
  int getPokemonSearchSourceIdValue();
  /**
   * <code>.POGOProtos.Rpc.PokemonSearchTelemetry.PokemonSearchSourceId pokemon_search_source_id = 1;</code>
   * @return The pokemonSearchSourceId.
   */
  POGOProtos.Rpc.PokemonSearchTelemetry.PokemonSearchSourceId getPokemonSearchSourceId();

  /**
   * <code>string prepended_search_string = 2;</code>
   * @return The prependedSearchString.
   */
  java.lang.String getPrependedSearchString();
  /**
   * <code>string prepended_search_string = 2;</code>
   * @return The bytes for prependedSearchString.
   */
  com.google.protobuf.ByteString
      getPrependedSearchStringBytes();

  /**
   * <code>string search_term_string = 3;</code>
   * @return The searchTermString.
   */
  java.lang.String getSearchTermString();
  /**
   * <code>string search_term_string = 3;</code>
   * @return The bytes for searchTermString.
   */
  com.google.protobuf.ByteString
      getSearchTermStringBytes();

  /**
   * <code>string appended_search_string = 4;</code>
   * @return The appendedSearchString.
   */
  java.lang.String getAppendedSearchString();
  /**
   * <code>string appended_search_string = 4;</code>
   * @return The bytes for appendedSearchString.
   */
  com.google.protobuf.ByteString
      getAppendedSearchStringBytes();

  /**
   * <code>repeated int32 experiment_id = 5;</code>
   * @return A list containing the experimentId.
   */
  java.util.List<java.lang.Integer> getExperimentIdList();
  /**
   * <code>repeated int32 experiment_id = 5;</code>
   * @return The count of experimentId.
   */
  int getExperimentIdCount();
  /**
   * <code>repeated int32 experiment_id = 5;</code>
   * @param index The index of the element to return.
   * @return The experimentId at the given index.
   */
  int getExperimentId(int index);
}
