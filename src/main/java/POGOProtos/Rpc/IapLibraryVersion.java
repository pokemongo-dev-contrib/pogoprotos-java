// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IapLibraryVersion}
 */
public enum IapLibraryVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IAP_LIBRARY_VERSION_DEFAULT = 0;</code>
   */
  IAP_LIBRARY_VERSION_DEFAULT(0),
  /**
   * <code>IAP_LIBRARY_VERSION_IODINE_1_8 = 1;</code>
   */
  IAP_LIBRARY_VERSION_IODINE_1_8(1),
  /**
   * <code>IAP_LIBRARY_VERSION_NIA_IAP_4 = 2;</code>
   */
  IAP_LIBRARY_VERSION_NIA_IAP_4(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IAP_LIBRARY_VERSION_DEFAULT = 0;</code>
   */
  public static final int IAP_LIBRARY_VERSION_DEFAULT_VALUE = 0;
  /**
   * <code>IAP_LIBRARY_VERSION_IODINE_1_8 = 1;</code>
   */
  public static final int IAP_LIBRARY_VERSION_IODINE_1_8_VALUE = 1;
  /**
   * <code>IAP_LIBRARY_VERSION_NIA_IAP_4 = 2;</code>
   */
  public static final int IAP_LIBRARY_VERSION_NIA_IAP_4_VALUE = 2;


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
  public static IapLibraryVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IapLibraryVersion forNumber(int value) {
    switch (value) {
      case 0: return IAP_LIBRARY_VERSION_DEFAULT;
      case 1: return IAP_LIBRARY_VERSION_IODINE_1_8;
      case 2: return IAP_LIBRARY_VERSION_NIA_IAP_4;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IapLibraryVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IapLibraryVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IapLibraryVersion>() {
          public IapLibraryVersion findValueByNumber(int number) {
            return IapLibraryVersion.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(69);
  }

  private static final IapLibraryVersion[] VALUES = values();

  public static IapLibraryVersion valueOf(
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

  private IapLibraryVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IapLibraryVersion)
}

