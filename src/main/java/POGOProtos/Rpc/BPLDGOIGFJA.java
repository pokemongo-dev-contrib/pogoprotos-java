// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BPLDGOIGFJA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BPLDGOIGFJA}
 */
public final class BPLDGOIGFJA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BPLDGOIGFJA)
    BPLDGOIGFJAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BPLDGOIGFJA.newBuilder() to construct.
  private BPLDGOIGFJA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BPLDGOIGFJA() {
    kekiahdeedh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BPLDGOIGFJA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BPLDGOIGFJA(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              kekiahdeedh_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            kekiahdeedh_.add(s);
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
        kekiahdeedh_ = kekiahdeedh_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BPLDGOIGFJA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BPLDGOIGFJA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BPLDGOIGFJA.class, POGOProtos.Rpc.BPLDGOIGFJA.Builder.class);
  }

  public static final int KEKIAHDEEDH_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList kekiahdeedh_;
  /**
   * <code>repeated string kekiahdeedh = 1;</code>
   * @return A list containing the kekiahdeedh.
   */
  public com.google.protobuf.ProtocolStringList
      getKekiahdeedhList() {
    return kekiahdeedh_;
  }
  /**
   * <code>repeated string kekiahdeedh = 1;</code>
   * @return The count of kekiahdeedh.
   */
  public int getKekiahdeedhCount() {
    return kekiahdeedh_.size();
  }
  /**
   * <code>repeated string kekiahdeedh = 1;</code>
   * @param index The index of the element to return.
   * @return The kekiahdeedh at the given index.
   */
  public java.lang.String getKekiahdeedh(int index) {
    return kekiahdeedh_.get(index);
  }
  /**
   * <code>repeated string kekiahdeedh = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the kekiahdeedh at the given index.
   */
  public com.google.protobuf.ByteString
      getKekiahdeedhBytes(int index) {
    return kekiahdeedh_.getByteString(index);
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
    for (int i = 0; i < kekiahdeedh_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kekiahdeedh_.getRaw(i));
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
      for (int i = 0; i < kekiahdeedh_.size(); i++) {
        dataSize += computeStringSizeNoTag(kekiahdeedh_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKekiahdeedhList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.BPLDGOIGFJA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BPLDGOIGFJA other = (POGOProtos.Rpc.BPLDGOIGFJA) obj;

    if (!getKekiahdeedhList()
        .equals(other.getKekiahdeedhList())) return false;
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
    if (getKekiahdeedhCount() > 0) {
      hash = (37 * hash) + KEKIAHDEEDH_FIELD_NUMBER;
      hash = (53 * hash) + getKekiahdeedhList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BPLDGOIGFJA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BPLDGOIGFJA prototype) {
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
   * ref: BPLDGOIGFJA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BPLDGOIGFJA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BPLDGOIGFJA)
      POGOProtos.Rpc.BPLDGOIGFJAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BPLDGOIGFJA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BPLDGOIGFJA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BPLDGOIGFJA.class, POGOProtos.Rpc.BPLDGOIGFJA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BPLDGOIGFJA.newBuilder()
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
      kekiahdeedh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BPLDGOIGFJA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BPLDGOIGFJA getDefaultInstanceForType() {
      return POGOProtos.Rpc.BPLDGOIGFJA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BPLDGOIGFJA build() {
      POGOProtos.Rpc.BPLDGOIGFJA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BPLDGOIGFJA buildPartial() {
      POGOProtos.Rpc.BPLDGOIGFJA result = new POGOProtos.Rpc.BPLDGOIGFJA(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        kekiahdeedh_ = kekiahdeedh_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.kekiahdeedh_ = kekiahdeedh_;
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
      if (other instanceof POGOProtos.Rpc.BPLDGOIGFJA) {
        return mergeFrom((POGOProtos.Rpc.BPLDGOIGFJA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BPLDGOIGFJA other) {
      if (other == POGOProtos.Rpc.BPLDGOIGFJA.getDefaultInstance()) return this;
      if (!other.kekiahdeedh_.isEmpty()) {
        if (kekiahdeedh_.isEmpty()) {
          kekiahdeedh_ = other.kekiahdeedh_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKekiahdeedhIsMutable();
          kekiahdeedh_.addAll(other.kekiahdeedh_);
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
      POGOProtos.Rpc.BPLDGOIGFJA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BPLDGOIGFJA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList kekiahdeedh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKekiahdeedhIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        kekiahdeedh_ = new com.google.protobuf.LazyStringArrayList(kekiahdeedh_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @return A list containing the kekiahdeedh.
     */
    public com.google.protobuf.ProtocolStringList
        getKekiahdeedhList() {
      return kekiahdeedh_.getUnmodifiableView();
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @return The count of kekiahdeedh.
     */
    public int getKekiahdeedhCount() {
      return kekiahdeedh_.size();
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param index The index of the element to return.
     * @return The kekiahdeedh at the given index.
     */
    public java.lang.String getKekiahdeedh(int index) {
      return kekiahdeedh_.get(index);
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the kekiahdeedh at the given index.
     */
    public com.google.protobuf.ByteString
        getKekiahdeedhBytes(int index) {
      return kekiahdeedh_.getByteString(index);
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param index The index to set the value at.
     * @param value The kekiahdeedh to set.
     * @return This builder for chaining.
     */
    public Builder setKekiahdeedh(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKekiahdeedhIsMutable();
      kekiahdeedh_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param value The kekiahdeedh to add.
     * @return This builder for chaining.
     */
    public Builder addKekiahdeedh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKekiahdeedhIsMutable();
      kekiahdeedh_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param values The kekiahdeedh to add.
     * @return This builder for chaining.
     */
    public Builder addAllKekiahdeedh(
        java.lang.Iterable<java.lang.String> values) {
      ensureKekiahdeedhIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, kekiahdeedh_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKekiahdeedh() {
      kekiahdeedh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string kekiahdeedh = 1;</code>
     * @param value The bytes of the kekiahdeedh to add.
     * @return This builder for chaining.
     */
    public Builder addKekiahdeedhBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKekiahdeedhIsMutable();
      kekiahdeedh_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BPLDGOIGFJA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BPLDGOIGFJA)
  private static final POGOProtos.Rpc.BPLDGOIGFJA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BPLDGOIGFJA();
  }

  public static POGOProtos.Rpc.BPLDGOIGFJA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BPLDGOIGFJA>
      PARSER = new com.google.protobuf.AbstractParser<BPLDGOIGFJA>() {
    @java.lang.Override
    public BPLDGOIGFJA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BPLDGOIGFJA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BPLDGOIGFJA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BPLDGOIGFJA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BPLDGOIGFJA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

