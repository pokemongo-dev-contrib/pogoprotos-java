// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AdventureSyncSettingsProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AdventureSyncSettingsProto}
 */
public final class AdventureSyncSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AdventureSyncSettingsProto)
    AdventureSyncSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdventureSyncSettingsProto.newBuilder() to construct.
  private AdventureSyncSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdventureSyncSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdventureSyncSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdventureSyncSettingsProto(
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

            fitnessServiceEnabled_ = input.readBool();
            break;
          }
          case 16: {

            awarenessServiceEnabled_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdventureSyncSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdventureSyncSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AdventureSyncSettingsProto.class, POGOProtos.Rpc.AdventureSyncSettingsProto.Builder.class);
  }

  public static final int FITNESS_SERVICE_ENABLED_FIELD_NUMBER = 1;
  private boolean fitnessServiceEnabled_;
  /**
   * <code>bool fitness_service_enabled = 1;</code>
   * @return The fitnessServiceEnabled.
   */
  @java.lang.Override
  public boolean getFitnessServiceEnabled() {
    return fitnessServiceEnabled_;
  }

  public static final int AWARENESS_SERVICE_ENABLED_FIELD_NUMBER = 2;
  private boolean awarenessServiceEnabled_;
  /**
   * <code>bool awareness_service_enabled = 2;</code>
   * @return The awarenessServiceEnabled.
   */
  @java.lang.Override
  public boolean getAwarenessServiceEnabled() {
    return awarenessServiceEnabled_;
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
    if (fitnessServiceEnabled_ != false) {
      output.writeBool(1, fitnessServiceEnabled_);
    }
    if (awarenessServiceEnabled_ != false) {
      output.writeBool(2, awarenessServiceEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fitnessServiceEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fitnessServiceEnabled_);
    }
    if (awarenessServiceEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, awarenessServiceEnabled_);
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
    if (!(obj instanceof POGOProtos.Rpc.AdventureSyncSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AdventureSyncSettingsProto other = (POGOProtos.Rpc.AdventureSyncSettingsProto) obj;

    if (getFitnessServiceEnabled()
        != other.getFitnessServiceEnabled()) return false;
    if (getAwarenessServiceEnabled()
        != other.getAwarenessServiceEnabled()) return false;
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
    hash = (37 * hash) + FITNESS_SERVICE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFitnessServiceEnabled());
    hash = (37 * hash) + AWARENESS_SERVICE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAwarenessServiceEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdventureSyncSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AdventureSyncSettingsProto prototype) {
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
   * ref: AdventureSyncSettingsProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AdventureSyncSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AdventureSyncSettingsProto)
      POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdventureSyncSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdventureSyncSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AdventureSyncSettingsProto.class, POGOProtos.Rpc.AdventureSyncSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AdventureSyncSettingsProto.newBuilder()
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
      fitnessServiceEnabled_ = false;

      awarenessServiceEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdventureSyncSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdventureSyncSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AdventureSyncSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdventureSyncSettingsProto build() {
      POGOProtos.Rpc.AdventureSyncSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdventureSyncSettingsProto buildPartial() {
      POGOProtos.Rpc.AdventureSyncSettingsProto result = new POGOProtos.Rpc.AdventureSyncSettingsProto(this);
      result.fitnessServiceEnabled_ = fitnessServiceEnabled_;
      result.awarenessServiceEnabled_ = awarenessServiceEnabled_;
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
      if (other instanceof POGOProtos.Rpc.AdventureSyncSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.AdventureSyncSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AdventureSyncSettingsProto other) {
      if (other == POGOProtos.Rpc.AdventureSyncSettingsProto.getDefaultInstance()) return this;
      if (other.getFitnessServiceEnabled() != false) {
        setFitnessServiceEnabled(other.getFitnessServiceEnabled());
      }
      if (other.getAwarenessServiceEnabled() != false) {
        setAwarenessServiceEnabled(other.getAwarenessServiceEnabled());
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
      POGOProtos.Rpc.AdventureSyncSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AdventureSyncSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean fitnessServiceEnabled_ ;
    /**
     * <code>bool fitness_service_enabled = 1;</code>
     * @return The fitnessServiceEnabled.
     */
    @java.lang.Override
    public boolean getFitnessServiceEnabled() {
      return fitnessServiceEnabled_;
    }
    /**
     * <code>bool fitness_service_enabled = 1;</code>
     * @param value The fitnessServiceEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setFitnessServiceEnabled(boolean value) {
      
      fitnessServiceEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fitness_service_enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFitnessServiceEnabled() {
      
      fitnessServiceEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean awarenessServiceEnabled_ ;
    /**
     * <code>bool awareness_service_enabled = 2;</code>
     * @return The awarenessServiceEnabled.
     */
    @java.lang.Override
    public boolean getAwarenessServiceEnabled() {
      return awarenessServiceEnabled_;
    }
    /**
     * <code>bool awareness_service_enabled = 2;</code>
     * @param value The awarenessServiceEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setAwarenessServiceEnabled(boolean value) {
      
      awarenessServiceEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool awareness_service_enabled = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAwarenessServiceEnabled() {
      
      awarenessServiceEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AdventureSyncSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AdventureSyncSettingsProto)
  private static final POGOProtos.Rpc.AdventureSyncSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AdventureSyncSettingsProto();
  }

  public static POGOProtos.Rpc.AdventureSyncSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdventureSyncSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<AdventureSyncSettingsProto>() {
    @java.lang.Override
    public AdventureSyncSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdventureSyncSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdventureSyncSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdventureSyncSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AdventureSyncSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

