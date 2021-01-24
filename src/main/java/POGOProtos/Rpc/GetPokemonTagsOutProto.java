// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetPokemonTagsOutProto}
 */
public final class GetPokemonTagsOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetPokemonTagsOutProto)
    GetPokemonTagsOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPokemonTagsOutProto.newBuilder() to construct.
  private GetPokemonTagsOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPokemonTagsOutProto() {
    result_ = 0;
    tag_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPokemonTagsOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPokemonTagsOutProto(
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
          case 8: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tag_ = new java.util.ArrayList<POGOProtos.Rpc.PokemonTagProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            tag_.add(
                input.readMessage(POGOProtos.Rpc.PokemonTagProto.parser(), extensionRegistry));
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
        tag_ = java.util.Collections.unmodifiableList(tag_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPokemonTagsOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPokemonTagsOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetPokemonTagsOutProto.class, POGOProtos.Rpc.GetPokemonTagsOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetPokemonTagsOutProto.Result}
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
      return POGOProtos.Rpc.GetPokemonTagsOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetPokemonTagsOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GetPokemonTagsOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = POGOProtos.Rpc.GetPokemonTagsOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GetPokemonTagsOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int TAG_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.PokemonTagProto> tag_;
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PokemonTagProto> getTagList() {
    return tag_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PokemonTagProtoOrBuilder> 
      getTagOrBuilderList() {
    return tag_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  @java.lang.Override
  public int getTagCount() {
    return tag_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTagProto getTag(int index) {
    return tag_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTagProtoOrBuilder getTagOrBuilder(
      int index) {
    return tag_.get(index);
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
    if (result_ != POGOProtos.Rpc.GetPokemonTagsOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    for (int i = 0; i < tag_.size(); i++) {
      output.writeMessage(2, tag_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GetPokemonTagsOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    for (int i = 0; i < tag_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, tag_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GetPokemonTagsOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetPokemonTagsOutProto other = (POGOProtos.Rpc.GetPokemonTagsOutProto) obj;

    if (result_ != other.result_) return false;
    if (!getTagList()
        .equals(other.getTagList())) return false;
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
    if (getTagCount() > 0) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTagList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPokemonTagsOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetPokemonTagsOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetPokemonTagsOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetPokemonTagsOutProto)
      POGOProtos.Rpc.GetPokemonTagsOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPokemonTagsOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPokemonTagsOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetPokemonTagsOutProto.class, POGOProtos.Rpc.GetPokemonTagsOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetPokemonTagsOutProto.newBuilder()
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
        getTagFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (tagBuilder_ == null) {
        tag_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tagBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPokemonTagsOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPokemonTagsOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetPokemonTagsOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPokemonTagsOutProto build() {
      POGOProtos.Rpc.GetPokemonTagsOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPokemonTagsOutProto buildPartial() {
      POGOProtos.Rpc.GetPokemonTagsOutProto result = new POGOProtos.Rpc.GetPokemonTagsOutProto(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (tagBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tag_ = java.util.Collections.unmodifiableList(tag_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tag_ = tag_;
      } else {
        result.tag_ = tagBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GetPokemonTagsOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetPokemonTagsOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetPokemonTagsOutProto other) {
      if (other == POGOProtos.Rpc.GetPokemonTagsOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (tagBuilder_ == null) {
        if (!other.tag_.isEmpty()) {
          if (tag_.isEmpty()) {
            tag_ = other.tag_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagIsMutable();
            tag_.addAll(other.tag_);
          }
          onChanged();
        }
      } else {
        if (!other.tag_.isEmpty()) {
          if (tagBuilder_.isEmpty()) {
            tagBuilder_.dispose();
            tagBuilder_ = null;
            tag_ = other.tag_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tagBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTagFieldBuilder() : null;
          } else {
            tagBuilder_.addAllMessages(other.tag_);
          }
        }
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
      POGOProtos.Rpc.GetPokemonTagsOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetPokemonTagsOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetPokemonTagsOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = POGOProtos.Rpc.GetPokemonTagsOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GetPokemonTagsOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GetPokemonTagsOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.PokemonTagProto> tag_ =
      java.util.Collections.emptyList();
    private void ensureTagIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tag_ = new java.util.ArrayList<POGOProtos.Rpc.PokemonTagProto>(tag_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder> tagBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.PokemonTagProto> getTagList() {
      if (tagBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tag_);
      } else {
        return tagBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public int getTagCount() {
      if (tagBuilder_ == null) {
        return tag_.size();
      } else {
        return tagBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProto getTag(int index) {
      if (tagBuilder_ == null) {
        return tag_.get(index);
      } else {
        return tagBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder setTag(
        int index, POGOProtos.Rpc.PokemonTagProto value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagIsMutable();
        tag_.set(index, value);
        onChanged();
      } else {
        tagBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder setTag(
        int index, POGOProtos.Rpc.PokemonTagProto.Builder builderForValue) {
      if (tagBuilder_ == null) {
        ensureTagIsMutable();
        tag_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder addTag(POGOProtos.Rpc.PokemonTagProto value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagIsMutable();
        tag_.add(value);
        onChanged();
      } else {
        tagBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder addTag(
        int index, POGOProtos.Rpc.PokemonTagProto value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagIsMutable();
        tag_.add(index, value);
        onChanged();
      } else {
        tagBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder addTag(
        POGOProtos.Rpc.PokemonTagProto.Builder builderForValue) {
      if (tagBuilder_ == null) {
        ensureTagIsMutable();
        tag_.add(builderForValue.build());
        onChanged();
      } else {
        tagBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder addTag(
        int index, POGOProtos.Rpc.PokemonTagProto.Builder builderForValue) {
      if (tagBuilder_ == null) {
        ensureTagIsMutable();
        tag_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder addAllTag(
        java.lang.Iterable<? extends POGOProtos.Rpc.PokemonTagProto> values) {
      if (tagBuilder_ == null) {
        ensureTagIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tag_);
        onChanged();
      } else {
        tagBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder clearTag() {
      if (tagBuilder_ == null) {
        tag_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tagBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public Builder removeTag(int index) {
      if (tagBuilder_ == null) {
        ensureTagIsMutable();
        tag_.remove(index);
        onChanged();
      } else {
        tagBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProto.Builder getTagBuilder(
        int index) {
      return getTagFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProtoOrBuilder getTagOrBuilder(
        int index) {
      if (tagBuilder_ == null) {
        return tag_.get(index);  } else {
        return tagBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PokemonTagProtoOrBuilder> 
         getTagOrBuilderList() {
      if (tagBuilder_ != null) {
        return tagBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tag_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProto.Builder addTagBuilder() {
      return getTagFieldBuilder().addBuilder(
          POGOProtos.Rpc.PokemonTagProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTagProto.Builder addTagBuilder(
        int index) {
      return getTagFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PokemonTagProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.PokemonTagProto.Builder> 
         getTagBuilderList() {
      return getTagFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder> 
        getTagFieldBuilder() {
      if (tagBuilder_ == null) {
        tagBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PokemonTagProto, POGOProtos.Rpc.PokemonTagProto.Builder, POGOProtos.Rpc.PokemonTagProtoOrBuilder>(
                tag_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tag_ = null;
      }
      return tagBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetPokemonTagsOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetPokemonTagsOutProto)
  private static final POGOProtos.Rpc.GetPokemonTagsOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetPokemonTagsOutProto();
  }

  public static POGOProtos.Rpc.GetPokemonTagsOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPokemonTagsOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetPokemonTagsOutProto>() {
    @java.lang.Override
    public GetPokemonTagsOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPokemonTagsOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPokemonTagsOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPokemonTagsOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetPokemonTagsOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
