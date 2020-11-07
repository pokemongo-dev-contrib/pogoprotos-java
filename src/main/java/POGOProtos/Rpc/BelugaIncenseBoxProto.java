// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaIncenseBoxProto}
 */
public final class BelugaIncenseBoxProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaIncenseBoxProto)
    BelugaIncenseBoxProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaIncenseBoxProto.newBuilder() to construct.
  private BelugaIncenseBoxProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaIncenseBoxProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaIncenseBoxProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaIncenseBoxProto(
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

            isUsable_ = input.readBool();
            break;
          }
          case 16: {

            coolDownFinishedTimestampMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaIncenseBoxProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaIncenseBoxProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaIncenseBoxProto.class, POGOProtos.Rpc.BelugaIncenseBoxProto.Builder.class);
  }

  public static final int IS_USABLE_FIELD_NUMBER = 1;
  private boolean isUsable_;
  /**
   * <code>bool is_usable = 1;</code>
   * @return The isUsable.
   */
  @java.lang.Override
  public boolean getIsUsable() {
    return isUsable_;
  }

  public static final int COOL_DOWN_FINISHED_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long coolDownFinishedTimestampMs_;
  /**
   * <code>int64 cool_down_finished_timestamp_ms = 2;</code>
   * @return The coolDownFinishedTimestampMs.
   */
  @java.lang.Override
  public long getCoolDownFinishedTimestampMs() {
    return coolDownFinishedTimestampMs_;
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
    if (isUsable_ != false) {
      output.writeBool(1, isUsable_);
    }
    if (coolDownFinishedTimestampMs_ != 0L) {
      output.writeInt64(2, coolDownFinishedTimestampMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isUsable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isUsable_);
    }
    if (coolDownFinishedTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, coolDownFinishedTimestampMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaIncenseBoxProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaIncenseBoxProto other = (POGOProtos.Rpc.BelugaIncenseBoxProto) obj;

    if (getIsUsable()
        != other.getIsUsable()) return false;
    if (getCoolDownFinishedTimestampMs()
        != other.getCoolDownFinishedTimestampMs()) return false;
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
    hash = (37 * hash) + IS_USABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsUsable());
    hash = (37 * hash) + COOL_DOWN_FINISHED_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCoolDownFinishedTimestampMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaIncenseBoxProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaIncenseBoxProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaIncenseBoxProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaIncenseBoxProto)
      POGOProtos.Rpc.BelugaIncenseBoxProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaIncenseBoxProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaIncenseBoxProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaIncenseBoxProto.class, POGOProtos.Rpc.BelugaIncenseBoxProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaIncenseBoxProto.newBuilder()
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
      isUsable_ = false;

      coolDownFinishedTimestampMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaIncenseBoxProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaIncenseBoxProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaIncenseBoxProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaIncenseBoxProto build() {
      POGOProtos.Rpc.BelugaIncenseBoxProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaIncenseBoxProto buildPartial() {
      POGOProtos.Rpc.BelugaIncenseBoxProto result = new POGOProtos.Rpc.BelugaIncenseBoxProto(this);
      result.isUsable_ = isUsable_;
      result.coolDownFinishedTimestampMs_ = coolDownFinishedTimestampMs_;
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
      if (other instanceof POGOProtos.Rpc.BelugaIncenseBoxProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaIncenseBoxProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaIncenseBoxProto other) {
      if (other == POGOProtos.Rpc.BelugaIncenseBoxProto.getDefaultInstance()) return this;
      if (other.getIsUsable() != false) {
        setIsUsable(other.getIsUsable());
      }
      if (other.getCoolDownFinishedTimestampMs() != 0L) {
        setCoolDownFinishedTimestampMs(other.getCoolDownFinishedTimestampMs());
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
      POGOProtos.Rpc.BelugaIncenseBoxProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaIncenseBoxProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isUsable_ ;
    /**
     * <code>bool is_usable = 1;</code>
     * @return The isUsable.
     */
    @java.lang.Override
    public boolean getIsUsable() {
      return isUsable_;
    }
    /**
     * <code>bool is_usable = 1;</code>
     * @param value The isUsable to set.
     * @return This builder for chaining.
     */
    public Builder setIsUsable(boolean value) {
      
      isUsable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_usable = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsUsable() {
      
      isUsable_ = false;
      onChanged();
      return this;
    }

    private long coolDownFinishedTimestampMs_ ;
    /**
     * <code>int64 cool_down_finished_timestamp_ms = 2;</code>
     * @return The coolDownFinishedTimestampMs.
     */
    @java.lang.Override
    public long getCoolDownFinishedTimestampMs() {
      return coolDownFinishedTimestampMs_;
    }
    /**
     * <code>int64 cool_down_finished_timestamp_ms = 2;</code>
     * @param value The coolDownFinishedTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setCoolDownFinishedTimestampMs(long value) {
      
      coolDownFinishedTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cool_down_finished_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoolDownFinishedTimestampMs() {
      
      coolDownFinishedTimestampMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaIncenseBoxProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaIncenseBoxProto)
  private static final POGOProtos.Rpc.BelugaIncenseBoxProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaIncenseBoxProto();
  }

  public static POGOProtos.Rpc.BelugaIncenseBoxProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaIncenseBoxProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaIncenseBoxProto>() {
    @java.lang.Override
    public BelugaIncenseBoxProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaIncenseBoxProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaIncenseBoxProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaIncenseBoxProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaIncenseBoxProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

