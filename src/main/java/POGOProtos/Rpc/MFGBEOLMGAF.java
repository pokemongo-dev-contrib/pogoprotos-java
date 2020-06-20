// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MFGBEOLMGAF
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.MFGBEOLMGAF}
 */
public enum MFGBEOLMGAF
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MFGBEOLMGAF_UNKNOWN = 0;</code>
   */
  MFGBEOLMGAF_UNKNOWN(0),
  /**
   * <code>MFGBEOLMGAF_PERMISSION_DENIED = -2;</code>
   */
  MFGBEOLMGAF_PERMISSION_DENIED(-2),
  /**
   * <code>MFGBEOLMGAF_NOT_ADDED = -1;</code>
   */
  MFGBEOLMGAF_NOT_ADDED(-1),
  /**
   * <code>MFGBEOLMGAF_ADDED = 1;</code>
   */
  MFGBEOLMGAF_ADDED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MFGBEOLMGAF_UNKNOWN = 0;</code>
   */
  public static final int MFGBEOLMGAF_UNKNOWN_VALUE = 0;
  /**
   * <code>MFGBEOLMGAF_PERMISSION_DENIED = -2;</code>
   */
  public static final int MFGBEOLMGAF_PERMISSION_DENIED_VALUE = -2;
  /**
   * <code>MFGBEOLMGAF_NOT_ADDED = -1;</code>
   */
  public static final int MFGBEOLMGAF_NOT_ADDED_VALUE = -1;
  /**
   * <code>MFGBEOLMGAF_ADDED = 1;</code>
   */
  public static final int MFGBEOLMGAF_ADDED_VALUE = 1;


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
  public static MFGBEOLMGAF valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MFGBEOLMGAF forNumber(int value) {
    switch (value) {
      case 0: return MFGBEOLMGAF_UNKNOWN;
      case -2: return MFGBEOLMGAF_PERMISSION_DENIED;
      case -1: return MFGBEOLMGAF_NOT_ADDED;
      case 1: return MFGBEOLMGAF_ADDED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MFGBEOLMGAF>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MFGBEOLMGAF> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MFGBEOLMGAF>() {
          public MFGBEOLMGAF findValueByNumber(int number) {
            return MFGBEOLMGAF.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(92);
  }

  private static final MFGBEOLMGAF[] VALUES = values();

  public static MFGBEOLMGAF valueOf(
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

  private MFGBEOLMGAF(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MFGBEOLMGAF)
}

