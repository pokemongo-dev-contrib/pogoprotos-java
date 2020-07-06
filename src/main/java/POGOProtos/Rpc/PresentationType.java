// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PresentationType}
 */
public enum PresentationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PRESENTATION_TYPE_UNKNOWN = 0;</code>
   */
  PRESENTATION_TYPE_UNKNOWN(0),
  /**
   * <code>PRESENTATION_TYPE_CATEGORY = 1;</code>
   */
  PRESENTATION_TYPE_CATEGORY(1),
  /**
   * <code>PRESENTATION_TYPE_SORT = 2;</code>
   */
  PRESENTATION_TYPE_SORT(2),
  /**
   * <code>PRESENTATION_TYPE_SALE = 3;</code>
   */
  PRESENTATION_TYPE_SALE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PRESENTATION_TYPE_UNKNOWN = 0;</code>
   */
  public static final int PRESENTATION_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>PRESENTATION_TYPE_CATEGORY = 1;</code>
   */
  public static final int PRESENTATION_TYPE_CATEGORY_VALUE = 1;
  /**
   * <code>PRESENTATION_TYPE_SORT = 2;</code>
   */
  public static final int PRESENTATION_TYPE_SORT_VALUE = 2;
  /**
   * <code>PRESENTATION_TYPE_SALE = 3;</code>
   */
  public static final int PRESENTATION_TYPE_SALE_VALUE = 3;


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
  public static PresentationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PresentationType forNumber(int value) {
    switch (value) {
      case 0: return PRESENTATION_TYPE_UNKNOWN;
      case 1: return PRESENTATION_TYPE_CATEGORY;
      case 2: return PRESENTATION_TYPE_SORT;
      case 3: return PRESENTATION_TYPE_SALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PresentationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PresentationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PresentationType>() {
          public PresentationType findValueByNumber(int number) {
            return PresentationType.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(113);
  }

  private static final PresentationType[] VALUES = values();

  public static PresentationType valueOf(
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

  private PresentationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PresentationType)
}
