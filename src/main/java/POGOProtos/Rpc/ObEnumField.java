// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.ObEnumField}
 */
public enum ObEnumField
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OB_ENUM_FIELD_NONE = 0;</code>
   */
  OB_ENUM_FIELD_NONE(0),
  /**
   * <code>OB_ENUM_FIELD_BRONZE = 1;</code>
   */
  OB_ENUM_FIELD_BRONZE(1),
  /**
   * <code>OB_ENUM_FIELD_SILVER = 2;</code>
   */
  OB_ENUM_FIELD_SILVER(2),
  /**
   * <code>OB_ENUM_FIELD_GOLD = 3;</code>
   */
  OB_ENUM_FIELD_GOLD(3),
  /**
   * <code>OB_ENUM_FIELD_PLATINUM = 4;</code>
   */
  OB_ENUM_FIELD_PLATINUM(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OB_ENUM_FIELD_NONE = 0;</code>
   */
  public static final int OB_ENUM_FIELD_NONE_VALUE = 0;
  /**
   * <code>OB_ENUM_FIELD_BRONZE = 1;</code>
   */
  public static final int OB_ENUM_FIELD_BRONZE_VALUE = 1;
  /**
   * <code>OB_ENUM_FIELD_SILVER = 2;</code>
   */
  public static final int OB_ENUM_FIELD_SILVER_VALUE = 2;
  /**
   * <code>OB_ENUM_FIELD_GOLD = 3;</code>
   */
  public static final int OB_ENUM_FIELD_GOLD_VALUE = 3;
  /**
   * <code>OB_ENUM_FIELD_PLATINUM = 4;</code>
   */
  public static final int OB_ENUM_FIELD_PLATINUM_VALUE = 4;


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
  public static ObEnumField valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ObEnumField forNumber(int value) {
    switch (value) {
      case 0: return OB_ENUM_FIELD_NONE;
      case 1: return OB_ENUM_FIELD_BRONZE;
      case 2: return OB_ENUM_FIELD_SILVER;
      case 3: return OB_ENUM_FIELD_GOLD;
      case 4: return OB_ENUM_FIELD_PLATINUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ObEnumField>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ObEnumField> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ObEnumField>() {
          public ObEnumField findValueByNumber(int number) {
            return ObEnumField.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(86);
  }

  private static final ObEnumField[] VALUES = values();

  public static ObEnumField valueOf(
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

  private ObEnumField(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ObEnumField)
}

