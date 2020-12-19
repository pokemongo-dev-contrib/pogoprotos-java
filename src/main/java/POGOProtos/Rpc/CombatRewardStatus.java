// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CombatRewardStatus}
 */
public enum CombatRewardStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMBAT_REWARD_STATUS_UNSET_REWARD_STATUS = 0;</code>
   */
  COMBAT_REWARD_STATUS_UNSET_REWARD_STATUS(0),
  /**
   * <code>COMBAT_REWARD_STATUS_REWARDS_GRANTED = 1;</code>
   */
  COMBAT_REWARD_STATUS_REWARDS_GRANTED(1),
  /**
   * <code>COMBAT_REWARD_STATUS_MAX_REWARDS_RECEIVED = 2;</code>
   */
  COMBAT_REWARD_STATUS_MAX_REWARDS_RECEIVED(2),
  /**
   * <code>COMBAT_REWARD_STATUS_PLAYER_BAG_FULL = 3;</code>
   */
  COMBAT_REWARD_STATUS_PLAYER_BAG_FULL(3),
  /**
   * <code>COMBAT_REWARD_STATUS_NO_REWARDS = 4;</code>
   */
  COMBAT_REWARD_STATUS_NO_REWARDS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMBAT_REWARD_STATUS_UNSET_REWARD_STATUS = 0;</code>
   */
  public static final int COMBAT_REWARD_STATUS_UNSET_REWARD_STATUS_VALUE = 0;
  /**
   * <code>COMBAT_REWARD_STATUS_REWARDS_GRANTED = 1;</code>
   */
  public static final int COMBAT_REWARD_STATUS_REWARDS_GRANTED_VALUE = 1;
  /**
   * <code>COMBAT_REWARD_STATUS_MAX_REWARDS_RECEIVED = 2;</code>
   */
  public static final int COMBAT_REWARD_STATUS_MAX_REWARDS_RECEIVED_VALUE = 2;
  /**
   * <code>COMBAT_REWARD_STATUS_PLAYER_BAG_FULL = 3;</code>
   */
  public static final int COMBAT_REWARD_STATUS_PLAYER_BAG_FULL_VALUE = 3;
  /**
   * <code>COMBAT_REWARD_STATUS_NO_REWARDS = 4;</code>
   */
  public static final int COMBAT_REWARD_STATUS_NO_REWARDS_VALUE = 4;


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
  public static CombatRewardStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CombatRewardStatus forNumber(int value) {
    switch (value) {
      case 0: return COMBAT_REWARD_STATUS_UNSET_REWARD_STATUS;
      case 1: return COMBAT_REWARD_STATUS_REWARDS_GRANTED;
      case 2: return COMBAT_REWARD_STATUS_MAX_REWARDS_RECEIVED;
      case 3: return COMBAT_REWARD_STATUS_PLAYER_BAG_FULL;
      case 4: return COMBAT_REWARD_STATUS_NO_REWARDS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CombatRewardStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CombatRewardStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CombatRewardStatus>() {
          public CombatRewardStatus findValueByNumber(int number) {
            return CombatRewardStatus.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(33);
  }

  private static final CombatRewardStatus[] VALUES = values();

  public static CombatRewardStatus valueOf(
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

  private CombatRewardStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CombatRewardStatus)
}

