// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyEmotionLevelSettings.proto

package POGOProtos.Settings.Master;

public final class BuddyEmotionLevelSettingsOuterClass {
  private BuddyEmotionLevelSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:POGOProtos/Settings/Master/BuddyEmotio" +
      "nLevelSettings.proto\022\032POGOProtos.Setting" +
      "s.Master\032(POGOProtos/Enums/BuddyEmotionL" +
      "evel.proto\032%POGOProtos/Enums/BuddyAnimat" +
      "ion.proto\"\337\001\n\031BuddyEmotionLevelSettings\022" +
      ":\n\remotion_level\030\001 \001(\0162#.POGOProtos.Enum" +
      "s.BuddyEmotionLevel\022#\n\033min_emotion_point" +
      "s_required\030\002 \001(\005\022;\n\021emotion_animation\030\003 " +
      "\001(\0162 .POGOProtos.Enums.BuddyAnimation\022$\n" +
      "\034decay_prevention_duration_ms\030\004 \001(\003B\002P\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.BuddyEmotionLevelOuterClass.getDescriptor(),
          POGOProtos.Enums.BuddyAnimationOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor,
        new java.lang.String[] { "EmotionLevel", "MinEmotionPointsRequired", "EmotionAnimation", "DecayPreventionDurationMs", });
    POGOProtos.Enums.BuddyEmotionLevelOuterClass.getDescriptor();
    POGOProtos.Enums.BuddyAnimationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}