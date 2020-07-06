// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/Loot.proto

package POGOProtos.Inventory;

/**
 * Protobuf type {@code POGOProtos.Inventory.Loot}
 */
public  final class Loot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Inventory.Loot)
    LootOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Loot.newBuilder() to construct.
  private Loot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Loot() {
    lootItem_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Loot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Loot(
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
              lootItem_ = new java.util.ArrayList<POGOProtos.Inventory.LootItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            lootItem_.add(
                input.readMessage(POGOProtos.Inventory.LootItem.parser(), extensionRegistry));
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
        lootItem_ = java.util.Collections.unmodifiableList(lootItem_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Inventory.LootOuterClass.internal_static_POGOProtos_Inventory_Loot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Inventory.LootOuterClass.internal_static_POGOProtos_Inventory_Loot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Inventory.Loot.class, POGOProtos.Inventory.Loot.Builder.class);
  }

  public static final int LOOT_ITEM_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Inventory.LootItem> lootItem_;
  /**
   * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
   */
  public java.util.List<POGOProtos.Inventory.LootItem> getLootItemList() {
    return lootItem_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Inventory.LootItemOrBuilder> 
      getLootItemOrBuilderList() {
    return lootItem_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
   */
  public int getLootItemCount() {
    return lootItem_.size();
  }
  /**
   * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
   */
  public POGOProtos.Inventory.LootItem getLootItem(int index) {
    return lootItem_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
   */
  public POGOProtos.Inventory.LootItemOrBuilder getLootItemOrBuilder(
      int index) {
    return lootItem_.get(index);
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
    for (int i = 0; i < lootItem_.size(); i++) {
      output.writeMessage(1, lootItem_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lootItem_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lootItem_.get(i));
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
    if (!(obj instanceof POGOProtos.Inventory.Loot)) {
      return super.equals(obj);
    }
    POGOProtos.Inventory.Loot other = (POGOProtos.Inventory.Loot) obj;

    if (!getLootItemList()
        .equals(other.getLootItemList())) return false;
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
    if (getLootItemCount() > 0) {
      hash = (37 * hash) + LOOT_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getLootItemList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Inventory.Loot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Loot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Loot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Loot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Loot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Loot parseFrom(
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
  public static Builder newBuilder(POGOProtos.Inventory.Loot prototype) {
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
   * Protobuf type {@code POGOProtos.Inventory.Loot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Inventory.Loot)
      POGOProtos.Inventory.LootOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Inventory.LootOuterClass.internal_static_POGOProtos_Inventory_Loot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Inventory.LootOuterClass.internal_static_POGOProtos_Inventory_Loot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Inventory.Loot.class, POGOProtos.Inventory.Loot.Builder.class);
    }

    // Construct using POGOProtos.Inventory.Loot.newBuilder()
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
        getLootItemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lootItemBuilder_ == null) {
        lootItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lootItemBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Inventory.LootOuterClass.internal_static_POGOProtos_Inventory_Loot_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Loot getDefaultInstanceForType() {
      return POGOProtos.Inventory.Loot.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Inventory.Loot build() {
      POGOProtos.Inventory.Loot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Loot buildPartial() {
      POGOProtos.Inventory.Loot result = new POGOProtos.Inventory.Loot(this);
      int from_bitField0_ = bitField0_;
      if (lootItemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lootItem_ = java.util.Collections.unmodifiableList(lootItem_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lootItem_ = lootItem_;
      } else {
        result.lootItem_ = lootItemBuilder_.build();
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
      if (other instanceof POGOProtos.Inventory.Loot) {
        return mergeFrom((POGOProtos.Inventory.Loot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Inventory.Loot other) {
      if (other == POGOProtos.Inventory.Loot.getDefaultInstance()) return this;
      if (lootItemBuilder_ == null) {
        if (!other.lootItem_.isEmpty()) {
          if (lootItem_.isEmpty()) {
            lootItem_ = other.lootItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLootItemIsMutable();
            lootItem_.addAll(other.lootItem_);
          }
          onChanged();
        }
      } else {
        if (!other.lootItem_.isEmpty()) {
          if (lootItemBuilder_.isEmpty()) {
            lootItemBuilder_.dispose();
            lootItemBuilder_ = null;
            lootItem_ = other.lootItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lootItemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLootItemFieldBuilder() : null;
          } else {
            lootItemBuilder_.addAllMessages(other.lootItem_);
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
      POGOProtos.Inventory.Loot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Inventory.Loot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Inventory.LootItem> lootItem_ =
      java.util.Collections.emptyList();
    private void ensureLootItemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lootItem_ = new java.util.ArrayList<POGOProtos.Inventory.LootItem>(lootItem_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Inventory.LootItem, POGOProtos.Inventory.LootItem.Builder, POGOProtos.Inventory.LootItemOrBuilder> lootItemBuilder_;

    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public java.util.List<POGOProtos.Inventory.LootItem> getLootItemList() {
      if (lootItemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lootItem_);
      } else {
        return lootItemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public int getLootItemCount() {
      if (lootItemBuilder_ == null) {
        return lootItem_.size();
      } else {
        return lootItemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public POGOProtos.Inventory.LootItem getLootItem(int index) {
      if (lootItemBuilder_ == null) {
        return lootItem_.get(index);
      } else {
        return lootItemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder setLootItem(
        int index, POGOProtos.Inventory.LootItem value) {
      if (lootItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLootItemIsMutable();
        lootItem_.set(index, value);
        onChanged();
      } else {
        lootItemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder setLootItem(
        int index, POGOProtos.Inventory.LootItem.Builder builderForValue) {
      if (lootItemBuilder_ == null) {
        ensureLootItemIsMutable();
        lootItem_.set(index, builderForValue.build());
        onChanged();
      } else {
        lootItemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder addLootItem(POGOProtos.Inventory.LootItem value) {
      if (lootItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLootItemIsMutable();
        lootItem_.add(value);
        onChanged();
      } else {
        lootItemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder addLootItem(
        int index, POGOProtos.Inventory.LootItem value) {
      if (lootItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLootItemIsMutable();
        lootItem_.add(index, value);
        onChanged();
      } else {
        lootItemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder addLootItem(
        POGOProtos.Inventory.LootItem.Builder builderForValue) {
      if (lootItemBuilder_ == null) {
        ensureLootItemIsMutable();
        lootItem_.add(builderForValue.build());
        onChanged();
      } else {
        lootItemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder addLootItem(
        int index, POGOProtos.Inventory.LootItem.Builder builderForValue) {
      if (lootItemBuilder_ == null) {
        ensureLootItemIsMutable();
        lootItem_.add(index, builderForValue.build());
        onChanged();
      } else {
        lootItemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder addAllLootItem(
        java.lang.Iterable<? extends POGOProtos.Inventory.LootItem> values) {
      if (lootItemBuilder_ == null) {
        ensureLootItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lootItem_);
        onChanged();
      } else {
        lootItemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder clearLootItem() {
      if (lootItemBuilder_ == null) {
        lootItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lootItemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public Builder removeLootItem(int index) {
      if (lootItemBuilder_ == null) {
        ensureLootItemIsMutable();
        lootItem_.remove(index);
        onChanged();
      } else {
        lootItemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public POGOProtos.Inventory.LootItem.Builder getLootItemBuilder(
        int index) {
      return getLootItemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public POGOProtos.Inventory.LootItemOrBuilder getLootItemOrBuilder(
        int index) {
      if (lootItemBuilder_ == null) {
        return lootItem_.get(index);  } else {
        return lootItemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Inventory.LootItemOrBuilder> 
         getLootItemOrBuilderList() {
      if (lootItemBuilder_ != null) {
        return lootItemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lootItem_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public POGOProtos.Inventory.LootItem.Builder addLootItemBuilder() {
      return getLootItemFieldBuilder().addBuilder(
          POGOProtos.Inventory.LootItem.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public POGOProtos.Inventory.LootItem.Builder addLootItemBuilder(
        int index) {
      return getLootItemFieldBuilder().addBuilder(
          index, POGOProtos.Inventory.LootItem.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Inventory.LootItem loot_item = 1;</code>
     */
    public java.util.List<POGOProtos.Inventory.LootItem.Builder> 
         getLootItemBuilderList() {
      return getLootItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Inventory.LootItem, POGOProtos.Inventory.LootItem.Builder, POGOProtos.Inventory.LootItemOrBuilder> 
        getLootItemFieldBuilder() {
      if (lootItemBuilder_ == null) {
        lootItemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Inventory.LootItem, POGOProtos.Inventory.LootItem.Builder, POGOProtos.Inventory.LootItemOrBuilder>(
                lootItem_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lootItem_ = null;
      }
      return lootItemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Inventory.Loot)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Inventory.Loot)
  private static final POGOProtos.Inventory.Loot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Inventory.Loot();
  }

  public static POGOProtos.Inventory.Loot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Loot>
      PARSER = new com.google.protobuf.AbstractParser<Loot>() {
    @java.lang.Override
    public Loot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Loot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Loot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Loot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Inventory.Loot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
