// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ALCAMEPFNLG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ALCAMEPFNLG}
 */
public  final class ALCAMEPFNLG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ALCAMEPFNLG)
    ALCAMEPFNLGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ALCAMEPFNLG.newBuilder() to construct.
  private ALCAMEPFNLG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ALCAMEPFNLG() {
    gifmkojdbnh_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ALCAMEPFNLG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ALCAMEPFNLG(
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
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              gifmkojdbnh_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            gifmkojdbnh_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gifmkojdbnh_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              gifmkojdbnh_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        gifmkojdbnh_ = java.util.Collections.unmodifiableList(gifmkojdbnh_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ALCAMEPFNLG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ALCAMEPFNLG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ALCAMEPFNLG.class, POGOProtos.Rpc.ALCAMEPFNLG.Builder.class);
  }

  public static final int GIFMKOJDBNH_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> gifmkojdbnh_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.JLEFKPCGFEL> gifmkojdbnh_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.JLEFKPCGFEL>() {
            public POGOProtos.Rpc.JLEFKPCGFEL convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.JLEFKPCGFEL result = POGOProtos.Rpc.JLEFKPCGFEL.valueOf(from);
              return result == null ? POGOProtos.Rpc.JLEFKPCGFEL.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
   * @return A list containing the gifmkojdbnh.
   */
  public java.util.List<POGOProtos.Rpc.JLEFKPCGFEL> getGifmkojdbnhList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.JLEFKPCGFEL>(gifmkojdbnh_, gifmkojdbnh_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
   * @return The count of gifmkojdbnh.
   */
  public int getGifmkojdbnhCount() {
    return gifmkojdbnh_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
   * @param index The index of the element to return.
   * @return The gifmkojdbnh at the given index.
   */
  public POGOProtos.Rpc.JLEFKPCGFEL getGifmkojdbnh(int index) {
    return gifmkojdbnh_converter_.convert(gifmkojdbnh_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
   * @return A list containing the enum numeric values on the wire for gifmkojdbnh.
   */
  public java.util.List<java.lang.Integer>
  getGifmkojdbnhValueList() {
    return gifmkojdbnh_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of gifmkojdbnh at the given index.
   */
  public int getGifmkojdbnhValue(int index) {
    return gifmkojdbnh_.get(index);
  }
  private int gifmkojdbnhMemoizedSerializedSize;

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
    if (getGifmkojdbnhList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(gifmkojdbnhMemoizedSerializedSize);
    }
    for (int i = 0; i < gifmkojdbnh_.size(); i++) {
      output.writeEnumNoTag(gifmkojdbnh_.get(i));
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
      for (int i = 0; i < gifmkojdbnh_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(gifmkojdbnh_.get(i));
      }
      size += dataSize;
      if (!getGifmkojdbnhList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }gifmkojdbnhMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.ALCAMEPFNLG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ALCAMEPFNLG other = (POGOProtos.Rpc.ALCAMEPFNLG) obj;

    if (!gifmkojdbnh_.equals(other.gifmkojdbnh_)) return false;
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
    if (getGifmkojdbnhCount() > 0) {
      hash = (37 * hash) + GIFMKOJDBNH_FIELD_NUMBER;
      hash = (53 * hash) + gifmkojdbnh_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ALCAMEPFNLG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ALCAMEPFNLG prototype) {
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
   * ref: ALCAMEPFNLG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ALCAMEPFNLG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ALCAMEPFNLG)
      POGOProtos.Rpc.ALCAMEPFNLGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ALCAMEPFNLG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ALCAMEPFNLG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ALCAMEPFNLG.class, POGOProtos.Rpc.ALCAMEPFNLG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ALCAMEPFNLG.newBuilder()
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
      gifmkojdbnh_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ALCAMEPFNLG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ALCAMEPFNLG getDefaultInstanceForType() {
      return POGOProtos.Rpc.ALCAMEPFNLG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ALCAMEPFNLG build() {
      POGOProtos.Rpc.ALCAMEPFNLG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ALCAMEPFNLG buildPartial() {
      POGOProtos.Rpc.ALCAMEPFNLG result = new POGOProtos.Rpc.ALCAMEPFNLG(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        gifmkojdbnh_ = java.util.Collections.unmodifiableList(gifmkojdbnh_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.gifmkojdbnh_ = gifmkojdbnh_;
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
      if (other instanceof POGOProtos.Rpc.ALCAMEPFNLG) {
        return mergeFrom((POGOProtos.Rpc.ALCAMEPFNLG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ALCAMEPFNLG other) {
      if (other == POGOProtos.Rpc.ALCAMEPFNLG.getDefaultInstance()) return this;
      if (!other.gifmkojdbnh_.isEmpty()) {
        if (gifmkojdbnh_.isEmpty()) {
          gifmkojdbnh_ = other.gifmkojdbnh_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGifmkojdbnhIsMutable();
          gifmkojdbnh_.addAll(other.gifmkojdbnh_);
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
      POGOProtos.Rpc.ALCAMEPFNLG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ALCAMEPFNLG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> gifmkojdbnh_ =
      java.util.Collections.emptyList();
    private void ensureGifmkojdbnhIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gifmkojdbnh_ = new java.util.ArrayList<java.lang.Integer>(gifmkojdbnh_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @return A list containing the gifmkojdbnh.
     */
    public java.util.List<POGOProtos.Rpc.JLEFKPCGFEL> getGifmkojdbnhList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.JLEFKPCGFEL>(gifmkojdbnh_, gifmkojdbnh_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @return The count of gifmkojdbnh.
     */
    public int getGifmkojdbnhCount() {
      return gifmkojdbnh_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param index The index of the element to return.
     * @return The gifmkojdbnh at the given index.
     */
    public POGOProtos.Rpc.JLEFKPCGFEL getGifmkojdbnh(int index) {
      return gifmkojdbnh_converter_.convert(gifmkojdbnh_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param index The index to set the value at.
     * @param value The gifmkojdbnh to set.
     * @return This builder for chaining.
     */
    public Builder setGifmkojdbnh(
        int index, POGOProtos.Rpc.JLEFKPCGFEL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGifmkojdbnhIsMutable();
      gifmkojdbnh_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param value The gifmkojdbnh to add.
     * @return This builder for chaining.
     */
    public Builder addGifmkojdbnh(POGOProtos.Rpc.JLEFKPCGFEL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGifmkojdbnhIsMutable();
      gifmkojdbnh_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param values The gifmkojdbnh to add.
     * @return This builder for chaining.
     */
    public Builder addAllGifmkojdbnh(
        java.lang.Iterable<? extends POGOProtos.Rpc.JLEFKPCGFEL> values) {
      ensureGifmkojdbnhIsMutable();
      for (POGOProtos.Rpc.JLEFKPCGFEL value : values) {
        gifmkojdbnh_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGifmkojdbnh() {
      gifmkojdbnh_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @return A list containing the enum numeric values on the wire for gifmkojdbnh.
     */
    public java.util.List<java.lang.Integer>
    getGifmkojdbnhValueList() {
      return java.util.Collections.unmodifiableList(gifmkojdbnh_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gifmkojdbnh at the given index.
     */
    public int getGifmkojdbnhValue(int index) {
      return gifmkojdbnh_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gifmkojdbnh at the given index.
     * @return This builder for chaining.
     */
    public Builder setGifmkojdbnhValue(
        int index, int value) {
      ensureGifmkojdbnhIsMutable();
      gifmkojdbnh_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param value The enum numeric value on the wire for gifmkojdbnh to add.
     * @return This builder for chaining.
     */
    public Builder addGifmkojdbnhValue(int value) {
      ensureGifmkojdbnhIsMutable();
      gifmkojdbnh_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.JLEFKPCGFEL gifmkojdbnh = 1;</code>
     * @param values The enum numeric values on the wire for gifmkojdbnh to add.
     * @return This builder for chaining.
     */
    public Builder addAllGifmkojdbnhValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureGifmkojdbnhIsMutable();
      for (int value : values) {
        gifmkojdbnh_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ALCAMEPFNLG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ALCAMEPFNLG)
  private static final POGOProtos.Rpc.ALCAMEPFNLG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ALCAMEPFNLG();
  }

  public static POGOProtos.Rpc.ALCAMEPFNLG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ALCAMEPFNLG>
      PARSER = new com.google.protobuf.AbstractParser<ALCAMEPFNLG>() {
    @java.lang.Override
    public ALCAMEPFNLG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ALCAMEPFNLG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ALCAMEPFNLG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ALCAMEPFNLG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ALCAMEPFNLG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

