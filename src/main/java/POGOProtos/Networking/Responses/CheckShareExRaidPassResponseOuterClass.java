// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CheckShareExRaidPassResponse.proto

package POGOProtos.Networking.Responses;

public final class CheckShareExRaidPassResponseOuterClass {
  private CheckShareExRaidPassResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_CheckShareExRaidPassResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_CheckShareExRaidPassResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBPOGOProtos/Networking/Responses/CheckS" +
      "hareExRaidPassResponse.proto\022\037POGOProtos" +
      ".Networking.Responses\032,POGOProtos/Enums/" +
      "ShareExRaidPassResult.proto\"W\n\034CheckShar" +
      "eExRaidPassResponse\0227\n\006result\030\001 \001(\0162\'.PO" +
      "GOProtos.Enums.ShareExRaidPassResultB\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.ShareExRaidPassResultOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_CheckShareExRaidPassResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_CheckShareExRaidPassResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_CheckShareExRaidPassResponse_descriptor,
        new java.lang.String[] { "Result", });
    POGOProtos.Enums.ShareExRaidPassResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}