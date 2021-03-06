// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ClientFortModifierProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClientFortModifierProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The enum numeric value on the wire for modifierType.
   */
  int getModifierTypeValue();
  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The modifierType.
   */
  POGOProtos.Rpc.Item getModifierType();

  /**
   * <code>int64 expiration_time_ms = 2;</code>
   * @return The expirationTimeMs.
   */
  long getExpirationTimeMs();

  /**
   * <code>string deploying_player_codename = 3;</code>
   * @return The deployingPlayerCodename.
   */
  java.lang.String getDeployingPlayerCodename();
  /**
   * <code>string deploying_player_codename = 3;</code>
   * @return The bytes for deployingPlayerCodename.
   */
  com.google.protobuf.ByteString
      getDeployingPlayerCodenameBytes();
}
