// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/FortSearchMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class FortSearchMessageOuterClass {
  private FortSearchMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_FortSearchMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_FortSearchMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Requests/Message" +
      "s/FortSearchMessage.proto\022\'POGOProtos.Ne" +
      "tworking.Requests.Messages\"\220\001\n\021FortSearc" +
      "hMessage\022\017\n\007fort_id\030\001 \001(\t\022\032\n\022player_lat_" +
      "degrees\030\002 \001(\001\022\032\n\022player_lng_degrees\030\003 \001(" +
      "\001\022\030\n\020fort_lat_degrees\030\004 \001(\001\022\030\n\020fort_lng_" +
      "degrees\030\005 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_FortSearchMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_FortSearchMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_FortSearchMessage_descriptor,
        new java.lang.String[] { "FortId", "PlayerLatDegrees", "PlayerLngDegrees", "FortLatDegrees", "FortLngDegrees", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}