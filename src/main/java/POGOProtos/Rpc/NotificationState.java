// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.NotificationState}
 */
public enum NotificationState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOTIFICATION_STATE_UNSET_STATE = 0;</code>
   */
  NOTIFICATION_STATE_UNSET_STATE(0),
  /**
   * <code>NOTIFICATION_STATE_VIEWED = 1;</code>
   */
  NOTIFICATION_STATE_VIEWED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOTIFICATION_STATE_UNSET_STATE = 0;</code>
   */
  public static final int NOTIFICATION_STATE_UNSET_STATE_VALUE = 0;
  /**
   * <code>NOTIFICATION_STATE_VIEWED = 1;</code>
   */
  public static final int NOTIFICATION_STATE_VIEWED_VALUE = 1;


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
  public static NotificationState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotificationState forNumber(int value) {
    switch (value) {
      case 0: return NOTIFICATION_STATE_UNSET_STATE;
      case 1: return NOTIFICATION_STATE_VIEWED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotificationState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NotificationState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NotificationState>() {
          public NotificationState findValueByNumber(int number) {
            return NotificationState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(85);
  }

  private static final NotificationState[] VALUES = values();

  public static NotificationState valueOf(
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

  private NotificationState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NotificationState)
}

