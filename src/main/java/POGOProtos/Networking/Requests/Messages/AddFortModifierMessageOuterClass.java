// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/AddFortModifierMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class AddFortModifierMessageOuterClass {
  private AddFortModifierMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_AddFortModifierMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_AddFortModifierMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Requests/Message" +
      "s/AddFortModifierMessage.proto\022\'POGOProt" +
      "os.Networking.Requests.Messages\032&POGOPro" +
      "tos/Inventory/Item/ItemId.proto\"\226\001\n\026AddF" +
      "ortModifierMessage\0228\n\rmodifier_type\030\001 \001(" +
      "\0162!.POGOProtos.Inventory.Item.ItemId\022\017\n\007" +
      "fort_id\030\002 \001(\t\022\027\n\017player_latitude\030\003 \001(\001\022\030" +
      "\n\020player_longitude\030\004 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_AddFortModifierMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_AddFortModifierMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_AddFortModifierMessage_descriptor,
        new java.lang.String[] { "ModifierType", "FortId", "PlayerLatitude", "PlayerLongitude", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}