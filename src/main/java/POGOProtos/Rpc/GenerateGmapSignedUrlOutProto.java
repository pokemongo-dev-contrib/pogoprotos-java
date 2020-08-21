// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.GenerateGmapSignedUrlOutProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GenerateGmapSignedUrlOutProto}
 */
public final class GenerateGmapSignedUrlOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)
    GenerateGmapSignedUrlOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateGmapSignedUrlOutProto.newBuilder() to construct.
  private GenerateGmapSignedUrlOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateGmapSignedUrlOutProto() {
    result_ = 0;
    signedUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateGmapSignedUrlOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenerateGmapSignedUrlOutProto(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            signedUrl_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GenerateGmapSignedUrlOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GenerateGmapSignedUrlOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.class, POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Niantic.Platform.Protos.GenerateGmapSignedUrlOutProto/Types/Result
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result}
   */
  public enum Result
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
     * <code>ERROR_PLAYER_NOT_VALID = 2;</code>
     */
    ERROR_PLAYER_NOT_VALID(2),
    /**
     * <code>ERROR_RATE_LIMITED = 3;</code>
     */
    ERROR_RATE_LIMITED(3),
    /**
     * <code>ERROR_MISSING_INPUT = 4;</code>
     */
    ERROR_MISSING_INPUT(4),
    /**
     * <code>ERROR_UNKNOWN = 5;</code>
     */
    ERROR_UNKNOWN(5),
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
     * <code>ERROR_PLAYER_NOT_VALID = 2;</code>
     */
    public static final int ERROR_PLAYER_NOT_VALID_VALUE = 2;
    /**
     * <code>ERROR_RATE_LIMITED = 3;</code>
     */
    public static final int ERROR_RATE_LIMITED_VALUE = 3;
    /**
     * <code>ERROR_MISSING_INPUT = 4;</code>
     */
    public static final int ERROR_MISSING_INPUT_VALUE = 4;
    /**
     * <code>ERROR_UNKNOWN = 5;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 5;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_PLAYER_NOT_VALID;
        case 3: return ERROR_RATE_LIMITED;
        case 4: return ERROR_MISSING_INPUT;
        case 5: return ERROR_UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int SIGNED_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object signedUrl_;
  /**
   * <code>string signed_url = 2;</code>
   * @return The signedUrl.
   */
  @java.lang.Override
  public java.lang.String getSignedUrl() {
    java.lang.Object ref = signedUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signedUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string signed_url = 2;</code>
   * @return The bytes for signedUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignedUrlBytes() {
    java.lang.Object ref = signedUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signedUrl_ = b;
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
    if (result_ != POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (!getSignedUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signedUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (!getSignedUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signedUrl_);
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
    if (!(obj instanceof POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GenerateGmapSignedUrlOutProto other = (POGOProtos.Rpc.GenerateGmapSignedUrlOutProto) obj;

    if (result_ != other.result_) return false;
    if (!getSignedUrl()
        .equals(other.getSignedUrl())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (37 * hash) + SIGNED_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSignedUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GenerateGmapSignedUrlOutProto prototype) {
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
   * ref: Niantic.Platform.Protos.GenerateGmapSignedUrlOutProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GenerateGmapSignedUrlOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)
      POGOProtos.Rpc.GenerateGmapSignedUrlOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GenerateGmapSignedUrlOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GenerateGmapSignedUrlOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.class, POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.newBuilder()
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
      result_ = 0;

      signedUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GenerateGmapSignedUrlOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto build() {
      POGOProtos.Rpc.GenerateGmapSignedUrlOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto buildPartial() {
      POGOProtos.Rpc.GenerateGmapSignedUrlOutProto result = new POGOProtos.Rpc.GenerateGmapSignedUrlOutProto(this);
      result.result_ = result_;
      result.signedUrl_ = signedUrl_;
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
      if (other instanceof POGOProtos.Rpc.GenerateGmapSignedUrlOutProto) {
        return mergeFrom((POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GenerateGmapSignedUrlOutProto other) {
      if (other == POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (!other.getSignedUrl().isEmpty()) {
        signedUrl_ = other.signedUrl_;
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
      POGOProtos.Rpc.GenerateGmapSignedUrlOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GenerateGmapSignedUrlOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GenerateGmapSignedUrlOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object signedUrl_ = "";
    /**
     * <code>string signed_url = 2;</code>
     * @return The signedUrl.
     */
    public java.lang.String getSignedUrl() {
      java.lang.Object ref = signedUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signedUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signed_url = 2;</code>
     * @return The bytes for signedUrl.
     */
    public com.google.protobuf.ByteString
        getSignedUrlBytes() {
      java.lang.Object ref = signedUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signedUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signed_url = 2;</code>
     * @param value The signedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signedUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string signed_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignedUrl() {
      
      signedUrl_ = getDefaultInstance().getSignedUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string signed_url = 2;</code>
     * @param value The bytes for signedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signedUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GenerateGmapSignedUrlOutProto)
  private static final POGOProtos.Rpc.GenerateGmapSignedUrlOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GenerateGmapSignedUrlOutProto();
  }

  public static POGOProtos.Rpc.GenerateGmapSignedUrlOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateGmapSignedUrlOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GenerateGmapSignedUrlOutProto>() {
    @java.lang.Override
    public GenerateGmapSignedUrlOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenerateGmapSignedUrlOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenerateGmapSignedUrlOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateGmapSignedUrlOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GenerateGmapSignedUrlOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

