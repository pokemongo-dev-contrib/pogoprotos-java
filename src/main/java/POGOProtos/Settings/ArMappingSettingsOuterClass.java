// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/ArMappingSettings.proto

package POGOProtos.Settings;

public final class ArMappingSettingsOuterClass {
  private ArMappingSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_ArMappingSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_ArMappingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+POGOProtos/Settings/ArMappingSettings." +
      "proto\022\023POGOProtos.Settings\"\370\003\n\021ArMapping" +
      "Settings\022 \n\030min_hours_between_prompt\030\001 \001" +
      "(\005\022\036\n\026max_video_time_seconds\030\002 \001(\005\022\"\n\032pr" +
      "eview_video_bitrate_kbps\030\003 \001(\005\022!\n\031previe" +
      "w_video_deadline_ms\030\004 \001(\005\022#\n\033research_vi" +
      "deo_bitrate_kbps\030\005 \001(\005\022\"\n\032research_video" +
      "_deadline_ms\030\006 \001(\005\022\036\n\026min_video_time_sec" +
      "onds\030\007 \001(\005\022\036\n\026preview_frame_rate_fps\030\010 \001" +
      "(\005\022\036\n\026preview_frames_to_jump\030\t \001(\005\022\'\n\037ma" +
      "x_upload_chunk_rejected_count\030\n \001(\005\022 \n\030a" +
      "rdk_desired_accuracy_mm\030\013 \001(\005\022\037\n\027ardk_up" +
      "date_distance_mm\030\014 \001(\005\022$\n\034max_pending_up" +
      "load_kilobytes\030\r \001(\005\022\037\n\027enable_sponsor_p" +
      "oi_scan\030\016 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_ArMappingSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_ArMappingSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_ArMappingSettings_descriptor,
        new java.lang.String[] { "MinHoursBetweenPrompt", "MaxVideoTimeSeconds", "PreviewVideoBitrateKbps", "PreviewVideoDeadlineMs", "ResearchVideoBitrateKbps", "ResearchVideoDeadlineMs", "MinVideoTimeSeconds", "PreviewFrameRateFps", "PreviewFramesToJump", "MaxUploadChunkRejectedCount", "ArdkDesiredAccuracyMm", "ArdkUpdateDistanceMm", "MaxPendingUploadKilobytes", "EnableSponsorPoiScan", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}