// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SetInGameCurrencyExchangeRateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SetInGameCurrencyExchangeRateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string in_game_currency = 1;</code>
   * @return The inGameCurrency.
   */
  java.lang.String getInGameCurrency();
  /**
   * <code>string in_game_currency = 1;</code>
   * @return The bytes for inGameCurrency.
   */
  com.google.protobuf.ByteString
      getInGameCurrencyBytes();

  /**
   * <code>string fiat_currency = 2;</code>
   * @return The fiatCurrency.
   */
  java.lang.String getFiatCurrency();
  /**
   * <code>string fiat_currency = 2;</code>
   * @return The bytes for fiatCurrency.
   */
  com.google.protobuf.ByteString
      getFiatCurrencyBytes();

  /**
   * <code>int64 fiat_currency_cost_e6_per_in_game_unit = 3;</code>
   * @return The fiatCurrencyCostE6PerInGameUnit.
   */
  long getFiatCurrencyCostE6PerInGameUnit();
}
