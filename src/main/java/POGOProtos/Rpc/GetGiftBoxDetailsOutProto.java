// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetGiftBoxDetailsOutProto}
 */
public final class GetGiftBoxDetailsOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetGiftBoxDetailsOutProto)
    GetGiftBoxDetailsOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGiftBoxDetailsOutProto.newBuilder() to construct.
  private GetGiftBoxDetailsOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGiftBoxDetailsOutProto() {
    result_ = 0;
    giftBoxes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGiftBoxDetailsOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGiftBoxDetailsOutProto(
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
              giftBoxes_ = new java.util.ArrayList<POGOProtos.Rpc.GiftBoxDetailsProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            giftBoxes_.add(
                input.readMessage(POGOProtos.Rpc.GiftBoxDetailsProto.parser(), extensionRegistry));
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
        giftBoxes_ = java.util.Collections.unmodifiableList(giftBoxes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGiftBoxDetailsOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGiftBoxDetailsOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetGiftBoxDetailsOutProto.class, POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result}
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_GIFT_DOES_NOT_EXIST = 3;</code>
     */
    ERROR_GIFT_DOES_NOT_EXIST(3),
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    ERROR_INVALID_PLAYER_ID(4),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 5;</code>
     */
    ERROR_FRIEND_NOT_FOUND(5),
    /**
     * <code>ERROR_FORT_SEARCH = 6;</code>
     */
    ERROR_FORT_SEARCH(6),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_GIFT_DOES_NOT_EXIST = 3;</code>
     */
    public static final int ERROR_GIFT_DOES_NOT_EXIST_VALUE = 3;
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    public static final int ERROR_INVALID_PLAYER_ID_VALUE = 4;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 5;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 5;
    /**
     * <code>ERROR_FORT_SEARCH = 6;</code>
     */
    public static final int ERROR_FORT_SEARCH_VALUE = 6;


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
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_GIFT_DOES_NOT_EXIST;
        case 4: return ERROR_INVALID_PLAYER_ID;
        case 5: return ERROR_FRIEND_NOT_FOUND;
        case 6: return ERROR_FORT_SEARCH;
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
      return POGOProtos.Rpc.GetGiftBoxDetailsOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int GIFT_BOXES_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto> giftBoxes_;
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto> getGiftBoxesList() {
    return giftBoxes_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder> 
      getGiftBoxesOrBuilderList() {
    return giftBoxes_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
   */
  @java.lang.Override
  public int getGiftBoxesCount() {
    return giftBoxes_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GiftBoxDetailsProto getGiftBoxes(int index) {
    return giftBoxes_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder getGiftBoxesOrBuilder(
      int index) {
    return giftBoxes_.get(index);
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
    if (result_ != POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    for (int i = 0; i < giftBoxes_.size(); i++) {
      output.writeMessage(2, giftBoxes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    for (int i = 0; i < giftBoxes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, giftBoxes_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GetGiftBoxDetailsOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetGiftBoxDetailsOutProto other = (POGOProtos.Rpc.GetGiftBoxDetailsOutProto) obj;

    if (result_ != other.result_) return false;
    if (!getGiftBoxesList()
        .equals(other.getGiftBoxesList())) return false;
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
    if (getGiftBoxesCount() > 0) {
      hash = (37 * hash) + GIFT_BOXES_FIELD_NUMBER;
      hash = (53 * hash) + getGiftBoxesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetGiftBoxDetailsOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetGiftBoxDetailsOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetGiftBoxDetailsOutProto)
      POGOProtos.Rpc.GetGiftBoxDetailsOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGiftBoxDetailsOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGiftBoxDetailsOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetGiftBoxDetailsOutProto.class, POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetGiftBoxDetailsOutProto.newBuilder()
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
        getGiftBoxesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (giftBoxesBuilder_ == null) {
        giftBoxes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        giftBoxesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGiftBoxDetailsOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGiftBoxDetailsOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetGiftBoxDetailsOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGiftBoxDetailsOutProto build() {
      POGOProtos.Rpc.GetGiftBoxDetailsOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGiftBoxDetailsOutProto buildPartial() {
      POGOProtos.Rpc.GetGiftBoxDetailsOutProto result = new POGOProtos.Rpc.GetGiftBoxDetailsOutProto(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (giftBoxesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          giftBoxes_ = java.util.Collections.unmodifiableList(giftBoxes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.giftBoxes_ = giftBoxes_;
      } else {
        result.giftBoxes_ = giftBoxesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GetGiftBoxDetailsOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetGiftBoxDetailsOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetGiftBoxDetailsOutProto other) {
      if (other == POGOProtos.Rpc.GetGiftBoxDetailsOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (giftBoxesBuilder_ == null) {
        if (!other.giftBoxes_.isEmpty()) {
          if (giftBoxes_.isEmpty()) {
            giftBoxes_ = other.giftBoxes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGiftBoxesIsMutable();
            giftBoxes_.addAll(other.giftBoxes_);
          }
          onChanged();
        }
      } else {
        if (!other.giftBoxes_.isEmpty()) {
          if (giftBoxesBuilder_.isEmpty()) {
            giftBoxesBuilder_.dispose();
            giftBoxesBuilder_ = null;
            giftBoxes_ = other.giftBoxes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            giftBoxesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGiftBoxesFieldBuilder() : null;
          } else {
            giftBoxesBuilder_.addAllMessages(other.giftBoxes_);
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
      POGOProtos.Rpc.GetGiftBoxDetailsOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetGiftBoxDetailsOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGiftBoxDetailsOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto> giftBoxes_ =
      java.util.Collections.emptyList();
    private void ensureGiftBoxesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        giftBoxes_ = new java.util.ArrayList<POGOProtos.Rpc.GiftBoxDetailsProto>(giftBoxes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GiftBoxDetailsProto, POGOProtos.Rpc.GiftBoxDetailsProto.Builder, POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder> giftBoxesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto> getGiftBoxesList() {
      if (giftBoxesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(giftBoxes_);
      } else {
        return giftBoxesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public int getGiftBoxesCount() {
      if (giftBoxesBuilder_ == null) {
        return giftBoxes_.size();
      } else {
        return giftBoxesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public POGOProtos.Rpc.GiftBoxDetailsProto getGiftBoxes(int index) {
      if (giftBoxesBuilder_ == null) {
        return giftBoxes_.get(index);
      } else {
        return giftBoxesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder setGiftBoxes(
        int index, POGOProtos.Rpc.GiftBoxDetailsProto value) {
      if (giftBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftBoxesIsMutable();
        giftBoxes_.set(index, value);
        onChanged();
      } else {
        giftBoxesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder setGiftBoxes(
        int index, POGOProtos.Rpc.GiftBoxDetailsProto.Builder builderForValue) {
      if (giftBoxesBuilder_ == null) {
        ensureGiftBoxesIsMutable();
        giftBoxes_.set(index, builderForValue.build());
        onChanged();
      } else {
        giftBoxesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder addGiftBoxes(POGOProtos.Rpc.GiftBoxDetailsProto value) {
      if (giftBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftBoxesIsMutable();
        giftBoxes_.add(value);
        onChanged();
      } else {
        giftBoxesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder addGiftBoxes(
        int index, POGOProtos.Rpc.GiftBoxDetailsProto value) {
      if (giftBoxesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftBoxesIsMutable();
        giftBoxes_.add(index, value);
        onChanged();
      } else {
        giftBoxesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder addGiftBoxes(
        POGOProtos.Rpc.GiftBoxDetailsProto.Builder builderForValue) {
      if (giftBoxesBuilder_ == null) {
        ensureGiftBoxesIsMutable();
        giftBoxes_.add(builderForValue.build());
        onChanged();
      } else {
        giftBoxesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder addGiftBoxes(
        int index, POGOProtos.Rpc.GiftBoxDetailsProto.Builder builderForValue) {
      if (giftBoxesBuilder_ == null) {
        ensureGiftBoxesIsMutable();
        giftBoxes_.add(index, builderForValue.build());
        onChanged();
      } else {
        giftBoxesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder addAllGiftBoxes(
        java.lang.Iterable<? extends POGOProtos.Rpc.GiftBoxDetailsProto> values) {
      if (giftBoxesBuilder_ == null) {
        ensureGiftBoxesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, giftBoxes_);
        onChanged();
      } else {
        giftBoxesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder clearGiftBoxes() {
      if (giftBoxesBuilder_ == null) {
        giftBoxes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        giftBoxesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public Builder removeGiftBoxes(int index) {
      if (giftBoxesBuilder_ == null) {
        ensureGiftBoxesIsMutable();
        giftBoxes_.remove(index);
        onChanged();
      } else {
        giftBoxesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public POGOProtos.Rpc.GiftBoxDetailsProto.Builder getGiftBoxesBuilder(
        int index) {
      return getGiftBoxesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder getGiftBoxesOrBuilder(
        int index) {
      if (giftBoxesBuilder_ == null) {
        return giftBoxes_.get(index);  } else {
        return giftBoxesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder> 
         getGiftBoxesOrBuilderList() {
      if (giftBoxesBuilder_ != null) {
        return giftBoxesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(giftBoxes_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public POGOProtos.Rpc.GiftBoxDetailsProto.Builder addGiftBoxesBuilder() {
      return getGiftBoxesFieldBuilder().addBuilder(
          POGOProtos.Rpc.GiftBoxDetailsProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public POGOProtos.Rpc.GiftBoxDetailsProto.Builder addGiftBoxesBuilder(
        int index) {
      return getGiftBoxesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.GiftBoxDetailsProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto gift_boxes = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto.Builder> 
         getGiftBoxesBuilderList() {
      return getGiftBoxesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GiftBoxDetailsProto, POGOProtos.Rpc.GiftBoxDetailsProto.Builder, POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder> 
        getGiftBoxesFieldBuilder() {
      if (giftBoxesBuilder_ == null) {
        giftBoxesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.GiftBoxDetailsProto, POGOProtos.Rpc.GiftBoxDetailsProto.Builder, POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder>(
                giftBoxes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        giftBoxes_ = null;
      }
      return giftBoxesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetGiftBoxDetailsOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetGiftBoxDetailsOutProto)
  private static final POGOProtos.Rpc.GetGiftBoxDetailsOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetGiftBoxDetailsOutProto();
  }

  public static POGOProtos.Rpc.GetGiftBoxDetailsOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGiftBoxDetailsOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetGiftBoxDetailsOutProto>() {
    @java.lang.Override
    public GetGiftBoxDetailsOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGiftBoxDetailsOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGiftBoxDetailsOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGiftBoxDetailsOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetGiftBoxDetailsOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

