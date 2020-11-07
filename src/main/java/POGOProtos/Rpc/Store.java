// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.Store}
 */
public enum Store
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STORE_STORE_UNSET = 0;</code>
   */
  STORE_STORE_UNSET(0),
  /**
   * <code>STORE_STORE_APPLE = 1;</code>
   */
  STORE_STORE_APPLE(1),
  /**
   * <code>STORE_STORE_GOOGLE = 2;</code>
   */
  STORE_STORE_GOOGLE(2),
  /**
   * <code>STORE_STORE_SAMSUNG = 3;</code>
   */
  STORE_STORE_SAMSUNG(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STORE_STORE_UNSET = 0;</code>
   */
  public static final int STORE_STORE_UNSET_VALUE = 0;
  /**
   * <code>STORE_STORE_APPLE = 1;</code>
   */
  public static final int STORE_STORE_APPLE_VALUE = 1;
  /**
   * <code>STORE_STORE_GOOGLE = 2;</code>
   */
  public static final int STORE_STORE_GOOGLE_VALUE = 2;
  /**
   * <code>STORE_STORE_SAMSUNG = 3;</code>
   */
  public static final int STORE_STORE_SAMSUNG_VALUE = 3;


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
  public static Store valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Store forNumber(int value) {
    switch (value) {
      case 0: return STORE_STORE_UNSET;
      case 1: return STORE_STORE_APPLE;
      case 2: return STORE_STORE_GOOGLE;
      case 3: return STORE_STORE_SAMSUNG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Store>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Store> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Store>() {
          public Store findValueByNumber(int number) {
            return Store.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(135);
  }

  private static final Store[] VALUES = values();

  public static Store valueOf(
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

  private Store(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.Store)
}

