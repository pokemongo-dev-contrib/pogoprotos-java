// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/Requests/SavePlayerSettingsMessage.proto

package POGOProtos.Networking.Requests.Social.Requests;

public final class SavePlayerSettingsMessageOuterClass {
  private SavePlayerSettingsMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Social_Requests_SavePlayerSettingsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Social_Requests_SavePlayerSettingsMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNPOGOProtos/Networking/Requests/Social/" +
      "Requests/SavePlayerSettingsMessage.proto" +
      "\022.POGOProtos.Networking.Requests.Social." +
      "Requests\032(POGOProtos/Settings/PlayerSett" +
      "ings.proto\"R\n\031SavePlayerSettingsMessage\022" +
      "5\n\010settings\030\001 \001(\0132#.POGOProtos.Settings." +
      "PlayerSettingsB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.PlayerSettingsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Social_Requests_SavePlayerSettingsMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Social_Requests_SavePlayerSettingsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Social_Requests_SavePlayerSettingsMessage_descriptor,
        new java.lang.String[] { "Settings", });
    POGOProtos.Settings.PlayerSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}