// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LobbyPokemonProto}
 */
public  final class LobbyPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LobbyPokemonProto)
    LobbyPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LobbyPokemonProto.newBuilder() to construct.
  private LobbyPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LobbyPokemonProto() {
    pokedexId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LobbyPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LobbyPokemonProto(
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

            id_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pokedexId_ = rawValue;
            break;
          }
          case 24: {

            cp_ = input.readInt32();
            break;
          }
          case 37: {

            percentHealth_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LobbyPokemonProto.class, POGOProtos.Rpc.LobbyPokemonProto.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int POKEDEX_ID_FIELD_NUMBER = 2;
  private int pokedexId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @return The enum numeric value on the wire for pokedexId.
   */
  public int getPokedexIdValue() {
    return pokedexId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @return The pokedexId.
   */
  public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int CP_FIELD_NUMBER = 3;
  private int cp_;
  /**
   * <code>int32 cp = 3;</code>
   * @return The cp.
   */
  public int getCp() {
    return cp_;
  }

  public static final int PERCENT_HEALTH_FIELD_NUMBER = 4;
  private float percentHealth_;
  /**
   * <code>float percent_health = 4;</code>
   * @return The percentHealth.
   */
  public float getPercentHealth() {
    return percentHealth_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(2, pokedexId_);
    }
    if (cp_ != 0) {
      output.writeInt32(3, cp_);
    }
    if (percentHealth_ != 0F) {
      output.writeFloat(4, percentHealth_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pokedexId_);
    }
    if (cp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cp_);
    }
    if (percentHealth_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, percentHealth_);
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
    if (!(obj instanceof POGOProtos.Rpc.LobbyPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LobbyPokemonProto other = (POGOProtos.Rpc.LobbyPokemonProto) obj;

    if (getId()
        != other.getId()) return false;
    if (pokedexId_ != other.pokedexId_) return false;
    if (getCp()
        != other.getCp()) return false;
    if (java.lang.Float.floatToIntBits(getPercentHealth())
        != java.lang.Float.floatToIntBits(
            other.getPercentHealth())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + POKEDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokedexId_;
    hash = (37 * hash) + CP_FIELD_NUMBER;
    hash = (53 * hash) + getCp();
    hash = (37 * hash) + PERCENT_HEALTH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPercentHealth());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LobbyPokemonProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LobbyPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LobbyPokemonProto)
      POGOProtos.Rpc.LobbyPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LobbyPokemonProto.class, POGOProtos.Rpc.LobbyPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LobbyPokemonProto.newBuilder()
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
      id_ = 0L;

      pokedexId_ = 0;

      cp_ = 0;

      percentHealth_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.LobbyPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto build() {
      POGOProtos.Rpc.LobbyPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto buildPartial() {
      POGOProtos.Rpc.LobbyPokemonProto result = new POGOProtos.Rpc.LobbyPokemonProto(this);
      result.id_ = id_;
      result.pokedexId_ = pokedexId_;
      result.cp_ = cp_;
      result.percentHealth_ = percentHealth_;
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
      if (other instanceof POGOProtos.Rpc.LobbyPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.LobbyPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LobbyPokemonProto other) {
      if (other == POGOProtos.Rpc.LobbyPokemonProto.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.pokedexId_ != 0) {
        setPokedexIdValue(other.getPokedexIdValue());
      }
      if (other.getCp() != 0) {
        setCp(other.getCp());
      }
      if (other.getPercentHealth() != 0F) {
        setPercentHealth(other.getPercentHealth());
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
      POGOProtos.Rpc.LobbyPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LobbyPokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int pokedexId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
     * @return The enum numeric value on the wire for pokedexId.
     */
    public int getPokedexIdValue() {
      return pokedexId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
     * @param value The enum numeric value on the wire for pokedexId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexIdValue(int value) {
      pokedexId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
     * @return The pokedexId.
     */
    public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
     * @param value The pokedexId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokedexId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokedexId() {
      
      pokedexId_ = 0;
      onChanged();
      return this;
    }

    private int cp_ ;
    /**
     * <code>int32 cp = 3;</code>
     * @return The cp.
     */
    public int getCp() {
      return cp_;
    }
    /**
     * <code>int32 cp = 3;</code>
     * @param value The cp to set.
     * @return This builder for chaining.
     */
    public Builder setCp(int value) {
      
      cp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCp() {
      
      cp_ = 0;
      onChanged();
      return this;
    }

    private float percentHealth_ ;
    /**
     * <code>float percent_health = 4;</code>
     * @return The percentHealth.
     */
    public float getPercentHealth() {
      return percentHealth_;
    }
    /**
     * <code>float percent_health = 4;</code>
     * @param value The percentHealth to set.
     * @return This builder for chaining.
     */
    public Builder setPercentHealth(float value) {
      
      percentHealth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float percent_health = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentHealth() {
      
      percentHealth_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LobbyPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LobbyPokemonProto)
  private static final POGOProtos.Rpc.LobbyPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LobbyPokemonProto();
  }

  public static POGOProtos.Rpc.LobbyPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LobbyPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<LobbyPokemonProto>() {
    @java.lang.Override
    public LobbyPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LobbyPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LobbyPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LobbyPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LobbyPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
