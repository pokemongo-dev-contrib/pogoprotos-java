// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyActivityCategorySettings.proto

package POGOProtos.Settings.Master;

public interface BuddyActivityCategorySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.BuddyActivityCategorySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.BuddyActivityCategory activity_category = 1;</code>
   * @return The enum numeric value on the wire for activityCategory.
   */
  int getActivityCategoryValue();
  /**
   * <code>.POGOProtos.Enums.BuddyActivityCategory activity_category = 1;</code>
   * @return The activityCategory.
   */
  POGOProtos.Enums.BuddyActivityCategory getActivityCategory();

  /**
   * <code>int32 max_points_per_day = 2;</code>
   * @return The maxPointsPerDay.
   */
  int getMaxPointsPerDay();
}