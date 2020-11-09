// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.FeatureType}
 */
public enum FeatureType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEATURE_TYPE_UNSET = 0;</code>
   */
  FEATURE_TYPE_UNSET(0),
  /**
   * <code>FEATURE_TYPE_ONLINE_STATUS = 1;</code>
   */
  FEATURE_TYPE_ONLINE_STATUS(1),
  /**
   * <code>FEATURE_TYPE_NIANTIC_PROFILE = 2;</code>
   */
  FEATURE_TYPE_NIANTIC_PROFILE(2),
  /**
   * <code>FEATURE_TYPE_FRIENDS_LIST = 3;</code>
   */
  FEATURE_TYPE_FRIENDS_LIST(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FEATURE_TYPE_UNSET = 0;</code>
   */
  public static final int FEATURE_TYPE_UNSET_VALUE = 0;
  /**
   * <code>FEATURE_TYPE_ONLINE_STATUS = 1;</code>
   */
  public static final int FEATURE_TYPE_ONLINE_STATUS_VALUE = 1;
  /**
   * <code>FEATURE_TYPE_NIANTIC_PROFILE = 2;</code>
   */
  public static final int FEATURE_TYPE_NIANTIC_PROFILE_VALUE = 2;
  /**
   * <code>FEATURE_TYPE_FRIENDS_LIST = 3;</code>
   */
  public static final int FEATURE_TYPE_FRIENDS_LIST_VALUE = 3;


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
  public static FeatureType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FeatureType forNumber(int value) {
    switch (value) {
      case 0: return FEATURE_TYPE_UNSET;
      case 1: return FEATURE_TYPE_ONLINE_STATUS;
      case 2: return FEATURE_TYPE_NIANTIC_PROFILE;
      case 3: return FEATURE_TYPE_FRIENDS_LIST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FeatureType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FeatureType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FeatureType>() {
          public FeatureType findValueByNumber(int number) {
            return FeatureType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(41);
  }

  private static final FeatureType[] VALUES = values();

  public static FeatureType valueOf(
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

  private FeatureType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FeatureType)
}

