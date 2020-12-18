// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PokemonHomeTelemetryIds}
 */
public enum PokemonHomeTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT = 0;</code>
   */
  POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT(0),
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_OPEN_SETTINGS = 1;</code>
   */
  POKEMON_HOME_TELEMETRY_IDS_OPEN_SETTINGS(1),
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_SIGN_IN = 2;</code>
   */
  POKEMON_HOME_TELEMETRY_IDS_SIGN_IN(2),
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_SELECTED_POKEMON = 3;</code>
   */
  POKEMON_HOME_TELEMETRY_IDS_SELECTED_POKEMON(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT = 0;</code>
   */
  public static final int POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT_VALUE = 0;
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_OPEN_SETTINGS = 1;</code>
   */
  public static final int POKEMON_HOME_TELEMETRY_IDS_OPEN_SETTINGS_VALUE = 1;
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_SIGN_IN = 2;</code>
   */
  public static final int POKEMON_HOME_TELEMETRY_IDS_SIGN_IN_VALUE = 2;
  /**
   * <code>POKEMON_HOME_TELEMETRY_IDS_SELECTED_POKEMON = 3;</code>
   */
  public static final int POKEMON_HOME_TELEMETRY_IDS_SELECTED_POKEMON_VALUE = 3;


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
  public static PokemonHomeTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokemonHomeTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT;
      case 1: return POKEMON_HOME_TELEMETRY_IDS_OPEN_SETTINGS;
      case 2: return POKEMON_HOME_TELEMETRY_IDS_SIGN_IN;
      case 3: return POKEMON_HOME_TELEMETRY_IDS_SELECTED_POKEMON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokemonHomeTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokemonHomeTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokemonHomeTelemetryIds>() {
          public PokemonHomeTelemetryIds findValueByNumber(int number) {
            return PokemonHomeTelemetryIds.forNumber(number);
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

  private static final PokemonHomeTelemetryIds[] VALUES = values();

  public static PokemonHomeTelemetryIds valueOf(
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

  private PokemonHomeTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokemonHomeTelemetryIds)
}

