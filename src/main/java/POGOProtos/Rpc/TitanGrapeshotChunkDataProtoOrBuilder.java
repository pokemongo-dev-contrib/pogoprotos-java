// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TitanGrapeshotChunkDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TitanGrapeshotChunkDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chunk_file_path = 1;</code>
   * @return The chunkFilePath.
   */
  java.lang.String getChunkFilePath();
  /**
   * <code>string chunk_file_path = 1;</code>
   * @return The bytes for chunkFilePath.
   */
  com.google.protobuf.ByteString
      getChunkFilePathBytes();

  /**
   * <code>uint32 chunk_number = 2;</code>
   * @return The chunkNumber.
   */
  int getChunkNumber();

  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto upload_authentication = 3;</code>
   * @return Whether the uploadAuthentication field is set.
   */
  boolean hasUploadAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto upload_authentication = 3;</code>
   * @return The uploadAuthentication.
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto getUploadAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto upload_authentication = 3;</code>
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProtoOrBuilder getUploadAuthenticationOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto delete_authentication = 4;</code>
   * @return Whether the deleteAuthentication field is set.
   */
  boolean hasDeleteAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto delete_authentication = 4;</code>
   * @return The deleteAuthentication.
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto getDeleteAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto delete_authentication = 4;</code>
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProtoOrBuilder getDeleteAuthenticationOrBuilder();
}
