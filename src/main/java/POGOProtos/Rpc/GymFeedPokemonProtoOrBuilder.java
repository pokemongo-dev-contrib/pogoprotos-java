// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GymFeedPokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GymFeedPokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  int getItemValue();
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  POGOProtos.Rpc.Item getItem();

  /**
   * <code>int32 starting_quantity = 2;</code>
   * @return The startingQuantity.
   */
  int getStartingQuantity();

  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>fixed64 pokemon_id = 4;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>double player_lat_degrees = 5;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 6;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();
}
