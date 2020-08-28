// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PDNAICDHIKN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PDNAICDHIKN}
 */
public final class PDNAICDHIKN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PDNAICDHIKN)
    PDNAICDHIKNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDNAICDHIKN.newBuilder() to construct.
  private PDNAICDHIKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDNAICDHIKN() {
    mldglfndbkl_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PDNAICDHIKN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDNAICDHIKN(
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
              mldglfndbkl_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            mldglfndbkl_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mldglfndbkl_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              mldglfndbkl_.add(rawValue);
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
        mldglfndbkl_ = java.util.Collections.unmodifiableList(mldglfndbkl_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDNAICDHIKN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDNAICDHIKN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PDNAICDHIKN.class, POGOProtos.Rpc.PDNAICDHIKN.Builder.class);
  }

  public static final int MLDGLFNDBKL_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> mldglfndbkl_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.KADEJEEDDLK> mldglfndbkl_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.KADEJEEDDLK>() {
            public POGOProtos.Rpc.KADEJEEDDLK convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.KADEJEEDDLK result = POGOProtos.Rpc.KADEJEEDDLK.valueOf(from);
              return result == null ? POGOProtos.Rpc.KADEJEEDDLK.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
   * @return A list containing the mldglfndbkl.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.KADEJEEDDLK> getMldglfndbklList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.KADEJEEDDLK>(mldglfndbkl_, mldglfndbkl_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
   * @return The count of mldglfndbkl.
   */
  @java.lang.Override
  public int getMldglfndbklCount() {
    return mldglfndbkl_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
   * @param index The index of the element to return.
   * @return The mldglfndbkl at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.KADEJEEDDLK getMldglfndbkl(int index) {
    return mldglfndbkl_converter_.convert(mldglfndbkl_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
   * @return A list containing the enum numeric values on the wire for mldglfndbkl.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getMldglfndbklValueList() {
    return mldglfndbkl_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of mldglfndbkl at the given index.
   */
  @java.lang.Override
  public int getMldglfndbklValue(int index) {
    return mldglfndbkl_.get(index);
  }
  private int mldglfndbklMemoizedSerializedSize;

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
    if (getMldglfndbklList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(mldglfndbklMemoizedSerializedSize);
    }
    for (int i = 0; i < mldglfndbkl_.size(); i++) {
      output.writeEnumNoTag(mldglfndbkl_.get(i));
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
      for (int i = 0; i < mldglfndbkl_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(mldglfndbkl_.get(i));
      }
      size += dataSize;
      if (!getMldglfndbklList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }mldglfndbklMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.PDNAICDHIKN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PDNAICDHIKN other = (POGOProtos.Rpc.PDNAICDHIKN) obj;

    if (!mldglfndbkl_.equals(other.mldglfndbkl_)) return false;
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
    if (getMldglfndbklCount() > 0) {
      hash = (37 * hash) + MLDGLFNDBKL_FIELD_NUMBER;
      hash = (53 * hash) + mldglfndbkl_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDNAICDHIKN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PDNAICDHIKN prototype) {
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
   * ref: PDNAICDHIKN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PDNAICDHIKN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PDNAICDHIKN)
      POGOProtos.Rpc.PDNAICDHIKNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDNAICDHIKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDNAICDHIKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PDNAICDHIKN.class, POGOProtos.Rpc.PDNAICDHIKN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PDNAICDHIKN.newBuilder()
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
      mldglfndbkl_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDNAICDHIKN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDNAICDHIKN getDefaultInstanceForType() {
      return POGOProtos.Rpc.PDNAICDHIKN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDNAICDHIKN build() {
      POGOProtos.Rpc.PDNAICDHIKN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDNAICDHIKN buildPartial() {
      POGOProtos.Rpc.PDNAICDHIKN result = new POGOProtos.Rpc.PDNAICDHIKN(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mldglfndbkl_ = java.util.Collections.unmodifiableList(mldglfndbkl_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mldglfndbkl_ = mldglfndbkl_;
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
      if (other instanceof POGOProtos.Rpc.PDNAICDHIKN) {
        return mergeFrom((POGOProtos.Rpc.PDNAICDHIKN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PDNAICDHIKN other) {
      if (other == POGOProtos.Rpc.PDNAICDHIKN.getDefaultInstance()) return this;
      if (!other.mldglfndbkl_.isEmpty()) {
        if (mldglfndbkl_.isEmpty()) {
          mldglfndbkl_ = other.mldglfndbkl_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMldglfndbklIsMutable();
          mldglfndbkl_.addAll(other.mldglfndbkl_);
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
      POGOProtos.Rpc.PDNAICDHIKN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PDNAICDHIKN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> mldglfndbkl_ =
      java.util.Collections.emptyList();
    private void ensureMldglfndbklIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mldglfndbkl_ = new java.util.ArrayList<java.lang.Integer>(mldglfndbkl_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @return A list containing the mldglfndbkl.
     */
    public java.util.List<POGOProtos.Rpc.KADEJEEDDLK> getMldglfndbklList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.KADEJEEDDLK>(mldglfndbkl_, mldglfndbkl_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @return The count of mldglfndbkl.
     */
    public int getMldglfndbklCount() {
      return mldglfndbkl_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param index The index of the element to return.
     * @return The mldglfndbkl at the given index.
     */
    public POGOProtos.Rpc.KADEJEEDDLK getMldglfndbkl(int index) {
      return mldglfndbkl_converter_.convert(mldglfndbkl_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param index The index to set the value at.
     * @param value The mldglfndbkl to set.
     * @return This builder for chaining.
     */
    public Builder setMldglfndbkl(
        int index, POGOProtos.Rpc.KADEJEEDDLK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMldglfndbklIsMutable();
      mldglfndbkl_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param value The mldglfndbkl to add.
     * @return This builder for chaining.
     */
    public Builder addMldglfndbkl(POGOProtos.Rpc.KADEJEEDDLK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMldglfndbklIsMutable();
      mldglfndbkl_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param values The mldglfndbkl to add.
     * @return This builder for chaining.
     */
    public Builder addAllMldglfndbkl(
        java.lang.Iterable<? extends POGOProtos.Rpc.KADEJEEDDLK> values) {
      ensureMldglfndbklIsMutable();
      for (POGOProtos.Rpc.KADEJEEDDLK value : values) {
        mldglfndbkl_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMldglfndbkl() {
      mldglfndbkl_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @return A list containing the enum numeric values on the wire for mldglfndbkl.
     */
    public java.util.List<java.lang.Integer>
    getMldglfndbklValueList() {
      return java.util.Collections.unmodifiableList(mldglfndbkl_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of mldglfndbkl at the given index.
     */
    public int getMldglfndbklValue(int index) {
      return mldglfndbkl_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of mldglfndbkl at the given index.
     * @return This builder for chaining.
     */
    public Builder setMldglfndbklValue(
        int index, int value) {
      ensureMldglfndbklIsMutable();
      mldglfndbkl_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param value The enum numeric value on the wire for mldglfndbkl to add.
     * @return This builder for chaining.
     */
    public Builder addMldglfndbklValue(int value) {
      ensureMldglfndbklIsMutable();
      mldglfndbkl_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KADEJEEDDLK mldglfndbkl = 1;</code>
     * @param values The enum numeric values on the wire for mldglfndbkl to add.
     * @return This builder for chaining.
     */
    public Builder addAllMldglfndbklValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureMldglfndbklIsMutable();
      for (int value : values) {
        mldglfndbkl_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PDNAICDHIKN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PDNAICDHIKN)
  private static final POGOProtos.Rpc.PDNAICDHIKN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PDNAICDHIKN();
  }

  public static POGOProtos.Rpc.PDNAICDHIKN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDNAICDHIKN>
      PARSER = new com.google.protobuf.AbstractParser<PDNAICDHIKN>() {
    @java.lang.Override
    public PDNAICDHIKN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDNAICDHIKN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDNAICDHIKN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDNAICDHIKN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PDNAICDHIKN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

