// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CLHCOHIPBCK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CLHCOHIPBCK}
 */
public final class CLHCOHIPBCK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CLHCOHIPBCK)
    CLHCOHIPBCKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CLHCOHIPBCK.newBuilder() to construct.
  private CLHCOHIPBCK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CLHCOHIPBCK() {
    dapboajonce_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CLHCOHIPBCK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CLHCOHIPBCK(
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
              dapboajonce_ = new java.util.ArrayList<POGOProtos.Rpc.PIABIFIABDB>();
              mutable_bitField0_ |= 0x00000001;
            }
            dapboajonce_.add(
                input.readMessage(POGOProtos.Rpc.PIABIFIABDB.parser(), extensionRegistry));
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
        dapboajonce_ = java.util.Collections.unmodifiableList(dapboajonce_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLHCOHIPBCK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLHCOHIPBCK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CLHCOHIPBCK.class, POGOProtos.Rpc.CLHCOHIPBCK.Builder.class);
  }

  public static final int DAPBOAJONCE_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.PIABIFIABDB> dapboajonce_;
  /**
   * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PIABIFIABDB> getDapboajonceList() {
    return dapboajonce_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PIABIFIABDBOrBuilder> 
      getDapboajonceOrBuilderList() {
    return dapboajonce_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
   */
  @java.lang.Override
  public int getDapboajonceCount() {
    return dapboajonce_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PIABIFIABDB getDapboajonce(int index) {
    return dapboajonce_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PIABIFIABDBOrBuilder getDapboajonceOrBuilder(
      int index) {
    return dapboajonce_.get(index);
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
    for (int i = 0; i < dapboajonce_.size(); i++) {
      output.writeMessage(1, dapboajonce_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dapboajonce_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dapboajonce_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.CLHCOHIPBCK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CLHCOHIPBCK other = (POGOProtos.Rpc.CLHCOHIPBCK) obj;

    if (!getDapboajonceList()
        .equals(other.getDapboajonceList())) return false;
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
    if (getDapboajonceCount() > 0) {
      hash = (37 * hash) + DAPBOAJONCE_FIELD_NUMBER;
      hash = (53 * hash) + getDapboajonceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLHCOHIPBCK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CLHCOHIPBCK prototype) {
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
   * ref: CLHCOHIPBCK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CLHCOHIPBCK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CLHCOHIPBCK)
      POGOProtos.Rpc.CLHCOHIPBCKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLHCOHIPBCK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLHCOHIPBCK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CLHCOHIPBCK.class, POGOProtos.Rpc.CLHCOHIPBCK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CLHCOHIPBCK.newBuilder()
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
        getDapboajonceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dapboajonceBuilder_ == null) {
        dapboajonce_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dapboajonceBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLHCOHIPBCK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLHCOHIPBCK getDefaultInstanceForType() {
      return POGOProtos.Rpc.CLHCOHIPBCK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLHCOHIPBCK build() {
      POGOProtos.Rpc.CLHCOHIPBCK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLHCOHIPBCK buildPartial() {
      POGOProtos.Rpc.CLHCOHIPBCK result = new POGOProtos.Rpc.CLHCOHIPBCK(this);
      int from_bitField0_ = bitField0_;
      if (dapboajonceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dapboajonce_ = java.util.Collections.unmodifiableList(dapboajonce_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dapboajonce_ = dapboajonce_;
      } else {
        result.dapboajonce_ = dapboajonceBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CLHCOHIPBCK) {
        return mergeFrom((POGOProtos.Rpc.CLHCOHIPBCK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CLHCOHIPBCK other) {
      if (other == POGOProtos.Rpc.CLHCOHIPBCK.getDefaultInstance()) return this;
      if (dapboajonceBuilder_ == null) {
        if (!other.dapboajonce_.isEmpty()) {
          if (dapboajonce_.isEmpty()) {
            dapboajonce_ = other.dapboajonce_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDapboajonceIsMutable();
            dapboajonce_.addAll(other.dapboajonce_);
          }
          onChanged();
        }
      } else {
        if (!other.dapboajonce_.isEmpty()) {
          if (dapboajonceBuilder_.isEmpty()) {
            dapboajonceBuilder_.dispose();
            dapboajonceBuilder_ = null;
            dapboajonce_ = other.dapboajonce_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dapboajonceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDapboajonceFieldBuilder() : null;
          } else {
            dapboajonceBuilder_.addAllMessages(other.dapboajonce_);
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
      POGOProtos.Rpc.CLHCOHIPBCK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CLHCOHIPBCK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.PIABIFIABDB> dapboajonce_ =
      java.util.Collections.emptyList();
    private void ensureDapboajonceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dapboajonce_ = new java.util.ArrayList<POGOProtos.Rpc.PIABIFIABDB>(dapboajonce_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PIABIFIABDB, POGOProtos.Rpc.PIABIFIABDB.Builder, POGOProtos.Rpc.PIABIFIABDBOrBuilder> dapboajonceBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PIABIFIABDB> getDapboajonceList() {
      if (dapboajonceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dapboajonce_);
      } else {
        return dapboajonceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public int getDapboajonceCount() {
      if (dapboajonceBuilder_ == null) {
        return dapboajonce_.size();
      } else {
        return dapboajonceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public POGOProtos.Rpc.PIABIFIABDB getDapboajonce(int index) {
      if (dapboajonceBuilder_ == null) {
        return dapboajonce_.get(index);
      } else {
        return dapboajonceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder setDapboajonce(
        int index, POGOProtos.Rpc.PIABIFIABDB value) {
      if (dapboajonceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDapboajonceIsMutable();
        dapboajonce_.set(index, value);
        onChanged();
      } else {
        dapboajonceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder setDapboajonce(
        int index, POGOProtos.Rpc.PIABIFIABDB.Builder builderForValue) {
      if (dapboajonceBuilder_ == null) {
        ensureDapboajonceIsMutable();
        dapboajonce_.set(index, builderForValue.build());
        onChanged();
      } else {
        dapboajonceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder addDapboajonce(POGOProtos.Rpc.PIABIFIABDB value) {
      if (dapboajonceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDapboajonceIsMutable();
        dapboajonce_.add(value);
        onChanged();
      } else {
        dapboajonceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder addDapboajonce(
        int index, POGOProtos.Rpc.PIABIFIABDB value) {
      if (dapboajonceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDapboajonceIsMutable();
        dapboajonce_.add(index, value);
        onChanged();
      } else {
        dapboajonceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder addDapboajonce(
        POGOProtos.Rpc.PIABIFIABDB.Builder builderForValue) {
      if (dapboajonceBuilder_ == null) {
        ensureDapboajonceIsMutable();
        dapboajonce_.add(builderForValue.build());
        onChanged();
      } else {
        dapboajonceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder addDapboajonce(
        int index, POGOProtos.Rpc.PIABIFIABDB.Builder builderForValue) {
      if (dapboajonceBuilder_ == null) {
        ensureDapboajonceIsMutable();
        dapboajonce_.add(index, builderForValue.build());
        onChanged();
      } else {
        dapboajonceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder addAllDapboajonce(
        java.lang.Iterable<? extends POGOProtos.Rpc.PIABIFIABDB> values) {
      if (dapboajonceBuilder_ == null) {
        ensureDapboajonceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dapboajonce_);
        onChanged();
      } else {
        dapboajonceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder clearDapboajonce() {
      if (dapboajonceBuilder_ == null) {
        dapboajonce_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dapboajonceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public Builder removeDapboajonce(int index) {
      if (dapboajonceBuilder_ == null) {
        ensureDapboajonceIsMutable();
        dapboajonce_.remove(index);
        onChanged();
      } else {
        dapboajonceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public POGOProtos.Rpc.PIABIFIABDB.Builder getDapboajonceBuilder(
        int index) {
      return getDapboajonceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public POGOProtos.Rpc.PIABIFIABDBOrBuilder getDapboajonceOrBuilder(
        int index) {
      if (dapboajonceBuilder_ == null) {
        return dapboajonce_.get(index);  } else {
        return dapboajonceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PIABIFIABDBOrBuilder> 
         getDapboajonceOrBuilderList() {
      if (dapboajonceBuilder_ != null) {
        return dapboajonceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dapboajonce_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public POGOProtos.Rpc.PIABIFIABDB.Builder addDapboajonceBuilder() {
      return getDapboajonceFieldBuilder().addBuilder(
          POGOProtos.Rpc.PIABIFIABDB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public POGOProtos.Rpc.PIABIFIABDB.Builder addDapboajonceBuilder(
        int index) {
      return getDapboajonceFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PIABIFIABDB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PIABIFIABDB dapboajonce = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PIABIFIABDB.Builder> 
         getDapboajonceBuilderList() {
      return getDapboajonceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PIABIFIABDB, POGOProtos.Rpc.PIABIFIABDB.Builder, POGOProtos.Rpc.PIABIFIABDBOrBuilder> 
        getDapboajonceFieldBuilder() {
      if (dapboajonceBuilder_ == null) {
        dapboajonceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PIABIFIABDB, POGOProtos.Rpc.PIABIFIABDB.Builder, POGOProtos.Rpc.PIABIFIABDBOrBuilder>(
                dapboajonce_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dapboajonce_ = null;
      }
      return dapboajonceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CLHCOHIPBCK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CLHCOHIPBCK)
  private static final POGOProtos.Rpc.CLHCOHIPBCK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CLHCOHIPBCK();
  }

  public static POGOProtos.Rpc.CLHCOHIPBCK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CLHCOHIPBCK>
      PARSER = new com.google.protobuf.AbstractParser<CLHCOHIPBCK>() {
    @java.lang.Override
    public CLHCOHIPBCK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CLHCOHIPBCK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CLHCOHIPBCK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CLHCOHIPBCK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CLHCOHIPBCK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

