// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OCNAOOKOBIF
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.OCNAOOKOBIF}
 */
public enum OCNAOOKOBIF
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OCNAOOKOBIF_COLOR = 0;</code>
   */
  OCNAOOKOBIF_COLOR(0),
  /**
   * <code>OCNAOOKOBIF_POSITION = 1;</code>
   */
  OCNAOOKOBIF_POSITION(1),
  /**
   * <code>OCNAOOKOBIF_SIZE = 2;</code>
   */
  OCNAOOKOBIF_SIZE(2),
  /**
   * <code>OCNAOOKOBIF_TEXT = 3;</code>
   */
  OCNAOOKOBIF_TEXT(3),
  /**
   * <code>OCNAOOKOBIF_ACTIVE = 4;</code>
   */
  OCNAOOKOBIF_ACTIVE(4),
  /**
   * <code>OCNAOOKOBIF_ICON = 5;</code>
   */
  OCNAOOKOBIF_ICON(5),
  /**
   * <code>OCNAOOKOBIF_SET_RAID_DATA = 6;</code>
   */
  OCNAOOKOBIF_SET_RAID_DATA(6),
  /**
   * <code>OCNAOOKOBIF_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  OCNAOOKOBIF_NEARBY_CARROT_VISIBLE(7),
  /**
   * <code>OCNAOOKOBIF_SET_LOWEST_MOTIVATION = 8;</code>
   */
  OCNAOOKOBIF_SET_LOWEST_MOTIVATION(8),
  /**
   * <code>OCNAOOKOBIF_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  OCNAOOKOBIF_SET_NPC_CLICKED_ACTION(9),
  /**
   * <code>OCNAOOKOBIF_BEGIN_EXIT = 10;</code>
   */
  OCNAOOKOBIF_BEGIN_EXIT(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OCNAOOKOBIF_COLOR = 0;</code>
   */
  public static final int OCNAOOKOBIF_COLOR_VALUE = 0;
  /**
   * <code>OCNAOOKOBIF_POSITION = 1;</code>
   */
  public static final int OCNAOOKOBIF_POSITION_VALUE = 1;
  /**
   * <code>OCNAOOKOBIF_SIZE = 2;</code>
   */
  public static final int OCNAOOKOBIF_SIZE_VALUE = 2;
  /**
   * <code>OCNAOOKOBIF_TEXT = 3;</code>
   */
  public static final int OCNAOOKOBIF_TEXT_VALUE = 3;
  /**
   * <code>OCNAOOKOBIF_ACTIVE = 4;</code>
   */
  public static final int OCNAOOKOBIF_ACTIVE_VALUE = 4;
  /**
   * <code>OCNAOOKOBIF_ICON = 5;</code>
   */
  public static final int OCNAOOKOBIF_ICON_VALUE = 5;
  /**
   * <code>OCNAOOKOBIF_SET_RAID_DATA = 6;</code>
   */
  public static final int OCNAOOKOBIF_SET_RAID_DATA_VALUE = 6;
  /**
   * <code>OCNAOOKOBIF_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  public static final int OCNAOOKOBIF_NEARBY_CARROT_VISIBLE_VALUE = 7;
  /**
   * <code>OCNAOOKOBIF_SET_LOWEST_MOTIVATION = 8;</code>
   */
  public static final int OCNAOOKOBIF_SET_LOWEST_MOTIVATION_VALUE = 8;
  /**
   * <code>OCNAOOKOBIF_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  public static final int OCNAOOKOBIF_SET_NPC_CLICKED_ACTION_VALUE = 9;
  /**
   * <code>OCNAOOKOBIF_BEGIN_EXIT = 10;</code>
   */
  public static final int OCNAOOKOBIF_BEGIN_EXIT_VALUE = 10;


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
  public static OCNAOOKOBIF valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OCNAOOKOBIF forNumber(int value) {
    switch (value) {
      case 0: return OCNAOOKOBIF_COLOR;
      case 1: return OCNAOOKOBIF_POSITION;
      case 2: return OCNAOOKOBIF_SIZE;
      case 3: return OCNAOOKOBIF_TEXT;
      case 4: return OCNAOOKOBIF_ACTIVE;
      case 5: return OCNAOOKOBIF_ICON;
      case 6: return OCNAOOKOBIF_SET_RAID_DATA;
      case 7: return OCNAOOKOBIF_NEARBY_CARROT_VISIBLE;
      case 8: return OCNAOOKOBIF_SET_LOWEST_MOTIVATION;
      case 9: return OCNAOOKOBIF_SET_NPC_CLICKED_ACTION;
      case 10: return OCNAOOKOBIF_BEGIN_EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OCNAOOKOBIF>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OCNAOOKOBIF> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OCNAOOKOBIF>() {
          public OCNAOOKOBIF findValueByNumber(int number) {
            return OCNAOOKOBIF.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(119);
  }

  private static final OCNAOOKOBIF[] VALUES = values();

  public static OCNAOOKOBIF valueOf(
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

  private OCNAOOKOBIF(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OCNAOOKOBIF)
}

