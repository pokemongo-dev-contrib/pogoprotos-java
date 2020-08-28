// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DHGKBMIOKFO
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.DHGKBMIOKFO}
 */
public enum DHGKBMIOKFO
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DHGKBMIOKFO_FREE = 0;</code>
   */
  DHGKBMIOKFO_FREE(0),
  /**
   * <code>DHGKBMIOKFO_PREMIUM = 1;</code>
   */
  DHGKBMIOKFO_PREMIUM(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DHGKBMIOKFO_FREE = 0;</code>
   */
  public static final int DHGKBMIOKFO_FREE_VALUE = 0;
  /**
   * <code>DHGKBMIOKFO_PREMIUM = 1;</code>
   */
  public static final int DHGKBMIOKFO_PREMIUM_VALUE = 1;


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
  public static DHGKBMIOKFO valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DHGKBMIOKFO forNumber(int value) {
    switch (value) {
      case 0: return DHGKBMIOKFO_FREE;
      case 1: return DHGKBMIOKFO_PREMIUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DHGKBMIOKFO>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DHGKBMIOKFO> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DHGKBMIOKFO>() {
          public DHGKBMIOKFO findValueByNumber(int number) {
            return DHGKBMIOKFO.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(38);
  }

  private static final DHGKBMIOKFO[] VALUES = values();

  public static DHGKBMIOKFO valueOf(
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

  private DHGKBMIOKFO(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DHGKBMIOKFO)
}

