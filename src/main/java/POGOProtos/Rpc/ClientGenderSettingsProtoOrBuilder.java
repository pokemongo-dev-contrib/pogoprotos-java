// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ClientGenderSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClientGenderSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The enum numeric value on the wire for pokemon.
   */
  int getPokemonValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemon();

  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   * @return The gender.
   */
  POGOProtos.Rpc.ClientGenderProto getGender();
  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   */
  POGOProtos.Rpc.ClientGenderProtoOrBuilder getGenderOrBuilder();
}
