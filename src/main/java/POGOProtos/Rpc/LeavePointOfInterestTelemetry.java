// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LeavePointOfInterestTelemetry}
 */
public final class LeavePointOfInterestTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LeavePointOfInterestTelemetry)
    LeavePointOfInterestTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeavePointOfInterestTelemetry.newBuilder() to construct.
  private LeavePointOfInterestTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeavePointOfInterestTelemetry() {
    result_ = "";
    fortId_ = "";
    partnerId_ = "";
    campaignId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeavePointOfInterestTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LeavePointOfInterestTelemetry(
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

            result_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 24: {

            fortType_ = input.readInt32();
            break;
          }
          case 32: {

            clientTimestamp_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            partnerId_ = s;
            break;
          }
          case 48: {

            timeSpent_ = input.readInt64();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            campaignId_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LeavePointOfInterestTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LeavePointOfInterestTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LeavePointOfInterestTelemetry.class, POGOProtos.Rpc.LeavePointOfInterestTelemetry.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  @java.lang.Override
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_TYPE_FIELD_NUMBER = 3;
  private int fortType_;
  /**
   * <code>int32 fort_type = 3;</code>
   * @return The fortType.
   */
  @java.lang.Override
  public int getFortType() {
    return fortType_;
  }

  public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 4;
  private long clientTimestamp_;
  /**
   * <code>int64 client_timestamp = 4;</code>
   * @return The clientTimestamp.
   */
  @java.lang.Override
  public long getClientTimestamp() {
    return clientTimestamp_;
  }

  public static final int PARTNER_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object partnerId_;
  /**
   * <code>string partner_id = 5;</code>
   * @return The partnerId.
   */
  @java.lang.Override
  public java.lang.String getPartnerId() {
    java.lang.Object ref = partnerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partnerId_ = s;
      return s;
    }
  }
  /**
   * <code>string partner_id = 5;</code>
   * @return The bytes for partnerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartnerIdBytes() {
    java.lang.Object ref = partnerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partnerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_SPENT_FIELD_NUMBER = 6;
  private long timeSpent_;
  /**
   * <code>int64 time_spent = 6;</code>
   * @return The timeSpent.
   */
  @java.lang.Override
  public long getTimeSpent() {
    return timeSpent_;
  }

  public static final int CAMPAIGN_ID_FIELD_NUMBER = 7;
  private volatile java.lang.Object campaignId_;
  /**
   * <code>string campaign_id = 7;</code>
   * @return The campaignId.
   */
  @java.lang.Override
  public java.lang.String getCampaignId() {
    java.lang.Object ref = campaignId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaignId_ = s;
      return s;
    }
  }
  /**
   * <code>string campaign_id = 7;</code>
   * @return The bytes for campaignId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignIdBytes() {
    java.lang.Object ref = campaignId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaignId_ = b;
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
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fortId_);
    }
    if (fortType_ != 0) {
      output.writeInt32(3, fortType_);
    }
    if (clientTimestamp_ != 0L) {
      output.writeInt64(4, clientTimestamp_);
    }
    if (!getPartnerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, partnerId_);
    }
    if (timeSpent_ != 0L) {
      output.writeInt64(6, timeSpent_);
    }
    if (!getCampaignIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, campaignId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fortId_);
    }
    if (fortType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fortType_);
    }
    if (clientTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, clientTimestamp_);
    }
    if (!getPartnerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, partnerId_);
    }
    if (timeSpent_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, timeSpent_);
    }
    if (!getCampaignIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, campaignId_);
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
    if (!(obj instanceof POGOProtos.Rpc.LeavePointOfInterestTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LeavePointOfInterestTelemetry other = (POGOProtos.Rpc.LeavePointOfInterestTelemetry) obj;

    if (!getResult()
        .equals(other.getResult())) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (getFortType()
        != other.getFortType()) return false;
    if (getClientTimestamp()
        != other.getClientTimestamp()) return false;
    if (!getPartnerId()
        .equals(other.getPartnerId())) return false;
    if (getTimeSpent()
        != other.getTimeSpent()) return false;
    if (!getCampaignId()
        .equals(other.getCampaignId())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + FORT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFortType();
    hash = (37 * hash) + CLIENT_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientTimestamp());
    hash = (37 * hash) + PARTNER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPartnerId().hashCode();
    hash = (37 * hash) + TIME_SPENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeSpent());
    hash = (37 * hash) + CAMPAIGN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCampaignId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LeavePointOfInterestTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LeavePointOfInterestTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LeavePointOfInterestTelemetry)
      POGOProtos.Rpc.LeavePointOfInterestTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LeavePointOfInterestTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LeavePointOfInterestTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LeavePointOfInterestTelemetry.class, POGOProtos.Rpc.LeavePointOfInterestTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LeavePointOfInterestTelemetry.newBuilder()
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
      result_ = "";

      fortId_ = "";

      fortType_ = 0;

      clientTimestamp_ = 0L;

      partnerId_ = "";

      timeSpent_ = 0L;

      campaignId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LeavePointOfInterestTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LeavePointOfInterestTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.LeavePointOfInterestTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LeavePointOfInterestTelemetry build() {
      POGOProtos.Rpc.LeavePointOfInterestTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LeavePointOfInterestTelemetry buildPartial() {
      POGOProtos.Rpc.LeavePointOfInterestTelemetry result = new POGOProtos.Rpc.LeavePointOfInterestTelemetry(this);
      result.result_ = result_;
      result.fortId_ = fortId_;
      result.fortType_ = fortType_;
      result.clientTimestamp_ = clientTimestamp_;
      result.partnerId_ = partnerId_;
      result.timeSpent_ = timeSpent_;
      result.campaignId_ = campaignId_;
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
      if (other instanceof POGOProtos.Rpc.LeavePointOfInterestTelemetry) {
        return mergeFrom((POGOProtos.Rpc.LeavePointOfInterestTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LeavePointOfInterestTelemetry other) {
      if (other == POGOProtos.Rpc.LeavePointOfInterestTelemetry.getDefaultInstance()) return this;
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getFortType() != 0) {
        setFortType(other.getFortType());
      }
      if (other.getClientTimestamp() != 0L) {
        setClientTimestamp(other.getClientTimestamp());
      }
      if (!other.getPartnerId().isEmpty()) {
        partnerId_ = other.partnerId_;
        onChanged();
      }
      if (other.getTimeSpent() != 0L) {
        setTimeSpent(other.getTimeSpent());
      }
      if (!other.getCampaignId().isEmpty()) {
        campaignId_ = other.campaignId_;
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
      POGOProtos.Rpc.LeavePointOfInterestTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LeavePointOfInterestTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 2;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private int fortType_ ;
    /**
     * <code>int32 fort_type = 3;</code>
     * @return The fortType.
     */
    @java.lang.Override
    public int getFortType() {
      return fortType_;
    }
    /**
     * <code>int32 fort_type = 3;</code>
     * @param value The fortType to set.
     * @return This builder for chaining.
     */
    public Builder setFortType(int value) {
      
      fortType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fort_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortType() {
      
      fortType_ = 0;
      onChanged();
      return this;
    }

    private long clientTimestamp_ ;
    /**
     * <code>int64 client_timestamp = 4;</code>
     * @return The clientTimestamp.
     */
    @java.lang.Override
    public long getClientTimestamp() {
      return clientTimestamp_;
    }
    /**
     * <code>int64 client_timestamp = 4;</code>
     * @param value The clientTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setClientTimestamp(long value) {
      
      clientTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_timestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientTimestamp() {
      
      clientTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object partnerId_ = "";
    /**
     * <code>string partner_id = 5;</code>
     * @return The partnerId.
     */
    public java.lang.String getPartnerId() {
      java.lang.Object ref = partnerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partnerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string partner_id = 5;</code>
     * @return The bytes for partnerId.
     */
    public com.google.protobuf.ByteString
        getPartnerIdBytes() {
      java.lang.Object ref = partnerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partnerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string partner_id = 5;</code>
     * @param value The partnerId to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partnerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string partner_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartnerId() {
      
      partnerId_ = getDefaultInstance().getPartnerId();
      onChanged();
      return this;
    }
    /**
     * <code>string partner_id = 5;</code>
     * @param value The bytes for partnerId to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partnerId_ = value;
      onChanged();
      return this;
    }

    private long timeSpent_ ;
    /**
     * <code>int64 time_spent = 6;</code>
     * @return The timeSpent.
     */
    @java.lang.Override
    public long getTimeSpent() {
      return timeSpent_;
    }
    /**
     * <code>int64 time_spent = 6;</code>
     * @param value The timeSpent to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSpent(long value) {
      
      timeSpent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time_spent = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeSpent() {
      
      timeSpent_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object campaignId_ = "";
    /**
     * <code>string campaign_id = 7;</code>
     * @return The campaignId.
     */
    public java.lang.String getCampaignId() {
      java.lang.Object ref = campaignId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaignId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string campaign_id = 7;</code>
     * @return The bytes for campaignId.
     */
    public com.google.protobuf.ByteString
        getCampaignIdBytes() {
      java.lang.Object ref = campaignId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaignId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string campaign_id = 7;</code>
     * @param value The campaignId to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaignId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string campaign_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignId() {
      
      campaignId_ = getDefaultInstance().getCampaignId();
      onChanged();
      return this;
    }
    /**
     * <code>string campaign_id = 7;</code>
     * @param value The bytes for campaignId to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaignId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LeavePointOfInterestTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LeavePointOfInterestTelemetry)
  private static final POGOProtos.Rpc.LeavePointOfInterestTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LeavePointOfInterestTelemetry();
  }

  public static POGOProtos.Rpc.LeavePointOfInterestTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeavePointOfInterestTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<LeavePointOfInterestTelemetry>() {
    @java.lang.Override
    public LeavePointOfInterestTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LeavePointOfInterestTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeavePointOfInterestTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeavePointOfInterestTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LeavePointOfInterestTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

