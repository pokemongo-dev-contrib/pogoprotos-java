// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DamagePropertyProto}
 */
public final class DamagePropertyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DamagePropertyProto)
    DamagePropertyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DamagePropertyProto.newBuilder() to construct.
  private DamagePropertyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DamagePropertyProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DamagePropertyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DamagePropertyProto(
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

            superEffectiveChargeMove_ = input.readBool();
            break;
          }
          case 16: {

            weatherBoosted_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DamagePropertyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DamagePropertyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DamagePropertyProto.class, POGOProtos.Rpc.DamagePropertyProto.Builder.class);
  }

  public static final int SUPER_EFFECTIVE_CHARGE_MOVE_FIELD_NUMBER = 1;
  private boolean superEffectiveChargeMove_;
  /**
   * <code>bool super_effective_charge_move = 1;</code>
   * @return The superEffectiveChargeMove.
   */
  @java.lang.Override
  public boolean getSuperEffectiveChargeMove() {
    return superEffectiveChargeMove_;
  }

  public static final int WEATHER_BOOSTED_FIELD_NUMBER = 2;
  private boolean weatherBoosted_;
  /**
   * <code>bool weather_boosted = 2;</code>
   * @return The weatherBoosted.
   */
  @java.lang.Override
  public boolean getWeatherBoosted() {
    return weatherBoosted_;
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
    if (superEffectiveChargeMove_ != false) {
      output.writeBool(1, superEffectiveChargeMove_);
    }
    if (weatherBoosted_ != false) {
      output.writeBool(2, weatherBoosted_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (superEffectiveChargeMove_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, superEffectiveChargeMove_);
    }
    if (weatherBoosted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, weatherBoosted_);
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
    if (!(obj instanceof POGOProtos.Rpc.DamagePropertyProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DamagePropertyProto other = (POGOProtos.Rpc.DamagePropertyProto) obj;

    if (getSuperEffectiveChargeMove()
        != other.getSuperEffectiveChargeMove()) return false;
    if (getWeatherBoosted()
        != other.getWeatherBoosted()) return false;
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
    hash = (37 * hash) + SUPER_EFFECTIVE_CHARGE_MOVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuperEffectiveChargeMove());
    hash = (37 * hash) + WEATHER_BOOSTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWeatherBoosted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DamagePropertyProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DamagePropertyProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DamagePropertyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DamagePropertyProto)
      POGOProtos.Rpc.DamagePropertyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DamagePropertyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DamagePropertyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DamagePropertyProto.class, POGOProtos.Rpc.DamagePropertyProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DamagePropertyProto.newBuilder()
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
      superEffectiveChargeMove_ = false;

      weatherBoosted_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DamagePropertyProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DamagePropertyProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.DamagePropertyProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DamagePropertyProto build() {
      POGOProtos.Rpc.DamagePropertyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DamagePropertyProto buildPartial() {
      POGOProtos.Rpc.DamagePropertyProto result = new POGOProtos.Rpc.DamagePropertyProto(this);
      result.superEffectiveChargeMove_ = superEffectiveChargeMove_;
      result.weatherBoosted_ = weatherBoosted_;
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
      if (other instanceof POGOProtos.Rpc.DamagePropertyProto) {
        return mergeFrom((POGOProtos.Rpc.DamagePropertyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DamagePropertyProto other) {
      if (other == POGOProtos.Rpc.DamagePropertyProto.getDefaultInstance()) return this;
      if (other.getSuperEffectiveChargeMove() != false) {
        setSuperEffectiveChargeMove(other.getSuperEffectiveChargeMove());
      }
      if (other.getWeatherBoosted() != false) {
        setWeatherBoosted(other.getWeatherBoosted());
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
      POGOProtos.Rpc.DamagePropertyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DamagePropertyProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean superEffectiveChargeMove_ ;
    /**
     * <code>bool super_effective_charge_move = 1;</code>
     * @return The superEffectiveChargeMove.
     */
    @java.lang.Override
    public boolean getSuperEffectiveChargeMove() {
      return superEffectiveChargeMove_;
    }
    /**
     * <code>bool super_effective_charge_move = 1;</code>
     * @param value The superEffectiveChargeMove to set.
     * @return This builder for chaining.
     */
    public Builder setSuperEffectiveChargeMove(boolean value) {
      
      superEffectiveChargeMove_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool super_effective_charge_move = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuperEffectiveChargeMove() {
      
      superEffectiveChargeMove_ = false;
      onChanged();
      return this;
    }

    private boolean weatherBoosted_ ;
    /**
     * <code>bool weather_boosted = 2;</code>
     * @return The weatherBoosted.
     */
    @java.lang.Override
    public boolean getWeatherBoosted() {
      return weatherBoosted_;
    }
    /**
     * <code>bool weather_boosted = 2;</code>
     * @param value The weatherBoosted to set.
     * @return This builder for chaining.
     */
    public Builder setWeatherBoosted(boolean value) {
      
      weatherBoosted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool weather_boosted = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeatherBoosted() {
      
      weatherBoosted_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DamagePropertyProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DamagePropertyProto)
  private static final POGOProtos.Rpc.DamagePropertyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DamagePropertyProto();
  }

  public static POGOProtos.Rpc.DamagePropertyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DamagePropertyProto>
      PARSER = new com.google.protobuf.AbstractParser<DamagePropertyProto>() {
    @java.lang.Override
    public DamagePropertyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DamagePropertyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DamagePropertyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DamagePropertyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DamagePropertyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

