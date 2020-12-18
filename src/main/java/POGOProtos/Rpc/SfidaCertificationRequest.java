// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SfidaCertificationRequest}
 */
public final class SfidaCertificationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SfidaCertificationRequest)
    SfidaCertificationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SfidaCertificationRequest.newBuilder() to construct.
  private SfidaCertificationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SfidaCertificationRequest() {
    stage_ = 0;
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SfidaCertificationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SfidaCertificationRequest(
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

            stage_ = rawValue;
            break;
          }
          case 18: {

            payload_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCertificationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCertificationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SfidaCertificationRequest.class, POGOProtos.Rpc.SfidaCertificationRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage}
   */
  public enum SfidaCertificationStage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>STAGE1 = 1;</code>
     */
    STAGE1(1),
    /**
     * <code>STAGE2 = 2;</code>
     */
    STAGE2(2),
    /**
     * <code>STAGE3 = 3;</code>
     */
    STAGE3(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>STAGE1 = 1;</code>
     */
    public static final int STAGE1_VALUE = 1;
    /**
     * <code>STAGE2 = 2;</code>
     */
    public static final int STAGE2_VALUE = 2;
    /**
     * <code>STAGE3 = 3;</code>
     */
    public static final int STAGE3_VALUE = 3;


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
    public static SfidaCertificationStage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SfidaCertificationStage forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return STAGE1;
        case 2: return STAGE2;
        case 3: return STAGE3;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SfidaCertificationStage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SfidaCertificationStage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SfidaCertificationStage>() {
            public SfidaCertificationStage findValueByNumber(int number) {
              return SfidaCertificationStage.forNumber(number);
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
      return POGOProtos.Rpc.SfidaCertificationRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final SfidaCertificationStage[] VALUES = values();

    public static SfidaCertificationStage valueOf(
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

    private SfidaCertificationStage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage)
  }

  public static final int STAGE_FIELD_NUMBER = 1;
  private int stage_;
  /**
   * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
   * @return The enum numeric value on the wire for stage.
   */
  @java.lang.Override public int getStageValue() {
    return stage_;
  }
  /**
   * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
   * @return The stage.
   */
  @java.lang.Override public POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage getStage() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage result = POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.valueOf(stage_);
    return result == null ? POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.UNRECOGNIZED : result;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (stage_ != POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.UNSET.getNumber()) {
      output.writeEnum(1, stage_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(2, payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stage_ != POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, stage_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, payload_);
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
    if (!(obj instanceof POGOProtos.Rpc.SfidaCertificationRequest)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SfidaCertificationRequest other = (POGOProtos.Rpc.SfidaCertificationRequest) obj;

    if (stage_ != other.stage_) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
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
    hash = (37 * hash) + STAGE_FIELD_NUMBER;
    hash = (53 * hash) + stage_;
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCertificationRequest parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SfidaCertificationRequest prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SfidaCertificationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SfidaCertificationRequest)
      POGOProtos.Rpc.SfidaCertificationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCertificationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCertificationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SfidaCertificationRequest.class, POGOProtos.Rpc.SfidaCertificationRequest.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SfidaCertificationRequest.newBuilder()
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
      stage_ = 0;

      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCertificationRequest_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCertificationRequest getDefaultInstanceForType() {
      return POGOProtos.Rpc.SfidaCertificationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCertificationRequest build() {
      POGOProtos.Rpc.SfidaCertificationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCertificationRequest buildPartial() {
      POGOProtos.Rpc.SfidaCertificationRequest result = new POGOProtos.Rpc.SfidaCertificationRequest(this);
      result.stage_ = stage_;
      result.payload_ = payload_;
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
      if (other instanceof POGOProtos.Rpc.SfidaCertificationRequest) {
        return mergeFrom((POGOProtos.Rpc.SfidaCertificationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SfidaCertificationRequest other) {
      if (other == POGOProtos.Rpc.SfidaCertificationRequest.getDefaultInstance()) return this;
      if (other.stage_ != 0) {
        setStageValue(other.getStageValue());
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
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
      POGOProtos.Rpc.SfidaCertificationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SfidaCertificationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int stage_ = 0;
    /**
     * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
     * @param value The enum numeric value on the wire for stage to set.
     * @return This builder for chaining.
     */
    public Builder setStageValue(int value) {
      
      stage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
     * @return The stage.
     */
    @java.lang.Override
    public POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage getStage() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage result = POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.valueOf(stage_);
      return result == null ? POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
     * @param value The stage to set.
     * @return This builder for chaining.
     */
    public Builder setStage(POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      stage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SfidaCertificationRequest.SfidaCertificationStage stage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStage() {
      
      stage_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SfidaCertificationRequest)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SfidaCertificationRequest)
  private static final POGOProtos.Rpc.SfidaCertificationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SfidaCertificationRequest();
  }

  public static POGOProtos.Rpc.SfidaCertificationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SfidaCertificationRequest>
      PARSER = new com.google.protobuf.AbstractParser<SfidaCertificationRequest>() {
    @java.lang.Override
    public SfidaCertificationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SfidaCertificationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SfidaCertificationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SfidaCertificationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SfidaCertificationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

