// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/AddLoginActionResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public final class AddLoginActionResponseOuterClass {
  private AddLoginActionResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_AddLoginActionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Platform_Responses_AddLoginActionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOPOGOProtos/Networking/Responses/Platfo" +
      "rm/Responses/AddLoginActionResponse.prot" +
      "o\0222POGOProtos.Networking.Responses.Platf" +
      "orm.Responses\032\'POGOProtos/Data/Login/Log" +
      "inDetail.proto\"\376\001\n\026AddLoginActionRespons" +
      "e\022\017\n\007success\030\001 \001(\010\0228\n\014login_detail\030\002 \003(\013" +
      "2\".POGOProtos.Data.Login.LoginDetail\022a\n\006" +
      "status\030\003 \001(\0162Q.POGOProtos.Networking.Res" +
      "ponses.Platform.Responses.AddLoginAction" +
      "Response.Status\"6\n\006Status\022\t\n\005UNSET\020\000\022\020\n\014" +
      "AUTH_FAILURE\020\001\022\017\n\013LOGIN_TAKEN\020\002B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Login.LoginDetailOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_AddLoginActionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_AddLoginActionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Platform_Responses_AddLoginActionResponse_descriptor,
        new java.lang.String[] { "Success", "LoginDetail", "Status", });
    POGOProtos.Data.Login.LoginDetailOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}