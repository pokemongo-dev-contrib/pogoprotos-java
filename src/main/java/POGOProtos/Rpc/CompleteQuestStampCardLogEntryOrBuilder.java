// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CompleteQuestStampCardLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CompleteQuestStampCardLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.CompleteQuestStampCardLogEntry.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto reward = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.QuestRewardProto> 
      getRewardList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto reward = 2;</code>
   */
  POGOProtos.Rpc.QuestRewardProto getReward(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto reward = 2;</code>
   */
  int getRewardCount();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto reward = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.QuestRewardProtoOrBuilder> 
      getRewardOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto reward = 2;</code>
   */
  POGOProtos.Rpc.QuestRewardProtoOrBuilder getRewardOrBuilder(
      int index);
}
