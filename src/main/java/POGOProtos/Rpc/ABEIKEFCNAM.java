// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ABEIKEFCNAM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ABEIKEFCNAM}
 */
public final class ABEIKEFCNAM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ABEIKEFCNAM)
    ABEIKEFCNAMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ABEIKEFCNAM.newBuilder() to construct.
  private ABEIKEFCNAM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ABEIKEFCNAM() {
    magjbjmclno_ = 0;
    pecdpnhkfhe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ABEIKEFCNAM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ABEIKEFCNAM(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            magjbjmclno_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.BGOABGLKOGN.Builder subBuilder = null;
            if (ofaneehdcfm_ != null) {
              subBuilder = ofaneehdcfm_.toBuilder();
            }
            ofaneehdcfm_ = input.readMessage(POGOProtos.Rpc.BGOABGLKOGN.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ofaneehdcfm_);
              ofaneehdcfm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.BLJJMNEFDMO.Builder subBuilder = null;
            if (honboaphadh_ != null) {
              subBuilder = honboaphadh_.toBuilder();
            }
            honboaphadh_ = input.readMessage(POGOProtos.Rpc.BLJJMNEFDMO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(honboaphadh_);
              honboaphadh_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            pecdpnhkfhe_ = rawValue;
            break;
          }
          case 40: {

            hindokpjfpg_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEIKEFCNAM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEIKEFCNAM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ABEIKEFCNAM.class, POGOProtos.Rpc.ABEIKEFCNAM.Builder.class);
  }

  /**
   * <pre>
   * ref: ABEIKEFCNAM/CGPEMKHIGEE/IFCALIBNBMI
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI}
   */
  public enum IFCALIBNBMI
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INCENSE_ENCOUNTER_UNKNOWN = 0;</code>
     */
    INCENSE_ENCOUNTER_UNKNOWN(0),
    /**
     * <code>INCENSE_ENCOUNTER_SUCCESS = 1;</code>
     */
    INCENSE_ENCOUNTER_SUCCESS(1),
    /**
     * <code>INCENSE_ENCOUNTER_NOT_AVAILABLE = 2;</code>
     */
    INCENSE_ENCOUNTER_NOT_AVAILABLE(2),
    /**
     * <code>POKEMON_INVENTORY_FULL = 3;</code>
     */
    POKEMON_INVENTORY_FULL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INCENSE_ENCOUNTER_UNKNOWN = 0;</code>
     */
    public static final int INCENSE_ENCOUNTER_UNKNOWN_VALUE = 0;
    /**
     * <code>INCENSE_ENCOUNTER_SUCCESS = 1;</code>
     */
    public static final int INCENSE_ENCOUNTER_SUCCESS_VALUE = 1;
    /**
     * <code>INCENSE_ENCOUNTER_NOT_AVAILABLE = 2;</code>
     */
    public static final int INCENSE_ENCOUNTER_NOT_AVAILABLE_VALUE = 2;
    /**
     * <code>POKEMON_INVENTORY_FULL = 3;</code>
     */
    public static final int POKEMON_INVENTORY_FULL_VALUE = 3;


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
    public static IFCALIBNBMI valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IFCALIBNBMI forNumber(int value) {
      switch (value) {
        case 0: return INCENSE_ENCOUNTER_UNKNOWN;
        case 1: return INCENSE_ENCOUNTER_SUCCESS;
        case 2: return INCENSE_ENCOUNTER_NOT_AVAILABLE;
        case 3: return POKEMON_INVENTORY_FULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IFCALIBNBMI>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IFCALIBNBMI> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IFCALIBNBMI>() {
            public IFCALIBNBMI findValueByNumber(int number) {
              return IFCALIBNBMI.forNumber(number);
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
      return POGOProtos.Rpc.ABEIKEFCNAM.getDescriptor().getEnumTypes().get(0);
    }

    private static final IFCALIBNBMI[] VALUES = values();

    public static IFCALIBNBMI valueOf(
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

    private IFCALIBNBMI(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI result = POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.UNRECOGNIZED : result;
  }

  public static final int OFANEEHDCFM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm_;
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
   * @return Whether the ofaneehdcfm field is set.
   */
  @java.lang.Override
  public boolean hasOfaneehdcfm() {
    return ofaneehdcfm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
   * @return The ofaneehdcfm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGOABGLKOGN getOfaneehdcfm() {
    return ofaneehdcfm_ == null ? POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : ofaneehdcfm_;
  }
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGOABGLKOGNOrBuilder getOfaneehdcfmOrBuilder() {
    return getOfaneehdcfm();
  }

  public static final int HONBOAPHADH_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.BLJJMNEFDMO honboaphadh_;
  /**
   * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
   * @return Whether the honboaphadh field is set.
   */
  @java.lang.Override
  public boolean hasHonboaphadh() {
    return honboaphadh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
   * @return The honboaphadh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BLJJMNEFDMO getHonboaphadh() {
    return honboaphadh_ == null ? POGOProtos.Rpc.BLJJMNEFDMO.getDefaultInstance() : honboaphadh_;
  }
  /**
   * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BLJJMNEFDMOOrBuilder getHonboaphadhOrBuilder() {
    return getHonboaphadh();
  }

  public static final int PECDPNHKFHE_FIELD_NUMBER = 4;
  private int pecdpnhkfhe_;
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
   * @return The enum numeric value on the wire for pecdpnhkfhe.
   */
  @java.lang.Override public int getPecdpnhkfheValue() {
    return pecdpnhkfhe_;
  }
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
   * @return The pecdpnhkfhe.
   */
  @java.lang.Override public POGOProtos.Rpc.MAGDEIICLAK getPecdpnhkfhe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(pecdpnhkfhe_);
    return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
  }

  public static final int HINDOKPJFPG_FIELD_NUMBER = 5;
  private int hindokpjfpg_;
  /**
   * <code>int32 hindokpjfpg = 5;</code>
   * @return The hindokpjfpg.
   */
  @java.lang.Override
  public int getHindokpjfpg() {
    return hindokpjfpg_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (magjbjmclno_ != POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.INCENSE_ENCOUNTER_UNKNOWN.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (ofaneehdcfm_ != null) {
      output.writeMessage(2, getOfaneehdcfm());
    }
    if (honboaphadh_ != null) {
      output.writeMessage(3, getHonboaphadh());
    }
    if (pecdpnhkfhe_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(4, pecdpnhkfhe_);
    }
    if (hindokpjfpg_ != 0) {
      output.writeInt32(5, hindokpjfpg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.INCENSE_ENCOUNTER_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (ofaneehdcfm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOfaneehdcfm());
    }
    if (honboaphadh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getHonboaphadh());
    }
    if (pecdpnhkfhe_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, pecdpnhkfhe_);
    }
    if (hindokpjfpg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, hindokpjfpg_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.ABEIKEFCNAM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ABEIKEFCNAM other = (POGOProtos.Rpc.ABEIKEFCNAM) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasOfaneehdcfm() != other.hasOfaneehdcfm()) return false;
    if (hasOfaneehdcfm()) {
      if (!getOfaneehdcfm()
          .equals(other.getOfaneehdcfm())) return false;
    }
    if (hasHonboaphadh() != other.hasHonboaphadh()) return false;
    if (hasHonboaphadh()) {
      if (!getHonboaphadh()
          .equals(other.getHonboaphadh())) return false;
    }
    if (pecdpnhkfhe_ != other.pecdpnhkfhe_) return false;
    if (getHindokpjfpg()
        != other.getHindokpjfpg()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    if (hasOfaneehdcfm()) {
      hash = (37 * hash) + OFANEEHDCFM_FIELD_NUMBER;
      hash = (53 * hash) + getOfaneehdcfm().hashCode();
    }
    if (hasHonboaphadh()) {
      hash = (37 * hash) + HONBOAPHADH_FIELD_NUMBER;
      hash = (53 * hash) + getHonboaphadh().hashCode();
    }
    hash = (37 * hash) + PECDPNHKFHE_FIELD_NUMBER;
    hash = (53 * hash) + pecdpnhkfhe_;
    hash = (37 * hash) + HINDOKPJFPG_FIELD_NUMBER;
    hash = (53 * hash) + getHindokpjfpg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEIKEFCNAM parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(POGOProtos.Rpc.ABEIKEFCNAM prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * ref: ABEIKEFCNAM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ABEIKEFCNAM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ABEIKEFCNAM)
      POGOProtos.Rpc.ABEIKEFCNAMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEIKEFCNAM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEIKEFCNAM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ABEIKEFCNAM.class, POGOProtos.Rpc.ABEIKEFCNAM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ABEIKEFCNAM.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      magjbjmclno_ = 0;

      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = null;
      } else {
        ofaneehdcfm_ = null;
        ofaneehdcfmBuilder_ = null;
      }
      if (honboaphadhBuilder_ == null) {
        honboaphadh_ = null;
      } else {
        honboaphadh_ = null;
        honboaphadhBuilder_ = null;
      }
      pecdpnhkfhe_ = 0;

      hindokpjfpg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEIKEFCNAM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEIKEFCNAM getDefaultInstanceForType() {
      return POGOProtos.Rpc.ABEIKEFCNAM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEIKEFCNAM build() {
      POGOProtos.Rpc.ABEIKEFCNAM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEIKEFCNAM buildPartial() {
      POGOProtos.Rpc.ABEIKEFCNAM result = new POGOProtos.Rpc.ABEIKEFCNAM(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (ofaneehdcfmBuilder_ == null) {
        result.ofaneehdcfm_ = ofaneehdcfm_;
      } else {
        result.ofaneehdcfm_ = ofaneehdcfmBuilder_.build();
      }
      if (honboaphadhBuilder_ == null) {
        result.honboaphadh_ = honboaphadh_;
      } else {
        result.honboaphadh_ = honboaphadhBuilder_.build();
      }
      result.pecdpnhkfhe_ = pecdpnhkfhe_;
      result.hindokpjfpg_ = hindokpjfpg_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof POGOProtos.Rpc.ABEIKEFCNAM) {
        return mergeFrom((POGOProtos.Rpc.ABEIKEFCNAM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ABEIKEFCNAM other) {
      if (other == POGOProtos.Rpc.ABEIKEFCNAM.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasOfaneehdcfm()) {
        mergeOfaneehdcfm(other.getOfaneehdcfm());
      }
      if (other.hasHonboaphadh()) {
        mergeHonboaphadh(other.getHonboaphadh());
      }
      if (other.pecdpnhkfhe_ != 0) {
        setPecdpnhkfheValue(other.getPecdpnhkfheValue());
      }
      if (other.getHindokpjfpg() != 0) {
        setHindokpjfpg(other.getHindokpjfpg());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      POGOProtos.Rpc.ABEIKEFCNAM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ABEIKEFCNAM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI result = POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABEIKEFCNAM.IFCALIBNBMI magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder> ofaneehdcfmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     * @return Whether the ofaneehdcfm field is set.
     */
    public boolean hasOfaneehdcfm() {
      return ofaneehdcfmBuilder_ != null || ofaneehdcfm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     * @return The ofaneehdcfm.
     */
    public POGOProtos.Rpc.BGOABGLKOGN getOfaneehdcfm() {
      if (ofaneehdcfmBuilder_ == null) {
        return ofaneehdcfm_ == null ? POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : ofaneehdcfm_;
      } else {
        return ofaneehdcfmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public Builder setOfaneehdcfm(POGOProtos.Rpc.BGOABGLKOGN value) {
      if (ofaneehdcfmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ofaneehdcfm_ = value;
        onChanged();
      } else {
        ofaneehdcfmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public Builder setOfaneehdcfm(
        POGOProtos.Rpc.BGOABGLKOGN.Builder builderForValue) {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = builderForValue.build();
        onChanged();
      } else {
        ofaneehdcfmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public Builder mergeOfaneehdcfm(POGOProtos.Rpc.BGOABGLKOGN value) {
      if (ofaneehdcfmBuilder_ == null) {
        if (ofaneehdcfm_ != null) {
          ofaneehdcfm_ =
            POGOProtos.Rpc.BGOABGLKOGN.newBuilder(ofaneehdcfm_).mergeFrom(value).buildPartial();
        } else {
          ofaneehdcfm_ = value;
        }
        onChanged();
      } else {
        ofaneehdcfmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public Builder clearOfaneehdcfm() {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = null;
        onChanged();
      } else {
        ofaneehdcfm_ = null;
        ofaneehdcfmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public POGOProtos.Rpc.BGOABGLKOGN.Builder getOfaneehdcfmBuilder() {
      
      onChanged();
      return getOfaneehdcfmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    public POGOProtos.Rpc.BGOABGLKOGNOrBuilder getOfaneehdcfmOrBuilder() {
      if (ofaneehdcfmBuilder_ != null) {
        return ofaneehdcfmBuilder_.getMessageOrBuilder();
      } else {
        return ofaneehdcfm_ == null ?
            POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : ofaneehdcfm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN ofaneehdcfm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder> 
        getOfaneehdcfmFieldBuilder() {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder>(
                getOfaneehdcfm(),
                getParentForChildren(),
                isClean());
        ofaneehdcfm_ = null;
      }
      return ofaneehdcfmBuilder_;
    }

    private POGOProtos.Rpc.BLJJMNEFDMO honboaphadh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BLJJMNEFDMO, POGOProtos.Rpc.BLJJMNEFDMO.Builder, POGOProtos.Rpc.BLJJMNEFDMOOrBuilder> honboaphadhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     * @return Whether the honboaphadh field is set.
     */
    public boolean hasHonboaphadh() {
      return honboaphadhBuilder_ != null || honboaphadh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     * @return The honboaphadh.
     */
    public POGOProtos.Rpc.BLJJMNEFDMO getHonboaphadh() {
      if (honboaphadhBuilder_ == null) {
        return honboaphadh_ == null ? POGOProtos.Rpc.BLJJMNEFDMO.getDefaultInstance() : honboaphadh_;
      } else {
        return honboaphadhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public Builder setHonboaphadh(POGOProtos.Rpc.BLJJMNEFDMO value) {
      if (honboaphadhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        honboaphadh_ = value;
        onChanged();
      } else {
        honboaphadhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public Builder setHonboaphadh(
        POGOProtos.Rpc.BLJJMNEFDMO.Builder builderForValue) {
      if (honboaphadhBuilder_ == null) {
        honboaphadh_ = builderForValue.build();
        onChanged();
      } else {
        honboaphadhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public Builder mergeHonboaphadh(POGOProtos.Rpc.BLJJMNEFDMO value) {
      if (honboaphadhBuilder_ == null) {
        if (honboaphadh_ != null) {
          honboaphadh_ =
            POGOProtos.Rpc.BLJJMNEFDMO.newBuilder(honboaphadh_).mergeFrom(value).buildPartial();
        } else {
          honboaphadh_ = value;
        }
        onChanged();
      } else {
        honboaphadhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public Builder clearHonboaphadh() {
      if (honboaphadhBuilder_ == null) {
        honboaphadh_ = null;
        onChanged();
      } else {
        honboaphadh_ = null;
        honboaphadhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public POGOProtos.Rpc.BLJJMNEFDMO.Builder getHonboaphadhBuilder() {
      
      onChanged();
      return getHonboaphadhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    public POGOProtos.Rpc.BLJJMNEFDMOOrBuilder getHonboaphadhOrBuilder() {
      if (honboaphadhBuilder_ != null) {
        return honboaphadhBuilder_.getMessageOrBuilder();
      } else {
        return honboaphadh_ == null ?
            POGOProtos.Rpc.BLJJMNEFDMO.getDefaultInstance() : honboaphadh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BLJJMNEFDMO honboaphadh = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BLJJMNEFDMO, POGOProtos.Rpc.BLJJMNEFDMO.Builder, POGOProtos.Rpc.BLJJMNEFDMOOrBuilder> 
        getHonboaphadhFieldBuilder() {
      if (honboaphadhBuilder_ == null) {
        honboaphadhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BLJJMNEFDMO, POGOProtos.Rpc.BLJJMNEFDMO.Builder, POGOProtos.Rpc.BLJJMNEFDMOOrBuilder>(
                getHonboaphadh(),
                getParentForChildren(),
                isClean());
        honboaphadh_ = null;
      }
      return honboaphadhBuilder_;
    }

    private int pecdpnhkfhe_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
     * @return The enum numeric value on the wire for pecdpnhkfhe.
     */
    @java.lang.Override public int getPecdpnhkfheValue() {
      return pecdpnhkfhe_;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
     * @param value The enum numeric value on the wire for pecdpnhkfhe to set.
     * @return This builder for chaining.
     */
    public Builder setPecdpnhkfheValue(int value) {
      
      pecdpnhkfhe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
     * @return The pecdpnhkfhe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MAGDEIICLAK getPecdpnhkfhe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(pecdpnhkfhe_);
      return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
     * @param value The pecdpnhkfhe to set.
     * @return This builder for chaining.
     */
    public Builder setPecdpnhkfhe(POGOProtos.Rpc.MAGDEIICLAK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pecdpnhkfhe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK pecdpnhkfhe = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPecdpnhkfhe() {
      
      pecdpnhkfhe_ = 0;
      onChanged();
      return this;
    }

    private int hindokpjfpg_ ;
    /**
     * <code>int32 hindokpjfpg = 5;</code>
     * @return The hindokpjfpg.
     */
    @java.lang.Override
    public int getHindokpjfpg() {
      return hindokpjfpg_;
    }
    /**
     * <code>int32 hindokpjfpg = 5;</code>
     * @param value The hindokpjfpg to set.
     * @return This builder for chaining.
     */
    public Builder setHindokpjfpg(int value) {
      
      hindokpjfpg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hindokpjfpg = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHindokpjfpg() {
      
      hindokpjfpg_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ABEIKEFCNAM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ABEIKEFCNAM)
  private static final POGOProtos.Rpc.ABEIKEFCNAM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ABEIKEFCNAM();
  }

  public static POGOProtos.Rpc.ABEIKEFCNAM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ABEIKEFCNAM>
      PARSER = new com.google.protobuf.AbstractParser<ABEIKEFCNAM>() {
    @java.lang.Override
    public ABEIKEFCNAM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ABEIKEFCNAM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ABEIKEFCNAM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ABEIKEFCNAM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ABEIKEFCNAM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

