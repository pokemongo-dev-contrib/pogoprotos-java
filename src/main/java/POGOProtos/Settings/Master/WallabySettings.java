// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/WallabySettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.WallabySettings}
 */
public  final class WallabySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.WallabySettings)
    WallabySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WallabySettings.newBuilder() to construct.
  private WallabySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WallabySettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WallabySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WallabySettings(
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

            enable_ = input.readBool();
            break;
          }
          case 21: {

            activityLengthS_ = input.readFloat();
            break;
          }
          case 24: {

            testMask_ = input.readUInt32();
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
    return POGOProtos.Settings.Master.WallabySettingsOuterClass.internal_static_POGOProtos_Settings_Master_WallabySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.WallabySettingsOuterClass.internal_static_POGOProtos_Settings_Master_WallabySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.WallabySettings.class, POGOProtos.Settings.Master.WallabySettings.Builder.class);
  }

  public static final int ENABLE_FIELD_NUMBER = 1;
  private boolean enable_;
  /**
   * <code>bool enable = 1;</code>
   * @return The enable.
   */
  public boolean getEnable() {
    return enable_;
  }

  public static final int ACTIVITY_LENGTH_S_FIELD_NUMBER = 2;
  private float activityLengthS_;
  /**
   * <code>float activity_length_s = 2;</code>
   * @return The activityLengthS.
   */
  public float getActivityLengthS() {
    return activityLengthS_;
  }

  public static final int TEST_MASK_FIELD_NUMBER = 3;
  private int testMask_;
  /**
   * <code>uint32 test_mask = 3;</code>
   * @return The testMask.
   */
  public int getTestMask() {
    return testMask_;
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
    if (enable_ != false) {
      output.writeBool(1, enable_);
    }
    if (activityLengthS_ != 0F) {
      output.writeFloat(2, activityLengthS_);
    }
    if (testMask_ != 0) {
      output.writeUInt32(3, testMask_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enable_);
    }
    if (activityLengthS_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, activityLengthS_);
    }
    if (testMask_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, testMask_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.WallabySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.WallabySettings other = (POGOProtos.Settings.Master.WallabySettings) obj;

    if (getEnable()
        != other.getEnable()) return false;
    if (java.lang.Float.floatToIntBits(getActivityLengthS())
        != java.lang.Float.floatToIntBits(
            other.getActivityLengthS())) return false;
    if (getTestMask()
        != other.getTestMask()) return false;
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
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnable());
    hash = (37 * hash) + ACTIVITY_LENGTH_S_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getActivityLengthS());
    hash = (37 * hash) + TEST_MASK_FIELD_NUMBER;
    hash = (53 * hash) + getTestMask();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.WallabySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.WallabySettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.WallabySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.WallabySettings)
      POGOProtos.Settings.Master.WallabySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.WallabySettingsOuterClass.internal_static_POGOProtos_Settings_Master_WallabySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.WallabySettingsOuterClass.internal_static_POGOProtos_Settings_Master_WallabySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.WallabySettings.class, POGOProtos.Settings.Master.WallabySettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.WallabySettings.newBuilder()
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
      enable_ = false;

      activityLengthS_ = 0F;

      testMask_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.WallabySettingsOuterClass.internal_static_POGOProtos_Settings_Master_WallabySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.WallabySettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.WallabySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.WallabySettings build() {
      POGOProtos.Settings.Master.WallabySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.WallabySettings buildPartial() {
      POGOProtos.Settings.Master.WallabySettings result = new POGOProtos.Settings.Master.WallabySettings(this);
      result.enable_ = enable_;
      result.activityLengthS_ = activityLengthS_;
      result.testMask_ = testMask_;
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
      if (other instanceof POGOProtos.Settings.Master.WallabySettings) {
        return mergeFrom((POGOProtos.Settings.Master.WallabySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.WallabySettings other) {
      if (other == POGOProtos.Settings.Master.WallabySettings.getDefaultInstance()) return this;
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
      }
      if (other.getActivityLengthS() != 0F) {
        setActivityLengthS(other.getActivityLengthS());
      }
      if (other.getTestMask() != 0) {
        setTestMask(other.getTestMask());
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
      POGOProtos.Settings.Master.WallabySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.WallabySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enable_ ;
    /**
     * <code>bool enable = 1;</code>
     * @return The enable.
     */
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <code>bool enable = 1;</code>
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {
      
      enable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnable() {
      
      enable_ = false;
      onChanged();
      return this;
    }

    private float activityLengthS_ ;
    /**
     * <code>float activity_length_s = 2;</code>
     * @return The activityLengthS.
     */
    public float getActivityLengthS() {
      return activityLengthS_;
    }
    /**
     * <code>float activity_length_s = 2;</code>
     * @param value The activityLengthS to set.
     * @return This builder for chaining.
     */
    public Builder setActivityLengthS(float value) {
      
      activityLengthS_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float activity_length_s = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityLengthS() {
      
      activityLengthS_ = 0F;
      onChanged();
      return this;
    }

    private int testMask_ ;
    /**
     * <code>uint32 test_mask = 3;</code>
     * @return The testMask.
     */
    public int getTestMask() {
      return testMask_;
    }
    /**
     * <code>uint32 test_mask = 3;</code>
     * @param value The testMask to set.
     * @return This builder for chaining.
     */
    public Builder setTestMask(int value) {
      
      testMask_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 test_mask = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestMask() {
      
      testMask_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.WallabySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.WallabySettings)
  private static final POGOProtos.Settings.Master.WallabySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.WallabySettings();
  }

  public static POGOProtos.Settings.Master.WallabySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WallabySettings>
      PARSER = new com.google.protobuf.AbstractParser<WallabySettings>() {
    @java.lang.Override
    public WallabySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WallabySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WallabySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WallabySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.WallabySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
