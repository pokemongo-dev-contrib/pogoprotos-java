// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/EquippedBadge.proto

package POGOProtos.Data.Player;

public final class EquippedBadgeOuterClass {
  private EquippedBadgeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Player_EquippedBadge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Player_EquippedBadge_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*POGOProtos/Data/Player/EquippedBadge.p" +
      "roto\022\026POGOProtos.Data.Player\032 POGOProtos" +
      "/Enums/BadgeType.proto\"\177\n\rEquippedBadge\022" +
      "/\n\nbadge_type\030\001 \001(\0162\033.POGOProtos.Enums.B" +
      "adgeType\022\r\n\005level\030\002 \001(\005\022.\n&next_equip_ch" +
      "ange_allowed_timestamp_ms\030\003 \001(\003B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Player_EquippedBadge_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Player_EquippedBadge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Player_EquippedBadge_descriptor,
        new java.lang.String[] { "BadgeType", "Level", "NextEquipChangeAllowedTimestampMs", });
    POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}