// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/AcknowledgePunishmentResponse.proto

package POGOProtos.Networking.Responses;

public final class AcknowledgePunishmentResponseOuterClass {
  private AcknowledgePunishmentResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_AcknowledgePunishmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_AcknowledgePunishmentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCPOGOProtos/Networking/Responses/Acknow" +
      "ledgePunishmentResponse.proto\022\037POGOProto" +
      "s.Networking.Responses\"\253\001\n\035AcknowledgePu" +
      "nishmentResponse\022U\n\006result\030\001 \001(\0162E.POGOP" +
      "rotos.Networking.Responses.AcknowledgePu" +
      "nishmentResponse.Result\"3\n\006Result\022\t\n\005UNS" +
      "ET\020\000\022\013\n\007SUCCESS\020\001\022\021\n\rERROR_UNKNOWN\020\002B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_AcknowledgePunishmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_AcknowledgePunishmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_AcknowledgePunishmentResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}