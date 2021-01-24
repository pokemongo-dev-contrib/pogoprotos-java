// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EggCreateDetail}
 */
public final class EggCreateDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EggCreateDetail)
    EggCreateDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EggCreateDetail.newBuilder() to construct.
  private EggCreateDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EggCreateDetail() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EggCreateDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EggCreateDetail(
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

            hatchedTimeMs_ = input.readInt64();
            break;
          }
          case 16: {

            playerHatchedS2CellId_ = input.readInt64();
            break;
          }
          case 24: {

            receivedTimeMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EggCreateDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EggCreateDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EggCreateDetail.class, POGOProtos.Rpc.EggCreateDetail.Builder.class);
  }

  public static final int HATCHED_TIME_MS_FIELD_NUMBER = 1;
  private long hatchedTimeMs_;
  /**
   * <code>int64 hatched_time_ms = 1;</code>
   * @return The hatchedTimeMs.
   */
  @java.lang.Override
  public long getHatchedTimeMs() {
    return hatchedTimeMs_;
  }

  public static final int PLAYER_HATCHED_S2_CELL_ID_FIELD_NUMBER = 2;
  private long playerHatchedS2CellId_;
  /**
   * <code>int64 player_hatched_s2_cell_id = 2;</code>
   * @return The playerHatchedS2CellId.
   */
  @java.lang.Override
  public long getPlayerHatchedS2CellId() {
    return playerHatchedS2CellId_;
  }

  public static final int RECEIVED_TIME_MS_FIELD_NUMBER = 3;
  private long receivedTimeMs_;
  /**
   * <code>int64 received_time_ms = 3;</code>
   * @return The receivedTimeMs.
   */
  @java.lang.Override
  public long getReceivedTimeMs() {
    return receivedTimeMs_;
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
    if (hatchedTimeMs_ != 0L) {
      output.writeInt64(1, hatchedTimeMs_);
    }
    if (playerHatchedS2CellId_ != 0L) {
      output.writeInt64(2, playerHatchedS2CellId_);
    }
    if (receivedTimeMs_ != 0L) {
      output.writeInt64(3, receivedTimeMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hatchedTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hatchedTimeMs_);
    }
    if (playerHatchedS2CellId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, playerHatchedS2CellId_);
    }
    if (receivedTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, receivedTimeMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.EggCreateDetail)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EggCreateDetail other = (POGOProtos.Rpc.EggCreateDetail) obj;

    if (getHatchedTimeMs()
        != other.getHatchedTimeMs()) return false;
    if (getPlayerHatchedS2CellId()
        != other.getPlayerHatchedS2CellId()) return false;
    if (getReceivedTimeMs()
        != other.getReceivedTimeMs()) return false;
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
    hash = (37 * hash) + HATCHED_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHatchedTimeMs());
    hash = (37 * hash) + PLAYER_HATCHED_S2_CELL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayerHatchedS2CellId());
    hash = (37 * hash) + RECEIVED_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReceivedTimeMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EggCreateDetail parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EggCreateDetail prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EggCreateDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EggCreateDetail)
      POGOProtos.Rpc.EggCreateDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EggCreateDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EggCreateDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EggCreateDetail.class, POGOProtos.Rpc.EggCreateDetail.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EggCreateDetail.newBuilder()
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
      hatchedTimeMs_ = 0L;

      playerHatchedS2CellId_ = 0L;

      receivedTimeMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EggCreateDetail_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EggCreateDetail getDefaultInstanceForType() {
      return POGOProtos.Rpc.EggCreateDetail.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EggCreateDetail build() {
      POGOProtos.Rpc.EggCreateDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EggCreateDetail buildPartial() {
      POGOProtos.Rpc.EggCreateDetail result = new POGOProtos.Rpc.EggCreateDetail(this);
      result.hatchedTimeMs_ = hatchedTimeMs_;
      result.playerHatchedS2CellId_ = playerHatchedS2CellId_;
      result.receivedTimeMs_ = receivedTimeMs_;
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
      if (other instanceof POGOProtos.Rpc.EggCreateDetail) {
        return mergeFrom((POGOProtos.Rpc.EggCreateDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EggCreateDetail other) {
      if (other == POGOProtos.Rpc.EggCreateDetail.getDefaultInstance()) return this;
      if (other.getHatchedTimeMs() != 0L) {
        setHatchedTimeMs(other.getHatchedTimeMs());
      }
      if (other.getPlayerHatchedS2CellId() != 0L) {
        setPlayerHatchedS2CellId(other.getPlayerHatchedS2CellId());
      }
      if (other.getReceivedTimeMs() != 0L) {
        setReceivedTimeMs(other.getReceivedTimeMs());
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
      POGOProtos.Rpc.EggCreateDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EggCreateDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long hatchedTimeMs_ ;
    /**
     * <code>int64 hatched_time_ms = 1;</code>
     * @return The hatchedTimeMs.
     */
    @java.lang.Override
    public long getHatchedTimeMs() {
      return hatchedTimeMs_;
    }
    /**
     * <code>int64 hatched_time_ms = 1;</code>
     * @param value The hatchedTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setHatchedTimeMs(long value) {
      
      hatchedTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hatched_time_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHatchedTimeMs() {
      
      hatchedTimeMs_ = 0L;
      onChanged();
      return this;
    }

    private long playerHatchedS2CellId_ ;
    /**
     * <code>int64 player_hatched_s2_cell_id = 2;</code>
     * @return The playerHatchedS2CellId.
     */
    @java.lang.Override
    public long getPlayerHatchedS2CellId() {
      return playerHatchedS2CellId_;
    }
    /**
     * <code>int64 player_hatched_s2_cell_id = 2;</code>
     * @param value The playerHatchedS2CellId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerHatchedS2CellId(long value) {
      
      playerHatchedS2CellId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 player_hatched_s2_cell_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerHatchedS2CellId() {
      
      playerHatchedS2CellId_ = 0L;
      onChanged();
      return this;
    }

    private long receivedTimeMs_ ;
    /**
     * <code>int64 received_time_ms = 3;</code>
     * @return The receivedTimeMs.
     */
    @java.lang.Override
    public long getReceivedTimeMs() {
      return receivedTimeMs_;
    }
    /**
     * <code>int64 received_time_ms = 3;</code>
     * @param value The receivedTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setReceivedTimeMs(long value) {
      
      receivedTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 received_time_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceivedTimeMs() {
      
      receivedTimeMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EggCreateDetail)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EggCreateDetail)
  private static final POGOProtos.Rpc.EggCreateDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EggCreateDetail();
  }

  public static POGOProtos.Rpc.EggCreateDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EggCreateDetail>
      PARSER = new com.google.protobuf.AbstractParser<EggCreateDetail>() {
    @java.lang.Override
    public EggCreateDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EggCreateDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EggCreateDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EggCreateDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EggCreateDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
