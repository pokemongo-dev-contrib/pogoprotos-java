// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/SubmitPoiLocationUpdateResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public final class SubmitPoiLocationUpdateResponseOuterClass {
  private SubmitPoiLocationUpdateResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiLocationUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiLocationUpdateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\\POGOProtos/Networking/Responses/Game/G" +
      "amePoi/Responses/SubmitPoiLocationUpdate" +
      "Response.proto\0226POGOProtos.Networking.Re" +
      "sponses.Game.GamePoi.Responses\"\247\002\n\037Submi" +
      "tPoiLocationUpdateResponse\022n\n\006status\030\001 \001" +
      "(\0162^.POGOProtos.Networking.Responses.Gam" +
      "e.GamePoi.Responses.SubmitPoiLocationUpd" +
      "ateResponse.Status\"\223\001\n\006Status\022\026\n\022STATUS_" +
      "UNSPECIFIED\020\000\022\013\n\007SUCCESS\020\001\022\022\n\016INTERNAL_E" +
      "RROR\020\002\022\037\n\033TOO_MANY_RECENT_SUBMISSIONS\020\003\022" +
      "\t\n\005MINOR\020\004\022\021\n\rNOT_AVAILABLE\020\005\022\021\n\rINVALID" +
      "_INPUT\020\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiLocationUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiLocationUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiLocationUpdateResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}