// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface VsSeekerAttributesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.VsSeekerAttributesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
   * @return The enum numeric value on the wire for vsSeekerStatus.
   */
  int getVsSeekerStatusValue();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
   * @return The vsSeekerStatus.
   */
  POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus getVsSeekerStatus();

  /**
   * <code>double start_km_walked = 2;</code>
   * @return The startKmWalked.
   */
  double getStartKmWalked();

  /**
   * <code>double target_km_walked = 3;</code>
   * @return The targetKmWalked.
   */
  double getTargetKmWalked();

  /**
   * <code>int32 battle_granted_remaining = 4;</code>
   * @return The battleGrantedRemaining.
   */
  int getBattleGrantedRemaining();

  /**
   * <code>int32 max_battles_in_set = 6;</code>
   * @return The maxBattlesInSet.
   */
  int getMaxBattlesInSet();

  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
   * @return The enum numeric value on the wire for rewardTrack.
   */
  int getRewardTrackValue();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
   * @return The rewardTrack.
   */
  POGOProtos.Rpc.VsSeekerRewardTrack getRewardTrack();

  /**
   * <code>string battle_now_sku_id = 8;</code>
   * @return The battleNowSkuId.
   */
  java.lang.String getBattleNowSkuId();
  /**
   * <code>string battle_now_sku_id = 8;</code>
   * @return The bytes for battleNowSkuId.
   */
  com.google.protobuf.ByteString
      getBattleNowSkuIdBytes();

  /**
   * <code>bool additional_battles_granted = 9;</code>
   * @return The additionalBattlesGranted.
   */
  boolean getAdditionalBattlesGranted();
}
