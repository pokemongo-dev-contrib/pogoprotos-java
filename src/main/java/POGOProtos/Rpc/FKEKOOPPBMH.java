// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FKEKOOPPBMH}
 */
public  final class FKEKOOPPBMH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FKEKOOPPBMH)
    FKEKOOPPBMHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FKEKOOPPBMH.newBuilder() to construct.
  private FKEKOOPPBMH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FKEKOOPPBMH() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FKEKOOPPBMH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FKEKOOPPBMH(
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

            abnaddnlfgf_ = input.readInt32();
            break;
          }
          case 16: {

            dgeikommhca_ = input.readInt32();
            break;
          }
          case 24: {

            fpgdmcphebo_ = input.readBool();
            break;
          }
          case 34: {
            POGOProtos.Rpc.HGIFGAEOAAI.Builder subBuilder = null;
            if (ohmfeaihjdp_ != null) {
              subBuilder = ohmfeaihjdp_.toBuilder();
            }
            ohmfeaihjdp_ = input.readMessage(POGOProtos.Rpc.HGIFGAEOAAI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ohmfeaihjdp_);
              ohmfeaihjdp_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FKEKOOPPBMH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FKEKOOPPBMH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FKEKOOPPBMH.class, POGOProtos.Rpc.FKEKOOPPBMH.Builder.class);
  }

  public static final int ABNADDNLFGF_FIELD_NUMBER = 1;
  private int abnaddnlfgf_;
  /**
   * <code>int32 abnaddnlfgf = 1;</code>
   * @return The abnaddnlfgf.
   */
  public int getAbnaddnlfgf() {
    return abnaddnlfgf_;
  }

  public static final int DGEIKOMMHCA_FIELD_NUMBER = 2;
  private int dgeikommhca_;
  /**
   * <code>int32 dgeikommhca = 2;</code>
   * @return The dgeikommhca.
   */
  public int getDgeikommhca() {
    return dgeikommhca_;
  }

  public static final int FPGDMCPHEBO_FIELD_NUMBER = 3;
  private boolean fpgdmcphebo_;
  /**
   * <code>bool fpgdmcphebo = 3;</code>
   * @return The fpgdmcphebo.
   */
  public boolean getFpgdmcphebo() {
    return fpgdmcphebo_;
  }

  public static final int OHMFEAIHJDP_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp_;
  /**
   * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
   * @return Whether the ohmfeaihjdp field is set.
   */
  public boolean hasOhmfeaihjdp() {
    return ohmfeaihjdp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
   * @return The ohmfeaihjdp.
   */
  public POGOProtos.Rpc.HGIFGAEOAAI getOhmfeaihjdp() {
    return ohmfeaihjdp_ == null ? POGOProtos.Rpc.HGIFGAEOAAI.getDefaultInstance() : ohmfeaihjdp_;
  }
  /**
   * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
   */
  public POGOProtos.Rpc.HGIFGAEOAAIOrBuilder getOhmfeaihjdpOrBuilder() {
    return getOhmfeaihjdp();
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
    if (abnaddnlfgf_ != 0) {
      output.writeInt32(1, abnaddnlfgf_);
    }
    if (dgeikommhca_ != 0) {
      output.writeInt32(2, dgeikommhca_);
    }
    if (fpgdmcphebo_ != false) {
      output.writeBool(3, fpgdmcphebo_);
    }
    if (ohmfeaihjdp_ != null) {
      output.writeMessage(4, getOhmfeaihjdp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abnaddnlfgf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, abnaddnlfgf_);
    }
    if (dgeikommhca_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dgeikommhca_);
    }
    if (fpgdmcphebo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, fpgdmcphebo_);
    }
    if (ohmfeaihjdp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getOhmfeaihjdp());
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
    if (!(obj instanceof POGOProtos.Rpc.FKEKOOPPBMH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FKEKOOPPBMH other = (POGOProtos.Rpc.FKEKOOPPBMH) obj;

    if (getAbnaddnlfgf()
        != other.getAbnaddnlfgf()) return false;
    if (getDgeikommhca()
        != other.getDgeikommhca()) return false;
    if (getFpgdmcphebo()
        != other.getFpgdmcphebo()) return false;
    if (hasOhmfeaihjdp() != other.hasOhmfeaihjdp()) return false;
    if (hasOhmfeaihjdp()) {
      if (!getOhmfeaihjdp()
          .equals(other.getOhmfeaihjdp())) return false;
    }
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
    hash = (37 * hash) + ABNADDNLFGF_FIELD_NUMBER;
    hash = (53 * hash) + getAbnaddnlfgf();
    hash = (37 * hash) + DGEIKOMMHCA_FIELD_NUMBER;
    hash = (53 * hash) + getDgeikommhca();
    hash = (37 * hash) + FPGDMCPHEBO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFpgdmcphebo());
    if (hasOhmfeaihjdp()) {
      hash = (37 * hash) + OHMFEAIHJDP_FIELD_NUMBER;
      hash = (53 * hash) + getOhmfeaihjdp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FKEKOOPPBMH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FKEKOOPPBMH prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FKEKOOPPBMH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FKEKOOPPBMH)
      POGOProtos.Rpc.FKEKOOPPBMHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FKEKOOPPBMH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FKEKOOPPBMH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FKEKOOPPBMH.class, POGOProtos.Rpc.FKEKOOPPBMH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FKEKOOPPBMH.newBuilder()
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
      abnaddnlfgf_ = 0;

      dgeikommhca_ = 0;

      fpgdmcphebo_ = false;

      if (ohmfeaihjdpBuilder_ == null) {
        ohmfeaihjdp_ = null;
      } else {
        ohmfeaihjdp_ = null;
        ohmfeaihjdpBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FKEKOOPPBMH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FKEKOOPPBMH getDefaultInstanceForType() {
      return POGOProtos.Rpc.FKEKOOPPBMH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FKEKOOPPBMH build() {
      POGOProtos.Rpc.FKEKOOPPBMH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FKEKOOPPBMH buildPartial() {
      POGOProtos.Rpc.FKEKOOPPBMH result = new POGOProtos.Rpc.FKEKOOPPBMH(this);
      result.abnaddnlfgf_ = abnaddnlfgf_;
      result.dgeikommhca_ = dgeikommhca_;
      result.fpgdmcphebo_ = fpgdmcphebo_;
      if (ohmfeaihjdpBuilder_ == null) {
        result.ohmfeaihjdp_ = ohmfeaihjdp_;
      } else {
        result.ohmfeaihjdp_ = ohmfeaihjdpBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FKEKOOPPBMH) {
        return mergeFrom((POGOProtos.Rpc.FKEKOOPPBMH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FKEKOOPPBMH other) {
      if (other == POGOProtos.Rpc.FKEKOOPPBMH.getDefaultInstance()) return this;
      if (other.getAbnaddnlfgf() != 0) {
        setAbnaddnlfgf(other.getAbnaddnlfgf());
      }
      if (other.getDgeikommhca() != 0) {
        setDgeikommhca(other.getDgeikommhca());
      }
      if (other.getFpgdmcphebo() != false) {
        setFpgdmcphebo(other.getFpgdmcphebo());
      }
      if (other.hasOhmfeaihjdp()) {
        mergeOhmfeaihjdp(other.getOhmfeaihjdp());
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
      POGOProtos.Rpc.FKEKOOPPBMH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FKEKOOPPBMH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int abnaddnlfgf_ ;
    /**
     * <code>int32 abnaddnlfgf = 1;</code>
     * @return The abnaddnlfgf.
     */
    public int getAbnaddnlfgf() {
      return abnaddnlfgf_;
    }
    /**
     * <code>int32 abnaddnlfgf = 1;</code>
     * @param value The abnaddnlfgf to set.
     * @return This builder for chaining.
     */
    public Builder setAbnaddnlfgf(int value) {
      
      abnaddnlfgf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 abnaddnlfgf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbnaddnlfgf() {
      
      abnaddnlfgf_ = 0;
      onChanged();
      return this;
    }

    private int dgeikommhca_ ;
    /**
     * <code>int32 dgeikommhca = 2;</code>
     * @return The dgeikommhca.
     */
    public int getDgeikommhca() {
      return dgeikommhca_;
    }
    /**
     * <code>int32 dgeikommhca = 2;</code>
     * @param value The dgeikommhca to set.
     * @return This builder for chaining.
     */
    public Builder setDgeikommhca(int value) {
      
      dgeikommhca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dgeikommhca = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDgeikommhca() {
      
      dgeikommhca_ = 0;
      onChanged();
      return this;
    }

    private boolean fpgdmcphebo_ ;
    /**
     * <code>bool fpgdmcphebo = 3;</code>
     * @return The fpgdmcphebo.
     */
    public boolean getFpgdmcphebo() {
      return fpgdmcphebo_;
    }
    /**
     * <code>bool fpgdmcphebo = 3;</code>
     * @param value The fpgdmcphebo to set.
     * @return This builder for chaining.
     */
    public Builder setFpgdmcphebo(boolean value) {
      
      fpgdmcphebo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fpgdmcphebo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpgdmcphebo() {
      
      fpgdmcphebo_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HGIFGAEOAAI, POGOProtos.Rpc.HGIFGAEOAAI.Builder, POGOProtos.Rpc.HGIFGAEOAAIOrBuilder> ohmfeaihjdpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     * @return Whether the ohmfeaihjdp field is set.
     */
    public boolean hasOhmfeaihjdp() {
      return ohmfeaihjdpBuilder_ != null || ohmfeaihjdp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     * @return The ohmfeaihjdp.
     */
    public POGOProtos.Rpc.HGIFGAEOAAI getOhmfeaihjdp() {
      if (ohmfeaihjdpBuilder_ == null) {
        return ohmfeaihjdp_ == null ? POGOProtos.Rpc.HGIFGAEOAAI.getDefaultInstance() : ohmfeaihjdp_;
      } else {
        return ohmfeaihjdpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public Builder setOhmfeaihjdp(POGOProtos.Rpc.HGIFGAEOAAI value) {
      if (ohmfeaihjdpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ohmfeaihjdp_ = value;
        onChanged();
      } else {
        ohmfeaihjdpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public Builder setOhmfeaihjdp(
        POGOProtos.Rpc.HGIFGAEOAAI.Builder builderForValue) {
      if (ohmfeaihjdpBuilder_ == null) {
        ohmfeaihjdp_ = builderForValue.build();
        onChanged();
      } else {
        ohmfeaihjdpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public Builder mergeOhmfeaihjdp(POGOProtos.Rpc.HGIFGAEOAAI value) {
      if (ohmfeaihjdpBuilder_ == null) {
        if (ohmfeaihjdp_ != null) {
          ohmfeaihjdp_ =
            POGOProtos.Rpc.HGIFGAEOAAI.newBuilder(ohmfeaihjdp_).mergeFrom(value).buildPartial();
        } else {
          ohmfeaihjdp_ = value;
        }
        onChanged();
      } else {
        ohmfeaihjdpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public Builder clearOhmfeaihjdp() {
      if (ohmfeaihjdpBuilder_ == null) {
        ohmfeaihjdp_ = null;
        onChanged();
      } else {
        ohmfeaihjdp_ = null;
        ohmfeaihjdpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public POGOProtos.Rpc.HGIFGAEOAAI.Builder getOhmfeaihjdpBuilder() {
      
      onChanged();
      return getOhmfeaihjdpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    public POGOProtos.Rpc.HGIFGAEOAAIOrBuilder getOhmfeaihjdpOrBuilder() {
      if (ohmfeaihjdpBuilder_ != null) {
        return ohmfeaihjdpBuilder_.getMessageOrBuilder();
      } else {
        return ohmfeaihjdp_ == null ?
            POGOProtos.Rpc.HGIFGAEOAAI.getDefaultInstance() : ohmfeaihjdp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HGIFGAEOAAI ohmfeaihjdp = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HGIFGAEOAAI, POGOProtos.Rpc.HGIFGAEOAAI.Builder, POGOProtos.Rpc.HGIFGAEOAAIOrBuilder> 
        getOhmfeaihjdpFieldBuilder() {
      if (ohmfeaihjdpBuilder_ == null) {
        ohmfeaihjdpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HGIFGAEOAAI, POGOProtos.Rpc.HGIFGAEOAAI.Builder, POGOProtos.Rpc.HGIFGAEOAAIOrBuilder>(
                getOhmfeaihjdp(),
                getParentForChildren(),
                isClean());
        ohmfeaihjdp_ = null;
      }
      return ohmfeaihjdpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FKEKOOPPBMH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FKEKOOPPBMH)
  private static final POGOProtos.Rpc.FKEKOOPPBMH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FKEKOOPPBMH();
  }

  public static POGOProtos.Rpc.FKEKOOPPBMH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FKEKOOPPBMH>
      PARSER = new com.google.protobuf.AbstractParser<FKEKOOPPBMH>() {
    @java.lang.Override
    public FKEKOOPPBMH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FKEKOOPPBMH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FKEKOOPPBMH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FKEKOOPPBMH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FKEKOOPPBMH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

