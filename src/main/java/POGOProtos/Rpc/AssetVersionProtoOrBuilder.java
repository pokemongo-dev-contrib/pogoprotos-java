// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface AssetVersionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AssetVersionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 app_version = 1;</code>
   * @return The appVersion.
   */
  int getAppVersion();

  /**
   * <code>repeated .POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto request = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto> 
      getRequestList();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto request = 2;</code>
   */
  POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto getRequest(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto request = 2;</code>
   */
  int getRequestCount();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto request = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProtoOrBuilder> 
      getRequestOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProto request = 2;</code>
   */
  POGOProtos.Rpc.AssetVersionProto.AssetVersionRequestProtoOrBuilder getRequestOrBuilder(
      int index);
}
