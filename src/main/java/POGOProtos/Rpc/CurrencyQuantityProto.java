// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CurrencyQuantityProto}
 */
public final class CurrencyQuantityProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CurrencyQuantityProto)
    CurrencyQuantityProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrencyQuantityProto.newBuilder() to construct.
  private CurrencyQuantityProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrencyQuantityProto() {
    currencyType_ = "";
    fiatCurrencyType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CurrencyQuantityProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrencyQuantityProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            currencyType_ = s;
            break;
          }
          case 16: {

            quantity_ = input.readInt32();
            break;
          }
          case 24: {

            fiatPurchasedQuantity_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fiatCurrencyType_ = s;
            break;
          }
          case 40: {

            fiatCurrencyCostE6_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CurrencyQuantityProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CurrencyQuantityProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CurrencyQuantityProto.class, POGOProtos.Rpc.CurrencyQuantityProto.Builder.class);
  }

  public static final int CURRENCY_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object currencyType_;
  /**
   * <code>string currency_type = 1;</code>
   * @return The currencyType.
   */
  @java.lang.Override
  public java.lang.String getCurrencyType() {
    java.lang.Object ref = currencyType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyType_ = s;
      return s;
    }
  }
  /**
   * <code>string currency_type = 1;</code>
   * @return The bytes for currencyType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyTypeBytes() {
    java.lang.Object ref = currencyType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int FIAT_PURCHASED_QUANTITY_FIELD_NUMBER = 3;
  private int fiatPurchasedQuantity_;
  /**
   * <code>int32 fiat_purchased_quantity = 3;</code>
   * @return The fiatPurchasedQuantity.
   */
  @java.lang.Override
  public int getFiatPurchasedQuantity() {
    return fiatPurchasedQuantity_;
  }

  public static final int FIAT_CURRENCY_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object fiatCurrencyType_;
  /**
   * <code>string fiat_currency_type = 4;</code>
   * @return The fiatCurrencyType.
   */
  @java.lang.Override
  public java.lang.String getFiatCurrencyType() {
    java.lang.Object ref = fiatCurrencyType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fiatCurrencyType_ = s;
      return s;
    }
  }
  /**
   * <code>string fiat_currency_type = 4;</code>
   * @return The bytes for fiatCurrencyType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFiatCurrencyTypeBytes() {
    java.lang.Object ref = fiatCurrencyType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fiatCurrencyType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIAT_CURRENCY_COST_E6_FIELD_NUMBER = 5;
  private long fiatCurrencyCostE6_;
  /**
   * <code>int64 fiat_currency_cost_e6 = 5;</code>
   * @return The fiatCurrencyCostE6.
   */
  @java.lang.Override
  public long getFiatCurrencyCostE6() {
    return fiatCurrencyCostE6_;
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
    if (!getCurrencyTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currencyType_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    if (fiatPurchasedQuantity_ != 0) {
      output.writeInt32(3, fiatPurchasedQuantity_);
    }
    if (!getFiatCurrencyTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fiatCurrencyType_);
    }
    if (fiatCurrencyCostE6_ != 0L) {
      output.writeInt64(5, fiatCurrencyCostE6_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrencyTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currencyType_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    if (fiatPurchasedQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fiatPurchasedQuantity_);
    }
    if (!getFiatCurrencyTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fiatCurrencyType_);
    }
    if (fiatCurrencyCostE6_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, fiatCurrencyCostE6_);
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
    if (!(obj instanceof POGOProtos.Rpc.CurrencyQuantityProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CurrencyQuantityProto other = (POGOProtos.Rpc.CurrencyQuantityProto) obj;

    if (!getCurrencyType()
        .equals(other.getCurrencyType())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (getFiatPurchasedQuantity()
        != other.getFiatPurchasedQuantity()) return false;
    if (!getFiatCurrencyType()
        .equals(other.getFiatCurrencyType())) return false;
    if (getFiatCurrencyCostE6()
        != other.getFiatCurrencyCostE6()) return false;
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
    hash = (37 * hash) + CURRENCY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyType().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + FIAT_PURCHASED_QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getFiatPurchasedQuantity();
    hash = (37 * hash) + FIAT_CURRENCY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFiatCurrencyType().hashCode();
    hash = (37 * hash) + FIAT_CURRENCY_COST_E6_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFiatCurrencyCostE6());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrencyQuantityProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CurrencyQuantityProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CurrencyQuantityProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CurrencyQuantityProto)
      POGOProtos.Rpc.CurrencyQuantityProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CurrencyQuantityProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CurrencyQuantityProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CurrencyQuantityProto.class, POGOProtos.Rpc.CurrencyQuantityProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CurrencyQuantityProto.newBuilder()
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
      currencyType_ = "";

      quantity_ = 0;

      fiatPurchasedQuantity_ = 0;

      fiatCurrencyType_ = "";

      fiatCurrencyCostE6_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CurrencyQuantityProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrencyQuantityProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CurrencyQuantityProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrencyQuantityProto build() {
      POGOProtos.Rpc.CurrencyQuantityProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrencyQuantityProto buildPartial() {
      POGOProtos.Rpc.CurrencyQuantityProto result = new POGOProtos.Rpc.CurrencyQuantityProto(this);
      result.currencyType_ = currencyType_;
      result.quantity_ = quantity_;
      result.fiatPurchasedQuantity_ = fiatPurchasedQuantity_;
      result.fiatCurrencyType_ = fiatCurrencyType_;
      result.fiatCurrencyCostE6_ = fiatCurrencyCostE6_;
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
      if (other instanceof POGOProtos.Rpc.CurrencyQuantityProto) {
        return mergeFrom((POGOProtos.Rpc.CurrencyQuantityProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CurrencyQuantityProto other) {
      if (other == POGOProtos.Rpc.CurrencyQuantityProto.getDefaultInstance()) return this;
      if (!other.getCurrencyType().isEmpty()) {
        currencyType_ = other.currencyType_;
        onChanged();
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getFiatPurchasedQuantity() != 0) {
        setFiatPurchasedQuantity(other.getFiatPurchasedQuantity());
      }
      if (!other.getFiatCurrencyType().isEmpty()) {
        fiatCurrencyType_ = other.fiatCurrencyType_;
        onChanged();
      }
      if (other.getFiatCurrencyCostE6() != 0L) {
        setFiatCurrencyCostE6(other.getFiatCurrencyCostE6());
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
      POGOProtos.Rpc.CurrencyQuantityProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CurrencyQuantityProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currencyType_ = "";
    /**
     * <code>string currency_type = 1;</code>
     * @return The currencyType.
     */
    public java.lang.String getCurrencyType() {
      java.lang.Object ref = currencyType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency_type = 1;</code>
     * @return The bytes for currencyType.
     */
    public com.google.protobuf.ByteString
        getCurrencyTypeBytes() {
      java.lang.Object ref = currencyType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency_type = 1;</code>
     * @param value The currencyType to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currencyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyType() {
      
      currencyType_ = getDefaultInstance().getCurrencyType();
      onChanged();
      return this;
    }
    /**
     * <code>string currency_type = 1;</code>
     * @param value The bytes for currencyType to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currencyType_ = value;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private int fiatPurchasedQuantity_ ;
    /**
     * <code>int32 fiat_purchased_quantity = 3;</code>
     * @return The fiatPurchasedQuantity.
     */
    @java.lang.Override
    public int getFiatPurchasedQuantity() {
      return fiatPurchasedQuantity_;
    }
    /**
     * <code>int32 fiat_purchased_quantity = 3;</code>
     * @param value The fiatPurchasedQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setFiatPurchasedQuantity(int value) {
      
      fiatPurchasedQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fiat_purchased_quantity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatPurchasedQuantity() {
      
      fiatPurchasedQuantity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fiatCurrencyType_ = "";
    /**
     * <code>string fiat_currency_type = 4;</code>
     * @return The fiatCurrencyType.
     */
    public java.lang.String getFiatCurrencyType() {
      java.lang.Object ref = fiatCurrencyType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fiatCurrencyType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fiat_currency_type = 4;</code>
     * @return The bytes for fiatCurrencyType.
     */
    public com.google.protobuf.ByteString
        getFiatCurrencyTypeBytes() {
      java.lang.Object ref = fiatCurrencyType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fiatCurrencyType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fiat_currency_type = 4;</code>
     * @param value The fiatCurrencyType to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrencyType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fiatCurrencyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fiat_currency_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatCurrencyType() {
      
      fiatCurrencyType_ = getDefaultInstance().getFiatCurrencyType();
      onChanged();
      return this;
    }
    /**
     * <code>string fiat_currency_type = 4;</code>
     * @param value The bytes for fiatCurrencyType to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrencyTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fiatCurrencyType_ = value;
      onChanged();
      return this;
    }

    private long fiatCurrencyCostE6_ ;
    /**
     * <code>int64 fiat_currency_cost_e6 = 5;</code>
     * @return The fiatCurrencyCostE6.
     */
    @java.lang.Override
    public long getFiatCurrencyCostE6() {
      return fiatCurrencyCostE6_;
    }
    /**
     * <code>int64 fiat_currency_cost_e6 = 5;</code>
     * @param value The fiatCurrencyCostE6 to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrencyCostE6(long value) {
      
      fiatCurrencyCostE6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fiat_currency_cost_e6 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatCurrencyCostE6() {
      
      fiatCurrencyCostE6_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CurrencyQuantityProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CurrencyQuantityProto)
  private static final POGOProtos.Rpc.CurrencyQuantityProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CurrencyQuantityProto();
  }

  public static POGOProtos.Rpc.CurrencyQuantityProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrencyQuantityProto>
      PARSER = new com.google.protobuf.AbstractParser<CurrencyQuantityProto>() {
    @java.lang.Override
    public CurrencyQuantityProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrencyQuantityProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrencyQuantityProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrencyQuantityProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CurrencyQuantityProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

