// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UseItemMoveRerollResponse.proto

package POGOProtos.Networking.Responses;

public final class UseItemMoveRerollResponseOuterClass {
  private UseItemMoveRerollResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_UseItemMoveRerollResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_UseItemMoveRerollResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Responses/UseIte" +
      "mMoveRerollResponse.proto\022\037POGOProtos.Ne" +
      "tworking.Responses\032!POGOProtos/Data/Poke" +
      "monData.proto\"\206\003\n\031UseItemMoveRerollRespo" +
      "nse\022Q\n\006result\030\001 \001(\0162A.POGOProtos.Network" +
      "ing.Responses.UseItemMoveRerollResponse." +
      "Result\0225\n\017updated_pokemon\030\002 \001(\0132\034.POGOPr" +
      "otos.Data.PokemonData\"\336\001\n\006Result\022\t\n\005UNSE" +
      "T\020\000\022\013\n\007SUCCESS\020\001\022\016\n\nNO_POKEMON\020\002\022\022\n\016NO_O" +
      "THER_MOVES\020\003\022\r\n\tNO_PLAYER\020\004\022\023\n\017WRONG_ITE" +
      "M_TYPE\020\005\022\031\n\025ITEM_NOT_IN_INVENTORY\020\006\022\023\n\017I" +
      "NVALID_POKEMON\020\007\022\017\n\013MOVE_LOCKED\020\010\022\033\n\027MOV" +
      "E_CANNOT_BE_REROLLED\020\t\022\026\n\022INVALID_ELITE_" +
      "MOVE\020\nB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_UseItemMoveRerollResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_UseItemMoveRerollResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_UseItemMoveRerollResponse_descriptor,
        new java.lang.String[] { "Result", "UpdatedPokemon", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}