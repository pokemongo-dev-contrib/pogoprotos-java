// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HNIOOOFONIN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HNIOOOFONIN}
 */
public final class HNIOOOFONIN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HNIOOOFONIN)
    HNIOOOFONINOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HNIOOOFONIN.newBuilder() to construct.
  private HNIOOOFONIN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HNIOOOFONIN() {
    dmfjfhnbelg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HNIOOOFONIN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HNIOOOFONIN(
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
              dmfjfhnbelg_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            dmfjfhnbelg_.add(s);
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
        dmfjfhnbelg_ = dmfjfhnbelg_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNIOOOFONIN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNIOOOFONIN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HNIOOOFONIN.class, POGOProtos.Rpc.HNIOOOFONIN.Builder.class);
  }

  public static final int DMFJFHNBELG_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList dmfjfhnbelg_;
  /**
   * <code>repeated string dmfjfhnbelg = 1;</code>
   * @return A list containing the dmfjfhnbelg.
   */
  public com.google.protobuf.ProtocolStringList
      getDmfjfhnbelgList() {
    return dmfjfhnbelg_;
  }
  /**
   * <code>repeated string dmfjfhnbelg = 1;</code>
   * @return The count of dmfjfhnbelg.
   */
  public int getDmfjfhnbelgCount() {
    return dmfjfhnbelg_.size();
  }
  /**
   * <code>repeated string dmfjfhnbelg = 1;</code>
   * @param index The index of the element to return.
   * @return The dmfjfhnbelg at the given index.
   */
  public java.lang.String getDmfjfhnbelg(int index) {
    return dmfjfhnbelg_.get(index);
  }
  /**
   * <code>repeated string dmfjfhnbelg = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dmfjfhnbelg at the given index.
   */
  public com.google.protobuf.ByteString
      getDmfjfhnbelgBytes(int index) {
    return dmfjfhnbelg_.getByteString(index);
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
    for (int i = 0; i < dmfjfhnbelg_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dmfjfhnbelg_.getRaw(i));
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
      for (int i = 0; i < dmfjfhnbelg_.size(); i++) {
        dataSize += computeStringSizeNoTag(dmfjfhnbelg_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDmfjfhnbelgList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.HNIOOOFONIN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HNIOOOFONIN other = (POGOProtos.Rpc.HNIOOOFONIN) obj;

    if (!getDmfjfhnbelgList()
        .equals(other.getDmfjfhnbelgList())) return false;
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
    if (getDmfjfhnbelgCount() > 0) {
      hash = (37 * hash) + DMFJFHNBELG_FIELD_NUMBER;
      hash = (53 * hash) + getDmfjfhnbelgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNIOOOFONIN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HNIOOOFONIN prototype) {
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
   * ref: HNIOOOFONIN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HNIOOOFONIN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HNIOOOFONIN)
      POGOProtos.Rpc.HNIOOOFONINOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNIOOOFONIN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNIOOOFONIN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HNIOOOFONIN.class, POGOProtos.Rpc.HNIOOOFONIN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HNIOOOFONIN.newBuilder()
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
      dmfjfhnbelg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNIOOOFONIN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNIOOOFONIN getDefaultInstanceForType() {
      return POGOProtos.Rpc.HNIOOOFONIN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNIOOOFONIN build() {
      POGOProtos.Rpc.HNIOOOFONIN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNIOOOFONIN buildPartial() {
      POGOProtos.Rpc.HNIOOOFONIN result = new POGOProtos.Rpc.HNIOOOFONIN(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dmfjfhnbelg_ = dmfjfhnbelg_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dmfjfhnbelg_ = dmfjfhnbelg_;
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
      if (other instanceof POGOProtos.Rpc.HNIOOOFONIN) {
        return mergeFrom((POGOProtos.Rpc.HNIOOOFONIN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HNIOOOFONIN other) {
      if (other == POGOProtos.Rpc.HNIOOOFONIN.getDefaultInstance()) return this;
      if (!other.dmfjfhnbelg_.isEmpty()) {
        if (dmfjfhnbelg_.isEmpty()) {
          dmfjfhnbelg_ = other.dmfjfhnbelg_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDmfjfhnbelgIsMutable();
          dmfjfhnbelg_.addAll(other.dmfjfhnbelg_);
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
      POGOProtos.Rpc.HNIOOOFONIN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HNIOOOFONIN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList dmfjfhnbelg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDmfjfhnbelgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dmfjfhnbelg_ = new com.google.protobuf.LazyStringArrayList(dmfjfhnbelg_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @return A list containing the dmfjfhnbelg.
     */
    public com.google.protobuf.ProtocolStringList
        getDmfjfhnbelgList() {
      return dmfjfhnbelg_.getUnmodifiableView();
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @return The count of dmfjfhnbelg.
     */
    public int getDmfjfhnbelgCount() {
      return dmfjfhnbelg_.size();
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param index The index of the element to return.
     * @return The dmfjfhnbelg at the given index.
     */
    public java.lang.String getDmfjfhnbelg(int index) {
      return dmfjfhnbelg_.get(index);
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dmfjfhnbelg at the given index.
     */
    public com.google.protobuf.ByteString
        getDmfjfhnbelgBytes(int index) {
      return dmfjfhnbelg_.getByteString(index);
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param index The index to set the value at.
     * @param value The dmfjfhnbelg to set.
     * @return This builder for chaining.
     */
    public Builder setDmfjfhnbelg(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDmfjfhnbelgIsMutable();
      dmfjfhnbelg_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param value The dmfjfhnbelg to add.
     * @return This builder for chaining.
     */
    public Builder addDmfjfhnbelg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDmfjfhnbelgIsMutable();
      dmfjfhnbelg_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param values The dmfjfhnbelg to add.
     * @return This builder for chaining.
     */
    public Builder addAllDmfjfhnbelg(
        java.lang.Iterable<java.lang.String> values) {
      ensureDmfjfhnbelgIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dmfjfhnbelg_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmfjfhnbelg() {
      dmfjfhnbelg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dmfjfhnbelg = 1;</code>
     * @param value The bytes of the dmfjfhnbelg to add.
     * @return This builder for chaining.
     */
    public Builder addDmfjfhnbelgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDmfjfhnbelgIsMutable();
      dmfjfhnbelg_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HNIOOOFONIN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HNIOOOFONIN)
  private static final POGOProtos.Rpc.HNIOOOFONIN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HNIOOOFONIN();
  }

  public static POGOProtos.Rpc.HNIOOOFONIN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HNIOOOFONIN>
      PARSER = new com.google.protobuf.AbstractParser<HNIOOOFONIN>() {
    @java.lang.Override
    public HNIOOOFONIN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HNIOOOFONIN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HNIOOOFONIN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HNIOOOFONIN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HNIOOOFONIN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

