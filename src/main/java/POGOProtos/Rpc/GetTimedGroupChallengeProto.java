// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetTimedGroupChallengeProto}
 */
public final class GetTimedGroupChallengeProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetTimedGroupChallengeProto)
    GetTimedGroupChallengeProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTimedGroupChallengeProto.newBuilder() to construct.
  private GetTimedGroupChallengeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTimedGroupChallengeProto() {
    challengeId_ = "";
    activeCityHash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTimedGroupChallengeProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTimedGroupChallengeProto(
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

            challengeId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            activeCityHash_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetTimedGroupChallengeProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetTimedGroupChallengeProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetTimedGroupChallengeProto.class, POGOProtos.Rpc.GetTimedGroupChallengeProto.Builder.class);
  }

  public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object challengeId_;
  /**
   * <code>string challenge_id = 1;</code>
   * @return The challengeId.
   */
  @java.lang.Override
  public java.lang.String getChallengeId() {
    java.lang.Object ref = challengeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      challengeId_ = s;
      return s;
    }
  }
  /**
   * <code>string challenge_id = 1;</code>
   * @return The bytes for challengeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChallengeIdBytes() {
    java.lang.Object ref = challengeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      challengeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVE_CITY_HASH_FIELD_NUMBER = 2;
  private volatile java.lang.Object activeCityHash_;
  /**
   * <code>string active_city_hash = 2;</code>
   * @return The activeCityHash.
   */
  @java.lang.Override
  public java.lang.String getActiveCityHash() {
    java.lang.Object ref = activeCityHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activeCityHash_ = s;
      return s;
    }
  }
  /**
   * <code>string active_city_hash = 2;</code>
   * @return The bytes for activeCityHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActiveCityHashBytes() {
    java.lang.Object ref = activeCityHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activeCityHash_ = b;
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
    if (!getChallengeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, challengeId_);
    }
    if (!getActiveCityHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, activeCityHash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChallengeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, challengeId_);
    }
    if (!getActiveCityHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, activeCityHash_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetTimedGroupChallengeProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetTimedGroupChallengeProto other = (POGOProtos.Rpc.GetTimedGroupChallengeProto) obj;

    if (!getChallengeId()
        .equals(other.getChallengeId())) return false;
    if (!getActiveCityHash()
        .equals(other.getActiveCityHash())) return false;
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
    hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChallengeId().hashCode();
    hash = (37 * hash) + ACTIVE_CITY_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getActiveCityHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTimedGroupChallengeProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetTimedGroupChallengeProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetTimedGroupChallengeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetTimedGroupChallengeProto)
      POGOProtos.Rpc.GetTimedGroupChallengeProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetTimedGroupChallengeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetTimedGroupChallengeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetTimedGroupChallengeProto.class, POGOProtos.Rpc.GetTimedGroupChallengeProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetTimedGroupChallengeProto.newBuilder()
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
      challengeId_ = "";

      activeCityHash_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetTimedGroupChallengeProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTimedGroupChallengeProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetTimedGroupChallengeProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTimedGroupChallengeProto build() {
      POGOProtos.Rpc.GetTimedGroupChallengeProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTimedGroupChallengeProto buildPartial() {
      POGOProtos.Rpc.GetTimedGroupChallengeProto result = new POGOProtos.Rpc.GetTimedGroupChallengeProto(this);
      result.challengeId_ = challengeId_;
      result.activeCityHash_ = activeCityHash_;
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
      if (other instanceof POGOProtos.Rpc.GetTimedGroupChallengeProto) {
        return mergeFrom((POGOProtos.Rpc.GetTimedGroupChallengeProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetTimedGroupChallengeProto other) {
      if (other == POGOProtos.Rpc.GetTimedGroupChallengeProto.getDefaultInstance()) return this;
      if (!other.getChallengeId().isEmpty()) {
        challengeId_ = other.challengeId_;
        onChanged();
      }
      if (!other.getActiveCityHash().isEmpty()) {
        activeCityHash_ = other.activeCityHash_;
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
      POGOProtos.Rpc.GetTimedGroupChallengeProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetTimedGroupChallengeProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object challengeId_ = "";
    /**
     * <code>string challenge_id = 1;</code>
     * @return The challengeId.
     */
    public java.lang.String getChallengeId() {
      java.lang.Object ref = challengeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        challengeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @return The bytes for challengeId.
     */
    public com.google.protobuf.ByteString
        getChallengeIdBytes() {
      java.lang.Object ref = challengeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        challengeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @param value The challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      challengeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChallengeId() {
      
      challengeId_ = getDefaultInstance().getChallengeId();
      onChanged();
      return this;
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @param value The bytes for challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      challengeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object activeCityHash_ = "";
    /**
     * <code>string active_city_hash = 2;</code>
     * @return The activeCityHash.
     */
    public java.lang.String getActiveCityHash() {
      java.lang.Object ref = activeCityHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activeCityHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string active_city_hash = 2;</code>
     * @return The bytes for activeCityHash.
     */
    public com.google.protobuf.ByteString
        getActiveCityHashBytes() {
      java.lang.Object ref = activeCityHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activeCityHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string active_city_hash = 2;</code>
     * @param value The activeCityHash to set.
     * @return This builder for chaining.
     */
    public Builder setActiveCityHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      activeCityHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string active_city_hash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveCityHash() {
      
      activeCityHash_ = getDefaultInstance().getActiveCityHash();
      onChanged();
      return this;
    }
    /**
     * <code>string active_city_hash = 2;</code>
     * @param value The bytes for activeCityHash to set.
     * @return This builder for chaining.
     */
    public Builder setActiveCityHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      activeCityHash_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetTimedGroupChallengeProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetTimedGroupChallengeProto)
  private static final POGOProtos.Rpc.GetTimedGroupChallengeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetTimedGroupChallengeProto();
  }

  public static POGOProtos.Rpc.GetTimedGroupChallengeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTimedGroupChallengeProto>
      PARSER = new com.google.protobuf.AbstractParser<GetTimedGroupChallengeProto>() {
    @java.lang.Override
    public GetTimedGroupChallengeProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTimedGroupChallengeProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTimedGroupChallengeProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTimedGroupChallengeProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetTimedGroupChallengeProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

