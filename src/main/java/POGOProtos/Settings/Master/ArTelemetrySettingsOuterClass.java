// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/ArTelemetrySettings.proto

package POGOProtos.Settings.Master;

public final class ArTelemetrySettingsOuterClass {
  private ArTelemetrySettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4POGOProtos/Settings/Master/ArTelemetry" +
      "Settings.proto\022\032POGOProtos.Settings.Mast" +
      "er\"\332\001\n\023ArTelemetrySettings\022\027\n\017measure_ba" +
      "ttery\030\001 \001(\010\022$\n\034battery_sampling_interval" +
      "_ms\030\002 \001(\005\022\031\n\021measure_processor\030\003 \001(\010\022&\n\036" +
      "processor_sampling_interval_ms\030\004 \001(\005\022\031\n\021" +
      "measure_framerate\030\005 \001(\010\022&\n\036framerate_sam" +
      "pling_interval_ms\030\006 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor,
        new java.lang.String[] { "MeasureBattery", "BatterySamplingIntervalMs", "MeasureProcessor", "ProcessorSamplingIntervalMs", "MeasureFramerate", "FramerateSamplingIntervalMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}