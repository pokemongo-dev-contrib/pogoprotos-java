// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformInGamePurchaseDetails}
 */
public final class PlatformInGamePurchaseDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformInGamePurchaseDetails)
    PlatformInGamePurchaseDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformInGamePurchaseDetails.newBuilder() to construct.
  private PlatformInGamePurchaseDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformInGamePurchaseDetails() {
    ingameType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformInGamePurchaseDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformInGamePurchaseDetails(
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

            ingameType_ = s;
            break;
          }
          case 16: {

            ingamePrice_ = input.readInt64();
            break;
          }
          case 24: {

            remainingIngameBalance_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformInGamePurchaseDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformInGamePurchaseDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformInGamePurchaseDetails.class, POGOProtos.Rpc.PlatformInGamePurchaseDetails.Builder.class);
  }

  public static final int INGAME_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object ingameType_;
  /**
   * <code>string ingame_type = 1;</code>
   * @return The ingameType.
   */
  @java.lang.Override
  public java.lang.String getIngameType() {
    java.lang.Object ref = ingameType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ingameType_ = s;
      return s;
    }
  }
  /**
   * <code>string ingame_type = 1;</code>
   * @return The bytes for ingameType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIngameTypeBytes() {
    java.lang.Object ref = ingameType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ingameType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INGAME_PRICE_FIELD_NUMBER = 2;
  private long ingamePrice_;
  /**
   * <code>int64 ingame_price = 2;</code>
   * @return The ingamePrice.
   */
  @java.lang.Override
  public long getIngamePrice() {
    return ingamePrice_;
  }

  public static final int REMAINING_INGAME_BALANCE_FIELD_NUMBER = 3;
  private long remainingIngameBalance_;
  /**
   * <code>int64 remaining_ingame_balance = 3;</code>
   * @return The remainingIngameBalance.
   */
  @java.lang.Override
  public long getRemainingIngameBalance() {
    return remainingIngameBalance_;
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
    if (!getIngameTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ingameType_);
    }
    if (ingamePrice_ != 0L) {
      output.writeInt64(2, ingamePrice_);
    }
    if (remainingIngameBalance_ != 0L) {
      output.writeInt64(3, remainingIngameBalance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIngameTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ingameType_);
    }
    if (ingamePrice_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, ingamePrice_);
    }
    if (remainingIngameBalance_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, remainingIngameBalance_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformInGamePurchaseDetails)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformInGamePurchaseDetails other = (POGOProtos.Rpc.PlatformInGamePurchaseDetails) obj;

    if (!getIngameType()
        .equals(other.getIngameType())) return false;
    if (getIngamePrice()
        != other.getIngamePrice()) return false;
    if (getRemainingIngameBalance()
        != other.getRemainingIngameBalance()) return false;
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
    hash = (37 * hash) + INGAME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getIngameType().hashCode();
    hash = (37 * hash) + INGAME_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIngamePrice());
    hash = (37 * hash) + REMAINING_INGAME_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRemainingIngameBalance());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformInGamePurchaseDetails prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformInGamePurchaseDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformInGamePurchaseDetails)
      POGOProtos.Rpc.PlatformInGamePurchaseDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformInGamePurchaseDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformInGamePurchaseDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformInGamePurchaseDetails.class, POGOProtos.Rpc.PlatformInGamePurchaseDetails.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformInGamePurchaseDetails.newBuilder()
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
      ingameType_ = "";

      ingamePrice_ = 0L;

      remainingIngameBalance_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformInGamePurchaseDetails_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInGamePurchaseDetails getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformInGamePurchaseDetails.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInGamePurchaseDetails build() {
      POGOProtos.Rpc.PlatformInGamePurchaseDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInGamePurchaseDetails buildPartial() {
      POGOProtos.Rpc.PlatformInGamePurchaseDetails result = new POGOProtos.Rpc.PlatformInGamePurchaseDetails(this);
      result.ingameType_ = ingameType_;
      result.ingamePrice_ = ingamePrice_;
      result.remainingIngameBalance_ = remainingIngameBalance_;
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
      if (other instanceof POGOProtos.Rpc.PlatformInGamePurchaseDetails) {
        return mergeFrom((POGOProtos.Rpc.PlatformInGamePurchaseDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformInGamePurchaseDetails other) {
      if (other == POGOProtos.Rpc.PlatformInGamePurchaseDetails.getDefaultInstance()) return this;
      if (!other.getIngameType().isEmpty()) {
        ingameType_ = other.ingameType_;
        onChanged();
      }
      if (other.getIngamePrice() != 0L) {
        setIngamePrice(other.getIngamePrice());
      }
      if (other.getRemainingIngameBalance() != 0L) {
        setRemainingIngameBalance(other.getRemainingIngameBalance());
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
      POGOProtos.Rpc.PlatformInGamePurchaseDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformInGamePurchaseDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ingameType_ = "";
    /**
     * <code>string ingame_type = 1;</code>
     * @return The ingameType.
     */
    public java.lang.String getIngameType() {
      java.lang.Object ref = ingameType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ingameType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ingame_type = 1;</code>
     * @return The bytes for ingameType.
     */
    public com.google.protobuf.ByteString
        getIngameTypeBytes() {
      java.lang.Object ref = ingameType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ingameType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ingame_type = 1;</code>
     * @param value The ingameType to set.
     * @return This builder for chaining.
     */
    public Builder setIngameType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ingameType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ingame_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIngameType() {
      
      ingameType_ = getDefaultInstance().getIngameType();
      onChanged();
      return this;
    }
    /**
     * <code>string ingame_type = 1;</code>
     * @param value The bytes for ingameType to set.
     * @return This builder for chaining.
     */
    public Builder setIngameTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ingameType_ = value;
      onChanged();
      return this;
    }

    private long ingamePrice_ ;
    /**
     * <code>int64 ingame_price = 2;</code>
     * @return The ingamePrice.
     */
    @java.lang.Override
    public long getIngamePrice() {
      return ingamePrice_;
    }
    /**
     * <code>int64 ingame_price = 2;</code>
     * @param value The ingamePrice to set.
     * @return This builder for chaining.
     */
    public Builder setIngamePrice(long value) {
      
      ingamePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ingame_price = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIngamePrice() {
      
      ingamePrice_ = 0L;
      onChanged();
      return this;
    }

    private long remainingIngameBalance_ ;
    /**
     * <code>int64 remaining_ingame_balance = 3;</code>
     * @return The remainingIngameBalance.
     */
    @java.lang.Override
    public long getRemainingIngameBalance() {
      return remainingIngameBalance_;
    }
    /**
     * <code>int64 remaining_ingame_balance = 3;</code>
     * @param value The remainingIngameBalance to set.
     * @return This builder for chaining.
     */
    public Builder setRemainingIngameBalance(long value) {
      
      remainingIngameBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 remaining_ingame_balance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemainingIngameBalance() {
      
      remainingIngameBalance_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformInGamePurchaseDetails)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformInGamePurchaseDetails)
  private static final POGOProtos.Rpc.PlatformInGamePurchaseDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformInGamePurchaseDetails();
  }

  public static POGOProtos.Rpc.PlatformInGamePurchaseDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformInGamePurchaseDetails>
      PARSER = new com.google.protobuf.AbstractParser<PlatformInGamePurchaseDetails>() {
    @java.lang.Override
    public PlatformInGamePurchaseDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformInGamePurchaseDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformInGamePurchaseDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformInGamePurchaseDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformInGamePurchaseDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

