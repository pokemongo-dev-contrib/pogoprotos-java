// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IJINHLJFJMJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IJINHLJFJMJ}
 */
public final class IJINHLJFJMJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IJINHLJFJMJ)
    IJINHLJFJMJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IJINHLJFJMJ.newBuilder() to construct.
  private IJINHLJFJMJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IJINHLJFJMJ() {
    cdbniiggogl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IJINHLJFJMJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IJINHLJFJMJ(
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

            hehlpggiofl_ = input.readInt64();
            break;
          }
          case 16: {

            jceionfphge_ = input.readInt64();
            break;
          }
          case 24: {

            nadmldloddd_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            cdbniiggogl_ = rawValue;
            break;
          }
          case 40: {

            lkihjinijjo_ = input.readBool();
            break;
          }
          case 48: {

            dlpdcbloahl_ = input.readBool();
            break;
          }
          case 56: {

            nhklhbedgfl_ = input.readBool();
            break;
          }
          case 64: {

            mgfiilfmkhd_ = input.readBool();
            break;
          }
          case 72: {

            jficgojdfin_ = input.readBool();
            break;
          }
          case 80: {

            kihdgafekll_ = input.readInt64();
            break;
          }
          case 96: {

            oegddaiccep_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJINHLJFJMJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJINHLJFJMJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IJINHLJFJMJ.class, POGOProtos.Rpc.IJINHLJFJMJ.Builder.class);
  }

  public static final int HEHLPGGIOFL_FIELD_NUMBER = 1;
  private long hehlpggiofl_;
  /**
   * <code>int64 hehlpggiofl = 1;</code>
   * @return The hehlpggiofl.
   */
  @java.lang.Override
  public long getHehlpggiofl() {
    return hehlpggiofl_;
  }

  public static final int JCEIONFPHGE_FIELD_NUMBER = 2;
  private long jceionfphge_;
  /**
   * <code>int64 jceionfphge = 2;</code>
   * @return The jceionfphge.
   */
  @java.lang.Override
  public long getJceionfphge() {
    return jceionfphge_;
  }

  public static final int NADMLDLODDD_FIELD_NUMBER = 3;
  private long nadmldloddd_;
  /**
   * <code>int64 nadmldloddd = 3;</code>
   * @return The nadmldloddd.
   */
  @java.lang.Override
  public long getNadmldloddd() {
    return nadmldloddd_;
  }

  public static final int CDBNIIGGOGL_FIELD_NUMBER = 4;
  private int cdbniiggogl_;
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
   * @return The enum numeric value on the wire for cdbniiggogl.
   */
  @java.lang.Override public int getCdbniiggoglValue() {
    return cdbniiggogl_;
  }
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
   * @return The cdbniiggogl.
   */
  @java.lang.Override public POGOProtos.Rpc.NGJHAEPFGGB getCdbniiggogl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(cdbniiggogl_);
    return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
  }

  public static final int LKIHJINIJJO_FIELD_NUMBER = 5;
  private boolean lkihjinijjo_;
  /**
   * <code>bool lkihjinijjo = 5;</code>
   * @return The lkihjinijjo.
   */
  @java.lang.Override
  public boolean getLkihjinijjo() {
    return lkihjinijjo_;
  }

  public static final int DLPDCBLOAHL_FIELD_NUMBER = 6;
  private boolean dlpdcbloahl_;
  /**
   * <code>bool dlpdcbloahl = 6;</code>
   * @return The dlpdcbloahl.
   */
  @java.lang.Override
  public boolean getDlpdcbloahl() {
    return dlpdcbloahl_;
  }

  public static final int NHKLHBEDGFL_FIELD_NUMBER = 7;
  private boolean nhklhbedgfl_;
  /**
   * <code>bool nhklhbedgfl = 7;</code>
   * @return The nhklhbedgfl.
   */
  @java.lang.Override
  public boolean getNhklhbedgfl() {
    return nhklhbedgfl_;
  }

  public static final int MGFIILFMKHD_FIELD_NUMBER = 8;
  private boolean mgfiilfmkhd_;
  /**
   * <code>bool mgfiilfmkhd = 8;</code>
   * @return The mgfiilfmkhd.
   */
  @java.lang.Override
  public boolean getMgfiilfmkhd() {
    return mgfiilfmkhd_;
  }

  public static final int JFICGOJDFIN_FIELD_NUMBER = 9;
  private boolean jficgojdfin_;
  /**
   * <code>bool jficgojdfin = 9;</code>
   * @return The jficgojdfin.
   */
  @java.lang.Override
  public boolean getJficgojdfin() {
    return jficgojdfin_;
  }

  public static final int KIHDGAFEKLL_FIELD_NUMBER = 10;
  private long kihdgafekll_;
  /**
   * <code>int64 kihdgafekll = 10;</code>
   * @return The kihdgafekll.
   */
  @java.lang.Override
  public long getKihdgafekll() {
    return kihdgafekll_;
  }

  public static final int OEGDDAICCEP_FIELD_NUMBER = 12;
  private boolean oegddaiccep_;
  /**
   * <code>bool oegddaiccep = 12;</code>
   * @return The oegddaiccep.
   */
  @java.lang.Override
  public boolean getOegddaiccep() {
    return oegddaiccep_;
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
    if (hehlpggiofl_ != 0L) {
      output.writeInt64(1, hehlpggiofl_);
    }
    if (jceionfphge_ != 0L) {
      output.writeInt64(2, jceionfphge_);
    }
    if (nadmldloddd_ != 0L) {
      output.writeInt64(3, nadmldloddd_);
    }
    if (cdbniiggogl_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      output.writeEnum(4, cdbniiggogl_);
    }
    if (lkihjinijjo_ != false) {
      output.writeBool(5, lkihjinijjo_);
    }
    if (dlpdcbloahl_ != false) {
      output.writeBool(6, dlpdcbloahl_);
    }
    if (nhklhbedgfl_ != false) {
      output.writeBool(7, nhklhbedgfl_);
    }
    if (mgfiilfmkhd_ != false) {
      output.writeBool(8, mgfiilfmkhd_);
    }
    if (jficgojdfin_ != false) {
      output.writeBool(9, jficgojdfin_);
    }
    if (kihdgafekll_ != 0L) {
      output.writeInt64(10, kihdgafekll_);
    }
    if (oegddaiccep_ != false) {
      output.writeBool(12, oegddaiccep_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hehlpggiofl_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hehlpggiofl_);
    }
    if (jceionfphge_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jceionfphge_);
    }
    if (nadmldloddd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, nadmldloddd_);
    }
    if (cdbniiggogl_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, cdbniiggogl_);
    }
    if (lkihjinijjo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, lkihjinijjo_);
    }
    if (dlpdcbloahl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, dlpdcbloahl_);
    }
    if (nhklhbedgfl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, nhklhbedgfl_);
    }
    if (mgfiilfmkhd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, mgfiilfmkhd_);
    }
    if (jficgojdfin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, jficgojdfin_);
    }
    if (kihdgafekll_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, kihdgafekll_);
    }
    if (oegddaiccep_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, oegddaiccep_);
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
    if (!(obj instanceof POGOProtos.Rpc.IJINHLJFJMJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IJINHLJFJMJ other = (POGOProtos.Rpc.IJINHLJFJMJ) obj;

    if (getHehlpggiofl()
        != other.getHehlpggiofl()) return false;
    if (getJceionfphge()
        != other.getJceionfphge()) return false;
    if (getNadmldloddd()
        != other.getNadmldloddd()) return false;
    if (cdbniiggogl_ != other.cdbniiggogl_) return false;
    if (getLkihjinijjo()
        != other.getLkihjinijjo()) return false;
    if (getDlpdcbloahl()
        != other.getDlpdcbloahl()) return false;
    if (getNhklhbedgfl()
        != other.getNhklhbedgfl()) return false;
    if (getMgfiilfmkhd()
        != other.getMgfiilfmkhd()) return false;
    if (getJficgojdfin()
        != other.getJficgojdfin()) return false;
    if (getKihdgafekll()
        != other.getKihdgafekll()) return false;
    if (getOegddaiccep()
        != other.getOegddaiccep()) return false;
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
    hash = (37 * hash) + HEHLPGGIOFL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHehlpggiofl());
    hash = (37 * hash) + JCEIONFPHGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJceionfphge());
    hash = (37 * hash) + NADMLDLODDD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNadmldloddd());
    hash = (37 * hash) + CDBNIIGGOGL_FIELD_NUMBER;
    hash = (53 * hash) + cdbniiggogl_;
    hash = (37 * hash) + LKIHJINIJJO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLkihjinijjo());
    hash = (37 * hash) + DLPDCBLOAHL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDlpdcbloahl());
    hash = (37 * hash) + NHKLHBEDGFL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNhklhbedgfl());
    hash = (37 * hash) + MGFIILFMKHD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMgfiilfmkhd());
    hash = (37 * hash) + JFICGOJDFIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJficgojdfin());
    hash = (37 * hash) + KIHDGAFEKLL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKihdgafekll());
    hash = (37 * hash) + OEGDDAICCEP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOegddaiccep());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJINHLJFJMJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IJINHLJFJMJ prototype) {
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
   * ref: IJINHLJFJMJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IJINHLJFJMJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IJINHLJFJMJ)
      POGOProtos.Rpc.IJINHLJFJMJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJINHLJFJMJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJINHLJFJMJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IJINHLJFJMJ.class, POGOProtos.Rpc.IJINHLJFJMJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IJINHLJFJMJ.newBuilder()
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
      hehlpggiofl_ = 0L;

      jceionfphge_ = 0L;

      nadmldloddd_ = 0L;

      cdbniiggogl_ = 0;

      lkihjinijjo_ = false;

      dlpdcbloahl_ = false;

      nhklhbedgfl_ = false;

      mgfiilfmkhd_ = false;

      jficgojdfin_ = false;

      kihdgafekll_ = 0L;

      oegddaiccep_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IJINHLJFJMJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJINHLJFJMJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.IJINHLJFJMJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJINHLJFJMJ build() {
      POGOProtos.Rpc.IJINHLJFJMJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJINHLJFJMJ buildPartial() {
      POGOProtos.Rpc.IJINHLJFJMJ result = new POGOProtos.Rpc.IJINHLJFJMJ(this);
      result.hehlpggiofl_ = hehlpggiofl_;
      result.jceionfphge_ = jceionfphge_;
      result.nadmldloddd_ = nadmldloddd_;
      result.cdbniiggogl_ = cdbniiggogl_;
      result.lkihjinijjo_ = lkihjinijjo_;
      result.dlpdcbloahl_ = dlpdcbloahl_;
      result.nhklhbedgfl_ = nhklhbedgfl_;
      result.mgfiilfmkhd_ = mgfiilfmkhd_;
      result.jficgojdfin_ = jficgojdfin_;
      result.kihdgafekll_ = kihdgafekll_;
      result.oegddaiccep_ = oegddaiccep_;
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
      if (other instanceof POGOProtos.Rpc.IJINHLJFJMJ) {
        return mergeFrom((POGOProtos.Rpc.IJINHLJFJMJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IJINHLJFJMJ other) {
      if (other == POGOProtos.Rpc.IJINHLJFJMJ.getDefaultInstance()) return this;
      if (other.getHehlpggiofl() != 0L) {
        setHehlpggiofl(other.getHehlpggiofl());
      }
      if (other.getJceionfphge() != 0L) {
        setJceionfphge(other.getJceionfphge());
      }
      if (other.getNadmldloddd() != 0L) {
        setNadmldloddd(other.getNadmldloddd());
      }
      if (other.cdbniiggogl_ != 0) {
        setCdbniiggoglValue(other.getCdbniiggoglValue());
      }
      if (other.getLkihjinijjo() != false) {
        setLkihjinijjo(other.getLkihjinijjo());
      }
      if (other.getDlpdcbloahl() != false) {
        setDlpdcbloahl(other.getDlpdcbloahl());
      }
      if (other.getNhklhbedgfl() != false) {
        setNhklhbedgfl(other.getNhklhbedgfl());
      }
      if (other.getMgfiilfmkhd() != false) {
        setMgfiilfmkhd(other.getMgfiilfmkhd());
      }
      if (other.getJficgojdfin() != false) {
        setJficgojdfin(other.getJficgojdfin());
      }
      if (other.getKihdgafekll() != 0L) {
        setKihdgafekll(other.getKihdgafekll());
      }
      if (other.getOegddaiccep() != false) {
        setOegddaiccep(other.getOegddaiccep());
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
      POGOProtos.Rpc.IJINHLJFJMJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IJINHLJFJMJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long hehlpggiofl_ ;
    /**
     * <code>int64 hehlpggiofl = 1;</code>
     * @return The hehlpggiofl.
     */
    @java.lang.Override
    public long getHehlpggiofl() {
      return hehlpggiofl_;
    }
    /**
     * <code>int64 hehlpggiofl = 1;</code>
     * @param value The hehlpggiofl to set.
     * @return This builder for chaining.
     */
    public Builder setHehlpggiofl(long value) {
      
      hehlpggiofl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hehlpggiofl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHehlpggiofl() {
      
      hehlpggiofl_ = 0L;
      onChanged();
      return this;
    }

    private long jceionfphge_ ;
    /**
     * <code>int64 jceionfphge = 2;</code>
     * @return The jceionfphge.
     */
    @java.lang.Override
    public long getJceionfphge() {
      return jceionfphge_;
    }
    /**
     * <code>int64 jceionfphge = 2;</code>
     * @param value The jceionfphge to set.
     * @return This builder for chaining.
     */
    public Builder setJceionfphge(long value) {
      
      jceionfphge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jceionfphge = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJceionfphge() {
      
      jceionfphge_ = 0L;
      onChanged();
      return this;
    }

    private long nadmldloddd_ ;
    /**
     * <code>int64 nadmldloddd = 3;</code>
     * @return The nadmldloddd.
     */
    @java.lang.Override
    public long getNadmldloddd() {
      return nadmldloddd_;
    }
    /**
     * <code>int64 nadmldloddd = 3;</code>
     * @param value The nadmldloddd to set.
     * @return This builder for chaining.
     */
    public Builder setNadmldloddd(long value) {
      
      nadmldloddd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 nadmldloddd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNadmldloddd() {
      
      nadmldloddd_ = 0L;
      onChanged();
      return this;
    }

    private int cdbniiggogl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
     * @return The enum numeric value on the wire for cdbniiggogl.
     */
    @java.lang.Override public int getCdbniiggoglValue() {
      return cdbniiggogl_;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
     * @param value The enum numeric value on the wire for cdbniiggogl to set.
     * @return This builder for chaining.
     */
    public Builder setCdbniiggoglValue(int value) {
      
      cdbniiggogl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
     * @return The cdbniiggogl.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NGJHAEPFGGB getCdbniiggogl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(cdbniiggogl_);
      return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
     * @param value The cdbniiggogl to set.
     * @return This builder for chaining.
     */
    public Builder setCdbniiggogl(POGOProtos.Rpc.NGJHAEPFGGB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cdbniiggogl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB cdbniiggogl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCdbniiggogl() {
      
      cdbniiggogl_ = 0;
      onChanged();
      return this;
    }

    private boolean lkihjinijjo_ ;
    /**
     * <code>bool lkihjinijjo = 5;</code>
     * @return The lkihjinijjo.
     */
    @java.lang.Override
    public boolean getLkihjinijjo() {
      return lkihjinijjo_;
    }
    /**
     * <code>bool lkihjinijjo = 5;</code>
     * @param value The lkihjinijjo to set.
     * @return This builder for chaining.
     */
    public Builder setLkihjinijjo(boolean value) {
      
      lkihjinijjo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lkihjinijjo = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLkihjinijjo() {
      
      lkihjinijjo_ = false;
      onChanged();
      return this;
    }

    private boolean dlpdcbloahl_ ;
    /**
     * <code>bool dlpdcbloahl = 6;</code>
     * @return The dlpdcbloahl.
     */
    @java.lang.Override
    public boolean getDlpdcbloahl() {
      return dlpdcbloahl_;
    }
    /**
     * <code>bool dlpdcbloahl = 6;</code>
     * @param value The dlpdcbloahl to set.
     * @return This builder for chaining.
     */
    public Builder setDlpdcbloahl(boolean value) {
      
      dlpdcbloahl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dlpdcbloahl = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDlpdcbloahl() {
      
      dlpdcbloahl_ = false;
      onChanged();
      return this;
    }

    private boolean nhklhbedgfl_ ;
    /**
     * <code>bool nhklhbedgfl = 7;</code>
     * @return The nhklhbedgfl.
     */
    @java.lang.Override
    public boolean getNhklhbedgfl() {
      return nhklhbedgfl_;
    }
    /**
     * <code>bool nhklhbedgfl = 7;</code>
     * @param value The nhklhbedgfl to set.
     * @return This builder for chaining.
     */
    public Builder setNhklhbedgfl(boolean value) {
      
      nhklhbedgfl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nhklhbedgfl = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNhklhbedgfl() {
      
      nhklhbedgfl_ = false;
      onChanged();
      return this;
    }

    private boolean mgfiilfmkhd_ ;
    /**
     * <code>bool mgfiilfmkhd = 8;</code>
     * @return The mgfiilfmkhd.
     */
    @java.lang.Override
    public boolean getMgfiilfmkhd() {
      return mgfiilfmkhd_;
    }
    /**
     * <code>bool mgfiilfmkhd = 8;</code>
     * @param value The mgfiilfmkhd to set.
     * @return This builder for chaining.
     */
    public Builder setMgfiilfmkhd(boolean value) {
      
      mgfiilfmkhd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mgfiilfmkhd = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgfiilfmkhd() {
      
      mgfiilfmkhd_ = false;
      onChanged();
      return this;
    }

    private boolean jficgojdfin_ ;
    /**
     * <code>bool jficgojdfin = 9;</code>
     * @return The jficgojdfin.
     */
    @java.lang.Override
    public boolean getJficgojdfin() {
      return jficgojdfin_;
    }
    /**
     * <code>bool jficgojdfin = 9;</code>
     * @param value The jficgojdfin to set.
     * @return This builder for chaining.
     */
    public Builder setJficgojdfin(boolean value) {
      
      jficgojdfin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jficgojdfin = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearJficgojdfin() {
      
      jficgojdfin_ = false;
      onChanged();
      return this;
    }

    private long kihdgafekll_ ;
    /**
     * <code>int64 kihdgafekll = 10;</code>
     * @return The kihdgafekll.
     */
    @java.lang.Override
    public long getKihdgafekll() {
      return kihdgafekll_;
    }
    /**
     * <code>int64 kihdgafekll = 10;</code>
     * @param value The kihdgafekll to set.
     * @return This builder for chaining.
     */
    public Builder setKihdgafekll(long value) {
      
      kihdgafekll_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kihdgafekll = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearKihdgafekll() {
      
      kihdgafekll_ = 0L;
      onChanged();
      return this;
    }

    private boolean oegddaiccep_ ;
    /**
     * <code>bool oegddaiccep = 12;</code>
     * @return The oegddaiccep.
     */
    @java.lang.Override
    public boolean getOegddaiccep() {
      return oegddaiccep_;
    }
    /**
     * <code>bool oegddaiccep = 12;</code>
     * @param value The oegddaiccep to set.
     * @return This builder for chaining.
     */
    public Builder setOegddaiccep(boolean value) {
      
      oegddaiccep_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool oegddaiccep = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearOegddaiccep() {
      
      oegddaiccep_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IJINHLJFJMJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IJINHLJFJMJ)
  private static final POGOProtos.Rpc.IJINHLJFJMJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IJINHLJFJMJ();
  }

  public static POGOProtos.Rpc.IJINHLJFJMJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IJINHLJFJMJ>
      PARSER = new com.google.protobuf.AbstractParser<IJINHLJFJMJ>() {
    @java.lang.Override
    public IJINHLJFJMJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IJINHLJFJMJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IJINHLJFJMJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IJINHLJFJMJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IJINHLJFJMJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

