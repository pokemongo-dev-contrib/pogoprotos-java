// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonEncounterRewardProto}
 */
public final class PokemonEncounterRewardProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonEncounterRewardProto)
    PokemonEncounterRewardProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonEncounterRewardProto.newBuilder() to construct.
  private PokemonEncounterRewardProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonEncounterRewardProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonEncounterRewardProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonEncounterRewardProto(
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
            typeCase_ = 1;
            type_ = rawValue;
            break;
          }
          case 16: {
            typeCase_ = 2;
            type_ = input.readBool();
            break;
          }
          case 26: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (pokemonDisplay_ != null) {
              subBuilder = pokemonDisplay_.toBuilder();
            }
            pokemonDisplay_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonDisplay_);
              pokemonDisplay_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            isHiddenDitto_ = input.readBool();
            break;
          }
          case 42: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (dittoDisplay_ != null) {
              subBuilder = dittoDisplay_.toBuilder();
            }
            dittoDisplay_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dittoDisplay_);
              dittoDisplay_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEncounterRewardProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEncounterRewardProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonEncounterRewardProto.class, POGOProtos.Rpc.PokemonEncounterRewardProto.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    POKEMON_ID(1),
    USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return POKEMON_ID;
        case 2: return USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  public int getPokemonIdValue() {
    if (typeCase_ == 1) {
      return (java.lang.Integer) type_;
    }
    return 0;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    if (typeCase_ == 1) {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(
          (java.lang.Integer) type_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    return POGOProtos.Rpc.HoloPokemonId.MISSINGNO;
  }

  public static final int USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION_FIELD_NUMBER = 2;
  /**
   * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
   * @return The useQuestPokemonEncounterDistribuition.
   */
  @java.lang.Override
  public boolean getUseQuestPokemonEncounterDistribuition() {
    if (typeCase_ == 2) {
      return (java.lang.Boolean) type_;
    }
    return false;
  }

  public static final int POKEMON_DISPLAY_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  @java.lang.Override
  public boolean hasPokemonDisplay() {
    return pokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
   * @return The pokemonDisplay.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
    return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
    return getPokemonDisplay();
  }

  public static final int IS_HIDDEN_DITTO_FIELD_NUMBER = 4;
  private boolean isHiddenDitto_;
  /**
   * <code>bool is_hidden_ditto = 4;</code>
   * @return The isHiddenDitto.
   */
  @java.lang.Override
  public boolean getIsHiddenDitto() {
    return isHiddenDitto_;
  }

  public static final int DITTO_DISPLAY_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.PokemonDisplayProto dittoDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
   * @return Whether the dittoDisplay field is set.
   */
  @java.lang.Override
  public boolean hasDittoDisplay() {
    return dittoDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
   * @return The dittoDisplay.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getDittoDisplay() {
    return dittoDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dittoDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getDittoDisplayOrBuilder() {
    return getDittoDisplay();
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
    if (typeCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) type_));
    }
    if (typeCase_ == 2) {
      output.writeBool(
          2, (boolean)((java.lang.Boolean) type_));
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(3, getPokemonDisplay());
    }
    if (isHiddenDitto_ != false) {
      output.writeBool(4, isHiddenDitto_);
    }
    if (dittoDisplay_ != null) {
      output.writeMessage(5, getDittoDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) type_));
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            2, (boolean)((java.lang.Boolean) type_));
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPokemonDisplay());
    }
    if (isHiddenDitto_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isHiddenDitto_);
    }
    if (dittoDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDittoDisplay());
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonEncounterRewardProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonEncounterRewardProto other = (POGOProtos.Rpc.PokemonEncounterRewardProto) obj;

    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
    }
    if (getIsHiddenDitto()
        != other.getIsHiddenDitto()) return false;
    if (hasDittoDisplay() != other.hasDittoDisplay()) return false;
    if (hasDittoDisplay()) {
      if (!getDittoDisplay()
          .equals(other.getDittoDisplay())) return false;
    }
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (getPokemonIdValue()
            != other.getPokemonIdValue()) return false;
        break;
      case 2:
        if (getUseQuestPokemonEncounterDistribuition()
            != other.getUseQuestPokemonEncounterDistribuition()) return false;
        break;
      case 0:
      default:
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
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (37 * hash) + IS_HIDDEN_DITTO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsHiddenDitto());
    if (hasDittoDisplay()) {
      hash = (37 * hash) + DITTO_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getDittoDisplay().hashCode();
    }
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPokemonIdValue();
        break;
      case 2:
        hash = (37 * hash) + USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUseQuestPokemonEncounterDistribuition());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonEncounterRewardProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonEncounterRewardProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokemonEncounterRewardProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonEncounterRewardProto)
      POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEncounterRewardProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEncounterRewardProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonEncounterRewardProto.class, POGOProtos.Rpc.PokemonEncounterRewardProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonEncounterRewardProto.newBuilder()
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
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      isHiddenDitto_ = false;

      if (dittoDisplayBuilder_ == null) {
        dittoDisplay_ = null;
      } else {
        dittoDisplay_ = null;
        dittoDisplayBuilder_ = null;
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonEncounterRewardProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEncounterRewardProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonEncounterRewardProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEncounterRewardProto build() {
      POGOProtos.Rpc.PokemonEncounterRewardProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonEncounterRewardProto buildPartial() {
      POGOProtos.Rpc.PokemonEncounterRewardProto result = new POGOProtos.Rpc.PokemonEncounterRewardProto(this);
      if (typeCase_ == 1) {
        result.type_ = type_;
      }
      if (typeCase_ == 2) {
        result.type_ = type_;
      }
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
      }
      result.isHiddenDitto_ = isHiddenDitto_;
      if (dittoDisplayBuilder_ == null) {
        result.dittoDisplay_ = dittoDisplay_;
      } else {
        result.dittoDisplay_ = dittoDisplayBuilder_.build();
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof POGOProtos.Rpc.PokemonEncounterRewardProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonEncounterRewardProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonEncounterRewardProto other) {
      if (other == POGOProtos.Rpc.PokemonEncounterRewardProto.getDefaultInstance()) return this;
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
      }
      if (other.getIsHiddenDitto() != false) {
        setIsHiddenDitto(other.getIsHiddenDitto());
      }
      if (other.hasDittoDisplay()) {
        mergeDittoDisplay(other.getDittoDisplay());
      }
      switch (other.getTypeCase()) {
        case POKEMON_ID: {
          setPokemonIdValue(other.getPokemonIdValue());
          break;
        }
        case USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION: {
          setUseQuestPokemonEncounterDistribuition(other.getUseQuestPokemonEncounterDistribuition());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
      POGOProtos.Rpc.PokemonEncounterRewardProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonEncounterRewardProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    @java.lang.Override
    public int getPokemonIdValue() {
      if (typeCase_ == 1) {
        return ((java.lang.Integer) type_).intValue();
      }
      return 0;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      typeCase_ = 1;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      if (typeCase_ == 1) {
        @SuppressWarnings("deprecation")
        POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(
            (java.lang.Integer) type_);
        return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
      }
      return POGOProtos.Rpc.HoloPokemonId.MISSINGNO;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      typeCase_ = 1;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      if (typeCase_ == 1) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @return The useQuestPokemonEncounterDistribuition.
     */
    public boolean getUseQuestPokemonEncounterDistribuition() {
      if (typeCase_ == 2) {
        return (java.lang.Boolean) type_;
      }
      return false;
    }
    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @param value The useQuestPokemonEncounterDistribuition to set.
     * @return This builder for chaining.
     */
    public Builder setUseQuestPokemonEncounterDistribuition(boolean value) {
      typeCase_ = 2;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseQuestPokemonEncounterDistribuition() {
      if (typeCase_ == 2) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> pokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     * @return Whether the pokemonDisplay field is set.
     */
    public boolean hasPokemonDisplay() {
      return pokemonDisplayBuilder_ != null || pokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     * @return The pokemonDisplay.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      } else {
        return pokemonDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public Builder setPokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemonDisplay_ = value;
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public Builder setPokemonDisplay(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public Builder mergePokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (pokemonDisplay_ != null) {
          pokemonDisplay_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(pokemonDisplay_).mergeFrom(value).buildPartial();
        } else {
          pokemonDisplay_ = value;
        }
        onChanged();
      } else {
        pokemonDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public Builder clearPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
        onChanged();
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPokemonDisplayBuilder() {
      
      onChanged();
      return getPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
      if (pokemonDisplayBuilder_ != null) {
        return pokemonDisplayBuilder_.getMessageOrBuilder();
      } else {
        return pokemonDisplay_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getPokemonDisplayFieldBuilder() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getPokemonDisplay(),
                getParentForChildren(),
                isClean());
        pokemonDisplay_ = null;
      }
      return pokemonDisplayBuilder_;
    }

    private boolean isHiddenDitto_ ;
    /**
     * <code>bool is_hidden_ditto = 4;</code>
     * @return The isHiddenDitto.
     */
    @java.lang.Override
    public boolean getIsHiddenDitto() {
      return isHiddenDitto_;
    }
    /**
     * <code>bool is_hidden_ditto = 4;</code>
     * @param value The isHiddenDitto to set.
     * @return This builder for chaining.
     */
    public Builder setIsHiddenDitto(boolean value) {
      
      isHiddenDitto_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_hidden_ditto = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsHiddenDitto() {
      
      isHiddenDitto_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto dittoDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> dittoDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     * @return Whether the dittoDisplay field is set.
     */
    public boolean hasDittoDisplay() {
      return dittoDisplayBuilder_ != null || dittoDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     * @return The dittoDisplay.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getDittoDisplay() {
      if (dittoDisplayBuilder_ == null) {
        return dittoDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dittoDisplay_;
      } else {
        return dittoDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public Builder setDittoDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (dittoDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dittoDisplay_ = value;
        onChanged();
      } else {
        dittoDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public Builder setDittoDisplay(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (dittoDisplayBuilder_ == null) {
        dittoDisplay_ = builderForValue.build();
        onChanged();
      } else {
        dittoDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public Builder mergeDittoDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (dittoDisplayBuilder_ == null) {
        if (dittoDisplay_ != null) {
          dittoDisplay_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(dittoDisplay_).mergeFrom(value).buildPartial();
        } else {
          dittoDisplay_ = value;
        }
        onChanged();
      } else {
        dittoDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public Builder clearDittoDisplay() {
      if (dittoDisplayBuilder_ == null) {
        dittoDisplay_ = null;
        onChanged();
      } else {
        dittoDisplay_ = null;
        dittoDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getDittoDisplayBuilder() {
      
      onChanged();
      return getDittoDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getDittoDisplayOrBuilder() {
      if (dittoDisplayBuilder_ != null) {
        return dittoDisplayBuilder_.getMessageOrBuilder();
      } else {
        return dittoDisplay_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dittoDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto ditto_display = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getDittoDisplayFieldBuilder() {
      if (dittoDisplayBuilder_ == null) {
        dittoDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getDittoDisplay(),
                getParentForChildren(),
                isClean());
        dittoDisplay_ = null;
      }
      return dittoDisplayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonEncounterRewardProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonEncounterRewardProto)
  private static final POGOProtos.Rpc.PokemonEncounterRewardProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonEncounterRewardProto();
  }

  public static POGOProtos.Rpc.PokemonEncounterRewardProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonEncounterRewardProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonEncounterRewardProto>() {
    @java.lang.Override
    public PokemonEncounterRewardProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonEncounterRewardProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonEncounterRewardProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonEncounterRewardProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonEncounterRewardProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

