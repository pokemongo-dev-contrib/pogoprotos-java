// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/Quests.proto

package POGOProtos.Data.Quests;

public final class QuestsOuterClass {
  private QuestsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Quests_Quests_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Quests_Quests_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#POGOProtos/Data/Quests/Quests.proto\022\026P" +
      "OGOProtos.Data.Quests\032\"POGOProtos/Data/Q" +
      "uests/Quest.proto\0322POGOProtos/Data/Quest" +
      "s/QuestPokemonEncounter.proto\032+POGOProto" +
      "s/Data/Quests/QuestStampCard.proto\"\341\001\n\006Q" +
      "uests\022,\n\005quest\030\001 \003(\0132\035.POGOProtos.Data.Q" +
      "uests.Quest\022\035\n\025completed_story_quest\030\002 \003" +
      "(\t\022N\n\027quest_pokemon_encounter\030\003 \003(\0132-.PO" +
      "GOProtos.Data.Quests.QuestPokemonEncount" +
      "er\022:\n\nstamp_card\030\004 \001(\0132&.POGOProtos.Data" +
      ".Quests.QuestStampCardB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Quests.QuestOuterClass.getDescriptor(),
          POGOProtos.Data.Quests.QuestPokemonEncounterOuterClass.getDescriptor(),
          POGOProtos.Data.Quests.QuestStampCardOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Quests_Quests_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Quests_Quests_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Quests_Quests_descriptor,
        new java.lang.String[] { "Quest", "CompletedStoryQuest", "QuestPokemonEncounter", "StampCard", });
    POGOProtos.Data.Quests.QuestOuterClass.getDescriptor();
    POGOProtos.Data.Quests.QuestPokemonEncounterOuterClass.getDescriptor();
    POGOProtos.Data.Quests.QuestStampCardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}