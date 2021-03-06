// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface InventoryDeltaProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventoryDeltaProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 original_timestamp = 1;</code>
   * @return The originalTimestamp.
   */
  long getOriginalTimestamp();

  /**
   * <code>int64 new_timestamp = 2;</code>
   * @return The newTimestamp.
   */
  long getNewTimestamp();

  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.InventoryItemProto> 
      getInventoryItemList();
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  POGOProtos.Rpc.InventoryItemProto getInventoryItem(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  int getInventoryItemCount();
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.InventoryItemProtoOrBuilder> 
      getInventoryItemOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  POGOProtos.Rpc.InventoryItemProtoOrBuilder getInventoryItemOrBuilder(
      int index);
}
