// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PIFAHNEPMOP
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.PIFAHNEPMOP}
 */
public enum PIFAHNEPMOP
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PIFAHNEPMOP_SINGLE = 0;</code>
   */
  PIFAHNEPMOP_SINGLE(0),
  /**
   * <code>PIFAHNEPMOP_BRANCHING = 1;</code>
   */
  PIFAHNEPMOP_BRANCHING(1),
  /**
   * <code>PIFAHNEPMOP_SEQUENCE = 2;</code>
   */
  PIFAHNEPMOP_SEQUENCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PIFAHNEPMOP_SINGLE = 0;</code>
   */
  public static final int PIFAHNEPMOP_SINGLE_VALUE = 0;
  /**
   * <code>PIFAHNEPMOP_BRANCHING = 1;</code>
   */
  public static final int PIFAHNEPMOP_BRANCHING_VALUE = 1;
  /**
   * <code>PIFAHNEPMOP_SEQUENCE = 2;</code>
   */
  public static final int PIFAHNEPMOP_SEQUENCE_VALUE = 2;


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
  public static PIFAHNEPMOP valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PIFAHNEPMOP forNumber(int value) {
    switch (value) {
      case 0: return PIFAHNEPMOP_SINGLE;
      case 1: return PIFAHNEPMOP_BRANCHING;
      case 2: return PIFAHNEPMOP_SEQUENCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PIFAHNEPMOP>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PIFAHNEPMOP> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PIFAHNEPMOP>() {
          public PIFAHNEPMOP findValueByNumber(int number) {
            return PIFAHNEPMOP.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(115);
  }

  private static final PIFAHNEPMOP[] VALUES = values();

  public static PIFAHNEPMOP valueOf(
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

  private PIFAHNEPMOP(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PIFAHNEPMOP)
}

