// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/RegisterBackgroundDeviceMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class RegisterBackgroundDeviceMessageOuterClass {
  private RegisterBackgroundDeviceMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_RegisterBackgroundDeviceMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_RegisterBackgroundDeviceMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMPOGOProtos/Networking/Requests/Message" +
      "s/RegisterBackgroundDeviceMessage.proto\022" +
      "\'POGOProtos.Networking.Requests.Messages" +
      "\"I\n\037RegisterBackgroundDeviceMessage\022\023\n\013d" +
      "evice_type\030\001 \001(\t\022\021\n\tdevice_id\030\002 \001(\tB\002P\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_RegisterBackgroundDeviceMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_RegisterBackgroundDeviceMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_RegisterBackgroundDeviceMessage_descriptor,
        new java.lang.String[] { "DeviceType", "DeviceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}