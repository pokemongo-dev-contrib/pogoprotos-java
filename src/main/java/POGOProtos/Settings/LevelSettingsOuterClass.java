// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/LevelSettings.proto

package POGOProtos.Settings;

public final class LevelSettingsOuterClass {
  private LevelSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_LevelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_LevelSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'POGOProtos/Settings/LevelSettings.prot" +
      "o\022\023POGOProtos.Settings\"Q\n\rLevelSettings\022" +
      "\033\n\023trainer_cp_modifier\030\002 \001(\001\022#\n\033trainer_" +
      "difficulty_modifier\030\003 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_LevelSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_LevelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_LevelSettings_descriptor,
        new java.lang.String[] { "TrainerCpModifier", "TrainerDifficultyModifier", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}