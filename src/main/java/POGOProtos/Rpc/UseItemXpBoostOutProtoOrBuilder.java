// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UseItemXpBoostOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UseItemXpBoostOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.UseItemXpBoostOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.UseItemXpBoostOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.UseItemXpBoostOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.AppliedItemsProto applied_items = 2;</code>
   * @return Whether the appliedItems field is set.
   */
  boolean hasAppliedItems();
  /**
   * <code>.POGOProtos.Rpc.AppliedItemsProto applied_items = 2;</code>
   * @return The appliedItems.
   */
  POGOProtos.Rpc.AppliedItemsProto getAppliedItems();
  /**
   * <code>.POGOProtos.Rpc.AppliedItemsProto applied_items = 2;</code>
   */
  POGOProtos.Rpc.AppliedItemsProtoOrBuilder getAppliedItemsOrBuilder();
}
