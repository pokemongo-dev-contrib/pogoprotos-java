// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/MapDisplaySettings.proto

package POGOProtos.Settings.Master;

public final class MapDisplaySettingsOuterClass {
  private MapDisplaySettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_MapDisplaySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_MapDisplaySettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Settings/Master/MapDisplayS" +
      "ettings.proto\022\032POGOProtos.Settings.Maste" +
      "r\"\200\003\n\022MapDisplaySettings\022L\n\nmap_effect\030\001" +
      " \001(\01628.POGOProtos.Settings.Master.MapDis" +
      "playSettings.MapEffect\022\031\n\021research_icon_" +
      "url\030\002 \001(\t\"\200\002\n\tMapEffect\022\017\n\013EFFECT_NONE\020\000" +
      "\022\031\n\025EFFECT_CONFETTI_BASIC\020\001\022\030\n\024EFFECT_CO" +
      "NFETTI_FIRE\020\002\022\031\n\025EFFECT_CONFETTI_WATER\020\003" +
      "\022\031\n\025EFFECT_CONFETTI_GRASS\020\004\022\037\n\033EFFECT_CO" +
      "NFETTI_RAID_BATTLE\020\005\022\036\n\032EFFECT_CONFETTI_" +
      "FRIENDSHIP\020\006\022\032\n\026EFFECT_CONFETTI_ROCKET\020\007" +
      "\022\032\n\026EFFECT_FIREWORKS_PLAIN\020\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_MapDisplaySettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_MapDisplaySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_MapDisplaySettings_descriptor,
        new java.lang.String[] { "MapEffect", "ResearchIconUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}