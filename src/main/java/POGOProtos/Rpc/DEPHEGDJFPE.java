// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DEPHEGDJFPE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DEPHEGDJFPE}
 */
public final class DEPHEGDJFPE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DEPHEGDJFPE)
    DEPHEGDJFPEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DEPHEGDJFPE.newBuilder() to construct.
  private DEPHEGDJFPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DEPHEGDJFPE() {
    bpngeocdhcn_ = emptyLongList();
    dkeaellncip_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DEPHEGDJFPE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DEPHEGDJFPE(
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
              bpngeocdhcn_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            bpngeocdhcn_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              bpngeocdhcn_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              bpngeocdhcn_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dkeaellncip_ = s;
            break;
          }
          case 24: {

            djjkiliegic_ = input.readInt64();
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
        bpngeocdhcn_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DEPHEGDJFPE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DEPHEGDJFPE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DEPHEGDJFPE.class, POGOProtos.Rpc.DEPHEGDJFPE.Builder.class);
  }

  public static final int BPNGEOCDHCN_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList bpngeocdhcn_;
  /**
   * <code>repeated uint64 bpngeocdhcn = 1;</code>
   * @return A list containing the bpngeocdhcn.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getBpngeocdhcnList() {
    return bpngeocdhcn_;
  }
  /**
   * <code>repeated uint64 bpngeocdhcn = 1;</code>
   * @return The count of bpngeocdhcn.
   */
  public int getBpngeocdhcnCount() {
    return bpngeocdhcn_.size();
  }
  /**
   * <code>repeated uint64 bpngeocdhcn = 1;</code>
   * @param index The index of the element to return.
   * @return The bpngeocdhcn at the given index.
   */
  public long getBpngeocdhcn(int index) {
    return bpngeocdhcn_.getLong(index);
  }
  private int bpngeocdhcnMemoizedSerializedSize = -1;

  public static final int DKEAELLNCIP_FIELD_NUMBER = 2;
  private volatile java.lang.Object dkeaellncip_;
  /**
   * <code>string dkeaellncip = 2;</code>
   * @return The dkeaellncip.
   */
  @java.lang.Override
  public java.lang.String getDkeaellncip() {
    java.lang.Object ref = dkeaellncip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dkeaellncip_ = s;
      return s;
    }
  }
  /**
   * <code>string dkeaellncip = 2;</code>
   * @return The bytes for dkeaellncip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDkeaellncipBytes() {
    java.lang.Object ref = dkeaellncip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dkeaellncip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DJJKILIEGIC_FIELD_NUMBER = 3;
  private long djjkiliegic_;
  /**
   * <code>int64 djjkiliegic = 3;</code>
   * @return The djjkiliegic.
   */
  @java.lang.Override
  public long getDjjkiliegic() {
    return djjkiliegic_;
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
    if (getBpngeocdhcnList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(bpngeocdhcnMemoizedSerializedSize);
    }
    for (int i = 0; i < bpngeocdhcn_.size(); i++) {
      output.writeUInt64NoTag(bpngeocdhcn_.getLong(i));
    }
    if (!getDkeaellncipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dkeaellncip_);
    }
    if (djjkiliegic_ != 0L) {
      output.writeInt64(3, djjkiliegic_);
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
      for (int i = 0; i < bpngeocdhcn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(bpngeocdhcn_.getLong(i));
      }
      size += dataSize;
      if (!getBpngeocdhcnList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bpngeocdhcnMemoizedSerializedSize = dataSize;
    }
    if (!getDkeaellncipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dkeaellncip_);
    }
    if (djjkiliegic_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, djjkiliegic_);
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
    if (!(obj instanceof POGOProtos.Rpc.DEPHEGDJFPE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DEPHEGDJFPE other = (POGOProtos.Rpc.DEPHEGDJFPE) obj;

    if (!getBpngeocdhcnList()
        .equals(other.getBpngeocdhcnList())) return false;
    if (!getDkeaellncip()
        .equals(other.getDkeaellncip())) return false;
    if (getDjjkiliegic()
        != other.getDjjkiliegic()) return false;
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
    if (getBpngeocdhcnCount() > 0) {
      hash = (37 * hash) + BPNGEOCDHCN_FIELD_NUMBER;
      hash = (53 * hash) + getBpngeocdhcnList().hashCode();
    }
    hash = (37 * hash) + DKEAELLNCIP_FIELD_NUMBER;
    hash = (53 * hash) + getDkeaellncip().hashCode();
    hash = (37 * hash) + DJJKILIEGIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDjjkiliegic());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DEPHEGDJFPE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DEPHEGDJFPE prototype) {
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
   * ref: DEPHEGDJFPE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DEPHEGDJFPE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DEPHEGDJFPE)
      POGOProtos.Rpc.DEPHEGDJFPEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DEPHEGDJFPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DEPHEGDJFPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DEPHEGDJFPE.class, POGOProtos.Rpc.DEPHEGDJFPE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DEPHEGDJFPE.newBuilder()
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
      bpngeocdhcn_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      dkeaellncip_ = "";

      djjkiliegic_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DEPHEGDJFPE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DEPHEGDJFPE getDefaultInstanceForType() {
      return POGOProtos.Rpc.DEPHEGDJFPE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DEPHEGDJFPE build() {
      POGOProtos.Rpc.DEPHEGDJFPE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DEPHEGDJFPE buildPartial() {
      POGOProtos.Rpc.DEPHEGDJFPE result = new POGOProtos.Rpc.DEPHEGDJFPE(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        bpngeocdhcn_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.bpngeocdhcn_ = bpngeocdhcn_;
      result.dkeaellncip_ = dkeaellncip_;
      result.djjkiliegic_ = djjkiliegic_;
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
      if (other instanceof POGOProtos.Rpc.DEPHEGDJFPE) {
        return mergeFrom((POGOProtos.Rpc.DEPHEGDJFPE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DEPHEGDJFPE other) {
      if (other == POGOProtos.Rpc.DEPHEGDJFPE.getDefaultInstance()) return this;
      if (!other.bpngeocdhcn_.isEmpty()) {
        if (bpngeocdhcn_.isEmpty()) {
          bpngeocdhcn_ = other.bpngeocdhcn_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBpngeocdhcnIsMutable();
          bpngeocdhcn_.addAll(other.bpngeocdhcn_);
        }
        onChanged();
      }
      if (!other.getDkeaellncip().isEmpty()) {
        dkeaellncip_ = other.dkeaellncip_;
        onChanged();
      }
      if (other.getDjjkiliegic() != 0L) {
        setDjjkiliegic(other.getDjjkiliegic());
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
      POGOProtos.Rpc.DEPHEGDJFPE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DEPHEGDJFPE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList bpngeocdhcn_ = emptyLongList();
    private void ensureBpngeocdhcnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bpngeocdhcn_ = mutableCopy(bpngeocdhcn_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @return A list containing the bpngeocdhcn.
     */
    public java.util.List<java.lang.Long>
        getBpngeocdhcnList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(bpngeocdhcn_) : bpngeocdhcn_;
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @return The count of bpngeocdhcn.
     */
    public int getBpngeocdhcnCount() {
      return bpngeocdhcn_.size();
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @param index The index of the element to return.
     * @return The bpngeocdhcn at the given index.
     */
    public long getBpngeocdhcn(int index) {
      return bpngeocdhcn_.getLong(index);
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @param index The index to set the value at.
     * @param value The bpngeocdhcn to set.
     * @return This builder for chaining.
     */
    public Builder setBpngeocdhcn(
        int index, long value) {
      ensureBpngeocdhcnIsMutable();
      bpngeocdhcn_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @param value The bpngeocdhcn to add.
     * @return This builder for chaining.
     */
    public Builder addBpngeocdhcn(long value) {
      ensureBpngeocdhcnIsMutable();
      bpngeocdhcn_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @param values The bpngeocdhcn to add.
     * @return This builder for chaining.
     */
    public Builder addAllBpngeocdhcn(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureBpngeocdhcnIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bpngeocdhcn_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bpngeocdhcn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBpngeocdhcn() {
      bpngeocdhcn_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object dkeaellncip_ = "";
    /**
     * <code>string dkeaellncip = 2;</code>
     * @return The dkeaellncip.
     */
    public java.lang.String getDkeaellncip() {
      java.lang.Object ref = dkeaellncip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dkeaellncip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dkeaellncip = 2;</code>
     * @return The bytes for dkeaellncip.
     */
    public com.google.protobuf.ByteString
        getDkeaellncipBytes() {
      java.lang.Object ref = dkeaellncip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dkeaellncip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dkeaellncip = 2;</code>
     * @param value The dkeaellncip to set.
     * @return This builder for chaining.
     */
    public Builder setDkeaellncip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dkeaellncip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dkeaellncip = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDkeaellncip() {
      
      dkeaellncip_ = getDefaultInstance().getDkeaellncip();
      onChanged();
      return this;
    }
    /**
     * <code>string dkeaellncip = 2;</code>
     * @param value The bytes for dkeaellncip to set.
     * @return This builder for chaining.
     */
    public Builder setDkeaellncipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dkeaellncip_ = value;
      onChanged();
      return this;
    }

    private long djjkiliegic_ ;
    /**
     * <code>int64 djjkiliegic = 3;</code>
     * @return The djjkiliegic.
     */
    @java.lang.Override
    public long getDjjkiliegic() {
      return djjkiliegic_;
    }
    /**
     * <code>int64 djjkiliegic = 3;</code>
     * @param value The djjkiliegic to set.
     * @return This builder for chaining.
     */
    public Builder setDjjkiliegic(long value) {
      
      djjkiliegic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 djjkiliegic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDjjkiliegic() {
      
      djjkiliegic_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DEPHEGDJFPE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DEPHEGDJFPE)
  private static final POGOProtos.Rpc.DEPHEGDJFPE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DEPHEGDJFPE();
  }

  public static POGOProtos.Rpc.DEPHEGDJFPE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DEPHEGDJFPE>
      PARSER = new com.google.protobuf.AbstractParser<DEPHEGDJFPE>() {
    @java.lang.Override
    public DEPHEGDJFPE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DEPHEGDJFPE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DEPHEGDJFPE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DEPHEGDJFPE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DEPHEGDJFPE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

