// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.OnboardingArStatus}
 */
public enum OnboardingArStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ONBOARDING_AR_STATUS_UNSET = 0;</code>
   */
  ONBOARDING_AR_STATUS_UNSET(0),
  /**
   * <code>ONBOARDING_AR_STATUS_OFF = 1;</code>
   */
  ONBOARDING_AR_STATUS_OFF(1),
  /**
   * <code>ONBOARDING_AR_STATUS_AR_STANDARD = 2;</code>
   */
  ONBOARDING_AR_STATUS_AR_STANDARD(2),
  /**
   * <code>ONBOARDING_AR_STATUS_AR_PLUS = 3;</code>
   */
  ONBOARDING_AR_STATUS_AR_PLUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ONBOARDING_AR_STATUS_UNSET = 0;</code>
   */
  public static final int ONBOARDING_AR_STATUS_UNSET_VALUE = 0;
  /**
   * <code>ONBOARDING_AR_STATUS_OFF = 1;</code>
   */
  public static final int ONBOARDING_AR_STATUS_OFF_VALUE = 1;
  /**
   * <code>ONBOARDING_AR_STATUS_AR_STANDARD = 2;</code>
   */
  public static final int ONBOARDING_AR_STATUS_AR_STANDARD_VALUE = 2;
  /**
   * <code>ONBOARDING_AR_STATUS_AR_PLUS = 3;</code>
   */
  public static final int ONBOARDING_AR_STATUS_AR_PLUS_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OnboardingArStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OnboardingArStatus forNumber(int value) {
    switch (value) {
      case 0: return ONBOARDING_AR_STATUS_UNSET;
      case 1: return ONBOARDING_AR_STATUS_OFF;
      case 2: return ONBOARDING_AR_STATUS_AR_STANDARD;
      case 3: return ONBOARDING_AR_STATUS_AR_PLUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OnboardingArStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OnboardingArStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OnboardingArStatus>() {
          public OnboardingArStatus findValueByNumber(int number) {
            return OnboardingArStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(89);
  }

  private static final OnboardingArStatus[] VALUES = values();

  public static OnboardingArStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OnboardingArStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OnboardingArStatus)
}

