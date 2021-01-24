// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.ProfilePageTelemetryIds}
 */
public enum ProfilePageTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_UNDEFINED_PROFILE_PAGE = 0;</code>
   */
  PROFILE_PAGE_TELEMETRY_IDS_UNDEFINED_PROFILE_PAGE(0),
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_SHOP_FROM_PROFILE = 1;</code>
   */
  PROFILE_PAGE_TELEMETRY_IDS_SHOP_FROM_PROFILE(1),
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_LOG = 2;</code>
   */
  PROFILE_PAGE_TELEMETRY_IDS_LOG(2),
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_SET_BUDDY = 3;</code>
   */
  PROFILE_PAGE_TELEMETRY_IDS_SET_BUDDY(3),
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_CUSTOMIZE_AVATAR = 4;</code>
   */
  PROFILE_PAGE_TELEMETRY_IDS_CUSTOMIZE_AVATAR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_UNDEFINED_PROFILE_PAGE = 0;</code>
   */
  public static final int PROFILE_PAGE_TELEMETRY_IDS_UNDEFINED_PROFILE_PAGE_VALUE = 0;
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_SHOP_FROM_PROFILE = 1;</code>
   */
  public static final int PROFILE_PAGE_TELEMETRY_IDS_SHOP_FROM_PROFILE_VALUE = 1;
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_LOG = 2;</code>
   */
  public static final int PROFILE_PAGE_TELEMETRY_IDS_LOG_VALUE = 2;
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_SET_BUDDY = 3;</code>
   */
  public static final int PROFILE_PAGE_TELEMETRY_IDS_SET_BUDDY_VALUE = 3;
  /**
   * <code>PROFILE_PAGE_TELEMETRY_IDS_CUSTOMIZE_AVATAR = 4;</code>
   */
  public static final int PROFILE_PAGE_TELEMETRY_IDS_CUSTOMIZE_AVATAR_VALUE = 4;


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
  public static ProfilePageTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProfilePageTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return PROFILE_PAGE_TELEMETRY_IDS_UNDEFINED_PROFILE_PAGE;
      case 1: return PROFILE_PAGE_TELEMETRY_IDS_SHOP_FROM_PROFILE;
      case 2: return PROFILE_PAGE_TELEMETRY_IDS_LOG;
      case 3: return PROFILE_PAGE_TELEMETRY_IDS_SET_BUDDY;
      case 4: return PROFILE_PAGE_TELEMETRY_IDS_CUSTOMIZE_AVATAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProfilePageTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProfilePageTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProfilePageTelemetryIds>() {
          public ProfilePageTelemetryIds findValueByNumber(int number) {
            return ProfilePageTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(123);
  }

  private static final ProfilePageTelemetryIds[] VALUES = values();

  public static ProfilePageTelemetryIds valueOf(
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

  private ProfilePageTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ProfilePageTelemetryIds)
}

