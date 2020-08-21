// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BODDJHLLGNC
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.BODDJHLLGNC}
 */
public enum BODDJHLLGNC
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BODDJHLLGNC_UNDEFINED_RAID_EVENT = 0;</code>
   */
  BODDJHLLGNC_UNDEFINED_RAID_EVENT(0),
  /**
   * <code>BODDJHLLGNC_APPROACH_ENTER = 1;</code>
   */
  BODDJHLLGNC_APPROACH_ENTER(1),
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_SPINNER = 2;</code>
   */
  BODDJHLLGNC_APPROACH_CLICK_SPINNER(2),
  /**
   * <code>BODDJHLLGNC_APPROACH_JOIN = 3;</code>
   */
  BODDJHLLGNC_APPROACH_JOIN(3),
  /**
   * <code>BODDJHLLGNC_APPROACH_TICKET_CONFIRMATION = 4;</code>
   */
  BODDJHLLGNC_APPROACH_TICKET_CONFIRMATION(4),
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_TUTORIAL = 5;</code>
   */
  BODDJHLLGNC_APPROACH_CLICK_TUTORIAL(5),
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_SHOP = 6;</code>
   */
  BODDJHLLGNC_APPROACH_CLICK_SHOP(6),
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_INSPECT = 7;</code>
   */
  BODDJHLLGNC_APPROACH_CLICK_INSPECT(7),
  /**
   * <code>BODDJHLLGNC_LOBBY_ENTER = 8;</code>
   */
  BODDJHLLGNC_LOBBY_ENTER(8),
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_INVENTORY = 9;</code>
   */
  BODDJHLLGNC_LOBBY_CLICK_INVENTORY(9),
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_EXIT = 10;</code>
   */
  BODDJHLLGNC_LOBBY_CLICK_EXIT(10),
  /**
   * <code>BODDJHLLGNC_LOBBY_TAP_AVATAR = 11;</code>
   */
  BODDJHLLGNC_LOBBY_TAP_AVATAR(11),
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_REJOIN_BATTLE = 12;</code>
   */
  BODDJHLLGNC_LOBBY_CLICK_REJOIN_BATTLE(12),
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_LOBBY_PUBLIC = 13;</code>
   */
  BODDJHLLGNC_LOBBY_CLICK_LOBBY_PUBLIC(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BODDJHLLGNC_UNDEFINED_RAID_EVENT = 0;</code>
   */
  public static final int BODDJHLLGNC_UNDEFINED_RAID_EVENT_VALUE = 0;
  /**
   * <code>BODDJHLLGNC_APPROACH_ENTER = 1;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_ENTER_VALUE = 1;
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_SPINNER = 2;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_CLICK_SPINNER_VALUE = 2;
  /**
   * <code>BODDJHLLGNC_APPROACH_JOIN = 3;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_JOIN_VALUE = 3;
  /**
   * <code>BODDJHLLGNC_APPROACH_TICKET_CONFIRMATION = 4;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_TICKET_CONFIRMATION_VALUE = 4;
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_TUTORIAL = 5;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_CLICK_TUTORIAL_VALUE = 5;
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_SHOP = 6;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_CLICK_SHOP_VALUE = 6;
  /**
   * <code>BODDJHLLGNC_APPROACH_CLICK_INSPECT = 7;</code>
   */
  public static final int BODDJHLLGNC_APPROACH_CLICK_INSPECT_VALUE = 7;
  /**
   * <code>BODDJHLLGNC_LOBBY_ENTER = 8;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_ENTER_VALUE = 8;
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_INVENTORY = 9;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_CLICK_INVENTORY_VALUE = 9;
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_EXIT = 10;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_CLICK_EXIT_VALUE = 10;
  /**
   * <code>BODDJHLLGNC_LOBBY_TAP_AVATAR = 11;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_TAP_AVATAR_VALUE = 11;
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_REJOIN_BATTLE = 12;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_CLICK_REJOIN_BATTLE_VALUE = 12;
  /**
   * <code>BODDJHLLGNC_LOBBY_CLICK_LOBBY_PUBLIC = 13;</code>
   */
  public static final int BODDJHLLGNC_LOBBY_CLICK_LOBBY_PUBLIC_VALUE = 13;


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
  public static BODDJHLLGNC valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BODDJHLLGNC forNumber(int value) {
    switch (value) {
      case 0: return BODDJHLLGNC_UNDEFINED_RAID_EVENT;
      case 1: return BODDJHLLGNC_APPROACH_ENTER;
      case 2: return BODDJHLLGNC_APPROACH_CLICK_SPINNER;
      case 3: return BODDJHLLGNC_APPROACH_JOIN;
      case 4: return BODDJHLLGNC_APPROACH_TICKET_CONFIRMATION;
      case 5: return BODDJHLLGNC_APPROACH_CLICK_TUTORIAL;
      case 6: return BODDJHLLGNC_APPROACH_CLICK_SHOP;
      case 7: return BODDJHLLGNC_APPROACH_CLICK_INSPECT;
      case 8: return BODDJHLLGNC_LOBBY_ENTER;
      case 9: return BODDJHLLGNC_LOBBY_CLICK_INVENTORY;
      case 10: return BODDJHLLGNC_LOBBY_CLICK_EXIT;
      case 11: return BODDJHLLGNC_LOBBY_TAP_AVATAR;
      case 12: return BODDJHLLGNC_LOBBY_CLICK_REJOIN_BATTLE;
      case 13: return BODDJHLLGNC_LOBBY_CLICK_LOBBY_PUBLIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BODDJHLLGNC>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BODDJHLLGNC> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BODDJHLLGNC>() {
          public BODDJHLLGNC findValueByNumber(int number) {
            return BODDJHLLGNC.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(37);
  }

  private static final BODDJHLLGNC[] VALUES = values();

  public static BODDJHLLGNC valueOf(
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

  private BODDJHLLGNC(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BODDJHLLGNC)
}

