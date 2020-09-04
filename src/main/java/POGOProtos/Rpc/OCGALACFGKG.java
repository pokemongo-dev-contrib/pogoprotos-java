// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OCGALACFGKG
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.OCGALACFGKG}
 */
public enum OCGALACFGKG
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_UNSET(0),
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_0(1),
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_1(2),
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_2(3),
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_3(4),
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  OCGALACFGKG_FRIENDSHIP_LEVEL_4(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_UNSET_VALUE = 0;
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_0_VALUE = 1;
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_1_VALUE = 2;
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_2_VALUE = 3;
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_3_VALUE = 4;
  /**
   * <code>OCGALACFGKG_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  public static final int OCGALACFGKG_FRIENDSHIP_LEVEL_4_VALUE = 5;


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
  public static OCGALACFGKG valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OCGALACFGKG forNumber(int value) {
    switch (value) {
      case 0: return OCGALACFGKG_FRIENDSHIP_LEVEL_UNSET;
      case 1: return OCGALACFGKG_FRIENDSHIP_LEVEL_0;
      case 2: return OCGALACFGKG_FRIENDSHIP_LEVEL_1;
      case 3: return OCGALACFGKG_FRIENDSHIP_LEVEL_2;
      case 4: return OCGALACFGKG_FRIENDSHIP_LEVEL_3;
      case 5: return OCGALACFGKG_FRIENDSHIP_LEVEL_4;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OCGALACFGKG>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OCGALACFGKG> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OCGALACFGKG>() {
          public OCGALACFGKG findValueByNumber(int number) {
            return OCGALACFGKG.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(122);
  }

  private static final OCGALACFGKG[] VALUES = values();

  public static OCGALACFGKG valueOf(
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

  private OCGALACFGKG(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OCGALACFGKG)
}

