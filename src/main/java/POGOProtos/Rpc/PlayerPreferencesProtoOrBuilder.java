// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlayerPreferencesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlayerPreferencesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool opt_out_of_sponsored_gifts = 1;</code>
   * @return The optOutOfSponsoredGifts.
   */
  boolean getOptOutOfSponsoredGifts();

  /**
   * <code>.POGOProtos.Rpc.BattlePartiesProto battle_parties = 2;</code>
   * @return Whether the battleParties field is set.
   */
  boolean hasBattleParties();
  /**
   * <code>.POGOProtos.Rpc.BattlePartiesProto battle_parties = 2;</code>
   * @return The battleParties.
   */
  POGOProtos.Rpc.BattlePartiesProto getBattleParties();
  /**
   * <code>.POGOProtos.Rpc.BattlePartiesProto battle_parties = 2;</code>
   */
  POGOProtos.Rpc.BattlePartiesProtoOrBuilder getBattlePartiesOrBuilder();

  /**
   * <code>string search_filter_preference_base64 = 3;</code>
   * @return The searchFilterPreferenceBase64.
   */
  java.lang.String getSearchFilterPreferenceBase64();
  /**
   * <code>string search_filter_preference_base64 = 3;</code>
   * @return The bytes for searchFilterPreferenceBase64.
   */
  com.google.protobuf.ByteString
      getSearchFilterPreferenceBase64Bytes();
}
