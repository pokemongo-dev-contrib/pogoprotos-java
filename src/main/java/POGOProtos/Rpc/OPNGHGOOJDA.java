// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OPNGHGOOJDA
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.OPNGHGOOJDA}
 */
public enum OPNGHGOOJDA
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_INTRODUCTION = 0;</code>
   */
  OPNGHGOOJDA_ONBOARDING_INTRODUCTION(0),
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_ENCOUNTER = 1;</code>
   */
  OPNGHGOOJDA_ONBOARDING_ENCOUNTER(1),
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_SHADOW = 2;</code>
   */
  OPNGHGOOJDA_ONBOARDING_SHADOW(2),
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  OPNGHGOOJDA_ONBOARDING_MAP_FRAGMENT(3),
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_1 = 4;</code>
   */
  OPNGHGOOJDA_ONBOARDING_MAP_1(4),
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_2 = 5;</code>
   */
  OPNGHGOOJDA_ONBOARDING_MAP_2(5),
  /**
   * <code>OPNGHGOOJDA_INSPIRE = 6;</code>
   */
  OPNGHGOOJDA_INSPIRE(6),
  /**
   * <code>OPNGHGOOJDA_MAP_TIME_WARNING = 7;</code>
   */
  OPNGHGOOJDA_MAP_TIME_WARNING(7),
  /**
   * <code>OPNGHGOOJDA_MAP_EMPTY_WARNING = 8;</code>
   */
  OPNGHGOOJDA_MAP_EMPTY_WARNING(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OPNGHGOOJDA_ONBOARDING_INTRODUCTION = 0;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_INTRODUCTION_VALUE = 0;
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_ENCOUNTER = 1;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_ENCOUNTER_VALUE = 1;
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_SHADOW = 2;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_SHADOW_VALUE = 2;
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_MAP_FRAGMENT_VALUE = 3;
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_1 = 4;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_MAP_1_VALUE = 4;
  /**
   * <code>OPNGHGOOJDA_ONBOARDING_MAP_2 = 5;</code>
   */
  public static final int OPNGHGOOJDA_ONBOARDING_MAP_2_VALUE = 5;
  /**
   * <code>OPNGHGOOJDA_INSPIRE = 6;</code>
   */
  public static final int OPNGHGOOJDA_INSPIRE_VALUE = 6;
  /**
   * <code>OPNGHGOOJDA_MAP_TIME_WARNING = 7;</code>
   */
  public static final int OPNGHGOOJDA_MAP_TIME_WARNING_VALUE = 7;
  /**
   * <code>OPNGHGOOJDA_MAP_EMPTY_WARNING = 8;</code>
   */
  public static final int OPNGHGOOJDA_MAP_EMPTY_WARNING_VALUE = 8;


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
  public static OPNGHGOOJDA valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OPNGHGOOJDA forNumber(int value) {
    switch (value) {
      case 0: return OPNGHGOOJDA_ONBOARDING_INTRODUCTION;
      case 1: return OPNGHGOOJDA_ONBOARDING_ENCOUNTER;
      case 2: return OPNGHGOOJDA_ONBOARDING_SHADOW;
      case 3: return OPNGHGOOJDA_ONBOARDING_MAP_FRAGMENT;
      case 4: return OPNGHGOOJDA_ONBOARDING_MAP_1;
      case 5: return OPNGHGOOJDA_ONBOARDING_MAP_2;
      case 6: return OPNGHGOOJDA_INSPIRE;
      case 7: return OPNGHGOOJDA_MAP_TIME_WARNING;
      case 8: return OPNGHGOOJDA_MAP_EMPTY_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OPNGHGOOJDA>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OPNGHGOOJDA> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OPNGHGOOJDA>() {
          public OPNGHGOOJDA findValueByNumber(int number) {
            return OPNGHGOOJDA.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(129);
  }

  private static final OPNGHGOOJDA[] VALUES = values();

  public static OPNGHGOOJDA valueOf(
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

  private OPNGHGOOJDA(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OPNGHGOOJDA)
}

