// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OKKIICNMDLC
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.OKKIICNMDLC}
 */
public enum OKKIICNMDLC
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OKKIICNMDLC_CHEAT_WARNING = 0;</code>
   */
  OKKIICNMDLC_CHEAT_WARNING(0),
  /**
   * <code>OKKIICNMDLC_POST_SUSPENSION_WARNING = 1;</code>
   */
  OKKIICNMDLC_POST_SUSPENSION_WARNING(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OKKIICNMDLC_CHEAT_WARNING = 0;</code>
   */
  public static final int OKKIICNMDLC_CHEAT_WARNING_VALUE = 0;
  /**
   * <code>OKKIICNMDLC_POST_SUSPENSION_WARNING = 1;</code>
   */
  public static final int OKKIICNMDLC_POST_SUSPENSION_WARNING_VALUE = 1;


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
  public static OKKIICNMDLC valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OKKIICNMDLC forNumber(int value) {
    switch (value) {
      case 0: return OKKIICNMDLC_CHEAT_WARNING;
      case 1: return OKKIICNMDLC_POST_SUSPENSION_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OKKIICNMDLC>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OKKIICNMDLC> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OKKIICNMDLC>() {
          public OKKIICNMDLC findValueByNumber(int number) {
            return OKKIICNMDLC.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(110);
  }

  private static final OKKIICNMDLC[] VALUES = values();

  public static OKKIICNMDLC valueOf(
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

  private OKKIICNMDLC(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OKKIICNMDLC)
}

