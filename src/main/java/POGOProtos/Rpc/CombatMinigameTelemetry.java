// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CombatMinigameTelemetry}
 */
public final class CombatMinigameTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CombatMinigameTelemetry)
    CombatMinigameTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatMinigameTelemetry.newBuilder() to construct.
  private CombatMinigameTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatMinigameTelemetry() {
    combatType_ = 0;
    moveType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatMinigameTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatMinigameTelemetry(
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

            combatType_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            moveType_ = rawValue;
            break;
          }
          case 29: {

            score_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatMinigameTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatMinigameTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CombatMinigameTelemetry.class, POGOProtos.Rpc.CombatMinigameTelemetry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType}
   */
  public enum MinigameCombatType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>PVP = 1;</code>
     */
    PVP(1),
    /**
     * <code>PVE = 2;</code>
     */
    PVE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>PVP = 1;</code>
     */
    public static final int PVP_VALUE = 1;
    /**
     * <code>PVE = 2;</code>
     */
    public static final int PVE_VALUE = 2;


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
    public static MinigameCombatType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MinigameCombatType forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return PVP;
        case 2: return PVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MinigameCombatType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MinigameCombatType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MinigameCombatType>() {
            public MinigameCombatType findValueByNumber(int number) {
              return MinigameCombatType.forNumber(number);
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
      return POGOProtos.Rpc.CombatMinigameTelemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final MinigameCombatType[] VALUES = values();

    public static MinigameCombatType valueOf(
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

    private MinigameCombatType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType)
  }

  public static final int COMBAT_TYPE_FIELD_NUMBER = 1;
  private int combatType_;
  /**
   * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
   * @return The enum numeric value on the wire for combatType.
   */
  @java.lang.Override public int getCombatTypeValue() {
    return combatType_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
   * @return The combatType.
   */
  @java.lang.Override public POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType getCombatType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType result = POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.valueOf(combatType_);
    return result == null ? POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.UNRECOGNIZED : result;
  }

  public static final int MOVE_TYPE_FIELD_NUMBER = 2;
  private int moveType_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
   * @return The enum numeric value on the wire for moveType.
   */
  @java.lang.Override public int getMoveTypeValue() {
    return moveType_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
   * @return The moveType.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonType getMoveType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(moveType_);
    return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
  }

  public static final int SCORE_FIELD_NUMBER = 3;
  private float score_;
  /**
   * <code>float score = 3;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
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
    if (combatType_ != POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.UNSET.getNumber()) {
      output.writeEnum(1, combatType_);
    }
    if (moveType_ != POGOProtos.Rpc.HoloPokemonType.HOLO_POKEMON_TYPE_POKEMON_TYPE_NONE.getNumber()) {
      output.writeEnum(2, moveType_);
    }
    if (score_ != 0F) {
      output.writeFloat(3, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (combatType_ != POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, combatType_);
    }
    if (moveType_ != POGOProtos.Rpc.HoloPokemonType.HOLO_POKEMON_TYPE_POKEMON_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, moveType_);
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, score_);
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
    if (!(obj instanceof POGOProtos.Rpc.CombatMinigameTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CombatMinigameTelemetry other = (POGOProtos.Rpc.CombatMinigameTelemetry) obj;

    if (combatType_ != other.combatType_) return false;
    if (moveType_ != other.moveType_) return false;
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
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
    hash = (37 * hash) + COMBAT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + combatType_;
    hash = (37 * hash) + MOVE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + moveType_;
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatMinigameTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CombatMinigameTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CombatMinigameTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CombatMinigameTelemetry)
      POGOProtos.Rpc.CombatMinigameTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatMinigameTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatMinigameTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CombatMinigameTelemetry.class, POGOProtos.Rpc.CombatMinigameTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CombatMinigameTelemetry.newBuilder()
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
      combatType_ = 0;

      moveType_ = 0;

      score_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatMinigameTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatMinigameTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.CombatMinigameTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatMinigameTelemetry build() {
      POGOProtos.Rpc.CombatMinigameTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatMinigameTelemetry buildPartial() {
      POGOProtos.Rpc.CombatMinigameTelemetry result = new POGOProtos.Rpc.CombatMinigameTelemetry(this);
      result.combatType_ = combatType_;
      result.moveType_ = moveType_;
      result.score_ = score_;
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
      if (other instanceof POGOProtos.Rpc.CombatMinigameTelemetry) {
        return mergeFrom((POGOProtos.Rpc.CombatMinigameTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CombatMinigameTelemetry other) {
      if (other == POGOProtos.Rpc.CombatMinigameTelemetry.getDefaultInstance()) return this;
      if (other.combatType_ != 0) {
        setCombatTypeValue(other.getCombatTypeValue());
      }
      if (other.moveType_ != 0) {
        setMoveTypeValue(other.getMoveTypeValue());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
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
      POGOProtos.Rpc.CombatMinigameTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CombatMinigameTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int combatType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
     * @return The enum numeric value on the wire for combatType.
     */
    @java.lang.Override public int getCombatTypeValue() {
      return combatType_;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
     * @param value The enum numeric value on the wire for combatType to set.
     * @return This builder for chaining.
     */
    public Builder setCombatTypeValue(int value) {
      
      combatType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
     * @return The combatType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType getCombatType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType result = POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.valueOf(combatType_);
      return result == null ? POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
     * @param value The combatType to set.
     * @return This builder for chaining.
     */
    public Builder setCombatType(POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      combatType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatType() {
      
      combatType_ = 0;
      onChanged();
      return this;
    }

    private int moveType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
     * @return The enum numeric value on the wire for moveType.
     */
    @java.lang.Override public int getMoveTypeValue() {
      return moveType_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
     * @param value The enum numeric value on the wire for moveType to set.
     * @return This builder for chaining.
     */
    public Builder setMoveTypeValue(int value) {
      
      moveType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
     * @return The moveType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonType getMoveType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(moveType_);
      return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
     * @param value The moveType to set.
     * @return This builder for chaining.
     */
    public Builder setMoveType(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      moveType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType move_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMoveType() {
      
      moveType_ = 0;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <code>float score = 3;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <code>float score = 3;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float score = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      
      score_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CombatMinigameTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CombatMinigameTelemetry)
  private static final POGOProtos.Rpc.CombatMinigameTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CombatMinigameTelemetry();
  }

  public static POGOProtos.Rpc.CombatMinigameTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatMinigameTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<CombatMinigameTelemetry>() {
    @java.lang.Override
    public CombatMinigameTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatMinigameTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatMinigameTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatMinigameTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CombatMinigameTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

