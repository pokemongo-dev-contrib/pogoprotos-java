// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KNBJCBMCKFC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KNBJCBMCKFC}
 */
public final class KNBJCBMCKFC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KNBJCBMCKFC)
    KNBJCBMCKFCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KNBJCBMCKFC.newBuilder() to construct.
  private KNBJCBMCKFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KNBJCBMCKFC() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KNBJCBMCKFC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KNBJCBMCKFC(
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
            if (jikkdljggho_ != null) {
              subBuilder = jikkdljggho_.toBuilder();
            }
            jikkdljggho_ = input.readMessage(POGOProtos.Rpc.TradingProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jikkdljggho_);
              jikkdljggho_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KNBJCBMCKFC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KNBJCBMCKFC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KNBJCBMCKFC.class, POGOProtos.Rpc.KNBJCBMCKFC.Builder.class);
  }

  /**
   * <pre>
   * ref: KNBJCBMCKFC/PKPNGELCBJP/LAFEFFDLMFO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.KNBJCBMCKFC.Result}
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
      return POGOProtos.Rpc.KNBJCBMCKFC.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KNBJCBMCKFC.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.KNBJCBMCKFC.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.KNBJCBMCKFC.Result result = POGOProtos.Rpc.KNBJCBMCKFC.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.KNBJCBMCKFC.Result.UNRECOGNIZED : result;
  }

  public static final int JIKKDLJGGHO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.TradingProto jikkdljggho_;
  /**
   * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
   * @return Whether the jikkdljggho field is set.
   */
  @java.lang.Override
  public boolean hasJikkdljggho() {
    return jikkdljggho_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
   * @return The jikkdljggho.
   */
  @java.lang.Override
  public POGOProtos.Rpc.TradingProto getJikkdljggho() {
    return jikkdljggho_ == null ? POGOProtos.Rpc.TradingProto.getDefaultInstance() : jikkdljggho_;
  }
  /**
   * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.TradingProtoOrBuilder getJikkdljgghoOrBuilder() {
    return getJikkdljggho();
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
    if (result_ != POGOProtos.Rpc.KNBJCBMCKFC.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (jikkdljggho_ != null) {
      output.writeMessage(2, getJikkdljggho());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.KNBJCBMCKFC.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (jikkdljggho_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJikkdljggho());
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
    if (!(obj instanceof POGOProtos.Rpc.KNBJCBMCKFC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KNBJCBMCKFC other = (POGOProtos.Rpc.KNBJCBMCKFC) obj;

    if (result_ != other.result_) return false;
    if (hasJikkdljggho() != other.hasJikkdljggho()) return false;
    if (hasJikkdljggho()) {
      if (!getJikkdljggho()
          .equals(other.getJikkdljggho())) return false;
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
    if (hasJikkdljggho()) {
      hash = (37 * hash) + JIKKDLJGGHO_FIELD_NUMBER;
      hash = (53 * hash) + getJikkdljggho().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KNBJCBMCKFC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KNBJCBMCKFC prototype) {
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
   * ref: KNBJCBMCKFC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KNBJCBMCKFC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KNBJCBMCKFC)
      POGOProtos.Rpc.KNBJCBMCKFCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KNBJCBMCKFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KNBJCBMCKFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KNBJCBMCKFC.class, POGOProtos.Rpc.KNBJCBMCKFC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KNBJCBMCKFC.newBuilder()
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

      if (jikkdljgghoBuilder_ == null) {
        jikkdljggho_ = null;
      } else {
        jikkdljggho_ = null;
        jikkdljgghoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KNBJCBMCKFC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KNBJCBMCKFC getDefaultInstanceForType() {
      return POGOProtos.Rpc.KNBJCBMCKFC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KNBJCBMCKFC build() {
      POGOProtos.Rpc.KNBJCBMCKFC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KNBJCBMCKFC buildPartial() {
      POGOProtos.Rpc.KNBJCBMCKFC result = new POGOProtos.Rpc.KNBJCBMCKFC(this);
      result.result_ = result_;
      if (jikkdljgghoBuilder_ == null) {
        result.jikkdljggho_ = jikkdljggho_;
      } else {
        result.jikkdljggho_ = jikkdljgghoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.KNBJCBMCKFC) {
        return mergeFrom((POGOProtos.Rpc.KNBJCBMCKFC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KNBJCBMCKFC other) {
      if (other == POGOProtos.Rpc.KNBJCBMCKFC.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasJikkdljggho()) {
        mergeJikkdljggho(other.getJikkdljggho());
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
      POGOProtos.Rpc.KNBJCBMCKFC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KNBJCBMCKFC) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.KNBJCBMCKFC.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.KNBJCBMCKFC.Result result = POGOProtos.Rpc.KNBJCBMCKFC.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.KNBJCBMCKFC.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.KNBJCBMCKFC.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KNBJCBMCKFC.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.TradingProto jikkdljggho_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder> jikkdljgghoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     * @return Whether the jikkdljggho field is set.
     */
    public boolean hasJikkdljggho() {
      return jikkdljgghoBuilder_ != null || jikkdljggho_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     * @return The jikkdljggho.
     */
    public POGOProtos.Rpc.TradingProto getJikkdljggho() {
      if (jikkdljgghoBuilder_ == null) {
        return jikkdljggho_ == null ? POGOProtos.Rpc.TradingProto.getDefaultInstance() : jikkdljggho_;
      } else {
        return jikkdljgghoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public Builder setJikkdljggho(POGOProtos.Rpc.TradingProto value) {
      if (jikkdljgghoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jikkdljggho_ = value;
        onChanged();
      } else {
        jikkdljgghoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public Builder setJikkdljggho(
        POGOProtos.Rpc.TradingProto.Builder builderForValue) {
      if (jikkdljgghoBuilder_ == null) {
        jikkdljggho_ = builderForValue.build();
        onChanged();
      } else {
        jikkdljgghoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public Builder mergeJikkdljggho(POGOProtos.Rpc.TradingProto value) {
      if (jikkdljgghoBuilder_ == null) {
        if (jikkdljggho_ != null) {
          jikkdljggho_ =
            POGOProtos.Rpc.TradingProto.newBuilder(jikkdljggho_).mergeFrom(value).buildPartial();
        } else {
          jikkdljggho_ = value;
        }
        onChanged();
      } else {
        jikkdljgghoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public Builder clearJikkdljggho() {
      if (jikkdljgghoBuilder_ == null) {
        jikkdljggho_ = null;
        onChanged();
      } else {
        jikkdljggho_ = null;
        jikkdljgghoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public POGOProtos.Rpc.TradingProto.Builder getJikkdljgghoBuilder() {
      
      onChanged();
      return getJikkdljgghoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    public POGOProtos.Rpc.TradingProtoOrBuilder getJikkdljgghoOrBuilder() {
      if (jikkdljgghoBuilder_ != null) {
        return jikkdljgghoBuilder_.getMessageOrBuilder();
      } else {
        return jikkdljggho_ == null ?
            POGOProtos.Rpc.TradingProto.getDefaultInstance() : jikkdljggho_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TradingProto jikkdljggho = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder> 
        getJikkdljgghoFieldBuilder() {
      if (jikkdljgghoBuilder_ == null) {
        jikkdljgghoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.TradingProto, POGOProtos.Rpc.TradingProto.Builder, POGOProtos.Rpc.TradingProtoOrBuilder>(
                getJikkdljggho(),
                getParentForChildren(),
                isClean());
        jikkdljggho_ = null;
      }
      return jikkdljgghoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KNBJCBMCKFC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KNBJCBMCKFC)
  private static final POGOProtos.Rpc.KNBJCBMCKFC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KNBJCBMCKFC();
  }

  public static POGOProtos.Rpc.KNBJCBMCKFC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KNBJCBMCKFC>
      PARSER = new com.google.protobuf.AbstractParser<KNBJCBMCKFC>() {
    @java.lang.Override
    public KNBJCBMCKFC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KNBJCBMCKFC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KNBJCBMCKFC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KNBJCBMCKFC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KNBJCBMCKFC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

