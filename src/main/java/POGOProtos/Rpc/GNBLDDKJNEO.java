// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GNBLDDKJNEO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GNBLDDKJNEO}
 */
public final class GNBLDDKJNEO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GNBLDDKJNEO)
    GNBLDDKJNEOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GNBLDDKJNEO.newBuilder() to construct.
  private GNBLDDKJNEO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GNBLDDKJNEO() {
    mgbpihkfkha_ = 0;
    egheindpgam_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GNBLDDKJNEO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GNBLDDKJNEO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            mgbpihkfkha_ = rawValue;
            break;
          }
          case 16: {

            ionceomkpmm_ = input.readInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              egheindpgam_ = new java.util.ArrayList<POGOProtos.Rpc.MIKCBCMBLEC>();
              mutable_bitField0_ |= 0x00000001;
            }
            egheindpgam_.add(
                input.readMessage(POGOProtos.Rpc.MIKCBCMBLEC.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        egheindpgam_ = java.util.Collections.unmodifiableList(egheindpgam_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GNBLDDKJNEO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GNBLDDKJNEO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GNBLDDKJNEO.class, POGOProtos.Rpc.GNBLDDKJNEO.Builder.class);
  }

  public static final int MGBPIHKFKHA_FIELD_NUMBER = 1;
  private int mgbpihkfkha_;
  /**
   * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
   * @return The enum numeric value on the wire for mgbpihkfkha.
   */
  @java.lang.Override public int getMgbpihkfkhaValue() {
    return mgbpihkfkha_;
  }
  /**
   * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
   * @return The mgbpihkfkha.
   */
  @java.lang.Override public POGOProtos.Rpc.NKOIBBOJHJM getMgbpihkfkha() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NKOIBBOJHJM result = POGOProtos.Rpc.NKOIBBOJHJM.valueOf(mgbpihkfkha_);
    return result == null ? POGOProtos.Rpc.NKOIBBOJHJM.UNRECOGNIZED : result;
  }

  public static final int IONCEOMKPMM_FIELD_NUMBER = 2;
  private int ionceomkpmm_;
  /**
   * <code>int32 ionceomkpmm = 2;</code>
   * @return The ionceomkpmm.
   */
  @java.lang.Override
  public int getIonceomkpmm() {
    return ionceomkpmm_;
  }

  public static final int EGHEINDPGAM_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.MIKCBCMBLEC> egheindpgam_;
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.MIKCBCMBLEC> getEgheindpgamList() {
    return egheindpgam_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.MIKCBCMBLECOrBuilder> 
      getEgheindpgamOrBuilderList() {
    return egheindpgam_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
   */
  @java.lang.Override
  public int getEgheindpgamCount() {
    return egheindpgam_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MIKCBCMBLEC getEgheindpgam(int index) {
    return egheindpgam_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MIKCBCMBLECOrBuilder getEgheindpgamOrBuilder(
      int index) {
    return egheindpgam_.get(index);
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
    if (mgbpihkfkha_ != POGOProtos.Rpc.NKOIBBOJHJM.NKOIBBOJHJM_FAMILY_UNSET.getNumber()) {
      output.writeEnum(1, mgbpihkfkha_);
    }
    if (ionceomkpmm_ != 0) {
      output.writeInt32(2, ionceomkpmm_);
    }
    for (int i = 0; i < egheindpgam_.size(); i++) {
      output.writeMessage(3, egheindpgam_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mgbpihkfkha_ != POGOProtos.Rpc.NKOIBBOJHJM.NKOIBBOJHJM_FAMILY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mgbpihkfkha_);
    }
    if (ionceomkpmm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ionceomkpmm_);
    }
    for (int i = 0; i < egheindpgam_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, egheindpgam_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GNBLDDKJNEO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GNBLDDKJNEO other = (POGOProtos.Rpc.GNBLDDKJNEO) obj;

    if (mgbpihkfkha_ != other.mgbpihkfkha_) return false;
    if (getIonceomkpmm()
        != other.getIonceomkpmm()) return false;
    if (!getEgheindpgamList()
        .equals(other.getEgheindpgamList())) return false;
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
    hash = (37 * hash) + MGBPIHKFKHA_FIELD_NUMBER;
    hash = (53 * hash) + mgbpihkfkha_;
    hash = (37 * hash) + IONCEOMKPMM_FIELD_NUMBER;
    hash = (53 * hash) + getIonceomkpmm();
    if (getEgheindpgamCount() > 0) {
      hash = (37 * hash) + EGHEINDPGAM_FIELD_NUMBER;
      hash = (53 * hash) + getEgheindpgamList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GNBLDDKJNEO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GNBLDDKJNEO prototype) {
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
   * ref: GNBLDDKJNEO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GNBLDDKJNEO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GNBLDDKJNEO)
      POGOProtos.Rpc.GNBLDDKJNEOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GNBLDDKJNEO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GNBLDDKJNEO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GNBLDDKJNEO.class, POGOProtos.Rpc.GNBLDDKJNEO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GNBLDDKJNEO.newBuilder()
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
        getEgheindpgamFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mgbpihkfkha_ = 0;

      ionceomkpmm_ = 0;

      if (egheindpgamBuilder_ == null) {
        egheindpgam_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        egheindpgamBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GNBLDDKJNEO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GNBLDDKJNEO getDefaultInstanceForType() {
      return POGOProtos.Rpc.GNBLDDKJNEO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GNBLDDKJNEO build() {
      POGOProtos.Rpc.GNBLDDKJNEO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GNBLDDKJNEO buildPartial() {
      POGOProtos.Rpc.GNBLDDKJNEO result = new POGOProtos.Rpc.GNBLDDKJNEO(this);
      int from_bitField0_ = bitField0_;
      result.mgbpihkfkha_ = mgbpihkfkha_;
      result.ionceomkpmm_ = ionceomkpmm_;
      if (egheindpgamBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          egheindpgam_ = java.util.Collections.unmodifiableList(egheindpgam_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.egheindpgam_ = egheindpgam_;
      } else {
        result.egheindpgam_ = egheindpgamBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.GNBLDDKJNEO) {
        return mergeFrom((POGOProtos.Rpc.GNBLDDKJNEO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GNBLDDKJNEO other) {
      if (other == POGOProtos.Rpc.GNBLDDKJNEO.getDefaultInstance()) return this;
      if (other.mgbpihkfkha_ != 0) {
        setMgbpihkfkhaValue(other.getMgbpihkfkhaValue());
      }
      if (other.getIonceomkpmm() != 0) {
        setIonceomkpmm(other.getIonceomkpmm());
      }
      if (egheindpgamBuilder_ == null) {
        if (!other.egheindpgam_.isEmpty()) {
          if (egheindpgam_.isEmpty()) {
            egheindpgam_ = other.egheindpgam_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEgheindpgamIsMutable();
            egheindpgam_.addAll(other.egheindpgam_);
          }
          onChanged();
        }
      } else {
        if (!other.egheindpgam_.isEmpty()) {
          if (egheindpgamBuilder_.isEmpty()) {
            egheindpgamBuilder_.dispose();
            egheindpgamBuilder_ = null;
            egheindpgam_ = other.egheindpgam_;
            bitField0_ = (bitField0_ & ~0x00000001);
            egheindpgamBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEgheindpgamFieldBuilder() : null;
          } else {
            egheindpgamBuilder_.addAllMessages(other.egheindpgam_);
          }
        }
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
      POGOProtos.Rpc.GNBLDDKJNEO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GNBLDDKJNEO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mgbpihkfkha_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
     * @return The enum numeric value on the wire for mgbpihkfkha.
     */
    @java.lang.Override public int getMgbpihkfkhaValue() {
      return mgbpihkfkha_;
    }
    /**
     * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
     * @param value The enum numeric value on the wire for mgbpihkfkha to set.
     * @return This builder for chaining.
     */
    public Builder setMgbpihkfkhaValue(int value) {
      
      mgbpihkfkha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
     * @return The mgbpihkfkha.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NKOIBBOJHJM getMgbpihkfkha() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NKOIBBOJHJM result = POGOProtos.Rpc.NKOIBBOJHJM.valueOf(mgbpihkfkha_);
      return result == null ? POGOProtos.Rpc.NKOIBBOJHJM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
     * @param value The mgbpihkfkha to set.
     * @return This builder for chaining.
     */
    public Builder setMgbpihkfkha(POGOProtos.Rpc.NKOIBBOJHJM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mgbpihkfkha_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NKOIBBOJHJM mgbpihkfkha = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgbpihkfkha() {
      
      mgbpihkfkha_ = 0;
      onChanged();
      return this;
    }

    private int ionceomkpmm_ ;
    /**
     * <code>int32 ionceomkpmm = 2;</code>
     * @return The ionceomkpmm.
     */
    @java.lang.Override
    public int getIonceomkpmm() {
      return ionceomkpmm_;
    }
    /**
     * <code>int32 ionceomkpmm = 2;</code>
     * @param value The ionceomkpmm to set.
     * @return This builder for chaining.
     */
    public Builder setIonceomkpmm(int value) {
      
      ionceomkpmm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ionceomkpmm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIonceomkpmm() {
      
      ionceomkpmm_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.MIKCBCMBLEC> egheindpgam_ =
      java.util.Collections.emptyList();
    private void ensureEgheindpgamIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        egheindpgam_ = new java.util.ArrayList<POGOProtos.Rpc.MIKCBCMBLEC>(egheindpgam_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MIKCBCMBLEC, POGOProtos.Rpc.MIKCBCMBLEC.Builder, POGOProtos.Rpc.MIKCBCMBLECOrBuilder> egheindpgamBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.MIKCBCMBLEC> getEgheindpgamList() {
      if (egheindpgamBuilder_ == null) {
        return java.util.Collections.unmodifiableList(egheindpgam_);
      } else {
        return egheindpgamBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public int getEgheindpgamCount() {
      if (egheindpgamBuilder_ == null) {
        return egheindpgam_.size();
      } else {
        return egheindpgamBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public POGOProtos.Rpc.MIKCBCMBLEC getEgheindpgam(int index) {
      if (egheindpgamBuilder_ == null) {
        return egheindpgam_.get(index);
      } else {
        return egheindpgamBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder setEgheindpgam(
        int index, POGOProtos.Rpc.MIKCBCMBLEC value) {
      if (egheindpgamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEgheindpgamIsMutable();
        egheindpgam_.set(index, value);
        onChanged();
      } else {
        egheindpgamBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder setEgheindpgam(
        int index, POGOProtos.Rpc.MIKCBCMBLEC.Builder builderForValue) {
      if (egheindpgamBuilder_ == null) {
        ensureEgheindpgamIsMutable();
        egheindpgam_.set(index, builderForValue.build());
        onChanged();
      } else {
        egheindpgamBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder addEgheindpgam(POGOProtos.Rpc.MIKCBCMBLEC value) {
      if (egheindpgamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEgheindpgamIsMutable();
        egheindpgam_.add(value);
        onChanged();
      } else {
        egheindpgamBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder addEgheindpgam(
        int index, POGOProtos.Rpc.MIKCBCMBLEC value) {
      if (egheindpgamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEgheindpgamIsMutable();
        egheindpgam_.add(index, value);
        onChanged();
      } else {
        egheindpgamBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder addEgheindpgam(
        POGOProtos.Rpc.MIKCBCMBLEC.Builder builderForValue) {
      if (egheindpgamBuilder_ == null) {
        ensureEgheindpgamIsMutable();
        egheindpgam_.add(builderForValue.build());
        onChanged();
      } else {
        egheindpgamBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder addEgheindpgam(
        int index, POGOProtos.Rpc.MIKCBCMBLEC.Builder builderForValue) {
      if (egheindpgamBuilder_ == null) {
        ensureEgheindpgamIsMutable();
        egheindpgam_.add(index, builderForValue.build());
        onChanged();
      } else {
        egheindpgamBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder addAllEgheindpgam(
        java.lang.Iterable<? extends POGOProtos.Rpc.MIKCBCMBLEC> values) {
      if (egheindpgamBuilder_ == null) {
        ensureEgheindpgamIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, egheindpgam_);
        onChanged();
      } else {
        egheindpgamBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder clearEgheindpgam() {
      if (egheindpgamBuilder_ == null) {
        egheindpgam_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        egheindpgamBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public Builder removeEgheindpgam(int index) {
      if (egheindpgamBuilder_ == null) {
        ensureEgheindpgamIsMutable();
        egheindpgam_.remove(index);
        onChanged();
      } else {
        egheindpgamBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public POGOProtos.Rpc.MIKCBCMBLEC.Builder getEgheindpgamBuilder(
        int index) {
      return getEgheindpgamFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public POGOProtos.Rpc.MIKCBCMBLECOrBuilder getEgheindpgamOrBuilder(
        int index) {
      if (egheindpgamBuilder_ == null) {
        return egheindpgam_.get(index);  } else {
        return egheindpgamBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.MIKCBCMBLECOrBuilder> 
         getEgheindpgamOrBuilderList() {
      if (egheindpgamBuilder_ != null) {
        return egheindpgamBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(egheindpgam_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public POGOProtos.Rpc.MIKCBCMBLEC.Builder addEgheindpgamBuilder() {
      return getEgheindpgamFieldBuilder().addBuilder(
          POGOProtos.Rpc.MIKCBCMBLEC.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public POGOProtos.Rpc.MIKCBCMBLEC.Builder addEgheindpgamBuilder(
        int index) {
      return getEgheindpgamFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.MIKCBCMBLEC.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCBCMBLEC egheindpgam = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.MIKCBCMBLEC.Builder> 
         getEgheindpgamBuilderList() {
      return getEgheindpgamFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MIKCBCMBLEC, POGOProtos.Rpc.MIKCBCMBLEC.Builder, POGOProtos.Rpc.MIKCBCMBLECOrBuilder> 
        getEgheindpgamFieldBuilder() {
      if (egheindpgamBuilder_ == null) {
        egheindpgamBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.MIKCBCMBLEC, POGOProtos.Rpc.MIKCBCMBLEC.Builder, POGOProtos.Rpc.MIKCBCMBLECOrBuilder>(
                egheindpgam_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        egheindpgam_ = null;
      }
      return egheindpgamBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GNBLDDKJNEO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GNBLDDKJNEO)
  private static final POGOProtos.Rpc.GNBLDDKJNEO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GNBLDDKJNEO();
  }

  public static POGOProtos.Rpc.GNBLDDKJNEO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GNBLDDKJNEO>
      PARSER = new com.google.protobuf.AbstractParser<GNBLDDKJNEO>() {
    @java.lang.Override
    public GNBLDDKJNEO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GNBLDDKJNEO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GNBLDDKJNEO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GNBLDDKJNEO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GNBLDDKJNEO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

