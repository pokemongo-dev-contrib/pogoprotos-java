// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetRocketBalloonResponse.proto

package POGOProtos.Networking.Responses;

public final class GetRocketBalloonResponseOuterClass {
  private GetRocketBalloonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetRocketBalloonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetRocketBalloonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>POGOProtos/Networking/Responses/GetRoc" +
      "ketBalloonResponse.proto\022\037POGOProtos.Net" +
      "working.Responses\0321POGOProtos/Data/Rocke" +
      "t/RocketBalloonDisplay.proto\"\307\002\n\030GetRock" +
      "etBalloonResponse\022P\n\006status\030\001 \001(\0162@.POGO" +
      "Protos.Networking.Responses.GetRocketBal" +
      "loonResponse.Status\022=\n\007display\030\002 \001(\0132,.P" +
      "OGOProtos.Data.Rocket.RocketBalloonDispl" +
      "ay\"\231\001\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\020\n" +
      "\014IN_COOL_DOWN\020\002\022\030\n\024NO_BALLOON_AVAILABLE\020" +
      "\003\022\014\n\010DISABLED\020\004\022\031\n\025EQUIPPED_ITEM_INVALID" +
      "\020\005\022\"\n\036SUCCESS_BALLOON_ALREADY_EXISTS\020\006B\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetRocketBalloonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetRocketBalloonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetRocketBalloonResponse_descriptor,
        new java.lang.String[] { "Status", "Display", });
    POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
