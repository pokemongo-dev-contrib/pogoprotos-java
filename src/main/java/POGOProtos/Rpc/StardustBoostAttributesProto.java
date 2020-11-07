// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.StardustBoostAttributesProto}
 */
public final class StardustBoostAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.StardustBoostAttributesProto)
    StardustBoostAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StardustBoostAttributesProto.newBuilder() to construct.
  private StardustBoostAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StardustBoostAttributesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StardustBoostAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StardustBoostAttributesProto(
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
          case 13: {

            stardustMultiplier_ = input.readFloat();
            break;
          }
          case 16: {

            boostDurationMs_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StardustBoostAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StardustBoostAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.StardustBoostAttributesProto.class, POGOProtos.Rpc.StardustBoostAttributesProto.Builder.class);
  }

  public static final int STARDUST_MULTIPLIER_FIELD_NUMBER = 1;
  private float stardustMultiplier_;
  /**
   * <code>float stardust_multiplier = 1;</code>
   * @return The stardustMultiplier.
   */
  @java.lang.Override
  public float getStardustMultiplier() {
    return stardustMultiplier_;
  }

  public static final int BOOST_DURATION_MS_FIELD_NUMBER = 2;
  private int boostDurationMs_;
  /**
   * <code>int32 boost_duration_ms = 2;</code>
   * @return The boostDurationMs.
   */
  @java.lang.Override
  public int getBoostDurationMs() {
    return boostDurationMs_;
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
    if (stardustMultiplier_ != 0F) {
      output.writeFloat(1, stardustMultiplier_);
    }
    if (boostDurationMs_ != 0) {
      output.writeInt32(2, boostDurationMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stardustMultiplier_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, stardustMultiplier_);
    }
    if (boostDurationMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, boostDurationMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.StardustBoostAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.StardustBoostAttributesProto other = (POGOProtos.Rpc.StardustBoostAttributesProto) obj;

    if (java.lang.Float.floatToIntBits(getStardustMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getStardustMultiplier())) return false;
    if (getBoostDurationMs()
        != other.getBoostDurationMs()) return false;
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
    hash = (37 * hash) + STARDUST_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getStardustMultiplier());
    hash = (37 * hash) + BOOST_DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + getBoostDurationMs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StardustBoostAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.StardustBoostAttributesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.StardustBoostAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.StardustBoostAttributesProto)
      POGOProtos.Rpc.StardustBoostAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StardustBoostAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StardustBoostAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.StardustBoostAttributesProto.class, POGOProtos.Rpc.StardustBoostAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.StardustBoostAttributesProto.newBuilder()
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
      stardustMultiplier_ = 0F;

      boostDurationMs_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StardustBoostAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.StardustBoostAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.StardustBoostAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.StardustBoostAttributesProto build() {
      POGOProtos.Rpc.StardustBoostAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.StardustBoostAttributesProto buildPartial() {
      POGOProtos.Rpc.StardustBoostAttributesProto result = new POGOProtos.Rpc.StardustBoostAttributesProto(this);
      result.stardustMultiplier_ = stardustMultiplier_;
      result.boostDurationMs_ = boostDurationMs_;
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
      if (other instanceof POGOProtos.Rpc.StardustBoostAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.StardustBoostAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.StardustBoostAttributesProto other) {
      if (other == POGOProtos.Rpc.StardustBoostAttributesProto.getDefaultInstance()) return this;
      if (other.getStardustMultiplier() != 0F) {
        setStardustMultiplier(other.getStardustMultiplier());
      }
      if (other.getBoostDurationMs() != 0) {
        setBoostDurationMs(other.getBoostDurationMs());
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
      POGOProtos.Rpc.StardustBoostAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.StardustBoostAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float stardustMultiplier_ ;
    /**
     * <code>float stardust_multiplier = 1;</code>
     * @return The stardustMultiplier.
     */
    @java.lang.Override
    public float getStardustMultiplier() {
      return stardustMultiplier_;
    }
    /**
     * <code>float stardust_multiplier = 1;</code>
     * @param value The stardustMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setStardustMultiplier(float value) {
      
      stardustMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float stardust_multiplier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStardustMultiplier() {
      
      stardustMultiplier_ = 0F;
      onChanged();
      return this;
    }

    private int boostDurationMs_ ;
    /**
     * <code>int32 boost_duration_ms = 2;</code>
     * @return The boostDurationMs.
     */
    @java.lang.Override
    public int getBoostDurationMs() {
      return boostDurationMs_;
    }
    /**
     * <code>int32 boost_duration_ms = 2;</code>
     * @param value The boostDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setBoostDurationMs(int value) {
      
      boostDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 boost_duration_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoostDurationMs() {
      
      boostDurationMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.StardustBoostAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.StardustBoostAttributesProto)
  private static final POGOProtos.Rpc.StardustBoostAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.StardustBoostAttributesProto();
  }

  public static POGOProtos.Rpc.StardustBoostAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StardustBoostAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<StardustBoostAttributesProto>() {
    @java.lang.Override
    public StardustBoostAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StardustBoostAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StardustBoostAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StardustBoostAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.StardustBoostAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

