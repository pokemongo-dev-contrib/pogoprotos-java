// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IMEFNIGNNFB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IMEFNIGNNFB}
 */
public  final class IMEFNIGNNFB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IMEFNIGNNFB)
    IMEFNIGNNFBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IMEFNIGNNFB.newBuilder() to construct.
  private IMEFNIGNNFB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IMEFNIGNNFB() {
    jkejoccbhcp_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IMEFNIGNNFB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IMEFNIGNNFB(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jkejoccbhcp_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            jkejoccbhcp_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              jkejoccbhcp_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              jkejoccbhcp_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
        jkejoccbhcp_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IMEFNIGNNFB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IMEFNIGNNFB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IMEFNIGNNFB.class, POGOProtos.Rpc.IMEFNIGNNFB.Builder.class);
  }

  public static final int JKEJOCCBHCP_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList jkejoccbhcp_;
  /**
   * <code>repeated int64 jkejoccbhcp = 1;</code>
   * @return A list containing the jkejoccbhcp.
   */
  public java.util.List<java.lang.Long>
      getJkejoccbhcpList() {
    return jkejoccbhcp_;
  }
  /**
   * <code>repeated int64 jkejoccbhcp = 1;</code>
   * @return The count of jkejoccbhcp.
   */
  public int getJkejoccbhcpCount() {
    return jkejoccbhcp_.size();
  }
  /**
   * <code>repeated int64 jkejoccbhcp = 1;</code>
   * @param index The index of the element to return.
   * @return The jkejoccbhcp at the given index.
   */
  public long getJkejoccbhcp(int index) {
    return jkejoccbhcp_.getLong(index);
  }
  private int jkejoccbhcpMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getJkejoccbhcpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(jkejoccbhcpMemoizedSerializedSize);
    }
    for (int i = 0; i < jkejoccbhcp_.size(); i++) {
      output.writeInt64NoTag(jkejoccbhcp_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < jkejoccbhcp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(jkejoccbhcp_.getLong(i));
      }
      size += dataSize;
      if (!getJkejoccbhcpList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      jkejoccbhcpMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.IMEFNIGNNFB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IMEFNIGNNFB other = (POGOProtos.Rpc.IMEFNIGNNFB) obj;

    if (!getJkejoccbhcpList()
        .equals(other.getJkejoccbhcpList())) return false;
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
    if (getJkejoccbhcpCount() > 0) {
      hash = (37 * hash) + JKEJOCCBHCP_FIELD_NUMBER;
      hash = (53 * hash) + getJkejoccbhcpList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IMEFNIGNNFB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IMEFNIGNNFB prototype) {
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
   * ref: IMEFNIGNNFB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IMEFNIGNNFB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IMEFNIGNNFB)
      POGOProtos.Rpc.IMEFNIGNNFBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IMEFNIGNNFB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IMEFNIGNNFB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IMEFNIGNNFB.class, POGOProtos.Rpc.IMEFNIGNNFB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IMEFNIGNNFB.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      jkejoccbhcp_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IMEFNIGNNFB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IMEFNIGNNFB getDefaultInstanceForType() {
      return POGOProtos.Rpc.IMEFNIGNNFB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IMEFNIGNNFB build() {
      POGOProtos.Rpc.IMEFNIGNNFB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IMEFNIGNNFB buildPartial() {
      POGOProtos.Rpc.IMEFNIGNNFB result = new POGOProtos.Rpc.IMEFNIGNNFB(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jkejoccbhcp_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jkejoccbhcp_ = jkejoccbhcp_;
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
      if (other instanceof POGOProtos.Rpc.IMEFNIGNNFB) {
        return mergeFrom((POGOProtos.Rpc.IMEFNIGNNFB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IMEFNIGNNFB other) {
      if (other == POGOProtos.Rpc.IMEFNIGNNFB.getDefaultInstance()) return this;
      if (!other.jkejoccbhcp_.isEmpty()) {
        if (jkejoccbhcp_.isEmpty()) {
          jkejoccbhcp_ = other.jkejoccbhcp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureJkejoccbhcpIsMutable();
          jkejoccbhcp_.addAll(other.jkejoccbhcp_);
        }
        onChanged();
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
      POGOProtos.Rpc.IMEFNIGNNFB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IMEFNIGNNFB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList jkejoccbhcp_ = emptyLongList();
    private void ensureJkejoccbhcpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jkejoccbhcp_ = mutableCopy(jkejoccbhcp_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @return A list containing the jkejoccbhcp.
     */
    public java.util.List<java.lang.Long>
        getJkejoccbhcpList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(jkejoccbhcp_) : jkejoccbhcp_;
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @return The count of jkejoccbhcp.
     */
    public int getJkejoccbhcpCount() {
      return jkejoccbhcp_.size();
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @param index The index of the element to return.
     * @return The jkejoccbhcp at the given index.
     */
    public long getJkejoccbhcp(int index) {
      return jkejoccbhcp_.getLong(index);
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @param index The index to set the value at.
     * @param value The jkejoccbhcp to set.
     * @return This builder for chaining.
     */
    public Builder setJkejoccbhcp(
        int index, long value) {
      ensureJkejoccbhcpIsMutable();
      jkejoccbhcp_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @param value The jkejoccbhcp to add.
     * @return This builder for chaining.
     */
    public Builder addJkejoccbhcp(long value) {
      ensureJkejoccbhcpIsMutable();
      jkejoccbhcp_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @param values The jkejoccbhcp to add.
     * @return This builder for chaining.
     */
    public Builder addAllJkejoccbhcp(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureJkejoccbhcpIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jkejoccbhcp_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jkejoccbhcp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkejoccbhcp() {
      jkejoccbhcp_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IMEFNIGNNFB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IMEFNIGNNFB)
  private static final POGOProtos.Rpc.IMEFNIGNNFB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IMEFNIGNNFB();
  }

  public static POGOProtos.Rpc.IMEFNIGNNFB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IMEFNIGNNFB>
      PARSER = new com.google.protobuf.AbstractParser<IMEFNIGNNFB>() {
    @java.lang.Override
    public IMEFNIGNNFB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IMEFNIGNNFB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IMEFNIGNNFB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IMEFNIGNNFB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IMEFNIGNNFB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

