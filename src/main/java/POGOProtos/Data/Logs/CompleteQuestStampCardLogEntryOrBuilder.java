// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/CompleteQuestStampCardLogEntry.proto

package POGOProtos.Data.Logs;

public interface CompleteQuestStampCardLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result getResult();

  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  java.util.List<POGOProtos.Data.Quests.QuestReward> 
      getRewardList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  POGOProtos.Data.Quests.QuestReward getReward(int index);
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  int getRewardCount();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  java.util.List<? extends POGOProtos.Data.Quests.QuestRewardOrBuilder> 
      getRewardOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  POGOProtos.Data.Quests.QuestRewardOrBuilder getRewardOrBuilder(
      int index);
}