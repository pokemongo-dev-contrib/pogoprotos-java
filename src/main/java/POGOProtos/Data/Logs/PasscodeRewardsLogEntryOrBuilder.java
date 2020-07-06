// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/PasscodeRewardsLogEntry.proto

package POGOProtos.Data.Logs;

public interface PasscodeRewardsLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Logs.PasscodeRewardsLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Logs.PasscodeRewardsLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.Logs.PasscodeRewardsLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.Logs.PasscodeRewardsLogEntry.Result getResult();

  /**
   * <code>string passcode = 2;</code>
   * @return The passcode.
   */
  java.lang.String getPasscode();
  /**
   * <code>string passcode = 2;</code>
   * @return The bytes for passcode.
   */
  com.google.protobuf.ByteString
      getPasscodeBytes();

  /**
   * <code>.POGOProtos.Data.Redeem.RedeemPasscodeReward rewards = 3;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Data.Redeem.RedeemPasscodeReward rewards = 3;</code>
   * @return The rewards.
   */
  POGOProtos.Data.Redeem.RedeemPasscodeReward getRewards();
  /**
   * <code>.POGOProtos.Data.Redeem.RedeemPasscodeReward rewards = 3;</code>
   */
  POGOProtos.Data.Redeem.RedeemPasscodeRewardOrBuilder getRewardsOrBuilder();
}