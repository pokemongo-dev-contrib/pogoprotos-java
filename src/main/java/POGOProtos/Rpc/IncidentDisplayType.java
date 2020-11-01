// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IncidentDisplayType}
 */
public enum IncidentDisplayType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCIDENT_DISPLAY_TYPE_NONE = 0;</code>
   */
  INCIDENT_DISPLAY_TYPE_NONE(0),
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GRUNT = 1;</code>
   */
  INCIDENT_DISPLAY_TYPE_INVASION_GRUNT(1),
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_LEADER = 2;</code>
   */
  INCIDENT_DISPLAY_TYPE_INVASION_LEADER(2),
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GIOVANNI = 3;</code>
   */
  INCIDENT_DISPLAY_TYPE_INVASION_GIOVANNI(3),
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GRUNTB = 4;</code>
   */
  INCIDENT_DISPLAY_TYPE_INVASION_GRUNTB(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCIDENT_DISPLAY_TYPE_NONE = 0;</code>
   */
  public static final int INCIDENT_DISPLAY_TYPE_NONE_VALUE = 0;
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GRUNT = 1;</code>
   */
  public static final int INCIDENT_DISPLAY_TYPE_INVASION_GRUNT_VALUE = 1;
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_LEADER = 2;</code>
   */
  public static final int INCIDENT_DISPLAY_TYPE_INVASION_LEADER_VALUE = 2;
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GIOVANNI = 3;</code>
   */
  public static final int INCIDENT_DISPLAY_TYPE_INVASION_GIOVANNI_VALUE = 3;
  /**
   * <code>INCIDENT_DISPLAY_TYPE_INVASION_GRUNTB = 4;</code>
   */
  public static final int INCIDENT_DISPLAY_TYPE_INVASION_GRUNTB_VALUE = 4;


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
  public static IncidentDisplayType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentDisplayType forNumber(int value) {
    switch (value) {
      case 0: return INCIDENT_DISPLAY_TYPE_NONE;
      case 1: return INCIDENT_DISPLAY_TYPE_INVASION_GRUNT;
      case 2: return INCIDENT_DISPLAY_TYPE_INVASION_LEADER;
      case 3: return INCIDENT_DISPLAY_TYPE_INVASION_GIOVANNI;
      case 4: return INCIDENT_DISPLAY_TYPE_INVASION_GRUNTB;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentDisplayType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentDisplayType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentDisplayType>() {
          public IncidentDisplayType findValueByNumber(int number) {
            return IncidentDisplayType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(64);
  }

  private static final IncidentDisplayType[] VALUES = values();

  public static IncidentDisplayType valueOf(
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

  private IncidentDisplayType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IncidentDisplayType)
}

