// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FitnessReportProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FitnessReportProto}
 */
public final class FitnessReportProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FitnessReportProto)
    FitnessReportProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FitnessReportProto.newBuilder() to construct.
  private FitnessReportProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FitnessReportProto() {
    gameData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FitnessReportProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FitnessReportProto(
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
            windowCase_ = 1;
            window_ = input.readInt32();
            break;
          }
          case 16: {
            windowCase_ = 2;
            window_ = input.readInt32();
            break;
          }
          case 26: {
            POGOProtos.Rpc.FitnessMetricsProto.Builder subBuilder = null;
            if (metrics_ != null) {
              subBuilder = metrics_.toBuilder();
            }
            metrics_ = input.readMessage(POGOProtos.Rpc.FitnessMetricsProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metrics_);
              metrics_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {

            gameData_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FitnessReportProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FitnessReportProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FitnessReportProto.class, POGOProtos.Rpc.FitnessReportProto.Builder.class);
  }

  private int windowCase_ = 0;
  private java.lang.Object window_;
  public enum WindowCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DAY_OFFSET_FROM_NOW(1),
    WEEK_OFFSET_FROM_NOW(2),
    WINDOW_NOT_SET(0);
    private final int value;
    private WindowCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WindowCase valueOf(int value) {
      return forNumber(value);
    }

    public static WindowCase forNumber(int value) {
      switch (value) {
        case 1: return DAY_OFFSET_FROM_NOW;
        case 2: return WEEK_OFFSET_FROM_NOW;
        case 0: return WINDOW_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public WindowCase
  getWindowCase() {
    return WindowCase.forNumber(
        windowCase_);
  }

  public static final int DAY_OFFSET_FROM_NOW_FIELD_NUMBER = 1;
  /**
   * <code>int32 day_offset_from_now = 1;</code>
   * @return The dayOffsetFromNow.
   */
  @java.lang.Override
  public int getDayOffsetFromNow() {
    if (windowCase_ == 1) {
      return (java.lang.Integer) window_;
    }
    return 0;
  }

  public static final int WEEK_OFFSET_FROM_NOW_FIELD_NUMBER = 2;
  /**
   * <code>int32 week_offset_from_now = 2;</code>
   * @return The weekOffsetFromNow.
   */
  @java.lang.Override
  public int getWeekOffsetFromNow() {
    if (windowCase_ == 2) {
      return (java.lang.Integer) window_;
    }
    return 0;
  }

  public static final int METRICS_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.FitnessMetricsProto metrics_;
  /**
   * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
   * @return Whether the metrics field is set.
   */
  @java.lang.Override
  public boolean hasMetrics() {
    return metrics_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
   * @return The metrics.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FitnessMetricsProto getMetrics() {
    return metrics_ == null ? POGOProtos.Rpc.FitnessMetricsProto.getDefaultInstance() : metrics_;
  }
  /**
   * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FitnessMetricsProtoOrBuilder getMetricsOrBuilder() {
    return getMetrics();
  }

  public static final int GAME_DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString gameData_;
  /**
   * <code>bytes game_data = 4;</code>
   * @return The gameData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGameData() {
    return gameData_;
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
    if (windowCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) window_));
    }
    if (windowCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) window_));
    }
    if (metrics_ != null) {
      output.writeMessage(3, getMetrics());
    }
    if (!gameData_.isEmpty()) {
      output.writeBytes(4, gameData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) window_));
    }
    if (windowCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) window_));
    }
    if (metrics_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMetrics());
    }
    if (!gameData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, gameData_);
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
    if (!(obj instanceof POGOProtos.Rpc.FitnessReportProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FitnessReportProto other = (POGOProtos.Rpc.FitnessReportProto) obj;

    if (hasMetrics() != other.hasMetrics()) return false;
    if (hasMetrics()) {
      if (!getMetrics()
          .equals(other.getMetrics())) return false;
    }
    if (!getGameData()
        .equals(other.getGameData())) return false;
    if (!getWindowCase().equals(other.getWindowCase())) return false;
    switch (windowCase_) {
      case 1:
        if (getDayOffsetFromNow()
            != other.getDayOffsetFromNow()) return false;
        break;
      case 2:
        if (getWeekOffsetFromNow()
            != other.getWeekOffsetFromNow()) return false;
        break;
      case 0:
      default:
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
    if (hasMetrics()) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetrics().hashCode();
    }
    hash = (37 * hash) + GAME_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getGameData().hashCode();
    switch (windowCase_) {
      case 1:
        hash = (37 * hash) + DAY_OFFSET_FROM_NOW_FIELD_NUMBER;
        hash = (53 * hash) + getDayOffsetFromNow();
        break;
      case 2:
        hash = (37 * hash) + WEEK_OFFSET_FROM_NOW_FIELD_NUMBER;
        hash = (53 * hash) + getWeekOffsetFromNow();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessReportProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FitnessReportProto prototype) {
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
   * <pre>
   * ref: FitnessReportProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FitnessReportProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FitnessReportProto)
      POGOProtos.Rpc.FitnessReportProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FitnessReportProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FitnessReportProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FitnessReportProto.class, POGOProtos.Rpc.FitnessReportProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FitnessReportProto.newBuilder()
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
      if (metricsBuilder_ == null) {
        metrics_ = null;
      } else {
        metrics_ = null;
        metricsBuilder_ = null;
      }
      gameData_ = com.google.protobuf.ByteString.EMPTY;

      windowCase_ = 0;
      window_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FitnessReportProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessReportProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.FitnessReportProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessReportProto build() {
      POGOProtos.Rpc.FitnessReportProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessReportProto buildPartial() {
      POGOProtos.Rpc.FitnessReportProto result = new POGOProtos.Rpc.FitnessReportProto(this);
      if (windowCase_ == 1) {
        result.window_ = window_;
      }
      if (windowCase_ == 2) {
        result.window_ = window_;
      }
      if (metricsBuilder_ == null) {
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
      result.gameData_ = gameData_;
      result.windowCase_ = windowCase_;
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
      if (other instanceof POGOProtos.Rpc.FitnessReportProto) {
        return mergeFrom((POGOProtos.Rpc.FitnessReportProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FitnessReportProto other) {
      if (other == POGOProtos.Rpc.FitnessReportProto.getDefaultInstance()) return this;
      if (other.hasMetrics()) {
        mergeMetrics(other.getMetrics());
      }
      if (other.getGameData() != com.google.protobuf.ByteString.EMPTY) {
        setGameData(other.getGameData());
      }
      switch (other.getWindowCase()) {
        case DAY_OFFSET_FROM_NOW: {
          setDayOffsetFromNow(other.getDayOffsetFromNow());
          break;
        }
        case WEEK_OFFSET_FROM_NOW: {
          setWeekOffsetFromNow(other.getWeekOffsetFromNow());
          break;
        }
        case WINDOW_NOT_SET: {
          break;
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
      POGOProtos.Rpc.FitnessReportProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FitnessReportProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int windowCase_ = 0;
    private java.lang.Object window_;
    public WindowCase
        getWindowCase() {
      return WindowCase.forNumber(
          windowCase_);
    }

    public Builder clearWindow() {
      windowCase_ = 0;
      window_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>int32 day_offset_from_now = 1;</code>
     * @return The dayOffsetFromNow.
     */
    public int getDayOffsetFromNow() {
      if (windowCase_ == 1) {
        return (java.lang.Integer) window_;
      }
      return 0;
    }
    /**
     * <code>int32 day_offset_from_now = 1;</code>
     * @param value The dayOffsetFromNow to set.
     * @return This builder for chaining.
     */
    public Builder setDayOffsetFromNow(int value) {
      windowCase_ = 1;
      window_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 day_offset_from_now = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOffsetFromNow() {
      if (windowCase_ == 1) {
        windowCase_ = 0;
        window_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 week_offset_from_now = 2;</code>
     * @return The weekOffsetFromNow.
     */
    public int getWeekOffsetFromNow() {
      if (windowCase_ == 2) {
        return (java.lang.Integer) window_;
      }
      return 0;
    }
    /**
     * <code>int32 week_offset_from_now = 2;</code>
     * @param value The weekOffsetFromNow to set.
     * @return This builder for chaining.
     */
    public Builder setWeekOffsetFromNow(int value) {
      windowCase_ = 2;
      window_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 week_offset_from_now = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeekOffsetFromNow() {
      if (windowCase_ == 2) {
        windowCase_ = 0;
        window_ = null;
        onChanged();
      }
      return this;
    }

    private POGOProtos.Rpc.FitnessMetricsProto metrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FitnessMetricsProto, POGOProtos.Rpc.FitnessMetricsProto.Builder, POGOProtos.Rpc.FitnessMetricsProtoOrBuilder> metricsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     * @return Whether the metrics field is set.
     */
    public boolean hasMetrics() {
      return metricsBuilder_ != null || metrics_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     * @return The metrics.
     */
    public POGOProtos.Rpc.FitnessMetricsProto getMetrics() {
      if (metricsBuilder_ == null) {
        return metrics_ == null ? POGOProtos.Rpc.FitnessMetricsProto.getDefaultInstance() : metrics_;
      } else {
        return metricsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    public Builder setMetrics(POGOProtos.Rpc.FitnessMetricsProto value) {
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
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    public Builder setMetrics(
        POGOProtos.Rpc.FitnessMetricsProto.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        metrics_ = builderForValue.build();
        onChanged();
      } else {
        metricsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    public Builder mergeMetrics(POGOProtos.Rpc.FitnessMetricsProto value) {
      if (metricsBuilder_ == null) {
        if (metrics_ != null) {
          metrics_ =
            POGOProtos.Rpc.FitnessMetricsProto.newBuilder(metrics_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
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
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    public POGOProtos.Rpc.FitnessMetricsProto.Builder getMetricsBuilder() {
      
      onChanged();
      return getMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    public POGOProtos.Rpc.FitnessMetricsProtoOrBuilder getMetricsOrBuilder() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilder();
      } else {
        return metrics_ == null ?
            POGOProtos.Rpc.FitnessMetricsProto.getDefaultInstance() : metrics_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessMetricsProto metrics = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FitnessMetricsProto, POGOProtos.Rpc.FitnessMetricsProto.Builder, POGOProtos.Rpc.FitnessMetricsProtoOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FitnessMetricsProto, POGOProtos.Rpc.FitnessMetricsProto.Builder, POGOProtos.Rpc.FitnessMetricsProtoOrBuilder>(
                getMetrics(),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private com.google.protobuf.ByteString gameData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes game_data = 4;</code>
     * @return The gameData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getGameData() {
      return gameData_;
    }
    /**
     * <code>bytes game_data = 4;</code>
     * @param value The gameData to set.
     * @return This builder for chaining.
     */
    public Builder setGameData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gameData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes game_data = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameData() {
      
      gameData_ = getDefaultInstance().getGameData();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FitnessReportProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FitnessReportProto)
  private static final POGOProtos.Rpc.FitnessReportProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FitnessReportProto();
  }

  public static POGOProtos.Rpc.FitnessReportProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FitnessReportProto>
      PARSER = new com.google.protobuf.AbstractParser<FitnessReportProto>() {
    @java.lang.Override
    public FitnessReportProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FitnessReportProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FitnessReportProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FitnessReportProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FitnessReportProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

