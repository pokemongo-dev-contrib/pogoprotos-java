// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CameraSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CameraSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string next_camera = 1;</code>
   * @return The nextCamera.
   */
  java.lang.String getNextCamera();
  /**
   * <code>string next_camera = 1;</code>
   * @return The bytes for nextCamera.
   */
  com.google.protobuf.ByteString
      getNextCameraBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.CameraInterpolation interpolation = 2;</code>
   * @return A list containing the interpolation.
   */
  java.util.List<POGOProtos.Rpc.CameraInterpolation> getInterpolationList();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraInterpolation interpolation = 2;</code>
   * @return The count of interpolation.
   */
  int getInterpolationCount();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraInterpolation interpolation = 2;</code>
   * @param index The index of the element to return.
   * @return The interpolation at the given index.
   */
  POGOProtos.Rpc.CameraInterpolation getInterpolation(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.CameraInterpolation interpolation = 2;</code>
   * @return A list containing the enum numeric values on the wire for interpolation.
   */
  java.util.List<java.lang.Integer>
  getInterpolationValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraInterpolation interpolation = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of interpolation at the given index.
   */
  int getInterpolationValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.CameraTarget target_type = 3;</code>
   * @return A list containing the targetType.
   */
  java.util.List<POGOProtos.Rpc.CameraTarget> getTargetTypeList();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraTarget target_type = 3;</code>
   * @return The count of targetType.
   */
  int getTargetTypeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraTarget target_type = 3;</code>
   * @param index The index of the element to return.
   * @return The targetType at the given index.
   */
  POGOProtos.Rpc.CameraTarget getTargetType(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.CameraTarget target_type = 3;</code>
   * @return A list containing the enum numeric values on the wire for targetType.
   */
  java.util.List<java.lang.Integer>
  getTargetTypeValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.CameraTarget target_type = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of targetType at the given index.
   */
  int getTargetTypeValue(int index);

  /**
   * <code>repeated float ease_in_speed = 4;</code>
   * @return A list containing the easeInSpeed.
   */
  java.util.List<java.lang.Float> getEaseInSpeedList();
  /**
   * <code>repeated float ease_in_speed = 4;</code>
   * @return The count of easeInSpeed.
   */
  int getEaseInSpeedCount();
  /**
   * <code>repeated float ease_in_speed = 4;</code>
   * @param index The index of the element to return.
   * @return The easeInSpeed at the given index.
   */
  float getEaseInSpeed(int index);

  /**
   * <code>repeated float ease_out_speed = 5;</code>
   * @return A list containing the easeOutSpeed.
   */
  java.util.List<java.lang.Float> getEaseOutSpeedList();
  /**
   * <code>repeated float ease_out_speed = 5;</code>
   * @return The count of easeOutSpeed.
   */
  int getEaseOutSpeedCount();
  /**
   * <code>repeated float ease_out_speed = 5;</code>
   * @param index The index of the element to return.
   * @return The easeOutSpeed at the given index.
   */
  float getEaseOutSpeed(int index);

  /**
   * <code>repeated float duration_s = 6;</code>
   * @return A list containing the durationS.
   */
  java.util.List<java.lang.Float> getDurationSList();
  /**
   * <code>repeated float duration_s = 6;</code>
   * @return The count of durationS.
   */
  int getDurationSCount();
  /**
   * <code>repeated float duration_s = 6;</code>
   * @param index The index of the element to return.
   * @return The durationS at the given index.
   */
  float getDurationS(int index);

  /**
   * <code>repeated float wait_s = 7;</code>
   * @return A list containing the waitS.
   */
  java.util.List<java.lang.Float> getWaitSList();
  /**
   * <code>repeated float wait_s = 7;</code>
   * @return The count of waitS.
   */
  int getWaitSCount();
  /**
   * <code>repeated float wait_s = 7;</code>
   * @param index The index of the element to return.
   * @return The waitS at the given index.
   */
  float getWaitS(int index);

  /**
   * <code>repeated float transition_s = 8;</code>
   * @return A list containing the transitionS.
   */
  java.util.List<java.lang.Float> getTransitionSList();
  /**
   * <code>repeated float transition_s = 8;</code>
   * @return The count of transitionS.
   */
  int getTransitionSCount();
  /**
   * <code>repeated float transition_s = 8;</code>
   * @param index The index of the element to return.
   * @return The transitionS at the given index.
   */
  float getTransitionS(int index);

  /**
   * <code>repeated float angle_deg = 9;</code>
   * @return A list containing the angleDeg.
   */
  java.util.List<java.lang.Float> getAngleDegList();
  /**
   * <code>repeated float angle_deg = 9;</code>
   * @return The count of angleDeg.
   */
  int getAngleDegCount();
  /**
   * <code>repeated float angle_deg = 9;</code>
   * @param index The index of the element to return.
   * @return The angleDeg at the given index.
   */
  float getAngleDeg(int index);

  /**
   * <code>repeated float angle_offset_deg = 10;</code>
   * @return A list containing the angleOffsetDeg.
   */
  java.util.List<java.lang.Float> getAngleOffsetDegList();
  /**
   * <code>repeated float angle_offset_deg = 10;</code>
   * @return The count of angleOffsetDeg.
   */
  int getAngleOffsetDegCount();
  /**
   * <code>repeated float angle_offset_deg = 10;</code>
   * @param index The index of the element to return.
   * @return The angleOffsetDeg at the given index.
   */
  float getAngleOffsetDeg(int index);

  /**
   * <code>repeated float pitch_deg = 11;</code>
   * @return A list containing the pitchDeg.
   */
  java.util.List<java.lang.Float> getPitchDegList();
  /**
   * <code>repeated float pitch_deg = 11;</code>
   * @return The count of pitchDeg.
   */
  int getPitchDegCount();
  /**
   * <code>repeated float pitch_deg = 11;</code>
   * @param index The index of the element to return.
   * @return The pitchDeg at the given index.
   */
  float getPitchDeg(int index);

  /**
   * <code>repeated float pitch_offset_deg = 12;</code>
   * @return A list containing the pitchOffsetDeg.
   */
  java.util.List<java.lang.Float> getPitchOffsetDegList();
  /**
   * <code>repeated float pitch_offset_deg = 12;</code>
   * @return The count of pitchOffsetDeg.
   */
  int getPitchOffsetDegCount();
  /**
   * <code>repeated float pitch_offset_deg = 12;</code>
   * @param index The index of the element to return.
   * @return The pitchOffsetDeg at the given index.
   */
  float getPitchOffsetDeg(int index);

  /**
   * <code>repeated float roll_deg = 13;</code>
   * @return A list containing the rollDeg.
   */
  java.util.List<java.lang.Float> getRollDegList();
  /**
   * <code>repeated float roll_deg = 13;</code>
   * @return The count of rollDeg.
   */
  int getRollDegCount();
  /**
   * <code>repeated float roll_deg = 13;</code>
   * @param index The index of the element to return.
   * @return The rollDeg at the given index.
   */
  float getRollDeg(int index);

  /**
   * <code>repeated float distance_m = 14;</code>
   * @return A list containing the distanceM.
   */
  java.util.List<java.lang.Float> getDistanceMList();
  /**
   * <code>repeated float distance_m = 14;</code>
   * @return The count of distanceM.
   */
  int getDistanceMCount();
  /**
   * <code>repeated float distance_m = 14;</code>
   * @param index The index of the element to return.
   * @return The distanceM at the given index.
   */
  float getDistanceM(int index);

  /**
   * <code>repeated float height_percent = 15;</code>
   * @return A list containing the heightPercent.
   */
  java.util.List<java.lang.Float> getHeightPercentList();
  /**
   * <code>repeated float height_percent = 15;</code>
   * @return The count of heightPercent.
   */
  int getHeightPercentCount();
  /**
   * <code>repeated float height_percent = 15;</code>
   * @param index The index of the element to return.
   * @return The heightPercent at the given index.
   */
  float getHeightPercent(int index);

  /**
   * <code>repeated float vert_ctr_ratio = 16;</code>
   * @return A list containing the vertCtrRatio.
   */
  java.util.List<java.lang.Float> getVertCtrRatioList();
  /**
   * <code>repeated float vert_ctr_ratio = 16;</code>
   * @return The count of vertCtrRatio.
   */
  int getVertCtrRatioCount();
  /**
   * <code>repeated float vert_ctr_ratio = 16;</code>
   * @param index The index of the element to return.
   * @return The vertCtrRatio at the given index.
   */
  float getVertCtrRatio(int index);
}
