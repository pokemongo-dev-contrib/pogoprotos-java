// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IPEMDCKCBAE
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.IPEMDCKCBAE}
 */
public enum IPEMDCKCBAE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_UNSET(0),
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_0(1),
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_1(2),
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_2(3),
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_3(4),
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  IPEMDCKCBAE_FRIENDSHIP_LEVEL_4(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_UNSET_VALUE = 0;
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_0_VALUE = 1;
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_1_VALUE = 2;
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_2_VALUE = 3;
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_3_VALUE = 4;
  /**
   * <code>IPEMDCKCBAE_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  public static final int IPEMDCKCBAE_FRIENDSHIP_LEVEL_4_VALUE = 5;


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
  public static IPEMDCKCBAE valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IPEMDCKCBAE forNumber(int value) {
    switch (value) {
      case 0: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_UNSET;
      case 1: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_0;
      case 2: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_1;
      case 3: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_2;
      case 4: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_3;
      case 5: return IPEMDCKCBAE_FRIENDSHIP_LEVEL_4;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IPEMDCKCBAE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IPEMDCKCBAE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IPEMDCKCBAE>() {
          public IPEMDCKCBAE findValueByNumber(int number) {
            return IPEMDCKCBAE.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(63);
  }

  private static final IPEMDCKCBAE[] VALUES = values();

  public static IPEMDCKCBAE valueOf(
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

  private IPEMDCKCBAE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IPEMDCKCBAE)
}

