// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformMapTileBundle}
 */
public final class PlatformMapTileBundle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformMapTileBundle)
    PlatformMapTileBundleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformMapTileBundle.newBuilder() to construct.
  private PlatformMapTileBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformMapTileBundle() {
    mapTile_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformMapTileBundle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformMapTileBundle(
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
              mapTile_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformMapTileDataProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            mapTile_.add(
                input.readMessage(POGOProtos.Rpc.PlatformMapTileDataProto.parser(), extensionRegistry));
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
        mapTile_ = java.util.Collections.unmodifiableList(mapTile_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapTileBundle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapTileBundle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformMapTileBundle.class, POGOProtos.Rpc.PlatformMapTileBundle.Builder.class);
  }

  public static final int MAP_TILE_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.PlatformMapTileDataProto> mapTile_;
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PlatformMapTileDataProto> getMapTileList() {
    return mapTile_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder> 
      getMapTileOrBuilderList() {
    return mapTile_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
   */
  @java.lang.Override
  public int getMapTileCount() {
    return mapTile_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformMapTileDataProto getMapTile(int index) {
    return mapTile_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder getMapTileOrBuilder(
      int index) {
    return mapTile_.get(index);
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
    for (int i = 0; i < mapTile_.size(); i++) {
      output.writeMessage(1, mapTile_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mapTile_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mapTile_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformMapTileBundle)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformMapTileBundle other = (POGOProtos.Rpc.PlatformMapTileBundle) obj;

    if (!getMapTileList()
        .equals(other.getMapTileList())) return false;
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
    if (getMapTileCount() > 0) {
      hash = (37 * hash) + MAP_TILE_FIELD_NUMBER;
      hash = (53 * hash) + getMapTileList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMapTileBundle parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformMapTileBundle prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformMapTileBundle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformMapTileBundle)
      POGOProtos.Rpc.PlatformMapTileBundleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapTileBundle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapTileBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformMapTileBundle.class, POGOProtos.Rpc.PlatformMapTileBundle.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformMapTileBundle.newBuilder()
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
        getMapTileFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mapTileBuilder_ == null) {
        mapTile_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mapTileBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformMapTileBundle_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapTileBundle getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformMapTileBundle.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapTileBundle build() {
      POGOProtos.Rpc.PlatformMapTileBundle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMapTileBundle buildPartial() {
      POGOProtos.Rpc.PlatformMapTileBundle result = new POGOProtos.Rpc.PlatformMapTileBundle(this);
      int from_bitField0_ = bitField0_;
      if (mapTileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mapTile_ = java.util.Collections.unmodifiableList(mapTile_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mapTile_ = mapTile_;
      } else {
        result.mapTile_ = mapTileBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PlatformMapTileBundle) {
        return mergeFrom((POGOProtos.Rpc.PlatformMapTileBundle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformMapTileBundle other) {
      if (other == POGOProtos.Rpc.PlatformMapTileBundle.getDefaultInstance()) return this;
      if (mapTileBuilder_ == null) {
        if (!other.mapTile_.isEmpty()) {
          if (mapTile_.isEmpty()) {
            mapTile_ = other.mapTile_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMapTileIsMutable();
            mapTile_.addAll(other.mapTile_);
          }
          onChanged();
        }
      } else {
        if (!other.mapTile_.isEmpty()) {
          if (mapTileBuilder_.isEmpty()) {
            mapTileBuilder_.dispose();
            mapTileBuilder_ = null;
            mapTile_ = other.mapTile_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mapTileBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMapTileFieldBuilder() : null;
          } else {
            mapTileBuilder_.addAllMessages(other.mapTile_);
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
      POGOProtos.Rpc.PlatformMapTileBundle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformMapTileBundle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.PlatformMapTileDataProto> mapTile_ =
      java.util.Collections.emptyList();
    private void ensureMapTileIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mapTile_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformMapTileDataProto>(mapTile_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformMapTileDataProto, POGOProtos.Rpc.PlatformMapTileDataProto.Builder, POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder> mapTileBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformMapTileDataProto> getMapTileList() {
      if (mapTileBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mapTile_);
      } else {
        return mapTileBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public int getMapTileCount() {
      if (mapTileBuilder_ == null) {
        return mapTile_.size();
      } else {
        return mapTileBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMapTileDataProto getMapTile(int index) {
      if (mapTileBuilder_ == null) {
        return mapTile_.get(index);
      } else {
        return mapTileBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder setMapTile(
        int index, POGOProtos.Rpc.PlatformMapTileDataProto value) {
      if (mapTileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapTileIsMutable();
        mapTile_.set(index, value);
        onChanged();
      } else {
        mapTileBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder setMapTile(
        int index, POGOProtos.Rpc.PlatformMapTileDataProto.Builder builderForValue) {
      if (mapTileBuilder_ == null) {
        ensureMapTileIsMutable();
        mapTile_.set(index, builderForValue.build());
        onChanged();
      } else {
        mapTileBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder addMapTile(POGOProtos.Rpc.PlatformMapTileDataProto value) {
      if (mapTileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapTileIsMutable();
        mapTile_.add(value);
        onChanged();
      } else {
        mapTileBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder addMapTile(
        int index, POGOProtos.Rpc.PlatformMapTileDataProto value) {
      if (mapTileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapTileIsMutable();
        mapTile_.add(index, value);
        onChanged();
      } else {
        mapTileBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder addMapTile(
        POGOProtos.Rpc.PlatformMapTileDataProto.Builder builderForValue) {
      if (mapTileBuilder_ == null) {
        ensureMapTileIsMutable();
        mapTile_.add(builderForValue.build());
        onChanged();
      } else {
        mapTileBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder addMapTile(
        int index, POGOProtos.Rpc.PlatformMapTileDataProto.Builder builderForValue) {
      if (mapTileBuilder_ == null) {
        ensureMapTileIsMutable();
        mapTile_.add(index, builderForValue.build());
        onChanged();
      } else {
        mapTileBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder addAllMapTile(
        java.lang.Iterable<? extends POGOProtos.Rpc.PlatformMapTileDataProto> values) {
      if (mapTileBuilder_ == null) {
        ensureMapTileIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapTile_);
        onChanged();
      } else {
        mapTileBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder clearMapTile() {
      if (mapTileBuilder_ == null) {
        mapTile_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mapTileBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public Builder removeMapTile(int index) {
      if (mapTileBuilder_ == null) {
        ensureMapTileIsMutable();
        mapTile_.remove(index);
        onChanged();
      } else {
        mapTileBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMapTileDataProto.Builder getMapTileBuilder(
        int index) {
      return getMapTileFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder getMapTileOrBuilder(
        int index) {
      if (mapTileBuilder_ == null) {
        return mapTile_.get(index);  } else {
        return mapTileBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder> 
         getMapTileOrBuilderList() {
      if (mapTileBuilder_ != null) {
        return mapTileBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mapTile_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMapTileDataProto.Builder addMapTileBuilder() {
      return getMapTileFieldBuilder().addBuilder(
          POGOProtos.Rpc.PlatformMapTileDataProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMapTileDataProto.Builder addMapTileBuilder(
        int index) {
      return getMapTileFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PlatformMapTileDataProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformMapTileDataProto map_tile = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformMapTileDataProto.Builder> 
         getMapTileBuilderList() {
      return getMapTileFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformMapTileDataProto, POGOProtos.Rpc.PlatformMapTileDataProto.Builder, POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder> 
        getMapTileFieldBuilder() {
      if (mapTileBuilder_ == null) {
        mapTileBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PlatformMapTileDataProto, POGOProtos.Rpc.PlatformMapTileDataProto.Builder, POGOProtos.Rpc.PlatformMapTileDataProtoOrBuilder>(
                mapTile_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mapTile_ = null;
      }
      return mapTileBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformMapTileBundle)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformMapTileBundle)
  private static final POGOProtos.Rpc.PlatformMapTileBundle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformMapTileBundle();
  }

  public static POGOProtos.Rpc.PlatformMapTileBundle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformMapTileBundle>
      PARSER = new com.google.protobuf.AbstractParser<PlatformMapTileBundle>() {
    @java.lang.Override
    public PlatformMapTileBundle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformMapTileBundle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformMapTileBundle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformMapTileBundle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformMapTileBundle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

