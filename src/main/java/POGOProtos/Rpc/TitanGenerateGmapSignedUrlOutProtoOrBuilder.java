// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TitanGenerateGmapSignedUrlOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TitanGenerateGmapSignedUrlOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.TitanGenerateGmapSignedUrlOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.TitanGenerateGmapSignedUrlOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.TitanGenerateGmapSignedUrlOutProto.Result getResult();

  /**
   * <code>string signed_url = 2;</code>
   * @return The signedUrl.
   */
  java.lang.String getSignedUrl();
  /**
   * <code>string signed_url = 2;</code>
   * @return The bytes for signedUrl.
   */
  com.google.protobuf.ByteString
      getSignedUrlBytes();
}
