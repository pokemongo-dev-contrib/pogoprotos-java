// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GameClientTelemetryOmniProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GameClientTelemetryOmniProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   * @return Whether the poiSubmissionTelemetry field is set.
   */
  boolean hasPoiSubmissionTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   * @return The poiSubmissionTelemetry.
   */
  POGOProtos.Rpc.PoiSubmissionTelemetry getPoiSubmissionTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   */
  POGOProtos.Rpc.PoiSubmissionTelemetryOrBuilder getPoiSubmissionTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   * @return Whether the poiSubmissionPhotoUploadErrorTelemetry field is set.
   */
  boolean hasPoiSubmissionPhotoUploadErrorTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   * @return The poiSubmissionPhotoUploadErrorTelemetry.
   */
  POGOProtos.Rpc.PoiSubmissionPhotoUploadErrorTelemetry getPoiSubmissionPhotoUploadErrorTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   */
  POGOProtos.Rpc.PoiSubmissionPhotoUploadErrorTelemetryOrBuilder getPoiSubmissionPhotoUploadErrorTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   * @return Whether the playerMetadataTelemetry field is set.
   */
  boolean hasPlayerMetadataTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   * @return The playerMetadataTelemetry.
   */
  POGOProtos.Rpc.PoiPlayerMetadataTelemetry getPlayerMetadataTelemetry();
  /**
   * <code>.POGOProtos.Rpc.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   */
  POGOProtos.Rpc.PoiPlayerMetadataTelemetryOrBuilder getPlayerMetadataTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.ServerData server_data = 1001;</code>
   * @return Whether the serverData field is set.
   */
  boolean hasServerData();
  /**
   * <code>.POGOProtos.Rpc.ServerData server_data = 1001;</code>
   * @return The serverData.
   */
  POGOProtos.Rpc.ServerData getServerData();
  /**
   * <code>.POGOProtos.Rpc.ServerData server_data = 1001;</code>
   */
  POGOProtos.Rpc.ServerDataOrBuilder getServerDataOrBuilder();

  public POGOProtos.Rpc.GameClientTelemetryOmniProto.TelemetryDataCase getTelemetryDataCase();
}