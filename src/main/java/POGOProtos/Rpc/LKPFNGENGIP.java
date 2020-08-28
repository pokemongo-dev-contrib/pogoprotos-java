// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LKPFNGENGIP
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.LKPFNGENGIP}
 */
public enum LKPFNGENGIP
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LKPFNGENGIP_SHARE_EX_RAID_PASS_UNSET = 0;</code>
   */
  LKPFNGENGIP_SHARE_EX_RAID_PASS_UNSET(0),
  /**
   * <code>LKPFNGENGIP_SHARE_EX_RAID_PASS_SUCCESS = 1;</code>
   */
  LKPFNGENGIP_SHARE_EX_RAID_PASS_SUCCESS(1),
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_ALREADY_INVITED_TO_SAME_RAID = 2;</code>
   */
  LKPFNGENGIP_ERROR_FRIEND_ALREADY_INVITED_TO_SAME_RAID(2),
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_PASS_ALREADY_SHARED = 3;</code>
   */
  LKPFNGENGIP_ERROR_EX_RAID_PASS_ALREADY_SHARED(3),
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_ALREADY_HAS_SHARED_EX_PASS_IN_INVENTORY = 4;</code>
   */
  LKPFNGENGIP_ERROR_FRIEND_ALREADY_HAS_SHARED_EX_PASS_IN_INVENTORY(4),
  /**
   * <code>LKPFNGENGIP_ERROR_TOO_LOW_FRIENDSHIP_LEVEL = 5;</code>
   */
  LKPFNGENGIP_ERROR_TOO_LOW_FRIENDSHIP_LEVEL(5),
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_NOT_FOUND = 6;</code>
   */
  LKPFNGENGIP_ERROR_FRIEND_NOT_FOUND(6),
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_ALREADY_STARTED = 7;</code>
   */
  LKPFNGENGIP_ERROR_EX_RAID_ALREADY_STARTED(7),
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_INVALID = 8;</code>
   */
  LKPFNGENGIP_ERROR_EX_RAID_INVALID(8),
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_PASS_NOT_FOUND = 9;</code>
   */
  LKPFNGENGIP_ERROR_EX_RAID_PASS_NOT_FOUND(9),
  /**
   * <code>LKPFNGENGIP_ERROR_UNKNOWN = 10;</code>
   */
  LKPFNGENGIP_ERROR_UNKNOWN(10),
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_NOT_ELIGIBLE = 11;</code>
   */
  LKPFNGENGIP_ERROR_FRIEND_NOT_ELIGIBLE(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LKPFNGENGIP_SHARE_EX_RAID_PASS_UNSET = 0;</code>
   */
  public static final int LKPFNGENGIP_SHARE_EX_RAID_PASS_UNSET_VALUE = 0;
  /**
   * <code>LKPFNGENGIP_SHARE_EX_RAID_PASS_SUCCESS = 1;</code>
   */
  public static final int LKPFNGENGIP_SHARE_EX_RAID_PASS_SUCCESS_VALUE = 1;
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_ALREADY_INVITED_TO_SAME_RAID = 2;</code>
   */
  public static final int LKPFNGENGIP_ERROR_FRIEND_ALREADY_INVITED_TO_SAME_RAID_VALUE = 2;
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_PASS_ALREADY_SHARED = 3;</code>
   */
  public static final int LKPFNGENGIP_ERROR_EX_RAID_PASS_ALREADY_SHARED_VALUE = 3;
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_ALREADY_HAS_SHARED_EX_PASS_IN_INVENTORY = 4;</code>
   */
  public static final int LKPFNGENGIP_ERROR_FRIEND_ALREADY_HAS_SHARED_EX_PASS_IN_INVENTORY_VALUE = 4;
  /**
   * <code>LKPFNGENGIP_ERROR_TOO_LOW_FRIENDSHIP_LEVEL = 5;</code>
   */
  public static final int LKPFNGENGIP_ERROR_TOO_LOW_FRIENDSHIP_LEVEL_VALUE = 5;
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_NOT_FOUND = 6;</code>
   */
  public static final int LKPFNGENGIP_ERROR_FRIEND_NOT_FOUND_VALUE = 6;
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_ALREADY_STARTED = 7;</code>
   */
  public static final int LKPFNGENGIP_ERROR_EX_RAID_ALREADY_STARTED_VALUE = 7;
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_INVALID = 8;</code>
   */
  public static final int LKPFNGENGIP_ERROR_EX_RAID_INVALID_VALUE = 8;
  /**
   * <code>LKPFNGENGIP_ERROR_EX_RAID_PASS_NOT_FOUND = 9;</code>
   */
  public static final int LKPFNGENGIP_ERROR_EX_RAID_PASS_NOT_FOUND_VALUE = 9;
  /**
   * <code>LKPFNGENGIP_ERROR_UNKNOWN = 10;</code>
   */
  public static final int LKPFNGENGIP_ERROR_UNKNOWN_VALUE = 10;
  /**
   * <code>LKPFNGENGIP_ERROR_FRIEND_NOT_ELIGIBLE = 11;</code>
   */
  public static final int LKPFNGENGIP_ERROR_FRIEND_NOT_ELIGIBLE_VALUE = 11;


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
  public static LKPFNGENGIP valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LKPFNGENGIP forNumber(int value) {
    switch (value) {
      case 0: return LKPFNGENGIP_SHARE_EX_RAID_PASS_UNSET;
      case 1: return LKPFNGENGIP_SHARE_EX_RAID_PASS_SUCCESS;
      case 2: return LKPFNGENGIP_ERROR_FRIEND_ALREADY_INVITED_TO_SAME_RAID;
      case 3: return LKPFNGENGIP_ERROR_EX_RAID_PASS_ALREADY_SHARED;
      case 4: return LKPFNGENGIP_ERROR_FRIEND_ALREADY_HAS_SHARED_EX_PASS_IN_INVENTORY;
      case 5: return LKPFNGENGIP_ERROR_TOO_LOW_FRIENDSHIP_LEVEL;
      case 6: return LKPFNGENGIP_ERROR_FRIEND_NOT_FOUND;
      case 7: return LKPFNGENGIP_ERROR_EX_RAID_ALREADY_STARTED;
      case 8: return LKPFNGENGIP_ERROR_EX_RAID_INVALID;
      case 9: return LKPFNGENGIP_ERROR_EX_RAID_PASS_NOT_FOUND;
      case 10: return LKPFNGENGIP_ERROR_UNKNOWN;
      case 11: return LKPFNGENGIP_ERROR_FRIEND_NOT_ELIGIBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LKPFNGENGIP>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LKPFNGENGIP> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LKPFNGENGIP>() {
          public LKPFNGENGIP findValueByNumber(int number) {
            return LKPFNGENGIP.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(106);
  }

  private static final LKPFNGENGIP[] VALUES = values();

  public static LKPFNGENGIP valueOf(
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

  private LKPFNGENGIP(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.LKPFNGENGIP)
}

