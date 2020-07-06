// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.NotificationCategory}
 */
public enum NotificationCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOTIFICATION_CATEGORY_unset__notification_category = 0;</code>
   */
  NOTIFICATION_CATEGORY_unset__notification_category(0),
  /**
   * <code>NOTIFICATION_CATEGORY_GYM_REMOVAL = 1;</code>
   */
  NOTIFICATION_CATEGORY_GYM_REMOVAL(1),
  /**
   * <code>NOTIFICATION_CATEGORY_POKEMON_HUNGRY = 2;</code>
   */
  NOTIFICATION_CATEGORY_POKEMON_HUNGRY(2),
  /**
   * <code>NOTIFICATION_CATEGORY_POKEMON_WON = 3;</code>
   */
  NOTIFICATION_CATEGORY_POKEMON_WON(3),
  /**
   * <code>NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_INVITE = 4;</code>
   */
  NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_INVITE(4),
  /**
   * <code>NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_CANCELLATION = 5;</code>
   */
  NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_CANCELLATION(5),
  /**
   * <code>NOTIFICATION_CATEGORY_GIFTBOX_INCOMING = 6;</code>
   */
  NOTIFICATION_CATEGORY_GIFTBOX_INCOMING(6),
  /**
   * <code>NOTIFICATION_CATEGORY_GIFTBOX_DELIVERED = 7;</code>
   */
  NOTIFICATION_CATEGORY_GIFTBOX_DELIVERED(7),
  /**
   * <code>NOTIFICATION_CATEGORY_FRIENDSHIP_MILESTONE_REWARD = 8;</code>
   */
  NOTIFICATION_CATEGORY_FRIENDSHIP_MILESTONE_REWARD(8),
  /**
   * <code>NOTIFICATION_CATEGORY_GYM_BATTLE_FRIENDSHIP_INCREMENT = 9;</code>
   */
  NOTIFICATION_CATEGORY_GYM_BATTLE_FRIENDSHIP_INCREMENT(9),
  /**
   * <code>NOTIFICATION_CATEGORY_SHARED_EXCLUSIVE_RAID_INVITE = 10;</code>
   */
  NOTIFICATION_CATEGORY_SHARED_EXCLUSIVE_RAID_INVITE(10),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_EGG_HATCH = 11;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_EGG_HATCH(11),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_CANDY = 12;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_BUDDY_CANDY(12),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_WEEKLY_FITNESS_REPORT = 13;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_WEEKLY_FITNESS_REPORT(13),
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_CHALLENGE_OPENED = 14;</code>
   */
  NOTIFICATION_CATEGORY_COMBAT_CHALLENGE_OPENED(14),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_OFF_SESSION_DISTANCE = 15;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_OFF_SESSION_DISTANCE(15),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_POI_PROXIMITY = 16;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_POI_PROXIMITY(16),
  /**
   * <code>NOTIFICATION_CATEGORY_LUCKY_FRIEND = 17;</code>
   */
  NOTIFICATION_CATEGORY_LUCKY_FRIEND(17),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_NAMED_BUDDY_CANDY = 18;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_NAMED_BUDDY_CANDY(18),
  /**
   * <code>NOTIFICATION_CATEGORY_APP_BADGE_ONLY = 19;</code>
   */
  NOTIFICATION_CATEGORY_APP_BADGE_ONLY(19),
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_VS_SEEKER_CHARGED = 20;</code>
   */
  NOTIFICATION_CATEGORY_COMBAT_VS_SEEKER_CHARGED(20),
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_COMPETITIVE_SEASON_END = 21;</code>
   */
  NOTIFICATION_CATEGORY_COMBAT_COMPETITIVE_SEASON_END(21),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_HUNGRY = 22;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_HUNGRY(22),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_FOUND_GIFT = 24;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_FOUND_GIFT(24),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_LEVEL_MILESTONE = 25;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_LEVEL_MILESTONE(25),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_WALKING = 26;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_WALKING(26),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_CARE = 27;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_CARE(27),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_BATTLE = 28;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_BATTLE(28),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_PHOTO = 29;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_PHOTO(29),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_POI = 30;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_POI(30),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_FOUND_GIFT = 31;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_BUDDY_FOUND_GIFT(31),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_ATTRACTIVE_POI = 32;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_ATTRACTIVE_POI(32),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_ATTRACTIVE_POI = 33;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_BUDDY_ATTRACTIVE_POI(33),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_ATTRACTIVE_POI = 36;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_AFFECTION_ATTRACTIVE_POI(36),
  /**
   * <code>NOTIFICATION_CATEGORY_POI_PASSCODE_REDEEMED = 37;</code>
   */
  NOTIFICATION_CATEGORY_POI_PASSCODE_REDEEMED(37),
  /**
   * <code>NOTIFICATION_CATEGORY_NO_EGGS_INCUBATING = 38;</code>
   */
  NOTIFICATION_CATEGORY_NO_EGGS_INCUBATING(38),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_UNOPENED_GIFTS = 39;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_UNOPENED_GIFTS(39),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_STARPIECE = 40;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_STARPIECE(40),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_INCENSE = 41;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_INCENSE(41),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_LUCKY_EGG = 42;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_LUCKY_EGG(42),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_ADVSYNC_REWARDS = 43;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_ADVSYNC_REWARDS(43),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_EGGS_NOT_INCUBATING = 44;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_EGGS_NOT_INCUBATING(44),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_POWER_WALK = 45;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_POWER_WALK(45),
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_FUN_WITH_FRIENDS = 46;</code>
   */
  NOTIFICATION_CATEGORY_RETENTION_FUN_WITH_FRIENDS(46),
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_REMOTE_GIFT = 47;</code>
   */
  NOTIFICATION_CATEGORY_BUDDY_REMOTE_GIFT(47),
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_REMOTE_GIFT = 48;</code>
   */
  NOTIFICATION_CATEGORY_BGMODE_BUDDY_REMOTE_GIFT(48),
  /**
   * <code>NOTIFICATION_CATEGORY_REMOTE_RAID_INVITATION = 49;</code>
   */
  NOTIFICATION_CATEGORY_REMOTE_RAID_INVITATION(49),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOTIFICATION_CATEGORY_unset__notification_category = 0;</code>
   */
  public static final int NOTIFICATION_CATEGORY_unset__notification_category_VALUE = 0;
  /**
   * <code>NOTIFICATION_CATEGORY_GYM_REMOVAL = 1;</code>
   */
  public static final int NOTIFICATION_CATEGORY_GYM_REMOVAL_VALUE = 1;
  /**
   * <code>NOTIFICATION_CATEGORY_POKEMON_HUNGRY = 2;</code>
   */
  public static final int NOTIFICATION_CATEGORY_POKEMON_HUNGRY_VALUE = 2;
  /**
   * <code>NOTIFICATION_CATEGORY_POKEMON_WON = 3;</code>
   */
  public static final int NOTIFICATION_CATEGORY_POKEMON_WON_VALUE = 3;
  /**
   * <code>NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_INVITE = 4;</code>
   */
  public static final int NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_INVITE_VALUE = 4;
  /**
   * <code>NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_CANCELLATION = 5;</code>
   */
  public static final int NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_CANCELLATION_VALUE = 5;
  /**
   * <code>NOTIFICATION_CATEGORY_GIFTBOX_INCOMING = 6;</code>
   */
  public static final int NOTIFICATION_CATEGORY_GIFTBOX_INCOMING_VALUE = 6;
  /**
   * <code>NOTIFICATION_CATEGORY_GIFTBOX_DELIVERED = 7;</code>
   */
  public static final int NOTIFICATION_CATEGORY_GIFTBOX_DELIVERED_VALUE = 7;
  /**
   * <code>NOTIFICATION_CATEGORY_FRIENDSHIP_MILESTONE_REWARD = 8;</code>
   */
  public static final int NOTIFICATION_CATEGORY_FRIENDSHIP_MILESTONE_REWARD_VALUE = 8;
  /**
   * <code>NOTIFICATION_CATEGORY_GYM_BATTLE_FRIENDSHIP_INCREMENT = 9;</code>
   */
  public static final int NOTIFICATION_CATEGORY_GYM_BATTLE_FRIENDSHIP_INCREMENT_VALUE = 9;
  /**
   * <code>NOTIFICATION_CATEGORY_SHARED_EXCLUSIVE_RAID_INVITE = 10;</code>
   */
  public static final int NOTIFICATION_CATEGORY_SHARED_EXCLUSIVE_RAID_INVITE_VALUE = 10;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_EGG_HATCH = 11;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_EGG_HATCH_VALUE = 11;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_CANDY = 12;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_BUDDY_CANDY_VALUE = 12;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_WEEKLY_FITNESS_REPORT = 13;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_WEEKLY_FITNESS_REPORT_VALUE = 13;
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_CHALLENGE_OPENED = 14;</code>
   */
  public static final int NOTIFICATION_CATEGORY_COMBAT_CHALLENGE_OPENED_VALUE = 14;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_OFF_SESSION_DISTANCE = 15;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_OFF_SESSION_DISTANCE_VALUE = 15;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_POI_PROXIMITY = 16;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_POI_PROXIMITY_VALUE = 16;
  /**
   * <code>NOTIFICATION_CATEGORY_LUCKY_FRIEND = 17;</code>
   */
  public static final int NOTIFICATION_CATEGORY_LUCKY_FRIEND_VALUE = 17;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_NAMED_BUDDY_CANDY = 18;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_NAMED_BUDDY_CANDY_VALUE = 18;
  /**
   * <code>NOTIFICATION_CATEGORY_APP_BADGE_ONLY = 19;</code>
   */
  public static final int NOTIFICATION_CATEGORY_APP_BADGE_ONLY_VALUE = 19;
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_VS_SEEKER_CHARGED = 20;</code>
   */
  public static final int NOTIFICATION_CATEGORY_COMBAT_VS_SEEKER_CHARGED_VALUE = 20;
  /**
   * <code>NOTIFICATION_CATEGORY_COMBAT_COMPETITIVE_SEASON_END = 21;</code>
   */
  public static final int NOTIFICATION_CATEGORY_COMBAT_COMPETITIVE_SEASON_END_VALUE = 21;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_HUNGRY = 22;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_HUNGRY_VALUE = 22;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_FOUND_GIFT = 24;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_FOUND_GIFT_VALUE = 24;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_LEVEL_MILESTONE = 25;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_LEVEL_MILESTONE_VALUE = 25;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_WALKING = 26;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_WALKING_VALUE = 26;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_CARE = 27;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_CARE_VALUE = 27;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_BATTLE = 28;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_BATTLE_VALUE = 28;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_PHOTO = 29;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_PHOTO_VALUE = 29;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_POI = 30;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_POI_VALUE = 30;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_FOUND_GIFT = 31;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_BUDDY_FOUND_GIFT_VALUE = 31;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_ATTRACTIVE_POI = 32;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_ATTRACTIVE_POI_VALUE = 32;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_ATTRACTIVE_POI = 33;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_BUDDY_ATTRACTIVE_POI_VALUE = 33;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_AFFECTION_ATTRACTIVE_POI = 36;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_AFFECTION_ATTRACTIVE_POI_VALUE = 36;
  /**
   * <code>NOTIFICATION_CATEGORY_POI_PASSCODE_REDEEMED = 37;</code>
   */
  public static final int NOTIFICATION_CATEGORY_POI_PASSCODE_REDEEMED_VALUE = 37;
  /**
   * <code>NOTIFICATION_CATEGORY_NO_EGGS_INCUBATING = 38;</code>
   */
  public static final int NOTIFICATION_CATEGORY_NO_EGGS_INCUBATING_VALUE = 38;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_UNOPENED_GIFTS = 39;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_UNOPENED_GIFTS_VALUE = 39;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_STARPIECE = 40;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_STARPIECE_VALUE = 40;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_INCENSE = 41;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_INCENSE_VALUE = 41;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_LUCKY_EGG = 42;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_LUCKY_EGG_VALUE = 42;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_ADVSYNC_REWARDS = 43;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_ADVSYNC_REWARDS_VALUE = 43;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_EGGS_NOT_INCUBATING = 44;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_EGGS_NOT_INCUBATING_VALUE = 44;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_POWER_WALK = 45;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_POWER_WALK_VALUE = 45;
  /**
   * <code>NOTIFICATION_CATEGORY_RETENTION_FUN_WITH_FRIENDS = 46;</code>
   */
  public static final int NOTIFICATION_CATEGORY_RETENTION_FUN_WITH_FRIENDS_VALUE = 46;
  /**
   * <code>NOTIFICATION_CATEGORY_BUDDY_REMOTE_GIFT = 47;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BUDDY_REMOTE_GIFT_VALUE = 47;
  /**
   * <code>NOTIFICATION_CATEGORY_BGMODE_BUDDY_REMOTE_GIFT = 48;</code>
   */
  public static final int NOTIFICATION_CATEGORY_BGMODE_BUDDY_REMOTE_GIFT_VALUE = 48;
  /**
   * <code>NOTIFICATION_CATEGORY_REMOTE_RAID_INVITATION = 49;</code>
   */
  public static final int NOTIFICATION_CATEGORY_REMOTE_RAID_INVITATION_VALUE = 49;


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
  public static NotificationCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotificationCategory forNumber(int value) {
    switch (value) {
      case 0: return NOTIFICATION_CATEGORY_unset__notification_category;
      case 1: return NOTIFICATION_CATEGORY_GYM_REMOVAL;
      case 2: return NOTIFICATION_CATEGORY_POKEMON_HUNGRY;
      case 3: return NOTIFICATION_CATEGORY_POKEMON_WON;
      case 4: return NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_INVITE;
      case 5: return NOTIFICATION_CATEGORY_EXCLUSIVE_RAID_CANCELLATION;
      case 6: return NOTIFICATION_CATEGORY_GIFTBOX_INCOMING;
      case 7: return NOTIFICATION_CATEGORY_GIFTBOX_DELIVERED;
      case 8: return NOTIFICATION_CATEGORY_FRIENDSHIP_MILESTONE_REWARD;
      case 9: return NOTIFICATION_CATEGORY_GYM_BATTLE_FRIENDSHIP_INCREMENT;
      case 10: return NOTIFICATION_CATEGORY_SHARED_EXCLUSIVE_RAID_INVITE;
      case 11: return NOTIFICATION_CATEGORY_BGMODE_EGG_HATCH;
      case 12: return NOTIFICATION_CATEGORY_BGMODE_BUDDY_CANDY;
      case 13: return NOTIFICATION_CATEGORY_BGMODE_WEEKLY_FITNESS_REPORT;
      case 14: return NOTIFICATION_CATEGORY_COMBAT_CHALLENGE_OPENED;
      case 15: return NOTIFICATION_CATEGORY_BGMODE_OFF_SESSION_DISTANCE;
      case 16: return NOTIFICATION_CATEGORY_BGMODE_POI_PROXIMITY;
      case 17: return NOTIFICATION_CATEGORY_LUCKY_FRIEND;
      case 18: return NOTIFICATION_CATEGORY_BGMODE_NAMED_BUDDY_CANDY;
      case 19: return NOTIFICATION_CATEGORY_APP_BADGE_ONLY;
      case 20: return NOTIFICATION_CATEGORY_COMBAT_VS_SEEKER_CHARGED;
      case 21: return NOTIFICATION_CATEGORY_COMBAT_COMPETITIVE_SEASON_END;
      case 22: return NOTIFICATION_CATEGORY_BUDDY_HUNGRY;
      case 24: return NOTIFICATION_CATEGORY_BUDDY_FOUND_GIFT;
      case 25: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_LEVEL_MILESTONE;
      case 26: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_WALKING;
      case 27: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_CARE;
      case 28: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_BATTLE;
      case 29: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_PHOTO;
      case 30: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_POI;
      case 31: return NOTIFICATION_CATEGORY_BGMODE_BUDDY_FOUND_GIFT;
      case 32: return NOTIFICATION_CATEGORY_BUDDY_ATTRACTIVE_POI;
      case 33: return NOTIFICATION_CATEGORY_BGMODE_BUDDY_ATTRACTIVE_POI;
      case 36: return NOTIFICATION_CATEGORY_BUDDY_AFFECTION_ATTRACTIVE_POI;
      case 37: return NOTIFICATION_CATEGORY_POI_PASSCODE_REDEEMED;
      case 38: return NOTIFICATION_CATEGORY_NO_EGGS_INCUBATING;
      case 39: return NOTIFICATION_CATEGORY_RETENTION_UNOPENED_GIFTS;
      case 40: return NOTIFICATION_CATEGORY_RETENTION_STARPIECE;
      case 41: return NOTIFICATION_CATEGORY_RETENTION_INCENSE;
      case 42: return NOTIFICATION_CATEGORY_RETENTION_LUCKY_EGG;
      case 43: return NOTIFICATION_CATEGORY_RETENTION_ADVSYNC_REWARDS;
      case 44: return NOTIFICATION_CATEGORY_RETENTION_EGGS_NOT_INCUBATING;
      case 45: return NOTIFICATION_CATEGORY_RETENTION_POWER_WALK;
      case 46: return NOTIFICATION_CATEGORY_RETENTION_FUN_WITH_FRIENDS;
      case 47: return NOTIFICATION_CATEGORY_BUDDY_REMOTE_GIFT;
      case 48: return NOTIFICATION_CATEGORY_BGMODE_BUDDY_REMOTE_GIFT;
      case 49: return NOTIFICATION_CATEGORY_REMOTE_RAID_INVITATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotificationCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NotificationCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NotificationCategory>() {
          public NotificationCategory findValueByNumber(int number) {
            return NotificationCategory.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(77);
  }

  private static final NotificationCategory[] VALUES = values();

  public static NotificationCategory valueOf(
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

  private NotificationCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NotificationCategory)
}
