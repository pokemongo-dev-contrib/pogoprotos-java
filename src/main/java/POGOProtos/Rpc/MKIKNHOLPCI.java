// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MKIKNHOLPCI}
 */
public  final class MKIKNHOLPCI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MKIKNHOLPCI)
    MKIKNHOLPCIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MKIKNHOLPCI.newBuilder() to construct.
  private MKIKNHOLPCI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MKIKNHOLPCI() {
    emolceedgcf_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MKIKNHOLPCI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MKIKNHOLPCI(
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

            iaaegadpglm_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              emolceedgcf_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            emolceedgcf_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              emolceedgcf_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              emolceedgcf_.addLong(input.readUInt64());
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
        emolceedgcf_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MKIKNHOLPCI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MKIKNHOLPCI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MKIKNHOLPCI.class, POGOProtos.Rpc.MKIKNHOLPCI.Builder.class);
  }

  public static final int IAAEGADPGLM_FIELD_NUMBER = 1;
  private int iaaegadpglm_;
  /**
   * <code>int32 iaaegadpglm = 1;</code>
   * @return The iaaegadpglm.
   */
  public int getIaaegadpglm() {
    return iaaegadpglm_;
  }

  public static final int EMOLCEEDGCF_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList emolceedgcf_;
  /**
   * <code>repeated uint64 emolceedgcf = 2;</code>
   * @return A list containing the emolceedgcf.
   */
  public java.util.List<java.lang.Long>
      getEmolceedgcfList() {
    return emolceedgcf_;
  }
  /**
   * <code>repeated uint64 emolceedgcf = 2;</code>
   * @return The count of emolceedgcf.
   */
  public int getEmolceedgcfCount() {
    return emolceedgcf_.size();
  }
  /**
   * <code>repeated uint64 emolceedgcf = 2;</code>
   * @param index The index of the element to return.
   * @return The emolceedgcf at the given index.
   */
  public long getEmolceedgcf(int index) {
    return emolceedgcf_.getLong(index);
  }
  private int emolceedgcfMemoizedSerializedSize = -1;

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
    if (iaaegadpglm_ != 0) {
      output.writeInt32(1, iaaegadpglm_);
    }
    if (getEmolceedgcfList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(emolceedgcfMemoizedSerializedSize);
    }
    for (int i = 0; i < emolceedgcf_.size(); i++) {
      output.writeUInt64NoTag(emolceedgcf_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iaaegadpglm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, iaaegadpglm_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < emolceedgcf_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(emolceedgcf_.getLong(i));
      }
      size += dataSize;
      if (!getEmolceedgcfList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      emolceedgcfMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.MKIKNHOLPCI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MKIKNHOLPCI other = (POGOProtos.Rpc.MKIKNHOLPCI) obj;

    if (getIaaegadpglm()
        != other.getIaaegadpglm()) return false;
    if (!getEmolceedgcfList()
        .equals(other.getEmolceedgcfList())) return false;
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
    hash = (37 * hash) + IAAEGADPGLM_FIELD_NUMBER;
    hash = (53 * hash) + getIaaegadpglm();
    if (getEmolceedgcfCount() > 0) {
      hash = (37 * hash) + EMOLCEEDGCF_FIELD_NUMBER;
      hash = (53 * hash) + getEmolceedgcfList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MKIKNHOLPCI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MKIKNHOLPCI prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MKIKNHOLPCI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MKIKNHOLPCI)
      POGOProtos.Rpc.MKIKNHOLPCIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MKIKNHOLPCI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MKIKNHOLPCI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MKIKNHOLPCI.class, POGOProtos.Rpc.MKIKNHOLPCI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MKIKNHOLPCI.newBuilder()
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
      iaaegadpglm_ = 0;

      emolceedgcf_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MKIKNHOLPCI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MKIKNHOLPCI getDefaultInstanceForType() {
      return POGOProtos.Rpc.MKIKNHOLPCI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MKIKNHOLPCI build() {
      POGOProtos.Rpc.MKIKNHOLPCI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MKIKNHOLPCI buildPartial() {
      POGOProtos.Rpc.MKIKNHOLPCI result = new POGOProtos.Rpc.MKIKNHOLPCI(this);
      int from_bitField0_ = bitField0_;
      result.iaaegadpglm_ = iaaegadpglm_;
      if (((bitField0_ & 0x00000001) != 0)) {
        emolceedgcf_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.emolceedgcf_ = emolceedgcf_;
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
      if (other instanceof POGOProtos.Rpc.MKIKNHOLPCI) {
        return mergeFrom((POGOProtos.Rpc.MKIKNHOLPCI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MKIKNHOLPCI other) {
      if (other == POGOProtos.Rpc.MKIKNHOLPCI.getDefaultInstance()) return this;
      if (other.getIaaegadpglm() != 0) {
        setIaaegadpglm(other.getIaaegadpglm());
      }
      if (!other.emolceedgcf_.isEmpty()) {
        if (emolceedgcf_.isEmpty()) {
          emolceedgcf_ = other.emolceedgcf_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEmolceedgcfIsMutable();
          emolceedgcf_.addAll(other.emolceedgcf_);
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
      POGOProtos.Rpc.MKIKNHOLPCI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MKIKNHOLPCI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int iaaegadpglm_ ;
    /**
     * <code>int32 iaaegadpglm = 1;</code>
     * @return The iaaegadpglm.
     */
    public int getIaaegadpglm() {
      return iaaegadpglm_;
    }
    /**
     * <code>int32 iaaegadpglm = 1;</code>
     * @param value The iaaegadpglm to set.
     * @return This builder for chaining.
     */
    public Builder setIaaegadpglm(int value) {
      
      iaaegadpglm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 iaaegadpglm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIaaegadpglm() {
      
      iaaegadpglm_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList emolceedgcf_ = emptyLongList();
    private void ensureEmolceedgcfIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        emolceedgcf_ = mutableCopy(emolceedgcf_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @return A list containing the emolceedgcf.
     */
    public java.util.List<java.lang.Long>
        getEmolceedgcfList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(emolceedgcf_) : emolceedgcf_;
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @return The count of emolceedgcf.
     */
    public int getEmolceedgcfCount() {
      return emolceedgcf_.size();
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @param index The index of the element to return.
     * @return The emolceedgcf at the given index.
     */
    public long getEmolceedgcf(int index) {
      return emolceedgcf_.getLong(index);
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @param index The index to set the value at.
     * @param value The emolceedgcf to set.
     * @return This builder for chaining.
     */
    public Builder setEmolceedgcf(
        int index, long value) {
      ensureEmolceedgcfIsMutable();
      emolceedgcf_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @param value The emolceedgcf to add.
     * @return This builder for chaining.
     */
    public Builder addEmolceedgcf(long value) {
      ensureEmolceedgcfIsMutable();
      emolceedgcf_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @param values The emolceedgcf to add.
     * @return This builder for chaining.
     */
    public Builder addAllEmolceedgcf(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureEmolceedgcfIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, emolceedgcf_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 emolceedgcf = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmolceedgcf() {
      emolceedgcf_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MKIKNHOLPCI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MKIKNHOLPCI)
  private static final POGOProtos.Rpc.MKIKNHOLPCI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MKIKNHOLPCI();
  }

  public static POGOProtos.Rpc.MKIKNHOLPCI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MKIKNHOLPCI>
      PARSER = new com.google.protobuf.AbstractParser<MKIKNHOLPCI>() {
    @java.lang.Override
    public MKIKNHOLPCI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MKIKNHOLPCI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MKIKNHOLPCI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MKIKNHOLPCI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MKIKNHOLPCI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

