// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestStamp.proto

package POGOProtos.Data.Quests;

public interface QuestStampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Quests.QuestStamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Quests.QuestStamp.Context context = 1;</code>
   * @return The enum numeric value on the wire for context.
   */
  int getContextValue();
  /**
   * <code>.POGOProtos.Data.Quests.QuestStamp.Context context = 1;</code>
   * @return The context.
   */
  POGOProtos.Data.Quests.QuestStamp.Context getContext();

  /**
   * <code>uint64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();
}