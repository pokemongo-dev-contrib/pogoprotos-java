// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PluginState}
 */
public enum PluginState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLUGIN_STATE_UNKNOWN = 0;</code>
   */
  PLUGIN_STATE_UNKNOWN(0),
  /**
   * <code>PLUGIN_STATE_INITIALIZED = 1;</code>
   */
  PLUGIN_STATE_INITIALIZED(1),
  /**
   * <code>PLUGIN_STATE_STARTING = 2;</code>
   */
  PLUGIN_STATE_STARTING(2),
  /**
   * <code>PLUGIN_STATE_STARTED = 3;</code>
   */
  PLUGIN_STATE_STARTED(3),
  /**
   * <code>PLUGIN_STATE_RESUMED = 4;</code>
   */
  PLUGIN_STATE_RESUMED(4),
  /**
   * <code>PLUGIN_STATE_PAUSED = 5;</code>
   */
  PLUGIN_STATE_PAUSED(5),
  /**
   * <code>PLUGIN_STATE_STOPPED = 6;</code>
   */
  PLUGIN_STATE_STOPPED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLUGIN_STATE_UNKNOWN = 0;</code>
   */
  public static final int PLUGIN_STATE_UNKNOWN_VALUE = 0;
  /**
   * <code>PLUGIN_STATE_INITIALIZED = 1;</code>
   */
  public static final int PLUGIN_STATE_INITIALIZED_VALUE = 1;
  /**
   * <code>PLUGIN_STATE_STARTING = 2;</code>
   */
  public static final int PLUGIN_STATE_STARTING_VALUE = 2;
  /**
   * <code>PLUGIN_STATE_STARTED = 3;</code>
   */
  public static final int PLUGIN_STATE_STARTED_VALUE = 3;
  /**
   * <code>PLUGIN_STATE_RESUMED = 4;</code>
   */
  public static final int PLUGIN_STATE_RESUMED_VALUE = 4;
  /**
   * <code>PLUGIN_STATE_PAUSED = 5;</code>
   */
  public static final int PLUGIN_STATE_PAUSED_VALUE = 5;
  /**
   * <code>PLUGIN_STATE_STOPPED = 6;</code>
   */
  public static final int PLUGIN_STATE_STOPPED_VALUE = 6;


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
  public static PluginState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PluginState forNumber(int value) {
    switch (value) {
      case 0: return PLUGIN_STATE_UNKNOWN;
      case 1: return PLUGIN_STATE_INITIALIZED;
      case 2: return PLUGIN_STATE_STARTING;
      case 3: return PLUGIN_STATE_STARTED;
      case 4: return PLUGIN_STATE_RESUMED;
      case 5: return PLUGIN_STATE_PAUSED;
      case 6: return PLUGIN_STATE_STOPPED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PluginState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PluginState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PluginState>() {
          public PluginState findValueByNumber(int number) {
            return PluginState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(106);
  }

  private static final PluginState[] VALUES = values();

  public static PluginState valueOf(
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

  private PluginState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PluginState)
}

