// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JGKIOAMJEHN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JGKIOAMJEHN}
 */
public final class JGKIOAMJEHN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JGKIOAMJEHN)
    JGKIOAMJEHNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JGKIOAMJEHN.newBuilder() to construct.
  private JGKIOAMJEHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JGKIOAMJEHN() {
    hafjpbgppgj_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JGKIOAMJEHN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JGKIOAMJEHN(
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
              hafjpbgppgj_ = new java.util.ArrayList<POGOProtos.Rpc.GFLCFFDAIBC>();
              mutable_bitField0_ |= 0x00000001;
            }
            hafjpbgppgj_.add(
                input.readMessage(POGOProtos.Rpc.GFLCFFDAIBC.parser(), extensionRegistry));
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
        hafjpbgppgj_ = java.util.Collections.unmodifiableList(hafjpbgppgj_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKIOAMJEHN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKIOAMJEHN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JGKIOAMJEHN.class, POGOProtos.Rpc.JGKIOAMJEHN.Builder.class);
  }

  public static final int HAFJPBGPPGJ_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.GFLCFFDAIBC> hafjpbgppgj_;
  /**
   * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GFLCFFDAIBC> getHafjpbgppgjList() {
    return hafjpbgppgj_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.GFLCFFDAIBCOrBuilder> 
      getHafjpbgppgjOrBuilderList() {
    return hafjpbgppgj_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
   */
  @java.lang.Override
  public int getHafjpbgppgjCount() {
    return hafjpbgppgj_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GFLCFFDAIBC getHafjpbgppgj(int index) {
    return hafjpbgppgj_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GFLCFFDAIBCOrBuilder getHafjpbgppgjOrBuilder(
      int index) {
    return hafjpbgppgj_.get(index);
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
    for (int i = 0; i < hafjpbgppgj_.size(); i++) {
      output.writeMessage(1, hafjpbgppgj_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hafjpbgppgj_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hafjpbgppgj_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.JGKIOAMJEHN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JGKIOAMJEHN other = (POGOProtos.Rpc.JGKIOAMJEHN) obj;

    if (!getHafjpbgppgjList()
        .equals(other.getHafjpbgppgjList())) return false;
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
    if (getHafjpbgppgjCount() > 0) {
      hash = (37 * hash) + HAFJPBGPPGJ_FIELD_NUMBER;
      hash = (53 * hash) + getHafjpbgppgjList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKIOAMJEHN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JGKIOAMJEHN prototype) {
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
   * ref: JGKIOAMJEHN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JGKIOAMJEHN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JGKIOAMJEHN)
      POGOProtos.Rpc.JGKIOAMJEHNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKIOAMJEHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKIOAMJEHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JGKIOAMJEHN.class, POGOProtos.Rpc.JGKIOAMJEHN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JGKIOAMJEHN.newBuilder()
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
        getHafjpbgppgjFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hafjpbgppgjBuilder_ == null) {
        hafjpbgppgj_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hafjpbgppgjBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKIOAMJEHN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKIOAMJEHN getDefaultInstanceForType() {
      return POGOProtos.Rpc.JGKIOAMJEHN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKIOAMJEHN build() {
      POGOProtos.Rpc.JGKIOAMJEHN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKIOAMJEHN buildPartial() {
      POGOProtos.Rpc.JGKIOAMJEHN result = new POGOProtos.Rpc.JGKIOAMJEHN(this);
      int from_bitField0_ = bitField0_;
      if (hafjpbgppgjBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hafjpbgppgj_ = java.util.Collections.unmodifiableList(hafjpbgppgj_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hafjpbgppgj_ = hafjpbgppgj_;
      } else {
        result.hafjpbgppgj_ = hafjpbgppgjBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JGKIOAMJEHN) {
        return mergeFrom((POGOProtos.Rpc.JGKIOAMJEHN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JGKIOAMJEHN other) {
      if (other == POGOProtos.Rpc.JGKIOAMJEHN.getDefaultInstance()) return this;
      if (hafjpbgppgjBuilder_ == null) {
        if (!other.hafjpbgppgj_.isEmpty()) {
          if (hafjpbgppgj_.isEmpty()) {
            hafjpbgppgj_ = other.hafjpbgppgj_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHafjpbgppgjIsMutable();
            hafjpbgppgj_.addAll(other.hafjpbgppgj_);
          }
          onChanged();
        }
      } else {
        if (!other.hafjpbgppgj_.isEmpty()) {
          if (hafjpbgppgjBuilder_.isEmpty()) {
            hafjpbgppgjBuilder_.dispose();
            hafjpbgppgjBuilder_ = null;
            hafjpbgppgj_ = other.hafjpbgppgj_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hafjpbgppgjBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHafjpbgppgjFieldBuilder() : null;
          } else {
            hafjpbgppgjBuilder_.addAllMessages(other.hafjpbgppgj_);
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
      POGOProtos.Rpc.JGKIOAMJEHN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JGKIOAMJEHN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.GFLCFFDAIBC> hafjpbgppgj_ =
      java.util.Collections.emptyList();
    private void ensureHafjpbgppgjIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hafjpbgppgj_ = new java.util.ArrayList<POGOProtos.Rpc.GFLCFFDAIBC>(hafjpbgppgj_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GFLCFFDAIBC, POGOProtos.Rpc.GFLCFFDAIBC.Builder, POGOProtos.Rpc.GFLCFFDAIBCOrBuilder> hafjpbgppgjBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GFLCFFDAIBC> getHafjpbgppgjList() {
      if (hafjpbgppgjBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hafjpbgppgj_);
      } else {
        return hafjpbgppgjBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public int getHafjpbgppgjCount() {
      if (hafjpbgppgjBuilder_ == null) {
        return hafjpbgppgj_.size();
      } else {
        return hafjpbgppgjBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public POGOProtos.Rpc.GFLCFFDAIBC getHafjpbgppgj(int index) {
      if (hafjpbgppgjBuilder_ == null) {
        return hafjpbgppgj_.get(index);
      } else {
        return hafjpbgppgjBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder setHafjpbgppgj(
        int index, POGOProtos.Rpc.GFLCFFDAIBC value) {
      if (hafjpbgppgjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.set(index, value);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder setHafjpbgppgj(
        int index, POGOProtos.Rpc.GFLCFFDAIBC.Builder builderForValue) {
      if (hafjpbgppgjBuilder_ == null) {
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.set(index, builderForValue.build());
        onChanged();
      } else {
        hafjpbgppgjBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder addHafjpbgppgj(POGOProtos.Rpc.GFLCFFDAIBC value) {
      if (hafjpbgppgjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.add(value);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder addHafjpbgppgj(
        int index, POGOProtos.Rpc.GFLCFFDAIBC value) {
      if (hafjpbgppgjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.add(index, value);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder addHafjpbgppgj(
        POGOProtos.Rpc.GFLCFFDAIBC.Builder builderForValue) {
      if (hafjpbgppgjBuilder_ == null) {
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.add(builderForValue.build());
        onChanged();
      } else {
        hafjpbgppgjBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder addHafjpbgppgj(
        int index, POGOProtos.Rpc.GFLCFFDAIBC.Builder builderForValue) {
      if (hafjpbgppgjBuilder_ == null) {
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.add(index, builderForValue.build());
        onChanged();
      } else {
        hafjpbgppgjBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder addAllHafjpbgppgj(
        java.lang.Iterable<? extends POGOProtos.Rpc.GFLCFFDAIBC> values) {
      if (hafjpbgppgjBuilder_ == null) {
        ensureHafjpbgppgjIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hafjpbgppgj_);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder clearHafjpbgppgj() {
      if (hafjpbgppgjBuilder_ == null) {
        hafjpbgppgj_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public Builder removeHafjpbgppgj(int index) {
      if (hafjpbgppgjBuilder_ == null) {
        ensureHafjpbgppgjIsMutable();
        hafjpbgppgj_.remove(index);
        onChanged();
      } else {
        hafjpbgppgjBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public POGOProtos.Rpc.GFLCFFDAIBC.Builder getHafjpbgppgjBuilder(
        int index) {
      return getHafjpbgppgjFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public POGOProtos.Rpc.GFLCFFDAIBCOrBuilder getHafjpbgppgjOrBuilder(
        int index) {
      if (hafjpbgppgjBuilder_ == null) {
        return hafjpbgppgj_.get(index);  } else {
        return hafjpbgppgjBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.GFLCFFDAIBCOrBuilder> 
         getHafjpbgppgjOrBuilderList() {
      if (hafjpbgppgjBuilder_ != null) {
        return hafjpbgppgjBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hafjpbgppgj_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public POGOProtos.Rpc.GFLCFFDAIBC.Builder addHafjpbgppgjBuilder() {
      return getHafjpbgppgjFieldBuilder().addBuilder(
          POGOProtos.Rpc.GFLCFFDAIBC.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public POGOProtos.Rpc.GFLCFFDAIBC.Builder addHafjpbgppgjBuilder(
        int index) {
      return getHafjpbgppgjFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.GFLCFFDAIBC.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFLCFFDAIBC hafjpbgppgj = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GFLCFFDAIBC.Builder> 
         getHafjpbgppgjBuilderList() {
      return getHafjpbgppgjFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GFLCFFDAIBC, POGOProtos.Rpc.GFLCFFDAIBC.Builder, POGOProtos.Rpc.GFLCFFDAIBCOrBuilder> 
        getHafjpbgppgjFieldBuilder() {
      if (hafjpbgppgjBuilder_ == null) {
        hafjpbgppgjBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.GFLCFFDAIBC, POGOProtos.Rpc.GFLCFFDAIBC.Builder, POGOProtos.Rpc.GFLCFFDAIBCOrBuilder>(
                hafjpbgppgj_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hafjpbgppgj_ = null;
      }
      return hafjpbgppgjBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JGKIOAMJEHN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JGKIOAMJEHN)
  private static final POGOProtos.Rpc.JGKIOAMJEHN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JGKIOAMJEHN();
  }

  public static POGOProtos.Rpc.JGKIOAMJEHN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JGKIOAMJEHN>
      PARSER = new com.google.protobuf.AbstractParser<JGKIOAMJEHN>() {
    @java.lang.Override
    public JGKIOAMJEHN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JGKIOAMJEHN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JGKIOAMJEHN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JGKIOAMJEHN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JGKIOAMJEHN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

