// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.FeatureKind}
 */
public enum FeatureKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLATFORM_FEATURE_KIND_UNDEFINED = 0;</code>
   */
  PLATFORM_FEATURE_KIND_UNDEFINED(0),
  /**
   * <code>PLATFORM_FEATURE_KIND_BASIN = 1;</code>
   */
  PLATFORM_FEATURE_KIND_BASIN(1),
  /**
   * <code>PLATFORM_FEATURE_KIND_CANAL = 2;</code>
   */
  PLATFORM_FEATURE_KIND_CANAL(2),
  /**
   * <code>PLATFORM_FEATURE_KIND_CEMETERY = 3;</code>
   */
  PLATFORM_FEATURE_KIND_CEMETERY(3),
  /**
   * <code>PLATFORM_FEATURE_KIND_CINEMA = 4;</code>
   */
  PLATFORM_FEATURE_KIND_CINEMA(4),
  /**
   * <code>PLATFORM_FEATURE_KIND_COLLEGE = 5;</code>
   */
  PLATFORM_FEATURE_KIND_COLLEGE(5),
  /**
   * <code>PLATFORM_FEATURE_KIND_COMMERCIAL = 6;</code>
   */
  PLATFORM_FEATURE_KIND_COMMERCIAL(6),
  /**
   * <code>PLATFORM_FEATURE_KIND_COMMON = 7;</code>
   */
  PLATFORM_FEATURE_KIND_COMMON(7),
  /**
   * <code>PLATFORM_FEATURE_KIND_DAM = 8;</code>
   */
  PLATFORM_FEATURE_KIND_DAM(8),
  /**
   * <code>PLATFORM_FEATURE_KIND_DITCH = 9;</code>
   */
  PLATFORM_FEATURE_KIND_DITCH(9),
  /**
   * <code>PLATFORM_FEATURE_KIND_DOCK = 10;</code>
   */
  PLATFORM_FEATURE_KIND_DOCK(10),
  /**
   * <code>PLATFORM_FEATURE_KIND_DRAIN = 11;</code>
   */
  PLATFORM_FEATURE_KIND_DRAIN(11),
  /**
   * <code>PLATFORM_FEATURE_KIND_FARM = 12;</code>
   */
  PLATFORM_FEATURE_KIND_FARM(12),
  /**
   * <code>PLATFORM_FEATURE_KIND_FARMLAND = 13;</code>
   */
  PLATFORM_FEATURE_KIND_FARMLAND(13),
  /**
   * <code>PLATFORM_FEATURE_KIND_FARMYARD = 14;</code>
   */
  PLATFORM_FEATURE_KIND_FARMYARD(14),
  /**
   * <code>PLATFORM_FEATURE_KIND_FOOTWAY = 15;</code>
   */
  PLATFORM_FEATURE_KIND_FOOTWAY(15),
  /**
   * <code>PLATFORM_FEATURE_KIND_FOREST = 16;</code>
   */
  PLATFORM_FEATURE_KIND_FOREST(16),
  /**
   * <code>PLATFORM_FEATURE_KIND_GARDEN = 17;</code>
   */
  PLATFORM_FEATURE_KIND_GARDEN(17),
  /**
   * <code>PLATFORM_FEATURE_KIND_GLACIER = 18;</code>
   */
  PLATFORM_FEATURE_KIND_GLACIER(18),
  /**
   * <code>PLATFORM_FEATURE_KIND_GOLF_COURSE = 19;</code>
   */
  PLATFORM_FEATURE_KIND_GOLF_COURSE(19),
  /**
   * <code>PLATFORM_FEATURE_KIND_GRASS = 20;</code>
   */
  PLATFORM_FEATURE_KIND_GRASS(20),
  /**
   * <code>PLATFORM_FEATURE_KIND_HIGHWAY = 21;</code>
   */
  PLATFORM_FEATURE_KIND_HIGHWAY(21),
  /**
   * <code>PLATFORM_FEATURE_KIND_HOSPITAL = 22;</code>
   */
  PLATFORM_FEATURE_KIND_HOSPITAL(22),
  /**
   * <code>PLATFORM_FEATURE_KIND_HOTEL = 23;</code>
   */
  PLATFORM_FEATURE_KIND_HOTEL(23),
  /**
   * <code>PLATFORM_FEATURE_KIND_INDUSTRIAL = 24;</code>
   */
  PLATFORM_FEATURE_KIND_INDUSTRIAL(24),
  /**
   * <code>PLATFORM_FEATURE_KIND_LAKE = 25;</code>
   */
  PLATFORM_FEATURE_KIND_LAKE(25),
  /**
   * <code>PLATFORM_FEATURE_KIND_LAND = 26;</code>
   */
  PLATFORM_FEATURE_KIND_LAND(26),
  /**
   * <code>PLATFORM_FEATURE_KIND_LIBRARY = 27;</code>
   */
  PLATFORM_FEATURE_KIND_LIBRARY(27),
  /**
   * <code>PLATFORM_FEATURE_KIND_MAJOR_ROAD = 28;</code>
   */
  PLATFORM_FEATURE_KIND_MAJOR_ROAD(28),
  /**
   * <code>PLATFORM_FEATURE_KIND_MEADOW = 29;</code>
   */
  PLATFORM_FEATURE_KIND_MEADOW(29),
  /**
   * <code>PLATFORM_FEATURE_KIND_MINOR_ROAD = 30;</code>
   */
  PLATFORM_FEATURE_KIND_MINOR_ROAD(30),
  /**
   * <code>PLATFORM_FEATURE_KIND_NATURE_RESERVE = 31;</code>
   */
  PLATFORM_FEATURE_KIND_NATURE_RESERVE(31),
  /**
   * <code>PLATFORM_FEATURE_KIND_OCEAN = 32;</code>
   */
  PLATFORM_FEATURE_KIND_OCEAN(32),
  /**
   * <code>PLATFORM_FEATURE_KIND_PARK = 33;</code>
   */
  PLATFORM_FEATURE_KIND_PARK(33),
  /**
   * <code>PLATFORM_FEATURE_KIND_PARKING = 34;</code>
   */
  PLATFORM_FEATURE_KIND_PARKING(34),
  /**
   * <code>PLATFORM_FEATURE_KIND_PATH = 35;</code>
   */
  PLATFORM_FEATURE_KIND_PATH(35),
  /**
   * <code>PLATFORM_FEATURE_KIND_PEDESTRIAN = 36;</code>
   */
  PLATFORM_FEATURE_KIND_PEDESTRIAN(36),
  /**
   * <code>PLATFORM_FEATURE_KIND_PITCH = 37;</code>
   */
  PLATFORM_FEATURE_KIND_PITCH(37),
  /**
   * <code>PLATFORM_FEATURE_KIND_PLACE_OF_WORSHIP = 38;</code>
   */
  PLATFORM_FEATURE_KIND_PLACE_OF_WORSHIP(38),
  /**
   * <code>PLATFORM_FEATURE_KIND_PLAYA = 39;</code>
   */
  PLATFORM_FEATURE_KIND_PLAYA(39),
  /**
   * <code>PLATFORM_FEATURE_KIND_PLAYGROUND = 40;</code>
   */
  PLATFORM_FEATURE_KIND_PLAYGROUND(40),
  /**
   * <code>PLATFORM_FEATURE_KIND_QUARRY = 41;</code>
   */
  PLATFORM_FEATURE_KIND_QUARRY(41),
  /**
   * <code>PLATFORM_FEATURE_KIND_RAILWAY = 42;</code>
   */
  PLATFORM_FEATURE_KIND_RAILWAY(42),
  /**
   * <code>PLATFORM_FEATURE_KIND_RECREATION_AREA = 43;</code>
   */
  PLATFORM_FEATURE_KIND_RECREATION_AREA(43),
  /**
   * <code>PLATFORM_FEATURE_KIND_RESERVOIR = 44;</code>
   */
  PLATFORM_FEATURE_KIND_RESERVOIR(44),
  /**
   * <code>PLATFORM_FEATURE_KIND_RESIDENTIAL = 45;</code>
   */
  PLATFORM_FEATURE_KIND_RESIDENTIAL(45),
  /**
   * <code>PLATFORM_FEATURE_KIND_RETAIL = 46;</code>
   */
  PLATFORM_FEATURE_KIND_RETAIL(46),
  /**
   * <code>PLATFORM_FEATURE_KIND_RIVER = 47;</code>
   */
  PLATFORM_FEATURE_KIND_RIVER(47),
  /**
   * <code>PLATFORM_FEATURE_KIND_RIVERBANK = 48;</code>
   */
  PLATFORM_FEATURE_KIND_RIVERBANK(48),
  /**
   * <code>PLATFORM_FEATURE_KIND_RUNWAY = 49;</code>
   */
  PLATFORM_FEATURE_KIND_RUNWAY(49),
  /**
   * <code>PLATFORM_FEATURE_KIND_SCHOOL = 50;</code>
   */
  PLATFORM_FEATURE_KIND_SCHOOL(50),
  /**
   * <code>PLATFORM_FEATURE_KIND_SPORTS_CENTER = 51;</code>
   */
  PLATFORM_FEATURE_KIND_SPORTS_CENTER(51),
  /**
   * <code>PLATFORM_FEATURE_KIND_STADIUM = 52;</code>
   */
  PLATFORM_FEATURE_KIND_STADIUM(52),
  /**
   * <code>PLATFORM_FEATURE_KIND_STREAM = 53;</code>
   */
  PLATFORM_FEATURE_KIND_STREAM(53),
  /**
   * <code>PLATFORM_FEATURE_KIND_TAXIWAY = 54;</code>
   */
  PLATFORM_FEATURE_KIND_TAXIWAY(54),
  /**
   * <code>PLATFORM_FEATURE_KIND_THEATRE = 55;</code>
   */
  PLATFORM_FEATURE_KIND_THEATRE(55),
  /**
   * <code>PLATFORM_FEATURE_KIND_UNIVERSITY = 56;</code>
   */
  PLATFORM_FEATURE_KIND_UNIVERSITY(56),
  /**
   * <code>PLATFORM_FEATURE_KIND_URBAN_AREA = 57;</code>
   */
  PLATFORM_FEATURE_KIND_URBAN_AREA(57),
  /**
   * <code>PLATFORM_FEATURE_KIND_WATER = 58;</code>
   */
  PLATFORM_FEATURE_KIND_WATER(58),
  /**
   * <code>PLATFORM_FEATURE_KIND_WETLAND = 59;</code>
   */
  PLATFORM_FEATURE_KIND_WETLAND(59),
  /**
   * <code>PLATFORM_FEATURE_KIND_WOOD = 60;</code>
   */
  PLATFORM_FEATURE_KIND_WOOD(60),
  /**
   * <code>PLATFORM_FEATURE_KIND_DEBUG_TILE_OUTLINE = 61;</code>
   */
  PLATFORM_FEATURE_KIND_DEBUG_TILE_OUTLINE(61),
  /**
   * <code>PLATFORM_FEATURE_KIND_DEBUG_TILE_SURFACE = 62;</code>
   */
  PLATFORM_FEATURE_KIND_DEBUG_TILE_SURFACE(62),
  /**
   * <code>PLATFORM_FEATURE_KIND_OTHER = 63;</code>
   */
  PLATFORM_FEATURE_KIND_OTHER(63),
  /**
   * <code>PLATFORM_FEATURE_KIND_COUNTRY = 64;</code>
   */
  PLATFORM_FEATURE_KIND_COUNTRY(64),
  /**
   * <code>PLATFORM_FEATURE_KIND_REGION = 65;</code>
   */
  PLATFORM_FEATURE_KIND_REGION(65),
  /**
   * <code>PLATFORM_FEATURE_KIND_CITY = 66;</code>
   */
  PLATFORM_FEATURE_KIND_CITY(66),
  /**
   * <code>PLATFORM_FEATURE_KIND_TOWN = 67;</code>
   */
  PLATFORM_FEATURE_KIND_TOWN(67),
  /**
   * <code>PLATFORM_FEATURE_KIND_AIRPORT = 68;</code>
   */
  PLATFORM_FEATURE_KIND_AIRPORT(68),
  /**
   * <code>PLATFORM_FEATURE_KIND_BAY = 69;</code>
   */
  PLATFORM_FEATURE_KIND_BAY(69),
  /**
   * <code>PLATFORM_FEATURE_KIND_BOROUGH = 70;</code>
   */
  PLATFORM_FEATURE_KIND_BOROUGH(70),
  /**
   * <code>PLATFORM_FEATURE_KIND_FJORD = 71;</code>
   */
  PLATFORM_FEATURE_KIND_FJORD(71),
  /**
   * <code>PLATFORM_FEATURE_KIND_HAMLET = 72;</code>
   */
  PLATFORM_FEATURE_KIND_HAMLET(72),
  /**
   * <code>PLATFORM_FEATURE_KIND_MILITARY = 73;</code>
   */
  PLATFORM_FEATURE_KIND_MILITARY(73),
  /**
   * <code>PLATFORM_FEATURE_KIND_NATIONAL_PARK = 74;</code>
   */
  PLATFORM_FEATURE_KIND_NATIONAL_PARK(74),
  /**
   * <code>PLATFORM_FEATURE_KIND_NEIGHBORHOOD = 75;</code>
   */
  PLATFORM_FEATURE_KIND_NEIGHBORHOOD(75),
  /**
   * <code>PLATFORM_FEATURE_KIND_PEAK = 76;</code>
   */
  PLATFORM_FEATURE_KIND_PEAK(76),
  /**
   * <code>PLATFORM_FEATURE_KIND_PRISON = 77;</code>
   */
  PLATFORM_FEATURE_KIND_PRISON(77),
  /**
   * <code>PLATFORM_FEATURE_KIND_PROTECTED_AREA = 78;</code>
   */
  PLATFORM_FEATURE_KIND_PROTECTED_AREA(78),
  /**
   * <code>PLATFORM_FEATURE_KIND_REEF = 79;</code>
   */
  PLATFORM_FEATURE_KIND_REEF(79),
  /**
   * <code>PLATFORM_FEATURE_KIND_ROCK = 80;</code>
   */
  PLATFORM_FEATURE_KIND_ROCK(80),
  /**
   * <code>PLATFORM_FEATURE_KIND_SAND = 81;</code>
   */
  PLATFORM_FEATURE_KIND_SAND(81),
  /**
   * <code>PLATFORM_FEATURE_KIND_SCRUB = 82;</code>
   */
  PLATFORM_FEATURE_KIND_SCRUB(82),
  /**
   * <code>PLATFORM_FEATURE_KIND_SEA = 83;</code>
   */
  PLATFORM_FEATURE_KIND_SEA(83),
  /**
   * <code>PLATFORM_FEATURE_KIND_STRAIT = 84;</code>
   */
  PLATFORM_FEATURE_KIND_STRAIT(84),
  /**
   * <code>PLATFORM_FEATURE_KIND_VALLEY = 85;</code>
   */
  PLATFORM_FEATURE_KIND_VALLEY(85),
  /**
   * <code>PLATFORM_FEATURE_KIND_VILLAGE = 86;</code>
   */
  PLATFORM_FEATURE_KIND_VILLAGE(86),
  /**
   * <code>PLATFORM_FEATURE_KIND_ANY = 2000;</code>
   */
  PLATFORM_FEATURE_KIND_ANY(2000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLATFORM_FEATURE_KIND_UNDEFINED = 0;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_UNDEFINED_VALUE = 0;
  /**
   * <code>PLATFORM_FEATURE_KIND_BASIN = 1;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_BASIN_VALUE = 1;
  /**
   * <code>PLATFORM_FEATURE_KIND_CANAL = 2;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_CANAL_VALUE = 2;
  /**
   * <code>PLATFORM_FEATURE_KIND_CEMETERY = 3;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_CEMETERY_VALUE = 3;
  /**
   * <code>PLATFORM_FEATURE_KIND_CINEMA = 4;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_CINEMA_VALUE = 4;
  /**
   * <code>PLATFORM_FEATURE_KIND_COLLEGE = 5;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_COLLEGE_VALUE = 5;
  /**
   * <code>PLATFORM_FEATURE_KIND_COMMERCIAL = 6;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_COMMERCIAL_VALUE = 6;
  /**
   * <code>PLATFORM_FEATURE_KIND_COMMON = 7;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_COMMON_VALUE = 7;
  /**
   * <code>PLATFORM_FEATURE_KIND_DAM = 8;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DAM_VALUE = 8;
  /**
   * <code>PLATFORM_FEATURE_KIND_DITCH = 9;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DITCH_VALUE = 9;
  /**
   * <code>PLATFORM_FEATURE_KIND_DOCK = 10;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DOCK_VALUE = 10;
  /**
   * <code>PLATFORM_FEATURE_KIND_DRAIN = 11;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DRAIN_VALUE = 11;
  /**
   * <code>PLATFORM_FEATURE_KIND_FARM = 12;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FARM_VALUE = 12;
  /**
   * <code>PLATFORM_FEATURE_KIND_FARMLAND = 13;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FARMLAND_VALUE = 13;
  /**
   * <code>PLATFORM_FEATURE_KIND_FARMYARD = 14;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FARMYARD_VALUE = 14;
  /**
   * <code>PLATFORM_FEATURE_KIND_FOOTWAY = 15;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FOOTWAY_VALUE = 15;
  /**
   * <code>PLATFORM_FEATURE_KIND_FOREST = 16;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FOREST_VALUE = 16;
  /**
   * <code>PLATFORM_FEATURE_KIND_GARDEN = 17;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_GARDEN_VALUE = 17;
  /**
   * <code>PLATFORM_FEATURE_KIND_GLACIER = 18;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_GLACIER_VALUE = 18;
  /**
   * <code>PLATFORM_FEATURE_KIND_GOLF_COURSE = 19;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_GOLF_COURSE_VALUE = 19;
  /**
   * <code>PLATFORM_FEATURE_KIND_GRASS = 20;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_GRASS_VALUE = 20;
  /**
   * <code>PLATFORM_FEATURE_KIND_HIGHWAY = 21;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_HIGHWAY_VALUE = 21;
  /**
   * <code>PLATFORM_FEATURE_KIND_HOSPITAL = 22;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_HOSPITAL_VALUE = 22;
  /**
   * <code>PLATFORM_FEATURE_KIND_HOTEL = 23;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_HOTEL_VALUE = 23;
  /**
   * <code>PLATFORM_FEATURE_KIND_INDUSTRIAL = 24;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_INDUSTRIAL_VALUE = 24;
  /**
   * <code>PLATFORM_FEATURE_KIND_LAKE = 25;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_LAKE_VALUE = 25;
  /**
   * <code>PLATFORM_FEATURE_KIND_LAND = 26;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_LAND_VALUE = 26;
  /**
   * <code>PLATFORM_FEATURE_KIND_LIBRARY = 27;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_LIBRARY_VALUE = 27;
  /**
   * <code>PLATFORM_FEATURE_KIND_MAJOR_ROAD = 28;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_MAJOR_ROAD_VALUE = 28;
  /**
   * <code>PLATFORM_FEATURE_KIND_MEADOW = 29;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_MEADOW_VALUE = 29;
  /**
   * <code>PLATFORM_FEATURE_KIND_MINOR_ROAD = 30;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_MINOR_ROAD_VALUE = 30;
  /**
   * <code>PLATFORM_FEATURE_KIND_NATURE_RESERVE = 31;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_NATURE_RESERVE_VALUE = 31;
  /**
   * <code>PLATFORM_FEATURE_KIND_OCEAN = 32;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_OCEAN_VALUE = 32;
  /**
   * <code>PLATFORM_FEATURE_KIND_PARK = 33;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PARK_VALUE = 33;
  /**
   * <code>PLATFORM_FEATURE_KIND_PARKING = 34;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PARKING_VALUE = 34;
  /**
   * <code>PLATFORM_FEATURE_KIND_PATH = 35;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PATH_VALUE = 35;
  /**
   * <code>PLATFORM_FEATURE_KIND_PEDESTRIAN = 36;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PEDESTRIAN_VALUE = 36;
  /**
   * <code>PLATFORM_FEATURE_KIND_PITCH = 37;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PITCH_VALUE = 37;
  /**
   * <code>PLATFORM_FEATURE_KIND_PLACE_OF_WORSHIP = 38;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PLACE_OF_WORSHIP_VALUE = 38;
  /**
   * <code>PLATFORM_FEATURE_KIND_PLAYA = 39;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PLAYA_VALUE = 39;
  /**
   * <code>PLATFORM_FEATURE_KIND_PLAYGROUND = 40;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PLAYGROUND_VALUE = 40;
  /**
   * <code>PLATFORM_FEATURE_KIND_QUARRY = 41;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_QUARRY_VALUE = 41;
  /**
   * <code>PLATFORM_FEATURE_KIND_RAILWAY = 42;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RAILWAY_VALUE = 42;
  /**
   * <code>PLATFORM_FEATURE_KIND_RECREATION_AREA = 43;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RECREATION_AREA_VALUE = 43;
  /**
   * <code>PLATFORM_FEATURE_KIND_RESERVOIR = 44;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RESERVOIR_VALUE = 44;
  /**
   * <code>PLATFORM_FEATURE_KIND_RESIDENTIAL = 45;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RESIDENTIAL_VALUE = 45;
  /**
   * <code>PLATFORM_FEATURE_KIND_RETAIL = 46;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RETAIL_VALUE = 46;
  /**
   * <code>PLATFORM_FEATURE_KIND_RIVER = 47;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RIVER_VALUE = 47;
  /**
   * <code>PLATFORM_FEATURE_KIND_RIVERBANK = 48;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RIVERBANK_VALUE = 48;
  /**
   * <code>PLATFORM_FEATURE_KIND_RUNWAY = 49;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_RUNWAY_VALUE = 49;
  /**
   * <code>PLATFORM_FEATURE_KIND_SCHOOL = 50;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_SCHOOL_VALUE = 50;
  /**
   * <code>PLATFORM_FEATURE_KIND_SPORTS_CENTER = 51;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_SPORTS_CENTER_VALUE = 51;
  /**
   * <code>PLATFORM_FEATURE_KIND_STADIUM = 52;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_STADIUM_VALUE = 52;
  /**
   * <code>PLATFORM_FEATURE_KIND_STREAM = 53;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_STREAM_VALUE = 53;
  /**
   * <code>PLATFORM_FEATURE_KIND_TAXIWAY = 54;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_TAXIWAY_VALUE = 54;
  /**
   * <code>PLATFORM_FEATURE_KIND_THEATRE = 55;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_THEATRE_VALUE = 55;
  /**
   * <code>PLATFORM_FEATURE_KIND_UNIVERSITY = 56;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_UNIVERSITY_VALUE = 56;
  /**
   * <code>PLATFORM_FEATURE_KIND_URBAN_AREA = 57;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_URBAN_AREA_VALUE = 57;
  /**
   * <code>PLATFORM_FEATURE_KIND_WATER = 58;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_WATER_VALUE = 58;
  /**
   * <code>PLATFORM_FEATURE_KIND_WETLAND = 59;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_WETLAND_VALUE = 59;
  /**
   * <code>PLATFORM_FEATURE_KIND_WOOD = 60;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_WOOD_VALUE = 60;
  /**
   * <code>PLATFORM_FEATURE_KIND_DEBUG_TILE_OUTLINE = 61;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DEBUG_TILE_OUTLINE_VALUE = 61;
  /**
   * <code>PLATFORM_FEATURE_KIND_DEBUG_TILE_SURFACE = 62;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_DEBUG_TILE_SURFACE_VALUE = 62;
  /**
   * <code>PLATFORM_FEATURE_KIND_OTHER = 63;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_OTHER_VALUE = 63;
  /**
   * <code>PLATFORM_FEATURE_KIND_COUNTRY = 64;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_COUNTRY_VALUE = 64;
  /**
   * <code>PLATFORM_FEATURE_KIND_REGION = 65;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_REGION_VALUE = 65;
  /**
   * <code>PLATFORM_FEATURE_KIND_CITY = 66;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_CITY_VALUE = 66;
  /**
   * <code>PLATFORM_FEATURE_KIND_TOWN = 67;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_TOWN_VALUE = 67;
  /**
   * <code>PLATFORM_FEATURE_KIND_AIRPORT = 68;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_AIRPORT_VALUE = 68;
  /**
   * <code>PLATFORM_FEATURE_KIND_BAY = 69;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_BAY_VALUE = 69;
  /**
   * <code>PLATFORM_FEATURE_KIND_BOROUGH = 70;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_BOROUGH_VALUE = 70;
  /**
   * <code>PLATFORM_FEATURE_KIND_FJORD = 71;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_FJORD_VALUE = 71;
  /**
   * <code>PLATFORM_FEATURE_KIND_HAMLET = 72;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_HAMLET_VALUE = 72;
  /**
   * <code>PLATFORM_FEATURE_KIND_MILITARY = 73;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_MILITARY_VALUE = 73;
  /**
   * <code>PLATFORM_FEATURE_KIND_NATIONAL_PARK = 74;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_NATIONAL_PARK_VALUE = 74;
  /**
   * <code>PLATFORM_FEATURE_KIND_NEIGHBORHOOD = 75;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_NEIGHBORHOOD_VALUE = 75;
  /**
   * <code>PLATFORM_FEATURE_KIND_PEAK = 76;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PEAK_VALUE = 76;
  /**
   * <code>PLATFORM_FEATURE_KIND_PRISON = 77;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PRISON_VALUE = 77;
  /**
   * <code>PLATFORM_FEATURE_KIND_PROTECTED_AREA = 78;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_PROTECTED_AREA_VALUE = 78;
  /**
   * <code>PLATFORM_FEATURE_KIND_REEF = 79;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_REEF_VALUE = 79;
  /**
   * <code>PLATFORM_FEATURE_KIND_ROCK = 80;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_ROCK_VALUE = 80;
  /**
   * <code>PLATFORM_FEATURE_KIND_SAND = 81;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_SAND_VALUE = 81;
  /**
   * <code>PLATFORM_FEATURE_KIND_SCRUB = 82;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_SCRUB_VALUE = 82;
  /**
   * <code>PLATFORM_FEATURE_KIND_SEA = 83;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_SEA_VALUE = 83;
  /**
   * <code>PLATFORM_FEATURE_KIND_STRAIT = 84;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_STRAIT_VALUE = 84;
  /**
   * <code>PLATFORM_FEATURE_KIND_VALLEY = 85;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_VALLEY_VALUE = 85;
  /**
   * <code>PLATFORM_FEATURE_KIND_VILLAGE = 86;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_VILLAGE_VALUE = 86;
  /**
   * <code>PLATFORM_FEATURE_KIND_ANY = 2000;</code>
   */
  public static final int PLATFORM_FEATURE_KIND_ANY_VALUE = 2000;


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
  public static FeatureKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatureKind forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_FEATURE_KIND_UNDEFINED;
      case 1: return PLATFORM_FEATURE_KIND_BASIN;
      case 2: return PLATFORM_FEATURE_KIND_CANAL;
      case 3: return PLATFORM_FEATURE_KIND_CEMETERY;
      case 4: return PLATFORM_FEATURE_KIND_CINEMA;
      case 5: return PLATFORM_FEATURE_KIND_COLLEGE;
      case 6: return PLATFORM_FEATURE_KIND_COMMERCIAL;
      case 7: return PLATFORM_FEATURE_KIND_COMMON;
      case 8: return PLATFORM_FEATURE_KIND_DAM;
      case 9: return PLATFORM_FEATURE_KIND_DITCH;
      case 10: return PLATFORM_FEATURE_KIND_DOCK;
      case 11: return PLATFORM_FEATURE_KIND_DRAIN;
      case 12: return PLATFORM_FEATURE_KIND_FARM;
      case 13: return PLATFORM_FEATURE_KIND_FARMLAND;
      case 14: return PLATFORM_FEATURE_KIND_FARMYARD;
      case 15: return PLATFORM_FEATURE_KIND_FOOTWAY;
      case 16: return PLATFORM_FEATURE_KIND_FOREST;
      case 17: return PLATFORM_FEATURE_KIND_GARDEN;
      case 18: return PLATFORM_FEATURE_KIND_GLACIER;
      case 19: return PLATFORM_FEATURE_KIND_GOLF_COURSE;
      case 20: return PLATFORM_FEATURE_KIND_GRASS;
      case 21: return PLATFORM_FEATURE_KIND_HIGHWAY;
      case 22: return PLATFORM_FEATURE_KIND_HOSPITAL;
      case 23: return PLATFORM_FEATURE_KIND_HOTEL;
      case 24: return PLATFORM_FEATURE_KIND_INDUSTRIAL;
      case 25: return PLATFORM_FEATURE_KIND_LAKE;
      case 26: return PLATFORM_FEATURE_KIND_LAND;
      case 27: return PLATFORM_FEATURE_KIND_LIBRARY;
      case 28: return PLATFORM_FEATURE_KIND_MAJOR_ROAD;
      case 29: return PLATFORM_FEATURE_KIND_MEADOW;
      case 30: return PLATFORM_FEATURE_KIND_MINOR_ROAD;
      case 31: return PLATFORM_FEATURE_KIND_NATURE_RESERVE;
      case 32: return PLATFORM_FEATURE_KIND_OCEAN;
      case 33: return PLATFORM_FEATURE_KIND_PARK;
      case 34: return PLATFORM_FEATURE_KIND_PARKING;
      case 35: return PLATFORM_FEATURE_KIND_PATH;
      case 36: return PLATFORM_FEATURE_KIND_PEDESTRIAN;
      case 37: return PLATFORM_FEATURE_KIND_PITCH;
      case 38: return PLATFORM_FEATURE_KIND_PLACE_OF_WORSHIP;
      case 39: return PLATFORM_FEATURE_KIND_PLAYA;
      case 40: return PLATFORM_FEATURE_KIND_PLAYGROUND;
      case 41: return PLATFORM_FEATURE_KIND_QUARRY;
      case 42: return PLATFORM_FEATURE_KIND_RAILWAY;
      case 43: return PLATFORM_FEATURE_KIND_RECREATION_AREA;
      case 44: return PLATFORM_FEATURE_KIND_RESERVOIR;
      case 45: return PLATFORM_FEATURE_KIND_RESIDENTIAL;
      case 46: return PLATFORM_FEATURE_KIND_RETAIL;
      case 47: return PLATFORM_FEATURE_KIND_RIVER;
      case 48: return PLATFORM_FEATURE_KIND_RIVERBANK;
      case 49: return PLATFORM_FEATURE_KIND_RUNWAY;
      case 50: return PLATFORM_FEATURE_KIND_SCHOOL;
      case 51: return PLATFORM_FEATURE_KIND_SPORTS_CENTER;
      case 52: return PLATFORM_FEATURE_KIND_STADIUM;
      case 53: return PLATFORM_FEATURE_KIND_STREAM;
      case 54: return PLATFORM_FEATURE_KIND_TAXIWAY;
      case 55: return PLATFORM_FEATURE_KIND_THEATRE;
      case 56: return PLATFORM_FEATURE_KIND_UNIVERSITY;
      case 57: return PLATFORM_FEATURE_KIND_URBAN_AREA;
      case 58: return PLATFORM_FEATURE_KIND_WATER;
      case 59: return PLATFORM_FEATURE_KIND_WETLAND;
      case 60: return PLATFORM_FEATURE_KIND_WOOD;
      case 61: return PLATFORM_FEATURE_KIND_DEBUG_TILE_OUTLINE;
      case 62: return PLATFORM_FEATURE_KIND_DEBUG_TILE_SURFACE;
      case 63: return PLATFORM_FEATURE_KIND_OTHER;
      case 64: return PLATFORM_FEATURE_KIND_COUNTRY;
      case 65: return PLATFORM_FEATURE_KIND_REGION;
      case 66: return PLATFORM_FEATURE_KIND_CITY;
      case 67: return PLATFORM_FEATURE_KIND_TOWN;
      case 68: return PLATFORM_FEATURE_KIND_AIRPORT;
      case 69: return PLATFORM_FEATURE_KIND_BAY;
      case 70: return PLATFORM_FEATURE_KIND_BOROUGH;
      case 71: return PLATFORM_FEATURE_KIND_FJORD;
      case 72: return PLATFORM_FEATURE_KIND_HAMLET;
      case 73: return PLATFORM_FEATURE_KIND_MILITARY;
      case 74: return PLATFORM_FEATURE_KIND_NATIONAL_PARK;
      case 75: return PLATFORM_FEATURE_KIND_NEIGHBORHOOD;
      case 76: return PLATFORM_FEATURE_KIND_PEAK;
      case 77: return PLATFORM_FEATURE_KIND_PRISON;
      case 78: return PLATFORM_FEATURE_KIND_PROTECTED_AREA;
      case 79: return PLATFORM_FEATURE_KIND_REEF;
      case 80: return PLATFORM_FEATURE_KIND_ROCK;
      case 81: return PLATFORM_FEATURE_KIND_SAND;
      case 82: return PLATFORM_FEATURE_KIND_SCRUB;
      case 83: return PLATFORM_FEATURE_KIND_SEA;
      case 84: return PLATFORM_FEATURE_KIND_STRAIT;
      case 85: return PLATFORM_FEATURE_KIND_VALLEY;
      case 86: return PLATFORM_FEATURE_KIND_VILLAGE;
      case 2000: return PLATFORM_FEATURE_KIND_ANY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatureKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatureKind>() {
          public FeatureKind findValueByNumber(int number) {
            return FeatureKind.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(39);
  }

  private static final FeatureKind[] VALUES = values();

  public static FeatureKind valueOf(
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

  private FeatureKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FeatureKind)
}

