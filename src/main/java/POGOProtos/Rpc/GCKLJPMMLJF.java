// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GCKLJPMMLJF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GCKLJPMMLJF}
 */
public final class GCKLJPMMLJF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GCKLJPMMLJF)
    GCKLJPMMLJFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GCKLJPMMLJF.newBuilder() to construct.
  private GCKLJPMMLJF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GCKLJPMMLJF() {
    dcmolbngngf_ = "";
    fabdfemfbmo_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GCKLJPMMLJF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GCKLJPMMLJF(
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

            dcmolbngngf_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fabdfemfbmo_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            fabdfemfbmo_.add(s);
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
        fabdfemfbmo_ = fabdfemfbmo_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GCKLJPMMLJF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GCKLJPMMLJF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GCKLJPMMLJF.class, POGOProtos.Rpc.GCKLJPMMLJF.Builder.class);
  }

  public static final int DCMOLBNGNGF_FIELD_NUMBER = 1;
  private volatile java.lang.Object dcmolbngngf_;
  /**
   * <code>string dcmolbngngf = 1;</code>
   * @return The dcmolbngngf.
   */
  @java.lang.Override
  public java.lang.String getDcmolbngngf() {
    java.lang.Object ref = dcmolbngngf_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dcmolbngngf_ = s;
      return s;
    }
  }
  /**
   * <code>string dcmolbngngf = 1;</code>
   * @return The bytes for dcmolbngngf.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDcmolbngngfBytes() {
    java.lang.Object ref = dcmolbngngf_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dcmolbngngf_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FABDFEMFBMO_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList fabdfemfbmo_;
  /**
   * <code>repeated string fabdfemfbmo = 2;</code>
   * @return A list containing the fabdfemfbmo.
   */
  public com.google.protobuf.ProtocolStringList
      getFabdfemfbmoList() {
    return fabdfemfbmo_;
  }
  /**
   * <code>repeated string fabdfemfbmo = 2;</code>
   * @return The count of fabdfemfbmo.
   */
  public int getFabdfemfbmoCount() {
    return fabdfemfbmo_.size();
  }
  /**
   * <code>repeated string fabdfemfbmo = 2;</code>
   * @param index The index of the element to return.
   * @return The fabdfemfbmo at the given index.
   */
  public java.lang.String getFabdfemfbmo(int index) {
    return fabdfemfbmo_.get(index);
  }
  /**
   * <code>repeated string fabdfemfbmo = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fabdfemfbmo at the given index.
   */
  public com.google.protobuf.ByteString
      getFabdfemfbmoBytes(int index) {
    return fabdfemfbmo_.getByteString(index);
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
    if (!getDcmolbngngfBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dcmolbngngf_);
    }
    for (int i = 0; i < fabdfemfbmo_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fabdfemfbmo_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDcmolbngngfBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dcmolbngngf_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fabdfemfbmo_.size(); i++) {
        dataSize += computeStringSizeNoTag(fabdfemfbmo_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFabdfemfbmoList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.GCKLJPMMLJF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GCKLJPMMLJF other = (POGOProtos.Rpc.GCKLJPMMLJF) obj;

    if (!getDcmolbngngf()
        .equals(other.getDcmolbngngf())) return false;
    if (!getFabdfemfbmoList()
        .equals(other.getFabdfemfbmoList())) return false;
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
    hash = (37 * hash) + DCMOLBNGNGF_FIELD_NUMBER;
    hash = (53 * hash) + getDcmolbngngf().hashCode();
    if (getFabdfemfbmoCount() > 0) {
      hash = (37 * hash) + FABDFEMFBMO_FIELD_NUMBER;
      hash = (53 * hash) + getFabdfemfbmoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GCKLJPMMLJF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GCKLJPMMLJF prototype) {
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
   * ref: GCKLJPMMLJF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GCKLJPMMLJF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GCKLJPMMLJF)
      POGOProtos.Rpc.GCKLJPMMLJFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GCKLJPMMLJF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GCKLJPMMLJF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GCKLJPMMLJF.class, POGOProtos.Rpc.GCKLJPMMLJF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GCKLJPMMLJF.newBuilder()
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
      dcmolbngngf_ = "";

      fabdfemfbmo_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GCKLJPMMLJF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GCKLJPMMLJF getDefaultInstanceForType() {
      return POGOProtos.Rpc.GCKLJPMMLJF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GCKLJPMMLJF build() {
      POGOProtos.Rpc.GCKLJPMMLJF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GCKLJPMMLJF buildPartial() {
      POGOProtos.Rpc.GCKLJPMMLJF result = new POGOProtos.Rpc.GCKLJPMMLJF(this);
      int from_bitField0_ = bitField0_;
      result.dcmolbngngf_ = dcmolbngngf_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fabdfemfbmo_ = fabdfemfbmo_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fabdfemfbmo_ = fabdfemfbmo_;
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
      if (other instanceof POGOProtos.Rpc.GCKLJPMMLJF) {
        return mergeFrom((POGOProtos.Rpc.GCKLJPMMLJF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GCKLJPMMLJF other) {
      if (other == POGOProtos.Rpc.GCKLJPMMLJF.getDefaultInstance()) return this;
      if (!other.getDcmolbngngf().isEmpty()) {
        dcmolbngngf_ = other.dcmolbngngf_;
        onChanged();
      }
      if (!other.fabdfemfbmo_.isEmpty()) {
        if (fabdfemfbmo_.isEmpty()) {
          fabdfemfbmo_ = other.fabdfemfbmo_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFabdfemfbmoIsMutable();
          fabdfemfbmo_.addAll(other.fabdfemfbmo_);
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
      POGOProtos.Rpc.GCKLJPMMLJF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GCKLJPMMLJF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object dcmolbngngf_ = "";
    /**
     * <code>string dcmolbngngf = 1;</code>
     * @return The dcmolbngngf.
     */
    public java.lang.String getDcmolbngngf() {
      java.lang.Object ref = dcmolbngngf_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dcmolbngngf_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dcmolbngngf = 1;</code>
     * @return The bytes for dcmolbngngf.
     */
    public com.google.protobuf.ByteString
        getDcmolbngngfBytes() {
      java.lang.Object ref = dcmolbngngf_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dcmolbngngf_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dcmolbngngf = 1;</code>
     * @param value The dcmolbngngf to set.
     * @return This builder for chaining.
     */
    public Builder setDcmolbngngf(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dcmolbngngf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dcmolbngngf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDcmolbngngf() {
      
      dcmolbngngf_ = getDefaultInstance().getDcmolbngngf();
      onChanged();
      return this;
    }
    /**
     * <code>string dcmolbngngf = 1;</code>
     * @param value The bytes for dcmolbngngf to set.
     * @return This builder for chaining.
     */
    public Builder setDcmolbngngfBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dcmolbngngf_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fabdfemfbmo_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFabdfemfbmoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fabdfemfbmo_ = new com.google.protobuf.LazyStringArrayList(fabdfemfbmo_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @return A list containing the fabdfemfbmo.
     */
    public com.google.protobuf.ProtocolStringList
        getFabdfemfbmoList() {
      return fabdfemfbmo_.getUnmodifiableView();
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @return The count of fabdfemfbmo.
     */
    public int getFabdfemfbmoCount() {
      return fabdfemfbmo_.size();
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param index The index of the element to return.
     * @return The fabdfemfbmo at the given index.
     */
    public java.lang.String getFabdfemfbmo(int index) {
      return fabdfemfbmo_.get(index);
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the fabdfemfbmo at the given index.
     */
    public com.google.protobuf.ByteString
        getFabdfemfbmoBytes(int index) {
      return fabdfemfbmo_.getByteString(index);
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param index The index to set the value at.
     * @param value The fabdfemfbmo to set.
     * @return This builder for chaining.
     */
    public Builder setFabdfemfbmo(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFabdfemfbmoIsMutable();
      fabdfemfbmo_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param value The fabdfemfbmo to add.
     * @return This builder for chaining.
     */
    public Builder addFabdfemfbmo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFabdfemfbmoIsMutable();
      fabdfemfbmo_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param values The fabdfemfbmo to add.
     * @return This builder for chaining.
     */
    public Builder addAllFabdfemfbmo(
        java.lang.Iterable<java.lang.String> values) {
      ensureFabdfemfbmoIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fabdfemfbmo_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFabdfemfbmo() {
      fabdfemfbmo_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string fabdfemfbmo = 2;</code>
     * @param value The bytes of the fabdfemfbmo to add.
     * @return This builder for chaining.
     */
    public Builder addFabdfemfbmoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFabdfemfbmoIsMutable();
      fabdfemfbmo_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GCKLJPMMLJF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GCKLJPMMLJF)
  private static final POGOProtos.Rpc.GCKLJPMMLJF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GCKLJPMMLJF();
  }

  public static POGOProtos.Rpc.GCKLJPMMLJF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GCKLJPMMLJF>
      PARSER = new com.google.protobuf.AbstractParser<GCKLJPMMLJF>() {
    @java.lang.Override
    public GCKLJPMMLJF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GCKLJPMMLJF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GCKLJPMMLJF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GCKLJPMMLJF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GCKLJPMMLJF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

