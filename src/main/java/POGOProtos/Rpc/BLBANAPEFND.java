// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BLBANAPEFND
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BLBANAPEFND}
 */
public final class BLBANAPEFND extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BLBANAPEFND)
    BLBANAPEFNDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BLBANAPEFND.newBuilder() to construct.
  private BLBANAPEFND(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BLBANAPEFND() {
    gkafgcmdjfc_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BLBANAPEFND();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BLBANAPEFND(
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

            bcigenkndik_ = input.readInt64();
            break;
          }
          case 16: {

            bpnhecdhbpi_ = input.readInt64();
            break;
          }
          case 24: {

            lakledlioeg_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            gkafgcmdjfc_ = rawValue;
            break;
          }
          case 40: {

            iheljcgdcno_ = input.readBool();
            break;
          }
          case 48: {

            ffmfnihdooc_ = input.readBool();
            break;
          }
          case 56: {

            gflobeiinbn_ = input.readBool();
            break;
          }
          case 64: {

            ejajhigcfdg_ = input.readBool();
            break;
          }
          case 72: {

            pfafinjfcnj_ = input.readBool();
            break;
          }
          case 80: {

            gapmaidmcgo_ = input.readInt64();
            break;
          }
          case 96: {

            bmjnbebknig_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLBANAPEFND_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLBANAPEFND_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BLBANAPEFND.class, POGOProtos.Rpc.BLBANAPEFND.Builder.class);
  }

  public static final int BCIGENKNDIK_FIELD_NUMBER = 1;
  private long bcigenkndik_;
  /**
   * <code>int64 bcigenkndik = 1;</code>
   * @return The bcigenkndik.
   */
  @java.lang.Override
  public long getBcigenkndik() {
    return bcigenkndik_;
  }

  public static final int BPNHECDHBPI_FIELD_NUMBER = 2;
  private long bpnhecdhbpi_;
  /**
   * <code>int64 bpnhecdhbpi = 2;</code>
   * @return The bpnhecdhbpi.
   */
  @java.lang.Override
  public long getBpnhecdhbpi() {
    return bpnhecdhbpi_;
  }

  public static final int LAKLEDLIOEG_FIELD_NUMBER = 3;
  private long lakledlioeg_;
  /**
   * <code>int64 lakledlioeg = 3;</code>
   * @return The lakledlioeg.
   */
  @java.lang.Override
  public long getLakledlioeg() {
    return lakledlioeg_;
  }

  public static final int GKAFGCMDJFC_FIELD_NUMBER = 4;
  private int gkafgcmdjfc_;
  /**
   * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
   * @return The enum numeric value on the wire for gkafgcmdjfc.
   */
  @java.lang.Override public int getGkafgcmdjfcValue() {
    return gkafgcmdjfc_;
  }
  /**
   * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
   * @return The gkafgcmdjfc.
   */
  @java.lang.Override public POGOProtos.Rpc.PNJAAHNHPDB getGkafgcmdjfc() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PNJAAHNHPDB result = POGOProtos.Rpc.PNJAAHNHPDB.valueOf(gkafgcmdjfc_);
    return result == null ? POGOProtos.Rpc.PNJAAHNHPDB.UNRECOGNIZED : result;
  }

  public static final int IHELJCGDCNO_FIELD_NUMBER = 5;
  private boolean iheljcgdcno_;
  /**
   * <code>bool iheljcgdcno = 5;</code>
   * @return The iheljcgdcno.
   */
  @java.lang.Override
  public boolean getIheljcgdcno() {
    return iheljcgdcno_;
  }

  public static final int FFMFNIHDOOC_FIELD_NUMBER = 6;
  private boolean ffmfnihdooc_;
  /**
   * <code>bool ffmfnihdooc = 6;</code>
   * @return The ffmfnihdooc.
   */
  @java.lang.Override
  public boolean getFfmfnihdooc() {
    return ffmfnihdooc_;
  }

  public static final int GFLOBEIINBN_FIELD_NUMBER = 7;
  private boolean gflobeiinbn_;
  /**
   * <code>bool gflobeiinbn = 7;</code>
   * @return The gflobeiinbn.
   */
  @java.lang.Override
  public boolean getGflobeiinbn() {
    return gflobeiinbn_;
  }

  public static final int EJAJHIGCFDG_FIELD_NUMBER = 8;
  private boolean ejajhigcfdg_;
  /**
   * <code>bool ejajhigcfdg = 8;</code>
   * @return The ejajhigcfdg.
   */
  @java.lang.Override
  public boolean getEjajhigcfdg() {
    return ejajhigcfdg_;
  }

  public static final int PFAFINJFCNJ_FIELD_NUMBER = 9;
  private boolean pfafinjfcnj_;
  /**
   * <code>bool pfafinjfcnj = 9;</code>
   * @return The pfafinjfcnj.
   */
  @java.lang.Override
  public boolean getPfafinjfcnj() {
    return pfafinjfcnj_;
  }

  public static final int GAPMAIDMCGO_FIELD_NUMBER = 10;
  private long gapmaidmcgo_;
  /**
   * <code>int64 gapmaidmcgo = 10;</code>
   * @return The gapmaidmcgo.
   */
  @java.lang.Override
  public long getGapmaidmcgo() {
    return gapmaidmcgo_;
  }

  public static final int BMJNBEBKNIG_FIELD_NUMBER = 12;
  private boolean bmjnbebknig_;
  /**
   * <code>bool bmjnbebknig = 12;</code>
   * @return The bmjnbebknig.
   */
  @java.lang.Override
  public boolean getBmjnbebknig() {
    return bmjnbebknig_;
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
    if (bcigenkndik_ != 0L) {
      output.writeInt64(1, bcigenkndik_);
    }
    if (bpnhecdhbpi_ != 0L) {
      output.writeInt64(2, bpnhecdhbpi_);
    }
    if (lakledlioeg_ != 0L) {
      output.writeInt64(3, lakledlioeg_);
    }
    if (gkafgcmdjfc_ != POGOProtos.Rpc.PNJAAHNHPDB.PNJAAHNHPDB_POKEMON_UNSET.getNumber()) {
      output.writeEnum(4, gkafgcmdjfc_);
    }
    if (iheljcgdcno_ != false) {
      output.writeBool(5, iheljcgdcno_);
    }
    if (ffmfnihdooc_ != false) {
      output.writeBool(6, ffmfnihdooc_);
    }
    if (gflobeiinbn_ != false) {
      output.writeBool(7, gflobeiinbn_);
    }
    if (ejajhigcfdg_ != false) {
      output.writeBool(8, ejajhigcfdg_);
    }
    if (pfafinjfcnj_ != false) {
      output.writeBool(9, pfafinjfcnj_);
    }
    if (gapmaidmcgo_ != 0L) {
      output.writeInt64(10, gapmaidmcgo_);
    }
    if (bmjnbebknig_ != false) {
      output.writeBool(12, bmjnbebknig_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bcigenkndik_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bcigenkndik_);
    }
    if (bpnhecdhbpi_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bpnhecdhbpi_);
    }
    if (lakledlioeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lakledlioeg_);
    }
    if (gkafgcmdjfc_ != POGOProtos.Rpc.PNJAAHNHPDB.PNJAAHNHPDB_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, gkafgcmdjfc_);
    }
    if (iheljcgdcno_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, iheljcgdcno_);
    }
    if (ffmfnihdooc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, ffmfnihdooc_);
    }
    if (gflobeiinbn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, gflobeiinbn_);
    }
    if (ejajhigcfdg_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, ejajhigcfdg_);
    }
    if (pfafinjfcnj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, pfafinjfcnj_);
    }
    if (gapmaidmcgo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, gapmaidmcgo_);
    }
    if (bmjnbebknig_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, bmjnbebknig_);
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
    if (!(obj instanceof POGOProtos.Rpc.BLBANAPEFND)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BLBANAPEFND other = (POGOProtos.Rpc.BLBANAPEFND) obj;

    if (getBcigenkndik()
        != other.getBcigenkndik()) return false;
    if (getBpnhecdhbpi()
        != other.getBpnhecdhbpi()) return false;
    if (getLakledlioeg()
        != other.getLakledlioeg()) return false;
    if (gkafgcmdjfc_ != other.gkafgcmdjfc_) return false;
    if (getIheljcgdcno()
        != other.getIheljcgdcno()) return false;
    if (getFfmfnihdooc()
        != other.getFfmfnihdooc()) return false;
    if (getGflobeiinbn()
        != other.getGflobeiinbn()) return false;
    if (getEjajhigcfdg()
        != other.getEjajhigcfdg()) return false;
    if (getPfafinjfcnj()
        != other.getPfafinjfcnj()) return false;
    if (getGapmaidmcgo()
        != other.getGapmaidmcgo()) return false;
    if (getBmjnbebknig()
        != other.getBmjnbebknig()) return false;
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
    hash = (37 * hash) + BCIGENKNDIK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBcigenkndik());
    hash = (37 * hash) + BPNHECDHBPI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBpnhecdhbpi());
    hash = (37 * hash) + LAKLEDLIOEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLakledlioeg());
    hash = (37 * hash) + GKAFGCMDJFC_FIELD_NUMBER;
    hash = (53 * hash) + gkafgcmdjfc_;
    hash = (37 * hash) + IHELJCGDCNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIheljcgdcno());
    hash = (37 * hash) + FFMFNIHDOOC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFfmfnihdooc());
    hash = (37 * hash) + GFLOBEIINBN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGflobeiinbn());
    hash = (37 * hash) + EJAJHIGCFDG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEjajhigcfdg());
    hash = (37 * hash) + PFAFINJFCNJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPfafinjfcnj());
    hash = (37 * hash) + GAPMAIDMCGO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGapmaidmcgo());
    hash = (37 * hash) + BMJNBEBKNIG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBmjnbebknig());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLBANAPEFND parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BLBANAPEFND prototype) {
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
   * ref: BLBANAPEFND
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BLBANAPEFND}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BLBANAPEFND)
      POGOProtos.Rpc.BLBANAPEFNDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLBANAPEFND_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLBANAPEFND_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BLBANAPEFND.class, POGOProtos.Rpc.BLBANAPEFND.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BLBANAPEFND.newBuilder()
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
      bcigenkndik_ = 0L;

      bpnhecdhbpi_ = 0L;

      lakledlioeg_ = 0L;

      gkafgcmdjfc_ = 0;

      iheljcgdcno_ = false;

      ffmfnihdooc_ = false;

      gflobeiinbn_ = false;

      ejajhigcfdg_ = false;

      pfafinjfcnj_ = false;

      gapmaidmcgo_ = 0L;

      bmjnbebknig_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLBANAPEFND_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLBANAPEFND getDefaultInstanceForType() {
      return POGOProtos.Rpc.BLBANAPEFND.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLBANAPEFND build() {
      POGOProtos.Rpc.BLBANAPEFND result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLBANAPEFND buildPartial() {
      POGOProtos.Rpc.BLBANAPEFND result = new POGOProtos.Rpc.BLBANAPEFND(this);
      result.bcigenkndik_ = bcigenkndik_;
      result.bpnhecdhbpi_ = bpnhecdhbpi_;
      result.lakledlioeg_ = lakledlioeg_;
      result.gkafgcmdjfc_ = gkafgcmdjfc_;
      result.iheljcgdcno_ = iheljcgdcno_;
      result.ffmfnihdooc_ = ffmfnihdooc_;
      result.gflobeiinbn_ = gflobeiinbn_;
      result.ejajhigcfdg_ = ejajhigcfdg_;
      result.pfafinjfcnj_ = pfafinjfcnj_;
      result.gapmaidmcgo_ = gapmaidmcgo_;
      result.bmjnbebknig_ = bmjnbebknig_;
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
      if (other instanceof POGOProtos.Rpc.BLBANAPEFND) {
        return mergeFrom((POGOProtos.Rpc.BLBANAPEFND)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BLBANAPEFND other) {
      if (other == POGOProtos.Rpc.BLBANAPEFND.getDefaultInstance()) return this;
      if (other.getBcigenkndik() != 0L) {
        setBcigenkndik(other.getBcigenkndik());
      }
      if (other.getBpnhecdhbpi() != 0L) {
        setBpnhecdhbpi(other.getBpnhecdhbpi());
      }
      if (other.getLakledlioeg() != 0L) {
        setLakledlioeg(other.getLakledlioeg());
      }
      if (other.gkafgcmdjfc_ != 0) {
        setGkafgcmdjfcValue(other.getGkafgcmdjfcValue());
      }
      if (other.getIheljcgdcno() != false) {
        setIheljcgdcno(other.getIheljcgdcno());
      }
      if (other.getFfmfnihdooc() != false) {
        setFfmfnihdooc(other.getFfmfnihdooc());
      }
      if (other.getGflobeiinbn() != false) {
        setGflobeiinbn(other.getGflobeiinbn());
      }
      if (other.getEjajhigcfdg() != false) {
        setEjajhigcfdg(other.getEjajhigcfdg());
      }
      if (other.getPfafinjfcnj() != false) {
        setPfafinjfcnj(other.getPfafinjfcnj());
      }
      if (other.getGapmaidmcgo() != 0L) {
        setGapmaidmcgo(other.getGapmaidmcgo());
      }
      if (other.getBmjnbebknig() != false) {
        setBmjnbebknig(other.getBmjnbebknig());
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
      POGOProtos.Rpc.BLBANAPEFND parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BLBANAPEFND) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long bcigenkndik_ ;
    /**
     * <code>int64 bcigenkndik = 1;</code>
     * @return The bcigenkndik.
     */
    @java.lang.Override
    public long getBcigenkndik() {
      return bcigenkndik_;
    }
    /**
     * <code>int64 bcigenkndik = 1;</code>
     * @param value The bcigenkndik to set.
     * @return This builder for chaining.
     */
    public Builder setBcigenkndik(long value) {
      
      bcigenkndik_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bcigenkndik = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBcigenkndik() {
      
      bcigenkndik_ = 0L;
      onChanged();
      return this;
    }

    private long bpnhecdhbpi_ ;
    /**
     * <code>int64 bpnhecdhbpi = 2;</code>
     * @return The bpnhecdhbpi.
     */
    @java.lang.Override
    public long getBpnhecdhbpi() {
      return bpnhecdhbpi_;
    }
    /**
     * <code>int64 bpnhecdhbpi = 2;</code>
     * @param value The bpnhecdhbpi to set.
     * @return This builder for chaining.
     */
    public Builder setBpnhecdhbpi(long value) {
      
      bpnhecdhbpi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bpnhecdhbpi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBpnhecdhbpi() {
      
      bpnhecdhbpi_ = 0L;
      onChanged();
      return this;
    }

    private long lakledlioeg_ ;
    /**
     * <code>int64 lakledlioeg = 3;</code>
     * @return The lakledlioeg.
     */
    @java.lang.Override
    public long getLakledlioeg() {
      return lakledlioeg_;
    }
    /**
     * <code>int64 lakledlioeg = 3;</code>
     * @param value The lakledlioeg to set.
     * @return This builder for chaining.
     */
    public Builder setLakledlioeg(long value) {
      
      lakledlioeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lakledlioeg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLakledlioeg() {
      
      lakledlioeg_ = 0L;
      onChanged();
      return this;
    }

    private int gkafgcmdjfc_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
     * @return The enum numeric value on the wire for gkafgcmdjfc.
     */
    @java.lang.Override public int getGkafgcmdjfcValue() {
      return gkafgcmdjfc_;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
     * @param value The enum numeric value on the wire for gkafgcmdjfc to set.
     * @return This builder for chaining.
     */
    public Builder setGkafgcmdjfcValue(int value) {
      
      gkafgcmdjfc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
     * @return The gkafgcmdjfc.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PNJAAHNHPDB getGkafgcmdjfc() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PNJAAHNHPDB result = POGOProtos.Rpc.PNJAAHNHPDB.valueOf(gkafgcmdjfc_);
      return result == null ? POGOProtos.Rpc.PNJAAHNHPDB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
     * @param value The gkafgcmdjfc to set.
     * @return This builder for chaining.
     */
    public Builder setGkafgcmdjfc(POGOProtos.Rpc.PNJAAHNHPDB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gkafgcmdjfc_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB gkafgcmdjfc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGkafgcmdjfc() {
      
      gkafgcmdjfc_ = 0;
      onChanged();
      return this;
    }

    private boolean iheljcgdcno_ ;
    /**
     * <code>bool iheljcgdcno = 5;</code>
     * @return The iheljcgdcno.
     */
    @java.lang.Override
    public boolean getIheljcgdcno() {
      return iheljcgdcno_;
    }
    /**
     * <code>bool iheljcgdcno = 5;</code>
     * @param value The iheljcgdcno to set.
     * @return This builder for chaining.
     */
    public Builder setIheljcgdcno(boolean value) {
      
      iheljcgdcno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool iheljcgdcno = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIheljcgdcno() {
      
      iheljcgdcno_ = false;
      onChanged();
      return this;
    }

    private boolean ffmfnihdooc_ ;
    /**
     * <code>bool ffmfnihdooc = 6;</code>
     * @return The ffmfnihdooc.
     */
    @java.lang.Override
    public boolean getFfmfnihdooc() {
      return ffmfnihdooc_;
    }
    /**
     * <code>bool ffmfnihdooc = 6;</code>
     * @param value The ffmfnihdooc to set.
     * @return This builder for chaining.
     */
    public Builder setFfmfnihdooc(boolean value) {
      
      ffmfnihdooc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ffmfnihdooc = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfmfnihdooc() {
      
      ffmfnihdooc_ = false;
      onChanged();
      return this;
    }

    private boolean gflobeiinbn_ ;
    /**
     * <code>bool gflobeiinbn = 7;</code>
     * @return The gflobeiinbn.
     */
    @java.lang.Override
    public boolean getGflobeiinbn() {
      return gflobeiinbn_;
    }
    /**
     * <code>bool gflobeiinbn = 7;</code>
     * @param value The gflobeiinbn to set.
     * @return This builder for chaining.
     */
    public Builder setGflobeiinbn(boolean value) {
      
      gflobeiinbn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool gflobeiinbn = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGflobeiinbn() {
      
      gflobeiinbn_ = false;
      onChanged();
      return this;
    }

    private boolean ejajhigcfdg_ ;
    /**
     * <code>bool ejajhigcfdg = 8;</code>
     * @return The ejajhigcfdg.
     */
    @java.lang.Override
    public boolean getEjajhigcfdg() {
      return ejajhigcfdg_;
    }
    /**
     * <code>bool ejajhigcfdg = 8;</code>
     * @param value The ejajhigcfdg to set.
     * @return This builder for chaining.
     */
    public Builder setEjajhigcfdg(boolean value) {
      
      ejajhigcfdg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ejajhigcfdg = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearEjajhigcfdg() {
      
      ejajhigcfdg_ = false;
      onChanged();
      return this;
    }

    private boolean pfafinjfcnj_ ;
    /**
     * <code>bool pfafinjfcnj = 9;</code>
     * @return The pfafinjfcnj.
     */
    @java.lang.Override
    public boolean getPfafinjfcnj() {
      return pfafinjfcnj_;
    }
    /**
     * <code>bool pfafinjfcnj = 9;</code>
     * @param value The pfafinjfcnj to set.
     * @return This builder for chaining.
     */
    public Builder setPfafinjfcnj(boolean value) {
      
      pfafinjfcnj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pfafinjfcnj = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearPfafinjfcnj() {
      
      pfafinjfcnj_ = false;
      onChanged();
      return this;
    }

    private long gapmaidmcgo_ ;
    /**
     * <code>int64 gapmaidmcgo = 10;</code>
     * @return The gapmaidmcgo.
     */
    @java.lang.Override
    public long getGapmaidmcgo() {
      return gapmaidmcgo_;
    }
    /**
     * <code>int64 gapmaidmcgo = 10;</code>
     * @param value The gapmaidmcgo to set.
     * @return This builder for chaining.
     */
    public Builder setGapmaidmcgo(long value) {
      
      gapmaidmcgo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gapmaidmcgo = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearGapmaidmcgo() {
      
      gapmaidmcgo_ = 0L;
      onChanged();
      return this;
    }

    private boolean bmjnbebknig_ ;
    /**
     * <code>bool bmjnbebknig = 12;</code>
     * @return The bmjnbebknig.
     */
    @java.lang.Override
    public boolean getBmjnbebknig() {
      return bmjnbebknig_;
    }
    /**
     * <code>bool bmjnbebknig = 12;</code>
     * @param value The bmjnbebknig to set.
     * @return This builder for chaining.
     */
    public Builder setBmjnbebknig(boolean value) {
      
      bmjnbebknig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bmjnbebknig = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmjnbebknig() {
      
      bmjnbebknig_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BLBANAPEFND)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BLBANAPEFND)
  private static final POGOProtos.Rpc.BLBANAPEFND DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BLBANAPEFND();
  }

  public static POGOProtos.Rpc.BLBANAPEFND getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BLBANAPEFND>
      PARSER = new com.google.protobuf.AbstractParser<BLBANAPEFND>() {
    @java.lang.Override
    public BLBANAPEFND parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BLBANAPEFND(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BLBANAPEFND> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BLBANAPEFND> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BLBANAPEFND getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

