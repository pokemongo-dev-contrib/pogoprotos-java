// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/CombatChallengeGlobalSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.CombatChallengeGlobalSettings}
 */
public  final class CombatChallengeGlobalSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.CombatChallengeGlobalSettings)
    CombatChallengeGlobalSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatChallengeGlobalSettings.newBuilder() to construct.
  private CombatChallengeGlobalSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatChallengeGlobalSettings() {
    distanceCheckOverrideFriendshipLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatChallengeGlobalSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatChallengeGlobalSettings(
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

            distanceCheckOverrideFriendshipLevel_ = rawValue;
            break;
          }
          case 16: {

            getCombatChallengePollingIntervalSec_ = input.readInt32();
            break;
          }
          case 24: {

            enableDownstreamDispatch_ = input.readBool();
            break;
          }
          case 32: {

            enableChallengeNotifications_ = input.readBool();
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
    return POGOProtos.Settings.CombatChallengeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.CombatChallengeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.CombatChallengeGlobalSettings.class, POGOProtos.Settings.CombatChallengeGlobalSettings.Builder.class);
  }

  public static final int DISTANCE_CHECK_OVERRIDE_FRIENDSHIP_LEVEL_FIELD_NUMBER = 1;
  private int distanceCheckOverrideFriendshipLevel_;
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
   * @return The enum numeric value on the wire for distanceCheckOverrideFriendshipLevel.
   */
  public int getDistanceCheckOverrideFriendshipLevelValue() {
    return distanceCheckOverrideFriendshipLevel_;
  }
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
   * @return The distanceCheckOverrideFriendshipLevel.
   */
  public POGOProtos.Enums.FriendshipLevelMilestone getDistanceCheckOverrideFriendshipLevel() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.FriendshipLevelMilestone result = POGOProtos.Enums.FriendshipLevelMilestone.valueOf(distanceCheckOverrideFriendshipLevel_);
    return result == null ? POGOProtos.Enums.FriendshipLevelMilestone.UNRECOGNIZED : result;
  }

  public static final int GET_COMBAT_CHALLENGE_POLLING_INTERVAL_SEC_FIELD_NUMBER = 2;
  private int getCombatChallengePollingIntervalSec_;
  /**
   * <code>int32 get_combat_challenge_polling_interval_sec = 2;</code>
   * @return The getCombatChallengePollingIntervalSec.
   */
  public int getGetCombatChallengePollingIntervalSec() {
    return getCombatChallengePollingIntervalSec_;
  }

  public static final int ENABLE_DOWNSTREAM_DISPATCH_FIELD_NUMBER = 3;
  private boolean enableDownstreamDispatch_;
  /**
   * <code>bool enable_downstream_dispatch = 3;</code>
   * @return The enableDownstreamDispatch.
   */
  public boolean getEnableDownstreamDispatch() {
    return enableDownstreamDispatch_;
  }

  public static final int ENABLE_CHALLENGE_NOTIFICATIONS_FIELD_NUMBER = 4;
  private boolean enableChallengeNotifications_;
  /**
   * <code>bool enable_challenge_notifications = 4;</code>
   * @return The enableChallengeNotifications.
   */
  public boolean getEnableChallengeNotifications() {
    return enableChallengeNotifications_;
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
    if (distanceCheckOverrideFriendshipLevel_ != POGOProtos.Enums.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      output.writeEnum(1, distanceCheckOverrideFriendshipLevel_);
    }
    if (getCombatChallengePollingIntervalSec_ != 0) {
      output.writeInt32(2, getCombatChallengePollingIntervalSec_);
    }
    if (enableDownstreamDispatch_ != false) {
      output.writeBool(3, enableDownstreamDispatch_);
    }
    if (enableChallengeNotifications_ != false) {
      output.writeBool(4, enableChallengeNotifications_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (distanceCheckOverrideFriendshipLevel_ != POGOProtos.Enums.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, distanceCheckOverrideFriendshipLevel_);
    }
    if (getCombatChallengePollingIntervalSec_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, getCombatChallengePollingIntervalSec_);
    }
    if (enableDownstreamDispatch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableDownstreamDispatch_);
    }
    if (enableChallengeNotifications_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enableChallengeNotifications_);
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
    if (!(obj instanceof POGOProtos.Settings.CombatChallengeGlobalSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.CombatChallengeGlobalSettings other = (POGOProtos.Settings.CombatChallengeGlobalSettings) obj;

    if (distanceCheckOverrideFriendshipLevel_ != other.distanceCheckOverrideFriendshipLevel_) return false;
    if (getGetCombatChallengePollingIntervalSec()
        != other.getGetCombatChallengePollingIntervalSec()) return false;
    if (getEnableDownstreamDispatch()
        != other.getEnableDownstreamDispatch()) return false;
    if (getEnableChallengeNotifications()
        != other.getEnableChallengeNotifications()) return false;
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
    hash = (37 * hash) + DISTANCE_CHECK_OVERRIDE_FRIENDSHIP_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + distanceCheckOverrideFriendshipLevel_;
    hash = (37 * hash) + GET_COMBAT_CHALLENGE_POLLING_INTERVAL_SEC_FIELD_NUMBER;
    hash = (53 * hash) + getGetCombatChallengePollingIntervalSec();
    hash = (37 * hash) + ENABLE_DOWNSTREAM_DISPATCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableDownstreamDispatch());
    hash = (37 * hash) + ENABLE_CHALLENGE_NOTIFICATIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableChallengeNotifications());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CombatChallengeGlobalSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.CombatChallengeGlobalSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.CombatChallengeGlobalSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.CombatChallengeGlobalSettings)
      POGOProtos.Settings.CombatChallengeGlobalSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.CombatChallengeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.CombatChallengeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.CombatChallengeGlobalSettings.class, POGOProtos.Settings.CombatChallengeGlobalSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.CombatChallengeGlobalSettings.newBuilder()
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
      distanceCheckOverrideFriendshipLevel_ = 0;

      getCombatChallengePollingIntervalSec_ = 0;

      enableDownstreamDispatch_ = false;

      enableChallengeNotifications_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.CombatChallengeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.CombatChallengeGlobalSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.CombatChallengeGlobalSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.CombatChallengeGlobalSettings build() {
      POGOProtos.Settings.CombatChallengeGlobalSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.CombatChallengeGlobalSettings buildPartial() {
      POGOProtos.Settings.CombatChallengeGlobalSettings result = new POGOProtos.Settings.CombatChallengeGlobalSettings(this);
      result.distanceCheckOverrideFriendshipLevel_ = distanceCheckOverrideFriendshipLevel_;
      result.getCombatChallengePollingIntervalSec_ = getCombatChallengePollingIntervalSec_;
      result.enableDownstreamDispatch_ = enableDownstreamDispatch_;
      result.enableChallengeNotifications_ = enableChallengeNotifications_;
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
      if (other instanceof POGOProtos.Settings.CombatChallengeGlobalSettings) {
        return mergeFrom((POGOProtos.Settings.CombatChallengeGlobalSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.CombatChallengeGlobalSettings other) {
      if (other == POGOProtos.Settings.CombatChallengeGlobalSettings.getDefaultInstance()) return this;
      if (other.distanceCheckOverrideFriendshipLevel_ != 0) {
        setDistanceCheckOverrideFriendshipLevelValue(other.getDistanceCheckOverrideFriendshipLevelValue());
      }
      if (other.getGetCombatChallengePollingIntervalSec() != 0) {
        setGetCombatChallengePollingIntervalSec(other.getGetCombatChallengePollingIntervalSec());
      }
      if (other.getEnableDownstreamDispatch() != false) {
        setEnableDownstreamDispatch(other.getEnableDownstreamDispatch());
      }
      if (other.getEnableChallengeNotifications() != false) {
        setEnableChallengeNotifications(other.getEnableChallengeNotifications());
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
      POGOProtos.Settings.CombatChallengeGlobalSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.CombatChallengeGlobalSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int distanceCheckOverrideFriendshipLevel_ = 0;
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
     * @return The enum numeric value on the wire for distanceCheckOverrideFriendshipLevel.
     */
    public int getDistanceCheckOverrideFriendshipLevelValue() {
      return distanceCheckOverrideFriendshipLevel_;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
     * @param value The enum numeric value on the wire for distanceCheckOverrideFriendshipLevel to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceCheckOverrideFriendshipLevelValue(int value) {
      distanceCheckOverrideFriendshipLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
     * @return The distanceCheckOverrideFriendshipLevel.
     */
    public POGOProtos.Enums.FriendshipLevelMilestone getDistanceCheckOverrideFriendshipLevel() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.FriendshipLevelMilestone result = POGOProtos.Enums.FriendshipLevelMilestone.valueOf(distanceCheckOverrideFriendshipLevel_);
      return result == null ? POGOProtos.Enums.FriendshipLevelMilestone.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
     * @param value The distanceCheckOverrideFriendshipLevel to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceCheckOverrideFriendshipLevel(POGOProtos.Enums.FriendshipLevelMilestone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      distanceCheckOverrideFriendshipLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceCheckOverrideFriendshipLevel() {
      
      distanceCheckOverrideFriendshipLevel_ = 0;
      onChanged();
      return this;
    }

    private int getCombatChallengePollingIntervalSec_ ;
    /**
     * <code>int32 get_combat_challenge_polling_interval_sec = 2;</code>
     * @return The getCombatChallengePollingIntervalSec.
     */
    public int getGetCombatChallengePollingIntervalSec() {
      return getCombatChallengePollingIntervalSec_;
    }
    /**
     * <code>int32 get_combat_challenge_polling_interval_sec = 2;</code>
     * @param value The getCombatChallengePollingIntervalSec to set.
     * @return This builder for chaining.
     */
    public Builder setGetCombatChallengePollingIntervalSec(int value) {
      
      getCombatChallengePollingIntervalSec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 get_combat_challenge_polling_interval_sec = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGetCombatChallengePollingIntervalSec() {
      
      getCombatChallengePollingIntervalSec_ = 0;
      onChanged();
      return this;
    }

    private boolean enableDownstreamDispatch_ ;
    /**
     * <code>bool enable_downstream_dispatch = 3;</code>
     * @return The enableDownstreamDispatch.
     */
    public boolean getEnableDownstreamDispatch() {
      return enableDownstreamDispatch_;
    }
    /**
     * <code>bool enable_downstream_dispatch = 3;</code>
     * @param value The enableDownstreamDispatch to set.
     * @return This builder for chaining.
     */
    public Builder setEnableDownstreamDispatch(boolean value) {
      
      enableDownstreamDispatch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_downstream_dispatch = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableDownstreamDispatch() {
      
      enableDownstreamDispatch_ = false;
      onChanged();
      return this;
    }

    private boolean enableChallengeNotifications_ ;
    /**
     * <code>bool enable_challenge_notifications = 4;</code>
     * @return The enableChallengeNotifications.
     */
    public boolean getEnableChallengeNotifications() {
      return enableChallengeNotifications_;
    }
    /**
     * <code>bool enable_challenge_notifications = 4;</code>
     * @param value The enableChallengeNotifications to set.
     * @return This builder for chaining.
     */
    public Builder setEnableChallengeNotifications(boolean value) {
      
      enableChallengeNotifications_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_challenge_notifications = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableChallengeNotifications() {
      
      enableChallengeNotifications_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.CombatChallengeGlobalSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.CombatChallengeGlobalSettings)
  private static final POGOProtos.Settings.CombatChallengeGlobalSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.CombatChallengeGlobalSettings();
  }

  public static POGOProtos.Settings.CombatChallengeGlobalSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatChallengeGlobalSettings>
      PARSER = new com.google.protobuf.AbstractParser<CombatChallengeGlobalSettings>() {
    @java.lang.Override
    public CombatChallengeGlobalSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatChallengeGlobalSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatChallengeGlobalSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatChallengeGlobalSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.CombatChallengeGlobalSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
