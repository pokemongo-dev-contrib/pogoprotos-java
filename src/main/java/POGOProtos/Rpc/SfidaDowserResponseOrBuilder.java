// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SfidaDowserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SfidaDowserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.SfidaDowserResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.SfidaDowserResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.SfidaDowserResponse.Result getResult();

  /**
   * <code>int32 proximity = 2;</code>
   * @return The proximity.
   */
  int getProximity();

  /**
   * <code>string spawnpoint_id = 3;</code>
   * @return The spawnpointId.
   */
  java.lang.String getSpawnpointId();
  /**
   * <code>string spawnpoint_id = 3;</code>
   * @return The bytes for spawnpointId.
   */
  com.google.protobuf.ByteString
      getSpawnpointIdBytes();
}
