// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UseItemReviveResponse.proto

package POGOProtos.Networking.Responses;

public interface UseItemReviveResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.UseItemReviveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.UseItemReviveResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.UseItemReviveResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.UseItemReviveResponse.Result getResult();

  /**
   * <code>int32 stamina = 2;</code>
   * @return The stamina.
   */
  int getStamina();
}