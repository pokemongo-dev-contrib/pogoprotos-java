// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AMALBCBACEI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AMALBCBACEI}
 */
public  final class AMALBCBACEI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AMALBCBACEI)
    AMALBCBACEIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AMALBCBACEI.newBuilder() to construct.
  private AMALBCBACEI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AMALBCBACEI() {
    cehajlkmedl_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AMALBCBACEI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AMALBCBACEI(
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
              cehajlkmedl_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            cehajlkmedl_.add(s);
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
        cehajlkmedl_ = cehajlkmedl_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AMALBCBACEI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AMALBCBACEI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AMALBCBACEI.class, POGOProtos.Rpc.AMALBCBACEI.Builder.class);
  }

  public static final int CEHAJLKMEDL_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList cehajlkmedl_;
  /**
   * <code>repeated string cehajlkmedl = 1;</code>
   * @return A list containing the cehajlkmedl.
   */
  public com.google.protobuf.ProtocolStringList
      getCehajlkmedlList() {
    return cehajlkmedl_;
  }
  /**
   * <code>repeated string cehajlkmedl = 1;</code>
   * @return The count of cehajlkmedl.
   */
  public int getCehajlkmedlCount() {
    return cehajlkmedl_.size();
  }
  /**
   * <code>repeated string cehajlkmedl = 1;</code>
   * @param index The index of the element to return.
   * @return The cehajlkmedl at the given index.
   */
  public java.lang.String getCehajlkmedl(int index) {
    return cehajlkmedl_.get(index);
  }
  /**
   * <code>repeated string cehajlkmedl = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cehajlkmedl at the given index.
   */
  public com.google.protobuf.ByteString
      getCehajlkmedlBytes(int index) {
    return cehajlkmedl_.getByteString(index);
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
    for (int i = 0; i < cehajlkmedl_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cehajlkmedl_.getRaw(i));
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
      for (int i = 0; i < cehajlkmedl_.size(); i++) {
        dataSize += computeStringSizeNoTag(cehajlkmedl_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCehajlkmedlList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.AMALBCBACEI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AMALBCBACEI other = (POGOProtos.Rpc.AMALBCBACEI) obj;

    if (!getCehajlkmedlList()
        .equals(other.getCehajlkmedlList())) return false;
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
    if (getCehajlkmedlCount() > 0) {
      hash = (37 * hash) + CEHAJLKMEDL_FIELD_NUMBER;
      hash = (53 * hash) + getCehajlkmedlList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AMALBCBACEI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AMALBCBACEI prototype) {
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
   * ref: AMALBCBACEI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AMALBCBACEI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AMALBCBACEI)
      POGOProtos.Rpc.AMALBCBACEIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AMALBCBACEI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AMALBCBACEI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AMALBCBACEI.class, POGOProtos.Rpc.AMALBCBACEI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AMALBCBACEI.newBuilder()
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
      cehajlkmedl_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AMALBCBACEI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AMALBCBACEI getDefaultInstanceForType() {
      return POGOProtos.Rpc.AMALBCBACEI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AMALBCBACEI build() {
      POGOProtos.Rpc.AMALBCBACEI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AMALBCBACEI buildPartial() {
      POGOProtos.Rpc.AMALBCBACEI result = new POGOProtos.Rpc.AMALBCBACEI(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cehajlkmedl_ = cehajlkmedl_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cehajlkmedl_ = cehajlkmedl_;
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
      if (other instanceof POGOProtos.Rpc.AMALBCBACEI) {
        return mergeFrom((POGOProtos.Rpc.AMALBCBACEI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AMALBCBACEI other) {
      if (other == POGOProtos.Rpc.AMALBCBACEI.getDefaultInstance()) return this;
      if (!other.cehajlkmedl_.isEmpty()) {
        if (cehajlkmedl_.isEmpty()) {
          cehajlkmedl_ = other.cehajlkmedl_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCehajlkmedlIsMutable();
          cehajlkmedl_.addAll(other.cehajlkmedl_);
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
      POGOProtos.Rpc.AMALBCBACEI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AMALBCBACEI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList cehajlkmedl_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCehajlkmedlIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cehajlkmedl_ = new com.google.protobuf.LazyStringArrayList(cehajlkmedl_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @return A list containing the cehajlkmedl.
     */
    public com.google.protobuf.ProtocolStringList
        getCehajlkmedlList() {
      return cehajlkmedl_.getUnmodifiableView();
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @return The count of cehajlkmedl.
     */
    public int getCehajlkmedlCount() {
      return cehajlkmedl_.size();
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param index The index of the element to return.
     * @return The cehajlkmedl at the given index.
     */
    public java.lang.String getCehajlkmedl(int index) {
      return cehajlkmedl_.get(index);
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the cehajlkmedl at the given index.
     */
    public com.google.protobuf.ByteString
        getCehajlkmedlBytes(int index) {
      return cehajlkmedl_.getByteString(index);
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param index The index to set the value at.
     * @param value The cehajlkmedl to set.
     * @return This builder for chaining.
     */
    public Builder setCehajlkmedl(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCehajlkmedlIsMutable();
      cehajlkmedl_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param value The cehajlkmedl to add.
     * @return This builder for chaining.
     */
    public Builder addCehajlkmedl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCehajlkmedlIsMutable();
      cehajlkmedl_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param values The cehajlkmedl to add.
     * @return This builder for chaining.
     */
    public Builder addAllCehajlkmedl(
        java.lang.Iterable<java.lang.String> values) {
      ensureCehajlkmedlIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cehajlkmedl_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCehajlkmedl() {
      cehajlkmedl_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cehajlkmedl = 1;</code>
     * @param value The bytes of the cehajlkmedl to add.
     * @return This builder for chaining.
     */
    public Builder addCehajlkmedlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCehajlkmedlIsMutable();
      cehajlkmedl_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AMALBCBACEI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AMALBCBACEI)
  private static final POGOProtos.Rpc.AMALBCBACEI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AMALBCBACEI();
  }

  public static POGOProtos.Rpc.AMALBCBACEI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AMALBCBACEI>
      PARSER = new com.google.protobuf.AbstractParser<AMALBCBACEI>() {
    @java.lang.Override
    public AMALBCBACEI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AMALBCBACEI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AMALBCBACEI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AMALBCBACEI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AMALBCBACEI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

