// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FortDeployPokemonResponse.proto

package POGOProtos.Networking.Responses;

public interface FortDeployPokemonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.FortDeployPokemonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.FortDeployPokemonResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.FortDeployPokemonResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.FortDeployPokemonResponse.Result getResult();

  /**
   * <code>.POGOProtos.Networking.Responses.FortDetailsResponse fort_details = 2;</code>
   * @return Whether the fortDetails field is set.
   */
  boolean hasFortDetails();
  /**
   * <code>.POGOProtos.Networking.Responses.FortDetailsResponse fort_details = 2;</code>
   * @return The fortDetails.
   */
  POGOProtos.Networking.Responses.FortDetailsResponse getFortDetails();
  /**
   * <code>.POGOProtos.Networking.Responses.FortDetailsResponse fort_details = 2;</code>
   */
  POGOProtos.Networking.Responses.FortDetailsResponseOrBuilder getFortDetailsOrBuilder();

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 3;</code>
   * @return Whether the pokemonData field is set.
   */
  boolean hasPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 3;</code>
   * @return The pokemonData.
   */
  POGOProtos.Data.PokemonData getPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 3;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder();

  /**
   * <code>.POGOProtos.Data.Gym.GymState gym_state = 4;</code>
   * @return Whether the gymState field is set.
   */
  boolean hasGymState();
  /**
   * <code>.POGOProtos.Data.Gym.GymState gym_state = 4;</code>
   * @return The gymState.
   */
  POGOProtos.Data.Gym.GymState getGymState();
  /**
   * <code>.POGOProtos.Data.Gym.GymState gym_state = 4;</code>
   */
  POGOProtos.Data.Gym.GymStateOrBuilder getGymStateOrBuilder();
}