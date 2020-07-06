// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Sfida/SfidaMetricsUpdate.proto

package POGOProtos.Data.Sfida;

/**
 * Protobuf type {@code POGOProtos.Data.Sfida.SfidaMetricsUpdate}
 */
public  final class SfidaMetricsUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Sfida.SfidaMetricsUpdate)
    SfidaMetricsUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SfidaMetricsUpdate.newBuilder() to construct.
  private SfidaMetricsUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SfidaMetricsUpdate() {
    updateType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SfidaMetricsUpdate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SfidaMetricsUpdate(
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

            updateType_ = rawValue;
            break;
          }
          case 16: {

            timestampMs_ = input.readInt64();
            break;
          }
          case 26: {
            POGOProtos.Data.Sfida.SfidaMetrics.Builder subBuilder = null;
            if (metrics_ != null) {
              subBuilder = metrics_.toBuilder();
            }
            metrics_ = input.readMessage(POGOProtos.Data.Sfida.SfidaMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metrics_);
              metrics_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Data.Sfida.SfidaMetricsUpdateOuterClass.internal_static_POGOProtos_Data_Sfida_SfidaMetricsUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Sfida.SfidaMetricsUpdateOuterClass.internal_static_POGOProtos_Data_Sfida_SfidaMetricsUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Sfida.SfidaMetricsUpdate.class, POGOProtos.Data.Sfida.SfidaMetricsUpdate.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType}
   */
  public enum UpdateType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>INITIALIZATION = 1;</code>
     */
    INITIALIZATION(1),
    /**
     * <code>ACCUMULATION = 2;</code>
     */
    ACCUMULATION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>INITIALIZATION = 1;</code>
     */
    public static final int INITIALIZATION_VALUE = 1;
    /**
     * <code>ACCUMULATION = 2;</code>
     */
    public static final int ACCUMULATION_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UpdateType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UpdateType forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return INITIALIZATION;
        case 2: return ACCUMULATION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UpdateType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UpdateType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UpdateType>() {
            public UpdateType findValueByNumber(int number) {
              return UpdateType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Data.Sfida.SfidaMetricsUpdate.getDescriptor().getEnumTypes().get(0);
    }

    private static final UpdateType[] VALUES = values();

    public static UpdateType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private UpdateType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType)
  }

  public static final int UPDATE_TYPE_FIELD_NUMBER = 1;
  private int updateType_;
  /**
   * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
   * @return The enum numeric value on the wire for updateType.
   */
  public int getUpdateTypeValue() {
    return updateType_;
  }
  /**
   * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
   * @return The updateType.
   */
  public POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType getUpdateType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType result = POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.valueOf(updateType_);
    return result == null ? POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long timestampMs_;
  /**
   * <code>int64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  public long getTimestampMs() {
    return timestampMs_;
  }

  public static final int METRICS_FIELD_NUMBER = 3;
  private POGOProtos.Data.Sfida.SfidaMetrics metrics_;
  /**
   * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
   * @return Whether the metrics field is set.
   */
  public boolean hasMetrics() {
    return metrics_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
   * @return The metrics.
   */
  public POGOProtos.Data.Sfida.SfidaMetrics getMetrics() {
    return metrics_ == null ? POGOProtos.Data.Sfida.SfidaMetrics.getDefaultInstance() : metrics_;
  }
  /**
   * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
   */
  public POGOProtos.Data.Sfida.SfidaMetricsOrBuilder getMetricsOrBuilder() {
    return getMetrics();
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
    if (updateType_ != POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.UNSET.getNumber()) {
      output.writeEnum(1, updateType_);
    }
    if (timestampMs_ != 0L) {
      output.writeInt64(2, timestampMs_);
    }
    if (metrics_ != null) {
      output.writeMessage(3, getMetrics());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateType_ != POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, updateType_);
    }
    if (timestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestampMs_);
    }
    if (metrics_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMetrics());
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
    if (!(obj instanceof POGOProtos.Data.Sfida.SfidaMetricsUpdate)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Sfida.SfidaMetricsUpdate other = (POGOProtos.Data.Sfida.SfidaMetricsUpdate) obj;

    if (updateType_ != other.updateType_) return false;
    if (getTimestampMs()
        != other.getTimestampMs()) return false;
    if (hasMetrics() != other.hasMetrics()) return false;
    if (hasMetrics()) {
      if (!getMetrics()
          .equals(other.getMetrics())) return false;
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
    hash = (37 * hash) + UPDATE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + updateType_;
    hash = (37 * hash) + TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampMs());
    if (hasMetrics()) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetrics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Sfida.SfidaMetricsUpdate prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Sfida.SfidaMetricsUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Sfida.SfidaMetricsUpdate)
      POGOProtos.Data.Sfida.SfidaMetricsUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Sfida.SfidaMetricsUpdateOuterClass.internal_static_POGOProtos_Data_Sfida_SfidaMetricsUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Sfida.SfidaMetricsUpdateOuterClass.internal_static_POGOProtos_Data_Sfida_SfidaMetricsUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Sfida.SfidaMetricsUpdate.class, POGOProtos.Data.Sfida.SfidaMetricsUpdate.Builder.class);
    }

    // Construct using POGOProtos.Data.Sfida.SfidaMetricsUpdate.newBuilder()
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
      updateType_ = 0;

      timestampMs_ = 0L;

      if (metricsBuilder_ == null) {
        metrics_ = null;
      } else {
        metrics_ = null;
        metricsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Sfida.SfidaMetricsUpdateOuterClass.internal_static_POGOProtos_Data_Sfida_SfidaMetricsUpdate_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Sfida.SfidaMetricsUpdate getDefaultInstanceForType() {
      return POGOProtos.Data.Sfida.SfidaMetricsUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Sfida.SfidaMetricsUpdate build() {
      POGOProtos.Data.Sfida.SfidaMetricsUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Sfida.SfidaMetricsUpdate buildPartial() {
      POGOProtos.Data.Sfida.SfidaMetricsUpdate result = new POGOProtos.Data.Sfida.SfidaMetricsUpdate(this);
      result.updateType_ = updateType_;
      result.timestampMs_ = timestampMs_;
      if (metricsBuilder_ == null) {
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Sfida.SfidaMetricsUpdate) {
        return mergeFrom((POGOProtos.Data.Sfida.SfidaMetricsUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Sfida.SfidaMetricsUpdate other) {
      if (other == POGOProtos.Data.Sfida.SfidaMetricsUpdate.getDefaultInstance()) return this;
      if (other.updateType_ != 0) {
        setUpdateTypeValue(other.getUpdateTypeValue());
      }
      if (other.getTimestampMs() != 0L) {
        setTimestampMs(other.getTimestampMs());
      }
      if (other.hasMetrics()) {
        mergeMetrics(other.getMetrics());
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
      POGOProtos.Data.Sfida.SfidaMetricsUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Sfida.SfidaMetricsUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int updateType_ = 0;
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
     * @return The enum numeric value on the wire for updateType.
     */
    public int getUpdateTypeValue() {
      return updateType_;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
     * @param value The enum numeric value on the wire for updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateTypeValue(int value) {
      updateType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
     * @return The updateType.
     */
    public POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType getUpdateType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType result = POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.valueOf(updateType_);
      return result == null ? POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
     * @param value The updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateType(POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      updateType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetricsUpdate.UpdateType update_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateType() {
      
      updateType_ = 0;
      onChanged();
      return this;
    }

    private long timestampMs_ ;
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @return The timestampMs.
     */
    public long getTimestampMs() {
      return timestampMs_;
    }
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @param value The timestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampMs(long value) {
      
      timestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestampMs() {
      
      timestampMs_ = 0L;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Sfida.SfidaMetrics metrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Sfida.SfidaMetrics, POGOProtos.Data.Sfida.SfidaMetrics.Builder, POGOProtos.Data.Sfida.SfidaMetricsOrBuilder> metricsBuilder_;
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     * @return Whether the metrics field is set.
     */
    public boolean hasMetrics() {
      return metricsBuilder_ != null || metrics_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     * @return The metrics.
     */
    public POGOProtos.Data.Sfida.SfidaMetrics getMetrics() {
      if (metricsBuilder_ == null) {
        return metrics_ == null ? POGOProtos.Data.Sfida.SfidaMetrics.getDefaultInstance() : metrics_;
      } else {
        return metricsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public Builder setMetrics(POGOProtos.Data.Sfida.SfidaMetrics value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metrics_ = value;
        onChanged();
      } else {
        metricsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public Builder setMetrics(
        POGOProtos.Data.Sfida.SfidaMetrics.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        metrics_ = builderForValue.build();
        onChanged();
      } else {
        metricsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public Builder mergeMetrics(POGOProtos.Data.Sfida.SfidaMetrics value) {
      if (metricsBuilder_ == null) {
        if (metrics_ != null) {
          metrics_ =
            POGOProtos.Data.Sfida.SfidaMetrics.newBuilder(metrics_).mergeFrom(value).buildPartial();
        } else {
          metrics_ = value;
        }
        onChanged();
      } else {
        metricsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = null;
        onChanged();
      } else {
        metrics_ = null;
        metricsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public POGOProtos.Data.Sfida.SfidaMetrics.Builder getMetricsBuilder() {
      
      onChanged();
      return getMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    public POGOProtos.Data.Sfida.SfidaMetricsOrBuilder getMetricsOrBuilder() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilder();
      } else {
        return metrics_ == null ?
            POGOProtos.Data.Sfida.SfidaMetrics.getDefaultInstance() : metrics_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Sfida.SfidaMetrics metrics = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Sfida.SfidaMetrics, POGOProtos.Data.Sfida.SfidaMetrics.Builder, POGOProtos.Data.Sfida.SfidaMetricsOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Sfida.SfidaMetrics, POGOProtos.Data.Sfida.SfidaMetrics.Builder, POGOProtos.Data.Sfida.SfidaMetricsOrBuilder>(
                getMetrics(),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Sfida.SfidaMetricsUpdate)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Sfida.SfidaMetricsUpdate)
  private static final POGOProtos.Data.Sfida.SfidaMetricsUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Sfida.SfidaMetricsUpdate();
  }

  public static POGOProtos.Data.Sfida.SfidaMetricsUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SfidaMetricsUpdate>
      PARSER = new com.google.protobuf.AbstractParser<SfidaMetricsUpdate>() {
    @java.lang.Override
    public SfidaMetricsUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SfidaMetricsUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SfidaMetricsUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SfidaMetricsUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Sfida.SfidaMetricsUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
