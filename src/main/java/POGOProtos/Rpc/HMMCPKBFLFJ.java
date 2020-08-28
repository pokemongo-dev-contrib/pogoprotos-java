// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HMMCPKBFLFJ
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.HMMCPKBFLFJ}
 */
public enum HMMCPKBFLFJ
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HMMCPKBFLFJ_UNSET = 0;</code>
   */
  HMMCPKBFLFJ_UNSET(0),
  /**
   * <code>HMMCPKBFLFJ_MAIN = 1;</code>
   */
  HMMCPKBFLFJ_MAIN(1),
  /**
   * <code>HMMCPKBFLFJ_SURROUNDING = 2;</code>
   */
  HMMCPKBFLFJ_SURROUNDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HMMCPKBFLFJ_UNSET = 0;</code>
   */
  public static final int HMMCPKBFLFJ_UNSET_VALUE = 0;
  /**
   * <code>HMMCPKBFLFJ_MAIN = 1;</code>
   */
  public static final int HMMCPKBFLFJ_MAIN_VALUE = 1;
  /**
   * <code>HMMCPKBFLFJ_SURROUNDING = 2;</code>
   */
  public static final int HMMCPKBFLFJ_SURROUNDING_VALUE = 2;


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
  public static HMMCPKBFLFJ valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HMMCPKBFLFJ forNumber(int value) {
    switch (value) {
      case 0: return HMMCPKBFLFJ_UNSET;
      case 1: return HMMCPKBFLFJ_MAIN;
      case 2: return HMMCPKBFLFJ_SURROUNDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HMMCPKBFLFJ>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HMMCPKBFLFJ> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HMMCPKBFLFJ>() {
          public HMMCPKBFLFJ findValueByNumber(int number) {
            return HMMCPKBFLFJ.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(82);
  }

  private static final HMMCPKBFLFJ[] VALUES = values();

  public static HMMCPKBFLFJ valueOf(
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

  private HMMCPKBFLFJ(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HMMCPKBFLFJ)
}

