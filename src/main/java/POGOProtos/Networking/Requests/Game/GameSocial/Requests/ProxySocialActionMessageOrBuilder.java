// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameSocial/Requests/ProxySocialActionMessage.proto

package POGOProtos.Networking.Requests.Game.GameSocial.Requests;

public interface ProxySocialActionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 action = 1;</code>
   * @return The action.
   */
  int getAction();

  /**
   * <code>string host = 2;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}