// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface InventoryItemProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventoryItemProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes deleted_item_key = 2;</code>
   * @return The deletedItemKey.
   */
  com.google.protobuf.ByteString getDeletedItemKey();

  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   * @return The item.
   */
  POGOProtos.Rpc.MKBNBGHGGBA getItem();
  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   */
  POGOProtos.Rpc.MKBNBGHGGBAOrBuilder getItemOrBuilder();

  /**
   * <code>int64 modified_timestamp = 1;</code>
   * @return The modifiedTimestamp.
   */
  long getModifiedTimestamp();

  public POGOProtos.Rpc.InventoryItemProto.InventoryItemCase getInventoryItemCase();
}
