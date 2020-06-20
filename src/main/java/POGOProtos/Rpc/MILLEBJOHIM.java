// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.MILLEBJOHIM}
 */
public enum MILLEBJOHIM
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_CUT = 0;</code>
   */
  MILLEBJOHIM_CAM_INTERP_CUT(0),
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_LINEAR = 1;</code>
   */
  MILLEBJOHIM_CAM_INTERP_LINEAR(1),
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_SMOOTH = 2;</code>
   */
  MILLEBJOHIM_CAM_INTERP_SMOOTH(2),
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_SMOOTH_ROT_LINEAR_MOVE = 3;</code>
   */
  MILLEBJOHIM_CAM_INTERP_SMOOTH_ROT_LINEAR_MOVE(3),
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_DEPENDS = 4;</code>
   */
  MILLEBJOHIM_CAM_INTERP_DEPENDS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MILLEBJOHIM_CAM_INTERP_CUT = 0;</code>
   */
  public static final int MILLEBJOHIM_CAM_INTERP_CUT_VALUE = 0;
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_LINEAR = 1;</code>
   */
  public static final int MILLEBJOHIM_CAM_INTERP_LINEAR_VALUE = 1;
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_SMOOTH = 2;</code>
   */
  public static final int MILLEBJOHIM_CAM_INTERP_SMOOTH_VALUE = 2;
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_SMOOTH_ROT_LINEAR_MOVE = 3;</code>
   */
  public static final int MILLEBJOHIM_CAM_INTERP_SMOOTH_ROT_LINEAR_MOVE_VALUE = 3;
  /**
   * <code>MILLEBJOHIM_CAM_INTERP_DEPENDS = 4;</code>
   */
  public static final int MILLEBJOHIM_CAM_INTERP_DEPENDS_VALUE = 4;


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
  public static MILLEBJOHIM valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MILLEBJOHIM forNumber(int value) {
    switch (value) {
      case 0: return MILLEBJOHIM_CAM_INTERP_CUT;
      case 1: return MILLEBJOHIM_CAM_INTERP_LINEAR;
      case 2: return MILLEBJOHIM_CAM_INTERP_SMOOTH;
      case 3: return MILLEBJOHIM_CAM_INTERP_SMOOTH_ROT_LINEAR_MOVE;
      case 4: return MILLEBJOHIM_CAM_INTERP_DEPENDS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MILLEBJOHIM>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MILLEBJOHIM> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MILLEBJOHIM>() {
          public MILLEBJOHIM findValueByNumber(int number) {
            return MILLEBJOHIM.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(95);
  }

  private static final MILLEBJOHIM[] VALUES = values();

  public static MILLEBJOHIM valueOf(
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

  private MILLEBJOHIM(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MILLEBJOHIM)
}

