// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LMDAFALECKL}
 */
public  final class LMDAFALECKL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LMDAFALECKL)
    LMDAFALECKLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LMDAFALECKL.newBuilder() to construct.
  private LMDAFALECKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LMDAFALECKL() {
    eoidbcikaco_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LMDAFALECKL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LMDAFALECKL(
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
          case 24: {

            ofldmobnklp_ = input.readInt32();
            break;
          }
          case 32: {

            knkopacllnd_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              eoidbcikaco_ = new java.util.ArrayList<POGOProtos.Rpc.ANHHBPLMIHO>();
              mutable_bitField0_ |= 0x00000001;
            }
            eoidbcikaco_.add(
                input.readMessage(POGOProtos.Rpc.ANHHBPLMIHO.parser(), extensionRegistry));
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
        eoidbcikaco_ = java.util.Collections.unmodifiableList(eoidbcikaco_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMDAFALECKL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMDAFALECKL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LMDAFALECKL.class, POGOProtos.Rpc.LMDAFALECKL.Builder.class);
  }

  public static final int OFLDMOBNKLP_FIELD_NUMBER = 3;
  private int ofldmobnklp_;
  /**
   * <code>int32 ofldmobnklp = 3;</code>
   * @return The ofldmobnklp.
   */
  public int getOfldmobnklp() {
    return ofldmobnklp_;
  }

  public static final int KNKOPACLLND_FIELD_NUMBER = 4;
  private int knkopacllnd_;
  /**
   * <code>int32 knkopacllnd = 4;</code>
   * @return The knkopacllnd.
   */
  public int getKnkopacllnd() {
    return knkopacllnd_;
  }

  public static final int EOIDBCIKACO_FIELD_NUMBER = 5;
  private java.util.List<POGOProtos.Rpc.ANHHBPLMIHO> eoidbcikaco_;
  /**
   * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
   */
  public java.util.List<POGOProtos.Rpc.ANHHBPLMIHO> getEoidbcikacoList() {
    return eoidbcikaco_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.ANHHBPLMIHOOrBuilder> 
      getEoidbcikacoOrBuilderList() {
    return eoidbcikaco_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
   */
  public int getEoidbcikacoCount() {
    return eoidbcikaco_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
   */
  public POGOProtos.Rpc.ANHHBPLMIHO getEoidbcikaco(int index) {
    return eoidbcikaco_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
   */
  public POGOProtos.Rpc.ANHHBPLMIHOOrBuilder getEoidbcikacoOrBuilder(
      int index) {
    return eoidbcikaco_.get(index);
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
    if (ofldmobnklp_ != 0) {
      output.writeInt32(3, ofldmobnklp_);
    }
    if (knkopacllnd_ != 0) {
      output.writeInt32(4, knkopacllnd_);
    }
    for (int i = 0; i < eoidbcikaco_.size(); i++) {
      output.writeMessage(5, eoidbcikaco_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ofldmobnklp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ofldmobnklp_);
    }
    if (knkopacllnd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, knkopacllnd_);
    }
    for (int i = 0; i < eoidbcikaco_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, eoidbcikaco_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.LMDAFALECKL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LMDAFALECKL other = (POGOProtos.Rpc.LMDAFALECKL) obj;

    if (getOfldmobnklp()
        != other.getOfldmobnklp()) return false;
    if (getKnkopacllnd()
        != other.getKnkopacllnd()) return false;
    if (!getEoidbcikacoList()
        .equals(other.getEoidbcikacoList())) return false;
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
    hash = (37 * hash) + OFLDMOBNKLP_FIELD_NUMBER;
    hash = (53 * hash) + getOfldmobnklp();
    hash = (37 * hash) + KNKOPACLLND_FIELD_NUMBER;
    hash = (53 * hash) + getKnkopacllnd();
    if (getEoidbcikacoCount() > 0) {
      hash = (37 * hash) + EOIDBCIKACO_FIELD_NUMBER;
      hash = (53 * hash) + getEoidbcikacoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMDAFALECKL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LMDAFALECKL prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LMDAFALECKL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LMDAFALECKL)
      POGOProtos.Rpc.LMDAFALECKLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMDAFALECKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMDAFALECKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LMDAFALECKL.class, POGOProtos.Rpc.LMDAFALECKL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LMDAFALECKL.newBuilder()
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
        getEoidbcikacoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ofldmobnklp_ = 0;

      knkopacllnd_ = 0;

      if (eoidbcikacoBuilder_ == null) {
        eoidbcikaco_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        eoidbcikacoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMDAFALECKL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMDAFALECKL getDefaultInstanceForType() {
      return POGOProtos.Rpc.LMDAFALECKL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMDAFALECKL build() {
      POGOProtos.Rpc.LMDAFALECKL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMDAFALECKL buildPartial() {
      POGOProtos.Rpc.LMDAFALECKL result = new POGOProtos.Rpc.LMDAFALECKL(this);
      int from_bitField0_ = bitField0_;
      result.ofldmobnklp_ = ofldmobnklp_;
      result.knkopacllnd_ = knkopacllnd_;
      if (eoidbcikacoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          eoidbcikaco_ = java.util.Collections.unmodifiableList(eoidbcikaco_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eoidbcikaco_ = eoidbcikaco_;
      } else {
        result.eoidbcikaco_ = eoidbcikacoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.LMDAFALECKL) {
        return mergeFrom((POGOProtos.Rpc.LMDAFALECKL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LMDAFALECKL other) {
      if (other == POGOProtos.Rpc.LMDAFALECKL.getDefaultInstance()) return this;
      if (other.getOfldmobnklp() != 0) {
        setOfldmobnklp(other.getOfldmobnklp());
      }
      if (other.getKnkopacllnd() != 0) {
        setKnkopacllnd(other.getKnkopacllnd());
      }
      if (eoidbcikacoBuilder_ == null) {
        if (!other.eoidbcikaco_.isEmpty()) {
          if (eoidbcikaco_.isEmpty()) {
            eoidbcikaco_ = other.eoidbcikaco_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEoidbcikacoIsMutable();
            eoidbcikaco_.addAll(other.eoidbcikaco_);
          }
          onChanged();
        }
      } else {
        if (!other.eoidbcikaco_.isEmpty()) {
          if (eoidbcikacoBuilder_.isEmpty()) {
            eoidbcikacoBuilder_.dispose();
            eoidbcikacoBuilder_ = null;
            eoidbcikaco_ = other.eoidbcikaco_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eoidbcikacoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEoidbcikacoFieldBuilder() : null;
          } else {
            eoidbcikacoBuilder_.addAllMessages(other.eoidbcikaco_);
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
      POGOProtos.Rpc.LMDAFALECKL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LMDAFALECKL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int ofldmobnklp_ ;
    /**
     * <code>int32 ofldmobnklp = 3;</code>
     * @return The ofldmobnklp.
     */
    public int getOfldmobnklp() {
      return ofldmobnklp_;
    }
    /**
     * <code>int32 ofldmobnklp = 3;</code>
     * @param value The ofldmobnklp to set.
     * @return This builder for chaining.
     */
    public Builder setOfldmobnklp(int value) {
      
      ofldmobnklp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ofldmobnklp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfldmobnklp() {
      
      ofldmobnklp_ = 0;
      onChanged();
      return this;
    }

    private int knkopacllnd_ ;
    /**
     * <code>int32 knkopacllnd = 4;</code>
     * @return The knkopacllnd.
     */
    public int getKnkopacllnd() {
      return knkopacllnd_;
    }
    /**
     * <code>int32 knkopacllnd = 4;</code>
     * @param value The knkopacllnd to set.
     * @return This builder for chaining.
     */
    public Builder setKnkopacllnd(int value) {
      
      knkopacllnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 knkopacllnd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKnkopacllnd() {
      
      knkopacllnd_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.ANHHBPLMIHO> eoidbcikaco_ =
      java.util.Collections.emptyList();
    private void ensureEoidbcikacoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eoidbcikaco_ = new java.util.ArrayList<POGOProtos.Rpc.ANHHBPLMIHO>(eoidbcikaco_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ANHHBPLMIHO, POGOProtos.Rpc.ANHHBPLMIHO.Builder, POGOProtos.Rpc.ANHHBPLMIHOOrBuilder> eoidbcikacoBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public java.util.List<POGOProtos.Rpc.ANHHBPLMIHO> getEoidbcikacoList() {
      if (eoidbcikacoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eoidbcikaco_);
      } else {
        return eoidbcikacoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public int getEoidbcikacoCount() {
      if (eoidbcikacoBuilder_ == null) {
        return eoidbcikaco_.size();
      } else {
        return eoidbcikacoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public POGOProtos.Rpc.ANHHBPLMIHO getEoidbcikaco(int index) {
      if (eoidbcikacoBuilder_ == null) {
        return eoidbcikaco_.get(index);
      } else {
        return eoidbcikacoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder setEoidbcikaco(
        int index, POGOProtos.Rpc.ANHHBPLMIHO value) {
      if (eoidbcikacoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.set(index, value);
        onChanged();
      } else {
        eoidbcikacoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder setEoidbcikaco(
        int index, POGOProtos.Rpc.ANHHBPLMIHO.Builder builderForValue) {
      if (eoidbcikacoBuilder_ == null) {
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.set(index, builderForValue.build());
        onChanged();
      } else {
        eoidbcikacoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder addEoidbcikaco(POGOProtos.Rpc.ANHHBPLMIHO value) {
      if (eoidbcikacoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.add(value);
        onChanged();
      } else {
        eoidbcikacoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder addEoidbcikaco(
        int index, POGOProtos.Rpc.ANHHBPLMIHO value) {
      if (eoidbcikacoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.add(index, value);
        onChanged();
      } else {
        eoidbcikacoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder addEoidbcikaco(
        POGOProtos.Rpc.ANHHBPLMIHO.Builder builderForValue) {
      if (eoidbcikacoBuilder_ == null) {
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.add(builderForValue.build());
        onChanged();
      } else {
        eoidbcikacoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder addEoidbcikaco(
        int index, POGOProtos.Rpc.ANHHBPLMIHO.Builder builderForValue) {
      if (eoidbcikacoBuilder_ == null) {
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.add(index, builderForValue.build());
        onChanged();
      } else {
        eoidbcikacoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder addAllEoidbcikaco(
        java.lang.Iterable<? extends POGOProtos.Rpc.ANHHBPLMIHO> values) {
      if (eoidbcikacoBuilder_ == null) {
        ensureEoidbcikacoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eoidbcikaco_);
        onChanged();
      } else {
        eoidbcikacoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder clearEoidbcikaco() {
      if (eoidbcikacoBuilder_ == null) {
        eoidbcikaco_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eoidbcikacoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public Builder removeEoidbcikaco(int index) {
      if (eoidbcikacoBuilder_ == null) {
        ensureEoidbcikacoIsMutable();
        eoidbcikaco_.remove(index);
        onChanged();
      } else {
        eoidbcikacoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public POGOProtos.Rpc.ANHHBPLMIHO.Builder getEoidbcikacoBuilder(
        int index) {
      return getEoidbcikacoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public POGOProtos.Rpc.ANHHBPLMIHOOrBuilder getEoidbcikacoOrBuilder(
        int index) {
      if (eoidbcikacoBuilder_ == null) {
        return eoidbcikaco_.get(index);  } else {
        return eoidbcikacoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.ANHHBPLMIHOOrBuilder> 
         getEoidbcikacoOrBuilderList() {
      if (eoidbcikacoBuilder_ != null) {
        return eoidbcikacoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eoidbcikaco_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public POGOProtos.Rpc.ANHHBPLMIHO.Builder addEoidbcikacoBuilder() {
      return getEoidbcikacoFieldBuilder().addBuilder(
          POGOProtos.Rpc.ANHHBPLMIHO.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public POGOProtos.Rpc.ANHHBPLMIHO.Builder addEoidbcikacoBuilder(
        int index) {
      return getEoidbcikacoFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.ANHHBPLMIHO.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ANHHBPLMIHO eoidbcikaco = 5;</code>
     */
    public java.util.List<POGOProtos.Rpc.ANHHBPLMIHO.Builder> 
         getEoidbcikacoBuilderList() {
      return getEoidbcikacoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ANHHBPLMIHO, POGOProtos.Rpc.ANHHBPLMIHO.Builder, POGOProtos.Rpc.ANHHBPLMIHOOrBuilder> 
        getEoidbcikacoFieldBuilder() {
      if (eoidbcikacoBuilder_ == null) {
        eoidbcikacoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.ANHHBPLMIHO, POGOProtos.Rpc.ANHHBPLMIHO.Builder, POGOProtos.Rpc.ANHHBPLMIHOOrBuilder>(
                eoidbcikaco_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        eoidbcikaco_ = null;
      }
      return eoidbcikacoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LMDAFALECKL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LMDAFALECKL)
  private static final POGOProtos.Rpc.LMDAFALECKL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LMDAFALECKL();
  }

  public static POGOProtos.Rpc.LMDAFALECKL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LMDAFALECKL>
      PARSER = new com.google.protobuf.AbstractParser<LMDAFALECKL>() {
    @java.lang.Override
    public LMDAFALECKL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LMDAFALECKL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LMDAFALECKL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LMDAFALECKL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LMDAFALECKL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

