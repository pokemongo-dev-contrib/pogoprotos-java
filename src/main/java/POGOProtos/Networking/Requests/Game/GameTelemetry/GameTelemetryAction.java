// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameTelemetry/GameTelemetryAction.proto

package POGOProtos.Networking.Requests.Game.GameTelemetry;

/**
 * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GameTelemetry.GameTelemetryAction}
 */
public enum GameTelemetryAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_TELEMETRY_ACTION = 0;</code>
   */
  UNKNOWN_GAME_TELEMETRY_ACTION(0),
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>COLLECT_CLIENT_TELEMETRY = 610000;</code>
   */
  COLLECT_CLIENT_TELEMETRY(610000),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>GET_CLIENT_TELEMETRY_SETTINGS = 610001;</code>
   */
  GET_CLIENT_TELEMETRY_SETTINGS(610001),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_TELEMETRY_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_TELEMETRY_ACTION_VALUE = 0;
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>COLLECT_CLIENT_TELEMETRY = 610000;</code>
   */
  public static final int COLLECT_CLIENT_TELEMETRY_VALUE = 610000;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>GET_CLIENT_TELEMETRY_SETTINGS = 610001;</code>
   */
  public static final int GET_CLIENT_TELEMETRY_SETTINGS_VALUE = 610001;


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
  public static GameTelemetryAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameTelemetryAction forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_TELEMETRY_ACTION;
      case 610000: return COLLECT_CLIENT_TELEMETRY;
      case 610001: return GET_CLIENT_TELEMETRY_SETTINGS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameTelemetryAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameTelemetryAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameTelemetryAction>() {
          public GameTelemetryAction findValueByNumber(int number) {
            return GameTelemetryAction.forNumber(number);
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
    return POGOProtos.Networking.Requests.Game.GameTelemetry.GameTelemetryActionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameTelemetryAction[] VALUES = values();

  public static GameTelemetryAction valueOf(
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

  private GameTelemetryAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GameTelemetry.GameTelemetryAction)
}
