// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.EggIncubatorType}
 */
public enum EggIncubatorType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCUBATOR_UNSET = 0;</code>
   */
  INCUBATOR_UNSET(0),
  /**
   * <code>INCUBATOR_DISTANCE = 1;</code>
   */
  INCUBATOR_DISTANCE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCUBATOR_UNSET = 0;</code>
   */
  public static final int INCUBATOR_UNSET_VALUE = 0;
  /**
   * <code>INCUBATOR_DISTANCE = 1;</code>
   */
  public static final int INCUBATOR_DISTANCE_VALUE = 1;


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
  public static EggIncubatorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EggIncubatorType forNumber(int value) {
    switch (value) {
      case 0: return INCUBATOR_UNSET;
      case 1: return INCUBATOR_DISTANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EggIncubatorType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EggIncubatorType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EggIncubatorType>() {
          public EggIncubatorType findValueByNumber(int number) {
            return EggIncubatorType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(40);
  }

  private static final EggIncubatorType[] VALUES = values();

  public static EggIncubatorType valueOf(
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

  private EggIncubatorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EggIncubatorType)
}

