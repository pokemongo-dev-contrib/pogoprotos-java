// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CAKEEMLEKII
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CAKEEMLEKII}
 */
public final class CAKEEMLEKII extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CAKEEMLEKII)
    CAKEEMLEKIIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CAKEEMLEKII.newBuilder() to construct.
  private CAKEEMLEKII(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CAKEEMLEKII() {
    bpfiilkeeef_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CAKEEMLEKII();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CAKEEMLEKII(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bpfiilkeeef_ = new java.util.ArrayList<POGOProtos.Rpc.MEJNJHIMCDG>();
              mutable_bitField0_ |= 0x00000001;
            }
            bpfiilkeeef_.add(
                input.readMessage(POGOProtos.Rpc.MEJNJHIMCDG.parser(), extensionRegistry));
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
        bpfiilkeeef_ = java.util.Collections.unmodifiableList(bpfiilkeeef_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAKEEMLEKII_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAKEEMLEKII_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CAKEEMLEKII.class, POGOProtos.Rpc.CAKEEMLEKII.Builder.class);
  }

  public static final int BPFIILKEEEF_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.MEJNJHIMCDG> bpfiilkeeef_;
  /**
   * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.MEJNJHIMCDG> getBpfiilkeeefList() {
    return bpfiilkeeef_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.MEJNJHIMCDGOrBuilder> 
      getBpfiilkeeefOrBuilderList() {
    return bpfiilkeeef_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
   */
  @java.lang.Override
  public int getBpfiilkeeefCount() {
    return bpfiilkeeef_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MEJNJHIMCDG getBpfiilkeeef(int index) {
    return bpfiilkeeef_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MEJNJHIMCDGOrBuilder getBpfiilkeeefOrBuilder(
      int index) {
    return bpfiilkeeef_.get(index);
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
    for (int i = 0; i < bpfiilkeeef_.size(); i++) {
      output.writeMessage(1, bpfiilkeeef_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bpfiilkeeef_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bpfiilkeeef_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.CAKEEMLEKII)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CAKEEMLEKII other = (POGOProtos.Rpc.CAKEEMLEKII) obj;

    if (!getBpfiilkeeefList()
        .equals(other.getBpfiilkeeefList())) return false;
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
    if (getBpfiilkeeefCount() > 0) {
      hash = (37 * hash) + BPFIILKEEEF_FIELD_NUMBER;
      hash = (53 * hash) + getBpfiilkeeefList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAKEEMLEKII parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CAKEEMLEKII prototype) {
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
   * ref: CAKEEMLEKII
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CAKEEMLEKII}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CAKEEMLEKII)
      POGOProtos.Rpc.CAKEEMLEKIIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAKEEMLEKII_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAKEEMLEKII_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CAKEEMLEKII.class, POGOProtos.Rpc.CAKEEMLEKII.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CAKEEMLEKII.newBuilder()
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
        getBpfiilkeeefFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bpfiilkeeefBuilder_ == null) {
        bpfiilkeeef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bpfiilkeeefBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAKEEMLEKII_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAKEEMLEKII getDefaultInstanceForType() {
      return POGOProtos.Rpc.CAKEEMLEKII.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAKEEMLEKII build() {
      POGOProtos.Rpc.CAKEEMLEKII result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAKEEMLEKII buildPartial() {
      POGOProtos.Rpc.CAKEEMLEKII result = new POGOProtos.Rpc.CAKEEMLEKII(this);
      int from_bitField0_ = bitField0_;
      if (bpfiilkeeefBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bpfiilkeeef_ = java.util.Collections.unmodifiableList(bpfiilkeeef_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bpfiilkeeef_ = bpfiilkeeef_;
      } else {
        result.bpfiilkeeef_ = bpfiilkeeefBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CAKEEMLEKII) {
        return mergeFrom((POGOProtos.Rpc.CAKEEMLEKII)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CAKEEMLEKII other) {
      if (other == POGOProtos.Rpc.CAKEEMLEKII.getDefaultInstance()) return this;
      if (bpfiilkeeefBuilder_ == null) {
        if (!other.bpfiilkeeef_.isEmpty()) {
          if (bpfiilkeeef_.isEmpty()) {
            bpfiilkeeef_ = other.bpfiilkeeef_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBpfiilkeeefIsMutable();
            bpfiilkeeef_.addAll(other.bpfiilkeeef_);
          }
          onChanged();
        }
      } else {
        if (!other.bpfiilkeeef_.isEmpty()) {
          if (bpfiilkeeefBuilder_.isEmpty()) {
            bpfiilkeeefBuilder_.dispose();
            bpfiilkeeefBuilder_ = null;
            bpfiilkeeef_ = other.bpfiilkeeef_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bpfiilkeeefBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBpfiilkeeefFieldBuilder() : null;
          } else {
            bpfiilkeeefBuilder_.addAllMessages(other.bpfiilkeeef_);
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
      POGOProtos.Rpc.CAKEEMLEKII parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CAKEEMLEKII) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.MEJNJHIMCDG> bpfiilkeeef_ =
      java.util.Collections.emptyList();
    private void ensureBpfiilkeeefIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bpfiilkeeef_ = new java.util.ArrayList<POGOProtos.Rpc.MEJNJHIMCDG>(bpfiilkeeef_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MEJNJHIMCDG, POGOProtos.Rpc.MEJNJHIMCDG.Builder, POGOProtos.Rpc.MEJNJHIMCDGOrBuilder> bpfiilkeeefBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.MEJNJHIMCDG> getBpfiilkeeefList() {
      if (bpfiilkeeefBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bpfiilkeeef_);
      } else {
        return bpfiilkeeefBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public int getBpfiilkeeefCount() {
      if (bpfiilkeeefBuilder_ == null) {
        return bpfiilkeeef_.size();
      } else {
        return bpfiilkeeefBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public POGOProtos.Rpc.MEJNJHIMCDG getBpfiilkeeef(int index) {
      if (bpfiilkeeefBuilder_ == null) {
        return bpfiilkeeef_.get(index);
      } else {
        return bpfiilkeeefBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder setBpfiilkeeef(
        int index, POGOProtos.Rpc.MEJNJHIMCDG value) {
      if (bpfiilkeeefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.set(index, value);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder setBpfiilkeeef(
        int index, POGOProtos.Rpc.MEJNJHIMCDG.Builder builderForValue) {
      if (bpfiilkeeefBuilder_ == null) {
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.set(index, builderForValue.build());
        onChanged();
      } else {
        bpfiilkeeefBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder addBpfiilkeeef(POGOProtos.Rpc.MEJNJHIMCDG value) {
      if (bpfiilkeeefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.add(value);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder addBpfiilkeeef(
        int index, POGOProtos.Rpc.MEJNJHIMCDG value) {
      if (bpfiilkeeefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.add(index, value);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder addBpfiilkeeef(
        POGOProtos.Rpc.MEJNJHIMCDG.Builder builderForValue) {
      if (bpfiilkeeefBuilder_ == null) {
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.add(builderForValue.build());
        onChanged();
      } else {
        bpfiilkeeefBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder addBpfiilkeeef(
        int index, POGOProtos.Rpc.MEJNJHIMCDG.Builder builderForValue) {
      if (bpfiilkeeefBuilder_ == null) {
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.add(index, builderForValue.build());
        onChanged();
      } else {
        bpfiilkeeefBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder addAllBpfiilkeeef(
        java.lang.Iterable<? extends POGOProtos.Rpc.MEJNJHIMCDG> values) {
      if (bpfiilkeeefBuilder_ == null) {
        ensureBpfiilkeeefIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bpfiilkeeef_);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder clearBpfiilkeeef() {
      if (bpfiilkeeefBuilder_ == null) {
        bpfiilkeeef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public Builder removeBpfiilkeeef(int index) {
      if (bpfiilkeeefBuilder_ == null) {
        ensureBpfiilkeeefIsMutable();
        bpfiilkeeef_.remove(index);
        onChanged();
      } else {
        bpfiilkeeefBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public POGOProtos.Rpc.MEJNJHIMCDG.Builder getBpfiilkeeefBuilder(
        int index) {
      return getBpfiilkeeefFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public POGOProtos.Rpc.MEJNJHIMCDGOrBuilder getBpfiilkeeefOrBuilder(
        int index) {
      if (bpfiilkeeefBuilder_ == null) {
        return bpfiilkeeef_.get(index);  } else {
        return bpfiilkeeefBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.MEJNJHIMCDGOrBuilder> 
         getBpfiilkeeefOrBuilderList() {
      if (bpfiilkeeefBuilder_ != null) {
        return bpfiilkeeefBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bpfiilkeeef_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public POGOProtos.Rpc.MEJNJHIMCDG.Builder addBpfiilkeeefBuilder() {
      return getBpfiilkeeefFieldBuilder().addBuilder(
          POGOProtos.Rpc.MEJNJHIMCDG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public POGOProtos.Rpc.MEJNJHIMCDG.Builder addBpfiilkeeefBuilder(
        int index) {
      return getBpfiilkeeefFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.MEJNJHIMCDG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MEJNJHIMCDG bpfiilkeeef = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.MEJNJHIMCDG.Builder> 
         getBpfiilkeeefBuilderList() {
      return getBpfiilkeeefFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MEJNJHIMCDG, POGOProtos.Rpc.MEJNJHIMCDG.Builder, POGOProtos.Rpc.MEJNJHIMCDGOrBuilder> 
        getBpfiilkeeefFieldBuilder() {
      if (bpfiilkeeefBuilder_ == null) {
        bpfiilkeeefBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.MEJNJHIMCDG, POGOProtos.Rpc.MEJNJHIMCDG.Builder, POGOProtos.Rpc.MEJNJHIMCDGOrBuilder>(
                bpfiilkeeef_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bpfiilkeeef_ = null;
      }
      return bpfiilkeeefBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CAKEEMLEKII)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CAKEEMLEKII)
  private static final POGOProtos.Rpc.CAKEEMLEKII DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CAKEEMLEKII();
  }

  public static POGOProtos.Rpc.CAKEEMLEKII getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CAKEEMLEKII>
      PARSER = new com.google.protobuf.AbstractParser<CAKEEMLEKII>() {
    @java.lang.Override
    public CAKEEMLEKII parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CAKEEMLEKII(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CAKEEMLEKII> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CAKEEMLEKII> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CAKEEMLEKII getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

