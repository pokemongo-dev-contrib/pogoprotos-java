// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GymEventProto}
 */
public final class GymEventProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GymEventProto)
    GymEventProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymEventProto.newBuilder() to construct.
  private GymEventProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymEventProto() {
    trainer_ = "";
    event_ = 0;
    pokedexId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymEventProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymEventProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            trainer_ = s;
            break;
          }
          case 16: {

            timestampMs_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            event_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            pokedexId_ = rawValue;
            break;
          }
          case 41: {

            pokemonId_ = input.readFixed64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymEventProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymEventProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GymEventProto.class, POGOProtos.Rpc.GymEventProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GymEventProto.Event}
   */
  public enum Event
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>POKEMON_FED = 1;</code>
     */
    POKEMON_FED(1),
    /**
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    POKEMON_DEPLOYED(2),
    /**
     * <code>POKEMON_RETURNED = 3;</code>
     */
    POKEMON_RETURNED(3),
    /**
     * <code>BATTLE_WON = 4;</code>
     */
    BATTLE_WON(4),
    /**
     * <code>BATTLE_LOSS = 5;</code>
     */
    BATTLE_LOSS(5),
    /**
     * <code>RAID_STARTED = 6;</code>
     */
    RAID_STARTED(6),
    /**
     * <code>RAID_ENDED = 7;</code>
     */
    RAID_ENDED(7),
    /**
     * <code>GYM_NEUTRALIZED = 8;</code>
     */
    GYM_NEUTRALIZED(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>POKEMON_FED = 1;</code>
     */
    public static final int POKEMON_FED_VALUE = 1;
    /**
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    public static final int POKEMON_DEPLOYED_VALUE = 2;
    /**
     * <code>POKEMON_RETURNED = 3;</code>
     */
    public static final int POKEMON_RETURNED_VALUE = 3;
    /**
     * <code>BATTLE_WON = 4;</code>
     */
    public static final int BATTLE_WON_VALUE = 4;
    /**
     * <code>BATTLE_LOSS = 5;</code>
     */
    public static final int BATTLE_LOSS_VALUE = 5;
    /**
     * <code>RAID_STARTED = 6;</code>
     */
    public static final int RAID_STARTED_VALUE = 6;
    /**
     * <code>RAID_ENDED = 7;</code>
     */
    public static final int RAID_ENDED_VALUE = 7;
    /**
     * <code>GYM_NEUTRALIZED = 8;</code>
     */
    public static final int GYM_NEUTRALIZED_VALUE = 8;


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
    public static Event valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Event forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return POKEMON_FED;
        case 2: return POKEMON_DEPLOYED;
        case 3: return POKEMON_RETURNED;
        case 4: return BATTLE_WON;
        case 5: return BATTLE_LOSS;
        case 6: return RAID_STARTED;
        case 7: return RAID_ENDED;
        case 8: return GYM_NEUTRALIZED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Event>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Event> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Event>() {
            public Event findValueByNumber(int number) {
              return Event.forNumber(number);
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
      return POGOProtos.Rpc.GymEventProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Event[] VALUES = values();

    public static Event valueOf(
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

    private Event(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GymEventProto.Event)
  }

  public static final int TRAINER_FIELD_NUMBER = 1;
  private volatile java.lang.Object trainer_;
  /**
   * <code>string trainer = 1;</code>
   * @return The trainer.
   */
  @java.lang.Override
  public java.lang.String getTrainer() {
    java.lang.Object ref = trainer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trainer_ = s;
      return s;
    }
  }
  /**
   * <code>string trainer = 1;</code>
   * @return The bytes for trainer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTrainerBytes() {
    java.lang.Object ref = trainer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trainer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long timestampMs_;
  /**
   * <code>int64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  @java.lang.Override
  public long getTimestampMs() {
    return timestampMs_;
  }

  public static final int EVENT_FIELD_NUMBER = 3;
  private int event_;
  /**
   * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
   * @return The enum numeric value on the wire for event.
   */
  @java.lang.Override public int getEventValue() {
    return event_;
  }
  /**
   * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
   * @return The event.
   */
  @java.lang.Override public POGOProtos.Rpc.GymEventProto.Event getEvent() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GymEventProto.Event result = POGOProtos.Rpc.GymEventProto.Event.valueOf(event_);
    return result == null ? POGOProtos.Rpc.GymEventProto.Event.UNRECOGNIZED : result;
  }

  public static final int POKEDEX_ID_FIELD_NUMBER = 4;
  private int pokedexId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
   * @return The enum numeric value on the wire for pokedexId.
   */
  @java.lang.Override public int getPokedexIdValue() {
    return pokedexId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
   * @return The pokedexId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 5;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
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
    if (!getTrainerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trainer_);
    }
    if (timestampMs_ != 0L) {
      output.writeInt64(2, timestampMs_);
    }
    if (event_ != POGOProtos.Rpc.GymEventProto.Event.UNKNOWN.getNumber()) {
      output.writeEnum(3, event_);
    }
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(4, pokedexId_);
    }
    if (pokemonId_ != 0L) {
      output.writeFixed64(5, pokemonId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrainerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trainer_);
    }
    if (timestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestampMs_);
    }
    if (event_ != POGOProtos.Rpc.GymEventProto.Event.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, event_);
    }
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, pokedexId_);
    }
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(5, pokemonId_);
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
    if (!(obj instanceof POGOProtos.Rpc.GymEventProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GymEventProto other = (POGOProtos.Rpc.GymEventProto) obj;

    if (!getTrainer()
        .equals(other.getTrainer())) return false;
    if (getTimestampMs()
        != other.getTimestampMs()) return false;
    if (event_ != other.event_) return false;
    if (pokedexId_ != other.pokedexId_) return false;
    if (getPokemonId()
        != other.getPokemonId()) return false;
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
    hash = (37 * hash) + TRAINER_FIELD_NUMBER;
    hash = (53 * hash) + getTrainer().hashCode();
    hash = (37 * hash) + TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampMs());
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + event_;
    hash = (37 * hash) + POKEDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokedexId_;
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GymEventProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymEventProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymEventProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymEventProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GymEventProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GymEventProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GymEventProto)
      POGOProtos.Rpc.GymEventProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymEventProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GymEventProto.class, POGOProtos.Rpc.GymEventProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GymEventProto.newBuilder()
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
      trainer_ = "";

      timestampMs_ = 0L;

      event_ = 0;

      pokedexId_ = 0;

      pokemonId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymEventProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymEventProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GymEventProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymEventProto build() {
      POGOProtos.Rpc.GymEventProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymEventProto buildPartial() {
      POGOProtos.Rpc.GymEventProto result = new POGOProtos.Rpc.GymEventProto(this);
      result.trainer_ = trainer_;
      result.timestampMs_ = timestampMs_;
      result.event_ = event_;
      result.pokedexId_ = pokedexId_;
      result.pokemonId_ = pokemonId_;
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
      if (other instanceof POGOProtos.Rpc.GymEventProto) {
        return mergeFrom((POGOProtos.Rpc.GymEventProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GymEventProto other) {
      if (other == POGOProtos.Rpc.GymEventProto.getDefaultInstance()) return this;
      if (!other.getTrainer().isEmpty()) {
        trainer_ = other.trainer_;
        onChanged();
      }
      if (other.getTimestampMs() != 0L) {
        setTimestampMs(other.getTimestampMs());
      }
      if (other.event_ != 0) {
        setEventValue(other.getEventValue());
      }
      if (other.pokedexId_ != 0) {
        setPokedexIdValue(other.getPokedexIdValue());
      }
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
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
      POGOProtos.Rpc.GymEventProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GymEventProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object trainer_ = "";
    /**
     * <code>string trainer = 1;</code>
     * @return The trainer.
     */
    public java.lang.String getTrainer() {
      java.lang.Object ref = trainer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trainer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string trainer = 1;</code>
     * @return The bytes for trainer.
     */
    public com.google.protobuf.ByteString
        getTrainerBytes() {
      java.lang.Object ref = trainer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trainer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string trainer = 1;</code>
     * @param value The trainer to set.
     * @return This builder for chaining.
     */
    public Builder setTrainer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      trainer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string trainer = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainer() {
      
      trainer_ = getDefaultInstance().getTrainer();
      onChanged();
      return this;
    }
    /**
     * <code>string trainer = 1;</code>
     * @param value The bytes for trainer to set.
     * @return This builder for chaining.
     */
    public Builder setTrainerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      trainer_ = value;
      onChanged();
      return this;
    }

    private long timestampMs_ ;
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @return The timestampMs.
     */
    @java.lang.Override
    public long getTimestampMs() {
      return timestampMs_;
    }
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @param value The timestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampMs(long value) {
      
      timestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestampMs() {
      
      timestampMs_ = 0L;
      onChanged();
      return this;
    }

    private int event_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
     * @return The enum numeric value on the wire for event.
     */
    @java.lang.Override public int getEventValue() {
      return event_;
    }
    /**
     * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
     * @param value The enum numeric value on the wire for event to set.
     * @return This builder for chaining.
     */
    public Builder setEventValue(int value) {
      
      event_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
     * @return The event.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GymEventProto.Event getEvent() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GymEventProto.Event result = POGOProtos.Rpc.GymEventProto.Event.valueOf(event_);
      return result == null ? POGOProtos.Rpc.GymEventProto.Event.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(POGOProtos.Rpc.GymEventProto.Event value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      event_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymEventProto.Event event = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      
      event_ = 0;
      onChanged();
      return this;
    }

    private int pokedexId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
     * @return The enum numeric value on the wire for pokedexId.
     */
    @java.lang.Override public int getPokedexIdValue() {
      return pokedexId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
     * @param value The enum numeric value on the wire for pokedexId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexIdValue(int value) {
      
      pokedexId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
     * @return The pokedexId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
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
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokedexId() {
      
      pokedexId_ = 0;
      onChanged();
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GymEventProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GymEventProto)
  private static final POGOProtos.Rpc.GymEventProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GymEventProto();
  }

  public static POGOProtos.Rpc.GymEventProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymEventProto>
      PARSER = new com.google.protobuf.AbstractParser<GymEventProto>() {
    @java.lang.Override
    public GymEventProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymEventProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymEventProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymEventProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GymEventProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

