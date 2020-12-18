// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonEvolutionQuestProto}
 */
public final class PokemonEvolutionQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonEvolutionQuestProto)
    PokemonEvolutionQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonEvolutionQuestProto.newBuilder() to construct.
  private PokemonEvolutionQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonEvolutionQuestProto() {
    evolution_ = 0;
    form_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonEvolutionQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonEvolutionQuestProto(
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
          case 10: {
            POGOProtos.Rpc.QuestProto.Builder subBuilder = null;
            if (questRequirement_ != null) {
              subBuilder = questRequirement_.toBuilder();
            }
            questRequirement_ = input.readMessage(POGOProtos.Rpc.QuestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(questRequirement_);
              questRequirement_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.EvolutionQuestInfoProto.Builder subBuilder = null;
            if (questInfo_ != null) {
              subBuilder = questInfo_.toBuilder();
            }
            questInfo_ = input.readMessage(POGOProtos.Rpc.EvolutionQuestInfoProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(questInfo_);
              questInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            evolution_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            form_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEvolutionQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEvolutionQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonEvolutionQuestProto.class, POGOProtos.Rpc.PokemonEvolutionQuestProto.Builder.class);
  }

  public static final int QUEST_REQUIREMENT_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.QuestProto questRequirement_;
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
   * @return Whether the questRequirement field is set.
   */
  @java.lang.Override
  public boolean hasQuestRequirement() {
    return questRequirement_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
   * @return The questRequirement.
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProto getQuestRequirement() {
    return questRequirement_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : questRequirement_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProtoOrBuilder getQuestRequirementOrBuilder() {
    return getQuestRequirement();
  }

  public static final int QUEST_INFO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.EvolutionQuestInfoProto questInfo_;
  /**
   * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
   * @return Whether the questInfo field is set.
   */
  @java.lang.Override
  public boolean hasQuestInfo() {
    return questInfo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
   * @return The questInfo.
   */
  @java.lang.Override
  public POGOProtos.Rpc.EvolutionQuestInfoProto getQuestInfo() {
    return questInfo_ == null ? POGOProtos.Rpc.EvolutionQuestInfoProto.getDefaultInstance() : questInfo_;
  }
  /**
   * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder getQuestInfoOrBuilder() {
    return getQuestInfo();
  }

  public static final int EVOLUTION_FIELD_NUMBER = 3;
  private int evolution_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
   * @return The enum numeric value on the wire for evolution.
   */
  @java.lang.Override public int getEvolutionValue() {
    return evolution_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
   * @return The evolution.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getEvolution() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(evolution_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int FORM_FIELD_NUMBER = 4;
  private int form_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
   * @return The enum numeric value on the wire for form.
   */
  @java.lang.Override public int getFormValue() {
    return form_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
   * @return The form.
   */
  @java.lang.Override public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
    return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
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
    if (questRequirement_ != null) {
      output.writeMessage(1, getQuestRequirement());
    }
    if (questInfo_ != null) {
      output.writeMessage(2, getQuestInfo());
    }
    if (evolution_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(3, evolution_);
    }
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      output.writeEnum(4, form_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (questRequirement_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQuestRequirement());
    }
    if (questInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuestInfo());
    }
    if (evolution_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, evolution_);
    }
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, form_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonEvolutionQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonEvolutionQuestProto other = (POGOProtos.Rpc.PokemonEvolutionQuestProto) obj;

    if (hasQuestRequirement() != other.hasQuestRequirement()) return false;
    if (hasQuestRequirement()) {
      if (!getQuestRequirement()
          .equals(other.getQuestRequirement())) return false;
    }
    if (hasQuestInfo() != other.hasQuestInfo()) return false;
    if (hasQuestInfo()) {
      if (!getQuestInfo()
          .equals(other.getQuestInfo())) return false;
    }
    if (evolution_ != other.evolution_) return false;
    if (form_ != other.form_) return false;
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
    if (hasQuestRequirement()) {
      hash = (37 * hash) + QUEST_REQUIREMENT_FIELD_NUMBER;
      hash = (53 * hash) + getQuestRequirement().hashCode();
    }
    if (hasQuestInfo()) {
      hash = (37 * hash) + QUEST_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getQuestInfo().hashCode();
    }
    hash = (37 * hash) + EVOLUTION_FIELD_NUMBER;
    hash = (53 * hash) + evolution_;
    hash = (37 * hash) + FORM_FIELD_NUMBER;
    hash = (53 * hash) + form_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEvolutionQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonEvolutionQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokemonEvolutionQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonEvolutionQuestProto)
      POGOProtos.Rpc.PokemonEvolutionQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEvolutionQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEvolutionQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonEvolutionQuestProto.class, POGOProtos.Rpc.PokemonEvolutionQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonEvolutionQuestProto.newBuilder()
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
      if (questRequirementBuilder_ == null) {
        questRequirement_ = null;
      } else {
        questRequirement_ = null;
        questRequirementBuilder_ = null;
      }
      if (questInfoBuilder_ == null) {
        questInfo_ = null;
      } else {
        questInfo_ = null;
        questInfoBuilder_ = null;
      }
      evolution_ = 0;

      form_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEvolutionQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEvolutionQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonEvolutionQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEvolutionQuestProto build() {
      POGOProtos.Rpc.PokemonEvolutionQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEvolutionQuestProto buildPartial() {
      POGOProtos.Rpc.PokemonEvolutionQuestProto result = new POGOProtos.Rpc.PokemonEvolutionQuestProto(this);
      if (questRequirementBuilder_ == null) {
        result.questRequirement_ = questRequirement_;
      } else {
        result.questRequirement_ = questRequirementBuilder_.build();
      }
      if (questInfoBuilder_ == null) {
        result.questInfo_ = questInfo_;
      } else {
        result.questInfo_ = questInfoBuilder_.build();
      }
      result.evolution_ = evolution_;
      result.form_ = form_;
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
      if (other instanceof POGOProtos.Rpc.PokemonEvolutionQuestProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonEvolutionQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonEvolutionQuestProto other) {
      if (other == POGOProtos.Rpc.PokemonEvolutionQuestProto.getDefaultInstance()) return this;
      if (other.hasQuestRequirement()) {
        mergeQuestRequirement(other.getQuestRequirement());
      }
      if (other.hasQuestInfo()) {
        mergeQuestInfo(other.getQuestInfo());
      }
      if (other.evolution_ != 0) {
        setEvolutionValue(other.getEvolutionValue());
      }
      if (other.form_ != 0) {
        setFormValue(other.getFormValue());
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
      POGOProtos.Rpc.PokemonEvolutionQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonEvolutionQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.QuestProto questRequirement_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> questRequirementBuilder_;
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     * @return Whether the questRequirement field is set.
     */
    public boolean hasQuestRequirement() {
      return questRequirementBuilder_ != null || questRequirement_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     * @return The questRequirement.
     */
    public POGOProtos.Rpc.QuestProto getQuestRequirement() {
      if (questRequirementBuilder_ == null) {
        return questRequirement_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : questRequirement_;
      } else {
        return questRequirementBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public Builder setQuestRequirement(POGOProtos.Rpc.QuestProto value) {
      if (questRequirementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        questRequirement_ = value;
        onChanged();
      } else {
        questRequirementBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public Builder setQuestRequirement(
        POGOProtos.Rpc.QuestProto.Builder builderForValue) {
      if (questRequirementBuilder_ == null) {
        questRequirement_ = builderForValue.build();
        onChanged();
      } else {
        questRequirementBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public Builder mergeQuestRequirement(POGOProtos.Rpc.QuestProto value) {
      if (questRequirementBuilder_ == null) {
        if (questRequirement_ != null) {
          questRequirement_ =
            POGOProtos.Rpc.QuestProto.newBuilder(questRequirement_).mergeFrom(value).buildPartial();
        } else {
          questRequirement_ = value;
        }
        onChanged();
      } else {
        questRequirementBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public Builder clearQuestRequirement() {
      if (questRequirementBuilder_ == null) {
        questRequirement_ = null;
        onChanged();
      } else {
        questRequirement_ = null;
        questRequirementBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public POGOProtos.Rpc.QuestProto.Builder getQuestRequirementBuilder() {
      
      onChanged();
      return getQuestRequirementFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    public POGOProtos.Rpc.QuestProtoOrBuilder getQuestRequirementOrBuilder() {
      if (questRequirementBuilder_ != null) {
        return questRequirementBuilder_.getMessageOrBuilder();
      } else {
        return questRequirement_ == null ?
            POGOProtos.Rpc.QuestProto.getDefaultInstance() : questRequirement_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest_requirement = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> 
        getQuestRequirementFieldBuilder() {
      if (questRequirementBuilder_ == null) {
        questRequirementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder>(
                getQuestRequirement(),
                getParentForChildren(),
                isClean());
        questRequirement_ = null;
      }
      return questRequirementBuilder_;
    }

    private POGOProtos.Rpc.EvolutionQuestInfoProto questInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EvolutionQuestInfoProto, POGOProtos.Rpc.EvolutionQuestInfoProto.Builder, POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder> questInfoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     * @return Whether the questInfo field is set.
     */
    public boolean hasQuestInfo() {
      return questInfoBuilder_ != null || questInfo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     * @return The questInfo.
     */
    public POGOProtos.Rpc.EvolutionQuestInfoProto getQuestInfo() {
      if (questInfoBuilder_ == null) {
        return questInfo_ == null ? POGOProtos.Rpc.EvolutionQuestInfoProto.getDefaultInstance() : questInfo_;
      } else {
        return questInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public Builder setQuestInfo(POGOProtos.Rpc.EvolutionQuestInfoProto value) {
      if (questInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        questInfo_ = value;
        onChanged();
      } else {
        questInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public Builder setQuestInfo(
        POGOProtos.Rpc.EvolutionQuestInfoProto.Builder builderForValue) {
      if (questInfoBuilder_ == null) {
        questInfo_ = builderForValue.build();
        onChanged();
      } else {
        questInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public Builder mergeQuestInfo(POGOProtos.Rpc.EvolutionQuestInfoProto value) {
      if (questInfoBuilder_ == null) {
        if (questInfo_ != null) {
          questInfo_ =
            POGOProtos.Rpc.EvolutionQuestInfoProto.newBuilder(questInfo_).mergeFrom(value).buildPartial();
        } else {
          questInfo_ = value;
        }
        onChanged();
      } else {
        questInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public Builder clearQuestInfo() {
      if (questInfoBuilder_ == null) {
        questInfo_ = null;
        onChanged();
      } else {
        questInfo_ = null;
        questInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public POGOProtos.Rpc.EvolutionQuestInfoProto.Builder getQuestInfoBuilder() {
      
      onChanged();
      return getQuestInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    public POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder getQuestInfoOrBuilder() {
      if (questInfoBuilder_ != null) {
        return questInfoBuilder_.getMessageOrBuilder();
      } else {
        return questInfo_ == null ?
            POGOProtos.Rpc.EvolutionQuestInfoProto.getDefaultInstance() : questInfo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EvolutionQuestInfoProto quest_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EvolutionQuestInfoProto, POGOProtos.Rpc.EvolutionQuestInfoProto.Builder, POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder> 
        getQuestInfoFieldBuilder() {
      if (questInfoBuilder_ == null) {
        questInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EvolutionQuestInfoProto, POGOProtos.Rpc.EvolutionQuestInfoProto.Builder, POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder>(
                getQuestInfo(),
                getParentForChildren(),
                isClean());
        questInfo_ = null;
      }
      return questInfoBuilder_;
    }

    private int evolution_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
     * @return The enum numeric value on the wire for evolution.
     */
    @java.lang.Override public int getEvolutionValue() {
      return evolution_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
     * @param value The enum numeric value on the wire for evolution to set.
     * @return This builder for chaining.
     */
    public Builder setEvolutionValue(int value) {
      
      evolution_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
     * @return The evolution.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getEvolution() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(evolution_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
     * @param value The evolution to set.
     * @return This builder for chaining.
     */
    public Builder setEvolution(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      evolution_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId evolution = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvolution() {
      
      evolution_ = 0;
      onChanged();
      return this;
    }

    private int form_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return The enum numeric value on the wire for form.
     */
    @java.lang.Override public int getFormValue() {
      return form_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @param value The enum numeric value on the wire for form to set.
     * @return This builder for chaining.
     */
    public Builder setFormValue(int value) {
      
      form_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return The form.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
      return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @param value The form to set.
     * @return This builder for chaining.
     */
    public Builder setForm(POGOProtos.Rpc.PokemonDisplayProto.Form value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      form_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearForm() {
      
      form_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonEvolutionQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonEvolutionQuestProto)
  private static final POGOProtos.Rpc.PokemonEvolutionQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonEvolutionQuestProto();
  }

  public static POGOProtos.Rpc.PokemonEvolutionQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonEvolutionQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonEvolutionQuestProto>() {
    @java.lang.Override
    public PokemonEvolutionQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonEvolutionQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonEvolutionQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonEvolutionQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonEvolutionQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

