// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.SocialTelemetryIds}
 */
public enum SocialTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL = 0;</code>
   */
  SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL(0),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_TAB = 1;</code>
   */
  SOCIAL_TELEMETRY_IDS_FRIEND_TAB(1),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_NOTIFICATION_TAB = 2;</code>
   */
  SOCIAL_TELEMETRY_IDS_NOTIFICATION_TAB(2),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_PROFILE = 3;</code>
   */
  SOCIAL_TELEMETRY_IDS_FRIEND_PROFILE(3),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_OPEN_FRIEND_SHIP_LEVEL_DETAIL = 4;</code>
   */
  SOCIAL_TELEMETRY_IDS_OPEN_FRIEND_SHIP_LEVEL_DETAIL(4),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_CLOSE_OPEN_GIFT_CONFIRMATION = 5;</code>
   */
  SOCIAL_TELEMETRY_IDS_CLOSE_OPEN_GIFT_CONFIRMATION(5),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_LIST_SORT_CHANGED = 6;</code>
   */
  SOCIAL_TELEMETRY_IDS_FRIEND_LIST_SORT_CHANGED(6),
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_LIST_CLOSED = 7;</code>
   */
  SOCIAL_TELEMETRY_IDS_FRIEND_LIST_CLOSED(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL = 0;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL_VALUE = 0;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_TAB = 1;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_FRIEND_TAB_VALUE = 1;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_NOTIFICATION_TAB = 2;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_NOTIFICATION_TAB_VALUE = 2;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_PROFILE = 3;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_FRIEND_PROFILE_VALUE = 3;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_OPEN_FRIEND_SHIP_LEVEL_DETAIL = 4;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_OPEN_FRIEND_SHIP_LEVEL_DETAIL_VALUE = 4;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_CLOSE_OPEN_GIFT_CONFIRMATION = 5;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_CLOSE_OPEN_GIFT_CONFIRMATION_VALUE = 5;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_LIST_SORT_CHANGED = 6;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_FRIEND_LIST_SORT_CHANGED_VALUE = 6;
  /**
   * <code>SOCIAL_TELEMETRY_IDS_FRIEND_LIST_CLOSED = 7;</code>
   */
  public static final int SOCIAL_TELEMETRY_IDS_FRIEND_LIST_CLOSED_VALUE = 7;


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
  public static SocialTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SocialTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL;
      case 1: return SOCIAL_TELEMETRY_IDS_FRIEND_TAB;
      case 2: return SOCIAL_TELEMETRY_IDS_NOTIFICATION_TAB;
      case 3: return SOCIAL_TELEMETRY_IDS_FRIEND_PROFILE;
      case 4: return SOCIAL_TELEMETRY_IDS_OPEN_FRIEND_SHIP_LEVEL_DETAIL;
      case 5: return SOCIAL_TELEMETRY_IDS_CLOSE_OPEN_GIFT_CONFIRMATION;
      case 6: return SOCIAL_TELEMETRY_IDS_FRIEND_LIST_SORT_CHANGED;
      case 7: return SOCIAL_TELEMETRY_IDS_FRIEND_LIST_CLOSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SocialTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SocialTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SocialTelemetryIds>() {
          public SocialTelemetryIds findValueByNumber(int number) {
            return SocialTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(139);
  }

  private static final SocialTelemetryIds[] VALUES = values();

  public static SocialTelemetryIds valueOf(
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

  private SocialTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SocialTelemetryIds)
}

