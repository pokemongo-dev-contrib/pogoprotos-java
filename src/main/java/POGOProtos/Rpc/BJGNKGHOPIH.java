// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BJGNKGHOPIH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BJGNKGHOPIH}
 */
public final class BJGNKGHOPIH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BJGNKGHOPIH)
    BJGNKGHOPIHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BJGNKGHOPIH.newBuilder() to construct.
  private BJGNKGHOPIH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BJGNKGHOPIH() {
    pojkmgdcbgk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BJGNKGHOPIH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BJGNKGHOPIH(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            pojkmgdcbgk_ = s;
            break;
          }
          case 16: {

            mipbjbmoglf_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGNKGHOPIH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGNKGHOPIH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BJGNKGHOPIH.class, POGOProtos.Rpc.BJGNKGHOPIH.Builder.class);
  }

  public static final int POJKMGDCBGK_FIELD_NUMBER = 1;
  private volatile java.lang.Object pojkmgdcbgk_;
  /**
   * <code>string pojkmgdcbgk = 1;</code>
   * @return The pojkmgdcbgk.
   */
  @java.lang.Override
  public java.lang.String getPojkmgdcbgk() {
    java.lang.Object ref = pojkmgdcbgk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pojkmgdcbgk_ = s;
      return s;
    }
  }
  /**
   * <code>string pojkmgdcbgk = 1;</code>
   * @return The bytes for pojkmgdcbgk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPojkmgdcbgkBytes() {
    java.lang.Object ref = pojkmgdcbgk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pojkmgdcbgk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIPBJBMOGLF_FIELD_NUMBER = 2;
  private long mipbjbmoglf_;
  /**
   * <code>int64 mipbjbmoglf = 2;</code>
   * @return The mipbjbmoglf.
   */
  @java.lang.Override
  public long getMipbjbmoglf() {
    return mipbjbmoglf_;
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
    if (!getPojkmgdcbgkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pojkmgdcbgk_);
    }
    if (mipbjbmoglf_ != 0L) {
      output.writeInt64(2, mipbjbmoglf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPojkmgdcbgkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pojkmgdcbgk_);
    }
    if (mipbjbmoglf_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mipbjbmoglf_);
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
    if (!(obj instanceof POGOProtos.Rpc.BJGNKGHOPIH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BJGNKGHOPIH other = (POGOProtos.Rpc.BJGNKGHOPIH) obj;

    if (!getPojkmgdcbgk()
        .equals(other.getPojkmgdcbgk())) return false;
    if (getMipbjbmoglf()
        != other.getMipbjbmoglf()) return false;
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
    hash = (37 * hash) + POJKMGDCBGK_FIELD_NUMBER;
    hash = (53 * hash) + getPojkmgdcbgk().hashCode();
    hash = (37 * hash) + MIPBJBMOGLF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMipbjbmoglf());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGNKGHOPIH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BJGNKGHOPIH prototype) {
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
   * ref: BJGNKGHOPIH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BJGNKGHOPIH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BJGNKGHOPIH)
      POGOProtos.Rpc.BJGNKGHOPIHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGNKGHOPIH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGNKGHOPIH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BJGNKGHOPIH.class, POGOProtos.Rpc.BJGNKGHOPIH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BJGNKGHOPIH.newBuilder()
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
      pojkmgdcbgk_ = "";

      mipbjbmoglf_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGNKGHOPIH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGNKGHOPIH getDefaultInstanceForType() {
      return POGOProtos.Rpc.BJGNKGHOPIH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGNKGHOPIH build() {
      POGOProtos.Rpc.BJGNKGHOPIH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGNKGHOPIH buildPartial() {
      POGOProtos.Rpc.BJGNKGHOPIH result = new POGOProtos.Rpc.BJGNKGHOPIH(this);
      result.pojkmgdcbgk_ = pojkmgdcbgk_;
      result.mipbjbmoglf_ = mipbjbmoglf_;
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
      if (other instanceof POGOProtos.Rpc.BJGNKGHOPIH) {
        return mergeFrom((POGOProtos.Rpc.BJGNKGHOPIH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BJGNKGHOPIH other) {
      if (other == POGOProtos.Rpc.BJGNKGHOPIH.getDefaultInstance()) return this;
      if (!other.getPojkmgdcbgk().isEmpty()) {
        pojkmgdcbgk_ = other.pojkmgdcbgk_;
        onChanged();
      }
      if (other.getMipbjbmoglf() != 0L) {
        setMipbjbmoglf(other.getMipbjbmoglf());
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
      POGOProtos.Rpc.BJGNKGHOPIH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BJGNKGHOPIH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pojkmgdcbgk_ = "";
    /**
     * <code>string pojkmgdcbgk = 1;</code>
     * @return The pojkmgdcbgk.
     */
    public java.lang.String getPojkmgdcbgk() {
      java.lang.Object ref = pojkmgdcbgk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pojkmgdcbgk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pojkmgdcbgk = 1;</code>
     * @return The bytes for pojkmgdcbgk.
     */
    public com.google.protobuf.ByteString
        getPojkmgdcbgkBytes() {
      java.lang.Object ref = pojkmgdcbgk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pojkmgdcbgk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pojkmgdcbgk = 1;</code>
     * @param value The pojkmgdcbgk to set.
     * @return This builder for chaining.
     */
    public Builder setPojkmgdcbgk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pojkmgdcbgk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pojkmgdcbgk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPojkmgdcbgk() {
      
      pojkmgdcbgk_ = getDefaultInstance().getPojkmgdcbgk();
      onChanged();
      return this;
    }
    /**
     * <code>string pojkmgdcbgk = 1;</code>
     * @param value The bytes for pojkmgdcbgk to set.
     * @return This builder for chaining.
     */
    public Builder setPojkmgdcbgkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pojkmgdcbgk_ = value;
      onChanged();
      return this;
    }

    private long mipbjbmoglf_ ;
    /**
     * <code>int64 mipbjbmoglf = 2;</code>
     * @return The mipbjbmoglf.
     */
    @java.lang.Override
    public long getMipbjbmoglf() {
      return mipbjbmoglf_;
    }
    /**
     * <code>int64 mipbjbmoglf = 2;</code>
     * @param value The mipbjbmoglf to set.
     * @return This builder for chaining.
     */
    public Builder setMipbjbmoglf(long value) {
      
      mipbjbmoglf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mipbjbmoglf = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMipbjbmoglf() {
      
      mipbjbmoglf_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BJGNKGHOPIH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BJGNKGHOPIH)
  private static final POGOProtos.Rpc.BJGNKGHOPIH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BJGNKGHOPIH();
  }

  public static POGOProtos.Rpc.BJGNKGHOPIH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BJGNKGHOPIH>
      PARSER = new com.google.protobuf.AbstractParser<BJGNKGHOPIH>() {
    @java.lang.Override
    public BJGNKGHOPIH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BJGNKGHOPIH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BJGNKGHOPIH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BJGNKGHOPIH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BJGNKGHOPIH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

