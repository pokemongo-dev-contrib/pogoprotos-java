// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CreatePokemonTagProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CreatePokemonTagProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonTagColor color = 2;</code>
   * @return The enum numeric value on the wire for color.
   */
  int getColorValue();
  /**
   * <code>.POGOProtos.Rpc.PokemonTagColor color = 2;</code>
   * @return The color.
   */
  POGOProtos.Rpc.PokemonTagColor getColor();
}
