// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PLICBAAOGEN
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.PLICBAAOGEN}
 */
public enum PLICBAAOGEN
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLICBAAOGEN_BANNED = 0;</code>
   */
  PLICBAAOGEN_BANNED(0),
  /**
   * <code>PLICBAAOGEN_UNAUTHORIZED_DEVICE = 1;</code>
   */
  PLICBAAOGEN_UNAUTHORIZED_DEVICE(1),
  /**
   * <code>PLICBAAOGEN_SUSPENDED = 2;</code>
   */
  PLICBAAOGEN_SUSPENDED(2),
  /**
   * <code>PLICBAAOGEN_RESTRICTION_VIOLATION = 3;</code>
   */
  PLICBAAOGEN_RESTRICTION_VIOLATION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLICBAAOGEN_BANNED = 0;</code>
   */
  public static final int PLICBAAOGEN_BANNED_VALUE = 0;
  /**
   * <code>PLICBAAOGEN_UNAUTHORIZED_DEVICE = 1;</code>
   */
  public static final int PLICBAAOGEN_UNAUTHORIZED_DEVICE_VALUE = 1;
  /**
   * <code>PLICBAAOGEN_SUSPENDED = 2;</code>
   */
  public static final int PLICBAAOGEN_SUSPENDED_VALUE = 2;
  /**
   * <code>PLICBAAOGEN_RESTRICTION_VIOLATION = 3;</code>
   */
  public static final int PLICBAAOGEN_RESTRICTION_VIOLATION_VALUE = 3;


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
  public static PLICBAAOGEN valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PLICBAAOGEN forNumber(int value) {
    switch (value) {
      case 0: return PLICBAAOGEN_BANNED;
      case 1: return PLICBAAOGEN_UNAUTHORIZED_DEVICE;
      case 2: return PLICBAAOGEN_SUSPENDED;
      case 3: return PLICBAAOGEN_RESTRICTION_VIOLATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PLICBAAOGEN>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PLICBAAOGEN> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PLICBAAOGEN>() {
          public PLICBAAOGEN findValueByNumber(int number) {
            return PLICBAAOGEN.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(116);
  }

  private static final PLICBAAOGEN[] VALUES = values();

  public static PLICBAAOGEN valueOf(
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

  private PLICBAAOGEN(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PLICBAAOGEN)
}

