// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.SubscriptionState}
 */
public enum SubscriptionState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUBSCRIPTION_STATE_UNKNOWN = 0;</code>
   */
  SUBSCRIPTION_STATE_UNKNOWN(0),
  /**
   * <code>SUBSCRIPTION_STATE_ACTIVE = 1;</code>
   */
  SUBSCRIPTION_STATE_ACTIVE(1),
  /**
   * <code>SUBSCRIPTION_STATE_CANCELLED = 2;</code>
   */
  SUBSCRIPTION_STATE_CANCELLED(2),
  /**
   * <code>SUBSCRIPTION_STATE_EXPIRED = 3;</code>
   */
  SUBSCRIPTION_STATE_EXPIRED(3),
  /**
   * <code>SUBSCRIPTION_STATE_GRACE_PERIOD = 4;</code>
   */
  SUBSCRIPTION_STATE_GRACE_PERIOD(4),
  /**
   * <code>SUBSCRIPTION_STATE_FREE_TRIAL = 5;</code>
   */
  SUBSCRIPTION_STATE_FREE_TRIAL(5),
  /**
   * <code>SUBSCRIPTION_STATE_PENDING_PURCHASE = 6;</code>
   */
  SUBSCRIPTION_STATE_PENDING_PURCHASE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUBSCRIPTION_STATE_UNKNOWN = 0;</code>
   */
  public static final int SUBSCRIPTION_STATE_UNKNOWN_VALUE = 0;
  /**
   * <code>SUBSCRIPTION_STATE_ACTIVE = 1;</code>
   */
  public static final int SUBSCRIPTION_STATE_ACTIVE_VALUE = 1;
  /**
   * <code>SUBSCRIPTION_STATE_CANCELLED = 2;</code>
   */
  public static final int SUBSCRIPTION_STATE_CANCELLED_VALUE = 2;
  /**
   * <code>SUBSCRIPTION_STATE_EXPIRED = 3;</code>
   */
  public static final int SUBSCRIPTION_STATE_EXPIRED_VALUE = 3;
  /**
   * <code>SUBSCRIPTION_STATE_GRACE_PERIOD = 4;</code>
   */
  public static final int SUBSCRIPTION_STATE_GRACE_PERIOD_VALUE = 4;
  /**
   * <code>SUBSCRIPTION_STATE_FREE_TRIAL = 5;</code>
   */
  public static final int SUBSCRIPTION_STATE_FREE_TRIAL_VALUE = 5;
  /**
   * <code>SUBSCRIPTION_STATE_PENDING_PURCHASE = 6;</code>
   */
  public static final int SUBSCRIPTION_STATE_PENDING_PURCHASE_VALUE = 6;


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
  public static SubscriptionState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SubscriptionState forNumber(int value) {
    switch (value) {
      case 0: return SUBSCRIPTION_STATE_UNKNOWN;
      case 1: return SUBSCRIPTION_STATE_ACTIVE;
      case 2: return SUBSCRIPTION_STATE_CANCELLED;
      case 3: return SUBSCRIPTION_STATE_EXPIRED;
      case 4: return SUBSCRIPTION_STATE_GRACE_PERIOD;
      case 5: return SUBSCRIPTION_STATE_FREE_TRIAL;
      case 6: return SUBSCRIPTION_STATE_PENDING_PURCHASE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SubscriptionState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SubscriptionState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SubscriptionState>() {
          public SubscriptionState findValueByNumber(int number) {
            return SubscriptionState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(144);
  }

  private static final SubscriptionState[] VALUES = values();

  public static SubscriptionState valueOf(
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

  private SubscriptionState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SubscriptionState)
}

