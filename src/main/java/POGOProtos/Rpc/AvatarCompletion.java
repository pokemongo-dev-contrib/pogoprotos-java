// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.AvatarCompletion}
 */
public enum AvatarCompletion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AVATAR_COMPLETION_SUCCESS = 0;</code>
   */
  AVATAR_COMPLETION_SUCCESS(0),
  /**
   * <code>AVATAR_COMPLETION_QUIT = 1;</code>
   */
  AVATAR_COMPLETION_QUIT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AVATAR_COMPLETION_SUCCESS = 0;</code>
   */
  public static final int AVATAR_COMPLETION_SUCCESS_VALUE = 0;
  /**
   * <code>AVATAR_COMPLETION_QUIT = 1;</code>
   */
  public static final int AVATAR_COMPLETION_QUIT_VALUE = 1;


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
  public static AvatarCompletion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AvatarCompletion forNumber(int value) {
    switch (value) {
      case 0: return AVATAR_COMPLETION_SUCCESS;
      case 1: return AVATAR_COMPLETION_QUIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AvatarCompletion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AvatarCompletion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AvatarCompletion>() {
          public AvatarCompletion findValueByNumber(int number) {
            return AvatarCompletion.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(12);
  }

  private static final AvatarCompletion[] VALUES = values();

  public static AvatarCompletion valueOf(
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

  private AvatarCompletion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AvatarCompletion)
}

