// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UseItemRareCandyProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UseItemRareCandyProto)
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
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  int getPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemonId();

  /**
   * <code>int32 candy_count = 3;</code>
   * @return The candyCount.
   */
  int getCandyCount();
}
