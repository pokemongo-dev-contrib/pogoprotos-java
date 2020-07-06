// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/Raid.proto

package POGOProtos.Data.Raid;

public final class RaidOuterClass {
  private RaidOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Raid_Raid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Raid_Raid_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037POGOProtos/Data/Raid/Raid.proto\022\024POGOP" +
      "rotos.Data.Raid\032 POGOProtos/Enums/Pokemo" +
      "nId.proto\"\367\002\n\004Raid\022\021\n\traid_seed\030\001 \001(\003\022\022\n" +
      "\nstarted_ms\030\002 \001(\003\022\024\n\014completed_ms\030\003 \001(\003\022" +
      "9\n\024encounter_pokemon_id\030\004 \001(\0162\033.POGOProt" +
      "os.Enums.PokemonId\022\030\n\020completed_battle\030\005" +
      " \001(\010\022\030\n\020received_rewards\030\006 \001(\010\022\032\n\022finish" +
      "ed_encounter\030\007 \001(\010\022 \n\030received_default_r" +
      "ewards\030\010 \001(\010\022 \n\030incremented_raid_friends" +
      "\030\t \001(\010\022\033\n\023completed_battle_ms\030\n \001(\003\022\032\n\022n" +
      "um_friend_invites\030\013 \001(\005\022\021\n\tis_remote\030\014 \001" +
      "(\010\022\027\n\017consumed_ticket\030\r \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Raid_Raid_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Raid_Raid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Raid_Raid_descriptor,
        new java.lang.String[] { "RaidSeed", "StartedMs", "CompletedMs", "EncounterPokemonId", "CompletedBattle", "ReceivedRewards", "FinishedEncounter", "ReceivedDefaultRewards", "IncrementedRaidFriends", "CompletedBattleMs", "NumFriendInvites", "IsRemote", "ConsumedTicket", });
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}