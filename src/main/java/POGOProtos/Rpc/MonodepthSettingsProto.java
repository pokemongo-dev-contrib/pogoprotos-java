// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MonodepthSettingsProto}
 */
public  final class MonodepthSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MonodepthSettingsProto)
    MonodepthSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonodepthSettingsProto.newBuilder() to construct.
  private MonodepthSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonodepthSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MonodepthSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonodepthSettingsProto(
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

            enableOcclusions_ = input.readBool();
            break;
          }
          case 16: {

            occlusionsDefaultOn_ = input.readBool();
            break;
          }
          case 24: {

            occlusionsToggleVisible_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MonodepthSettingsProto.class, POGOProtos.Rpc.MonodepthSettingsProto.Builder.class);
  }

  public static final int ENABLE_OCCLUSIONS_FIELD_NUMBER = 1;
  private boolean enableOcclusions_;
  /**
   * <code>bool enable_occlusions = 1;</code>
   * @return The enableOcclusions.
   */
  public boolean getEnableOcclusions() {
    return enableOcclusions_;
  }

  public static final int OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER = 2;
  private boolean occlusionsDefaultOn_;
  /**
   * <code>bool occlusions_default_on = 2;</code>
   * @return The occlusionsDefaultOn.
   */
  public boolean getOcclusionsDefaultOn() {
    return occlusionsDefaultOn_;
  }

  public static final int OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER = 3;
  private boolean occlusionsToggleVisible_;
  /**
   * <code>bool occlusions_toggle_visible = 3;</code>
   * @return The occlusionsToggleVisible.
   */
  public boolean getOcclusionsToggleVisible() {
    return occlusionsToggleVisible_;
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
    if (enableOcclusions_ != false) {
      output.writeBool(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      output.writeBool(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      output.writeBool(3, occlusionsToggleVisible_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableOcclusions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, occlusionsToggleVisible_);
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
    if (!(obj instanceof POGOProtos.Rpc.MonodepthSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MonodepthSettingsProto other = (POGOProtos.Rpc.MonodepthSettingsProto) obj;

    if (getEnableOcclusions()
        != other.getEnableOcclusions()) return false;
    if (getOcclusionsDefaultOn()
        != other.getOcclusionsDefaultOn()) return false;
    if (getOcclusionsToggleVisible()
        != other.getOcclusionsToggleVisible()) return false;
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
    hash = (37 * hash) + ENABLE_OCCLUSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableOcclusions());
    hash = (37 * hash) + OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsDefaultOn());
    hash = (37 * hash) + OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsToggleVisible());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MonodepthSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MonodepthSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MonodepthSettingsProto)
      POGOProtos.Rpc.MonodepthSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MonodepthSettingsProto.class, POGOProtos.Rpc.MonodepthSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MonodepthSettingsProto.newBuilder()
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
      enableOcclusions_ = false;

      occlusionsDefaultOn_ = false;

      occlusionsToggleVisible_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MonodepthSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto build() {
      POGOProtos.Rpc.MonodepthSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto buildPartial() {
      POGOProtos.Rpc.MonodepthSettingsProto result = new POGOProtos.Rpc.MonodepthSettingsProto(this);
      result.enableOcclusions_ = enableOcclusions_;
      result.occlusionsDefaultOn_ = occlusionsDefaultOn_;
      result.occlusionsToggleVisible_ = occlusionsToggleVisible_;
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
      if (other instanceof POGOProtos.Rpc.MonodepthSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.MonodepthSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MonodepthSettingsProto other) {
      if (other == POGOProtos.Rpc.MonodepthSettingsProto.getDefaultInstance()) return this;
      if (other.getEnableOcclusions() != false) {
        setEnableOcclusions(other.getEnableOcclusions());
      }
      if (other.getOcclusionsDefaultOn() != false) {
        setOcclusionsDefaultOn(other.getOcclusionsDefaultOn());
      }
      if (other.getOcclusionsToggleVisible() != false) {
        setOcclusionsToggleVisible(other.getOcclusionsToggleVisible());
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
      POGOProtos.Rpc.MonodepthSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MonodepthSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableOcclusions_ ;
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return The enableOcclusions.
     */
    public boolean getEnableOcclusions() {
      return enableOcclusions_;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @param value The enableOcclusions to set.
     * @return This builder for chaining.
     */
    public Builder setEnableOcclusions(boolean value) {
      
      enableOcclusions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableOcclusions() {
      
      enableOcclusions_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsDefaultOn_ ;
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return The occlusionsDefaultOn.
     */
    public boolean getOcclusionsDefaultOn() {
      return occlusionsDefaultOn_;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @param value The occlusionsDefaultOn to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsDefaultOn(boolean value) {
      
      occlusionsDefaultOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsDefaultOn() {
      
      occlusionsDefaultOn_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsToggleVisible_ ;
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return The occlusionsToggleVisible.
     */
    public boolean getOcclusionsToggleVisible() {
      return occlusionsToggleVisible_;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @param value The occlusionsToggleVisible to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsToggleVisible(boolean value) {
      
      occlusionsToggleVisible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsToggleVisible() {
      
      occlusionsToggleVisible_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MonodepthSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MonodepthSettingsProto)
  private static final POGOProtos.Rpc.MonodepthSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MonodepthSettingsProto();
  }

  public static POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonodepthSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<MonodepthSettingsProto>() {
    @java.lang.Override
    public MonodepthSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonodepthSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonodepthSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonodepthSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
