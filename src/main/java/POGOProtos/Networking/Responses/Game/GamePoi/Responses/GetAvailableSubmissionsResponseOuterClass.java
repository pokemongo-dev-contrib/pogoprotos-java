// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/GetAvailableSubmissionsResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public final class GetAvailableSubmissionsResponseOuterClass {
  private GetAvailableSubmissionsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetAvailableSubmissionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetAvailableSubmissionsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\\POGOProtos/Networking/Responses/Game/G" +
      "amePoi/Responses/GetAvailableSubmissions" +
      "Response.proto\0226POGOProtos.Networking.Re" +
      "sponses.Game.GamePoi.Responses\032APOGOProt" +
      "os/Data/Titan/AvailableSubmissionsPerSub" +
      "missionType.proto\"\367\002\n\037GetAvailableSubmis" +
      "sionsResponse\022\030\n\020submissions_left\030\001 \001(\005\022" +
      "\030\n\020min_player_level\030\002 \001(\005\022\027\n\017has_valid_e" +
      "mail\030\003 \001(\010\022\032\n\022is_feature_enabled\030\004 \001(\010\022," +
      "\n$time_window_for_submissions_limit_ms\030\005" +
      " \001(\003\022\"\n\032max_poi_distance_in_meters\030\006 \001(\005" +
      "\022\026\n\016blacklisted_os\030\007 \003(\t\022b\n\034availability" +
      "_result_per_type\030\010 \003(\0132<.POGOProtos.Data" +
      ".Titan.AvailableSubmissionsPerSubmission" +
      "Type\022\035\n\025blacklisted_device_id\030\t \003(\tB\002P\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Titan.AvailableSubmissionsPerSubmissionTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetAvailableSubmissionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetAvailableSubmissionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetAvailableSubmissionsResponse_descriptor,
        new java.lang.String[] { "SubmissionsLeft", "MinPlayerLevel", "HasValidEmail", "IsFeatureEnabled", "TimeWindowForSubmissionsLimitMs", "MaxPoiDistanceInMeters", "BlacklistedOs", "AvailabilityResultPerType", "BlacklistedDeviceId", });
    POGOProtos.Data.Titan.AvailableSubmissionsPerSubmissionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
