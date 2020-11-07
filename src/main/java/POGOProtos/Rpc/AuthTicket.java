// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AuthTicket}
 */
public final class AuthTicket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AuthTicket)
    AuthTicketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthTicket.newBuilder() to construct.
  private AuthTicket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthTicket() {
    start_ = com.google.protobuf.ByteString.EMPTY;
    end_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthTicket();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthTicket(
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

            start_ = input.readBytes();
            break;
          }
          case 16: {

            expireTimestampMs_ = input.readUInt64();
            break;
          }
          case 26: {

            end_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AuthTicket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AuthTicket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AuthTicket.class, POGOProtos.Rpc.AuthTicket.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString start_;
  /**
   * <code>bytes start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStart() {
    return start_;
  }

  public static final int EXPIRE_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long expireTimestampMs_;
  /**
   * <code>uint64 expire_timestamp_ms = 2;</code>
   * @return The expireTimestampMs.
   */
  @java.lang.Override
  public long getExpireTimestampMs() {
    return expireTimestampMs_;
  }

  public static final int END_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString end_;
  /**
   * <code>bytes end = 3;</code>
   * @return The end.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnd() {
    return end_;
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
    if (!start_.isEmpty()) {
      output.writeBytes(1, start_);
    }
    if (expireTimestampMs_ != 0L) {
      output.writeUInt64(2, expireTimestampMs_);
    }
    if (!end_.isEmpty()) {
      output.writeBytes(3, end_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!start_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, start_);
    }
    if (expireTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, expireTimestampMs_);
    }
    if (!end_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, end_);
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
    if (!(obj instanceof POGOProtos.Rpc.AuthTicket)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AuthTicket other = (POGOProtos.Rpc.AuthTicket) obj;

    if (!getStart()
        .equals(other.getStart())) return false;
    if (getExpireTimestampMs()
        != other.getExpireTimestampMs()) return false;
    if (!getEnd()
        .equals(other.getEnd())) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart().hashCode();
    hash = (37 * hash) + EXPIRE_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireTimestampMs());
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AuthTicket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AuthTicket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AuthTicket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AuthTicket parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AuthTicket prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AuthTicket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AuthTicket)
      POGOProtos.Rpc.AuthTicketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AuthTicket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AuthTicket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AuthTicket.class, POGOProtos.Rpc.AuthTicket.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AuthTicket.newBuilder()
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
      start_ = com.google.protobuf.ByteString.EMPTY;

      expireTimestampMs_ = 0L;

      end_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AuthTicket_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AuthTicket getDefaultInstanceForType() {
      return POGOProtos.Rpc.AuthTicket.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AuthTicket build() {
      POGOProtos.Rpc.AuthTicket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AuthTicket buildPartial() {
      POGOProtos.Rpc.AuthTicket result = new POGOProtos.Rpc.AuthTicket(this);
      result.start_ = start_;
      result.expireTimestampMs_ = expireTimestampMs_;
      result.end_ = end_;
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
      if (other instanceof POGOProtos.Rpc.AuthTicket) {
        return mergeFrom((POGOProtos.Rpc.AuthTicket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AuthTicket other) {
      if (other == POGOProtos.Rpc.AuthTicket.getDefaultInstance()) return this;
      if (other.getStart() != com.google.protobuf.ByteString.EMPTY) {
        setStart(other.getStart());
      }
      if (other.getExpireTimestampMs() != 0L) {
        setExpireTimestampMs(other.getExpireTimestampMs());
      }
      if (other.getEnd() != com.google.protobuf.ByteString.EMPTY) {
        setEnd(other.getEnd());
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
      POGOProtos.Rpc.AuthTicket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AuthTicket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString start_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStart() {
      return start_;
    }
    /**
     * <code>bytes start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      
      start_ = getDefaultInstance().getStart();
      onChanged();
      return this;
    }

    private long expireTimestampMs_ ;
    /**
     * <code>uint64 expire_timestamp_ms = 2;</code>
     * @return The expireTimestampMs.
     */
    @java.lang.Override
    public long getExpireTimestampMs() {
      return expireTimestampMs_;
    }
    /**
     * <code>uint64 expire_timestamp_ms = 2;</code>
     * @param value The expireTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTimestampMs(long value) {
      
      expireTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 expire_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTimestampMs() {
      
      expireTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString end_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes end = 3;</code>
     * @return The end.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEnd() {
      return end_;
    }
    /**
     * <code>bytes end = 3;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes end = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      
      end_ = getDefaultInstance().getEnd();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AuthTicket)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AuthTicket)
  private static final POGOProtos.Rpc.AuthTicket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AuthTicket();
  }

  public static POGOProtos.Rpc.AuthTicket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthTicket>
      PARSER = new com.google.protobuf.AbstractParser<AuthTicket>() {
    @java.lang.Override
    public AuthTicket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthTicket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthTicket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthTicket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AuthTicket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

