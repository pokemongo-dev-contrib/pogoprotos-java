// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ECJBDFNHNGE
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.ECJBDFNHNGE}
 */
public enum ECJBDFNHNGE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ECJBDFNHNGE_NORMAL = 0;</code>
   */
  ECJBDFNHNGE_NORMAL(0),
  /**
   * <code>ECJBDFNHNGE_VICTORY = 1;</code>
   */
  ECJBDFNHNGE_VICTORY(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ECJBDFNHNGE_NORMAL = 0;</code>
   */
  public static final int ECJBDFNHNGE_NORMAL_VALUE = 0;
  /**
   * <code>ECJBDFNHNGE_VICTORY = 1;</code>
   */
  public static final int ECJBDFNHNGE_VICTORY_VALUE = 1;


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
  public static ECJBDFNHNGE valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ECJBDFNHNGE forNumber(int value) {
    switch (value) {
      case 0: return ECJBDFNHNGE_NORMAL;
      case 1: return ECJBDFNHNGE_VICTORY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ECJBDFNHNGE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ECJBDFNHNGE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ECJBDFNHNGE>() {
          public ECJBDFNHNGE findValueByNumber(int number) {
            return ECJBDFNHNGE.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(45);
  }

  private static final ECJBDFNHNGE[] VALUES = values();

  public static ECJBDFNHNGE valueOf(
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

  private ECJBDFNHNGE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ECJBDFNHNGE)
}

