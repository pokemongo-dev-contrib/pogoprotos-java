// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IDCAAFCAGCL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IDCAAFCAGCL}
 */
public final class IDCAAFCAGCL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IDCAAFCAGCL)
    IDCAAFCAGCLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDCAAFCAGCL.newBuilder() to construct.
  private IDCAAFCAGCL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDCAAFCAGCL() {
    ddmflcmbajg_ = 0;
    leehhlngfeo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IDCAAFCAGCL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IDCAAFCAGCL(
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

            ddmflcmbajg_ = rawValue;
            break;
          }
          case 16: {

            mdfhgooifmh_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            leehhlngfeo_ = s;
            break;
          }
          case 32: {

            npegbcaodof_ = input.readUInt64();
            break;
          }
          case 41: {

            acbjkipgmcl_ = input.readDouble();
            break;
          }
          case 49: {

            haoplpbmplb_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDCAAFCAGCL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDCAAFCAGCL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IDCAAFCAGCL.class, POGOProtos.Rpc.IDCAAFCAGCL.Builder.class);
  }

  public static final int DDMFLCMBAJG_FIELD_NUMBER = 1;
  private int ddmflcmbajg_;
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
   * @return The enum numeric value on the wire for ddmflcmbajg.
   */
  @java.lang.Override public int getDdmflcmbajgValue() {
    return ddmflcmbajg_;
  }
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
   * @return The ddmflcmbajg.
   */
  @java.lang.Override public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
    return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
  }

  public static final int MDFHGOOIFMH_FIELD_NUMBER = 2;
  private int mdfhgooifmh_;
  /**
   * <code>int32 mdfhgooifmh = 2;</code>
   * @return The mdfhgooifmh.
   */
  @java.lang.Override
  public int getMdfhgooifmh() {
    return mdfhgooifmh_;
  }

  public static final int LEEHHLNGFEO_FIELD_NUMBER = 3;
  private volatile java.lang.Object leehhlngfeo_;
  /**
   * <code>string leehhlngfeo = 3;</code>
   * @return The leehhlngfeo.
   */
  @java.lang.Override
  public java.lang.String getLeehhlngfeo() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leehhlngfeo_ = s;
      return s;
    }
  }
  /**
   * <code>string leehhlngfeo = 3;</code>
   * @return The bytes for leehhlngfeo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLeehhlngfeoBytes() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leehhlngfeo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NPEGBCAODOF_FIELD_NUMBER = 4;
  private long npegbcaodof_;
  /**
   * <code>uint64 npegbcaodof = 4;</code>
   * @return The npegbcaodof.
   */
  @java.lang.Override
  public long getNpegbcaodof() {
    return npegbcaodof_;
  }

  public static final int ACBJKIPGMCL_FIELD_NUMBER = 5;
  private double acbjkipgmcl_;
  /**
   * <code>double acbjkipgmcl = 5;</code>
   * @return The acbjkipgmcl.
   */
  @java.lang.Override
  public double getAcbjkipgmcl() {
    return acbjkipgmcl_;
  }

  public static final int HAOPLPBMPLB_FIELD_NUMBER = 6;
  private double haoplpbmplb_;
  /**
   * <code>double haoplpbmplb = 6;</code>
   * @return The haoplpbmplb.
   */
  @java.lang.Override
  public double getHaoplpbmplb() {
    return haoplpbmplb_;
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
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, ddmflcmbajg_);
    }
    if (mdfhgooifmh_ != 0) {
      output.writeInt32(2, mdfhgooifmh_);
    }
    if (!getLeehhlngfeoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, leehhlngfeo_);
    }
    if (npegbcaodof_ != 0L) {
      output.writeUInt64(4, npegbcaodof_);
    }
    if (acbjkipgmcl_ != 0D) {
      output.writeDouble(5, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      output.writeDouble(6, haoplpbmplb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ddmflcmbajg_);
    }
    if (mdfhgooifmh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, mdfhgooifmh_);
    }
    if (!getLeehhlngfeoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, leehhlngfeo_);
    }
    if (npegbcaodof_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, npegbcaodof_);
    }
    if (acbjkipgmcl_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, haoplpbmplb_);
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
    if (!(obj instanceof POGOProtos.Rpc.IDCAAFCAGCL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IDCAAFCAGCL other = (POGOProtos.Rpc.IDCAAFCAGCL) obj;

    if (ddmflcmbajg_ != other.ddmflcmbajg_) return false;
    if (getMdfhgooifmh()
        != other.getMdfhgooifmh()) return false;
    if (!getLeehhlngfeo()
        .equals(other.getLeehhlngfeo())) return false;
    if (getNpegbcaodof()
        != other.getNpegbcaodof()) return false;
    if (java.lang.Double.doubleToLongBits(getAcbjkipgmcl())
        != java.lang.Double.doubleToLongBits(
            other.getAcbjkipgmcl())) return false;
    if (java.lang.Double.doubleToLongBits(getHaoplpbmplb())
        != java.lang.Double.doubleToLongBits(
            other.getHaoplpbmplb())) return false;
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
    hash = (37 * hash) + DDMFLCMBAJG_FIELD_NUMBER;
    hash = (53 * hash) + ddmflcmbajg_;
    hash = (37 * hash) + MDFHGOOIFMH_FIELD_NUMBER;
    hash = (53 * hash) + getMdfhgooifmh();
    hash = (37 * hash) + LEEHHLNGFEO_FIELD_NUMBER;
    hash = (53 * hash) + getLeehhlngfeo().hashCode();
    hash = (37 * hash) + NPEGBCAODOF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNpegbcaodof());
    hash = (37 * hash) + ACBJKIPGMCL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAcbjkipgmcl()));
    hash = (37 * hash) + HAOPLPBMPLB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHaoplpbmplb()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDCAAFCAGCL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IDCAAFCAGCL prototype) {
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
   * ref: IDCAAFCAGCL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IDCAAFCAGCL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IDCAAFCAGCL)
      POGOProtos.Rpc.IDCAAFCAGCLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDCAAFCAGCL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDCAAFCAGCL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IDCAAFCAGCL.class, POGOProtos.Rpc.IDCAAFCAGCL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IDCAAFCAGCL.newBuilder()
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
      ddmflcmbajg_ = 0;

      mdfhgooifmh_ = 0;

      leehhlngfeo_ = "";

      npegbcaodof_ = 0L;

      acbjkipgmcl_ = 0D;

      haoplpbmplb_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDCAAFCAGCL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDCAAFCAGCL getDefaultInstanceForType() {
      return POGOProtos.Rpc.IDCAAFCAGCL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDCAAFCAGCL build() {
      POGOProtos.Rpc.IDCAAFCAGCL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDCAAFCAGCL buildPartial() {
      POGOProtos.Rpc.IDCAAFCAGCL result = new POGOProtos.Rpc.IDCAAFCAGCL(this);
      result.ddmflcmbajg_ = ddmflcmbajg_;
      result.mdfhgooifmh_ = mdfhgooifmh_;
      result.leehhlngfeo_ = leehhlngfeo_;
      result.npegbcaodof_ = npegbcaodof_;
      result.acbjkipgmcl_ = acbjkipgmcl_;
      result.haoplpbmplb_ = haoplpbmplb_;
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
      if (other instanceof POGOProtos.Rpc.IDCAAFCAGCL) {
        return mergeFrom((POGOProtos.Rpc.IDCAAFCAGCL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IDCAAFCAGCL other) {
      if (other == POGOProtos.Rpc.IDCAAFCAGCL.getDefaultInstance()) return this;
      if (other.ddmflcmbajg_ != 0) {
        setDdmflcmbajgValue(other.getDdmflcmbajgValue());
      }
      if (other.getMdfhgooifmh() != 0) {
        setMdfhgooifmh(other.getMdfhgooifmh());
      }
      if (!other.getLeehhlngfeo().isEmpty()) {
        leehhlngfeo_ = other.leehhlngfeo_;
        onChanged();
      }
      if (other.getNpegbcaodof() != 0L) {
        setNpegbcaodof(other.getNpegbcaodof());
      }
      if (other.getAcbjkipgmcl() != 0D) {
        setAcbjkipgmcl(other.getAcbjkipgmcl());
      }
      if (other.getHaoplpbmplb() != 0D) {
        setHaoplpbmplb(other.getHaoplpbmplb());
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
      POGOProtos.Rpc.IDCAAFCAGCL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IDCAAFCAGCL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ddmflcmbajg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return The enum numeric value on the wire for ddmflcmbajg.
     */
    @java.lang.Override public int getDdmflcmbajgValue() {
      return ddmflcmbajg_;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @param value The enum numeric value on the wire for ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajgValue(int value) {
      
      ddmflcmbajg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return The ddmflcmbajg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
      return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @param value The ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajg(POGOProtos.Rpc.MAGDEIICLAK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ddmflcmbajg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDdmflcmbajg() {
      
      ddmflcmbajg_ = 0;
      onChanged();
      return this;
    }

    private int mdfhgooifmh_ ;
    /**
     * <code>int32 mdfhgooifmh = 2;</code>
     * @return The mdfhgooifmh.
     */
    @java.lang.Override
    public int getMdfhgooifmh() {
      return mdfhgooifmh_;
    }
    /**
     * <code>int32 mdfhgooifmh = 2;</code>
     * @param value The mdfhgooifmh to set.
     * @return This builder for chaining.
     */
    public Builder setMdfhgooifmh(int value) {
      
      mdfhgooifmh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mdfhgooifmh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdfhgooifmh() {
      
      mdfhgooifmh_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object leehhlngfeo_ = "";
    /**
     * <code>string leehhlngfeo = 3;</code>
     * @return The leehhlngfeo.
     */
    public java.lang.String getLeehhlngfeo() {
      java.lang.Object ref = leehhlngfeo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leehhlngfeo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 3;</code>
     * @return The bytes for leehhlngfeo.
     */
    public com.google.protobuf.ByteString
        getLeehhlngfeoBytes() {
      java.lang.Object ref = leehhlngfeo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leehhlngfeo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 3;</code>
     * @param value The leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeehhlngfeo() {
      
      leehhlngfeo_ = getDefaultInstance().getLeehhlngfeo();
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 3;</code>
     * @param value The bytes for leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }

    private long npegbcaodof_ ;
    /**
     * <code>uint64 npegbcaodof = 4;</code>
     * @return The npegbcaodof.
     */
    @java.lang.Override
    public long getNpegbcaodof() {
      return npegbcaodof_;
    }
    /**
     * <code>uint64 npegbcaodof = 4;</code>
     * @param value The npegbcaodof to set.
     * @return This builder for chaining.
     */
    public Builder setNpegbcaodof(long value) {
      
      npegbcaodof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 npegbcaodof = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpegbcaodof() {
      
      npegbcaodof_ = 0L;
      onChanged();
      return this;
    }

    private double acbjkipgmcl_ ;
    /**
     * <code>double acbjkipgmcl = 5;</code>
     * @return The acbjkipgmcl.
     */
    @java.lang.Override
    public double getAcbjkipgmcl() {
      return acbjkipgmcl_;
    }
    /**
     * <code>double acbjkipgmcl = 5;</code>
     * @param value The acbjkipgmcl to set.
     * @return This builder for chaining.
     */
    public Builder setAcbjkipgmcl(double value) {
      
      acbjkipgmcl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double acbjkipgmcl = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcbjkipgmcl() {
      
      acbjkipgmcl_ = 0D;
      onChanged();
      return this;
    }

    private double haoplpbmplb_ ;
    /**
     * <code>double haoplpbmplb = 6;</code>
     * @return The haoplpbmplb.
     */
    @java.lang.Override
    public double getHaoplpbmplb() {
      return haoplpbmplb_;
    }
    /**
     * <code>double haoplpbmplb = 6;</code>
     * @param value The haoplpbmplb to set.
     * @return This builder for chaining.
     */
    public Builder setHaoplpbmplb(double value) {
      
      haoplpbmplb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double haoplpbmplb = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHaoplpbmplb() {
      
      haoplpbmplb_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IDCAAFCAGCL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IDCAAFCAGCL)
  private static final POGOProtos.Rpc.IDCAAFCAGCL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IDCAAFCAGCL();
  }

  public static POGOProtos.Rpc.IDCAAFCAGCL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDCAAFCAGCL>
      PARSER = new com.google.protobuf.AbstractParser<IDCAAFCAGCL>() {
    @java.lang.Override
    public IDCAAFCAGCL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IDCAAFCAGCL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IDCAAFCAGCL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDCAAFCAGCL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IDCAAFCAGCL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

