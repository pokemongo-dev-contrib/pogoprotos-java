// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameAnticheat/Requests/AcknowledgeWarningsMessage.proto

package POGOProtos.Networking.Requests.Game.GameAnticheat.Requests;

public final class AcknowledgeWarningsMessageOuterClass {
  private AcknowledgeWarningsMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GameAnticheat_Requests_AcknowledgeWarningsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GameAnticheat_Requests_AcknowledgeWarningsMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n[POGOProtos/Networking/Requests/Game/Ga" +
      "meAnticheat/Requests/AcknowledgeWarnings" +
      "Message.proto\022:POGOProtos.Networking.Req" +
      "uests.Game.GameAnticheat.Requests\032*POGOP" +
      "rotos/Enums/PlatformWarningType.proto\"T\n" +
      "\032AcknowledgeWarningsMessage\0226\n\007warning\030\001" +
      " \003(\0162%.POGOProtos.Enums.PlatformWarningT" +
      "ypeB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.PlatformWarningTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Game_GameAnticheat_Requests_AcknowledgeWarningsMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GameAnticheat_Requests_AcknowledgeWarningsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GameAnticheat_Requests_AcknowledgeWarningsMessage_descriptor,
        new java.lang.String[] { "Warning", });
    POGOProtos.Enums.PlatformWarningTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}