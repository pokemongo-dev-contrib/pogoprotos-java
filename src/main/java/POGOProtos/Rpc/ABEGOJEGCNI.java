// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ABEGOJEGCNI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ABEGOJEGCNI}
 */
public final class ABEGOJEGCNI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ABEGOJEGCNI)
    ABEGOJEGCNIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ABEGOJEGCNI.newBuilder() to construct.
  private ABEGOJEGCNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ABEGOJEGCNI() {
    digakmkacfn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ABEGOJEGCNI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ABEGOJEGCNI(
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

            kdmdegnfgdc_ = input.readInt64();
            break;
          }
          case 16: {

            jfflmbfnomd_ = input.readInt64();
            break;
          }
          case 24: {

            idiciombhff_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            digakmkacfn_ = rawValue;
            break;
          }
          case 40: {

            cddkblklcfh_ = input.readBool();
            break;
          }
          case 48: {

            bemldmijann_ = input.readBool();
            break;
          }
          case 56: {

            fngonbcmjcg_ = input.readBool();
            break;
          }
          case 64: {

            pfccnejblcb_ = input.readBool();
            break;
          }
          case 72: {

            kbcfigpmkmd_ = input.readBool();
            break;
          }
          case 80: {

            lhhdelmkmjf_ = input.readInt64();
            break;
          }
          case 96: {

            blkaghdnlje_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEGOJEGCNI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEGOJEGCNI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ABEGOJEGCNI.class, POGOProtos.Rpc.ABEGOJEGCNI.Builder.class);
  }

  public static final int KDMDEGNFGDC_FIELD_NUMBER = 1;
  private long kdmdegnfgdc_;
  /**
   * <code>int64 kdmdegnfgdc = 1;</code>
   * @return The kdmdegnfgdc.
   */
  @java.lang.Override
  public long getKdmdegnfgdc() {
    return kdmdegnfgdc_;
  }

  public static final int JFFLMBFNOMD_FIELD_NUMBER = 2;
  private long jfflmbfnomd_;
  /**
   * <code>int64 jfflmbfnomd = 2;</code>
   * @return The jfflmbfnomd.
   */
  @java.lang.Override
  public long getJfflmbfnomd() {
    return jfflmbfnomd_;
  }

  public static final int IDICIOMBHFF_FIELD_NUMBER = 3;
  private long idiciombhff_;
  /**
   * <code>int64 idiciombhff = 3;</code>
   * @return The idiciombhff.
   */
  @java.lang.Override
  public long getIdiciombhff() {
    return idiciombhff_;
  }

  public static final int DIGAKMKACFN_FIELD_NUMBER = 4;
  private int digakmkacfn_;
  /**
   * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
   * @return The enum numeric value on the wire for digakmkacfn.
   */
  @java.lang.Override public int getDigakmkacfnValue() {
    return digakmkacfn_;
  }
  /**
   * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
   * @return The digakmkacfn.
   */
  @java.lang.Override public POGOProtos.Rpc.MPCKBLJLBID getDigakmkacfn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MPCKBLJLBID result = POGOProtos.Rpc.MPCKBLJLBID.valueOf(digakmkacfn_);
    return result == null ? POGOProtos.Rpc.MPCKBLJLBID.UNRECOGNIZED : result;
  }

  public static final int CDDKBLKLCFH_FIELD_NUMBER = 5;
  private boolean cddkblklcfh_;
  /**
   * <code>bool cddkblklcfh = 5;</code>
   * @return The cddkblklcfh.
   */
  @java.lang.Override
  public boolean getCddkblklcfh() {
    return cddkblklcfh_;
  }

  public static final int BEMLDMIJANN_FIELD_NUMBER = 6;
  private boolean bemldmijann_;
  /**
   * <code>bool bemldmijann = 6;</code>
   * @return The bemldmijann.
   */
  @java.lang.Override
  public boolean getBemldmijann() {
    return bemldmijann_;
  }

  public static final int FNGONBCMJCG_FIELD_NUMBER = 7;
  private boolean fngonbcmjcg_;
  /**
   * <code>bool fngonbcmjcg = 7;</code>
   * @return The fngonbcmjcg.
   */
  @java.lang.Override
  public boolean getFngonbcmjcg() {
    return fngonbcmjcg_;
  }

  public static final int PFCCNEJBLCB_FIELD_NUMBER = 8;
  private boolean pfccnejblcb_;
  /**
   * <code>bool pfccnejblcb = 8;</code>
   * @return The pfccnejblcb.
   */
  @java.lang.Override
  public boolean getPfccnejblcb() {
    return pfccnejblcb_;
  }

  public static final int KBCFIGPMKMD_FIELD_NUMBER = 9;
  private boolean kbcfigpmkmd_;
  /**
   * <code>bool kbcfigpmkmd = 9;</code>
   * @return The kbcfigpmkmd.
   */
  @java.lang.Override
  public boolean getKbcfigpmkmd() {
    return kbcfigpmkmd_;
  }

  public static final int LHHDELMKMJF_FIELD_NUMBER = 10;
  private long lhhdelmkmjf_;
  /**
   * <code>int64 lhhdelmkmjf = 10;</code>
   * @return The lhhdelmkmjf.
   */
  @java.lang.Override
  public long getLhhdelmkmjf() {
    return lhhdelmkmjf_;
  }

  public static final int BLKAGHDNLJE_FIELD_NUMBER = 12;
  private boolean blkaghdnlje_;
  /**
   * <code>bool blkaghdnlje = 12;</code>
   * @return The blkaghdnlje.
   */
  @java.lang.Override
  public boolean getBlkaghdnlje() {
    return blkaghdnlje_;
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
    if (kdmdegnfgdc_ != 0L) {
      output.writeInt64(1, kdmdegnfgdc_);
    }
    if (jfflmbfnomd_ != 0L) {
      output.writeInt64(2, jfflmbfnomd_);
    }
    if (idiciombhff_ != 0L) {
      output.writeInt64(3, idiciombhff_);
    }
    if (digakmkacfn_ != POGOProtos.Rpc.MPCKBLJLBID.MPCKBLJLBID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(4, digakmkacfn_);
    }
    if (cddkblklcfh_ != false) {
      output.writeBool(5, cddkblklcfh_);
    }
    if (bemldmijann_ != false) {
      output.writeBool(6, bemldmijann_);
    }
    if (fngonbcmjcg_ != false) {
      output.writeBool(7, fngonbcmjcg_);
    }
    if (pfccnejblcb_ != false) {
      output.writeBool(8, pfccnejblcb_);
    }
    if (kbcfigpmkmd_ != false) {
      output.writeBool(9, kbcfigpmkmd_);
    }
    if (lhhdelmkmjf_ != 0L) {
      output.writeInt64(10, lhhdelmkmjf_);
    }
    if (blkaghdnlje_ != false) {
      output.writeBool(12, blkaghdnlje_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kdmdegnfgdc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, kdmdegnfgdc_);
    }
    if (jfflmbfnomd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jfflmbfnomd_);
    }
    if (idiciombhff_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, idiciombhff_);
    }
    if (digakmkacfn_ != POGOProtos.Rpc.MPCKBLJLBID.MPCKBLJLBID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, digakmkacfn_);
    }
    if (cddkblklcfh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, cddkblklcfh_);
    }
    if (bemldmijann_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, bemldmijann_);
    }
    if (fngonbcmjcg_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, fngonbcmjcg_);
    }
    if (pfccnejblcb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, pfccnejblcb_);
    }
    if (kbcfigpmkmd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, kbcfigpmkmd_);
    }
    if (lhhdelmkmjf_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, lhhdelmkmjf_);
    }
    if (blkaghdnlje_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, blkaghdnlje_);
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
    if (!(obj instanceof POGOProtos.Rpc.ABEGOJEGCNI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ABEGOJEGCNI other = (POGOProtos.Rpc.ABEGOJEGCNI) obj;

    if (getKdmdegnfgdc()
        != other.getKdmdegnfgdc()) return false;
    if (getJfflmbfnomd()
        != other.getJfflmbfnomd()) return false;
    if (getIdiciombhff()
        != other.getIdiciombhff()) return false;
    if (digakmkacfn_ != other.digakmkacfn_) return false;
    if (getCddkblklcfh()
        != other.getCddkblklcfh()) return false;
    if (getBemldmijann()
        != other.getBemldmijann()) return false;
    if (getFngonbcmjcg()
        != other.getFngonbcmjcg()) return false;
    if (getPfccnejblcb()
        != other.getPfccnejblcb()) return false;
    if (getKbcfigpmkmd()
        != other.getKbcfigpmkmd()) return false;
    if (getLhhdelmkmjf()
        != other.getLhhdelmkmjf()) return false;
    if (getBlkaghdnlje()
        != other.getBlkaghdnlje()) return false;
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
    hash = (37 * hash) + KDMDEGNFGDC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKdmdegnfgdc());
    hash = (37 * hash) + JFFLMBFNOMD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJfflmbfnomd());
    hash = (37 * hash) + IDICIOMBHFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdiciombhff());
    hash = (37 * hash) + DIGAKMKACFN_FIELD_NUMBER;
    hash = (53 * hash) + digakmkacfn_;
    hash = (37 * hash) + CDDKBLKLCFH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCddkblklcfh());
    hash = (37 * hash) + BEMLDMIJANN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBemldmijann());
    hash = (37 * hash) + FNGONBCMJCG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFngonbcmjcg());
    hash = (37 * hash) + PFCCNEJBLCB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPfccnejblcb());
    hash = (37 * hash) + KBCFIGPMKMD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKbcfigpmkmd());
    hash = (37 * hash) + LHHDELMKMJF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLhhdelmkmjf());
    hash = (37 * hash) + BLKAGHDNLJE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBlkaghdnlje());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABEGOJEGCNI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ABEGOJEGCNI prototype) {
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
   * ref: ABEGOJEGCNI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ABEGOJEGCNI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ABEGOJEGCNI)
      POGOProtos.Rpc.ABEGOJEGCNIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEGOJEGCNI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEGOJEGCNI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ABEGOJEGCNI.class, POGOProtos.Rpc.ABEGOJEGCNI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ABEGOJEGCNI.newBuilder()
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
      kdmdegnfgdc_ = 0L;

      jfflmbfnomd_ = 0L;

      idiciombhff_ = 0L;

      digakmkacfn_ = 0;

      cddkblklcfh_ = false;

      bemldmijann_ = false;

      fngonbcmjcg_ = false;

      pfccnejblcb_ = false;

      kbcfigpmkmd_ = false;

      lhhdelmkmjf_ = 0L;

      blkaghdnlje_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABEGOJEGCNI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEGOJEGCNI getDefaultInstanceForType() {
      return POGOProtos.Rpc.ABEGOJEGCNI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEGOJEGCNI build() {
      POGOProtos.Rpc.ABEGOJEGCNI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABEGOJEGCNI buildPartial() {
      POGOProtos.Rpc.ABEGOJEGCNI result = new POGOProtos.Rpc.ABEGOJEGCNI(this);
      result.kdmdegnfgdc_ = kdmdegnfgdc_;
      result.jfflmbfnomd_ = jfflmbfnomd_;
      result.idiciombhff_ = idiciombhff_;
      result.digakmkacfn_ = digakmkacfn_;
      result.cddkblklcfh_ = cddkblklcfh_;
      result.bemldmijann_ = bemldmijann_;
      result.fngonbcmjcg_ = fngonbcmjcg_;
      result.pfccnejblcb_ = pfccnejblcb_;
      result.kbcfigpmkmd_ = kbcfigpmkmd_;
      result.lhhdelmkmjf_ = lhhdelmkmjf_;
      result.blkaghdnlje_ = blkaghdnlje_;
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
      if (other instanceof POGOProtos.Rpc.ABEGOJEGCNI) {
        return mergeFrom((POGOProtos.Rpc.ABEGOJEGCNI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ABEGOJEGCNI other) {
      if (other == POGOProtos.Rpc.ABEGOJEGCNI.getDefaultInstance()) return this;
      if (other.getKdmdegnfgdc() != 0L) {
        setKdmdegnfgdc(other.getKdmdegnfgdc());
      }
      if (other.getJfflmbfnomd() != 0L) {
        setJfflmbfnomd(other.getJfflmbfnomd());
      }
      if (other.getIdiciombhff() != 0L) {
        setIdiciombhff(other.getIdiciombhff());
      }
      if (other.digakmkacfn_ != 0) {
        setDigakmkacfnValue(other.getDigakmkacfnValue());
      }
      if (other.getCddkblklcfh() != false) {
        setCddkblklcfh(other.getCddkblklcfh());
      }
      if (other.getBemldmijann() != false) {
        setBemldmijann(other.getBemldmijann());
      }
      if (other.getFngonbcmjcg() != false) {
        setFngonbcmjcg(other.getFngonbcmjcg());
      }
      if (other.getPfccnejblcb() != false) {
        setPfccnejblcb(other.getPfccnejblcb());
      }
      if (other.getKbcfigpmkmd() != false) {
        setKbcfigpmkmd(other.getKbcfigpmkmd());
      }
      if (other.getLhhdelmkmjf() != 0L) {
        setLhhdelmkmjf(other.getLhhdelmkmjf());
      }
      if (other.getBlkaghdnlje() != false) {
        setBlkaghdnlje(other.getBlkaghdnlje());
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
      POGOProtos.Rpc.ABEGOJEGCNI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ABEGOJEGCNI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long kdmdegnfgdc_ ;
    /**
     * <code>int64 kdmdegnfgdc = 1;</code>
     * @return The kdmdegnfgdc.
     */
    @java.lang.Override
    public long getKdmdegnfgdc() {
      return kdmdegnfgdc_;
    }
    /**
     * <code>int64 kdmdegnfgdc = 1;</code>
     * @param value The kdmdegnfgdc to set.
     * @return This builder for chaining.
     */
    public Builder setKdmdegnfgdc(long value) {
      
      kdmdegnfgdc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kdmdegnfgdc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKdmdegnfgdc() {
      
      kdmdegnfgdc_ = 0L;
      onChanged();
      return this;
    }

    private long jfflmbfnomd_ ;
    /**
     * <code>int64 jfflmbfnomd = 2;</code>
     * @return The jfflmbfnomd.
     */
    @java.lang.Override
    public long getJfflmbfnomd() {
      return jfflmbfnomd_;
    }
    /**
     * <code>int64 jfflmbfnomd = 2;</code>
     * @param value The jfflmbfnomd to set.
     * @return This builder for chaining.
     */
    public Builder setJfflmbfnomd(long value) {
      
      jfflmbfnomd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jfflmbfnomd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfflmbfnomd() {
      
      jfflmbfnomd_ = 0L;
      onChanged();
      return this;
    }

    private long idiciombhff_ ;
    /**
     * <code>int64 idiciombhff = 3;</code>
     * @return The idiciombhff.
     */
    @java.lang.Override
    public long getIdiciombhff() {
      return idiciombhff_;
    }
    /**
     * <code>int64 idiciombhff = 3;</code>
     * @param value The idiciombhff to set.
     * @return This builder for chaining.
     */
    public Builder setIdiciombhff(long value) {
      
      idiciombhff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 idiciombhff = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdiciombhff() {
      
      idiciombhff_ = 0L;
      onChanged();
      return this;
    }

    private int digakmkacfn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
     * @return The enum numeric value on the wire for digakmkacfn.
     */
    @java.lang.Override public int getDigakmkacfnValue() {
      return digakmkacfn_;
    }
    /**
     * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
     * @param value The enum numeric value on the wire for digakmkacfn to set.
     * @return This builder for chaining.
     */
    public Builder setDigakmkacfnValue(int value) {
      
      digakmkacfn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
     * @return The digakmkacfn.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MPCKBLJLBID getDigakmkacfn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MPCKBLJLBID result = POGOProtos.Rpc.MPCKBLJLBID.valueOf(digakmkacfn_);
      return result == null ? POGOProtos.Rpc.MPCKBLJLBID.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
     * @param value The digakmkacfn to set.
     * @return This builder for chaining.
     */
    public Builder setDigakmkacfn(POGOProtos.Rpc.MPCKBLJLBID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      digakmkacfn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MPCKBLJLBID digakmkacfn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDigakmkacfn() {
      
      digakmkacfn_ = 0;
      onChanged();
      return this;
    }

    private boolean cddkblklcfh_ ;
    /**
     * <code>bool cddkblklcfh = 5;</code>
     * @return The cddkblklcfh.
     */
    @java.lang.Override
    public boolean getCddkblklcfh() {
      return cddkblklcfh_;
    }
    /**
     * <code>bool cddkblklcfh = 5;</code>
     * @param value The cddkblklcfh to set.
     * @return This builder for chaining.
     */
    public Builder setCddkblklcfh(boolean value) {
      
      cddkblklcfh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cddkblklcfh = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCddkblklcfh() {
      
      cddkblklcfh_ = false;
      onChanged();
      return this;
    }

    private boolean bemldmijann_ ;
    /**
     * <code>bool bemldmijann = 6;</code>
     * @return The bemldmijann.
     */
    @java.lang.Override
    public boolean getBemldmijann() {
      return bemldmijann_;
    }
    /**
     * <code>bool bemldmijann = 6;</code>
     * @param value The bemldmijann to set.
     * @return This builder for chaining.
     */
    public Builder setBemldmijann(boolean value) {
      
      bemldmijann_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bemldmijann = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBemldmijann() {
      
      bemldmijann_ = false;
      onChanged();
      return this;
    }

    private boolean fngonbcmjcg_ ;
    /**
     * <code>bool fngonbcmjcg = 7;</code>
     * @return The fngonbcmjcg.
     */
    @java.lang.Override
    public boolean getFngonbcmjcg() {
      return fngonbcmjcg_;
    }
    /**
     * <code>bool fngonbcmjcg = 7;</code>
     * @param value The fngonbcmjcg to set.
     * @return This builder for chaining.
     */
    public Builder setFngonbcmjcg(boolean value) {
      
      fngonbcmjcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fngonbcmjcg = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFngonbcmjcg() {
      
      fngonbcmjcg_ = false;
      onChanged();
      return this;
    }

    private boolean pfccnejblcb_ ;
    /**
     * <code>bool pfccnejblcb = 8;</code>
     * @return The pfccnejblcb.
     */
    @java.lang.Override
    public boolean getPfccnejblcb() {
      return pfccnejblcb_;
    }
    /**
     * <code>bool pfccnejblcb = 8;</code>
     * @param value The pfccnejblcb to set.
     * @return This builder for chaining.
     */
    public Builder setPfccnejblcb(boolean value) {
      
      pfccnejblcb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pfccnejblcb = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearPfccnejblcb() {
      
      pfccnejblcb_ = false;
      onChanged();
      return this;
    }

    private boolean kbcfigpmkmd_ ;
    /**
     * <code>bool kbcfigpmkmd = 9;</code>
     * @return The kbcfigpmkmd.
     */
    @java.lang.Override
    public boolean getKbcfigpmkmd() {
      return kbcfigpmkmd_;
    }
    /**
     * <code>bool kbcfigpmkmd = 9;</code>
     * @param value The kbcfigpmkmd to set.
     * @return This builder for chaining.
     */
    public Builder setKbcfigpmkmd(boolean value) {
      
      kbcfigpmkmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kbcfigpmkmd = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbcfigpmkmd() {
      
      kbcfigpmkmd_ = false;
      onChanged();
      return this;
    }

    private long lhhdelmkmjf_ ;
    /**
     * <code>int64 lhhdelmkmjf = 10;</code>
     * @return The lhhdelmkmjf.
     */
    @java.lang.Override
    public long getLhhdelmkmjf() {
      return lhhdelmkmjf_;
    }
    /**
     * <code>int64 lhhdelmkmjf = 10;</code>
     * @param value The lhhdelmkmjf to set.
     * @return This builder for chaining.
     */
    public Builder setLhhdelmkmjf(long value) {
      
      lhhdelmkmjf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lhhdelmkmjf = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearLhhdelmkmjf() {
      
      lhhdelmkmjf_ = 0L;
      onChanged();
      return this;
    }

    private boolean blkaghdnlje_ ;
    /**
     * <code>bool blkaghdnlje = 12;</code>
     * @return The blkaghdnlje.
     */
    @java.lang.Override
    public boolean getBlkaghdnlje() {
      return blkaghdnlje_;
    }
    /**
     * <code>bool blkaghdnlje = 12;</code>
     * @param value The blkaghdnlje to set.
     * @return This builder for chaining.
     */
    public Builder setBlkaghdnlje(boolean value) {
      
      blkaghdnlje_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool blkaghdnlje = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlkaghdnlje() {
      
      blkaghdnlje_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ABEGOJEGCNI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ABEGOJEGCNI)
  private static final POGOProtos.Rpc.ABEGOJEGCNI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ABEGOJEGCNI();
  }

  public static POGOProtos.Rpc.ABEGOJEGCNI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ABEGOJEGCNI>
      PARSER = new com.google.protobuf.AbstractParser<ABEGOJEGCNI>() {
    @java.lang.Override
    public ABEGOJEGCNI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ABEGOJEGCNI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ABEGOJEGCNI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ABEGOJEGCNI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ABEGOJEGCNI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

