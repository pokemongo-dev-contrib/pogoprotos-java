// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/FortDeployPokemonMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface FortDeployPokemonMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.FortDeployPokemonMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fort_id = 1;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 1;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>fixed64 pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>double player_latitude = 3;</code>
   * @return The playerLatitude.
   */
  double getPlayerLatitude();

  /**
   * <code>double player_longitude = 4;</code>
   * @return The playerLongitude.
   */
  double getPlayerLongitude();
}