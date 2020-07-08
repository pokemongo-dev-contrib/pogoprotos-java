// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Rocket/RocketBalloonDisplay.proto

package POGOProtos.Data.Rocket;

/**
 * Protobuf type {@code POGOProtos.Data.Rocket.RocketBalloonDisplay}
 */
public  final class RocketBalloonDisplay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Rocket.RocketBalloonDisplay)
    RocketBalloonDisplayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RocketBalloonDisplay.newBuilder() to construct.
  private RocketBalloonDisplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RocketBalloonDisplay() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RocketBalloonDisplay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RocketBalloonDisplay(
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

            type_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder subBuilder = null;
            if (incidentDisplay_ != null) {
              subBuilder = incidentDisplay_.toBuilder();
            }
            incidentDisplay_ = input.readMessage(POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(incidentDisplay_);
              incidentDisplay_ = subBuilder.buildPartial();
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
    return POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonDisplay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonDisplay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Rocket.RocketBalloonDisplay.class, POGOProtos.Data.Rocket.RocketBalloonDisplay.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType}
   */
  public enum BalloonType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROCKET = 0;</code>
     */
    ROCKET(0),
    /**
     * <code>ROCKET_B = 1;</code>
     */
    ROCKET_B(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROCKET = 0;</code>
     */
    public static final int ROCKET_VALUE = 0;
    /**
     * <code>ROCKET_B = 1;</code>
     */
    public static final int ROCKET_B_VALUE = 1;


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
    public static BalloonType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BalloonType forNumber(int value) {
      switch (value) {
        case 0: return ROCKET;
        case 1: return ROCKET_B;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BalloonType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BalloonType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BalloonType>() {
            public BalloonType findValueByNumber(int number) {
              return BalloonType.forNumber(number);
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
      return POGOProtos.Data.Rocket.RocketBalloonDisplay.getDescriptor().getEnumTypes().get(0);
    }

    private static final BalloonType[] VALUES = values();

    public static BalloonType valueOf(
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

    private BalloonType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
   * @return The type.
   */
  public POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType getType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType result = POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.valueOf(type_);
    return result == null ? POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.UNRECOGNIZED : result;
  }

  public static final int INCIDENT_DISPLAY_FIELD_NUMBER = 2;
  private POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incidentDisplay_;
  /**
   * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
   * @return Whether the incidentDisplay field is set.
   */
  public boolean hasIncidentDisplay() {
    return incidentDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
   * @return The incidentDisplay.
   */
  public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay getIncidentDisplay() {
    return incidentDisplay_ == null ? POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.getDefaultInstance() : incidentDisplay_;
  }
  /**
   * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
   */
  public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder getIncidentDisplayOrBuilder() {
    return getIncidentDisplay();
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
    if (type_ != POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.ROCKET.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (incidentDisplay_ != null) {
      output.writeMessage(2, getIncidentDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.ROCKET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (incidentDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIncidentDisplay());
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
    if (!(obj instanceof POGOProtos.Data.Rocket.RocketBalloonDisplay)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Rocket.RocketBalloonDisplay other = (POGOProtos.Data.Rocket.RocketBalloonDisplay) obj;

    if (type_ != other.type_) return false;
    if (hasIncidentDisplay() != other.hasIncidentDisplay()) return false;
    if (hasIncidentDisplay()) {
      if (!getIncidentDisplay()
          .equals(other.getIncidentDisplay())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasIncidentDisplay()) {
      hash = (37 * hash) + INCIDENT_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getIncidentDisplay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Rocket.RocketBalloonDisplay parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Rocket.RocketBalloonDisplay prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Rocket.RocketBalloonDisplay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Rocket.RocketBalloonDisplay)
      POGOProtos.Data.Rocket.RocketBalloonDisplayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonDisplay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonDisplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Rocket.RocketBalloonDisplay.class, POGOProtos.Data.Rocket.RocketBalloonDisplay.Builder.class);
    }

    // Construct using POGOProtos.Data.Rocket.RocketBalloonDisplay.newBuilder()
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
      type_ = 0;

      if (incidentDisplayBuilder_ == null) {
        incidentDisplay_ = null;
      } else {
        incidentDisplay_ = null;
        incidentDisplayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Rocket.RocketBalloonDisplayOuterClass.internal_static_POGOProtos_Data_Rocket_RocketBalloonDisplay_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonDisplay getDefaultInstanceForType() {
      return POGOProtos.Data.Rocket.RocketBalloonDisplay.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonDisplay build() {
      POGOProtos.Data.Rocket.RocketBalloonDisplay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Rocket.RocketBalloonDisplay buildPartial() {
      POGOProtos.Data.Rocket.RocketBalloonDisplay result = new POGOProtos.Data.Rocket.RocketBalloonDisplay(this);
      result.type_ = type_;
      if (incidentDisplayBuilder_ == null) {
        result.incidentDisplay_ = incidentDisplay_;
      } else {
        result.incidentDisplay_ = incidentDisplayBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Rocket.RocketBalloonDisplay) {
        return mergeFrom((POGOProtos.Data.Rocket.RocketBalloonDisplay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Rocket.RocketBalloonDisplay other) {
      if (other == POGOProtos.Data.Rocket.RocketBalloonDisplay.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasIncidentDisplay()) {
        mergeIncidentDisplay(other.getIncidentDisplay());
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
      POGOProtos.Data.Rocket.RocketBalloonDisplay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Rocket.RocketBalloonDisplay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
     * @return The type.
     */
    public POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType getType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType result = POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.valueOf(type_);
      return result == null ? POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonDisplay.BalloonType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incidentDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder> incidentDisplayBuilder_;
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     * @return Whether the incidentDisplay field is set.
     */
    public boolean hasIncidentDisplay() {
      return incidentDisplayBuilder_ != null || incidentDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     * @return The incidentDisplay.
     */
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay getIncidentDisplay() {
      if (incidentDisplayBuilder_ == null) {
        return incidentDisplay_ == null ? POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.getDefaultInstance() : incidentDisplay_;
      } else {
        return incidentDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public Builder setIncidentDisplay(POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay value) {
      if (incidentDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        incidentDisplay_ = value;
        onChanged();
      } else {
        incidentDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public Builder setIncidentDisplay(
        POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder builderForValue) {
      if (incidentDisplayBuilder_ == null) {
        incidentDisplay_ = builderForValue.build();
        onChanged();
      } else {
        incidentDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public Builder mergeIncidentDisplay(POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay value) {
      if (incidentDisplayBuilder_ == null) {
        if (incidentDisplay_ != null) {
          incidentDisplay_ =
            POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.newBuilder(incidentDisplay_).mergeFrom(value).buildPartial();
        } else {
          incidentDisplay_ = value;
        }
        onChanged();
      } else {
        incidentDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public Builder clearIncidentDisplay() {
      if (incidentDisplayBuilder_ == null) {
        incidentDisplay_ = null;
        onChanged();
      } else {
        incidentDisplay_ = null;
        incidentDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder getIncidentDisplayBuilder() {
      
      onChanged();
      return getIncidentDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    public POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder getIncidentDisplayOrBuilder() {
      if (incidentDisplayBuilder_ != null) {
        return incidentDisplayBuilder_.getMessageOrBuilder();
      } else {
        return incidentDisplay_ == null ?
            POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.getDefaultInstance() : incidentDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay incident_display = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder> 
        getIncidentDisplayFieldBuilder() {
      if (incidentDisplayBuilder_ == null) {
        incidentDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplay.Builder, POGOProtos.Data.Rocket.RocketBalloonIncidentDisplayOrBuilder>(
                getIncidentDisplay(),
                getParentForChildren(),
                isClean());
        incidentDisplay_ = null;
      }
      return incidentDisplayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Rocket.RocketBalloonDisplay)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Rocket.RocketBalloonDisplay)
  private static final POGOProtos.Data.Rocket.RocketBalloonDisplay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Rocket.RocketBalloonDisplay();
  }

  public static POGOProtos.Data.Rocket.RocketBalloonDisplay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RocketBalloonDisplay>
      PARSER = new com.google.protobuf.AbstractParser<RocketBalloonDisplay>() {
    @java.lang.Override
    public RocketBalloonDisplay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RocketBalloonDisplay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RocketBalloonDisplay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RocketBalloonDisplay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Rocket.RocketBalloonDisplay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

