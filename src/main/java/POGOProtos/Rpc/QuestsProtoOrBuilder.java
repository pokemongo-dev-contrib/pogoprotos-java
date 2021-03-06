// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface QuestsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.QuestsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  java.util.List<POGOProtos.Rpc.QuestProto> 
      getQuestList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  POGOProtos.Rpc.QuestProto getQuest(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  int getQuestCount();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.QuestProtoOrBuilder> 
      getQuestOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  POGOProtos.Rpc.QuestProtoOrBuilder getQuestOrBuilder(
      int index);

  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @return A list containing the completedStoryQuest.
   */
  java.util.List<java.lang.String>
      getCompletedStoryQuestList();
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @return The count of completedStoryQuest.
   */
  int getCompletedStoryQuestCount();
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @param index The index of the element to return.
   * @return The completedStoryQuest at the given index.
   */
  java.lang.String getCompletedStoryQuest(int index);
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the completedStoryQuest at the given index.
   */
  com.google.protobuf.ByteString
      getCompletedStoryQuestBytes(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.QuestPokemonEncounterProto quest_pokemon_encounter = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.QuestPokemonEncounterProto> 
      getQuestPokemonEncounterList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestPokemonEncounterProto quest_pokemon_encounter = 3;</code>
   */
  POGOProtos.Rpc.QuestPokemonEncounterProto getQuestPokemonEncounter(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.QuestPokemonEncounterProto quest_pokemon_encounter = 3;</code>
   */
  int getQuestPokemonEncounterCount();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestPokemonEncounterProto quest_pokemon_encounter = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.QuestPokemonEncounterProtoOrBuilder> 
      getQuestPokemonEncounterOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestPokemonEncounterProto quest_pokemon_encounter = 3;</code>
   */
  POGOProtos.Rpc.QuestPokemonEncounterProtoOrBuilder getQuestPokemonEncounterOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Rpc.QuestStampCardProto stamp_card = 4;</code>
   * @return Whether the stampCard field is set.
   */
  boolean hasStampCard();
  /**
   * <code>.POGOProtos.Rpc.QuestStampCardProto stamp_card = 4;</code>
   * @return The stampCard.
   */
  POGOProtos.Rpc.QuestStampCardProto getStampCard();
  /**
   * <code>.POGOProtos.Rpc.QuestStampCardProto stamp_card = 4;</code>
   */
  POGOProtos.Rpc.QuestStampCardProtoOrBuilder getStampCardOrBuilder();
}
