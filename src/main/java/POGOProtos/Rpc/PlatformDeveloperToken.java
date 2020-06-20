// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformDeveloperToken}
 */
public  final class PlatformDeveloperToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformDeveloperToken)
    PlatformDeveloperTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformDeveloperToken.newBuilder() to construct.
  private PlatformDeveloperToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformDeveloperToken() {
    idToken_ = "";
    ownerEmail_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformDeveloperToken();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformDeveloperToken(
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

            idToken_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ownerEmail_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDeveloperToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDeveloperToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformDeveloperToken.class, POGOProtos.Rpc.PlatformDeveloperToken.Builder.class);
  }

  public static final int ID_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object idToken_;
  /**
   * <code>string id_token = 1;</code>
   * @return The idToken.
   */
  public java.lang.String getIdToken() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idToken_ = s;
      return s;
    }
  }
  /**
   * <code>string id_token = 1;</code>
   * @return The bytes for idToken.
   */
  public com.google.protobuf.ByteString
      getIdTokenBytes() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object ownerEmail_;
  /**
   * <code>string owner_email = 2;</code>
   * @return The ownerEmail.
   */
  public java.lang.String getOwnerEmail() {
    java.lang.Object ref = ownerEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string owner_email = 2;</code>
   * @return The bytes for ownerEmail.
   */
  public com.google.protobuf.ByteString
      getOwnerEmailBytes() {
    java.lang.Object ref = ownerEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getIdTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, idToken_);
    }
    if (!getOwnerEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ownerEmail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, idToken_);
    }
    if (!getOwnerEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ownerEmail_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformDeveloperToken)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformDeveloperToken other = (POGOProtos.Rpc.PlatformDeveloperToken) obj;

    if (!getIdToken()
        .equals(other.getIdToken())) return false;
    if (!getOwnerEmail()
        .equals(other.getOwnerEmail())) return false;
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
    hash = (37 * hash) + ID_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getIdToken().hashCode();
    hash = (37 * hash) + OWNER_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDeveloperToken parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformDeveloperToken prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformDeveloperToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformDeveloperToken)
      POGOProtos.Rpc.PlatformDeveloperTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDeveloperToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDeveloperToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformDeveloperToken.class, POGOProtos.Rpc.PlatformDeveloperToken.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformDeveloperToken.newBuilder()
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
      idToken_ = "";

      ownerEmail_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDeveloperToken_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDeveloperToken getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformDeveloperToken.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDeveloperToken build() {
      POGOProtos.Rpc.PlatformDeveloperToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDeveloperToken buildPartial() {
      POGOProtos.Rpc.PlatformDeveloperToken result = new POGOProtos.Rpc.PlatformDeveloperToken(this);
      result.idToken_ = idToken_;
      result.ownerEmail_ = ownerEmail_;
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
      if (other instanceof POGOProtos.Rpc.PlatformDeveloperToken) {
        return mergeFrom((POGOProtos.Rpc.PlatformDeveloperToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformDeveloperToken other) {
      if (other == POGOProtos.Rpc.PlatformDeveloperToken.getDefaultInstance()) return this;
      if (!other.getIdToken().isEmpty()) {
        idToken_ = other.idToken_;
        onChanged();
      }
      if (!other.getOwnerEmail().isEmpty()) {
        ownerEmail_ = other.ownerEmail_;
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
      POGOProtos.Rpc.PlatformDeveloperToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformDeveloperToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object idToken_ = "";
    /**
     * <code>string id_token = 1;</code>
     * @return The idToken.
     */
    public java.lang.String getIdToken() {
      java.lang.Object ref = idToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id_token = 1;</code>
     * @return The bytes for idToken.
     */
    public com.google.protobuf.ByteString
        getIdTokenBytes() {
      java.lang.Object ref = idToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id_token = 1;</code>
     * @param value The idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdToken() {
      
      idToken_ = getDefaultInstance().getIdToken();
      onChanged();
      return this;
    }
    /**
     * <code>string id_token = 1;</code>
     * @param value The bytes for idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ownerEmail_ = "";
    /**
     * <code>string owner_email = 2;</code>
     * @return The ownerEmail.
     */
    public java.lang.String getOwnerEmail() {
      java.lang.Object ref = ownerEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner_email = 2;</code>
     * @return The bytes for ownerEmail.
     */
    public com.google.protobuf.ByteString
        getOwnerEmailBytes() {
      java.lang.Object ref = ownerEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner_email = 2;</code>
     * @param value The ownerEmail to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ownerEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string owner_email = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerEmail() {
      
      ownerEmail_ = getDefaultInstance().getOwnerEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string owner_email = 2;</code>
     * @param value The bytes for ownerEmail to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ownerEmail_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformDeveloperToken)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformDeveloperToken)
  private static final POGOProtos.Rpc.PlatformDeveloperToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformDeveloperToken();
  }

  public static POGOProtos.Rpc.PlatformDeveloperToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformDeveloperToken>
      PARSER = new com.google.protobuf.AbstractParser<PlatformDeveloperToken>() {
    @java.lang.Override
    public PlatformDeveloperToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformDeveloperToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformDeveloperToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformDeveloperToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformDeveloperToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

