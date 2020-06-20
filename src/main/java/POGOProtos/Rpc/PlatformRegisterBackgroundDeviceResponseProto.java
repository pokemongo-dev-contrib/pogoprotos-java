// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Com.Nianticproject.Platform.Auth.RegisterBackgroundDeviceResponseProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto}
 */
public  final class PlatformRegisterBackgroundDeviceResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)
    PlatformRegisterBackgroundDeviceResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformRegisterBackgroundDeviceResponseProto.newBuilder() to construct.
  private PlatformRegisterBackgroundDeviceResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformRegisterBackgroundDeviceResponseProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformRegisterBackgroundDeviceResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformRegisterBackgroundDeviceResponseProto(
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
            POGOProtos.Rpc.PlatformBackgroundToken.Builder subBuilder = null;
            if (token_ != null) {
              subBuilder = token_.toBuilder();
            }
            token_ = input.readMessage(POGOProtos.Rpc.PlatformBackgroundToken.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(token_);
              token_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformRegisterBackgroundDeviceResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformRegisterBackgroundDeviceResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.class, POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Com.Nianticproject.Platform.Auth.RegisterBackgroundDeviceResponseProto/Types/Status
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    STATUS_UNSET(0),
    /**
     * <code>STATUS_SUCCESS = 1;</code>
     */
    STATUS_SUCCESS(1),
    /**
     * <code>STATUS_ERROR = 2;</code>
     */
    STATUS_ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    public static final int STATUS_UNSET_VALUE = 0;
    /**
     * <code>STATUS_SUCCESS = 1;</code>
     */
    public static final int STATUS_SUCCESS_VALUE = 1;
    /**
     * <code>STATUS_ERROR = 2;</code>
     */
    public static final int STATUS_ERROR_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSET;
        case 1: return STATUS_SUCCESS;
        case 2: return STATUS_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.Status)
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PlatformBackgroundToken token_;
  /**
   * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
   * @return Whether the token field is set.
   */
  public boolean hasToken() {
    return token_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
   * @return The token.
   */
  public POGOProtos.Rpc.PlatformBackgroundToken getToken() {
    return token_ == null ? POGOProtos.Rpc.PlatformBackgroundToken.getDefaultInstance() : token_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
   */
  public POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder getTokenOrBuilder() {
    return getToken();
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
    if (token_ != null) {
      output.writeMessage(1, getToken());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (token_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getToken());
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto other = (POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto) obj;

    if (hasToken() != other.hasToken()) return false;
    if (hasToken()) {
      if (!getToken()
          .equals(other.getToken())) return false;
    }
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
    if (hasToken()) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto prototype) {
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
   * ref: Com.Nianticproject.Platform.Auth.RegisterBackgroundDeviceResponseProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)
      POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformRegisterBackgroundDeviceResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformRegisterBackgroundDeviceResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.class, POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.newBuilder()
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
      if (tokenBuilder_ == null) {
        token_ = null;
      } else {
        token_ = null;
        tokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformRegisterBackgroundDeviceResponseProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto build() {
      POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto buildPartial() {
      POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto result = new POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto(this);
      if (tokenBuilder_ == null) {
        result.token_ = token_;
      } else {
        result.token_ = tokenBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto other) {
      if (other == POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto.getDefaultInstance()) return this;
      if (other.hasToken()) {
        mergeToken(other.getToken());
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
      POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PlatformBackgroundToken token_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformBackgroundToken, POGOProtos.Rpc.PlatformBackgroundToken.Builder, POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder> tokenBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     * @return Whether the token field is set.
     */
    public boolean hasToken() {
      return tokenBuilder_ != null || token_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     * @return The token.
     */
    public POGOProtos.Rpc.PlatformBackgroundToken getToken() {
      if (tokenBuilder_ == null) {
        return token_ == null ? POGOProtos.Rpc.PlatformBackgroundToken.getDefaultInstance() : token_;
      } else {
        return tokenBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public Builder setToken(POGOProtos.Rpc.PlatformBackgroundToken value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token_ = value;
        onChanged();
      } else {
        tokenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public Builder setToken(
        POGOProtos.Rpc.PlatformBackgroundToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        token_ = builderForValue.build();
        onChanged();
      } else {
        tokenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public Builder mergeToken(POGOProtos.Rpc.PlatformBackgroundToken value) {
      if (tokenBuilder_ == null) {
        if (token_ != null) {
          token_ =
            POGOProtos.Rpc.PlatformBackgroundToken.newBuilder(token_).mergeFrom(value).buildPartial();
        } else {
          token_ = value;
        }
        onChanged();
      } else {
        tokenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public Builder clearToken() {
      if (tokenBuilder_ == null) {
        token_ = null;
        onChanged();
      } else {
        token_ = null;
        tokenBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public POGOProtos.Rpc.PlatformBackgroundToken.Builder getTokenBuilder() {
      
      onChanged();
      return getTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    public POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder getTokenOrBuilder() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilder();
      } else {
        return token_ == null ?
            POGOProtos.Rpc.PlatformBackgroundToken.getDefaultInstance() : token_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformBackgroundToken token = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformBackgroundToken, POGOProtos.Rpc.PlatformBackgroundToken.Builder, POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformBackgroundToken, POGOProtos.Rpc.PlatformBackgroundToken.Builder, POGOProtos.Rpc.PlatformBackgroundTokenOrBuilder>(
                getToken(),
                getParentForChildren(),
                isClean());
        token_ = null;
      }
      return tokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto)
  private static final POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto();
  }

  public static POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformRegisterBackgroundDeviceResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformRegisterBackgroundDeviceResponseProto>() {
    @java.lang.Override
    public PlatformRegisterBackgroundDeviceResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformRegisterBackgroundDeviceResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformRegisterBackgroundDeviceResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformRegisterBackgroundDeviceResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformRegisterBackgroundDeviceResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

