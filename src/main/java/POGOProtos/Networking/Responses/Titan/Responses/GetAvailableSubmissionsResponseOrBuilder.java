// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Titan/Responses/GetAvailableSubmissionsResponse.proto

package POGOProtos.Networking.Responses.Titan.Responses;

public interface GetAvailableSubmissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Titan.Responses.GetAvailableSubmissionsResponse)
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
}