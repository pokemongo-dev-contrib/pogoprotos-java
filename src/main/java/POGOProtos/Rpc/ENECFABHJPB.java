// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ENECFABHJPB}
 */
public  final class ENECFABHJPB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ENECFABHJPB)
    ENECFABHJPBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ENECFABHJPB.newBuilder() to construct.
  private ENECFABHJPB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ENECFABHJPB() {
    hgnobmbnpgm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ENECFABHJPB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ENECFABHJPB(
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

            hgnobmbnpgm_ = s;
            break;
          }
          case 16: {

            jlbjdgfgngd_ = input.readUInt64();
            break;
          }
          case 24: {

            nmnenpfgkoa_ = input.readInt32();
            break;
          }
          case 32: {

            ilcbigkhlll_ = input.readInt64();
            break;
          }
          case 41: {

            hohldcmhbkm_ = input.readDouble();
            break;
          }
          case 49: {

            ekeicchnloj_ = input.readDouble();
            break;
          }
          case 58: {
            POGOProtos.Rpc.FFGIEEPEOPM.Builder subBuilder = null;
            if (gidmfojaeip_ != null) {
              subBuilder = gidmfojaeip_.toBuilder();
            }
            gidmfojaeip_ = input.readMessage(POGOProtos.Rpc.FFGIEEPEOPM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gidmfojaeip_);
              gidmfojaeip_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENECFABHJPB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENECFABHJPB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ENECFABHJPB.class, POGOProtos.Rpc.ENECFABHJPB.Builder.class);
  }

  public static final int HGNOBMBNPGM_FIELD_NUMBER = 1;
  private volatile java.lang.Object hgnobmbnpgm_;
  /**
   * <code>string hgnobmbnpgm = 1;</code>
   * @return The hgnobmbnpgm.
   */
  public java.lang.String getHgnobmbnpgm() {
    java.lang.Object ref = hgnobmbnpgm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hgnobmbnpgm_ = s;
      return s;
    }
  }
  /**
   * <code>string hgnobmbnpgm = 1;</code>
   * @return The bytes for hgnobmbnpgm.
   */
  public com.google.protobuf.ByteString
      getHgnobmbnpgmBytes() {
    java.lang.Object ref = hgnobmbnpgm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hgnobmbnpgm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JLBJDGFGNGD_FIELD_NUMBER = 2;
  private long jlbjdgfgngd_;
  /**
   * <code>uint64 jlbjdgfgngd = 2;</code>
   * @return The jlbjdgfgngd.
   */
  public long getJlbjdgfgngd() {
    return jlbjdgfgngd_;
  }

  public static final int NMNENPFGKOA_FIELD_NUMBER = 3;
  private int nmnenpfgkoa_;
  /**
   * <code>int32 nmnenpfgkoa = 3;</code>
   * @return The nmnenpfgkoa.
   */
  public int getNmnenpfgkoa() {
    return nmnenpfgkoa_;
  }

  public static final int ILCBIGKHLLL_FIELD_NUMBER = 4;
  private long ilcbigkhlll_;
  /**
   * <code>int64 ilcbigkhlll = 4;</code>
   * @return The ilcbigkhlll.
   */
  public long getIlcbigkhlll() {
    return ilcbigkhlll_;
  }

  public static final int HOHLDCMHBKM_FIELD_NUMBER = 5;
  private double hohldcmhbkm_;
  /**
   * <code>double hohldcmhbkm = 5;</code>
   * @return The hohldcmhbkm.
   */
  public double getHohldcmhbkm() {
    return hohldcmhbkm_;
  }

  public static final int EKEICCHNLOJ_FIELD_NUMBER = 6;
  private double ekeicchnloj_;
  /**
   * <code>double ekeicchnloj = 6;</code>
   * @return The ekeicchnloj.
   */
  public double getEkeicchnloj() {
    return ekeicchnloj_;
  }

  public static final int GIDMFOJAEIP_FIELD_NUMBER = 7;
  private POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip_;
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
   * @return Whether the gidmfojaeip field is set.
   */
  public boolean hasGidmfojaeip() {
    return gidmfojaeip_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
   * @return The gidmfojaeip.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM getGidmfojaeip() {
    return gidmfojaeip_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
   */
  public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getGidmfojaeipOrBuilder() {
    return getGidmfojaeip();
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
    if (!getHgnobmbnpgmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hgnobmbnpgm_);
    }
    if (jlbjdgfgngd_ != 0L) {
      output.writeUInt64(2, jlbjdgfgngd_);
    }
    if (nmnenpfgkoa_ != 0) {
      output.writeInt32(3, nmnenpfgkoa_);
    }
    if (ilcbigkhlll_ != 0L) {
      output.writeInt64(4, ilcbigkhlll_);
    }
    if (hohldcmhbkm_ != 0D) {
      output.writeDouble(5, hohldcmhbkm_);
    }
    if (ekeicchnloj_ != 0D) {
      output.writeDouble(6, ekeicchnloj_);
    }
    if (gidmfojaeip_ != null) {
      output.writeMessage(7, getGidmfojaeip());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHgnobmbnpgmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hgnobmbnpgm_);
    }
    if (jlbjdgfgngd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, jlbjdgfgngd_);
    }
    if (nmnenpfgkoa_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nmnenpfgkoa_);
    }
    if (ilcbigkhlll_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, ilcbigkhlll_);
    }
    if (hohldcmhbkm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, hohldcmhbkm_);
    }
    if (ekeicchnloj_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, ekeicchnloj_);
    }
    if (gidmfojaeip_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getGidmfojaeip());
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
    if (!(obj instanceof POGOProtos.Rpc.ENECFABHJPB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ENECFABHJPB other = (POGOProtos.Rpc.ENECFABHJPB) obj;

    if (!getHgnobmbnpgm()
        .equals(other.getHgnobmbnpgm())) return false;
    if (getJlbjdgfgngd()
        != other.getJlbjdgfgngd()) return false;
    if (getNmnenpfgkoa()
        != other.getNmnenpfgkoa()) return false;
    if (getIlcbigkhlll()
        != other.getIlcbigkhlll()) return false;
    if (java.lang.Double.doubleToLongBits(getHohldcmhbkm())
        != java.lang.Double.doubleToLongBits(
            other.getHohldcmhbkm())) return false;
    if (java.lang.Double.doubleToLongBits(getEkeicchnloj())
        != java.lang.Double.doubleToLongBits(
            other.getEkeicchnloj())) return false;
    if (hasGidmfojaeip() != other.hasGidmfojaeip()) return false;
    if (hasGidmfojaeip()) {
      if (!getGidmfojaeip()
          .equals(other.getGidmfojaeip())) return false;
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
    hash = (37 * hash) + HGNOBMBNPGM_FIELD_NUMBER;
    hash = (53 * hash) + getHgnobmbnpgm().hashCode();
    hash = (37 * hash) + JLBJDGFGNGD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJlbjdgfgngd());
    hash = (37 * hash) + NMNENPFGKOA_FIELD_NUMBER;
    hash = (53 * hash) + getNmnenpfgkoa();
    hash = (37 * hash) + ILCBIGKHLLL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIlcbigkhlll());
    hash = (37 * hash) + HOHLDCMHBKM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHohldcmhbkm()));
    hash = (37 * hash) + EKEICCHNLOJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEkeicchnloj()));
    if (hasGidmfojaeip()) {
      hash = (37 * hash) + GIDMFOJAEIP_FIELD_NUMBER;
      hash = (53 * hash) + getGidmfojaeip().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENECFABHJPB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ENECFABHJPB prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ENECFABHJPB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ENECFABHJPB)
      POGOProtos.Rpc.ENECFABHJPBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENECFABHJPB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENECFABHJPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ENECFABHJPB.class, POGOProtos.Rpc.ENECFABHJPB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ENECFABHJPB.newBuilder()
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
      hgnobmbnpgm_ = "";

      jlbjdgfgngd_ = 0L;

      nmnenpfgkoa_ = 0;

      ilcbigkhlll_ = 0L;

      hohldcmhbkm_ = 0D;

      ekeicchnloj_ = 0D;

      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = null;
      } else {
        gidmfojaeip_ = null;
        gidmfojaeipBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENECFABHJPB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENECFABHJPB getDefaultInstanceForType() {
      return POGOProtos.Rpc.ENECFABHJPB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENECFABHJPB build() {
      POGOProtos.Rpc.ENECFABHJPB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENECFABHJPB buildPartial() {
      POGOProtos.Rpc.ENECFABHJPB result = new POGOProtos.Rpc.ENECFABHJPB(this);
      result.hgnobmbnpgm_ = hgnobmbnpgm_;
      result.jlbjdgfgngd_ = jlbjdgfgngd_;
      result.nmnenpfgkoa_ = nmnenpfgkoa_;
      result.ilcbigkhlll_ = ilcbigkhlll_;
      result.hohldcmhbkm_ = hohldcmhbkm_;
      result.ekeicchnloj_ = ekeicchnloj_;
      if (gidmfojaeipBuilder_ == null) {
        result.gidmfojaeip_ = gidmfojaeip_;
      } else {
        result.gidmfojaeip_ = gidmfojaeipBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ENECFABHJPB) {
        return mergeFrom((POGOProtos.Rpc.ENECFABHJPB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ENECFABHJPB other) {
      if (other == POGOProtos.Rpc.ENECFABHJPB.getDefaultInstance()) return this;
      if (!other.getHgnobmbnpgm().isEmpty()) {
        hgnobmbnpgm_ = other.hgnobmbnpgm_;
        onChanged();
      }
      if (other.getJlbjdgfgngd() != 0L) {
        setJlbjdgfgngd(other.getJlbjdgfgngd());
      }
      if (other.getNmnenpfgkoa() != 0) {
        setNmnenpfgkoa(other.getNmnenpfgkoa());
      }
      if (other.getIlcbigkhlll() != 0L) {
        setIlcbigkhlll(other.getIlcbigkhlll());
      }
      if (other.getHohldcmhbkm() != 0D) {
        setHohldcmhbkm(other.getHohldcmhbkm());
      }
      if (other.getEkeicchnloj() != 0D) {
        setEkeicchnloj(other.getEkeicchnloj());
      }
      if (other.hasGidmfojaeip()) {
        mergeGidmfojaeip(other.getGidmfojaeip());
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
      POGOProtos.Rpc.ENECFABHJPB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ENECFABHJPB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hgnobmbnpgm_ = "";
    /**
     * <code>string hgnobmbnpgm = 1;</code>
     * @return The hgnobmbnpgm.
     */
    public java.lang.String getHgnobmbnpgm() {
      java.lang.Object ref = hgnobmbnpgm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hgnobmbnpgm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hgnobmbnpgm = 1;</code>
     * @return The bytes for hgnobmbnpgm.
     */
    public com.google.protobuf.ByteString
        getHgnobmbnpgmBytes() {
      java.lang.Object ref = hgnobmbnpgm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hgnobmbnpgm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hgnobmbnpgm = 1;</code>
     * @param value The hgnobmbnpgm to set.
     * @return This builder for chaining.
     */
    public Builder setHgnobmbnpgm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hgnobmbnpgm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hgnobmbnpgm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHgnobmbnpgm() {
      
      hgnobmbnpgm_ = getDefaultInstance().getHgnobmbnpgm();
      onChanged();
      return this;
    }
    /**
     * <code>string hgnobmbnpgm = 1;</code>
     * @param value The bytes for hgnobmbnpgm to set.
     * @return This builder for chaining.
     */
    public Builder setHgnobmbnpgmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hgnobmbnpgm_ = value;
      onChanged();
      return this;
    }

    private long jlbjdgfgngd_ ;
    /**
     * <code>uint64 jlbjdgfgngd = 2;</code>
     * @return The jlbjdgfgngd.
     */
    public long getJlbjdgfgngd() {
      return jlbjdgfgngd_;
    }
    /**
     * <code>uint64 jlbjdgfgngd = 2;</code>
     * @param value The jlbjdgfgngd to set.
     * @return This builder for chaining.
     */
    public Builder setJlbjdgfgngd(long value) {
      
      jlbjdgfgngd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 jlbjdgfgngd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJlbjdgfgngd() {
      
      jlbjdgfgngd_ = 0L;
      onChanged();
      return this;
    }

    private int nmnenpfgkoa_ ;
    /**
     * <code>int32 nmnenpfgkoa = 3;</code>
     * @return The nmnenpfgkoa.
     */
    public int getNmnenpfgkoa() {
      return nmnenpfgkoa_;
    }
    /**
     * <code>int32 nmnenpfgkoa = 3;</code>
     * @param value The nmnenpfgkoa to set.
     * @return This builder for chaining.
     */
    public Builder setNmnenpfgkoa(int value) {
      
      nmnenpfgkoa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nmnenpfgkoa = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNmnenpfgkoa() {
      
      nmnenpfgkoa_ = 0;
      onChanged();
      return this;
    }

    private long ilcbigkhlll_ ;
    /**
     * <code>int64 ilcbigkhlll = 4;</code>
     * @return The ilcbigkhlll.
     */
    public long getIlcbigkhlll() {
      return ilcbigkhlll_;
    }
    /**
     * <code>int64 ilcbigkhlll = 4;</code>
     * @param value The ilcbigkhlll to set.
     * @return This builder for chaining.
     */
    public Builder setIlcbigkhlll(long value) {
      
      ilcbigkhlll_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ilcbigkhlll = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIlcbigkhlll() {
      
      ilcbigkhlll_ = 0L;
      onChanged();
      return this;
    }

    private double hohldcmhbkm_ ;
    /**
     * <code>double hohldcmhbkm = 5;</code>
     * @return The hohldcmhbkm.
     */
    public double getHohldcmhbkm() {
      return hohldcmhbkm_;
    }
    /**
     * <code>double hohldcmhbkm = 5;</code>
     * @param value The hohldcmhbkm to set.
     * @return This builder for chaining.
     */
    public Builder setHohldcmhbkm(double value) {
      
      hohldcmhbkm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double hohldcmhbkm = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHohldcmhbkm() {
      
      hohldcmhbkm_ = 0D;
      onChanged();
      return this;
    }

    private double ekeicchnloj_ ;
    /**
     * <code>double ekeicchnloj = 6;</code>
     * @return The ekeicchnloj.
     */
    public double getEkeicchnloj() {
      return ekeicchnloj_;
    }
    /**
     * <code>double ekeicchnloj = 6;</code>
     * @param value The ekeicchnloj to set.
     * @return This builder for chaining.
     */
    public Builder setEkeicchnloj(double value) {
      
      ekeicchnloj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ekeicchnloj = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkeicchnloj() {
      
      ekeicchnloj_ = 0D;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> gidmfojaeipBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     * @return Whether the gidmfojaeip field is set.
     */
    public boolean hasGidmfojaeip() {
      return gidmfojaeipBuilder_ != null || gidmfojaeip_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     * @return The gidmfojaeip.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM getGidmfojaeip() {
      if (gidmfojaeipBuilder_ == null) {
        return gidmfojaeip_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
      } else {
        return gidmfojaeipBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public Builder setGidmfojaeip(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (gidmfojaeipBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gidmfojaeip_ = value;
        onChanged();
      } else {
        gidmfojaeipBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public Builder setGidmfojaeip(
        POGOProtos.Rpc.FFGIEEPEOPM.Builder builderForValue) {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = builderForValue.build();
        onChanged();
      } else {
        gidmfojaeipBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public Builder mergeGidmfojaeip(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (gidmfojaeipBuilder_ == null) {
        if (gidmfojaeip_ != null) {
          gidmfojaeip_ =
            POGOProtos.Rpc.FFGIEEPEOPM.newBuilder(gidmfojaeip_).mergeFrom(value).buildPartial();
        } else {
          gidmfojaeip_ = value;
        }
        onChanged();
      } else {
        gidmfojaeipBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public Builder clearGidmfojaeip() {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = null;
        onChanged();
      } else {
        gidmfojaeip_ = null;
        gidmfojaeipBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.Builder getGidmfojaeipBuilder() {
      
      onChanged();
      return getGidmfojaeipFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getGidmfojaeipOrBuilder() {
      if (gidmfojaeipBuilder_ != null) {
        return gidmfojaeipBuilder_.getMessageOrBuilder();
      } else {
        return gidmfojaeip_ == null ?
            POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> 
        getGidmfojaeipFieldBuilder() {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeipBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder>(
                getGidmfojaeip(),
                getParentForChildren(),
                isClean());
        gidmfojaeip_ = null;
      }
      return gidmfojaeipBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ENECFABHJPB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ENECFABHJPB)
  private static final POGOProtos.Rpc.ENECFABHJPB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ENECFABHJPB();
  }

  public static POGOProtos.Rpc.ENECFABHJPB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ENECFABHJPB>
      PARSER = new com.google.protobuf.AbstractParser<ENECFABHJPB>() {
    @java.lang.Override
    public ENECFABHJPB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ENECFABHJPB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ENECFABHJPB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ENECFABHJPB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ENECFABHJPB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

