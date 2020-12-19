// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.UpdateType}
 */
public enum UpdateType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UPDATE_TYPE_ADD = 0;</code>
   */
  UPDATE_TYPE_ADD(0),
  /**
   * <code>UPDATE_TYPE_MODIFY = 1;</code>
   */
  UPDATE_TYPE_MODIFY(1),
  /**
   * <code>UPDATE_TYPE_REMOVE = 2;</code>
   */
  UPDATE_TYPE_REMOVE(2),
  /**
   * <code>UPDATE_TYPE_PREDICTED_MODIFY = 3;</code>
   */
  UPDATE_TYPE_PREDICTED_MODIFY(3),
  /**
   * <code>UPDATE_TYPE_PREDICTED_REMOVE = 4;</code>
   */
  UPDATE_TYPE_PREDICTED_REMOVE(4),
  /**
   * <code>UPDATE_TYPE_ROLLED_BACK_MODIFY = 5;</code>
   */
  UPDATE_TYPE_ROLLED_BACK_MODIFY(5),
  /**
   * <code>UPDATE_TYPE_ROLLED_BACK_REMOVE = 6;</code>
   */
  UPDATE_TYPE_ROLLED_BACK_REMOVE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UPDATE_TYPE_ADD = 0;</code>
   */
  public static final int UPDATE_TYPE_ADD_VALUE = 0;
  /**
   * <code>UPDATE_TYPE_MODIFY = 1;</code>
   */
  public static final int UPDATE_TYPE_MODIFY_VALUE = 1;
  /**
   * <code>UPDATE_TYPE_REMOVE = 2;</code>
   */
  public static final int UPDATE_TYPE_REMOVE_VALUE = 2;
  /**
   * <code>UPDATE_TYPE_PREDICTED_MODIFY = 3;</code>
   */
  public static final int UPDATE_TYPE_PREDICTED_MODIFY_VALUE = 3;
  /**
   * <code>UPDATE_TYPE_PREDICTED_REMOVE = 4;</code>
   */
  public static final int UPDATE_TYPE_PREDICTED_REMOVE_VALUE = 4;
  /**
   * <code>UPDATE_TYPE_ROLLED_BACK_MODIFY = 5;</code>
   */
  public static final int UPDATE_TYPE_ROLLED_BACK_MODIFY_VALUE = 5;
  /**
   * <code>UPDATE_TYPE_ROLLED_BACK_REMOVE = 6;</code>
   */
  public static final int UPDATE_TYPE_ROLLED_BACK_REMOVE_VALUE = 6;


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
  public static UpdateType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UpdateType forNumber(int value) {
    switch (value) {
      case 0: return UPDATE_TYPE_ADD;
      case 1: return UPDATE_TYPE_MODIFY;
      case 2: return UPDATE_TYPE_REMOVE;
      case 3: return UPDATE_TYPE_PREDICTED_MODIFY;
      case 4: return UPDATE_TYPE_PREDICTED_REMOVE;
      case 5: return UPDATE_TYPE_ROLLED_BACK_MODIFY;
      case 6: return UPDATE_TYPE_ROLLED_BACK_REMOVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UpdateType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UpdateType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UpdateType>() {
          public UpdateType findValueByNumber(int number) {
            return UpdateType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(143);
  }

  private static final UpdateType[] VALUES = values();

  public static UpdateType valueOf(
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

  private UpdateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.UpdateType)
}

