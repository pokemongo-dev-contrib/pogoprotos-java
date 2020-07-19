// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Rocket/RocketBalloonIncidentDisplay.proto

package POGOProtos.Data.Rocket;

/**
 * Protobuf type {@code POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay}
 */
public  final class RocketBalloonIncidentDisplay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)
    RocketBalloonIncidentDisplayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RocketBalloonIncidentDisplay.newBuilder() to construct.
  private RocketBalloonIncidentDisplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RocketBalloonIncidentDisplay() {
    incidentId_ = "";
    incidentDisplayType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RocketBalloonIncidentDisplay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RocketBalloonIncidentDisplay(
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

            incidentId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            incidentDisplayType_ = rawValue;
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
    return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonIncidentDisplay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonIncidentDisplay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.class, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder.class);
  }

  public static final int INCIDENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object incidentId_;
  /**
   * <code>string incident_id = 1;</code>
   * @return The incidentId.
   */
  public java.lang.String getIncidentId() {
    java.lang.Object ref = incidentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      incidentId_ = s;
      return s;
    }
  }
  /**
   * <code>string incident_id = 1;</code>
   * @return The bytes for incidentId.
   */
  public com.google.protobuf.ByteString
      getIncidentIdBytes() {
    java.lang.Object ref = incidentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      incidentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCIDENT_DISPLAY_TYPE_FIELD_NUMBER = 2;
  private int incidentDisplayType_;
  /**
   * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
   * @return The enum numeric value on the wire for incidentDisplayType.
   */
  public int getIncidentDisplayTypeValue() {
    return incidentDisplayType_;
  }
  /**
   * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
   * @return The incidentDisplayType.
   */
  public POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType getIncidentDisplayType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType result = POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.valueOf(incidentDisplayType_);
    return result == null ? POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.UNRECOGNIZED : result;
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
    if (!getIncidentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, incidentId_);
    }
    if (incidentDisplayType_ != POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.NONE.getNumber()) {
      output.writeEnum(2, incidentDisplayType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIncidentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, incidentId_);
    }
    if (incidentDisplayType_ != POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, incidentDisplayType_);
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
    if (!(obj instanceof POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay other = (POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay) obj;

    if (!getIncidentId()
        .equals(other.getIncidentId())) return false;
    if (incidentDisplayType_ != other.incidentDisplayType_) return false;
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
    hash = (37 * hash) + INCIDENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIncidentId().hashCode();
    hash = (37 * hash) + INCIDENT_DISPLAY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + incidentDisplayType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)
      POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonIncidentDisplay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonIncidentDisplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.class, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder.class);
    }

    // Construct using POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.newBuilder()
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
      incidentId_ = "";

      incidentDisplayType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonIncidentDisplay_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay getDefaultInstanceForType() {
      return POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay build() {
      POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay buildPartial() {
      POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay result = new POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay(this);
      result.incidentId_ = incidentId_;
      result.incidentDisplayType_ = incidentDisplayType_;
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
      if (other instanceof POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay) {
        return mergeFrom((POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay other) {
      if (other == POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.getDefaultInstance()) return this;
      if (!other.getIncidentId().isEmpty()) {
        incidentId_ = other.incidentId_;
        onChanged();
      }
      if (other.incidentDisplayType_ != 0) {
        setIncidentDisplayTypeValue(other.getIncidentDisplayTypeValue());
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
      POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object incidentId_ = "";
    /**
     * <code>string incident_id = 1;</code>
     * @return The incidentId.
     */
    public java.lang.String getIncidentId() {
      java.lang.Object ref = incidentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        incidentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string incident_id = 1;</code>
     * @return The bytes for incidentId.
     */
    public com.google.protobuf.ByteString
        getIncidentIdBytes() {
      java.lang.Object ref = incidentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        incidentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string incident_id = 1;</code>
     * @param value The incidentId to set.
     * @return This builder for chaining.
     */
    public Builder setIncidentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      incidentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string incident_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncidentId() {
      
      incidentId_ = getDefaultInstance().getIncidentId();
      onChanged();
      return this;
    }
    /**
     * <code>string incident_id = 1;</code>
     * @param value The bytes for incidentId to set.
     * @return This builder for chaining.
     */
    public Builder setIncidentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      incidentId_ = value;
      onChanged();
      return this;
    }

    private int incidentDisplayType_ = 0;
    /**
     * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
     * @return The enum numeric value on the wire for incidentDisplayType.
     */
    public int getIncidentDisplayTypeValue() {
      return incidentDisplayType_;
    }
    /**
     * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
     * @param value The enum numeric value on the wire for incidentDisplayType to set.
     * @return This builder for chaining.
     */
    public Builder setIncidentDisplayTypeValue(int value) {
      incidentDisplayType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
     * @return The incidentDisplayType.
     */
    public POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType getIncidentDisplayType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType result = POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.valueOf(incidentDisplayType_);
      return result == null ? POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
     * @param value The incidentDisplayType to set.
     * @return This builder for chaining.
     */
    public Builder setIncidentDisplayType(POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      incidentDisplayType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Map.Fort.FortData.PokestopIncidentDisplay.IncidentDisplayType incident_display_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncidentDisplayType() {
      
      incidentDisplayType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay)
  private static final POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay();
  }

  public static POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RocketBalloonIncidentDisplay>
      PARSER = new com.google.protobuf.AbstractParser<RocketBalloonIncidentDisplay>() {
    @java.lang.Override
    public RocketBalloonIncidentDisplay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RocketBalloonIncidentDisplay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RocketBalloonIncidentDisplay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RocketBalloonIncidentDisplay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
