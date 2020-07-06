// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NearbyPokemonProto}
 */
public  final class NearbyPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NearbyPokemonProto)
    NearbyPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NearbyPokemonProto.newBuilder() to construct.
  private NearbyPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NearbyPokemonProto() {
    fortId_ = "";
    fortImageUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NearbyPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NearbyPokemonProto(
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

            pokedexNumber_ = input.readInt32();
            break;
          }
          case 21: {

            distanceMeters_ = input.readFloat();
            break;
          }
          case 25: {

            encounterId_ = input.readFixed64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fortImageUrl_ = s;
            break;
          }
          case 50: {
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NearbyPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NearbyPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NearbyPokemonProto.class, POGOProtos.Rpc.NearbyPokemonProto.Builder.class);
  }

  public static final int POKEDEX_NUMBER_FIELD_NUMBER = 1;
  private int pokedexNumber_;
  /**
   * <code>int32 pokedex_number = 1;</code>
   * @return The pokedexNumber.
   */
  public int getPokedexNumber() {
    return pokedexNumber_;
  }

  public static final int DISTANCE_METERS_FIELD_NUMBER = 2;
  private float distanceMeters_;
  /**
   * <code>float distance_meters = 2;</code>
   * @return The distanceMeters.
   */
  public float getDistanceMeters() {
    return distanceMeters_;
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 3;
  private long encounterId_;
  /**
   * <code>fixed64 encounter_id = 3;</code>
   * @return The encounterId.
   */
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int FORT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 4;</code>
   * @return The fortId.
   */
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 4;</code>
   * @return The bytes for fortId.
   */
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_IMAGE_URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object fortImageUrl_;
  /**
   * <code>string fort_image_url = 5;</code>
   * @return The fortImageUrl.
   */
  public java.lang.String getFortImageUrl() {
    java.lang.Object ref = fortImageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortImageUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_image_url = 5;</code>
   * @return The bytes for fortImageUrl.
   */
  public com.google.protobuf.ByteString
      getFortImageUrlBytes() {
    java.lang.Object ref = fortImageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortImageUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POKEMON_DISPLAY_FIELD_NUMBER = 6;
  private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  public boolean hasPokemonDisplay() {
    return pokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   * @return The pokemonDisplay.
   */
  public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
    return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
   */
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
    return getPokemonDisplay();
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
    if (pokedexNumber_ != 0) {
      output.writeInt32(1, pokedexNumber_);
    }
    if (distanceMeters_ != 0F) {
      output.writeFloat(2, distanceMeters_);
    }
    if (encounterId_ != 0L) {
      output.writeFixed64(3, encounterId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fortId_);
    }
    if (!getFortImageUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fortImageUrl_);
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(6, getPokemonDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokedexNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pokedexNumber_);
    }
    if (distanceMeters_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, distanceMeters_);
    }
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(3, encounterId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fortId_);
    }
    if (!getFortImageUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fortImageUrl_);
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getPokemonDisplay());
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
    if (!(obj instanceof POGOProtos.Rpc.NearbyPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NearbyPokemonProto other = (POGOProtos.Rpc.NearbyPokemonProto) obj;

    if (getPokedexNumber()
        != other.getPokedexNumber()) return false;
    if (java.lang.Float.floatToIntBits(getDistanceMeters())
        != java.lang.Float.floatToIntBits(
            other.getDistanceMeters())) return false;
    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (!getFortImageUrl()
        .equals(other.getFortImageUrl())) return false;
    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
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
    hash = (37 * hash) + POKEDEX_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPokedexNumber();
    hash = (37 * hash) + DISTANCE_METERS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDistanceMeters());
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + FORT_IMAGE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getFortImageUrl().hashCode();
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NearbyPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NearbyPokemonProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NearbyPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NearbyPokemonProto)
      POGOProtos.Rpc.NearbyPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NearbyPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NearbyPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NearbyPokemonProto.class, POGOProtos.Rpc.NearbyPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NearbyPokemonProto.newBuilder()
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
      pokedexNumber_ = 0;

      distanceMeters_ = 0F;

      encounterId_ = 0L;

      fortId_ = "";

      fortImageUrl_ = "";

      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NearbyPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NearbyPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.NearbyPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NearbyPokemonProto build() {
      POGOProtos.Rpc.NearbyPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NearbyPokemonProto buildPartial() {
      POGOProtos.Rpc.NearbyPokemonProto result = new POGOProtos.Rpc.NearbyPokemonProto(this);
      result.pokedexNumber_ = pokedexNumber_;
      result.distanceMeters_ = distanceMeters_;
      result.encounterId_ = encounterId_;
      result.fortId_ = fortId_;
      result.fortImageUrl_ = fortImageUrl_;
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NearbyPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.NearbyPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NearbyPokemonProto other) {
      if (other == POGOProtos.Rpc.NearbyPokemonProto.getDefaultInstance()) return this;
      if (other.getPokedexNumber() != 0) {
        setPokedexNumber(other.getPokedexNumber());
      }
      if (other.getDistanceMeters() != 0F) {
        setDistanceMeters(other.getDistanceMeters());
      }
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (!other.getFortImageUrl().isEmpty()) {
        fortImageUrl_ = other.fortImageUrl_;
        onChanged();
      }
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
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
      POGOProtos.Rpc.NearbyPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NearbyPokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokedexNumber_ ;
    /**
     * <code>int32 pokedex_number = 1;</code>
     * @return The pokedexNumber.
     */
    public int getPokedexNumber() {
      return pokedexNumber_;
    }
    /**
     * <code>int32 pokedex_number = 1;</code>
     * @param value The pokedexNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexNumber(int value) {
      
      pokedexNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pokedex_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokedexNumber() {
      
      pokedexNumber_ = 0;
      onChanged();
      return this;
    }

    private float distanceMeters_ ;
    /**
     * <code>float distance_meters = 2;</code>
     * @return The distanceMeters.
     */
    public float getDistanceMeters() {
      return distanceMeters_;
    }
    /**
     * <code>float distance_meters = 2;</code>
     * @param value The distanceMeters to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceMeters(float value) {
      
      distanceMeters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float distance_meters = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceMeters() {
      
      distanceMeters_ = 0F;
      onChanged();
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>fixed64 encounter_id = 3;</code>
     * @return The encounterId.
     */
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>fixed64 encounter_id = 3;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 encounter_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 4;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 4;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 4;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 4;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fortImageUrl_ = "";
    /**
     * <code>string fort_image_url = 5;</code>
     * @return The fortImageUrl.
     */
    public java.lang.String getFortImageUrl() {
      java.lang.Object ref = fortImageUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortImageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_image_url = 5;</code>
     * @return The bytes for fortImageUrl.
     */
    public com.google.protobuf.ByteString
        getFortImageUrlBytes() {
      java.lang.Object ref = fortImageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortImageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_image_url = 5;</code>
     * @param value The fortImageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setFortImageUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortImageUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_image_url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortImageUrl() {
      
      fortImageUrl_ = getDefaultInstance().getFortImageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_image_url = 5;</code>
     * @param value The bytes for fortImageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setFortImageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortImageUrl_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> pokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
     * @return Whether the pokemonDisplay field is set.
     */
    public boolean hasPokemonDisplay() {
      return pokemonDisplayBuilder_ != null || pokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPokemonDisplayBuilder() {
      
      onChanged();
      return getPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NearbyPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NearbyPokemonProto)
  private static final POGOProtos.Rpc.NearbyPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NearbyPokemonProto();
  }

  public static POGOProtos.Rpc.NearbyPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NearbyPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<NearbyPokemonProto>() {
    @java.lang.Override
    public NearbyPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NearbyPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NearbyPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NearbyPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NearbyPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
