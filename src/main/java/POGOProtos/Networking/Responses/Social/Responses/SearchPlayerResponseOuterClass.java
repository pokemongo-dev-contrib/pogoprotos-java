// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/SearchPlayerResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public final class SearchPlayerResponseOuterClass {
  private SearchPlayerResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_SearchPlayerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_SearchPlayerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKPOGOProtos/Networking/Responses/Social" +
      "/Responses/SearchPlayerResponse.proto\0220P" +
      "OGOProtos.Networking.Responses.Social.Re" +
      "sponses\032*POGOProtos/Data/Player/PlayerSu" +
      "mmary.proto\"\375\001\n\024SearchPlayerResponse\022]\n\006" +
      "result\030\001 \001(\0162M.POGOProtos.Networking.Res" +
      "ponses.Social.Responses.SearchPlayerResp" +
      "onse.Result\0225\n\006player\030\002 \001(\0132%.POGOProtos" +
      ".Data.Player.PlayerSummary\"O\n\006Result\022\t\n\005" +
      "UNSET\020\000\022\013\n\007SUCCESS\020\001\022\021\n\rERROR_UNKNOWN\020\002\022" +
      "\032\n\026ERROR_PLAYER_NOT_FOUND\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Player.PlayerSummaryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_SearchPlayerResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_SearchPlayerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_SearchPlayerResponse_descriptor,
        new java.lang.String[] { "Result", "Player", });
    POGOProtos.Data.Player.PlayerSummaryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}