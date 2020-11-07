// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.RemoteRaidJoinSource}
 */
public enum RemoteRaidJoinSource
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_UNDEFINED_REMOTE_RAID_JOIN_SOURCE = 0;</code>
   */
  REMOTE_RAID_JOIN_SOURCE_UNDEFINED_REMOTE_RAID_JOIN_SOURCE(0),
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_USED_MAP = 1;</code>
   */
  REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_USED_MAP(1),
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_NEARBY_GUI = 2;</code>
   */
  REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_NEARBY_GUI(2),
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_INVITED_BY_FRIEND = 3;</code>
   */
  REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_INVITED_BY_FRIEND(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_UNDEFINED_REMOTE_RAID_JOIN_SOURCE = 0;</code>
   */
  public static final int REMOTE_RAID_JOIN_SOURCE_UNDEFINED_REMOTE_RAID_JOIN_SOURCE_VALUE = 0;
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_USED_MAP = 1;</code>
   */
  public static final int REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_USED_MAP_VALUE = 1;
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_NEARBY_GUI = 2;</code>
   */
  public static final int REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_NEARBY_GUI_VALUE = 2;
  /**
   * <code>REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_INVITED_BY_FRIEND = 3;</code>
   */
  public static final int REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_INVITED_BY_FRIEND_VALUE = 3;


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
  public static RemoteRaidJoinSource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RemoteRaidJoinSource forNumber(int value) {
    switch (value) {
      case 0: return REMOTE_RAID_JOIN_SOURCE_UNDEFINED_REMOTE_RAID_JOIN_SOURCE;
      case 1: return REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_USED_MAP;
      case 2: return REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_NEARBY_GUI;
      case 3: return REMOTE_RAID_JOIN_SOURCE_REMOTE_RAID_INVITED_BY_FRIEND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RemoteRaidJoinSource>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RemoteRaidJoinSource> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RemoteRaidJoinSource>() {
          public RemoteRaidJoinSource findValueByNumber(int number) {
            return RemoteRaidJoinSource.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(123);
  }

  private static final RemoteRaidJoinSource[] VALUES = values();

  public static RemoteRaidJoinSource valueOf(
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

  private RemoteRaidJoinSource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RemoteRaidJoinSource)
}

