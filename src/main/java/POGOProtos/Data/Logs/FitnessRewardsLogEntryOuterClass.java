// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/FitnessRewardsLogEntry.proto

package POGOProtos.Data.Logs;

public final class FitnessRewardsLogEntryOuterClass {
  private FitnessRewardsLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_FitnessRewardsLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_FitnessRewardsLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1POGOProtos/Data/Logs/FitnessRewardsLog" +
      "Entry.proto\022\024POGOProtos.Data.Logs\032\037POGOP" +
      "rotos/Inventory/Loot.proto\"\310\001\n\026FitnessRe" +
      "wardsLogEntry\022C\n\006result\030\001 \001(\01623.POGOProt" +
      "os.Data.Logs.FitnessRewardsLogEntry.Resu" +
      "lt\022+\n\007rewards\030\002 \001(\0132\032.POGOProtos.Invento" +
      "ry.Loot\022\032\n\022distance_walked_km\030\003 \001(\001\" \n\006R" +
      "esult\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001B\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_FitnessRewardsLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_FitnessRewardsLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_FitnessRewardsLogEntry_descriptor,
        new java.lang.String[] { "Result", "Rewards", "DistanceWalkedKm", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}