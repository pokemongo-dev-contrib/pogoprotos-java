// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RemoteGiftPingResponse.proto

package POGOProtos.Networking.Responses;

public final class RemoteGiftPingResponseOuterClass {
  private RemoteGiftPingResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_RemoteGiftPingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_RemoteGiftPingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Networking/Responses/Remote" +
      "GiftPingResponse.proto\022\037POGOProtos.Netwo" +
      "rking.Responses\"\353\001\n\026RemoteGiftPingRespon" +
      "se\022N\n\006result\030\001 \001(\0162>.POGOProtos.Networki" +
      "ng.Responses.RemoteGiftPingResponse.Resu" +
      "lt\"\200\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\026\n" +
      "\022STILL_IN_COOL_DOWN\020\002\022\021\n\rBUDDY_NOT_SET\020\003" +
      "\022\030\n\024ERROR_INVENTORY_FULL\020\004\022\031\n\025ERROR_NO_R" +
      "EMOTE_GIFTS\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_RemoteGiftPingResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_RemoteGiftPingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_RemoteGiftPingResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}