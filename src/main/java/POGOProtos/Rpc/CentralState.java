// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CentralState}
 */
public enum CentralState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CENTRAL_STATE_UNKNOWN = 0;</code>
   */
  CENTRAL_STATE_UNKNOWN(0),
  /**
   * <code>CENTRAL_STATE_RESETTING = 1;</code>
   */
  CENTRAL_STATE_RESETTING(1),
  /**
   * <code>CENTRAL_STATE_UNSUPPORTED = 2;</code>
   */
  CENTRAL_STATE_UNSUPPORTED(2),
  /**
   * <code>CENTRAL_STATE_UNAUTHORIZED = 3;</code>
   */
  CENTRAL_STATE_UNAUTHORIZED(3),
  /**
   * <code>CENTRAL_STATE_POWERED_OFF = 4;</code>
   */
  CENTRAL_STATE_POWERED_OFF(4),
  /**
   * <code>CENTRAL_STATE_POWERED_ON = 5;</code>
   */
  CENTRAL_STATE_POWERED_ON(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CENTRAL_STATE_UNKNOWN = 0;</code>
   */
  public static final int CENTRAL_STATE_UNKNOWN_VALUE = 0;
  /**
   * <code>CENTRAL_STATE_RESETTING = 1;</code>
   */
  public static final int CENTRAL_STATE_RESETTING_VALUE = 1;
  /**
   * <code>CENTRAL_STATE_UNSUPPORTED = 2;</code>
   */
  public static final int CENTRAL_STATE_UNSUPPORTED_VALUE = 2;
  /**
   * <code>CENTRAL_STATE_UNAUTHORIZED = 3;</code>
   */
  public static final int CENTRAL_STATE_UNAUTHORIZED_VALUE = 3;
  /**
   * <code>CENTRAL_STATE_POWERED_OFF = 4;</code>
   */
  public static final int CENTRAL_STATE_POWERED_OFF_VALUE = 4;
  /**
   * <code>CENTRAL_STATE_POWERED_ON = 5;</code>
   */
  public static final int CENTRAL_STATE_POWERED_ON_VALUE = 5;


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
  public static CentralState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CentralState forNumber(int value) {
    switch (value) {
      case 0: return CENTRAL_STATE_UNKNOWN;
      case 1: return CENTRAL_STATE_RESETTING;
      case 2: return CENTRAL_STATE_UNSUPPORTED;
      case 3: return CENTRAL_STATE_UNAUTHORIZED;
      case 4: return CENTRAL_STATE_POWERED_OFF;
      case 5: return CENTRAL_STATE_POWERED_ON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CentralState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CentralState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CentralState>() {
          public CentralState findValueByNumber(int number) {
            return CentralState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(30);
  }

  private static final CentralState[] VALUES = values();

  public static CentralState valueOf(
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

  private CentralState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CentralState)
}

