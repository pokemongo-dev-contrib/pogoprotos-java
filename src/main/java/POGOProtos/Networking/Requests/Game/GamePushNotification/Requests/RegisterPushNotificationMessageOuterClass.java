// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePushNotification/Requests/RegisterPushNotificationMessage.proto

package POGOProtos.Networking.Requests.Game.GamePushNotification.Requests;

public final class RegisterPushNotificationMessageOuterClass {
  private RegisterPushNotificationMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_ApnToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_ApnToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_GcmToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_GcmToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\ngPOGOProtos/Networking/Requests/Game/Ga" +
      "mePushNotification/Requests/RegisterPush" +
      "NotificationMessage.proto\022APOGOProtos.Ne" +
      "tworking.Requests.Game.GamePushNotificat" +
      "ion.Requests\"\241\003\n\037RegisterPushNotificatio" +
      "nMessage\022~\n\tapn_token\030\001 \001(\0132k.POGOProtos" +
      ".Networking.Requests.Game.GamePushNotifi" +
      "cation.Requests.RegisterPushNotification" +
      "Message.ApnToken\022~\n\tgcm_token\030\002 \001(\0132k.PO" +
      "GOProtos.Networking.Requests.Game.GamePu" +
      "shNotification.Requests.RegisterPushNoti" +
      "ficationMessage.GcmToken\032Y\n\010ApnToken\022\027\n\017" +
      "registration_id\030\001 \001(\t\022\031\n\021bundle_identifi" +
      "er\030\002 \001(\t\022\031\n\021payload_byte_size\030\003 \001(\005\032#\n\010G" +
      "cmToken\022\027\n\017registration_id\030\001 \001(\tB\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_descriptor,
        new java.lang.String[] { "ApnToken", "GcmToken", });
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_ApnToken_descriptor =
      internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_ApnToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_ApnToken_descriptor,
        new java.lang.String[] { "RegistrationId", "BundleIdentifier", "PayloadByteSize", });
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_GcmToken_descriptor =
      internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_GcmToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePushNotification_Requests_RegisterPushNotificationMessage_GcmToken_descriptor,
        new java.lang.String[] { "RegistrationId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}