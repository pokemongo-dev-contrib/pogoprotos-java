// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CHNMCKFABNA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CHNMCKFABNA}
 */
public final class CHNMCKFABNA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CHNMCKFABNA)
    CHNMCKFABNAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CHNMCKFABNA.newBuilder() to construct.
  private CHNMCKFABNA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CHNMCKFABNA() {
    jfmhpomodlb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CHNMCKFABNA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CHNMCKFABNA(
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

            jfmhpomodlb_ = s;
            break;
          }
          case 21: {

            nhmpphpniao_ = input.readFloat();
            break;
          }
          case 29: {

            ehnippbonhb_ = input.readFloat();
            break;
          }
          case 37: {

            kfldgapmloh_ = input.readFloat();
            break;
          }
          case 45: {

            bnicnodocba_ = input.readFloat();
            break;
          }
          case 53: {

            fficnlgklbc_ = input.readFloat();
            break;
          }
          case 61: {

            dlnpcbnlcbp_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHNMCKFABNA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHNMCKFABNA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CHNMCKFABNA.class, POGOProtos.Rpc.CHNMCKFABNA.Builder.class);
  }

  public static final int JFMHPOMODLB_FIELD_NUMBER = 1;
  private volatile java.lang.Object jfmhpomodlb_;
  /**
   * <code>string jfmhpomodlb = 1;</code>
   * @return The jfmhpomodlb.
   */
  @java.lang.Override
  public java.lang.String getJfmhpomodlb() {
    java.lang.Object ref = jfmhpomodlb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jfmhpomodlb_ = s;
      return s;
    }
  }
  /**
   * <code>string jfmhpomodlb = 1;</code>
   * @return The bytes for jfmhpomodlb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJfmhpomodlbBytes() {
    java.lang.Object ref = jfmhpomodlb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jfmhpomodlb_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NHMPPHPNIAO_FIELD_NUMBER = 2;
  private float nhmpphpniao_;
  /**
   * <code>float nhmpphpniao = 2;</code>
   * @return The nhmpphpniao.
   */
  @java.lang.Override
  public float getNhmpphpniao() {
    return nhmpphpniao_;
  }

  public static final int EHNIPPBONHB_FIELD_NUMBER = 3;
  private float ehnippbonhb_;
  /**
   * <code>float ehnippbonhb = 3;</code>
   * @return The ehnippbonhb.
   */
  @java.lang.Override
  public float getEhnippbonhb() {
    return ehnippbonhb_;
  }

  public static final int KFLDGAPMLOH_FIELD_NUMBER = 4;
  private float kfldgapmloh_;
  /**
   * <code>float kfldgapmloh = 4;</code>
   * @return The kfldgapmloh.
   */
  @java.lang.Override
  public float getKfldgapmloh() {
    return kfldgapmloh_;
  }

  public static final int BNICNODOCBA_FIELD_NUMBER = 5;
  private float bnicnodocba_;
  /**
   * <code>float bnicnodocba = 5;</code>
   * @return The bnicnodocba.
   */
  @java.lang.Override
  public float getBnicnodocba() {
    return bnicnodocba_;
  }

  public static final int FFICNLGKLBC_FIELD_NUMBER = 6;
  private float fficnlgklbc_;
  /**
   * <code>float fficnlgklbc = 6;</code>
   * @return The fficnlgklbc.
   */
  @java.lang.Override
  public float getFficnlgklbc() {
    return fficnlgklbc_;
  }

  public static final int DLNPCBNLCBP_FIELD_NUMBER = 7;
  private float dlnpcbnlcbp_;
  /**
   * <code>float dlnpcbnlcbp = 7;</code>
   * @return The dlnpcbnlcbp.
   */
  @java.lang.Override
  public float getDlnpcbnlcbp() {
    return dlnpcbnlcbp_;
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
    if (!getJfmhpomodlbBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jfmhpomodlb_);
    }
    if (nhmpphpniao_ != 0F) {
      output.writeFloat(2, nhmpphpniao_);
    }
    if (ehnippbonhb_ != 0F) {
      output.writeFloat(3, ehnippbonhb_);
    }
    if (kfldgapmloh_ != 0F) {
      output.writeFloat(4, kfldgapmloh_);
    }
    if (bnicnodocba_ != 0F) {
      output.writeFloat(5, bnicnodocba_);
    }
    if (fficnlgklbc_ != 0F) {
      output.writeFloat(6, fficnlgklbc_);
    }
    if (dlnpcbnlcbp_ != 0F) {
      output.writeFloat(7, dlnpcbnlcbp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJfmhpomodlbBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jfmhpomodlb_);
    }
    if (nhmpphpniao_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, nhmpphpniao_);
    }
    if (ehnippbonhb_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, ehnippbonhb_);
    }
    if (kfldgapmloh_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, kfldgapmloh_);
    }
    if (bnicnodocba_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, bnicnodocba_);
    }
    if (fficnlgklbc_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, fficnlgklbc_);
    }
    if (dlnpcbnlcbp_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, dlnpcbnlcbp_);
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
    if (!(obj instanceof POGOProtos.Rpc.CHNMCKFABNA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CHNMCKFABNA other = (POGOProtos.Rpc.CHNMCKFABNA) obj;

    if (!getJfmhpomodlb()
        .equals(other.getJfmhpomodlb())) return false;
    if (java.lang.Float.floatToIntBits(getNhmpphpniao())
        != java.lang.Float.floatToIntBits(
            other.getNhmpphpniao())) return false;
    if (java.lang.Float.floatToIntBits(getEhnippbonhb())
        != java.lang.Float.floatToIntBits(
            other.getEhnippbonhb())) return false;
    if (java.lang.Float.floatToIntBits(getKfldgapmloh())
        != java.lang.Float.floatToIntBits(
            other.getKfldgapmloh())) return false;
    if (java.lang.Float.floatToIntBits(getBnicnodocba())
        != java.lang.Float.floatToIntBits(
            other.getBnicnodocba())) return false;
    if (java.lang.Float.floatToIntBits(getFficnlgklbc())
        != java.lang.Float.floatToIntBits(
            other.getFficnlgklbc())) return false;
    if (java.lang.Float.floatToIntBits(getDlnpcbnlcbp())
        != java.lang.Float.floatToIntBits(
            other.getDlnpcbnlcbp())) return false;
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
    hash = (37 * hash) + JFMHPOMODLB_FIELD_NUMBER;
    hash = (53 * hash) + getJfmhpomodlb().hashCode();
    hash = (37 * hash) + NHMPPHPNIAO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNhmpphpniao());
    hash = (37 * hash) + EHNIPPBONHB_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEhnippbonhb());
    hash = (37 * hash) + KFLDGAPMLOH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getKfldgapmloh());
    hash = (37 * hash) + BNICNODOCBA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBnicnodocba());
    hash = (37 * hash) + FFICNLGKLBC_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFficnlgklbc());
    hash = (37 * hash) + DLNPCBNLCBP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDlnpcbnlcbp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHNMCKFABNA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CHNMCKFABNA prototype) {
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
   * ref: CHNMCKFABNA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CHNMCKFABNA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CHNMCKFABNA)
      POGOProtos.Rpc.CHNMCKFABNAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHNMCKFABNA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHNMCKFABNA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CHNMCKFABNA.class, POGOProtos.Rpc.CHNMCKFABNA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CHNMCKFABNA.newBuilder()
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
      jfmhpomodlb_ = "";

      nhmpphpniao_ = 0F;

      ehnippbonhb_ = 0F;

      kfldgapmloh_ = 0F;

      bnicnodocba_ = 0F;

      fficnlgklbc_ = 0F;

      dlnpcbnlcbp_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHNMCKFABNA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHNMCKFABNA getDefaultInstanceForType() {
      return POGOProtos.Rpc.CHNMCKFABNA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHNMCKFABNA build() {
      POGOProtos.Rpc.CHNMCKFABNA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHNMCKFABNA buildPartial() {
      POGOProtos.Rpc.CHNMCKFABNA result = new POGOProtos.Rpc.CHNMCKFABNA(this);
      result.jfmhpomodlb_ = jfmhpomodlb_;
      result.nhmpphpniao_ = nhmpphpniao_;
      result.ehnippbonhb_ = ehnippbonhb_;
      result.kfldgapmloh_ = kfldgapmloh_;
      result.bnicnodocba_ = bnicnodocba_;
      result.fficnlgklbc_ = fficnlgklbc_;
      result.dlnpcbnlcbp_ = dlnpcbnlcbp_;
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
      if (other instanceof POGOProtos.Rpc.CHNMCKFABNA) {
        return mergeFrom((POGOProtos.Rpc.CHNMCKFABNA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CHNMCKFABNA other) {
      if (other == POGOProtos.Rpc.CHNMCKFABNA.getDefaultInstance()) return this;
      if (!other.getJfmhpomodlb().isEmpty()) {
        jfmhpomodlb_ = other.jfmhpomodlb_;
        onChanged();
      }
      if (other.getNhmpphpniao() != 0F) {
        setNhmpphpniao(other.getNhmpphpniao());
      }
      if (other.getEhnippbonhb() != 0F) {
        setEhnippbonhb(other.getEhnippbonhb());
      }
      if (other.getKfldgapmloh() != 0F) {
        setKfldgapmloh(other.getKfldgapmloh());
      }
      if (other.getBnicnodocba() != 0F) {
        setBnicnodocba(other.getBnicnodocba());
      }
      if (other.getFficnlgklbc() != 0F) {
        setFficnlgklbc(other.getFficnlgklbc());
      }
      if (other.getDlnpcbnlcbp() != 0F) {
        setDlnpcbnlcbp(other.getDlnpcbnlcbp());
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
      POGOProtos.Rpc.CHNMCKFABNA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CHNMCKFABNA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jfmhpomodlb_ = "";
    /**
     * <code>string jfmhpomodlb = 1;</code>
     * @return The jfmhpomodlb.
     */
    public java.lang.String getJfmhpomodlb() {
      java.lang.Object ref = jfmhpomodlb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jfmhpomodlb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jfmhpomodlb = 1;</code>
     * @return The bytes for jfmhpomodlb.
     */
    public com.google.protobuf.ByteString
        getJfmhpomodlbBytes() {
      java.lang.Object ref = jfmhpomodlb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jfmhpomodlb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jfmhpomodlb = 1;</code>
     * @param value The jfmhpomodlb to set.
     * @return This builder for chaining.
     */
    public Builder setJfmhpomodlb(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jfmhpomodlb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jfmhpomodlb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfmhpomodlb() {
      
      jfmhpomodlb_ = getDefaultInstance().getJfmhpomodlb();
      onChanged();
      return this;
    }
    /**
     * <code>string jfmhpomodlb = 1;</code>
     * @param value The bytes for jfmhpomodlb to set.
     * @return This builder for chaining.
     */
    public Builder setJfmhpomodlbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jfmhpomodlb_ = value;
      onChanged();
      return this;
    }

    private float nhmpphpniao_ ;
    /**
     * <code>float nhmpphpniao = 2;</code>
     * @return The nhmpphpniao.
     */
    @java.lang.Override
    public float getNhmpphpniao() {
      return nhmpphpniao_;
    }
    /**
     * <code>float nhmpphpniao = 2;</code>
     * @param value The nhmpphpniao to set.
     * @return This builder for chaining.
     */
    public Builder setNhmpphpniao(float value) {
      
      nhmpphpniao_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float nhmpphpniao = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNhmpphpniao() {
      
      nhmpphpniao_ = 0F;
      onChanged();
      return this;
    }

    private float ehnippbonhb_ ;
    /**
     * <code>float ehnippbonhb = 3;</code>
     * @return The ehnippbonhb.
     */
    @java.lang.Override
    public float getEhnippbonhb() {
      return ehnippbonhb_;
    }
    /**
     * <code>float ehnippbonhb = 3;</code>
     * @param value The ehnippbonhb to set.
     * @return This builder for chaining.
     */
    public Builder setEhnippbonhb(float value) {
      
      ehnippbonhb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ehnippbonhb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEhnippbonhb() {
      
      ehnippbonhb_ = 0F;
      onChanged();
      return this;
    }

    private float kfldgapmloh_ ;
    /**
     * <code>float kfldgapmloh = 4;</code>
     * @return The kfldgapmloh.
     */
    @java.lang.Override
    public float getKfldgapmloh() {
      return kfldgapmloh_;
    }
    /**
     * <code>float kfldgapmloh = 4;</code>
     * @param value The kfldgapmloh to set.
     * @return This builder for chaining.
     */
    public Builder setKfldgapmloh(float value) {
      
      kfldgapmloh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float kfldgapmloh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKfldgapmloh() {
      
      kfldgapmloh_ = 0F;
      onChanged();
      return this;
    }

    private float bnicnodocba_ ;
    /**
     * <code>float bnicnodocba = 5;</code>
     * @return The bnicnodocba.
     */
    @java.lang.Override
    public float getBnicnodocba() {
      return bnicnodocba_;
    }
    /**
     * <code>float bnicnodocba = 5;</code>
     * @param value The bnicnodocba to set.
     * @return This builder for chaining.
     */
    public Builder setBnicnodocba(float value) {
      
      bnicnodocba_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bnicnodocba = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBnicnodocba() {
      
      bnicnodocba_ = 0F;
      onChanged();
      return this;
    }

    private float fficnlgklbc_ ;
    /**
     * <code>float fficnlgklbc = 6;</code>
     * @return The fficnlgklbc.
     */
    @java.lang.Override
    public float getFficnlgklbc() {
      return fficnlgklbc_;
    }
    /**
     * <code>float fficnlgklbc = 6;</code>
     * @param value The fficnlgklbc to set.
     * @return This builder for chaining.
     */
    public Builder setFficnlgklbc(float value) {
      
      fficnlgklbc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fficnlgklbc = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFficnlgklbc() {
      
      fficnlgklbc_ = 0F;
      onChanged();
      return this;
    }

    private float dlnpcbnlcbp_ ;
    /**
     * <code>float dlnpcbnlcbp = 7;</code>
     * @return The dlnpcbnlcbp.
     */
    @java.lang.Override
    public float getDlnpcbnlcbp() {
      return dlnpcbnlcbp_;
    }
    /**
     * <code>float dlnpcbnlcbp = 7;</code>
     * @param value The dlnpcbnlcbp to set.
     * @return This builder for chaining.
     */
    public Builder setDlnpcbnlcbp(float value) {
      
      dlnpcbnlcbp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float dlnpcbnlcbp = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDlnpcbnlcbp() {
      
      dlnpcbnlcbp_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CHNMCKFABNA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CHNMCKFABNA)
  private static final POGOProtos.Rpc.CHNMCKFABNA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CHNMCKFABNA();
  }

  public static POGOProtos.Rpc.CHNMCKFABNA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CHNMCKFABNA>
      PARSER = new com.google.protobuf.AbstractParser<CHNMCKFABNA>() {
    @java.lang.Override
    public CHNMCKFABNA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CHNMCKFABNA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CHNMCKFABNA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CHNMCKFABNA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CHNMCKFABNA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

