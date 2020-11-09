// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.POIDecorationFollowFlags}
 */
public enum POIDecorationFollowFlags
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_AUTO_INVALID = 0;</code>
   */
  POI_DECORATION_FOLLOW_FLAGS_AUTO_INVALID(0),
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_X = 1;</code>
   */
  POI_DECORATION_FOLLOW_FLAGS_FOLLOW_X(1),
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Y = 2;</code>
   */
  POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Y(2),
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Z = 4;</code>
   */
  POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Z(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_AUTO_INVALID = 0;</code>
   */
  public static final int POI_DECORATION_FOLLOW_FLAGS_AUTO_INVALID_VALUE = 0;
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_X = 1;</code>
   */
  public static final int POI_DECORATION_FOLLOW_FLAGS_FOLLOW_X_VALUE = 1;
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Y = 2;</code>
   */
  public static final int POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Y_VALUE = 2;
  /**
   * <code>POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Z = 4;</code>
   */
  public static final int POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Z_VALUE = 4;


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
  public static POIDecorationFollowFlags valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static POIDecorationFollowFlags forNumber(int value) {
    switch (value) {
      case 0: return POI_DECORATION_FOLLOW_FLAGS_AUTO_INVALID;
      case 1: return POI_DECORATION_FOLLOW_FLAGS_FOLLOW_X;
      case 2: return POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Y;
      case 4: return POI_DECORATION_FOLLOW_FLAGS_FOLLOW_Z;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<POIDecorationFollowFlags>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      POIDecorationFollowFlags> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<POIDecorationFollowFlags>() {
          public POIDecorationFollowFlags findValueByNumber(int number) {
            return POIDecorationFollowFlags.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(93);
  }

  private static final POIDecorationFollowFlags[] VALUES = values();

  public static POIDecorationFollowFlags valueOf(
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

  private POIDecorationFollowFlags(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.POIDecorationFollowFlags)
}

