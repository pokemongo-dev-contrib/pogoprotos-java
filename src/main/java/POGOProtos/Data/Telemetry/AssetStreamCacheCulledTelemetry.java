// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/AssetStreamCacheCulledTelemetry.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry}
 */
public  final class AssetStreamCacheCulledTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)
    AssetStreamCacheCulledTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetStreamCacheCulledTelemetry.newBuilder() to construct.
  private AssetStreamCacheCulledTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetStreamCacheCulledTelemetry() {
    assetEventId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetStreamCacheCulledTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetStreamCacheCulledTelemetry(
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

            assetEventId_ = rawValue;
            break;
          }
          case 16: {

            spaceReleased_ = input.readUInt32();
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
    return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.class, POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.Builder.class);
  }

  public static final int ASSET_EVENT_ID_FIELD_NUMBER = 1;
  private int assetEventId_;
  /**
   * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The enum numeric value on the wire for assetEventId.
   */
  public int getAssetEventIdValue() {
    return assetEventId_;
  }
  /**
   * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The assetEventId.
   */
  public POGOProtos.Enums.AssetTelemetryIds getAssetEventId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.AssetTelemetryIds result = POGOProtos.Enums.AssetTelemetryIds.valueOf(assetEventId_);
    return result == null ? POGOProtos.Enums.AssetTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int SPACE_RELEASED_FIELD_NUMBER = 2;
  private int spaceReleased_;
  /**
   * <code>uint32 space_released = 2;</code>
   * @return The spaceReleased.
   */
  public int getSpaceReleased() {
    return spaceReleased_;
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
    if (assetEventId_ != POGOProtos.Enums.AssetTelemetryIds.UNDEFINED_ASSET_EVENT.getNumber()) {
      output.writeEnum(1, assetEventId_);
    }
    if (spaceReleased_ != 0) {
      output.writeUInt32(2, spaceReleased_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetEventId_ != POGOProtos.Enums.AssetTelemetryIds.UNDEFINED_ASSET_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, assetEventId_);
    }
    if (spaceReleased_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, spaceReleased_);
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
    if (!(obj instanceof POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry other = (POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry) obj;

    if (assetEventId_ != other.assetEventId_) return false;
    if (getSpaceReleased()
        != other.getSpaceReleased()) return false;
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
    hash = (37 * hash) + ASSET_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + assetEventId_;
    hash = (37 * hash) + SPACE_RELEASED_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceReleased();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)
      POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.class, POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.newBuilder()
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
      assetEventId_ = 0;

      spaceReleased_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetStreamCacheCulledTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry build() {
      POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry buildPartial() {
      POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry result = new POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry(this);
      result.assetEventId_ = assetEventId_;
      result.spaceReleased_ = spaceReleased_;
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
      if (other instanceof POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry) {
        return mergeFrom((POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry other) {
      if (other == POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry.getDefaultInstance()) return this;
      if (other.assetEventId_ != 0) {
        setAssetEventIdValue(other.getAssetEventIdValue());
      }
      if (other.getSpaceReleased() != 0) {
        setSpaceReleased(other.getSpaceReleased());
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
      POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int assetEventId_ = 0;
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return The enum numeric value on the wire for assetEventId.
     */
    public int getAssetEventIdValue() {
      return assetEventId_;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @param value The enum numeric value on the wire for assetEventId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetEventIdValue(int value) {
      assetEventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return The assetEventId.
     */
    public POGOProtos.Enums.AssetTelemetryIds getAssetEventId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.AssetTelemetryIds result = POGOProtos.Enums.AssetTelemetryIds.valueOf(assetEventId_);
      return result == null ? POGOProtos.Enums.AssetTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @param value The assetEventId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetEventId(POGOProtos.Enums.AssetTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      assetEventId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetEventId() {
      
      assetEventId_ = 0;
      onChanged();
      return this;
    }

    private int spaceReleased_ ;
    /**
     * <code>uint32 space_released = 2;</code>
     * @return The spaceReleased.
     */
    public int getSpaceReleased() {
      return spaceReleased_;
    }
    /**
     * <code>uint32 space_released = 2;</code>
     * @param value The spaceReleased to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceReleased(int value) {
      
      spaceReleased_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 space_released = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceReleased() {
      
      spaceReleased_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry)
  private static final POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry();
  }

  public static POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetStreamCacheCulledTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<AssetStreamCacheCulledTelemetry>() {
    @java.lang.Override
    public AssetStreamCacheCulledTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetStreamCacheCulledTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetStreamCacheCulledTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetStreamCacheCulledTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.AssetStreamCacheCulledTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
