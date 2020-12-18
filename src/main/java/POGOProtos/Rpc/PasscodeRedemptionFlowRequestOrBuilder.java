// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PasscodeRedemptionFlowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PasscodeRedemptionFlowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string passcode = 1;</code>
   * @return The passcode.
   */
  java.lang.String getPasscode();
  /**
   * <code>string passcode = 1;</code>
   * @return The bytes for passcode.
   */
  com.google.protobuf.ByteString
      getPasscodeBytes();

  /**
   * <code>string poi_guid = 2;</code>
   * @return The poiGuid.
   */
  java.lang.String getPoiGuid();
  /**
   * <code>string poi_guid = 2;</code>
   * @return The bytes for poiGuid.
   */
  com.google.protobuf.ByteString
      getPoiGuidBytes();

  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
   * @return The enum numeric value on the wire for devicePlatform.
   */
  int getDevicePlatformValue();
  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
   * @return The devicePlatform.
   */
  POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform getDevicePlatform();

  /**
   * <code>string carrier = 4;</code>
   * @return The carrier.
   */
  java.lang.String getCarrier();
  /**
   * <code>string carrier = 4;</code>
   * @return The bytes for carrier.
   */
  com.google.protobuf.ByteString
      getCarrierBytes();
}
