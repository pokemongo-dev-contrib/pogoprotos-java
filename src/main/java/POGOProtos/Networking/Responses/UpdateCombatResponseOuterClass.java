// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UpdateCombatResponse.proto

package POGOProtos.Networking.Responses;

public final class UpdateCombatResponseOuterClass {
  private UpdateCombatResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_UpdateCombatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_UpdateCombatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:POGOProtos/Networking/Responses/Update" +
      "CombatResponse.proto\022\037POGOProtos.Network" +
      "ing.Responses\032#POGOProtos/Data/Combat/Co" +
      "mbat.proto\"\363\004\n\024UpdateCombatResponse\022L\n\006r" +
      "esult\030\001 \001(\0162<.POGOProtos.Networking.Resp" +
      "onses.UpdateCombatResponse.Result\022.\n\006com" +
      "bat\030\002 \001(\0132\036.POGOProtos.Data.Combat.Comba" +
      "t\"\334\003\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\036\n\032" +
      "ERROR_INVALID_COMBAT_STATE\020\002\022\032\n\026ERROR_CO" +
      "MBAT_NOT_FOUND\020\003\022\036\n\032ERROR_PLAYER_NOT_IN_" +
      "COMBAT\020\004\022\030\n\024ERROR_ILLEGAL_ACTION\020\005\022\035\n\031ER" +
      "ROR_INVALID_SUBMIT_TIME\020\006\022\034\n\030ERROR_PLAYE" +
      "R_IN_MINIGAME\020\007\022 \n\034ERROR_EXISTING_QUEUED" +
      "_ATTACK\020\010\022 \n\034ERROR_INVALID_CHANGE_POKEMO" +
      "N\020\t\022\035\n\031ERROR_INSUFFICIENT_ENERGY\020\n\022\026\n\022ER" +
      "ROR_INVALID_MOVE\020\013\022 \n\034ERROR_INVALID_DURA" +
      "TION_TURNS\020\014\022 \n\034ERROR_INVALID_MINIGAME_S" +
      "TATE\020\r\022$\n ERROR_INVALID_QUICK_SWAP_POKEM" +
      "ON\020\016\022\"\n\036ERROR_QUICK_SWAP_NOT_AVAILABLE\020\017" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Combat.CombatOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_UpdateCombatResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_UpdateCombatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_UpdateCombatResponse_descriptor,
        new java.lang.String[] { "Result", "Combat", });
    POGOProtos.Data.Combat.CombatOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}