// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OEIJGAOCPBO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OEIJGAOCPBO}
 */
public  final class OEIJGAOCPBO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OEIJGAOCPBO)
    OEIJGAOCPBOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OEIJGAOCPBO.newBuilder() to construct.
  private OEIJGAOCPBO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OEIJGAOCPBO() {
    doddofomgah_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OEIJGAOCPBO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OEIJGAOCPBO(
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
          case 13: {

            plngnfcjmac_ = input.readFloat();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              doddofomgah_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            doddofomgah_.add(s);
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
        doddofomgah_ = doddofomgah_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OEIJGAOCPBO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OEIJGAOCPBO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OEIJGAOCPBO.class, POGOProtos.Rpc.OEIJGAOCPBO.Builder.class);
  }

  public static final int PLNGNFCJMAC_FIELD_NUMBER = 1;
  private float plngnfcjmac_;
  /**
   * <code>float plngnfcjmac = 1;</code>
   * @return The plngnfcjmac.
   */
  public float getPlngnfcjmac() {
    return plngnfcjmac_;
  }

  public static final int DODDOFOMGAH_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList doddofomgah_;
  /**
   * <code>repeated string doddofomgah = 2;</code>
   * @return A list containing the doddofomgah.
   */
  public com.google.protobuf.ProtocolStringList
      getDoddofomgahList() {
    return doddofomgah_;
  }
  /**
   * <code>repeated string doddofomgah = 2;</code>
   * @return The count of doddofomgah.
   */
  public int getDoddofomgahCount() {
    return doddofomgah_.size();
  }
  /**
   * <code>repeated string doddofomgah = 2;</code>
   * @param index The index of the element to return.
   * @return The doddofomgah at the given index.
   */
  public java.lang.String getDoddofomgah(int index) {
    return doddofomgah_.get(index);
  }
  /**
   * <code>repeated string doddofomgah = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the doddofomgah at the given index.
   */
  public com.google.protobuf.ByteString
      getDoddofomgahBytes(int index) {
    return doddofomgah_.getByteString(index);
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
    if (plngnfcjmac_ != 0F) {
      output.writeFloat(1, plngnfcjmac_);
    }
    for (int i = 0; i < doddofomgah_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, doddofomgah_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (plngnfcjmac_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, plngnfcjmac_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < doddofomgah_.size(); i++) {
        dataSize += computeStringSizeNoTag(doddofomgah_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDoddofomgahList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.OEIJGAOCPBO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OEIJGAOCPBO other = (POGOProtos.Rpc.OEIJGAOCPBO) obj;

    if (java.lang.Float.floatToIntBits(getPlngnfcjmac())
        != java.lang.Float.floatToIntBits(
            other.getPlngnfcjmac())) return false;
    if (!getDoddofomgahList()
        .equals(other.getDoddofomgahList())) return false;
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
    hash = (37 * hash) + PLNGNFCJMAC_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPlngnfcjmac());
    if (getDoddofomgahCount() > 0) {
      hash = (37 * hash) + DODDOFOMGAH_FIELD_NUMBER;
      hash = (53 * hash) + getDoddofomgahList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OEIJGAOCPBO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OEIJGAOCPBO prototype) {
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
   * ref: OEIJGAOCPBO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OEIJGAOCPBO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OEIJGAOCPBO)
      POGOProtos.Rpc.OEIJGAOCPBOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OEIJGAOCPBO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OEIJGAOCPBO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OEIJGAOCPBO.class, POGOProtos.Rpc.OEIJGAOCPBO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OEIJGAOCPBO.newBuilder()
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
      plngnfcjmac_ = 0F;

      doddofomgah_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OEIJGAOCPBO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OEIJGAOCPBO getDefaultInstanceForType() {
      return POGOProtos.Rpc.OEIJGAOCPBO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OEIJGAOCPBO build() {
      POGOProtos.Rpc.OEIJGAOCPBO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OEIJGAOCPBO buildPartial() {
      POGOProtos.Rpc.OEIJGAOCPBO result = new POGOProtos.Rpc.OEIJGAOCPBO(this);
      int from_bitField0_ = bitField0_;
      result.plngnfcjmac_ = plngnfcjmac_;
      if (((bitField0_ & 0x00000001) != 0)) {
        doddofomgah_ = doddofomgah_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.doddofomgah_ = doddofomgah_;
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
      if (other instanceof POGOProtos.Rpc.OEIJGAOCPBO) {
        return mergeFrom((POGOProtos.Rpc.OEIJGAOCPBO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OEIJGAOCPBO other) {
      if (other == POGOProtos.Rpc.OEIJGAOCPBO.getDefaultInstance()) return this;
      if (other.getPlngnfcjmac() != 0F) {
        setPlngnfcjmac(other.getPlngnfcjmac());
      }
      if (!other.doddofomgah_.isEmpty()) {
        if (doddofomgah_.isEmpty()) {
          doddofomgah_ = other.doddofomgah_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDoddofomgahIsMutable();
          doddofomgah_.addAll(other.doddofomgah_);
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
      POGOProtos.Rpc.OEIJGAOCPBO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OEIJGAOCPBO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private float plngnfcjmac_ ;
    /**
     * <code>float plngnfcjmac = 1;</code>
     * @return The plngnfcjmac.
     */
    public float getPlngnfcjmac() {
      return plngnfcjmac_;
    }
    /**
     * <code>float plngnfcjmac = 1;</code>
     * @param value The plngnfcjmac to set.
     * @return This builder for chaining.
     */
    public Builder setPlngnfcjmac(float value) {
      
      plngnfcjmac_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float plngnfcjmac = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlngnfcjmac() {
      
      plngnfcjmac_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList doddofomgah_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDoddofomgahIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        doddofomgah_ = new com.google.protobuf.LazyStringArrayList(doddofomgah_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @return A list containing the doddofomgah.
     */
    public com.google.protobuf.ProtocolStringList
        getDoddofomgahList() {
      return doddofomgah_.getUnmodifiableView();
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @return The count of doddofomgah.
     */
    public int getDoddofomgahCount() {
      return doddofomgah_.size();
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param index The index of the element to return.
     * @return The doddofomgah at the given index.
     */
    public java.lang.String getDoddofomgah(int index) {
      return doddofomgah_.get(index);
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the doddofomgah at the given index.
     */
    public com.google.protobuf.ByteString
        getDoddofomgahBytes(int index) {
      return doddofomgah_.getByteString(index);
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param index The index to set the value at.
     * @param value The doddofomgah to set.
     * @return This builder for chaining.
     */
    public Builder setDoddofomgah(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDoddofomgahIsMutable();
      doddofomgah_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param value The doddofomgah to add.
     * @return This builder for chaining.
     */
    public Builder addDoddofomgah(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDoddofomgahIsMutable();
      doddofomgah_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param values The doddofomgah to add.
     * @return This builder for chaining.
     */
    public Builder addAllDoddofomgah(
        java.lang.Iterable<java.lang.String> values) {
      ensureDoddofomgahIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, doddofomgah_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoddofomgah() {
      doddofomgah_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string doddofomgah = 2;</code>
     * @param value The bytes of the doddofomgah to add.
     * @return This builder for chaining.
     */
    public Builder addDoddofomgahBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDoddofomgahIsMutable();
      doddofomgah_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OEIJGAOCPBO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OEIJGAOCPBO)
  private static final POGOProtos.Rpc.OEIJGAOCPBO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OEIJGAOCPBO();
  }

  public static POGOProtos.Rpc.OEIJGAOCPBO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OEIJGAOCPBO>
      PARSER = new com.google.protobuf.AbstractParser<OEIJGAOCPBO>() {
    @java.lang.Override
    public OEIJGAOCPBO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OEIJGAOCPBO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OEIJGAOCPBO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OEIJGAOCPBO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OEIJGAOCPBO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

