// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BOMFNFDHFFP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BOMFNFDHFFP}
 */
public  final class BOMFNFDHFFP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BOMFNFDHFFP)
    BOMFNFDHFFPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BOMFNFDHFFP.newBuilder() to construct.
  private BOMFNFDHFFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BOMFNFDHFFP() {
    bfcdigjokfl_ = emptyLongList();
    mlahgofjabo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BOMFNFDHFFP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BOMFNFDHFFP(
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
              bfcdigjokfl_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            bfcdigjokfl_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              bfcdigjokfl_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              bfcdigjokfl_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            mlahgofjabo_ = s;
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
        bfcdigjokfl_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOMFNFDHFFP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOMFNFDHFFP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BOMFNFDHFFP.class, POGOProtos.Rpc.BOMFNFDHFFP.Builder.class);
  }

  public static final int BFCDIGJOKFL_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList bfcdigjokfl_;
  /**
   * <code>repeated uint64 bfcdigjokfl = 1;</code>
   * @return A list containing the bfcdigjokfl.
   */
  public java.util.List<java.lang.Long>
      getBfcdigjokflList() {
    return bfcdigjokfl_;
  }
  /**
   * <code>repeated uint64 bfcdigjokfl = 1;</code>
   * @return The count of bfcdigjokfl.
   */
  public int getBfcdigjokflCount() {
    return bfcdigjokfl_.size();
  }
  /**
   * <code>repeated uint64 bfcdigjokfl = 1;</code>
   * @param index The index of the element to return.
   * @return The bfcdigjokfl at the given index.
   */
  public long getBfcdigjokfl(int index) {
    return bfcdigjokfl_.getLong(index);
  }
  private int bfcdigjokflMemoizedSerializedSize = -1;

  public static final int MLAHGOFJABO_FIELD_NUMBER = 2;
  private volatile java.lang.Object mlahgofjabo_;
  /**
   * <code>string mlahgofjabo = 2;</code>
   * @return The mlahgofjabo.
   */
  public java.lang.String getMlahgofjabo() {
    java.lang.Object ref = mlahgofjabo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mlahgofjabo_ = s;
      return s;
    }
  }
  /**
   * <code>string mlahgofjabo = 2;</code>
   * @return The bytes for mlahgofjabo.
   */
  public com.google.protobuf.ByteString
      getMlahgofjaboBytes() {
    java.lang.Object ref = mlahgofjabo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mlahgofjabo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    getSerializedSize();
    if (getBfcdigjokflList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(bfcdigjokflMemoizedSerializedSize);
    }
    for (int i = 0; i < bfcdigjokfl_.size(); i++) {
      output.writeUInt64NoTag(bfcdigjokfl_.getLong(i));
    }
    if (!getMlahgofjaboBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mlahgofjabo_);
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
      for (int i = 0; i < bfcdigjokfl_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(bfcdigjokfl_.getLong(i));
      }
      size += dataSize;
      if (!getBfcdigjokflList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bfcdigjokflMemoizedSerializedSize = dataSize;
    }
    if (!getMlahgofjaboBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mlahgofjabo_);
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
    if (!(obj instanceof POGOProtos.Rpc.BOMFNFDHFFP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BOMFNFDHFFP other = (POGOProtos.Rpc.BOMFNFDHFFP) obj;

    if (!getBfcdigjokflList()
        .equals(other.getBfcdigjokflList())) return false;
    if (!getMlahgofjabo()
        .equals(other.getMlahgofjabo())) return false;
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
    if (getBfcdigjokflCount() > 0) {
      hash = (37 * hash) + BFCDIGJOKFL_FIELD_NUMBER;
      hash = (53 * hash) + getBfcdigjokflList().hashCode();
    }
    hash = (37 * hash) + MLAHGOFJABO_FIELD_NUMBER;
    hash = (53 * hash) + getMlahgofjabo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOMFNFDHFFP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BOMFNFDHFFP prototype) {
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
   * ref: BOMFNFDHFFP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BOMFNFDHFFP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BOMFNFDHFFP)
      POGOProtos.Rpc.BOMFNFDHFFPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOMFNFDHFFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOMFNFDHFFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BOMFNFDHFFP.class, POGOProtos.Rpc.BOMFNFDHFFP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BOMFNFDHFFP.newBuilder()
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
      bfcdigjokfl_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      mlahgofjabo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOMFNFDHFFP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOMFNFDHFFP getDefaultInstanceForType() {
      return POGOProtos.Rpc.BOMFNFDHFFP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOMFNFDHFFP build() {
      POGOProtos.Rpc.BOMFNFDHFFP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOMFNFDHFFP buildPartial() {
      POGOProtos.Rpc.BOMFNFDHFFP result = new POGOProtos.Rpc.BOMFNFDHFFP(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        bfcdigjokfl_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.bfcdigjokfl_ = bfcdigjokfl_;
      result.mlahgofjabo_ = mlahgofjabo_;
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
      if (other instanceof POGOProtos.Rpc.BOMFNFDHFFP) {
        return mergeFrom((POGOProtos.Rpc.BOMFNFDHFFP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BOMFNFDHFFP other) {
      if (other == POGOProtos.Rpc.BOMFNFDHFFP.getDefaultInstance()) return this;
      if (!other.bfcdigjokfl_.isEmpty()) {
        if (bfcdigjokfl_.isEmpty()) {
          bfcdigjokfl_ = other.bfcdigjokfl_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBfcdigjokflIsMutable();
          bfcdigjokfl_.addAll(other.bfcdigjokfl_);
        }
        onChanged();
      }
      if (!other.getMlahgofjabo().isEmpty()) {
        mlahgofjabo_ = other.mlahgofjabo_;
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
      POGOProtos.Rpc.BOMFNFDHFFP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BOMFNFDHFFP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList bfcdigjokfl_ = emptyLongList();
    private void ensureBfcdigjokflIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bfcdigjokfl_ = mutableCopy(bfcdigjokfl_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @return A list containing the bfcdigjokfl.
     */
    public java.util.List<java.lang.Long>
        getBfcdigjokflList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(bfcdigjokfl_) : bfcdigjokfl_;
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @return The count of bfcdigjokfl.
     */
    public int getBfcdigjokflCount() {
      return bfcdigjokfl_.size();
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @param index The index of the element to return.
     * @return The bfcdigjokfl at the given index.
     */
    public long getBfcdigjokfl(int index) {
      return bfcdigjokfl_.getLong(index);
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @param index The index to set the value at.
     * @param value The bfcdigjokfl to set.
     * @return This builder for chaining.
     */
    public Builder setBfcdigjokfl(
        int index, long value) {
      ensureBfcdigjokflIsMutable();
      bfcdigjokfl_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @param value The bfcdigjokfl to add.
     * @return This builder for chaining.
     */
    public Builder addBfcdigjokfl(long value) {
      ensureBfcdigjokflIsMutable();
      bfcdigjokfl_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @param values The bfcdigjokfl to add.
     * @return This builder for chaining.
     */
    public Builder addAllBfcdigjokfl(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureBfcdigjokflIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bfcdigjokfl_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bfcdigjokfl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBfcdigjokfl() {
      bfcdigjokfl_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object mlahgofjabo_ = "";
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return The mlahgofjabo.
     */
    public java.lang.String getMlahgofjabo() {
      java.lang.Object ref = mlahgofjabo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mlahgofjabo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return The bytes for mlahgofjabo.
     */
    public com.google.protobuf.ByteString
        getMlahgofjaboBytes() {
      java.lang.Object ref = mlahgofjabo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mlahgofjabo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @param value The mlahgofjabo to set.
     * @return This builder for chaining.
     */
    public Builder setMlahgofjabo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mlahgofjabo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlahgofjabo() {
      
      mlahgofjabo_ = getDefaultInstance().getMlahgofjabo();
      onChanged();
      return this;
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @param value The bytes for mlahgofjabo to set.
     * @return This builder for chaining.
     */
    public Builder setMlahgofjaboBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mlahgofjabo_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BOMFNFDHFFP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BOMFNFDHFFP)
  private static final POGOProtos.Rpc.BOMFNFDHFFP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BOMFNFDHFFP();
  }

  public static POGOProtos.Rpc.BOMFNFDHFFP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BOMFNFDHFFP>
      PARSER = new com.google.protobuf.AbstractParser<BOMFNFDHFFP>() {
    @java.lang.Override
    public BOMFNFDHFFP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BOMFNFDHFFP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BOMFNFDHFFP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BOMFNFDHFFP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BOMFNFDHFFP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

