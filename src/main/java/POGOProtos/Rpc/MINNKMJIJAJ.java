// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MINNKMJIJAJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MINNKMJIJAJ}
 */
public final class MINNKMJIJAJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MINNKMJIJAJ)
    MINNKMJIJAJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MINNKMJIJAJ.newBuilder() to construct.
  private MINNKMJIJAJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MINNKMJIJAJ() {
    lbnnjjdgpfg_ = emptyLongList();
    npofgidldag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MINNKMJIJAJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MINNKMJIJAJ(
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
              lbnnjjdgpfg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            lbnnjjdgpfg_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              lbnnjjdgpfg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              lbnnjjdgpfg_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            npofgidldag_ = s;
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
        lbnnjjdgpfg_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MINNKMJIJAJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MINNKMJIJAJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MINNKMJIJAJ.class, POGOProtos.Rpc.MINNKMJIJAJ.Builder.class);
  }

  public static final int LBNNJJDGPFG_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList lbnnjjdgpfg_;
  /**
   * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
   * @return A list containing the lbnnjjdgpfg.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getLbnnjjdgpfgList() {
    return lbnnjjdgpfg_;
  }
  /**
   * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
   * @return The count of lbnnjjdgpfg.
   */
  public int getLbnnjjdgpfgCount() {
    return lbnnjjdgpfg_.size();
  }
  /**
   * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
   * @param index The index of the element to return.
   * @return The lbnnjjdgpfg at the given index.
   */
  public long getLbnnjjdgpfg(int index) {
    return lbnnjjdgpfg_.getLong(index);
  }
  private int lbnnjjdgpfgMemoizedSerializedSize = -1;

  public static final int NPOFGIDLDAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object npofgidldag_;
  /**
   * <code>string npofgidldag = 2;</code>
   * @return The npofgidldag.
   */
  @java.lang.Override
  public java.lang.String getNpofgidldag() {
    java.lang.Object ref = npofgidldag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      npofgidldag_ = s;
      return s;
    }
  }
  /**
   * <code>string npofgidldag = 2;</code>
   * @return The bytes for npofgidldag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNpofgidldagBytes() {
    java.lang.Object ref = npofgidldag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      npofgidldag_ = b;
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
    if (getLbnnjjdgpfgList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(lbnnjjdgpfgMemoizedSerializedSize);
    }
    for (int i = 0; i < lbnnjjdgpfg_.size(); i++) {
      output.writeUInt64NoTag(lbnnjjdgpfg_.getLong(i));
    }
    if (!getNpofgidldagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, npofgidldag_);
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
      for (int i = 0; i < lbnnjjdgpfg_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(lbnnjjdgpfg_.getLong(i));
      }
      size += dataSize;
      if (!getLbnnjjdgpfgList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      lbnnjjdgpfgMemoizedSerializedSize = dataSize;
    }
    if (!getNpofgidldagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, npofgidldag_);
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
    if (!(obj instanceof POGOProtos.Rpc.MINNKMJIJAJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MINNKMJIJAJ other = (POGOProtos.Rpc.MINNKMJIJAJ) obj;

    if (!getLbnnjjdgpfgList()
        .equals(other.getLbnnjjdgpfgList())) return false;
    if (!getNpofgidldag()
        .equals(other.getNpofgidldag())) return false;
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
    if (getLbnnjjdgpfgCount() > 0) {
      hash = (37 * hash) + LBNNJJDGPFG_FIELD_NUMBER;
      hash = (53 * hash) + getLbnnjjdgpfgList().hashCode();
    }
    hash = (37 * hash) + NPOFGIDLDAG_FIELD_NUMBER;
    hash = (53 * hash) + getNpofgidldag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MINNKMJIJAJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MINNKMJIJAJ prototype) {
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
   * ref: MINNKMJIJAJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MINNKMJIJAJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MINNKMJIJAJ)
      POGOProtos.Rpc.MINNKMJIJAJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MINNKMJIJAJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MINNKMJIJAJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MINNKMJIJAJ.class, POGOProtos.Rpc.MINNKMJIJAJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MINNKMJIJAJ.newBuilder()
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
      lbnnjjdgpfg_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      npofgidldag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MINNKMJIJAJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MINNKMJIJAJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.MINNKMJIJAJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MINNKMJIJAJ build() {
      POGOProtos.Rpc.MINNKMJIJAJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MINNKMJIJAJ buildPartial() {
      POGOProtos.Rpc.MINNKMJIJAJ result = new POGOProtos.Rpc.MINNKMJIJAJ(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lbnnjjdgpfg_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lbnnjjdgpfg_ = lbnnjjdgpfg_;
      result.npofgidldag_ = npofgidldag_;
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
      if (other instanceof POGOProtos.Rpc.MINNKMJIJAJ) {
        return mergeFrom((POGOProtos.Rpc.MINNKMJIJAJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MINNKMJIJAJ other) {
      if (other == POGOProtos.Rpc.MINNKMJIJAJ.getDefaultInstance()) return this;
      if (!other.lbnnjjdgpfg_.isEmpty()) {
        if (lbnnjjdgpfg_.isEmpty()) {
          lbnnjjdgpfg_ = other.lbnnjjdgpfg_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLbnnjjdgpfgIsMutable();
          lbnnjjdgpfg_.addAll(other.lbnnjjdgpfg_);
        }
        onChanged();
      }
      if (!other.getNpofgidldag().isEmpty()) {
        npofgidldag_ = other.npofgidldag_;
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
      POGOProtos.Rpc.MINNKMJIJAJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MINNKMJIJAJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList lbnnjjdgpfg_ = emptyLongList();
    private void ensureLbnnjjdgpfgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lbnnjjdgpfg_ = mutableCopy(lbnnjjdgpfg_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @return A list containing the lbnnjjdgpfg.
     */
    public java.util.List<java.lang.Long>
        getLbnnjjdgpfgList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(lbnnjjdgpfg_) : lbnnjjdgpfg_;
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @return The count of lbnnjjdgpfg.
     */
    public int getLbnnjjdgpfgCount() {
      return lbnnjjdgpfg_.size();
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @param index The index of the element to return.
     * @return The lbnnjjdgpfg at the given index.
     */
    public long getLbnnjjdgpfg(int index) {
      return lbnnjjdgpfg_.getLong(index);
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @param index The index to set the value at.
     * @param value The lbnnjjdgpfg to set.
     * @return This builder for chaining.
     */
    public Builder setLbnnjjdgpfg(
        int index, long value) {
      ensureLbnnjjdgpfgIsMutable();
      lbnnjjdgpfg_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @param value The lbnnjjdgpfg to add.
     * @return This builder for chaining.
     */
    public Builder addLbnnjjdgpfg(long value) {
      ensureLbnnjjdgpfgIsMutable();
      lbnnjjdgpfg_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @param values The lbnnjjdgpfg to add.
     * @return This builder for chaining.
     */
    public Builder addAllLbnnjjdgpfg(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureLbnnjjdgpfgIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, lbnnjjdgpfg_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 lbnnjjdgpfg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLbnnjjdgpfg() {
      lbnnjjdgpfg_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object npofgidldag_ = "";
    /**
     * <code>string npofgidldag = 2;</code>
     * @return The npofgidldag.
     */
    public java.lang.String getNpofgidldag() {
      java.lang.Object ref = npofgidldag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        npofgidldag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @return The bytes for npofgidldag.
     */
    public com.google.protobuf.ByteString
        getNpofgidldagBytes() {
      java.lang.Object ref = npofgidldag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        npofgidldag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @param value The npofgidldag to set.
     * @return This builder for chaining.
     */
    public Builder setNpofgidldag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      npofgidldag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpofgidldag() {
      
      npofgidldag_ = getDefaultInstance().getNpofgidldag();
      onChanged();
      return this;
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @param value The bytes for npofgidldag to set.
     * @return This builder for chaining.
     */
    public Builder setNpofgidldagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      npofgidldag_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MINNKMJIJAJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MINNKMJIJAJ)
  private static final POGOProtos.Rpc.MINNKMJIJAJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MINNKMJIJAJ();
  }

  public static POGOProtos.Rpc.MINNKMJIJAJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MINNKMJIJAJ>
      PARSER = new com.google.protobuf.AbstractParser<MINNKMJIJAJ>() {
    @java.lang.Override
    public MINNKMJIJAJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MINNKMJIJAJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MINNKMJIJAJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MINNKMJIJAJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MINNKMJIJAJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

