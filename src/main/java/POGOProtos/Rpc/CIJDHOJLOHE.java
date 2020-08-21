// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CIJDHOJLOHE
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.CIJDHOJLOHE}
 */
public enum CIJDHOJLOHE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_WILD = 0;</code>
   */
  CIJDHOJLOHE_CREATE_CONTEXT_WILD(0),
  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_EGG = 1;</code>
   */
  CIJDHOJLOHE_CREATE_CONTEXT_EGG(1),
  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_EVOLVE = 2;</code>
   */
  CIJDHOJLOHE_CREATE_CONTEXT_EVOLVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_WILD = 0;</code>
   */
  public static final int CIJDHOJLOHE_CREATE_CONTEXT_WILD_VALUE = 0;
  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_EGG = 1;</code>
   */
  public static final int CIJDHOJLOHE_CREATE_CONTEXT_EGG_VALUE = 1;
  /**
   * <code>CIJDHOJLOHE_CREATE_CONTEXT_EVOLVE = 2;</code>
   */
  public static final int CIJDHOJLOHE_CREATE_CONTEXT_EVOLVE_VALUE = 2;


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
  public static CIJDHOJLOHE valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CIJDHOJLOHE forNumber(int value) {
    switch (value) {
      case 0: return CIJDHOJLOHE_CREATE_CONTEXT_WILD;
      case 1: return CIJDHOJLOHE_CREATE_CONTEXT_EGG;
      case 2: return CIJDHOJLOHE_CREATE_CONTEXT_EVOLVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CIJDHOJLOHE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CIJDHOJLOHE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CIJDHOJLOHE>() {
          public CIJDHOJLOHE findValueByNumber(int number) {
            return CIJDHOJLOHE.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(43);
  }

  private static final CIJDHOJLOHE[] VALUES = values();

  public static CIJDHOJLOHE valueOf(
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

  private CIJDHOJLOHE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CIJDHOJLOHE)
}

