// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonHomeTelemetry}
 */
public final class PokemonHomeTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonHomeTelemetry)
    PokemonHomeTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonHomeTelemetry.newBuilder() to construct.
  private PokemonHomeTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonHomeTelemetry() {
    pokemonHomeClickIds_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonHomeTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonHomeTelemetry(
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

            pokemonHomeClickIds_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonHomeTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonHomeTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonHomeTelemetry.class, POGOProtos.Rpc.PokemonHomeTelemetry.Builder.class);
  }

  public static final int POKEMON_HOME_CLICK_IDS_FIELD_NUMBER = 1;
  private int pokemonHomeClickIds_;
  /**
   * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
   * @return The enum numeric value on the wire for pokemonHomeClickIds.
   */
  @java.lang.Override public int getPokemonHomeClickIdsValue() {
    return pokemonHomeClickIds_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
   * @return The pokemonHomeClickIds.
   */
  @java.lang.Override public POGOProtos.Rpc.PokemonHomeTelemetryIds getPokemonHomeClickIds() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonHomeTelemetryIds result = POGOProtos.Rpc.PokemonHomeTelemetryIds.valueOf(pokemonHomeClickIds_);
    return result == null ? POGOProtos.Rpc.PokemonHomeTelemetryIds.UNRECOGNIZED : result;
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
    if (pokemonHomeClickIds_ != POGOProtos.Rpc.PokemonHomeTelemetryIds.POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT.getNumber()) {
      output.writeEnum(1, pokemonHomeClickIds_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonHomeClickIds_ != POGOProtos.Rpc.PokemonHomeTelemetryIds.POKEMON_HOME_TELEMETRY_IDS_UNDEFINED_POKEMON_HOME_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemonHomeClickIds_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonHomeTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonHomeTelemetry other = (POGOProtos.Rpc.PokemonHomeTelemetry) obj;

    if (pokemonHomeClickIds_ != other.pokemonHomeClickIds_) return false;
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
    hash = (37 * hash) + POKEMON_HOME_CLICK_IDS_FIELD_NUMBER;
    hash = (53 * hash) + pokemonHomeClickIds_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonHomeTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonHomeTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokemonHomeTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonHomeTelemetry)
      POGOProtos.Rpc.PokemonHomeTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonHomeTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonHomeTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonHomeTelemetry.class, POGOProtos.Rpc.PokemonHomeTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonHomeTelemetry.newBuilder()
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
      pokemonHomeClickIds_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonHomeTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonHomeTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonHomeTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonHomeTelemetry build() {
      POGOProtos.Rpc.PokemonHomeTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonHomeTelemetry buildPartial() {
      POGOProtos.Rpc.PokemonHomeTelemetry result = new POGOProtos.Rpc.PokemonHomeTelemetry(this);
      result.pokemonHomeClickIds_ = pokemonHomeClickIds_;
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
      if (other instanceof POGOProtos.Rpc.PokemonHomeTelemetry) {
        return mergeFrom((POGOProtos.Rpc.PokemonHomeTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonHomeTelemetry other) {
      if (other == POGOProtos.Rpc.PokemonHomeTelemetry.getDefaultInstance()) return this;
      if (other.pokemonHomeClickIds_ != 0) {
        setPokemonHomeClickIdsValue(other.getPokemonHomeClickIdsValue());
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
      POGOProtos.Rpc.PokemonHomeTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonHomeTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemonHomeClickIds_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
     * @return The enum numeric value on the wire for pokemonHomeClickIds.
     */
    @java.lang.Override public int getPokemonHomeClickIdsValue() {
      return pokemonHomeClickIds_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
     * @param value The enum numeric value on the wire for pokemonHomeClickIds to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonHomeClickIdsValue(int value) {
      
      pokemonHomeClickIds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
     * @return The pokemonHomeClickIds.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PokemonHomeTelemetryIds getPokemonHomeClickIds() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonHomeTelemetryIds result = POGOProtos.Rpc.PokemonHomeTelemetryIds.valueOf(pokemonHomeClickIds_);
      return result == null ? POGOProtos.Rpc.PokemonHomeTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
     * @param value The pokemonHomeClickIds to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonHomeClickIds(POGOProtos.Rpc.PokemonHomeTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonHomeClickIds_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonHomeTelemetryIds pokemon_home_click_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonHomeClickIds() {
      
      pokemonHomeClickIds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonHomeTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonHomeTelemetry)
  private static final POGOProtos.Rpc.PokemonHomeTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonHomeTelemetry();
  }

  public static POGOProtos.Rpc.PokemonHomeTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonHomeTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<PokemonHomeTelemetry>() {
    @java.lang.Override
    public PokemonHomeTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonHomeTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonHomeTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonHomeTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonHomeTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

