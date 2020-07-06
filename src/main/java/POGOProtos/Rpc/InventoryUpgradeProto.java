// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.InventoryUpgradeProto}
 */
public  final class InventoryUpgradeProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InventoryUpgradeProto)
    InventoryUpgradeProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryUpgradeProto.newBuilder() to construct.
  private InventoryUpgradeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryUpgradeProto() {
    item_ = 0;
    upgradeType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryUpgradeProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryUpgradeProto(
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
            int rawValue = input.readEnum();

            item_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            upgradeType_ = rawValue;
            break;
          }
          case 24: {

            additionalStorage_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_InventoryUpgradeProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_InventoryUpgradeProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InventoryUpgradeProto.class, POGOProtos.Rpc.InventoryUpgradeProto.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private int item_;
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  public int getItemValue() {
    return item_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  public POGOProtos.Rpc.Item getItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int UPGRADE_TYPE_FIELD_NUMBER = 2;
  private int upgradeType_;
  /**
   * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
   * @return The enum numeric value on the wire for upgradeType.
   */
  public int getUpgradeTypeValue() {
    return upgradeType_;
  }
  /**
   * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
   * @return The upgradeType.
   */
  public POGOProtos.Rpc.InventoryUpgradeType getUpgradeType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.InventoryUpgradeType result = POGOProtos.Rpc.InventoryUpgradeType.valueOf(upgradeType_);
    return result == null ? POGOProtos.Rpc.InventoryUpgradeType.UNRECOGNIZED : result;
  }

  public static final int ADDITIONAL_STORAGE_FIELD_NUMBER = 3;
  private int additionalStorage_;
  /**
   * <code>int32 additional_storage = 3;</code>
   * @return The additionalStorage.
   */
  public int getAdditionalStorage() {
    return additionalStorage_;
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
    if (item_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, item_);
    }
    if (upgradeType_ != POGOProtos.Rpc.InventoryUpgradeType.INVENTORY_UPGRADE_TYPE_UPGRADE_UNSET.getNumber()) {
      output.writeEnum(2, upgradeType_);
    }
    if (additionalStorage_ != 0) {
      output.writeInt32(3, additionalStorage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, item_);
    }
    if (upgradeType_ != POGOProtos.Rpc.InventoryUpgradeType.INVENTORY_UPGRADE_TYPE_UPGRADE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, upgradeType_);
    }
    if (additionalStorage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, additionalStorage_);
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
    if (!(obj instanceof POGOProtos.Rpc.InventoryUpgradeProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InventoryUpgradeProto other = (POGOProtos.Rpc.InventoryUpgradeProto) obj;

    if (item_ != other.item_) return false;
    if (upgradeType_ != other.upgradeType_) return false;
    if (getAdditionalStorage()
        != other.getAdditionalStorage()) return false;
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
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + item_;
    hash = (37 * hash) + UPGRADE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + upgradeType_;
    hash = (37 * hash) + ADDITIONAL_STORAGE_FIELD_NUMBER;
    hash = (53 * hash) + getAdditionalStorage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InventoryUpgradeProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InventoryUpgradeProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.InventoryUpgradeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InventoryUpgradeProto)
      POGOProtos.Rpc.InventoryUpgradeProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_InventoryUpgradeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_InventoryUpgradeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InventoryUpgradeProto.class, POGOProtos.Rpc.InventoryUpgradeProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InventoryUpgradeProto.newBuilder()
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
      item_ = 0;

      upgradeType_ = 0;

      additionalStorage_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_InventoryUpgradeProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradeProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.InventoryUpgradeProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradeProto build() {
      POGOProtos.Rpc.InventoryUpgradeProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InventoryUpgradeProto buildPartial() {
      POGOProtos.Rpc.InventoryUpgradeProto result = new POGOProtos.Rpc.InventoryUpgradeProto(this);
      result.item_ = item_;
      result.upgradeType_ = upgradeType_;
      result.additionalStorage_ = additionalStorage_;
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
      if (other instanceof POGOProtos.Rpc.InventoryUpgradeProto) {
        return mergeFrom((POGOProtos.Rpc.InventoryUpgradeProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InventoryUpgradeProto other) {
      if (other == POGOProtos.Rpc.InventoryUpgradeProto.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.upgradeType_ != 0) {
        setUpgradeTypeValue(other.getUpgradeTypeValue());
      }
      if (other.getAdditionalStorage() != 0) {
        setAdditionalStorage(other.getAdditionalStorage());
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
      POGOProtos.Rpc.InventoryUpgradeProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InventoryUpgradeProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int item_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The enum numeric value on the wire for item.
     */
    public int getItemValue() {
      return item_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The enum numeric value on the wire for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemValue(int value) {
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The item.
     */
    public POGOProtos.Rpc.Item getItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      item_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = 0;
      onChanged();
      return this;
    }

    private int upgradeType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
     * @return The enum numeric value on the wire for upgradeType.
     */
    public int getUpgradeTypeValue() {
      return upgradeType_;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
     * @param value The enum numeric value on the wire for upgradeType to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeTypeValue(int value) {
      upgradeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
     * @return The upgradeType.
     */
    public POGOProtos.Rpc.InventoryUpgradeType getUpgradeType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.InventoryUpgradeType result = POGOProtos.Rpc.InventoryUpgradeType.valueOf(upgradeType_);
      return result == null ? POGOProtos.Rpc.InventoryUpgradeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
     * @param value The upgradeType to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeType(POGOProtos.Rpc.InventoryUpgradeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      upgradeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpgradeType() {
      
      upgradeType_ = 0;
      onChanged();
      return this;
    }

    private int additionalStorage_ ;
    /**
     * <code>int32 additional_storage = 3;</code>
     * @return The additionalStorage.
     */
    public int getAdditionalStorage() {
      return additionalStorage_;
    }
    /**
     * <code>int32 additional_storage = 3;</code>
     * @param value The additionalStorage to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalStorage(int value) {
      
      additionalStorage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 additional_storage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionalStorage() {
      
      additionalStorage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InventoryUpgradeProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InventoryUpgradeProto)
  private static final POGOProtos.Rpc.InventoryUpgradeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InventoryUpgradeProto();
  }

  public static POGOProtos.Rpc.InventoryUpgradeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryUpgradeProto>
      PARSER = new com.google.protobuf.AbstractParser<InventoryUpgradeProto>() {
    @java.lang.Override
    public InventoryUpgradeProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryUpgradeProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryUpgradeProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryUpgradeProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InventoryUpgradeProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
