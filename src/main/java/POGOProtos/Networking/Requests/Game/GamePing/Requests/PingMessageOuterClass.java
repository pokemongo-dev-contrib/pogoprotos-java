// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePing/Requests/PingMessage.proto

package POGOProtos.Networking.Requests.Game.GamePing.Requests;

public final class PingMessageOuterClass {
  private PingMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_Requests_PingMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePing_Requests_PingMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGPOGOProtos/Networking/Requests/Game/Ga" +
      "mePing/Requests/PingMessage.proto\0225POGOP" +
      "rotos.Networking.Requests.Game.GamePing." +
      "Requests\"\212\001\n\013PingMessage\022\033\n\023response_siz" +
      "e_bytes\030\001 \001(\005\022\034\n\024random_request_bytes\030\002 " +
      "\001(\t\022*\n\"use_cache_for_random_request_byte" +
      "s\030\003 \001(\010\022\024\n\014return_value\030\004 \001(\tB\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_Requests_PingMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_Requests_PingMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePing_Requests_PingMessage_descriptor,
        new java.lang.String[] { "ResponseSizeBytes", "RandomRequestBytes", "UseCacheForRandomRequestBytes", "ReturnValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}