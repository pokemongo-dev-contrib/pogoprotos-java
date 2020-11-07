// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.VfxLevel}
 */
public enum VfxLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VFX_LEVEL_NONE = 0;</code>
   */
  VFX_LEVEL_NONE(0),
  /**
   * <code>VFX_LEVEL_START = 1;</code>
   */
  VFX_LEVEL_START(1),
  /**
   * <code>VFX_LEVEL_NICE = 2;</code>
   */
  VFX_LEVEL_NICE(2),
  /**
   * <code>VFX_LEVEL_GREAT = 3;</code>
   */
  VFX_LEVEL_GREAT(3),
  /**
   * <code>VFX_LEVEL_EXCELLENT = 4;</code>
   */
  VFX_LEVEL_EXCELLENT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VFX_LEVEL_NONE = 0;</code>
   */
  public static final int VFX_LEVEL_NONE_VALUE = 0;
  /**
   * <code>VFX_LEVEL_START = 1;</code>
   */
  public static final int VFX_LEVEL_START_VALUE = 1;
  /**
   * <code>VFX_LEVEL_NICE = 2;</code>
   */
  public static final int VFX_LEVEL_NICE_VALUE = 2;
  /**
   * <code>VFX_LEVEL_GREAT = 3;</code>
   */
  public static final int VFX_LEVEL_GREAT_VALUE = 3;
  /**
   * <code>VFX_LEVEL_EXCELLENT = 4;</code>
   */
  public static final int VFX_LEVEL_EXCELLENT_VALUE = 4;


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
  public static VfxLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VfxLevel forNumber(int value) {
    switch (value) {
      case 0: return VFX_LEVEL_NONE;
      case 1: return VFX_LEVEL_START;
      case 2: return VFX_LEVEL_NICE;
      case 3: return VFX_LEVEL_GREAT;
      case 4: return VFX_LEVEL_EXCELLENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VfxLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VfxLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VfxLevel>() {
          public VfxLevel findValueByNumber(int number) {
            return VfxLevel.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(142);
  }

  private static final VfxLevel[] VALUES = values();

  public static VfxLevel valueOf(
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

  private VfxLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.VfxLevel)
}

