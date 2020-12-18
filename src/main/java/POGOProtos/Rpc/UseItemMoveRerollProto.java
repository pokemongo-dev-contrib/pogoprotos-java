// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UseItemMoveRerollProto}
 */
public final class UseItemMoveRerollProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UseItemMoveRerollProto)
    UseItemMoveRerollProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseItemMoveRerollProto.newBuilder() to construct.
  private UseItemMoveRerollProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseItemMoveRerollProto() {
    item_ = 0;
    targetEliteMove_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseItemMoveRerollProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseItemMoveRerollProto(
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

            item_ = rawValue;
            break;
          }
          case 17: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 24: {

            rerollUnlockedMove_ = input.readBool();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            targetEliteMove_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemMoveRerollProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemMoveRerollProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UseItemMoveRerollProto.class, POGOProtos.Rpc.UseItemMoveRerollProto.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private int item_;
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  @java.lang.Override public int getItemValue() {
    return item_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 2;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int REROLL_UNLOCKED_MOVE_FIELD_NUMBER = 3;
  private boolean rerollUnlockedMove_;
  /**
   * <code>bool reroll_unlocked_move = 3;</code>
   * @return The rerollUnlockedMove.
   */
  @java.lang.Override
  public boolean getRerollUnlockedMove() {
    return rerollUnlockedMove_;
  }

  public static final int TARGET_ELITE_MOVE_FIELD_NUMBER = 4;
  private int targetEliteMove_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
   * @return The enum numeric value on the wire for targetEliteMove.
   */
  @java.lang.Override public int getTargetEliteMoveValue() {
    return targetEliteMove_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
   * @return The targetEliteMove.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonMove getTargetEliteMove() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(targetEliteMove_);
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
    if (item_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, item_);
    }
    if (pokemonId_ != 0L) {
      output.writeFixed64(2, pokemonId_);
    }
    if (rerollUnlockedMove_ != false) {
      output.writeBool(3, rerollUnlockedMove_);
    }
    if (targetEliteMove_ != POGOProtos.Rpc.HoloPokemonMove.MOVE_UNSET.getNumber()) {
      output.writeEnum(4, targetEliteMove_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, item_);
    }
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(2, pokemonId_);
    }
    if (rerollUnlockedMove_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, rerollUnlockedMove_);
    }
    if (targetEliteMove_ != POGOProtos.Rpc.HoloPokemonMove.MOVE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, targetEliteMove_);
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
    if (!(obj instanceof POGOProtos.Rpc.UseItemMoveRerollProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UseItemMoveRerollProto other = (POGOProtos.Rpc.UseItemMoveRerollProto) obj;

    if (item_ != other.item_) return false;
    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (getRerollUnlockedMove()
        != other.getRerollUnlockedMove()) return false;
    if (targetEliteMove_ != other.targetEliteMove_) return false;
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
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + item_;
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (37 * hash) + REROLL_UNLOCKED_MOVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRerollUnlockedMove());
    hash = (37 * hash) + TARGET_ELITE_MOVE_FIELD_NUMBER;
    hash = (53 * hash) + targetEliteMove_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemMoveRerollProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UseItemMoveRerollProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UseItemMoveRerollProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UseItemMoveRerollProto)
      POGOProtos.Rpc.UseItemMoveRerollProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemMoveRerollProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemMoveRerollProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UseItemMoveRerollProto.class, POGOProtos.Rpc.UseItemMoveRerollProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UseItemMoveRerollProto.newBuilder()
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
      item_ = 0;

      pokemonId_ = 0L;

      rerollUnlockedMove_ = false;

      targetEliteMove_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemMoveRerollProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemMoveRerollProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UseItemMoveRerollProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemMoveRerollProto build() {
      POGOProtos.Rpc.UseItemMoveRerollProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemMoveRerollProto buildPartial() {
      POGOProtos.Rpc.UseItemMoveRerollProto result = new POGOProtos.Rpc.UseItemMoveRerollProto(this);
      result.item_ = item_;
      result.pokemonId_ = pokemonId_;
      result.rerollUnlockedMove_ = rerollUnlockedMove_;
      result.targetEliteMove_ = targetEliteMove_;
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
      if (other instanceof POGOProtos.Rpc.UseItemMoveRerollProto) {
        return mergeFrom((POGOProtos.Rpc.UseItemMoveRerollProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UseItemMoveRerollProto other) {
      if (other == POGOProtos.Rpc.UseItemMoveRerollProto.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (other.getRerollUnlockedMove() != false) {
        setRerollUnlockedMove(other.getRerollUnlockedMove());
      }
      if (other.targetEliteMove_ != 0) {
        setTargetEliteMoveValue(other.getTargetEliteMoveValue());
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
      POGOProtos.Rpc.UseItemMoveRerollProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UseItemMoveRerollProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int item_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The enum numeric value on the wire for item.
     */
    @java.lang.Override public int getItemValue() {
      return item_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The enum numeric value on the wire for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemValue(int value) {
      
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The item.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      item_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = 0;
      onChanged();
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 2;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 2;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private boolean rerollUnlockedMove_ ;
    /**
     * <code>bool reroll_unlocked_move = 3;</code>
     * @return The rerollUnlockedMove.
     */
    @java.lang.Override
    public boolean getRerollUnlockedMove() {
      return rerollUnlockedMove_;
    }
    /**
     * <code>bool reroll_unlocked_move = 3;</code>
     * @param value The rerollUnlockedMove to set.
     * @return This builder for chaining.
     */
    public Builder setRerollUnlockedMove(boolean value) {
      
      rerollUnlockedMove_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool reroll_unlocked_move = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRerollUnlockedMove() {
      
      rerollUnlockedMove_ = false;
      onChanged();
      return this;
    }

    private int targetEliteMove_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
     * @return The enum numeric value on the wire for targetEliteMove.
     */
    @java.lang.Override public int getTargetEliteMoveValue() {
      return targetEliteMove_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
     * @param value The enum numeric value on the wire for targetEliteMove to set.
     * @return This builder for chaining.
     */
    public Builder setTargetEliteMoveValue(int value) {
      
      targetEliteMove_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
     * @return The targetEliteMove.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonMove getTargetEliteMove() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(targetEliteMove_);
      return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
     * @param value The targetEliteMove to set.
     * @return This builder for chaining.
     */
    public Builder setTargetEliteMove(POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      targetEliteMove_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonMove target_elite_move = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetEliteMove() {
      
      targetEliteMove_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UseItemMoveRerollProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UseItemMoveRerollProto)
  private static final POGOProtos.Rpc.UseItemMoveRerollProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UseItemMoveRerollProto();
  }

  public static POGOProtos.Rpc.UseItemMoveRerollProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseItemMoveRerollProto>
      PARSER = new com.google.protobuf.AbstractParser<UseItemMoveRerollProto>() {
    @java.lang.Override
    public UseItemMoveRerollProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseItemMoveRerollProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseItemMoveRerollProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseItemMoveRerollProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UseItemMoveRerollProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

