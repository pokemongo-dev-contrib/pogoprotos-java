// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FAEIMINBOJF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FAEIMINBOJF}
 */
public final class FAEIMINBOJF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FAEIMINBOJF)
    FAEIMINBOJFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FAEIMINBOJF.newBuilder() to construct.
  private FAEIMINBOJF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FAEIMINBOJF() {
    cdaakodiomm_ = 0;
    dgnblmejgkj_ = "";
    pjbblibfbgp_ = "";
    ekeaojlnaed_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FAEIMINBOJF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FAEIMINBOJF(
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

            cdaakodiomm_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dgnblmejgkj_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pjbblibfbgp_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            ekeaojlnaed_ = s;
            break;
          }
          case 40: {

            hfojgbogohi_ = input.readUInt32();
            break;
          }
          case 48: {

            hggcdfgmkon_ = input.readBool();
            break;
          }
          case 56: {

            flmnggdnnin_ = input.readInt32();
            break;
          }
          case 64: {

            dpcamcanfeg_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FAEIMINBOJF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FAEIMINBOJF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FAEIMINBOJF.class, POGOProtos.Rpc.FAEIMINBOJF.Builder.class);
  }

  public static final int CDAAKODIOMM_FIELD_NUMBER = 1;
  private int cdaakodiomm_;
  /**
   * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
   * @return The enum numeric value on the wire for cdaakodiomm.
   */
  @java.lang.Override public int getCdaakodiommValue() {
    return cdaakodiomm_;
  }
  /**
   * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
   * @return The cdaakodiomm.
   */
  @java.lang.Override public POGOProtos.Rpc.FNFNJDJDMCG getCdaakodiomm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FNFNJDJDMCG result = POGOProtos.Rpc.FNFNJDJDMCG.valueOf(cdaakodiomm_);
    return result == null ? POGOProtos.Rpc.FNFNJDJDMCG.UNRECOGNIZED : result;
  }

  public static final int DGNBLMEJGKJ_FIELD_NUMBER = 2;
  private volatile java.lang.Object dgnblmejgkj_;
  /**
   * <code>string dgnblmejgkj = 2;</code>
   * @return The dgnblmejgkj.
   */
  @java.lang.Override
  public java.lang.String getDgnblmejgkj() {
    java.lang.Object ref = dgnblmejgkj_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dgnblmejgkj_ = s;
      return s;
    }
  }
  /**
   * <code>string dgnblmejgkj = 2;</code>
   * @return The bytes for dgnblmejgkj.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDgnblmejgkjBytes() {
    java.lang.Object ref = dgnblmejgkj_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dgnblmejgkj_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PJBBLIBFBGP_FIELD_NUMBER = 3;
  private volatile java.lang.Object pjbblibfbgp_;
  /**
   * <code>string pjbblibfbgp = 3;</code>
   * @return The pjbblibfbgp.
   */
  @java.lang.Override
  public java.lang.String getPjbblibfbgp() {
    java.lang.Object ref = pjbblibfbgp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pjbblibfbgp_ = s;
      return s;
    }
  }
  /**
   * <code>string pjbblibfbgp = 3;</code>
   * @return The bytes for pjbblibfbgp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPjbblibfbgpBytes() {
    java.lang.Object ref = pjbblibfbgp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pjbblibfbgp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EKEAOJLNAED_FIELD_NUMBER = 4;
  private volatile java.lang.Object ekeaojlnaed_;
  /**
   * <code>string ekeaojlnaed = 4;</code>
   * @return The ekeaojlnaed.
   */
  @java.lang.Override
  public java.lang.String getEkeaojlnaed() {
    java.lang.Object ref = ekeaojlnaed_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekeaojlnaed_ = s;
      return s;
    }
  }
  /**
   * <code>string ekeaojlnaed = 4;</code>
   * @return The bytes for ekeaojlnaed.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEkeaojlnaedBytes() {
    java.lang.Object ref = ekeaojlnaed_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ekeaojlnaed_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HFOJGBOGOHI_FIELD_NUMBER = 5;
  private int hfojgbogohi_;
  /**
   * <code>uint32 hfojgbogohi = 5;</code>
   * @return The hfojgbogohi.
   */
  @java.lang.Override
  public int getHfojgbogohi() {
    return hfojgbogohi_;
  }

  public static final int HGGCDFGMKON_FIELD_NUMBER = 6;
  private boolean hggcdfgmkon_;
  /**
   * <code>bool hggcdfgmkon = 6;</code>
   * @return The hggcdfgmkon.
   */
  @java.lang.Override
  public boolean getHggcdfgmkon() {
    return hggcdfgmkon_;
  }

  public static final int FLMNGGDNNIN_FIELD_NUMBER = 7;
  private int flmnggdnnin_;
  /**
   * <code>int32 flmnggdnnin = 7;</code>
   * @return The flmnggdnnin.
   */
  @java.lang.Override
  public int getFlmnggdnnin() {
    return flmnggdnnin_;
  }

  public static final int DPCAMCANFEG_FIELD_NUMBER = 8;
  private long dpcamcanfeg_;
  /**
   * <code>uint64 dpcamcanfeg = 8;</code>
   * @return The dpcamcanfeg.
   */
  @java.lang.Override
  public long getDpcamcanfeg() {
    return dpcamcanfeg_;
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
    if (cdaakodiomm_ != POGOProtos.Rpc.FNFNJDJDMCG.FNFNJDJDMCG_PLATFORM_UNSET.getNumber()) {
      output.writeEnum(1, cdaakodiomm_);
    }
    if (!getDgnblmejgkjBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dgnblmejgkj_);
    }
    if (!getPjbblibfbgpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pjbblibfbgp_);
    }
    if (!getEkeaojlnaedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ekeaojlnaed_);
    }
    if (hfojgbogohi_ != 0) {
      output.writeUInt32(5, hfojgbogohi_);
    }
    if (hggcdfgmkon_ != false) {
      output.writeBool(6, hggcdfgmkon_);
    }
    if (flmnggdnnin_ != 0) {
      output.writeInt32(7, flmnggdnnin_);
    }
    if (dpcamcanfeg_ != 0L) {
      output.writeUInt64(8, dpcamcanfeg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cdaakodiomm_ != POGOProtos.Rpc.FNFNJDJDMCG.FNFNJDJDMCG_PLATFORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, cdaakodiomm_);
    }
    if (!getDgnblmejgkjBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dgnblmejgkj_);
    }
    if (!getPjbblibfbgpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pjbblibfbgp_);
    }
    if (!getEkeaojlnaedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ekeaojlnaed_);
    }
    if (hfojgbogohi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, hfojgbogohi_);
    }
    if (hggcdfgmkon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, hggcdfgmkon_);
    }
    if (flmnggdnnin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, flmnggdnnin_);
    }
    if (dpcamcanfeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(8, dpcamcanfeg_);
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
    if (!(obj instanceof POGOProtos.Rpc.FAEIMINBOJF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FAEIMINBOJF other = (POGOProtos.Rpc.FAEIMINBOJF) obj;

    if (cdaakodiomm_ != other.cdaakodiomm_) return false;
    if (!getDgnblmejgkj()
        .equals(other.getDgnblmejgkj())) return false;
    if (!getPjbblibfbgp()
        .equals(other.getPjbblibfbgp())) return false;
    if (!getEkeaojlnaed()
        .equals(other.getEkeaojlnaed())) return false;
    if (getHfojgbogohi()
        != other.getHfojgbogohi()) return false;
    if (getHggcdfgmkon()
        != other.getHggcdfgmkon()) return false;
    if (getFlmnggdnnin()
        != other.getFlmnggdnnin()) return false;
    if (getDpcamcanfeg()
        != other.getDpcamcanfeg()) return false;
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
    hash = (37 * hash) + CDAAKODIOMM_FIELD_NUMBER;
    hash = (53 * hash) + cdaakodiomm_;
    hash = (37 * hash) + DGNBLMEJGKJ_FIELD_NUMBER;
    hash = (53 * hash) + getDgnblmejgkj().hashCode();
    hash = (37 * hash) + PJBBLIBFBGP_FIELD_NUMBER;
    hash = (53 * hash) + getPjbblibfbgp().hashCode();
    hash = (37 * hash) + EKEAOJLNAED_FIELD_NUMBER;
    hash = (53 * hash) + getEkeaojlnaed().hashCode();
    hash = (37 * hash) + HFOJGBOGOHI_FIELD_NUMBER;
    hash = (53 * hash) + getHfojgbogohi();
    hash = (37 * hash) + HGGCDFGMKON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHggcdfgmkon());
    hash = (37 * hash) + FLMNGGDNNIN_FIELD_NUMBER;
    hash = (53 * hash) + getFlmnggdnnin();
    hash = (37 * hash) + DPCAMCANFEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDpcamcanfeg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FAEIMINBOJF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FAEIMINBOJF prototype) {
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
   * ref: FAEIMINBOJF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FAEIMINBOJF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FAEIMINBOJF)
      POGOProtos.Rpc.FAEIMINBOJFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FAEIMINBOJF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FAEIMINBOJF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FAEIMINBOJF.class, POGOProtos.Rpc.FAEIMINBOJF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FAEIMINBOJF.newBuilder()
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
      cdaakodiomm_ = 0;

      dgnblmejgkj_ = "";

      pjbblibfbgp_ = "";

      ekeaojlnaed_ = "";

      hfojgbogohi_ = 0;

      hggcdfgmkon_ = false;

      flmnggdnnin_ = 0;

      dpcamcanfeg_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FAEIMINBOJF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FAEIMINBOJF getDefaultInstanceForType() {
      return POGOProtos.Rpc.FAEIMINBOJF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FAEIMINBOJF build() {
      POGOProtos.Rpc.FAEIMINBOJF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FAEIMINBOJF buildPartial() {
      POGOProtos.Rpc.FAEIMINBOJF result = new POGOProtos.Rpc.FAEIMINBOJF(this);
      result.cdaakodiomm_ = cdaakodiomm_;
      result.dgnblmejgkj_ = dgnblmejgkj_;
      result.pjbblibfbgp_ = pjbblibfbgp_;
      result.ekeaojlnaed_ = ekeaojlnaed_;
      result.hfojgbogohi_ = hfojgbogohi_;
      result.hggcdfgmkon_ = hggcdfgmkon_;
      result.flmnggdnnin_ = flmnggdnnin_;
      result.dpcamcanfeg_ = dpcamcanfeg_;
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
      if (other instanceof POGOProtos.Rpc.FAEIMINBOJF) {
        return mergeFrom((POGOProtos.Rpc.FAEIMINBOJF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FAEIMINBOJF other) {
      if (other == POGOProtos.Rpc.FAEIMINBOJF.getDefaultInstance()) return this;
      if (other.cdaakodiomm_ != 0) {
        setCdaakodiommValue(other.getCdaakodiommValue());
      }
      if (!other.getDgnblmejgkj().isEmpty()) {
        dgnblmejgkj_ = other.dgnblmejgkj_;
        onChanged();
      }
      if (!other.getPjbblibfbgp().isEmpty()) {
        pjbblibfbgp_ = other.pjbblibfbgp_;
        onChanged();
      }
      if (!other.getEkeaojlnaed().isEmpty()) {
        ekeaojlnaed_ = other.ekeaojlnaed_;
        onChanged();
      }
      if (other.getHfojgbogohi() != 0) {
        setHfojgbogohi(other.getHfojgbogohi());
      }
      if (other.getHggcdfgmkon() != false) {
        setHggcdfgmkon(other.getHggcdfgmkon());
      }
      if (other.getFlmnggdnnin() != 0) {
        setFlmnggdnnin(other.getFlmnggdnnin());
      }
      if (other.getDpcamcanfeg() != 0L) {
        setDpcamcanfeg(other.getDpcamcanfeg());
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
      POGOProtos.Rpc.FAEIMINBOJF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FAEIMINBOJF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cdaakodiomm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
     * @return The enum numeric value on the wire for cdaakodiomm.
     */
    @java.lang.Override public int getCdaakodiommValue() {
      return cdaakodiomm_;
    }
    /**
     * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
     * @param value The enum numeric value on the wire for cdaakodiomm to set.
     * @return This builder for chaining.
     */
    public Builder setCdaakodiommValue(int value) {
      
      cdaakodiomm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
     * @return The cdaakodiomm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FNFNJDJDMCG getCdaakodiomm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FNFNJDJDMCG result = POGOProtos.Rpc.FNFNJDJDMCG.valueOf(cdaakodiomm_);
      return result == null ? POGOProtos.Rpc.FNFNJDJDMCG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
     * @param value The cdaakodiomm to set.
     * @return This builder for chaining.
     */
    public Builder setCdaakodiomm(POGOProtos.Rpc.FNFNJDJDMCG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cdaakodiomm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FNFNJDJDMCG cdaakodiomm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCdaakodiomm() {
      
      cdaakodiomm_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dgnblmejgkj_ = "";
    /**
     * <code>string dgnblmejgkj = 2;</code>
     * @return The dgnblmejgkj.
     */
    public java.lang.String getDgnblmejgkj() {
      java.lang.Object ref = dgnblmejgkj_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dgnblmejgkj_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dgnblmejgkj = 2;</code>
     * @return The bytes for dgnblmejgkj.
     */
    public com.google.protobuf.ByteString
        getDgnblmejgkjBytes() {
      java.lang.Object ref = dgnblmejgkj_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dgnblmejgkj_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dgnblmejgkj = 2;</code>
     * @param value The dgnblmejgkj to set.
     * @return This builder for chaining.
     */
    public Builder setDgnblmejgkj(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dgnblmejgkj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dgnblmejgkj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDgnblmejgkj() {
      
      dgnblmejgkj_ = getDefaultInstance().getDgnblmejgkj();
      onChanged();
      return this;
    }
    /**
     * <code>string dgnblmejgkj = 2;</code>
     * @param value The bytes for dgnblmejgkj to set.
     * @return This builder for chaining.
     */
    public Builder setDgnblmejgkjBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dgnblmejgkj_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pjbblibfbgp_ = "";
    /**
     * <code>string pjbblibfbgp = 3;</code>
     * @return The pjbblibfbgp.
     */
    public java.lang.String getPjbblibfbgp() {
      java.lang.Object ref = pjbblibfbgp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pjbblibfbgp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pjbblibfbgp = 3;</code>
     * @return The bytes for pjbblibfbgp.
     */
    public com.google.protobuf.ByteString
        getPjbblibfbgpBytes() {
      java.lang.Object ref = pjbblibfbgp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pjbblibfbgp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pjbblibfbgp = 3;</code>
     * @param value The pjbblibfbgp to set.
     * @return This builder for chaining.
     */
    public Builder setPjbblibfbgp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pjbblibfbgp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pjbblibfbgp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPjbblibfbgp() {
      
      pjbblibfbgp_ = getDefaultInstance().getPjbblibfbgp();
      onChanged();
      return this;
    }
    /**
     * <code>string pjbblibfbgp = 3;</code>
     * @param value The bytes for pjbblibfbgp to set.
     * @return This builder for chaining.
     */
    public Builder setPjbblibfbgpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pjbblibfbgp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ekeaojlnaed_ = "";
    /**
     * <code>string ekeaojlnaed = 4;</code>
     * @return The ekeaojlnaed.
     */
    public java.lang.String getEkeaojlnaed() {
      java.lang.Object ref = ekeaojlnaed_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekeaojlnaed_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ekeaojlnaed = 4;</code>
     * @return The bytes for ekeaojlnaed.
     */
    public com.google.protobuf.ByteString
        getEkeaojlnaedBytes() {
      java.lang.Object ref = ekeaojlnaed_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ekeaojlnaed_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ekeaojlnaed = 4;</code>
     * @param value The ekeaojlnaed to set.
     * @return This builder for chaining.
     */
    public Builder setEkeaojlnaed(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ekeaojlnaed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ekeaojlnaed = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkeaojlnaed() {
      
      ekeaojlnaed_ = getDefaultInstance().getEkeaojlnaed();
      onChanged();
      return this;
    }
    /**
     * <code>string ekeaojlnaed = 4;</code>
     * @param value The bytes for ekeaojlnaed to set.
     * @return This builder for chaining.
     */
    public Builder setEkeaojlnaedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ekeaojlnaed_ = value;
      onChanged();
      return this;
    }

    private int hfojgbogohi_ ;
    /**
     * <code>uint32 hfojgbogohi = 5;</code>
     * @return The hfojgbogohi.
     */
    @java.lang.Override
    public int getHfojgbogohi() {
      return hfojgbogohi_;
    }
    /**
     * <code>uint32 hfojgbogohi = 5;</code>
     * @param value The hfojgbogohi to set.
     * @return This builder for chaining.
     */
    public Builder setHfojgbogohi(int value) {
      
      hfojgbogohi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 hfojgbogohi = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHfojgbogohi() {
      
      hfojgbogohi_ = 0;
      onChanged();
      return this;
    }

    private boolean hggcdfgmkon_ ;
    /**
     * <code>bool hggcdfgmkon = 6;</code>
     * @return The hggcdfgmkon.
     */
    @java.lang.Override
    public boolean getHggcdfgmkon() {
      return hggcdfgmkon_;
    }
    /**
     * <code>bool hggcdfgmkon = 6;</code>
     * @param value The hggcdfgmkon to set.
     * @return This builder for chaining.
     */
    public Builder setHggcdfgmkon(boolean value) {
      
      hggcdfgmkon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hggcdfgmkon = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHggcdfgmkon() {
      
      hggcdfgmkon_ = false;
      onChanged();
      return this;
    }

    private int flmnggdnnin_ ;
    /**
     * <code>int32 flmnggdnnin = 7;</code>
     * @return The flmnggdnnin.
     */
    @java.lang.Override
    public int getFlmnggdnnin() {
      return flmnggdnnin_;
    }
    /**
     * <code>int32 flmnggdnnin = 7;</code>
     * @param value The flmnggdnnin to set.
     * @return This builder for chaining.
     */
    public Builder setFlmnggdnnin(int value) {
      
      flmnggdnnin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 flmnggdnnin = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlmnggdnnin() {
      
      flmnggdnnin_ = 0;
      onChanged();
      return this;
    }

    private long dpcamcanfeg_ ;
    /**
     * <code>uint64 dpcamcanfeg = 8;</code>
     * @return The dpcamcanfeg.
     */
    @java.lang.Override
    public long getDpcamcanfeg() {
      return dpcamcanfeg_;
    }
    /**
     * <code>uint64 dpcamcanfeg = 8;</code>
     * @param value The dpcamcanfeg to set.
     * @return This builder for chaining.
     */
    public Builder setDpcamcanfeg(long value) {
      
      dpcamcanfeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 dpcamcanfeg = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearDpcamcanfeg() {
      
      dpcamcanfeg_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FAEIMINBOJF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FAEIMINBOJF)
  private static final POGOProtos.Rpc.FAEIMINBOJF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FAEIMINBOJF();
  }

  public static POGOProtos.Rpc.FAEIMINBOJF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FAEIMINBOJF>
      PARSER = new com.google.protobuf.AbstractParser<FAEIMINBOJF>() {
    @java.lang.Override
    public FAEIMINBOJF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FAEIMINBOJF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FAEIMINBOJF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FAEIMINBOJF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FAEIMINBOJF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

