// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/ListFriendStatusResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public final class ListFriendStatusResponseOuterClass {
  private ListFriendStatusResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_Callee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_Callee_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOPOGOProtos/Networking/Responses/Social" +
      "/Responses/ListFriendStatusResponse.prot" +
      "o\0220POGOProtos.Networking.Responses.Socia" +
      "l.Responses\032+POGOProtos/Data/Friends/Fri" +
      "endDetails.proto\"\354\005\n\030ListFriendStatusRes" +
      "ponse\022a\n\006result\030\001 \001(\0162Q.POGOProtos.Netwo" +
      "rking.Responses.Social.Responses.ListFri" +
      "endStatusResponse.Result\0226\n\006friend\030\002 \003(\013" +
      "2&.POGOProtos.Data.Friends.FriendDetails" +
      "\022s\n\031friend_details_debug_info\030\003 \001(\0132P.PO" +
      "GOProtos.Networking.Responses.Social.Res" +
      "ponses.ListFriendStatusResponse.Debug\032\347\002" +
      "\n\005Debug\022\027\n\017fetched_from_db\030\001 \001(\005\022\033\n\023fetc" +
      "hed_from_fanout\030\002 \001(\005\022\"\n\032fetched_from_pl" +
      "ayer_mapper\030\003 \001(\005\022!\n\031fetched_from_status" +
      "_cache\030\004 \001(\005\022\027\n\017failed_to_fetch\030\005 \001(\005\022l\n" +
      "\013callee_list\030\006 \003(\0132W.POGOProtos.Networki" +
      "ng.Responses.Social.Responses.ListFriend" +
      "StatusResponse.Debug.Callee\022*\n\"fetched_f" +
      "rom_same_server_as_player\030\007 \001(\005\032.\n\006Calle" +
      "e\022\021\n\tcallee_id\030\001 \003(\005\022\021\n\tplayer_id\030\002 \001(\t\"" +
      "V\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\021\n\rERR" +
      "OR_UNKNOWN\020\002\022!\n\035EXCEEDS_MAX_PLAYERS_PER_" +
      "QUERY\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Friends.FriendDetailsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_descriptor,
        new java.lang.String[] { "Result", "Friend", "FriendDetailsDebugInfo", });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_descriptor =
      internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_descriptor,
        new java.lang.String[] { "FetchedFromDb", "FetchedFromFanout", "FetchedFromPlayerMapper", "FetchedFromStatusCache", "FailedToFetch", "CalleeList", "FetchedFromSameServerAsPlayer", });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_Callee_descriptor =
      internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_Callee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_ListFriendStatusResponse_Debug_Callee_descriptor,
        new java.lang.String[] { "CalleeId", "PlayerId", });
    POGOProtos.Data.Friends.FriendDetailsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}