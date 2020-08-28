// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JPAMFAMABEL
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.JPAMFAMABEL}
 */
public enum JPAMFAMABEL
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JPAMFAMABEL_BANNED = 0;</code>
   */
  JPAMFAMABEL_BANNED(0),
  /**
   * <code>JPAMFAMABEL_UNAUTHORIZED_DEVICE = 1;</code>
   */
  JPAMFAMABEL_UNAUTHORIZED_DEVICE(1),
  /**
   * <code>JPAMFAMABEL_SUSPENDED = 2;</code>
   */
  JPAMFAMABEL_SUSPENDED(2),
  /**
   * <code>JPAMFAMABEL_RESTRICTION_VIOLATION = 3;</code>
   */
  JPAMFAMABEL_RESTRICTION_VIOLATION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JPAMFAMABEL_BANNED = 0;</code>
   */
  public static final int JPAMFAMABEL_BANNED_VALUE = 0;
  /**
   * <code>JPAMFAMABEL_UNAUTHORIZED_DEVICE = 1;</code>
   */
  public static final int JPAMFAMABEL_UNAUTHORIZED_DEVICE_VALUE = 1;
  /**
   * <code>JPAMFAMABEL_SUSPENDED = 2;</code>
   */
  public static final int JPAMFAMABEL_SUSPENDED_VALUE = 2;
  /**
   * <code>JPAMFAMABEL_RESTRICTION_VIOLATION = 3;</code>
   */
  public static final int JPAMFAMABEL_RESTRICTION_VIOLATION_VALUE = 3;


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
  public static JPAMFAMABEL valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JPAMFAMABEL forNumber(int value) {
    switch (value) {
      case 0: return JPAMFAMABEL_BANNED;
      case 1: return JPAMFAMABEL_UNAUTHORIZED_DEVICE;
      case 2: return JPAMFAMABEL_SUSPENDED;
      case 3: return JPAMFAMABEL_RESTRICTION_VIOLATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JPAMFAMABEL>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JPAMFAMABEL> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JPAMFAMABEL>() {
          public JPAMFAMABEL findValueByNumber(int number) {
            return JPAMFAMABEL.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(93);
  }

  private static final JPAMFAMABEL[] VALUES = values();

  public static JPAMFAMABEL valueOf(
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

  private JPAMFAMABEL(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.JPAMFAMABEL)
}

