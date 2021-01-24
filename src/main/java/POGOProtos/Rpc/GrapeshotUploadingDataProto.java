// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GrapeshotUploadingDataProto}
 */
public final class GrapeshotUploadingDataProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GrapeshotUploadingDataProto)
    GrapeshotUploadingDataProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrapeshotUploadingDataProto.newBuilder() to construct.
  private GrapeshotUploadingDataProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrapeshotUploadingDataProto() {
    chunkData_ = java.util.Collections.emptyList();
    gcsBucket_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrapeshotUploadingDataProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrapeshotUploadingDataProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              chunkData_ = new java.util.ArrayList<POGOProtos.Rpc.GrapeshotChunkDataProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            chunkData_.add(
                input.readMessage(POGOProtos.Rpc.GrapeshotChunkDataProto.parser(), extensionRegistry));
            break;
          }
          case 18: {
            POGOProtos.Rpc.GrapeshotComposeDataProto.Builder subBuilder = null;
            if (composeData_ != null) {
              subBuilder = composeData_.toBuilder();
            }
            composeData_ = input.readMessage(POGOProtos.Rpc.GrapeshotComposeDataProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(composeData_);
              composeData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            gcsBucket_ = s;
            break;
          }
          case 32: {

            numberOfChunks_ = input.readInt32();
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
        chunkData_ = java.util.Collections.unmodifiableList(chunkData_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GrapeshotUploadingDataProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GrapeshotUploadingDataProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GrapeshotUploadingDataProto.class, POGOProtos.Rpc.GrapeshotUploadingDataProto.Builder.class);
  }

  public static final int CHUNK_DATA_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.GrapeshotChunkDataProto> chunkData_;
  /**
   * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GrapeshotChunkDataProto> getChunkDataList() {
    return chunkData_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder> 
      getChunkDataOrBuilderList() {
    return chunkData_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
   */
  @java.lang.Override
  public int getChunkDataCount() {
    return chunkData_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GrapeshotChunkDataProto getChunkData(int index) {
    return chunkData_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder getChunkDataOrBuilder(
      int index) {
    return chunkData_.get(index);
  }

  public static final int COMPOSE_DATA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GrapeshotComposeDataProto composeData_;
  /**
   * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
   * @return Whether the composeData field is set.
   */
  @java.lang.Override
  public boolean hasComposeData() {
    return composeData_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
   * @return The composeData.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GrapeshotComposeDataProto getComposeData() {
    return composeData_ == null ? POGOProtos.Rpc.GrapeshotComposeDataProto.getDefaultInstance() : composeData_;
  }
  /**
   * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GrapeshotComposeDataProtoOrBuilder getComposeDataOrBuilder() {
    return getComposeData();
  }

  public static final int GCS_BUCKET_FIELD_NUMBER = 3;
  private volatile java.lang.Object gcsBucket_;
  /**
   * <code>string gcs_bucket = 3;</code>
   * @return The gcsBucket.
   */
  @java.lang.Override
  public java.lang.String getGcsBucket() {
    java.lang.Object ref = gcsBucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsBucket_ = s;
      return s;
    }
  }
  /**
   * <code>string gcs_bucket = 3;</code>
   * @return The bytes for gcsBucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGcsBucketBytes() {
    java.lang.Object ref = gcsBucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcsBucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_OF_CHUNKS_FIELD_NUMBER = 4;
  private int numberOfChunks_;
  /**
   * <code>int32 number_of_chunks = 4;</code>
   * @return The numberOfChunks.
   */
  @java.lang.Override
  public int getNumberOfChunks() {
    return numberOfChunks_;
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
    for (int i = 0; i < chunkData_.size(); i++) {
      output.writeMessage(1, chunkData_.get(i));
    }
    if (composeData_ != null) {
      output.writeMessage(2, getComposeData());
    }
    if (!getGcsBucketBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gcsBucket_);
    }
    if (numberOfChunks_ != 0) {
      output.writeInt32(4, numberOfChunks_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < chunkData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, chunkData_.get(i));
    }
    if (composeData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getComposeData());
    }
    if (!getGcsBucketBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gcsBucket_);
    }
    if (numberOfChunks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numberOfChunks_);
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
    if (!(obj instanceof POGOProtos.Rpc.GrapeshotUploadingDataProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GrapeshotUploadingDataProto other = (POGOProtos.Rpc.GrapeshotUploadingDataProto) obj;

    if (!getChunkDataList()
        .equals(other.getChunkDataList())) return false;
    if (hasComposeData() != other.hasComposeData()) return false;
    if (hasComposeData()) {
      if (!getComposeData()
          .equals(other.getComposeData())) return false;
    }
    if (!getGcsBucket()
        .equals(other.getGcsBucket())) return false;
    if (getNumberOfChunks()
        != other.getNumberOfChunks()) return false;
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
    if (getChunkDataCount() > 0) {
      hash = (37 * hash) + CHUNK_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getChunkDataList().hashCode();
    }
    if (hasComposeData()) {
      hash = (37 * hash) + COMPOSE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getComposeData().hashCode();
    }
    hash = (37 * hash) + GCS_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getGcsBucket().hashCode();
    hash = (37 * hash) + NUMBER_OF_CHUNKS_FIELD_NUMBER;
    hash = (53 * hash) + getNumberOfChunks();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GrapeshotUploadingDataProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GrapeshotUploadingDataProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GrapeshotUploadingDataProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GrapeshotUploadingDataProto)
      POGOProtos.Rpc.GrapeshotUploadingDataProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GrapeshotUploadingDataProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GrapeshotUploadingDataProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GrapeshotUploadingDataProto.class, POGOProtos.Rpc.GrapeshotUploadingDataProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GrapeshotUploadingDataProto.newBuilder()
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
        getChunkDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (chunkDataBuilder_ == null) {
        chunkData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        chunkDataBuilder_.clear();
      }
      if (composeDataBuilder_ == null) {
        composeData_ = null;
      } else {
        composeData_ = null;
        composeDataBuilder_ = null;
      }
      gcsBucket_ = "";

      numberOfChunks_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GrapeshotUploadingDataProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GrapeshotUploadingDataProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GrapeshotUploadingDataProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GrapeshotUploadingDataProto build() {
      POGOProtos.Rpc.GrapeshotUploadingDataProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GrapeshotUploadingDataProto buildPartial() {
      POGOProtos.Rpc.GrapeshotUploadingDataProto result = new POGOProtos.Rpc.GrapeshotUploadingDataProto(this);
      int from_bitField0_ = bitField0_;
      if (chunkDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          chunkData_ = java.util.Collections.unmodifiableList(chunkData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chunkData_ = chunkData_;
      } else {
        result.chunkData_ = chunkDataBuilder_.build();
      }
      if (composeDataBuilder_ == null) {
        result.composeData_ = composeData_;
      } else {
        result.composeData_ = composeDataBuilder_.build();
      }
      result.gcsBucket_ = gcsBucket_;
      result.numberOfChunks_ = numberOfChunks_;
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
      if (other instanceof POGOProtos.Rpc.GrapeshotUploadingDataProto) {
        return mergeFrom((POGOProtos.Rpc.GrapeshotUploadingDataProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GrapeshotUploadingDataProto other) {
      if (other == POGOProtos.Rpc.GrapeshotUploadingDataProto.getDefaultInstance()) return this;
      if (chunkDataBuilder_ == null) {
        if (!other.chunkData_.isEmpty()) {
          if (chunkData_.isEmpty()) {
            chunkData_ = other.chunkData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChunkDataIsMutable();
            chunkData_.addAll(other.chunkData_);
          }
          onChanged();
        }
      } else {
        if (!other.chunkData_.isEmpty()) {
          if (chunkDataBuilder_.isEmpty()) {
            chunkDataBuilder_.dispose();
            chunkDataBuilder_ = null;
            chunkData_ = other.chunkData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            chunkDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChunkDataFieldBuilder() : null;
          } else {
            chunkDataBuilder_.addAllMessages(other.chunkData_);
          }
        }
      }
      if (other.hasComposeData()) {
        mergeComposeData(other.getComposeData());
      }
      if (!other.getGcsBucket().isEmpty()) {
        gcsBucket_ = other.gcsBucket_;
        onChanged();
      }
      if (other.getNumberOfChunks() != 0) {
        setNumberOfChunks(other.getNumberOfChunks());
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
      POGOProtos.Rpc.GrapeshotUploadingDataProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GrapeshotUploadingDataProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.GrapeshotChunkDataProto> chunkData_ =
      java.util.Collections.emptyList();
    private void ensureChunkDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        chunkData_ = new java.util.ArrayList<POGOProtos.Rpc.GrapeshotChunkDataProto>(chunkData_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GrapeshotChunkDataProto, POGOProtos.Rpc.GrapeshotChunkDataProto.Builder, POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder> chunkDataBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GrapeshotChunkDataProto> getChunkDataList() {
      if (chunkDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(chunkData_);
      } else {
        return chunkDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public int getChunkDataCount() {
      if (chunkDataBuilder_ == null) {
        return chunkData_.size();
      } else {
        return chunkDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public POGOProtos.Rpc.GrapeshotChunkDataProto getChunkData(int index) {
      if (chunkDataBuilder_ == null) {
        return chunkData_.get(index);
      } else {
        return chunkDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder setChunkData(
        int index, POGOProtos.Rpc.GrapeshotChunkDataProto value) {
      if (chunkDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChunkDataIsMutable();
        chunkData_.set(index, value);
        onChanged();
      } else {
        chunkDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder setChunkData(
        int index, POGOProtos.Rpc.GrapeshotChunkDataProto.Builder builderForValue) {
      if (chunkDataBuilder_ == null) {
        ensureChunkDataIsMutable();
        chunkData_.set(index, builderForValue.build());
        onChanged();
      } else {
        chunkDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder addChunkData(POGOProtos.Rpc.GrapeshotChunkDataProto value) {
      if (chunkDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChunkDataIsMutable();
        chunkData_.add(value);
        onChanged();
      } else {
        chunkDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder addChunkData(
        int index, POGOProtos.Rpc.GrapeshotChunkDataProto value) {
      if (chunkDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChunkDataIsMutable();
        chunkData_.add(index, value);
        onChanged();
      } else {
        chunkDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder addChunkData(
        POGOProtos.Rpc.GrapeshotChunkDataProto.Builder builderForValue) {
      if (chunkDataBuilder_ == null) {
        ensureChunkDataIsMutable();
        chunkData_.add(builderForValue.build());
        onChanged();
      } else {
        chunkDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder addChunkData(
        int index, POGOProtos.Rpc.GrapeshotChunkDataProto.Builder builderForValue) {
      if (chunkDataBuilder_ == null) {
        ensureChunkDataIsMutable();
        chunkData_.add(index, builderForValue.build());
        onChanged();
      } else {
        chunkDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder addAllChunkData(
        java.lang.Iterable<? extends POGOProtos.Rpc.GrapeshotChunkDataProto> values) {
      if (chunkDataBuilder_ == null) {
        ensureChunkDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chunkData_);
        onChanged();
      } else {
        chunkDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder clearChunkData() {
      if (chunkDataBuilder_ == null) {
        chunkData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        chunkDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public Builder removeChunkData(int index) {
      if (chunkDataBuilder_ == null) {
        ensureChunkDataIsMutable();
        chunkData_.remove(index);
        onChanged();
      } else {
        chunkDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public POGOProtos.Rpc.GrapeshotChunkDataProto.Builder getChunkDataBuilder(
        int index) {
      return getChunkDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder getChunkDataOrBuilder(
        int index) {
      if (chunkDataBuilder_ == null) {
        return chunkData_.get(index);  } else {
        return chunkDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder> 
         getChunkDataOrBuilderList() {
      if (chunkDataBuilder_ != null) {
        return chunkDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(chunkData_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public POGOProtos.Rpc.GrapeshotChunkDataProto.Builder addChunkDataBuilder() {
      return getChunkDataFieldBuilder().addBuilder(
          POGOProtos.Rpc.GrapeshotChunkDataProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public POGOProtos.Rpc.GrapeshotChunkDataProto.Builder addChunkDataBuilder(
        int index) {
      return getChunkDataFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.GrapeshotChunkDataProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GrapeshotChunkDataProto chunk_data = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GrapeshotChunkDataProto.Builder> 
         getChunkDataBuilderList() {
      return getChunkDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GrapeshotChunkDataProto, POGOProtos.Rpc.GrapeshotChunkDataProto.Builder, POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder> 
        getChunkDataFieldBuilder() {
      if (chunkDataBuilder_ == null) {
        chunkDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.GrapeshotChunkDataProto, POGOProtos.Rpc.GrapeshotChunkDataProto.Builder, POGOProtos.Rpc.GrapeshotChunkDataProtoOrBuilder>(
                chunkData_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        chunkData_ = null;
      }
      return chunkDataBuilder_;
    }

    private POGOProtos.Rpc.GrapeshotComposeDataProto composeData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GrapeshotComposeDataProto, POGOProtos.Rpc.GrapeshotComposeDataProto.Builder, POGOProtos.Rpc.GrapeshotComposeDataProtoOrBuilder> composeDataBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     * @return Whether the composeData field is set.
     */
    public boolean hasComposeData() {
      return composeDataBuilder_ != null || composeData_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     * @return The composeData.
     */
    public POGOProtos.Rpc.GrapeshotComposeDataProto getComposeData() {
      if (composeDataBuilder_ == null) {
        return composeData_ == null ? POGOProtos.Rpc.GrapeshotComposeDataProto.getDefaultInstance() : composeData_;
      } else {
        return composeDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public Builder setComposeData(POGOProtos.Rpc.GrapeshotComposeDataProto value) {
      if (composeDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        composeData_ = value;
        onChanged();
      } else {
        composeDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public Builder setComposeData(
        POGOProtos.Rpc.GrapeshotComposeDataProto.Builder builderForValue) {
      if (composeDataBuilder_ == null) {
        composeData_ = builderForValue.build();
        onChanged();
      } else {
        composeDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public Builder mergeComposeData(POGOProtos.Rpc.GrapeshotComposeDataProto value) {
      if (composeDataBuilder_ == null) {
        if (composeData_ != null) {
          composeData_ =
            POGOProtos.Rpc.GrapeshotComposeDataProto.newBuilder(composeData_).mergeFrom(value).buildPartial();
        } else {
          composeData_ = value;
        }
        onChanged();
      } else {
        composeDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public Builder clearComposeData() {
      if (composeDataBuilder_ == null) {
        composeData_ = null;
        onChanged();
      } else {
        composeData_ = null;
        composeDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public POGOProtos.Rpc.GrapeshotComposeDataProto.Builder getComposeDataBuilder() {
      
      onChanged();
      return getComposeDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    public POGOProtos.Rpc.GrapeshotComposeDataProtoOrBuilder getComposeDataOrBuilder() {
      if (composeDataBuilder_ != null) {
        return composeDataBuilder_.getMessageOrBuilder();
      } else {
        return composeData_ == null ?
            POGOProtos.Rpc.GrapeshotComposeDataProto.getDefaultInstance() : composeData_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GrapeshotComposeDataProto compose_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GrapeshotComposeDataProto, POGOProtos.Rpc.GrapeshotComposeDataProto.Builder, POGOProtos.Rpc.GrapeshotComposeDataProtoOrBuilder> 
        getComposeDataFieldBuilder() {
      if (composeDataBuilder_ == null) {
        composeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GrapeshotComposeDataProto, POGOProtos.Rpc.GrapeshotComposeDataProto.Builder, POGOProtos.Rpc.GrapeshotComposeDataProtoOrBuilder>(
                getComposeData(),
                getParentForChildren(),
                isClean());
        composeData_ = null;
      }
      return composeDataBuilder_;
    }

    private java.lang.Object gcsBucket_ = "";
    /**
     * <code>string gcs_bucket = 3;</code>
     * @return The gcsBucket.
     */
    public java.lang.String getGcsBucket() {
      java.lang.Object ref = gcsBucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsBucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gcs_bucket = 3;</code>
     * @return The bytes for gcsBucket.
     */
    public com.google.protobuf.ByteString
        getGcsBucketBytes() {
      java.lang.Object ref = gcsBucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcsBucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gcs_bucket = 3;</code>
     * @param value The gcsBucket to set.
     * @return This builder for chaining.
     */
    public Builder setGcsBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gcsBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gcs_bucket = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsBucket() {
      
      gcsBucket_ = getDefaultInstance().getGcsBucket();
      onChanged();
      return this;
    }
    /**
     * <code>string gcs_bucket = 3;</code>
     * @param value The bytes for gcsBucket to set.
     * @return This builder for chaining.
     */
    public Builder setGcsBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gcsBucket_ = value;
      onChanged();
      return this;
    }

    private int numberOfChunks_ ;
    /**
     * <code>int32 number_of_chunks = 4;</code>
     * @return The numberOfChunks.
     */
    @java.lang.Override
    public int getNumberOfChunks() {
      return numberOfChunks_;
    }
    /**
     * <code>int32 number_of_chunks = 4;</code>
     * @param value The numberOfChunks to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfChunks(int value) {
      
      numberOfChunks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 number_of_chunks = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfChunks() {
      
      numberOfChunks_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GrapeshotUploadingDataProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GrapeshotUploadingDataProto)
  private static final POGOProtos.Rpc.GrapeshotUploadingDataProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GrapeshotUploadingDataProto();
  }

  public static POGOProtos.Rpc.GrapeshotUploadingDataProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrapeshotUploadingDataProto>
      PARSER = new com.google.protobuf.AbstractParser<GrapeshotUploadingDataProto>() {
    @java.lang.Override
    public GrapeshotUploadingDataProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrapeshotUploadingDataProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrapeshotUploadingDataProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrapeshotUploadingDataProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GrapeshotUploadingDataProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
