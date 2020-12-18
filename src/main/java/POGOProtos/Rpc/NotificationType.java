// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.NotificationType}
 */
public enum NotificationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOTIFICATION_TYPE_NO_NOTIFICATIONS = 0;</code>
   */
  NOTIFICATION_TYPE_NO_NOTIFICATIONS(0),
  /**
   * <code>NOTIFICATION_TYPE_POKEMON_NOTIFICATIONS = 1;</code>
   */
  NOTIFICATION_TYPE_POKEMON_NOTIFICATIONS(1),
  /**
   * <code>NOTIFICATION_TYPE_POKESTOP_NOTIFICATIONS = 2;</code>
   */
  NOTIFICATION_TYPE_POKESTOP_NOTIFICATIONS(2),
  /**
   * <code>NOTIFICATION_TYPE_ALL_NOTIFICATIONS = 3;</code>
   */
  NOTIFICATION_TYPE_ALL_NOTIFICATIONS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOTIFICATION_TYPE_NO_NOTIFICATIONS = 0;</code>
   */
  public static final int NOTIFICATION_TYPE_NO_NOTIFICATIONS_VALUE = 0;
  /**
   * <code>NOTIFICATION_TYPE_POKEMON_NOTIFICATIONS = 1;</code>
   */
  public static final int NOTIFICATION_TYPE_POKEMON_NOTIFICATIONS_VALUE = 1;
  /**
   * <code>NOTIFICATION_TYPE_POKESTOP_NOTIFICATIONS = 2;</code>
   */
  public static final int NOTIFICATION_TYPE_POKESTOP_NOTIFICATIONS_VALUE = 2;
  /**
   * <code>NOTIFICATION_TYPE_ALL_NOTIFICATIONS = 3;</code>
   */
  public static final int NOTIFICATION_TYPE_ALL_NOTIFICATIONS_VALUE = 3;


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
  public static NotificationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotificationType forNumber(int value) {
    switch (value) {
      case 0: return NOTIFICATION_TYPE_NO_NOTIFICATIONS;
      case 1: return NOTIFICATION_TYPE_POKEMON_NOTIFICATIONS;
      case 2: return NOTIFICATION_TYPE_POKESTOP_NOTIFICATIONS;
      case 3: return NOTIFICATION_TYPE_ALL_NOTIFICATIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotificationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NotificationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NotificationType>() {
          public NotificationType findValueByNumber(int number) {
            return NotificationType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(87);
  }

  private static final NotificationType[] VALUES = values();

  public static NotificationType valueOf(
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

  private NotificationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NotificationType)
}

