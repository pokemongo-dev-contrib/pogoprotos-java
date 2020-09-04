// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IEOFEIODMII
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.IEOFEIODMII}
 */
public enum IEOFEIODMII
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IEOFEIODMII_UNDEFINED_ASSET_EVENT = 0;</code>
   */
  IEOFEIODMII_UNDEFINED_ASSET_EVENT(0),
  /**
   * <code>IEOFEIODMII_DOWNLOAD_START = 1;</code>
   */
  IEOFEIODMII_DOWNLOAD_START(1),
  /**
   * <code>IEOFEIODMII_DOWNLOAD_FINISHED = 2;</code>
   */
  IEOFEIODMII_DOWNLOAD_FINISHED(2),
  /**
   * <code>IEOFEIODMII_DOWNLOAD_FAILED = 3;</code>
   */
  IEOFEIODMII_DOWNLOAD_FAILED(3),
  /**
   * <code>IEOFEIODMII_ASSET_RETRIEVED_FROM_CACHE = 4;</code>
   */
  IEOFEIODMII_ASSET_RETRIEVED_FROM_CACHE(4),
  /**
   * <code>IEOFEIODMII_CACHE_THRASH = 5;</code>
   */
  IEOFEIODMII_CACHE_THRASH(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IEOFEIODMII_UNDEFINED_ASSET_EVENT = 0;</code>
   */
  public static final int IEOFEIODMII_UNDEFINED_ASSET_EVENT_VALUE = 0;
  /**
   * <code>IEOFEIODMII_DOWNLOAD_START = 1;</code>
   */
  public static final int IEOFEIODMII_DOWNLOAD_START_VALUE = 1;
  /**
   * <code>IEOFEIODMII_DOWNLOAD_FINISHED = 2;</code>
   */
  public static final int IEOFEIODMII_DOWNLOAD_FINISHED_VALUE = 2;
  /**
   * <code>IEOFEIODMII_DOWNLOAD_FAILED = 3;</code>
   */
  public static final int IEOFEIODMII_DOWNLOAD_FAILED_VALUE = 3;
  /**
   * <code>IEOFEIODMII_ASSET_RETRIEVED_FROM_CACHE = 4;</code>
   */
  public static final int IEOFEIODMII_ASSET_RETRIEVED_FROM_CACHE_VALUE = 4;
  /**
   * <code>IEOFEIODMII_CACHE_THRASH = 5;</code>
   */
  public static final int IEOFEIODMII_CACHE_THRASH_VALUE = 5;


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
  public static IEOFEIODMII valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IEOFEIODMII forNumber(int value) {
    switch (value) {
      case 0: return IEOFEIODMII_UNDEFINED_ASSET_EVENT;
      case 1: return IEOFEIODMII_DOWNLOAD_START;
      case 2: return IEOFEIODMII_DOWNLOAD_FINISHED;
      case 3: return IEOFEIODMII_DOWNLOAD_FAILED;
      case 4: return IEOFEIODMII_ASSET_RETRIEVED_FROM_CACHE;
      case 5: return IEOFEIODMII_CACHE_THRASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IEOFEIODMII>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IEOFEIODMII> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IEOFEIODMII>() {
          public IEOFEIODMII findValueByNumber(int number) {
            return IEOFEIODMII.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(76);
  }

  private static final IEOFEIODMII[] VALUES = values();

  public static IEOFEIODMII valueOf(
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

  private IEOFEIODMII(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IEOFEIODMII)
}

