// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlatformAvailableSkuProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformAvailableSkuProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>bool is_third_party_vendor_item = 2;</code>
   * @return The isThirdPartyVendorItem.
   */
  boolean getIsThirdPartyVendorItem();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto price = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformCurrencyQuantityProto> 
      getPriceList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto price = 3;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProto getPrice(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto price = 3;</code>
   */
  int getPriceCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto price = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder> 
      getPriceOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto price = 3;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder getPriceOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_granted = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformCurrencyQuantityProto> 
      getCurrencyGrantedList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_granted = 4;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProto getCurrencyGranted(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_granted = 4;</code>
   */
  int getCurrencyGrantedCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_granted = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder> 
      getCurrencyGrantedOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformCurrencyQuantityProto currency_granted = 4;</code>
   */
  POGOProtos.Rpc.PlatformCurrencyQuantityProtoOrBuilder getCurrencyGrantedOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGameItemContentProto game_item_content = 5;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformGameItemContentProto> 
      getGameItemContentList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGameItemContentProto game_item_content = 5;</code>
   */
  POGOProtos.Rpc.PlatformGameItemContentProto getGameItemContent(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGameItemContentProto game_item_content = 5;</code>
   */
  int getGameItemContentCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGameItemContentProto game_item_content = 5;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformGameItemContentProtoOrBuilder> 
      getGameItemContentOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGameItemContentProto game_item_content = 5;</code>
   */
  POGOProtos.Rpc.PlatformGameItemContentProtoOrBuilder getGameItemContentOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformSkuPresentationProto presentation_data = 6;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformSkuPresentationProto> 
      getPresentationDataList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformSkuPresentationProto presentation_data = 6;</code>
   */
  POGOProtos.Rpc.PlatformSkuPresentationProto getPresentationData(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformSkuPresentationProto presentation_data = 6;</code>
   */
  int getPresentationDataCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformSkuPresentationProto presentation_data = 6;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformSkuPresentationProtoOrBuilder> 
      getPresentationDataOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformSkuPresentationProto presentation_data = 6;</code>
   */
  POGOProtos.Rpc.PlatformSkuPresentationProtoOrBuilder getPresentationDataOrBuilder(
      int index);

  /**
   * <code>bool can_be_purchased = 7;</code>
   * @return The canBePurchased.
   */
  boolean getCanBePurchased();
}
