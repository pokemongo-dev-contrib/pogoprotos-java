// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PlayerOnboardingPath}
 */
public enum PlayerOnboardingPath
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLAYER_ONBOARDING_PATH_UNSET = 0;</code>
   */
  PLAYER_ONBOARDING_PATH_UNSET(0),
  /**
   * <code>PLAYER_ONBOARDING_PATH_V1 = 1;</code>
   */
  PLAYER_ONBOARDING_PATH_V1(1),
  /**
   * <code>PLAYER_ONBOARDING_PATH_V2 = 2;</code>
   */
  PLAYER_ONBOARDING_PATH_V2(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLAYER_ONBOARDING_PATH_UNSET = 0;</code>
   */
  public static final int PLAYER_ONBOARDING_PATH_UNSET_VALUE = 0;
  /**
   * <code>PLAYER_ONBOARDING_PATH_V1 = 1;</code>
   */
  public static final int PLAYER_ONBOARDING_PATH_V1_VALUE = 1;
  /**
   * <code>PLAYER_ONBOARDING_PATH_V2 = 2;</code>
   */
  public static final int PLAYER_ONBOARDING_PATH_V2_VALUE = 2;


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
  public static PlayerOnboardingPath valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayerOnboardingPath forNumber(int value) {
    switch (value) {
      case 0: return PLAYER_ONBOARDING_PATH_UNSET;
      case 1: return PLAYER_ONBOARDING_PATH_V1;
      case 2: return PLAYER_ONBOARDING_PATH_V2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayerOnboardingPath>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayerOnboardingPath> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayerOnboardingPath>() {
          public PlayerOnboardingPath findValueByNumber(int number) {
            return PlayerOnboardingPath.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(103);
  }

  private static final PlayerOnboardingPath[] VALUES = values();

  public static PlayerOnboardingPath valueOf(
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

  private PlayerOnboardingPath(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlayerOnboardingPath)
}

