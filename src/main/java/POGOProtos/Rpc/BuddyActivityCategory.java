// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BuddyActivityCategory}
 */
public enum BuddyActivityCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BUDDY_CATEGORY_UNSET = 0;</code>
   */
  BUDDY_CATEGORY_UNSET(0),
  /**
   * <code>BUDDY_CATEGORY_FEED = 1;</code>
   */
  BUDDY_CATEGORY_FEED(1),
  /**
   * <code>BUDDY_CATEGORY_CARE = 2;</code>
   */
  BUDDY_CATEGORY_CARE(2),
  /**
   * <code>BUDDY_CATEGORY_SNAPSHOT = 3;</code>
   */
  BUDDY_CATEGORY_SNAPSHOT(3),
  /**
   * <code>BUDDY_CATEGORY_WALK = 4;</code>
   */
  BUDDY_CATEGORY_WALK(4),
  /**
   * <code>BUDDY_CATEGORY_BATTLE = 5;</code>
   */
  BUDDY_CATEGORY_BATTLE(5),
  /**
   * <code>BUDDY_CATEGORY_EXPLORE = 6;</code>
   */
  BUDDY_CATEGORY_EXPLORE(6),
  /**
   * <code>BUDDY_CATEGORY_BONUS = 7;</code>
   */
  BUDDY_CATEGORY_BONUS(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BUDDY_CATEGORY_UNSET = 0;</code>
   */
  public static final int BUDDY_CATEGORY_UNSET_VALUE = 0;
  /**
   * <code>BUDDY_CATEGORY_FEED = 1;</code>
   */
  public static final int BUDDY_CATEGORY_FEED_VALUE = 1;
  /**
   * <code>BUDDY_CATEGORY_CARE = 2;</code>
   */
  public static final int BUDDY_CATEGORY_CARE_VALUE = 2;
  /**
   * <code>BUDDY_CATEGORY_SNAPSHOT = 3;</code>
   */
  public static final int BUDDY_CATEGORY_SNAPSHOT_VALUE = 3;
  /**
   * <code>BUDDY_CATEGORY_WALK = 4;</code>
   */
  public static final int BUDDY_CATEGORY_WALK_VALUE = 4;
  /**
   * <code>BUDDY_CATEGORY_BATTLE = 5;</code>
   */
  public static final int BUDDY_CATEGORY_BATTLE_VALUE = 5;
  /**
   * <code>BUDDY_CATEGORY_EXPLORE = 6;</code>
   */
  public static final int BUDDY_CATEGORY_EXPLORE_VALUE = 6;
  /**
   * <code>BUDDY_CATEGORY_BONUS = 7;</code>
   */
  public static final int BUDDY_CATEGORY_BONUS_VALUE = 7;


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
  public static BuddyActivityCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BuddyActivityCategory forNumber(int value) {
    switch (value) {
      case 0: return BUDDY_CATEGORY_UNSET;
      case 1: return BUDDY_CATEGORY_FEED;
      case 2: return BUDDY_CATEGORY_CARE;
      case 3: return BUDDY_CATEGORY_SNAPSHOT;
      case 4: return BUDDY_CATEGORY_WALK;
      case 5: return BUDDY_CATEGORY_BATTLE;
      case 6: return BUDDY_CATEGORY_EXPLORE;
      case 7: return BUDDY_CATEGORY_BONUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BuddyActivityCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BuddyActivityCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BuddyActivityCategory>() {
          public BuddyActivityCategory findValueByNumber(int number) {
            return BuddyActivityCategory.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(21);
  }

  private static final BuddyActivityCategory[] VALUES = values();

  public static BuddyActivityCategory valueOf(
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

  private BuddyActivityCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BuddyActivityCategory)
}

