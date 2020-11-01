// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CommonTelemetryShopClickOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CommonTelemetryShopClick)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string shopping_page_click_id = 1;</code>
   * @return The shoppingPageClickId.
   */
  java.lang.String getShoppingPageClickId();
  /**
   * <code>string shopping_page_click_id = 1;</code>
   * @return The bytes for shoppingPageClickId.
   */
  com.google.protobuf.ByteString
      getShoppingPageClickIdBytes();

  /**
   * <code>string sku_id = 2;</code>
   * @return The skuId.
   */
  java.lang.String getSkuId();
  /**
   * <code>string sku_id = 2;</code>
   * @return The bytes for skuId.
   */
  com.google.protobuf.ByteString
      getSkuIdBytes();

  /**
   * <code>string item_id = 3;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <code>string item_id = 3;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>string consolidated_item_id = 4;</code>
   * @return The consolidatedItemId.
   */
  java.lang.String getConsolidatedItemId();
  /**
   * <code>string consolidated_item_id = 4;</code>
   * @return The bytes for consolidatedItemId.
   */
  com.google.protobuf.ByteString
      getConsolidatedItemIdBytes();

  /**
   * <code>string currency = 5;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 5;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>int64 fiat_price = 6;</code>
   * @return The fiatPrice.
   */
  long getFiatPrice();

  /**
   * <code>repeated .POGOProtos.Rpc.InGamePurchaseDetails in_game_purchase_details = 7;</code>
   */
  java.util.List<POGOProtos.Rpc.InGamePurchaseDetails> 
      getInGamePurchaseDetailsList();
  /**
   * <code>repeated .POGOProtos.Rpc.InGamePurchaseDetails in_game_purchase_details = 7;</code>
   */
  POGOProtos.Rpc.InGamePurchaseDetails getInGamePurchaseDetails(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.InGamePurchaseDetails in_game_purchase_details = 7;</code>
   */
  int getInGamePurchaseDetailsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.InGamePurchaseDetails in_game_purchase_details = 7;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.InGamePurchaseDetailsOrBuilder> 
      getInGamePurchaseDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.InGamePurchaseDetails in_game_purchase_details = 7;</code>
   */
  POGOProtos.Rpc.InGamePurchaseDetailsOrBuilder getInGamePurchaseDetailsOrBuilder(
      int index);

  /**
   * <code>bool is_item_free_fiat = 8;</code>
   * @return The isItemFreeFiat.
   */
  boolean getIsItemFreeFiat();

  /**
   * <code>bool is_item_free_ingame = 9;</code>
   * @return The isItemFreeIngame.
   */
  boolean getIsItemFreeIngame();

  /**
   * <code>int64 time_elapsed_since_enter_page = 10;</code>
   * @return The timeElapsedSinceEnterPage.
   */
  long getTimeElapsedSinceEnterPage();

  /**
   * <code>string root_store_page_session_id = 11;</code>
   * @return The rootStorePageSessionId.
   */
  java.lang.String getRootStorePageSessionId();
  /**
   * <code>string root_store_page_session_id = 11;</code>
   * @return The bytes for rootStorePageSessionId.
   */
  com.google.protobuf.ByteString
      getRootStorePageSessionIdBytes();

  /**
   * <code>int64 pair_id = 12;</code>
   * @return The pairId.
   */
  long getPairId();

  /**
   * <code>string store_page_name = 13;</code>
   * @return The storePageName.
   */
  java.lang.String getStorePageName();
  /**
   * <code>string store_page_name = 13;</code>
   * @return The bytes for storePageName.
   */
  com.google.protobuf.ByteString
      getStorePageNameBytes();

  /**
   * <code>string root_store_page_name = 14;</code>
   * @return The rootStorePageName.
   */
  java.lang.String getRootStorePageName();
  /**
   * <code>string root_store_page_name = 14;</code>
   * @return The bytes for rootStorePageName.
   */
  com.google.protobuf.ByteString
      getRootStorePageNameBytes();

  /**
   * <code>.POGOProtos.Rpc.CommonTelemetryShopClick.AccessType access_type = 15;</code>
   * @return The enum numeric value on the wire for accessType.
   */
  int getAccessTypeValue();
  /**
   * <code>.POGOProtos.Rpc.CommonTelemetryShopClick.AccessType access_type = 15;</code>
   * @return The accessType.
   */
  POGOProtos.Rpc.CommonTelemetryShopClick.AccessType getAccessType();

  /**
   * <code>string fiat_formatted_price = 16;</code>
   * @return The fiatFormattedPrice.
   */
  java.lang.String getFiatFormattedPrice();
  /**
   * <code>string fiat_formatted_price = 16;</code>
   * @return The bytes for fiatFormattedPrice.
   */
  com.google.protobuf.ByteString
      getFiatFormattedPriceBytes();
}
