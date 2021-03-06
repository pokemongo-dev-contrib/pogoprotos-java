// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WeatherDetailClickTelemetry}
 */
public final class WeatherDetailClickTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WeatherDetailClickTelemetry)
    WeatherDetailClickTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherDetailClickTelemetry.newBuilder() to construct.
  private WeatherDetailClickTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherDetailClickTelemetry() {
    gameplayWeatherType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeatherDetailClickTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherDetailClickTelemetry(
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

            gameplayWeatherType_ = s;
            break;
          }
          case 16: {

            alertActive_ = input.readBool();
            break;
          }
          case 24: {

            severity_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WeatherDetailClickTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WeatherDetailClickTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WeatherDetailClickTelemetry.class, POGOProtos.Rpc.WeatherDetailClickTelemetry.Builder.class);
  }

  public static final int GAMEPLAY_WEATHER_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object gameplayWeatherType_;
  /**
   * <code>string gameplay_weather_type = 1;</code>
   * @return The gameplayWeatherType.
   */
  @java.lang.Override
  public java.lang.String getGameplayWeatherType() {
    java.lang.Object ref = gameplayWeatherType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameplayWeatherType_ = s;
      return s;
    }
  }
  /**
   * <code>string gameplay_weather_type = 1;</code>
   * @return The bytes for gameplayWeatherType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameplayWeatherTypeBytes() {
    java.lang.Object ref = gameplayWeatherType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameplayWeatherType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALERT_ACTIVE_FIELD_NUMBER = 2;
  private boolean alertActive_;
  /**
   * <code>bool alert_active = 2;</code>
   * @return The alertActive.
   */
  @java.lang.Override
  public boolean getAlertActive() {
    return alertActive_;
  }

  public static final int SEVERITY_FIELD_NUMBER = 3;
  private int severity_;
  /**
   * <code>int32 severity = 3;</code>
   * @return The severity.
   */
  @java.lang.Override
  public int getSeverity() {
    return severity_;
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
    if (!getGameplayWeatherTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gameplayWeatherType_);
    }
    if (alertActive_ != false) {
      output.writeBool(2, alertActive_);
    }
    if (severity_ != 0) {
      output.writeInt32(3, severity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGameplayWeatherTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gameplayWeatherType_);
    }
    if (alertActive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, alertActive_);
    }
    if (severity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, severity_);
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
    if (!(obj instanceof POGOProtos.Rpc.WeatherDetailClickTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WeatherDetailClickTelemetry other = (POGOProtos.Rpc.WeatherDetailClickTelemetry) obj;

    if (!getGameplayWeatherType()
        .equals(other.getGameplayWeatherType())) return false;
    if (getAlertActive()
        != other.getAlertActive()) return false;
    if (getSeverity()
        != other.getSeverity()) return false;
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
    hash = (37 * hash) + GAMEPLAY_WEATHER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getGameplayWeatherType().hashCode();
    hash = (37 * hash) + ALERT_ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlertActive());
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + getSeverity();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherDetailClickTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WeatherDetailClickTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WeatherDetailClickTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WeatherDetailClickTelemetry)
      POGOProtos.Rpc.WeatherDetailClickTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WeatherDetailClickTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WeatherDetailClickTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WeatherDetailClickTelemetry.class, POGOProtos.Rpc.WeatherDetailClickTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WeatherDetailClickTelemetry.newBuilder()
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
      gameplayWeatherType_ = "";

      alertActive_ = false;

      severity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WeatherDetailClickTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherDetailClickTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.WeatherDetailClickTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherDetailClickTelemetry build() {
      POGOProtos.Rpc.WeatherDetailClickTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherDetailClickTelemetry buildPartial() {
      POGOProtos.Rpc.WeatherDetailClickTelemetry result = new POGOProtos.Rpc.WeatherDetailClickTelemetry(this);
      result.gameplayWeatherType_ = gameplayWeatherType_;
      result.alertActive_ = alertActive_;
      result.severity_ = severity_;
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
      if (other instanceof POGOProtos.Rpc.WeatherDetailClickTelemetry) {
        return mergeFrom((POGOProtos.Rpc.WeatherDetailClickTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WeatherDetailClickTelemetry other) {
      if (other == POGOProtos.Rpc.WeatherDetailClickTelemetry.getDefaultInstance()) return this;
      if (!other.getGameplayWeatherType().isEmpty()) {
        gameplayWeatherType_ = other.gameplayWeatherType_;
        onChanged();
      }
      if (other.getAlertActive() != false) {
        setAlertActive(other.getAlertActive());
      }
      if (other.getSeverity() != 0) {
        setSeverity(other.getSeverity());
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
      POGOProtos.Rpc.WeatherDetailClickTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WeatherDetailClickTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gameplayWeatherType_ = "";
    /**
     * <code>string gameplay_weather_type = 1;</code>
     * @return The gameplayWeatherType.
     */
    public java.lang.String getGameplayWeatherType() {
      java.lang.Object ref = gameplayWeatherType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameplayWeatherType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gameplay_weather_type = 1;</code>
     * @return The bytes for gameplayWeatherType.
     */
    public com.google.protobuf.ByteString
        getGameplayWeatherTypeBytes() {
      java.lang.Object ref = gameplayWeatherType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameplayWeatherType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gameplay_weather_type = 1;</code>
     * @param value The gameplayWeatherType to set.
     * @return This builder for chaining.
     */
    public Builder setGameplayWeatherType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gameplayWeatherType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gameplay_weather_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameplayWeatherType() {
      
      gameplayWeatherType_ = getDefaultInstance().getGameplayWeatherType();
      onChanged();
      return this;
    }
    /**
     * <code>string gameplay_weather_type = 1;</code>
     * @param value The bytes for gameplayWeatherType to set.
     * @return This builder for chaining.
     */
    public Builder setGameplayWeatherTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gameplayWeatherType_ = value;
      onChanged();
      return this;
    }

    private boolean alertActive_ ;
    /**
     * <code>bool alert_active = 2;</code>
     * @return The alertActive.
     */
    @java.lang.Override
    public boolean getAlertActive() {
      return alertActive_;
    }
    /**
     * <code>bool alert_active = 2;</code>
     * @param value The alertActive to set.
     * @return This builder for chaining.
     */
    public Builder setAlertActive(boolean value) {
      
      alertActive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool alert_active = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlertActive() {
      
      alertActive_ = false;
      onChanged();
      return this;
    }

    private int severity_ ;
    /**
     * <code>int32 severity = 3;</code>
     * @return The severity.
     */
    @java.lang.Override
    public int getSeverity() {
      return severity_;
    }
    /**
     * <code>int32 severity = 3;</code>
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(int value) {
      
      severity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 severity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      
      severity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WeatherDetailClickTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WeatherDetailClickTelemetry)
  private static final POGOProtos.Rpc.WeatherDetailClickTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WeatherDetailClickTelemetry();
  }

  public static POGOProtos.Rpc.WeatherDetailClickTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherDetailClickTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<WeatherDetailClickTelemetry>() {
    @java.lang.Override
    public WeatherDetailClickTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherDetailClickTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherDetailClickTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherDetailClickTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WeatherDetailClickTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

