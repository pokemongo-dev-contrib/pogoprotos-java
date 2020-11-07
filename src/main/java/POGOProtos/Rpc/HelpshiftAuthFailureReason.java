// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HelpshiftAuthFailureReason}
 */
public enum HelpshiftAuthFailureReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HELPSHIFT_AUTH_FAILURE_REASON_AUTH_TOKEN_NOT_PROVIDED = 0;</code>
   */
  HELPSHIFT_AUTH_FAILURE_REASON_AUTH_TOKEN_NOT_PROVIDED(0),
  /**
   * <code>HELPSHIFT_AUTH_FAILURE_REASON_INVALID_AUTH_TOKEN = 1;</code>
   */
  HELPSHIFT_AUTH_FAILURE_REASON_INVALID_AUTH_TOKEN(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HELPSHIFT_AUTH_FAILURE_REASON_AUTH_TOKEN_NOT_PROVIDED = 0;</code>
   */
  public static final int HELPSHIFT_AUTH_FAILURE_REASON_AUTH_TOKEN_NOT_PROVIDED_VALUE = 0;
  /**
   * <code>HELPSHIFT_AUTH_FAILURE_REASON_INVALID_AUTH_TOKEN = 1;</code>
   */
  public static final int HELPSHIFT_AUTH_FAILURE_REASON_INVALID_AUTH_TOKEN_VALUE = 1;


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
  public static HelpshiftAuthFailureReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HelpshiftAuthFailureReason forNumber(int value) {
    switch (value) {
      case 0: return HELPSHIFT_AUTH_FAILURE_REASON_AUTH_TOKEN_NOT_PROVIDED;
      case 1: return HELPSHIFT_AUTH_FAILURE_REASON_INVALID_AUTH_TOKEN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HelpshiftAuthFailureReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HelpshiftAuthFailureReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HelpshiftAuthFailureReason>() {
          public HelpshiftAuthFailureReason findValueByNumber(int number) {
            return HelpshiftAuthFailureReason.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(46);
  }

  private static final HelpshiftAuthFailureReason[] VALUES = values();

  public static HelpshiftAuthFailureReason valueOf(
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

  private HelpshiftAuthFailureReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HelpshiftAuthFailureReason)
}

