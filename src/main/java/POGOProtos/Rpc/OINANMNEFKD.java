// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OINANMNEFKD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OINANMNEFKD}
 */
public final class OINANMNEFKD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OINANMNEFKD)
    OINANMNEFKDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OINANMNEFKD.newBuilder() to construct.
  private OINANMNEFKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OINANMNEFKD() {
    dlpknpeedmh_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OINANMNEFKD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OINANMNEFKD(
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
              dlpknpeedmh_ = new java.util.ArrayList<POGOProtos.Rpc.CCAMCMDNEGM>();
              mutable_bitField0_ |= 0x00000001;
            }
            dlpknpeedmh_.add(
                input.readMessage(POGOProtos.Rpc.CCAMCMDNEGM.parser(), extensionRegistry));
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
        dlpknpeedmh_ = java.util.Collections.unmodifiableList(dlpknpeedmh_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OINANMNEFKD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OINANMNEFKD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OINANMNEFKD.class, POGOProtos.Rpc.OINANMNEFKD.Builder.class);
  }

  public static final int DLPKNPEEDMH_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.CCAMCMDNEGM> dlpknpeedmh_;
  /**
   * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.CCAMCMDNEGM> getDlpknpeedmhList() {
    return dlpknpeedmh_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.CCAMCMDNEGMOrBuilder> 
      getDlpknpeedmhOrBuilderList() {
    return dlpknpeedmh_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
   */
  @java.lang.Override
  public int getDlpknpeedmhCount() {
    return dlpknpeedmh_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CCAMCMDNEGM getDlpknpeedmh(int index) {
    return dlpknpeedmh_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CCAMCMDNEGMOrBuilder getDlpknpeedmhOrBuilder(
      int index) {
    return dlpknpeedmh_.get(index);
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
    for (int i = 0; i < dlpknpeedmh_.size(); i++) {
      output.writeMessage(1, dlpknpeedmh_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dlpknpeedmh_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dlpknpeedmh_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.OINANMNEFKD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OINANMNEFKD other = (POGOProtos.Rpc.OINANMNEFKD) obj;

    if (!getDlpknpeedmhList()
        .equals(other.getDlpknpeedmhList())) return false;
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
    if (getDlpknpeedmhCount() > 0) {
      hash = (37 * hash) + DLPKNPEEDMH_FIELD_NUMBER;
      hash = (53 * hash) + getDlpknpeedmhList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OINANMNEFKD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OINANMNEFKD prototype) {
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
   * ref: OINANMNEFKD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OINANMNEFKD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OINANMNEFKD)
      POGOProtos.Rpc.OINANMNEFKDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OINANMNEFKD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OINANMNEFKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OINANMNEFKD.class, POGOProtos.Rpc.OINANMNEFKD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OINANMNEFKD.newBuilder()
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
        getDlpknpeedmhFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dlpknpeedmhBuilder_ == null) {
        dlpknpeedmh_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dlpknpeedmhBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OINANMNEFKD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OINANMNEFKD getDefaultInstanceForType() {
      return POGOProtos.Rpc.OINANMNEFKD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OINANMNEFKD build() {
      POGOProtos.Rpc.OINANMNEFKD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OINANMNEFKD buildPartial() {
      POGOProtos.Rpc.OINANMNEFKD result = new POGOProtos.Rpc.OINANMNEFKD(this);
      int from_bitField0_ = bitField0_;
      if (dlpknpeedmhBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dlpknpeedmh_ = java.util.Collections.unmodifiableList(dlpknpeedmh_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dlpknpeedmh_ = dlpknpeedmh_;
      } else {
        result.dlpknpeedmh_ = dlpknpeedmhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OINANMNEFKD) {
        return mergeFrom((POGOProtos.Rpc.OINANMNEFKD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OINANMNEFKD other) {
      if (other == POGOProtos.Rpc.OINANMNEFKD.getDefaultInstance()) return this;
      if (dlpknpeedmhBuilder_ == null) {
        if (!other.dlpknpeedmh_.isEmpty()) {
          if (dlpknpeedmh_.isEmpty()) {
            dlpknpeedmh_ = other.dlpknpeedmh_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDlpknpeedmhIsMutable();
            dlpknpeedmh_.addAll(other.dlpknpeedmh_);
          }
          onChanged();
        }
      } else {
        if (!other.dlpknpeedmh_.isEmpty()) {
          if (dlpknpeedmhBuilder_.isEmpty()) {
            dlpknpeedmhBuilder_.dispose();
            dlpknpeedmhBuilder_ = null;
            dlpknpeedmh_ = other.dlpknpeedmh_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dlpknpeedmhBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDlpknpeedmhFieldBuilder() : null;
          } else {
            dlpknpeedmhBuilder_.addAllMessages(other.dlpknpeedmh_);
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
      POGOProtos.Rpc.OINANMNEFKD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OINANMNEFKD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.CCAMCMDNEGM> dlpknpeedmh_ =
      java.util.Collections.emptyList();
    private void ensureDlpknpeedmhIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dlpknpeedmh_ = new java.util.ArrayList<POGOProtos.Rpc.CCAMCMDNEGM>(dlpknpeedmh_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.CCAMCMDNEGM, POGOProtos.Rpc.CCAMCMDNEGM.Builder, POGOProtos.Rpc.CCAMCMDNEGMOrBuilder> dlpknpeedmhBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.CCAMCMDNEGM> getDlpknpeedmhList() {
      if (dlpknpeedmhBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dlpknpeedmh_);
      } else {
        return dlpknpeedmhBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public int getDlpknpeedmhCount() {
      if (dlpknpeedmhBuilder_ == null) {
        return dlpknpeedmh_.size();
      } else {
        return dlpknpeedmhBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public POGOProtos.Rpc.CCAMCMDNEGM getDlpknpeedmh(int index) {
      if (dlpknpeedmhBuilder_ == null) {
        return dlpknpeedmh_.get(index);
      } else {
        return dlpknpeedmhBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder setDlpknpeedmh(
        int index, POGOProtos.Rpc.CCAMCMDNEGM value) {
      if (dlpknpeedmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.set(index, value);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder setDlpknpeedmh(
        int index, POGOProtos.Rpc.CCAMCMDNEGM.Builder builderForValue) {
      if (dlpknpeedmhBuilder_ == null) {
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.set(index, builderForValue.build());
        onChanged();
      } else {
        dlpknpeedmhBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder addDlpknpeedmh(POGOProtos.Rpc.CCAMCMDNEGM value) {
      if (dlpknpeedmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.add(value);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder addDlpknpeedmh(
        int index, POGOProtos.Rpc.CCAMCMDNEGM value) {
      if (dlpknpeedmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.add(index, value);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder addDlpknpeedmh(
        POGOProtos.Rpc.CCAMCMDNEGM.Builder builderForValue) {
      if (dlpknpeedmhBuilder_ == null) {
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.add(builderForValue.build());
        onChanged();
      } else {
        dlpknpeedmhBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder addDlpknpeedmh(
        int index, POGOProtos.Rpc.CCAMCMDNEGM.Builder builderForValue) {
      if (dlpknpeedmhBuilder_ == null) {
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.add(index, builderForValue.build());
        onChanged();
      } else {
        dlpknpeedmhBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder addAllDlpknpeedmh(
        java.lang.Iterable<? extends POGOProtos.Rpc.CCAMCMDNEGM> values) {
      if (dlpknpeedmhBuilder_ == null) {
        ensureDlpknpeedmhIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dlpknpeedmh_);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder clearDlpknpeedmh() {
      if (dlpknpeedmhBuilder_ == null) {
        dlpknpeedmh_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public Builder removeDlpknpeedmh(int index) {
      if (dlpknpeedmhBuilder_ == null) {
        ensureDlpknpeedmhIsMutable();
        dlpknpeedmh_.remove(index);
        onChanged();
      } else {
        dlpknpeedmhBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public POGOProtos.Rpc.CCAMCMDNEGM.Builder getDlpknpeedmhBuilder(
        int index) {
      return getDlpknpeedmhFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public POGOProtos.Rpc.CCAMCMDNEGMOrBuilder getDlpknpeedmhOrBuilder(
        int index) {
      if (dlpknpeedmhBuilder_ == null) {
        return dlpknpeedmh_.get(index);  } else {
        return dlpknpeedmhBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.CCAMCMDNEGMOrBuilder> 
         getDlpknpeedmhOrBuilderList() {
      if (dlpknpeedmhBuilder_ != null) {
        return dlpknpeedmhBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dlpknpeedmh_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public POGOProtos.Rpc.CCAMCMDNEGM.Builder addDlpknpeedmhBuilder() {
      return getDlpknpeedmhFieldBuilder().addBuilder(
          POGOProtos.Rpc.CCAMCMDNEGM.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public POGOProtos.Rpc.CCAMCMDNEGM.Builder addDlpknpeedmhBuilder(
        int index) {
      return getDlpknpeedmhFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.CCAMCMDNEGM.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.CCAMCMDNEGM dlpknpeedmh = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.CCAMCMDNEGM.Builder> 
         getDlpknpeedmhBuilderList() {
      return getDlpknpeedmhFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.CCAMCMDNEGM, POGOProtos.Rpc.CCAMCMDNEGM.Builder, POGOProtos.Rpc.CCAMCMDNEGMOrBuilder> 
        getDlpknpeedmhFieldBuilder() {
      if (dlpknpeedmhBuilder_ == null) {
        dlpknpeedmhBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.CCAMCMDNEGM, POGOProtos.Rpc.CCAMCMDNEGM.Builder, POGOProtos.Rpc.CCAMCMDNEGMOrBuilder>(
                dlpknpeedmh_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dlpknpeedmh_ = null;
      }
      return dlpknpeedmhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OINANMNEFKD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OINANMNEFKD)
  private static final POGOProtos.Rpc.OINANMNEFKD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OINANMNEFKD();
  }

  public static POGOProtos.Rpc.OINANMNEFKD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OINANMNEFKD>
      PARSER = new com.google.protobuf.AbstractParser<OINANMNEFKD>() {
    @java.lang.Override
    public OINANMNEFKD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OINANMNEFKD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OINANMNEFKD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OINANMNEFKD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OINANMNEFKD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

