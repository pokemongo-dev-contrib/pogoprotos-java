// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RequestGeofenceUpdatesResponse.proto

package POGOProtos.Networking.Responses;

public final class RequestGeofenceUpdatesResponseOuterClass {
  private RequestGeofenceUpdatesResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Responses/Reques" +
      "tGeofenceUpdatesResponse.proto\022\037POGOProt" +
      "os.Networking.Responses\032/POGOProtos/Data" +
      "/Geofence/GeofenceMetadata.proto\"^\n\036Requ" +
      "estGeofenceUpdatesResponse\022<\n\010geofence\030\001" +
      " \003(\0132*.POGOProtos.Data.Geofence.Geofence" +
      "MetadataB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Geofence.GeofenceMetadataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor,
        new java.lang.String[] { "Geofence", });
    POGOProtos.Data.Geofence.GeofenceMetadataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}