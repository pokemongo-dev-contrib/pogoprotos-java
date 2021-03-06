// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PoiEditImageEntrySource}
 */
public enum PoiEditImageEntrySource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_EDIT_MENU = 0;</code>
   */
  POI_EDIT_IMAGE_ENTRY_SOURCE_EDIT_MENU(0),
  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_IMAGE_GALLERY = 1;</code>
   */
  POI_EDIT_IMAGE_ENTRY_SOURCE_IMAGE_GALLERY(1),
  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_OTHER = 2;</code>
   */
  POI_EDIT_IMAGE_ENTRY_SOURCE_OTHER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_EDIT_MENU = 0;</code>
   */
  public static final int POI_EDIT_IMAGE_ENTRY_SOURCE_EDIT_MENU_VALUE = 0;
  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_IMAGE_GALLERY = 1;</code>
   */
  public static final int POI_EDIT_IMAGE_ENTRY_SOURCE_IMAGE_GALLERY_VALUE = 1;
  /**
   * <code>POI_EDIT_IMAGE_ENTRY_SOURCE_OTHER = 2;</code>
   */
  public static final int POI_EDIT_IMAGE_ENTRY_SOURCE_OTHER_VALUE = 2;


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
  public static PoiEditImageEntrySource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoiEditImageEntrySource forNumber(int value) {
    switch (value) {
      case 0: return POI_EDIT_IMAGE_ENTRY_SOURCE_EDIT_MENU;
      case 1: return POI_EDIT_IMAGE_ENTRY_SOURCE_IMAGE_GALLERY;
      case 2: return POI_EDIT_IMAGE_ENTRY_SOURCE_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoiEditImageEntrySource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoiEditImageEntrySource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoiEditImageEntrySource>() {
          public PoiEditImageEntrySource findValueByNumber(int number) {
            return PoiEditImageEntrySource.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(108);
  }

  private static final PoiEditImageEntrySource[] VALUES = values();

  public static PoiEditImageEntrySource valueOf(
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

  private PoiEditImageEntrySource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PoiEditImageEntrySource)
}

