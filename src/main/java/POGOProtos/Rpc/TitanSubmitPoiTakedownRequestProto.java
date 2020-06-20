// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Titan.Protos.SubmitPoiTakedownRequestProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto}
 */
public  final class TitanSubmitPoiTakedownRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)
    TitanSubmitPoiTakedownRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanSubmitPoiTakedownRequestProto.newBuilder() to construct.
  private TitanSubmitPoiTakedownRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanSubmitPoiTakedownRequestProto() {
    poiId_ = "";
    invalidReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanSubmitPoiTakedownRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanSubmitPoiTakedownRequestProto(
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

            poiId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            invalidReason_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitPoiTakedownRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitPoiTakedownRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.class, POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.Builder.class);
  }

  public static final int POI_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVALID_REASON_FIELD_NUMBER = 2;
  private int invalidReason_;
  /**
   * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
   * @return The enum numeric value on the wire for invalidReason.
   */
  public int getInvalidReasonValue() {
    return invalidReason_;
  }
  /**
   * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
   * @return The invalidReason.
   */
  public POGOProtos.Rpc.PoiInvalidReason getInvalidReason() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PoiInvalidReason result = POGOProtos.Rpc.PoiInvalidReason.valueOf(invalidReason_);
    return result == null ? POGOProtos.Rpc.PoiInvalidReason.UNRECOGNIZED : result;
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
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poiId_);
    }
    if (invalidReason_ != POGOProtos.Rpc.PoiInvalidReason.PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, invalidReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poiId_);
    }
    if (invalidReason_ != POGOProtos.Rpc.PoiInvalidReason.PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, invalidReason_);
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
    if (!(obj instanceof POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto other = (POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto) obj;

    if (!getPoiId()
        .equals(other.getPoiId())) return false;
    if (invalidReason_ != other.invalidReason_) return false;
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
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    hash = (37 * hash) + INVALID_REASON_FIELD_NUMBER;
    hash = (53 * hash) + invalidReason_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto prototype) {
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
   * ref: Niantic.Titan.Protos.SubmitPoiTakedownRequestProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)
      POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitPoiTakedownRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitPoiTakedownRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.class, POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.newBuilder()
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
      poiId_ = "";

      invalidReason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitPoiTakedownRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto build() {
      POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto buildPartial() {
      POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto result = new POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto(this);
      result.poiId_ = poiId_;
      result.invalidReason_ = invalidReason_;
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
      if (other instanceof POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto) {
        return mergeFrom((POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto other) {
      if (other == POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto.getDefaultInstance()) return this;
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
        onChanged();
      }
      if (other.invalidReason_ != 0) {
        setInvalidReasonValue(other.getInvalidReasonValue());
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
      POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 1;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
      onChanged();
      return this;
    }

    private int invalidReason_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
     * @return The enum numeric value on the wire for invalidReason.
     */
    public int getInvalidReasonValue() {
      return invalidReason_;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
     * @param value The enum numeric value on the wire for invalidReason to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidReasonValue(int value) {
      invalidReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
     * @return The invalidReason.
     */
    public POGOProtos.Rpc.PoiInvalidReason getInvalidReason() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PoiInvalidReason result = POGOProtos.Rpc.PoiInvalidReason.valueOf(invalidReason_);
      return result == null ? POGOProtos.Rpc.PoiInvalidReason.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
     * @param value The invalidReason to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidReason(POGOProtos.Rpc.PoiInvalidReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      invalidReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiInvalidReason invalid_reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInvalidReason() {
      
      invalidReason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto)
  private static final POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto();
  }

  public static POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanSubmitPoiTakedownRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<TitanSubmitPoiTakedownRequestProto>() {
    @java.lang.Override
    public TitanSubmitPoiTakedownRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanSubmitPoiTakedownRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanSubmitPoiTakedownRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanSubmitPoiTakedownRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanSubmitPoiTakedownRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

