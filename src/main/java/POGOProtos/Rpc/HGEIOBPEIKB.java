// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HGEIOBPEIKB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HGEIOBPEIKB}
 */
public final class HGEIOBPEIKB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HGEIOBPEIKB)
    HGEIOBPEIKBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HGEIOBPEIKB.newBuilder() to construct.
  private HGEIOBPEIKB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HGEIOBPEIKB() {
    lknpioglmib_ = 0;
    llfflapmphl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HGEIOBPEIKB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HGEIOBPEIKB(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.ALDBMMPFJEL.Builder subBuilder = null;
            if (ichkglcaffb_ != null) {
              subBuilder = ichkglcaffb_.toBuilder();
            }
            ichkglcaffb_ = input.readMessage(POGOProtos.Rpc.ALDBMMPFJEL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ichkglcaffb_);
              ichkglcaffb_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.KIKHLAJCKFP.Builder subBuilder = null;
            if (klnafjahpce_ != null) {
              subBuilder = klnafjahpce_.toBuilder();
            }
            klnafjahpce_ = input.readMessage(POGOProtos.Rpc.KIKHLAJCKFP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(klnafjahpce_);
              klnafjahpce_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            llfflapmphl_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HGEIOBPEIKB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HGEIOBPEIKB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HGEIOBPEIKB.class, POGOProtos.Rpc.HGEIOBPEIKB.Builder.class);
  }

  /**
   * <pre>
   * ref: HGEIOBPEIKB/IAPPKFPABJN/MFIOBHLKIBM
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM}
   */
  public enum MFIOBHLKIBM
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>QUEST_ENCOUNTER_UNKNOWN = 0;</code>
     */
    QUEST_ENCOUNTER_UNKNOWN(0),
    /**
     * <code>QUEST_ENCOUNTER_SUCCESS = 1;</code>
     */
    QUEST_ENCOUNTER_SUCCESS(1),
    /**
     * <code>QUEST_ENCOUNTER_NOT_AVAILABLE = 2;</code>
     */
    QUEST_ENCOUNTER_NOT_AVAILABLE(2),
    /**
     * <code>QUEST_ENCOUNTER_ALREADY_FINISHED = 3;</code>
     */
    QUEST_ENCOUNTER_ALREADY_FINISHED(3),
    /**
     * <code>POKEMON_INVENTORY_FULL = 4;</code>
     */
    POKEMON_INVENTORY_FULL(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>QUEST_ENCOUNTER_UNKNOWN = 0;</code>
     */
    public static final int QUEST_ENCOUNTER_UNKNOWN_VALUE = 0;
    /**
     * <code>QUEST_ENCOUNTER_SUCCESS = 1;</code>
     */
    public static final int QUEST_ENCOUNTER_SUCCESS_VALUE = 1;
    /**
     * <code>QUEST_ENCOUNTER_NOT_AVAILABLE = 2;</code>
     */
    public static final int QUEST_ENCOUNTER_NOT_AVAILABLE_VALUE = 2;
    /**
     * <code>QUEST_ENCOUNTER_ALREADY_FINISHED = 3;</code>
     */
    public static final int QUEST_ENCOUNTER_ALREADY_FINISHED_VALUE = 3;
    /**
     * <code>POKEMON_INVENTORY_FULL = 4;</code>
     */
    public static final int POKEMON_INVENTORY_FULL_VALUE = 4;


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
    public static MFIOBHLKIBM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MFIOBHLKIBM forNumber(int value) {
      switch (value) {
        case 0: return QUEST_ENCOUNTER_UNKNOWN;
        case 1: return QUEST_ENCOUNTER_SUCCESS;
        case 2: return QUEST_ENCOUNTER_NOT_AVAILABLE;
        case 3: return QUEST_ENCOUNTER_ALREADY_FINISHED;
        case 4: return POKEMON_INVENTORY_FULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MFIOBHLKIBM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MFIOBHLKIBM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MFIOBHLKIBM>() {
            public MFIOBHLKIBM findValueByNumber(int number) {
              return MFIOBHLKIBM.forNumber(number);
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
      return POGOProtos.Rpc.HGEIOBPEIKB.getDescriptor().getEnumTypes().get(0);
    }

    private static final MFIOBHLKIBM[] VALUES = values();

    public static MFIOBHLKIBM valueOf(
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

    private MFIOBHLKIBM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM result = POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.UNRECOGNIZED : result;
  }

  public static final int ICHKGLCAFFB_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb_;
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   * @return Whether the ichkglcaffb field is set.
   */
  @java.lang.Override
  public boolean hasIchkglcaffb() {
    return ichkglcaffb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   * @return The ichkglcaffb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJEL getIchkglcaffb() {
    return ichkglcaffb_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getIchkglcaffbOrBuilder() {
    return getIchkglcaffb();
  }

  public static final int KLNAFJAHPCE_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce_;
  /**
   * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
   * @return Whether the klnafjahpce field is set.
   */
  @java.lang.Override
  public boolean hasKlnafjahpce() {
    return klnafjahpce_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
   * @return The klnafjahpce.
   */
  @java.lang.Override
  public POGOProtos.Rpc.KIKHLAJCKFP getKlnafjahpce() {
    return klnafjahpce_ == null ? POGOProtos.Rpc.KIKHLAJCKFP.getDefaultInstance() : klnafjahpce_;
  }
  /**
   * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.KIKHLAJCKFPOrBuilder getKlnafjahpceOrBuilder() {
    return getKlnafjahpce();
  }

  public static final int LLFFLAPMPHL_FIELD_NUMBER = 4;
  private int llfflapmphl_;
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
   * @return The enum numeric value on the wire for llfflapmphl.
   */
  @java.lang.Override public int getLlfflapmphlValue() {
    return llfflapmphl_;
  }
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
   * @return The llfflapmphl.
   */
  @java.lang.Override public POGOProtos.Rpc.GOCBJFKKCCF getLlfflapmphl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(llfflapmphl_);
    return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
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
    if (lknpioglmib_ != POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.QUEST_ENCOUNTER_UNKNOWN.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (ichkglcaffb_ != null) {
      output.writeMessage(2, getIchkglcaffb());
    }
    if (klnafjahpce_ != null) {
      output.writeMessage(3, getKlnafjahpce());
    }
    if (llfflapmphl_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(4, llfflapmphl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.QUEST_ENCOUNTER_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (ichkglcaffb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIchkglcaffb());
    }
    if (klnafjahpce_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getKlnafjahpce());
    }
    if (llfflapmphl_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, llfflapmphl_);
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
    if (!(obj instanceof POGOProtos.Rpc.HGEIOBPEIKB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HGEIOBPEIKB other = (POGOProtos.Rpc.HGEIOBPEIKB) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasIchkglcaffb() != other.hasIchkglcaffb()) return false;
    if (hasIchkglcaffb()) {
      if (!getIchkglcaffb()
          .equals(other.getIchkglcaffb())) return false;
    }
    if (hasKlnafjahpce() != other.hasKlnafjahpce()) return false;
    if (hasKlnafjahpce()) {
      if (!getKlnafjahpce()
          .equals(other.getKlnafjahpce())) return false;
    }
    if (llfflapmphl_ != other.llfflapmphl_) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasIchkglcaffb()) {
      hash = (37 * hash) + ICHKGLCAFFB_FIELD_NUMBER;
      hash = (53 * hash) + getIchkglcaffb().hashCode();
    }
    if (hasKlnafjahpce()) {
      hash = (37 * hash) + KLNAFJAHPCE_FIELD_NUMBER;
      hash = (53 * hash) + getKlnafjahpce().hashCode();
    }
    hash = (37 * hash) + LLFFLAPMPHL_FIELD_NUMBER;
    hash = (53 * hash) + llfflapmphl_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HGEIOBPEIKB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HGEIOBPEIKB prototype) {
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
   * ref: HGEIOBPEIKB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HGEIOBPEIKB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HGEIOBPEIKB)
      POGOProtos.Rpc.HGEIOBPEIKBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HGEIOBPEIKB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HGEIOBPEIKB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HGEIOBPEIKB.class, POGOProtos.Rpc.HGEIOBPEIKB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HGEIOBPEIKB.newBuilder()
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
      lknpioglmib_ = 0;

      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = null;
      } else {
        ichkglcaffb_ = null;
        ichkglcaffbBuilder_ = null;
      }
      if (klnafjahpceBuilder_ == null) {
        klnafjahpce_ = null;
      } else {
        klnafjahpce_ = null;
        klnafjahpceBuilder_ = null;
      }
      llfflapmphl_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HGEIOBPEIKB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HGEIOBPEIKB getDefaultInstanceForType() {
      return POGOProtos.Rpc.HGEIOBPEIKB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HGEIOBPEIKB build() {
      POGOProtos.Rpc.HGEIOBPEIKB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HGEIOBPEIKB buildPartial() {
      POGOProtos.Rpc.HGEIOBPEIKB result = new POGOProtos.Rpc.HGEIOBPEIKB(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (ichkglcaffbBuilder_ == null) {
        result.ichkglcaffb_ = ichkglcaffb_;
      } else {
        result.ichkglcaffb_ = ichkglcaffbBuilder_.build();
      }
      if (klnafjahpceBuilder_ == null) {
        result.klnafjahpce_ = klnafjahpce_;
      } else {
        result.klnafjahpce_ = klnafjahpceBuilder_.build();
      }
      result.llfflapmphl_ = llfflapmphl_;
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
      if (other instanceof POGOProtos.Rpc.HGEIOBPEIKB) {
        return mergeFrom((POGOProtos.Rpc.HGEIOBPEIKB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HGEIOBPEIKB other) {
      if (other == POGOProtos.Rpc.HGEIOBPEIKB.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasIchkglcaffb()) {
        mergeIchkglcaffb(other.getIchkglcaffb());
      }
      if (other.hasKlnafjahpce()) {
        mergeKlnafjahpce(other.getKlnafjahpce());
      }
      if (other.llfflapmphl_ != 0) {
        setLlfflapmphlValue(other.getLlfflapmphlValue());
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
      POGOProtos.Rpc.HGEIOBPEIKB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HGEIOBPEIKB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM result = POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGEIOBPEIKB.MFIOBHLKIBM lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> ichkglcaffbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     * @return Whether the ichkglcaffb field is set.
     */
    public boolean hasIchkglcaffb() {
      return ichkglcaffbBuilder_ != null || ichkglcaffb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     * @return The ichkglcaffb.
     */
    public POGOProtos.Rpc.ALDBMMPFJEL getIchkglcaffb() {
      if (ichkglcaffbBuilder_ == null) {
        return ichkglcaffb_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
      } else {
        return ichkglcaffbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder setIchkglcaffb(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ichkglcaffbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ichkglcaffb_ = value;
        onChanged();
      } else {
        ichkglcaffbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder setIchkglcaffb(
        POGOProtos.Rpc.ALDBMMPFJEL.Builder builderForValue) {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = builderForValue.build();
        onChanged();
      } else {
        ichkglcaffbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder mergeIchkglcaffb(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ichkglcaffbBuilder_ == null) {
        if (ichkglcaffb_ != null) {
          ichkglcaffb_ =
            POGOProtos.Rpc.ALDBMMPFJEL.newBuilder(ichkglcaffb_).mergeFrom(value).buildPartial();
        } else {
          ichkglcaffb_ = value;
        }
        onChanged();
      } else {
        ichkglcaffbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder clearIchkglcaffb() {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = null;
        onChanged();
      } else {
        ichkglcaffb_ = null;
        ichkglcaffbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJEL.Builder getIchkglcaffbBuilder() {
      
      onChanged();
      return getIchkglcaffbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getIchkglcaffbOrBuilder() {
      if (ichkglcaffbBuilder_ != null) {
        return ichkglcaffbBuilder_.getMessageOrBuilder();
      } else {
        return ichkglcaffb_ == null ?
            POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> 
        getIchkglcaffbFieldBuilder() {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder>(
                getIchkglcaffb(),
                getParentForChildren(),
                isClean());
        ichkglcaffb_ = null;
      }
      return ichkglcaffbBuilder_;
    }

    private POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KIKHLAJCKFP, POGOProtos.Rpc.KIKHLAJCKFP.Builder, POGOProtos.Rpc.KIKHLAJCKFPOrBuilder> klnafjahpceBuilder_;
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     * @return Whether the klnafjahpce field is set.
     */
    public boolean hasKlnafjahpce() {
      return klnafjahpceBuilder_ != null || klnafjahpce_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     * @return The klnafjahpce.
     */
    public POGOProtos.Rpc.KIKHLAJCKFP getKlnafjahpce() {
      if (klnafjahpceBuilder_ == null) {
        return klnafjahpce_ == null ? POGOProtos.Rpc.KIKHLAJCKFP.getDefaultInstance() : klnafjahpce_;
      } else {
        return klnafjahpceBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public Builder setKlnafjahpce(POGOProtos.Rpc.KIKHLAJCKFP value) {
      if (klnafjahpceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        klnafjahpce_ = value;
        onChanged();
      } else {
        klnafjahpceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public Builder setKlnafjahpce(
        POGOProtos.Rpc.KIKHLAJCKFP.Builder builderForValue) {
      if (klnafjahpceBuilder_ == null) {
        klnafjahpce_ = builderForValue.build();
        onChanged();
      } else {
        klnafjahpceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public Builder mergeKlnafjahpce(POGOProtos.Rpc.KIKHLAJCKFP value) {
      if (klnafjahpceBuilder_ == null) {
        if (klnafjahpce_ != null) {
          klnafjahpce_ =
            POGOProtos.Rpc.KIKHLAJCKFP.newBuilder(klnafjahpce_).mergeFrom(value).buildPartial();
        } else {
          klnafjahpce_ = value;
        }
        onChanged();
      } else {
        klnafjahpceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public Builder clearKlnafjahpce() {
      if (klnafjahpceBuilder_ == null) {
        klnafjahpce_ = null;
        onChanged();
      } else {
        klnafjahpce_ = null;
        klnafjahpceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public POGOProtos.Rpc.KIKHLAJCKFP.Builder getKlnafjahpceBuilder() {
      
      onChanged();
      return getKlnafjahpceFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    public POGOProtos.Rpc.KIKHLAJCKFPOrBuilder getKlnafjahpceOrBuilder() {
      if (klnafjahpceBuilder_ != null) {
        return klnafjahpceBuilder_.getMessageOrBuilder();
      } else {
        return klnafjahpce_ == null ?
            POGOProtos.Rpc.KIKHLAJCKFP.getDefaultInstance() : klnafjahpce_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KIKHLAJCKFP klnafjahpce = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KIKHLAJCKFP, POGOProtos.Rpc.KIKHLAJCKFP.Builder, POGOProtos.Rpc.KIKHLAJCKFPOrBuilder> 
        getKlnafjahpceFieldBuilder() {
      if (klnafjahpceBuilder_ == null) {
        klnafjahpceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.KIKHLAJCKFP, POGOProtos.Rpc.KIKHLAJCKFP.Builder, POGOProtos.Rpc.KIKHLAJCKFPOrBuilder>(
                getKlnafjahpce(),
                getParentForChildren(),
                isClean());
        klnafjahpce_ = null;
      }
      return klnafjahpceBuilder_;
    }

    private int llfflapmphl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
     * @return The enum numeric value on the wire for llfflapmphl.
     */
    @java.lang.Override public int getLlfflapmphlValue() {
      return llfflapmphl_;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
     * @param value The enum numeric value on the wire for llfflapmphl to set.
     * @return This builder for chaining.
     */
    public Builder setLlfflapmphlValue(int value) {
      
      llfflapmphl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
     * @return The llfflapmphl.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GOCBJFKKCCF getLlfflapmphl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(llfflapmphl_);
      return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
     * @param value The llfflapmphl to set.
     * @return This builder for chaining.
     */
    public Builder setLlfflapmphl(POGOProtos.Rpc.GOCBJFKKCCF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      llfflapmphl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF llfflapmphl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLlfflapmphl() {
      
      llfflapmphl_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HGEIOBPEIKB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HGEIOBPEIKB)
  private static final POGOProtos.Rpc.HGEIOBPEIKB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HGEIOBPEIKB();
  }

  public static POGOProtos.Rpc.HGEIOBPEIKB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HGEIOBPEIKB>
      PARSER = new com.google.protobuf.AbstractParser<HGEIOBPEIKB>() {
    @java.lang.Override
    public HGEIOBPEIKB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HGEIOBPEIKB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HGEIOBPEIKB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HGEIOBPEIKB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HGEIOBPEIKB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

