// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HMJPHCGPMDK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HMJPHCGPMDK}
 */
public final class HMJPHCGPMDK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HMJPHCGPMDK)
    HMJPHCGPMDKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HMJPHCGPMDK.newBuilder() to construct.
  private HMJPHCGPMDK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HMJPHCGPMDK() {
    ighnphldkga_ = "";
    ikbndeecdcc_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HMJPHCGPMDK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HMJPHCGPMDK(
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

            ighnphldkga_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ikbndeecdcc_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ikbndeecdcc_.add(s);
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
        ikbndeecdcc_ = ikbndeecdcc_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMJPHCGPMDK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMJPHCGPMDK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HMJPHCGPMDK.class, POGOProtos.Rpc.HMJPHCGPMDK.Builder.class);
  }

  public static final int IGHNPHLDKGA_FIELD_NUMBER = 1;
  private volatile java.lang.Object ighnphldkga_;
  /**
   * <code>string ighnphldkga = 1;</code>
   * @return The ighnphldkga.
   */
  @java.lang.Override
  public java.lang.String getIghnphldkga() {
    java.lang.Object ref = ighnphldkga_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ighnphldkga_ = s;
      return s;
    }
  }
  /**
   * <code>string ighnphldkga = 1;</code>
   * @return The bytes for ighnphldkga.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIghnphldkgaBytes() {
    java.lang.Object ref = ighnphldkga_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ighnphldkga_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IKBNDEECDCC_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList ikbndeecdcc_;
  /**
   * <code>repeated string ikbndeecdcc = 2;</code>
   * @return A list containing the ikbndeecdcc.
   */
  public com.google.protobuf.ProtocolStringList
      getIkbndeecdccList() {
    return ikbndeecdcc_;
  }
  /**
   * <code>repeated string ikbndeecdcc = 2;</code>
   * @return The count of ikbndeecdcc.
   */
  public int getIkbndeecdccCount() {
    return ikbndeecdcc_.size();
  }
  /**
   * <code>repeated string ikbndeecdcc = 2;</code>
   * @param index The index of the element to return.
   * @return The ikbndeecdcc at the given index.
   */
  public java.lang.String getIkbndeecdcc(int index) {
    return ikbndeecdcc_.get(index);
  }
  /**
   * <code>repeated string ikbndeecdcc = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ikbndeecdcc at the given index.
   */
  public com.google.protobuf.ByteString
      getIkbndeecdccBytes(int index) {
    return ikbndeecdcc_.getByteString(index);
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
    if (!getIghnphldkgaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ighnphldkga_);
    }
    for (int i = 0; i < ikbndeecdcc_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ikbndeecdcc_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIghnphldkgaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ighnphldkga_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ikbndeecdcc_.size(); i++) {
        dataSize += computeStringSizeNoTag(ikbndeecdcc_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIkbndeecdccList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.HMJPHCGPMDK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HMJPHCGPMDK other = (POGOProtos.Rpc.HMJPHCGPMDK) obj;

    if (!getIghnphldkga()
        .equals(other.getIghnphldkga())) return false;
    if (!getIkbndeecdccList()
        .equals(other.getIkbndeecdccList())) return false;
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
    hash = (37 * hash) + IGHNPHLDKGA_FIELD_NUMBER;
    hash = (53 * hash) + getIghnphldkga().hashCode();
    if (getIkbndeecdccCount() > 0) {
      hash = (37 * hash) + IKBNDEECDCC_FIELD_NUMBER;
      hash = (53 * hash) + getIkbndeecdccList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMJPHCGPMDK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HMJPHCGPMDK prototype) {
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
   * ref: HMJPHCGPMDK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HMJPHCGPMDK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HMJPHCGPMDK)
      POGOProtos.Rpc.HMJPHCGPMDKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMJPHCGPMDK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMJPHCGPMDK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HMJPHCGPMDK.class, POGOProtos.Rpc.HMJPHCGPMDK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HMJPHCGPMDK.newBuilder()
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
      ighnphldkga_ = "";

      ikbndeecdcc_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMJPHCGPMDK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMJPHCGPMDK getDefaultInstanceForType() {
      return POGOProtos.Rpc.HMJPHCGPMDK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMJPHCGPMDK build() {
      POGOProtos.Rpc.HMJPHCGPMDK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMJPHCGPMDK buildPartial() {
      POGOProtos.Rpc.HMJPHCGPMDK result = new POGOProtos.Rpc.HMJPHCGPMDK(this);
      int from_bitField0_ = bitField0_;
      result.ighnphldkga_ = ighnphldkga_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ikbndeecdcc_ = ikbndeecdcc_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ikbndeecdcc_ = ikbndeecdcc_;
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
      if (other instanceof POGOProtos.Rpc.HMJPHCGPMDK) {
        return mergeFrom((POGOProtos.Rpc.HMJPHCGPMDK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HMJPHCGPMDK other) {
      if (other == POGOProtos.Rpc.HMJPHCGPMDK.getDefaultInstance()) return this;
      if (!other.getIghnphldkga().isEmpty()) {
        ighnphldkga_ = other.ighnphldkga_;
        onChanged();
      }
      if (!other.ikbndeecdcc_.isEmpty()) {
        if (ikbndeecdcc_.isEmpty()) {
          ikbndeecdcc_ = other.ikbndeecdcc_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIkbndeecdccIsMutable();
          ikbndeecdcc_.addAll(other.ikbndeecdcc_);
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
      POGOProtos.Rpc.HMJPHCGPMDK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HMJPHCGPMDK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object ighnphldkga_ = "";
    /**
     * <code>string ighnphldkga = 1;</code>
     * @return The ighnphldkga.
     */
    public java.lang.String getIghnphldkga() {
      java.lang.Object ref = ighnphldkga_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ighnphldkga_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ighnphldkga = 1;</code>
     * @return The bytes for ighnphldkga.
     */
    public com.google.protobuf.ByteString
        getIghnphldkgaBytes() {
      java.lang.Object ref = ighnphldkga_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ighnphldkga_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ighnphldkga = 1;</code>
     * @param value The ighnphldkga to set.
     * @return This builder for chaining.
     */
    public Builder setIghnphldkga(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ighnphldkga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ighnphldkga = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIghnphldkga() {
      
      ighnphldkga_ = getDefaultInstance().getIghnphldkga();
      onChanged();
      return this;
    }
    /**
     * <code>string ighnphldkga = 1;</code>
     * @param value The bytes for ighnphldkga to set.
     * @return This builder for chaining.
     */
    public Builder setIghnphldkgaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ighnphldkga_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList ikbndeecdcc_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIkbndeecdccIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ikbndeecdcc_ = new com.google.protobuf.LazyStringArrayList(ikbndeecdcc_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @return A list containing the ikbndeecdcc.
     */
    public com.google.protobuf.ProtocolStringList
        getIkbndeecdccList() {
      return ikbndeecdcc_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @return The count of ikbndeecdcc.
     */
    public int getIkbndeecdccCount() {
      return ikbndeecdcc_.size();
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param index The index of the element to return.
     * @return The ikbndeecdcc at the given index.
     */
    public java.lang.String getIkbndeecdcc(int index) {
      return ikbndeecdcc_.get(index);
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the ikbndeecdcc at the given index.
     */
    public com.google.protobuf.ByteString
        getIkbndeecdccBytes(int index) {
      return ikbndeecdcc_.getByteString(index);
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param index The index to set the value at.
     * @param value The ikbndeecdcc to set.
     * @return This builder for chaining.
     */
    public Builder setIkbndeecdcc(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIkbndeecdccIsMutable();
      ikbndeecdcc_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param value The ikbndeecdcc to add.
     * @return This builder for chaining.
     */
    public Builder addIkbndeecdcc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIkbndeecdccIsMutable();
      ikbndeecdcc_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param values The ikbndeecdcc to add.
     * @return This builder for chaining.
     */
    public Builder addAllIkbndeecdcc(
        java.lang.Iterable<java.lang.String> values) {
      ensureIkbndeecdccIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ikbndeecdcc_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIkbndeecdcc() {
      ikbndeecdcc_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ikbndeecdcc = 2;</code>
     * @param value The bytes of the ikbndeecdcc to add.
     * @return This builder for chaining.
     */
    public Builder addIkbndeecdccBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIkbndeecdccIsMutable();
      ikbndeecdcc_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HMJPHCGPMDK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HMJPHCGPMDK)
  private static final POGOProtos.Rpc.HMJPHCGPMDK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HMJPHCGPMDK();
  }

  public static POGOProtos.Rpc.HMJPHCGPMDK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HMJPHCGPMDK>
      PARSER = new com.google.protobuf.AbstractParser<HMJPHCGPMDK>() {
    @java.lang.Override
    public HMJPHCGPMDK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HMJPHCGPMDK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HMJPHCGPMDK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HMJPHCGPMDK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HMJPHCGPMDK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

