// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformPoiSubmissionPhotoUploadErrorTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformPoiSubmissionPhotoUploadErrorTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
   * @return The enum numeric value on the wire for errorId.
   */
  int getErrorIdValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
   * @return The errorId.
   */
  POGOProtos.Rpc.PlatformPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds getErrorId();

  /**
   * <code>.POGOProtos.Rpc.PoiImageType image_type = 2;</code>
   * @return The enum numeric value on the wire for imageType.
   */
  int getImageTypeValue();
  /**
   * <code>.POGOProtos.Rpc.PoiImageType image_type = 2;</code>
   * @return The imageType.
   */
  POGOProtos.Rpc.PoiImageType getImageType();

  /**
   * <code>string error_message = 3;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string error_message = 3;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
