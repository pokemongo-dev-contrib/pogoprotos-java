// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.InvasionTelemetryIds}
 */
public enum InvasionTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INVASION_TELEMETRY_IDS_UNDEFINED_INVASION_EVENT = 0;</code>
   */
  INVASION_TELEMETRY_IDS_UNDEFINED_INVASION_EVENT(0),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_NPC_TAP = 1;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_NPC_TAP(1),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BATTLE_STARTED = 2;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_BATTLE_STARTED(2),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BATTLE_FINISHED = 3;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_BATTLE_FINISHED(3),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_STARTED = 4;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_STARTED(4),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_FINISHED = 5;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_FINISHED(5),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_POKEMON_PURIFIED = 6;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_POKEMON_PURIFIED(6),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_AFTER_POI_EXITED = 7;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_AFTER_POI_EXITED(7),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_OPENED = 8;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_OPENED(8),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_CLOSED = 9;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_CLOSED(9),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_EMPTY = 10;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_EMPTY(10),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_DECOY_FOUND = 11;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_DECOY_FOUND(11),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_GIOVANNI_FOUND = 12;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_GIOVANNI_FOUND(12),
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BALLOON_TAP = 13;</code>
   */
  INVASION_TELEMETRY_IDS_INVASION_BALLOON_TAP(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INVASION_TELEMETRY_IDS_UNDEFINED_INVASION_EVENT = 0;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_UNDEFINED_INVASION_EVENT_VALUE = 0;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_NPC_TAP = 1;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_NPC_TAP_VALUE = 1;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BATTLE_STARTED = 2;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_BATTLE_STARTED_VALUE = 2;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BATTLE_FINISHED = 3;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_BATTLE_FINISHED_VALUE = 3;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_STARTED = 4;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_STARTED_VALUE = 4;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_FINISHED = 5;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_FINISHED_VALUE = 5;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_POKEMON_PURIFIED = 6;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_POKEMON_PURIFIED_VALUE = 6;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_AFTER_POI_EXITED = 7;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_AFTER_POI_EXITED_VALUE = 7;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_OPENED = 8;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_OPENED_VALUE = 8;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_CLOSED = 9;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_CLOSED_VALUE = 9;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_EMPTY = 10;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_EMPTY_VALUE = 10;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_DECOY_FOUND = 11;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_DECOY_FOUND_VALUE = 11;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_GIOVANNI_FOUND = 12;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_GIOVANNI_FOUND_VALUE = 12;
  /**
   * <code>INVASION_TELEMETRY_IDS_INVASION_BALLOON_TAP = 13;</code>
   */
  public static final int INVASION_TELEMETRY_IDS_INVASION_BALLOON_TAP_VALUE = 13;


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
  public static InvasionTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InvasionTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return INVASION_TELEMETRY_IDS_UNDEFINED_INVASION_EVENT;
      case 1: return INVASION_TELEMETRY_IDS_INVASION_NPC_TAP;
      case 2: return INVASION_TELEMETRY_IDS_INVASION_BATTLE_STARTED;
      case 3: return INVASION_TELEMETRY_IDS_INVASION_BATTLE_FINISHED;
      case 4: return INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_STARTED;
      case 5: return INVASION_TELEMETRY_IDS_INVASION_ENCOUNTER_FINISHED;
      case 6: return INVASION_TELEMETRY_IDS_INVASION_POKEMON_PURIFIED;
      case 7: return INVASION_TELEMETRY_IDS_INVASION_AFTER_POI_EXITED;
      case 8: return INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_OPENED;
      case 9: return INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_CLOSED;
      case 10: return INVASION_TELEMETRY_IDS_INVASION_RADAR_VIEW_EMPTY;
      case 11: return INVASION_TELEMETRY_IDS_INVASION_DECOY_FOUND;
      case 12: return INVASION_TELEMETRY_IDS_INVASION_GIOVANNI_FOUND;
      case 13: return INVASION_TELEMETRY_IDS_INVASION_BALLOON_TAP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InvasionTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InvasionTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InvasionTelemetryIds>() {
          public InvasionTelemetryIds findValueByNumber(int number) {
            return InvasionTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(78);
  }

  private static final InvasionTelemetryIds[] VALUES = values();

  public static InvasionTelemetryIds valueOf(
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

  private InvasionTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.InvasionTelemetryIds)
}

