// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameAccountRegistry/Requests/AddLoginActionMessage.proto

package POGOProtos.Networking.Requests.Game.GameAccountRegistry.Requests;

public interface AddLoginActionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Game.GameAccountRegistry.Requests.AddLoginActionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.IdentityProvider identity_provider = 1;</code>
   * @return The enum numeric value on the wire for identityProvider.
   */
  int getIdentityProviderValue();
  /**
   * <code>.POGOProtos.Enums.IdentityProvider identity_provider = 1;</code>
   * @return The identityProvider.
   */
  POGOProtos.Enums.IdentityProvider getIdentityProvider();

  /**
   * <code>bytes inner_message = 2;</code>
   * @return The innerMessage.
   */
  com.google.protobuf.ByteString getInnerMessage();

  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The authProviderId.
   */
  java.lang.String getAuthProviderId();
  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The bytes for authProviderId.
   */
  com.google.protobuf.ByteString
      getAuthProviderIdBytes();
}