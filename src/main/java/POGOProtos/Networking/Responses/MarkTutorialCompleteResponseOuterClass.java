// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/MarkTutorialCompleteResponse.proto

package POGOProtos.Networking.Responses;

public final class MarkTutorialCompleteResponseOuterClass {
  private MarkTutorialCompleteResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_MarkTutorialCompleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_MarkTutorialCompleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBPOGOProtos/Networking/Responses/MarkTu" +
      "torialCompleteResponse.proto\022\037POGOProtos" +
      ".Networking.Responses\032 POGOProtos/Data/P" +
      "layerData.proto\"a\n\034MarkTutorialCompleteR" +
      "esponse\022\017\n\007success\030\001 \001(\010\0220\n\013player_data\030" +
      "\002 \001(\0132\033.POGOProtos.Data.PlayerDataB\002P\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PlayerDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_MarkTutorialCompleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_MarkTutorialCompleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_MarkTutorialCompleteResponse_descriptor,
        new java.lang.String[] { "Success", "PlayerData", });
    POGOProtos.Data.PlayerDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}