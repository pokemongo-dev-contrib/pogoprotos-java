// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/FortSummary.proto

package POGOProtos.Map.Fort;

/**
 * Protobuf type {@code POGOProtos.Map.Fort.FortSummary}
 */
public  final class FortSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Map.Fort.FortSummary)
    FortSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FortSummary.newBuilder() to construct.
  private FortSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FortSummary() {
    fortSummaryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FortSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FortSummary(
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

            fortSummaryId_ = s;
            break;
          }
          case 16: {

            lastModifiedTimestampMs_ = input.readInt64();
            break;
          }
          case 25: {

            latitude_ = input.readDouble();
            break;
          }
          case 33: {

            longitude_ = input.readDouble();
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
    return POGOProtos.Map.Fort.FortSummaryOuterClass.internal_static_POGOProtos_Map_Fort_FortSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Map.Fort.FortSummaryOuterClass.internal_static_POGOProtos_Map_Fort_FortSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Map.Fort.FortSummary.class, POGOProtos.Map.Fort.FortSummary.Builder.class);
  }

  public static final int FORT_SUMMARY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object fortSummaryId_;
  /**
   * <code>string fort_summary_id = 1;</code>
   * @return The fortSummaryId.
   */
  public java.lang.String getFortSummaryId() {
    java.lang.Object ref = fortSummaryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortSummaryId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_summary_id = 1;</code>
   * @return The bytes for fortSummaryId.
   */
  public com.google.protobuf.ByteString
      getFortSummaryIdBytes() {
    java.lang.Object ref = fortSummaryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortSummaryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_MODIFIED_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long lastModifiedTimestampMs_;
  /**
   * <code>int64 last_modified_timestamp_ms = 2;</code>
   * @return The lastModifiedTimestampMs.
   */
  public long getLastModifiedTimestampMs() {
    return lastModifiedTimestampMs_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 3;
  private double latitude_;
  /**
   * <code>double latitude = 3;</code>
   * @return The latitude.
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 4;
  private double longitude_;
  /**
   * <code>double longitude = 4;</code>
   * @return The longitude.
   */
  public double getLongitude() {
    return longitude_;
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
    if (!getFortSummaryIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fortSummaryId_);
    }
    if (lastModifiedTimestampMs_ != 0L) {
      output.writeInt64(2, lastModifiedTimestampMs_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(3, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(4, longitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFortSummaryIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fortSummaryId_);
    }
    if (lastModifiedTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastModifiedTimestampMs_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, longitude_);
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
    if (!(obj instanceof POGOProtos.Map.Fort.FortSummary)) {
      return super.equals(obj);
    }
    POGOProtos.Map.Fort.FortSummary other = (POGOProtos.Map.Fort.FortSummary) obj;

    if (!getFortSummaryId()
        .equals(other.getFortSummaryId())) return false;
    if (getLastModifiedTimestampMs()
        != other.getLastModifiedTimestampMs()) return false;
    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
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
    hash = (37 * hash) + FORT_SUMMARY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortSummaryId().hashCode();
    hash = (37 * hash) + LAST_MODIFIED_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastModifiedTimestampMs());
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Fort.FortSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Fort.FortSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Fort.FortSummary parseFrom(
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
  public static Builder newBuilder(POGOProtos.Map.Fort.FortSummary prototype) {
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
   * Protobuf type {@code POGOProtos.Map.Fort.FortSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Map.Fort.FortSummary)
      POGOProtos.Map.Fort.FortSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Map.Fort.FortSummaryOuterClass.internal_static_POGOProtos_Map_Fort_FortSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Map.Fort.FortSummaryOuterClass.internal_static_POGOProtos_Map_Fort_FortSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Map.Fort.FortSummary.class, POGOProtos.Map.Fort.FortSummary.Builder.class);
    }

    // Construct using POGOProtos.Map.Fort.FortSummary.newBuilder()
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
      fortSummaryId_ = "";

      lastModifiedTimestampMs_ = 0L;

      latitude_ = 0D;

      longitude_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Map.Fort.FortSummaryOuterClass.internal_static_POGOProtos_Map_Fort_FortSummary_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Map.Fort.FortSummary getDefaultInstanceForType() {
      return POGOProtos.Map.Fort.FortSummary.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Map.Fort.FortSummary build() {
      POGOProtos.Map.Fort.FortSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Map.Fort.FortSummary buildPartial() {
      POGOProtos.Map.Fort.FortSummary result = new POGOProtos.Map.Fort.FortSummary(this);
      result.fortSummaryId_ = fortSummaryId_;
      result.lastModifiedTimestampMs_ = lastModifiedTimestampMs_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
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
      if (other instanceof POGOProtos.Map.Fort.FortSummary) {
        return mergeFrom((POGOProtos.Map.Fort.FortSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Map.Fort.FortSummary other) {
      if (other == POGOProtos.Map.Fort.FortSummary.getDefaultInstance()) return this;
      if (!other.getFortSummaryId().isEmpty()) {
        fortSummaryId_ = other.fortSummaryId_;
        onChanged();
      }
      if (other.getLastModifiedTimestampMs() != 0L) {
        setLastModifiedTimestampMs(other.getLastModifiedTimestampMs());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
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
      POGOProtos.Map.Fort.FortSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Map.Fort.FortSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fortSummaryId_ = "";
    /**
     * <code>string fort_summary_id = 1;</code>
     * @return The fortSummaryId.
     */
    public java.lang.String getFortSummaryId() {
      java.lang.Object ref = fortSummaryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortSummaryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_summary_id = 1;</code>
     * @return The bytes for fortSummaryId.
     */
    public com.google.protobuf.ByteString
        getFortSummaryIdBytes() {
      java.lang.Object ref = fortSummaryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortSummaryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_summary_id = 1;</code>
     * @param value The fortSummaryId to set.
     * @return This builder for chaining.
     */
    public Builder setFortSummaryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortSummaryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_summary_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortSummaryId() {
      
      fortSummaryId_ = getDefaultInstance().getFortSummaryId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_summary_id = 1;</code>
     * @param value The bytes for fortSummaryId to set.
     * @return This builder for chaining.
     */
    public Builder setFortSummaryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortSummaryId_ = value;
      onChanged();
      return this;
    }

    private long lastModifiedTimestampMs_ ;
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @return The lastModifiedTimestampMs.
     */
    public long getLastModifiedTimestampMs() {
      return lastModifiedTimestampMs_;
    }
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @param value The lastModifiedTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setLastModifiedTimestampMs(long value) {
      
      lastModifiedTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastModifiedTimestampMs() {
      
      lastModifiedTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 3;</code>
     * @return The latitude.
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 3;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 4;</code>
     * @return The longitude.
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 4;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Map.Fort.FortSummary)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Map.Fort.FortSummary)
  private static final POGOProtos.Map.Fort.FortSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Map.Fort.FortSummary();
  }

  public static POGOProtos.Map.Fort.FortSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FortSummary>
      PARSER = new com.google.protobuf.AbstractParser<FortSummary>() {
    @java.lang.Override
    public FortSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FortSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FortSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FortSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Map.Fort.FortSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
