// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PlayerSubmissionAction}
 */
public enum PlayerSubmissionAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLAYER_SUBMISSION_ACTION_UNKNOWN_GAME_POI_ACTION = 0;</code>
   */
  PLAYER_SUBMISSION_ACTION_UNKNOWN_GAME_POI_ACTION(0),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ADD_NEW_POI = 620000;</code>
   */
  PLAYER_SUBMISSION_ACTION_ADD_NEW_POI(620000),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_AVAILABLE_SUBMISSIONS = 620001;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_AVAILABLE_SUBMISSIONS(620001),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD = 620002;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD(620002),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_PLAYER_SUBMISSION_VALIDATION_SETTINGS = 620003;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_PLAYER_SUBMISSION_VALIDATION_SETTINGS(620003),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_IMAGE = 620100;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_POI_IMAGE(620100),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE = 620101;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE(620101),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_LOCATION_UPDATE = 620102;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_POI_LOCATION_UPDATE(620102),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST = 620103;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST(620103),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_REPORT = 620104;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_REPORT(620104),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_LOCATION_UPDATE = 620105;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_LOCATION_UPDATE(620105),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ADD_NEW_ROUTE = 620200;</code>
   */
  PLAYER_SUBMISSION_ACTION_ADD_NEW_ROUTE(620200),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GENERATE_GMAP_SIGNED_URL = 620300;</code>
   */
  PLAYER_SUBMISSION_ACTION_GENERATE_GMAP_SIGNED_URL(620300),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_GMAP_SETTINGS = 620301;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_GMAP_SETTINGS(620301),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_AR_VIDEO_METADATA = 620400;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_POI_AR_VIDEO_METADATA(620400),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_GRAPESHOT_FILE_UPLOAD_URL = 620401;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_GRAPESHOT_FILE_UPLOAD_URL(620401),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ASYNC_FILE_UPLOAD_COMPLETE = 620402;</code>
   */
  PLAYER_SUBMISSION_ACTION_ASYNC_FILE_UPLOAD_COMPLETE(620402),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_AR_MAPPING_SETTINGS = 620403;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_AR_MAPPING_SETTINGS(620403),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_IMAGES_FOR_POI = 620500;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_IMAGES_FOR_POI(620500),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_PLAYER_IMAGE_VOTE_FOR_POI = 620501;</code>
   */
  PLAYER_SUBMISSION_ACTION_SUBMIT_PLAYER_IMAGE_VOTE_FOR_POI(620501),
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_IMAGE_GALLERY_SETTINGS = 620502;</code>
   */
  PLAYER_SUBMISSION_ACTION_GET_IMAGE_GALLERY_SETTINGS(620502),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLAYER_SUBMISSION_ACTION_UNKNOWN_GAME_POI_ACTION = 0;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_UNKNOWN_GAME_POI_ACTION_VALUE = 0;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ADD_NEW_POI = 620000;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_ADD_NEW_POI_VALUE = 620000;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_AVAILABLE_SUBMISSIONS = 620001;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_AVAILABLE_SUBMISSIONS_VALUE = 620001;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD = 620002;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD_VALUE = 620002;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_PLAYER_SUBMISSION_VALIDATION_SETTINGS = 620003;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_PLAYER_SUBMISSION_VALIDATION_SETTINGS_VALUE = 620003;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_IMAGE = 620100;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_POI_IMAGE_VALUE = 620100;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE = 620101;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE_VALUE = 620101;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_LOCATION_UPDATE = 620102;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_POI_LOCATION_UPDATE_VALUE = 620102;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST = 620103;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST_VALUE = 620103;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_REPORT = 620104;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_REPORT_VALUE = 620104;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_LOCATION_UPDATE = 620105;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_LOCATION_UPDATE_VALUE = 620105;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ADD_NEW_ROUTE = 620200;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_ADD_NEW_ROUTE_VALUE = 620200;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GENERATE_GMAP_SIGNED_URL = 620300;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GENERATE_GMAP_SIGNED_URL_VALUE = 620300;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_GMAP_SETTINGS = 620301;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_GMAP_SETTINGS_VALUE = 620301;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_POI_AR_VIDEO_METADATA = 620400;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_POI_AR_VIDEO_METADATA_VALUE = 620400;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_GRAPESHOT_FILE_UPLOAD_URL = 620401;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_GRAPESHOT_FILE_UPLOAD_URL_VALUE = 620401;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_ASYNC_FILE_UPLOAD_COMPLETE = 620402;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_ASYNC_FILE_UPLOAD_COMPLETE_VALUE = 620402;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_AR_MAPPING_SETTINGS = 620403;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_AR_MAPPING_SETTINGS_VALUE = 620403;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_IMAGES_FOR_POI = 620500;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_IMAGES_FOR_POI_VALUE = 620500;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_SUBMIT_PLAYER_IMAGE_VOTE_FOR_POI = 620501;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_SUBMIT_PLAYER_IMAGE_VOTE_FOR_POI_VALUE = 620501;
  /**
   * <code>PLAYER_SUBMISSION_ACTION_GET_IMAGE_GALLERY_SETTINGS = 620502;</code>
   */
  public static final int PLAYER_SUBMISSION_ACTION_GET_IMAGE_GALLERY_SETTINGS_VALUE = 620502;


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
  public static PlayerSubmissionAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayerSubmissionAction forNumber(int value) {
    switch (value) {
      case 0: return PLAYER_SUBMISSION_ACTION_UNKNOWN_GAME_POI_ACTION;
      case 620000: return PLAYER_SUBMISSION_ACTION_ADD_NEW_POI;
      case 620001: return PLAYER_SUBMISSION_ACTION_GET_AVAILABLE_SUBMISSIONS;
      case 620002: return PLAYER_SUBMISSION_ACTION_GET_SIGNED_URL_FOR_PHOTO_UPLOAD;
      case 620003: return PLAYER_SUBMISSION_ACTION_GET_PLAYER_SUBMISSION_VALIDATION_SETTINGS;
      case 620100: return PLAYER_SUBMISSION_ACTION_SUBMIT_POI_IMAGE;
      case 620101: return PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TEXT_METADATA_UPDATE;
      case 620102: return PLAYER_SUBMISSION_ACTION_SUBMIT_POI_LOCATION_UPDATE;
      case 620103: return PLAYER_SUBMISSION_ACTION_SUBMIT_POI_TAKEDOWN_REQUEST;
      case 620104: return PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_REPORT;
      case 620105: return PLAYER_SUBMISSION_ACTION_SUBMIT_SPONSOR_POI_LOCATION_UPDATE;
      case 620200: return PLAYER_SUBMISSION_ACTION_ADD_NEW_ROUTE;
      case 620300: return PLAYER_SUBMISSION_ACTION_GENERATE_GMAP_SIGNED_URL;
      case 620301: return PLAYER_SUBMISSION_ACTION_GET_GMAP_SETTINGS;
      case 620400: return PLAYER_SUBMISSION_ACTION_SUBMIT_POI_AR_VIDEO_METADATA;
      case 620401: return PLAYER_SUBMISSION_ACTION_GET_GRAPESHOT_FILE_UPLOAD_URL;
      case 620402: return PLAYER_SUBMISSION_ACTION_ASYNC_FILE_UPLOAD_COMPLETE;
      case 620403: return PLAYER_SUBMISSION_ACTION_GET_AR_MAPPING_SETTINGS;
      case 620500: return PLAYER_SUBMISSION_ACTION_GET_IMAGES_FOR_POI;
      case 620501: return PLAYER_SUBMISSION_ACTION_SUBMIT_PLAYER_IMAGE_VOTE_FOR_POI;
      case 620502: return PLAYER_SUBMISSION_ACTION_GET_IMAGE_GALLERY_SETTINGS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayerSubmissionAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayerSubmissionAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayerSubmissionAction>() {
          public PlayerSubmissionAction findValueByNumber(int number) {
            return PlayerSubmissionAction.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(105);
  }

  private static final PlayerSubmissionAction[] VALUES = values();

  public static PlayerSubmissionAction valueOf(
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

  private PlayerSubmissionAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlayerSubmissionAction)
}

