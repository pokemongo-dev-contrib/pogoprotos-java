// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetInboxResponse.proto

package POGOProtos.Networking.Responses;

public final class GetInboxResponseOuterClass {
  private GetInboxResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetInboxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetInboxResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6POGOProtos/Networking/Responses/GetInb" +
      "oxResponse.proto\022\037POGOProtos.Networking." +
      "Responses\032\'POGOProtos/Data/Inbox/ClientI" +
      "nbox.proto\"\315\001\n\020GetInboxResponse\022H\n\006resul" +
      "t\030\001 \001(\01628.POGOProtos.Networking.Response" +
      "s.GetInboxResponse.Result\0221\n\005inbox\030\002 \001(\013" +
      "2\".POGOProtos.Data.Inbox.ClientInbox\"<\n\006" +
      "Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\013\n\007FAILUR" +
      "E\020\002\022\r\n\tTIMED_OUT\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Inbox.ClientInboxOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetInboxResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetInboxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetInboxResponse_descriptor,
        new java.lang.String[] { "Result", "Inbox", });
    POGOProtos.Data.Inbox.ClientInboxOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}