// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CreatePokemonTagOutProto}
 */
public final class CreatePokemonTagOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CreatePokemonTagOutProto)
    CreatePokemonTagOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePokemonTagOutProto.newBuilder() to construct.
  private CreatePokemonTagOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePokemonTagOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePokemonTagOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreatePokemonTagOutProto(
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
            POGOProtos.Rpc.PokemonTagProto.Builder subBuilder = null;
            if (createdTag_ != null) {
              subBuilder = createdTag_.toBuilder();
            }
            createdTag_ = input.readMessage(POGOProtos.Rpc.PokemonTagProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createdTag_);
              createdTag_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CreatePokemonTagOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CreatePokemonTagOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CreatePokemonTagOutProto.class, POGOProtos.Rpc.CreatePokemonTagOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.CreatePokemonTagOutProto.Result}
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
     * <code>ERROR_PLAYER_LEVEL_TOO_LOW = 2;</code>
     */
    ERROR_PLAYER_LEVEL_TOO_LOW(2),
    /**
     * <code>TAG_ALREADY_EXISTS = 3;</code>
     */
    TAG_ALREADY_EXISTS(3),
    /**
     * <code>PLAYER_HAS_MAXIMUM_NUMBER_OF_TAGS = 4;</code>
     */
    PLAYER_HAS_MAXIMUM_NUMBER_OF_TAGS(4),
    /**
     * <code>TAG_NAME_CONTAINS_PROFANITY = 5;</code>
     */
    TAG_NAME_CONTAINS_PROFANITY(5),
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
     * <code>ERROR_PLAYER_LEVEL_TOO_LOW = 2;</code>
     */
    public static final int ERROR_PLAYER_LEVEL_TOO_LOW_VALUE = 2;
    /**
     * <code>TAG_ALREADY_EXISTS = 3;</code>
     */
    public static final int TAG_ALREADY_EXISTS_VALUE = 3;
    /**
     * <code>PLAYER_HAS_MAXIMUM_NUMBER_OF_TAGS = 4;</code>
     */
    public static final int PLAYER_HAS_MAXIMUM_NUMBER_OF_TAGS_VALUE = 4;
    /**
     * <code>TAG_NAME_CONTAINS_PROFANITY = 5;</code>
     */
    public static final int TAG_NAME_CONTAINS_PROFANITY_VALUE = 5;


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
        case 2: return ERROR_PLAYER_LEVEL_TOO_LOW;
        case 3: return TAG_ALREADY_EXISTS;
        case 4: return PLAYER_HAS_MAXIMUM_NUMBER_OF_TAGS;
        case 5: return TAG_NAME_CONTAINS_PROFANITY;
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
      return POGOProtos.Rpc.CreatePokemonTagOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CreatePokemonTagOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.CreatePokemonTagOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = POGOProtos.Rpc.CreatePokemonTagOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.CreatePokemonTagOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int CREATED_TAG_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonTagProto createdTag_;
  /**
   * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
   * @return Whether the createdTag field is set.
   */
  @java.lang.Override
  public boolean hasCreatedTag() {
    return createdTag_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
   * @return The createdTag.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTagProto getCreatedTag() {
    return createdTag_ == null ? POGOProtos.Rpc.PokemonTagProto.getDefaultInstance() : createdTag_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTagProtoOrBuilder getCreatedTagOrBuilder() {
    return getCreatedTag();
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
    if (result_ != POGOProtos.Rpc.CreatePokemonTagOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (createdTag_ != null) {
      output.writeMessage(2, getCreatedTag());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.CreatePokemonTagOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (createdTag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreatedTag());
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
    if (!(obj instanceof POGOProtos.Rpc.CreatePokemonTagOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CreatePokemonTagOutProto other = (POGOProtos.Rpc.CreatePokemonTagOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasCreatedTag() != other.hasCreatedTag()) return false;
    if (hasCreatedTag()) {
      if (!getCreatedTag()
          .equals(other.getCreatedTag())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasCreatedTag()) {
      hash = (37 * hash) + CREATED_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedTag().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CreatePokemonTagOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CreatePokemonTagOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CreatePokemonTagOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CreatePokemonTagOutProto)
      POGOProtos.Rpc.CreatePokemonTagOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CreatePokemonTagOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CreatePokemonTagOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CreatePokemonTagOutProto.class, POGOProtos.Rpc.CreatePokemonTagOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CreatePokemonTagOutProto.newBuilder()
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

      if (createdTagBuilder_ == null) {
        createdTag_ = null;
      } else {
        createdTag_ = null;
        createdTagBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CreatePokemonTagOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CreatePokemonTagOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CreatePokemonTagOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CreatePokemonTagOutProto build() {
      POGOProtos.Rpc.CreatePokemonTagOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CreatePokemonTagOutProto buildPartial() {
      POGOProtos.Rpc.CreatePokemonTagOutProto result = new POGOProtos.Rpc.CreatePokemonTagOutProto(this);
      result.result_ = result_;
      if (createdTagBuilder_ == null) {
        result.createdTag_ = createdTag_;
      } else {
        result.createdTag_ = createdTagBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CreatePokemonTagOutProto) {
        return mergeFrom((POGOProtos.Rpc.CreatePokemonTagOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CreatePokemonTagOutProto other) {
      if (other == POGOProtos.Rpc.CreatePokemonTagOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasCreatedTag()) {
        mergeCreatedTag(other.getCreatedTag());
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
      POGOProtos.Rpc.CreatePokemonTagOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CreatePokemonTagOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CreatePokemonTagOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = POGOProtos.Rpc.CreatePokemonTagOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.CreatePokemonTagOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.CreatePokemonTagOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CreatePokemonTagOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonTagProto createdTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder> createdTagBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     * @return Whether the createdTag field is set.
     */
    public boolean hasCreatedTag() {
      return createdTagBuilder_ != null || createdTag_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     * @return The createdTag.
     */
    public POGOProtos.Rpc.PokemonTagProto getCreatedTag() {
      if (createdTagBuilder_ == null) {
        return createdTag_ == null ? POGOProtos.Rpc.PokemonTagProto.getDefaultInstance() : createdTag_;
      } else {
        return createdTagBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public Builder setCreatedTag(POGOProtos.Rpc.PokemonTagProto value) {
      if (createdTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdTag_ = value;
        onChanged();
      } else {
        createdTagBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public Builder setCreatedTag(
        POGOProtos.Rpc.PokemonTagProto.Builder builderForValue) {
      if (createdTagBuilder_ == null) {
        createdTag_ = builderForValue.build();
        onChanged();
      } else {
        createdTagBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public Builder mergeCreatedTag(POGOProtos.Rpc.PokemonTagProto value) {
      if (createdTagBuilder_ == null) {
        if (createdTag_ != null) {
          createdTag_ =
            POGOProtos.Rpc.PokemonTagProto.newBuilder(createdTag_).mergeFrom(value).buildPartial();
        } else {
          createdTag_ = value;
        }
        onChanged();
      } else {
        createdTagBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public Builder clearCreatedTag() {
      if (createdTagBuilder_ == null) {
        createdTag_ = null;
        onChanged();
      } else {
        createdTag_ = null;
        createdTagBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProto.Builder getCreatedTagBuilder() {
      
      onChanged();
      return getCreatedTagFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProtoOrBuilder getCreatedTagOrBuilder() {
      if (createdTagBuilder_ != null) {
        return createdTagBuilder_.getMessageOrBuilder();
      } else {
        return createdTag_ == null ?
            POGOProtos.Rpc.PokemonTagProto.getDefaultInstance() : createdTag_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTagProto created_tag = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder> 
        getCreatedTagFieldBuilder() {
      if (createdTagBuilder_ == null) {
        createdTagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder>(
                getCreatedTag(),
                getParentForChildren(),
                isClean());
        createdTag_ = null;
      }
      return createdTagBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CreatePokemonTagOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CreatePokemonTagOutProto)
  private static final POGOProtos.Rpc.CreatePokemonTagOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CreatePokemonTagOutProto();
  }

  public static POGOProtos.Rpc.CreatePokemonTagOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePokemonTagOutProto>
      PARSER = new com.google.protobuf.AbstractParser<CreatePokemonTagOutProto>() {
    @java.lang.Override
    public CreatePokemonTagOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreatePokemonTagOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreatePokemonTagOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePokemonTagOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CreatePokemonTagOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

