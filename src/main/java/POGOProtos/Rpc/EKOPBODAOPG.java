// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EKOPBODAOPG
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.EKOPBODAOPG}
 */
public enum EKOPBODAOPG
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EKOPBODAOPG_UNSET = 0;</code>
   */
  EKOPBODAOPG_UNSET(0),
  /**
   * <code>EKOPBODAOPG_OFF = 1;</code>
   */
  EKOPBODAOPG_OFF(1),
  /**
   * <code>EKOPBODAOPG_AR_STANDARD = 2;</code>
   */
  EKOPBODAOPG_AR_STANDARD(2),
  /**
   * <code>EKOPBODAOPG_AR_PLUS = 3;</code>
   */
  EKOPBODAOPG_AR_PLUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EKOPBODAOPG_UNSET = 0;</code>
   */
  public static final int EKOPBODAOPG_UNSET_VALUE = 0;
  /**
   * <code>EKOPBODAOPG_OFF = 1;</code>
   */
  public static final int EKOPBODAOPG_OFF_VALUE = 1;
  /**
   * <code>EKOPBODAOPG_AR_STANDARD = 2;</code>
   */
  public static final int EKOPBODAOPG_AR_STANDARD_VALUE = 2;
  /**
   * <code>EKOPBODAOPG_AR_PLUS = 3;</code>
   */
  public static final int EKOPBODAOPG_AR_PLUS_VALUE = 3;


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
  public static EKOPBODAOPG valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EKOPBODAOPG forNumber(int value) {
    switch (value) {
      case 0: return EKOPBODAOPG_UNSET;
      case 1: return EKOPBODAOPG_OFF;
      case 2: return EKOPBODAOPG_AR_STANDARD;
      case 3: return EKOPBODAOPG_AR_PLUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EKOPBODAOPG>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EKOPBODAOPG> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EKOPBODAOPG>() {
          public EKOPBODAOPG findValueByNumber(int number) {
            return EKOPBODAOPG.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(62);
  }

  private static final EKOPBODAOPG[] VALUES = values();

  public static EKOPBODAOPG valueOf(
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

  private EKOPBODAOPG(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EKOPBODAOPG)
}

