// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePoi/Requests/SubmitSponsorPoiLocationUpdateMessage.proto

package POGOProtos.Networking.Requests.Game.GamePoi.Requests;

public final class SubmitSponsorPoiLocationUpdateMessageOuterClass {
  private SubmitSponsorPoiLocationUpdateMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitSponsorPoiLocationUpdateMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitSponsorPoiLocationUpdateMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n`POGOProtos/Networking/Requests/Game/Ga" +
      "mePoi/Requests/SubmitSponsorPoiLocationU" +
      "pdateMessage.proto\0224POGOProtos.Networkin" +
      "g.Requests.Game.GamePoi.Requests\032+POGOPr" +
      "otos/Data/Route/RouteCheckpoint.proto\"|\n" +
      "%SubmitSponsorPoiLocationUpdateMessage\022\016" +
      "\n\006poi_id\030\001 \001(\t\022C\n\010location\030\002 \001(\01321.POGOP" +
      "rotos.Data.Route.RouteCheckpoint.Locatio" +
      "nE6B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Route.RouteCheckpointOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitSponsorPoiLocationUpdateMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitSponsorPoiLocationUpdateMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitSponsorPoiLocationUpdateMessage_descriptor,
        new java.lang.String[] { "PoiId", "Location", });
    POGOProtos.Data.Route.RouteCheckpointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}