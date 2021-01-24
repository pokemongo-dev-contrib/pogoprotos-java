// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.InventoryDeltaProto}
 */
public final class InventoryDeltaProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InventoryDeltaProto)
    InventoryDeltaProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryDeltaProto.newBuilder() to construct.
  private InventoryDeltaProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryDeltaProto() {
    inventoryItem_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryDeltaProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryDeltaProto(
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
          case 8: {

            originalTimestamp_ = input.readInt64();
            break;
          }
          case 16: {

            newTimestamp_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              inventoryItem_ = new java.util.ArrayList<POGOProtos.Rpc.InventoryItemProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            inventoryItem_.add(
                input.readMessage(POGOProtos.Rpc.InventoryItemProto.parser(), extensionRegistry));
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
        inventoryItem_ = java.util.Collections.unmodifiableList(inventoryItem_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryDeltaProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryDeltaProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InventoryDeltaProto.class, POGOProtos.Rpc.InventoryDeltaProto.Builder.class);
  }

  public static final int ORIGINAL_TIMESTAMP_FIELD_NUMBER = 1;
  private long originalTimestamp_;
  /**
   * <code>int64 original_timestamp = 1;</code>
   * @return The originalTimestamp.
   */
  @java.lang.Override
  public long getOriginalTimestamp() {
    return originalTimestamp_;
  }

  public static final int NEW_TIMESTAMP_FIELD_NUMBER = 2;
  private long newTimestamp_;
  /**
   * <code>int64 new_timestamp = 2;</code>
   * @return The newTimestamp.
   */
  @java.lang.Override
  public long getNewTimestamp() {
    return newTimestamp_;
  }

  public static final int INVENTORY_ITEM_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.InventoryItemProto> inventoryItem_;
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.InventoryItemProto> getInventoryItemList() {
    return inventoryItem_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.InventoryItemProtoOrBuilder> 
      getInventoryItemOrBuilderList() {
    return inventoryItem_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  @java.lang.Override
  public int getInventoryItemCount() {
    return inventoryItem_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryItemProto getInventoryItem(int index) {
    return inventoryItem_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryItemProtoOrBuilder getInventoryItemOrBuilder(
      int index) {
    return inventoryItem_.get(index);
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
    if (originalTimestamp_ != 0L) {
      output.writeInt64(1, originalTimestamp_);
    }
    if (newTimestamp_ != 0L) {
      output.writeInt64(2, newTimestamp_);
    }
    for (int i = 0; i < inventoryItem_.size(); i++) {
      output.writeMessage(3, inventoryItem_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (originalTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, originalTimestamp_);
    }
    if (newTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, newTimestamp_);
    }
    for (int i = 0; i < inventoryItem_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, inventoryItem_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.InventoryDeltaProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InventoryDeltaProto other = (POGOProtos.Rpc.InventoryDeltaProto) obj;

    if (getOriginalTimestamp()
        != other.getOriginalTimestamp()) return false;
    if (getNewTimestamp()
        != other.getNewTimestamp()) return false;
    if (!getInventoryItemList()
        .equals(other.getInventoryItemList())) return false;
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
    hash = (37 * hash) + ORIGINAL_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOriginalTimestamp());
    hash = (37 * hash) + NEW_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNewTimestamp());
    if (getInventoryItemCount() > 0) {
      hash = (37 * hash) + INVENTORY_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getInventoryItemList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryDeltaProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InventoryDeltaProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.InventoryDeltaProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InventoryDeltaProto)
      POGOProtos.Rpc.InventoryDeltaProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryDeltaProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryDeltaProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InventoryDeltaProto.class, POGOProtos.Rpc.InventoryDeltaProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InventoryDeltaProto.newBuilder()
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
        getInventoryItemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      originalTimestamp_ = 0L;

      newTimestamp_ = 0L;

      if (inventoryItemBuilder_ == null) {
        inventoryItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inventoryItemBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryDeltaProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryDeltaProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.InventoryDeltaProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryDeltaProto build() {
      POGOProtos.Rpc.InventoryDeltaProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryDeltaProto buildPartial() {
      POGOProtos.Rpc.InventoryDeltaProto result = new POGOProtos.Rpc.InventoryDeltaProto(this);
      int from_bitField0_ = bitField0_;
      result.originalTimestamp_ = originalTimestamp_;
      result.newTimestamp_ = newTimestamp_;
      if (inventoryItemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inventoryItem_ = java.util.Collections.unmodifiableList(inventoryItem_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inventoryItem_ = inventoryItem_;
      } else {
        result.inventoryItem_ = inventoryItemBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.InventoryDeltaProto) {
        return mergeFrom((POGOProtos.Rpc.InventoryDeltaProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InventoryDeltaProto other) {
      if (other == POGOProtos.Rpc.InventoryDeltaProto.getDefaultInstance()) return this;
      if (other.getOriginalTimestamp() != 0L) {
        setOriginalTimestamp(other.getOriginalTimestamp());
      }
      if (other.getNewTimestamp() != 0L) {
        setNewTimestamp(other.getNewTimestamp());
      }
      if (inventoryItemBuilder_ == null) {
        if (!other.inventoryItem_.isEmpty()) {
          if (inventoryItem_.isEmpty()) {
            inventoryItem_ = other.inventoryItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInventoryItemIsMutable();
            inventoryItem_.addAll(other.inventoryItem_);
          }
          onChanged();
        }
      } else {
        if (!other.inventoryItem_.isEmpty()) {
          if (inventoryItemBuilder_.isEmpty()) {
            inventoryItemBuilder_.dispose();
            inventoryItemBuilder_ = null;
            inventoryItem_ = other.inventoryItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inventoryItemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInventoryItemFieldBuilder() : null;
          } else {
            inventoryItemBuilder_.addAllMessages(other.inventoryItem_);
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
      POGOProtos.Rpc.InventoryDeltaProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InventoryDeltaProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long originalTimestamp_ ;
    /**
     * <code>int64 original_timestamp = 1;</code>
     * @return The originalTimestamp.
     */
    @java.lang.Override
    public long getOriginalTimestamp() {
      return originalTimestamp_;
    }
    /**
     * <code>int64 original_timestamp = 1;</code>
     * @param value The originalTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalTimestamp(long value) {
      
      originalTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 original_timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalTimestamp() {
      
      originalTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private long newTimestamp_ ;
    /**
     * <code>int64 new_timestamp = 2;</code>
     * @return The newTimestamp.
     */
    @java.lang.Override
    public long getNewTimestamp() {
      return newTimestamp_;
    }
    /**
     * <code>int64 new_timestamp = 2;</code>
     * @param value The newTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setNewTimestamp(long value) {
      
      newTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 new_timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewTimestamp() {
      
      newTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.InventoryItemProto> inventoryItem_ =
      java.util.Collections.emptyList();
    private void ensureInventoryItemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inventoryItem_ = new java.util.ArrayList<POGOProtos.Rpc.InventoryItemProto>(inventoryItem_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.InventoryItemProto, POGOProtos.Rpc.InventoryItemProto.Builder, POGOProtos.Rpc.InventoryItemProtoOrBuilder> inventoryItemBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.InventoryItemProto> getInventoryItemList() {
      if (inventoryItemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inventoryItem_);
      } else {
        return inventoryItemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public int getInventoryItemCount() {
      if (inventoryItemBuilder_ == null) {
        return inventoryItem_.size();
      } else {
        return inventoryItemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public POGOProtos.Rpc.InventoryItemProto getInventoryItem(int index) {
      if (inventoryItemBuilder_ == null) {
        return inventoryItem_.get(index);
      } else {
        return inventoryItemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder setInventoryItem(
        int index, POGOProtos.Rpc.InventoryItemProto value) {
      if (inventoryItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryItemIsMutable();
        inventoryItem_.set(index, value);
        onChanged();
      } else {
        inventoryItemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder setInventoryItem(
        int index, POGOProtos.Rpc.InventoryItemProto.Builder builderForValue) {
      if (inventoryItemBuilder_ == null) {
        ensureInventoryItemIsMutable();
        inventoryItem_.set(index, builderForValue.build());
        onChanged();
      } else {
        inventoryItemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder addInventoryItem(POGOProtos.Rpc.InventoryItemProto value) {
      if (inventoryItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryItemIsMutable();
        inventoryItem_.add(value);
        onChanged();
      } else {
        inventoryItemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder addInventoryItem(
        int index, POGOProtos.Rpc.InventoryItemProto value) {
      if (inventoryItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryItemIsMutable();
        inventoryItem_.add(index, value);
        onChanged();
      } else {
        inventoryItemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder addInventoryItem(
        POGOProtos.Rpc.InventoryItemProto.Builder builderForValue) {
      if (inventoryItemBuilder_ == null) {
        ensureInventoryItemIsMutable();
        inventoryItem_.add(builderForValue.build());
        onChanged();
      } else {
        inventoryItemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder addInventoryItem(
        int index, POGOProtos.Rpc.InventoryItemProto.Builder builderForValue) {
      if (inventoryItemBuilder_ == null) {
        ensureInventoryItemIsMutable();
        inventoryItem_.add(index, builderForValue.build());
        onChanged();
      } else {
        inventoryItemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder addAllInventoryItem(
        java.lang.Iterable<? extends POGOProtos.Rpc.InventoryItemProto> values) {
      if (inventoryItemBuilder_ == null) {
        ensureInventoryItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inventoryItem_);
        onChanged();
      } else {
        inventoryItemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder clearInventoryItem() {
      if (inventoryItemBuilder_ == null) {
        inventoryItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inventoryItemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public Builder removeInventoryItem(int index) {
      if (inventoryItemBuilder_ == null) {
        ensureInventoryItemIsMutable();
        inventoryItem_.remove(index);
        onChanged();
      } else {
        inventoryItemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public POGOProtos.Rpc.InventoryItemProto.Builder getInventoryItemBuilder(
        int index) {
      return getInventoryItemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public POGOProtos.Rpc.InventoryItemProtoOrBuilder getInventoryItemOrBuilder(
        int index) {
      if (inventoryItemBuilder_ == null) {
        return inventoryItem_.get(index);  } else {
        return inventoryItemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.InventoryItemProtoOrBuilder> 
         getInventoryItemOrBuilderList() {
      if (inventoryItemBuilder_ != null) {
        return inventoryItemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inventoryItem_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public POGOProtos.Rpc.InventoryItemProto.Builder addInventoryItemBuilder() {
      return getInventoryItemFieldBuilder().addBuilder(
          POGOProtos.Rpc.InventoryItemProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public POGOProtos.Rpc.InventoryItemProto.Builder addInventoryItemBuilder(
        int index) {
      return getInventoryItemFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.InventoryItemProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryItemProto inventory_item = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.InventoryItemProto.Builder> 
         getInventoryItemBuilderList() {
      return getInventoryItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.InventoryItemProto, POGOProtos.Rpc.InventoryItemProto.Builder, POGOProtos.Rpc.InventoryItemProtoOrBuilder> 
        getInventoryItemFieldBuilder() {
      if (inventoryItemBuilder_ == null) {
        inventoryItemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.InventoryItemProto, POGOProtos.Rpc.InventoryItemProto.Builder, POGOProtos.Rpc.InventoryItemProtoOrBuilder>(
                inventoryItem_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inventoryItem_ = null;
      }
      return inventoryItemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InventoryDeltaProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InventoryDeltaProto)
  private static final POGOProtos.Rpc.InventoryDeltaProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InventoryDeltaProto();
  }

  public static POGOProtos.Rpc.InventoryDeltaProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryDeltaProto>
      PARSER = new com.google.protobuf.AbstractParser<InventoryDeltaProto>() {
    @java.lang.Override
    public InventoryDeltaProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryDeltaProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryDeltaProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryDeltaProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InventoryDeltaProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
