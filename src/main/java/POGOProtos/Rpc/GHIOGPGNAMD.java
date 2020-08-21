// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GHIOGPGNAMD
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.GHIOGPGNAMD}
 */
public enum GHIOGPGNAMD
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_INTRODUCTION = 0;</code>
   */
  GHIOGPGNAMD_ONBOARDING_INTRODUCTION(0),
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_ENCOUNTER = 1;</code>
   */
  GHIOGPGNAMD_ONBOARDING_ENCOUNTER(1),
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_SHADOW = 2;</code>
   */
  GHIOGPGNAMD_ONBOARDING_SHADOW(2),
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  GHIOGPGNAMD_ONBOARDING_MAP_FRAGMENT(3),
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_1 = 4;</code>
   */
  GHIOGPGNAMD_ONBOARDING_MAP_1(4),
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_2 = 5;</code>
   */
  GHIOGPGNAMD_ONBOARDING_MAP_2(5),
  /**
   * <code>GHIOGPGNAMD_INSPIRE = 6;</code>
   */
  GHIOGPGNAMD_INSPIRE(6),
  /**
   * <code>GHIOGPGNAMD_MAP_TIME_WARNING = 7;</code>
   */
  GHIOGPGNAMD_MAP_TIME_WARNING(7),
  /**
   * <code>GHIOGPGNAMD_MAP_EMPTY_WARNING = 8;</code>
   */
  GHIOGPGNAMD_MAP_EMPTY_WARNING(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GHIOGPGNAMD_ONBOARDING_INTRODUCTION = 0;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_INTRODUCTION_VALUE = 0;
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_ENCOUNTER = 1;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_ENCOUNTER_VALUE = 1;
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_SHADOW = 2;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_SHADOW_VALUE = 2;
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_MAP_FRAGMENT_VALUE = 3;
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_1 = 4;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_MAP_1_VALUE = 4;
  /**
   * <code>GHIOGPGNAMD_ONBOARDING_MAP_2 = 5;</code>
   */
  public static final int GHIOGPGNAMD_ONBOARDING_MAP_2_VALUE = 5;
  /**
   * <code>GHIOGPGNAMD_INSPIRE = 6;</code>
   */
  public static final int GHIOGPGNAMD_INSPIRE_VALUE = 6;
  /**
   * <code>GHIOGPGNAMD_MAP_TIME_WARNING = 7;</code>
   */
  public static final int GHIOGPGNAMD_MAP_TIME_WARNING_VALUE = 7;
  /**
   * <code>GHIOGPGNAMD_MAP_EMPTY_WARNING = 8;</code>
   */
  public static final int GHIOGPGNAMD_MAP_EMPTY_WARNING_VALUE = 8;


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
  public static GHIOGPGNAMD valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GHIOGPGNAMD forNumber(int value) {
    switch (value) {
      case 0: return GHIOGPGNAMD_ONBOARDING_INTRODUCTION;
      case 1: return GHIOGPGNAMD_ONBOARDING_ENCOUNTER;
      case 2: return GHIOGPGNAMD_ONBOARDING_SHADOW;
      case 3: return GHIOGPGNAMD_ONBOARDING_MAP_FRAGMENT;
      case 4: return GHIOGPGNAMD_ONBOARDING_MAP_1;
      case 5: return GHIOGPGNAMD_ONBOARDING_MAP_2;
      case 6: return GHIOGPGNAMD_INSPIRE;
      case 7: return GHIOGPGNAMD_MAP_TIME_WARNING;
      case 8: return GHIOGPGNAMD_MAP_EMPTY_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GHIOGPGNAMD>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GHIOGPGNAMD> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GHIOGPGNAMD>() {
          public GHIOGPGNAMD findValueByNumber(int number) {
            return GHIOGPGNAMD.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(79);
  }

  private static final GHIOGPGNAMD[] VALUES = values();

  public static GHIOGPGNAMD valueOf(
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

  private GHIOGPGNAMD(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GHIOGPGNAMD)
}

