// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IncidentDynamicStringTypes}
 */
public enum IncidentDynamicStringTypes
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_GREETING = 0;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_GREETING(0),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_CHALLENGE = 1;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_CHALLENGE(1),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_DEFEAT = 2;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_DEFEAT(2),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_VICTORY = 3;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_VICTORY(3),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_PRE_BATTLE = 4;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_PRE_BATTLE(4),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_POST_BATTLE = 5;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_POST_BATTLE(5),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_ITEMS_STOLEN = 6;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_ITEMS_STOLEN(6),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_TUTORIAL = 7;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_TUTORIAL(7),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_QUOTE = 8;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_QUOTE(8),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_CANDELA_INSPIRE = 9;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_CANDELA_INSPIRE(9),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_BLANCHE_INSPIRE = 10;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_BLANCHE_INSPIRE(10),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_SPARK_INSPIRE = 11;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_SPARK_INSPIRE(11),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_GRUNT_DECOY = 12;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_GRUNT_DECOY(12),
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_DECOY_QUOTE = 13;</code>
   */
  INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_DECOY_QUOTE(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_GREETING = 0;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_GREETING_VALUE = 0;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_CHALLENGE = 1;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_CHALLENGE_VALUE = 1;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_DEFEAT = 2;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_DEFEAT_VALUE = 2;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_VICTORY = 3;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_VICTORY_VALUE = 3;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_PRE_BATTLE = 4;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_PRE_BATTLE_VALUE = 4;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_POST_BATTLE = 5;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_POST_BATTLE_VALUE = 5;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_ITEMS_STOLEN = 6;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_ITEMS_STOLEN_VALUE = 6;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_TUTORIAL = 7;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_TUTORIAL_VALUE = 7;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_QUOTE = 8;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_QUOTE_VALUE = 8;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_CANDELA_INSPIRE = 9;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_CANDELA_INSPIRE_VALUE = 9;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_BLANCHE_INSPIRE = 10;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_BLANCHE_INSPIRE_VALUE = 10;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_SPARK_INSPIRE = 11;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_SPARK_INSPIRE_VALUE = 11;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_GRUNT_DECOY = 12;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_GRUNT_DECOY_VALUE = 12;
  /**
   * <code>INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_DECOY_QUOTE = 13;</code>
   */
  public static final int INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_DECOY_QUOTE_VALUE = 13;


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
  public static IncidentDynamicStringTypes valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentDynamicStringTypes forNumber(int value) {
    switch (value) {
      case 0: return INCIDENT_DYNAMIC_STRING_TYPES_GREETING;
      case 1: return INCIDENT_DYNAMIC_STRING_TYPES_CHALLENGE;
      case 2: return INCIDENT_DYNAMIC_STRING_TYPES_DEFEAT;
      case 3: return INCIDENT_DYNAMIC_STRING_TYPES_VICTORY;
      case 4: return INCIDENT_DYNAMIC_STRING_TYPES_PRE_BATTLE;
      case 5: return INCIDENT_DYNAMIC_STRING_TYPES_POST_BATTLE;
      case 6: return INCIDENT_DYNAMIC_STRING_TYPES_ITEMS_STOLEN;
      case 7: return INCIDENT_DYNAMIC_STRING_TYPES_TUTORIAL;
      case 8: return INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_QUOTE;
      case 9: return INCIDENT_DYNAMIC_STRING_TYPES_CANDELA_INSPIRE;
      case 10: return INCIDENT_DYNAMIC_STRING_TYPES_BLANCHE_INSPIRE;
      case 11: return INCIDENT_DYNAMIC_STRING_TYPES_SPARK_INSPIRE;
      case 12: return INCIDENT_DYNAMIC_STRING_TYPES_GRUNT_DECOY;
      case 13: return INCIDENT_DYNAMIC_STRING_TYPES_COMBAT_DECOY_QUOTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentDynamicStringTypes>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentDynamicStringTypes> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentDynamicStringTypes>() {
          public IncidentDynamicStringTypes findValueByNumber(int number) {
            return IncidentDynamicStringTypes.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(72);
  }

  private static final IncidentDynamicStringTypes[] VALUES = values();

  public static IncidentDynamicStringTypes valueOf(
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

  private IncidentDynamicStringTypes(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IncidentDynamicStringTypes)
}

