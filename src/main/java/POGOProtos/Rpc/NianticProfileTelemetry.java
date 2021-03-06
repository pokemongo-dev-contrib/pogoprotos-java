// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NianticProfileTelemetry}
 */
public final class NianticProfileTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NianticProfileTelemetry)
    NianticProfileTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NianticProfileTelemetry.newBuilder() to construct.
  private NianticProfileTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NianticProfileTelemetry() {
    nianticProfileTelemetryId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NianticProfileTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NianticProfileTelemetry(
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

            nianticProfileTelemetryId_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NianticProfileTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NianticProfileTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NianticProfileTelemetry.class, POGOProtos.Rpc.NianticProfileTelemetry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds}
   */
  public enum NianticProfileTelemetryIds
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0),
    /**
     * <code>OPEN_MY_PROFILE = 1;</code>
     */
    OPEN_MY_PROFILE(1),
    /**
     * <code>OPEN_FRIEND_PROFILE = 2;</code>
     */
    OPEN_FRIEND_PROFILE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <code>OPEN_MY_PROFILE = 1;</code>
     */
    public static final int OPEN_MY_PROFILE_VALUE = 1;
    /**
     * <code>OPEN_FRIEND_PROFILE = 2;</code>
     */
    public static final int OPEN_FRIEND_PROFILE_VALUE = 2;


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
    public static NianticProfileTelemetryIds valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NianticProfileTelemetryIds forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return OPEN_MY_PROFILE;
        case 2: return OPEN_FRIEND_PROFILE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NianticProfileTelemetryIds>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NianticProfileTelemetryIds> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NianticProfileTelemetryIds>() {
            public NianticProfileTelemetryIds findValueByNumber(int number) {
              return NianticProfileTelemetryIds.forNumber(number);
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
      return POGOProtos.Rpc.NianticProfileTelemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final NianticProfileTelemetryIds[] VALUES = values();

    public static NianticProfileTelemetryIds valueOf(
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

    private NianticProfileTelemetryIds(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds)
  }

  public static final int NIANTIC_PROFILE_TELEMETRY_ID_FIELD_NUMBER = 1;
  private int nianticProfileTelemetryId_;
  /**
   * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for nianticProfileTelemetryId.
   */
  @java.lang.Override public int getNianticProfileTelemetryIdValue() {
    return nianticProfileTelemetryId_;
  }
  /**
   * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
   * @return The nianticProfileTelemetryId.
   */
  @java.lang.Override public POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds getNianticProfileTelemetryId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds result = POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.valueOf(nianticProfileTelemetryId_);
    return result == null ? POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.UNRECOGNIZED : result;
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
    if (nianticProfileTelemetryId_ != POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.UNDEFINED.getNumber()) {
      output.writeEnum(1, nianticProfileTelemetryId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nianticProfileTelemetryId_ != POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, nianticProfileTelemetryId_);
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
    if (!(obj instanceof POGOProtos.Rpc.NianticProfileTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NianticProfileTelemetry other = (POGOProtos.Rpc.NianticProfileTelemetry) obj;

    if (nianticProfileTelemetryId_ != other.nianticProfileTelemetryId_) return false;
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
    hash = (37 * hash) + NIANTIC_PROFILE_TELEMETRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + nianticProfileTelemetryId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NianticProfileTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NianticProfileTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NianticProfileTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NianticProfileTelemetry)
      POGOProtos.Rpc.NianticProfileTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NianticProfileTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NianticProfileTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NianticProfileTelemetry.class, POGOProtos.Rpc.NianticProfileTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NianticProfileTelemetry.newBuilder()
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
      nianticProfileTelemetryId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NianticProfileTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NianticProfileTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.NianticProfileTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NianticProfileTelemetry build() {
      POGOProtos.Rpc.NianticProfileTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NianticProfileTelemetry buildPartial() {
      POGOProtos.Rpc.NianticProfileTelemetry result = new POGOProtos.Rpc.NianticProfileTelemetry(this);
      result.nianticProfileTelemetryId_ = nianticProfileTelemetryId_;
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
      if (other instanceof POGOProtos.Rpc.NianticProfileTelemetry) {
        return mergeFrom((POGOProtos.Rpc.NianticProfileTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NianticProfileTelemetry other) {
      if (other == POGOProtos.Rpc.NianticProfileTelemetry.getDefaultInstance()) return this;
      if (other.nianticProfileTelemetryId_ != 0) {
        setNianticProfileTelemetryIdValue(other.getNianticProfileTelemetryIdValue());
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
      POGOProtos.Rpc.NianticProfileTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NianticProfileTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nianticProfileTelemetryId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
     * @return The enum numeric value on the wire for nianticProfileTelemetryId.
     */
    @java.lang.Override public int getNianticProfileTelemetryIdValue() {
      return nianticProfileTelemetryId_;
    }
    /**
     * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
     * @param value The enum numeric value on the wire for nianticProfileTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setNianticProfileTelemetryIdValue(int value) {
      
      nianticProfileTelemetryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
     * @return The nianticProfileTelemetryId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds getNianticProfileTelemetryId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds result = POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.valueOf(nianticProfileTelemetryId_);
      return result == null ? POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
     * @param value The nianticProfileTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setNianticProfileTelemetryId(POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nianticProfileTelemetryId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NianticProfileTelemetry.NianticProfileTelemetryIds niantic_profile_telemetry_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNianticProfileTelemetryId() {
      
      nianticProfileTelemetryId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NianticProfileTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NianticProfileTelemetry)
  private static final POGOProtos.Rpc.NianticProfileTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NianticProfileTelemetry();
  }

  public static POGOProtos.Rpc.NianticProfileTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NianticProfileTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<NianticProfileTelemetry>() {
    @java.lang.Override
    public NianticProfileTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NianticProfileTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NianticProfileTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NianticProfileTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NianticProfileTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

