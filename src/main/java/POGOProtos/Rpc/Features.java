// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.Features}
 */
public enum Features
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FEATURES_MONODEPTH = 0;</code>
   */
  FEATURES_MONODEPTH(0),
  /**
   * <code>FEATURES_DBOW = 1;</code>
   */
  FEATURES_DBOW(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FEATURES_MONODEPTH = 0;</code>
   */
  public static final int FEATURES_MONODEPTH_VALUE = 0;
  /**
   * <code>FEATURES_DBOW = 1;</code>
   */
  public static final int FEATURES_DBOW_VALUE = 1;


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
  public static Features valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Features forNumber(int value) {
    switch (value) {
      case 0: return FEATURES_MONODEPTH;
      case 1: return FEATURES_DBOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Features>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Features> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Features>() {
          public Features findValueByNumber(int number) {
            return Features.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(12);
  }

  private static final Features[] VALUES = values();

  public static Features valueOf(
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

  private Features(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.Features)
}
