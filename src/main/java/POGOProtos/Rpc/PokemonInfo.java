// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonInfo}
 */
public final class PokemonInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonInfo)
    PokemonInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonInfo.newBuilder() to construct.
  private PokemonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonInfo(
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
            POGOProtos.Rpc.PokemonProto.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Rpc.PokemonProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            currentHealth_ = input.readInt32();
            break;
          }
          case 24: {

            currentEnergy_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonInfo.class, POGOProtos.Rpc.PokemonInfo.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonProto pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  @java.lang.Override
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   * @return The pokemon.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProto getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int CURRENT_HEALTH_FIELD_NUMBER = 2;
  private int currentHealth_;
  /**
   * <code>int32 current_health = 2;</code>
   * @return The currentHealth.
   */
  @java.lang.Override
  public int getCurrentHealth() {
    return currentHealth_;
  }

  public static final int CURRENT_ENERGY_FIELD_NUMBER = 3;
  private int currentEnergy_;
  /**
   * <code>int32 current_energy = 3;</code>
   * @return The currentEnergy.
   */
  @java.lang.Override
  public int getCurrentEnergy() {
    return currentEnergy_;
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
    if (pokemon_ != null) {
      output.writeMessage(1, getPokemon());
    }
    if (currentHealth_ != 0) {
      output.writeInt32(2, currentHealth_);
    }
    if (currentEnergy_ != 0) {
      output.writeInt32(3, currentEnergy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPokemon());
    }
    if (currentHealth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, currentHealth_);
    }
    if (currentEnergy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, currentEnergy_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonInfo)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonInfo other = (POGOProtos.Rpc.PokemonInfo) obj;

    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (getCurrentHealth()
        != other.getCurrentHealth()) return false;
    if (getCurrentEnergy()
        != other.getCurrentEnergy()) return false;
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
    if (hasPokemon()) {
      hash = (37 * hash) + POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getPokemon().hashCode();
    }
    hash = (37 * hash) + CURRENT_HEALTH_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentHealth();
    hash = (37 * hash) + CURRENT_ENERGY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentEnergy();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonInfo parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonInfo prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokemonInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonInfo)
      POGOProtos.Rpc.PokemonInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonInfo.class, POGOProtos.Rpc.PokemonInfo.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonInfo.newBuilder()
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
      if (pokemonBuilder_ == null) {
        pokemon_ = null;
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }
      currentHealth_ = 0;

      currentEnergy_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonInfo_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonInfo getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonInfo.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonInfo build() {
      POGOProtos.Rpc.PokemonInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonInfo buildPartial() {
      POGOProtos.Rpc.PokemonInfo result = new POGOProtos.Rpc.PokemonInfo(this);
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      result.currentHealth_ = currentHealth_;
      result.currentEnergy_ = currentEnergy_;
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
      if (other instanceof POGOProtos.Rpc.PokemonInfo) {
        return mergeFrom((POGOProtos.Rpc.PokemonInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonInfo other) {
      if (other == POGOProtos.Rpc.PokemonInfo.getDefaultInstance()) return this;
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (other.getCurrentHealth() != 0) {
        setCurrentHealth(other.getCurrentHealth());
      }
      if (other.getCurrentEnergy() != 0) {
        setCurrentEnergy(other.getCurrentEnergy());
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
      POGOProtos.Rpc.PokemonInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonProto pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.PokemonProto getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    public Builder setPokemon(POGOProtos.Rpc.PokemonProto value) {
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    public Builder setPokemon(
        POGOProtos.Rpc.PokemonProto.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    public Builder mergePokemon(POGOProtos.Rpc.PokemonProto value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Rpc.PokemonProto.newBuilder(pokemon_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonProto.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
    }

    private int currentHealth_ ;
    /**
     * <code>int32 current_health = 2;</code>
     * @return The currentHealth.
     */
    @java.lang.Override
    public int getCurrentHealth() {
      return currentHealth_;
    }
    /**
     * <code>int32 current_health = 2;</code>
     * @param value The currentHealth to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentHealth(int value) {
      
      currentHealth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_health = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentHealth() {
      
      currentHealth_ = 0;
      onChanged();
      return this;
    }

    private int currentEnergy_ ;
    /**
     * <code>int32 current_energy = 3;</code>
     * @return The currentEnergy.
     */
    @java.lang.Override
    public int getCurrentEnergy() {
      return currentEnergy_;
    }
    /**
     * <code>int32 current_energy = 3;</code>
     * @param value The currentEnergy to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentEnergy(int value) {
      
      currentEnergy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_energy = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentEnergy() {
      
      currentEnergy_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonInfo)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonInfo)
  private static final POGOProtos.Rpc.PokemonInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonInfo();
  }

  public static POGOProtos.Rpc.PokemonInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonInfo>
      PARSER = new com.google.protobuf.AbstractParser<PokemonInfo>() {
    @java.lang.Override
    public PokemonInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

