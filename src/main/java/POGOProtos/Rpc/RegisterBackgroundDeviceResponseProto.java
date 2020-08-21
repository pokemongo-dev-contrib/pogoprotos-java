// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Com.Nianticproject.Platform.Auth.RegisterBackgroundDeviceResponseProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto}
 */
public final class RegisterBackgroundDeviceResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)
    RegisterBackgroundDeviceResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterBackgroundDeviceResponseProto.newBuilder() to construct.
  private RegisterBackgroundDeviceResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterBackgroundDeviceResponseProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterBackgroundDeviceResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterBackgroundDeviceResponseProto(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.BackgroundToken.Builder subBuilder = null;
            if (token_ != null) {
              subBuilder = token_.toBuilder();
            }
            token_ = input.readMessage(POGOProtos.Rpc.BackgroundToken.parser(), extensionRegistry);
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.class, POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Com.Nianticproject.Platform.Auth.RegisterBackgroundDeviceResponseProto/Types/Status
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;


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
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR;
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
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status result = POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.UNRECOGNIZED : result;
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.BackgroundToken token_;
  /**
   * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
   * @return Whether the token field is set.
   */
  @java.lang.Override
  public boolean hasToken() {
    return token_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
   * @return The token.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BackgroundToken getToken() {
    return token_ == null ? POGOProtos.Rpc.BackgroundToken.getDefaultInstance() : token_;
  }
  /**
   * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BackgroundTokenOrBuilder getTokenOrBuilder() {
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
    if (status_ != POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (token_ != null) {
      output.writeMessage(2, getToken());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (token_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getToken());
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
    if (!(obj instanceof POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto other = (POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto) obj;

    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasToken()) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)
      POGOProtos.Rpc.RegisterBackgroundDeviceResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.class, POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.newBuilder()
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
      status_ = 0;

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
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceResponseProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto build() {
      POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto buildPartial() {
      POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto result = new POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto(this);
      result.status_ = status_;
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
      if (other instanceof POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto) {
        return mergeFrom((POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto other) {
      if (other == POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
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
      POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status result = POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BackgroundToken token_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BackgroundToken, POGOProtos.Rpc.BackgroundToken.Builder, POGOProtos.Rpc.BackgroundTokenOrBuilder> tokenBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     * @return Whether the token field is set.
     */
    public boolean hasToken() {
      return tokenBuilder_ != null || token_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     * @return The token.
     */
    public POGOProtos.Rpc.BackgroundToken getToken() {
      if (tokenBuilder_ == null) {
        return token_ == null ? POGOProtos.Rpc.BackgroundToken.getDefaultInstance() : token_;
      } else {
        return tokenBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    public Builder setToken(POGOProtos.Rpc.BackgroundToken value) {
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
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    public Builder setToken(
        POGOProtos.Rpc.BackgroundToken.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        token_ = builderForValue.build();
        onChanged();
      } else {
        tokenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    public Builder mergeToken(POGOProtos.Rpc.BackgroundToken value) {
      if (tokenBuilder_ == null) {
        if (token_ != null) {
          token_ =
            POGOProtos.Rpc.BackgroundToken.newBuilder(token_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
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
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    public POGOProtos.Rpc.BackgroundToken.Builder getTokenBuilder() {
      
      onChanged();
      return getTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    public POGOProtos.Rpc.BackgroundTokenOrBuilder getTokenOrBuilder() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilder();
      } else {
        return token_ == null ?
            POGOProtos.Rpc.BackgroundToken.getDefaultInstance() : token_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BackgroundToken token = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BackgroundToken, POGOProtos.Rpc.BackgroundToken.Builder, POGOProtos.Rpc.BackgroundTokenOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BackgroundToken, POGOProtos.Rpc.BackgroundToken.Builder, POGOProtos.Rpc.BackgroundTokenOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto)
  private static final POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto();
  }

  public static POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterBackgroundDeviceResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<RegisterBackgroundDeviceResponseProto>() {
    @java.lang.Override
    public RegisterBackgroundDeviceResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterBackgroundDeviceResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterBackgroundDeviceResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterBackgroundDeviceResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RegisterBackgroundDeviceResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

