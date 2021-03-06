// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetAvailableSubmissionsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetAvailableSubmissionsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 submissions_left = 1;</code>
   * @return The submissionsLeft.
   */
  int getSubmissionsLeft();

  /**
   * <code>int32 min_player_level = 2;</code>
   * @return The minPlayerLevel.
   */
  int getMinPlayerLevel();

  /**
   * <code>bool has_valid_email = 3;</code>
   * @return The hasValidEmail.
   */
  boolean getHasValidEmail();

  /**
   * <code>bool is_feature_enabled = 4;</code>
   * @return The isFeatureEnabled.
   */
  boolean getIsFeatureEnabled();

  /**
   * <code>int64 time_window_for_submissions_limit_ms = 5;</code>
   * @return The timeWindowForSubmissionsLimitMs.
   */
  long getTimeWindowForSubmissionsLimitMs();

  /**
   * <code>int32 max_poi_distance_in_meters = 6;</code>
   * @return The maxPoiDistanceInMeters.
   */
  int getMaxPoiDistanceInMeters();

  /**
   * <code>repeated string blacklisted_os = 7;</code>
   * @return A list containing the blacklistedOs.
   */
  java.util.List<java.lang.String>
      getBlacklistedOsList();
  /**
   * <code>repeated string blacklisted_os = 7;</code>
   * @return The count of blacklistedOs.
   */
  int getBlacklistedOsCount();
  /**
   * <code>repeated string blacklisted_os = 7;</code>
   * @param index The index of the element to return.
   * @return The blacklistedOs at the given index.
   */
  java.lang.String getBlacklistedOs(int index);
  /**
   * <code>repeated string blacklisted_os = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blacklistedOs at the given index.
   */
  com.google.protobuf.ByteString
      getBlacklistedOsBytes(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType availability_result_per_type = 8;</code>
   */
  java.util.List<POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType> 
      getAvailabilityResultPerTypeList();
  /**
   * <code>repeated .POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType availability_result_per_type = 8;</code>
   */
  POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType getAvailabilityResultPerType(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType availability_result_per_type = 8;</code>
   */
  int getAvailabilityResultPerTypeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType availability_result_per_type = 8;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.AvailableSubmissionsPerSubmissionTypeOrBuilder> 
      getAvailabilityResultPerTypeOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.AvailableSubmissionsPerSubmissionType availability_result_per_type = 8;</code>
   */
  POGOProtos.Rpc.AvailableSubmissionsPerSubmissionTypeOrBuilder getAvailabilityResultPerTypeOrBuilder(
      int index);

  /**
   * <code>repeated string blacklisted_device_id = 9;</code>
   * @return A list containing the blacklistedDeviceId.
   */
  java.util.List<java.lang.String>
      getBlacklistedDeviceIdList();
  /**
   * <code>repeated string blacklisted_device_id = 9;</code>
   * @return The count of blacklistedDeviceId.
   */
  int getBlacklistedDeviceIdCount();
  /**
   * <code>repeated string blacklisted_device_id = 9;</code>
   * @param index The index of the element to return.
   * @return The blacklistedDeviceId at the given index.
   */
  java.lang.String getBlacklistedDeviceId(int index);
  /**
   * <code>repeated string blacklisted_device_id = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blacklistedDeviceId at the given index.
   */
  com.google.protobuf.ByteString
      getBlacklistedDeviceIdBytes(int index);

  /**
   * <code>int32 max_poi_location_edit_move_distance_meters = 10;</code>
   * @return The maxPoiLocationEditMoveDistanceMeters.
   */
  int getMaxPoiLocationEditMoveDistanceMeters();
}
