// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NKGFAGOKMJP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NKGFAGOKMJP}
 */
public final class NKGFAGOKMJP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NKGFAGOKMJP)
    NKGFAGOKMJPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NKGFAGOKMJP.newBuilder() to construct.
  private NKGFAGOKMJP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NKGFAGOKMJP() {
    gpebgfnodmg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NKGFAGOKMJP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NKGFAGOKMJP(
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
              gpebgfnodmg_ = new java.util.ArrayList<POGOProtos.Rpc.BEBFKGBHLDN>();
              mutable_bitField0_ |= 0x00000001;
            }
            gpebgfnodmg_.add(
                input.readMessage(POGOProtos.Rpc.BEBFKGBHLDN.parser(), extensionRegistry));
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
        gpebgfnodmg_ = java.util.Collections.unmodifiableList(gpebgfnodmg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NKGFAGOKMJP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NKGFAGOKMJP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NKGFAGOKMJP.class, POGOProtos.Rpc.NKGFAGOKMJP.Builder.class);
  }

  public static final int GPEBGFNODMG_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.BEBFKGBHLDN> gpebgfnodmg_;
  /**
   * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BEBFKGBHLDN> getGpebgfnodmgList() {
    return gpebgfnodmg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.BEBFKGBHLDNOrBuilder> 
      getGpebgfnodmgOrBuilderList() {
    return gpebgfnodmg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
   */
  @java.lang.Override
  public int getGpebgfnodmgCount() {
    return gpebgfnodmg_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BEBFKGBHLDN getGpebgfnodmg(int index) {
    return gpebgfnodmg_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BEBFKGBHLDNOrBuilder getGpebgfnodmgOrBuilder(
      int index) {
    return gpebgfnodmg_.get(index);
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
    for (int i = 0; i < gpebgfnodmg_.size(); i++) {
      output.writeMessage(1, gpebgfnodmg_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < gpebgfnodmg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, gpebgfnodmg_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.NKGFAGOKMJP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NKGFAGOKMJP other = (POGOProtos.Rpc.NKGFAGOKMJP) obj;

    if (!getGpebgfnodmgList()
        .equals(other.getGpebgfnodmgList())) return false;
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
    if (getGpebgfnodmgCount() > 0) {
      hash = (37 * hash) + GPEBGFNODMG_FIELD_NUMBER;
      hash = (53 * hash) + getGpebgfnodmgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NKGFAGOKMJP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NKGFAGOKMJP prototype) {
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
   * ref: NKGFAGOKMJP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NKGFAGOKMJP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NKGFAGOKMJP)
      POGOProtos.Rpc.NKGFAGOKMJPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NKGFAGOKMJP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NKGFAGOKMJP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NKGFAGOKMJP.class, POGOProtos.Rpc.NKGFAGOKMJP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NKGFAGOKMJP.newBuilder()
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
        getGpebgfnodmgFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gpebgfnodmgBuilder_ == null) {
        gpebgfnodmg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        gpebgfnodmgBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NKGFAGOKMJP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NKGFAGOKMJP getDefaultInstanceForType() {
      return POGOProtos.Rpc.NKGFAGOKMJP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NKGFAGOKMJP build() {
      POGOProtos.Rpc.NKGFAGOKMJP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NKGFAGOKMJP buildPartial() {
      POGOProtos.Rpc.NKGFAGOKMJP result = new POGOProtos.Rpc.NKGFAGOKMJP(this);
      int from_bitField0_ = bitField0_;
      if (gpebgfnodmgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          gpebgfnodmg_ = java.util.Collections.unmodifiableList(gpebgfnodmg_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gpebgfnodmg_ = gpebgfnodmg_;
      } else {
        result.gpebgfnodmg_ = gpebgfnodmgBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NKGFAGOKMJP) {
        return mergeFrom((POGOProtos.Rpc.NKGFAGOKMJP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NKGFAGOKMJP other) {
      if (other == POGOProtos.Rpc.NKGFAGOKMJP.getDefaultInstance()) return this;
      if (gpebgfnodmgBuilder_ == null) {
        if (!other.gpebgfnodmg_.isEmpty()) {
          if (gpebgfnodmg_.isEmpty()) {
            gpebgfnodmg_ = other.gpebgfnodmg_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGpebgfnodmgIsMutable();
            gpebgfnodmg_.addAll(other.gpebgfnodmg_);
          }
          onChanged();
        }
      } else {
        if (!other.gpebgfnodmg_.isEmpty()) {
          if (gpebgfnodmgBuilder_.isEmpty()) {
            gpebgfnodmgBuilder_.dispose();
            gpebgfnodmgBuilder_ = null;
            gpebgfnodmg_ = other.gpebgfnodmg_;
            bitField0_ = (bitField0_ & ~0x00000001);
            gpebgfnodmgBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGpebgfnodmgFieldBuilder() : null;
          } else {
            gpebgfnodmgBuilder_.addAllMessages(other.gpebgfnodmg_);
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
      POGOProtos.Rpc.NKGFAGOKMJP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NKGFAGOKMJP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.BEBFKGBHLDN> gpebgfnodmg_ =
      java.util.Collections.emptyList();
    private void ensureGpebgfnodmgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gpebgfnodmg_ = new java.util.ArrayList<POGOProtos.Rpc.BEBFKGBHLDN>(gpebgfnodmg_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BEBFKGBHLDN, POGOProtos.Rpc.BEBFKGBHLDN.Builder, POGOProtos.Rpc.BEBFKGBHLDNOrBuilder> gpebgfnodmgBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BEBFKGBHLDN> getGpebgfnodmgList() {
      if (gpebgfnodmgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gpebgfnodmg_);
      } else {
        return gpebgfnodmgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public int getGpebgfnodmgCount() {
      if (gpebgfnodmgBuilder_ == null) {
        return gpebgfnodmg_.size();
      } else {
        return gpebgfnodmgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public POGOProtos.Rpc.BEBFKGBHLDN getGpebgfnodmg(int index) {
      if (gpebgfnodmgBuilder_ == null) {
        return gpebgfnodmg_.get(index);
      } else {
        return gpebgfnodmgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder setGpebgfnodmg(
        int index, POGOProtos.Rpc.BEBFKGBHLDN value) {
      if (gpebgfnodmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.set(index, value);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder setGpebgfnodmg(
        int index, POGOProtos.Rpc.BEBFKGBHLDN.Builder builderForValue) {
      if (gpebgfnodmgBuilder_ == null) {
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.set(index, builderForValue.build());
        onChanged();
      } else {
        gpebgfnodmgBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder addGpebgfnodmg(POGOProtos.Rpc.BEBFKGBHLDN value) {
      if (gpebgfnodmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.add(value);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder addGpebgfnodmg(
        int index, POGOProtos.Rpc.BEBFKGBHLDN value) {
      if (gpebgfnodmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.add(index, value);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder addGpebgfnodmg(
        POGOProtos.Rpc.BEBFKGBHLDN.Builder builderForValue) {
      if (gpebgfnodmgBuilder_ == null) {
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.add(builderForValue.build());
        onChanged();
      } else {
        gpebgfnodmgBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder addGpebgfnodmg(
        int index, POGOProtos.Rpc.BEBFKGBHLDN.Builder builderForValue) {
      if (gpebgfnodmgBuilder_ == null) {
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.add(index, builderForValue.build());
        onChanged();
      } else {
        gpebgfnodmgBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder addAllGpebgfnodmg(
        java.lang.Iterable<? extends POGOProtos.Rpc.BEBFKGBHLDN> values) {
      if (gpebgfnodmgBuilder_ == null) {
        ensureGpebgfnodmgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gpebgfnodmg_);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder clearGpebgfnodmg() {
      if (gpebgfnodmgBuilder_ == null) {
        gpebgfnodmg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public Builder removeGpebgfnodmg(int index) {
      if (gpebgfnodmgBuilder_ == null) {
        ensureGpebgfnodmgIsMutable();
        gpebgfnodmg_.remove(index);
        onChanged();
      } else {
        gpebgfnodmgBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public POGOProtos.Rpc.BEBFKGBHLDN.Builder getGpebgfnodmgBuilder(
        int index) {
      return getGpebgfnodmgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public POGOProtos.Rpc.BEBFKGBHLDNOrBuilder getGpebgfnodmgOrBuilder(
        int index) {
      if (gpebgfnodmgBuilder_ == null) {
        return gpebgfnodmg_.get(index);  } else {
        return gpebgfnodmgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BEBFKGBHLDNOrBuilder> 
         getGpebgfnodmgOrBuilderList() {
      if (gpebgfnodmgBuilder_ != null) {
        return gpebgfnodmgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gpebgfnodmg_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public POGOProtos.Rpc.BEBFKGBHLDN.Builder addGpebgfnodmgBuilder() {
      return getGpebgfnodmgFieldBuilder().addBuilder(
          POGOProtos.Rpc.BEBFKGBHLDN.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public POGOProtos.Rpc.BEBFKGBHLDN.Builder addGpebgfnodmgBuilder(
        int index) {
      return getGpebgfnodmgFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BEBFKGBHLDN.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BEBFKGBHLDN gpebgfnodmg = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BEBFKGBHLDN.Builder> 
         getGpebgfnodmgBuilderList() {
      return getGpebgfnodmgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BEBFKGBHLDN, POGOProtos.Rpc.BEBFKGBHLDN.Builder, POGOProtos.Rpc.BEBFKGBHLDNOrBuilder> 
        getGpebgfnodmgFieldBuilder() {
      if (gpebgfnodmgBuilder_ == null) {
        gpebgfnodmgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BEBFKGBHLDN, POGOProtos.Rpc.BEBFKGBHLDN.Builder, POGOProtos.Rpc.BEBFKGBHLDNOrBuilder>(
                gpebgfnodmg_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        gpebgfnodmg_ = null;
      }
      return gpebgfnodmgBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NKGFAGOKMJP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NKGFAGOKMJP)
  private static final POGOProtos.Rpc.NKGFAGOKMJP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NKGFAGOKMJP();
  }

  public static POGOProtos.Rpc.NKGFAGOKMJP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NKGFAGOKMJP>
      PARSER = new com.google.protobuf.AbstractParser<NKGFAGOKMJP>() {
    @java.lang.Override
    public NKGFAGOKMJP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NKGFAGOKMJP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NKGFAGOKMJP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NKGFAGOKMJP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NKGFAGOKMJP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

