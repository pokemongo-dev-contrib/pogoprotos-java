// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HAMLDIEEMHJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HAMLDIEEMHJ}
 */
public final class HAMLDIEEMHJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HAMLDIEEMHJ)
    HAMLDIEEMHJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HAMLDIEEMHJ.newBuilder() to construct.
  private HAMLDIEEMHJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HAMLDIEEMHJ() {
    lknpioglmib_ = "";
    imcahnopnbp_ = "";
    eafnacomcph_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HAMLDIEEMHJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HAMLDIEEMHJ(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            lknpioglmib_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            imcahnopnbp_ = s;
            break;
          }
          case 24: {

            mefmgklgpan_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              eafnacomcph_ = new java.util.ArrayList<POGOProtos.Rpc.BFPGDLLLMOE>();
              mutable_bitField0_ |= 0x00000001;
            }
            eafnacomcph_.add(
                input.readMessage(POGOProtos.Rpc.BFPGDLLLMOE.parser(), extensionRegistry));
            break;
          }
          case 40: {

            nicoeeffhmj_ = input.readInt32();
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
        eafnacomcph_ = java.util.Collections.unmodifiableList(eafnacomcph_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HAMLDIEEMHJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HAMLDIEEMHJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HAMLDIEEMHJ.class, POGOProtos.Rpc.HAMLDIEEMHJ.Builder.class);
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private volatile java.lang.Object lknpioglmib_;
  /**
   * <code>string lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override
  public java.lang.String getLknpioglmib() {
    java.lang.Object ref = lknpioglmib_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lknpioglmib_ = s;
      return s;
    }
  }
  /**
   * <code>string lknpioglmib = 1;</code>
   * @return The bytes for lknpioglmib.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLknpioglmibBytes() {
    java.lang.Object ref = lknpioglmib_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lknpioglmib_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMCAHNOPNBP_FIELD_NUMBER = 2;
  private volatile java.lang.Object imcahnopnbp_;
  /**
   * <code>string imcahnopnbp = 2;</code>
   * @return The imcahnopnbp.
   */
  @java.lang.Override
  public java.lang.String getImcahnopnbp() {
    java.lang.Object ref = imcahnopnbp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imcahnopnbp_ = s;
      return s;
    }
  }
  /**
   * <code>string imcahnopnbp = 2;</code>
   * @return The bytes for imcahnopnbp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImcahnopnbpBytes() {
    java.lang.Object ref = imcahnopnbp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imcahnopnbp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEFMGKLGPAN_FIELD_NUMBER = 3;
  private int mefmgklgpan_;
  /**
   * <code>int32 mefmgklgpan = 3;</code>
   * @return The mefmgklgpan.
   */
  @java.lang.Override
  public int getMefmgklgpan() {
    return mefmgklgpan_;
  }

  public static final int EAFNACOMCPH_FIELD_NUMBER = 4;
  private java.util.List<POGOProtos.Rpc.BFPGDLLLMOE> eafnacomcph_;
  /**
   * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BFPGDLLLMOE> getEafnacomcphList() {
    return eafnacomcph_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.BFPGDLLLMOEOrBuilder> 
      getEafnacomcphOrBuilderList() {
    return eafnacomcph_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
   */
  @java.lang.Override
  public int getEafnacomcphCount() {
    return eafnacomcph_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BFPGDLLLMOE getEafnacomcph(int index) {
    return eafnacomcph_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BFPGDLLLMOEOrBuilder getEafnacomcphOrBuilder(
      int index) {
    return eafnacomcph_.get(index);
  }

  public static final int NICOEEFFHMJ_FIELD_NUMBER = 5;
  private int nicoeeffhmj_;
  /**
   * <code>int32 nicoeeffhmj = 5;</code>
   * @return The nicoeeffhmj.
   */
  @java.lang.Override
  public int getNicoeeffhmj() {
    return nicoeeffhmj_;
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
    if (!getLknpioglmibBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lknpioglmib_);
    }
    if (!getImcahnopnbpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imcahnopnbp_);
    }
    if (mefmgklgpan_ != 0) {
      output.writeInt32(3, mefmgklgpan_);
    }
    for (int i = 0; i < eafnacomcph_.size(); i++) {
      output.writeMessage(4, eafnacomcph_.get(i));
    }
    if (nicoeeffhmj_ != 0) {
      output.writeInt32(5, nicoeeffhmj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLknpioglmibBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lknpioglmib_);
    }
    if (!getImcahnopnbpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imcahnopnbp_);
    }
    if (mefmgklgpan_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mefmgklgpan_);
    }
    for (int i = 0; i < eafnacomcph_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, eafnacomcph_.get(i));
    }
    if (nicoeeffhmj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, nicoeeffhmj_);
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
    if (!(obj instanceof POGOProtos.Rpc.HAMLDIEEMHJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HAMLDIEEMHJ other = (POGOProtos.Rpc.HAMLDIEEMHJ) obj;

    if (!getLknpioglmib()
        .equals(other.getLknpioglmib())) return false;
    if (!getImcahnopnbp()
        .equals(other.getImcahnopnbp())) return false;
    if (getMefmgklgpan()
        != other.getMefmgklgpan()) return false;
    if (!getEafnacomcphList()
        .equals(other.getEafnacomcphList())) return false;
    if (getNicoeeffhmj()
        != other.getNicoeeffhmj()) return false;
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
    hash = (53 * hash) + getLknpioglmib().hashCode();
    hash = (37 * hash) + IMCAHNOPNBP_FIELD_NUMBER;
    hash = (53 * hash) + getImcahnopnbp().hashCode();
    hash = (37 * hash) + MEFMGKLGPAN_FIELD_NUMBER;
    hash = (53 * hash) + getMefmgklgpan();
    if (getEafnacomcphCount() > 0) {
      hash = (37 * hash) + EAFNACOMCPH_FIELD_NUMBER;
      hash = (53 * hash) + getEafnacomcphList().hashCode();
    }
    hash = (37 * hash) + NICOEEFFHMJ_FIELD_NUMBER;
    hash = (53 * hash) + getNicoeeffhmj();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HAMLDIEEMHJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HAMLDIEEMHJ prototype) {
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
   * ref: HAMLDIEEMHJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HAMLDIEEMHJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HAMLDIEEMHJ)
      POGOProtos.Rpc.HAMLDIEEMHJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HAMLDIEEMHJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HAMLDIEEMHJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HAMLDIEEMHJ.class, POGOProtos.Rpc.HAMLDIEEMHJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HAMLDIEEMHJ.newBuilder()
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
        getEafnacomcphFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lknpioglmib_ = "";

      imcahnopnbp_ = "";

      mefmgklgpan_ = 0;

      if (eafnacomcphBuilder_ == null) {
        eafnacomcph_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        eafnacomcphBuilder_.clear();
      }
      nicoeeffhmj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HAMLDIEEMHJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HAMLDIEEMHJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.HAMLDIEEMHJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HAMLDIEEMHJ build() {
      POGOProtos.Rpc.HAMLDIEEMHJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HAMLDIEEMHJ buildPartial() {
      POGOProtos.Rpc.HAMLDIEEMHJ result = new POGOProtos.Rpc.HAMLDIEEMHJ(this);
      int from_bitField0_ = bitField0_;
      result.lknpioglmib_ = lknpioglmib_;
      result.imcahnopnbp_ = imcahnopnbp_;
      result.mefmgklgpan_ = mefmgklgpan_;
      if (eafnacomcphBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          eafnacomcph_ = java.util.Collections.unmodifiableList(eafnacomcph_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eafnacomcph_ = eafnacomcph_;
      } else {
        result.eafnacomcph_ = eafnacomcphBuilder_.build();
      }
      result.nicoeeffhmj_ = nicoeeffhmj_;
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
      if (other instanceof POGOProtos.Rpc.HAMLDIEEMHJ) {
        return mergeFrom((POGOProtos.Rpc.HAMLDIEEMHJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HAMLDIEEMHJ other) {
      if (other == POGOProtos.Rpc.HAMLDIEEMHJ.getDefaultInstance()) return this;
      if (!other.getLknpioglmib().isEmpty()) {
        lknpioglmib_ = other.lknpioglmib_;
        onChanged();
      }
      if (!other.getImcahnopnbp().isEmpty()) {
        imcahnopnbp_ = other.imcahnopnbp_;
        onChanged();
      }
      if (other.getMefmgklgpan() != 0) {
        setMefmgklgpan(other.getMefmgklgpan());
      }
      if (eafnacomcphBuilder_ == null) {
        if (!other.eafnacomcph_.isEmpty()) {
          if (eafnacomcph_.isEmpty()) {
            eafnacomcph_ = other.eafnacomcph_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEafnacomcphIsMutable();
            eafnacomcph_.addAll(other.eafnacomcph_);
          }
          onChanged();
        }
      } else {
        if (!other.eafnacomcph_.isEmpty()) {
          if (eafnacomcphBuilder_.isEmpty()) {
            eafnacomcphBuilder_.dispose();
            eafnacomcphBuilder_ = null;
            eafnacomcph_ = other.eafnacomcph_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eafnacomcphBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEafnacomcphFieldBuilder() : null;
          } else {
            eafnacomcphBuilder_.addAllMessages(other.eafnacomcph_);
          }
        }
      }
      if (other.getNicoeeffhmj() != 0) {
        setNicoeeffhmj(other.getNicoeeffhmj());
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
      POGOProtos.Rpc.HAMLDIEEMHJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HAMLDIEEMHJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object lknpioglmib_ = "";
    /**
     * <code>string lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    public java.lang.String getLknpioglmib() {
      java.lang.Object ref = lknpioglmib_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lknpioglmib_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lknpioglmib = 1;</code>
     * @return The bytes for lknpioglmib.
     */
    public com.google.protobuf.ByteString
        getLknpioglmibBytes() {
      java.lang.Object ref = lknpioglmib_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lknpioglmib_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = getDefaultInstance().getLknpioglmib();
      onChanged();
      return this;
    }
    /**
     * <code>string lknpioglmib = 1;</code>
     * @param value The bytes for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imcahnopnbp_ = "";
    /**
     * <code>string imcahnopnbp = 2;</code>
     * @return The imcahnopnbp.
     */
    public java.lang.String getImcahnopnbp() {
      java.lang.Object ref = imcahnopnbp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imcahnopnbp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imcahnopnbp = 2;</code>
     * @return The bytes for imcahnopnbp.
     */
    public com.google.protobuf.ByteString
        getImcahnopnbpBytes() {
      java.lang.Object ref = imcahnopnbp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imcahnopnbp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imcahnopnbp = 2;</code>
     * @param value The imcahnopnbp to set.
     * @return This builder for chaining.
     */
    public Builder setImcahnopnbp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imcahnopnbp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string imcahnopnbp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImcahnopnbp() {
      
      imcahnopnbp_ = getDefaultInstance().getImcahnopnbp();
      onChanged();
      return this;
    }
    /**
     * <code>string imcahnopnbp = 2;</code>
     * @param value The bytes for imcahnopnbp to set.
     * @return This builder for chaining.
     */
    public Builder setImcahnopnbpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imcahnopnbp_ = value;
      onChanged();
      return this;
    }

    private int mefmgklgpan_ ;
    /**
     * <code>int32 mefmgklgpan = 3;</code>
     * @return The mefmgklgpan.
     */
    @java.lang.Override
    public int getMefmgklgpan() {
      return mefmgklgpan_;
    }
    /**
     * <code>int32 mefmgklgpan = 3;</code>
     * @param value The mefmgklgpan to set.
     * @return This builder for chaining.
     */
    public Builder setMefmgklgpan(int value) {
      
      mefmgklgpan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mefmgklgpan = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMefmgklgpan() {
      
      mefmgklgpan_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.BFPGDLLLMOE> eafnacomcph_ =
      java.util.Collections.emptyList();
    private void ensureEafnacomcphIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eafnacomcph_ = new java.util.ArrayList<POGOProtos.Rpc.BFPGDLLLMOE>(eafnacomcph_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BFPGDLLLMOE, POGOProtos.Rpc.BFPGDLLLMOE.Builder, POGOProtos.Rpc.BFPGDLLLMOEOrBuilder> eafnacomcphBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.BFPGDLLLMOE> getEafnacomcphList() {
      if (eafnacomcphBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eafnacomcph_);
      } else {
        return eafnacomcphBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public int getEafnacomcphCount() {
      if (eafnacomcphBuilder_ == null) {
        return eafnacomcph_.size();
      } else {
        return eafnacomcphBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public POGOProtos.Rpc.BFPGDLLLMOE getEafnacomcph(int index) {
      if (eafnacomcphBuilder_ == null) {
        return eafnacomcph_.get(index);
      } else {
        return eafnacomcphBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder setEafnacomcph(
        int index, POGOProtos.Rpc.BFPGDLLLMOE value) {
      if (eafnacomcphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEafnacomcphIsMutable();
        eafnacomcph_.set(index, value);
        onChanged();
      } else {
        eafnacomcphBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder setEafnacomcph(
        int index, POGOProtos.Rpc.BFPGDLLLMOE.Builder builderForValue) {
      if (eafnacomcphBuilder_ == null) {
        ensureEafnacomcphIsMutable();
        eafnacomcph_.set(index, builderForValue.build());
        onChanged();
      } else {
        eafnacomcphBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder addEafnacomcph(POGOProtos.Rpc.BFPGDLLLMOE value) {
      if (eafnacomcphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEafnacomcphIsMutable();
        eafnacomcph_.add(value);
        onChanged();
      } else {
        eafnacomcphBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder addEafnacomcph(
        int index, POGOProtos.Rpc.BFPGDLLLMOE value) {
      if (eafnacomcphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEafnacomcphIsMutable();
        eafnacomcph_.add(index, value);
        onChanged();
      } else {
        eafnacomcphBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder addEafnacomcph(
        POGOProtos.Rpc.BFPGDLLLMOE.Builder builderForValue) {
      if (eafnacomcphBuilder_ == null) {
        ensureEafnacomcphIsMutable();
        eafnacomcph_.add(builderForValue.build());
        onChanged();
      } else {
        eafnacomcphBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder addEafnacomcph(
        int index, POGOProtos.Rpc.BFPGDLLLMOE.Builder builderForValue) {
      if (eafnacomcphBuilder_ == null) {
        ensureEafnacomcphIsMutable();
        eafnacomcph_.add(index, builderForValue.build());
        onChanged();
      } else {
        eafnacomcphBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder addAllEafnacomcph(
        java.lang.Iterable<? extends POGOProtos.Rpc.BFPGDLLLMOE> values) {
      if (eafnacomcphBuilder_ == null) {
        ensureEafnacomcphIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eafnacomcph_);
        onChanged();
      } else {
        eafnacomcphBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder clearEafnacomcph() {
      if (eafnacomcphBuilder_ == null) {
        eafnacomcph_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eafnacomcphBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public Builder removeEafnacomcph(int index) {
      if (eafnacomcphBuilder_ == null) {
        ensureEafnacomcphIsMutable();
        eafnacomcph_.remove(index);
        onChanged();
      } else {
        eafnacomcphBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public POGOProtos.Rpc.BFPGDLLLMOE.Builder getEafnacomcphBuilder(
        int index) {
      return getEafnacomcphFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public POGOProtos.Rpc.BFPGDLLLMOEOrBuilder getEafnacomcphOrBuilder(
        int index) {
      if (eafnacomcphBuilder_ == null) {
        return eafnacomcph_.get(index);  } else {
        return eafnacomcphBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BFPGDLLLMOEOrBuilder> 
         getEafnacomcphOrBuilderList() {
      if (eafnacomcphBuilder_ != null) {
        return eafnacomcphBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eafnacomcph_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public POGOProtos.Rpc.BFPGDLLLMOE.Builder addEafnacomcphBuilder() {
      return getEafnacomcphFieldBuilder().addBuilder(
          POGOProtos.Rpc.BFPGDLLLMOE.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public POGOProtos.Rpc.BFPGDLLLMOE.Builder addEafnacomcphBuilder(
        int index) {
      return getEafnacomcphFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BFPGDLLLMOE.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BFPGDLLLMOE eafnacomcph = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.BFPGDLLLMOE.Builder> 
         getEafnacomcphBuilderList() {
      return getEafnacomcphFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BFPGDLLLMOE, POGOProtos.Rpc.BFPGDLLLMOE.Builder, POGOProtos.Rpc.BFPGDLLLMOEOrBuilder> 
        getEafnacomcphFieldBuilder() {
      if (eafnacomcphBuilder_ == null) {
        eafnacomcphBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BFPGDLLLMOE, POGOProtos.Rpc.BFPGDLLLMOE.Builder, POGOProtos.Rpc.BFPGDLLLMOEOrBuilder>(
                eafnacomcph_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        eafnacomcph_ = null;
      }
      return eafnacomcphBuilder_;
    }

    private int nicoeeffhmj_ ;
    /**
     * <code>int32 nicoeeffhmj = 5;</code>
     * @return The nicoeeffhmj.
     */
    @java.lang.Override
    public int getNicoeeffhmj() {
      return nicoeeffhmj_;
    }
    /**
     * <code>int32 nicoeeffhmj = 5;</code>
     * @param value The nicoeeffhmj to set.
     * @return This builder for chaining.
     */
    public Builder setNicoeeffhmj(int value) {
      
      nicoeeffhmj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nicoeeffhmj = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNicoeeffhmj() {
      
      nicoeeffhmj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HAMLDIEEMHJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HAMLDIEEMHJ)
  private static final POGOProtos.Rpc.HAMLDIEEMHJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HAMLDIEEMHJ();
  }

  public static POGOProtos.Rpc.HAMLDIEEMHJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HAMLDIEEMHJ>
      PARSER = new com.google.protobuf.AbstractParser<HAMLDIEEMHJ>() {
    @java.lang.Override
    public HAMLDIEEMHJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HAMLDIEEMHJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HAMLDIEEMHJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HAMLDIEEMHJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HAMLDIEEMHJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

