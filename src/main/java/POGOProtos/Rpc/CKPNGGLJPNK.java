// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CKPNGGLJPNK}
 */
public  final class CKPNGGLJPNK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKPNGGLJPNK)
    CKPNGGLJPNKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKPNGGLJPNK.newBuilder() to construct.
  private CKPNGGLJPNK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKPNGGLJPNK() {
    pajffjajdgj_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKPNGGLJPNK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKPNGGLJPNK(
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
              pajffjajdgj_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            pajffjajdgj_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pajffjajdgj_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              pajffjajdgj_.add(rawValue);
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
        pajffjajdgj_ = java.util.Collections.unmodifiableList(pajffjajdgj_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CKPNGGLJPNK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CKPNGGLJPNK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKPNGGLJPNK.class, POGOProtos.Rpc.CKPNGGLJPNK.Builder.class);
  }

  public static final int PAJFFJAJDGJ_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> pajffjajdgj_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI> pajffjajdgj_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI>() {
            public POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI result = POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI.valueOf(from);
              return result == null ? POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
   * @return A list containing the pajffjajdgj.
   */
  public java.util.List<POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI> getPajffjajdgjList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI>(pajffjajdgj_, pajffjajdgj_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
   * @return The count of pajffjajdgj.
   */
  public int getPajffjajdgjCount() {
    return pajffjajdgj_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
   * @param index The index of the element to return.
   * @return The pajffjajdgj at the given index.
   */
  public POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI getPajffjajdgj(int index) {
    return pajffjajdgj_converter_.convert(pajffjajdgj_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
   * @return A list containing the enum numeric values on the wire for pajffjajdgj.
   */
  public java.util.List<java.lang.Integer>
  getPajffjajdgjValueList() {
    return pajffjajdgj_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of pajffjajdgj at the given index.
   */
  public int getPajffjajdgjValue(int index) {
    return pajffjajdgj_.get(index);
  }
  private int pajffjajdgjMemoizedSerializedSize;

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
    if (getPajffjajdgjList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(pajffjajdgjMemoizedSerializedSize);
    }
    for (int i = 0; i < pajffjajdgj_.size(); i++) {
      output.writeEnumNoTag(pajffjajdgj_.get(i));
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
      for (int i = 0; i < pajffjajdgj_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(pajffjajdgj_.get(i));
      }
      size += dataSize;
      if (!getPajffjajdgjList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }pajffjajdgjMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.CKPNGGLJPNK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKPNGGLJPNK other = (POGOProtos.Rpc.CKPNGGLJPNK) obj;

    if (!pajffjajdgj_.equals(other.pajffjajdgj_)) return false;
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
    if (getPajffjajdgjCount() > 0) {
      hash = (37 * hash) + PAJFFJAJDGJ_FIELD_NUMBER;
      hash = (53 * hash) + pajffjajdgj_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPNGGLJPNK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKPNGGLJPNK prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CKPNGGLJPNK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKPNGGLJPNK)
      POGOProtos.Rpc.CKPNGGLJPNKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CKPNGGLJPNK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CKPNGGLJPNK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKPNGGLJPNK.class, POGOProtos.Rpc.CKPNGGLJPNK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKPNGGLJPNK.newBuilder()
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
      pajffjajdgj_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CKPNGGLJPNK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPNGGLJPNK getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKPNGGLJPNK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPNGGLJPNK build() {
      POGOProtos.Rpc.CKPNGGLJPNK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPNGGLJPNK buildPartial() {
      POGOProtos.Rpc.CKPNGGLJPNK result = new POGOProtos.Rpc.CKPNGGLJPNK(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        pajffjajdgj_ = java.util.Collections.unmodifiableList(pajffjajdgj_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pajffjajdgj_ = pajffjajdgj_;
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
      if (other instanceof POGOProtos.Rpc.CKPNGGLJPNK) {
        return mergeFrom((POGOProtos.Rpc.CKPNGGLJPNK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKPNGGLJPNK other) {
      if (other == POGOProtos.Rpc.CKPNGGLJPNK.getDefaultInstance()) return this;
      if (!other.pajffjajdgj_.isEmpty()) {
        if (pajffjajdgj_.isEmpty()) {
          pajffjajdgj_ = other.pajffjajdgj_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePajffjajdgjIsMutable();
          pajffjajdgj_.addAll(other.pajffjajdgj_);
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
      POGOProtos.Rpc.CKPNGGLJPNK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKPNGGLJPNK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> pajffjajdgj_ =
      java.util.Collections.emptyList();
    private void ensurePajffjajdgjIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pajffjajdgj_ = new java.util.ArrayList<java.lang.Integer>(pajffjajdgj_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @return A list containing the pajffjajdgj.
     */
    public java.util.List<POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI> getPajffjajdgjList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI>(pajffjajdgj_, pajffjajdgj_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @return The count of pajffjajdgj.
     */
    public int getPajffjajdgjCount() {
      return pajffjajdgj_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param index The index of the element to return.
     * @return The pajffjajdgj at the given index.
     */
    public POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI getPajffjajdgj(int index) {
      return pajffjajdgj_converter_.convert(pajffjajdgj_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param index The index to set the value at.
     * @param value The pajffjajdgj to set.
     * @return This builder for chaining.
     */
    public Builder setPajffjajdgj(
        int index, POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePajffjajdgjIsMutable();
      pajffjajdgj_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param value The pajffjajdgj to add.
     * @return This builder for chaining.
     */
    public Builder addPajffjajdgj(POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePajffjajdgjIsMutable();
      pajffjajdgj_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param values The pajffjajdgj to add.
     * @return This builder for chaining.
     */
    public Builder addAllPajffjajdgj(
        java.lang.Iterable<? extends POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI> values) {
      ensurePajffjajdgjIsMutable();
      for (POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI value : values) {
        pajffjajdgj_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPajffjajdgj() {
      pajffjajdgj_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @return A list containing the enum numeric values on the wire for pajffjajdgj.
     */
    public java.util.List<java.lang.Integer>
    getPajffjajdgjValueList() {
      return java.util.Collections.unmodifiableList(pajffjajdgj_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pajffjajdgj at the given index.
     */
    public int getPajffjajdgjValue(int index) {
      return pajffjajdgj_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pajffjajdgj at the given index.
     * @return This builder for chaining.
     */
    public Builder setPajffjajdgjValue(
        int index, int value) {
      ensurePajffjajdgjIsMutable();
      pajffjajdgj_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param value The enum numeric value on the wire for pajffjajdgj to add.
     * @return This builder for chaining.
     */
    public Builder addPajffjajdgjValue(int value) {
      ensurePajffjajdgjIsMutable();
      pajffjajdgj_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EILPNGBLOGP.LIKFMOFNAOI pajffjajdgj = 1;</code>
     * @param values The enum numeric values on the wire for pajffjajdgj to add.
     * @return This builder for chaining.
     */
    public Builder addAllPajffjajdgjValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensurePajffjajdgjIsMutable();
      for (int value : values) {
        pajffjajdgj_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKPNGGLJPNK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKPNGGLJPNK)
  private static final POGOProtos.Rpc.CKPNGGLJPNK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKPNGGLJPNK();
  }

  public static POGOProtos.Rpc.CKPNGGLJPNK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKPNGGLJPNK>
      PARSER = new com.google.protobuf.AbstractParser<CKPNGGLJPNK>() {
    @java.lang.Override
    public CKPNGGLJPNK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKPNGGLJPNK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKPNGGLJPNK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKPNGGLJPNK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKPNGGLJPNK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

