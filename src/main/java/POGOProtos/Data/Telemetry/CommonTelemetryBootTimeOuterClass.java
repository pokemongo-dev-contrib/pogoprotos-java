// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/CommonTelemetryBootTime.proto

package POGOProtos.Data.Telemetry;

public final class CommonTelemetryBootTimeOuterClass {
  private CommonTelemetryBootTimeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_CommonTelemetryBootTime_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_CommonTelemetryBootTime_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Data/Telemetry/CommonTeleme" +
      "tryBootTime.proto\022\031POGOProtos.Data.Telem" +
      "etry\"B\n\027CommonTelemetryBootTime\022\022\n\nboot_" +
      "phase\030\001 \001(\t\022\023\n\013duration_ms\030\002 \001(\003B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Telemetry_CommonTelemetryBootTime_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_CommonTelemetryBootTime_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_CommonTelemetryBootTime_descriptor,
        new java.lang.String[] { "BootPhase", "DurationMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}