// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OAMCMFMEBOG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OAMCMFMEBOG}
 */
public final class OAMCMFMEBOG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OAMCMFMEBOG)
    OAMCMFMEBOGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAMCMFMEBOG.newBuilder() to construct.
  private OAMCMFMEBOG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAMCMFMEBOG() {
    imcahnopnbp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OAMCMFMEBOG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OAMCMFMEBOG(
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

            imcahnopnbp_ = s;
            break;
          }
          case 16: {

            dbdedahhmhm_ = input.readUInt64();
            break;
          }
          case 25: {

            nbolglmejnc_ = input.readDouble();
            break;
          }
          case 33: {

            libhmbbcogc_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAMCMFMEBOG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAMCMFMEBOG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OAMCMFMEBOG.class, POGOProtos.Rpc.OAMCMFMEBOG.Builder.class);
  }

  public static final int IMCAHNOPNBP_FIELD_NUMBER = 1;
  private volatile java.lang.Object imcahnopnbp_;
  /**
   * <code>string imcahnopnbp = 1;</code>
   * @return The imcahnopnbp.
   */
  @java.lang.Override
  public java.lang.String getImcahnopnbp() {
    java.lang.Object ref = imcahnopnbp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imcahnopnbp_ = s;
      return s;
    }
  }
  /**
   * <code>string imcahnopnbp = 1;</code>
   * @return The bytes for imcahnopnbp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImcahnopnbpBytes() {
    java.lang.Object ref = imcahnopnbp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imcahnopnbp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DBDEDAHHMHM_FIELD_NUMBER = 2;
  private long dbdedahhmhm_;
  /**
   * <code>uint64 dbdedahhmhm = 2;</code>
   * @return The dbdedahhmhm.
   */
  @java.lang.Override
  public long getDbdedahhmhm() {
    return dbdedahhmhm_;
  }

  public static final int NBOLGLMEJNC_FIELD_NUMBER = 3;
  private double nbolglmejnc_;
  /**
   * <code>double nbolglmejnc = 3;</code>
   * @return The nbolglmejnc.
   */
  @java.lang.Override
  public double getNbolglmejnc() {
    return nbolglmejnc_;
  }

  public static final int LIBHMBBCOGC_FIELD_NUMBER = 4;
  private double libhmbbcogc_;
  /**
   * <code>double libhmbbcogc = 4;</code>
   * @return The libhmbbcogc.
   */
  @java.lang.Override
  public double getLibhmbbcogc() {
    return libhmbbcogc_;
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
    if (!getImcahnopnbpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imcahnopnbp_);
    }
    if (dbdedahhmhm_ != 0L) {
      output.writeUInt64(2, dbdedahhmhm_);
    }
    if (nbolglmejnc_ != 0D) {
      output.writeDouble(3, nbolglmejnc_);
    }
    if (libhmbbcogc_ != 0D) {
      output.writeDouble(4, libhmbbcogc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getImcahnopnbpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imcahnopnbp_);
    }
    if (dbdedahhmhm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, dbdedahhmhm_);
    }
    if (nbolglmejnc_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, nbolglmejnc_);
    }
    if (libhmbbcogc_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, libhmbbcogc_);
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
    if (!(obj instanceof POGOProtos.Rpc.OAMCMFMEBOG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OAMCMFMEBOG other = (POGOProtos.Rpc.OAMCMFMEBOG) obj;

    if (!getImcahnopnbp()
        .equals(other.getImcahnopnbp())) return false;
    if (getDbdedahhmhm()
        != other.getDbdedahhmhm()) return false;
    if (java.lang.Double.doubleToLongBits(getNbolglmejnc())
        != java.lang.Double.doubleToLongBits(
            other.getNbolglmejnc())) return false;
    if (java.lang.Double.doubleToLongBits(getLibhmbbcogc())
        != java.lang.Double.doubleToLongBits(
            other.getLibhmbbcogc())) return false;
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
    hash = (37 * hash) + IMCAHNOPNBP_FIELD_NUMBER;
    hash = (53 * hash) + getImcahnopnbp().hashCode();
    hash = (37 * hash) + DBDEDAHHMHM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDbdedahhmhm());
    hash = (37 * hash) + NBOLGLMEJNC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNbolglmejnc()));
    hash = (37 * hash) + LIBHMBBCOGC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLibhmbbcogc()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAMCMFMEBOG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OAMCMFMEBOG prototype) {
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
   * ref: OAMCMFMEBOG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OAMCMFMEBOG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OAMCMFMEBOG)
      POGOProtos.Rpc.OAMCMFMEBOGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAMCMFMEBOG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAMCMFMEBOG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OAMCMFMEBOG.class, POGOProtos.Rpc.OAMCMFMEBOG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OAMCMFMEBOG.newBuilder()
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
      imcahnopnbp_ = "";

      dbdedahhmhm_ = 0L;

      nbolglmejnc_ = 0D;

      libhmbbcogc_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAMCMFMEBOG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAMCMFMEBOG getDefaultInstanceForType() {
      return POGOProtos.Rpc.OAMCMFMEBOG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAMCMFMEBOG build() {
      POGOProtos.Rpc.OAMCMFMEBOG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAMCMFMEBOG buildPartial() {
      POGOProtos.Rpc.OAMCMFMEBOG result = new POGOProtos.Rpc.OAMCMFMEBOG(this);
      result.imcahnopnbp_ = imcahnopnbp_;
      result.dbdedahhmhm_ = dbdedahhmhm_;
      result.nbolglmejnc_ = nbolglmejnc_;
      result.libhmbbcogc_ = libhmbbcogc_;
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
      if (other instanceof POGOProtos.Rpc.OAMCMFMEBOG) {
        return mergeFrom((POGOProtos.Rpc.OAMCMFMEBOG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OAMCMFMEBOG other) {
      if (other == POGOProtos.Rpc.OAMCMFMEBOG.getDefaultInstance()) return this;
      if (!other.getImcahnopnbp().isEmpty()) {
        imcahnopnbp_ = other.imcahnopnbp_;
        onChanged();
      }
      if (other.getDbdedahhmhm() != 0L) {
        setDbdedahhmhm(other.getDbdedahhmhm());
      }
      if (other.getNbolglmejnc() != 0D) {
        setNbolglmejnc(other.getNbolglmejnc());
      }
      if (other.getLibhmbbcogc() != 0D) {
        setLibhmbbcogc(other.getLibhmbbcogc());
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
      POGOProtos.Rpc.OAMCMFMEBOG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OAMCMFMEBOG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object imcahnopnbp_ = "";
    /**
     * <code>string imcahnopnbp = 1;</code>
     * @return The imcahnopnbp.
     */
    public java.lang.String getImcahnopnbp() {
      java.lang.Object ref = imcahnopnbp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imcahnopnbp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imcahnopnbp = 1;</code>
     * @return The bytes for imcahnopnbp.
     */
    public com.google.protobuf.ByteString
        getImcahnopnbpBytes() {
      java.lang.Object ref = imcahnopnbp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imcahnopnbp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imcahnopnbp = 1;</code>
     * @param value The imcahnopnbp to set.
     * @return This builder for chaining.
     */
    public Builder setImcahnopnbp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imcahnopnbp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string imcahnopnbp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImcahnopnbp() {
      
      imcahnopnbp_ = getDefaultInstance().getImcahnopnbp();
      onChanged();
      return this;
    }
    /**
     * <code>string imcahnopnbp = 1;</code>
     * @param value The bytes for imcahnopnbp to set.
     * @return This builder for chaining.
     */
    public Builder setImcahnopnbpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imcahnopnbp_ = value;
      onChanged();
      return this;
    }

    private long dbdedahhmhm_ ;
    /**
     * <code>uint64 dbdedahhmhm = 2;</code>
     * @return The dbdedahhmhm.
     */
    @java.lang.Override
    public long getDbdedahhmhm() {
      return dbdedahhmhm_;
    }
    /**
     * <code>uint64 dbdedahhmhm = 2;</code>
     * @param value The dbdedahhmhm to set.
     * @return This builder for chaining.
     */
    public Builder setDbdedahhmhm(long value) {
      
      dbdedahhmhm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 dbdedahhmhm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbdedahhmhm() {
      
      dbdedahhmhm_ = 0L;
      onChanged();
      return this;
    }

    private double nbolglmejnc_ ;
    /**
     * <code>double nbolglmejnc = 3;</code>
     * @return The nbolglmejnc.
     */
    @java.lang.Override
    public double getNbolglmejnc() {
      return nbolglmejnc_;
    }
    /**
     * <code>double nbolglmejnc = 3;</code>
     * @param value The nbolglmejnc to set.
     * @return This builder for chaining.
     */
    public Builder setNbolglmejnc(double value) {
      
      nbolglmejnc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nbolglmejnc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNbolglmejnc() {
      
      nbolglmejnc_ = 0D;
      onChanged();
      return this;
    }

    private double libhmbbcogc_ ;
    /**
     * <code>double libhmbbcogc = 4;</code>
     * @return The libhmbbcogc.
     */
    @java.lang.Override
    public double getLibhmbbcogc() {
      return libhmbbcogc_;
    }
    /**
     * <code>double libhmbbcogc = 4;</code>
     * @param value The libhmbbcogc to set.
     * @return This builder for chaining.
     */
    public Builder setLibhmbbcogc(double value) {
      
      libhmbbcogc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double libhmbbcogc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLibhmbbcogc() {
      
      libhmbbcogc_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OAMCMFMEBOG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OAMCMFMEBOG)
  private static final POGOProtos.Rpc.OAMCMFMEBOG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OAMCMFMEBOG();
  }

  public static POGOProtos.Rpc.OAMCMFMEBOG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAMCMFMEBOG>
      PARSER = new com.google.protobuf.AbstractParser<OAMCMFMEBOG>() {
    @java.lang.Override
    public OAMCMFMEBOG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OAMCMFMEBOG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OAMCMFMEBOG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAMCMFMEBOG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OAMCMFMEBOG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

