// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HFKIOKBHEBC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HFKIOKBHEBC}
 */
public final class HFKIOKBHEBC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HFKIOKBHEBC)
    HFKIOKBHEBCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HFKIOKBHEBC.newBuilder() to construct.
  private HFKIOKBHEBC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HFKIOKBHEBC() {
    cmajimdklmc_ = "";
    pafidmcjhma_ = "";
    hpkkffgaigm_ = "";
    idfefibohle_ = "";
    lmpobighkff_ = "";
    ceemfhlnmfl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HFKIOKBHEBC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HFKIOKBHEBC(
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

            cmajimdklmc_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pafidmcjhma_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hpkkffgaigm_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            idfefibohle_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            lmpobighkff_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            ceemfhlnmfl_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFKIOKBHEBC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFKIOKBHEBC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HFKIOKBHEBC.class, POGOProtos.Rpc.HFKIOKBHEBC.Builder.class);
  }

  public static final int CMAJIMDKLMC_FIELD_NUMBER = 1;
  private volatile java.lang.Object cmajimdklmc_;
  /**
   * <code>string cmajimdklmc = 1;</code>
   * @return The cmajimdklmc.
   */
  @java.lang.Override
  public java.lang.String getCmajimdklmc() {
    java.lang.Object ref = cmajimdklmc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cmajimdklmc_ = s;
      return s;
    }
  }
  /**
   * <code>string cmajimdklmc = 1;</code>
   * @return The bytes for cmajimdklmc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCmajimdklmcBytes() {
    java.lang.Object ref = cmajimdklmc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cmajimdklmc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAFIDMCJHMA_FIELD_NUMBER = 2;
  private volatile java.lang.Object pafidmcjhma_;
  /**
   * <code>string pafidmcjhma = 2;</code>
   * @return The pafidmcjhma.
   */
  @java.lang.Override
  public java.lang.String getPafidmcjhma() {
    java.lang.Object ref = pafidmcjhma_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pafidmcjhma_ = s;
      return s;
    }
  }
  /**
   * <code>string pafidmcjhma = 2;</code>
   * @return The bytes for pafidmcjhma.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPafidmcjhmaBytes() {
    java.lang.Object ref = pafidmcjhma_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pafidmcjhma_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HPKKFFGAIGM_FIELD_NUMBER = 3;
  private volatile java.lang.Object hpkkffgaigm_;
  /**
   * <code>string hpkkffgaigm = 3;</code>
   * @return The hpkkffgaigm.
   */
  @java.lang.Override
  public java.lang.String getHpkkffgaigm() {
    java.lang.Object ref = hpkkffgaigm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hpkkffgaigm_ = s;
      return s;
    }
  }
  /**
   * <code>string hpkkffgaigm = 3;</code>
   * @return The bytes for hpkkffgaigm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHpkkffgaigmBytes() {
    java.lang.Object ref = hpkkffgaigm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hpkkffgaigm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDFEFIBOHLE_FIELD_NUMBER = 4;
  private volatile java.lang.Object idfefibohle_;
  /**
   * <code>string idfefibohle = 4;</code>
   * @return The idfefibohle.
   */
  @java.lang.Override
  public java.lang.String getIdfefibohle() {
    java.lang.Object ref = idfefibohle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idfefibohle_ = s;
      return s;
    }
  }
  /**
   * <code>string idfefibohle = 4;</code>
   * @return The bytes for idfefibohle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdfefibohleBytes() {
    java.lang.Object ref = idfefibohle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idfefibohle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LMPOBIGHKFF_FIELD_NUMBER = 5;
  private volatile java.lang.Object lmpobighkff_;
  /**
   * <code>string lmpobighkff = 5;</code>
   * @return The lmpobighkff.
   */
  @java.lang.Override
  public java.lang.String getLmpobighkff() {
    java.lang.Object ref = lmpobighkff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lmpobighkff_ = s;
      return s;
    }
  }
  /**
   * <code>string lmpobighkff = 5;</code>
   * @return The bytes for lmpobighkff.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLmpobighkffBytes() {
    java.lang.Object ref = lmpobighkff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lmpobighkff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CEEMFHLNMFL_FIELD_NUMBER = 6;
  private volatile java.lang.Object ceemfhlnmfl_;
  /**
   * <code>string ceemfhlnmfl = 6;</code>
   * @return The ceemfhlnmfl.
   */
  @java.lang.Override
  public java.lang.String getCeemfhlnmfl() {
    java.lang.Object ref = ceemfhlnmfl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ceemfhlnmfl_ = s;
      return s;
    }
  }
  /**
   * <code>string ceemfhlnmfl = 6;</code>
   * @return The bytes for ceemfhlnmfl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCeemfhlnmflBytes() {
    java.lang.Object ref = ceemfhlnmfl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ceemfhlnmfl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getCmajimdklmcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cmajimdklmc_);
    }
    if (!getPafidmcjhmaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pafidmcjhma_);
    }
    if (!getHpkkffgaigmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hpkkffgaigm_);
    }
    if (!getIdfefibohleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, idfefibohle_);
    }
    if (!getLmpobighkffBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lmpobighkff_);
    }
    if (!getCeemfhlnmflBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, ceemfhlnmfl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCmajimdklmcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cmajimdklmc_);
    }
    if (!getPafidmcjhmaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pafidmcjhma_);
    }
    if (!getHpkkffgaigmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hpkkffgaigm_);
    }
    if (!getIdfefibohleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, idfefibohle_);
    }
    if (!getLmpobighkffBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lmpobighkff_);
    }
    if (!getCeemfhlnmflBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, ceemfhlnmfl_);
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
    if (!(obj instanceof POGOProtos.Rpc.HFKIOKBHEBC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HFKIOKBHEBC other = (POGOProtos.Rpc.HFKIOKBHEBC) obj;

    if (!getCmajimdklmc()
        .equals(other.getCmajimdklmc())) return false;
    if (!getPafidmcjhma()
        .equals(other.getPafidmcjhma())) return false;
    if (!getHpkkffgaigm()
        .equals(other.getHpkkffgaigm())) return false;
    if (!getIdfefibohle()
        .equals(other.getIdfefibohle())) return false;
    if (!getLmpobighkff()
        .equals(other.getLmpobighkff())) return false;
    if (!getCeemfhlnmfl()
        .equals(other.getCeemfhlnmfl())) return false;
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
    hash = (37 * hash) + CMAJIMDKLMC_FIELD_NUMBER;
    hash = (53 * hash) + getCmajimdklmc().hashCode();
    hash = (37 * hash) + PAFIDMCJHMA_FIELD_NUMBER;
    hash = (53 * hash) + getPafidmcjhma().hashCode();
    hash = (37 * hash) + HPKKFFGAIGM_FIELD_NUMBER;
    hash = (53 * hash) + getHpkkffgaigm().hashCode();
    hash = (37 * hash) + IDFEFIBOHLE_FIELD_NUMBER;
    hash = (53 * hash) + getIdfefibohle().hashCode();
    hash = (37 * hash) + LMPOBIGHKFF_FIELD_NUMBER;
    hash = (53 * hash) + getLmpobighkff().hashCode();
    hash = (37 * hash) + CEEMFHLNMFL_FIELD_NUMBER;
    hash = (53 * hash) + getCeemfhlnmfl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFKIOKBHEBC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HFKIOKBHEBC prototype) {
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
   * ref: HFKIOKBHEBC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HFKIOKBHEBC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HFKIOKBHEBC)
      POGOProtos.Rpc.HFKIOKBHEBCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFKIOKBHEBC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFKIOKBHEBC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HFKIOKBHEBC.class, POGOProtos.Rpc.HFKIOKBHEBC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HFKIOKBHEBC.newBuilder()
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
      cmajimdklmc_ = "";

      pafidmcjhma_ = "";

      hpkkffgaigm_ = "";

      idfefibohle_ = "";

      lmpobighkff_ = "";

      ceemfhlnmfl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFKIOKBHEBC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFKIOKBHEBC getDefaultInstanceForType() {
      return POGOProtos.Rpc.HFKIOKBHEBC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFKIOKBHEBC build() {
      POGOProtos.Rpc.HFKIOKBHEBC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFKIOKBHEBC buildPartial() {
      POGOProtos.Rpc.HFKIOKBHEBC result = new POGOProtos.Rpc.HFKIOKBHEBC(this);
      result.cmajimdklmc_ = cmajimdklmc_;
      result.pafidmcjhma_ = pafidmcjhma_;
      result.hpkkffgaigm_ = hpkkffgaigm_;
      result.idfefibohle_ = idfefibohle_;
      result.lmpobighkff_ = lmpobighkff_;
      result.ceemfhlnmfl_ = ceemfhlnmfl_;
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
      if (other instanceof POGOProtos.Rpc.HFKIOKBHEBC) {
        return mergeFrom((POGOProtos.Rpc.HFKIOKBHEBC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HFKIOKBHEBC other) {
      if (other == POGOProtos.Rpc.HFKIOKBHEBC.getDefaultInstance()) return this;
      if (!other.getCmajimdklmc().isEmpty()) {
        cmajimdklmc_ = other.cmajimdklmc_;
        onChanged();
      }
      if (!other.getPafidmcjhma().isEmpty()) {
        pafidmcjhma_ = other.pafidmcjhma_;
        onChanged();
      }
      if (!other.getHpkkffgaigm().isEmpty()) {
        hpkkffgaigm_ = other.hpkkffgaigm_;
        onChanged();
      }
      if (!other.getIdfefibohle().isEmpty()) {
        idfefibohle_ = other.idfefibohle_;
        onChanged();
      }
      if (!other.getLmpobighkff().isEmpty()) {
        lmpobighkff_ = other.lmpobighkff_;
        onChanged();
      }
      if (!other.getCeemfhlnmfl().isEmpty()) {
        ceemfhlnmfl_ = other.ceemfhlnmfl_;
        onChanged();
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
      POGOProtos.Rpc.HFKIOKBHEBC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HFKIOKBHEBC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cmajimdklmc_ = "";
    /**
     * <code>string cmajimdklmc = 1;</code>
     * @return The cmajimdklmc.
     */
    public java.lang.String getCmajimdklmc() {
      java.lang.Object ref = cmajimdklmc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cmajimdklmc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cmajimdklmc = 1;</code>
     * @return The bytes for cmajimdklmc.
     */
    public com.google.protobuf.ByteString
        getCmajimdklmcBytes() {
      java.lang.Object ref = cmajimdklmc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cmajimdklmc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cmajimdklmc = 1;</code>
     * @param value The cmajimdklmc to set.
     * @return This builder for chaining.
     */
    public Builder setCmajimdklmc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cmajimdklmc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cmajimdklmc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCmajimdklmc() {
      
      cmajimdklmc_ = getDefaultInstance().getCmajimdklmc();
      onChanged();
      return this;
    }
    /**
     * <code>string cmajimdklmc = 1;</code>
     * @param value The bytes for cmajimdklmc to set.
     * @return This builder for chaining.
     */
    public Builder setCmajimdklmcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cmajimdklmc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pafidmcjhma_ = "";
    /**
     * <code>string pafidmcjhma = 2;</code>
     * @return The pafidmcjhma.
     */
    public java.lang.String getPafidmcjhma() {
      java.lang.Object ref = pafidmcjhma_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pafidmcjhma_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pafidmcjhma = 2;</code>
     * @return The bytes for pafidmcjhma.
     */
    public com.google.protobuf.ByteString
        getPafidmcjhmaBytes() {
      java.lang.Object ref = pafidmcjhma_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pafidmcjhma_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pafidmcjhma = 2;</code>
     * @param value The pafidmcjhma to set.
     * @return This builder for chaining.
     */
    public Builder setPafidmcjhma(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pafidmcjhma_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pafidmcjhma = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPafidmcjhma() {
      
      pafidmcjhma_ = getDefaultInstance().getPafidmcjhma();
      onChanged();
      return this;
    }
    /**
     * <code>string pafidmcjhma = 2;</code>
     * @param value The bytes for pafidmcjhma to set.
     * @return This builder for chaining.
     */
    public Builder setPafidmcjhmaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pafidmcjhma_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hpkkffgaigm_ = "";
    /**
     * <code>string hpkkffgaigm = 3;</code>
     * @return The hpkkffgaigm.
     */
    public java.lang.String getHpkkffgaigm() {
      java.lang.Object ref = hpkkffgaigm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hpkkffgaigm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hpkkffgaigm = 3;</code>
     * @return The bytes for hpkkffgaigm.
     */
    public com.google.protobuf.ByteString
        getHpkkffgaigmBytes() {
      java.lang.Object ref = hpkkffgaigm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hpkkffgaigm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hpkkffgaigm = 3;</code>
     * @param value The hpkkffgaigm to set.
     * @return This builder for chaining.
     */
    public Builder setHpkkffgaigm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hpkkffgaigm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hpkkffgaigm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHpkkffgaigm() {
      
      hpkkffgaigm_ = getDefaultInstance().getHpkkffgaigm();
      onChanged();
      return this;
    }
    /**
     * <code>string hpkkffgaigm = 3;</code>
     * @param value The bytes for hpkkffgaigm to set.
     * @return This builder for chaining.
     */
    public Builder setHpkkffgaigmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hpkkffgaigm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object idfefibohle_ = "";
    /**
     * <code>string idfefibohle = 4;</code>
     * @return The idfefibohle.
     */
    public java.lang.String getIdfefibohle() {
      java.lang.Object ref = idfefibohle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idfefibohle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idfefibohle = 4;</code>
     * @return The bytes for idfefibohle.
     */
    public com.google.protobuf.ByteString
        getIdfefibohleBytes() {
      java.lang.Object ref = idfefibohle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idfefibohle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idfefibohle = 4;</code>
     * @param value The idfefibohle to set.
     * @return This builder for chaining.
     */
    public Builder setIdfefibohle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idfefibohle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idfefibohle = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdfefibohle() {
      
      idfefibohle_ = getDefaultInstance().getIdfefibohle();
      onChanged();
      return this;
    }
    /**
     * <code>string idfefibohle = 4;</code>
     * @param value The bytes for idfefibohle to set.
     * @return This builder for chaining.
     */
    public Builder setIdfefibohleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idfefibohle_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lmpobighkff_ = "";
    /**
     * <code>string lmpobighkff = 5;</code>
     * @return The lmpobighkff.
     */
    public java.lang.String getLmpobighkff() {
      java.lang.Object ref = lmpobighkff_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lmpobighkff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lmpobighkff = 5;</code>
     * @return The bytes for lmpobighkff.
     */
    public com.google.protobuf.ByteString
        getLmpobighkffBytes() {
      java.lang.Object ref = lmpobighkff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lmpobighkff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lmpobighkff = 5;</code>
     * @param value The lmpobighkff to set.
     * @return This builder for chaining.
     */
    public Builder setLmpobighkff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lmpobighkff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lmpobighkff = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLmpobighkff() {
      
      lmpobighkff_ = getDefaultInstance().getLmpobighkff();
      onChanged();
      return this;
    }
    /**
     * <code>string lmpobighkff = 5;</code>
     * @param value The bytes for lmpobighkff to set.
     * @return This builder for chaining.
     */
    public Builder setLmpobighkffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lmpobighkff_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ceemfhlnmfl_ = "";
    /**
     * <code>string ceemfhlnmfl = 6;</code>
     * @return The ceemfhlnmfl.
     */
    public java.lang.String getCeemfhlnmfl() {
      java.lang.Object ref = ceemfhlnmfl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ceemfhlnmfl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ceemfhlnmfl = 6;</code>
     * @return The bytes for ceemfhlnmfl.
     */
    public com.google.protobuf.ByteString
        getCeemfhlnmflBytes() {
      java.lang.Object ref = ceemfhlnmfl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ceemfhlnmfl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ceemfhlnmfl = 6;</code>
     * @param value The ceemfhlnmfl to set.
     * @return This builder for chaining.
     */
    public Builder setCeemfhlnmfl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ceemfhlnmfl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ceemfhlnmfl = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCeemfhlnmfl() {
      
      ceemfhlnmfl_ = getDefaultInstance().getCeemfhlnmfl();
      onChanged();
      return this;
    }
    /**
     * <code>string ceemfhlnmfl = 6;</code>
     * @param value The bytes for ceemfhlnmfl to set.
     * @return This builder for chaining.
     */
    public Builder setCeemfhlnmflBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ceemfhlnmfl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HFKIOKBHEBC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HFKIOKBHEBC)
  private static final POGOProtos.Rpc.HFKIOKBHEBC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HFKIOKBHEBC();
  }

  public static POGOProtos.Rpc.HFKIOKBHEBC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HFKIOKBHEBC>
      PARSER = new com.google.protobuf.AbstractParser<HFKIOKBHEBC>() {
    @java.lang.Override
    public HFKIOKBHEBC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HFKIOKBHEBC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HFKIOKBHEBC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HFKIOKBHEBC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HFKIOKBHEBC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

