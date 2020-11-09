// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GroupChallengeCriteriaProto}
 */
public final class GroupChallengeCriteriaProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GroupChallengeCriteriaProto)
    GroupChallengeCriteriaProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupChallengeCriteriaProto.newBuilder() to construct.
  private GroupChallengeCriteriaProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupChallengeCriteriaProto() {
    challengeType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupChallengeCriteriaProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupChallengeCriteriaProto(
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

            challengeType_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.QuestGoalProto.Builder subBuilder = null;
            if (challengeGoal_ != null) {
              subBuilder = challengeGoal_.toBuilder();
            }
            challengeGoal_ = input.readMessage(POGOProtos.Rpc.QuestGoalProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(challengeGoal_);
              challengeGoal_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GroupChallengeCriteriaProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GroupChallengeCriteriaProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GroupChallengeCriteriaProto.class, POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder.class);
  }

  public static final int CHALLENGE_TYPE_FIELD_NUMBER = 1;
  private int challengeType_;
  /**
   * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
   * @return The enum numeric value on the wire for challengeType.
   */
  @java.lang.Override public int getChallengeTypeValue() {
    return challengeType_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
   * @return The challengeType.
   */
  @java.lang.Override public POGOProtos.Rpc.QuestType getChallengeType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.QuestType result = POGOProtos.Rpc.QuestType.valueOf(challengeType_);
    return result == null ? POGOProtos.Rpc.QuestType.UNRECOGNIZED : result;
  }

  public static final int CHALLENGE_GOAL_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.QuestGoalProto challengeGoal_;
  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   * @return Whether the challengeGoal field is set.
   */
  @java.lang.Override
  public boolean hasChallengeGoal() {
    return challengeGoal_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   * @return The challengeGoal.
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestGoalProto getChallengeGoal() {
    return challengeGoal_ == null ? POGOProtos.Rpc.QuestGoalProto.getDefaultInstance() : challengeGoal_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestGoalProtoOrBuilder getChallengeGoalOrBuilder() {
    return getChallengeGoal();
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
    if (challengeType_ != POGOProtos.Rpc.QuestType.QUEST_UNSET.getNumber()) {
      output.writeEnum(1, challengeType_);
    }
    if (challengeGoal_ != null) {
      output.writeMessage(2, getChallengeGoal());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (challengeType_ != POGOProtos.Rpc.QuestType.QUEST_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, challengeType_);
    }
    if (challengeGoal_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChallengeGoal());
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
    if (!(obj instanceof POGOProtos.Rpc.GroupChallengeCriteriaProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GroupChallengeCriteriaProto other = (POGOProtos.Rpc.GroupChallengeCriteriaProto) obj;

    if (challengeType_ != other.challengeType_) return false;
    if (hasChallengeGoal() != other.hasChallengeGoal()) return false;
    if (hasChallengeGoal()) {
      if (!getChallengeGoal()
          .equals(other.getChallengeGoal())) return false;
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
    hash = (37 * hash) + CHALLENGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + challengeType_;
    if (hasChallengeGoal()) {
      hash = (37 * hash) + CHALLENGE_GOAL_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeGoal().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GroupChallengeCriteriaProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GroupChallengeCriteriaProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GroupChallengeCriteriaProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GroupChallengeCriteriaProto)
      POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GroupChallengeCriteriaProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GroupChallengeCriteriaProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GroupChallengeCriteriaProto.class, POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GroupChallengeCriteriaProto.newBuilder()
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
      challengeType_ = 0;

      if (challengeGoalBuilder_ == null) {
        challengeGoal_ = null;
      } else {
        challengeGoal_ = null;
        challengeGoalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GroupChallengeCriteriaProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GroupChallengeCriteriaProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GroupChallengeCriteriaProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GroupChallengeCriteriaProto build() {
      POGOProtos.Rpc.GroupChallengeCriteriaProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GroupChallengeCriteriaProto buildPartial() {
      POGOProtos.Rpc.GroupChallengeCriteriaProto result = new POGOProtos.Rpc.GroupChallengeCriteriaProto(this);
      result.challengeType_ = challengeType_;
      if (challengeGoalBuilder_ == null) {
        result.challengeGoal_ = challengeGoal_;
      } else {
        result.challengeGoal_ = challengeGoalBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GroupChallengeCriteriaProto) {
        return mergeFrom((POGOProtos.Rpc.GroupChallengeCriteriaProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GroupChallengeCriteriaProto other) {
      if (other == POGOProtos.Rpc.GroupChallengeCriteriaProto.getDefaultInstance()) return this;
      if (other.challengeType_ != 0) {
        setChallengeTypeValue(other.getChallengeTypeValue());
      }
      if (other.hasChallengeGoal()) {
        mergeChallengeGoal(other.getChallengeGoal());
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
      POGOProtos.Rpc.GroupChallengeCriteriaProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GroupChallengeCriteriaProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int challengeType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
     * @return The enum numeric value on the wire for challengeType.
     */
    @java.lang.Override public int getChallengeTypeValue() {
      return challengeType_;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
     * @param value The enum numeric value on the wire for challengeType to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeTypeValue(int value) {
      
      challengeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
     * @return The challengeType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.QuestType getChallengeType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.QuestType result = POGOProtos.Rpc.QuestType.valueOf(challengeType_);
      return result == null ? POGOProtos.Rpc.QuestType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
     * @param value The challengeType to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeType(POGOProtos.Rpc.QuestType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      challengeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChallengeType() {
      
      challengeType_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.QuestGoalProto challengeGoal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestGoalProto, POGOProtos.Rpc.QuestGoalProto.Builder, POGOProtos.Rpc.QuestGoalProtoOrBuilder> challengeGoalBuilder_;
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     * @return Whether the challengeGoal field is set.
     */
    public boolean hasChallengeGoal() {
      return challengeGoalBuilder_ != null || challengeGoal_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     * @return The challengeGoal.
     */
    public POGOProtos.Rpc.QuestGoalProto getChallengeGoal() {
      if (challengeGoalBuilder_ == null) {
        return challengeGoal_ == null ? POGOProtos.Rpc.QuestGoalProto.getDefaultInstance() : challengeGoal_;
      } else {
        return challengeGoalBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public Builder setChallengeGoal(POGOProtos.Rpc.QuestGoalProto value) {
      if (challengeGoalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        challengeGoal_ = value;
        onChanged();
      } else {
        challengeGoalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public Builder setChallengeGoal(
        POGOProtos.Rpc.QuestGoalProto.Builder builderForValue) {
      if (challengeGoalBuilder_ == null) {
        challengeGoal_ = builderForValue.build();
        onChanged();
      } else {
        challengeGoalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public Builder mergeChallengeGoal(POGOProtos.Rpc.QuestGoalProto value) {
      if (challengeGoalBuilder_ == null) {
        if (challengeGoal_ != null) {
          challengeGoal_ =
            POGOProtos.Rpc.QuestGoalProto.newBuilder(challengeGoal_).mergeFrom(value).buildPartial();
        } else {
          challengeGoal_ = value;
        }
        onChanged();
      } else {
        challengeGoalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public Builder clearChallengeGoal() {
      if (challengeGoalBuilder_ == null) {
        challengeGoal_ = null;
        onChanged();
      } else {
        challengeGoal_ = null;
        challengeGoalBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public POGOProtos.Rpc.QuestGoalProto.Builder getChallengeGoalBuilder() {
      
      onChanged();
      return getChallengeGoalFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    public POGOProtos.Rpc.QuestGoalProtoOrBuilder getChallengeGoalOrBuilder() {
      if (challengeGoalBuilder_ != null) {
        return challengeGoalBuilder_.getMessageOrBuilder();
      } else {
        return challengeGoal_ == null ?
            POGOProtos.Rpc.QuestGoalProto.getDefaultInstance() : challengeGoal_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestGoalProto, POGOProtos.Rpc.QuestGoalProto.Builder, POGOProtos.Rpc.QuestGoalProtoOrBuilder> 
        getChallengeGoalFieldBuilder() {
      if (challengeGoalBuilder_ == null) {
        challengeGoalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.QuestGoalProto, POGOProtos.Rpc.QuestGoalProto.Builder, POGOProtos.Rpc.QuestGoalProtoOrBuilder>(
                getChallengeGoal(),
                getParentForChildren(),
                isClean());
        challengeGoal_ = null;
      }
      return challengeGoalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GroupChallengeCriteriaProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GroupChallengeCriteriaProto)
  private static final POGOProtos.Rpc.GroupChallengeCriteriaProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GroupChallengeCriteriaProto();
  }

  public static POGOProtos.Rpc.GroupChallengeCriteriaProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupChallengeCriteriaProto>
      PARSER = new com.google.protobuf.AbstractParser<GroupChallengeCriteriaProto>() {
    @java.lang.Override
    public GroupChallengeCriteriaProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupChallengeCriteriaProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupChallengeCriteriaProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupChallengeCriteriaProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GroupChallengeCriteriaProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

