// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/AttackGymResponse.proto

package POGOProtos.Networking.Responses;

public final class AttackGymResponseOuterClass {
  private AttackGymResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_AttackGymResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_AttackGymResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Networking/Responses/Attack" +
      "GymResponse.proto\022\037POGOProtos.Networking" +
      ".Responses\032&POGOProtos/Data/Battle/Battl" +
      "eLog.proto\032.POGOProtos/Data/Battle/Battl" +
      "ePokemonInfo.proto\032)POGOProtos/Data/Batt" +
      "le/BattleUpdate.proto\"\311\003\n\021AttackGymRespo" +
      "nse\022I\n\006result\030\001 \001(\01629.POGOProtos.Network" +
      "ing.Responses.AttackGymResponse.Result\0225" +
      "\n\nbattle_log\030\002 \001(\0132!.POGOProtos.Data.Bat" +
      "tle.BattleLog\022\021\n\tbattle_id\030\003 \001(\t\022B\n\017acti" +
      "ve_defender\030\004 \001(\0132).POGOProtos.Data.Batt" +
      "le.BattlePokemonInfo\022B\n\017active_attacker\030" +
      "\005 \001(\0132).POGOProtos.Data.Battle.BattlePok" +
      "emonInfo\022;\n\rbattle_update\030\006 \001(\0132$.POGOPr" +
      "otos.Data.Battle.BattleUpdate\"Z\n\006Result\022" +
      "\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022 \n\034ERROR_INVALID" +
      "_ATTACK_ACTIONS\020\002\022\026\n\022ERROR_NOT_IN_RANGE\020" +
      "\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Battle.BattleLogOuterClass.getDescriptor(),
          POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.getDescriptor(),
          POGOProtos.Data.Battle.BattleUpdateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_AttackGymResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_AttackGymResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_AttackGymResponse_descriptor,
        new java.lang.String[] { "Result", "BattleLog", "BattleId", "ActiveDefender", "ActiveAttacker", "BattleUpdate", });
    POGOProtos.Data.Battle.BattleLogOuterClass.getDescriptor();
    POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.getDescriptor();
    POGOProtos.Data.Battle.BattleUpdateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}