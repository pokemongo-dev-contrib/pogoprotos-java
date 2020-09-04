// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MHKECIFMDJF
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.MHKECIFMDJF}
 */
public enum MHKECIFMDJF
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_UNSET = 0;</code>
   */
  MHKECIFMDJF_GYM_BADGE_UNSET(0),
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_VANILLA = 1;</code>
   */
  MHKECIFMDJF_GYM_BADGE_VANILLA(1),
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_BRONZE = 2;</code>
   */
  MHKECIFMDJF_GYM_BADGE_BRONZE(2),
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_SILVER = 3;</code>
   */
  MHKECIFMDJF_GYM_BADGE_SILVER(3),
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_GOLD = 4;</code>
   */
  MHKECIFMDJF_GYM_BADGE_GOLD(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MHKECIFMDJF_GYM_BADGE_UNSET = 0;</code>
   */
  public static final int MHKECIFMDJF_GYM_BADGE_UNSET_VALUE = 0;
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_VANILLA = 1;</code>
   */
  public static final int MHKECIFMDJF_GYM_BADGE_VANILLA_VALUE = 1;
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_BRONZE = 2;</code>
   */
  public static final int MHKECIFMDJF_GYM_BADGE_BRONZE_VALUE = 2;
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_SILVER = 3;</code>
   */
  public static final int MHKECIFMDJF_GYM_BADGE_SILVER_VALUE = 3;
  /**
   * <code>MHKECIFMDJF_GYM_BADGE_GOLD = 4;</code>
   */
  public static final int MHKECIFMDJF_GYM_BADGE_GOLD_VALUE = 4;


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
  public static MHKECIFMDJF valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MHKECIFMDJF forNumber(int value) {
    switch (value) {
      case 0: return MHKECIFMDJF_GYM_BADGE_UNSET;
      case 1: return MHKECIFMDJF_GYM_BADGE_VANILLA;
      case 2: return MHKECIFMDJF_GYM_BADGE_BRONZE;
      case 3: return MHKECIFMDJF_GYM_BADGE_SILVER;
      case 4: return MHKECIFMDJF_GYM_BADGE_GOLD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MHKECIFMDJF>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MHKECIFMDJF> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MHKECIFMDJF>() {
          public MHKECIFMDJF findValueByNumber(int number) {
            return MHKECIFMDJF.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(110);
  }

  private static final MHKECIFMDJF[] VALUES = values();

  public static MHKECIFMDJF valueOf(
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

  private MHKECIFMDJF(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MHKECIFMDJF)
}

