// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OAGOAPDNPGO}
 */
public  final class OAGOAPDNPGO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OAGOAPDNPGO)
    OAGOAPDNPGOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAGOAPDNPGO.newBuilder() to construct.
  private OAGOAPDNPGO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAGOAPDNPGO() {
    jpggbkjgocg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OAGOAPDNPGO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OAGOAPDNPGO(
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
              jpggbkjgocg_ = new java.util.ArrayList<POGOProtos.Rpc.KEGNPKMJHED>();
              mutable_bitField0_ |= 0x00000001;
            }
            jpggbkjgocg_.add(
                input.readMessage(POGOProtos.Rpc.KEGNPKMJHED.parser(), extensionRegistry));
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
        jpggbkjgocg_ = java.util.Collections.unmodifiableList(jpggbkjgocg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAGOAPDNPGO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAGOAPDNPGO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OAGOAPDNPGO.class, POGOProtos.Rpc.OAGOAPDNPGO.Builder.class);
  }

  public static final int JPGGBKJGOCG_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.KEGNPKMJHED> jpggbkjgocg_;
  /**
   * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.KEGNPKMJHED> getJpggbkjgocgList() {
    return jpggbkjgocg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.KEGNPKMJHEDOrBuilder> 
      getJpggbkjgocgOrBuilderList() {
    return jpggbkjgocg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
   */
  public int getJpggbkjgocgCount() {
    return jpggbkjgocg_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
   */
  public POGOProtos.Rpc.KEGNPKMJHED getJpggbkjgocg(int index) {
    return jpggbkjgocg_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
   */
  public POGOProtos.Rpc.KEGNPKMJHEDOrBuilder getJpggbkjgocgOrBuilder(
      int index) {
    return jpggbkjgocg_.get(index);
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
    for (int i = 0; i < jpggbkjgocg_.size(); i++) {
      output.writeMessage(1, jpggbkjgocg_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jpggbkjgocg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jpggbkjgocg_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.OAGOAPDNPGO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OAGOAPDNPGO other = (POGOProtos.Rpc.OAGOAPDNPGO) obj;

    if (!getJpggbkjgocgList()
        .equals(other.getJpggbkjgocgList())) return false;
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
    if (getJpggbkjgocgCount() > 0) {
      hash = (37 * hash) + JPGGBKJGOCG_FIELD_NUMBER;
      hash = (53 * hash) + getJpggbkjgocgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAGOAPDNPGO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OAGOAPDNPGO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OAGOAPDNPGO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OAGOAPDNPGO)
      POGOProtos.Rpc.OAGOAPDNPGOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAGOAPDNPGO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAGOAPDNPGO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OAGOAPDNPGO.class, POGOProtos.Rpc.OAGOAPDNPGO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OAGOAPDNPGO.newBuilder()
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
        getJpggbkjgocgFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jpggbkjgocgBuilder_ == null) {
        jpggbkjgocg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jpggbkjgocgBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAGOAPDNPGO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAGOAPDNPGO getDefaultInstanceForType() {
      return POGOProtos.Rpc.OAGOAPDNPGO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAGOAPDNPGO build() {
      POGOProtos.Rpc.OAGOAPDNPGO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAGOAPDNPGO buildPartial() {
      POGOProtos.Rpc.OAGOAPDNPGO result = new POGOProtos.Rpc.OAGOAPDNPGO(this);
      int from_bitField0_ = bitField0_;
      if (jpggbkjgocgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jpggbkjgocg_ = java.util.Collections.unmodifiableList(jpggbkjgocg_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jpggbkjgocg_ = jpggbkjgocg_;
      } else {
        result.jpggbkjgocg_ = jpggbkjgocgBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OAGOAPDNPGO) {
        return mergeFrom((POGOProtos.Rpc.OAGOAPDNPGO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OAGOAPDNPGO other) {
      if (other == POGOProtos.Rpc.OAGOAPDNPGO.getDefaultInstance()) return this;
      if (jpggbkjgocgBuilder_ == null) {
        if (!other.jpggbkjgocg_.isEmpty()) {
          if (jpggbkjgocg_.isEmpty()) {
            jpggbkjgocg_ = other.jpggbkjgocg_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJpggbkjgocgIsMutable();
            jpggbkjgocg_.addAll(other.jpggbkjgocg_);
          }
          onChanged();
        }
      } else {
        if (!other.jpggbkjgocg_.isEmpty()) {
          if (jpggbkjgocgBuilder_.isEmpty()) {
            jpggbkjgocgBuilder_.dispose();
            jpggbkjgocgBuilder_ = null;
            jpggbkjgocg_ = other.jpggbkjgocg_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jpggbkjgocgBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJpggbkjgocgFieldBuilder() : null;
          } else {
            jpggbkjgocgBuilder_.addAllMessages(other.jpggbkjgocg_);
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
      POGOProtos.Rpc.OAGOAPDNPGO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OAGOAPDNPGO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.KEGNPKMJHED> jpggbkjgocg_ =
      java.util.Collections.emptyList();
    private void ensureJpggbkjgocgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jpggbkjgocg_ = new java.util.ArrayList<POGOProtos.Rpc.KEGNPKMJHED>(jpggbkjgocg_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.KEGNPKMJHED, POGOProtos.Rpc.KEGNPKMJHED.Builder, POGOProtos.Rpc.KEGNPKMJHEDOrBuilder> jpggbkjgocgBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.KEGNPKMJHED> getJpggbkjgocgList() {
      if (jpggbkjgocgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jpggbkjgocg_);
      } else {
        return jpggbkjgocgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public int getJpggbkjgocgCount() {
      if (jpggbkjgocgBuilder_ == null) {
        return jpggbkjgocg_.size();
      } else {
        return jpggbkjgocgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public POGOProtos.Rpc.KEGNPKMJHED getJpggbkjgocg(int index) {
      if (jpggbkjgocgBuilder_ == null) {
        return jpggbkjgocg_.get(index);
      } else {
        return jpggbkjgocgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder setJpggbkjgocg(
        int index, POGOProtos.Rpc.KEGNPKMJHED value) {
      if (jpggbkjgocgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.set(index, value);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder setJpggbkjgocg(
        int index, POGOProtos.Rpc.KEGNPKMJHED.Builder builderForValue) {
      if (jpggbkjgocgBuilder_ == null) {
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.set(index, builderForValue.build());
        onChanged();
      } else {
        jpggbkjgocgBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder addJpggbkjgocg(POGOProtos.Rpc.KEGNPKMJHED value) {
      if (jpggbkjgocgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.add(value);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder addJpggbkjgocg(
        int index, POGOProtos.Rpc.KEGNPKMJHED value) {
      if (jpggbkjgocgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.add(index, value);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder addJpggbkjgocg(
        POGOProtos.Rpc.KEGNPKMJHED.Builder builderForValue) {
      if (jpggbkjgocgBuilder_ == null) {
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.add(builderForValue.build());
        onChanged();
      } else {
        jpggbkjgocgBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder addJpggbkjgocg(
        int index, POGOProtos.Rpc.KEGNPKMJHED.Builder builderForValue) {
      if (jpggbkjgocgBuilder_ == null) {
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.add(index, builderForValue.build());
        onChanged();
      } else {
        jpggbkjgocgBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder addAllJpggbkjgocg(
        java.lang.Iterable<? extends POGOProtos.Rpc.KEGNPKMJHED> values) {
      if (jpggbkjgocgBuilder_ == null) {
        ensureJpggbkjgocgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jpggbkjgocg_);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder clearJpggbkjgocg() {
      if (jpggbkjgocgBuilder_ == null) {
        jpggbkjgocg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public Builder removeJpggbkjgocg(int index) {
      if (jpggbkjgocgBuilder_ == null) {
        ensureJpggbkjgocgIsMutable();
        jpggbkjgocg_.remove(index);
        onChanged();
      } else {
        jpggbkjgocgBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public POGOProtos.Rpc.KEGNPKMJHED.Builder getJpggbkjgocgBuilder(
        int index) {
      return getJpggbkjgocgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public POGOProtos.Rpc.KEGNPKMJHEDOrBuilder getJpggbkjgocgOrBuilder(
        int index) {
      if (jpggbkjgocgBuilder_ == null) {
        return jpggbkjgocg_.get(index);  } else {
        return jpggbkjgocgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.KEGNPKMJHEDOrBuilder> 
         getJpggbkjgocgOrBuilderList() {
      if (jpggbkjgocgBuilder_ != null) {
        return jpggbkjgocgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jpggbkjgocg_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public POGOProtos.Rpc.KEGNPKMJHED.Builder addJpggbkjgocgBuilder() {
      return getJpggbkjgocgFieldBuilder().addBuilder(
          POGOProtos.Rpc.KEGNPKMJHED.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public POGOProtos.Rpc.KEGNPKMJHED.Builder addJpggbkjgocgBuilder(
        int index) {
      return getJpggbkjgocgFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.KEGNPKMJHED.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KEGNPKMJHED jpggbkjgocg = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.KEGNPKMJHED.Builder> 
         getJpggbkjgocgBuilderList() {
      return getJpggbkjgocgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.KEGNPKMJHED, POGOProtos.Rpc.KEGNPKMJHED.Builder, POGOProtos.Rpc.KEGNPKMJHEDOrBuilder> 
        getJpggbkjgocgFieldBuilder() {
      if (jpggbkjgocgBuilder_ == null) {
        jpggbkjgocgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.KEGNPKMJHED, POGOProtos.Rpc.KEGNPKMJHED.Builder, POGOProtos.Rpc.KEGNPKMJHEDOrBuilder>(
                jpggbkjgocg_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jpggbkjgocg_ = null;
      }
      return jpggbkjgocgBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OAGOAPDNPGO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OAGOAPDNPGO)
  private static final POGOProtos.Rpc.OAGOAPDNPGO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OAGOAPDNPGO();
  }

  public static POGOProtos.Rpc.OAGOAPDNPGO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAGOAPDNPGO>
      PARSER = new com.google.protobuf.AbstractParser<OAGOAPDNPGO>() {
    @java.lang.Override
    public OAGOAPDNPGO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OAGOAPDNPGO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OAGOAPDNPGO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAGOAPDNPGO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OAGOAPDNPGO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

