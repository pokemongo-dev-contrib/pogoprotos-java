// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformDownloadSettingsResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformDownloadSettingsResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string error = 1;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 1;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>string sha1 = 2;</code>
   * @return The sha1.
   */
  java.lang.String getSha1();
  /**
   * <code>string sha1 = 2;</code>
   * @return The bytes for sha1.
   */
  com.google.protobuf.ByteString
      getSha1Bytes();

  /**
   * <code>.POGOProtos.Rpc.GlobalSettingsProto values = 3;</code>
   * @return Whether the values field is set.
   */
  boolean hasValues();
  /**
   * <code>.POGOProtos.Rpc.GlobalSettingsProto values = 3;</code>
   * @return The values.
   */
  POGOProtos.Rpc.GlobalSettingsProto getValues();
  /**
   * <code>.POGOProtos.Rpc.GlobalSettingsProto values = 3;</code>
   */
  POGOProtos.Rpc.GlobalSettingsProtoOrBuilder getValuesOrBuilder();
}
