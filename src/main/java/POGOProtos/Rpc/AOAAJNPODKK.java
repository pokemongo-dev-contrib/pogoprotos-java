// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AOAAJNPODKK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AOAAJNPODKK}
 */
public  final class AOAAJNPODKK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AOAAJNPODKK)
    AOAAJNPODKKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AOAAJNPODKK.newBuilder() to construct.
  private AOAAJNPODKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AOAAJNPODKK() {
    mckjcooamho_ = emptyFloatList();
    anlmilibkcd_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AOAAJNPODKK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AOAAJNPODKK(
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

            apohecdcfii_ = input.readInt64();
            break;
          }
          case 21: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mckjcooamho_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            mckjcooamho_.addFloat(input.readFloat());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              mckjcooamho_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              mckjcooamho_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 29: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              anlmilibkcd_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            anlmilibkcd_.addFloat(input.readFloat());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              anlmilibkcd_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              anlmilibkcd_.addFloat(input.readFloat());
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
        mckjcooamho_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        anlmilibkcd_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOAAJNPODKK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOAAJNPODKK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AOAAJNPODKK.class, POGOProtos.Rpc.AOAAJNPODKK.Builder.class);
  }

  public static final int APOHECDCFII_FIELD_NUMBER = 1;
  private long apohecdcfii_;
  /**
   * <code>int64 apohecdcfii = 1;</code>
   * @return The apohecdcfii.
   */
  public long getApohecdcfii() {
    return apohecdcfii_;
  }

  public static final int MCKJCOOAMHO_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList mckjcooamho_;
  /**
   * <code>repeated float mckjcooamho = 2;</code>
   * @return A list containing the mckjcooamho.
   */
  public java.util.List<java.lang.Float>
      getMckjcooamhoList() {
    return mckjcooamho_;
  }
  /**
   * <code>repeated float mckjcooamho = 2;</code>
   * @return The count of mckjcooamho.
   */
  public int getMckjcooamhoCount() {
    return mckjcooamho_.size();
  }
  /**
   * <code>repeated float mckjcooamho = 2;</code>
   * @param index The index of the element to return.
   * @return The mckjcooamho at the given index.
   */
  public float getMckjcooamho(int index) {
    return mckjcooamho_.getFloat(index);
  }
  private int mckjcooamhoMemoizedSerializedSize = -1;

  public static final int ANLMILIBKCD_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.FloatList anlmilibkcd_;
  /**
   * <code>repeated float anlmilibkcd = 3;</code>
   * @return A list containing the anlmilibkcd.
   */
  public java.util.List<java.lang.Float>
      getAnlmilibkcdList() {
    return anlmilibkcd_;
  }
  /**
   * <code>repeated float anlmilibkcd = 3;</code>
   * @return The count of anlmilibkcd.
   */
  public int getAnlmilibkcdCount() {
    return anlmilibkcd_.size();
  }
  /**
   * <code>repeated float anlmilibkcd = 3;</code>
   * @param index The index of the element to return.
   * @return The anlmilibkcd at the given index.
   */
  public float getAnlmilibkcd(int index) {
    return anlmilibkcd_.getFloat(index);
  }
  private int anlmilibkcdMemoizedSerializedSize = -1;

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
    if (apohecdcfii_ != 0L) {
      output.writeInt64(1, apohecdcfii_);
    }
    if (getMckjcooamhoList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(mckjcooamhoMemoizedSerializedSize);
    }
    for (int i = 0; i < mckjcooamho_.size(); i++) {
      output.writeFloatNoTag(mckjcooamho_.getFloat(i));
    }
    if (getAnlmilibkcdList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(anlmilibkcdMemoizedSerializedSize);
    }
    for (int i = 0; i < anlmilibkcd_.size(); i++) {
      output.writeFloatNoTag(anlmilibkcd_.getFloat(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apohecdcfii_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, apohecdcfii_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getMckjcooamhoList().size();
      size += dataSize;
      if (!getMckjcooamhoList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      mckjcooamhoMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getAnlmilibkcdList().size();
      size += dataSize;
      if (!getAnlmilibkcdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      anlmilibkcdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.AOAAJNPODKK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AOAAJNPODKK other = (POGOProtos.Rpc.AOAAJNPODKK) obj;

    if (getApohecdcfii()
        != other.getApohecdcfii()) return false;
    if (!getMckjcooamhoList()
        .equals(other.getMckjcooamhoList())) return false;
    if (!getAnlmilibkcdList()
        .equals(other.getAnlmilibkcdList())) return false;
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
    hash = (37 * hash) + APOHECDCFII_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getApohecdcfii());
    if (getMckjcooamhoCount() > 0) {
      hash = (37 * hash) + MCKJCOOAMHO_FIELD_NUMBER;
      hash = (53 * hash) + getMckjcooamhoList().hashCode();
    }
    if (getAnlmilibkcdCount() > 0) {
      hash = (37 * hash) + ANLMILIBKCD_FIELD_NUMBER;
      hash = (53 * hash) + getAnlmilibkcdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOAAJNPODKK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AOAAJNPODKK prototype) {
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
   * ref: AOAAJNPODKK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AOAAJNPODKK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AOAAJNPODKK)
      POGOProtos.Rpc.AOAAJNPODKKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOAAJNPODKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOAAJNPODKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AOAAJNPODKK.class, POGOProtos.Rpc.AOAAJNPODKK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AOAAJNPODKK.newBuilder()
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
      apohecdcfii_ = 0L;

      mckjcooamho_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      anlmilibkcd_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOAAJNPODKK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOAAJNPODKK getDefaultInstanceForType() {
      return POGOProtos.Rpc.AOAAJNPODKK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOAAJNPODKK build() {
      POGOProtos.Rpc.AOAAJNPODKK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOAAJNPODKK buildPartial() {
      POGOProtos.Rpc.AOAAJNPODKK result = new POGOProtos.Rpc.AOAAJNPODKK(this);
      int from_bitField0_ = bitField0_;
      result.apohecdcfii_ = apohecdcfii_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mckjcooamho_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mckjcooamho_ = mckjcooamho_;
      if (((bitField0_ & 0x00000002) != 0)) {
        anlmilibkcd_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.anlmilibkcd_ = anlmilibkcd_;
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
      if (other instanceof POGOProtos.Rpc.AOAAJNPODKK) {
        return mergeFrom((POGOProtos.Rpc.AOAAJNPODKK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AOAAJNPODKK other) {
      if (other == POGOProtos.Rpc.AOAAJNPODKK.getDefaultInstance()) return this;
      if (other.getApohecdcfii() != 0L) {
        setApohecdcfii(other.getApohecdcfii());
      }
      if (!other.mckjcooamho_.isEmpty()) {
        if (mckjcooamho_.isEmpty()) {
          mckjcooamho_ = other.mckjcooamho_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMckjcooamhoIsMutable();
          mckjcooamho_.addAll(other.mckjcooamho_);
        }
        onChanged();
      }
      if (!other.anlmilibkcd_.isEmpty()) {
        if (anlmilibkcd_.isEmpty()) {
          anlmilibkcd_ = other.anlmilibkcd_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAnlmilibkcdIsMutable();
          anlmilibkcd_.addAll(other.anlmilibkcd_);
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
      POGOProtos.Rpc.AOAAJNPODKK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AOAAJNPODKK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long apohecdcfii_ ;
    /**
     * <code>int64 apohecdcfii = 1;</code>
     * @return The apohecdcfii.
     */
    public long getApohecdcfii() {
      return apohecdcfii_;
    }
    /**
     * <code>int64 apohecdcfii = 1;</code>
     * @param value The apohecdcfii to set.
     * @return This builder for chaining.
     */
    public Builder setApohecdcfii(long value) {
      
      apohecdcfii_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 apohecdcfii = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApohecdcfii() {
      
      apohecdcfii_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList mckjcooamho_ = emptyFloatList();
    private void ensureMckjcooamhoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mckjcooamho_ = mutableCopy(mckjcooamho_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @return A list containing the mckjcooamho.
     */
    public java.util.List<java.lang.Float>
        getMckjcooamhoList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(mckjcooamho_) : mckjcooamho_;
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @return The count of mckjcooamho.
     */
    public int getMckjcooamhoCount() {
      return mckjcooamho_.size();
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @param index The index of the element to return.
     * @return The mckjcooamho at the given index.
     */
    public float getMckjcooamho(int index) {
      return mckjcooamho_.getFloat(index);
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @param index The index to set the value at.
     * @param value The mckjcooamho to set.
     * @return This builder for chaining.
     */
    public Builder setMckjcooamho(
        int index, float value) {
      ensureMckjcooamhoIsMutable();
      mckjcooamho_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @param value The mckjcooamho to add.
     * @return This builder for chaining.
     */
    public Builder addMckjcooamho(float value) {
      ensureMckjcooamhoIsMutable();
      mckjcooamho_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @param values The mckjcooamho to add.
     * @return This builder for chaining.
     */
    public Builder addAllMckjcooamho(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureMckjcooamhoIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mckjcooamho_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float mckjcooamho = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMckjcooamho() {
      mckjcooamho_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList anlmilibkcd_ = emptyFloatList();
    private void ensureAnlmilibkcdIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        anlmilibkcd_ = mutableCopy(anlmilibkcd_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @return A list containing the anlmilibkcd.
     */
    public java.util.List<java.lang.Float>
        getAnlmilibkcdList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(anlmilibkcd_) : anlmilibkcd_;
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @return The count of anlmilibkcd.
     */
    public int getAnlmilibkcdCount() {
      return anlmilibkcd_.size();
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @param index The index of the element to return.
     * @return The anlmilibkcd at the given index.
     */
    public float getAnlmilibkcd(int index) {
      return anlmilibkcd_.getFloat(index);
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @param index The index to set the value at.
     * @param value The anlmilibkcd to set.
     * @return This builder for chaining.
     */
    public Builder setAnlmilibkcd(
        int index, float value) {
      ensureAnlmilibkcdIsMutable();
      anlmilibkcd_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @param value The anlmilibkcd to add.
     * @return This builder for chaining.
     */
    public Builder addAnlmilibkcd(float value) {
      ensureAnlmilibkcdIsMutable();
      anlmilibkcd_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @param values The anlmilibkcd to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnlmilibkcd(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureAnlmilibkcdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, anlmilibkcd_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float anlmilibkcd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnlmilibkcd() {
      anlmilibkcd_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AOAAJNPODKK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AOAAJNPODKK)
  private static final POGOProtos.Rpc.AOAAJNPODKK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AOAAJNPODKK();
  }

  public static POGOProtos.Rpc.AOAAJNPODKK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AOAAJNPODKK>
      PARSER = new com.google.protobuf.AbstractParser<AOAAJNPODKK>() {
    @java.lang.Override
    public AOAAJNPODKK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AOAAJNPODKK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AOAAJNPODKK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AOAAJNPODKK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AOAAJNPODKK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

