// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.AA_NEW_ENUM_0}
 */
public enum AA_NEW_ENUM_0
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AA_NEW_ENUM_0_NORMAL = 0;</code>
   */
  AA_NEW_ENUM_0_NORMAL(0),
  /**
   * <code>AA_NEW_ENUM_0_CALL_TO_ACTION = 1;</code>
   */
  AA_NEW_ENUM_0_CALL_TO_ACTION(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AA_NEW_ENUM_0_NORMAL = 0;</code>
   */
  public static final int AA_NEW_ENUM_0_NORMAL_VALUE = 0;
  /**
   * <code>AA_NEW_ENUM_0_CALL_TO_ACTION = 1;</code>
   */
  public static final int AA_NEW_ENUM_0_CALL_TO_ACTION_VALUE = 1;


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
  public static AA_NEW_ENUM_0 valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AA_NEW_ENUM_0 forNumber(int value) {
    switch (value) {
      case 0: return AA_NEW_ENUM_0_NORMAL;
      case 1: return AA_NEW_ENUM_0_CALL_TO_ACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AA_NEW_ENUM_0>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AA_NEW_ENUM_0> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AA_NEW_ENUM_0>() {
          public AA_NEW_ENUM_0 findValueByNumber(int number) {
            return AA_NEW_ENUM_0.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(0);
  }

  private static final AA_NEW_ENUM_0[] VALUES = values();

  public static AA_NEW_ENUM_0 valueOf(
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

  private AA_NEW_ENUM_0(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AA_NEW_ENUM_0)
}

