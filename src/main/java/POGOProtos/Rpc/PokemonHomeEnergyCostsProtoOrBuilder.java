// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PokemonHomeEnergyCostsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonHomeEnergyCostsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonClass pokemon_class = 1;</code>
   * @return The enum numeric value on the wire for pokemonClass.
   */
  int getPokemonClassValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonClass pokemon_class = 1;</code>
   * @return The pokemonClass.
   */
  POGOProtos.Rpc.HoloPokemonClass getPokemonClass();

  /**
   * <code>int32 base = 2;</code>
   * @return The base.
   */
  int getBase();

  /**
   * <code>int32 shiny = 3;</code>
   * @return The shiny.
   */
  int getShiny();

  /**
   * <code>int32 cp0_to1000 = 4;</code>
   * @return The cp0To1000.
   */
  int getCp0To1000();

  /**
   * <code>int32 cp1001_to2000 = 5;</code>
   * @return The cp1001To2000.
   */
  int getCp1001To2000();

  /**
   * <code>int32 cp2001_to_inf = 6;</code>
   * @return The cp2001ToInf.
   */
  int getCp2001ToInf();
}
