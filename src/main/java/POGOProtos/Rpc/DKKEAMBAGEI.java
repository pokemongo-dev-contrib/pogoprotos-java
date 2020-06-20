// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DKKEAMBAGEI
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.DKKEAMBAGEI}
 */
public enum DKKEAMBAGEI
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DKKEAMBAGEI_UNDEFINED_GENERIC_EVENT = 0;</code>
   */
  DKKEAMBAGEI_UNDEFINED_GENERIC_EVENT(0),
  /**
   * <code>DKKEAMBAGEI_SPEED_WARNING_SHOW = 1;</code>
   */
  DKKEAMBAGEI_SPEED_WARNING_SHOW(1),
  /**
   * <code>DKKEAMBAGEI_SPEED_WARNING_PASSENGER = 2;</code>
   */
  DKKEAMBAGEI_SPEED_WARNING_PASSENGER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DKKEAMBAGEI_UNDEFINED_GENERIC_EVENT = 0;</code>
   */
  public static final int DKKEAMBAGEI_UNDEFINED_GENERIC_EVENT_VALUE = 0;
  /**
   * <code>DKKEAMBAGEI_SPEED_WARNING_SHOW = 1;</code>
   */
  public static final int DKKEAMBAGEI_SPEED_WARNING_SHOW_VALUE = 1;
  /**
   * <code>DKKEAMBAGEI_SPEED_WARNING_PASSENGER = 2;</code>
   */
  public static final int DKKEAMBAGEI_SPEED_WARNING_PASSENGER_VALUE = 2;


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
  public static DKKEAMBAGEI valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DKKEAMBAGEI forNumber(int value) {
    switch (value) {
      case 0: return DKKEAMBAGEI_UNDEFINED_GENERIC_EVENT;
      case 1: return DKKEAMBAGEI_SPEED_WARNING_SHOW;
      case 2: return DKKEAMBAGEI_SPEED_WARNING_PASSENGER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DKKEAMBAGEI>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DKKEAMBAGEI> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DKKEAMBAGEI>() {
          public DKKEAMBAGEI findValueByNumber(int number) {
            return DKKEAMBAGEI.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(24);
  }

  private static final DKKEAMBAGEI[] VALUES = values();

  public static DKKEAMBAGEI valueOf(
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

  private DKKEAMBAGEI(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DKKEAMBAGEI)
}

