// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FriendshipLevelDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FriendshipLevelDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 bucket = 1;</code>
   * @return The bucket.
   */
  long getBucket();

  /**
   * <code>int32 points_earned_today = 2;</code>
   * @return The pointsEarnedToday.
   */
  int getPointsEarnedToday();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone awarded_friendship_milestone = 3;</code>
   * @return The enum numeric value on the wire for awardedFriendshipMilestone.
   */
  int getAwardedFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone awarded_friendship_milestone = 3;</code>
   * @return The awardedFriendshipMilestone.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getAwardedFriendshipMilestone();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone current_friendship_milestone = 4;</code>
   * @return The enum numeric value on the wire for currentFriendshipMilestone.
   */
  int getCurrentFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone current_friendship_milestone = 4;</code>
   * @return The currentFriendshipMilestone.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getCurrentFriendshipMilestone();

  /**
   * <code>double next_friendship_milestone_progress_percentage = 5;</code>
   * @return The nextFriendshipMilestoneProgressPercentage.
   */
  double getNextFriendshipMilestoneProgressPercentage();

  /**
   * <code>int32 points_toward_next_milestone = 6;</code>
   * @return The pointsTowardNextMilestone.
   */
  int getPointsTowardNextMilestone();
}
