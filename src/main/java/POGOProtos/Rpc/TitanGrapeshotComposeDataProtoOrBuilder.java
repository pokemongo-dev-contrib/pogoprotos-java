// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TitanGrapeshotComposeDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TitanGrapeshotComposeDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string target_file_path = 1;</code>
   * @return The targetFilePath.
   */
  java.lang.String getTargetFilePath();
  /**
   * <code>string target_file_path = 1;</code>
   * @return The bytes for targetFilePath.
   */
  com.google.protobuf.ByteString
      getTargetFilePathBytes();

  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto authentication = 2;</code>
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto authentication = 2;</code>
   * @return The authentication.
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto getAuthentication();
  /**
   * <code>.POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProto authentication = 2;</code>
   */
  POGOProtos.Rpc.TitanGrapeshotAuthenticationDataProtoOrBuilder getAuthenticationOrBuilder();
}
