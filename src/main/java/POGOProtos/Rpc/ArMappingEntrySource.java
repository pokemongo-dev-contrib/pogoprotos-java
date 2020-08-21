// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 *----- Begin analytics -----
 * ref: Niantic.Titan.Core.Analytics.ArMappingEntrySource
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.ArMappingEntrySource}
 */
public enum ArMappingEntrySource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_MENU = 0;</code>
   */
  ARMAPPINGENTRYSOURCE_EDIT_MENU(0),
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_TITLE = 1;</code>
   */
  ARMAPPINGENTRYSOURCE_EDIT_TITLE(1),
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_DESCRIPTION = 2;</code>
   */
  ARMAPPINGENTRYSOURCE_EDIT_DESCRIPTION(2),
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_PHOTO = 3;</code>
   */
  ARMAPPINGENTRYSOURCE_EDIT_PHOTO(3),
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_LOCATION = 4;</code>
   */
  ARMAPPINGENTRYSOURCE_EDIT_LOCATION(4),
  /**
   * <code>ARMAPPINGENTRYSOURCE_POI_SUBMISSION = 5;</code>
   */
  ARMAPPINGENTRYSOURCE_POI_SUBMISSION(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_MENU = 0;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_EDIT_MENU_VALUE = 0;
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_TITLE = 1;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_EDIT_TITLE_VALUE = 1;
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_DESCRIPTION = 2;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_EDIT_DESCRIPTION_VALUE = 2;
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_PHOTO = 3;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_EDIT_PHOTO_VALUE = 3;
  /**
   * <code>ARMAPPINGENTRYSOURCE_EDIT_LOCATION = 4;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_EDIT_LOCATION_VALUE = 4;
  /**
   * <code>ARMAPPINGENTRYSOURCE_POI_SUBMISSION = 5;</code>
   */
  public static final int ARMAPPINGENTRYSOURCE_POI_SUBMISSION_VALUE = 5;


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
  public static ArMappingEntrySource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ArMappingEntrySource forNumber(int value) {
    switch (value) {
      case 0: return ARMAPPINGENTRYSOURCE_EDIT_MENU;
      case 1: return ARMAPPINGENTRYSOURCE_EDIT_TITLE;
      case 2: return ARMAPPINGENTRYSOURCE_EDIT_DESCRIPTION;
      case 3: return ARMAPPINGENTRYSOURCE_EDIT_PHOTO;
      case 4: return ARMAPPINGENTRYSOURCE_EDIT_LOCATION;
      case 5: return ARMAPPINGENTRYSOURCE_POI_SUBMISSION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ArMappingEntrySource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ArMappingEntrySource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ArMappingEntrySource>() {
          public ArMappingEntrySource findValueByNumber(int number) {
            return ArMappingEntrySource.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(0);
  }

  private static final ArMappingEntrySource[] VALUES = values();

  public static ArMappingEntrySource valueOf(
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

  private ArMappingEntrySource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ArMappingEntrySource)
}

