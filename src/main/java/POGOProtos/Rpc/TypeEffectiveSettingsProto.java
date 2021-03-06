// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TypeEffectiveSettingsProto}
 */
public final class TypeEffectiveSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TypeEffectiveSettingsProto)
    TypeEffectiveSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypeEffectiveSettingsProto.newBuilder() to construct.
  private TypeEffectiveSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TypeEffectiveSettingsProto() {
    attackScalar_ = emptyFloatList();
    attackType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TypeEffectiveSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TypeEffectiveSettingsProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 13: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attackScalar_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            attackScalar_.addFloat(input.readFloat());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              attackScalar_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              attackScalar_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            attackType_ = rawValue;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attackScalar_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TypeEffectiveSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TypeEffectiveSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TypeEffectiveSettingsProto.class, POGOProtos.Rpc.TypeEffectiveSettingsProto.Builder.class);
  }

  public static final int ATTACK_SCALAR_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.FloatList attackScalar_;
  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @return A list containing the attackScalar.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getAttackScalarList() {
    return attackScalar_;
  }
  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @return The count of attackScalar.
   */
  public int getAttackScalarCount() {
    return attackScalar_.size();
  }
  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @param index The index of the element to return.
   * @return The attackScalar at the given index.
   */
  public float getAttackScalar(int index) {
    return attackScalar_.getFloat(index);
  }
  private int attackScalarMemoizedSerializedSize = -1;

  public static final int ATTACK_TYPE_FIELD_NUMBER = 2;
  private int attackType_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
   * @return The enum numeric value on the wire for attackType.
   */
  @java.lang.Override public int getAttackTypeValue() {
    return attackType_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
   * @return The attackType.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonType getAttackType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(attackType_);
    return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
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
    getSerializedSize();
    if (getAttackScalarList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(attackScalarMemoizedSerializedSize);
    }
    for (int i = 0; i < attackScalar_.size(); i++) {
      output.writeFloatNoTag(attackScalar_.getFloat(i));
    }
    if (attackType_ != POGOProtos.Rpc.HoloPokemonType.POKEMON_TYPE_NONE.getNumber()) {
      output.writeEnum(2, attackType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 4 * getAttackScalarList().size();
      size += dataSize;
      if (!getAttackScalarList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      attackScalarMemoizedSerializedSize = dataSize;
    }
    if (attackType_ != POGOProtos.Rpc.HoloPokemonType.POKEMON_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, attackType_);
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
    if (!(obj instanceof POGOProtos.Rpc.TypeEffectiveSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TypeEffectiveSettingsProto other = (POGOProtos.Rpc.TypeEffectiveSettingsProto) obj;

    if (!getAttackScalarList()
        .equals(other.getAttackScalarList())) return false;
    if (attackType_ != other.attackType_) return false;
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
    if (getAttackScalarCount() > 0) {
      hash = (37 * hash) + ATTACK_SCALAR_FIELD_NUMBER;
      hash = (53 * hash) + getAttackScalarList().hashCode();
    }
    hash = (37 * hash) + ATTACK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + attackType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TypeEffectiveSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TypeEffectiveSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TypeEffectiveSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TypeEffectiveSettingsProto)
      POGOProtos.Rpc.TypeEffectiveSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TypeEffectiveSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TypeEffectiveSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TypeEffectiveSettingsProto.class, POGOProtos.Rpc.TypeEffectiveSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TypeEffectiveSettingsProto.newBuilder()
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
      attackScalar_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      attackType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TypeEffectiveSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TypeEffectiveSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TypeEffectiveSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TypeEffectiveSettingsProto build() {
      POGOProtos.Rpc.TypeEffectiveSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TypeEffectiveSettingsProto buildPartial() {
      POGOProtos.Rpc.TypeEffectiveSettingsProto result = new POGOProtos.Rpc.TypeEffectiveSettingsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attackScalar_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attackScalar_ = attackScalar_;
      result.attackType_ = attackType_;
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
      if (other instanceof POGOProtos.Rpc.TypeEffectiveSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.TypeEffectiveSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TypeEffectiveSettingsProto other) {
      if (other == POGOProtos.Rpc.TypeEffectiveSettingsProto.getDefaultInstance()) return this;
      if (!other.attackScalar_.isEmpty()) {
        if (attackScalar_.isEmpty()) {
          attackScalar_ = other.attackScalar_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAttackScalarIsMutable();
          attackScalar_.addAll(other.attackScalar_);
        }
        onChanged();
      }
      if (other.attackType_ != 0) {
        setAttackTypeValue(other.getAttackTypeValue());
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
      POGOProtos.Rpc.TypeEffectiveSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TypeEffectiveSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.FloatList attackScalar_ = emptyFloatList();
    private void ensureAttackScalarIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attackScalar_ = mutableCopy(attackScalar_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @return A list containing the attackScalar.
     */
    public java.util.List<java.lang.Float>
        getAttackScalarList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(attackScalar_) : attackScalar_;
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @return The count of attackScalar.
     */
    public int getAttackScalarCount() {
      return attackScalar_.size();
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @param index The index of the element to return.
     * @return The attackScalar at the given index.
     */
    public float getAttackScalar(int index) {
      return attackScalar_.getFloat(index);
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @param index The index to set the value at.
     * @param value The attackScalar to set.
     * @return This builder for chaining.
     */
    public Builder setAttackScalar(
        int index, float value) {
      ensureAttackScalarIsMutable();
      attackScalar_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @param value The attackScalar to add.
     * @return This builder for chaining.
     */
    public Builder addAttackScalar(float value) {
      ensureAttackScalarIsMutable();
      attackScalar_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @param values The attackScalar to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttackScalar(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureAttackScalarIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attackScalar_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float attack_scalar = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackScalar() {
      attackScalar_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int attackType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
     * @return The enum numeric value on the wire for attackType.
     */
    @java.lang.Override public int getAttackTypeValue() {
      return attackType_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
     * @param value The enum numeric value on the wire for attackType to set.
     * @return This builder for chaining.
     */
    public Builder setAttackTypeValue(int value) {
      
      attackType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
     * @return The attackType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonType getAttackType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(attackType_);
      return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
     * @param value The attackType to set.
     * @return This builder for chaining.
     */
    public Builder setAttackType(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      attackType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackType() {
      
      attackType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TypeEffectiveSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TypeEffectiveSettingsProto)
  private static final POGOProtos.Rpc.TypeEffectiveSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TypeEffectiveSettingsProto();
  }

  public static POGOProtos.Rpc.TypeEffectiveSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypeEffectiveSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<TypeEffectiveSettingsProto>() {
    @java.lang.Override
    public TypeEffectiveSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TypeEffectiveSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TypeEffectiveSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypeEffectiveSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TypeEffectiveSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

