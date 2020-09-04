// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PKBKGFCCECL
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.PKBKGFCCECL}
 */
public enum PKBKGFCCECL
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION = 0;</code>
   */
  PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION(0),
  /**
   * <code>PKBKGFCCECL_EQUIP_ITEM = 1;</code>
   */
  PKBKGFCCECL_EQUIP_ITEM(1),
  /**
   * <code>PKBKGFCCECL_OPEN_FEATURES = 2;</code>
   */
  PKBKGFCCECL_OPEN_FEATURES(2),
  /**
   * <code>PKBKGFCCECL_OPEN_STORE = 3;</code>
   */
  PKBKGFCCECL_OPEN_STORE(3),
  /**
   * <code>PKBKGFCCECL_PURCHASE_ITEM = 4;</code>
   */
  PKBKGFCCECL_PURCHASE_ITEM(4),
  /**
   * <code>PKBKGFCCECL_PURCHASE_ERROR = 5;</code>
   */
  PKBKGFCCECL_PURCHASE_ERROR(5),
  /**
   * <code>PKBKGFCCECL_SELECT_ITEM_GROUP = 6;</code>
   */
  PKBKGFCCECL_SELECT_ITEM_GROUP(6),
  /**
   * <code>PKBKGFCCECL_SELECT_SLOT = 7;</code>
   */
  PKBKGFCCECL_SELECT_SLOT(7),
  /**
   * <code>PKBKGFCCECL_SELECT_COLOR = 8;</code>
   */
  PKBKGFCCECL_SELECT_COLOR(8),
  /**
   * <code>PKBKGFCCECL_SHOW_QUICK_SHOP = 9;</code>
   */
  PKBKGFCCECL_SHOW_QUICK_SHOP(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION = 0;</code>
   */
  public static final int PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION_VALUE = 0;
  /**
   * <code>PKBKGFCCECL_EQUIP_ITEM = 1;</code>
   */
  public static final int PKBKGFCCECL_EQUIP_ITEM_VALUE = 1;
  /**
   * <code>PKBKGFCCECL_OPEN_FEATURES = 2;</code>
   */
  public static final int PKBKGFCCECL_OPEN_FEATURES_VALUE = 2;
  /**
   * <code>PKBKGFCCECL_OPEN_STORE = 3;</code>
   */
  public static final int PKBKGFCCECL_OPEN_STORE_VALUE = 3;
  /**
   * <code>PKBKGFCCECL_PURCHASE_ITEM = 4;</code>
   */
  public static final int PKBKGFCCECL_PURCHASE_ITEM_VALUE = 4;
  /**
   * <code>PKBKGFCCECL_PURCHASE_ERROR = 5;</code>
   */
  public static final int PKBKGFCCECL_PURCHASE_ERROR_VALUE = 5;
  /**
   * <code>PKBKGFCCECL_SELECT_ITEM_GROUP = 6;</code>
   */
  public static final int PKBKGFCCECL_SELECT_ITEM_GROUP_VALUE = 6;
  /**
   * <code>PKBKGFCCECL_SELECT_SLOT = 7;</code>
   */
  public static final int PKBKGFCCECL_SELECT_SLOT_VALUE = 7;
  /**
   * <code>PKBKGFCCECL_SELECT_COLOR = 8;</code>
   */
  public static final int PKBKGFCCECL_SELECT_COLOR_VALUE = 8;
  /**
   * <code>PKBKGFCCECL_SHOW_QUICK_SHOP = 9;</code>
   */
  public static final int PKBKGFCCECL_SHOW_QUICK_SHOP_VALUE = 9;


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
  public static PKBKGFCCECL valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PKBKGFCCECL forNumber(int value) {
    switch (value) {
      case 0: return PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION;
      case 1: return PKBKGFCCECL_EQUIP_ITEM;
      case 2: return PKBKGFCCECL_OPEN_FEATURES;
      case 3: return PKBKGFCCECL_OPEN_STORE;
      case 4: return PKBKGFCCECL_PURCHASE_ITEM;
      case 5: return PKBKGFCCECL_PURCHASE_ERROR;
      case 6: return PKBKGFCCECL_SELECT_ITEM_GROUP;
      case 7: return PKBKGFCCECL_SELECT_SLOT;
      case 8: return PKBKGFCCECL_SELECT_COLOR;
      case 9: return PKBKGFCCECL_SHOW_QUICK_SHOP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PKBKGFCCECL>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PKBKGFCCECL> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PKBKGFCCECL>() {
          public PKBKGFCCECL findValueByNumber(int number) {
            return PKBKGFCCECL.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(132);
  }

  private static final PKBKGFCCECL[] VALUES = values();

  public static PKBKGFCCECL valueOf(
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

  private PKBKGFCCECL(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PKBKGFCCECL)
}

