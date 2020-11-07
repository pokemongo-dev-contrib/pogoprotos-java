// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OpenCombatChallengeOutProto}
 */
public final class OpenCombatChallengeOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OpenCombatChallengeOutProto)
    OpenCombatChallengeOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenCombatChallengeOutProto.newBuilder() to construct.
  private OpenCombatChallengeOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenCombatChallengeOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenCombatChallengeOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenCombatChallengeOutProto(
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenCombatChallengeOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenCombatChallengeOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OpenCombatChallengeOutProto.class, POGOProtos.Rpc.OpenCombatChallengeOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.OpenCombatChallengeOutProto.Result}
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
     * <code>ERROR_INVALID_CHALLENGE_STATE = 2;</code>
     */
    ERROR_INVALID_CHALLENGE_STATE(2),
    /**
     * <code>ERROR_CHALLENGE_NOT_FOUND = 3;</code>
     */
    ERROR_CHALLENGE_NOT_FOUND(3),
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    ERROR_POKEMON_NOT_IN_INVENTORY(4),
    /**
     * <code>ERROR_NOT_ELIGIBLE_LEAGUE = 5;</code>
     */
    ERROR_NOT_ELIGIBLE_LEAGUE(5),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(6),
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 8;</code>
     */
    ERROR_ALREADY_TIMEDOUT(8),
    /**
     * <code>ERROR_ALREADY_CANCELLED = 9;</code>
     */
    ERROR_ALREADY_CANCELLED(9),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 10;</code>
     */
    ERROR_FRIEND_NOT_FOUND(10),
    /**
     * <code>ERROR_FAILED_TO_SEND_NOTIFICATION = 11;</code>
     */
    ERROR_FAILED_TO_SEND_NOTIFICATION(11),
    /**
     * <code>ERROR_ACCESS_DENIED = 12;</code>
     */
    ERROR_ACCESS_DENIED(12),
    /**
     * <code>ERROR_INELIGIBLE_OPPONENT = 13;</code>
     */
    ERROR_INELIGIBLE_OPPONENT(13),
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
     * <code>ERROR_INVALID_CHALLENGE_STATE = 2;</code>
     */
    public static final int ERROR_INVALID_CHALLENGE_STATE_VALUE = 2;
    /**
     * <code>ERROR_CHALLENGE_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_CHALLENGE_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    public static final int ERROR_POKEMON_NOT_IN_INVENTORY_VALUE = 4;
    /**
     * <code>ERROR_NOT_ELIGIBLE_LEAGUE = 5;</code>
     */
    public static final int ERROR_NOT_ELIGIBLE_LEAGUE_VALUE = 5;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 6;
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 8;</code>
     */
    public static final int ERROR_ALREADY_TIMEDOUT_VALUE = 8;
    /**
     * <code>ERROR_ALREADY_CANCELLED = 9;</code>
     */
    public static final int ERROR_ALREADY_CANCELLED_VALUE = 9;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 10;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 10;
    /**
     * <code>ERROR_FAILED_TO_SEND_NOTIFICATION = 11;</code>
     */
    public static final int ERROR_FAILED_TO_SEND_NOTIFICATION_VALUE = 11;
    /**
     * <code>ERROR_ACCESS_DENIED = 12;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 12;
    /**
     * <code>ERROR_INELIGIBLE_OPPONENT = 13;</code>
     */
    public static final int ERROR_INELIGIBLE_OPPONENT_VALUE = 13;


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
        case 2: return ERROR_INVALID_CHALLENGE_STATE;
        case 3: return ERROR_CHALLENGE_NOT_FOUND;
        case 4: return ERROR_POKEMON_NOT_IN_INVENTORY;
        case 5: return ERROR_NOT_ELIGIBLE_LEAGUE;
        case 6: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 8: return ERROR_ALREADY_TIMEDOUT;
        case 9: return ERROR_ALREADY_CANCELLED;
        case 10: return ERROR_FRIEND_NOT_FOUND;
        case 11: return ERROR_FAILED_TO_SEND_NOTIFICATION;
        case 12: return ERROR_ACCESS_DENIED;
        case 13: return ERROR_INELIGIBLE_OPPONENT;
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
      return POGOProtos.Rpc.OpenCombatChallengeOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OpenCombatChallengeOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.OpenCombatChallengeOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.UNRECOGNIZED : result;
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
    if (result_ != POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (challenge_ != null) {
      output.writeMessage(2, getChallenge());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (challenge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChallenge());
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
    if (!(obj instanceof POGOProtos.Rpc.OpenCombatChallengeOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OpenCombatChallengeOutProto other = (POGOProtos.Rpc.OpenCombatChallengeOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasChallenge() != other.hasChallenge()) return false;
    if (hasChallenge()) {
      if (!getChallenge()
          .equals(other.getChallenge())) return false;
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
    if (hasChallenge()) {
      hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
      hash = (53 * hash) + getChallenge().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatChallengeOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OpenCombatChallengeOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OpenCombatChallengeOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OpenCombatChallengeOutProto)
      POGOProtos.Rpc.OpenCombatChallengeOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenCombatChallengeOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenCombatChallengeOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OpenCombatChallengeOutProto.class, POGOProtos.Rpc.OpenCombatChallengeOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OpenCombatChallengeOutProto.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OpenCombatChallengeOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatChallengeOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.OpenCombatChallengeOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatChallengeOutProto build() {
      POGOProtos.Rpc.OpenCombatChallengeOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatChallengeOutProto buildPartial() {
      POGOProtos.Rpc.OpenCombatChallengeOutProto result = new POGOProtos.Rpc.OpenCombatChallengeOutProto(this);
      result.result_ = result_;
      if (challengeBuilder_ == null) {
        result.challenge_ = challenge_;
      } else {
        result.challenge_ = challengeBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OpenCombatChallengeOutProto) {
        return mergeFrom((POGOProtos.Rpc.OpenCombatChallengeOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OpenCombatChallengeOutProto other) {
      if (other == POGOProtos.Rpc.OpenCombatChallengeOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasChallenge()) {
        mergeChallenge(other.getChallenge());
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
      POGOProtos.Rpc.OpenCombatChallengeOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OpenCombatChallengeOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatChallengeOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.OpenCombatChallengeOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.OpenCombatChallengeOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OpenCombatChallengeOutProto.Result result = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OpenCombatChallengeOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OpenCombatChallengeOutProto)
  private static final POGOProtos.Rpc.OpenCombatChallengeOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OpenCombatChallengeOutProto();
  }

  public static POGOProtos.Rpc.OpenCombatChallengeOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenCombatChallengeOutProto>
      PARSER = new com.google.protobuf.AbstractParser<OpenCombatChallengeOutProto>() {
    @java.lang.Override
    public OpenCombatChallengeOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenCombatChallengeOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenCombatChallengeOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenCombatChallengeOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OpenCombatChallengeOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

