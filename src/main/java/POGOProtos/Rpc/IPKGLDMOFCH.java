// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IPKGLDMOFCH}
 */
public enum IPKGLDMOFCH
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IPKGLDMOFCH_PLATFORM_UNSET = 0;</code>
   */
  IPKGLDMOFCH_PLATFORM_UNSET(0),
  /**
   * <code>IPKGLDMOFCH_PLATFORM_IOS = 1;</code>
   */
  IPKGLDMOFCH_PLATFORM_IOS(1),
  /**
   * <code>IPKGLDMOFCH_PLATFORM_ANDROID = 2;</code>
   */
  IPKGLDMOFCH_PLATFORM_ANDROID(2),
  /**
   * <code>IPKGLDMOFCH_PLATFORM_OSX = 3;</code>
   */
  IPKGLDMOFCH_PLATFORM_OSX(3),
  /**
   * <code>IPKGLDMOFCH_PLATFORM_WINDOWS = 4;</code>
   */
  IPKGLDMOFCH_PLATFORM_WINDOWS(4),
  /**
   * <code>IPKGLDMOFCH_PLATFORM_APPLE_WATCH = 5;</code>
   */
  IPKGLDMOFCH_PLATFORM_APPLE_WATCH(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IPKGLDMOFCH_PLATFORM_UNSET = 0;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_UNSET_VALUE = 0;
  /**
   * <code>IPKGLDMOFCH_PLATFORM_IOS = 1;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_IOS_VALUE = 1;
  /**
   * <code>IPKGLDMOFCH_PLATFORM_ANDROID = 2;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_ANDROID_VALUE = 2;
  /**
   * <code>IPKGLDMOFCH_PLATFORM_OSX = 3;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_OSX_VALUE = 3;
  /**
   * <code>IPKGLDMOFCH_PLATFORM_WINDOWS = 4;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_WINDOWS_VALUE = 4;
  /**
   * <code>IPKGLDMOFCH_PLATFORM_APPLE_WATCH = 5;</code>
   */
  public static final int IPKGLDMOFCH_PLATFORM_APPLE_WATCH_VALUE = 5;


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
  public static IPKGLDMOFCH valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IPKGLDMOFCH forNumber(int value) {
    switch (value) {
      case 0: return IPKGLDMOFCH_PLATFORM_UNSET;
      case 1: return IPKGLDMOFCH_PLATFORM_IOS;
      case 2: return IPKGLDMOFCH_PLATFORM_ANDROID;
      case 3: return IPKGLDMOFCH_PLATFORM_OSX;
      case 4: return IPKGLDMOFCH_PLATFORM_WINDOWS;
      case 5: return IPKGLDMOFCH_PLATFORM_APPLE_WATCH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IPKGLDMOFCH>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IPKGLDMOFCH> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IPKGLDMOFCH>() {
          public IPKGLDMOFCH findValueByNumber(int number) {
            return IPKGLDMOFCH.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(64);
  }

  private static final IPKGLDMOFCH[] VALUES = values();

  public static IPKGLDMOFCH valueOf(
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

  private IPKGLDMOFCH(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IPKGLDMOFCH)
}

