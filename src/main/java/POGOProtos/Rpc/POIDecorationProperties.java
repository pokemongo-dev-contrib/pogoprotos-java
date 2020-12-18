// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.POIDecorationProperties}
 */
public enum POIDecorationProperties
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POI_DECORATION_PROPERTIES_COLOR = 0;</code>
   */
  POI_DECORATION_PROPERTIES_COLOR(0),
  /**
   * <code>POI_DECORATION_PROPERTIES_POSITION = 1;</code>
   */
  POI_DECORATION_PROPERTIES_POSITION(1),
  /**
   * <code>POI_DECORATION_PROPERTIES_SIZE = 2;</code>
   */
  POI_DECORATION_PROPERTIES_SIZE(2),
  /**
   * <code>POI_DECORATION_PROPERTIES_TEXT = 3;</code>
   */
  POI_DECORATION_PROPERTIES_TEXT(3),
  /**
   * <code>POI_DECORATION_PROPERTIES_ACTIVE = 4;</code>
   */
  POI_DECORATION_PROPERTIES_ACTIVE(4),
  /**
   * <code>POI_DECORATION_PROPERTIES_ICON = 5;</code>
   */
  POI_DECORATION_PROPERTIES_ICON(5),
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_RAID_DATA = 6;</code>
   */
  POI_DECORATION_PROPERTIES_SET_RAID_DATA(6),
  /**
   * <code>POI_DECORATION_PROPERTIES_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  POI_DECORATION_PROPERTIES_NEARBY_CARROT_VISIBLE(7),
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_LOWEST_MOTIVATION = 8;</code>
   */
  POI_DECORATION_PROPERTIES_SET_LOWEST_MOTIVATION(8),
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  POI_DECORATION_PROPERTIES_SET_NPC_CLICKED_ACTION(9),
  /**
   * <code>POI_DECORATION_PROPERTIES_BEGIN_EXIT = 10;</code>
   */
  POI_DECORATION_PROPERTIES_BEGIN_EXIT(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POI_DECORATION_PROPERTIES_COLOR = 0;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_COLOR_VALUE = 0;
  /**
   * <code>POI_DECORATION_PROPERTIES_POSITION = 1;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_POSITION_VALUE = 1;
  /**
   * <code>POI_DECORATION_PROPERTIES_SIZE = 2;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_SIZE_VALUE = 2;
  /**
   * <code>POI_DECORATION_PROPERTIES_TEXT = 3;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_TEXT_VALUE = 3;
  /**
   * <code>POI_DECORATION_PROPERTIES_ACTIVE = 4;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_ACTIVE_VALUE = 4;
  /**
   * <code>POI_DECORATION_PROPERTIES_ICON = 5;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_ICON_VALUE = 5;
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_RAID_DATA = 6;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_SET_RAID_DATA_VALUE = 6;
  /**
   * <code>POI_DECORATION_PROPERTIES_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_NEARBY_CARROT_VISIBLE_VALUE = 7;
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_LOWEST_MOTIVATION = 8;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_SET_LOWEST_MOTIVATION_VALUE = 8;
  /**
   * <code>POI_DECORATION_PROPERTIES_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_SET_NPC_CLICKED_ACTION_VALUE = 9;
  /**
   * <code>POI_DECORATION_PROPERTIES_BEGIN_EXIT = 10;</code>
   */
  public static final int POI_DECORATION_PROPERTIES_BEGIN_EXIT_VALUE = 10;


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
  public static POIDecorationProperties valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static POIDecorationProperties forNumber(int value) {
    switch (value) {
      case 0: return POI_DECORATION_PROPERTIES_COLOR;
      case 1: return POI_DECORATION_PROPERTIES_POSITION;
      case 2: return POI_DECORATION_PROPERTIES_SIZE;
      case 3: return POI_DECORATION_PROPERTIES_TEXT;
      case 4: return POI_DECORATION_PROPERTIES_ACTIVE;
      case 5: return POI_DECORATION_PROPERTIES_ICON;
      case 6: return POI_DECORATION_PROPERTIES_SET_RAID_DATA;
      case 7: return POI_DECORATION_PROPERTIES_NEARBY_CARROT_VISIBLE;
      case 8: return POI_DECORATION_PROPERTIES_SET_LOWEST_MOTIVATION;
      case 9: return POI_DECORATION_PROPERTIES_SET_NPC_CLICKED_ACTION;
      case 10: return POI_DECORATION_PROPERTIES_BEGIN_EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<POIDecorationProperties>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      POIDecorationProperties> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<POIDecorationProperties>() {
          public POIDecorationProperties findValueByNumber(int number) {
            return POIDecorationProperties.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(95);
  }

  private static final POIDecorationProperties[] VALUES = values();

  public static POIDecorationProperties valueOf(
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

  private POIDecorationProperties(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.POIDecorationProperties)
}

