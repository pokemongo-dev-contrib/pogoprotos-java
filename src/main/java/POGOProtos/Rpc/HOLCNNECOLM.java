// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.HOLCNNECOLM}
 */
public  final class HOLCNNECOLM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HOLCNNECOLM)
    HOLCNNECOLMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HOLCNNECOLM.newBuilder() to construct.
  private HOLCNNECOLM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HOLCNNECOLM() {
    idjicgcgnhf_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HOLCNNECOLM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HOLCNNECOLM(
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

            idjicgcgnhf_ = rawValue;
            break;
          }
          case 16: {

            lgdombnkbfe_ = input.readInt32();
            break;
          }
          case 24: {

            cnmmajabmnb_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HOLCNNECOLM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HOLCNNECOLM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HOLCNNECOLM.class, POGOProtos.Rpc.HOLCNNECOLM.Builder.class);
  }

  public static final int IDJICGCGNHF_FIELD_NUMBER = 1;
  private int idjicgcgnhf_;
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
   * @return The enum numeric value on the wire for idjicgcgnhf.
   */
  public int getIdjicgcgnhfValue() {
    return idjicgcgnhf_;
  }
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
   * @return The idjicgcgnhf.
   */
  public POGOProtos.Rpc.BattlePartyTelemetryIds getIdjicgcgnhf() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(idjicgcgnhf_);
    return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int LGDOMBNKBFE_FIELD_NUMBER = 2;
  private int lgdombnkbfe_;
  /**
   * <code>int32 lgdombnkbfe = 2;</code>
   * @return The lgdombnkbfe.
   */
  public int getLgdombnkbfe() {
    return lgdombnkbfe_;
  }

  public static final int CNMMAJABMNB_FIELD_NUMBER = 3;
  private int cnmmajabmnb_;
  /**
   * <code>int32 cnmmajabmnb = 3;</code>
   * @return The cnmmajabmnb.
   */
  public int getCnmmajabmnb() {
    return cnmmajabmnb_;
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
    if (idjicgcgnhf_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      output.writeEnum(1, idjicgcgnhf_);
    }
    if (lgdombnkbfe_ != 0) {
      output.writeInt32(2, lgdombnkbfe_);
    }
    if (cnmmajabmnb_ != 0) {
      output.writeInt32(3, cnmmajabmnb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idjicgcgnhf_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, idjicgcgnhf_);
    }
    if (lgdombnkbfe_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, lgdombnkbfe_);
    }
    if (cnmmajabmnb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cnmmajabmnb_);
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
    if (!(obj instanceof POGOProtos.Rpc.HOLCNNECOLM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HOLCNNECOLM other = (POGOProtos.Rpc.HOLCNNECOLM) obj;

    if (idjicgcgnhf_ != other.idjicgcgnhf_) return false;
    if (getLgdombnkbfe()
        != other.getLgdombnkbfe()) return false;
    if (getCnmmajabmnb()
        != other.getCnmmajabmnb()) return false;
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
    hash = (37 * hash) + IDJICGCGNHF_FIELD_NUMBER;
    hash = (53 * hash) + idjicgcgnhf_;
    hash = (37 * hash) + LGDOMBNKBFE_FIELD_NUMBER;
    hash = (53 * hash) + getLgdombnkbfe();
    hash = (37 * hash) + CNMMAJABMNB_FIELD_NUMBER;
    hash = (53 * hash) + getCnmmajabmnb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HOLCNNECOLM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HOLCNNECOLM prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.HOLCNNECOLM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HOLCNNECOLM)
      POGOProtos.Rpc.HOLCNNECOLMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HOLCNNECOLM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HOLCNNECOLM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HOLCNNECOLM.class, POGOProtos.Rpc.HOLCNNECOLM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HOLCNNECOLM.newBuilder()
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
      idjicgcgnhf_ = 0;

      lgdombnkbfe_ = 0;

      cnmmajabmnb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HOLCNNECOLM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HOLCNNECOLM getDefaultInstanceForType() {
      return POGOProtos.Rpc.HOLCNNECOLM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HOLCNNECOLM build() {
      POGOProtos.Rpc.HOLCNNECOLM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HOLCNNECOLM buildPartial() {
      POGOProtos.Rpc.HOLCNNECOLM result = new POGOProtos.Rpc.HOLCNNECOLM(this);
      result.idjicgcgnhf_ = idjicgcgnhf_;
      result.lgdombnkbfe_ = lgdombnkbfe_;
      result.cnmmajabmnb_ = cnmmajabmnb_;
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
      if (other instanceof POGOProtos.Rpc.HOLCNNECOLM) {
        return mergeFrom((POGOProtos.Rpc.HOLCNNECOLM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HOLCNNECOLM other) {
      if (other == POGOProtos.Rpc.HOLCNNECOLM.getDefaultInstance()) return this;
      if (other.idjicgcgnhf_ != 0) {
        setIdjicgcgnhfValue(other.getIdjicgcgnhfValue());
      }
      if (other.getLgdombnkbfe() != 0) {
        setLgdombnkbfe(other.getLgdombnkbfe());
      }
      if (other.getCnmmajabmnb() != 0) {
        setCnmmajabmnb(other.getCnmmajabmnb());
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
      POGOProtos.Rpc.HOLCNNECOLM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HOLCNNECOLM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idjicgcgnhf_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
     * @return The enum numeric value on the wire for idjicgcgnhf.
     */
    public int getIdjicgcgnhfValue() {
      return idjicgcgnhf_;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
     * @param value The enum numeric value on the wire for idjicgcgnhf to set.
     * @return This builder for chaining.
     */
    public Builder setIdjicgcgnhfValue(int value) {
      idjicgcgnhf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
     * @return The idjicgcgnhf.
     */
    public POGOProtos.Rpc.BattlePartyTelemetryIds getIdjicgcgnhf() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(idjicgcgnhf_);
      return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
     * @param value The idjicgcgnhf to set.
     * @return This builder for chaining.
     */
    public Builder setIdjicgcgnhf(POGOProtos.Rpc.BattlePartyTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      idjicgcgnhf_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds idjicgcgnhf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdjicgcgnhf() {
      
      idjicgcgnhf_ = 0;
      onChanged();
      return this;
    }

    private int lgdombnkbfe_ ;
    /**
     * <code>int32 lgdombnkbfe = 2;</code>
     * @return The lgdombnkbfe.
     */
    public int getLgdombnkbfe() {
      return lgdombnkbfe_;
    }
    /**
     * <code>int32 lgdombnkbfe = 2;</code>
     * @param value The lgdombnkbfe to set.
     * @return This builder for chaining.
     */
    public Builder setLgdombnkbfe(int value) {
      
      lgdombnkbfe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lgdombnkbfe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLgdombnkbfe() {
      
      lgdombnkbfe_ = 0;
      onChanged();
      return this;
    }

    private int cnmmajabmnb_ ;
    /**
     * <code>int32 cnmmajabmnb = 3;</code>
     * @return The cnmmajabmnb.
     */
    public int getCnmmajabmnb() {
      return cnmmajabmnb_;
    }
    /**
     * <code>int32 cnmmajabmnb = 3;</code>
     * @param value The cnmmajabmnb to set.
     * @return This builder for chaining.
     */
    public Builder setCnmmajabmnb(int value) {
      
      cnmmajabmnb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cnmmajabmnb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCnmmajabmnb() {
      
      cnmmajabmnb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HOLCNNECOLM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HOLCNNECOLM)
  private static final POGOProtos.Rpc.HOLCNNECOLM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HOLCNNECOLM();
  }

  public static POGOProtos.Rpc.HOLCNNECOLM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HOLCNNECOLM>
      PARSER = new com.google.protobuf.AbstractParser<HOLCNNECOLM>() {
    @java.lang.Override
    public HOLCNNECOLM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HOLCNNECOLM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HOLCNNECOLM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HOLCNNECOLM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HOLCNNECOLM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

