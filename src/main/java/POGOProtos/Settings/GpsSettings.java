// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/GpsSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.GpsSettings}
 */
public  final class GpsSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.GpsSettings)
    GpsSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GpsSettings.newBuilder() to construct.
  private GpsSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GpsSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GpsSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GpsSettings(
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
          case 13: {

            drivingWarningSpeedMetersPerSecond_ = input.readFloat();
            break;
          }
          case 21: {

            drivingWarningCooldownMinutes_ = input.readFloat();
            break;
          }
          case 29: {

            drivingSpeedSampleIntervalSeconds_ = input.readFloat();
            break;
          }
          case 32: {

            drivingSpeedSampleCount_ = input.readInt32();
            break;
          }
          case 45: {

            idleThresholdSpeedMetersPerSecond_ = input.readFloat();
            break;
          }
          case 48: {

            idleThresholdDurationSeconds_ = input.readInt32();
            break;
          }
          case 61: {

            idleSampleIntervalSeconds_ = input.readFloat();
            break;
          }
          case 64: {

            idleSpeedSampleCount_ = input.readInt32();
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
    return POGOProtos.Settings.GpsSettingsOuterClass.internal_static_POGOProtos_Settings_GpsSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.GpsSettingsOuterClass.internal_static_POGOProtos_Settings_GpsSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.GpsSettings.class, POGOProtos.Settings.GpsSettings.Builder.class);
  }

  public static final int DRIVING_WARNING_SPEED_METERS_PER_SECOND_FIELD_NUMBER = 1;
  private float drivingWarningSpeedMetersPerSecond_;
  /**
   * <code>float driving_warning_speed_meters_per_second = 1;</code>
   * @return The drivingWarningSpeedMetersPerSecond.
   */
  public float getDrivingWarningSpeedMetersPerSecond() {
    return drivingWarningSpeedMetersPerSecond_;
  }

  public static final int DRIVING_WARNING_COOLDOWN_MINUTES_FIELD_NUMBER = 2;
  private float drivingWarningCooldownMinutes_;
  /**
   * <code>float driving_warning_cooldown_minutes = 2;</code>
   * @return The drivingWarningCooldownMinutes.
   */
  public float getDrivingWarningCooldownMinutes() {
    return drivingWarningCooldownMinutes_;
  }

  public static final int DRIVING_SPEED_SAMPLE_INTERVAL_SECONDS_FIELD_NUMBER = 3;
  private float drivingSpeedSampleIntervalSeconds_;
  /**
   * <code>float driving_speed_sample_interval_seconds = 3;</code>
   * @return The drivingSpeedSampleIntervalSeconds.
   */
  public float getDrivingSpeedSampleIntervalSeconds() {
    return drivingSpeedSampleIntervalSeconds_;
  }

  public static final int DRIVING_SPEED_SAMPLE_COUNT_FIELD_NUMBER = 4;
  private int drivingSpeedSampleCount_;
  /**
   * <code>int32 driving_speed_sample_count = 4;</code>
   * @return The drivingSpeedSampleCount.
   */
  public int getDrivingSpeedSampleCount() {
    return drivingSpeedSampleCount_;
  }

  public static final int IDLE_THRESHOLD_SPEED_METERS_PER_SECOND_FIELD_NUMBER = 5;
  private float idleThresholdSpeedMetersPerSecond_;
  /**
   * <code>float idle_threshold_speed_meters_per_second = 5;</code>
   * @return The idleThresholdSpeedMetersPerSecond.
   */
  public float getIdleThresholdSpeedMetersPerSecond() {
    return idleThresholdSpeedMetersPerSecond_;
  }

  public static final int IDLE_THRESHOLD_DURATION_SECONDS_FIELD_NUMBER = 6;
  private int idleThresholdDurationSeconds_;
  /**
   * <code>int32 idle_threshold_duration_seconds = 6;</code>
   * @return The idleThresholdDurationSeconds.
   */
  public int getIdleThresholdDurationSeconds() {
    return idleThresholdDurationSeconds_;
  }

  public static final int IDLE_SAMPLE_INTERVAL_SECONDS_FIELD_NUMBER = 7;
  private float idleSampleIntervalSeconds_;
  /**
   * <code>float idle_sample_interval_seconds = 7;</code>
   * @return The idleSampleIntervalSeconds.
   */
  public float getIdleSampleIntervalSeconds() {
    return idleSampleIntervalSeconds_;
  }

  public static final int IDLE_SPEED_SAMPLE_COUNT_FIELD_NUMBER = 8;
  private int idleSpeedSampleCount_;
  /**
   * <code>int32 idle_speed_sample_count = 8;</code>
   * @return The idleSpeedSampleCount.
   */
  public int getIdleSpeedSampleCount() {
    return idleSpeedSampleCount_;
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
    if (drivingWarningSpeedMetersPerSecond_ != 0F) {
      output.writeFloat(1, drivingWarningSpeedMetersPerSecond_);
    }
    if (drivingWarningCooldownMinutes_ != 0F) {
      output.writeFloat(2, drivingWarningCooldownMinutes_);
    }
    if (drivingSpeedSampleIntervalSeconds_ != 0F) {
      output.writeFloat(3, drivingSpeedSampleIntervalSeconds_);
    }
    if (drivingSpeedSampleCount_ != 0) {
      output.writeInt32(4, drivingSpeedSampleCount_);
    }
    if (idleThresholdSpeedMetersPerSecond_ != 0F) {
      output.writeFloat(5, idleThresholdSpeedMetersPerSecond_);
    }
    if (idleThresholdDurationSeconds_ != 0) {
      output.writeInt32(6, idleThresholdDurationSeconds_);
    }
    if (idleSampleIntervalSeconds_ != 0F) {
      output.writeFloat(7, idleSampleIntervalSeconds_);
    }
    if (idleSpeedSampleCount_ != 0) {
      output.writeInt32(8, idleSpeedSampleCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (drivingWarningSpeedMetersPerSecond_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, drivingWarningSpeedMetersPerSecond_);
    }
    if (drivingWarningCooldownMinutes_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, drivingWarningCooldownMinutes_);
    }
    if (drivingSpeedSampleIntervalSeconds_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, drivingSpeedSampleIntervalSeconds_);
    }
    if (drivingSpeedSampleCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, drivingSpeedSampleCount_);
    }
    if (idleThresholdSpeedMetersPerSecond_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, idleThresholdSpeedMetersPerSecond_);
    }
    if (idleThresholdDurationSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, idleThresholdDurationSeconds_);
    }
    if (idleSampleIntervalSeconds_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, idleSampleIntervalSeconds_);
    }
    if (idleSpeedSampleCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, idleSpeedSampleCount_);
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
    if (!(obj instanceof POGOProtos.Settings.GpsSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.GpsSettings other = (POGOProtos.Settings.GpsSettings) obj;

    if (java.lang.Float.floatToIntBits(getDrivingWarningSpeedMetersPerSecond())
        != java.lang.Float.floatToIntBits(
            other.getDrivingWarningSpeedMetersPerSecond())) return false;
    if (java.lang.Float.floatToIntBits(getDrivingWarningCooldownMinutes())
        != java.lang.Float.floatToIntBits(
            other.getDrivingWarningCooldownMinutes())) return false;
    if (java.lang.Float.floatToIntBits(getDrivingSpeedSampleIntervalSeconds())
        != java.lang.Float.floatToIntBits(
            other.getDrivingSpeedSampleIntervalSeconds())) return false;
    if (getDrivingSpeedSampleCount()
        != other.getDrivingSpeedSampleCount()) return false;
    if (java.lang.Float.floatToIntBits(getIdleThresholdSpeedMetersPerSecond())
        != java.lang.Float.floatToIntBits(
            other.getIdleThresholdSpeedMetersPerSecond())) return false;
    if (getIdleThresholdDurationSeconds()
        != other.getIdleThresholdDurationSeconds()) return false;
    if (java.lang.Float.floatToIntBits(getIdleSampleIntervalSeconds())
        != java.lang.Float.floatToIntBits(
            other.getIdleSampleIntervalSeconds())) return false;
    if (getIdleSpeedSampleCount()
        != other.getIdleSpeedSampleCount()) return false;
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
    hash = (37 * hash) + DRIVING_WARNING_SPEED_METERS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDrivingWarningSpeedMetersPerSecond());
    hash = (37 * hash) + DRIVING_WARNING_COOLDOWN_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDrivingWarningCooldownMinutes());
    hash = (37 * hash) + DRIVING_SPEED_SAMPLE_INTERVAL_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDrivingSpeedSampleIntervalSeconds());
    hash = (37 * hash) + DRIVING_SPEED_SAMPLE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDrivingSpeedSampleCount();
    hash = (37 * hash) + IDLE_THRESHOLD_SPEED_METERS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIdleThresholdSpeedMetersPerSecond());
    hash = (37 * hash) + IDLE_THRESHOLD_DURATION_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getIdleThresholdDurationSeconds();
    hash = (37 * hash) + IDLE_SAMPLE_INTERVAL_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIdleSampleIntervalSeconds());
    hash = (37 * hash) + IDLE_SPEED_SAMPLE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getIdleSpeedSampleCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.GpsSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.GpsSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GpsSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GpsSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.GpsSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.GpsSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.GpsSettings)
      POGOProtos.Settings.GpsSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.GpsSettingsOuterClass.internal_static_POGOProtos_Settings_GpsSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.GpsSettingsOuterClass.internal_static_POGOProtos_Settings_GpsSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.GpsSettings.class, POGOProtos.Settings.GpsSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.GpsSettings.newBuilder()
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
      drivingWarningSpeedMetersPerSecond_ = 0F;

      drivingWarningCooldownMinutes_ = 0F;

      drivingSpeedSampleIntervalSeconds_ = 0F;

      drivingSpeedSampleCount_ = 0;

      idleThresholdSpeedMetersPerSecond_ = 0F;

      idleThresholdDurationSeconds_ = 0;

      idleSampleIntervalSeconds_ = 0F;

      idleSpeedSampleCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.GpsSettingsOuterClass.internal_static_POGOProtos_Settings_GpsSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.GpsSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.GpsSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.GpsSettings build() {
      POGOProtos.Settings.GpsSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.GpsSettings buildPartial() {
      POGOProtos.Settings.GpsSettings result = new POGOProtos.Settings.GpsSettings(this);
      result.drivingWarningSpeedMetersPerSecond_ = drivingWarningSpeedMetersPerSecond_;
      result.drivingWarningCooldownMinutes_ = drivingWarningCooldownMinutes_;
      result.drivingSpeedSampleIntervalSeconds_ = drivingSpeedSampleIntervalSeconds_;
      result.drivingSpeedSampleCount_ = drivingSpeedSampleCount_;
      result.idleThresholdSpeedMetersPerSecond_ = idleThresholdSpeedMetersPerSecond_;
      result.idleThresholdDurationSeconds_ = idleThresholdDurationSeconds_;
      result.idleSampleIntervalSeconds_ = idleSampleIntervalSeconds_;
      result.idleSpeedSampleCount_ = idleSpeedSampleCount_;
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
      if (other instanceof POGOProtos.Settings.GpsSettings) {
        return mergeFrom((POGOProtos.Settings.GpsSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.GpsSettings other) {
      if (other == POGOProtos.Settings.GpsSettings.getDefaultInstance()) return this;
      if (other.getDrivingWarningSpeedMetersPerSecond() != 0F) {
        setDrivingWarningSpeedMetersPerSecond(other.getDrivingWarningSpeedMetersPerSecond());
      }
      if (other.getDrivingWarningCooldownMinutes() != 0F) {
        setDrivingWarningCooldownMinutes(other.getDrivingWarningCooldownMinutes());
      }
      if (other.getDrivingSpeedSampleIntervalSeconds() != 0F) {
        setDrivingSpeedSampleIntervalSeconds(other.getDrivingSpeedSampleIntervalSeconds());
      }
      if (other.getDrivingSpeedSampleCount() != 0) {
        setDrivingSpeedSampleCount(other.getDrivingSpeedSampleCount());
      }
      if (other.getIdleThresholdSpeedMetersPerSecond() != 0F) {
        setIdleThresholdSpeedMetersPerSecond(other.getIdleThresholdSpeedMetersPerSecond());
      }
      if (other.getIdleThresholdDurationSeconds() != 0) {
        setIdleThresholdDurationSeconds(other.getIdleThresholdDurationSeconds());
      }
      if (other.getIdleSampleIntervalSeconds() != 0F) {
        setIdleSampleIntervalSeconds(other.getIdleSampleIntervalSeconds());
      }
      if (other.getIdleSpeedSampleCount() != 0) {
        setIdleSpeedSampleCount(other.getIdleSpeedSampleCount());
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
      POGOProtos.Settings.GpsSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.GpsSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float drivingWarningSpeedMetersPerSecond_ ;
    /**
     * <code>float driving_warning_speed_meters_per_second = 1;</code>
     * @return The drivingWarningSpeedMetersPerSecond.
     */
    public float getDrivingWarningSpeedMetersPerSecond() {
      return drivingWarningSpeedMetersPerSecond_;
    }
    /**
     * <code>float driving_warning_speed_meters_per_second = 1;</code>
     * @param value The drivingWarningSpeedMetersPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setDrivingWarningSpeedMetersPerSecond(float value) {
      
      drivingWarningSpeedMetersPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float driving_warning_speed_meters_per_second = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrivingWarningSpeedMetersPerSecond() {
      
      drivingWarningSpeedMetersPerSecond_ = 0F;
      onChanged();
      return this;
    }

    private float drivingWarningCooldownMinutes_ ;
    /**
     * <code>float driving_warning_cooldown_minutes = 2;</code>
     * @return The drivingWarningCooldownMinutes.
     */
    public float getDrivingWarningCooldownMinutes() {
      return drivingWarningCooldownMinutes_;
    }
    /**
     * <code>float driving_warning_cooldown_minutes = 2;</code>
     * @param value The drivingWarningCooldownMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setDrivingWarningCooldownMinutes(float value) {
      
      drivingWarningCooldownMinutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float driving_warning_cooldown_minutes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrivingWarningCooldownMinutes() {
      
      drivingWarningCooldownMinutes_ = 0F;
      onChanged();
      return this;
    }

    private float drivingSpeedSampleIntervalSeconds_ ;
    /**
     * <code>float driving_speed_sample_interval_seconds = 3;</code>
     * @return The drivingSpeedSampleIntervalSeconds.
     */
    public float getDrivingSpeedSampleIntervalSeconds() {
      return drivingSpeedSampleIntervalSeconds_;
    }
    /**
     * <code>float driving_speed_sample_interval_seconds = 3;</code>
     * @param value The drivingSpeedSampleIntervalSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setDrivingSpeedSampleIntervalSeconds(float value) {
      
      drivingSpeedSampleIntervalSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float driving_speed_sample_interval_seconds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrivingSpeedSampleIntervalSeconds() {
      
      drivingSpeedSampleIntervalSeconds_ = 0F;
      onChanged();
      return this;
    }

    private int drivingSpeedSampleCount_ ;
    /**
     * <code>int32 driving_speed_sample_count = 4;</code>
     * @return The drivingSpeedSampleCount.
     */
    public int getDrivingSpeedSampleCount() {
      return drivingSpeedSampleCount_;
    }
    /**
     * <code>int32 driving_speed_sample_count = 4;</code>
     * @param value The drivingSpeedSampleCount to set.
     * @return This builder for chaining.
     */
    public Builder setDrivingSpeedSampleCount(int value) {
      
      drivingSpeedSampleCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 driving_speed_sample_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrivingSpeedSampleCount() {
      
      drivingSpeedSampleCount_ = 0;
      onChanged();
      return this;
    }

    private float idleThresholdSpeedMetersPerSecond_ ;
    /**
     * <code>float idle_threshold_speed_meters_per_second = 5;</code>
     * @return The idleThresholdSpeedMetersPerSecond.
     */
    public float getIdleThresholdSpeedMetersPerSecond() {
      return idleThresholdSpeedMetersPerSecond_;
    }
    /**
     * <code>float idle_threshold_speed_meters_per_second = 5;</code>
     * @param value The idleThresholdSpeedMetersPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setIdleThresholdSpeedMetersPerSecond(float value) {
      
      idleThresholdSpeedMetersPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float idle_threshold_speed_meters_per_second = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdleThresholdSpeedMetersPerSecond() {
      
      idleThresholdSpeedMetersPerSecond_ = 0F;
      onChanged();
      return this;
    }

    private int idleThresholdDurationSeconds_ ;
    /**
     * <code>int32 idle_threshold_duration_seconds = 6;</code>
     * @return The idleThresholdDurationSeconds.
     */
    public int getIdleThresholdDurationSeconds() {
      return idleThresholdDurationSeconds_;
    }
    /**
     * <code>int32 idle_threshold_duration_seconds = 6;</code>
     * @param value The idleThresholdDurationSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setIdleThresholdDurationSeconds(int value) {
      
      idleThresholdDurationSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idle_threshold_duration_seconds = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdleThresholdDurationSeconds() {
      
      idleThresholdDurationSeconds_ = 0;
      onChanged();
      return this;
    }

    private float idleSampleIntervalSeconds_ ;
    /**
     * <code>float idle_sample_interval_seconds = 7;</code>
     * @return The idleSampleIntervalSeconds.
     */
    public float getIdleSampleIntervalSeconds() {
      return idleSampleIntervalSeconds_;
    }
    /**
     * <code>float idle_sample_interval_seconds = 7;</code>
     * @param value The idleSampleIntervalSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setIdleSampleIntervalSeconds(float value) {
      
      idleSampleIntervalSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float idle_sample_interval_seconds = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdleSampleIntervalSeconds() {
      
      idleSampleIntervalSeconds_ = 0F;
      onChanged();
      return this;
    }

    private int idleSpeedSampleCount_ ;
    /**
     * <code>int32 idle_speed_sample_count = 8;</code>
     * @return The idleSpeedSampleCount.
     */
    public int getIdleSpeedSampleCount() {
      return idleSpeedSampleCount_;
    }
    /**
     * <code>int32 idle_speed_sample_count = 8;</code>
     * @param value The idleSpeedSampleCount to set.
     * @return This builder for chaining.
     */
    public Builder setIdleSpeedSampleCount(int value) {
      
      idleSpeedSampleCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idle_speed_sample_count = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdleSpeedSampleCount() {
      
      idleSpeedSampleCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.GpsSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.GpsSettings)
  private static final POGOProtos.Settings.GpsSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.GpsSettings();
  }

  public static POGOProtos.Settings.GpsSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GpsSettings>
      PARSER = new com.google.protobuf.AbstractParser<GpsSettings>() {
    @java.lang.Override
    public GpsSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GpsSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GpsSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GpsSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.GpsSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

