// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CNHLJFCGOPD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CNHLJFCGOPD}
 */
public  final class CNHLJFCGOPD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CNHLJFCGOPD)
    CNHLJFCGOPDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CNHLJFCGOPD.newBuilder() to construct.
  private CNHLJFCGOPD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CNHLJFCGOPD() {
    jcdnlpeblgl_ = 0;
    mfppbomekjn_ = 0;
    alhgoohmljn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CNHLJFCGOPD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CNHLJFCGOPD(
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

            opiapbcehbm_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            jcdnlpeblgl_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            mfppbomekjn_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            alhgoohmljn_ = rawValue;
            break;
          }
          case 40: {

            nfgefngphie_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNHLJFCGOPD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNHLJFCGOPD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CNHLJFCGOPD.class, POGOProtos.Rpc.CNHLJFCGOPD.Builder.class);
  }

  public static final int OPIAPBCEHBM_FIELD_NUMBER = 1;
  private long opiapbcehbm_;
  /**
   * <code>uint64 opiapbcehbm = 1;</code>
   * @return The opiapbcehbm.
   */
  public long getOpiapbcehbm() {
    return opiapbcehbm_;
  }

  public static final int JCDNLPEBLGL_FIELD_NUMBER = 2;
  private int jcdnlpeblgl_;
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
   * @return The enum numeric value on the wire for jcdnlpeblgl.
   */
  public int getJcdnlpeblglValue() {
    return jcdnlpeblgl_;
  }
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
   * @return The jcdnlpeblgl.
   */
  public POGOProtos.Rpc.EAFFLJCABOK getJcdnlpeblgl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(jcdnlpeblgl_);
    return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
  }

  public static final int MFPPBOMEKJN_FIELD_NUMBER = 3;
  private int mfppbomekjn_;
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
   * @return The enum numeric value on the wire for mfppbomekjn.
   */
  public int getMfppbomekjnValue() {
    return mfppbomekjn_;
  }
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
   * @return The mfppbomekjn.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getMfppbomekjn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(mfppbomekjn_);
    return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
  }

  public static final int ALHGOOHMLJN_FIELD_NUMBER = 4;
  private int alhgoohmljn_;
  /**
   * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
   * @return The enum numeric value on the wire for alhgoohmljn.
   */
  public int getAlhgoohmljnValue() {
    return alhgoohmljn_;
  }
  /**
   * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
   * @return The alhgoohmljn.
   */
  public POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG getAlhgoohmljn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG result = POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.valueOf(alhgoohmljn_);
    return result == null ? POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.UNRECOGNIZED : result;
  }

  public static final int NFGEFNGPHIE_FIELD_NUMBER = 5;
  private boolean nfgefngphie_;
  /**
   * <code>bool nfgefngphie = 5;</code>
   * @return The nfgefngphie.
   */
  public boolean getNfgefngphie() {
    return nfgefngphie_;
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
    if (opiapbcehbm_ != 0L) {
      output.writeUInt64(1, opiapbcehbm_);
    }
    if (jcdnlpeblgl_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, jcdnlpeblgl_);
    }
    if (mfppbomekjn_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      output.writeEnum(3, mfppbomekjn_);
    }
    if (alhgoohmljn_ != POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.ABLLNEDIEIG_FORM_UNSET.getNumber()) {
      output.writeEnum(4, alhgoohmljn_);
    }
    if (nfgefngphie_ != false) {
      output.writeBool(5, nfgefngphie_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (opiapbcehbm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, opiapbcehbm_);
    }
    if (jcdnlpeblgl_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, jcdnlpeblgl_);
    }
    if (mfppbomekjn_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mfppbomekjn_);
    }
    if (alhgoohmljn_ != POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.ABLLNEDIEIG_FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, alhgoohmljn_);
    }
    if (nfgefngphie_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, nfgefngphie_);
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
    if (!(obj instanceof POGOProtos.Rpc.CNHLJFCGOPD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CNHLJFCGOPD other = (POGOProtos.Rpc.CNHLJFCGOPD) obj;

    if (getOpiapbcehbm()
        != other.getOpiapbcehbm()) return false;
    if (jcdnlpeblgl_ != other.jcdnlpeblgl_) return false;
    if (mfppbomekjn_ != other.mfppbomekjn_) return false;
    if (alhgoohmljn_ != other.alhgoohmljn_) return false;
    if (getNfgefngphie()
        != other.getNfgefngphie()) return false;
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
    hash = (37 * hash) + OPIAPBCEHBM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOpiapbcehbm());
    hash = (37 * hash) + JCDNLPEBLGL_FIELD_NUMBER;
    hash = (53 * hash) + jcdnlpeblgl_;
    hash = (37 * hash) + MFPPBOMEKJN_FIELD_NUMBER;
    hash = (53 * hash) + mfppbomekjn_;
    hash = (37 * hash) + ALHGOOHMLJN_FIELD_NUMBER;
    hash = (53 * hash) + alhgoohmljn_;
    hash = (37 * hash) + NFGEFNGPHIE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNfgefngphie());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNHLJFCGOPD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CNHLJFCGOPD prototype) {
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
   * ref: CNHLJFCGOPD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CNHLJFCGOPD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CNHLJFCGOPD)
      POGOProtos.Rpc.CNHLJFCGOPDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNHLJFCGOPD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNHLJFCGOPD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CNHLJFCGOPD.class, POGOProtos.Rpc.CNHLJFCGOPD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CNHLJFCGOPD.newBuilder()
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
      opiapbcehbm_ = 0L;

      jcdnlpeblgl_ = 0;

      mfppbomekjn_ = 0;

      alhgoohmljn_ = 0;

      nfgefngphie_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNHLJFCGOPD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNHLJFCGOPD getDefaultInstanceForType() {
      return POGOProtos.Rpc.CNHLJFCGOPD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNHLJFCGOPD build() {
      POGOProtos.Rpc.CNHLJFCGOPD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNHLJFCGOPD buildPartial() {
      POGOProtos.Rpc.CNHLJFCGOPD result = new POGOProtos.Rpc.CNHLJFCGOPD(this);
      result.opiapbcehbm_ = opiapbcehbm_;
      result.jcdnlpeblgl_ = jcdnlpeblgl_;
      result.mfppbomekjn_ = mfppbomekjn_;
      result.alhgoohmljn_ = alhgoohmljn_;
      result.nfgefngphie_ = nfgefngphie_;
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
      if (other instanceof POGOProtos.Rpc.CNHLJFCGOPD) {
        return mergeFrom((POGOProtos.Rpc.CNHLJFCGOPD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CNHLJFCGOPD other) {
      if (other == POGOProtos.Rpc.CNHLJFCGOPD.getDefaultInstance()) return this;
      if (other.getOpiapbcehbm() != 0L) {
        setOpiapbcehbm(other.getOpiapbcehbm());
      }
      if (other.jcdnlpeblgl_ != 0) {
        setJcdnlpeblglValue(other.getJcdnlpeblglValue());
      }
      if (other.mfppbomekjn_ != 0) {
        setMfppbomekjnValue(other.getMfppbomekjnValue());
      }
      if (other.alhgoohmljn_ != 0) {
        setAlhgoohmljnValue(other.getAlhgoohmljnValue());
      }
      if (other.getNfgefngphie() != false) {
        setNfgefngphie(other.getNfgefngphie());
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
      POGOProtos.Rpc.CNHLJFCGOPD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CNHLJFCGOPD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long opiapbcehbm_ ;
    /**
     * <code>uint64 opiapbcehbm = 1;</code>
     * @return The opiapbcehbm.
     */
    public long getOpiapbcehbm() {
      return opiapbcehbm_;
    }
    /**
     * <code>uint64 opiapbcehbm = 1;</code>
     * @param value The opiapbcehbm to set.
     * @return This builder for chaining.
     */
    public Builder setOpiapbcehbm(long value) {
      
      opiapbcehbm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 opiapbcehbm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpiapbcehbm() {
      
      opiapbcehbm_ = 0L;
      onChanged();
      return this;
    }

    private int jcdnlpeblgl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
     * @return The enum numeric value on the wire for jcdnlpeblgl.
     */
    public int getJcdnlpeblglValue() {
      return jcdnlpeblgl_;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
     * @param value The enum numeric value on the wire for jcdnlpeblgl to set.
     * @return This builder for chaining.
     */
    public Builder setJcdnlpeblglValue(int value) {
      jcdnlpeblgl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
     * @return The jcdnlpeblgl.
     */
    public POGOProtos.Rpc.EAFFLJCABOK getJcdnlpeblgl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(jcdnlpeblgl_);
      return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
     * @param value The jcdnlpeblgl to set.
     * @return This builder for chaining.
     */
    public Builder setJcdnlpeblgl(POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jcdnlpeblgl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK jcdnlpeblgl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJcdnlpeblgl() {
      
      jcdnlpeblgl_ = 0;
      onChanged();
      return this;
    }

    private int mfppbomekjn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
     * @return The enum numeric value on the wire for mfppbomekjn.
     */
    public int getMfppbomekjnValue() {
      return mfppbomekjn_;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
     * @param value The enum numeric value on the wire for mfppbomekjn to set.
     * @return This builder for chaining.
     */
    public Builder setMfppbomekjnValue(int value) {
      mfppbomekjn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
     * @return The mfppbomekjn.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getMfppbomekjn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(mfppbomekjn_);
      return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
     * @param value The mfppbomekjn to set.
     * @return This builder for chaining.
     */
    public Builder setMfppbomekjn(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mfppbomekjn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD mfppbomekjn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfppbomekjn() {
      
      mfppbomekjn_ = 0;
      onChanged();
      return this;
    }

    private int alhgoohmljn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
     * @return The enum numeric value on the wire for alhgoohmljn.
     */
    public int getAlhgoohmljnValue() {
      return alhgoohmljn_;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
     * @param value The enum numeric value on the wire for alhgoohmljn to set.
     * @return This builder for chaining.
     */
    public Builder setAlhgoohmljnValue(int value) {
      alhgoohmljn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
     * @return The alhgoohmljn.
     */
    public POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG getAlhgoohmljn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG result = POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.valueOf(alhgoohmljn_);
      return result == null ? POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
     * @param value The alhgoohmljn to set.
     * @return This builder for chaining.
     */
    public Builder setAlhgoohmljn(POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      alhgoohmljn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK.ABLLNEDIEIG alhgoohmljn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlhgoohmljn() {
      
      alhgoohmljn_ = 0;
      onChanged();
      return this;
    }

    private boolean nfgefngphie_ ;
    /**
     * <code>bool nfgefngphie = 5;</code>
     * @return The nfgefngphie.
     */
    public boolean getNfgefngphie() {
      return nfgefngphie_;
    }
    /**
     * <code>bool nfgefngphie = 5;</code>
     * @param value The nfgefngphie to set.
     * @return This builder for chaining.
     */
    public Builder setNfgefngphie(boolean value) {
      
      nfgefngphie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nfgefngphie = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNfgefngphie() {
      
      nfgefngphie_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CNHLJFCGOPD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CNHLJFCGOPD)
  private static final POGOProtos.Rpc.CNHLJFCGOPD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CNHLJFCGOPD();
  }

  public static POGOProtos.Rpc.CNHLJFCGOPD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CNHLJFCGOPD>
      PARSER = new com.google.protobuf.AbstractParser<CNHLJFCGOPD>() {
    @java.lang.Override
    public CNHLJFCGOPD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CNHLJFCGOPD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CNHLJFCGOPD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CNHLJFCGOPD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CNHLJFCGOPD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

