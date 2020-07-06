// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface OnboardingTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.OnboardingTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.OnboardingPathIds onboarding_path = 1;</code>
   * @return The enum numeric value on the wire for onboardingPath.
   */
  int getOnboardingPathValue();
  /**
   * <code>.POGOProtos.Rpc.OnboardingPathIds onboarding_path = 1;</code>
   * @return The onboardingPath.
   */
  POGOProtos.Rpc.OnboardingPathIds getOnboardingPath();

  /**
   * <code>.POGOProtos.Rpc.OnboardingEventIds event_id = 2;</code>
   * @return The enum numeric value on the wire for eventId.
   */
  int getEventIdValue();
  /**
   * <code>.POGOProtos.Rpc.OnboardingEventIds event_id = 2;</code>
   * @return The eventId.
   */
  POGOProtos.Rpc.OnboardingEventIds getEventId();

  /**
   * <code>int32 data = 3;</code>
   * @return The data.
   */
  int getData();

  /**
   * <code>string conversation = 4;</code>
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   * <code>string conversation = 4;</code>
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString
      getConversationBytes();

  /**
   * <code>.POGOProtos.Rpc.OnboardingArStatus ar_status = 5;</code>
   * @return The enum numeric value on the wire for arStatus.
   */
  int getArStatusValue();
  /**
   * <code>.POGOProtos.Rpc.OnboardingArStatus ar_status = 5;</code>
   * @return The arStatus.
   */
  POGOProtos.Rpc.OnboardingArStatus getArStatus();
}