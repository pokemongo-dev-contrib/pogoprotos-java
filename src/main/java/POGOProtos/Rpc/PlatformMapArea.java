// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformMapArea}
 */
public final class PlatformMapArea extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformMapArea)
    PlatformMapAreaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformMapArea.newBuilder() to construct.
  private PlatformMapArea(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformMapArea() {
    description_ = "";
    mapProvider_ = "";
    boundingRect_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformMapArea();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformMapArea(
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

            description_ = s;
            break;
          }
          case 16: {

            epoch_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mapProvider_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              boundingRect_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformBoundingRect>();
              mutable_bitField0_ |= 0x00000001;
            }
            boundingRect_.add(
                input.readMessage(POGOProtos.Rpc.PlatformBoundingRect.parser(), extensionRegistry));
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
        boundingRect_ = java.util.Collections.unmodifiableList(boundingRect_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapArea_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapArea_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformMapArea.class, POGOProtos.Rpc.PlatformMapArea.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EPOCH_FIELD_NUMBER = 2;
  private int epoch_;
  /**
   * <code>int32 epoch = 2;</code>
   * @return The epoch.
   */
  @java.lang.Override
  public int getEpoch() {
    return epoch_;
  }

  public static final int MAP_PROVIDER_FIELD_NUMBER = 3;
  private volatile java.lang.Object mapProvider_;
  /**
   * <code>string map_provider = 3;</code>
   * @return The mapProvider.
   */
  @java.lang.Override
  public java.lang.String getMapProvider() {
    java.lang.Object ref = mapProvider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mapProvider_ = s;
      return s;
    }
  }
  /**
   * <code>string map_provider = 3;</code>
   * @return The bytes for mapProvider.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMapProviderBytes() {
    java.lang.Object ref = mapProvider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mapProvider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOUNDING_RECT_FIELD_NUMBER = 4;
  private java.util.List<POGOProtos.Rpc.PlatformBoundingRect> boundingRect_;
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PlatformBoundingRect> getBoundingRectList() {
    return boundingRect_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PlatformBoundingRectOrBuilder> 
      getBoundingRectOrBuilderList() {
    return boundingRect_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  @java.lang.Override
  public int getBoundingRectCount() {
    return boundingRect_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformBoundingRect getBoundingRect(int index) {
    return boundingRect_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformBoundingRectOrBuilder getBoundingRectOrBuilder(
      int index) {
    return boundingRect_.get(index);
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
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (epoch_ != 0) {
      output.writeInt32(2, epoch_);
    }
    if (!getMapProviderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mapProvider_);
    }
    for (int i = 0; i < boundingRect_.size(); i++) {
      output.writeMessage(4, boundingRect_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (epoch_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, epoch_);
    }
    if (!getMapProviderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mapProvider_);
    }
    for (int i = 0; i < boundingRect_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, boundingRect_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformMapArea)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformMapArea other = (POGOProtos.Rpc.PlatformMapArea) obj;

    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getEpoch()
        != other.getEpoch()) return false;
    if (!getMapProvider()
        .equals(other.getMapProvider())) return false;
    if (!getBoundingRectList()
        .equals(other.getBoundingRectList())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + EPOCH_FIELD_NUMBER;
    hash = (53 * hash) + getEpoch();
    hash = (37 * hash) + MAP_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getMapProvider().hashCode();
    if (getBoundingRectCount() > 0) {
      hash = (37 * hash) + BOUNDING_RECT_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingRectList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapArea parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformMapArea prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformMapArea}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformMapArea)
      POGOProtos.Rpc.PlatformMapAreaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapArea_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapArea_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformMapArea.class, POGOProtos.Rpc.PlatformMapArea.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformMapArea.newBuilder()
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
        getBoundingRectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      description_ = "";

      epoch_ = 0;

      mapProvider_ = "";

      if (boundingRectBuilder_ == null) {
        boundingRect_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        boundingRectBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapArea_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapArea getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformMapArea.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapArea build() {
      POGOProtos.Rpc.PlatformMapArea result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapArea buildPartial() {
      POGOProtos.Rpc.PlatformMapArea result = new POGOProtos.Rpc.PlatformMapArea(this);
      int from_bitField0_ = bitField0_;
      result.description_ = description_;
      result.epoch_ = epoch_;
      result.mapProvider_ = mapProvider_;
      if (boundingRectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          boundingRect_ = java.util.Collections.unmodifiableList(boundingRect_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.boundingRect_ = boundingRect_;
      } else {
        result.boundingRect_ = boundingRectBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.PlatformMapArea) {
        return mergeFrom((POGOProtos.Rpc.PlatformMapArea)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformMapArea other) {
      if (other == POGOProtos.Rpc.PlatformMapArea.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getEpoch() != 0) {
        setEpoch(other.getEpoch());
      }
      if (!other.getMapProvider().isEmpty()) {
        mapProvider_ = other.mapProvider_;
        onChanged();
      }
      if (boundingRectBuilder_ == null) {
        if (!other.boundingRect_.isEmpty()) {
          if (boundingRect_.isEmpty()) {
            boundingRect_ = other.boundingRect_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBoundingRectIsMutable();
            boundingRect_.addAll(other.boundingRect_);
          }
          onChanged();
        }
      } else {
        if (!other.boundingRect_.isEmpty()) {
          if (boundingRectBuilder_.isEmpty()) {
            boundingRectBuilder_.dispose();
            boundingRectBuilder_ = null;
            boundingRect_ = other.boundingRect_;
            bitField0_ = (bitField0_ & ~0x00000001);
            boundingRectBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBoundingRectFieldBuilder() : null;
          } else {
            boundingRectBuilder_.addAllMessages(other.boundingRect_);
          }
        }
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
      POGOProtos.Rpc.PlatformMapArea parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformMapArea) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 1;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private int epoch_ ;
    /**
     * <code>int32 epoch = 2;</code>
     * @return The epoch.
     */
    @java.lang.Override
    public int getEpoch() {
      return epoch_;
    }
    /**
     * <code>int32 epoch = 2;</code>
     * @param value The epoch to set.
     * @return This builder for chaining.
     */
    public Builder setEpoch(int value) {
      
      epoch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 epoch = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpoch() {
      
      epoch_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object mapProvider_ = "";
    /**
     * <code>string map_provider = 3;</code>
     * @return The mapProvider.
     */
    public java.lang.String getMapProvider() {
      java.lang.Object ref = mapProvider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mapProvider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string map_provider = 3;</code>
     * @return The bytes for mapProvider.
     */
    public com.google.protobuf.ByteString
        getMapProviderBytes() {
      java.lang.Object ref = mapProvider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mapProvider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string map_provider = 3;</code>
     * @param value The mapProvider to set.
     * @return This builder for chaining.
     */
    public Builder setMapProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mapProvider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string map_provider = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMapProvider() {
      
      mapProvider_ = getDefaultInstance().getMapProvider();
      onChanged();
      return this;
    }
    /**
     * <code>string map_provider = 3;</code>
     * @param value The bytes for mapProvider to set.
     * @return This builder for chaining.
     */
    public Builder setMapProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mapProvider_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.PlatformBoundingRect> boundingRect_ =
      java.util.Collections.emptyList();
    private void ensureBoundingRectIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        boundingRect_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformBoundingRect>(boundingRect_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformBoundingRect, POGOProtos.Rpc.PlatformBoundingRect.Builder, POGOProtos.Rpc.PlatformBoundingRectOrBuilder> boundingRectBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformBoundingRect> getBoundingRectList() {
      if (boundingRectBuilder_ == null) {
        return java.util.Collections.unmodifiableList(boundingRect_);
      } else {
        return boundingRectBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public int getBoundingRectCount() {
      if (boundingRectBuilder_ == null) {
        return boundingRect_.size();
      } else {
        return boundingRectBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public POGOProtos.Rpc.PlatformBoundingRect getBoundingRect(int index) {
      if (boundingRectBuilder_ == null) {
        return boundingRect_.get(index);
      } else {
        return boundingRectBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder setBoundingRect(
        int index, POGOProtos.Rpc.PlatformBoundingRect value) {
      if (boundingRectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingRectIsMutable();
        boundingRect_.set(index, value);
        onChanged();
      } else {
        boundingRectBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder setBoundingRect(
        int index, POGOProtos.Rpc.PlatformBoundingRect.Builder builderForValue) {
      if (boundingRectBuilder_ == null) {
        ensureBoundingRectIsMutable();
        boundingRect_.set(index, builderForValue.build());
        onChanged();
      } else {
        boundingRectBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder addBoundingRect(POGOProtos.Rpc.PlatformBoundingRect value) {
      if (boundingRectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingRectIsMutable();
        boundingRect_.add(value);
        onChanged();
      } else {
        boundingRectBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder addBoundingRect(
        int index, POGOProtos.Rpc.PlatformBoundingRect value) {
      if (boundingRectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBoundingRectIsMutable();
        boundingRect_.add(index, value);
        onChanged();
      } else {
        boundingRectBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder addBoundingRect(
        POGOProtos.Rpc.PlatformBoundingRect.Builder builderForValue) {
      if (boundingRectBuilder_ == null) {
        ensureBoundingRectIsMutable();
        boundingRect_.add(builderForValue.build());
        onChanged();
      } else {
        boundingRectBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder addBoundingRect(
        int index, POGOProtos.Rpc.PlatformBoundingRect.Builder builderForValue) {
      if (boundingRectBuilder_ == null) {
        ensureBoundingRectIsMutable();
        boundingRect_.add(index, builderForValue.build());
        onChanged();
      } else {
        boundingRectBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder addAllBoundingRect(
        java.lang.Iterable<? extends POGOProtos.Rpc.PlatformBoundingRect> values) {
      if (boundingRectBuilder_ == null) {
        ensureBoundingRectIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, boundingRect_);
        onChanged();
      } else {
        boundingRectBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder clearBoundingRect() {
      if (boundingRectBuilder_ == null) {
        boundingRect_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        boundingRectBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public Builder removeBoundingRect(int index) {
      if (boundingRectBuilder_ == null) {
        ensureBoundingRectIsMutable();
        boundingRect_.remove(index);
        onChanged();
      } else {
        boundingRectBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public POGOProtos.Rpc.PlatformBoundingRect.Builder getBoundingRectBuilder(
        int index) {
      return getBoundingRectFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public POGOProtos.Rpc.PlatformBoundingRectOrBuilder getBoundingRectOrBuilder(
        int index) {
      if (boundingRectBuilder_ == null) {
        return boundingRect_.get(index);  } else {
        return boundingRectBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PlatformBoundingRectOrBuilder> 
         getBoundingRectOrBuilderList() {
      if (boundingRectBuilder_ != null) {
        return boundingRectBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(boundingRect_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public POGOProtos.Rpc.PlatformBoundingRect.Builder addBoundingRectBuilder() {
      return getBoundingRectFieldBuilder().addBuilder(
          POGOProtos.Rpc.PlatformBoundingRect.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public POGOProtos.Rpc.PlatformBoundingRect.Builder addBoundingRectBuilder(
        int index) {
      return getBoundingRectFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PlatformBoundingRect.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformBoundingRect.Builder> 
         getBoundingRectBuilderList() {
      return getBoundingRectFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformBoundingRect, POGOProtos.Rpc.PlatformBoundingRect.Builder, POGOProtos.Rpc.PlatformBoundingRectOrBuilder> 
        getBoundingRectFieldBuilder() {
      if (boundingRectBuilder_ == null) {
        boundingRectBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PlatformBoundingRect, POGOProtos.Rpc.PlatformBoundingRect.Builder, POGOProtos.Rpc.PlatformBoundingRectOrBuilder>(
                boundingRect_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        boundingRect_ = null;
      }
      return boundingRectBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformMapArea)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformMapArea)
  private static final POGOProtos.Rpc.PlatformMapArea DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformMapArea();
  }

  public static POGOProtos.Rpc.PlatformMapArea getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformMapArea>
      PARSER = new com.google.protobuf.AbstractParser<PlatformMapArea>() {
    @java.lang.Override
    public PlatformMapArea parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformMapArea(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformMapArea> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformMapArea> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformMapArea getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

