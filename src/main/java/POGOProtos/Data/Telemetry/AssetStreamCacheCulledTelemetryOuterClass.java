// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/AssetStreamCacheCulledTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class AssetStreamCacheCulledTelemetryOuterClass {
  private AssetStreamCacheCulledTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Data/Telemetry/AssetStreamC" +
      "acheCulledTelemetry.proto\022\031POGOProtos.Da" +
      "ta.Telemetry\032#POGOProtos/Enums/Telemetry" +
      "Ids.proto\"v\n\037AssetStreamCacheCulledTelem" +
      "etry\022;\n\016asset_event_id\030\001 \001(\0162#.POGOProto" +
      "s.Enums.AssetTelemetryIds\022\026\n\016space_relea" +
      "sed\030\002 \001(\rB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.TelemetryIds.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor,
        new java.lang.String[] { "AssetEventId", "SpaceReleased", });
    POGOProtos.Enums.TelemetryIds.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}