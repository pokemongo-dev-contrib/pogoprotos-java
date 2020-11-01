// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.WarnedPlayerReason}
 */
public enum WarnedPlayerReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WARNED_PLAYER_REASON_CHEAT_WARNING = 0;</code>
   */
  WARNED_PLAYER_REASON_CHEAT_WARNING(0),
  /**
   * <code>WARNED_PLAYER_REASON_POST_SUSPENSION_WARNING = 1;</code>
   */
  WARNED_PLAYER_REASON_POST_SUSPENSION_WARNING(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WARNED_PLAYER_REASON_CHEAT_WARNING = 0;</code>
   */
  public static final int WARNED_PLAYER_REASON_CHEAT_WARNING_VALUE = 0;
  /**
   * <code>WARNED_PLAYER_REASON_POST_SUSPENSION_WARNING = 1;</code>
   */
  public static final int WARNED_PLAYER_REASON_POST_SUSPENSION_WARNING_VALUE = 1;


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
  public static WarnedPlayerReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WarnedPlayerReason forNumber(int value) {
    switch (value) {
      case 0: return WARNED_PLAYER_REASON_CHEAT_WARNING;
      case 1: return WARNED_PLAYER_REASON_POST_SUSPENSION_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WarnedPlayerReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WarnedPlayerReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WarnedPlayerReason>() {
          public WarnedPlayerReason findValueByNumber(int number) {
            return WarnedPlayerReason.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(148);
  }

  private static final WarnedPlayerReason[] VALUES = values();

  public static WarnedPlayerReason valueOf(
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

  private WarnedPlayerReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.WarnedPlayerReason)
}

