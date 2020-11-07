// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PlatformClientAction}
 */
public enum PlatformClientAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UNKNOWN_PLATFORM_CLIENT_ACTION = 0;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UNKNOWN_PLATFORM_CLIENT_ACTION(0),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_PUSH_NOTIFICATION = 5000;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_PUSH_NOTIFICATION(5000),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UNREGISTER_PUSH_NOTIFICATION = 5001;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UNREGISTER_PUSH_NOTIFICATION(5001),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_NOTIFICATION_STATUS = 5002;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_NOTIFICATION_STATUS(5002),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 5003;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY(5003),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_DOWNLOAD_GAME_MASTER_TEMPLATES = 5004;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_DOWNLOAD_GAME_MASTER_TEMPLATES(5004),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_INVENTORY = 5005;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_INVENTORY(5005),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_PASSCODE = 5006;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_PASSCODE(5006),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING = 5007;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PING(5007),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_LOGIN_ACTION = 5008;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_ADD_LOGIN_ACTION(5008),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REMOVE_LOGIN_ACTION = 5009;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REMOVE_LOGIN_ACTION(5009),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_LIST_LOGIN_ACTION = 5010;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_LIST_LOGIN_ACTION(5010),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_POI = 5011;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_POI(5011),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_ACTION = 5012;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_ACTION(5012),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_DEPRECATED_CLIENT_TELEMETRY = 5013;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_DEPRECATED_CLIENT_TELEMETRY(5013),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SUBMISSIONS = 5014;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SUBMISSIONS(5014),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD = 5015;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD(5015),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REPLACE_LOGIN_ACTION = 5016;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REPLACE_LOGIN_ACTION(5016),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_SIDE_CHANNEL_ACTION = 5017;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_SIDE_CHANNEL_ACTION(5017),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_COLLECT_CLIENT_TELEMETRY = 5018;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_COLLECT_CLIENT_TELEMETRY(5018),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PURCHASE_SKU = 5019;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PURCHASE_SKU(5019),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SKUS_AND_BALANCES = 5020;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SKUS_AND_BALANCES(5020),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_GOOGLE_RECEIPT = 5021;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_GOOGLE_RECEIPT(5021),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_APPLE_RECEIPT = 5022;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_APPLE_RECEIPT(5022),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_DESKTOP_RECEIPT = 5023;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_DESKTOP_RECEIPT(5023),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_FITNESS_METRICS = 5024;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_FITNESS_METRICS(5024),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_FITNESS_REPORT = 5025;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_FITNESS_REPORT(5025),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_TELEMETRY_SETTINGS = 5026;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_TELEMETRY_SETTINGS(5026),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING_ASYNC = 5027;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PING_ASYNC(5027),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_BACKGROUND_SERVICE = 5028;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_BACKGROUND_SERVICE(5028),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_BGMODE_SETTINGS = 5029;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_BGMODE_SETTINGS(5029),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING_DOWNSTREAM = 5030;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_PING_DOWNSTREAM(5030),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SET_IN_GAME_CURRENCY_EXCHANGE_RATE = 5032;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_SET_IN_GAME_CURRENCY_EXCHANGE_RATE(5032),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REQUEST_GEOFENCE_UPDATES = 5033;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REQUEST_GEOFENCE_UPDATES(5033),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_PLAYER_LOCATION = 5034;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_PLAYER_LOCATION(5034),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GENERATE_GMAP_SIGNED_URL = 5035;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GENERATE_GMAP_SIGNED_URL(5035),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_GMAP_SETTINGS = 5036;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_GMAP_SETTINGS(5036),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_SAMSUNG_RECEIPT = 5037;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_SAMSUNG_RECEIPT(5037),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_ROUTE = 5038;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_ROUTE(5038),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_OUTSTANDING_WARNINGS = 5039;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_OUTSTANDING_WARNINGS(5039),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ACKNOWLEDGE_WARNINGS = 5040;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_ACKNOWLEDGE_WARNINGS(5040),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_IMAGE = 5041;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_IMAGE(5041),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE = 5042;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE(5042),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_LOCATION_UPDATE = 5043;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_LOCATION_UPDATE(5043),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST = 5044;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST(5044),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_WEB_TOKEN_ACTION = 5045;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_WEB_TOKEN_ACTION(5045),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_ADVENTURE_SYNC_SETTINGS = 5046;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_GET_ADVENTURE_SYNC_SETTINGS(5046),
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_ADVENTURE_SYNC_SETTINGS = 5047;</code>
   */
  PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_ADVENTURE_SYNC_SETTINGS(5047),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UNKNOWN_PLATFORM_CLIENT_ACTION = 0;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UNKNOWN_PLATFORM_CLIENT_ACTION_VALUE = 0;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_PUSH_NOTIFICATION = 5000;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_PUSH_NOTIFICATION_VALUE = 5000;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UNREGISTER_PUSH_NOTIFICATION = 5001;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UNREGISTER_PUSH_NOTIFICATION_VALUE = 5001;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_NOTIFICATION_STATUS = 5002;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_NOTIFICATION_STATUS_VALUE = 5002;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 5003;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY_VALUE = 5003;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_DOWNLOAD_GAME_MASTER_TEMPLATES = 5004;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_DOWNLOAD_GAME_MASTER_TEMPLATES_VALUE = 5004;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_INVENTORY = 5005;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_INVENTORY_VALUE = 5005;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_PASSCODE = 5006;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_PASSCODE_VALUE = 5006;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING = 5007;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PING_VALUE = 5007;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_LOGIN_ACTION = 5008;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_ADD_LOGIN_ACTION_VALUE = 5008;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REMOVE_LOGIN_ACTION = 5009;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REMOVE_LOGIN_ACTION_VALUE = 5009;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_LIST_LOGIN_ACTION = 5010;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_LIST_LOGIN_ACTION_VALUE = 5010;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_POI = 5011;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_POI_VALUE = 5011;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_ACTION = 5012;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_ACTION_VALUE = 5012;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_DEPRECATED_CLIENT_TELEMETRY = 5013;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_DEPRECATED_CLIENT_TELEMETRY_VALUE = 5013;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SUBMISSIONS = 5014;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SUBMISSIONS_VALUE = 5014;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD = 5015;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD_VALUE = 5015;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REPLACE_LOGIN_ACTION = 5016;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REPLACE_LOGIN_ACTION_VALUE = 5016;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_SIDE_CHANNEL_ACTION = 5017;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_SIDE_CHANNEL_ACTION_VALUE = 5017;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_COLLECT_CLIENT_TELEMETRY = 5018;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_COLLECT_CLIENT_TELEMETRY_VALUE = 5018;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PURCHASE_SKU = 5019;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PURCHASE_SKU_VALUE = 5019;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SKUS_AND_BALANCES = 5020;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SKUS_AND_BALANCES_VALUE = 5020;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_GOOGLE_RECEIPT = 5021;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_GOOGLE_RECEIPT_VALUE = 5021;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_APPLE_RECEIPT = 5022;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_APPLE_RECEIPT_VALUE = 5022;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_DESKTOP_RECEIPT = 5023;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_DESKTOP_RECEIPT_VALUE = 5023;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_FITNESS_METRICS = 5024;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_FITNESS_METRICS_VALUE = 5024;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_FITNESS_REPORT = 5025;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_FITNESS_REPORT_VALUE = 5025;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_TELEMETRY_SETTINGS = 5026;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_TELEMETRY_SETTINGS_VALUE = 5026;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING_ASYNC = 5027;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PING_ASYNC_VALUE = 5027;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_BACKGROUND_SERVICE = 5028;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_BACKGROUND_SERVICE_VALUE = 5028;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_BGMODE_SETTINGS = 5029;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_BGMODE_SETTINGS_VALUE = 5029;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_PING_DOWNSTREAM = 5030;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_PING_DOWNSTREAM_VALUE = 5030;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SET_IN_GAME_CURRENCY_EXCHANGE_RATE = 5032;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_SET_IN_GAME_CURRENCY_EXCHANGE_RATE_VALUE = 5032;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REQUEST_GEOFENCE_UPDATES = 5033;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REQUEST_GEOFENCE_UPDATES_VALUE = 5033;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_PLAYER_LOCATION = 5034;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_PLAYER_LOCATION_VALUE = 5034;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GENERATE_GMAP_SIGNED_URL = 5035;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GENERATE_GMAP_SIGNED_URL_VALUE = 5035;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_GMAP_SETTINGS = 5036;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_GMAP_SETTINGS_VALUE = 5036;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_SAMSUNG_RECEIPT = 5037;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_SAMSUNG_RECEIPT_VALUE = 5037;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_ROUTE = 5038;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_ROUTE_VALUE = 5038;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_OUTSTANDING_WARNINGS = 5039;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_OUTSTANDING_WARNINGS_VALUE = 5039;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_ACKNOWLEDGE_WARNINGS = 5040;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_ACKNOWLEDGE_WARNINGS_VALUE = 5040;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_IMAGE = 5041;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_IMAGE_VALUE = 5041;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE = 5042;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE_VALUE = 5042;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_LOCATION_UPDATE = 5043;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_LOCATION_UPDATE_VALUE = 5043;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST = 5044;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST_VALUE = 5044;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_WEB_TOKEN_ACTION = 5045;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_WEB_TOKEN_ACTION_VALUE = 5045;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_GET_ADVENTURE_SYNC_SETTINGS = 5046;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_GET_ADVENTURE_SYNC_SETTINGS_VALUE = 5046;
  /**
   * <code>PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_ADVENTURE_SYNC_SETTINGS = 5047;</code>
   */
  public static final int PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_ADVENTURE_SYNC_SETTINGS_VALUE = 5047;


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
  public static PlatformClientAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlatformClientAction forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_PLATFORM_CLIENT_ACTION_UNKNOWN_PLATFORM_CLIENT_ACTION;
      case 5000: return PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_PUSH_NOTIFICATION;
      case 5001: return PLATFORM_PLATFORM_CLIENT_ACTION_UNREGISTER_PUSH_NOTIFICATION;
      case 5002: return PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_NOTIFICATION_STATUS;
      case 5003: return PLATFORM_PLATFORM_CLIENT_ACTION_OPT_OUT_PUSH_NOTIFICATION_CATEGORY;
      case 5004: return PLATFORM_PLATFORM_CLIENT_ACTION_DOWNLOAD_GAME_MASTER_TEMPLATES;
      case 5005: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_INVENTORY;
      case 5006: return PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_PASSCODE;
      case 5007: return PLATFORM_PLATFORM_CLIENT_ACTION_PING;
      case 5008: return PLATFORM_PLATFORM_CLIENT_ACTION_ADD_LOGIN_ACTION;
      case 5009: return PLATFORM_PLATFORM_CLIENT_ACTION_REMOVE_LOGIN_ACTION;
      case 5010: return PLATFORM_PLATFORM_CLIENT_ACTION_LIST_LOGIN_ACTION;
      case 5011: return PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_POI;
      case 5012: return PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_ACTION;
      case 5013: return PLATFORM_PLATFORM_CLIENT_ACTION_DEPRECATED_CLIENT_TELEMETRY;
      case 5014: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SUBMISSIONS;
      case 5015: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD;
      case 5016: return PLATFORM_PLATFORM_CLIENT_ACTION_REPLACE_LOGIN_ACTION;
      case 5017: return PLATFORM_PLATFORM_CLIENT_ACTION_PROXY_SOCIAL_SIDE_CHANNEL_ACTION;
      case 5018: return PLATFORM_PLATFORM_CLIENT_ACTION_COLLECT_CLIENT_TELEMETRY;
      case 5019: return PLATFORM_PLATFORM_CLIENT_ACTION_PURCHASE_SKU;
      case 5020: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_AVAILABLE_SKUS_AND_BALANCES;
      case 5021: return PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_GOOGLE_RECEIPT;
      case 5022: return PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_APPLE_RECEIPT;
      case 5023: return PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_DESKTOP_RECEIPT;
      case 5024: return PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_FITNESS_METRICS;
      case 5025: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_FITNESS_REPORT;
      case 5026: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_TELEMETRY_SETTINGS;
      case 5027: return PLATFORM_PLATFORM_CLIENT_ACTION_PING_ASYNC;
      case 5028: return PLATFORM_PLATFORM_CLIENT_ACTION_REGISTER_BACKGROUND_SERVICE;
      case 5029: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_CLIENT_BGMODE_SETTINGS;
      case 5030: return PLATFORM_PLATFORM_CLIENT_ACTION_PING_DOWNSTREAM;
      case 5032: return PLATFORM_PLATFORM_CLIENT_ACTION_SET_IN_GAME_CURRENCY_EXCHANGE_RATE;
      case 5033: return PLATFORM_PLATFORM_CLIENT_ACTION_REQUEST_GEOFENCE_UPDATES;
      case 5034: return PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_PLAYER_LOCATION;
      case 5035: return PLATFORM_PLATFORM_CLIENT_ACTION_GENERATE_GMAP_SIGNED_URL;
      case 5036: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_GMAP_SETTINGS;
      case 5037: return PLATFORM_PLATFORM_CLIENT_ACTION_REDEEM_SAMSUNG_RECEIPT;
      case 5038: return PLATFORM_PLATFORM_CLIENT_ACTION_ADD_NEW_ROUTE;
      case 5039: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_OUTSTANDING_WARNINGS;
      case 5040: return PLATFORM_PLATFORM_CLIENT_ACTION_ACKNOWLEDGE_WARNINGS;
      case 5041: return PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_IMAGE;
      case 5042: return PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE;
      case 5043: return PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_LOCATION_UPDATE;
      case 5044: return PLATFORM_PLATFORM_CLIENT_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST;
      case 5045: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_WEB_TOKEN_ACTION;
      case 5046: return PLATFORM_PLATFORM_CLIENT_ACTION_GET_ADVENTURE_SYNC_SETTINGS;
      case 5047: return PLATFORM_PLATFORM_CLIENT_ACTION_UPDATE_ADVENTURE_SYNC_SETTINGS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlatformClientAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlatformClientAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlatformClientAction>() {
          public PlatformClientAction findValueByNumber(int number) {
            return PlatformClientAction.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(97);
  }

  private static final PlatformClientAction[] VALUES = values();

  public static PlatformClientAction valueOf(
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

  private PlatformClientAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformClientAction)
}

