// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/Requests/UpdateNotificationMessage.proto

package POGOProtos.Networking.Requests.Social.Requests;

public final class UpdateNotificationMessageOuterClass {
  private UpdateNotificationMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNPOGOProtos/Networking/Requests/Social/" +
      "Requests/UpdateNotificationMessage.proto" +
      "\022.POGOProtos.Networking.Requests.Social." +
      "Requests\032(POGOProtos/Enums/NotificationS" +
      "tate.proto\"\206\001\n\031UpdateNotificationMessage" +
      "\022\030\n\020notification_ids\030\001 \003(\t\022\033\n\023create_tim" +
      "estamp_ms\030\002 \003(\003\0222\n\005state\030\003 \001(\0162#.POGOPro" +
      "tos.Enums.NotificationStateB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.NotificationStateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor,
        new java.lang.String[] { "NotificationIds", "CreateTimestampMs", "State", });
    POGOProtos.Enums.NotificationStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}