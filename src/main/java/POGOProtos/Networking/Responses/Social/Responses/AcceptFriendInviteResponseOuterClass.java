// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/AcceptFriendInviteResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public final class AcceptFriendInviteResponseOuterClass {
  private AcceptFriendInviteResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_AcceptFriendInviteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_AcceptFriendInviteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQPOGOProtos/Networking/Responses/Social" +
      "/Responses/AcceptFriendInviteResponse.pr" +
      "oto\0220POGOProtos.Networking.Responses.Soc" +
      "ial.Responses\032*POGOProtos/Data/Player/Pl" +
      "ayerSummary.proto\"\247\003\n\032AcceptFriendInvite" +
      "Response\022c\n\006result\030\001 \001(\0162S.POGOProtos.Ne" +
      "tworking.Responses.Social.Responses.Acce" +
      "ptFriendInviteResponse.Result\0225\n\006friend\030" +
      "\002 \001(\0132%.POGOProtos.Data.Player.PlayerSum" +
      "mary\"\354\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022" +
      "\021\n\rERROR_UNKNOWN\020\002\022\037\n\033ERROR_INVITE_DOES_" +
      "NOT_EXIST\020\003\022+\n\'ERROR_MAX_FRIENDS_LIMIT_R" +
      "EACHED_DELETED\020\004\022#\n\037ERROR_INVITE_HAS_BEE" +
      "N_CANCELLED\020\005\022 \n\034ERROR_SENDER_HAS_MAX_FR" +
      "IENDS\020\006\022\"\n\036ERROR_RECEIVER_HAS_MAX_FRIEND" +
      "S\020\007B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Player.PlayerSummaryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_AcceptFriendInviteResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_AcceptFriendInviteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_AcceptFriendInviteResponse_descriptor,
        new java.lang.String[] { "Result", "Friend", });
    POGOProtos.Data.Player.PlayerSummaryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}