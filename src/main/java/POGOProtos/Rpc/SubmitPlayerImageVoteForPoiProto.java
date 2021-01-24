// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto}
 */
public final class SubmitPlayerImageVoteForPoiProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)
    SubmitPlayerImageVoteForPoiProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPlayerImageVoteForPoiProto.newBuilder() to construct.
  private SubmitPlayerImageVoteForPoiProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPlayerImageVoteForPoiProto() {
    imageIdsToVoteFor_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    imageIdsToUnvote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    poiId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPlayerImageVoteForPoiProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitPlayerImageVoteForPoiProto(
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
              imageIdsToVoteFor_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            imageIdsToVoteFor_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              imageIdsToUnvote_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            imageIdsToUnvote_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            poiId_ = s;
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
        imageIdsToVoteFor_ = imageIdsToVoteFor_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        imageIdsToUnvote_ = imageIdsToUnvote_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPlayerImageVoteForPoiProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPlayerImageVoteForPoiProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.class, POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.Builder.class);
  }

  public static final int IMAGE_IDS_TO_VOTE_FOR_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList imageIdsToVoteFor_;
  /**
   * <code>repeated string image_ids_to_vote_for = 1;</code>
   * @return A list containing the imageIdsToVoteFor.
   */
  public com.google.protobuf.ProtocolStringList
      getImageIdsToVoteForList() {
    return imageIdsToVoteFor_;
  }
  /**
   * <code>repeated string image_ids_to_vote_for = 1;</code>
   * @return The count of imageIdsToVoteFor.
   */
  public int getImageIdsToVoteForCount() {
    return imageIdsToVoteFor_.size();
  }
  /**
   * <code>repeated string image_ids_to_vote_for = 1;</code>
   * @param index The index of the element to return.
   * @return The imageIdsToVoteFor at the given index.
   */
  public java.lang.String getImageIdsToVoteFor(int index) {
    return imageIdsToVoteFor_.get(index);
  }
  /**
   * <code>repeated string image_ids_to_vote_for = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageIdsToVoteFor at the given index.
   */
  public com.google.protobuf.ByteString
      getImageIdsToVoteForBytes(int index) {
    return imageIdsToVoteFor_.getByteString(index);
  }

  public static final int IMAGE_IDS_TO_UNVOTE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList imageIdsToUnvote_;
  /**
   * <code>repeated string image_ids_to_unvote = 2;</code>
   * @return A list containing the imageIdsToUnvote.
   */
  public com.google.protobuf.ProtocolStringList
      getImageIdsToUnvoteList() {
    return imageIdsToUnvote_;
  }
  /**
   * <code>repeated string image_ids_to_unvote = 2;</code>
   * @return The count of imageIdsToUnvote.
   */
  public int getImageIdsToUnvoteCount() {
    return imageIdsToUnvote_.size();
  }
  /**
   * <code>repeated string image_ids_to_unvote = 2;</code>
   * @param index The index of the element to return.
   * @return The imageIdsToUnvote at the given index.
   */
  public java.lang.String getImageIdsToUnvote(int index) {
    return imageIdsToUnvote_.get(index);
  }
  /**
   * <code>repeated string image_ids_to_unvote = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageIdsToUnvote at the given index.
   */
  public com.google.protobuf.ByteString
      getImageIdsToUnvoteBytes(int index) {
    return imageIdsToUnvote_.getByteString(index);
  }

  public static final int POI_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 3;</code>
   * @return The poiId.
   */
  @java.lang.Override
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 3;</code>
   * @return The bytes for poiId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < imageIdsToVoteFor_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imageIdsToVoteFor_.getRaw(i));
    }
    for (int i = 0; i < imageIdsToUnvote_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageIdsToUnvote_.getRaw(i));
    }
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, poiId_);
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
      for (int i = 0; i < imageIdsToVoteFor_.size(); i++) {
        dataSize += computeStringSizeNoTag(imageIdsToVoteFor_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImageIdsToVoteForList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < imageIdsToUnvote_.size(); i++) {
        dataSize += computeStringSizeNoTag(imageIdsToUnvote_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImageIdsToUnvoteList().size();
    }
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, poiId_);
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
    if (!(obj instanceof POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto other = (POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto) obj;

    if (!getImageIdsToVoteForList()
        .equals(other.getImageIdsToVoteForList())) return false;
    if (!getImageIdsToUnvoteList()
        .equals(other.getImageIdsToUnvoteList())) return false;
    if (!getPoiId()
        .equals(other.getPoiId())) return false;
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
    if (getImageIdsToVoteForCount() > 0) {
      hash = (37 * hash) + IMAGE_IDS_TO_VOTE_FOR_FIELD_NUMBER;
      hash = (53 * hash) + getImageIdsToVoteForList().hashCode();
    }
    if (getImageIdsToUnvoteCount() > 0) {
      hash = (37 * hash) + IMAGE_IDS_TO_UNVOTE_FIELD_NUMBER;
      hash = (53 * hash) + getImageIdsToUnvoteList().hashCode();
    }
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)
      POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPlayerImageVoteForPoiProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPlayerImageVoteForPoiProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.class, POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.newBuilder()
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
      imageIdsToVoteFor_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      imageIdsToUnvote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      poiId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPlayerImageVoteForPoiProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto build() {
      POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto buildPartial() {
      POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto result = new POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        imageIdsToVoteFor_ = imageIdsToVoteFor_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.imageIdsToVoteFor_ = imageIdsToVoteFor_;
      if (((bitField0_ & 0x00000002) != 0)) {
        imageIdsToUnvote_ = imageIdsToUnvote_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.imageIdsToUnvote_ = imageIdsToUnvote_;
      result.poiId_ = poiId_;
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
      if (other instanceof POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto) {
        return mergeFrom((POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto other) {
      if (other == POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto.getDefaultInstance()) return this;
      if (!other.imageIdsToVoteFor_.isEmpty()) {
        if (imageIdsToVoteFor_.isEmpty()) {
          imageIdsToVoteFor_ = other.imageIdsToVoteFor_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureImageIdsToVoteForIsMutable();
          imageIdsToVoteFor_.addAll(other.imageIdsToVoteFor_);
        }
        onChanged();
      }
      if (!other.imageIdsToUnvote_.isEmpty()) {
        if (imageIdsToUnvote_.isEmpty()) {
          imageIdsToUnvote_ = other.imageIdsToUnvote_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureImageIdsToUnvoteIsMutable();
          imageIdsToUnvote_.addAll(other.imageIdsToUnvote_);
        }
        onChanged();
      }
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
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
      POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList imageIdsToVoteFor_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureImageIdsToVoteForIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        imageIdsToVoteFor_ = new com.google.protobuf.LazyStringArrayList(imageIdsToVoteFor_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @return A list containing the imageIdsToVoteFor.
     */
    public com.google.protobuf.ProtocolStringList
        getImageIdsToVoteForList() {
      return imageIdsToVoteFor_.getUnmodifiableView();
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @return The count of imageIdsToVoteFor.
     */
    public int getImageIdsToVoteForCount() {
      return imageIdsToVoteFor_.size();
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param index The index of the element to return.
     * @return The imageIdsToVoteFor at the given index.
     */
    public java.lang.String getImageIdsToVoteFor(int index) {
      return imageIdsToVoteFor_.get(index);
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the imageIdsToVoteFor at the given index.
     */
    public com.google.protobuf.ByteString
        getImageIdsToVoteForBytes(int index) {
      return imageIdsToVoteFor_.getByteString(index);
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param index The index to set the value at.
     * @param value The imageIdsToVoteFor to set.
     * @return This builder for chaining.
     */
    public Builder setImageIdsToVoteFor(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageIdsToVoteForIsMutable();
      imageIdsToVoteFor_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param value The imageIdsToVoteFor to add.
     * @return This builder for chaining.
     */
    public Builder addImageIdsToVoteFor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageIdsToVoteForIsMutable();
      imageIdsToVoteFor_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param values The imageIdsToVoteFor to add.
     * @return This builder for chaining.
     */
    public Builder addAllImageIdsToVoteFor(
        java.lang.Iterable<java.lang.String> values) {
      ensureImageIdsToVoteForIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, imageIdsToVoteFor_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageIdsToVoteFor() {
      imageIdsToVoteFor_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_vote_for = 1;</code>
     * @param value The bytes of the imageIdsToVoteFor to add.
     * @return This builder for chaining.
     */
    public Builder addImageIdsToVoteForBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureImageIdsToVoteForIsMutable();
      imageIdsToVoteFor_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList imageIdsToUnvote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureImageIdsToUnvoteIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        imageIdsToUnvote_ = new com.google.protobuf.LazyStringArrayList(imageIdsToUnvote_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @return A list containing the imageIdsToUnvote.
     */
    public com.google.protobuf.ProtocolStringList
        getImageIdsToUnvoteList() {
      return imageIdsToUnvote_.getUnmodifiableView();
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @return The count of imageIdsToUnvote.
     */
    public int getImageIdsToUnvoteCount() {
      return imageIdsToUnvote_.size();
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param index The index of the element to return.
     * @return The imageIdsToUnvote at the given index.
     */
    public java.lang.String getImageIdsToUnvote(int index) {
      return imageIdsToUnvote_.get(index);
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the imageIdsToUnvote at the given index.
     */
    public com.google.protobuf.ByteString
        getImageIdsToUnvoteBytes(int index) {
      return imageIdsToUnvote_.getByteString(index);
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param index The index to set the value at.
     * @param value The imageIdsToUnvote to set.
     * @return This builder for chaining.
     */
    public Builder setImageIdsToUnvote(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageIdsToUnvoteIsMutable();
      imageIdsToUnvote_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param value The imageIdsToUnvote to add.
     * @return This builder for chaining.
     */
    public Builder addImageIdsToUnvote(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageIdsToUnvoteIsMutable();
      imageIdsToUnvote_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param values The imageIdsToUnvote to add.
     * @return This builder for chaining.
     */
    public Builder addAllImageIdsToUnvote(
        java.lang.Iterable<java.lang.String> values) {
      ensureImageIdsToUnvoteIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, imageIdsToUnvote_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageIdsToUnvote() {
      imageIdsToUnvote_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_ids_to_unvote = 2;</code>
     * @param value The bytes of the imageIdsToUnvote to add.
     * @return This builder for chaining.
     */
    public Builder addImageIdsToUnvoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureImageIdsToUnvoteIsMutable();
      imageIdsToUnvote_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 3;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 3;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 3;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 3;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto)
  private static final POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto();
  }

  public static POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPlayerImageVoteForPoiProto>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPlayerImageVoteForPoiProto>() {
    @java.lang.Override
    public SubmitPlayerImageVoteForPoiProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitPlayerImageVoteForPoiProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitPlayerImageVoteForPoiProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPlayerImageVoteForPoiProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SubmitPlayerImageVoteForPoiProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
