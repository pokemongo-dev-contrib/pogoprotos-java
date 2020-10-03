// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ECEJLLHHBNL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto}
 */
public final class ClaimVsSeekerRewardsOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)
    ClaimVsSeekerRewardsOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClaimVsSeekerRewardsOutProto.newBuilder() to construct.
  private ClaimVsSeekerRewardsOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClaimVsSeekerRewardsOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClaimVsSeekerRewardsOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClaimVsSeekerRewardsOutProto(
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
            POGOProtos.Rpc.LootProto.Builder subBuilder = null;
            if (rewards_ != null) {
              subBuilder = rewards_.toBuilder();
            }
            rewards_ = input.readMessage(POGOProtos.Rpc.LootProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rewards_);
              rewards_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClaimVsSeekerRewardsOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClaimVsSeekerRewardsOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.class, POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Builder.class);
  }

  /**
   * <pre>
   * ref: ECEJLLHHBNL/JKFIAPLFNNJ/HCGGMEGLNOH
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result}
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
     * <code>ERROR_REDEEM_POKEMON = 2;</code>
     */
    ERROR_REDEEM_POKEMON(2),
    /**
     * <code>ERROR_PLAYER_NOT_ENOUGH_VICTORIES = 3;</code>
     */
    ERROR_PLAYER_NOT_ENOUGH_VICTORIES(3),
    /**
     * <code>ERROR_REWARD_ALREADY_CLAIMED = 4;</code>
     */
    ERROR_REWARD_ALREADY_CLAIMED(4),
    /**
     * <code>ERROR_INVENTORY_FULL = 5;</code>
     */
    ERROR_INVENTORY_FULL(5),
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
     * <code>ERROR_REDEEM_POKEMON = 2;</code>
     */
    public static final int ERROR_REDEEM_POKEMON_VALUE = 2;
    /**
     * <code>ERROR_PLAYER_NOT_ENOUGH_VICTORIES = 3;</code>
     */
    public static final int ERROR_PLAYER_NOT_ENOUGH_VICTORIES_VALUE = 3;
    /**
     * <code>ERROR_REWARD_ALREADY_CLAIMED = 4;</code>
     */
    public static final int ERROR_REWARD_ALREADY_CLAIMED_VALUE = 4;
    /**
     * <code>ERROR_INVENTORY_FULL = 5;</code>
     */
    public static final int ERROR_INVENTORY_FULL_VALUE = 5;


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
        case 2: return ERROR_REDEEM_POKEMON;
        case 3: return ERROR_PLAYER_NOT_ENOUGH_VICTORIES;
        case 4: return ERROR_REWARD_ALREADY_CLAIMED;
        case 5: return ERROR_INVENTORY_FULL;
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
      return POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int REWARDS_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LootProto rewards_;
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return Whether the rewards field is set.
   */
  @java.lang.Override
  public boolean hasRewards() {
    return rewards_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return The rewards.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProto getRewards() {
    return rewards_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder() {
    return getRewards();
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
    if (result_ != POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (rewards_ != null) {
      output.writeMessage(2, getRewards());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (rewards_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRewards());
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
    if (!(obj instanceof POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto other = (POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasRewards() != other.hasRewards()) return false;
    if (hasRewards()) {
      if (!getRewards()
          .equals(other.getRewards())) return false;
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
    if (hasRewards()) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewards().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto prototype) {
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
   * ref: ECEJLLHHBNL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)
      POGOProtos.Rpc.ClaimVsSeekerRewardsOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClaimVsSeekerRewardsOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClaimVsSeekerRewardsOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.class, POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.newBuilder()
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

      if (rewardsBuilder_ == null) {
        rewards_ = null;
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClaimVsSeekerRewardsOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto build() {
      POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto buildPartial() {
      POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto result = new POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto(this);
      result.result_ = result_;
      if (rewardsBuilder_ == null) {
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto) {
        return mergeFrom((POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto other) {
      if (other == POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasRewards()) {
        mergeRewards(other.getRewards());
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
      POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LootProto rewards_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> rewardsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     * @return Whether the rewards field is set.
     */
    public boolean hasRewards() {
      return rewardsBuilder_ != null || rewards_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     * @return The rewards.
     */
    public POGOProtos.Rpc.LootProto getRewards() {
      if (rewardsBuilder_ == null) {
        return rewards_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
      } else {
        return rewardsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder setRewards(POGOProtos.Rpc.LootProto value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rewards_ = value;
        onChanged();
      } else {
        rewardsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder setRewards(
        POGOProtos.Rpc.LootProto.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        rewards_ = builderForValue.build();
        onChanged();
      } else {
        rewardsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder mergeRewards(POGOProtos.Rpc.LootProto value) {
      if (rewardsBuilder_ == null) {
        if (rewards_ != null) {
          rewards_ =
            POGOProtos.Rpc.LootProto.newBuilder(rewards_).mergeFrom(value).buildPartial();
        } else {
          rewards_ = value;
        }
        onChanged();
      } else {
        rewardsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = null;
        onChanged();
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public POGOProtos.Rpc.LootProto.Builder getRewardsBuilder() {
      
      onChanged();
      return getRewardsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilder();
      } else {
        return rewards_ == null ?
            POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder>(
                getRewards(),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)
  private static final POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto();
  }

  public static POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClaimVsSeekerRewardsOutProto>
      PARSER = new com.google.protobuf.AbstractParser<ClaimVsSeekerRewardsOutProto>() {
    @java.lang.Override
    public ClaimVsSeekerRewardsOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClaimVsSeekerRewardsOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClaimVsSeekerRewardsOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClaimVsSeekerRewardsOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

