// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IncubatorSelectionResult}
 */
public enum IncubatorSelectionResult
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCUBATOR_SELECTION_RESULT_SELECTED = 0;</code>
   */
  INCUBATOR_SELECTION_RESULT_SELECTED(0),
  /**
   * <code>INCUBATOR_SELECTION_RESULT_EXIT = 1;</code>
   */
  INCUBATOR_SELECTION_RESULT_EXIT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCUBATOR_SELECTION_RESULT_SELECTED = 0;</code>
   */
  public static final int INCUBATOR_SELECTION_RESULT_SELECTED_VALUE = 0;
  /**
   * <code>INCUBATOR_SELECTION_RESULT_EXIT = 1;</code>
   */
  public static final int INCUBATOR_SELECTION_RESULT_EXIT_VALUE = 1;


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
  public static IncubatorSelectionResult valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncubatorSelectionResult forNumber(int value) {
    switch (value) {
      case 0: return INCUBATOR_SELECTION_RESULT_SELECTED;
      case 1: return INCUBATOR_SELECTION_RESULT_EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncubatorSelectionResult>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncubatorSelectionResult> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncubatorSelectionResult>() {
          public IncubatorSelectionResult findValueByNumber(int number) {
            return IncubatorSelectionResult.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(70);
  }

  private static final IncubatorSelectionResult[] VALUES = values();

  public static IncubatorSelectionResult valueOf(
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

  private IncubatorSelectionResult(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IncubatorSelectionResult)
}

