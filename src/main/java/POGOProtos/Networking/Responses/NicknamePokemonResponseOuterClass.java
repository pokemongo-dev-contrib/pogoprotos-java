// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/NicknamePokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class NicknamePokemonResponseOuterClass {
  private NicknamePokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Networking/Responses/Nickna" +
      "mePokemonResponse.proto\022\037POGOProtos.Netw" +
      "orking.Responses\"\236\002\n\027NicknamePokemonResp" +
      "onse\022O\n\006result\030\001 \001(\0162?.POGOProtos.Networ" +
      "king.Responses.NicknamePokemonResponse.R" +
      "esult\"\261\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001" +
      "\022\032\n\026ERROR_INVALID_NICKNAME\020\002\022\033\n\027ERROR_PO" +
      "KEMON_NOT_FOUND\020\003\022\030\n\024ERROR_POKEMON_IS_EG" +
      "G\020\004\022\033\n\027ERROR_FILTERED_NICKNAME\020\005\022\037\n\033ERRO" +
      "R_EXCEEDED_CHANGE_LIMIT\020\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}