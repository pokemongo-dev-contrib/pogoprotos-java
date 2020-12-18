// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry}
 */
public final class CheckEncounterTrayInfoTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)
    CheckEncounterTrayInfoTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckEncounterTrayInfoTelemetry.newBuilder() to construct.
  private CheckEncounterTrayInfoTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckEncounterTrayInfoTelemetry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckEncounterTrayInfoTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckEncounterTrayInfoTelemetry(
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

            berryTrayInfo_ = input.readBool();
            break;
          }
          case 16: {

            ballTrayInfo_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckEncounterTrayInfoTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckEncounterTrayInfoTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.class, POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.Builder.class);
  }

  public static final int BERRY_TRAY_INFO_FIELD_NUMBER = 1;
  private boolean berryTrayInfo_;
  /**
   * <code>bool berry_tray_info = 1;</code>
   * @return The berryTrayInfo.
   */
  @java.lang.Override
  public boolean getBerryTrayInfo() {
    return berryTrayInfo_;
  }

  public static final int BALL_TRAY_INFO_FIELD_NUMBER = 2;
  private boolean ballTrayInfo_;
  /**
   * <code>bool ball_tray_info = 2;</code>
   * @return The ballTrayInfo.
   */
  @java.lang.Override
  public boolean getBallTrayInfo() {
    return ballTrayInfo_;
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
    if (berryTrayInfo_ != false) {
      output.writeBool(1, berryTrayInfo_);
    }
    if (ballTrayInfo_ != false) {
      output.writeBool(2, ballTrayInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (berryTrayInfo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, berryTrayInfo_);
    }
    if (ballTrayInfo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ballTrayInfo_);
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
    if (!(obj instanceof POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry other = (POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry) obj;

    if (getBerryTrayInfo()
        != other.getBerryTrayInfo()) return false;
    if (getBallTrayInfo()
        != other.getBallTrayInfo()) return false;
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
    hash = (37 * hash) + BERRY_TRAY_INFO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBerryTrayInfo());
    hash = (37 * hash) + BALL_TRAY_INFO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBallTrayInfo());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)
      POGOProtos.Rpc.CheckEncounterTrayInfoTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckEncounterTrayInfoTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckEncounterTrayInfoTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.class, POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.newBuilder()
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
      berryTrayInfo_ = false;

      ballTrayInfo_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CheckEncounterTrayInfoTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry build() {
      POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry buildPartial() {
      POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry result = new POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry(this);
      result.berryTrayInfo_ = berryTrayInfo_;
      result.ballTrayInfo_ = ballTrayInfo_;
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
      if (other instanceof POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry) {
        return mergeFrom((POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry other) {
      if (other == POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry.getDefaultInstance()) return this;
      if (other.getBerryTrayInfo() != false) {
        setBerryTrayInfo(other.getBerryTrayInfo());
      }
      if (other.getBallTrayInfo() != false) {
        setBallTrayInfo(other.getBallTrayInfo());
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
      POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean berryTrayInfo_ ;
    /**
     * <code>bool berry_tray_info = 1;</code>
     * @return The berryTrayInfo.
     */
    @java.lang.Override
    public boolean getBerryTrayInfo() {
      return berryTrayInfo_;
    }
    /**
     * <code>bool berry_tray_info = 1;</code>
     * @param value The berryTrayInfo to set.
     * @return This builder for chaining.
     */
    public Builder setBerryTrayInfo(boolean value) {
      
      berryTrayInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool berry_tray_info = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBerryTrayInfo() {
      
      berryTrayInfo_ = false;
      onChanged();
      return this;
    }

    private boolean ballTrayInfo_ ;
    /**
     * <code>bool ball_tray_info = 2;</code>
     * @return The ballTrayInfo.
     */
    @java.lang.Override
    public boolean getBallTrayInfo() {
      return ballTrayInfo_;
    }
    /**
     * <code>bool ball_tray_info = 2;</code>
     * @param value The ballTrayInfo to set.
     * @return This builder for chaining.
     */
    public Builder setBallTrayInfo(boolean value) {
      
      ballTrayInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ball_tray_info = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBallTrayInfo() {
      
      ballTrayInfo_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry)
  private static final POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry();
  }

  public static POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckEncounterTrayInfoTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<CheckEncounterTrayInfoTelemetry>() {
    @java.lang.Override
    public CheckEncounterTrayInfoTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckEncounterTrayInfoTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckEncounterTrayInfoTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckEncounterTrayInfoTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CheckEncounterTrayInfoTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

