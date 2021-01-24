// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PokemonBadge}
 */
public enum PokemonBadge
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POKEMON_BADGE_UNSET = 0;</code>
   */
  POKEMON_BADGE_UNSET(0),
  /**
   * <code>POKEMON_BADGE_BEST_BUDDY = 1;</code>
   */
  POKEMON_BADGE_BEST_BUDDY(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POKEMON_BADGE_UNSET = 0;</code>
   */
  public static final int POKEMON_BADGE_UNSET_VALUE = 0;
  /**
   * <code>POKEMON_BADGE_BEST_BUDDY = 1;</code>
   */
  public static final int POKEMON_BADGE_BEST_BUDDY_VALUE = 1;


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
  public static PokemonBadge valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokemonBadge forNumber(int value) {
    switch (value) {
      case 0: return POKEMON_BADGE_UNSET;
      case 1: return POKEMON_BADGE_BEST_BUDDY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokemonBadge>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokemonBadge> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokemonBadge>() {
          public PokemonBadge findValueByNumber(int number) {
            return PokemonBadge.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(115);
  }

  private static final PokemonBadge[] VALUES = values();

  public static PokemonBadge valueOf(
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

  private PokemonBadge(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokemonBadge)
}

