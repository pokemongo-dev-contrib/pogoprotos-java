// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetGrapeshotUploadUrlOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status getStatus();

  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  int getFileContextToGrapeshotDataCount();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  boolean containsFileContextToGrapeshotData(
      java.lang.String key);
  /**
   * Use {@link #getFileContextToGrapeshotDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
  getFileContextToGrapeshotData();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
  getFileContextToGrapeshotDataMap();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrDefault(
      java.lang.String key,
      POGOProtos.Rpc.GrapeshotUploadingDataProto defaultValue);
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrThrow(
      java.lang.String key);
}
