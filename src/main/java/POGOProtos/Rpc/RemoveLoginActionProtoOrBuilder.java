// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface RemoveLoginActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RemoveLoginActionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.IdentityProvider identity_provider = 1;</code>
   * @return The enum numeric value on the wire for identityProvider.
   */
  int getIdentityProviderValue();
  /**
   * <code>.POGOProtos.Rpc.IdentityProvider identity_provider = 1;</code>
   * @return The identityProvider.
   */
  POGOProtos.Rpc.IdentityProvider getIdentityProvider();

  /**
   * <code>string auth_provider_id = 2;</code>
   * @return The authProviderId.
   */
  java.lang.String getAuthProviderId();
  /**
   * <code>string auth_provider_id = 2;</code>
   * @return The bytes for authProviderId.
   */
  com.google.protobuf.ByteString
      getAuthProviderIdBytes();
}
