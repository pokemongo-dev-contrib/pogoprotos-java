// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.GenericClickTelemetryIds}
 */
public enum GenericClickTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_UNDEFINED_GENERIC_EVENT = 0;</code>
   */
  GENERIC_CLICK_TELEMETRY_IDS_UNDEFINED_GENERIC_EVENT(0),
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_SHOW = 1;</code>
   */
  GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_SHOW(1),
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_PASSENGER = 2;</code>
   */
  GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_PASSENGER(2),
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_CACHE_RESET_CLICKED = 3;</code>
   */
  GENERIC_CLICK_TELEMETRY_IDS_CACHE_RESET_CLICKED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_UNDEFINED_GENERIC_EVENT = 0;</code>
   */
  public static final int GENERIC_CLICK_TELEMETRY_IDS_UNDEFINED_GENERIC_EVENT_VALUE = 0;
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_SHOW = 1;</code>
   */
  public static final int GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_SHOW_VALUE = 1;
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_PASSENGER = 2;</code>
   */
  public static final int GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_PASSENGER_VALUE = 2;
  /**
   * <code>GENERIC_CLICK_TELEMETRY_IDS_CACHE_RESET_CLICKED = 3;</code>
   */
  public static final int GENERIC_CLICK_TELEMETRY_IDS_CACHE_RESET_CLICKED_VALUE = 3;


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
  public static GenericClickTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GenericClickTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return GENERIC_CLICK_TELEMETRY_IDS_UNDEFINED_GENERIC_EVENT;
      case 1: return GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_SHOW;
      case 2: return GENERIC_CLICK_TELEMETRY_IDS_SPEED_WARNING_PASSENGER;
      case 3: return GENERIC_CLICK_TELEMETRY_IDS_CACHE_RESET_CLICKED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GenericClickTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GenericClickTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GenericClickTelemetryIds>() {
          public GenericClickTelemetryIds findValueByNumber(int number) {
            return GenericClickTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(49);
  }

  private static final GenericClickTelemetryIds[] VALUES = values();

  public static GenericClickTelemetryIds valueOf(
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

  private GenericClickTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GenericClickTelemetryIds)
}

