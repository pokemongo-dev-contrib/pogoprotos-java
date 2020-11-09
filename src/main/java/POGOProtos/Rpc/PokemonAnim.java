// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PokemonAnim}
 */
public enum PokemonAnim
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POKEMON_ANIM_NONE = 0;</code>
   */
  POKEMON_ANIM_NONE(0),
  /**
   * <code>POKEMON_ANIM_IDLE_01 = 1;</code>
   */
  POKEMON_ANIM_IDLE_01(1),
  /**
   * <code>POKEMON_ANIM_IDLE_02 = 2;</code>
   */
  POKEMON_ANIM_IDLE_02(2),
  /**
   * <code>POKEMON_ANIM_LAND = 3;</code>
   */
  POKEMON_ANIM_LAND(3),
  /**
   * <code>POKEMON_ANIM_ATTACK_01 = 4;</code>
   */
  POKEMON_ANIM_ATTACK_01(4),
  /**
   * <code>POKEMON_ANIM_ATTACK_02 = 5;</code>
   */
  POKEMON_ANIM_ATTACK_02(5),
  /**
   * <code>POKEMON_ANIM_DAMAGED = 6;</code>
   */
  POKEMON_ANIM_DAMAGED(6),
  /**
   * <code>POKEMON_ANIM_STUNNED = 7;</code>
   */
  POKEMON_ANIM_STUNNED(7),
  /**
   * <code>POKEMON_ANIM_LOOP = 8;</code>
   */
  POKEMON_ANIM_LOOP(8),
  /**
   * <code>POKEMON_ANIM_SLEEP_01 = 9;</code>
   */
  POKEMON_ANIM_SLEEP_01(9),
  /**
   * <code>POKEMON_ANIM_SLEEP_02 = 10;</code>
   */
  POKEMON_ANIM_SLEEP_02(10),
  /**
   * <code>POKEMON_ANIM_SLEEP_WAIT = 11;</code>
   */
  POKEMON_ANIM_SLEEP_WAIT(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POKEMON_ANIM_NONE = 0;</code>
   */
  public static final int POKEMON_ANIM_NONE_VALUE = 0;
  /**
   * <code>POKEMON_ANIM_IDLE_01 = 1;</code>
   */
  public static final int POKEMON_ANIM_IDLE_01_VALUE = 1;
  /**
   * <code>POKEMON_ANIM_IDLE_02 = 2;</code>
   */
  public static final int POKEMON_ANIM_IDLE_02_VALUE = 2;
  /**
   * <code>POKEMON_ANIM_LAND = 3;</code>
   */
  public static final int POKEMON_ANIM_LAND_VALUE = 3;
  /**
   * <code>POKEMON_ANIM_ATTACK_01 = 4;</code>
   */
  public static final int POKEMON_ANIM_ATTACK_01_VALUE = 4;
  /**
   * <code>POKEMON_ANIM_ATTACK_02 = 5;</code>
   */
  public static final int POKEMON_ANIM_ATTACK_02_VALUE = 5;
  /**
   * <code>POKEMON_ANIM_DAMAGED = 6;</code>
   */
  public static final int POKEMON_ANIM_DAMAGED_VALUE = 6;
  /**
   * <code>POKEMON_ANIM_STUNNED = 7;</code>
   */
  public static final int POKEMON_ANIM_STUNNED_VALUE = 7;
  /**
   * <code>POKEMON_ANIM_LOOP = 8;</code>
   */
  public static final int POKEMON_ANIM_LOOP_VALUE = 8;
  /**
   * <code>POKEMON_ANIM_SLEEP_01 = 9;</code>
   */
  public static final int POKEMON_ANIM_SLEEP_01_VALUE = 9;
  /**
   * <code>POKEMON_ANIM_SLEEP_02 = 10;</code>
   */
  public static final int POKEMON_ANIM_SLEEP_02_VALUE = 10;
  /**
   * <code>POKEMON_ANIM_SLEEP_WAIT = 11;</code>
   */
  public static final int POKEMON_ANIM_SLEEP_WAIT_VALUE = 11;


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
  public static PokemonAnim valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokemonAnim forNumber(int value) {
    switch (value) {
      case 0: return POKEMON_ANIM_NONE;
      case 1: return POKEMON_ANIM_IDLE_01;
      case 2: return POKEMON_ANIM_IDLE_02;
      case 3: return POKEMON_ANIM_LAND;
      case 4: return POKEMON_ANIM_ATTACK_01;
      case 5: return POKEMON_ANIM_ATTACK_02;
      case 6: return POKEMON_ANIM_DAMAGED;
      case 7: return POKEMON_ANIM_STUNNED;
      case 8: return POKEMON_ANIM_LOOP;
      case 9: return POKEMON_ANIM_SLEEP_01;
      case 10: return POKEMON_ANIM_SLEEP_02;
      case 11: return POKEMON_ANIM_SLEEP_WAIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokemonAnim>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokemonAnim> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokemonAnim>() {
          public PokemonAnim findValueByNumber(int number) {
            return PokemonAnim.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(112);
  }

  private static final PokemonAnim[] VALUES = values();

  public static PokemonAnim valueOf(
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

  private PokemonAnim(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokemonAnim)
}

