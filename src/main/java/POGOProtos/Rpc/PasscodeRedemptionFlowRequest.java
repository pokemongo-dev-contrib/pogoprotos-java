// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PasscodeRedemptionFlowRequest}
 */
public  final class PasscodeRedemptionFlowRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PasscodeRedemptionFlowRequest)
    PasscodeRedemptionFlowRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PasscodeRedemptionFlowRequest.newBuilder() to construct.
  private PasscodeRedemptionFlowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PasscodeRedemptionFlowRequest() {
    passcode_ = "";
    poiGuid_ = "";
    devicePlatform_ = 0;
    carrier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PasscodeRedemptionFlowRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PasscodeRedemptionFlowRequest(
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

            passcode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            poiGuid_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            devicePlatform_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            carrier_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeRedemptionFlowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeRedemptionFlowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PasscodeRedemptionFlowRequest.class, POGOProtos.Rpc.PasscodeRedemptionFlowRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform}
   */
  public enum DevicePlatform
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLATFORM_UNKNOWN = 0;</code>
     */
    PLATFORM_UNKNOWN(0),
    /**
     * <code>PLATFORM_ANDROID = 1;</code>
     */
    PLATFORM_ANDROID(1),
    /**
     * <code>PLATFORM_IOS = 2;</code>
     */
    PLATFORM_IOS(2),
    /**
     * <code>PLATFORM_WEB = 3;</code>
     */
    PLATFORM_WEB(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLATFORM_UNKNOWN = 0;</code>
     */
    public static final int PLATFORM_UNKNOWN_VALUE = 0;
    /**
     * <code>PLATFORM_ANDROID = 1;</code>
     */
    public static final int PLATFORM_ANDROID_VALUE = 1;
    /**
     * <code>PLATFORM_IOS = 2;</code>
     */
    public static final int PLATFORM_IOS_VALUE = 2;
    /**
     * <code>PLATFORM_WEB = 3;</code>
     */
    public static final int PLATFORM_WEB_VALUE = 3;


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
    public static DevicePlatform valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DevicePlatform forNumber(int value) {
      switch (value) {
        case 0: return PLATFORM_UNKNOWN;
        case 1: return PLATFORM_ANDROID;
        case 2: return PLATFORM_IOS;
        case 3: return PLATFORM_WEB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DevicePlatform>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DevicePlatform> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DevicePlatform>() {
            public DevicePlatform findValueByNumber(int number) {
              return DevicePlatform.forNumber(number);
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
      return POGOProtos.Rpc.PasscodeRedemptionFlowRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final DevicePlatform[] VALUES = values();

    public static DevicePlatform valueOf(
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

    private DevicePlatform(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform)
  }

  public static final int PASSCODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object passcode_;
  /**
   * <code>string passcode = 1;</code>
   * @return The passcode.
   */
  public java.lang.String getPasscode() {
    java.lang.Object ref = passcode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      passcode_ = s;
      return s;
    }
  }
  /**
   * <code>string passcode = 1;</code>
   * @return The bytes for passcode.
   */
  public com.google.protobuf.ByteString
      getPasscodeBytes() {
    java.lang.Object ref = passcode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      passcode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POI_GUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object poiGuid_;
  /**
   * <code>string poi_guid = 2;</code>
   * @return The poiGuid.
   */
  public java.lang.String getPoiGuid() {
    java.lang.Object ref = poiGuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiGuid_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_guid = 2;</code>
   * @return The bytes for poiGuid.
   */
  public com.google.protobuf.ByteString
      getPoiGuidBytes() {
    java.lang.Object ref = poiGuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiGuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_PLATFORM_FIELD_NUMBER = 3;
  private int devicePlatform_;
  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
   * @return The enum numeric value on the wire for devicePlatform.
   */
  public int getDevicePlatformValue() {
    return devicePlatform_;
  }
  /**
   * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
   * @return The devicePlatform.
   */
  public POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform getDevicePlatform() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform result = POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.valueOf(devicePlatform_);
    return result == null ? POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.UNRECOGNIZED : result;
  }

  public static final int CARRIER_FIELD_NUMBER = 4;
  private volatile java.lang.Object carrier_;
  /**
   * <code>string carrier = 4;</code>
   * @return The carrier.
   */
  public java.lang.String getCarrier() {
    java.lang.Object ref = carrier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      carrier_ = s;
      return s;
    }
  }
  /**
   * <code>string carrier = 4;</code>
   * @return The bytes for carrier.
   */
  public com.google.protobuf.ByteString
      getCarrierBytes() {
    java.lang.Object ref = carrier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      carrier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getPasscodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, passcode_);
    }
    if (!getPoiGuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, poiGuid_);
    }
    if (devicePlatform_ != POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.PLATFORM_UNKNOWN.getNumber()) {
      output.writeEnum(3, devicePlatform_);
    }
    if (!getCarrierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, carrier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPasscodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, passcode_);
    }
    if (!getPoiGuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, poiGuid_);
    }
    if (devicePlatform_ != POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.PLATFORM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, devicePlatform_);
    }
    if (!getCarrierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, carrier_);
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
    if (!(obj instanceof POGOProtos.Rpc.PasscodeRedemptionFlowRequest)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PasscodeRedemptionFlowRequest other = (POGOProtos.Rpc.PasscodeRedemptionFlowRequest) obj;

    if (!getPasscode()
        .equals(other.getPasscode())) return false;
    if (!getPoiGuid()
        .equals(other.getPoiGuid())) return false;
    if (devicePlatform_ != other.devicePlatform_) return false;
    if (!getCarrier()
        .equals(other.getCarrier())) return false;
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
    hash = (37 * hash) + PASSCODE_FIELD_NUMBER;
    hash = (53 * hash) + getPasscode().hashCode();
    hash = (37 * hash) + POI_GUID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiGuid().hashCode();
    hash = (37 * hash) + DEVICE_PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + devicePlatform_;
    hash = (37 * hash) + CARRIER_FIELD_NUMBER;
    hash = (53 * hash) + getCarrier().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PasscodeRedemptionFlowRequest prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PasscodeRedemptionFlowRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PasscodeRedemptionFlowRequest)
      POGOProtos.Rpc.PasscodeRedemptionFlowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeRedemptionFlowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeRedemptionFlowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PasscodeRedemptionFlowRequest.class, POGOProtos.Rpc.PasscodeRedemptionFlowRequest.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PasscodeRedemptionFlowRequest.newBuilder()
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
      passcode_ = "";

      poiGuid_ = "";

      devicePlatform_ = 0;

      carrier_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeRedemptionFlowRequest_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeRedemptionFlowRequest getDefaultInstanceForType() {
      return POGOProtos.Rpc.PasscodeRedemptionFlowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeRedemptionFlowRequest build() {
      POGOProtos.Rpc.PasscodeRedemptionFlowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeRedemptionFlowRequest buildPartial() {
      POGOProtos.Rpc.PasscodeRedemptionFlowRequest result = new POGOProtos.Rpc.PasscodeRedemptionFlowRequest(this);
      result.passcode_ = passcode_;
      result.poiGuid_ = poiGuid_;
      result.devicePlatform_ = devicePlatform_;
      result.carrier_ = carrier_;
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
      if (other instanceof POGOProtos.Rpc.PasscodeRedemptionFlowRequest) {
        return mergeFrom((POGOProtos.Rpc.PasscodeRedemptionFlowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PasscodeRedemptionFlowRequest other) {
      if (other == POGOProtos.Rpc.PasscodeRedemptionFlowRequest.getDefaultInstance()) return this;
      if (!other.getPasscode().isEmpty()) {
        passcode_ = other.passcode_;
        onChanged();
      }
      if (!other.getPoiGuid().isEmpty()) {
        poiGuid_ = other.poiGuid_;
        onChanged();
      }
      if (other.devicePlatform_ != 0) {
        setDevicePlatformValue(other.getDevicePlatformValue());
      }
      if (!other.getCarrier().isEmpty()) {
        carrier_ = other.carrier_;
        onChanged();
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
      POGOProtos.Rpc.PasscodeRedemptionFlowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PasscodeRedemptionFlowRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object passcode_ = "";
    /**
     * <code>string passcode = 1;</code>
     * @return The passcode.
     */
    public java.lang.String getPasscode() {
      java.lang.Object ref = passcode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        passcode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string passcode = 1;</code>
     * @return The bytes for passcode.
     */
    public com.google.protobuf.ByteString
        getPasscodeBytes() {
      java.lang.Object ref = passcode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        passcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string passcode = 1;</code>
     * @param value The passcode to set.
     * @return This builder for chaining.
     */
    public Builder setPasscode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      passcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string passcode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPasscode() {
      
      passcode_ = getDefaultInstance().getPasscode();
      onChanged();
      return this;
    }
    /**
     * <code>string passcode = 1;</code>
     * @param value The bytes for passcode to set.
     * @return This builder for chaining.
     */
    public Builder setPasscodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      passcode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object poiGuid_ = "";
    /**
     * <code>string poi_guid = 2;</code>
     * @return The poiGuid.
     */
    public java.lang.String getPoiGuid() {
      java.lang.Object ref = poiGuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiGuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_guid = 2;</code>
     * @return The bytes for poiGuid.
     */
    public com.google.protobuf.ByteString
        getPoiGuidBytes() {
      java.lang.Object ref = poiGuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiGuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_guid = 2;</code>
     * @param value The poiGuid to set.
     * @return This builder for chaining.
     */
    public Builder setPoiGuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_guid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiGuid() {
      
      poiGuid_ = getDefaultInstance().getPoiGuid();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_guid = 2;</code>
     * @param value The bytes for poiGuid to set.
     * @return This builder for chaining.
     */
    public Builder setPoiGuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiGuid_ = value;
      onChanged();
      return this;
    }

    private int devicePlatform_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
     * @return The enum numeric value on the wire for devicePlatform.
     */
    public int getDevicePlatformValue() {
      return devicePlatform_;
    }
    /**
     * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
     * @param value The enum numeric value on the wire for devicePlatform to set.
     * @return This builder for chaining.
     */
    public Builder setDevicePlatformValue(int value) {
      devicePlatform_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
     * @return The devicePlatform.
     */
    public POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform getDevicePlatform() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform result = POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.valueOf(devicePlatform_);
      return result == null ? POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
     * @param value The devicePlatform to set.
     * @return This builder for chaining.
     */
    public Builder setDevicePlatform(POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      devicePlatform_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PasscodeRedemptionFlowRequest.DevicePlatform device_platform = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevicePlatform() {
      
      devicePlatform_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object carrier_ = "";
    /**
     * <code>string carrier = 4;</code>
     * @return The carrier.
     */
    public java.lang.String getCarrier() {
      java.lang.Object ref = carrier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        carrier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string carrier = 4;</code>
     * @return The bytes for carrier.
     */
    public com.google.protobuf.ByteString
        getCarrierBytes() {
      java.lang.Object ref = carrier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        carrier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string carrier = 4;</code>
     * @param value The carrier to set.
     * @return This builder for chaining.
     */
    public Builder setCarrier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      carrier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string carrier = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCarrier() {
      
      carrier_ = getDefaultInstance().getCarrier();
      onChanged();
      return this;
    }
    /**
     * <code>string carrier = 4;</code>
     * @param value The bytes for carrier to set.
     * @return This builder for chaining.
     */
    public Builder setCarrierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      carrier_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PasscodeRedemptionFlowRequest)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PasscodeRedemptionFlowRequest)
  private static final POGOProtos.Rpc.PasscodeRedemptionFlowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PasscodeRedemptionFlowRequest();
  }

  public static POGOProtos.Rpc.PasscodeRedemptionFlowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PasscodeRedemptionFlowRequest>
      PARSER = new com.google.protobuf.AbstractParser<PasscodeRedemptionFlowRequest>() {
    @java.lang.Override
    public PasscodeRedemptionFlowRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PasscodeRedemptionFlowRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PasscodeRedemptionFlowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PasscodeRedemptionFlowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PasscodeRedemptionFlowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
