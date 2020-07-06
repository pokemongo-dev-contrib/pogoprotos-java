// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TradePokemonQuestProto}
 */
public  final class TradePokemonQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TradePokemonQuestProto)
    TradePokemonQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TradePokemonQuestProto.newBuilder() to construct.
  private TradePokemonQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TradePokemonQuestProto() {
    friendId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TradePokemonQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TradePokemonQuestProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              friendId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            friendId_.add(s);
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
        friendId_ = friendId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TradePokemonQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TradePokemonQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TradePokemonQuestProto.class, POGOProtos.Rpc.TradePokemonQuestProto.Builder.class);
  }

  public static final int FRIEND_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList friendId_;
  /**
   * <code>repeated string friend_id = 1;</code>
   * @return A list containing the friendId.
   */
  public com.google.protobuf.ProtocolStringList
      getFriendIdList() {
    return friendId_;
  }
  /**
   * <code>repeated string friend_id = 1;</code>
   * @return The count of friendId.
   */
  public int getFriendIdCount() {
    return friendId_.size();
  }
  /**
   * <code>repeated string friend_id = 1;</code>
   * @param index The index of the element to return.
   * @return The friendId at the given index.
   */
  public java.lang.String getFriendId(int index) {
    return friendId_.get(index);
  }
  /**
   * <code>repeated string friend_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the friendId at the given index.
   */
  public com.google.protobuf.ByteString
      getFriendIdBytes(int index) {
    return friendId_.getByteString(index);
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
    for (int i = 0; i < friendId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, friendId_.getRaw(i));
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
      for (int i = 0; i < friendId_.size(); i++) {
        dataSize += computeStringSizeNoTag(friendId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFriendIdList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.TradePokemonQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TradePokemonQuestProto other = (POGOProtos.Rpc.TradePokemonQuestProto) obj;

    if (!getFriendIdList()
        .equals(other.getFriendIdList())) return false;
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
    if (getFriendIdCount() > 0) {
      hash = (37 * hash) + FRIEND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFriendIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TradePokemonQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TradePokemonQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TradePokemonQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TradePokemonQuestProto)
      POGOProtos.Rpc.TradePokemonQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TradePokemonQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TradePokemonQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TradePokemonQuestProto.class, POGOProtos.Rpc.TradePokemonQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TradePokemonQuestProto.newBuilder()
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
      friendId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TradePokemonQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TradePokemonQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TradePokemonQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TradePokemonQuestProto build() {
      POGOProtos.Rpc.TradePokemonQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TradePokemonQuestProto buildPartial() {
      POGOProtos.Rpc.TradePokemonQuestProto result = new POGOProtos.Rpc.TradePokemonQuestProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        friendId_ = friendId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.friendId_ = friendId_;
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
      if (other instanceof POGOProtos.Rpc.TradePokemonQuestProto) {
        return mergeFrom((POGOProtos.Rpc.TradePokemonQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TradePokemonQuestProto other) {
      if (other == POGOProtos.Rpc.TradePokemonQuestProto.getDefaultInstance()) return this;
      if (!other.friendId_.isEmpty()) {
        if (friendId_.isEmpty()) {
          friendId_ = other.friendId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFriendIdIsMutable();
          friendId_.addAll(other.friendId_);
        }
        onChanged();
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
      POGOProtos.Rpc.TradePokemonQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TradePokemonQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList friendId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFriendIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        friendId_ = new com.google.protobuf.LazyStringArrayList(friendId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @return A list containing the friendId.
     */
    public com.google.protobuf.ProtocolStringList
        getFriendIdList() {
      return friendId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @return The count of friendId.
     */
    public int getFriendIdCount() {
      return friendId_.size();
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param index The index of the element to return.
     * @return The friendId at the given index.
     */
    public java.lang.String getFriendId(int index) {
      return friendId_.get(index);
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the friendId at the given index.
     */
    public com.google.protobuf.ByteString
        getFriendIdBytes(int index) {
      return friendId_.getByteString(index);
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The friendId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFriendIdIsMutable();
      friendId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param value The friendId to add.
     * @return This builder for chaining.
     */
    public Builder addFriendId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFriendIdIsMutable();
      friendId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param values The friendId to add.
     * @return This builder for chaining.
     */
    public Builder addAllFriendId(
        java.lang.Iterable<java.lang.String> values) {
      ensureFriendIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, friendId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendId() {
      friendId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string friend_id = 1;</code>
     * @param value The bytes of the friendId to add.
     * @return This builder for chaining.
     */
    public Builder addFriendIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFriendIdIsMutable();
      friendId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TradePokemonQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TradePokemonQuestProto)
  private static final POGOProtos.Rpc.TradePokemonQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TradePokemonQuestProto();
  }

  public static POGOProtos.Rpc.TradePokemonQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TradePokemonQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<TradePokemonQuestProto>() {
    @java.lang.Override
    public TradePokemonQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TradePokemonQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TradePokemonQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TradePokemonQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TradePokemonQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
