// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CommonTelemetryShopViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CommonTelemetryShopView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string shopping_page_view_type_id = 1;</code>
   * @return The shoppingPageViewTypeId.
   */
  java.lang.String getShoppingPageViewTypeId();
  /**
   * <code>string shopping_page_view_type_id = 1;</code>
   * @return The bytes for shoppingPageViewTypeId.
   */
  com.google.protobuf.ByteString
      getShoppingPageViewTypeIdBytes();

  /**
   * <code>int64 view_start_timestamp_ms = 2;</code>
   * @return The viewStartTimestampMs.
   */
  long getViewStartTimestampMs();

  /**
   * <code>int64 view_end_timestamp_ms = 3;</code>
   * @return The viewEndTimestampMs.
   */
  long getViewEndTimestampMs();

  /**
   * <code>repeated string consolidated_item_id = 4;</code>
   * @return A list containing the consolidatedItemId.
   */
  java.util.List<java.lang.String>
      getConsolidatedItemIdList();
  /**
   * <code>repeated string consolidated_item_id = 4;</code>
   * @return The count of consolidatedItemId.
   */
  int getConsolidatedItemIdCount();
  /**
   * <code>repeated string consolidated_item_id = 4;</code>
   * @param index The index of the element to return.
   * @return The consolidatedItemId at the given index.
   */
  java.lang.String getConsolidatedItemId(int index);
  /**
   * <code>repeated string consolidated_item_id = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the consolidatedItemId at the given index.
   */
  com.google.protobuf.ByteString
      getConsolidatedItemIdBytes(int index);

  /**
   * <code>string root_store_page_session_id = 5;</code>
   * @return The rootStorePageSessionId.
   */
  java.lang.String getRootStorePageSessionId();
  /**
   * <code>string root_store_page_session_id = 5;</code>
   * @return The bytes for rootStorePageSessionId.
   */
  com.google.protobuf.ByteString
      getRootStorePageSessionIdBytes();
}
