// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AHNHHPHANMA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AHNHHPHANMA}
 */
public final class AHNHHPHANMA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AHNHHPHANMA)
    AHNHHPHANMAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AHNHHPHANMA.newBuilder() to construct.
  private AHNHHPHANMA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AHNHHPHANMA() {
    mhndbiddbgh_ = "";
    bnchobmfppo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AHNHHPHANMA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AHNHHPHANMA(
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

            mhndbiddbgh_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bnchobmfppo_ = new java.util.ArrayList<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG>();
              mutable_bitField0_ |= 0x00000001;
            }
            bnchobmfppo_.add(
                input.readMessage(POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.parser(), extensionRegistry));
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
        bnchobmfppo_ = java.util.Collections.unmodifiableList(bnchobmfppo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AHNHHPHANMA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AHNHHPHANMA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AHNHHPHANMA.class, POGOProtos.Rpc.AHNHHPHANMA.Builder.class);
  }

  public static final int MHNDBIDDBGH_FIELD_NUMBER = 1;
  private volatile java.lang.Object mhndbiddbgh_;
  /**
   * <code>string mhndbiddbgh = 1;</code>
   * @return The mhndbiddbgh.
   */
  @java.lang.Override
  public java.lang.String getMhndbiddbgh() {
    java.lang.Object ref = mhndbiddbgh_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mhndbiddbgh_ = s;
      return s;
    }
  }
  /**
   * <code>string mhndbiddbgh = 1;</code>
   * @return The bytes for mhndbiddbgh.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMhndbiddbghBytes() {
    java.lang.Object ref = mhndbiddbgh_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mhndbiddbgh_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BNCHOBMFPPO_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG> bnchobmfppo_;
  /**
   * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG> getBnchobmfppoList() {
    return bnchobmfppo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder> 
      getBnchobmfppoOrBuilderList() {
    return bnchobmfppo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
   */
  @java.lang.Override
  public int getBnchobmfppoCount() {
    return bnchobmfppo_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG getBnchobmfppo(int index) {
    return bnchobmfppo_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder getBnchobmfppoOrBuilder(
      int index) {
    return bnchobmfppo_.get(index);
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
    if (!getMhndbiddbghBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mhndbiddbgh_);
    }
    for (int i = 0; i < bnchobmfppo_.size(); i++) {
      output.writeMessage(2, bnchobmfppo_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMhndbiddbghBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mhndbiddbgh_);
    }
    for (int i = 0; i < bnchobmfppo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bnchobmfppo_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.AHNHHPHANMA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AHNHHPHANMA other = (POGOProtos.Rpc.AHNHHPHANMA) obj;

    if (!getMhndbiddbgh()
        .equals(other.getMhndbiddbgh())) return false;
    if (!getBnchobmfppoList()
        .equals(other.getBnchobmfppoList())) return false;
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
    hash = (37 * hash) + MHNDBIDDBGH_FIELD_NUMBER;
    hash = (53 * hash) + getMhndbiddbgh().hashCode();
    if (getBnchobmfppoCount() > 0) {
      hash = (37 * hash) + BNCHOBMFPPO_FIELD_NUMBER;
      hash = (53 * hash) + getBnchobmfppoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AHNHHPHANMA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AHNHHPHANMA prototype) {
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
   * ref: AHNHHPHANMA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AHNHHPHANMA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AHNHHPHANMA)
      POGOProtos.Rpc.AHNHHPHANMAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AHNHHPHANMA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AHNHHPHANMA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AHNHHPHANMA.class, POGOProtos.Rpc.AHNHHPHANMA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AHNHHPHANMA.newBuilder()
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
        getBnchobmfppoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mhndbiddbgh_ = "";

      if (bnchobmfppoBuilder_ == null) {
        bnchobmfppo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bnchobmfppoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AHNHHPHANMA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AHNHHPHANMA getDefaultInstanceForType() {
      return POGOProtos.Rpc.AHNHHPHANMA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AHNHHPHANMA build() {
      POGOProtos.Rpc.AHNHHPHANMA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AHNHHPHANMA buildPartial() {
      POGOProtos.Rpc.AHNHHPHANMA result = new POGOProtos.Rpc.AHNHHPHANMA(this);
      int from_bitField0_ = bitField0_;
      result.mhndbiddbgh_ = mhndbiddbgh_;
      if (bnchobmfppoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bnchobmfppo_ = java.util.Collections.unmodifiableList(bnchobmfppo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bnchobmfppo_ = bnchobmfppo_;
      } else {
        result.bnchobmfppo_ = bnchobmfppoBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.AHNHHPHANMA) {
        return mergeFrom((POGOProtos.Rpc.AHNHHPHANMA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AHNHHPHANMA other) {
      if (other == POGOProtos.Rpc.AHNHHPHANMA.getDefaultInstance()) return this;
      if (!other.getMhndbiddbgh().isEmpty()) {
        mhndbiddbgh_ = other.mhndbiddbgh_;
        onChanged();
      }
      if (bnchobmfppoBuilder_ == null) {
        if (!other.bnchobmfppo_.isEmpty()) {
          if (bnchobmfppo_.isEmpty()) {
            bnchobmfppo_ = other.bnchobmfppo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBnchobmfppoIsMutable();
            bnchobmfppo_.addAll(other.bnchobmfppo_);
          }
          onChanged();
        }
      } else {
        if (!other.bnchobmfppo_.isEmpty()) {
          if (bnchobmfppoBuilder_.isEmpty()) {
            bnchobmfppoBuilder_.dispose();
            bnchobmfppoBuilder_ = null;
            bnchobmfppo_ = other.bnchobmfppo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bnchobmfppoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBnchobmfppoFieldBuilder() : null;
          } else {
            bnchobmfppoBuilder_.addAllMessages(other.bnchobmfppo_);
          }
        }
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
      POGOProtos.Rpc.AHNHHPHANMA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AHNHHPHANMA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object mhndbiddbgh_ = "";
    /**
     * <code>string mhndbiddbgh = 1;</code>
     * @return The mhndbiddbgh.
     */
    public java.lang.String getMhndbiddbgh() {
      java.lang.Object ref = mhndbiddbgh_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mhndbiddbgh_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mhndbiddbgh = 1;</code>
     * @return The bytes for mhndbiddbgh.
     */
    public com.google.protobuf.ByteString
        getMhndbiddbghBytes() {
      java.lang.Object ref = mhndbiddbgh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mhndbiddbgh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mhndbiddbgh = 1;</code>
     * @param value The mhndbiddbgh to set.
     * @return This builder for chaining.
     */
    public Builder setMhndbiddbgh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mhndbiddbgh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mhndbiddbgh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhndbiddbgh() {
      
      mhndbiddbgh_ = getDefaultInstance().getMhndbiddbgh();
      onChanged();
      return this;
    }
    /**
     * <code>string mhndbiddbgh = 1;</code>
     * @param value The bytes for mhndbiddbgh to set.
     * @return This builder for chaining.
     */
    public Builder setMhndbiddbghBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mhndbiddbgh_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG> bnchobmfppo_ =
      java.util.Collections.emptyList();
    private void ensureBnchobmfppoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bnchobmfppo_ = new java.util.ArrayList<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG>(bnchobmfppo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder> bnchobmfppoBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG> getBnchobmfppoList() {
      if (bnchobmfppoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bnchobmfppo_);
      } else {
        return bnchobmfppoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public int getBnchobmfppoCount() {
      if (bnchobmfppoBuilder_ == null) {
        return bnchobmfppo_.size();
      } else {
        return bnchobmfppoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG getBnchobmfppo(int index) {
      if (bnchobmfppoBuilder_ == null) {
        return bnchobmfppo_.get(index);
      } else {
        return bnchobmfppoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder setBnchobmfppo(
        int index, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG value) {
      if (bnchobmfppoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.set(index, value);
        onChanged();
      } else {
        bnchobmfppoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder setBnchobmfppo(
        int index, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder builderForValue) {
      if (bnchobmfppoBuilder_ == null) {
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.set(index, builderForValue.build());
        onChanged();
      } else {
        bnchobmfppoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder addBnchobmfppo(POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG value) {
      if (bnchobmfppoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.add(value);
        onChanged();
      } else {
        bnchobmfppoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder addBnchobmfppo(
        int index, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG value) {
      if (bnchobmfppoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.add(index, value);
        onChanged();
      } else {
        bnchobmfppoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder addBnchobmfppo(
        POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder builderForValue) {
      if (bnchobmfppoBuilder_ == null) {
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.add(builderForValue.build());
        onChanged();
      } else {
        bnchobmfppoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder addBnchobmfppo(
        int index, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder builderForValue) {
      if (bnchobmfppoBuilder_ == null) {
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.add(index, builderForValue.build());
        onChanged();
      } else {
        bnchobmfppoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder addAllBnchobmfppo(
        java.lang.Iterable<? extends POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG> values) {
      if (bnchobmfppoBuilder_ == null) {
        ensureBnchobmfppoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bnchobmfppo_);
        onChanged();
      } else {
        bnchobmfppoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder clearBnchobmfppo() {
      if (bnchobmfppoBuilder_ == null) {
        bnchobmfppo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bnchobmfppoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public Builder removeBnchobmfppo(int index) {
      if (bnchobmfppoBuilder_ == null) {
        ensureBnchobmfppoIsMutable();
        bnchobmfppo_.remove(index);
        onChanged();
      } else {
        bnchobmfppoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder getBnchobmfppoBuilder(
        int index) {
      return getBnchobmfppoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder getBnchobmfppoOrBuilder(
        int index) {
      if (bnchobmfppoBuilder_ == null) {
        return bnchobmfppo_.get(index);  } else {
        return bnchobmfppoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder> 
         getBnchobmfppoOrBuilderList() {
      if (bnchobmfppoBuilder_ != null) {
        return bnchobmfppoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bnchobmfppo_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder addBnchobmfppoBuilder() {
      return getBnchobmfppoFieldBuilder().addBuilder(
          POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder addBnchobmfppoBuilder(
        int index) {
      return getBnchobmfppoFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG bnchobmfppo = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder> 
         getBnchobmfppoBuilderList() {
      return getBnchobmfppoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder> 
        getBnchobmfppoFieldBuilder() {
      if (bnchobmfppoBuilder_ == null) {
        bnchobmfppoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMG.Builder, POGOProtos.Rpc.DPJDBFKKFOK.LAMABCFBFMGOrBuilder>(
                bnchobmfppo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bnchobmfppo_ = null;
      }
      return bnchobmfppoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AHNHHPHANMA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AHNHHPHANMA)
  private static final POGOProtos.Rpc.AHNHHPHANMA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AHNHHPHANMA();
  }

  public static POGOProtos.Rpc.AHNHHPHANMA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AHNHHPHANMA>
      PARSER = new com.google.protobuf.AbstractParser<AHNHHPHANMA>() {
    @java.lang.Override
    public AHNHHPHANMA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AHNHHPHANMA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AHNHHPHANMA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AHNHHPHANMA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AHNHHPHANMA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

