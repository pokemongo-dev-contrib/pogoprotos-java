// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetMatchmakingStatusOutProto}
 */
public final class GetMatchmakingStatusOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetMatchmakingStatusOutProto)
    GetMatchmakingStatusOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMatchmakingStatusOutProto.newBuilder() to construct.
  private GetMatchmakingStatusOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMatchmakingStatusOutProto() {
    result_ = 0;
    queueId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMatchmakingStatusOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetMatchmakingStatusOutProto(
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
            POGOProtos.Rpc.CombatChallengeProto.Builder subBuilder = null;
            if (challenge_ != null) {
              subBuilder = challenge_.toBuilder();
            }
            challenge_ = input.readMessage(POGOProtos.Rpc.CombatChallengeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(challenge_);
              challenge_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            queueId_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetMatchmakingStatusOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetMatchmakingStatusOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetMatchmakingStatusOutProto.class, POGOProtos.Rpc.GetMatchmakingStatusOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS_OPPONENT_FOUND = 1;</code>
     */
    SUCCESS_OPPONENT_FOUND(1),
    /**
     * <code>SUCCESS_QUEUED = 2;</code>
     */
    SUCCESS_QUEUED(2),
    /**
     * <code>SUCCESS_NOT_MATCHED_EXPIRED = 3;</code>
     */
    SUCCESS_NOT_MATCHED_EXPIRED(3),
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 4;</code>
     */
    ERROR_PLAYER_NOT_FOUND(4),
    /**
     * <code>ERROR_QUEUE_NOT_FOUND = 5;</code>
     */
    ERROR_QUEUE_NOT_FOUND(5),
    /**
     * <code>ERROR_RETRY_UNSUCCESSFUL = 6;</code>
     */
    ERROR_RETRY_UNSUCCESSFUL(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS_OPPONENT_FOUND = 1;</code>
     */
    public static final int SUCCESS_OPPONENT_FOUND_VALUE = 1;
    /**
     * <code>SUCCESS_QUEUED = 2;</code>
     */
    public static final int SUCCESS_QUEUED_VALUE = 2;
    /**
     * <code>SUCCESS_NOT_MATCHED_EXPIRED = 3;</code>
     */
    public static final int SUCCESS_NOT_MATCHED_EXPIRED_VALUE = 3;
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 4;</code>
     */
    public static final int ERROR_PLAYER_NOT_FOUND_VALUE = 4;
    /**
     * <code>ERROR_QUEUE_NOT_FOUND = 5;</code>
     */
    public static final int ERROR_QUEUE_NOT_FOUND_VALUE = 5;
    /**
     * <code>ERROR_RETRY_UNSUCCESSFUL = 6;</code>
     */
    public static final int ERROR_RETRY_UNSUCCESSFUL_VALUE = 6;


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
        case 1: return SUCCESS_OPPONENT_FOUND;
        case 2: return SUCCESS_QUEUED;
        case 3: return SUCCESS_NOT_MATCHED_EXPIRED;
        case 4: return ERROR_PLAYER_NOT_FOUND;
        case 5: return ERROR_QUEUE_NOT_FOUND;
        case 6: return ERROR_RETRY_UNSUCCESSFUL;
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
      return POGOProtos.Rpc.GetMatchmakingStatusOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int CHALLENGE_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CombatChallengeProto challenge_;
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   * @return Whether the challenge field is set.
   */
  @java.lang.Override
  public boolean hasChallenge() {
    return challenge_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   * @return The challenge.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatChallengeProto getChallenge() {
    return challenge_ == null ? POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : challenge_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatChallengeProtoOrBuilder getChallengeOrBuilder() {
    return getChallenge();
  }

  public static final int QUEUE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object queueId_;
  /**
   * <code>string queue_id = 3;</code>
   * @return The queueId.
   */
  @java.lang.Override
  public java.lang.String getQueueId() {
    java.lang.Object ref = queueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queueId_ = s;
      return s;
    }
  }
  /**
   * <code>string queue_id = 3;</code>
   * @return The bytes for queueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueueIdBytes() {
    java.lang.Object ref = queueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queueId_ = b;
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
    if (result_ != POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (challenge_ != null) {
      output.writeMessage(2, getChallenge());
    }
    if (!getQueueIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, queueId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (challenge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChallenge());
    }
    if (!getQueueIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, queueId_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetMatchmakingStatusOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetMatchmakingStatusOutProto other = (POGOProtos.Rpc.GetMatchmakingStatusOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasChallenge() != other.hasChallenge()) return false;
    if (hasChallenge()) {
      if (!getChallenge()
          .equals(other.getChallenge())) return false;
    }
    if (!getQueueId()
        .equals(other.getQueueId())) return false;
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
    if (hasChallenge()) {
      hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
      hash = (53 * hash) + getChallenge().hashCode();
    }
    hash = (37 * hash) + QUEUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQueueId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetMatchmakingStatusOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetMatchmakingStatusOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetMatchmakingStatusOutProto)
      POGOProtos.Rpc.GetMatchmakingStatusOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetMatchmakingStatusOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetMatchmakingStatusOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetMatchmakingStatusOutProto.class, POGOProtos.Rpc.GetMatchmakingStatusOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetMatchmakingStatusOutProto.newBuilder()
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

      if (challengeBuilder_ == null) {
        challenge_ = null;
      } else {
        challenge_ = null;
        challengeBuilder_ = null;
      }
      queueId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetMatchmakingStatusOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMatchmakingStatusOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetMatchmakingStatusOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMatchmakingStatusOutProto build() {
      POGOProtos.Rpc.GetMatchmakingStatusOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMatchmakingStatusOutProto buildPartial() {
      POGOProtos.Rpc.GetMatchmakingStatusOutProto result = new POGOProtos.Rpc.GetMatchmakingStatusOutProto(this);
      result.result_ = result_;
      if (challengeBuilder_ == null) {
        result.challenge_ = challenge_;
      } else {
        result.challenge_ = challengeBuilder_.build();
      }
      result.queueId_ = queueId_;
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
      if (other instanceof POGOProtos.Rpc.GetMatchmakingStatusOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetMatchmakingStatusOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetMatchmakingStatusOutProto other) {
      if (other == POGOProtos.Rpc.GetMatchmakingStatusOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasChallenge()) {
        mergeChallenge(other.getChallenge());
      }
      if (!other.getQueueId().isEmpty()) {
        queueId_ = other.queueId_;
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
      POGOProtos.Rpc.GetMatchmakingStatusOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetMatchmakingStatusOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetMatchmakingStatusOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatChallengeProto challenge_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder> challengeBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     * @return Whether the challenge field is set.
     */
    public boolean hasChallenge() {
      return challengeBuilder_ != null || challenge_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     * @return The challenge.
     */
    public POGOProtos.Rpc.CombatChallengeProto getChallenge() {
      if (challengeBuilder_ == null) {
        return challenge_ == null ? POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : challenge_;
      } else {
        return challengeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public Builder setChallenge(POGOProtos.Rpc.CombatChallengeProto value) {
      if (challengeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        challenge_ = value;
        onChanged();
      } else {
        challengeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public Builder setChallenge(
        POGOProtos.Rpc.CombatChallengeProto.Builder builderForValue) {
      if (challengeBuilder_ == null) {
        challenge_ = builderForValue.build();
        onChanged();
      } else {
        challengeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public Builder mergeChallenge(POGOProtos.Rpc.CombatChallengeProto value) {
      if (challengeBuilder_ == null) {
        if (challenge_ != null) {
          challenge_ =
            POGOProtos.Rpc.CombatChallengeProto.newBuilder(challenge_).mergeFrom(value).buildPartial();
        } else {
          challenge_ = value;
        }
        onChanged();
      } else {
        challengeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public Builder clearChallenge() {
      if (challengeBuilder_ == null) {
        challenge_ = null;
        onChanged();
      } else {
        challenge_ = null;
        challengeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public POGOProtos.Rpc.CombatChallengeProto.Builder getChallengeBuilder() {
      
      onChanged();
      return getChallengeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    public POGOProtos.Rpc.CombatChallengeProtoOrBuilder getChallengeOrBuilder() {
      if (challengeBuilder_ != null) {
        return challengeBuilder_.getMessageOrBuilder();
      } else {
        return challenge_ == null ?
            POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : challenge_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto challenge = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder> 
        getChallengeFieldBuilder() {
      if (challengeBuilder_ == null) {
        challengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder>(
                getChallenge(),
                getParentForChildren(),
                isClean());
        challenge_ = null;
      }
      return challengeBuilder_;
    }

    private java.lang.Object queueId_ = "";
    /**
     * <code>string queue_id = 3;</code>
     * @return The queueId.
     */
    public java.lang.String getQueueId() {
      java.lang.Object ref = queueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string queue_id = 3;</code>
     * @return The bytes for queueId.
     */
    public com.google.protobuf.ByteString
        getQueueIdBytes() {
      java.lang.Object ref = queueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string queue_id = 3;</code>
     * @param value The queueId to set.
     * @return This builder for chaining.
     */
    public Builder setQueueId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string queue_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueueId() {
      
      queueId_ = getDefaultInstance().getQueueId();
      onChanged();
      return this;
    }
    /**
     * <code>string queue_id = 3;</code>
     * @param value The bytes for queueId to set.
     * @return This builder for chaining.
     */
    public Builder setQueueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queueId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetMatchmakingStatusOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetMatchmakingStatusOutProto)
  private static final POGOProtos.Rpc.GetMatchmakingStatusOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetMatchmakingStatusOutProto();
  }

  public static POGOProtos.Rpc.GetMatchmakingStatusOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMatchmakingStatusOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetMatchmakingStatusOutProto>() {
    @java.lang.Override
    public GetMatchmakingStatusOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetMatchmakingStatusOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetMatchmakingStatusOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMatchmakingStatusOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetMatchmakingStatusOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

