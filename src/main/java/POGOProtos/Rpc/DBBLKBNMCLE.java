// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DBBLKBNMCLE
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.DBBLKBNMCLE}
 */
public enum DBBLKBNMCLE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DBBLKBNMCLE_UNKNOWN = 0;</code>
   */
  DBBLKBNMCLE_UNKNOWN(0),
  /**
   * <code>DBBLKBNMCLE_POKECOIN = 1;</code>
   */
  DBBLKBNMCLE_POKECOIN(1),
  /**
   * <code>DBBLKBNMCLE_STARDUST = 2;</code>
   */
  DBBLKBNMCLE_STARDUST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DBBLKBNMCLE_UNKNOWN = 0;</code>
   */
  public static final int DBBLKBNMCLE_UNKNOWN_VALUE = 0;
  /**
   * <code>DBBLKBNMCLE_POKECOIN = 1;</code>
   */
  public static final int DBBLKBNMCLE_POKECOIN_VALUE = 1;
  /**
   * <code>DBBLKBNMCLE_STARDUST = 2;</code>
   */
  public static final int DBBLKBNMCLE_STARDUST_VALUE = 2;


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
  public static DBBLKBNMCLE valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DBBLKBNMCLE forNumber(int value) {
    switch (value) {
      case 0: return DBBLKBNMCLE_UNKNOWN;
      case 1: return DBBLKBNMCLE_POKECOIN;
      case 2: return DBBLKBNMCLE_STARDUST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DBBLKBNMCLE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DBBLKBNMCLE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DBBLKBNMCLE>() {
          public DBBLKBNMCLE findValueByNumber(int number) {
            return DBBLKBNMCLE.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(50);
  }

  private static final DBBLKBNMCLE[] VALUES = values();

  public static DBBLKBNMCLE valueOf(
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

  private DBBLKBNMCLE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DBBLKBNMCLE)
}

