// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NONHCAPMFMD}
 */
public  final class NONHCAPMFMD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NONHCAPMFMD)
    NONHCAPMFMDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NONHCAPMFMD.newBuilder() to construct.
  private NONHCAPMFMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NONHCAPMFMD() {
    feacpfogjkf_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NONHCAPMFMD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NONHCAPMFMD(
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
              feacpfogjkf_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            feacpfogjkf_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              feacpfogjkf_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              feacpfogjkf_.addLong(input.readInt64());
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
        feacpfogjkf_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NONHCAPMFMD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NONHCAPMFMD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NONHCAPMFMD.class, POGOProtos.Rpc.NONHCAPMFMD.Builder.class);
  }

  public static final int FEACPFOGJKF_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList feacpfogjkf_;
  /**
   * <code>repeated int64 feacpfogjkf = 1;</code>
   * @return A list containing the feacpfogjkf.
   */
  public java.util.List<java.lang.Long>
      getFeacpfogjkfList() {
    return feacpfogjkf_;
  }
  /**
   * <code>repeated int64 feacpfogjkf = 1;</code>
   * @return The count of feacpfogjkf.
   */
  public int getFeacpfogjkfCount() {
    return feacpfogjkf_.size();
  }
  /**
   * <code>repeated int64 feacpfogjkf = 1;</code>
   * @param index The index of the element to return.
   * @return The feacpfogjkf at the given index.
   */
  public long getFeacpfogjkf(int index) {
    return feacpfogjkf_.getLong(index);
  }
  private int feacpfogjkfMemoizedSerializedSize = -1;

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
    if (getFeacpfogjkfList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(feacpfogjkfMemoizedSerializedSize);
    }
    for (int i = 0; i < feacpfogjkf_.size(); i++) {
      output.writeInt64NoTag(feacpfogjkf_.getLong(i));
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
      for (int i = 0; i < feacpfogjkf_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(feacpfogjkf_.getLong(i));
      }
      size += dataSize;
      if (!getFeacpfogjkfList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      feacpfogjkfMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.NONHCAPMFMD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NONHCAPMFMD other = (POGOProtos.Rpc.NONHCAPMFMD) obj;

    if (!getFeacpfogjkfList()
        .equals(other.getFeacpfogjkfList())) return false;
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
    if (getFeacpfogjkfCount() > 0) {
      hash = (37 * hash) + FEACPFOGJKF_FIELD_NUMBER;
      hash = (53 * hash) + getFeacpfogjkfList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NONHCAPMFMD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NONHCAPMFMD prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NONHCAPMFMD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NONHCAPMFMD)
      POGOProtos.Rpc.NONHCAPMFMDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NONHCAPMFMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NONHCAPMFMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NONHCAPMFMD.class, POGOProtos.Rpc.NONHCAPMFMD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NONHCAPMFMD.newBuilder()
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
      feacpfogjkf_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NONHCAPMFMD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NONHCAPMFMD getDefaultInstanceForType() {
      return POGOProtos.Rpc.NONHCAPMFMD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NONHCAPMFMD build() {
      POGOProtos.Rpc.NONHCAPMFMD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NONHCAPMFMD buildPartial() {
      POGOProtos.Rpc.NONHCAPMFMD result = new POGOProtos.Rpc.NONHCAPMFMD(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        feacpfogjkf_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.feacpfogjkf_ = feacpfogjkf_;
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
      if (other instanceof POGOProtos.Rpc.NONHCAPMFMD) {
        return mergeFrom((POGOProtos.Rpc.NONHCAPMFMD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NONHCAPMFMD other) {
      if (other == POGOProtos.Rpc.NONHCAPMFMD.getDefaultInstance()) return this;
      if (!other.feacpfogjkf_.isEmpty()) {
        if (feacpfogjkf_.isEmpty()) {
          feacpfogjkf_ = other.feacpfogjkf_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFeacpfogjkfIsMutable();
          feacpfogjkf_.addAll(other.feacpfogjkf_);
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
      POGOProtos.Rpc.NONHCAPMFMD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NONHCAPMFMD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList feacpfogjkf_ = emptyLongList();
    private void ensureFeacpfogjkfIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feacpfogjkf_ = mutableCopy(feacpfogjkf_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @return A list containing the feacpfogjkf.
     */
    public java.util.List<java.lang.Long>
        getFeacpfogjkfList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(feacpfogjkf_) : feacpfogjkf_;
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @return The count of feacpfogjkf.
     */
    public int getFeacpfogjkfCount() {
      return feacpfogjkf_.size();
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @param index The index of the element to return.
     * @return The feacpfogjkf at the given index.
     */
    public long getFeacpfogjkf(int index) {
      return feacpfogjkf_.getLong(index);
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @param index The index to set the value at.
     * @param value The feacpfogjkf to set.
     * @return This builder for chaining.
     */
    public Builder setFeacpfogjkf(
        int index, long value) {
      ensureFeacpfogjkfIsMutable();
      feacpfogjkf_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @param value The feacpfogjkf to add.
     * @return This builder for chaining.
     */
    public Builder addFeacpfogjkf(long value) {
      ensureFeacpfogjkfIsMutable();
      feacpfogjkf_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @param values The feacpfogjkf to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeacpfogjkf(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureFeacpfogjkfIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, feacpfogjkf_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 feacpfogjkf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeacpfogjkf() {
      feacpfogjkf_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NONHCAPMFMD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NONHCAPMFMD)
  private static final POGOProtos.Rpc.NONHCAPMFMD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NONHCAPMFMD();
  }

  public static POGOProtos.Rpc.NONHCAPMFMD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NONHCAPMFMD>
      PARSER = new com.google.protobuf.AbstractParser<NONHCAPMFMD>() {
    @java.lang.Override
    public NONHCAPMFMD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NONHCAPMFMD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NONHCAPMFMD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NONHCAPMFMD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NONHCAPMFMD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

