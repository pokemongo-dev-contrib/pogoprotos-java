// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.InventoryUpgradesProto}
 */
public final class InventoryUpgradesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InventoryUpgradesProto)
    InventoryUpgradesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryUpgradesProto.newBuilder() to construct.
  private InventoryUpgradesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryUpgradesProto() {
    inventoryUpgrade_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryUpgradesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryUpgradesProto(
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
              inventoryUpgrade_ = new java.util.ArrayList<POGOProtos.Rpc.InventoryUpgradeProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            inventoryUpgrade_.add(
                input.readMessage(POGOProtos.Rpc.InventoryUpgradeProto.parser(), extensionRegistry));
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
        inventoryUpgrade_ = java.util.Collections.unmodifiableList(inventoryUpgrade_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryUpgradesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryUpgradesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InventoryUpgradesProto.class, POGOProtos.Rpc.InventoryUpgradesProto.Builder.class);
  }

  public static final int INVENTORY_UPGRADE_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.InventoryUpgradeProto> inventoryUpgrade_;
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.InventoryUpgradeProto> getInventoryUpgradeList() {
    return inventoryUpgrade_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder> 
      getInventoryUpgradeOrBuilderList() {
    return inventoryUpgrade_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
   */
  @java.lang.Override
  public int getInventoryUpgradeCount() {
    return inventoryUpgrade_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryUpgradeProto getInventoryUpgrade(int index) {
    return inventoryUpgrade_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder getInventoryUpgradeOrBuilder(
      int index) {
    return inventoryUpgrade_.get(index);
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
    for (int i = 0; i < inventoryUpgrade_.size(); i++) {
      output.writeMessage(1, inventoryUpgrade_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inventoryUpgrade_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inventoryUpgrade_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.InventoryUpgradesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InventoryUpgradesProto other = (POGOProtos.Rpc.InventoryUpgradesProto) obj;

    if (!getInventoryUpgradeList()
        .equals(other.getInventoryUpgradeList())) return false;
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
    if (getInventoryUpgradeCount() > 0) {
      hash = (37 * hash) + INVENTORY_UPGRADE_FIELD_NUMBER;
      hash = (53 * hash) + getInventoryUpgradeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InventoryUpgradesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.InventoryUpgradesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InventoryUpgradesProto)
      POGOProtos.Rpc.InventoryUpgradesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryUpgradesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryUpgradesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InventoryUpgradesProto.class, POGOProtos.Rpc.InventoryUpgradesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InventoryUpgradesProto.newBuilder()
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
        getInventoryUpgradeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inventoryUpgradeBuilder_ == null) {
        inventoryUpgrade_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inventoryUpgradeBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InventoryUpgradesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.InventoryUpgradesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradesProto build() {
      POGOProtos.Rpc.InventoryUpgradesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradesProto buildPartial() {
      POGOProtos.Rpc.InventoryUpgradesProto result = new POGOProtos.Rpc.InventoryUpgradesProto(this);
      int from_bitField0_ = bitField0_;
      if (inventoryUpgradeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inventoryUpgrade_ = java.util.Collections.unmodifiableList(inventoryUpgrade_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inventoryUpgrade_ = inventoryUpgrade_;
      } else {
        result.inventoryUpgrade_ = inventoryUpgradeBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.InventoryUpgradesProto) {
        return mergeFrom((POGOProtos.Rpc.InventoryUpgradesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InventoryUpgradesProto other) {
      if (other == POGOProtos.Rpc.InventoryUpgradesProto.getDefaultInstance()) return this;
      if (inventoryUpgradeBuilder_ == null) {
        if (!other.inventoryUpgrade_.isEmpty()) {
          if (inventoryUpgrade_.isEmpty()) {
            inventoryUpgrade_ = other.inventoryUpgrade_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInventoryUpgradeIsMutable();
            inventoryUpgrade_.addAll(other.inventoryUpgrade_);
          }
          onChanged();
        }
      } else {
        if (!other.inventoryUpgrade_.isEmpty()) {
          if (inventoryUpgradeBuilder_.isEmpty()) {
            inventoryUpgradeBuilder_.dispose();
            inventoryUpgradeBuilder_ = null;
            inventoryUpgrade_ = other.inventoryUpgrade_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inventoryUpgradeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInventoryUpgradeFieldBuilder() : null;
          } else {
            inventoryUpgradeBuilder_.addAllMessages(other.inventoryUpgrade_);
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
      POGOProtos.Rpc.InventoryUpgradesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InventoryUpgradesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.InventoryUpgradeProto> inventoryUpgrade_ =
      java.util.Collections.emptyList();
    private void ensureInventoryUpgradeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inventoryUpgrade_ = new java.util.ArrayList<POGOProtos.Rpc.InventoryUpgradeProto>(inventoryUpgrade_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.InventoryUpgradeProto, POGOProtos.Rpc.InventoryUpgradeProto.Builder, POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder> inventoryUpgradeBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.InventoryUpgradeProto> getInventoryUpgradeList() {
      if (inventoryUpgradeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inventoryUpgrade_);
      } else {
        return inventoryUpgradeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public int getInventoryUpgradeCount() {
      if (inventoryUpgradeBuilder_ == null) {
        return inventoryUpgrade_.size();
      } else {
        return inventoryUpgradeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public POGOProtos.Rpc.InventoryUpgradeProto getInventoryUpgrade(int index) {
      if (inventoryUpgradeBuilder_ == null) {
        return inventoryUpgrade_.get(index);
      } else {
        return inventoryUpgradeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder setInventoryUpgrade(
        int index, POGOProtos.Rpc.InventoryUpgradeProto value) {
      if (inventoryUpgradeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.set(index, value);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder setInventoryUpgrade(
        int index, POGOProtos.Rpc.InventoryUpgradeProto.Builder builderForValue) {
      if (inventoryUpgradeBuilder_ == null) {
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.set(index, builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder addInventoryUpgrade(POGOProtos.Rpc.InventoryUpgradeProto value) {
      if (inventoryUpgradeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.add(value);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder addInventoryUpgrade(
        int index, POGOProtos.Rpc.InventoryUpgradeProto value) {
      if (inventoryUpgradeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.add(index, value);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder addInventoryUpgrade(
        POGOProtos.Rpc.InventoryUpgradeProto.Builder builderForValue) {
      if (inventoryUpgradeBuilder_ == null) {
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.add(builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder addInventoryUpgrade(
        int index, POGOProtos.Rpc.InventoryUpgradeProto.Builder builderForValue) {
      if (inventoryUpgradeBuilder_ == null) {
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.add(index, builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder addAllInventoryUpgrade(
        java.lang.Iterable<? extends POGOProtos.Rpc.InventoryUpgradeProto> values) {
      if (inventoryUpgradeBuilder_ == null) {
        ensureInventoryUpgradeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inventoryUpgrade_);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder clearInventoryUpgrade() {
      if (inventoryUpgradeBuilder_ == null) {
        inventoryUpgrade_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public Builder removeInventoryUpgrade(int index) {
      if (inventoryUpgradeBuilder_ == null) {
        ensureInventoryUpgradeIsMutable();
        inventoryUpgrade_.remove(index);
        onChanged();
      } else {
        inventoryUpgradeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public POGOProtos.Rpc.InventoryUpgradeProto.Builder getInventoryUpgradeBuilder(
        int index) {
      return getInventoryUpgradeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder getInventoryUpgradeOrBuilder(
        int index) {
      if (inventoryUpgradeBuilder_ == null) {
        return inventoryUpgrade_.get(index);  } else {
        return inventoryUpgradeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder> 
         getInventoryUpgradeOrBuilderList() {
      if (inventoryUpgradeBuilder_ != null) {
        return inventoryUpgradeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inventoryUpgrade_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public POGOProtos.Rpc.InventoryUpgradeProto.Builder addInventoryUpgradeBuilder() {
      return getInventoryUpgradeFieldBuilder().addBuilder(
          POGOProtos.Rpc.InventoryUpgradeProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public POGOProtos.Rpc.InventoryUpgradeProto.Builder addInventoryUpgradeBuilder(
        int index) {
      return getInventoryUpgradeFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.InventoryUpgradeProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.InventoryUpgradeProto inventory_upgrade = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.InventoryUpgradeProto.Builder> 
         getInventoryUpgradeBuilderList() {
      return getInventoryUpgradeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.InventoryUpgradeProto, POGOProtos.Rpc.InventoryUpgradeProto.Builder, POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder> 
        getInventoryUpgradeFieldBuilder() {
      if (inventoryUpgradeBuilder_ == null) {
        inventoryUpgradeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.InventoryUpgradeProto, POGOProtos.Rpc.InventoryUpgradeProto.Builder, POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder>(
                inventoryUpgrade_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inventoryUpgrade_ = null;
      }
      return inventoryUpgradeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InventoryUpgradesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InventoryUpgradesProto)
  private static final POGOProtos.Rpc.InventoryUpgradesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InventoryUpgradesProto();
  }

  public static POGOProtos.Rpc.InventoryUpgradesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryUpgradesProto>
      PARSER = new com.google.protobuf.AbstractParser<InventoryUpgradesProto>() {
    @java.lang.Override
    public InventoryUpgradesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryUpgradesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryUpgradesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryUpgradesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InventoryUpgradesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

