// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface EventSectionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.EventSectionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string event_name = 1;</code>
   * @return The eventName.
   */
  java.lang.String getEventName();
  /**
   * <code>string event_name = 1;</code>
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString
      getEventNameBytes();

  /**
   * <code>.POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>.POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto end_time = 3;</code>
   * @return The endTime.
   */
  POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto getEndTime();
  /**
   * <code>.POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto end_time = 3;</code>
   */
  POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProtoOrBuilder getEndTimeOrBuilder();

  /**
   * <code>string ref_news_id = 4;</code>
   * @return The refNewsId.
   */
  java.lang.String getRefNewsId();
  /**
   * <code>string ref_news_id = 4;</code>
   * @return The bytes for refNewsId.
   */
  com.google.protobuf.ByteString
      getRefNewsIdBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto bonus_boxes = 5;</code>
   */
  java.util.List<POGOProtos.Rpc.EventSectionProto.BonusBoxProto> 
      getBonusBoxesList();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto bonus_boxes = 5;</code>
   */
  POGOProtos.Rpc.EventSectionProto.BonusBoxProto getBonusBoxes(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto bonus_boxes = 5;</code>
   */
  int getBonusBoxesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto bonus_boxes = 5;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.EventSectionProto.BonusBoxProtoOrBuilder> 
      getBonusBoxesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto bonus_boxes = 5;</code>
   */
  POGOProtos.Rpc.EventSectionProto.BonusBoxProtoOrBuilder getBonusBoxesOrBuilder(
      int index);
}
