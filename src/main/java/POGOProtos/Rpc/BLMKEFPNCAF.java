// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BLMKEFPNCAF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BLMKEFPNCAF}
 */
public final class BLMKEFPNCAF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BLMKEFPNCAF)
    BLMKEFPNCAFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BLMKEFPNCAF.newBuilder() to construct.
  private BLMKEFPNCAF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BLMKEFPNCAF() {
    injmcapfjmn_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BLMKEFPNCAF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BLMKEFPNCAF(
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
              injmcapfjmn_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            injmcapfjmn_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              injmcapfjmn_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              injmcapfjmn_.addLong(input.readUInt64());
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
        injmcapfjmn_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLMKEFPNCAF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLMKEFPNCAF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BLMKEFPNCAF.class, POGOProtos.Rpc.BLMKEFPNCAF.Builder.class);
  }

  public static final int INJMCAPFJMN_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList injmcapfjmn_;
  /**
   * <code>repeated uint64 injmcapfjmn = 1;</code>
   * @return A list containing the injmcapfjmn.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getInjmcapfjmnList() {
    return injmcapfjmn_;
  }
  /**
   * <code>repeated uint64 injmcapfjmn = 1;</code>
   * @return The count of injmcapfjmn.
   */
  public int getInjmcapfjmnCount() {
    return injmcapfjmn_.size();
  }
  /**
   * <code>repeated uint64 injmcapfjmn = 1;</code>
   * @param index The index of the element to return.
   * @return The injmcapfjmn at the given index.
   */
  public long getInjmcapfjmn(int index) {
    return injmcapfjmn_.getLong(index);
  }
  private int injmcapfjmnMemoizedSerializedSize = -1;

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
    if (getInjmcapfjmnList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(injmcapfjmnMemoizedSerializedSize);
    }
    for (int i = 0; i < injmcapfjmn_.size(); i++) {
      output.writeUInt64NoTag(injmcapfjmn_.getLong(i));
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
      for (int i = 0; i < injmcapfjmn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(injmcapfjmn_.getLong(i));
      }
      size += dataSize;
      if (!getInjmcapfjmnList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      injmcapfjmnMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.BLMKEFPNCAF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BLMKEFPNCAF other = (POGOProtos.Rpc.BLMKEFPNCAF) obj;

    if (!getInjmcapfjmnList()
        .equals(other.getInjmcapfjmnList())) return false;
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
    if (getInjmcapfjmnCount() > 0) {
      hash = (37 * hash) + INJMCAPFJMN_FIELD_NUMBER;
      hash = (53 * hash) + getInjmcapfjmnList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLMKEFPNCAF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BLMKEFPNCAF prototype) {
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
   * ref: BLMKEFPNCAF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BLMKEFPNCAF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BLMKEFPNCAF)
      POGOProtos.Rpc.BLMKEFPNCAFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLMKEFPNCAF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLMKEFPNCAF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BLMKEFPNCAF.class, POGOProtos.Rpc.BLMKEFPNCAF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BLMKEFPNCAF.newBuilder()
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
      injmcapfjmn_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLMKEFPNCAF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLMKEFPNCAF getDefaultInstanceForType() {
      return POGOProtos.Rpc.BLMKEFPNCAF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLMKEFPNCAF build() {
      POGOProtos.Rpc.BLMKEFPNCAF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLMKEFPNCAF buildPartial() {
      POGOProtos.Rpc.BLMKEFPNCAF result = new POGOProtos.Rpc.BLMKEFPNCAF(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        injmcapfjmn_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.injmcapfjmn_ = injmcapfjmn_;
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
      if (other instanceof POGOProtos.Rpc.BLMKEFPNCAF) {
        return mergeFrom((POGOProtos.Rpc.BLMKEFPNCAF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BLMKEFPNCAF other) {
      if (other == POGOProtos.Rpc.BLMKEFPNCAF.getDefaultInstance()) return this;
      if (!other.injmcapfjmn_.isEmpty()) {
        if (injmcapfjmn_.isEmpty()) {
          injmcapfjmn_ = other.injmcapfjmn_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInjmcapfjmnIsMutable();
          injmcapfjmn_.addAll(other.injmcapfjmn_);
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
      POGOProtos.Rpc.BLMKEFPNCAF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BLMKEFPNCAF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList injmcapfjmn_ = emptyLongList();
    private void ensureInjmcapfjmnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        injmcapfjmn_ = mutableCopy(injmcapfjmn_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @return A list containing the injmcapfjmn.
     */
    public java.util.List<java.lang.Long>
        getInjmcapfjmnList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(injmcapfjmn_) : injmcapfjmn_;
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @return The count of injmcapfjmn.
     */
    public int getInjmcapfjmnCount() {
      return injmcapfjmn_.size();
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @param index The index of the element to return.
     * @return The injmcapfjmn at the given index.
     */
    public long getInjmcapfjmn(int index) {
      return injmcapfjmn_.getLong(index);
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @param index The index to set the value at.
     * @param value The injmcapfjmn to set.
     * @return This builder for chaining.
     */
    public Builder setInjmcapfjmn(
        int index, long value) {
      ensureInjmcapfjmnIsMutable();
      injmcapfjmn_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @param value The injmcapfjmn to add.
     * @return This builder for chaining.
     */
    public Builder addInjmcapfjmn(long value) {
      ensureInjmcapfjmnIsMutable();
      injmcapfjmn_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @param values The injmcapfjmn to add.
     * @return This builder for chaining.
     */
    public Builder addAllInjmcapfjmn(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureInjmcapfjmnIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, injmcapfjmn_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 injmcapfjmn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInjmcapfjmn() {
      injmcapfjmn_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BLMKEFPNCAF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BLMKEFPNCAF)
  private static final POGOProtos.Rpc.BLMKEFPNCAF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BLMKEFPNCAF();
  }

  public static POGOProtos.Rpc.BLMKEFPNCAF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BLMKEFPNCAF>
      PARSER = new com.google.protobuf.AbstractParser<BLMKEFPNCAF>() {
    @java.lang.Override
    public BLMKEFPNCAF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BLMKEFPNCAF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BLMKEFPNCAF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BLMKEFPNCAF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BLMKEFPNCAF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

