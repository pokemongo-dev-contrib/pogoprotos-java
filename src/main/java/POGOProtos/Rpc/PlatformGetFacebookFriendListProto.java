// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.GetFacebookFriendListProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PlatformGetFacebookFriendListProto}
 */
public  final class PlatformGetFacebookFriendListProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformGetFacebookFriendListProto)
    PlatformGetFacebookFriendListProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformGetFacebookFriendListProto.newBuilder() to construct.
  private PlatformGetFacebookFriendListProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformGetFacebookFriendListProto() {
    fbAccessToken_ = "";
    cursor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformGetFacebookFriendListProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformGetFacebookFriendListProto(
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

            fbAccessToken_ = s;
            break;
          }
          case 16: {

            limit_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cursor_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformGetFacebookFriendListProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformGetFacebookFriendListProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformGetFacebookFriendListProto.class, POGOProtos.Rpc.PlatformGetFacebookFriendListProto.Builder.class);
  }

  public static final int FB_ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object fbAccessToken_;
  /**
   * <code>string fb_access_token = 1;</code>
   * @return The fbAccessToken.
   */
  public java.lang.String getFbAccessToken() {
    java.lang.Object ref = fbAccessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fbAccessToken_ = s;
      return s;
    }
  }
  /**
   * <code>string fb_access_token = 1;</code>
   * @return The bytes for fbAccessToken.
   */
  public com.google.protobuf.ByteString
      getFbAccessTokenBytes() {
    java.lang.Object ref = fbAccessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fbAccessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_;
  /**
   * <code>int32 limit = 2;</code>
   * @return The limit.
   */
  public int getLimit() {
    return limit_;
  }

  public static final int CURSOR_FIELD_NUMBER = 3;
  private volatile java.lang.Object cursor_;
  /**
   * <code>string cursor = 3;</code>
   * @return The cursor.
   */
  public java.lang.String getCursor() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cursor_ = s;
      return s;
    }
  }
  /**
   * <code>string cursor = 3;</code>
   * @return The bytes for cursor.
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cursor_ = b;
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
    if (!getFbAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fbAccessToken_);
    }
    if (limit_ != 0) {
      output.writeInt32(2, limit_);
    }
    if (!getCursorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cursor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFbAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fbAccessToken_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, limit_);
    }
    if (!getCursorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cursor_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformGetFacebookFriendListProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformGetFacebookFriendListProto other = (POGOProtos.Rpc.PlatformGetFacebookFriendListProto) obj;

    if (!getFbAccessToken()
        .equals(other.getFbAccessToken())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (!getCursor()
        .equals(other.getCursor())) return false;
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
    hash = (37 * hash) + FB_ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getFbAccessToken().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformGetFacebookFriendListProto prototype) {
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
   * ref: Niantic.Platform.Protos.GetFacebookFriendListProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PlatformGetFacebookFriendListProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformGetFacebookFriendListProto)
      POGOProtos.Rpc.PlatformGetFacebookFriendListProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformGetFacebookFriendListProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformGetFacebookFriendListProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformGetFacebookFriendListProto.class, POGOProtos.Rpc.PlatformGetFacebookFriendListProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformGetFacebookFriendListProto.newBuilder()
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
      fbAccessToken_ = "";

      limit_ = 0;

      cursor_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformGetFacebookFriendListProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetFacebookFriendListProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformGetFacebookFriendListProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetFacebookFriendListProto build() {
      POGOProtos.Rpc.PlatformGetFacebookFriendListProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetFacebookFriendListProto buildPartial() {
      POGOProtos.Rpc.PlatformGetFacebookFriendListProto result = new POGOProtos.Rpc.PlatformGetFacebookFriendListProto(this);
      result.fbAccessToken_ = fbAccessToken_;
      result.limit_ = limit_;
      result.cursor_ = cursor_;
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
      if (other instanceof POGOProtos.Rpc.PlatformGetFacebookFriendListProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformGetFacebookFriendListProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformGetFacebookFriendListProto other) {
      if (other == POGOProtos.Rpc.PlatformGetFacebookFriendListProto.getDefaultInstance()) return this;
      if (!other.getFbAccessToken().isEmpty()) {
        fbAccessToken_ = other.fbAccessToken_;
        onChanged();
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (!other.getCursor().isEmpty()) {
        cursor_ = other.cursor_;
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
      POGOProtos.Rpc.PlatformGetFacebookFriendListProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformGetFacebookFriendListProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fbAccessToken_ = "";
    /**
     * <code>string fb_access_token = 1;</code>
     * @return The fbAccessToken.
     */
    public java.lang.String getFbAccessToken() {
      java.lang.Object ref = fbAccessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fbAccessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @return The bytes for fbAccessToken.
     */
    public com.google.protobuf.ByteString
        getFbAccessTokenBytes() {
      java.lang.Object ref = fbAccessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fbAccessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @param value The fbAccessToken to set.
     * @return This builder for chaining.
     */
    public Builder setFbAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fbAccessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbAccessToken() {
      
      fbAccessToken_ = getDefaultInstance().getFbAccessToken();
      onChanged();
      return this;
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @param value The bytes for fbAccessToken to set.
     * @return This builder for chaining.
     */
    public Builder setFbAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fbAccessToken_ = value;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <code>int32 limit = 2;</code>
     * @return The limit.
     */
    public int getLimit() {
      return limit_;
    }
    /**
     * <code>int32 limit = 2;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cursor_ = "";
    /**
     * <code>string cursor = 3;</code>
     * @return The cursor.
     */
    public java.lang.String getCursor() {
      java.lang.Object ref = cursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cursor = 3;</code>
     * @return The bytes for cursor.
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      java.lang.Object ref = cursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cursor = 3;</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cursor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      
      cursor_ = getDefaultInstance().getCursor();
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 3;</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cursor_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformGetFacebookFriendListProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformGetFacebookFriendListProto)
  private static final POGOProtos.Rpc.PlatformGetFacebookFriendListProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformGetFacebookFriendListProto();
  }

  public static POGOProtos.Rpc.PlatformGetFacebookFriendListProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformGetFacebookFriendListProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformGetFacebookFriendListProto>() {
    @java.lang.Override
    public PlatformGetFacebookFriendListProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformGetFacebookFriendListProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformGetFacebookFriendListProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformGetFacebookFriendListProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformGetFacebookFriendListProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

