// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HJKAFFKNAJF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HJKAFFKNAJF}
 */
public final class HJKAFFKNAJF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HJKAFFKNAJF)
    HJKAFFKNAJFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HJKAFFKNAJF.newBuilder() to construct.
  private HJKAFFKNAJF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HJKAFFKNAJF() {
    pfmpbpkljpb_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HJKAFFKNAJF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HJKAFFKNAJF(
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
              pfmpbpkljpb_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            pfmpbpkljpb_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pfmpbpkljpb_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              pfmpbpkljpb_.add(rawValue);
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
        pfmpbpkljpb_ = java.util.Collections.unmodifiableList(pfmpbpkljpb_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJKAFFKNAJF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJKAFFKNAJF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HJKAFFKNAJF.class, POGOProtos.Rpc.HJKAFFKNAJF.Builder.class);
  }

  public static final int PFMPBPKLJPB_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> pfmpbpkljpb_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.GFMJKMPILFH> pfmpbpkljpb_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.GFMJKMPILFH>() {
            public POGOProtos.Rpc.GFMJKMPILFH convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.GFMJKMPILFH result = POGOProtos.Rpc.GFMJKMPILFH.valueOf(from);
              return result == null ? POGOProtos.Rpc.GFMJKMPILFH.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
   * @return A list containing the pfmpbpkljpb.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GFMJKMPILFH> getPfmpbpkljpbList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.GFMJKMPILFH>(pfmpbpkljpb_, pfmpbpkljpb_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
   * @return The count of pfmpbpkljpb.
   */
  @java.lang.Override
  public int getPfmpbpkljpbCount() {
    return pfmpbpkljpb_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
   * @param index The index of the element to return.
   * @return The pfmpbpkljpb at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GFMJKMPILFH getPfmpbpkljpb(int index) {
    return pfmpbpkljpb_converter_.convert(pfmpbpkljpb_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
   * @return A list containing the enum numeric values on the wire for pfmpbpkljpb.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getPfmpbpkljpbValueList() {
    return pfmpbpkljpb_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of pfmpbpkljpb at the given index.
   */
  @java.lang.Override
  public int getPfmpbpkljpbValue(int index) {
    return pfmpbpkljpb_.get(index);
  }
  private int pfmpbpkljpbMemoizedSerializedSize;

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
    if (getPfmpbpkljpbList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(pfmpbpkljpbMemoizedSerializedSize);
    }
    for (int i = 0; i < pfmpbpkljpb_.size(); i++) {
      output.writeEnumNoTag(pfmpbpkljpb_.get(i));
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
      for (int i = 0; i < pfmpbpkljpb_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(pfmpbpkljpb_.get(i));
      }
      size += dataSize;
      if (!getPfmpbpkljpbList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }pfmpbpkljpbMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.HJKAFFKNAJF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HJKAFFKNAJF other = (POGOProtos.Rpc.HJKAFFKNAJF) obj;

    if (!pfmpbpkljpb_.equals(other.pfmpbpkljpb_)) return false;
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
    if (getPfmpbpkljpbCount() > 0) {
      hash = (37 * hash) + PFMPBPKLJPB_FIELD_NUMBER;
      hash = (53 * hash) + pfmpbpkljpb_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJKAFFKNAJF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HJKAFFKNAJF prototype) {
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
   * ref: HJKAFFKNAJF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HJKAFFKNAJF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HJKAFFKNAJF)
      POGOProtos.Rpc.HJKAFFKNAJFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJKAFFKNAJF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJKAFFKNAJF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HJKAFFKNAJF.class, POGOProtos.Rpc.HJKAFFKNAJF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HJKAFFKNAJF.newBuilder()
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
      pfmpbpkljpb_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJKAFFKNAJF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJKAFFKNAJF getDefaultInstanceForType() {
      return POGOProtos.Rpc.HJKAFFKNAJF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJKAFFKNAJF build() {
      POGOProtos.Rpc.HJKAFFKNAJF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJKAFFKNAJF buildPartial() {
      POGOProtos.Rpc.HJKAFFKNAJF result = new POGOProtos.Rpc.HJKAFFKNAJF(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        pfmpbpkljpb_ = java.util.Collections.unmodifiableList(pfmpbpkljpb_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pfmpbpkljpb_ = pfmpbpkljpb_;
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
      if (other instanceof POGOProtos.Rpc.HJKAFFKNAJF) {
        return mergeFrom((POGOProtos.Rpc.HJKAFFKNAJF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HJKAFFKNAJF other) {
      if (other == POGOProtos.Rpc.HJKAFFKNAJF.getDefaultInstance()) return this;
      if (!other.pfmpbpkljpb_.isEmpty()) {
        if (pfmpbpkljpb_.isEmpty()) {
          pfmpbpkljpb_ = other.pfmpbpkljpb_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePfmpbpkljpbIsMutable();
          pfmpbpkljpb_.addAll(other.pfmpbpkljpb_);
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
      POGOProtos.Rpc.HJKAFFKNAJF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HJKAFFKNAJF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> pfmpbpkljpb_ =
      java.util.Collections.emptyList();
    private void ensurePfmpbpkljpbIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pfmpbpkljpb_ = new java.util.ArrayList<java.lang.Integer>(pfmpbpkljpb_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @return A list containing the pfmpbpkljpb.
     */
    public java.util.List<POGOProtos.Rpc.GFMJKMPILFH> getPfmpbpkljpbList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.GFMJKMPILFH>(pfmpbpkljpb_, pfmpbpkljpb_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @return The count of pfmpbpkljpb.
     */
    public int getPfmpbpkljpbCount() {
      return pfmpbpkljpb_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param index The index of the element to return.
     * @return The pfmpbpkljpb at the given index.
     */
    public POGOProtos.Rpc.GFMJKMPILFH getPfmpbpkljpb(int index) {
      return pfmpbpkljpb_converter_.convert(pfmpbpkljpb_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param index The index to set the value at.
     * @param value The pfmpbpkljpb to set.
     * @return This builder for chaining.
     */
    public Builder setPfmpbpkljpb(
        int index, POGOProtos.Rpc.GFMJKMPILFH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePfmpbpkljpbIsMutable();
      pfmpbpkljpb_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param value The pfmpbpkljpb to add.
     * @return This builder for chaining.
     */
    public Builder addPfmpbpkljpb(POGOProtos.Rpc.GFMJKMPILFH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePfmpbpkljpbIsMutable();
      pfmpbpkljpb_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param values The pfmpbpkljpb to add.
     * @return This builder for chaining.
     */
    public Builder addAllPfmpbpkljpb(
        java.lang.Iterable<? extends POGOProtos.Rpc.GFMJKMPILFH> values) {
      ensurePfmpbpkljpbIsMutable();
      for (POGOProtos.Rpc.GFMJKMPILFH value : values) {
        pfmpbpkljpb_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPfmpbpkljpb() {
      pfmpbpkljpb_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @return A list containing the enum numeric values on the wire for pfmpbpkljpb.
     */
    public java.util.List<java.lang.Integer>
    getPfmpbpkljpbValueList() {
      return java.util.Collections.unmodifiableList(pfmpbpkljpb_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pfmpbpkljpb at the given index.
     */
    public int getPfmpbpkljpbValue(int index) {
      return pfmpbpkljpb_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pfmpbpkljpb at the given index.
     * @return This builder for chaining.
     */
    public Builder setPfmpbpkljpbValue(
        int index, int value) {
      ensurePfmpbpkljpbIsMutable();
      pfmpbpkljpb_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param value The enum numeric value on the wire for pfmpbpkljpb to add.
     * @return This builder for chaining.
     */
    public Builder addPfmpbpkljpbValue(int value) {
      ensurePfmpbpkljpbIsMutable();
      pfmpbpkljpb_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GFMJKMPILFH pfmpbpkljpb = 1;</code>
     * @param values The enum numeric values on the wire for pfmpbpkljpb to add.
     * @return This builder for chaining.
     */
    public Builder addAllPfmpbpkljpbValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensurePfmpbpkljpbIsMutable();
      for (int value : values) {
        pfmpbpkljpb_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HJKAFFKNAJF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HJKAFFKNAJF)
  private static final POGOProtos.Rpc.HJKAFFKNAJF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HJKAFFKNAJF();
  }

  public static POGOProtos.Rpc.HJKAFFKNAJF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HJKAFFKNAJF>
      PARSER = new com.google.protobuf.AbstractParser<HJKAFFKNAJF>() {
    @java.lang.Override
    public HJKAFFKNAJF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HJKAFFKNAJF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HJKAFFKNAJF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HJKAFFKNAJF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HJKAFFKNAJF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

