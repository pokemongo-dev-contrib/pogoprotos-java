// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NNIIHGLOJFP}
 */
public  final class NNIIHGLOJFP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NNIIHGLOJFP)
    NNIIHGLOJFPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NNIIHGLOJFP.newBuilder() to construct.
  private NNIIHGLOJFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NNIIHGLOJFP() {
    hndllklopbp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NNIIHGLOJFP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NNIIHGLOJFP(
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

            hndllklopbp_ = s;
            break;
          }
          case 21: {

            gdglbgemhpo_ = input.readFloat();
            break;
          }
          case 29: {

            ngbicenagbj_ = input.readFloat();
            break;
          }
          case 37: {

            apoillcjihl_ = input.readFloat();
            break;
          }
          case 45: {

            jfoeamjdpgb_ = input.readFloat();
            break;
          }
          case 53: {

            cogflegcjhg_ = input.readFloat();
            break;
          }
          case 61: {

            abiinkcnfco_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNIIHGLOJFP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNIIHGLOJFP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NNIIHGLOJFP.class, POGOProtos.Rpc.NNIIHGLOJFP.Builder.class);
  }

  public static final int HNDLLKLOPBP_FIELD_NUMBER = 1;
  private volatile java.lang.Object hndllklopbp_;
  /**
   * <code>string hndllklopbp = 1;</code>
   * @return The hndllklopbp.
   */
  public java.lang.String getHndllklopbp() {
    java.lang.Object ref = hndllklopbp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hndllklopbp_ = s;
      return s;
    }
  }
  /**
   * <code>string hndllklopbp = 1;</code>
   * @return The bytes for hndllklopbp.
   */
  public com.google.protobuf.ByteString
      getHndllklopbpBytes() {
    java.lang.Object ref = hndllklopbp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hndllklopbp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GDGLBGEMHPO_FIELD_NUMBER = 2;
  private float gdglbgemhpo_;
  /**
   * <code>float gdglbgemhpo = 2;</code>
   * @return The gdglbgemhpo.
   */
  public float getGdglbgemhpo() {
    return gdglbgemhpo_;
  }

  public static final int NGBICENAGBJ_FIELD_NUMBER = 3;
  private float ngbicenagbj_;
  /**
   * <code>float ngbicenagbj = 3;</code>
   * @return The ngbicenagbj.
   */
  public float getNgbicenagbj() {
    return ngbicenagbj_;
  }

  public static final int APOILLCJIHL_FIELD_NUMBER = 4;
  private float apoillcjihl_;
  /**
   * <code>float apoillcjihl = 4;</code>
   * @return The apoillcjihl.
   */
  public float getApoillcjihl() {
    return apoillcjihl_;
  }

  public static final int JFOEAMJDPGB_FIELD_NUMBER = 5;
  private float jfoeamjdpgb_;
  /**
   * <code>float jfoeamjdpgb = 5;</code>
   * @return The jfoeamjdpgb.
   */
  public float getJfoeamjdpgb() {
    return jfoeamjdpgb_;
  }

  public static final int COGFLEGCJHG_FIELD_NUMBER = 6;
  private float cogflegcjhg_;
  /**
   * <code>float cogflegcjhg = 6;</code>
   * @return The cogflegcjhg.
   */
  public float getCogflegcjhg() {
    return cogflegcjhg_;
  }

  public static final int ABIINKCNFCO_FIELD_NUMBER = 7;
  private float abiinkcnfco_;
  /**
   * <code>float abiinkcnfco = 7;</code>
   * @return The abiinkcnfco.
   */
  public float getAbiinkcnfco() {
    return abiinkcnfco_;
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
    if (!getHndllklopbpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hndllklopbp_);
    }
    if (gdglbgemhpo_ != 0F) {
      output.writeFloat(2, gdglbgemhpo_);
    }
    if (ngbicenagbj_ != 0F) {
      output.writeFloat(3, ngbicenagbj_);
    }
    if (apoillcjihl_ != 0F) {
      output.writeFloat(4, apoillcjihl_);
    }
    if (jfoeamjdpgb_ != 0F) {
      output.writeFloat(5, jfoeamjdpgb_);
    }
    if (cogflegcjhg_ != 0F) {
      output.writeFloat(6, cogflegcjhg_);
    }
    if (abiinkcnfco_ != 0F) {
      output.writeFloat(7, abiinkcnfco_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHndllklopbpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hndllklopbp_);
    }
    if (gdglbgemhpo_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, gdglbgemhpo_);
    }
    if (ngbicenagbj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, ngbicenagbj_);
    }
    if (apoillcjihl_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, apoillcjihl_);
    }
    if (jfoeamjdpgb_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, jfoeamjdpgb_);
    }
    if (cogflegcjhg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, cogflegcjhg_);
    }
    if (abiinkcnfco_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, abiinkcnfco_);
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
    if (!(obj instanceof POGOProtos.Rpc.NNIIHGLOJFP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NNIIHGLOJFP other = (POGOProtos.Rpc.NNIIHGLOJFP) obj;

    if (!getHndllklopbp()
        .equals(other.getHndllklopbp())) return false;
    if (java.lang.Float.floatToIntBits(getGdglbgemhpo())
        != java.lang.Float.floatToIntBits(
            other.getGdglbgemhpo())) return false;
    if (java.lang.Float.floatToIntBits(getNgbicenagbj())
        != java.lang.Float.floatToIntBits(
            other.getNgbicenagbj())) return false;
    if (java.lang.Float.floatToIntBits(getApoillcjihl())
        != java.lang.Float.floatToIntBits(
            other.getApoillcjihl())) return false;
    if (java.lang.Float.floatToIntBits(getJfoeamjdpgb())
        != java.lang.Float.floatToIntBits(
            other.getJfoeamjdpgb())) return false;
    if (java.lang.Float.floatToIntBits(getCogflegcjhg())
        != java.lang.Float.floatToIntBits(
            other.getCogflegcjhg())) return false;
    if (java.lang.Float.floatToIntBits(getAbiinkcnfco())
        != java.lang.Float.floatToIntBits(
            other.getAbiinkcnfco())) return false;
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
    hash = (37 * hash) + HNDLLKLOPBP_FIELD_NUMBER;
    hash = (53 * hash) + getHndllklopbp().hashCode();
    hash = (37 * hash) + GDGLBGEMHPO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGdglbgemhpo());
    hash = (37 * hash) + NGBICENAGBJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNgbicenagbj());
    hash = (37 * hash) + APOILLCJIHL_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getApoillcjihl());
    hash = (37 * hash) + JFOEAMJDPGB_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getJfoeamjdpgb());
    hash = (37 * hash) + COGFLEGCJHG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCogflegcjhg());
    hash = (37 * hash) + ABIINKCNFCO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAbiinkcnfco());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNIIHGLOJFP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NNIIHGLOJFP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NNIIHGLOJFP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NNIIHGLOJFP)
      POGOProtos.Rpc.NNIIHGLOJFPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNIIHGLOJFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNIIHGLOJFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NNIIHGLOJFP.class, POGOProtos.Rpc.NNIIHGLOJFP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NNIIHGLOJFP.newBuilder()
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
      hndllklopbp_ = "";

      gdglbgemhpo_ = 0F;

      ngbicenagbj_ = 0F;

      apoillcjihl_ = 0F;

      jfoeamjdpgb_ = 0F;

      cogflegcjhg_ = 0F;

      abiinkcnfco_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNIIHGLOJFP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNIIHGLOJFP getDefaultInstanceForType() {
      return POGOProtos.Rpc.NNIIHGLOJFP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNIIHGLOJFP build() {
      POGOProtos.Rpc.NNIIHGLOJFP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNIIHGLOJFP buildPartial() {
      POGOProtos.Rpc.NNIIHGLOJFP result = new POGOProtos.Rpc.NNIIHGLOJFP(this);
      result.hndllklopbp_ = hndllklopbp_;
      result.gdglbgemhpo_ = gdglbgemhpo_;
      result.ngbicenagbj_ = ngbicenagbj_;
      result.apoillcjihl_ = apoillcjihl_;
      result.jfoeamjdpgb_ = jfoeamjdpgb_;
      result.cogflegcjhg_ = cogflegcjhg_;
      result.abiinkcnfco_ = abiinkcnfco_;
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
      if (other instanceof POGOProtos.Rpc.NNIIHGLOJFP) {
        return mergeFrom((POGOProtos.Rpc.NNIIHGLOJFP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NNIIHGLOJFP other) {
      if (other == POGOProtos.Rpc.NNIIHGLOJFP.getDefaultInstance()) return this;
      if (!other.getHndllklopbp().isEmpty()) {
        hndllklopbp_ = other.hndllklopbp_;
        onChanged();
      }
      if (other.getGdglbgemhpo() != 0F) {
        setGdglbgemhpo(other.getGdglbgemhpo());
      }
      if (other.getNgbicenagbj() != 0F) {
        setNgbicenagbj(other.getNgbicenagbj());
      }
      if (other.getApoillcjihl() != 0F) {
        setApoillcjihl(other.getApoillcjihl());
      }
      if (other.getJfoeamjdpgb() != 0F) {
        setJfoeamjdpgb(other.getJfoeamjdpgb());
      }
      if (other.getCogflegcjhg() != 0F) {
        setCogflegcjhg(other.getCogflegcjhg());
      }
      if (other.getAbiinkcnfco() != 0F) {
        setAbiinkcnfco(other.getAbiinkcnfco());
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
      POGOProtos.Rpc.NNIIHGLOJFP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NNIIHGLOJFP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hndllklopbp_ = "";
    /**
     * <code>string hndllklopbp = 1;</code>
     * @return The hndllklopbp.
     */
    public java.lang.String getHndllklopbp() {
      java.lang.Object ref = hndllklopbp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hndllklopbp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hndllklopbp = 1;</code>
     * @return The bytes for hndllklopbp.
     */
    public com.google.protobuf.ByteString
        getHndllklopbpBytes() {
      java.lang.Object ref = hndllklopbp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hndllklopbp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hndllklopbp = 1;</code>
     * @param value The hndllklopbp to set.
     * @return This builder for chaining.
     */
    public Builder setHndllklopbp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hndllklopbp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hndllklopbp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHndllklopbp() {
      
      hndllklopbp_ = getDefaultInstance().getHndllklopbp();
      onChanged();
      return this;
    }
    /**
     * <code>string hndllklopbp = 1;</code>
     * @param value The bytes for hndllklopbp to set.
     * @return This builder for chaining.
     */
    public Builder setHndllklopbpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hndllklopbp_ = value;
      onChanged();
      return this;
    }

    private float gdglbgemhpo_ ;
    /**
     * <code>float gdglbgemhpo = 2;</code>
     * @return The gdglbgemhpo.
     */
    public float getGdglbgemhpo() {
      return gdglbgemhpo_;
    }
    /**
     * <code>float gdglbgemhpo = 2;</code>
     * @param value The gdglbgemhpo to set.
     * @return This builder for chaining.
     */
    public Builder setGdglbgemhpo(float value) {
      
      gdglbgemhpo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float gdglbgemhpo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGdglbgemhpo() {
      
      gdglbgemhpo_ = 0F;
      onChanged();
      return this;
    }

    private float ngbicenagbj_ ;
    /**
     * <code>float ngbicenagbj = 3;</code>
     * @return The ngbicenagbj.
     */
    public float getNgbicenagbj() {
      return ngbicenagbj_;
    }
    /**
     * <code>float ngbicenagbj = 3;</code>
     * @param value The ngbicenagbj to set.
     * @return This builder for chaining.
     */
    public Builder setNgbicenagbj(float value) {
      
      ngbicenagbj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ngbicenagbj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNgbicenagbj() {
      
      ngbicenagbj_ = 0F;
      onChanged();
      return this;
    }

    private float apoillcjihl_ ;
    /**
     * <code>float apoillcjihl = 4;</code>
     * @return The apoillcjihl.
     */
    public float getApoillcjihl() {
      return apoillcjihl_;
    }
    /**
     * <code>float apoillcjihl = 4;</code>
     * @param value The apoillcjihl to set.
     * @return This builder for chaining.
     */
    public Builder setApoillcjihl(float value) {
      
      apoillcjihl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float apoillcjihl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearApoillcjihl() {
      
      apoillcjihl_ = 0F;
      onChanged();
      return this;
    }

    private float jfoeamjdpgb_ ;
    /**
     * <code>float jfoeamjdpgb = 5;</code>
     * @return The jfoeamjdpgb.
     */
    public float getJfoeamjdpgb() {
      return jfoeamjdpgb_;
    }
    /**
     * <code>float jfoeamjdpgb = 5;</code>
     * @param value The jfoeamjdpgb to set.
     * @return This builder for chaining.
     */
    public Builder setJfoeamjdpgb(float value) {
      
      jfoeamjdpgb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float jfoeamjdpgb = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfoeamjdpgb() {
      
      jfoeamjdpgb_ = 0F;
      onChanged();
      return this;
    }

    private float cogflegcjhg_ ;
    /**
     * <code>float cogflegcjhg = 6;</code>
     * @return The cogflegcjhg.
     */
    public float getCogflegcjhg() {
      return cogflegcjhg_;
    }
    /**
     * <code>float cogflegcjhg = 6;</code>
     * @param value The cogflegcjhg to set.
     * @return This builder for chaining.
     */
    public Builder setCogflegcjhg(float value) {
      
      cogflegcjhg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cogflegcjhg = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCogflegcjhg() {
      
      cogflegcjhg_ = 0F;
      onChanged();
      return this;
    }

    private float abiinkcnfco_ ;
    /**
     * <code>float abiinkcnfco = 7;</code>
     * @return The abiinkcnfco.
     */
    public float getAbiinkcnfco() {
      return abiinkcnfco_;
    }
    /**
     * <code>float abiinkcnfco = 7;</code>
     * @param value The abiinkcnfco to set.
     * @return This builder for chaining.
     */
    public Builder setAbiinkcnfco(float value) {
      
      abiinkcnfco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float abiinkcnfco = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbiinkcnfco() {
      
      abiinkcnfco_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NNIIHGLOJFP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NNIIHGLOJFP)
  private static final POGOProtos.Rpc.NNIIHGLOJFP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NNIIHGLOJFP();
  }

  public static POGOProtos.Rpc.NNIIHGLOJFP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NNIIHGLOJFP>
      PARSER = new com.google.protobuf.AbstractParser<NNIIHGLOJFP>() {
    @java.lang.Override
    public NNIIHGLOJFP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NNIIHGLOJFP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NNIIHGLOJFP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NNIIHGLOJFP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NNIIHGLOJFP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

