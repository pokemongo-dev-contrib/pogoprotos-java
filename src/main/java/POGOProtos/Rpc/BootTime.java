// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KGDMAGOFKCE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BootTime}
 */
public final class BootTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BootTime)
    BootTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BootTime.newBuilder() to construct.
  private BootTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BootTime() {
    bootPhase_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BootTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BootTime(
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
            POGOProtos.Rpc.PlatformMetricData.Builder subBuilder = null;
            if (duration_ != null) {
              subBuilder = duration_.toBuilder();
            }
            duration_ = input.readMessage(POGOProtos.Rpc.PlatformMetricData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(duration_);
              duration_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            bootPhase_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BootTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BootTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BootTime.class, POGOProtos.Rpc.BootTime.Builder.class);
  }

  /**
   * <pre>
   * ref: KGDMAGOFKCE/FHPOAMLOAJG/CLIIACAJEIG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.BootTime.BootPhase}
   */
  public enum BootPhase
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0),
    /**
     * <code>TIME_TO_MAP = 1;</code>
     */
    TIME_TO_MAP(1),
    /**
     * <code>LOGO_SCREEN_TIME = 2;</code>
     */
    LOGO_SCREEN_TIME(2),
    /**
     * <code>MAIN_SCENE_LOAD_TIME = 3;</code>
     */
    MAIN_SCENE_LOAD_TIME(3),
    /**
     * <code>WAIT_FOR_AUTH = 4;</code>
     */
    WAIT_FOR_AUTH(4),
    /**
     * <code>INIT_REMOTE_CONFIG_VERSIONS = 5;</code>
     */
    INIT_REMOTE_CONFIG_VERSIONS(5),
    /**
     * <code>INIT_BUNDLE_DIGEST = 6;</code>
     */
    INIT_BUNDLE_DIGEST(6),
    /**
     * <code>INIT_GMT = 7;</code>
     */
    INIT_GMT(7),
    /**
     * <code>DOWNLOAD_I18N = 8;</code>
     */
    DOWNLOAD_I18N(8),
    /**
     * <code>DOWNLOAD_GLOBAL_ASSETS = 9;</code>
     */
    DOWNLOAD_GLOBAL_ASSETS(9),
    /**
     * <code>REGISTER_PUSH_NOTIFICATION = 10;</code>
     */
    REGISTER_PUSH_NOTIFICATION(10),
    /**
     * <code>INITIALIZE_UPSIGHT = 11;</code>
     */
    INITIALIZE_UPSIGHT(11),
    /**
     * <code>INITIALIZE_CRITTERCISM = 12;</code>
     */
    INITIALIZE_CRITTERCISM(12),
    /**
     * <code>LOGIN_VERSION_CHECK = 13;</code>
     */
    LOGIN_VERSION_CHECK(13),
    /**
     * <code>LOGIN_GET_PLAYER = 14;</code>
     */
    LOGIN_GET_PLAYER(14),
    /**
     * <code>LOGIN_AUTHENTICATION = 15;</code>
     */
    LOGIN_AUTHENTICATION(15),
    /**
     * <code>MODAL_TIME = 16;</code>
     */
    MODAL_TIME(16),
    /**
     * <code>INITIALIZE_ADJUST = 17;</code>
     */
    INITIALIZE_ADJUST(17),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <code>TIME_TO_MAP = 1;</code>
     */
    public static final int TIME_TO_MAP_VALUE = 1;
    /**
     * <code>LOGO_SCREEN_TIME = 2;</code>
     */
    public static final int LOGO_SCREEN_TIME_VALUE = 2;
    /**
     * <code>MAIN_SCENE_LOAD_TIME = 3;</code>
     */
    public static final int MAIN_SCENE_LOAD_TIME_VALUE = 3;
    /**
     * <code>WAIT_FOR_AUTH = 4;</code>
     */
    public static final int WAIT_FOR_AUTH_VALUE = 4;
    /**
     * <code>INIT_REMOTE_CONFIG_VERSIONS = 5;</code>
     */
    public static final int INIT_REMOTE_CONFIG_VERSIONS_VALUE = 5;
    /**
     * <code>INIT_BUNDLE_DIGEST = 6;</code>
     */
    public static final int INIT_BUNDLE_DIGEST_VALUE = 6;
    /**
     * <code>INIT_GMT = 7;</code>
     */
    public static final int INIT_GMT_VALUE = 7;
    /**
     * <code>DOWNLOAD_I18N = 8;</code>
     */
    public static final int DOWNLOAD_I18N_VALUE = 8;
    /**
     * <code>DOWNLOAD_GLOBAL_ASSETS = 9;</code>
     */
    public static final int DOWNLOAD_GLOBAL_ASSETS_VALUE = 9;
    /**
     * <code>REGISTER_PUSH_NOTIFICATION = 10;</code>
     */
    public static final int REGISTER_PUSH_NOTIFICATION_VALUE = 10;
    /**
     * <code>INITIALIZE_UPSIGHT = 11;</code>
     */
    public static final int INITIALIZE_UPSIGHT_VALUE = 11;
    /**
     * <code>INITIALIZE_CRITTERCISM = 12;</code>
     */
    public static final int INITIALIZE_CRITTERCISM_VALUE = 12;
    /**
     * <code>LOGIN_VERSION_CHECK = 13;</code>
     */
    public static final int LOGIN_VERSION_CHECK_VALUE = 13;
    /**
     * <code>LOGIN_GET_PLAYER = 14;</code>
     */
    public static final int LOGIN_GET_PLAYER_VALUE = 14;
    /**
     * <code>LOGIN_AUTHENTICATION = 15;</code>
     */
    public static final int LOGIN_AUTHENTICATION_VALUE = 15;
    /**
     * <code>MODAL_TIME = 16;</code>
     */
    public static final int MODAL_TIME_VALUE = 16;
    /**
     * <code>INITIALIZE_ADJUST = 17;</code>
     */
    public static final int INITIALIZE_ADJUST_VALUE = 17;


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
    public static BootPhase valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BootPhase forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return TIME_TO_MAP;
        case 2: return LOGO_SCREEN_TIME;
        case 3: return MAIN_SCENE_LOAD_TIME;
        case 4: return WAIT_FOR_AUTH;
        case 5: return INIT_REMOTE_CONFIG_VERSIONS;
        case 6: return INIT_BUNDLE_DIGEST;
        case 7: return INIT_GMT;
        case 8: return DOWNLOAD_I18N;
        case 9: return DOWNLOAD_GLOBAL_ASSETS;
        case 10: return REGISTER_PUSH_NOTIFICATION;
        case 11: return INITIALIZE_UPSIGHT;
        case 12: return INITIALIZE_CRITTERCISM;
        case 13: return LOGIN_VERSION_CHECK;
        case 14: return LOGIN_GET_PLAYER;
        case 15: return LOGIN_AUTHENTICATION;
        case 16: return MODAL_TIME;
        case 17: return INITIALIZE_ADJUST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BootPhase>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BootPhase> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BootPhase>() {
            public BootPhase findValueByNumber(int number) {
              return BootPhase.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.BootTime.getDescriptor().getEnumTypes().get(0);
    }

    private static final BootPhase[] VALUES = values();

    public static BootPhase valueOf(
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

    private BootPhase(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BootTime.BootPhase)
  }

  public static final int DURATION_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PlatformMetricData duration_;
  /**
   * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
   * @return The duration.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformMetricData getDuration() {
    return duration_ == null ? POGOProtos.Rpc.PlatformMetricData.getDefaultInstance() : duration_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformMetricDataOrBuilder getDurationOrBuilder() {
    return getDuration();
  }

  public static final int BOOT_PHASE_FIELD_NUMBER = 2;
  private int bootPhase_;
  /**
   * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
   * @return The enum numeric value on the wire for bootPhase.
   */
  @java.lang.Override public int getBootPhaseValue() {
    return bootPhase_;
  }
  /**
   * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
   * @return The bootPhase.
   */
  @java.lang.Override public POGOProtos.Rpc.BootTime.BootPhase getBootPhase() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BootTime.BootPhase result = POGOProtos.Rpc.BootTime.BootPhase.valueOf(bootPhase_);
    return result == null ? POGOProtos.Rpc.BootTime.BootPhase.UNRECOGNIZED : result;
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
    if (duration_ != null) {
      output.writeMessage(1, getDuration());
    }
    if (bootPhase_ != POGOProtos.Rpc.BootTime.BootPhase.UNDEFINED.getNumber()) {
      output.writeEnum(2, bootPhase_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDuration());
    }
    if (bootPhase_ != POGOProtos.Rpc.BootTime.BootPhase.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, bootPhase_);
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
    if (!(obj instanceof POGOProtos.Rpc.BootTime)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BootTime other = (POGOProtos.Rpc.BootTime) obj;

    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
    }
    if (bootPhase_ != other.bootPhase_) return false;
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
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (37 * hash) + BOOT_PHASE_FIELD_NUMBER;
    hash = (53 * hash) + bootPhase_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BootTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BootTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BootTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BootTime parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BootTime prototype) {
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
   * ref: KGDMAGOFKCE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BootTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BootTime)
      POGOProtos.Rpc.BootTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BootTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BootTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BootTime.class, POGOProtos.Rpc.BootTime.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BootTime.newBuilder()
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
      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      bootPhase_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BootTime_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BootTime getDefaultInstanceForType() {
      return POGOProtos.Rpc.BootTime.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BootTime build() {
      POGOProtos.Rpc.BootTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BootTime buildPartial() {
      POGOProtos.Rpc.BootTime result = new POGOProtos.Rpc.BootTime(this);
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
      }
      result.bootPhase_ = bootPhase_;
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
      if (other instanceof POGOProtos.Rpc.BootTime) {
        return mergeFrom((POGOProtos.Rpc.BootTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BootTime other) {
      if (other == POGOProtos.Rpc.BootTime.getDefaultInstance()) return this;
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
      }
      if (other.bootPhase_ != 0) {
        setBootPhaseValue(other.getBootPhaseValue());
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
      POGOProtos.Rpc.BootTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BootTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PlatformMetricData duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformMetricData, POGOProtos.Rpc.PlatformMetricData.Builder, POGOProtos.Rpc.PlatformMetricDataOrBuilder> durationBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     * @return The duration.
     */
    public POGOProtos.Rpc.PlatformMetricData getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? POGOProtos.Rpc.PlatformMetricData.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public Builder setDuration(POGOProtos.Rpc.PlatformMetricData value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public Builder setDuration(
        POGOProtos.Rpc.PlatformMetricData.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public Builder mergeDuration(POGOProtos.Rpc.PlatformMetricData value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
            POGOProtos.Rpc.PlatformMetricData.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMetricData.Builder getDurationBuilder() {
      
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    public POGOProtos.Rpc.PlatformMetricDataOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            POGOProtos.Rpc.PlatformMetricData.getDefaultInstance() : duration_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformMetricData, POGOProtos.Rpc.PlatformMetricData.Builder, POGOProtos.Rpc.PlatformMetricDataOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformMetricData, POGOProtos.Rpc.PlatformMetricData.Builder, POGOProtos.Rpc.PlatformMetricDataOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }

    private int bootPhase_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
     * @return The enum numeric value on the wire for bootPhase.
     */
    @java.lang.Override public int getBootPhaseValue() {
      return bootPhase_;
    }
    /**
     * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
     * @param value The enum numeric value on the wire for bootPhase to set.
     * @return This builder for chaining.
     */
    public Builder setBootPhaseValue(int value) {
      
      bootPhase_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
     * @return The bootPhase.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BootTime.BootPhase getBootPhase() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BootTime.BootPhase result = POGOProtos.Rpc.BootTime.BootPhase.valueOf(bootPhase_);
      return result == null ? POGOProtos.Rpc.BootTime.BootPhase.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
     * @param value The bootPhase to set.
     * @return This builder for chaining.
     */
    public Builder setBootPhase(POGOProtos.Rpc.BootTime.BootPhase value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bootPhase_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BootTime.BootPhase boot_phase = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBootPhase() {
      
      bootPhase_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BootTime)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BootTime)
  private static final POGOProtos.Rpc.BootTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BootTime();
  }

  public static POGOProtos.Rpc.BootTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BootTime>
      PARSER = new com.google.protobuf.AbstractParser<BootTime>() {
    @java.lang.Override
    public BootTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BootTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BootTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BootTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BootTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

