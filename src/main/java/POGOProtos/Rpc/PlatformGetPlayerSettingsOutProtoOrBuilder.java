// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformGetPlayerSettingsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformGetPlayerSettingsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformGetPlayerSettingsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetPlayerSettingsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.PlatformGetPlayerSettingsOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSettingsProto settings = 2;</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSettingsProto settings = 2;</code>
   * @return The settings.
   */
  POGOProtos.Rpc.PlatformPlayerSettingsProto getSettings();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSettingsProto settings = 2;</code>
   */
  POGOProtos.Rpc.PlatformPlayerSettingsProtoOrBuilder getSettingsOrBuilder();
}
