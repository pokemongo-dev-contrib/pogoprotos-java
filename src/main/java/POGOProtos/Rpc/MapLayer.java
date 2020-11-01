// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.MapLayer}
 */
public enum MapLayer
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MAP_LAYER_UNDEFINED = 0;</code>
   */
  MAP_LAYER_UNDEFINED(0),
  /**
   * <code>MAP_LAYER_BOUNDARIES = 1;</code>
   */
  MAP_LAYER_BOUNDARIES(1),
  /**
   * <code>MAP_LAYER_BUILDINGS = 2;</code>
   */
  MAP_LAYER_BUILDINGS(2),
  /**
   * <code>MAP_LAYER_LANDMASS = 3;</code>
   */
  MAP_LAYER_LANDMASS(3),
  /**
   * <code>MAP_LAYER_LANDUSE = 4;</code>
   */
  MAP_LAYER_LANDUSE(4),
  /**
   * <code>MAP_LAYER_PLACES = 5;</code>
   */
  MAP_LAYER_PLACES(5),
  /**
   * <code>MAP_LAYER_POIS = 6;</code>
   */
  MAP_LAYER_POIS(6),
  /**
   * <code>MAP_LAYER_ROADS = 7;</code>
   */
  MAP_LAYER_ROADS(7),
  /**
   * <code>MAP_LAYER_TRANSIT = 8;</code>
   */
  MAP_LAYER_TRANSIT(8),
  /**
   * <code>MAP_LAYER_WATER = 9;</code>
   */
  MAP_LAYER_WATER(9),
  /**
   * <code>MAP_LAYER_DEBUG_TILE_BOUNDARIES = 10;</code>
   */
  MAP_LAYER_DEBUG_TILE_BOUNDARIES(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MAP_LAYER_UNDEFINED = 0;</code>
   */
  public static final int MAP_LAYER_UNDEFINED_VALUE = 0;
  /**
   * <code>MAP_LAYER_BOUNDARIES = 1;</code>
   */
  public static final int MAP_LAYER_BOUNDARIES_VALUE = 1;
  /**
   * <code>MAP_LAYER_BUILDINGS = 2;</code>
   */
  public static final int MAP_LAYER_BUILDINGS_VALUE = 2;
  /**
   * <code>MAP_LAYER_LANDMASS = 3;</code>
   */
  public static final int MAP_LAYER_LANDMASS_VALUE = 3;
  /**
   * <code>MAP_LAYER_LANDUSE = 4;</code>
   */
  public static final int MAP_LAYER_LANDUSE_VALUE = 4;
  /**
   * <code>MAP_LAYER_PLACES = 5;</code>
   */
  public static final int MAP_LAYER_PLACES_VALUE = 5;
  /**
   * <code>MAP_LAYER_POIS = 6;</code>
   */
  public static final int MAP_LAYER_POIS_VALUE = 6;
  /**
   * <code>MAP_LAYER_ROADS = 7;</code>
   */
  public static final int MAP_LAYER_ROADS_VALUE = 7;
  /**
   * <code>MAP_LAYER_TRANSIT = 8;</code>
   */
  public static final int MAP_LAYER_TRANSIT_VALUE = 8;
  /**
   * <code>MAP_LAYER_WATER = 9;</code>
   */
  public static final int MAP_LAYER_WATER_VALUE = 9;
  /**
   * <code>MAP_LAYER_DEBUG_TILE_BOUNDARIES = 10;</code>
   */
  public static final int MAP_LAYER_DEBUG_TILE_BOUNDARIES_VALUE = 10;


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
  public static MapLayer valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MapLayer forNumber(int value) {
    switch (value) {
      case 0: return MAP_LAYER_UNDEFINED;
      case 1: return MAP_LAYER_BOUNDARIES;
      case 2: return MAP_LAYER_BUILDINGS;
      case 3: return MAP_LAYER_LANDMASS;
      case 4: return MAP_LAYER_LANDUSE;
      case 5: return MAP_LAYER_PLACES;
      case 6: return MAP_LAYER_POIS;
      case 7: return MAP_LAYER_ROADS;
      case 8: return MAP_LAYER_TRANSIT;
      case 9: return MAP_LAYER_WATER;
      case 10: return MAP_LAYER_DEBUG_TILE_BOUNDARIES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MapLayer>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MapLayer> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MapLayer>() {
          public MapLayer findValueByNumber(int number) {
            return MapLayer.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(78);
  }

  private static final MapLayer[] VALUES = values();

  public static MapLayer valueOf(
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

  private MapLayer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MapLayer)
}

