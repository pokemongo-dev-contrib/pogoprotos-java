// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.SocialSettings
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PlatformSocialSettings}
 */
public  final class PlatformSocialSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformSocialSettings)
    PlatformSocialSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformSocialSettings.newBuilder() to construct.
  private PlatformSocialSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformSocialSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformSocialSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformSocialSettings(
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformSocialSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformSocialSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformSocialSettings.class, POGOProtos.Rpc.PlatformSocialSettings.Builder.class);
  }

  /**
   * <pre>
   * ref: Niantic.Platform.Protos.SocialSettings/Types/ConsentStatus
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus}
   */
  public enum ConsentStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CONSENTSTATUS_UNKNOWN = 0;</code>
     */
    CONSENTSTATUS_UNKNOWN(0),
    /**
     * <code>CONSENTSTATUS_OPT_IN = 1;</code>
     */
    CONSENTSTATUS_OPT_IN(1),
    /**
     * <code>CONSENTSTATUS_OPT_OUT = 2;</code>
     */
    CONSENTSTATUS_OPT_OUT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CONSENTSTATUS_UNKNOWN = 0;</code>
     */
    public static final int CONSENTSTATUS_UNKNOWN_VALUE = 0;
    /**
     * <code>CONSENTSTATUS_OPT_IN = 1;</code>
     */
    public static final int CONSENTSTATUS_OPT_IN_VALUE = 1;
    /**
     * <code>CONSENTSTATUS_OPT_OUT = 2;</code>
     */
    public static final int CONSENTSTATUS_OPT_OUT_VALUE = 2;


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
    public static ConsentStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConsentStatus forNumber(int value) {
      switch (value) {
        case 0: return CONSENTSTATUS_UNKNOWN;
        case 1: return CONSENTSTATUS_OPT_IN;
        case 2: return CONSENTSTATUS_OPT_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConsentStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConsentStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConsentStatus>() {
            public ConsentStatus findValueByNumber(int number) {
              return ConsentStatus.forNumber(number);
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
      return POGOProtos.Rpc.PlatformSocialSettings.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConsentStatus[] VALUES = values();

    public static ConsentStatus valueOf(
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

    private ConsentStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus)
  }

  /**
   * <pre>
   * ref: Niantic.Platform.Protos.SocialSettings/Types/TutorialType
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PlatformSocialSettings.TutorialType}
   */
  public enum TutorialType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TUTORIALTYPE_UNSET = 0;</code>
     */
    TUTORIALTYPE_UNSET(0),
    /**
     * <code>TUTORIALTYPE_PROFILE = 1;</code>
     */
    TUTORIALTYPE_PROFILE(1),
    /**
     * <code>TUTORIALTYPE_FRIEND_LIST_V2 = 2;</code>
     */
    TUTORIALTYPE_FRIEND_LIST_V2(2),
    /**
     * <code>TUTORIALTYPE_ONLINE_STATUS_OVERVIEW = 3;</code>
     */
    TUTORIALTYPE_ONLINE_STATUS_OVERVIEW(3),
    /**
     * <code>TUTORIALTYPE_ONLINE_STATUS_TOGGLE = 4;</code>
     */
    TUTORIALTYPE_ONLINE_STATUS_TOGGLE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>TUTORIALTYPE_UNSET = 0;</code>
     */
    public static final int TUTORIALTYPE_UNSET_VALUE = 0;
    /**
     * <code>TUTORIALTYPE_PROFILE = 1;</code>
     */
    public static final int TUTORIALTYPE_PROFILE_VALUE = 1;
    /**
     * <code>TUTORIALTYPE_FRIEND_LIST_V2 = 2;</code>
     */
    public static final int TUTORIALTYPE_FRIEND_LIST_V2_VALUE = 2;
    /**
     * <code>TUTORIALTYPE_ONLINE_STATUS_OVERVIEW = 3;</code>
     */
    public static final int TUTORIALTYPE_ONLINE_STATUS_OVERVIEW_VALUE = 3;
    /**
     * <code>TUTORIALTYPE_ONLINE_STATUS_TOGGLE = 4;</code>
     */
    public static final int TUTORIALTYPE_ONLINE_STATUS_TOGGLE_VALUE = 4;


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
    public static TutorialType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TutorialType forNumber(int value) {
      switch (value) {
        case 0: return TUTORIALTYPE_UNSET;
        case 1: return TUTORIALTYPE_PROFILE;
        case 2: return TUTORIALTYPE_FRIEND_LIST_V2;
        case 3: return TUTORIALTYPE_ONLINE_STATUS_OVERVIEW;
        case 4: return TUTORIALTYPE_ONLINE_STATUS_TOGGLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TutorialType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TutorialType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TutorialType>() {
            public TutorialType findValueByNumber(int number) {
              return TutorialType.forNumber(number);
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
      return POGOProtos.Rpc.PlatformSocialSettings.getDescriptor().getEnumTypes().get(1);
    }

    private static final TutorialType[] VALUES = values();

    public static TutorialType valueOf(
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

    private TutorialType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformSocialSettings.TutorialType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.PlatformSocialSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformSocialSettings other = (POGOProtos.Rpc.PlatformSocialSettings) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformSocialSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformSocialSettings prototype) {
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
   * ref: Niantic.Platform.Protos.SocialSettings
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PlatformSocialSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformSocialSettings)
      POGOProtos.Rpc.PlatformSocialSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformSocialSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformSocialSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformSocialSettings.class, POGOProtos.Rpc.PlatformSocialSettings.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformSocialSettings.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformSocialSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformSocialSettings getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformSocialSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformSocialSettings build() {
      POGOProtos.Rpc.PlatformSocialSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformSocialSettings buildPartial() {
      POGOProtos.Rpc.PlatformSocialSettings result = new POGOProtos.Rpc.PlatformSocialSettings(this);
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
      if (other instanceof POGOProtos.Rpc.PlatformSocialSettings) {
        return mergeFrom((POGOProtos.Rpc.PlatformSocialSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformSocialSettings other) {
      if (other == POGOProtos.Rpc.PlatformSocialSettings.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.PlatformSocialSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformSocialSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformSocialSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformSocialSettings)
  private static final POGOProtos.Rpc.PlatformSocialSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformSocialSettings();
  }

  public static POGOProtos.Rpc.PlatformSocialSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformSocialSettings>
      PARSER = new com.google.protobuf.AbstractParser<PlatformSocialSettings>() {
    @java.lang.Override
    public PlatformSocialSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformSocialSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformSocialSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformSocialSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformSocialSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

