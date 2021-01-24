// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetUploadUrlProto}
 */
public final class GetUploadUrlProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetUploadUrlProto)
    GetUploadUrlProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUploadUrlProto.newBuilder() to construct.
  private GetUploadUrlProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUploadUrlProto() {
    userId_ = "";
    gameUniqueId_ = "";
    submissionType_ = 0;
    submissionId_ = "";
    imageContexts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUploadUrlProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUploadUrlProto(
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

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            gameUniqueId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            submissionType_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            submissionId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              imageContexts_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            imageContexts_.add(s);
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
        imageContexts_ = imageContexts_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetUploadUrlProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetUploadUrlProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetUploadUrlProto.class, POGOProtos.Rpc.GetUploadUrlProto.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAME_UNIQUE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object gameUniqueId_;
  /**
   * <code>string game_unique_id = 2;</code>
   * @return The gameUniqueId.
   */
  @java.lang.Override
  public java.lang.String getGameUniqueId() {
    java.lang.Object ref = gameUniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameUniqueId_ = s;
      return s;
    }
  }
  /**
   * <code>string game_unique_id = 2;</code>
   * @return The bytes for gameUniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameUniqueIdBytes() {
    java.lang.Object ref = gameUniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameUniqueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBMISSION_TYPE_FIELD_NUMBER = 3;
  private int submissionType_;
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
   * @return The enum numeric value on the wire for submissionType.
   */
  @java.lang.Override public int getSubmissionTypeValue() {
    return submissionType_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
   * @return The submissionType.
   */
  @java.lang.Override public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PlayerSubmissionTypeProto result = POGOProtos.Rpc.PlayerSubmissionTypeProto.valueOf(submissionType_);
    return result == null ? POGOProtos.Rpc.PlayerSubmissionTypeProto.UNRECOGNIZED : result;
  }

  public static final int SUBMISSION_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object submissionId_;
  /**
   * <code>string submission_id = 4;</code>
   * @return The submissionId.
   */
  @java.lang.Override
  public java.lang.String getSubmissionId() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submissionId_ = s;
      return s;
    }
  }
  /**
   * <code>string submission_id = 4;</code>
   * @return The bytes for submissionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubmissionIdBytes() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submissionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_CONTEXTS_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList imageContexts_;
  /**
   * <code>repeated string image_contexts = 5;</code>
   * @return A list containing the imageContexts.
   */
  public com.google.protobuf.ProtocolStringList
      getImageContextsList() {
    return imageContexts_;
  }
  /**
   * <code>repeated string image_contexts = 5;</code>
   * @return The count of imageContexts.
   */
  public int getImageContextsCount() {
    return imageContexts_.size();
  }
  /**
   * <code>repeated string image_contexts = 5;</code>
   * @param index The index of the element to return.
   * @return The imageContexts at the given index.
   */
  public java.lang.String getImageContexts(int index) {
    return imageContexts_.get(index);
  }
  /**
   * <code>repeated string image_contexts = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageContexts at the given index.
   */
  public com.google.protobuf.ByteString
      getImageContextsBytes(int index) {
    return imageContexts_.getByteString(index);
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
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getGameUniqueIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gameUniqueId_);
    }
    if (submissionType_ != POGOProtos.Rpc.PlayerSubmissionTypeProto.PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, submissionType_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, submissionId_);
    }
    for (int i = 0; i < imageContexts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, imageContexts_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getGameUniqueIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gameUniqueId_);
    }
    if (submissionType_ != POGOProtos.Rpc.PlayerSubmissionTypeProto.PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, submissionType_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, submissionId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < imageContexts_.size(); i++) {
        dataSize += computeStringSizeNoTag(imageContexts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImageContextsList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.GetUploadUrlProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetUploadUrlProto other = (POGOProtos.Rpc.GetUploadUrlProto) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getGameUniqueId()
        .equals(other.getGameUniqueId())) return false;
    if (submissionType_ != other.submissionType_) return false;
    if (!getSubmissionId()
        .equals(other.getSubmissionId())) return false;
    if (!getImageContextsList()
        .equals(other.getImageContextsList())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + GAME_UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGameUniqueId().hashCode();
    hash = (37 * hash) + SUBMISSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + submissionType_;
    hash = (37 * hash) + SUBMISSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubmissionId().hashCode();
    if (getImageContextsCount() > 0) {
      hash = (37 * hash) + IMAGE_CONTEXTS_FIELD_NUMBER;
      hash = (53 * hash) + getImageContextsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetUploadUrlProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetUploadUrlProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetUploadUrlProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetUploadUrlProto)
      POGOProtos.Rpc.GetUploadUrlProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetUploadUrlProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetUploadUrlProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetUploadUrlProto.class, POGOProtos.Rpc.GetUploadUrlProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetUploadUrlProto.newBuilder()
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
      userId_ = "";

      gameUniqueId_ = "";

      submissionType_ = 0;

      submissionId_ = "";

      imageContexts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetUploadUrlProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetUploadUrlProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetUploadUrlProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetUploadUrlProto build() {
      POGOProtos.Rpc.GetUploadUrlProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetUploadUrlProto buildPartial() {
      POGOProtos.Rpc.GetUploadUrlProto result = new POGOProtos.Rpc.GetUploadUrlProto(this);
      int from_bitField0_ = bitField0_;
      result.userId_ = userId_;
      result.gameUniqueId_ = gameUniqueId_;
      result.submissionType_ = submissionType_;
      result.submissionId_ = submissionId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        imageContexts_ = imageContexts_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.imageContexts_ = imageContexts_;
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
      if (other instanceof POGOProtos.Rpc.GetUploadUrlProto) {
        return mergeFrom((POGOProtos.Rpc.GetUploadUrlProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetUploadUrlProto other) {
      if (other == POGOProtos.Rpc.GetUploadUrlProto.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getGameUniqueId().isEmpty()) {
        gameUniqueId_ = other.gameUniqueId_;
        onChanged();
      }
      if (other.submissionType_ != 0) {
        setSubmissionTypeValue(other.getSubmissionTypeValue());
      }
      if (!other.getSubmissionId().isEmpty()) {
        submissionId_ = other.submissionId_;
        onChanged();
      }
      if (!other.imageContexts_.isEmpty()) {
        if (imageContexts_.isEmpty()) {
          imageContexts_ = other.imageContexts_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureImageContextsIsMutable();
          imageContexts_.addAll(other.imageContexts_);
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
      POGOProtos.Rpc.GetUploadUrlProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetUploadUrlProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gameUniqueId_ = "";
    /**
     * <code>string game_unique_id = 2;</code>
     * @return The gameUniqueId.
     */
    public java.lang.String getGameUniqueId() {
      java.lang.Object ref = gameUniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameUniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string game_unique_id = 2;</code>
     * @return The bytes for gameUniqueId.
     */
    public com.google.protobuf.ByteString
        getGameUniqueIdBytes() {
      java.lang.Object ref = gameUniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameUniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string game_unique_id = 2;</code>
     * @param value The gameUniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setGameUniqueId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gameUniqueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string game_unique_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameUniqueId() {
      
      gameUniqueId_ = getDefaultInstance().getGameUniqueId();
      onChanged();
      return this;
    }
    /**
     * <code>string game_unique_id = 2;</code>
     * @param value The bytes for gameUniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setGameUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gameUniqueId_ = value;
      onChanged();
      return this;
    }

    private int submissionType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
     * @return The enum numeric value on the wire for submissionType.
     */
    @java.lang.Override public int getSubmissionTypeValue() {
      return submissionType_;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
     * @param value The enum numeric value on the wire for submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypeValue(int value) {
      
      submissionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
     * @return The submissionType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PlayerSubmissionTypeProto result = POGOProtos.Rpc.PlayerSubmissionTypeProto.valueOf(submissionType_);
      return result == null ? POGOProtos.Rpc.PlayerSubmissionTypeProto.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
     * @param value The submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionType(POGOProtos.Rpc.PlayerSubmissionTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      submissionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionType() {
      
      submissionType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object submissionId_ = "";
    /**
     * <code>string submission_id = 4;</code>
     * @return The submissionId.
     */
    public java.lang.String getSubmissionId() {
      java.lang.Object ref = submissionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submissionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string submission_id = 4;</code>
     * @return The bytes for submissionId.
     */
    public com.google.protobuf.ByteString
        getSubmissionIdBytes() {
      java.lang.Object ref = submissionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submissionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submission_id = 4;</code>
     * @param value The submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      submissionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionId() {
      
      submissionId_ = getDefaultInstance().getSubmissionId();
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 4;</code>
     * @param value The bytes for submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      submissionId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList imageContexts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureImageContextsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        imageContexts_ = new com.google.protobuf.LazyStringArrayList(imageContexts_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @return A list containing the imageContexts.
     */
    public com.google.protobuf.ProtocolStringList
        getImageContextsList() {
      return imageContexts_.getUnmodifiableView();
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @return The count of imageContexts.
     */
    public int getImageContextsCount() {
      return imageContexts_.size();
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param index The index of the element to return.
     * @return The imageContexts at the given index.
     */
    public java.lang.String getImageContexts(int index) {
      return imageContexts_.get(index);
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the imageContexts at the given index.
     */
    public com.google.protobuf.ByteString
        getImageContextsBytes(int index) {
      return imageContexts_.getByteString(index);
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param index The index to set the value at.
     * @param value The imageContexts to set.
     * @return This builder for chaining.
     */
    public Builder setImageContexts(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageContextsIsMutable();
      imageContexts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param value The imageContexts to add.
     * @return This builder for chaining.
     */
    public Builder addImageContexts(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImageContextsIsMutable();
      imageContexts_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param values The imageContexts to add.
     * @return This builder for chaining.
     */
    public Builder addAllImageContexts(
        java.lang.Iterable<java.lang.String> values) {
      ensureImageContextsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, imageContexts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageContexts() {
      imageContexts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string image_contexts = 5;</code>
     * @param value The bytes of the imageContexts to add.
     * @return This builder for chaining.
     */
    public Builder addImageContextsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureImageContextsIsMutable();
      imageContexts_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetUploadUrlProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetUploadUrlProto)
  private static final POGOProtos.Rpc.GetUploadUrlProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetUploadUrlProto();
  }

  public static POGOProtos.Rpc.GetUploadUrlProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUploadUrlProto>
      PARSER = new com.google.protobuf.AbstractParser<GetUploadUrlProto>() {
    @java.lang.Override
    public GetUploadUrlProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUploadUrlProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUploadUrlProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUploadUrlProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetUploadUrlProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
