// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ItemTelemetry}
 */
public final class ItemTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ItemTelemetry)
    ItemTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemTelemetry.newBuilder() to construct.
  private ItemTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemTelemetry() {
    itemUseClickId_ = 0;
    itemId_ = 0;
    itemIdString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemTelemetry(
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

            itemUseClickId_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            itemId_ = rawValue;
            break;
          }
          case 24: {

            equipped_ = input.readBool();
            break;
          }
          case 32: {

            fromInventory_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            itemIdString_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ItemTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ItemTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ItemTelemetry.class, POGOProtos.Rpc.ItemTelemetry.Builder.class);
  }

  public static final int ITEM_USE_CLICK_ID_FIELD_NUMBER = 1;
  private int itemUseClickId_;
  /**
   * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
   * @return The enum numeric value on the wire for itemUseClickId.
   */
  @java.lang.Override public int getItemUseClickIdValue() {
    return itemUseClickId_;
  }
  /**
   * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
   * @return The itemUseClickId.
   */
  @java.lang.Override public POGOProtos.Rpc.ItemUseTelemetryIds getItemUseClickId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ItemUseTelemetryIds result = POGOProtos.Rpc.ItemUseTelemetryIds.valueOf(itemUseClickId_);
    return result == null ? POGOProtos.Rpc.ItemUseTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int ITEM_ID_FIELD_NUMBER = 2;
  private int itemId_;
  /**
   * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  @java.lang.Override public int getItemIdValue() {
    return itemId_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
   * @return The itemId.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getItemId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(itemId_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int EQUIPPED_FIELD_NUMBER = 3;
  private boolean equipped_;
  /**
   * <code>bool equipped = 3;</code>
   * @return The equipped.
   */
  @java.lang.Override
  public boolean getEquipped() {
    return equipped_;
  }

  public static final int FROM_INVENTORY_FIELD_NUMBER = 4;
  private boolean fromInventory_;
  /**
   * <code>bool from_inventory = 4;</code>
   * @return The fromInventory.
   */
  @java.lang.Override
  public boolean getFromInventory() {
    return fromInventory_;
  }

  public static final int ITEM_ID_STRING_FIELD_NUMBER = 5;
  private volatile java.lang.Object itemIdString_;
  /**
   * <code>string item_id_string = 5;</code>
   * @return The itemIdString.
   */
  @java.lang.Override
  public java.lang.String getItemIdString() {
    java.lang.Object ref = itemIdString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemIdString_ = s;
      return s;
    }
  }
  /**
   * <code>string item_id_string = 5;</code>
   * @return The bytes for itemIdString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemIdStringBytes() {
    java.lang.Object ref = itemIdString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemIdString_ = b;
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
    if (itemUseClickId_ != POGOProtos.Rpc.ItemUseTelemetryIds.ITEM_USE_TELEMETRY_IDS_UNDEFINED_ITEM_EVENT.getNumber()) {
      output.writeEnum(1, itemUseClickId_);
    }
    if (itemId_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, itemId_);
    }
    if (equipped_ != false) {
      output.writeBool(3, equipped_);
    }
    if (fromInventory_ != false) {
      output.writeBool(4, fromInventory_);
    }
    if (!getItemIdStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, itemIdString_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemUseClickId_ != POGOProtos.Rpc.ItemUseTelemetryIds.ITEM_USE_TELEMETRY_IDS_UNDEFINED_ITEM_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, itemUseClickId_);
    }
    if (itemId_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, itemId_);
    }
    if (equipped_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, equipped_);
    }
    if (fromInventory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, fromInventory_);
    }
    if (!getItemIdStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, itemIdString_);
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
    if (!(obj instanceof POGOProtos.Rpc.ItemTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ItemTelemetry other = (POGOProtos.Rpc.ItemTelemetry) obj;

    if (itemUseClickId_ != other.itemUseClickId_) return false;
    if (itemId_ != other.itemId_) return false;
    if (getEquipped()
        != other.getEquipped()) return false;
    if (getFromInventory()
        != other.getFromInventory()) return false;
    if (!getItemIdString()
        .equals(other.getItemIdString())) return false;
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
    hash = (37 * hash) + ITEM_USE_CLICK_ID_FIELD_NUMBER;
    hash = (53 * hash) + itemUseClickId_;
    hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + itemId_;
    hash = (37 * hash) + EQUIPPED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEquipped());
    hash = (37 * hash) + FROM_INVENTORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFromInventory());
    hash = (37 * hash) + ITEM_ID_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getItemIdString().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ItemTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ItemTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ItemTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ItemTelemetry)
      POGOProtos.Rpc.ItemTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ItemTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ItemTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ItemTelemetry.class, POGOProtos.Rpc.ItemTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ItemTelemetry.newBuilder()
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
      itemUseClickId_ = 0;

      itemId_ = 0;

      equipped_ = false;

      fromInventory_ = false;

      itemIdString_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ItemTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ItemTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.ItemTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ItemTelemetry build() {
      POGOProtos.Rpc.ItemTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ItemTelemetry buildPartial() {
      POGOProtos.Rpc.ItemTelemetry result = new POGOProtos.Rpc.ItemTelemetry(this);
      result.itemUseClickId_ = itemUseClickId_;
      result.itemId_ = itemId_;
      result.equipped_ = equipped_;
      result.fromInventory_ = fromInventory_;
      result.itemIdString_ = itemIdString_;
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
      if (other instanceof POGOProtos.Rpc.ItemTelemetry) {
        return mergeFrom((POGOProtos.Rpc.ItemTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ItemTelemetry other) {
      if (other == POGOProtos.Rpc.ItemTelemetry.getDefaultInstance()) return this;
      if (other.itemUseClickId_ != 0) {
        setItemUseClickIdValue(other.getItemUseClickIdValue());
      }
      if (other.itemId_ != 0) {
        setItemIdValue(other.getItemIdValue());
      }
      if (other.getEquipped() != false) {
        setEquipped(other.getEquipped());
      }
      if (other.getFromInventory() != false) {
        setFromInventory(other.getFromInventory());
      }
      if (!other.getItemIdString().isEmpty()) {
        itemIdString_ = other.itemIdString_;
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
      POGOProtos.Rpc.ItemTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ItemTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int itemUseClickId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
     * @return The enum numeric value on the wire for itemUseClickId.
     */
    @java.lang.Override public int getItemUseClickIdValue() {
      return itemUseClickId_;
    }
    /**
     * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
     * @param value The enum numeric value on the wire for itemUseClickId to set.
     * @return This builder for chaining.
     */
    public Builder setItemUseClickIdValue(int value) {
      
      itemUseClickId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
     * @return The itemUseClickId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ItemUseTelemetryIds getItemUseClickId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ItemUseTelemetryIds result = POGOProtos.Rpc.ItemUseTelemetryIds.valueOf(itemUseClickId_);
      return result == null ? POGOProtos.Rpc.ItemUseTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
     * @param value The itemUseClickId to set.
     * @return This builder for chaining.
     */
    public Builder setItemUseClickId(POGOProtos.Rpc.ItemUseTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemUseClickId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ItemUseTelemetryIds item_use_click_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemUseClickId() {
      
      itemUseClickId_ = 0;
      onChanged();
      return this;
    }

    private int itemId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
     * @return The enum numeric value on the wire for itemId.
     */
    @java.lang.Override public int getItemIdValue() {
      return itemId_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
     * @param value The enum numeric value on the wire for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdValue(int value) {
      
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getItemId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(itemId_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = 0;
      onChanged();
      return this;
    }

    private boolean equipped_ ;
    /**
     * <code>bool equipped = 3;</code>
     * @return The equipped.
     */
    @java.lang.Override
    public boolean getEquipped() {
      return equipped_;
    }
    /**
     * <code>bool equipped = 3;</code>
     * @param value The equipped to set.
     * @return This builder for chaining.
     */
    public Builder setEquipped(boolean value) {
      
      equipped_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool equipped = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEquipped() {
      
      equipped_ = false;
      onChanged();
      return this;
    }

    private boolean fromInventory_ ;
    /**
     * <code>bool from_inventory = 4;</code>
     * @return The fromInventory.
     */
    @java.lang.Override
    public boolean getFromInventory() {
      return fromInventory_;
    }
    /**
     * <code>bool from_inventory = 4;</code>
     * @param value The fromInventory to set.
     * @return This builder for chaining.
     */
    public Builder setFromInventory(boolean value) {
      
      fromInventory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool from_inventory = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromInventory() {
      
      fromInventory_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object itemIdString_ = "";
    /**
     * <code>string item_id_string = 5;</code>
     * @return The itemIdString.
     */
    public java.lang.String getItemIdString() {
      java.lang.Object ref = itemIdString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemIdString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item_id_string = 5;</code>
     * @return The bytes for itemIdString.
     */
    public com.google.protobuf.ByteString
        getItemIdStringBytes() {
      java.lang.Object ref = itemIdString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemIdString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item_id_string = 5;</code>
     * @param value The itemIdString to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemIdString_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item_id_string = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemIdString() {
      
      itemIdString_ = getDefaultInstance().getItemIdString();
      onChanged();
      return this;
    }
    /**
     * <code>string item_id_string = 5;</code>
     * @param value The bytes for itemIdString to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemIdString_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ItemTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ItemTelemetry)
  private static final POGOProtos.Rpc.ItemTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ItemTelemetry();
  }

  public static POGOProtos.Rpc.ItemTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<ItemTelemetry>() {
    @java.lang.Override
    public ItemTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ItemTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

