// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaGlobalSettingsProto}
 */
public final class BelugaGlobalSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaGlobalSettingsProto)
    BelugaGlobalSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaGlobalSettingsProto.newBuilder() to construct.
  private BelugaGlobalSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaGlobalSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaGlobalSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaGlobalSettingsProto(
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

            enableBelugaTransfer_ = input.readBool();
            break;
          }
          case 16: {

            maxNumPokemonPerTransfer_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaGlobalSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaGlobalSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaGlobalSettingsProto.class, POGOProtos.Rpc.BelugaGlobalSettingsProto.Builder.class);
  }

  public static final int ENABLE_BELUGA_TRANSFER_FIELD_NUMBER = 1;
  private boolean enableBelugaTransfer_;
  /**
   * <code>bool enable_beluga_transfer = 1;</code>
   * @return The enableBelugaTransfer.
   */
  @java.lang.Override
  public boolean getEnableBelugaTransfer() {
    return enableBelugaTransfer_;
  }

  public static final int MAX_NUM_POKEMON_PER_TRANSFER_FIELD_NUMBER = 2;
  private int maxNumPokemonPerTransfer_;
  /**
   * <code>int32 max_num_pokemon_per_transfer = 2;</code>
   * @return The maxNumPokemonPerTransfer.
   */
  @java.lang.Override
  public int getMaxNumPokemonPerTransfer() {
    return maxNumPokemonPerTransfer_;
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
    if (enableBelugaTransfer_ != false) {
      output.writeBool(1, enableBelugaTransfer_);
    }
    if (maxNumPokemonPerTransfer_ != 0) {
      output.writeInt32(2, maxNumPokemonPerTransfer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableBelugaTransfer_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableBelugaTransfer_);
    }
    if (maxNumPokemonPerTransfer_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxNumPokemonPerTransfer_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaGlobalSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaGlobalSettingsProto other = (POGOProtos.Rpc.BelugaGlobalSettingsProto) obj;

    if (getEnableBelugaTransfer()
        != other.getEnableBelugaTransfer()) return false;
    if (getMaxNumPokemonPerTransfer()
        != other.getMaxNumPokemonPerTransfer()) return false;
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
    hash = (37 * hash) + ENABLE_BELUGA_TRANSFER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableBelugaTransfer());
    hash = (37 * hash) + MAX_NUM_POKEMON_PER_TRANSFER_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNumPokemonPerTransfer();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaGlobalSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaGlobalSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaGlobalSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaGlobalSettingsProto)
      POGOProtos.Rpc.BelugaGlobalSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaGlobalSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaGlobalSettingsProto.class, POGOProtos.Rpc.BelugaGlobalSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaGlobalSettingsProto.newBuilder()
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
      enableBelugaTransfer_ = false;

      maxNumPokemonPerTransfer_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaGlobalSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaGlobalSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaGlobalSettingsProto build() {
      POGOProtos.Rpc.BelugaGlobalSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaGlobalSettingsProto buildPartial() {
      POGOProtos.Rpc.BelugaGlobalSettingsProto result = new POGOProtos.Rpc.BelugaGlobalSettingsProto(this);
      result.enableBelugaTransfer_ = enableBelugaTransfer_;
      result.maxNumPokemonPerTransfer_ = maxNumPokemonPerTransfer_;
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
      if (other instanceof POGOProtos.Rpc.BelugaGlobalSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaGlobalSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaGlobalSettingsProto other) {
      if (other == POGOProtos.Rpc.BelugaGlobalSettingsProto.getDefaultInstance()) return this;
      if (other.getEnableBelugaTransfer() != false) {
        setEnableBelugaTransfer(other.getEnableBelugaTransfer());
      }
      if (other.getMaxNumPokemonPerTransfer() != 0) {
        setMaxNumPokemonPerTransfer(other.getMaxNumPokemonPerTransfer());
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
      POGOProtos.Rpc.BelugaGlobalSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaGlobalSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableBelugaTransfer_ ;
    /**
     * <code>bool enable_beluga_transfer = 1;</code>
     * @return The enableBelugaTransfer.
     */
    @java.lang.Override
    public boolean getEnableBelugaTransfer() {
      return enableBelugaTransfer_;
    }
    /**
     * <code>bool enable_beluga_transfer = 1;</code>
     * @param value The enableBelugaTransfer to set.
     * @return This builder for chaining.
     */
    public Builder setEnableBelugaTransfer(boolean value) {
      
      enableBelugaTransfer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_beluga_transfer = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableBelugaTransfer() {
      
      enableBelugaTransfer_ = false;
      onChanged();
      return this;
    }

    private int maxNumPokemonPerTransfer_ ;
    /**
     * <code>int32 max_num_pokemon_per_transfer = 2;</code>
     * @return The maxNumPokemonPerTransfer.
     */
    @java.lang.Override
    public int getMaxNumPokemonPerTransfer() {
      return maxNumPokemonPerTransfer_;
    }
    /**
     * <code>int32 max_num_pokemon_per_transfer = 2;</code>
     * @param value The maxNumPokemonPerTransfer to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumPokemonPerTransfer(int value) {
      
      maxNumPokemonPerTransfer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_num_pokemon_per_transfer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNumPokemonPerTransfer() {
      
      maxNumPokemonPerTransfer_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaGlobalSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaGlobalSettingsProto)
  private static final POGOProtos.Rpc.BelugaGlobalSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaGlobalSettingsProto();
  }

  public static POGOProtos.Rpc.BelugaGlobalSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaGlobalSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaGlobalSettingsProto>() {
    @java.lang.Override
    public BelugaGlobalSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaGlobalSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaGlobalSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaGlobalSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaGlobalSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

