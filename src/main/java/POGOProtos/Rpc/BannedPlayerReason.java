// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BannedPlayerReason}
 */
public enum BannedPlayerReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BANNED_PLAYER_REASON_BANNED = 0;</code>
   */
  BANNED_PLAYER_REASON_BANNED(0),
  /**
   * <code>BANNED_PLAYER_REASON_UNAUTHORIZED_DEVICE = 1;</code>
   */
  BANNED_PLAYER_REASON_UNAUTHORIZED_DEVICE(1),
  /**
   * <code>BANNED_PLAYER_REASON_SUSPENDED = 2;</code>
   */
  BANNED_PLAYER_REASON_SUSPENDED(2),
  /**
   * <code>BANNED_PLAYER_REASON_RESTRICTION_VIOLATION = 3;</code>
   */
  BANNED_PLAYER_REASON_RESTRICTION_VIOLATION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BANNED_PLAYER_REASON_BANNED = 0;</code>
   */
  public static final int BANNED_PLAYER_REASON_BANNED_VALUE = 0;
  /**
   * <code>BANNED_PLAYER_REASON_UNAUTHORIZED_DEVICE = 1;</code>
   */
  public static final int BANNED_PLAYER_REASON_UNAUTHORIZED_DEVICE_VALUE = 1;
  /**
   * <code>BANNED_PLAYER_REASON_SUSPENDED = 2;</code>
   */
  public static final int BANNED_PLAYER_REASON_SUSPENDED_VALUE = 2;
  /**
   * <code>BANNED_PLAYER_REASON_RESTRICTION_VIOLATION = 3;</code>
   */
  public static final int BANNED_PLAYER_REASON_RESTRICTION_VIOLATION_VALUE = 3;


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
  public static BannedPlayerReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BannedPlayerReason forNumber(int value) {
    switch (value) {
      case 0: return BANNED_PLAYER_REASON_BANNED;
      case 1: return BANNED_PLAYER_REASON_UNAUTHORIZED_DEVICE;
      case 2: return BANNED_PLAYER_REASON_SUSPENDED;
      case 3: return BANNED_PLAYER_REASON_RESTRICTION_VIOLATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BannedPlayerReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BannedPlayerReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BannedPlayerReason>() {
          public BannedPlayerReason findValueByNumber(int number) {
            return BannedPlayerReason.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(15);
  }

  private static final BannedPlayerReason[] VALUES = values();

  public static BannedPlayerReason valueOf(
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

  private BannedPlayerReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BannedPlayerReason)
}

