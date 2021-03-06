// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetGymDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGymDetailsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gym_id = 1;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 1;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>double player_lat_degrees = 2;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 3;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();

  /**
   * <code>double gym_lat_degrees = 4;</code>
   * @return The gymLatDegrees.
   */
  double getGymLatDegrees();

  /**
   * <code>double gym_lng_degrees = 5;</code>
   * @return The gymLngDegrees.
   */
  double getGymLngDegrees();

  /**
   * <code>string client_version = 6;</code>
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   * <code>string client_version = 6;</code>
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString
      getClientVersionBytes();
}
