// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RequestGeofenceUpdatesResponse.proto

package POGOProtos.Networking.Responses;

public interface RequestGeofenceUpdatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata> 
      getGeofenceList();
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  POGOProtos.Data.Geofence.GeofenceMetadata getGeofence(int index);
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  int getGeofenceCount();
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  java.util.List<? extends POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder> 
      getGeofenceOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder getGeofenceOrBuilder(
      int index);
}