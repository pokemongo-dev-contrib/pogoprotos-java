// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IJFBIKGEKDJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IJFBIKGEKDJ}
 */
public final class IJFBIKGEKDJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IJFBIKGEKDJ)
    IJFBIKGEKDJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IJFBIKGEKDJ.newBuilder() to construct.
  private IJFBIKGEKDJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IJFBIKGEKDJ() {
    iofihnaoijp_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IJFBIKGEKDJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IJFBIKGEKDJ(
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
              iofihnaoijp_ = new java.util.ArrayList<POGOProtos.Rpc.PCJHEMBLEEF>();
              mutable_bitField0_ |= 0x00000001;
            }
            iofihnaoijp_.add(
                input.readMessage(POGOProtos.Rpc.PCJHEMBLEEF.parser(), extensionRegistry));
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
        iofihnaoijp_ = java.util.Collections.unmodifiableList(iofihnaoijp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJFBIKGEKDJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJFBIKGEKDJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IJFBIKGEKDJ.class, POGOProtos.Rpc.IJFBIKGEKDJ.Builder.class);
  }

  public static final int IOFIHNAOIJP_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.PCJHEMBLEEF> iofihnaoijp_;
  /**
   * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PCJHEMBLEEF> getIofihnaoijpList() {
    return iofihnaoijp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PCJHEMBLEEFOrBuilder> 
      getIofihnaoijpOrBuilderList() {
    return iofihnaoijp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
   */
  @java.lang.Override
  public int getIofihnaoijpCount() {
    return iofihnaoijp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PCJHEMBLEEF getIofihnaoijp(int index) {
    return iofihnaoijp_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PCJHEMBLEEFOrBuilder getIofihnaoijpOrBuilder(
      int index) {
    return iofihnaoijp_.get(index);
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
    for (int i = 0; i < iofihnaoijp_.size(); i++) {
      output.writeMessage(1, iofihnaoijp_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < iofihnaoijp_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, iofihnaoijp_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.IJFBIKGEKDJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IJFBIKGEKDJ other = (POGOProtos.Rpc.IJFBIKGEKDJ) obj;

    if (!getIofihnaoijpList()
        .equals(other.getIofihnaoijpList())) return false;
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
    if (getIofihnaoijpCount() > 0) {
      hash = (37 * hash) + IOFIHNAOIJP_FIELD_NUMBER;
      hash = (53 * hash) + getIofihnaoijpList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJFBIKGEKDJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IJFBIKGEKDJ prototype) {
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
   * ref: IJFBIKGEKDJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IJFBIKGEKDJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IJFBIKGEKDJ)
      POGOProtos.Rpc.IJFBIKGEKDJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJFBIKGEKDJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJFBIKGEKDJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IJFBIKGEKDJ.class, POGOProtos.Rpc.IJFBIKGEKDJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IJFBIKGEKDJ.newBuilder()
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
        getIofihnaoijpFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (iofihnaoijpBuilder_ == null) {
        iofihnaoijp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        iofihnaoijpBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJFBIKGEKDJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJFBIKGEKDJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.IJFBIKGEKDJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJFBIKGEKDJ build() {
      POGOProtos.Rpc.IJFBIKGEKDJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJFBIKGEKDJ buildPartial() {
      POGOProtos.Rpc.IJFBIKGEKDJ result = new POGOProtos.Rpc.IJFBIKGEKDJ(this);
      int from_bitField0_ = bitField0_;
      if (iofihnaoijpBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          iofihnaoijp_ = java.util.Collections.unmodifiableList(iofihnaoijp_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.iofihnaoijp_ = iofihnaoijp_;
      } else {
        result.iofihnaoijp_ = iofihnaoijpBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.IJFBIKGEKDJ) {
        return mergeFrom((POGOProtos.Rpc.IJFBIKGEKDJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IJFBIKGEKDJ other) {
      if (other == POGOProtos.Rpc.IJFBIKGEKDJ.getDefaultInstance()) return this;
      if (iofihnaoijpBuilder_ == null) {
        if (!other.iofihnaoijp_.isEmpty()) {
          if (iofihnaoijp_.isEmpty()) {
            iofihnaoijp_ = other.iofihnaoijp_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIofihnaoijpIsMutable();
            iofihnaoijp_.addAll(other.iofihnaoijp_);
          }
          onChanged();
        }
      } else {
        if (!other.iofihnaoijp_.isEmpty()) {
          if (iofihnaoijpBuilder_.isEmpty()) {
            iofihnaoijpBuilder_.dispose();
            iofihnaoijpBuilder_ = null;
            iofihnaoijp_ = other.iofihnaoijp_;
            bitField0_ = (bitField0_ & ~0x00000001);
            iofihnaoijpBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIofihnaoijpFieldBuilder() : null;
          } else {
            iofihnaoijpBuilder_.addAllMessages(other.iofihnaoijp_);
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
      POGOProtos.Rpc.IJFBIKGEKDJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IJFBIKGEKDJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.PCJHEMBLEEF> iofihnaoijp_ =
      java.util.Collections.emptyList();
    private void ensureIofihnaoijpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        iofihnaoijp_ = new java.util.ArrayList<POGOProtos.Rpc.PCJHEMBLEEF>(iofihnaoijp_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PCJHEMBLEEF, POGOProtos.Rpc.PCJHEMBLEEF.Builder, POGOProtos.Rpc.PCJHEMBLEEFOrBuilder> iofihnaoijpBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PCJHEMBLEEF> getIofihnaoijpList() {
      if (iofihnaoijpBuilder_ == null) {
        return java.util.Collections.unmodifiableList(iofihnaoijp_);
      } else {
        return iofihnaoijpBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public int getIofihnaoijpCount() {
      if (iofihnaoijpBuilder_ == null) {
        return iofihnaoijp_.size();
      } else {
        return iofihnaoijpBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public POGOProtos.Rpc.PCJHEMBLEEF getIofihnaoijp(int index) {
      if (iofihnaoijpBuilder_ == null) {
        return iofihnaoijp_.get(index);
      } else {
        return iofihnaoijpBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder setIofihnaoijp(
        int index, POGOProtos.Rpc.PCJHEMBLEEF value) {
      if (iofihnaoijpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.set(index, value);
        onChanged();
      } else {
        iofihnaoijpBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder setIofihnaoijp(
        int index, POGOProtos.Rpc.PCJHEMBLEEF.Builder builderForValue) {
      if (iofihnaoijpBuilder_ == null) {
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.set(index, builderForValue.build());
        onChanged();
      } else {
        iofihnaoijpBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder addIofihnaoijp(POGOProtos.Rpc.PCJHEMBLEEF value) {
      if (iofihnaoijpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.add(value);
        onChanged();
      } else {
        iofihnaoijpBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder addIofihnaoijp(
        int index, POGOProtos.Rpc.PCJHEMBLEEF value) {
      if (iofihnaoijpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.add(index, value);
        onChanged();
      } else {
        iofihnaoijpBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder addIofihnaoijp(
        POGOProtos.Rpc.PCJHEMBLEEF.Builder builderForValue) {
      if (iofihnaoijpBuilder_ == null) {
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.add(builderForValue.build());
        onChanged();
      } else {
        iofihnaoijpBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder addIofihnaoijp(
        int index, POGOProtos.Rpc.PCJHEMBLEEF.Builder builderForValue) {
      if (iofihnaoijpBuilder_ == null) {
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.add(index, builderForValue.build());
        onChanged();
      } else {
        iofihnaoijpBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder addAllIofihnaoijp(
        java.lang.Iterable<? extends POGOProtos.Rpc.PCJHEMBLEEF> values) {
      if (iofihnaoijpBuilder_ == null) {
        ensureIofihnaoijpIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, iofihnaoijp_);
        onChanged();
      } else {
        iofihnaoijpBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder clearIofihnaoijp() {
      if (iofihnaoijpBuilder_ == null) {
        iofihnaoijp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        iofihnaoijpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public Builder removeIofihnaoijp(int index) {
      if (iofihnaoijpBuilder_ == null) {
        ensureIofihnaoijpIsMutable();
        iofihnaoijp_.remove(index);
        onChanged();
      } else {
        iofihnaoijpBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public POGOProtos.Rpc.PCJHEMBLEEF.Builder getIofihnaoijpBuilder(
        int index) {
      return getIofihnaoijpFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public POGOProtos.Rpc.PCJHEMBLEEFOrBuilder getIofihnaoijpOrBuilder(
        int index) {
      if (iofihnaoijpBuilder_ == null) {
        return iofihnaoijp_.get(index);  } else {
        return iofihnaoijpBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PCJHEMBLEEFOrBuilder> 
         getIofihnaoijpOrBuilderList() {
      if (iofihnaoijpBuilder_ != null) {
        return iofihnaoijpBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(iofihnaoijp_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public POGOProtos.Rpc.PCJHEMBLEEF.Builder addIofihnaoijpBuilder() {
      return getIofihnaoijpFieldBuilder().addBuilder(
          POGOProtos.Rpc.PCJHEMBLEEF.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public POGOProtos.Rpc.PCJHEMBLEEF.Builder addIofihnaoijpBuilder(
        int index) {
      return getIofihnaoijpFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PCJHEMBLEEF.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PCJHEMBLEEF iofihnaoijp = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PCJHEMBLEEF.Builder> 
         getIofihnaoijpBuilderList() {
      return getIofihnaoijpFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PCJHEMBLEEF, POGOProtos.Rpc.PCJHEMBLEEF.Builder, POGOProtos.Rpc.PCJHEMBLEEFOrBuilder> 
        getIofihnaoijpFieldBuilder() {
      if (iofihnaoijpBuilder_ == null) {
        iofihnaoijpBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PCJHEMBLEEF, POGOProtos.Rpc.PCJHEMBLEEF.Builder, POGOProtos.Rpc.PCJHEMBLEEFOrBuilder>(
                iofihnaoijp_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        iofihnaoijp_ = null;
      }
      return iofihnaoijpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IJFBIKGEKDJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IJFBIKGEKDJ)
  private static final POGOProtos.Rpc.IJFBIKGEKDJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IJFBIKGEKDJ();
  }

  public static POGOProtos.Rpc.IJFBIKGEKDJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IJFBIKGEKDJ>
      PARSER = new com.google.protobuf.AbstractParser<IJFBIKGEKDJ>() {
    @java.lang.Override
    public IJFBIKGEKDJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IJFBIKGEKDJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IJFBIKGEKDJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IJFBIKGEKDJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IJFBIKGEKDJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

