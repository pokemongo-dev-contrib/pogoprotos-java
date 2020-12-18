// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CheckShareExRaidPassProto}
 */
public final class CheckShareExRaidPassProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CheckShareExRaidPassProto)
    CheckShareExRaidPassProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckShareExRaidPassProto.newBuilder() to construct.
  private CheckShareExRaidPassProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckShareExRaidPassProto() {
    friendId_ = "";
    fortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckShareExRaidPassProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckShareExRaidPassProto(
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

            friendId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 24: {

            raidSeed_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckShareExRaidPassProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckShareExRaidPassProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CheckShareExRaidPassProto.class, POGOProtos.Rpc.CheckShareExRaidPassProto.Builder.class);
  }

  public static final int FRIEND_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object friendId_;
  /**
   * <code>string friend_id = 1;</code>
   * @return The friendId.
   */
  @java.lang.Override
  public java.lang.String getFriendId() {
    java.lang.Object ref = friendId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      friendId_ = s;
      return s;
    }
  }
  /**
   * <code>string friend_id = 1;</code>
   * @return The bytes for friendId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFriendIdBytes() {
    java.lang.Object ref = friendId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      friendId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  @java.lang.Override
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RAID_SEED_FIELD_NUMBER = 3;
  private long raidSeed_;
  /**
   * <code>int64 raid_seed = 3;</code>
   * @return The raidSeed.
   */
  @java.lang.Override
  public long getRaidSeed() {
    return raidSeed_;
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
    if (!getFriendIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, friendId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fortId_);
    }
    if (raidSeed_ != 0L) {
      output.writeInt64(3, raidSeed_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFriendIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, friendId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fortId_);
    }
    if (raidSeed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, raidSeed_);
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
    if (!(obj instanceof POGOProtos.Rpc.CheckShareExRaidPassProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CheckShareExRaidPassProto other = (POGOProtos.Rpc.CheckShareExRaidPassProto) obj;

    if (!getFriendId()
        .equals(other.getFriendId())) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (getRaidSeed()
        != other.getRaidSeed()) return false;
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
    hash = (37 * hash) + FRIEND_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFriendId().hashCode();
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + RAID_SEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRaidSeed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckShareExRaidPassProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CheckShareExRaidPassProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CheckShareExRaidPassProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CheckShareExRaidPassProto)
      POGOProtos.Rpc.CheckShareExRaidPassProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckShareExRaidPassProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckShareExRaidPassProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CheckShareExRaidPassProto.class, POGOProtos.Rpc.CheckShareExRaidPassProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CheckShareExRaidPassProto.newBuilder()
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
      friendId_ = "";

      fortId_ = "";

      raidSeed_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckShareExRaidPassProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckShareExRaidPassProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CheckShareExRaidPassProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckShareExRaidPassProto build() {
      POGOProtos.Rpc.CheckShareExRaidPassProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckShareExRaidPassProto buildPartial() {
      POGOProtos.Rpc.CheckShareExRaidPassProto result = new POGOProtos.Rpc.CheckShareExRaidPassProto(this);
      result.friendId_ = friendId_;
      result.fortId_ = fortId_;
      result.raidSeed_ = raidSeed_;
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
      if (other instanceof POGOProtos.Rpc.CheckShareExRaidPassProto) {
        return mergeFrom((POGOProtos.Rpc.CheckShareExRaidPassProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CheckShareExRaidPassProto other) {
      if (other == POGOProtos.Rpc.CheckShareExRaidPassProto.getDefaultInstance()) return this;
      if (!other.getFriendId().isEmpty()) {
        friendId_ = other.friendId_;
        onChanged();
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getRaidSeed() != 0L) {
        setRaidSeed(other.getRaidSeed());
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
      POGOProtos.Rpc.CheckShareExRaidPassProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CheckShareExRaidPassProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object friendId_ = "";
    /**
     * <code>string friend_id = 1;</code>
     * @return The friendId.
     */
    public java.lang.String getFriendId() {
      java.lang.Object ref = friendId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string friend_id = 1;</code>
     * @return The bytes for friendId.
     */
    public com.google.protobuf.ByteString
        getFriendIdBytes() {
      java.lang.Object ref = friendId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string friend_id = 1;</code>
     * @param value The friendId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      friendId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string friend_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendId() {
      
      friendId_ = getDefaultInstance().getFriendId();
      onChanged();
      return this;
    }
    /**
     * <code>string friend_id = 1;</code>
     * @param value The bytes for friendId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      friendId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 2;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private long raidSeed_ ;
    /**
     * <code>int64 raid_seed = 3;</code>
     * @return The raidSeed.
     */
    @java.lang.Override
    public long getRaidSeed() {
      return raidSeed_;
    }
    /**
     * <code>int64 raid_seed = 3;</code>
     * @param value The raidSeed to set.
     * @return This builder for chaining.
     */
    public Builder setRaidSeed(long value) {
      
      raidSeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 raid_seed = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaidSeed() {
      
      raidSeed_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CheckShareExRaidPassProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CheckShareExRaidPassProto)
  private static final POGOProtos.Rpc.CheckShareExRaidPassProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CheckShareExRaidPassProto();
  }

  public static POGOProtos.Rpc.CheckShareExRaidPassProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckShareExRaidPassProto>
      PARSER = new com.google.protobuf.AbstractParser<CheckShareExRaidPassProto>() {
    @java.lang.Override
    public CheckShareExRaidPassProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckShareExRaidPassProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckShareExRaidPassProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckShareExRaidPassProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CheckShareExRaidPassProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

