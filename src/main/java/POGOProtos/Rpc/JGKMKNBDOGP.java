// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JGKMKNBDOGP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JGKMKNBDOGP}
 */
public final class JGKMKNBDOGP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JGKMKNBDOGP)
    JGKMKNBDOGPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JGKMKNBDOGP.newBuilder() to construct.
  private JGKMKNBDOGP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JGKMKNBDOGP() {
    mdfcimgilhc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JGKMKNBDOGP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JGKMKNBDOGP(
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

            pekhbkhoimi_ = input.readInt32();
            break;
          }
          case 18: {
            POGOProtos.Rpc.MLGCMCDKMNE.Builder subBuilder = null;
            if (igaehcifidf_ != null) {
              subBuilder = igaehcifidf_.toBuilder();
            }
            igaehcifidf_ = input.readMessage(POGOProtos.Rpc.MLGCMCDKMNE.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(igaehcifidf_);
              igaehcifidf_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mdfcimgilhc_ = s;
            break;
          }
          case 32: {

            cbcebaggngh_ = input.readInt32();
            break;
          }
          case 40: {

            ghkghlgkiol_ = input.readInt32();
            break;
          }
          case 48: {

            mdlbelhmali_ = input.readInt32();
            break;
          }
          case 56: {

            gofmnhpimnj_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKMKNBDOGP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKMKNBDOGP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JGKMKNBDOGP.class, POGOProtos.Rpc.JGKMKNBDOGP.Builder.class);
  }

  public static final int PEKHBKHOIMI_FIELD_NUMBER = 1;
  private int pekhbkhoimi_;
  /**
   * <code>int32 pekhbkhoimi = 1;</code>
   * @return The pekhbkhoimi.
   */
  @java.lang.Override
  public int getPekhbkhoimi() {
    return pekhbkhoimi_;
  }

  public static final int IGAEHCIFIDF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf_;
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
   * @return Whether the igaehcifidf field is set.
   */
  @java.lang.Override
  public boolean hasIgaehcifidf() {
    return igaehcifidf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
   * @return The igaehcifidf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNE getIgaehcifidf() {
    return igaehcifidf_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getIgaehcifidfOrBuilder() {
    return getIgaehcifidf();
  }

  public static final int MDFCIMGILHC_FIELD_NUMBER = 3;
  private volatile java.lang.Object mdfcimgilhc_;
  /**
   * <code>string mdfcimgilhc = 3;</code>
   * @return The mdfcimgilhc.
   */
  @java.lang.Override
  public java.lang.String getMdfcimgilhc() {
    java.lang.Object ref = mdfcimgilhc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mdfcimgilhc_ = s;
      return s;
    }
  }
  /**
   * <code>string mdfcimgilhc = 3;</code>
   * @return The bytes for mdfcimgilhc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMdfcimgilhcBytes() {
    java.lang.Object ref = mdfcimgilhc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mdfcimgilhc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CBCEBAGGNGH_FIELD_NUMBER = 4;
  private int cbcebaggngh_;
  /**
   * <code>int32 cbcebaggngh = 4;</code>
   * @return The cbcebaggngh.
   */
  @java.lang.Override
  public int getCbcebaggngh() {
    return cbcebaggngh_;
  }

  public static final int GHKGHLGKIOL_FIELD_NUMBER = 5;
  private int ghkghlgkiol_;
  /**
   * <code>int32 ghkghlgkiol = 5;</code>
   * @return The ghkghlgkiol.
   */
  @java.lang.Override
  public int getGhkghlgkiol() {
    return ghkghlgkiol_;
  }

  public static final int MDLBELHMALI_FIELD_NUMBER = 6;
  private int mdlbelhmali_;
  /**
   * <code>int32 mdlbelhmali = 6;</code>
   * @return The mdlbelhmali.
   */
  @java.lang.Override
  public int getMdlbelhmali() {
    return mdlbelhmali_;
  }

  public static final int GOFMNHPIMNJ_FIELD_NUMBER = 7;
  private int gofmnhpimnj_;
  /**
   * <code>int32 gofmnhpimnj = 7;</code>
   * @return The gofmnhpimnj.
   */
  @java.lang.Override
  public int getGofmnhpimnj() {
    return gofmnhpimnj_;
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
    if (pekhbkhoimi_ != 0) {
      output.writeInt32(1, pekhbkhoimi_);
    }
    if (igaehcifidf_ != null) {
      output.writeMessage(2, getIgaehcifidf());
    }
    if (!getMdfcimgilhcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mdfcimgilhc_);
    }
    if (cbcebaggngh_ != 0) {
      output.writeInt32(4, cbcebaggngh_);
    }
    if (ghkghlgkiol_ != 0) {
      output.writeInt32(5, ghkghlgkiol_);
    }
    if (mdlbelhmali_ != 0) {
      output.writeInt32(6, mdlbelhmali_);
    }
    if (gofmnhpimnj_ != 0) {
      output.writeInt32(7, gofmnhpimnj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pekhbkhoimi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pekhbkhoimi_);
    }
    if (igaehcifidf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIgaehcifidf());
    }
    if (!getMdfcimgilhcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mdfcimgilhc_);
    }
    if (cbcebaggngh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, cbcebaggngh_);
    }
    if (ghkghlgkiol_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, ghkghlgkiol_);
    }
    if (mdlbelhmali_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, mdlbelhmali_);
    }
    if (gofmnhpimnj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, gofmnhpimnj_);
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
    if (!(obj instanceof POGOProtos.Rpc.JGKMKNBDOGP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JGKMKNBDOGP other = (POGOProtos.Rpc.JGKMKNBDOGP) obj;

    if (getPekhbkhoimi()
        != other.getPekhbkhoimi()) return false;
    if (hasIgaehcifidf() != other.hasIgaehcifidf()) return false;
    if (hasIgaehcifidf()) {
      if (!getIgaehcifidf()
          .equals(other.getIgaehcifidf())) return false;
    }
    if (!getMdfcimgilhc()
        .equals(other.getMdfcimgilhc())) return false;
    if (getCbcebaggngh()
        != other.getCbcebaggngh()) return false;
    if (getGhkghlgkiol()
        != other.getGhkghlgkiol()) return false;
    if (getMdlbelhmali()
        != other.getMdlbelhmali()) return false;
    if (getGofmnhpimnj()
        != other.getGofmnhpimnj()) return false;
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
    hash = (37 * hash) + PEKHBKHOIMI_FIELD_NUMBER;
    hash = (53 * hash) + getPekhbkhoimi();
    if (hasIgaehcifidf()) {
      hash = (37 * hash) + IGAEHCIFIDF_FIELD_NUMBER;
      hash = (53 * hash) + getIgaehcifidf().hashCode();
    }
    hash = (37 * hash) + MDFCIMGILHC_FIELD_NUMBER;
    hash = (53 * hash) + getMdfcimgilhc().hashCode();
    hash = (37 * hash) + CBCEBAGGNGH_FIELD_NUMBER;
    hash = (53 * hash) + getCbcebaggngh();
    hash = (37 * hash) + GHKGHLGKIOL_FIELD_NUMBER;
    hash = (53 * hash) + getGhkghlgkiol();
    hash = (37 * hash) + MDLBELHMALI_FIELD_NUMBER;
    hash = (53 * hash) + getMdlbelhmali();
    hash = (37 * hash) + GOFMNHPIMNJ_FIELD_NUMBER;
    hash = (53 * hash) + getGofmnhpimnj();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGKMKNBDOGP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JGKMKNBDOGP prototype) {
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
   * ref: JGKMKNBDOGP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JGKMKNBDOGP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JGKMKNBDOGP)
      POGOProtos.Rpc.JGKMKNBDOGPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKMKNBDOGP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKMKNBDOGP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JGKMKNBDOGP.class, POGOProtos.Rpc.JGKMKNBDOGP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JGKMKNBDOGP.newBuilder()
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
      pekhbkhoimi_ = 0;

      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }
      mdfcimgilhc_ = "";

      cbcebaggngh_ = 0;

      ghkghlgkiol_ = 0;

      mdlbelhmali_ = 0;

      gofmnhpimnj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGKMKNBDOGP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKMKNBDOGP getDefaultInstanceForType() {
      return POGOProtos.Rpc.JGKMKNBDOGP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKMKNBDOGP build() {
      POGOProtos.Rpc.JGKMKNBDOGP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGKMKNBDOGP buildPartial() {
      POGOProtos.Rpc.JGKMKNBDOGP result = new POGOProtos.Rpc.JGKMKNBDOGP(this);
      result.pekhbkhoimi_ = pekhbkhoimi_;
      if (igaehcifidfBuilder_ == null) {
        result.igaehcifidf_ = igaehcifidf_;
      } else {
        result.igaehcifidf_ = igaehcifidfBuilder_.build();
      }
      result.mdfcimgilhc_ = mdfcimgilhc_;
      result.cbcebaggngh_ = cbcebaggngh_;
      result.ghkghlgkiol_ = ghkghlgkiol_;
      result.mdlbelhmali_ = mdlbelhmali_;
      result.gofmnhpimnj_ = gofmnhpimnj_;
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
      if (other instanceof POGOProtos.Rpc.JGKMKNBDOGP) {
        return mergeFrom((POGOProtos.Rpc.JGKMKNBDOGP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JGKMKNBDOGP other) {
      if (other == POGOProtos.Rpc.JGKMKNBDOGP.getDefaultInstance()) return this;
      if (other.getPekhbkhoimi() != 0) {
        setPekhbkhoimi(other.getPekhbkhoimi());
      }
      if (other.hasIgaehcifidf()) {
        mergeIgaehcifidf(other.getIgaehcifidf());
      }
      if (!other.getMdfcimgilhc().isEmpty()) {
        mdfcimgilhc_ = other.mdfcimgilhc_;
        onChanged();
      }
      if (other.getCbcebaggngh() != 0) {
        setCbcebaggngh(other.getCbcebaggngh());
      }
      if (other.getGhkghlgkiol() != 0) {
        setGhkghlgkiol(other.getGhkghlgkiol());
      }
      if (other.getMdlbelhmali() != 0) {
        setMdlbelhmali(other.getMdlbelhmali());
      }
      if (other.getGofmnhpimnj() != 0) {
        setGofmnhpimnj(other.getGofmnhpimnj());
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
      POGOProtos.Rpc.JGKMKNBDOGP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JGKMKNBDOGP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pekhbkhoimi_ ;
    /**
     * <code>int32 pekhbkhoimi = 1;</code>
     * @return The pekhbkhoimi.
     */
    @java.lang.Override
    public int getPekhbkhoimi() {
      return pekhbkhoimi_;
    }
    /**
     * <code>int32 pekhbkhoimi = 1;</code>
     * @param value The pekhbkhoimi to set.
     * @return This builder for chaining.
     */
    public Builder setPekhbkhoimi(int value) {
      
      pekhbkhoimi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pekhbkhoimi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPekhbkhoimi() {
      
      pekhbkhoimi_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> igaehcifidfBuilder_;
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     * @return Whether the igaehcifidf field is set.
     */
    public boolean hasIgaehcifidf() {
      return igaehcifidfBuilder_ != null || igaehcifidf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     * @return The igaehcifidf.
     */
    public POGOProtos.Rpc.MLGCMCDKMNE getIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        return igaehcifidf_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
      } else {
        return igaehcifidfBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public Builder setIgaehcifidf(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (igaehcifidfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        igaehcifidf_ = value;
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public Builder setIgaehcifidf(
        POGOProtos.Rpc.MLGCMCDKMNE.Builder builderForValue) {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = builderForValue.build();
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public Builder mergeIgaehcifidf(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (igaehcifidfBuilder_ == null) {
        if (igaehcifidf_ != null) {
          igaehcifidf_ =
            POGOProtos.Rpc.MLGCMCDKMNE.newBuilder(igaehcifidf_).mergeFrom(value).buildPartial();
        } else {
          igaehcifidf_ = value;
        }
        onChanged();
      } else {
        igaehcifidfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public Builder clearIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
        onChanged();
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNE.Builder getIgaehcifidfBuilder() {
      
      onChanged();
      return getIgaehcifidfFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getIgaehcifidfOrBuilder() {
      if (igaehcifidfBuilder_ != null) {
        return igaehcifidfBuilder_.getMessageOrBuilder();
      } else {
        return igaehcifidf_ == null ?
            POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> 
        getIgaehcifidfFieldBuilder() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder>(
                getIgaehcifidf(),
                getParentForChildren(),
                isClean());
        igaehcifidf_ = null;
      }
      return igaehcifidfBuilder_;
    }

    private java.lang.Object mdfcimgilhc_ = "";
    /**
     * <code>string mdfcimgilhc = 3;</code>
     * @return The mdfcimgilhc.
     */
    public java.lang.String getMdfcimgilhc() {
      java.lang.Object ref = mdfcimgilhc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mdfcimgilhc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mdfcimgilhc = 3;</code>
     * @return The bytes for mdfcimgilhc.
     */
    public com.google.protobuf.ByteString
        getMdfcimgilhcBytes() {
      java.lang.Object ref = mdfcimgilhc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mdfcimgilhc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mdfcimgilhc = 3;</code>
     * @param value The mdfcimgilhc to set.
     * @return This builder for chaining.
     */
    public Builder setMdfcimgilhc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mdfcimgilhc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mdfcimgilhc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdfcimgilhc() {
      
      mdfcimgilhc_ = getDefaultInstance().getMdfcimgilhc();
      onChanged();
      return this;
    }
    /**
     * <code>string mdfcimgilhc = 3;</code>
     * @param value The bytes for mdfcimgilhc to set.
     * @return This builder for chaining.
     */
    public Builder setMdfcimgilhcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mdfcimgilhc_ = value;
      onChanged();
      return this;
    }

    private int cbcebaggngh_ ;
    /**
     * <code>int32 cbcebaggngh = 4;</code>
     * @return The cbcebaggngh.
     */
    @java.lang.Override
    public int getCbcebaggngh() {
      return cbcebaggngh_;
    }
    /**
     * <code>int32 cbcebaggngh = 4;</code>
     * @param value The cbcebaggngh to set.
     * @return This builder for chaining.
     */
    public Builder setCbcebaggngh(int value) {
      
      cbcebaggngh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cbcebaggngh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCbcebaggngh() {
      
      cbcebaggngh_ = 0;
      onChanged();
      return this;
    }

    private int ghkghlgkiol_ ;
    /**
     * <code>int32 ghkghlgkiol = 5;</code>
     * @return The ghkghlgkiol.
     */
    @java.lang.Override
    public int getGhkghlgkiol() {
      return ghkghlgkiol_;
    }
    /**
     * <code>int32 ghkghlgkiol = 5;</code>
     * @param value The ghkghlgkiol to set.
     * @return This builder for chaining.
     */
    public Builder setGhkghlgkiol(int value) {
      
      ghkghlgkiol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ghkghlgkiol = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGhkghlgkiol() {
      
      ghkghlgkiol_ = 0;
      onChanged();
      return this;
    }

    private int mdlbelhmali_ ;
    /**
     * <code>int32 mdlbelhmali = 6;</code>
     * @return The mdlbelhmali.
     */
    @java.lang.Override
    public int getMdlbelhmali() {
      return mdlbelhmali_;
    }
    /**
     * <code>int32 mdlbelhmali = 6;</code>
     * @param value The mdlbelhmali to set.
     * @return This builder for chaining.
     */
    public Builder setMdlbelhmali(int value) {
      
      mdlbelhmali_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mdlbelhmali = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdlbelhmali() {
      
      mdlbelhmali_ = 0;
      onChanged();
      return this;
    }

    private int gofmnhpimnj_ ;
    /**
     * <code>int32 gofmnhpimnj = 7;</code>
     * @return The gofmnhpimnj.
     */
    @java.lang.Override
    public int getGofmnhpimnj() {
      return gofmnhpimnj_;
    }
    /**
     * <code>int32 gofmnhpimnj = 7;</code>
     * @param value The gofmnhpimnj to set.
     * @return This builder for chaining.
     */
    public Builder setGofmnhpimnj(int value) {
      
      gofmnhpimnj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gofmnhpimnj = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGofmnhpimnj() {
      
      gofmnhpimnj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JGKMKNBDOGP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JGKMKNBDOGP)
  private static final POGOProtos.Rpc.JGKMKNBDOGP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JGKMKNBDOGP();
  }

  public static POGOProtos.Rpc.JGKMKNBDOGP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JGKMKNBDOGP>
      PARSER = new com.google.protobuf.AbstractParser<JGKMKNBDOGP>() {
    @java.lang.Override
    public JGKMKNBDOGP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JGKMKNBDOGP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JGKMKNBDOGP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JGKMKNBDOGP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JGKMKNBDOGP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

