// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BattleHubSubsection}
 */
public enum BattleHubSubsection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUBSECTION_UNSET = 0;</code>
   */
  SUBSECTION_UNSET(0),
  /**
   * <code>SUBSECTION_VS_CHARGING = 1;</code>
   */
  SUBSECTION_VS_CHARGING(1),
  /**
   * <code>SUBSECTION_VS_FREE = 2;</code>
   */
  SUBSECTION_VS_FREE(2),
  /**
   * <code>SUBSECTION_VS_PREMIUM = 3;</code>
   */
  SUBSECTION_VS_PREMIUM(3),
  /**
   * <code>SUBSECTION_NEARBY_TEAM_LEADERS = 4;</code>
   */
  SUBSECTION_NEARBY_TEAM_LEADERS(4),
  /**
   * <code>SUBSECTION_NEARBY_QR_CODE = 5;</code>
   */
  SUBSECTION_NEARBY_QR_CODE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUBSECTION_UNSET = 0;</code>
   */
  public static final int SUBSECTION_UNSET_VALUE = 0;
  /**
   * <code>SUBSECTION_VS_CHARGING = 1;</code>
   */
  public static final int SUBSECTION_VS_CHARGING_VALUE = 1;
  /**
   * <code>SUBSECTION_VS_FREE = 2;</code>
   */
  public static final int SUBSECTION_VS_FREE_VALUE = 2;
  /**
   * <code>SUBSECTION_VS_PREMIUM = 3;</code>
   */
  public static final int SUBSECTION_VS_PREMIUM_VALUE = 3;
  /**
   * <code>SUBSECTION_NEARBY_TEAM_LEADERS = 4;</code>
   */
  public static final int SUBSECTION_NEARBY_TEAM_LEADERS_VALUE = 4;
  /**
   * <code>SUBSECTION_NEARBY_QR_CODE = 5;</code>
   */
  public static final int SUBSECTION_NEARBY_QR_CODE_VALUE = 5;


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
  public static BattleHubSubsection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattleHubSubsection forNumber(int value) {
    switch (value) {
      case 0: return SUBSECTION_UNSET;
      case 1: return SUBSECTION_VS_CHARGING;
      case 2: return SUBSECTION_VS_FREE;
      case 3: return SUBSECTION_VS_PREMIUM;
      case 4: return SUBSECTION_NEARBY_TEAM_LEADERS;
      case 5: return SUBSECTION_NEARBY_QR_CODE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattleHubSubsection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattleHubSubsection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattleHubSubsection>() {
          public BattleHubSubsection findValueByNumber(int number) {
            return BattleHubSubsection.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(17);
  }

  private static final BattleHubSubsection[] VALUES = values();

  public static BattleHubSubsection valueOf(
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

  private BattleHubSubsection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BattleHubSubsection)
}

