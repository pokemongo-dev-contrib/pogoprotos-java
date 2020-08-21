// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Inventory.InventoryItemProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.InventoryItemProto}
 */
public final class InventoryItemProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InventoryItemProto)
    InventoryItemProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryItemProto.newBuilder() to construct.
  private InventoryItemProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryItemProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryItemProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryItemProto(
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
          case 8: {

            modifiedTimestamp_ = input.readInt64();
            break;
          }
          case 18: {
            inventoryItemCase_ = 2;
            inventoryItem_ = input.readBytes();
            break;
          }
          case 26: {
            POGOProtos.Rpc.MKBNBGHGGBA.Builder subBuilder = null;
            if (inventoryItemCase_ == 3) {
              subBuilder = ((POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_).toBuilder();
            }
            inventoryItem_ =
                input.readMessage(POGOProtos.Rpc.MKBNBGHGGBA.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_);
              inventoryItem_ = subBuilder.buildPartial();
            }
            inventoryItemCase_ = 3;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryItemProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryItemProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InventoryItemProto.class, POGOProtos.Rpc.InventoryItemProto.Builder.class);
  }

  private int inventoryItemCase_ = 0;
  private java.lang.Object inventoryItem_;
  public enum InventoryItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DELETED_ITEM_KEY(2),
    ITEM(3),
    INVENTORYITEM_NOT_SET(0);
    private final int value;
    private InventoryItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InventoryItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static InventoryItemCase forNumber(int value) {
      switch (value) {
        case 2: return DELETED_ITEM_KEY;
        case 3: return ITEM;
        case 0: return INVENTORYITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public InventoryItemCase
  getInventoryItemCase() {
    return InventoryItemCase.forNumber(
        inventoryItemCase_);
  }

  public static final int DELETED_ITEM_KEY_FIELD_NUMBER = 2;
  /**
   * <code>bytes deleted_item_key = 2;</code>
   * @return The deletedItemKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeletedItemKey() {
    if (inventoryItemCase_ == 2) {
      return (com.google.protobuf.ByteString) inventoryItem_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int ITEM_FIELD_NUMBER = 3;
  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return inventoryItemCase_ == 3;
  }
  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   * @return The item.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MKBNBGHGGBA getItem() {
    if (inventoryItemCase_ == 3) {
       return (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_;
    }
    return POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
  }
  /**
   * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MKBNBGHGGBAOrBuilder getItemOrBuilder() {
    if (inventoryItemCase_ == 3) {
       return (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_;
    }
    return POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
  }

  public static final int MODIFIED_TIMESTAMP_FIELD_NUMBER = 1;
  private long modifiedTimestamp_;
  /**
   * <code>int64 modified_timestamp = 1;</code>
   * @return The modifiedTimestamp.
   */
  @java.lang.Override
  public long getModifiedTimestamp() {
    return modifiedTimestamp_;
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
    if (modifiedTimestamp_ != 0L) {
      output.writeInt64(1, modifiedTimestamp_);
    }
    if (inventoryItemCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) inventoryItem_);
    }
    if (inventoryItemCase_ == 3) {
      output.writeMessage(3, (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modifiedTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, modifiedTimestamp_);
    }
    if (inventoryItemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) inventoryItem_);
    }
    if (inventoryItemCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_);
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
    if (!(obj instanceof POGOProtos.Rpc.InventoryItemProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InventoryItemProto other = (POGOProtos.Rpc.InventoryItemProto) obj;

    if (getModifiedTimestamp()
        != other.getModifiedTimestamp()) return false;
    if (!getInventoryItemCase().equals(other.getInventoryItemCase())) return false;
    switch (inventoryItemCase_) {
      case 2:
        if (!getDeletedItemKey()
            .equals(other.getDeletedItemKey())) return false;
        break;
      case 3:
        if (!getItem()
            .equals(other.getItem())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + MODIFIED_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModifiedTimestamp());
    switch (inventoryItemCase_) {
      case 2:
        hash = (37 * hash) + DELETED_ITEM_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getDeletedItemKey().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ITEM_FIELD_NUMBER;
        hash = (53 * hash) + getItem().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryItemProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InventoryItemProto prototype) {
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
   * <pre>
   * ref: Niantic.Platform.Inventory.InventoryItemProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.InventoryItemProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InventoryItemProto)
      POGOProtos.Rpc.InventoryItemProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryItemProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryItemProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InventoryItemProto.class, POGOProtos.Rpc.InventoryItemProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InventoryItemProto.newBuilder()
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
      modifiedTimestamp_ = 0L;

      inventoryItemCase_ = 0;
      inventoryItem_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryItemProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryItemProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.InventoryItemProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryItemProto build() {
      POGOProtos.Rpc.InventoryItemProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryItemProto buildPartial() {
      POGOProtos.Rpc.InventoryItemProto result = new POGOProtos.Rpc.InventoryItemProto(this);
      if (inventoryItemCase_ == 2) {
        result.inventoryItem_ = inventoryItem_;
      }
      if (inventoryItemCase_ == 3) {
        if (itemBuilder_ == null) {
          result.inventoryItem_ = inventoryItem_;
        } else {
          result.inventoryItem_ = itemBuilder_.build();
        }
      }
      result.modifiedTimestamp_ = modifiedTimestamp_;
      result.inventoryItemCase_ = inventoryItemCase_;
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
      if (other instanceof POGOProtos.Rpc.InventoryItemProto) {
        return mergeFrom((POGOProtos.Rpc.InventoryItemProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InventoryItemProto other) {
      if (other == POGOProtos.Rpc.InventoryItemProto.getDefaultInstance()) return this;
      if (other.getModifiedTimestamp() != 0L) {
        setModifiedTimestamp(other.getModifiedTimestamp());
      }
      switch (other.getInventoryItemCase()) {
        case DELETED_ITEM_KEY: {
          setDeletedItemKey(other.getDeletedItemKey());
          break;
        }
        case ITEM: {
          mergeItem(other.getItem());
          break;
        }
        case INVENTORYITEM_NOT_SET: {
          break;
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
      POGOProtos.Rpc.InventoryItemProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InventoryItemProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int inventoryItemCase_ = 0;
    private java.lang.Object inventoryItem_;
    public InventoryItemCase
        getInventoryItemCase() {
      return InventoryItemCase.forNumber(
          inventoryItemCase_);
    }

    public Builder clearInventoryItem() {
      inventoryItemCase_ = 0;
      inventoryItem_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>bytes deleted_item_key = 2;</code>
     * @return The deletedItemKey.
     */
    public com.google.protobuf.ByteString getDeletedItemKey() {
      if (inventoryItemCase_ == 2) {
        return (com.google.protobuf.ByteString) inventoryItem_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes deleted_item_key = 2;</code>
     * @param value The deletedItemKey to set.
     * @return This builder for chaining.
     */
    public Builder setDeletedItemKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  inventoryItemCase_ = 2;
      inventoryItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes deleted_item_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeletedItemKey() {
      if (inventoryItemCase_ == 2) {
        inventoryItemCase_ = 0;
        inventoryItem_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MKBNBGHGGBA, POGOProtos.Rpc.MKBNBGHGGBA.Builder, POGOProtos.Rpc.MKBNBGHGGBAOrBuilder> itemBuilder_;
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     * @return Whether the item field is set.
     */
    @java.lang.Override
    public boolean hasItem() {
      return inventoryItemCase_ == 3;
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     * @return The item.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MKBNBGHGGBA getItem() {
      if (itemBuilder_ == null) {
        if (inventoryItemCase_ == 3) {
          return (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_;
        }
        return POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
      } else {
        if (inventoryItemCase_ == 3) {
          return itemBuilder_.getMessage();
        }
        return POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    public Builder setItem(POGOProtos.Rpc.MKBNBGHGGBA value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inventoryItem_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }
      inventoryItemCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    public Builder setItem(
        POGOProtos.Rpc.MKBNBGHGGBA.Builder builderForValue) {
      if (itemBuilder_ == null) {
        inventoryItem_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      inventoryItemCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    public Builder mergeItem(POGOProtos.Rpc.MKBNBGHGGBA value) {
      if (itemBuilder_ == null) {
        if (inventoryItemCase_ == 3 &&
            inventoryItem_ != POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance()) {
          inventoryItem_ = POGOProtos.Rpc.MKBNBGHGGBA.newBuilder((POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_)
              .mergeFrom(value).buildPartial();
        } else {
          inventoryItem_ = value;
        }
        onChanged();
      } else {
        if (inventoryItemCase_ == 3) {
          itemBuilder_.mergeFrom(value);
        }
        itemBuilder_.setMessage(value);
      }
      inventoryItemCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        if (inventoryItemCase_ == 3) {
          inventoryItemCase_ = 0;
          inventoryItem_ = null;
          onChanged();
        }
      } else {
        if (inventoryItemCase_ == 3) {
          inventoryItemCase_ = 0;
          inventoryItem_ = null;
        }
        itemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    public POGOProtos.Rpc.MKBNBGHGGBA.Builder getItemBuilder() {
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    @java.lang.Override
    public POGOProtos.Rpc.MKBNBGHGGBAOrBuilder getItemOrBuilder() {
      if ((inventoryItemCase_ == 3) && (itemBuilder_ != null)) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        if (inventoryItemCase_ == 3) {
          return (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_;
        }
        return POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MKBNBGHGGBA item = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MKBNBGHGGBA, POGOProtos.Rpc.MKBNBGHGGBA.Builder, POGOProtos.Rpc.MKBNBGHGGBAOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        if (!(inventoryItemCase_ == 3)) {
          inventoryItem_ = POGOProtos.Rpc.MKBNBGHGGBA.getDefaultInstance();
        }
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.MKBNBGHGGBA, POGOProtos.Rpc.MKBNBGHGGBA.Builder, POGOProtos.Rpc.MKBNBGHGGBAOrBuilder>(
                (POGOProtos.Rpc.MKBNBGHGGBA) inventoryItem_,
                getParentForChildren(),
                isClean());
        inventoryItem_ = null;
      }
      inventoryItemCase_ = 3;
      onChanged();;
      return itemBuilder_;
    }

    private long modifiedTimestamp_ ;
    /**
     * <code>int64 modified_timestamp = 1;</code>
     * @return The modifiedTimestamp.
     */
    @java.lang.Override
    public long getModifiedTimestamp() {
      return modifiedTimestamp_;
    }
    /**
     * <code>int64 modified_timestamp = 1;</code>
     * @param value The modifiedTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setModifiedTimestamp(long value) {
      
      modifiedTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 modified_timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModifiedTimestamp() {
      
      modifiedTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InventoryItemProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InventoryItemProto)
  private static final POGOProtos.Rpc.InventoryItemProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InventoryItemProto();
  }

  public static POGOProtos.Rpc.InventoryItemProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryItemProto>
      PARSER = new com.google.protobuf.AbstractParser<InventoryItemProto>() {
    @java.lang.Override
    public InventoryItemProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryItemProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryItemProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryItemProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InventoryItemProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

