// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePlayer/GamePlayerActionRequest.proto

package POGOProtos.Networking.Requests.Game.GamePlayer;

public interface GamePlayerActionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Game.GamePlayer.GamePlayerActionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Requests.Game.GamePlayer.GamePlayerAction request_type = 1;</code>
   * @return The enum numeric value on the wire for requestType.
   */
  int getRequestTypeValue();
  /**
   * <code>.POGOProtos.Networking.Requests.Game.GamePlayer.GamePlayerAction request_type = 1;</code>
   * @return The requestType.
   */
  POGOProtos.Networking.Requests.Game.GamePlayer.GamePlayerAction getRequestType();

  /**
   * <code>bytes request_message = 2;</code>
   * @return The requestMessage.
   */
  com.google.protobuf.ByteString getRequestMessage();
}