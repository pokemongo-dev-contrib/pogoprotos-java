// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.OmniNotificationSubscriptionType}
 */
public enum OmniNotificationSubscriptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_OPTED_IN = 0;</code>
   */
  PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_OPTED_IN(0),
  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_SUBSCRIBED = 1;</code>
   */
  PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_SUBSCRIBED(1),
  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_UNSUBSCRIBED = 2;</code>
   */
  PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_UNSUBSCRIBED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_OPTED_IN = 0;</code>
   */
  public static final int PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_OPTED_IN_VALUE = 0;
  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_SUBSCRIBED = 1;</code>
   */
  public static final int PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_SUBSCRIBED_VALUE = 1;
  /**
   * <code>PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_UNSUBSCRIBED = 2;</code>
   */
  public static final int PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_UNSUBSCRIBED_VALUE = 2;


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
  public static OmniNotificationSubscriptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniNotificationSubscriptionType forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_OPTED_IN;
      case 1: return PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_SUBSCRIBED;
      case 2: return PLATFORM_OMNI_NOTIFICATION_SUBSCRIPTION_TYPE_UNSUBSCRIBED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniNotificationSubscriptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniNotificationSubscriptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniNotificationSubscriptionType>() {
          public OmniNotificationSubscriptionType findValueByNumber(int number) {
            return OmniNotificationSubscriptionType.forNumber(number);
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

  private static final OmniNotificationSubscriptionType[] VALUES = values();

  public static OmniNotificationSubscriptionType valueOf(
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

  private OmniNotificationSubscriptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OmniNotificationSubscriptionType)
}

