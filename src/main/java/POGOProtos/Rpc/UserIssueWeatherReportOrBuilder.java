// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UserIssueWeatherReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UserIssueWeatherReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gameplayer_weather = 1;</code>
   * @return The gameplayerWeather.
   */
  java.lang.String getGameplayerWeather();
  /**
   * <code>string gameplayer_weather = 1;</code>
   * @return The bytes for gameplayerWeather.
   */
  com.google.protobuf.ByteString
      getGameplayerWeatherBytes();

  /**
   * <code>bool alert_active = 2;</code>
   * @return The alertActive.
   */
  boolean getAlertActive();

  /**
   * <code>int32 severity = 3;</code>
   * @return The severity.
   */
  int getSeverity();

  /**
   * <code>int32 user_report = 4;</code>
   * @return The userReport.
   */
  int getUserReport();
}
