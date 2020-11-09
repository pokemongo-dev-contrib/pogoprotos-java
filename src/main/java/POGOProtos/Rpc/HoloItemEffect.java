// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloItemEffect}
 */
public enum HoloItemEffect
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ITEM_EFFECT_NONE = 0;</code>
   */
  ITEM_EFFECT_NONE(0),
  /**
   * <code>ITEM_EFFECT_CAP_NO_FLEE = 1000;</code>
   */
  ITEM_EFFECT_CAP_NO_FLEE(1000),
  /**
   * <code>ITEM_EFFECT_CAP_NO_MOVEMENT = 1002;</code>
   */
  ITEM_EFFECT_CAP_NO_MOVEMENT(1002),
  /**
   * <code>ITEM_EFFECT_CAP_NO_THREAT = 1003;</code>
   */
  ITEM_EFFECT_CAP_NO_THREAT(1003),
  /**
   * <code>ITEM_EFFECT_CAP_TARGET_MAX = 1004;</code>
   */
  ITEM_EFFECT_CAP_TARGET_MAX(1004),
  /**
   * <code>ITEM_EFFECT_CAP_TARGET_SLOW = 1005;</code>
   */
  ITEM_EFFECT_CAP_TARGET_SLOW(1005),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_NIGHT = 1006;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_NIGHT(1006),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_TRAINER = 1007;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_TRAINER(1007),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_FIRST_THROW = 1008;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_FIRST_THROW(1008),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_LEGEND = 1009;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_LEGEND(1009),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_HEAVY = 1010;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_HEAVY(1010),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_REPEAT = 1011;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_REPEAT(1011),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_MULTI_THROW = 1012;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_MULTI_THROW(1012),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_ALWAYS = 1013;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_ALWAYS(1013),
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_SINGLE_THROW = 1014;</code>
   */
  ITEM_EFFECT_CAP_CHANCE_SINGLE_THROW(1014),
  /**
   * <code>ITEM_EFFECT_CANDY_AWARD = 1015;</code>
   */
  ITEM_EFFECT_CANDY_AWARD(1015),
  /**
   * <code>ITEM_EFFECT_FULL_MOTIVATION = 1016;</code>
   */
  ITEM_EFFECT_FULL_MOTIVATION(1016),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ITEM_EFFECT_NONE = 0;</code>
   */
  public static final int ITEM_EFFECT_NONE_VALUE = 0;
  /**
   * <code>ITEM_EFFECT_CAP_NO_FLEE = 1000;</code>
   */
  public static final int ITEM_EFFECT_CAP_NO_FLEE_VALUE = 1000;
  /**
   * <code>ITEM_EFFECT_CAP_NO_MOVEMENT = 1002;</code>
   */
  public static final int ITEM_EFFECT_CAP_NO_MOVEMENT_VALUE = 1002;
  /**
   * <code>ITEM_EFFECT_CAP_NO_THREAT = 1003;</code>
   */
  public static final int ITEM_EFFECT_CAP_NO_THREAT_VALUE = 1003;
  /**
   * <code>ITEM_EFFECT_CAP_TARGET_MAX = 1004;</code>
   */
  public static final int ITEM_EFFECT_CAP_TARGET_MAX_VALUE = 1004;
  /**
   * <code>ITEM_EFFECT_CAP_TARGET_SLOW = 1005;</code>
   */
  public static final int ITEM_EFFECT_CAP_TARGET_SLOW_VALUE = 1005;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_NIGHT = 1006;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_NIGHT_VALUE = 1006;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_TRAINER = 1007;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_TRAINER_VALUE = 1007;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_FIRST_THROW = 1008;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_FIRST_THROW_VALUE = 1008;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_LEGEND = 1009;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_LEGEND_VALUE = 1009;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_HEAVY = 1010;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_HEAVY_VALUE = 1010;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_REPEAT = 1011;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_REPEAT_VALUE = 1011;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_MULTI_THROW = 1012;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_MULTI_THROW_VALUE = 1012;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_ALWAYS = 1013;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_ALWAYS_VALUE = 1013;
  /**
   * <code>ITEM_EFFECT_CAP_CHANCE_SINGLE_THROW = 1014;</code>
   */
  public static final int ITEM_EFFECT_CAP_CHANCE_SINGLE_THROW_VALUE = 1014;
  /**
   * <code>ITEM_EFFECT_CANDY_AWARD = 1015;</code>
   */
  public static final int ITEM_EFFECT_CANDY_AWARD_VALUE = 1015;
  /**
   * <code>ITEM_EFFECT_FULL_MOTIVATION = 1016;</code>
   */
  public static final int ITEM_EFFECT_FULL_MOTIVATION_VALUE = 1016;


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
  public static HoloItemEffect valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloItemEffect forNumber(int value) {
    switch (value) {
      case 0: return ITEM_EFFECT_NONE;
      case 1000: return ITEM_EFFECT_CAP_NO_FLEE;
      case 1002: return ITEM_EFFECT_CAP_NO_MOVEMENT;
      case 1003: return ITEM_EFFECT_CAP_NO_THREAT;
      case 1004: return ITEM_EFFECT_CAP_TARGET_MAX;
      case 1005: return ITEM_EFFECT_CAP_TARGET_SLOW;
      case 1006: return ITEM_EFFECT_CAP_CHANCE_NIGHT;
      case 1007: return ITEM_EFFECT_CAP_CHANCE_TRAINER;
      case 1008: return ITEM_EFFECT_CAP_CHANCE_FIRST_THROW;
      case 1009: return ITEM_EFFECT_CAP_CHANCE_LEGEND;
      case 1010: return ITEM_EFFECT_CAP_CHANCE_HEAVY;
      case 1011: return ITEM_EFFECT_CAP_CHANCE_REPEAT;
      case 1012: return ITEM_EFFECT_CAP_CHANCE_MULTI_THROW;
      case 1013: return ITEM_EFFECT_CAP_CHANCE_ALWAYS;
      case 1014: return ITEM_EFFECT_CAP_CHANCE_SINGLE_THROW;
      case 1015: return ITEM_EFFECT_CANDY_AWARD;
      case 1016: return ITEM_EFFECT_FULL_MOTIVATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloItemEffect>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloItemEffect> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloItemEffect>() {
          public HoloItemEffect findValueByNumber(int number) {
            return HoloItemEffect.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(52);
  }

  private static final HoloItemEffect[] VALUES = values();

  public static HoloItemEffect valueOf(
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

  private HoloItemEffect(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloItemEffect)
}

