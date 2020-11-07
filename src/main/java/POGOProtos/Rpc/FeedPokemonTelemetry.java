// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FeedPokemonTelemetry}
 */
public final class FeedPokemonTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FeedPokemonTelemetry)
    FeedPokemonTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedPokemonTelemetry.newBuilder() to construct.
  private FeedPokemonTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedPokemonTelemetry() {
    gymId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedPokemonTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedPokemonTelemetry(
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

            status_ = input.readInt32();
            break;
          }
          case 18: {
            POGOProtos.Rpc.PokemonTelemetry.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Rpc.PokemonTelemetry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            gymId_ = s;
            break;
          }
          case 32: {

            team_ = input.readInt32();
            break;
          }
          case 40: {

            defenderCount_ = input.readInt32();
            break;
          }
          case 48: {

            motivation_ = input.readInt32();
            break;
          }
          case 56: {

            cpNow_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FeedPokemonTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FeedPokemonTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FeedPokemonTelemetry.class, POGOProtos.Rpc.FeedPokemonTelemetry.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int POKEMON_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonTelemetry pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  @java.lang.Override
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   * @return The pokemon.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTelemetry getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int GYM_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  @java.lang.Override
  public java.lang.String getGymId() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gymId_ = s;
      return s;
    }
  }
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGymIdBytes() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gymId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEAM_FIELD_NUMBER = 4;
  private int team_;
  /**
   * <code>int32 team = 4;</code>
   * @return The team.
   */
  @java.lang.Override
  public int getTeam() {
    return team_;
  }

  public static final int DEFENDER_COUNT_FIELD_NUMBER = 5;
  private int defenderCount_;
  /**
   * <code>int32 defender_count = 5;</code>
   * @return The defenderCount.
   */
  @java.lang.Override
  public int getDefenderCount() {
    return defenderCount_;
  }

  public static final int MOTIVATION_FIELD_NUMBER = 6;
  private int motivation_;
  /**
   * <code>int32 motivation = 6;</code>
   * @return The motivation.
   */
  @java.lang.Override
  public int getMotivation() {
    return motivation_;
  }

  public static final int CP_NOW_FIELD_NUMBER = 7;
  private int cpNow_;
  /**
   * <code>int32 cp_now = 7;</code>
   * @return The cpNow.
   */
  @java.lang.Override
  public int getCpNow() {
    return cpNow_;
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
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    if (pokemon_ != null) {
      output.writeMessage(2, getPokemon());
    }
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gymId_);
    }
    if (team_ != 0) {
      output.writeInt32(4, team_);
    }
    if (defenderCount_ != 0) {
      output.writeInt32(5, defenderCount_);
    }
    if (motivation_ != 0) {
      output.writeInt32(6, motivation_);
    }
    if (cpNow_ != 0) {
      output.writeInt32(7, cpNow_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (pokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemon());
    }
    if (!getGymIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gymId_);
    }
    if (team_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, team_);
    }
    if (defenderCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, defenderCount_);
    }
    if (motivation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, motivation_);
    }
    if (cpNow_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, cpNow_);
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
    if (!(obj instanceof POGOProtos.Rpc.FeedPokemonTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FeedPokemonTelemetry other = (POGOProtos.Rpc.FeedPokemonTelemetry) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (getTeam()
        != other.getTeam()) return false;
    if (getDefenderCount()
        != other.getDefenderCount()) return false;
    if (getMotivation()
        != other.getMotivation()) return false;
    if (getCpNow()
        != other.getCpNow()) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    if (hasPokemon()) {
      hash = (37 * hash) + POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getPokemon().hashCode();
    }
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
    hash = (37 * hash) + TEAM_FIELD_NUMBER;
    hash = (53 * hash) + getTeam();
    hash = (37 * hash) + DEFENDER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDefenderCount();
    hash = (37 * hash) + MOTIVATION_FIELD_NUMBER;
    hash = (53 * hash) + getMotivation();
    hash = (37 * hash) + CP_NOW_FIELD_NUMBER;
    hash = (53 * hash) + getCpNow();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FeedPokemonTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FeedPokemonTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FeedPokemonTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FeedPokemonTelemetry)
      POGOProtos.Rpc.FeedPokemonTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FeedPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FeedPokemonTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FeedPokemonTelemetry.class, POGOProtos.Rpc.FeedPokemonTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FeedPokemonTelemetry.newBuilder()
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
      status_ = 0;

      if (pokemonBuilder_ == null) {
        pokemon_ = null;
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }
      gymId_ = "";

      team_ = 0;

      defenderCount_ = 0;

      motivation_ = 0;

      cpNow_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FeedPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FeedPokemonTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.FeedPokemonTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FeedPokemonTelemetry build() {
      POGOProtos.Rpc.FeedPokemonTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FeedPokemonTelemetry buildPartial() {
      POGOProtos.Rpc.FeedPokemonTelemetry result = new POGOProtos.Rpc.FeedPokemonTelemetry(this);
      result.status_ = status_;
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      result.gymId_ = gymId_;
      result.team_ = team_;
      result.defenderCount_ = defenderCount_;
      result.motivation_ = motivation_;
      result.cpNow_ = cpNow_;
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
      if (other instanceof POGOProtos.Rpc.FeedPokemonTelemetry) {
        return mergeFrom((POGOProtos.Rpc.FeedPokemonTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FeedPokemonTelemetry other) {
      if (other == POGOProtos.Rpc.FeedPokemonTelemetry.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
        onChanged();
      }
      if (other.getTeam() != 0) {
        setTeam(other.getTeam());
      }
      if (other.getDefenderCount() != 0) {
        setDefenderCount(other.getDefenderCount());
      }
      if (other.getMotivation() != 0) {
        setMotivation(other.getMotivation());
      }
      if (other.getCpNow() != 0) {
        setCpNow(other.getCpNow());
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
      POGOProtos.Rpc.FeedPokemonTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FeedPokemonTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonTelemetry pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.PokemonTelemetry getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public Builder setPokemon(POGOProtos.Rpc.PokemonTelemetry value) {
      if (pokemonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemon_ = value;
        onChanged();
      } else {
        pokemonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public Builder setPokemon(
        POGOProtos.Rpc.PokemonTelemetry.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public Builder mergePokemon(POGOProtos.Rpc.PokemonTelemetry value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Rpc.PokemonTelemetry.newBuilder(pokemon_).mergeFrom(value).buildPartial();
        } else {
          pokemon_ = value;
        }
        onChanged();
      } else {
        pokemonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public Builder clearPokemon() {
      if (pokemonBuilder_ == null) {
        pokemon_ = null;
        onChanged();
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTelemetry.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    public POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
    }

    private java.lang.Object gymId_ = "";
    /**
     * <code>string gym_id = 3;</code>
     * @return The gymId.
     */
    public java.lang.String getGymId() {
      java.lang.Object ref = gymId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gymId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gym_id = 3;</code>
     * @return The bytes for gymId.
     */
    public com.google.protobuf.ByteString
        getGymIdBytes() {
      java.lang.Object ref = gymId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gymId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gym_id = 3;</code>
     * @param value The gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gymId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymId() {
      
      gymId_ = getDefaultInstance().getGymId();
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 3;</code>
     * @param value The bytes for gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gymId_ = value;
      onChanged();
      return this;
    }

    private int team_ ;
    /**
     * <code>int32 team = 4;</code>
     * @return The team.
     */
    @java.lang.Override
    public int getTeam() {
      return team_;
    }
    /**
     * <code>int32 team = 4;</code>
     * @param value The team to set.
     * @return This builder for chaining.
     */
    public Builder setTeam(int value) {
      
      team_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 team = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeam() {
      
      team_ = 0;
      onChanged();
      return this;
    }

    private int defenderCount_ ;
    /**
     * <code>int32 defender_count = 5;</code>
     * @return The defenderCount.
     */
    @java.lang.Override
    public int getDefenderCount() {
      return defenderCount_;
    }
    /**
     * <code>int32 defender_count = 5;</code>
     * @param value The defenderCount to set.
     * @return This builder for chaining.
     */
    public Builder setDefenderCount(int value) {
      
      defenderCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 defender_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefenderCount() {
      
      defenderCount_ = 0;
      onChanged();
      return this;
    }

    private int motivation_ ;
    /**
     * <code>int32 motivation = 6;</code>
     * @return The motivation.
     */
    @java.lang.Override
    public int getMotivation() {
      return motivation_;
    }
    /**
     * <code>int32 motivation = 6;</code>
     * @param value The motivation to set.
     * @return This builder for chaining.
     */
    public Builder setMotivation(int value) {
      
      motivation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 motivation = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMotivation() {
      
      motivation_ = 0;
      onChanged();
      return this;
    }

    private int cpNow_ ;
    /**
     * <code>int32 cp_now = 7;</code>
     * @return The cpNow.
     */
    @java.lang.Override
    public int getCpNow() {
      return cpNow_;
    }
    /**
     * <code>int32 cp_now = 7;</code>
     * @param value The cpNow to set.
     * @return This builder for chaining.
     */
    public Builder setCpNow(int value) {
      
      cpNow_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cp_now = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpNow() {
      
      cpNow_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FeedPokemonTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FeedPokemonTelemetry)
  private static final POGOProtos.Rpc.FeedPokemonTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FeedPokemonTelemetry();
  }

  public static POGOProtos.Rpc.FeedPokemonTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedPokemonTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<FeedPokemonTelemetry>() {
    @java.lang.Override
    public FeedPokemonTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedPokemonTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedPokemonTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedPokemonTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FeedPokemonTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

