// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/CombatHubEntranceTelemetry.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry}
 */
public  final class CombatHubEntranceTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)
    CombatHubEntranceTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatHubEntranceTelemetry.newBuilder() to construct.
  private CombatHubEntranceTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatHubEntranceTelemetry() {
    combatHubTelemetryId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatHubEntranceTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatHubEntranceTelemetry(
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

            combatHubTelemetryId_ = rawValue;
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
    return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_CombatHubEntranceTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_CombatHubEntranceTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.class, POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.Builder.class);
  }

  public static final int COMBAT_HUB_TELEMETRY_ID_FIELD_NUMBER = 1;
  private int combatHubTelemetryId_;
  /**
   * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for combatHubTelemetryId.
   */
  public int getCombatHubTelemetryIdValue() {
    return combatHubTelemetryId_;
  }
  /**
   * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
   * @return The combatHubTelemetryId.
   */
  public POGOProtos.Enums.CombatHubEntranceTelemetryIds getCombatHubTelemetryId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.CombatHubEntranceTelemetryIds result = POGOProtos.Enums.CombatHubEntranceTelemetryIds.valueOf(combatHubTelemetryId_);
    return result == null ? POGOProtos.Enums.CombatHubEntranceTelemetryIds.UNRECOGNIZED : result;
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
    if (combatHubTelemetryId_ != POGOProtos.Enums.CombatHubEntranceTelemetryIds.UNDEFINED_EVENT.getNumber()) {
      output.writeEnum(1, combatHubTelemetryId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (combatHubTelemetryId_ != POGOProtos.Enums.CombatHubEntranceTelemetryIds.UNDEFINED_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, combatHubTelemetryId_);
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
    if (!(obj instanceof POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry other = (POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry) obj;

    if (combatHubTelemetryId_ != other.combatHubTelemetryId_) return false;
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
    hash = (37 * hash) + COMBAT_HUB_TELEMETRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + combatHubTelemetryId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)
      POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_CombatHubEntranceTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_CombatHubEntranceTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.class, POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.newBuilder()
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
      combatHubTelemetryId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_CombatHubEntranceTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry build() {
      POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry buildPartial() {
      POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry result = new POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry(this);
      result.combatHubTelemetryId_ = combatHubTelemetryId_;
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
      if (other instanceof POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry) {
        return mergeFrom((POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry other) {
      if (other == POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry.getDefaultInstance()) return this;
      if (other.combatHubTelemetryId_ != 0) {
        setCombatHubTelemetryIdValue(other.getCombatHubTelemetryIdValue());
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
      POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int combatHubTelemetryId_ = 0;
    /**
     * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
     * @return The enum numeric value on the wire for combatHubTelemetryId.
     */
    public int getCombatHubTelemetryIdValue() {
      return combatHubTelemetryId_;
    }
    /**
     * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
     * @param value The enum numeric value on the wire for combatHubTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatHubTelemetryIdValue(int value) {
      combatHubTelemetryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
     * @return The combatHubTelemetryId.
     */
    public POGOProtos.Enums.CombatHubEntranceTelemetryIds getCombatHubTelemetryId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.CombatHubEntranceTelemetryIds result = POGOProtos.Enums.CombatHubEntranceTelemetryIds.valueOf(combatHubTelemetryId_);
      return result == null ? POGOProtos.Enums.CombatHubEntranceTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
     * @param value The combatHubTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatHubTelemetryId(POGOProtos.Enums.CombatHubEntranceTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      combatHubTelemetryId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.CombatHubEntranceTelemetryIds combat_hub_telemetry_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatHubTelemetryId() {
      
      combatHubTelemetryId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry)
  private static final POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry();
  }

  public static POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatHubEntranceTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<CombatHubEntranceTelemetry>() {
    @java.lang.Override
    public CombatHubEntranceTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatHubEntranceTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatHubEntranceTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatHubEntranceTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.CombatHubEntranceTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
