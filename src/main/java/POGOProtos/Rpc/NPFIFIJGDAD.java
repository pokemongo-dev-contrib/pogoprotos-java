// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NPFIFIJGDAD
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.NPFIFIJGDAD}
 */
public enum NPFIFIJGDAD
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_NONE = 0;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_NONE(0),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_BUNDLE = 1;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_BUNDLE(1),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_ITEMS = 2;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_ITEMS(2),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_UPGRADES = 3;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_UPGRADES(3),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_POKECOINS = 4;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_POKECOINS(4),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_AVATAR = 5;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_AVATAR(5),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_AVATAR_STORE_LINK = 6;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_AVATAR_STORE_LINK(6),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_TEAM_CHANGE = 7;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_TEAM_CHANGE(7),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_GLOBAL_EVENT_TICKET = 10;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_GLOBAL_EVENT_TICKET(10),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_VS_SEEKER = 11;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_VS_SEEKER(11),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_STICKER = 12;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_STICKER(12),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_FREE = 13;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_FREE(13),
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_SUBSCRIPTION = 14;</code>
   */
  NPFIFIJGDAD_IAP_CATEGORY_SUBSCRIPTION(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_NONE = 0;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_NONE_VALUE = 0;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_BUNDLE = 1;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_BUNDLE_VALUE = 1;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_ITEMS = 2;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_ITEMS_VALUE = 2;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_UPGRADES = 3;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_UPGRADES_VALUE = 3;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_POKECOINS = 4;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_POKECOINS_VALUE = 4;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_AVATAR = 5;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_AVATAR_VALUE = 5;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_AVATAR_STORE_LINK = 6;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_AVATAR_STORE_LINK_VALUE = 6;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_TEAM_CHANGE = 7;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_TEAM_CHANGE_VALUE = 7;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_GLOBAL_EVENT_TICKET = 10;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_GLOBAL_EVENT_TICKET_VALUE = 10;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_VS_SEEKER = 11;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_VS_SEEKER_VALUE = 11;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_STICKER = 12;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_STICKER_VALUE = 12;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_FREE = 13;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_FREE_VALUE = 13;
  /**
   * <code>NPFIFIJGDAD_IAP_CATEGORY_SUBSCRIPTION = 14;</code>
   */
  public static final int NPFIFIJGDAD_IAP_CATEGORY_SUBSCRIPTION_VALUE = 14;


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
  public static NPFIFIJGDAD valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NPFIFIJGDAD forNumber(int value) {
    switch (value) {
      case 0: return NPFIFIJGDAD_IAP_CATEGORY_NONE;
      case 1: return NPFIFIJGDAD_IAP_CATEGORY_BUNDLE;
      case 2: return NPFIFIJGDAD_IAP_CATEGORY_ITEMS;
      case 3: return NPFIFIJGDAD_IAP_CATEGORY_UPGRADES;
      case 4: return NPFIFIJGDAD_IAP_CATEGORY_POKECOINS;
      case 5: return NPFIFIJGDAD_IAP_CATEGORY_AVATAR;
      case 6: return NPFIFIJGDAD_IAP_CATEGORY_AVATAR_STORE_LINK;
      case 7: return NPFIFIJGDAD_IAP_CATEGORY_TEAM_CHANGE;
      case 10: return NPFIFIJGDAD_IAP_CATEGORY_GLOBAL_EVENT_TICKET;
      case 11: return NPFIFIJGDAD_IAP_CATEGORY_VS_SEEKER;
      case 12: return NPFIFIJGDAD_IAP_CATEGORY_STICKER;
      case 13: return NPFIFIJGDAD_IAP_CATEGORY_FREE;
      case 14: return NPFIFIJGDAD_IAP_CATEGORY_SUBSCRIPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NPFIFIJGDAD>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NPFIFIJGDAD> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NPFIFIJGDAD>() {
          public NPFIFIJGDAD findValueByNumber(int number) {
            return NPFIFIJGDAD.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(123);
  }

  private static final NPFIFIJGDAD[] VALUES = values();

  public static NPFIFIJGDAD valueOf(
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

  private NPFIFIJGDAD(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NPFIFIJGDAD)
}

