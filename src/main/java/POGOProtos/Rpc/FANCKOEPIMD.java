// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FANCKOEPIMD
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.FANCKOEPIMD}
 */
public enum FANCKOEPIMD
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FANCKOEPIMD_UNDEFINED_PROFILE_PAGE = 0;</code>
   */
  FANCKOEPIMD_UNDEFINED_PROFILE_PAGE(0),
  /**
   * <code>FANCKOEPIMD_SHOP_FROM_PROFILE = 1;</code>
   */
  FANCKOEPIMD_SHOP_FROM_PROFILE(1),
  /**
   * <code>FANCKOEPIMD_LOG = 2;</code>
   */
  FANCKOEPIMD_LOG(2),
  /**
   * <code>FANCKOEPIMD_SET_BUDDY = 3;</code>
   */
  FANCKOEPIMD_SET_BUDDY(3),
  /**
   * <code>FANCKOEPIMD_CUSTOMIZE_AVATAR = 4;</code>
   */
  FANCKOEPIMD_CUSTOMIZE_AVATAR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FANCKOEPIMD_UNDEFINED_PROFILE_PAGE = 0;</code>
   */
  public static final int FANCKOEPIMD_UNDEFINED_PROFILE_PAGE_VALUE = 0;
  /**
   * <code>FANCKOEPIMD_SHOP_FROM_PROFILE = 1;</code>
   */
  public static final int FANCKOEPIMD_SHOP_FROM_PROFILE_VALUE = 1;
  /**
   * <code>FANCKOEPIMD_LOG = 2;</code>
   */
  public static final int FANCKOEPIMD_LOG_VALUE = 2;
  /**
   * <code>FANCKOEPIMD_SET_BUDDY = 3;</code>
   */
  public static final int FANCKOEPIMD_SET_BUDDY_VALUE = 3;
  /**
   * <code>FANCKOEPIMD_CUSTOMIZE_AVATAR = 4;</code>
   */
  public static final int FANCKOEPIMD_CUSTOMIZE_AVATAR_VALUE = 4;


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
  public static FANCKOEPIMD valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FANCKOEPIMD forNumber(int value) {
    switch (value) {
      case 0: return FANCKOEPIMD_UNDEFINED_PROFILE_PAGE;
      case 1: return FANCKOEPIMD_SHOP_FROM_PROFILE;
      case 2: return FANCKOEPIMD_LOG;
      case 3: return FANCKOEPIMD_SET_BUDDY;
      case 4: return FANCKOEPIMD_CUSTOMIZE_AVATAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FANCKOEPIMD>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FANCKOEPIMD> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FANCKOEPIMD>() {
          public FANCKOEPIMD findValueByNumber(int number) {
            return FANCKOEPIMD.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(35);
  }

  private static final FANCKOEPIMD[] VALUES = values();

  public static FANCKOEPIMD valueOf(
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

  private FANCKOEPIMD(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FANCKOEPIMD)
}

