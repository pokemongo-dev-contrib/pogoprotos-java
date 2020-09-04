// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ILCDIAOKEPC
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.ILCDIAOKEPC}
 */
public enum ILCDIAOKEPC
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ILCDIAOKEPC_UNKNOWN = 0;</code>
   */
  ILCDIAOKEPC_UNKNOWN(0),
  /**
   * <code>ILCDIAOKEPC_POKECOIN = 1;</code>
   */
  ILCDIAOKEPC_POKECOIN(1),
  /**
   * <code>ILCDIAOKEPC_STARDUST = 2;</code>
   */
  ILCDIAOKEPC_STARDUST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ILCDIAOKEPC_UNKNOWN = 0;</code>
   */
  public static final int ILCDIAOKEPC_UNKNOWN_VALUE = 0;
  /**
   * <code>ILCDIAOKEPC_POKECOIN = 1;</code>
   */
  public static final int ILCDIAOKEPC_POKECOIN_VALUE = 1;
  /**
   * <code>ILCDIAOKEPC_STARDUST = 2;</code>
   */
  public static final int ILCDIAOKEPC_STARDUST_VALUE = 2;


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
  public static ILCDIAOKEPC valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ILCDIAOKEPC forNumber(int value) {
    switch (value) {
      case 0: return ILCDIAOKEPC_UNKNOWN;
      case 1: return ILCDIAOKEPC_POKECOIN;
      case 2: return ILCDIAOKEPC_STARDUST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ILCDIAOKEPC>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ILCDIAOKEPC> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ILCDIAOKEPC>() {
          public ILCDIAOKEPC findValueByNumber(int number) {
            return ILCDIAOKEPC.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(79);
  }

  private static final ILCDIAOKEPC[] VALUES = values();

  public static ILCDIAOKEPC valueOf(
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

  private ILCDIAOKEPC(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ILCDIAOKEPC)
}

