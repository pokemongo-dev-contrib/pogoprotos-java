// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PLFIEAMCIKB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PLFIEAMCIKB}
 */
public final class PLFIEAMCIKB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PLFIEAMCIKB)
    PLFIEAMCIKBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PLFIEAMCIKB.newBuilder() to construct.
  private PLFIEAMCIKB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PLFIEAMCIKB() {
    imjlpmikecn_ = 0;
    oapjkndamme_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PLFIEAMCIKB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PLFIEAMCIKB(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            imjlpmikecn_ = rawValue;
            break;
          }
          case 16: {

            hgbgeabhkpn_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              oapjkndamme_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            oapjkndamme_.add(rawValue);
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oapjkndamme_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              oapjkndamme_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        oapjkndamme_ = java.util.Collections.unmodifiableList(oapjkndamme_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLFIEAMCIKB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLFIEAMCIKB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PLFIEAMCIKB.class, POGOProtos.Rpc.PLFIEAMCIKB.Builder.class);
  }

  /**
   * <pre>
   * ref: PLFIEAMCIKB/EFCDBNHGBPF/EHCLDKGDIBE
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE}
   */
  public enum EHCLDKGDIBE
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>MAP_DEPLOY = 1;</code>
     */
    MAP_DEPLOY(1),
    /**
     * <code>ENCOUNTER_CAMEO = 2;</code>
     */
    ENCOUNTER_CAMEO(2),
    /**
     * <code>EMOTION_INDICATOR = 3;</code>
     */
    EMOTION_INDICATOR(3),
    /**
     * <code>PICK_UP_CONSUMABLES = 4;</code>
     */
    PICK_UP_CONSUMABLES(4),
    /**
     * <code>PICK_UP_SOUVENIRS = 5;</code>
     */
    PICK_UP_SOUVENIRS(5),
    /**
     * <code>FIND_ATTRACTIVE_POIS = 6;</code>
     */
    FIND_ATTRACTIVE_POIS(6),
    /**
     * <code>BEST_BUDDY_ASSET = 7;</code>
     */
    BEST_BUDDY_ASSET(7),
    /**
     * <code>CP_BOOST = 8;</code>
     */
    CP_BOOST(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>MAP_DEPLOY = 1;</code>
     */
    public static final int MAP_DEPLOY_VALUE = 1;
    /**
     * <code>ENCOUNTER_CAMEO = 2;</code>
     */
    public static final int ENCOUNTER_CAMEO_VALUE = 2;
    /**
     * <code>EMOTION_INDICATOR = 3;</code>
     */
    public static final int EMOTION_INDICATOR_VALUE = 3;
    /**
     * <code>PICK_UP_CONSUMABLES = 4;</code>
     */
    public static final int PICK_UP_CONSUMABLES_VALUE = 4;
    /**
     * <code>PICK_UP_SOUVENIRS = 5;</code>
     */
    public static final int PICK_UP_SOUVENIRS_VALUE = 5;
    /**
     * <code>FIND_ATTRACTIVE_POIS = 6;</code>
     */
    public static final int FIND_ATTRACTIVE_POIS_VALUE = 6;
    /**
     * <code>BEST_BUDDY_ASSET = 7;</code>
     */
    public static final int BEST_BUDDY_ASSET_VALUE = 7;
    /**
     * <code>CP_BOOST = 8;</code>
     */
    public static final int CP_BOOST_VALUE = 8;


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
    public static EHCLDKGDIBE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EHCLDKGDIBE forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return MAP_DEPLOY;
        case 2: return ENCOUNTER_CAMEO;
        case 3: return EMOTION_INDICATOR;
        case 4: return PICK_UP_CONSUMABLES;
        case 5: return PICK_UP_SOUVENIRS;
        case 6: return FIND_ATTRACTIVE_POIS;
        case 7: return BEST_BUDDY_ASSET;
        case 8: return CP_BOOST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EHCLDKGDIBE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EHCLDKGDIBE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EHCLDKGDIBE>() {
            public EHCLDKGDIBE findValueByNumber(int number) {
              return EHCLDKGDIBE.forNumber(number);
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
      return POGOProtos.Rpc.PLFIEAMCIKB.getDescriptor().getEnumTypes().get(0);
    }

    private static final EHCLDKGDIBE[] VALUES = values();

    public static EHCLDKGDIBE valueOf(
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

    private EHCLDKGDIBE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE)
  }

  public static final int IMJLPMIKECN_FIELD_NUMBER = 1;
  private int imjlpmikecn_;
  /**
   * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
   * @return The enum numeric value on the wire for imjlpmikecn.
   */
  @java.lang.Override public int getImjlpmikecnValue() {
    return imjlpmikecn_;
  }
  /**
   * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
   * @return The imjlpmikecn.
   */
  @java.lang.Override public POGOProtos.Rpc.NBPKBIFMIDO getImjlpmikecn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NBPKBIFMIDO result = POGOProtos.Rpc.NBPKBIFMIDO.valueOf(imjlpmikecn_);
    return result == null ? POGOProtos.Rpc.NBPKBIFMIDO.UNRECOGNIZED : result;
  }

  public static final int HGBGEABHKPN_FIELD_NUMBER = 2;
  private int hgbgeabhkpn_;
  /**
   * <code>int32 hgbgeabhkpn = 2;</code>
   * @return The hgbgeabhkpn.
   */
  @java.lang.Override
  public int getHgbgeabhkpn() {
    return hgbgeabhkpn_;
  }

  public static final int OAPJKNDAMME_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> oapjkndamme_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE> oapjkndamme_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE>() {
            public POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE result = POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE.valueOf(from);
              return result == null ? POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
   * @return A list containing the oapjkndamme.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE> getOapjkndammeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE>(oapjkndamme_, oapjkndamme_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
   * @return The count of oapjkndamme.
   */
  @java.lang.Override
  public int getOapjkndammeCount() {
    return oapjkndamme_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
   * @param index The index of the element to return.
   * @return The oapjkndamme at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE getOapjkndamme(int index) {
    return oapjkndamme_converter_.convert(oapjkndamme_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
   * @return A list containing the enum numeric values on the wire for oapjkndamme.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getOapjkndammeValueList() {
    return oapjkndamme_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of oapjkndamme at the given index.
   */
  @java.lang.Override
  public int getOapjkndammeValue(int index) {
    return oapjkndamme_.get(index);
  }
  private int oapjkndammeMemoizedSerializedSize;

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
    getSerializedSize();
    if (imjlpmikecn_ != POGOProtos.Rpc.NBPKBIFMIDO.NBPKBIFMIDO_BUDDY_LEVEL_UNSET.getNumber()) {
      output.writeEnum(1, imjlpmikecn_);
    }
    if (hgbgeabhkpn_ != 0) {
      output.writeInt32(2, hgbgeabhkpn_);
    }
    if (getOapjkndammeList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(oapjkndammeMemoizedSerializedSize);
    }
    for (int i = 0; i < oapjkndamme_.size(); i++) {
      output.writeEnumNoTag(oapjkndamme_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (imjlpmikecn_ != POGOProtos.Rpc.NBPKBIFMIDO.NBPKBIFMIDO_BUDDY_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, imjlpmikecn_);
    }
    if (hgbgeabhkpn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hgbgeabhkpn_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < oapjkndamme_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(oapjkndamme_.get(i));
      }
      size += dataSize;
      if (!getOapjkndammeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }oapjkndammeMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.PLFIEAMCIKB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PLFIEAMCIKB other = (POGOProtos.Rpc.PLFIEAMCIKB) obj;

    if (imjlpmikecn_ != other.imjlpmikecn_) return false;
    if (getHgbgeabhkpn()
        != other.getHgbgeabhkpn()) return false;
    if (!oapjkndamme_.equals(other.oapjkndamme_)) return false;
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
    hash = (37 * hash) + IMJLPMIKECN_FIELD_NUMBER;
    hash = (53 * hash) + imjlpmikecn_;
    hash = (37 * hash) + HGBGEABHKPN_FIELD_NUMBER;
    hash = (53 * hash) + getHgbgeabhkpn();
    if (getOapjkndammeCount() > 0) {
      hash = (37 * hash) + OAPJKNDAMME_FIELD_NUMBER;
      hash = (53 * hash) + oapjkndamme_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLFIEAMCIKB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PLFIEAMCIKB prototype) {
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
   * ref: PLFIEAMCIKB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PLFIEAMCIKB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PLFIEAMCIKB)
      POGOProtos.Rpc.PLFIEAMCIKBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLFIEAMCIKB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLFIEAMCIKB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PLFIEAMCIKB.class, POGOProtos.Rpc.PLFIEAMCIKB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PLFIEAMCIKB.newBuilder()
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
      imjlpmikecn_ = 0;

      hgbgeabhkpn_ = 0;

      oapjkndamme_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLFIEAMCIKB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLFIEAMCIKB getDefaultInstanceForType() {
      return POGOProtos.Rpc.PLFIEAMCIKB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLFIEAMCIKB build() {
      POGOProtos.Rpc.PLFIEAMCIKB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLFIEAMCIKB buildPartial() {
      POGOProtos.Rpc.PLFIEAMCIKB result = new POGOProtos.Rpc.PLFIEAMCIKB(this);
      int from_bitField0_ = bitField0_;
      result.imjlpmikecn_ = imjlpmikecn_;
      result.hgbgeabhkpn_ = hgbgeabhkpn_;
      if (((bitField0_ & 0x00000001) != 0)) {
        oapjkndamme_ = java.util.Collections.unmodifiableList(oapjkndamme_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.oapjkndamme_ = oapjkndamme_;
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
      if (other instanceof POGOProtos.Rpc.PLFIEAMCIKB) {
        return mergeFrom((POGOProtos.Rpc.PLFIEAMCIKB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PLFIEAMCIKB other) {
      if (other == POGOProtos.Rpc.PLFIEAMCIKB.getDefaultInstance()) return this;
      if (other.imjlpmikecn_ != 0) {
        setImjlpmikecnValue(other.getImjlpmikecnValue());
      }
      if (other.getHgbgeabhkpn() != 0) {
        setHgbgeabhkpn(other.getHgbgeabhkpn());
      }
      if (!other.oapjkndamme_.isEmpty()) {
        if (oapjkndamme_.isEmpty()) {
          oapjkndamme_ = other.oapjkndamme_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOapjkndammeIsMutable();
          oapjkndamme_.addAll(other.oapjkndamme_);
        }
        onChanged();
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
      POGOProtos.Rpc.PLFIEAMCIKB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PLFIEAMCIKB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int imjlpmikecn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
     * @return The enum numeric value on the wire for imjlpmikecn.
     */
    @java.lang.Override public int getImjlpmikecnValue() {
      return imjlpmikecn_;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
     * @param value The enum numeric value on the wire for imjlpmikecn to set.
     * @return This builder for chaining.
     */
    public Builder setImjlpmikecnValue(int value) {
      
      imjlpmikecn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
     * @return The imjlpmikecn.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NBPKBIFMIDO getImjlpmikecn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NBPKBIFMIDO result = POGOProtos.Rpc.NBPKBIFMIDO.valueOf(imjlpmikecn_);
      return result == null ? POGOProtos.Rpc.NBPKBIFMIDO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
     * @param value The imjlpmikecn to set.
     * @return This builder for chaining.
     */
    public Builder setImjlpmikecn(POGOProtos.Rpc.NBPKBIFMIDO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      imjlpmikecn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPKBIFMIDO imjlpmikecn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImjlpmikecn() {
      
      imjlpmikecn_ = 0;
      onChanged();
      return this;
    }

    private int hgbgeabhkpn_ ;
    /**
     * <code>int32 hgbgeabhkpn = 2;</code>
     * @return The hgbgeabhkpn.
     */
    @java.lang.Override
    public int getHgbgeabhkpn() {
      return hgbgeabhkpn_;
    }
    /**
     * <code>int32 hgbgeabhkpn = 2;</code>
     * @param value The hgbgeabhkpn to set.
     * @return This builder for chaining.
     */
    public Builder setHgbgeabhkpn(int value) {
      
      hgbgeabhkpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hgbgeabhkpn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHgbgeabhkpn() {
      
      hgbgeabhkpn_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> oapjkndamme_ =
      java.util.Collections.emptyList();
    private void ensureOapjkndammeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        oapjkndamme_ = new java.util.ArrayList<java.lang.Integer>(oapjkndamme_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @return A list containing the oapjkndamme.
     */
    public java.util.List<POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE> getOapjkndammeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE>(oapjkndamme_, oapjkndamme_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @return The count of oapjkndamme.
     */
    public int getOapjkndammeCount() {
      return oapjkndamme_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param index The index of the element to return.
     * @return The oapjkndamme at the given index.
     */
    public POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE getOapjkndamme(int index) {
      return oapjkndamme_converter_.convert(oapjkndamme_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param index The index to set the value at.
     * @param value The oapjkndamme to set.
     * @return This builder for chaining.
     */
    public Builder setOapjkndamme(
        int index, POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOapjkndammeIsMutable();
      oapjkndamme_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param value The oapjkndamme to add.
     * @return This builder for chaining.
     */
    public Builder addOapjkndamme(POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOapjkndammeIsMutable();
      oapjkndamme_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param values The oapjkndamme to add.
     * @return This builder for chaining.
     */
    public Builder addAllOapjkndamme(
        java.lang.Iterable<? extends POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE> values) {
      ensureOapjkndammeIsMutable();
      for (POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE value : values) {
        oapjkndamme_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOapjkndamme() {
      oapjkndamme_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @return A list containing the enum numeric values on the wire for oapjkndamme.
     */
    public java.util.List<java.lang.Integer>
    getOapjkndammeValueList() {
      return java.util.Collections.unmodifiableList(oapjkndamme_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of oapjkndamme at the given index.
     */
    public int getOapjkndammeValue(int index) {
      return oapjkndamme_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of oapjkndamme at the given index.
     * @return This builder for chaining.
     */
    public Builder setOapjkndammeValue(
        int index, int value) {
      ensureOapjkndammeIsMutable();
      oapjkndamme_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param value The enum numeric value on the wire for oapjkndamme to add.
     * @return This builder for chaining.
     */
    public Builder addOapjkndammeValue(int value) {
      ensureOapjkndammeIsMutable();
      oapjkndamme_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PLFIEAMCIKB.EHCLDKGDIBE oapjkndamme = 3;</code>
     * @param values The enum numeric values on the wire for oapjkndamme to add.
     * @return This builder for chaining.
     */
    public Builder addAllOapjkndammeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureOapjkndammeIsMutable();
      for (int value : values) {
        oapjkndamme_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PLFIEAMCIKB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PLFIEAMCIKB)
  private static final POGOProtos.Rpc.PLFIEAMCIKB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PLFIEAMCIKB();
  }

  public static POGOProtos.Rpc.PLFIEAMCIKB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PLFIEAMCIKB>
      PARSER = new com.google.protobuf.AbstractParser<PLFIEAMCIKB>() {
    @java.lang.Override
    public PLFIEAMCIKB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PLFIEAMCIKB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PLFIEAMCIKB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PLFIEAMCIKB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PLFIEAMCIKB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

