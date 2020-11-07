// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CombatPlayerFinishState}
 */
public enum CombatPlayerFinishState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_WINNER = 0;</code>
   */
  COMBAT_PLAYER_FINISH_STATE_WINNER(0),
  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_LOSER = 1;</code>
   */
  COMBAT_PLAYER_FINISH_STATE_LOSER(1),
  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_DRAW = 2;</code>
   */
  COMBAT_PLAYER_FINISH_STATE_DRAW(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_WINNER = 0;</code>
   */
  public static final int COMBAT_PLAYER_FINISH_STATE_WINNER_VALUE = 0;
  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_LOSER = 1;</code>
   */
  public static final int COMBAT_PLAYER_FINISH_STATE_LOSER_VALUE = 1;
  /**
   * <code>COMBAT_PLAYER_FINISH_STATE_DRAW = 2;</code>
   */
  public static final int COMBAT_PLAYER_FINISH_STATE_DRAW_VALUE = 2;


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
  public static CombatPlayerFinishState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CombatPlayerFinishState forNumber(int value) {
    switch (value) {
      case 0: return COMBAT_PLAYER_FINISH_STATE_WINNER;
      case 1: return COMBAT_PLAYER_FINISH_STATE_LOSER;
      case 2: return COMBAT_PLAYER_FINISH_STATE_DRAW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CombatPlayerFinishState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CombatPlayerFinishState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CombatPlayerFinishState>() {
          public CombatPlayerFinishState findValueByNumber(int number) {
            return CombatPlayerFinishState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(30);
  }

  private static final CombatPlayerFinishState[] VALUES = values();

  public static CombatPlayerFinishState valueOf(
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

  private CombatPlayerFinishState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CombatPlayerFinishState)
}

