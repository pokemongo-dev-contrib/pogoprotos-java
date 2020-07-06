// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/SetInGameCurrencyExchangeRateMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage}
 */
public  final class SetInGameCurrencyExchangeRateMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)
    SetInGameCurrencyExchangeRateMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetInGameCurrencyExchangeRateMessage.newBuilder() to construct.
  private SetInGameCurrencyExchangeRateMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetInGameCurrencyExchangeRateMessage() {
    inGameCurrency_ = "";
    fiatCurrency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetInGameCurrencyExchangeRateMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetInGameCurrencyExchangeRateMessage(
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

            inGameCurrency_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fiatCurrency_ = s;
            break;
          }
          case 24: {

            fiatCurrencyCostE6PerInGameUnit_ = input.readInt64();
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
    return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_SetInGameCurrencyExchangeRateMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_SetInGameCurrencyExchangeRateMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.class, POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.Builder.class);
  }

  public static final int IN_GAME_CURRENCY_FIELD_NUMBER = 1;
  private volatile java.lang.Object inGameCurrency_;
  /**
   * <code>string in_game_currency = 1;</code>
   * @return The inGameCurrency.
   */
  public java.lang.String getInGameCurrency() {
    java.lang.Object ref = inGameCurrency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inGameCurrency_ = s;
      return s;
    }
  }
  /**
   * <code>string in_game_currency = 1;</code>
   * @return The bytes for inGameCurrency.
   */
  public com.google.protobuf.ByteString
      getInGameCurrencyBytes() {
    java.lang.Object ref = inGameCurrency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inGameCurrency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIAT_CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object fiatCurrency_;
  /**
   * <code>string fiat_currency = 2;</code>
   * @return The fiatCurrency.
   */
  public java.lang.String getFiatCurrency() {
    java.lang.Object ref = fiatCurrency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fiatCurrency_ = s;
      return s;
    }
  }
  /**
   * <code>string fiat_currency = 2;</code>
   * @return The bytes for fiatCurrency.
   */
  public com.google.protobuf.ByteString
      getFiatCurrencyBytes() {
    java.lang.Object ref = fiatCurrency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fiatCurrency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIAT_CURRENCY_COST_E6_PER_IN_GAME_UNIT_FIELD_NUMBER = 3;
  private long fiatCurrencyCostE6PerInGameUnit_;
  /**
   * <code>int64 fiat_currency_cost_e6_per_in_game_unit = 3;</code>
   * @return The fiatCurrencyCostE6PerInGameUnit.
   */
  public long getFiatCurrencyCostE6PerInGameUnit() {
    return fiatCurrencyCostE6PerInGameUnit_;
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
    if (!getInGameCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inGameCurrency_);
    }
    if (!getFiatCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fiatCurrency_);
    }
    if (fiatCurrencyCostE6PerInGameUnit_ != 0L) {
      output.writeInt64(3, fiatCurrencyCostE6PerInGameUnit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInGameCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inGameCurrency_);
    }
    if (!getFiatCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fiatCurrency_);
    }
    if (fiatCurrencyCostE6PerInGameUnit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, fiatCurrencyCostE6PerInGameUnit_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage other = (POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage) obj;

    if (!getInGameCurrency()
        .equals(other.getInGameCurrency())) return false;
    if (!getFiatCurrency()
        .equals(other.getFiatCurrency())) return false;
    if (getFiatCurrencyCostE6PerInGameUnit()
        != other.getFiatCurrencyCostE6PerInGameUnit()) return false;
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
    hash = (37 * hash) + IN_GAME_CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getInGameCurrency().hashCode();
    hash = (37 * hash) + FIAT_CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getFiatCurrency().hashCode();
    hash = (37 * hash) + FIAT_CURRENCY_COST_E6_PER_IN_GAME_UNIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFiatCurrencyCostE6PerInGameUnit());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)
      POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_SetInGameCurrencyExchangeRateMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_SetInGameCurrencyExchangeRateMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.class, POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.newBuilder()
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
      inGameCurrency_ = "";

      fiatCurrency_ = "";

      fiatCurrencyCostE6PerInGameUnit_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_SetInGameCurrencyExchangeRateMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage build() {
      POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage buildPartial() {
      POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage result = new POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage(this);
      result.inGameCurrency_ = inGameCurrency_;
      result.fiatCurrency_ = fiatCurrency_;
      result.fiatCurrencyCostE6PerInGameUnit_ = fiatCurrencyCostE6PerInGameUnit_;
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
      if (other instanceof POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage other) {
      if (other == POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage.getDefaultInstance()) return this;
      if (!other.getInGameCurrency().isEmpty()) {
        inGameCurrency_ = other.inGameCurrency_;
        onChanged();
      }
      if (!other.getFiatCurrency().isEmpty()) {
        fiatCurrency_ = other.fiatCurrency_;
        onChanged();
      }
      if (other.getFiatCurrencyCostE6PerInGameUnit() != 0L) {
        setFiatCurrencyCostE6PerInGameUnit(other.getFiatCurrencyCostE6PerInGameUnit());
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
      POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inGameCurrency_ = "";
    /**
     * <code>string in_game_currency = 1;</code>
     * @return The inGameCurrency.
     */
    public java.lang.String getInGameCurrency() {
      java.lang.Object ref = inGameCurrency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inGameCurrency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string in_game_currency = 1;</code>
     * @return The bytes for inGameCurrency.
     */
    public com.google.protobuf.ByteString
        getInGameCurrencyBytes() {
      java.lang.Object ref = inGameCurrency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inGameCurrency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string in_game_currency = 1;</code>
     * @param value The inGameCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setInGameCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inGameCurrency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string in_game_currency = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInGameCurrency() {
      
      inGameCurrency_ = getDefaultInstance().getInGameCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string in_game_currency = 1;</code>
     * @param value The bytes for inGameCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setInGameCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inGameCurrency_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fiatCurrency_ = "";
    /**
     * <code>string fiat_currency = 2;</code>
     * @return The fiatCurrency.
     */
    public java.lang.String getFiatCurrency() {
      java.lang.Object ref = fiatCurrency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fiatCurrency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fiat_currency = 2;</code>
     * @return The bytes for fiatCurrency.
     */
    public com.google.protobuf.ByteString
        getFiatCurrencyBytes() {
      java.lang.Object ref = fiatCurrency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fiatCurrency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fiat_currency = 2;</code>
     * @param value The fiatCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fiatCurrency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fiat_currency = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatCurrency() {
      
      fiatCurrency_ = getDefaultInstance().getFiatCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string fiat_currency = 2;</code>
     * @param value The bytes for fiatCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fiatCurrency_ = value;
      onChanged();
      return this;
    }

    private long fiatCurrencyCostE6PerInGameUnit_ ;
    /**
     * <code>int64 fiat_currency_cost_e6_per_in_game_unit = 3;</code>
     * @return The fiatCurrencyCostE6PerInGameUnit.
     */
    public long getFiatCurrencyCostE6PerInGameUnit() {
      return fiatCurrencyCostE6PerInGameUnit_;
    }
    /**
     * <code>int64 fiat_currency_cost_e6_per_in_game_unit = 3;</code>
     * @param value The fiatCurrencyCostE6PerInGameUnit to set.
     * @return This builder for chaining.
     */
    public Builder setFiatCurrencyCostE6PerInGameUnit(long value) {
      
      fiatCurrencyCostE6PerInGameUnit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fiat_currency_cost_e6_per_in_game_unit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatCurrencyCostE6PerInGameUnit() {
      
      fiatCurrencyCostE6PerInGameUnit_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage)
  private static final POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage();
  }

  public static POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetInGameCurrencyExchangeRateMessage>
      PARSER = new com.google.protobuf.AbstractParser<SetInGameCurrencyExchangeRateMessage>() {
    @java.lang.Override
    public SetInGameCurrencyExchangeRateMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetInGameCurrencyExchangeRateMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetInGameCurrencyExchangeRateMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetInGameCurrencyExchangeRateMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Platform.Requests.SetInGameCurrencyExchangeRateMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
