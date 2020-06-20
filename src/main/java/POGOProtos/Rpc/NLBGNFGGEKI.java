// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.NLBGNFGGEKI}
 */
public enum NLBGNFGGEKI
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE = 0;</code>
   */
  NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE(0),
  /**
   * <code>NLBGNFGGEKI_FITNESS = 1;</code>
   */
  NLBGNFGGEKI_FITNESS(1),
  /**
   * <code>NLBGNFGGEKI_SMART_WATCH = 2;</code>
   */
  NLBGNFGGEKI_SMART_WATCH(2),
  /**
   * <code>NLBGNFGGEKI_SFIDA = 3;</code>
   */
  NLBGNFGGEKI_SFIDA(3),
  /**
   * <code>NLBGNFGGEKI_AWARENESS = 4;</code>
   */
  NLBGNFGGEKI_AWARENESS(4),
  /**
   * <code>NLBGNFGGEKI_ADVENTURE_SYNC = 5;</code>
   */
  NLBGNFGGEKI_ADVENTURE_SYNC(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE = 0;</code>
   */
  public static final int NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE_VALUE = 0;
  /**
   * <code>NLBGNFGGEKI_FITNESS = 1;</code>
   */
  public static final int NLBGNFGGEKI_FITNESS_VALUE = 1;
  /**
   * <code>NLBGNFGGEKI_SMART_WATCH = 2;</code>
   */
  public static final int NLBGNFGGEKI_SMART_WATCH_VALUE = 2;
  /**
   * <code>NLBGNFGGEKI_SFIDA = 3;</code>
   */
  public static final int NLBGNFGGEKI_SFIDA_VALUE = 3;
  /**
   * <code>NLBGNFGGEKI_AWARENESS = 4;</code>
   */
  public static final int NLBGNFGGEKI_AWARENESS_VALUE = 4;
  /**
   * <code>NLBGNFGGEKI_ADVENTURE_SYNC = 5;</code>
   */
  public static final int NLBGNFGGEKI_ADVENTURE_SYNC_VALUE = 5;


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
  public static NLBGNFGGEKI valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NLBGNFGGEKI forNumber(int value) {
    switch (value) {
      case 0: return NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE;
      case 1: return NLBGNFGGEKI_FITNESS;
      case 2: return NLBGNFGGEKI_SMART_WATCH;
      case 3: return NLBGNFGGEKI_SFIDA;
      case 4: return NLBGNFGGEKI_AWARENESS;
      case 5: return NLBGNFGGEKI_ADVENTURE_SYNC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NLBGNFGGEKI>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NLBGNFGGEKI> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NLBGNFGGEKI>() {
          public NLBGNFGGEKI findValueByNumber(int number) {
            return NLBGNFGGEKI.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(99);
  }

  private static final NLBGNFGGEKI[] VALUES = values();

  public static NLBGNFGGEKI valueOf(
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

  private NLBGNFGGEKI(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NLBGNFGGEKI)
}

