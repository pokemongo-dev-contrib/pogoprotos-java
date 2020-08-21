// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 *----- End rpc -----
 *------------------------------
 *----- Begin telemetry -----
 * ref: Niantic.Platform.Analytics.Telemetry.PoiImageType
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.PoiImageType}
 */
public enum PoiImageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POIIMAGETYPE_UNSET = 0;</code>
   */
  POIIMAGETYPE_UNSET(0),
  /**
   * <code>POIIMAGETYPE_MAIN = 1;</code>
   */
  POIIMAGETYPE_MAIN(1),
  /**
   * <code>POIIMAGETYPE_SURROUNDING = 2;</code>
   */
  POIIMAGETYPE_SURROUNDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POIIMAGETYPE_UNSET = 0;</code>
   */
  public static final int POIIMAGETYPE_UNSET_VALUE = 0;
  /**
   * <code>POIIMAGETYPE_MAIN = 1;</code>
   */
  public static final int POIIMAGETYPE_MAIN_VALUE = 1;
  /**
   * <code>POIIMAGETYPE_SURROUNDING = 2;</code>
   */
  public static final int POIIMAGETYPE_SURROUNDING_VALUE = 2;


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
  public static PoiImageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoiImageType forNumber(int value) {
    switch (value) {
      case 0: return POIIMAGETYPE_UNSET;
      case 1: return POIIMAGETYPE_MAIN;
      case 2: return POIIMAGETYPE_SURROUNDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoiImageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoiImageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoiImageType>() {
          public PoiImageType findValueByNumber(int number) {
            return PoiImageType.forNumber(number);
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

  private static final PoiImageType[] VALUES = values();

  public static PoiImageType valueOf(
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

  private PoiImageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PoiImageType)
}

