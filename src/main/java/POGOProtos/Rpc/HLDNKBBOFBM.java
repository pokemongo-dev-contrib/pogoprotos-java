// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HLDNKBBOFBM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HLDNKBBOFBM}
 */
public final class HLDNKBBOFBM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HLDNKBBOFBM)
    HLDNKBBOFBMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HLDNKBBOFBM.newBuilder() to construct.
  private HLDNKBBOFBM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HLDNKBBOFBM() {
    koegfehchoe_ = "";
    ikfegknamcc_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HLDNKBBOFBM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HLDNKBBOFBM(
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
            java.lang.String s = input.readStringRequireUtf8();

            koegfehchoe_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ikfegknamcc_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            ikfegknamcc_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              ikfegknamcc_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ikfegknamcc_.addLong(input.readUInt64());
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
        ikfegknamcc_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLDNKBBOFBM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLDNKBBOFBM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HLDNKBBOFBM.class, POGOProtos.Rpc.HLDNKBBOFBM.Builder.class);
  }

  public static final int KOEGFEHCHOE_FIELD_NUMBER = 1;
  private volatile java.lang.Object koegfehchoe_;
  /**
   * <code>string koegfehchoe = 1;</code>
   * @return The koegfehchoe.
   */
  @java.lang.Override
  public java.lang.String getKoegfehchoe() {
    java.lang.Object ref = koegfehchoe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      koegfehchoe_ = s;
      return s;
    }
  }
  /**
   * <code>string koegfehchoe = 1;</code>
   * @return The bytes for koegfehchoe.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKoegfehchoeBytes() {
    java.lang.Object ref = koegfehchoe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      koegfehchoe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IKFEGKNAMCC_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList ikfegknamcc_;
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @return A list containing the ikfegknamcc.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getIkfegknamccList() {
    return ikfegknamcc_;
  }
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @return The count of ikfegknamcc.
   */
  public int getIkfegknamccCount() {
    return ikfegknamcc_.size();
  }
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @param index The index of the element to return.
   * @return The ikfegknamcc at the given index.
   */
  public long getIkfegknamcc(int index) {
    return ikfegknamcc_.getLong(index);
  }
  private int ikfegknamccMemoizedSerializedSize = -1;

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
    if (!getKoegfehchoeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, koegfehchoe_);
    }
    if (getIkfegknamccList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(ikfegknamccMemoizedSerializedSize);
    }
    for (int i = 0; i < ikfegknamcc_.size(); i++) {
      output.writeUInt64NoTag(ikfegknamcc_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKoegfehchoeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, koegfehchoe_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ikfegknamcc_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(ikfegknamcc_.getLong(i));
      }
      size += dataSize;
      if (!getIkfegknamccList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ikfegknamccMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.HLDNKBBOFBM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HLDNKBBOFBM other = (POGOProtos.Rpc.HLDNKBBOFBM) obj;

    if (!getKoegfehchoe()
        .equals(other.getKoegfehchoe())) return false;
    if (!getIkfegknamccList()
        .equals(other.getIkfegknamccList())) return false;
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
    hash = (37 * hash) + KOEGFEHCHOE_FIELD_NUMBER;
    hash = (53 * hash) + getKoegfehchoe().hashCode();
    if (getIkfegknamccCount() > 0) {
      hash = (37 * hash) + IKFEGKNAMCC_FIELD_NUMBER;
      hash = (53 * hash) + getIkfegknamccList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLDNKBBOFBM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HLDNKBBOFBM prototype) {
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
   * ref: HLDNKBBOFBM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HLDNKBBOFBM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HLDNKBBOFBM)
      POGOProtos.Rpc.HLDNKBBOFBMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLDNKBBOFBM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLDNKBBOFBM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HLDNKBBOFBM.class, POGOProtos.Rpc.HLDNKBBOFBM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HLDNKBBOFBM.newBuilder()
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
      koegfehchoe_ = "";

      ikfegknamcc_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLDNKBBOFBM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLDNKBBOFBM getDefaultInstanceForType() {
      return POGOProtos.Rpc.HLDNKBBOFBM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLDNKBBOFBM build() {
      POGOProtos.Rpc.HLDNKBBOFBM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLDNKBBOFBM buildPartial() {
      POGOProtos.Rpc.HLDNKBBOFBM result = new POGOProtos.Rpc.HLDNKBBOFBM(this);
      int from_bitField0_ = bitField0_;
      result.koegfehchoe_ = koegfehchoe_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ikfegknamcc_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ikfegknamcc_ = ikfegknamcc_;
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
      if (other instanceof POGOProtos.Rpc.HLDNKBBOFBM) {
        return mergeFrom((POGOProtos.Rpc.HLDNKBBOFBM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HLDNKBBOFBM other) {
      if (other == POGOProtos.Rpc.HLDNKBBOFBM.getDefaultInstance()) return this;
      if (!other.getKoegfehchoe().isEmpty()) {
        koegfehchoe_ = other.koegfehchoe_;
        onChanged();
      }
      if (!other.ikfegknamcc_.isEmpty()) {
        if (ikfegknamcc_.isEmpty()) {
          ikfegknamcc_ = other.ikfegknamcc_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIkfegknamccIsMutable();
          ikfegknamcc_.addAll(other.ikfegknamcc_);
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
      POGOProtos.Rpc.HLDNKBBOFBM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HLDNKBBOFBM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object koegfehchoe_ = "";
    /**
     * <code>string koegfehchoe = 1;</code>
     * @return The koegfehchoe.
     */
    public java.lang.String getKoegfehchoe() {
      java.lang.Object ref = koegfehchoe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        koegfehchoe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string koegfehchoe = 1;</code>
     * @return The bytes for koegfehchoe.
     */
    public com.google.protobuf.ByteString
        getKoegfehchoeBytes() {
      java.lang.Object ref = koegfehchoe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        koegfehchoe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string koegfehchoe = 1;</code>
     * @param value The koegfehchoe to set.
     * @return This builder for chaining.
     */
    public Builder setKoegfehchoe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      koegfehchoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string koegfehchoe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKoegfehchoe() {
      
      koegfehchoe_ = getDefaultInstance().getKoegfehchoe();
      onChanged();
      return this;
    }
    /**
     * <code>string koegfehchoe = 1;</code>
     * @param value The bytes for koegfehchoe to set.
     * @return This builder for chaining.
     */
    public Builder setKoegfehchoeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      koegfehchoe_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList ikfegknamcc_ = emptyLongList();
    private void ensureIkfegknamccIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ikfegknamcc_ = mutableCopy(ikfegknamcc_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return A list containing the ikfegknamcc.
     */
    public java.util.List<java.lang.Long>
        getIkfegknamccList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ikfegknamcc_) : ikfegknamcc_;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return The count of ikfegknamcc.
     */
    public int getIkfegknamccCount() {
      return ikfegknamcc_.size();
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param index The index of the element to return.
     * @return The ikfegknamcc at the given index.
     */
    public long getIkfegknamcc(int index) {
      return ikfegknamcc_.getLong(index);
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param index The index to set the value at.
     * @param value The ikfegknamcc to set.
     * @return This builder for chaining.
     */
    public Builder setIkfegknamcc(
        int index, long value) {
      ensureIkfegknamccIsMutable();
      ikfegknamcc_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param value The ikfegknamcc to add.
     * @return This builder for chaining.
     */
    public Builder addIkfegknamcc(long value) {
      ensureIkfegknamccIsMutable();
      ikfegknamcc_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param values The ikfegknamcc to add.
     * @return This builder for chaining.
     */
    public Builder addAllIkfegknamcc(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIkfegknamccIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ikfegknamcc_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIkfegknamcc() {
      ikfegknamcc_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HLDNKBBOFBM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HLDNKBBOFBM)
  private static final POGOProtos.Rpc.HLDNKBBOFBM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HLDNKBBOFBM();
  }

  public static POGOProtos.Rpc.HLDNKBBOFBM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HLDNKBBOFBM>
      PARSER = new com.google.protobuf.AbstractParser<HLDNKBBOFBM>() {
    @java.lang.Override
    public HLDNKBBOFBM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HLDNKBBOFBM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HLDNKBBOFBM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HLDNKBBOFBM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HLDNKBBOFBM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

