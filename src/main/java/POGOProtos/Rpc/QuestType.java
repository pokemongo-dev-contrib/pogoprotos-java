// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.QuestType}
 */
public enum QuestType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>QUEST_UNSET = 0;</code>
   */
  QUEST_UNSET(0),
  /**
   * <code>QUEST_FIRST_CATCH_OF_THE_DAY = 1;</code>
   */
  QUEST_FIRST_CATCH_OF_THE_DAY(1),
  /**
   * <code>QUEST_FIRST_POKESTOP_OF_THE_DAY = 2;</code>
   */
  QUEST_FIRST_POKESTOP_OF_THE_DAY(2),
  /**
   * <code>QUEST_MULTI_PART = 3;</code>
   */
  QUEST_MULTI_PART(3),
  /**
   * <code>QUEST_CATCH_POKEMON = 4;</code>
   */
  QUEST_CATCH_POKEMON(4),
  /**
   * <code>QUEST_SPIN_POKESTOP = 5;</code>
   */
  QUEST_SPIN_POKESTOP(5),
  /**
   * <code>QUEST_HATCH_EGG = 6;</code>
   */
  QUEST_HATCH_EGG(6),
  /**
   * <code>QUEST_COMPLETE_GYM_BATTLE = 7;</code>
   */
  QUEST_COMPLETE_GYM_BATTLE(7),
  /**
   * <code>QUEST_COMPLETE_RAID_BATTLE = 8;</code>
   */
  QUEST_COMPLETE_RAID_BATTLE(8),
  /**
   * <code>QUEST_COMPLETE_QUEST = 9;</code>
   */
  QUEST_COMPLETE_QUEST(9),
  /**
   * <code>QUEST_TRANSFER_POKEMON = 10;</code>
   */
  QUEST_TRANSFER_POKEMON(10),
  /**
   * <code>QUEST_FAVORITE_POKEMON = 11;</code>
   */
  QUEST_FAVORITE_POKEMON(11),
  /**
   * <code>QUEST_AUTOCOMPLETE = 12;</code>
   */
  QUEST_AUTOCOMPLETE(12),
  /**
   * <code>QUEST_USE_BERRY_IN_ENCOUNTER = 13;</code>
   */
  QUEST_USE_BERRY_IN_ENCOUNTER(13),
  /**
   * <code>QUEST_UPGRADE_POKEMON = 14;</code>
   */
  QUEST_UPGRADE_POKEMON(14),
  /**
   * <code>QUEST_EVOLVE_POKEMON = 15;</code>
   */
  QUEST_EVOLVE_POKEMON(15),
  /**
   * <code>QUEST_LAND_THROW = 16;</code>
   */
  QUEST_LAND_THROW(16),
  /**
   * <code>QUEST_GET_BUDDY_CANDY = 17;</code>
   */
  QUEST_GET_BUDDY_CANDY(17),
  /**
   * <code>QUEST_BADGE_RANK = 18;</code>
   */
  QUEST_BADGE_RANK(18),
  /**
   * <code>QUEST_PLAYER_LEVEL = 19;</code>
   */
  QUEST_PLAYER_LEVEL(19),
  /**
   * <code>QUEST_JOIN_RAID = 20;</code>
   */
  QUEST_JOIN_RAID(20),
  /**
   * <code>QUEST_COMPLETE_BATTLE = 21;</code>
   */
  QUEST_COMPLETE_BATTLE(21),
  /**
   * <code>QUEST_ADD_FRIEND = 22;</code>
   */
  QUEST_ADD_FRIEND(22),
  /**
   * <code>QUEST_TRADE_POKEMON = 23;</code>
   */
  QUEST_TRADE_POKEMON(23),
  /**
   * <code>QUEST_SEND_GIFT = 24;</code>
   */
  QUEST_SEND_GIFT(24),
  /**
   * <code>QUEST_EVOLVE_INTO_POKEMON = 25;</code>
   */
  QUEST_EVOLVE_INTO_POKEMON(25),
  /**
   * <code>QUEST_COMPLETE_COMBAT = 27;</code>
   */
  QUEST_COMPLETE_COMBAT(27),
  /**
   * <code>QUEST_TAKE_SNAPSHOT = 28;</code>
   */
  QUEST_TAKE_SNAPSHOT(28),
  /**
   * <code>QUEST_BATTLE_TEAM_ROCKET = 29;</code>
   */
  QUEST_BATTLE_TEAM_ROCKET(29),
  /**
   * <code>QUEST_PURIFY_POKEMON = 30;</code>
   */
  QUEST_PURIFY_POKEMON(30),
  /**
   * <code>QUEST_FIND_TEAM_ROCKET = 31;</code>
   */
  QUEST_FIND_TEAM_ROCKET(31),
  /**
   * <code>QUEST_FIRST_GRUNT_OF_THE_DAY = 32;</code>
   */
  QUEST_FIRST_GRUNT_OF_THE_DAY(32),
  /**
   * <code>QUEST_BUDDY_FEED = 33;</code>
   */
  QUEST_BUDDY_FEED(33),
  /**
   * <code>QUEST_BUDDY_EARN_AFFECTION_POINTS = 34;</code>
   */
  QUEST_BUDDY_EARN_AFFECTION_POINTS(34),
  /**
   * <code>QUEST_BUDDY_PET = 35;</code>
   */
  QUEST_BUDDY_PET(35),
  /**
   * <code>QUEST_BUDDY_LEVEL = 36;</code>
   */
  QUEST_BUDDY_LEVEL(36),
  /**
   * <code>QUEST_BUDDY_WALK = 37;</code>
   */
  QUEST_BUDDY_WALK(37),
  /**
   * <code>QUEST_BUDDY_YATTA = 38;</code>
   */
  QUEST_BUDDY_YATTA(38),
  /**
   * <code>QUEST_USE_INCENSE = 39;</code>
   */
  QUEST_USE_INCENSE(39),
  /**
   * <code>QUEST_BUDDY_FIND_SOUVENIR = 40;</code>
   */
  QUEST_BUDDY_FIND_SOUVENIR(40),
  /**
   * <code>QUEST_COLLECT_AS_REWARDS = 41;</code>
   */
  QUEST_COLLECT_AS_REWARDS(41),
  /**
   * <code>QUEST_WALK = 42;</code>
   */
  QUEST_WALK(42),
  /**
   * <code>QUEST_MEGA_EVOLVE_POKEMON = 43;</code>
   */
  QUEST_MEGA_EVOLVE_POKEMON(43),
  /**
   * <code>QUEST_GET_STARDUST = 44;</code>
   */
  QUEST_GET_STARDUST(44),
  /**
   * <code>QUEST_MINI_COLLECTION = 45;</code>
   */
  QUEST_MINI_COLLECTION(45),
  /**
   * <code>QUEST_GEOTARGETED_AR_SCAN = 46;</code>
   */
  QUEST_GEOTARGETED_AR_SCAN(46),
  /**
   * <code>QUEST_BUDDY_EVOLUTION_WALK = 50;</code>
   */
  QUEST_BUDDY_EVOLUTION_WALK(50),
  /**
   * <code>QUEST_GBL_RANK = 51;</code>
   */
  QUEST_GBL_RANK(51),
  /**
   * <code>QUEST_CHARGE_ATTACK = 53;</code>
   */
  QUEST_CHARGE_ATTACK(53),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>QUEST_UNSET = 0;</code>
   */
  public static final int QUEST_UNSET_VALUE = 0;
  /**
   * <code>QUEST_FIRST_CATCH_OF_THE_DAY = 1;</code>
   */
  public static final int QUEST_FIRST_CATCH_OF_THE_DAY_VALUE = 1;
  /**
   * <code>QUEST_FIRST_POKESTOP_OF_THE_DAY = 2;</code>
   */
  public static final int QUEST_FIRST_POKESTOP_OF_THE_DAY_VALUE = 2;
  /**
   * <code>QUEST_MULTI_PART = 3;</code>
   */
  public static final int QUEST_MULTI_PART_VALUE = 3;
  /**
   * <code>QUEST_CATCH_POKEMON = 4;</code>
   */
  public static final int QUEST_CATCH_POKEMON_VALUE = 4;
  /**
   * <code>QUEST_SPIN_POKESTOP = 5;</code>
   */
  public static final int QUEST_SPIN_POKESTOP_VALUE = 5;
  /**
   * <code>QUEST_HATCH_EGG = 6;</code>
   */
  public static final int QUEST_HATCH_EGG_VALUE = 6;
  /**
   * <code>QUEST_COMPLETE_GYM_BATTLE = 7;</code>
   */
  public static final int QUEST_COMPLETE_GYM_BATTLE_VALUE = 7;
  /**
   * <code>QUEST_COMPLETE_RAID_BATTLE = 8;</code>
   */
  public static final int QUEST_COMPLETE_RAID_BATTLE_VALUE = 8;
  /**
   * <code>QUEST_COMPLETE_QUEST = 9;</code>
   */
  public static final int QUEST_COMPLETE_QUEST_VALUE = 9;
  /**
   * <code>QUEST_TRANSFER_POKEMON = 10;</code>
   */
  public static final int QUEST_TRANSFER_POKEMON_VALUE = 10;
  /**
   * <code>QUEST_FAVORITE_POKEMON = 11;</code>
   */
  public static final int QUEST_FAVORITE_POKEMON_VALUE = 11;
  /**
   * <code>QUEST_AUTOCOMPLETE = 12;</code>
   */
  public static final int QUEST_AUTOCOMPLETE_VALUE = 12;
  /**
   * <code>QUEST_USE_BERRY_IN_ENCOUNTER = 13;</code>
   */
  public static final int QUEST_USE_BERRY_IN_ENCOUNTER_VALUE = 13;
  /**
   * <code>QUEST_UPGRADE_POKEMON = 14;</code>
   */
  public static final int QUEST_UPGRADE_POKEMON_VALUE = 14;
  /**
   * <code>QUEST_EVOLVE_POKEMON = 15;</code>
   */
  public static final int QUEST_EVOLVE_POKEMON_VALUE = 15;
  /**
   * <code>QUEST_LAND_THROW = 16;</code>
   */
  public static final int QUEST_LAND_THROW_VALUE = 16;
  /**
   * <code>QUEST_GET_BUDDY_CANDY = 17;</code>
   */
  public static final int QUEST_GET_BUDDY_CANDY_VALUE = 17;
  /**
   * <code>QUEST_BADGE_RANK = 18;</code>
   */
  public static final int QUEST_BADGE_RANK_VALUE = 18;
  /**
   * <code>QUEST_PLAYER_LEVEL = 19;</code>
   */
  public static final int QUEST_PLAYER_LEVEL_VALUE = 19;
  /**
   * <code>QUEST_JOIN_RAID = 20;</code>
   */
  public static final int QUEST_JOIN_RAID_VALUE = 20;
  /**
   * <code>QUEST_COMPLETE_BATTLE = 21;</code>
   */
  public static final int QUEST_COMPLETE_BATTLE_VALUE = 21;
  /**
   * <code>QUEST_ADD_FRIEND = 22;</code>
   */
  public static final int QUEST_ADD_FRIEND_VALUE = 22;
  /**
   * <code>QUEST_TRADE_POKEMON = 23;</code>
   */
  public static final int QUEST_TRADE_POKEMON_VALUE = 23;
  /**
   * <code>QUEST_SEND_GIFT = 24;</code>
   */
  public static final int QUEST_SEND_GIFT_VALUE = 24;
  /**
   * <code>QUEST_EVOLVE_INTO_POKEMON = 25;</code>
   */
  public static final int QUEST_EVOLVE_INTO_POKEMON_VALUE = 25;
  /**
   * <code>QUEST_COMPLETE_COMBAT = 27;</code>
   */
  public static final int QUEST_COMPLETE_COMBAT_VALUE = 27;
  /**
   * <code>QUEST_TAKE_SNAPSHOT = 28;</code>
   */
  public static final int QUEST_TAKE_SNAPSHOT_VALUE = 28;
  /**
   * <code>QUEST_BATTLE_TEAM_ROCKET = 29;</code>
   */
  public static final int QUEST_BATTLE_TEAM_ROCKET_VALUE = 29;
  /**
   * <code>QUEST_PURIFY_POKEMON = 30;</code>
   */
  public static final int QUEST_PURIFY_POKEMON_VALUE = 30;
  /**
   * <code>QUEST_FIND_TEAM_ROCKET = 31;</code>
   */
  public static final int QUEST_FIND_TEAM_ROCKET_VALUE = 31;
  /**
   * <code>QUEST_FIRST_GRUNT_OF_THE_DAY = 32;</code>
   */
  public static final int QUEST_FIRST_GRUNT_OF_THE_DAY_VALUE = 32;
  /**
   * <code>QUEST_BUDDY_FEED = 33;</code>
   */
  public static final int QUEST_BUDDY_FEED_VALUE = 33;
  /**
   * <code>QUEST_BUDDY_EARN_AFFECTION_POINTS = 34;</code>
   */
  public static final int QUEST_BUDDY_EARN_AFFECTION_POINTS_VALUE = 34;
  /**
   * <code>QUEST_BUDDY_PET = 35;</code>
   */
  public static final int QUEST_BUDDY_PET_VALUE = 35;
  /**
   * <code>QUEST_BUDDY_LEVEL = 36;</code>
   */
  public static final int QUEST_BUDDY_LEVEL_VALUE = 36;
  /**
   * <code>QUEST_BUDDY_WALK = 37;</code>
   */
  public static final int QUEST_BUDDY_WALK_VALUE = 37;
  /**
   * <code>QUEST_BUDDY_YATTA = 38;</code>
   */
  public static final int QUEST_BUDDY_YATTA_VALUE = 38;
  /**
   * <code>QUEST_USE_INCENSE = 39;</code>
   */
  public static final int QUEST_USE_INCENSE_VALUE = 39;
  /**
   * <code>QUEST_BUDDY_FIND_SOUVENIR = 40;</code>
   */
  public static final int QUEST_BUDDY_FIND_SOUVENIR_VALUE = 40;
  /**
   * <code>QUEST_COLLECT_AS_REWARDS = 41;</code>
   */
  public static final int QUEST_COLLECT_AS_REWARDS_VALUE = 41;
  /**
   * <code>QUEST_WALK = 42;</code>
   */
  public static final int QUEST_WALK_VALUE = 42;
  /**
   * <code>QUEST_MEGA_EVOLVE_POKEMON = 43;</code>
   */
  public static final int QUEST_MEGA_EVOLVE_POKEMON_VALUE = 43;
  /**
   * <code>QUEST_GET_STARDUST = 44;</code>
   */
  public static final int QUEST_GET_STARDUST_VALUE = 44;
  /**
   * <code>QUEST_MINI_COLLECTION = 45;</code>
   */
  public static final int QUEST_MINI_COLLECTION_VALUE = 45;
  /**
   * <code>QUEST_GEOTARGETED_AR_SCAN = 46;</code>
   */
  public static final int QUEST_GEOTARGETED_AR_SCAN_VALUE = 46;
  /**
   * <code>QUEST_BUDDY_EVOLUTION_WALK = 50;</code>
   */
  public static final int QUEST_BUDDY_EVOLUTION_WALK_VALUE = 50;
  /**
   * <code>QUEST_GBL_RANK = 51;</code>
   */
  public static final int QUEST_GBL_RANK_VALUE = 51;
  /**
   * <code>QUEST_CHARGE_ATTACK = 53;</code>
   */
  public static final int QUEST_CHARGE_ATTACK_VALUE = 53;


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
  public static QuestType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QuestType forNumber(int value) {
    switch (value) {
      case 0: return QUEST_UNSET;
      case 1: return QUEST_FIRST_CATCH_OF_THE_DAY;
      case 2: return QUEST_FIRST_POKESTOP_OF_THE_DAY;
      case 3: return QUEST_MULTI_PART;
      case 4: return QUEST_CATCH_POKEMON;
      case 5: return QUEST_SPIN_POKESTOP;
      case 6: return QUEST_HATCH_EGG;
      case 7: return QUEST_COMPLETE_GYM_BATTLE;
      case 8: return QUEST_COMPLETE_RAID_BATTLE;
      case 9: return QUEST_COMPLETE_QUEST;
      case 10: return QUEST_TRANSFER_POKEMON;
      case 11: return QUEST_FAVORITE_POKEMON;
      case 12: return QUEST_AUTOCOMPLETE;
      case 13: return QUEST_USE_BERRY_IN_ENCOUNTER;
      case 14: return QUEST_UPGRADE_POKEMON;
      case 15: return QUEST_EVOLVE_POKEMON;
      case 16: return QUEST_LAND_THROW;
      case 17: return QUEST_GET_BUDDY_CANDY;
      case 18: return QUEST_BADGE_RANK;
      case 19: return QUEST_PLAYER_LEVEL;
      case 20: return QUEST_JOIN_RAID;
      case 21: return QUEST_COMPLETE_BATTLE;
      case 22: return QUEST_ADD_FRIEND;
      case 23: return QUEST_TRADE_POKEMON;
      case 24: return QUEST_SEND_GIFT;
      case 25: return QUEST_EVOLVE_INTO_POKEMON;
      case 27: return QUEST_COMPLETE_COMBAT;
      case 28: return QUEST_TAKE_SNAPSHOT;
      case 29: return QUEST_BATTLE_TEAM_ROCKET;
      case 30: return QUEST_PURIFY_POKEMON;
      case 31: return QUEST_FIND_TEAM_ROCKET;
      case 32: return QUEST_FIRST_GRUNT_OF_THE_DAY;
      case 33: return QUEST_BUDDY_FEED;
      case 34: return QUEST_BUDDY_EARN_AFFECTION_POINTS;
      case 35: return QUEST_BUDDY_PET;
      case 36: return QUEST_BUDDY_LEVEL;
      case 37: return QUEST_BUDDY_WALK;
      case 38: return QUEST_BUDDY_YATTA;
      case 39: return QUEST_USE_INCENSE;
      case 40: return QUEST_BUDDY_FIND_SOUVENIR;
      case 41: return QUEST_COLLECT_AS_REWARDS;
      case 42: return QUEST_WALK;
      case 43: return QUEST_MEGA_EVOLVE_POKEMON;
      case 44: return QUEST_GET_STARDUST;
      case 45: return QUEST_MINI_COLLECTION;
      case 46: return QUEST_GEOTARGETED_AR_SCAN;
      case 50: return QUEST_BUDDY_EVOLUTION_WALK;
      case 51: return QUEST_GBL_RANK;
      case 53: return QUEST_CHARGE_ATTACK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QuestType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      QuestType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QuestType>() {
          public QuestType findValueByNumber(int number) {
            return QuestType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(122);
  }

  private static final QuestType[] VALUES = values();

  public static QuestType valueOf(
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

  private QuestType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.QuestType)
}

