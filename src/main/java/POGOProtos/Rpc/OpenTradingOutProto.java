// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OpenTradingOutProto}
 */
public final class OpenTradingOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OpenTradingOutProto)
    OpenTradingOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenTradingOutProto.newBuilder() to construct.
  private OpenTradingOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenTradingOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenTradingOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenTradingOutProto(
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
            POGOProtos.Rpc.TradingProto.Builder subBuilder = null;
            if (trading_ != null) {
              subBuilder = trading_.toBuilder();
            }
            trading_ = input.readMessage(POGOProtos.Rpc.TradingProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(trading_);
              trading_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenTradingOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenTradingOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OpenTradingOutProto.class, POGOProtos.Rpc.OpenTradingOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.OpenTradingOutProto.Result}
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
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    ERROR_FRIEND_NOT_FOUND(3),
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    ERROR_INVALID_PLAYER_ID(4),
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    ERROR_INVALID_STATE(5),
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    ERROR_STATE_HANDLER(6),
    /**
     * <code>ERROR_TRADING_EXPIRED = 7;</code>
     */
    ERROR_TRADING_EXPIRED(7),
    /**
     * <code>ERROR_TRADING_COOLDOWN = 8;</code>
     */
    ERROR_TRADING_COOLDOWN(8),
    /**
     * <code>ERROR_PLAYER_ALREADY_OPENED = 9;</code>
     */
    ERROR_PLAYER_ALREADY_OPENED(9),
    /**
     * <code>ERROR_FRIEND_OUT_OF_RANGE = 10;</code>
     */
    ERROR_FRIEND_OUT_OF_RANGE(10),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 11;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(11),
    /**
     * <code>ERROR_PLAYER_REACHED_DAILY_LIMIT = 12;</code>
     */
    ERROR_PLAYER_REACHED_DAILY_LIMIT(12),
    /**
     * <code>ERROR_FRIEND_REACHED_DAILY_LIMIT = 13;</code>
     */
    ERROR_FRIEND_REACHED_DAILY_LIMIT(13),
    /**
     * <code>ERROR_PLAYER_NOT_ENOUGH_STARDUST = 14;</code>
     */
    ERROR_PLAYER_NOT_ENOUGH_STARDUST(14),
    /**
     * <code>ERROR_FRIEND_NOT_ENOUGH_STARDUST = 15;</code>
     */
    ERROR_FRIEND_NOT_ENOUGH_STARDUST(15),
    /**
     * <code>ERROR_FRIEND_BELOW_MINIMUM_LEVEL = 16;</code>
     */
    ERROR_FRIEND_BELOW_MINIMUM_LEVEL(16),
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
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    public static final int ERROR_INVALID_PLAYER_ID_VALUE = 4;
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    public static final int ERROR_INVALID_STATE_VALUE = 5;
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    public static final int ERROR_STATE_HANDLER_VALUE = 6;
    /**
     * <code>ERROR_TRADING_EXPIRED = 7;</code>
     */
    public static final int ERROR_TRADING_EXPIRED_VALUE = 7;
    /**
     * <code>ERROR_TRADING_COOLDOWN = 8;</code>
     */
    public static final int ERROR_TRADING_COOLDOWN_VALUE = 8;
    /**
     * <code>ERROR_PLAYER_ALREADY_OPENED = 9;</code>
     */
    public static final int ERROR_PLAYER_ALREADY_OPENED_VALUE = 9;
    /**
     * <code>ERROR_FRIEND_OUT_OF_RANGE = 10;</code>
     */
    public static final int ERROR_FRIEND_OUT_OF_RANGE_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 11;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 11;
    /**
     * <code>ERROR_PLAYER_REACHED_DAILY_LIMIT = 12;</code>
     */
    public static final int ERROR_PLAYER_REACHED_DAILY_LIMIT_VALUE = 12;
    /**
     * <code>ERROR_FRIEND_REACHED_DAILY_LIMIT = 13;</code>
     */
    public static final int ERROR_FRIEND_REACHED_DAILY_LIMIT_VALUE = 13;
    /**
     * <code>ERROR_PLAYER_NOT_ENOUGH_STARDUST = 14;</code>
     */
    public static final int ERROR_PLAYER_NOT_ENOUGH_STARDUST_VALUE = 14;
    /**
     * <code>ERROR_FRIEND_NOT_ENOUGH_STARDUST = 15;</code>
     */
    public static final int ERROR_FRIEND_NOT_ENOUGH_STARDUST_VALUE = 15;
    /**
     * <code>ERROR_FRIEND_BELOW_MINIMUM_LEVEL = 16;</code>
     */
    public static final int ERROR_FRIEND_BELOW_MINIMUM_LEVEL_VALUE = 16;


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
        case 3: return ERROR_FRIEND_NOT_FOUND;
        case 4: return ERROR_INVALID_PLAYER_ID;
        case 5: return ERROR_INVALID_STATE;
        case 6: return ERROR_STATE_HANDLER;
        case 7: return ERROR_TRADING_EXPIRED;
        case 8: return ERROR_TRADING_COOLDOWN;
        case 9: return ERROR_PLAYER_ALREADY_OPENED;
        case 10: return ERROR_FRIEND_OUT_OF_RANGE;
        case 11: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 12: return ERROR_PLAYER_REACHED_DAILY_LIMIT;
        case 13: return ERROR_FRIEND_REACHED_DAILY_LIMIT;
        case 14: return ERROR_PLAYER_NOT_ENOUGH_STARDUST;
        case 15: return ERROR_FRIEND_NOT_ENOUGH_STARDUST;
        case 16: return ERROR_FRIEND_BELOW_MINIMUM_LEVEL;
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
      return POGOProtos.Rpc.OpenTradingOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OpenTradingOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.OpenTradingOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.OpenTradingOutProto.Result result = POGOProtos.Rpc.OpenTradingOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.OpenTradingOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int TRADING_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.TradingProto trading_;
  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   * @return Whether the trading field is set.
   */
  @java.lang.Override
  public boolean hasTrading() {
    return trading_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   * @return The trading.
   */
  @java.lang.Override
  public POGOProtos.Rpc.TradingProto getTrading() {
    return trading_ == null ? POGOProtos.Rpc.TradingProto.getDefaultInstance() : trading_;
  }
  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.TradingProtoOrBuilder getTradingOrBuilder() {
    return getTrading();
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
    if (result_ != POGOProtos.Rpc.OpenTradingOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (trading_ != null) {
      output.writeMessage(2, getTrading());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.OpenTradingOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (trading_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTrading());
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
    if (!(obj instanceof POGOProtos.Rpc.OpenTradingOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OpenTradingOutProto other = (POGOProtos.Rpc.OpenTradingOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasTrading() != other.hasTrading()) return false;
    if (hasTrading()) {
      if (!getTrading()
          .equals(other.getTrading())) return false;
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
    if (hasTrading()) {
      hash = (37 * hash) + TRADING_FIELD_NUMBER;
      hash = (53 * hash) + getTrading().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenTradingOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OpenTradingOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OpenTradingOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OpenTradingOutProto)
      POGOProtos.Rpc.OpenTradingOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenTradingOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenTradingOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OpenTradingOutProto.class, POGOProtos.Rpc.OpenTradingOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OpenTradingOutProto.newBuilder()
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

      if (tradingBuilder_ == null) {
        trading_ = null;
      } else {
        trading_ = null;
        tradingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenTradingOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenTradingOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.OpenTradingOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenTradingOutProto build() {
      POGOProtos.Rpc.OpenTradingOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenTradingOutProto buildPartial() {
      POGOProtos.Rpc.OpenTradingOutProto result = new POGOProtos.Rpc.OpenTradingOutProto(this);
      result.result_ = result_;
      if (tradingBuilder_ == null) {
        result.trading_ = trading_;
      } else {
        result.trading_ = tradingBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OpenTradingOutProto) {
        return mergeFrom((POGOProtos.Rpc.OpenTradingOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OpenTradingOutProto other) {
      if (other == POGOProtos.Rpc.OpenTradingOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasTrading()) {
        mergeTrading(other.getTrading());
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
      POGOProtos.Rpc.OpenTradingOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OpenTradingOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.OpenTradingOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.OpenTradingOutProto.Result result = POGOProtos.Rpc.OpenTradingOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.OpenTradingOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.OpenTradingOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.TradingProto trading_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder> tradingBuilder_;
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     * @return Whether the trading field is set.
     */
    public boolean hasTrading() {
      return tradingBuilder_ != null || trading_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     * @return The trading.
     */
    public POGOProtos.Rpc.TradingProto getTrading() {
      if (tradingBuilder_ == null) {
        return trading_ == null ? POGOProtos.Rpc.TradingProto.getDefaultInstance() : trading_;
      } else {
        return tradingBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public Builder setTrading(POGOProtos.Rpc.TradingProto value) {
      if (tradingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trading_ = value;
        onChanged();
      } else {
        tradingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public Builder setTrading(
        POGOProtos.Rpc.TradingProto.Builder builderForValue) {
      if (tradingBuilder_ == null) {
        trading_ = builderForValue.build();
        onChanged();
      } else {
        tradingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public Builder mergeTrading(POGOProtos.Rpc.TradingProto value) {
      if (tradingBuilder_ == null) {
        if (trading_ != null) {
          trading_ =
            POGOProtos.Rpc.TradingProto.newBuilder(trading_).mergeFrom(value).buildPartial();
        } else {
          trading_ = value;
        }
        onChanged();
      } else {
        tradingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public Builder clearTrading() {
      if (tradingBuilder_ == null) {
        trading_ = null;
        onChanged();
      } else {
        trading_ = null;
        tradingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public POGOProtos.Rpc.TradingProto.Builder getTradingBuilder() {
      
      onChanged();
      return getTradingFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    public POGOProtos.Rpc.TradingProtoOrBuilder getTradingOrBuilder() {
      if (tradingBuilder_ != null) {
        return tradingBuilder_.getMessageOrBuilder();
      } else {
        return trading_ == null ?
            POGOProtos.Rpc.TradingProto.getDefaultInstance() : trading_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder> 
        getTradingFieldBuilder() {
      if (tradingBuilder_ == null) {
        tradingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder>(
                getTrading(),
                getParentForChildren(),
                isClean());
        trading_ = null;
      }
      return tradingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OpenTradingOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OpenTradingOutProto)
  private static final POGOProtos.Rpc.OpenTradingOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OpenTradingOutProto();
  }

  public static POGOProtos.Rpc.OpenTradingOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenTradingOutProto>
      PARSER = new com.google.protobuf.AbstractParser<OpenTradingOutProto>() {
    @java.lang.Override
    public OpenTradingOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenTradingOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenTradingOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenTradingOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OpenTradingOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

