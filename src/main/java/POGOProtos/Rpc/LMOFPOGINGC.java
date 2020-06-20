// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.LMOFPOGINGC}
 */
public enum LMOFPOGINGC
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LMOFPOGINGC_COLOR = 0;</code>
   */
  LMOFPOGINGC_COLOR(0),
  /**
   * <code>LMOFPOGINGC_POSITION = 1;</code>
   */
  LMOFPOGINGC_POSITION(1),
  /**
   * <code>LMOFPOGINGC_SIZE = 2;</code>
   */
  LMOFPOGINGC_SIZE(2),
  /**
   * <code>LMOFPOGINGC_TEXT = 3;</code>
   */
  LMOFPOGINGC_TEXT(3),
  /**
   * <code>LMOFPOGINGC_ACTIVE = 4;</code>
   */
  LMOFPOGINGC_ACTIVE(4),
  /**
   * <code>LMOFPOGINGC_ICON = 5;</code>
   */
  LMOFPOGINGC_ICON(5),
  /**
   * <code>LMOFPOGINGC_SET_RAID_DATA = 6;</code>
   */
  LMOFPOGINGC_SET_RAID_DATA(6),
  /**
   * <code>LMOFPOGINGC_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  LMOFPOGINGC_NEARBY_CARROT_VISIBLE(7),
  /**
   * <code>LMOFPOGINGC_SET_LOWEST_MOTIVATION = 8;</code>
   */
  LMOFPOGINGC_SET_LOWEST_MOTIVATION(8),
  /**
   * <code>LMOFPOGINGC_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  LMOFPOGINGC_SET_NPC_CLICKED_ACTION(9),
  /**
   * <code>LMOFPOGINGC_BEGIN_EXIT = 10;</code>
   */
  LMOFPOGINGC_BEGIN_EXIT(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LMOFPOGINGC_COLOR = 0;</code>
   */
  public static final int LMOFPOGINGC_COLOR_VALUE = 0;
  /**
   * <code>LMOFPOGINGC_POSITION = 1;</code>
   */
  public static final int LMOFPOGINGC_POSITION_VALUE = 1;
  /**
   * <code>LMOFPOGINGC_SIZE = 2;</code>
   */
  public static final int LMOFPOGINGC_SIZE_VALUE = 2;
  /**
   * <code>LMOFPOGINGC_TEXT = 3;</code>
   */
  public static final int LMOFPOGINGC_TEXT_VALUE = 3;
  /**
   * <code>LMOFPOGINGC_ACTIVE = 4;</code>
   */
  public static final int LMOFPOGINGC_ACTIVE_VALUE = 4;
  /**
   * <code>LMOFPOGINGC_ICON = 5;</code>
   */
  public static final int LMOFPOGINGC_ICON_VALUE = 5;
  /**
   * <code>LMOFPOGINGC_SET_RAID_DATA = 6;</code>
   */
  public static final int LMOFPOGINGC_SET_RAID_DATA_VALUE = 6;
  /**
   * <code>LMOFPOGINGC_NEARBY_CARROT_VISIBLE = 7;</code>
   */
  public static final int LMOFPOGINGC_NEARBY_CARROT_VISIBLE_VALUE = 7;
  /**
   * <code>LMOFPOGINGC_SET_LOWEST_MOTIVATION = 8;</code>
   */
  public static final int LMOFPOGINGC_SET_LOWEST_MOTIVATION_VALUE = 8;
  /**
   * <code>LMOFPOGINGC_SET_NPC_CLICKED_ACTION = 9;</code>
   */
  public static final int LMOFPOGINGC_SET_NPC_CLICKED_ACTION_VALUE = 9;
  /**
   * <code>LMOFPOGINGC_BEGIN_EXIT = 10;</code>
   */
  public static final int LMOFPOGINGC_BEGIN_EXIT_VALUE = 10;


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
  public static LMOFPOGINGC valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LMOFPOGINGC forNumber(int value) {
    switch (value) {
      case 0: return LMOFPOGINGC_COLOR;
      case 1: return LMOFPOGINGC_POSITION;
      case 2: return LMOFPOGINGC_SIZE;
      case 3: return LMOFPOGINGC_TEXT;
      case 4: return LMOFPOGINGC_ACTIVE;
      case 5: return LMOFPOGINGC_ICON;
      case 6: return LMOFPOGINGC_SET_RAID_DATA;
      case 7: return LMOFPOGINGC_NEARBY_CARROT_VISIBLE;
      case 8: return LMOFPOGINGC_SET_LOWEST_MOTIVATION;
      case 9: return LMOFPOGINGC_SET_NPC_CLICKED_ACTION;
      case 10: return LMOFPOGINGC_BEGIN_EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LMOFPOGINGC>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LMOFPOGINGC> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LMOFPOGINGC>() {
          public LMOFPOGINGC findValueByNumber(int number) {
            return LMOFPOGINGC.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(86);
  }

  private static final LMOFPOGINGC[] VALUES = values();

  public static LMOFPOGINGC valueOf(
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

  private LMOFPOGINGC(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.LMOFPOGINGC)
}

