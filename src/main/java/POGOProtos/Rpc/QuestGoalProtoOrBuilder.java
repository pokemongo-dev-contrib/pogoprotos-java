// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface QuestGoalProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.QuestGoalProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.QuestConditionProto condition = 1;</code>
   */
  java.util.List<POGOProtos.Rpc.QuestConditionProto> 
      getConditionList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestConditionProto condition = 1;</code>
   */
  POGOProtos.Rpc.QuestConditionProto getCondition(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.QuestConditionProto condition = 1;</code>
   */
  int getConditionCount();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestConditionProto condition = 1;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.QuestConditionProtoOrBuilder> 
      getConditionOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.QuestConditionProto condition = 1;</code>
   */
  POGOProtos.Rpc.QuestConditionProtoOrBuilder getConditionOrBuilder(
      int index);

  /**
   * <code>int32 target = 2;</code>
   * @return The target.
   */
  int getTarget();
}
