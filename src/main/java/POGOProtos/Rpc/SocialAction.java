// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.SocialAction}
 */
public enum SocialAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SOCIAL_ACTION_UNKNOWN_SOCIAL_ACTION = 0;</code>
   */
  SOCIAL_ACTION_UNKNOWN_SOCIAL_ACTION(0),
  /**
   * <code>SOCIAL_ACTION_SEARCH_PLAYER = 10000;</code>
   */
  SOCIAL_ACTION_SEARCH_PLAYER(10000),
  /**
   * <code>SOCIAL_ACTION_SEND_FRIEND_INVITE = 10002;</code>
   */
  SOCIAL_ACTION_SEND_FRIEND_INVITE(10002),
  /**
   * <code>SOCIAL_ACTION_CANCEL_FRIEND_INVITE = 10003;</code>
   */
  SOCIAL_ACTION_CANCEL_FRIEND_INVITE(10003),
  /**
   * <code>SOCIAL_ACTION_ACCEPT_FRIEND_INVITE = 10004;</code>
   */
  SOCIAL_ACTION_ACCEPT_FRIEND_INVITE(10004),
  /**
   * <code>SOCIAL_ACTION_DECLINE_FRIEND_INVITE = 10005;</code>
   */
  SOCIAL_ACTION_DECLINE_FRIEND_INVITE(10005),
  /**
   * <code>SOCIAL_ACTION_LIST_FRIENDS = 10006;</code>
   */
  SOCIAL_ACTION_LIST_FRIENDS(10006),
  /**
   * <code>SOCIAL_ACTION_LIST_OUTGOING_FRIEND_INVITES = 10007;</code>
   */
  SOCIAL_ACTION_LIST_OUTGOING_FRIEND_INVITES(10007),
  /**
   * <code>SOCIAL_ACTION_LIST_INCOMING_FRIEND_INVITES = 10008;</code>
   */
  SOCIAL_ACTION_LIST_INCOMING_FRIEND_INVITES(10008),
  /**
   * <code>SOCIAL_ACTION_REMOVE_FRIEND = 10009;</code>
   */
  SOCIAL_ACTION_REMOVE_FRIEND(10009),
  /**
   * <code>SOCIAL_ACTION_LIST_FRIEND_STATUS = 10010;</code>
   */
  SOCIAL_ACTION_LIST_FRIEND_STATUS(10010),
  /**
   * <code>SOCIAL_ACTION_SEND_FACEBOOK_FRIEND_INVITE = 10011;</code>
   */
  SOCIAL_ACTION_SEND_FACEBOOK_FRIEND_INVITE(10011),
  /**
   * <code>SOCIAL_ACTION_IS_MY_FRIEND = 10012;</code>
   */
  SOCIAL_ACTION_IS_MY_FRIEND(10012),
  /**
   * <code>SOCIAL_ACTION_CREATE_INVITE_CODE = 10013;</code>
   */
  SOCIAL_ACTION_CREATE_INVITE_CODE(10013),
  /**
   * <code>SOCIAL_ACTION_GET_FACEBOOK_FRIEND_LIST = 10014;</code>
   */
  SOCIAL_ACTION_GET_FACEBOOK_FRIEND_LIST(10014),
  /**
   * <code>SOCIAL_ACTION_UPDATE_FACEBOOK_STATUS = 10015;</code>
   */
  SOCIAL_ACTION_UPDATE_FACEBOOK_STATUS(10015),
  /**
   * <code>SOCIAL_ACTION_SAVE_PLAYER_SETTINGS = 10016;</code>
   */
  SOCIAL_ACTION_SAVE_PLAYER_SETTINGS(10016),
  /**
   * <code>SOCIAL_ACTION_GET_PLAYER_SETTINGS = 10017;</code>
   */
  SOCIAL_ACTION_GET_PLAYER_SETTINGS(10017),
  /**
   * <code>SOCIAL_ACTION_GET_NIANTIC_FRIEND_LIST_DELETED = 10018;</code>
   */
  SOCIAL_ACTION_GET_NIANTIC_FRIEND_LIST_DELETED(10018),
  /**
   * <code>SOCIAL_ACTION_GET_NIANTIC_FRIEND_DETAILS_DELETED = 10019;</code>
   */
  SOCIAL_ACTION_GET_NIANTIC_FRIEND_DETAILS_DELETED(10019),
  /**
   * <code>SOCIAL_ACTION_SEND_NIANTIC_FRIEND_INVITE_DELETED = 10020;</code>
   */
  SOCIAL_ACTION_SEND_NIANTIC_FRIEND_INVITE_DELETED(10020),
  /**
   * <code>SOCIAL_ACTION_SET_ACCOUNT_SETTINGS = 10021;</code>
   */
  SOCIAL_ACTION_SET_ACCOUNT_SETTINGS(10021),
  /**
   * <code>SOCIAL_ACTION_GET_ACCOUNT_SETTINGS = 10022;</code>
   */
  SOCIAL_ACTION_GET_ACCOUNT_SETTINGS(10022),
  /**
   * <code>SOCIAL_ACTION_REGISTER_PUSH_NOTIFICATION = 10101;</code>
   */
  SOCIAL_ACTION_REGISTER_PUSH_NOTIFICATION(10101),
  /**
   * <code>SOCIAL_ACTION_UNREGISTER_PUSH_NOTIFICATION = 10102;</code>
   */
  SOCIAL_ACTION_UNREGISTER_PUSH_NOTIFICATION(10102),
  /**
   * <code>SOCIAL_ACTION_UPDATE_NOTIFICATION = 10103;</code>
   */
  SOCIAL_ACTION_UPDATE_NOTIFICATION(10103),
  /**
   * <code>SOCIAL_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 10104;</code>
   */
  SOCIAL_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY(10104),
  /**
   * <code>SOCIAL_ACTION_GET_INBOX = 10105;</code>
   */
  SOCIAL_ACTION_GET_INBOX(10105),
  /**
   * <code>SOCIAL_ACTION_GET_SIGNED_URL = 10201;</code>
   */
  SOCIAL_ACTION_GET_SIGNED_URL(10201),
  /**
   * <code>SOCIAL_ACTION_SUBMIT_IMAGE = 10202;</code>
   */
  SOCIAL_ACTION_SUBMIT_IMAGE(10202),
  /**
   * <code>SOCIAL_ACTION_GET_PHOTOS = 10203;</code>
   */
  SOCIAL_ACTION_GET_PHOTOS(10203),
  /**
   * <code>SOCIAL_ACTION_DELETE_PHOTO = 10204;</code>
   */
  SOCIAL_ACTION_DELETE_PHOTO(10204),
  /**
   * <code>SOCIAL_ACTION_UPDATE_PROFILE_V2 = 20001;</code>
   */
  SOCIAL_ACTION_UPDATE_PROFILE_V2(20001),
  /**
   * <code>SOCIAL_ACTION_UPDATE_FRIENDSHIP_V2 = 20002;</code>
   */
  SOCIAL_ACTION_UPDATE_FRIENDSHIP_V2(20002),
  /**
   * <code>SOCIAL_ACTION_GET_PROFILE_V2 = 20003;</code>
   */
  SOCIAL_ACTION_GET_PROFILE_V2(20003),
  /**
   * <code>SOCIAL_ACTION_INVITE_GAME_V2 = 20004;</code>
   */
  SOCIAL_ACTION_INVITE_GAME_V2(20004),
  /**
   * <code>SOCIAL_ACTION_SEND_FRIEND_INVITE_V2 = 20005;</code>
   */
  SOCIAL_ACTION_SEND_FRIEND_INVITE_V2(20005),
  /**
   * <code>SOCIAL_ACTION_LIST_FRIENDS_V2 = 20006;</code>
   */
  SOCIAL_ACTION_LIST_FRIENDS_V2(20006),
  /**
   * <code>SOCIAL_ACTION_GET_FRIEND_DETAILS_V2 = 20007;</code>
   */
  SOCIAL_ACTION_GET_FRIEND_DETAILS_V2(20007),
  /**
   * <code>SOCIAL_ACTION_GET_CLIENT_FEATURE_FLAGS_V2 = 20008;</code>
   */
  SOCIAL_ACTION_GET_CLIENT_FEATURE_FLAGS_V2(20008),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SOCIAL_ACTION_UNKNOWN_SOCIAL_ACTION = 0;</code>
   */
  public static final int SOCIAL_ACTION_UNKNOWN_SOCIAL_ACTION_VALUE = 0;
  /**
   * <code>SOCIAL_ACTION_SEARCH_PLAYER = 10000;</code>
   */
  public static final int SOCIAL_ACTION_SEARCH_PLAYER_VALUE = 10000;
  /**
   * <code>SOCIAL_ACTION_SEND_FRIEND_INVITE = 10002;</code>
   */
  public static final int SOCIAL_ACTION_SEND_FRIEND_INVITE_VALUE = 10002;
  /**
   * <code>SOCIAL_ACTION_CANCEL_FRIEND_INVITE = 10003;</code>
   */
  public static final int SOCIAL_ACTION_CANCEL_FRIEND_INVITE_VALUE = 10003;
  /**
   * <code>SOCIAL_ACTION_ACCEPT_FRIEND_INVITE = 10004;</code>
   */
  public static final int SOCIAL_ACTION_ACCEPT_FRIEND_INVITE_VALUE = 10004;
  /**
   * <code>SOCIAL_ACTION_DECLINE_FRIEND_INVITE = 10005;</code>
   */
  public static final int SOCIAL_ACTION_DECLINE_FRIEND_INVITE_VALUE = 10005;
  /**
   * <code>SOCIAL_ACTION_LIST_FRIENDS = 10006;</code>
   */
  public static final int SOCIAL_ACTION_LIST_FRIENDS_VALUE = 10006;
  /**
   * <code>SOCIAL_ACTION_LIST_OUTGOING_FRIEND_INVITES = 10007;</code>
   */
  public static final int SOCIAL_ACTION_LIST_OUTGOING_FRIEND_INVITES_VALUE = 10007;
  /**
   * <code>SOCIAL_ACTION_LIST_INCOMING_FRIEND_INVITES = 10008;</code>
   */
  public static final int SOCIAL_ACTION_LIST_INCOMING_FRIEND_INVITES_VALUE = 10008;
  /**
   * <code>SOCIAL_ACTION_REMOVE_FRIEND = 10009;</code>
   */
  public static final int SOCIAL_ACTION_REMOVE_FRIEND_VALUE = 10009;
  /**
   * <code>SOCIAL_ACTION_LIST_FRIEND_STATUS = 10010;</code>
   */
  public static final int SOCIAL_ACTION_LIST_FRIEND_STATUS_VALUE = 10010;
  /**
   * <code>SOCIAL_ACTION_SEND_FACEBOOK_FRIEND_INVITE = 10011;</code>
   */
  public static final int SOCIAL_ACTION_SEND_FACEBOOK_FRIEND_INVITE_VALUE = 10011;
  /**
   * <code>SOCIAL_ACTION_IS_MY_FRIEND = 10012;</code>
   */
  public static final int SOCIAL_ACTION_IS_MY_FRIEND_VALUE = 10012;
  /**
   * <code>SOCIAL_ACTION_CREATE_INVITE_CODE = 10013;</code>
   */
  public static final int SOCIAL_ACTION_CREATE_INVITE_CODE_VALUE = 10013;
  /**
   * <code>SOCIAL_ACTION_GET_FACEBOOK_FRIEND_LIST = 10014;</code>
   */
  public static final int SOCIAL_ACTION_GET_FACEBOOK_FRIEND_LIST_VALUE = 10014;
  /**
   * <code>SOCIAL_ACTION_UPDATE_FACEBOOK_STATUS = 10015;</code>
   */
  public static final int SOCIAL_ACTION_UPDATE_FACEBOOK_STATUS_VALUE = 10015;
  /**
   * <code>SOCIAL_ACTION_SAVE_PLAYER_SETTINGS = 10016;</code>
   */
  public static final int SOCIAL_ACTION_SAVE_PLAYER_SETTINGS_VALUE = 10016;
  /**
   * <code>SOCIAL_ACTION_GET_PLAYER_SETTINGS = 10017;</code>
   */
  public static final int SOCIAL_ACTION_GET_PLAYER_SETTINGS_VALUE = 10017;
  /**
   * <code>SOCIAL_ACTION_GET_NIANTIC_FRIEND_LIST_DELETED = 10018;</code>
   */
  public static final int SOCIAL_ACTION_GET_NIANTIC_FRIEND_LIST_DELETED_VALUE = 10018;
  /**
   * <code>SOCIAL_ACTION_GET_NIANTIC_FRIEND_DETAILS_DELETED = 10019;</code>
   */
  public static final int SOCIAL_ACTION_GET_NIANTIC_FRIEND_DETAILS_DELETED_VALUE = 10019;
  /**
   * <code>SOCIAL_ACTION_SEND_NIANTIC_FRIEND_INVITE_DELETED = 10020;</code>
   */
  public static final int SOCIAL_ACTION_SEND_NIANTIC_FRIEND_INVITE_DELETED_VALUE = 10020;
  /**
   * <code>SOCIAL_ACTION_SET_ACCOUNT_SETTINGS = 10021;</code>
   */
  public static final int SOCIAL_ACTION_SET_ACCOUNT_SETTINGS_VALUE = 10021;
  /**
   * <code>SOCIAL_ACTION_GET_ACCOUNT_SETTINGS = 10022;</code>
   */
  public static final int SOCIAL_ACTION_GET_ACCOUNT_SETTINGS_VALUE = 10022;
  /**
   * <code>SOCIAL_ACTION_REGISTER_PUSH_NOTIFICATION = 10101;</code>
   */
  public static final int SOCIAL_ACTION_REGISTER_PUSH_NOTIFICATION_VALUE = 10101;
  /**
   * <code>SOCIAL_ACTION_UNREGISTER_PUSH_NOTIFICATION = 10102;</code>
   */
  public static final int SOCIAL_ACTION_UNREGISTER_PUSH_NOTIFICATION_VALUE = 10102;
  /**
   * <code>SOCIAL_ACTION_UPDATE_NOTIFICATION = 10103;</code>
   */
  public static final int SOCIAL_ACTION_UPDATE_NOTIFICATION_VALUE = 10103;
  /**
   * <code>SOCIAL_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 10104;</code>
   */
  public static final int SOCIAL_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY_VALUE = 10104;
  /**
   * <code>SOCIAL_ACTION_GET_INBOX = 10105;</code>
   */
  public static final int SOCIAL_ACTION_GET_INBOX_VALUE = 10105;
  /**
   * <code>SOCIAL_ACTION_GET_SIGNED_URL = 10201;</code>
   */
  public static final int SOCIAL_ACTION_GET_SIGNED_URL_VALUE = 10201;
  /**
   * <code>SOCIAL_ACTION_SUBMIT_IMAGE = 10202;</code>
   */
  public static final int SOCIAL_ACTION_SUBMIT_IMAGE_VALUE = 10202;
  /**
   * <code>SOCIAL_ACTION_GET_PHOTOS = 10203;</code>
   */
  public static final int SOCIAL_ACTION_GET_PHOTOS_VALUE = 10203;
  /**
   * <code>SOCIAL_ACTION_DELETE_PHOTO = 10204;</code>
   */
  public static final int SOCIAL_ACTION_DELETE_PHOTO_VALUE = 10204;
  /**
   * <code>SOCIAL_ACTION_UPDATE_PROFILE_V2 = 20001;</code>
   */
  public static final int SOCIAL_ACTION_UPDATE_PROFILE_V2_VALUE = 20001;
  /**
   * <code>SOCIAL_ACTION_UPDATE_FRIENDSHIP_V2 = 20002;</code>
   */
  public static final int SOCIAL_ACTION_UPDATE_FRIENDSHIP_V2_VALUE = 20002;
  /**
   * <code>SOCIAL_ACTION_GET_PROFILE_V2 = 20003;</code>
   */
  public static final int SOCIAL_ACTION_GET_PROFILE_V2_VALUE = 20003;
  /**
   * <code>SOCIAL_ACTION_INVITE_GAME_V2 = 20004;</code>
   */
  public static final int SOCIAL_ACTION_INVITE_GAME_V2_VALUE = 20004;
  /**
   * <code>SOCIAL_ACTION_SEND_FRIEND_INVITE_V2 = 20005;</code>
   */
  public static final int SOCIAL_ACTION_SEND_FRIEND_INVITE_V2_VALUE = 20005;
  /**
   * <code>SOCIAL_ACTION_LIST_FRIENDS_V2 = 20006;</code>
   */
  public static final int SOCIAL_ACTION_LIST_FRIENDS_V2_VALUE = 20006;
  /**
   * <code>SOCIAL_ACTION_GET_FRIEND_DETAILS_V2 = 20007;</code>
   */
  public static final int SOCIAL_ACTION_GET_FRIEND_DETAILS_V2_VALUE = 20007;
  /**
   * <code>SOCIAL_ACTION_GET_CLIENT_FEATURE_FLAGS_V2 = 20008;</code>
   */
  public static final int SOCIAL_ACTION_GET_CLIENT_FEATURE_FLAGS_V2_VALUE = 20008;


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
  public static SocialAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SocialAction forNumber(int value) {
    switch (value) {
      case 0: return SOCIAL_ACTION_UNKNOWN_SOCIAL_ACTION;
      case 10000: return SOCIAL_ACTION_SEARCH_PLAYER;
      case 10002: return SOCIAL_ACTION_SEND_FRIEND_INVITE;
      case 10003: return SOCIAL_ACTION_CANCEL_FRIEND_INVITE;
      case 10004: return SOCIAL_ACTION_ACCEPT_FRIEND_INVITE;
      case 10005: return SOCIAL_ACTION_DECLINE_FRIEND_INVITE;
      case 10006: return SOCIAL_ACTION_LIST_FRIENDS;
      case 10007: return SOCIAL_ACTION_LIST_OUTGOING_FRIEND_INVITES;
      case 10008: return SOCIAL_ACTION_LIST_INCOMING_FRIEND_INVITES;
      case 10009: return SOCIAL_ACTION_REMOVE_FRIEND;
      case 10010: return SOCIAL_ACTION_LIST_FRIEND_STATUS;
      case 10011: return SOCIAL_ACTION_SEND_FACEBOOK_FRIEND_INVITE;
      case 10012: return SOCIAL_ACTION_IS_MY_FRIEND;
      case 10013: return SOCIAL_ACTION_CREATE_INVITE_CODE;
      case 10014: return SOCIAL_ACTION_GET_FACEBOOK_FRIEND_LIST;
      case 10015: return SOCIAL_ACTION_UPDATE_FACEBOOK_STATUS;
      case 10016: return SOCIAL_ACTION_SAVE_PLAYER_SETTINGS;
      case 10017: return SOCIAL_ACTION_GET_PLAYER_SETTINGS;
      case 10018: return SOCIAL_ACTION_GET_NIANTIC_FRIEND_LIST_DELETED;
      case 10019: return SOCIAL_ACTION_GET_NIANTIC_FRIEND_DETAILS_DELETED;
      case 10020: return SOCIAL_ACTION_SEND_NIANTIC_FRIEND_INVITE_DELETED;
      case 10021: return SOCIAL_ACTION_SET_ACCOUNT_SETTINGS;
      case 10022: return SOCIAL_ACTION_GET_ACCOUNT_SETTINGS;
      case 10101: return SOCIAL_ACTION_REGISTER_PUSH_NOTIFICATION;
      case 10102: return SOCIAL_ACTION_UNREGISTER_PUSH_NOTIFICATION;
      case 10103: return SOCIAL_ACTION_UPDATE_NOTIFICATION;
      case 10104: return SOCIAL_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY;
      case 10105: return SOCIAL_ACTION_GET_INBOX;
      case 10201: return SOCIAL_ACTION_GET_SIGNED_URL;
      case 10202: return SOCIAL_ACTION_SUBMIT_IMAGE;
      case 10203: return SOCIAL_ACTION_GET_PHOTOS;
      case 10204: return SOCIAL_ACTION_DELETE_PHOTO;
      case 20001: return SOCIAL_ACTION_UPDATE_PROFILE_V2;
      case 20002: return SOCIAL_ACTION_UPDATE_FRIENDSHIP_V2;
      case 20003: return SOCIAL_ACTION_GET_PROFILE_V2;
      case 20004: return SOCIAL_ACTION_INVITE_GAME_V2;
      case 20005: return SOCIAL_ACTION_SEND_FRIEND_INVITE_V2;
      case 20006: return SOCIAL_ACTION_LIST_FRIENDS_V2;
      case 20007: return SOCIAL_ACTION_GET_FRIEND_DETAILS_V2;
      case 20008: return SOCIAL_ACTION_GET_CLIENT_FEATURE_FLAGS_V2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SocialAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SocialAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SocialAction>() {
          public SocialAction findValueByNumber(int number) {
            return SocialAction.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(130);
  }

  private static final SocialAction[] VALUES = values();

  public static SocialAction valueOf(
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

  private SocialAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SocialAction)
}

