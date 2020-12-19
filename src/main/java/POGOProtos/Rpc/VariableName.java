// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.VariableName}
 */
public enum VariableName
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VARIABLE_NAME_UNSET = 0;</code>
   */
  VARIABLE_NAME_UNSET(0),
  /**
   * <code>VARIABLE_NAME_CODE_NAME = 1;</code>
   */
  VARIABLE_NAME_CODE_NAME(1),
  /**
   * <code>VARIABLE_NAME_TEAM = 2;</code>
   */
  VARIABLE_NAME_TEAM(2),
  /**
   * <code>VARIABLE_NAME_LEVEL = 3;</code>
   */
  VARIABLE_NAME_LEVEL(3),
  /**
   * <code>VARIABLE_NAME_EXPERIENCE = 4;</code>
   */
  VARIABLE_NAME_EXPERIENCE(4),
  /**
   * <code>VARIABLE_NAME_POKECOIN_BALANCE = 5;</code>
   */
  VARIABLE_NAME_POKECOIN_BALANCE(5),
  /**
   * <code>VARIABLE_NAME_STARDUST_BALANCE = 6;</code>
   */
  VARIABLE_NAME_STARDUST_BALANCE(6),
  /**
   * <code>VARIABLE_NAME_EMAIL = 7;</code>
   */
  VARIABLE_NAME_EMAIL(7),
  /**
   * <code>VARIABLE_NAME_LOGIN_METHOD = 8;</code>
   */
  VARIABLE_NAME_LOGIN_METHOD(8),
  /**
   * <code>VARIABLE_NAME_GYM_ID = 1000;</code>
   */
  VARIABLE_NAME_GYM_ID(1000),
  /**
   * <code>VARIABLE_NAME_GYM_NAME = 1001;</code>
   */
  VARIABLE_NAME_GYM_NAME(1001),
  /**
   * <code>VARIABLE_NAME_POKEMON_DISPLAY = 1002;</code>
   */
  VARIABLE_NAME_POKEMON_DISPLAY(1002),
  /**
   * <code>VARIABLE_NAME_POKEDEX_ENTRY_NUMBER = 1003;</code>
   */
  VARIABLE_NAME_POKEDEX_ENTRY_NUMBER(1003),
  /**
   * <code>VARIABLE_NAME_POKEMON_ID = 1004;</code>
   */
  VARIABLE_NAME_POKEMON_ID(1004),
  /**
   * <code>VARIABLE_NAME_POKEMON_NICKNAME = 1005;</code>
   */
  VARIABLE_NAME_POKEMON_NICKNAME(1005),
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_EARNED_POINTS = 1006;</code>
   */
  VARIABLE_NAME_GYM_BADGE_EARNED_POINTS(1006),
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_PROGRESS = 1007;</code>
   */
  VARIABLE_NAME_GYM_BADGE_PROGRESS(1007),
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_RANK = 1008;</code>
   */
  VARIABLE_NAME_GYM_BADGE_RANK(1008),
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_IMAGE_URL = 1009;</code>
   */
  VARIABLE_NAME_GYM_BADGE_IMAGE_URL(1009),
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_LEVEL_UP = 1010;</code>
   */
  VARIABLE_NAME_GYM_BADGE_LEVEL_UP(1010),
  /**
   * <code>VARIABLE_NAME_POKECOIN_AWARDED = 1011;</code>
   */
  VARIABLE_NAME_POKECOIN_AWARDED(1011),
  /**
   * <code>VARIABLE_NAME_POKECOIN_AWARDED_TODAY = 1012;</code>
   */
  VARIABLE_NAME_POKECOIN_AWARDED_TODAY(1012),
  /**
   * <code>VARIABLE_NAME_MAX_DAILY_POKECOIN = 1013;</code>
   */
  VARIABLE_NAME_MAX_DAILY_POKECOIN(1013),
  /**
   * <code>VARIABLE_NAME_BATTLES_WON = 1014;</code>
   */
  VARIABLE_NAME_BATTLES_WON(1014),
  /**
   * <code>VARIABLE_NAME_BATTLES_LOST = 1015;</code>
   */
  VARIABLE_NAME_BATTLES_LOST(1015),
  /**
   * <code>VARIABLE_NAME_DEPLOYED_MILLIS = 1016;</code>
   */
  VARIABLE_NAME_DEPLOYED_MILLIS(1016),
  /**
   * <code>VARIABLE_NAME_RAID_SEED = 1017;</code>
   */
  VARIABLE_NAME_RAID_SEED(1017),
  /**
   * <code>VARIABLE_NAME_EXCLUSIVE_RAID_CANCELLATION_INFO = 1018;</code>
   */
  VARIABLE_NAME_EXCLUSIVE_RAID_CANCELLATION_INFO(1018),
  /**
   * <code>VARIABLE_NAME_GIFTBOX_DETAILS = 1019;</code>
   */
  VARIABLE_NAME_GIFTBOX_DETAILS(1019),
  /**
   * <code>VARIABLE_NAME_FRIEND_AVATAR = 1020;</code>
   */
  VARIABLE_NAME_FRIEND_AVATAR(1020),
  /**
   * <code>VARIABLE_NAME_FRIEND_TEAM = 1021;</code>
   */
  VARIABLE_NAME_FRIEND_TEAM(1021),
  /**
   * <code>VARIABLE_NAME_FRIEND_CODENAME = 1022;</code>
   */
  VARIABLE_NAME_FRIEND_CODENAME(1022),
  /**
   * <code>VARIABLE_NAME_GIFT_LOOT_ITEMS = 1023;</code>
   */
  VARIABLE_NAME_GIFT_LOOT_ITEMS(1023),
  /**
   * <code>VARIABLE_NAME_GIFT_EGG = 1024;</code>
   */
  VARIABLE_NAME_GIFT_EGG(1024),
  /**
   * <code>VARIABLE_NAME_FRIENDSHIP_MILESTONE_REWARD_DETAILS = 1025;</code>
   */
  VARIABLE_NAME_FRIENDSHIP_MILESTONE_REWARD_DETAILS(1025),
  /**
   * <code>VARIABLE_NAME_FRIENDSHIP_LEVEL_DISPLAY = 1026;</code>
   */
  VARIABLE_NAME_FRIENDSHIP_LEVEL_DISPLAY(1026),
  /**
   * <code>VARIABLE_NAME_BGMODE_BUDDY_POKEMON_NICKNAME = 1027;</code>
   */
  VARIABLE_NAME_BGMODE_BUDDY_POKEMON_NICKNAME(1027),
  /**
   * <code>VARIABLE_NAME_COMBAT_CHALLENGE = 1028;</code>
   */
  VARIABLE_NAME_COMBAT_CHALLENGE(1028),
  /**
   * <code>VARIABLE_NAME_COMBAT_CHALLENGER_CODENAME = 1029;</code>
   */
  VARIABLE_NAME_COMBAT_CHALLENGER_CODENAME(1029),
  /**
   * <code>VARIABLE_NAME_BGMODE_OFF_SESSION_DISTANCE_KM = 1030;</code>
   */
  VARIABLE_NAME_BGMODE_OFF_SESSION_DISTANCE_KM(1030),
  /**
   * <code>VARIABLE_NAME_POI_NAME = 1031;</code>
   */
  VARIABLE_NAME_POI_NAME(1031),
  /**
   * <code>VARIABLE_NAME_FRIEND_ID = 1032;</code>
   */
  VARIABLE_NAME_FRIEND_ID(1032),
  /**
   * <code>VARIABLE_NAME_BUDDY_SHOWN_HEART_TYPE = 1033;</code>
   */
  VARIABLE_NAME_BUDDY_SHOWN_HEART_TYPE(1033),
  /**
   * <code>VARIABLE_NAME_POI_ID = 1034;</code>
   */
  VARIABLE_NAME_POI_ID(1034),
  /**
   * <code>VARIABLE_NAME_POI_EXPIRATION = 1035;</code>
   */
  VARIABLE_NAME_POI_EXPIRATION(1035),
  /**
   * <code>VARIABLE_NAME_BUDDY_LEVEL = 1036;</code>
   */
  VARIABLE_NAME_BUDDY_LEVEL(1036),
  /**
   * <code>VARIABLE_NAME_NUM_VS_SEEKER_CHARGES = 1037;</code>
   */
  VARIABLE_NAME_NUM_VS_SEEKER_CHARGES(1037),
  /**
   * <code>VARIABLE_NAME_SEASON_NUMBER = 1038;</code>
   */
  VARIABLE_NAME_SEASON_NUMBER(1038),
  /**
   * <code>VARIABLE_NAME_POI_PASSCODE_REDEMPTION_RESPONSE = 1039;</code>
   */
  VARIABLE_NAME_POI_PASSCODE_REDEMPTION_RESPONSE(1039),
  /**
   * <code>VARIABLE_NAME_GIFTBOX_COUNT = 1040;</code>
   */
  VARIABLE_NAME_GIFTBOX_COUNT(1040),
  /**
   * <code>VARIABLE_NAME_RAID_INVITATION_DETAILS = 1041;</code>
   */
  VARIABLE_NAME_RAID_INVITATION_DETAILS(1041),
  /**
   * <code>VARIABLE_NAME_LOOT_ITEMS = 1042;</code>
   */
  VARIABLE_NAME_LOOT_ITEMS(1042),
  /**
   * <code>VARIABLE_NAME_EVENT_ICON_URL = 1043;</code>
   */
  VARIABLE_NAME_EVENT_ICON_URL(1043),
  /**
   * <code>VARIABLE_NAME_DL_ACTION = 1100;</code>
   */
  VARIABLE_NAME_DL_ACTION(1100),
  /**
   * <code>VARIABLE_NAME_DL_CATEGORY = 1101;</code>
   */
  VARIABLE_NAME_DL_CATEGORY(1101),
  /**
   * <code>VARIABLE_NAME_DL_TAB = 1102;</code>
   */
  VARIABLE_NAME_DL_TAB(1102),
  /**
   * <code>VARIABLE_NAME_DL_SKU = 1103;</code>
   */
  VARIABLE_NAME_DL_SKU(1103),
  /**
   * <code>VARIABLE_NAME_DL_ICON = 1104;</code>
   */
  VARIABLE_NAME_DL_ICON(1104),
  /**
   * <code>VARIABLE_NAME_DL_ID = 1105;</code>
   */
  VARIABLE_NAME_DL_ID(1105),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VARIABLE_NAME_UNSET = 0;</code>
   */
  public static final int VARIABLE_NAME_UNSET_VALUE = 0;
  /**
   * <code>VARIABLE_NAME_CODE_NAME = 1;</code>
   */
  public static final int VARIABLE_NAME_CODE_NAME_VALUE = 1;
  /**
   * <code>VARIABLE_NAME_TEAM = 2;</code>
   */
  public static final int VARIABLE_NAME_TEAM_VALUE = 2;
  /**
   * <code>VARIABLE_NAME_LEVEL = 3;</code>
   */
  public static final int VARIABLE_NAME_LEVEL_VALUE = 3;
  /**
   * <code>VARIABLE_NAME_EXPERIENCE = 4;</code>
   */
  public static final int VARIABLE_NAME_EXPERIENCE_VALUE = 4;
  /**
   * <code>VARIABLE_NAME_POKECOIN_BALANCE = 5;</code>
   */
  public static final int VARIABLE_NAME_POKECOIN_BALANCE_VALUE = 5;
  /**
   * <code>VARIABLE_NAME_STARDUST_BALANCE = 6;</code>
   */
  public static final int VARIABLE_NAME_STARDUST_BALANCE_VALUE = 6;
  /**
   * <code>VARIABLE_NAME_EMAIL = 7;</code>
   */
  public static final int VARIABLE_NAME_EMAIL_VALUE = 7;
  /**
   * <code>VARIABLE_NAME_LOGIN_METHOD = 8;</code>
   */
  public static final int VARIABLE_NAME_LOGIN_METHOD_VALUE = 8;
  /**
   * <code>VARIABLE_NAME_GYM_ID = 1000;</code>
   */
  public static final int VARIABLE_NAME_GYM_ID_VALUE = 1000;
  /**
   * <code>VARIABLE_NAME_GYM_NAME = 1001;</code>
   */
  public static final int VARIABLE_NAME_GYM_NAME_VALUE = 1001;
  /**
   * <code>VARIABLE_NAME_POKEMON_DISPLAY = 1002;</code>
   */
  public static final int VARIABLE_NAME_POKEMON_DISPLAY_VALUE = 1002;
  /**
   * <code>VARIABLE_NAME_POKEDEX_ENTRY_NUMBER = 1003;</code>
   */
  public static final int VARIABLE_NAME_POKEDEX_ENTRY_NUMBER_VALUE = 1003;
  /**
   * <code>VARIABLE_NAME_POKEMON_ID = 1004;</code>
   */
  public static final int VARIABLE_NAME_POKEMON_ID_VALUE = 1004;
  /**
   * <code>VARIABLE_NAME_POKEMON_NICKNAME = 1005;</code>
   */
  public static final int VARIABLE_NAME_POKEMON_NICKNAME_VALUE = 1005;
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_EARNED_POINTS = 1006;</code>
   */
  public static final int VARIABLE_NAME_GYM_BADGE_EARNED_POINTS_VALUE = 1006;
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_PROGRESS = 1007;</code>
   */
  public static final int VARIABLE_NAME_GYM_BADGE_PROGRESS_VALUE = 1007;
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_RANK = 1008;</code>
   */
  public static final int VARIABLE_NAME_GYM_BADGE_RANK_VALUE = 1008;
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_IMAGE_URL = 1009;</code>
   */
  public static final int VARIABLE_NAME_GYM_BADGE_IMAGE_URL_VALUE = 1009;
  /**
   * <code>VARIABLE_NAME_GYM_BADGE_LEVEL_UP = 1010;</code>
   */
  public static final int VARIABLE_NAME_GYM_BADGE_LEVEL_UP_VALUE = 1010;
  /**
   * <code>VARIABLE_NAME_POKECOIN_AWARDED = 1011;</code>
   */
  public static final int VARIABLE_NAME_POKECOIN_AWARDED_VALUE = 1011;
  /**
   * <code>VARIABLE_NAME_POKECOIN_AWARDED_TODAY = 1012;</code>
   */
  public static final int VARIABLE_NAME_POKECOIN_AWARDED_TODAY_VALUE = 1012;
  /**
   * <code>VARIABLE_NAME_MAX_DAILY_POKECOIN = 1013;</code>
   */
  public static final int VARIABLE_NAME_MAX_DAILY_POKECOIN_VALUE = 1013;
  /**
   * <code>VARIABLE_NAME_BATTLES_WON = 1014;</code>
   */
  public static final int VARIABLE_NAME_BATTLES_WON_VALUE = 1014;
  /**
   * <code>VARIABLE_NAME_BATTLES_LOST = 1015;</code>
   */
  public static final int VARIABLE_NAME_BATTLES_LOST_VALUE = 1015;
  /**
   * <code>VARIABLE_NAME_DEPLOYED_MILLIS = 1016;</code>
   */
  public static final int VARIABLE_NAME_DEPLOYED_MILLIS_VALUE = 1016;
  /**
   * <code>VARIABLE_NAME_RAID_SEED = 1017;</code>
   */
  public static final int VARIABLE_NAME_RAID_SEED_VALUE = 1017;
  /**
   * <code>VARIABLE_NAME_EXCLUSIVE_RAID_CANCELLATION_INFO = 1018;</code>
   */
  public static final int VARIABLE_NAME_EXCLUSIVE_RAID_CANCELLATION_INFO_VALUE = 1018;
  /**
   * <code>VARIABLE_NAME_GIFTBOX_DETAILS = 1019;</code>
   */
  public static final int VARIABLE_NAME_GIFTBOX_DETAILS_VALUE = 1019;
  /**
   * <code>VARIABLE_NAME_FRIEND_AVATAR = 1020;</code>
   */
  public static final int VARIABLE_NAME_FRIEND_AVATAR_VALUE = 1020;
  /**
   * <code>VARIABLE_NAME_FRIEND_TEAM = 1021;</code>
   */
  public static final int VARIABLE_NAME_FRIEND_TEAM_VALUE = 1021;
  /**
   * <code>VARIABLE_NAME_FRIEND_CODENAME = 1022;</code>
   */
  public static final int VARIABLE_NAME_FRIEND_CODENAME_VALUE = 1022;
  /**
   * <code>VARIABLE_NAME_GIFT_LOOT_ITEMS = 1023;</code>
   */
  public static final int VARIABLE_NAME_GIFT_LOOT_ITEMS_VALUE = 1023;
  /**
   * <code>VARIABLE_NAME_GIFT_EGG = 1024;</code>
   */
  public static final int VARIABLE_NAME_GIFT_EGG_VALUE = 1024;
  /**
   * <code>VARIABLE_NAME_FRIENDSHIP_MILESTONE_REWARD_DETAILS = 1025;</code>
   */
  public static final int VARIABLE_NAME_FRIENDSHIP_MILESTONE_REWARD_DETAILS_VALUE = 1025;
  /**
   * <code>VARIABLE_NAME_FRIENDSHIP_LEVEL_DISPLAY = 1026;</code>
   */
  public static final int VARIABLE_NAME_FRIENDSHIP_LEVEL_DISPLAY_VALUE = 1026;
  /**
   * <code>VARIABLE_NAME_BGMODE_BUDDY_POKEMON_NICKNAME = 1027;</code>
   */
  public static final int VARIABLE_NAME_BGMODE_BUDDY_POKEMON_NICKNAME_VALUE = 1027;
  /**
   * <code>VARIABLE_NAME_COMBAT_CHALLENGE = 1028;</code>
   */
  public static final int VARIABLE_NAME_COMBAT_CHALLENGE_VALUE = 1028;
  /**
   * <code>VARIABLE_NAME_COMBAT_CHALLENGER_CODENAME = 1029;</code>
   */
  public static final int VARIABLE_NAME_COMBAT_CHALLENGER_CODENAME_VALUE = 1029;
  /**
   * <code>VARIABLE_NAME_BGMODE_OFF_SESSION_DISTANCE_KM = 1030;</code>
   */
  public static final int VARIABLE_NAME_BGMODE_OFF_SESSION_DISTANCE_KM_VALUE = 1030;
  /**
   * <code>VARIABLE_NAME_POI_NAME = 1031;</code>
   */
  public static final int VARIABLE_NAME_POI_NAME_VALUE = 1031;
  /**
   * <code>VARIABLE_NAME_FRIEND_ID = 1032;</code>
   */
  public static final int VARIABLE_NAME_FRIEND_ID_VALUE = 1032;
  /**
   * <code>VARIABLE_NAME_BUDDY_SHOWN_HEART_TYPE = 1033;</code>
   */
  public static final int VARIABLE_NAME_BUDDY_SHOWN_HEART_TYPE_VALUE = 1033;
  /**
   * <code>VARIABLE_NAME_POI_ID = 1034;</code>
   */
  public static final int VARIABLE_NAME_POI_ID_VALUE = 1034;
  /**
   * <code>VARIABLE_NAME_POI_EXPIRATION = 1035;</code>
   */
  public static final int VARIABLE_NAME_POI_EXPIRATION_VALUE = 1035;
  /**
   * <code>VARIABLE_NAME_BUDDY_LEVEL = 1036;</code>
   */
  public static final int VARIABLE_NAME_BUDDY_LEVEL_VALUE = 1036;
  /**
   * <code>VARIABLE_NAME_NUM_VS_SEEKER_CHARGES = 1037;</code>
   */
  public static final int VARIABLE_NAME_NUM_VS_SEEKER_CHARGES_VALUE = 1037;
  /**
   * <code>VARIABLE_NAME_SEASON_NUMBER = 1038;</code>
   */
  public static final int VARIABLE_NAME_SEASON_NUMBER_VALUE = 1038;
  /**
   * <code>VARIABLE_NAME_POI_PASSCODE_REDEMPTION_RESPONSE = 1039;</code>
   */
  public static final int VARIABLE_NAME_POI_PASSCODE_REDEMPTION_RESPONSE_VALUE = 1039;
  /**
   * <code>VARIABLE_NAME_GIFTBOX_COUNT = 1040;</code>
   */
  public static final int VARIABLE_NAME_GIFTBOX_COUNT_VALUE = 1040;
  /**
   * <code>VARIABLE_NAME_RAID_INVITATION_DETAILS = 1041;</code>
   */
  public static final int VARIABLE_NAME_RAID_INVITATION_DETAILS_VALUE = 1041;
  /**
   * <code>VARIABLE_NAME_LOOT_ITEMS = 1042;</code>
   */
  public static final int VARIABLE_NAME_LOOT_ITEMS_VALUE = 1042;
  /**
   * <code>VARIABLE_NAME_EVENT_ICON_URL = 1043;</code>
   */
  public static final int VARIABLE_NAME_EVENT_ICON_URL_VALUE = 1043;
  /**
   * <code>VARIABLE_NAME_DL_ACTION = 1100;</code>
   */
  public static final int VARIABLE_NAME_DL_ACTION_VALUE = 1100;
  /**
   * <code>VARIABLE_NAME_DL_CATEGORY = 1101;</code>
   */
  public static final int VARIABLE_NAME_DL_CATEGORY_VALUE = 1101;
  /**
   * <code>VARIABLE_NAME_DL_TAB = 1102;</code>
   */
  public static final int VARIABLE_NAME_DL_TAB_VALUE = 1102;
  /**
   * <code>VARIABLE_NAME_DL_SKU = 1103;</code>
   */
  public static final int VARIABLE_NAME_DL_SKU_VALUE = 1103;
  /**
   * <code>VARIABLE_NAME_DL_ICON = 1104;</code>
   */
  public static final int VARIABLE_NAME_DL_ICON_VALUE = 1104;
  /**
   * <code>VARIABLE_NAME_DL_ID = 1105;</code>
   */
  public static final int VARIABLE_NAME_DL_ID_VALUE = 1105;


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
  public static VariableName valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariableName forNumber(int value) {
    switch (value) {
      case 0: return VARIABLE_NAME_UNSET;
      case 1: return VARIABLE_NAME_CODE_NAME;
      case 2: return VARIABLE_NAME_TEAM;
      case 3: return VARIABLE_NAME_LEVEL;
      case 4: return VARIABLE_NAME_EXPERIENCE;
      case 5: return VARIABLE_NAME_POKECOIN_BALANCE;
      case 6: return VARIABLE_NAME_STARDUST_BALANCE;
      case 7: return VARIABLE_NAME_EMAIL;
      case 8: return VARIABLE_NAME_LOGIN_METHOD;
      case 1000: return VARIABLE_NAME_GYM_ID;
      case 1001: return VARIABLE_NAME_GYM_NAME;
      case 1002: return VARIABLE_NAME_POKEMON_DISPLAY;
      case 1003: return VARIABLE_NAME_POKEDEX_ENTRY_NUMBER;
      case 1004: return VARIABLE_NAME_POKEMON_ID;
      case 1005: return VARIABLE_NAME_POKEMON_NICKNAME;
      case 1006: return VARIABLE_NAME_GYM_BADGE_EARNED_POINTS;
      case 1007: return VARIABLE_NAME_GYM_BADGE_PROGRESS;
      case 1008: return VARIABLE_NAME_GYM_BADGE_RANK;
      case 1009: return VARIABLE_NAME_GYM_BADGE_IMAGE_URL;
      case 1010: return VARIABLE_NAME_GYM_BADGE_LEVEL_UP;
      case 1011: return VARIABLE_NAME_POKECOIN_AWARDED;
      case 1012: return VARIABLE_NAME_POKECOIN_AWARDED_TODAY;
      case 1013: return VARIABLE_NAME_MAX_DAILY_POKECOIN;
      case 1014: return VARIABLE_NAME_BATTLES_WON;
      case 1015: return VARIABLE_NAME_BATTLES_LOST;
      case 1016: return VARIABLE_NAME_DEPLOYED_MILLIS;
      case 1017: return VARIABLE_NAME_RAID_SEED;
      case 1018: return VARIABLE_NAME_EXCLUSIVE_RAID_CANCELLATION_INFO;
      case 1019: return VARIABLE_NAME_GIFTBOX_DETAILS;
      case 1020: return VARIABLE_NAME_FRIEND_AVATAR;
      case 1021: return VARIABLE_NAME_FRIEND_TEAM;
      case 1022: return VARIABLE_NAME_FRIEND_CODENAME;
      case 1023: return VARIABLE_NAME_GIFT_LOOT_ITEMS;
      case 1024: return VARIABLE_NAME_GIFT_EGG;
      case 1025: return VARIABLE_NAME_FRIENDSHIP_MILESTONE_REWARD_DETAILS;
      case 1026: return VARIABLE_NAME_FRIENDSHIP_LEVEL_DISPLAY;
      case 1027: return VARIABLE_NAME_BGMODE_BUDDY_POKEMON_NICKNAME;
      case 1028: return VARIABLE_NAME_COMBAT_CHALLENGE;
      case 1029: return VARIABLE_NAME_COMBAT_CHALLENGER_CODENAME;
      case 1030: return VARIABLE_NAME_BGMODE_OFF_SESSION_DISTANCE_KM;
      case 1031: return VARIABLE_NAME_POI_NAME;
      case 1032: return VARIABLE_NAME_FRIEND_ID;
      case 1033: return VARIABLE_NAME_BUDDY_SHOWN_HEART_TYPE;
      case 1034: return VARIABLE_NAME_POI_ID;
      case 1035: return VARIABLE_NAME_POI_EXPIRATION;
      case 1036: return VARIABLE_NAME_BUDDY_LEVEL;
      case 1037: return VARIABLE_NAME_NUM_VS_SEEKER_CHARGES;
      case 1038: return VARIABLE_NAME_SEASON_NUMBER;
      case 1039: return VARIABLE_NAME_POI_PASSCODE_REDEMPTION_RESPONSE;
      case 1040: return VARIABLE_NAME_GIFTBOX_COUNT;
      case 1041: return VARIABLE_NAME_RAID_INVITATION_DETAILS;
      case 1042: return VARIABLE_NAME_LOOT_ITEMS;
      case 1043: return VARIABLE_NAME_EVENT_ICON_URL;
      case 1100: return VARIABLE_NAME_DL_ACTION;
      case 1101: return VARIABLE_NAME_DL_CATEGORY;
      case 1102: return VARIABLE_NAME_DL_TAB;
      case 1103: return VARIABLE_NAME_DL_SKU;
      case 1104: return VARIABLE_NAME_DL_ICON;
      case 1105: return VARIABLE_NAME_DL_ID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariableName>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariableName> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariableName>() {
          public VariableName findValueByNumber(int number) {
            return VariableName.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(144);
  }

  private static final VariableName[] VALUES = values();

  public static VariableName valueOf(
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

  private VariableName(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.VariableName)
}

