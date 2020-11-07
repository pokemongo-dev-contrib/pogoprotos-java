// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ShadowAttributesProto}
 */
public final class ShadowAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ShadowAttributesProto)
    ShadowAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShadowAttributesProto.newBuilder() to construct.
  private ShadowAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShadowAttributesProto() {
    purifiedChargeMove_ = 0;
    shadowChargeMove_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShadowAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShadowAttributesProto(
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

            purificationStardustNeeded_ = input.readUInt32();
            break;
          }
          case 16: {

            purificationCandyNeeded_ = input.readUInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            purifiedChargeMove_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            shadowChargeMove_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ShadowAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ShadowAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ShadowAttributesProto.class, POGOProtos.Rpc.ShadowAttributesProto.Builder.class);
  }

  public static final int PURIFICATION_STARDUST_NEEDED_FIELD_NUMBER = 1;
  private int purificationStardustNeeded_;
  /**
   * <code>uint32 purification_stardust_needed = 1;</code>
   * @return The purificationStardustNeeded.
   */
  @java.lang.Override
  public int getPurificationStardustNeeded() {
    return purificationStardustNeeded_;
  }

  public static final int PURIFICATION_CANDY_NEEDED_FIELD_NUMBER = 2;
  private int purificationCandyNeeded_;
  /**
   * <code>uint32 purification_candy_needed = 2;</code>
   * @return The purificationCandyNeeded.
   */
  @java.lang.Override
  public int getPurificationCandyNeeded() {
    return purificationCandyNeeded_;
  }

  public static final int PURIFIED_CHARGE_MOVE_FIELD_NUMBER = 3;
  private int purifiedChargeMove_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
   * @return The enum numeric value on the wire for purifiedChargeMove.
   */
  @java.lang.Override public int getPurifiedChargeMoveValue() {
    return purifiedChargeMove_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
   * @return The purifiedChargeMove.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonMove getPurifiedChargeMove() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(purifiedChargeMove_);
    return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
  }

  public static final int SHADOW_CHARGE_MOVE_FIELD_NUMBER = 4;
  private int shadowChargeMove_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
   * @return The enum numeric value on the wire for shadowChargeMove.
   */
  @java.lang.Override public int getShadowChargeMoveValue() {
    return shadowChargeMove_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
   * @return The shadowChargeMove.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonMove getShadowChargeMove() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(shadowChargeMove_);
    return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
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
    if (purificationStardustNeeded_ != 0) {
      output.writeUInt32(1, purificationStardustNeeded_);
    }
    if (purificationCandyNeeded_ != 0) {
      output.writeUInt32(2, purificationCandyNeeded_);
    }
    if (purifiedChargeMove_ != POGOProtos.Rpc.HoloPokemonMove.HOLO_POKEMON_MOVE_MOVE_UNSET.getNumber()) {
      output.writeEnum(3, purifiedChargeMove_);
    }
    if (shadowChargeMove_ != POGOProtos.Rpc.HoloPokemonMove.HOLO_POKEMON_MOVE_MOVE_UNSET.getNumber()) {
      output.writeEnum(4, shadowChargeMove_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (purificationStardustNeeded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, purificationStardustNeeded_);
    }
    if (purificationCandyNeeded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, purificationCandyNeeded_);
    }
    if (purifiedChargeMove_ != POGOProtos.Rpc.HoloPokemonMove.HOLO_POKEMON_MOVE_MOVE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, purifiedChargeMove_);
    }
    if (shadowChargeMove_ != POGOProtos.Rpc.HoloPokemonMove.HOLO_POKEMON_MOVE_MOVE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, shadowChargeMove_);
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
    if (!(obj instanceof POGOProtos.Rpc.ShadowAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ShadowAttributesProto other = (POGOProtos.Rpc.ShadowAttributesProto) obj;

    if (getPurificationStardustNeeded()
        != other.getPurificationStardustNeeded()) return false;
    if (getPurificationCandyNeeded()
        != other.getPurificationCandyNeeded()) return false;
    if (purifiedChargeMove_ != other.purifiedChargeMove_) return false;
    if (shadowChargeMove_ != other.shadowChargeMove_) return false;
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
    hash = (37 * hash) + PURIFICATION_STARDUST_NEEDED_FIELD_NUMBER;
    hash = (53 * hash) + getPurificationStardustNeeded();
    hash = (37 * hash) + PURIFICATION_CANDY_NEEDED_FIELD_NUMBER;
    hash = (53 * hash) + getPurificationCandyNeeded();
    hash = (37 * hash) + PURIFIED_CHARGE_MOVE_FIELD_NUMBER;
    hash = (53 * hash) + purifiedChargeMove_;
    hash = (37 * hash) + SHADOW_CHARGE_MOVE_FIELD_NUMBER;
    hash = (53 * hash) + shadowChargeMove_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShadowAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ShadowAttributesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ShadowAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ShadowAttributesProto)
      POGOProtos.Rpc.ShadowAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ShadowAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ShadowAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ShadowAttributesProto.class, POGOProtos.Rpc.ShadowAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ShadowAttributesProto.newBuilder()
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
      purificationStardustNeeded_ = 0;

      purificationCandyNeeded_ = 0;

      purifiedChargeMove_ = 0;

      shadowChargeMove_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ShadowAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShadowAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ShadowAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShadowAttributesProto build() {
      POGOProtos.Rpc.ShadowAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShadowAttributesProto buildPartial() {
      POGOProtos.Rpc.ShadowAttributesProto result = new POGOProtos.Rpc.ShadowAttributesProto(this);
      result.purificationStardustNeeded_ = purificationStardustNeeded_;
      result.purificationCandyNeeded_ = purificationCandyNeeded_;
      result.purifiedChargeMove_ = purifiedChargeMove_;
      result.shadowChargeMove_ = shadowChargeMove_;
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
      if (other instanceof POGOProtos.Rpc.ShadowAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.ShadowAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ShadowAttributesProto other) {
      if (other == POGOProtos.Rpc.ShadowAttributesProto.getDefaultInstance()) return this;
      if (other.getPurificationStardustNeeded() != 0) {
        setPurificationStardustNeeded(other.getPurificationStardustNeeded());
      }
      if (other.getPurificationCandyNeeded() != 0) {
        setPurificationCandyNeeded(other.getPurificationCandyNeeded());
      }
      if (other.purifiedChargeMove_ != 0) {
        setPurifiedChargeMoveValue(other.getPurifiedChargeMoveValue());
      }
      if (other.shadowChargeMove_ != 0) {
        setShadowChargeMoveValue(other.getShadowChargeMoveValue());
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
      POGOProtos.Rpc.ShadowAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ShadowAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int purificationStardustNeeded_ ;
    /**
     * <code>uint32 purification_stardust_needed = 1;</code>
     * @return The purificationStardustNeeded.
     */
    @java.lang.Override
    public int getPurificationStardustNeeded() {
      return purificationStardustNeeded_;
    }
    /**
     * <code>uint32 purification_stardust_needed = 1;</code>
     * @param value The purificationStardustNeeded to set.
     * @return This builder for chaining.
     */
    public Builder setPurificationStardustNeeded(int value) {
      
      purificationStardustNeeded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 purification_stardust_needed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurificationStardustNeeded() {
      
      purificationStardustNeeded_ = 0;
      onChanged();
      return this;
    }

    private int purificationCandyNeeded_ ;
    /**
     * <code>uint32 purification_candy_needed = 2;</code>
     * @return The purificationCandyNeeded.
     */
    @java.lang.Override
    public int getPurificationCandyNeeded() {
      return purificationCandyNeeded_;
    }
    /**
     * <code>uint32 purification_candy_needed = 2;</code>
     * @param value The purificationCandyNeeded to set.
     * @return This builder for chaining.
     */
    public Builder setPurificationCandyNeeded(int value) {
      
      purificationCandyNeeded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 purification_candy_needed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurificationCandyNeeded() {
      
      purificationCandyNeeded_ = 0;
      onChanged();
      return this;
    }

    private int purifiedChargeMove_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
     * @return The enum numeric value on the wire for purifiedChargeMove.
     */
    @java.lang.Override public int getPurifiedChargeMoveValue() {
      return purifiedChargeMove_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
     * @param value The enum numeric value on the wire for purifiedChargeMove to set.
     * @return This builder for chaining.
     */
    public Builder setPurifiedChargeMoveValue(int value) {
      
      purifiedChargeMove_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
     * @return The purifiedChargeMove.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonMove getPurifiedChargeMove() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(purifiedChargeMove_);
      return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
     * @param value The purifiedChargeMove to set.
     * @return This builder for chaining.
     */
    public Builder setPurifiedChargeMove(POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      purifiedChargeMove_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove purified_charge_move = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurifiedChargeMove() {
      
      purifiedChargeMove_ = 0;
      onChanged();
      return this;
    }

    private int shadowChargeMove_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
     * @return The enum numeric value on the wire for shadowChargeMove.
     */
    @java.lang.Override public int getShadowChargeMoveValue() {
      return shadowChargeMove_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
     * @param value The enum numeric value on the wire for shadowChargeMove to set.
     * @return This builder for chaining.
     */
    public Builder setShadowChargeMoveValue(int value) {
      
      shadowChargeMove_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
     * @return The shadowChargeMove.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonMove getShadowChargeMove() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(shadowChargeMove_);
      return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
     * @param value The shadowChargeMove to set.
     * @return This builder for chaining.
     */
    public Builder setShadowChargeMove(POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shadowChargeMove_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove shadow_charge_move = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShadowChargeMove() {
      
      shadowChargeMove_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ShadowAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ShadowAttributesProto)
  private static final POGOProtos.Rpc.ShadowAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ShadowAttributesProto();
  }

  public static POGOProtos.Rpc.ShadowAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShadowAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<ShadowAttributesProto>() {
    @java.lang.Override
    public ShadowAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShadowAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShadowAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShadowAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ShadowAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

