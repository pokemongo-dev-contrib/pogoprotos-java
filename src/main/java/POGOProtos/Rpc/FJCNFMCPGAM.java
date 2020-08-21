// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FJCNFMCPGAM
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.FJCNFMCPGAM}
 */
public enum FJCNFMCPGAM
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FJCNFMCPGAM_UNDEFINED_INVASION_EVENT = 0;</code>
   */
  FJCNFMCPGAM_UNDEFINED_INVASION_EVENT(0),
  /**
   * <code>FJCNFMCPGAM_INVASION_NPC_TAP = 1;</code>
   */
  FJCNFMCPGAM_INVASION_NPC_TAP(1),
  /**
   * <code>FJCNFMCPGAM_INVASION_BATTLE_STARTED = 2;</code>
   */
  FJCNFMCPGAM_INVASION_BATTLE_STARTED(2),
  /**
   * <code>FJCNFMCPGAM_INVASION_BATTLE_FINISHED = 3;</code>
   */
  FJCNFMCPGAM_INVASION_BATTLE_FINISHED(3),
  /**
   * <code>FJCNFMCPGAM_INVASION_ENCOUNTER_STARTED = 4;</code>
   */
  FJCNFMCPGAM_INVASION_ENCOUNTER_STARTED(4),
  /**
   * <code>FJCNFMCPGAM_INVASION_ENCOUNTER_FINISHED = 5;</code>
   */
  FJCNFMCPGAM_INVASION_ENCOUNTER_FINISHED(5),
  /**
   * <code>FJCNFMCPGAM_INVASION_POKEMON_PURIFIED = 6;</code>
   */
  FJCNFMCPGAM_INVASION_POKEMON_PURIFIED(6),
  /**
   * <code>FJCNFMCPGAM_INVASION_AFTER_POI_EXITED = 7;</code>
   */
  FJCNFMCPGAM_INVASION_AFTER_POI_EXITED(7),
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_OPENED = 8;</code>
   */
  FJCNFMCPGAM_INVASION_RADAR_VIEW_OPENED(8),
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_CLOSED = 9;</code>
   */
  FJCNFMCPGAM_INVASION_RADAR_VIEW_CLOSED(9),
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_EMPTY = 10;</code>
   */
  FJCNFMCPGAM_INVASION_RADAR_VIEW_EMPTY(10),
  /**
   * <code>FJCNFMCPGAM_INVASION_DECOY_FOUND = 11;</code>
   */
  FJCNFMCPGAM_INVASION_DECOY_FOUND(11),
  /**
   * <code>FJCNFMCPGAM_INVASION_GIOVANNI_FOUND = 12;</code>
   */
  FJCNFMCPGAM_INVASION_GIOVANNI_FOUND(12),
  /**
   * <code>FJCNFMCPGAM_INVASION_BALLOON_TAP = 13;</code>
   */
  FJCNFMCPGAM_INVASION_BALLOON_TAP(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FJCNFMCPGAM_UNDEFINED_INVASION_EVENT = 0;</code>
   */
  public static final int FJCNFMCPGAM_UNDEFINED_INVASION_EVENT_VALUE = 0;
  /**
   * <code>FJCNFMCPGAM_INVASION_NPC_TAP = 1;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_NPC_TAP_VALUE = 1;
  /**
   * <code>FJCNFMCPGAM_INVASION_BATTLE_STARTED = 2;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_BATTLE_STARTED_VALUE = 2;
  /**
   * <code>FJCNFMCPGAM_INVASION_BATTLE_FINISHED = 3;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_BATTLE_FINISHED_VALUE = 3;
  /**
   * <code>FJCNFMCPGAM_INVASION_ENCOUNTER_STARTED = 4;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_ENCOUNTER_STARTED_VALUE = 4;
  /**
   * <code>FJCNFMCPGAM_INVASION_ENCOUNTER_FINISHED = 5;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_ENCOUNTER_FINISHED_VALUE = 5;
  /**
   * <code>FJCNFMCPGAM_INVASION_POKEMON_PURIFIED = 6;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_POKEMON_PURIFIED_VALUE = 6;
  /**
   * <code>FJCNFMCPGAM_INVASION_AFTER_POI_EXITED = 7;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_AFTER_POI_EXITED_VALUE = 7;
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_OPENED = 8;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_RADAR_VIEW_OPENED_VALUE = 8;
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_CLOSED = 9;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_RADAR_VIEW_CLOSED_VALUE = 9;
  /**
   * <code>FJCNFMCPGAM_INVASION_RADAR_VIEW_EMPTY = 10;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_RADAR_VIEW_EMPTY_VALUE = 10;
  /**
   * <code>FJCNFMCPGAM_INVASION_DECOY_FOUND = 11;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_DECOY_FOUND_VALUE = 11;
  /**
   * <code>FJCNFMCPGAM_INVASION_GIOVANNI_FOUND = 12;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_GIOVANNI_FOUND_VALUE = 12;
  /**
   * <code>FJCNFMCPGAM_INVASION_BALLOON_TAP = 13;</code>
   */
  public static final int FJCNFMCPGAM_INVASION_BALLOON_TAP_VALUE = 13;


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
  public static FJCNFMCPGAM valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FJCNFMCPGAM forNumber(int value) {
    switch (value) {
      case 0: return FJCNFMCPGAM_UNDEFINED_INVASION_EVENT;
      case 1: return FJCNFMCPGAM_INVASION_NPC_TAP;
      case 2: return FJCNFMCPGAM_INVASION_BATTLE_STARTED;
      case 3: return FJCNFMCPGAM_INVASION_BATTLE_FINISHED;
      case 4: return FJCNFMCPGAM_INVASION_ENCOUNTER_STARTED;
      case 5: return FJCNFMCPGAM_INVASION_ENCOUNTER_FINISHED;
      case 6: return FJCNFMCPGAM_INVASION_POKEMON_PURIFIED;
      case 7: return FJCNFMCPGAM_INVASION_AFTER_POI_EXITED;
      case 8: return FJCNFMCPGAM_INVASION_RADAR_VIEW_OPENED;
      case 9: return FJCNFMCPGAM_INVASION_RADAR_VIEW_CLOSED;
      case 10: return FJCNFMCPGAM_INVASION_RADAR_VIEW_EMPTY;
      case 11: return FJCNFMCPGAM_INVASION_DECOY_FOUND;
      case 12: return FJCNFMCPGAM_INVASION_GIOVANNI_FOUND;
      case 13: return FJCNFMCPGAM_INVASION_BALLOON_TAP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FJCNFMCPGAM>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FJCNFMCPGAM> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FJCNFMCPGAM>() {
          public FJCNFMCPGAM findValueByNumber(int number) {
            return FJCNFMCPGAM.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(70);
  }

  private static final FJCNFMCPGAM[] VALUES = values();

  public static FJCNFMCPGAM valueOf(
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

  private FJCNFMCPGAM(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FJCNFMCPGAM)
}

