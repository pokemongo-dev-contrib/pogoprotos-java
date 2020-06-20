// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PokemonGoPlus.SfidaConnectState
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.SfidaConnectState}
 */
public enum SfidaConnectState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SFIDACONNECTSTATE_DISCONNECTED = 0;</code>
   */
  SFIDACONNECTSTATE_DISCONNECTED(0),
  /**
   * <code>SFIDACONNECTSTATE_DISCONNECTING = 1;</code>
   */
  SFIDACONNECTSTATE_DISCONNECTING(1),
  /**
   * <code>SFIDACONNECTSTATE_CONNECTED = 2;</code>
   */
  SFIDACONNECTSTATE_CONNECTED(2),
  /**
   * <code>SFIDACONNECTSTATE_DISCOVERED = 3;</code>
   */
  SFIDACONNECTSTATE_DISCOVERED(3),
  /**
   * <code>SFIDACONNECTSTATE_CERTIFIED = 4;</code>
   */
  SFIDACONNECTSTATE_CERTIFIED(4),
  /**
   * <code>SFIDACONNECTSTATE_SOFTWARE_UPDATE = 5;</code>
   */
  SFIDACONNECTSTATE_SOFTWARE_UPDATE(5),
  /**
   * <code>SFIDACONNECTSTATE_FAILED = 6;</code>
   */
  SFIDACONNECTSTATE_FAILED(6),
  /**
   * <code>SFIDACONNECTSTATE_CONNECTING = 7;</code>
   */
  SFIDACONNECTSTATE_CONNECTING(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SFIDACONNECTSTATE_DISCONNECTED = 0;</code>
   */
  public static final int SFIDACONNECTSTATE_DISCONNECTED_VALUE = 0;
  /**
   * <code>SFIDACONNECTSTATE_DISCONNECTING = 1;</code>
   */
  public static final int SFIDACONNECTSTATE_DISCONNECTING_VALUE = 1;
  /**
   * <code>SFIDACONNECTSTATE_CONNECTED = 2;</code>
   */
  public static final int SFIDACONNECTSTATE_CONNECTED_VALUE = 2;
  /**
   * <code>SFIDACONNECTSTATE_DISCOVERED = 3;</code>
   */
  public static final int SFIDACONNECTSTATE_DISCOVERED_VALUE = 3;
  /**
   * <code>SFIDACONNECTSTATE_CERTIFIED = 4;</code>
   */
  public static final int SFIDACONNECTSTATE_CERTIFIED_VALUE = 4;
  /**
   * <code>SFIDACONNECTSTATE_SOFTWARE_UPDATE = 5;</code>
   */
  public static final int SFIDACONNECTSTATE_SOFTWARE_UPDATE_VALUE = 5;
  /**
   * <code>SFIDACONNECTSTATE_FAILED = 6;</code>
   */
  public static final int SFIDACONNECTSTATE_FAILED_VALUE = 6;
  /**
   * <code>SFIDACONNECTSTATE_CONNECTING = 7;</code>
   */
  public static final int SFIDACONNECTSTATE_CONNECTING_VALUE = 7;


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
  public static SfidaConnectState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SfidaConnectState forNumber(int value) {
    switch (value) {
      case 0: return SFIDACONNECTSTATE_DISCONNECTED;
      case 1: return SFIDACONNECTSTATE_DISCONNECTING;
      case 2: return SFIDACONNECTSTATE_CONNECTED;
      case 3: return SFIDACONNECTSTATE_DISCOVERED;
      case 4: return SFIDACONNECTSTATE_CERTIFIED;
      case 5: return SFIDACONNECTSTATE_SOFTWARE_UPDATE;
      case 6: return SFIDACONNECTSTATE_FAILED;
      case 7: return SFIDACONNECTSTATE_CONNECTING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SfidaConnectState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SfidaConnectState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SfidaConnectState>() {
          public SfidaConnectState findValueByNumber(int number) {
            return SfidaConnectState.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(4);
  }

  private static final SfidaConnectState[] VALUES = values();

  public static SfidaConnectState valueOf(
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

  private SfidaConnectState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SfidaConnectState)
}

