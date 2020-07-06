// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePasscode/GamePasscodeAction.proto

package POGOProtos.Networking.Requests.Game.GamePasscode;

/**
 * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GamePasscode.GamePasscodeAction}
 */
public enum GamePasscodeAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PASSCODE_ACTION = 0;</code>
   */
  UNKNOWN_GAME_PASSCODE_ACTION(0),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REDEEM_PASSCODE = 330000;</code>
   */
  REDEEM_PASSCODE(330000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PASSCODE_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_PASSCODE_ACTION_VALUE = 0;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REDEEM_PASSCODE = 330000;</code>
   */
  public static final int REDEEM_PASSCODE_VALUE = 330000;


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
  public static GamePasscodeAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GamePasscodeAction forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_PASSCODE_ACTION;
      case 330000: return REDEEM_PASSCODE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GamePasscodeAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GamePasscodeAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GamePasscodeAction>() {
          public GamePasscodeAction findValueByNumber(int number) {
            return GamePasscodeAction.forNumber(number);
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
    return POGOProtos.Networking.Requests.Game.GamePasscode.GamePasscodeActionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GamePasscodeAction[] VALUES = values();

  public static GamePasscodeAction valueOf(
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

  private GamePasscodeAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GamePasscode.GamePasscodeAction)
}
