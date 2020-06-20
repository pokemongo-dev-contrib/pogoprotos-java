// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OBJOELPEHDJ
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.OBJOELPEHDJ}
 */
public enum OBJOELPEHDJ
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OBJOELPEHDJ_GYM = 0;</code>
   */
  OBJOELPEHDJ_GYM(0),
  /**
   * <code>OBJOELPEHDJ_CHECKPOINT = 1;</code>
   */
  OBJOELPEHDJ_CHECKPOINT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OBJOELPEHDJ_GYM = 0;</code>
   */
  public static final int OBJOELPEHDJ_GYM_VALUE = 0;
  /**
   * <code>OBJOELPEHDJ_CHECKPOINT = 1;</code>
   */
  public static final int OBJOELPEHDJ_CHECKPOINT_VALUE = 1;


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
  public static OBJOELPEHDJ valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OBJOELPEHDJ forNumber(int value) {
    switch (value) {
      case 0: return OBJOELPEHDJ_GYM;
      case 1: return OBJOELPEHDJ_CHECKPOINT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OBJOELPEHDJ>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OBJOELPEHDJ> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OBJOELPEHDJ>() {
          public OBJOELPEHDJ findValueByNumber(int number) {
            return OBJOELPEHDJ.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(105);
  }

  private static final OBJOELPEHDJ[] VALUES = values();

  public static OBJOELPEHDJ valueOf(
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

  private OBJOELPEHDJ(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OBJOELPEHDJ)
}

