// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface IsSkuAvailableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.IsSkuAvailableProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sku_id = 1;</code>
   * @return The skuId.
   */
  java.lang.String getSkuId();
  /**
   * <code>string sku_id = 1;</code>
   * @return The bytes for skuId.
   */
  com.google.protobuf.ByteString
      getSkuIdBytes();

  /**
   * <code>bool verify_price = 2;</code>
   * @return The verifyPrice.
   */
  boolean getVerifyPrice();

  /**
   * <code>int32 coin_cost = 3;</code>
   * @return The coinCost.
   */
  int getCoinCost();
}
