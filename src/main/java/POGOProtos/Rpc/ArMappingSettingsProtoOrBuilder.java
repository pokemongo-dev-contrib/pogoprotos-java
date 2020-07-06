// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface ArMappingSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ArMappingSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 min_hours_between_prompt = 1;</code>
   * @return The minHoursBetweenPrompt.
   */
  int getMinHoursBetweenPrompt();

  /**
   * <code>int32 max_video_time_seconds = 2;</code>
   * @return The maxVideoTimeSeconds.
   */
  int getMaxVideoTimeSeconds();

  /**
   * <code>int32 preview_video_bitrate_kbps = 3;</code>
   * @return The previewVideoBitrateKbps.
   */
  int getPreviewVideoBitrateKbps();

  /**
   * <code>int32 preview_video_deadline_ms = 4;</code>
   * @return The previewVideoDeadlineMs.
   */
  int getPreviewVideoDeadlineMs();

  /**
   * <code>int32 research_video_bitrate_kbps = 5;</code>
   * @return The researchVideoBitrateKbps.
   */
  int getResearchVideoBitrateKbps();

  /**
   * <code>int32 research_video_deadline_ms = 6;</code>
   * @return The researchVideoDeadlineMs.
   */
  int getResearchVideoDeadlineMs();

  /**
   * <code>int32 min_video_time_seconds = 7;</code>
   * @return The minVideoTimeSeconds.
   */
  int getMinVideoTimeSeconds();

  /**
   * <code>int32 preview_frame_rate_fps = 8;</code>
   * @return The previewFrameRateFps.
   */
  int getPreviewFrameRateFps();

  /**
   * <code>int32 preview_frames_to_jump = 9;</code>
   * @return The previewFramesToJump.
   */
  int getPreviewFramesToJump();

  /**
   * <code>int32 max_upload_chunk_rejected_count = 10;</code>
   * @return The maxUploadChunkRejectedCount.
   */
  int getMaxUploadChunkRejectedCount();

  /**
   * <code>int32 ardk_desired_accuracy_mm = 11;</code>
   * @return The ardkDesiredAccuracyMm.
   */
  int getArdkDesiredAccuracyMm();

  /**
   * <code>int32 ardk_update_distance_mm = 12;</code>
   * @return The ardkUpdateDistanceMm.
   */
  int getArdkUpdateDistanceMm();

  /**
   * <code>int32 max_pending_upload_kilobytes = 13;</code>
   * @return The maxPendingUploadKilobytes.
   */
  int getMaxPendingUploadKilobytes();

  /**
   * <code>bool enable_sponsor_poi_scan = 14;</code>
   * @return The enableSponsorPoiScan.
   */
  boolean getEnableSponsorPoiScan();

  /**
   * <code>int32 min_disk_space_needed_mb = 15;</code>
   * @return The minDiskSpaceNeededMb.
   */
  int getMinDiskSpaceNeededMb();
}