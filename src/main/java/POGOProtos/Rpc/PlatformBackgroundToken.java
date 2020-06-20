// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformBackgroundToken}
 */
public  final class PlatformBackgroundToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformBackgroundToken)
    PlatformBackgroundTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformBackgroundToken.newBuilder() to construct.
  private PlatformBackgroundToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformBackgroundToken() {
    token_ = com.google.protobuf.ByteString.EMPTY;
    iv_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformBackgroundToken();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformBackgroundToken(
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

            token_ = input.readBytes();
            break;
          }
          case 16: {

            expirationTime_ = input.readInt64();
            break;
          }
          case 26: {

            iv_ = input.readBytes();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformBackgroundToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformBackgroundToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformBackgroundToken.class, POGOProtos.Rpc.PlatformBackgroundToken.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString token_;
  /**
   * <code>bytes token = 1;</code>
   * @return The token.
   */
  public com.google.protobuf.ByteString getToken() {
    return token_;
  }

  public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
  private long expirationTime_;
  /**
   * <code>int64 expiration_time = 2;</code>
   * @return The expirationTime.
   */
  public long getExpirationTime() {
    return expirationTime_;
  }

  public static final int IV_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString iv_;
  /**
   * <code>bytes iv = 3;</code>
   * @return The iv.
   */
  public com.google.protobuf.ByteString getIv() {
    return iv_;
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
    if (!token_.isEmpty()) {
      output.writeBytes(1, token_);
    }
    if (expirationTime_ != 0L) {
      output.writeInt64(2, expirationTime_);
    }
    if (!iv_.isEmpty()) {
      output.writeBytes(3, iv_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!token_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, token_);
    }
    if (expirationTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, expirationTime_);
    }
    if (!iv_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, iv_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformBackgroundToken)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformBackgroundToken other = (POGOProtos.Rpc.PlatformBackgroundToken) obj;

    if (!getToken()
        .equals(other.getToken())) return false;
    if (getExpirationTime()
        != other.getExpirationTime()) return false;
    if (!getIv()
        .equals(other.getIv())) return false;
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
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + EXPIRATION_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpirationTime());
    hash = (37 * hash) + IV_FIELD_NUMBER;
    hash = (53 * hash) + getIv().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformBackgroundToken parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformBackgroundToken prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformBackgroundToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformBackgroundToken)
      POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformBackgroundToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformBackgroundToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformBackgroundToken.class, POGOProtos.Rpc.PlatformBackgroundToken.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformBackgroundToken.newBuilder()
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
      token_ = com.google.protobuf.ByteString.EMPTY;

      expirationTime_ = 0L;

      iv_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformBackgroundToken_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformBackgroundToken getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformBackgroundToken.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformBackgroundToken build() {
      POGOProtos.Rpc.PlatformBackgroundToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformBackgroundToken buildPartial() {
      POGOProtos.Rpc.PlatformBackgroundToken result = new POGOProtos.Rpc.PlatformBackgroundToken(this);
      result.token_ = token_;
      result.expirationTime_ = expirationTime_;
      result.iv_ = iv_;
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
      if (other instanceof POGOProtos.Rpc.PlatformBackgroundToken) {
        return mergeFrom((POGOProtos.Rpc.PlatformBackgroundToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformBackgroundToken other) {
      if (other == POGOProtos.Rpc.PlatformBackgroundToken.getDefaultInstance()) return this;
      if (other.getToken() != com.google.protobuf.ByteString.EMPTY) {
        setToken(other.getToken());
      }
      if (other.getExpirationTime() != 0L) {
        setExpirationTime(other.getExpirationTime());
      }
      if (other.getIv() != com.google.protobuf.ByteString.EMPTY) {
        setIv(other.getIv());
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
      POGOProtos.Rpc.PlatformBackgroundToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformBackgroundToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString token_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes token = 1;</code>
     * @return The token.
     */
    public com.google.protobuf.ByteString getToken() {
      return token_;
    }
    /**
     * <code>bytes token = 1;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }

    private long expirationTime_ ;
    /**
     * <code>int64 expiration_time = 2;</code>
     * @return The expirationTime.
     */
    public long getExpirationTime() {
      return expirationTime_;
    }
    /**
     * <code>int64 expiration_time = 2;</code>
     * @param value The expirationTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationTime(long value) {
      
      expirationTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expiration_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirationTime() {
      
      expirationTime_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString iv_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes iv = 3;</code>
     * @return The iv.
     */
    public com.google.protobuf.ByteString getIv() {
      return iv_;
    }
    /**
     * <code>bytes iv = 3;</code>
     * @param value The iv to set.
     * @return This builder for chaining.
     */
    public Builder setIv(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iv_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes iv = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIv() {
      
      iv_ = getDefaultInstance().getIv();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformBackgroundToken)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformBackgroundToken)
  private static final POGOProtos.Rpc.PlatformBackgroundToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformBackgroundToken();
  }

  public static POGOProtos.Rpc.PlatformBackgroundToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformBackgroundToken>
      PARSER = new com.google.protobuf.AbstractParser<PlatformBackgroundToken>() {
    @java.lang.Override
    public PlatformBackgroundToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformBackgroundToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformBackgroundToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformBackgroundToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformBackgroundToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

