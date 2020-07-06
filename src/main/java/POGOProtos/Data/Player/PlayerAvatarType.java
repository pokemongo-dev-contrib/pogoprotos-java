// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/PlayerAvatarType.proto

package POGOProtos.Data.Player;

/**
 * Protobuf enum {@code POGOProtos.Data.Player.PlayerAvatarType}
 */
public enum PlayerAvatarType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLAYER_AVATAR_MALE = 0;</code>
   */
  PLAYER_AVATAR_MALE(0),
  /**
   * <code>PLAYER_AVATAR_FEMALE = 1;</code>
   */
  PLAYER_AVATAR_FEMALE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLAYER_AVATAR_MALE = 0;</code>
   */
  public static final int PLAYER_AVATAR_MALE_VALUE = 0;
  /**
   * <code>PLAYER_AVATAR_FEMALE = 1;</code>
   */
  public static final int PLAYER_AVATAR_FEMALE_VALUE = 1;


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
  public static PlayerAvatarType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayerAvatarType forNumber(int value) {
    switch (value) {
      case 0: return PLAYER_AVATAR_MALE;
      case 1: return PLAYER_AVATAR_FEMALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayerAvatarType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayerAvatarType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayerAvatarType>() {
          public PlayerAvatarType findValueByNumber(int number) {
            return PlayerAvatarType.forNumber(number);
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
    return POGOProtos.Data.Player.PlayerAvatarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PlayerAvatarType[] VALUES = values();

  public static PlayerAvatarType valueOf(
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

  private PlayerAvatarType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Player.PlayerAvatarType)
}
