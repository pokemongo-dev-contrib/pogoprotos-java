// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CombatHubEntranceTelemetryIds}
 */
public enum CombatHubEntranceTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT = 0;</code>
   */
  COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT(0),
  /**
   * <code>COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_CLICKED_COMBAT_HUB_BUTTON = 1;</code>
   */
  COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_CLICKED_COMBAT_HUB_BUTTON(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT = 0;</code>
   */
  public static final int COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT_VALUE = 0;
  /**
   * <code>COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_CLICKED_COMBAT_HUB_BUTTON = 1;</code>
   */
  public static final int COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_CLICKED_COMBAT_HUB_BUTTON_VALUE = 1;


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
  public static CombatHubEntranceTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CombatHubEntranceTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT;
      case 1: return COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_CLICKED_COMBAT_HUB_BUTTON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CombatHubEntranceTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CombatHubEntranceTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CombatHubEntranceTelemetryIds>() {
          public CombatHubEntranceTelemetryIds findValueByNumber(int number) {
            return CombatHubEntranceTelemetryIds.forNumber(number);
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

  private static final CombatHubEntranceTelemetryIds[] VALUES = values();

  public static CombatHubEntranceTelemetryIds valueOf(
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

  private CombatHubEntranceTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CombatHubEntranceTelemetryIds)
}

