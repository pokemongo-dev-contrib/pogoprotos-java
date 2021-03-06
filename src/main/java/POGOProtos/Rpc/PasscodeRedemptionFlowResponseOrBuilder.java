// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PasscodeRedemptionFlowResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PasscodeRedemptionFlowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Status getStatus();

  /**
   * <code>int32 inventory_check_failed_reason = 2;</code>
   * @return The inventoryCheckFailedReason.
   */
  int getInventoryCheckFailedReason();

  /**
   * <code>repeated .POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward rewards = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward> 
      getRewardsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward rewards = 3;</code>
   */
  POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward getRewards(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward rewards = 3;</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward rewards = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PasscodeRedemptionFlowResponse.RewardOrBuilder> 
      getRewardsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PasscodeRedemptionFlowResponse.Reward rewards = 3;</code>
   */
  POGOProtos.Rpc.PasscodeRedemptionFlowResponse.RewardOrBuilder getRewardsOrBuilder(
      int index);

  /**
   * <code>string passcode_batch_id = 5;</code>
   * @return The passcodeBatchId.
   */
  java.lang.String getPasscodeBatchId();
  /**
   * <code>string passcode_batch_id = 5;</code>
   * @return The bytes for passcodeBatchId.
   */
  com.google.protobuf.ByteString
      getPasscodeBatchIdBytes();

  /**
   * <code>bytes in_game_reward = 6;</code>
   * @return The inGameReward.
   */
  com.google.protobuf.ByteString getInGameReward();
}
