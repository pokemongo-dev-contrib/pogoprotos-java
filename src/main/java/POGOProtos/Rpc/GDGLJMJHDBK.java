// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GDGLJMJHDBK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GDGLJMJHDBK}
 */
public final class GDGLJMJHDBK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GDGLJMJHDBK)
    GDGLJMJHDBKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GDGLJMJHDBK.newBuilder() to construct.
  private GDGLJMJHDBK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GDGLJMJHDBK() {
    dmahipegcin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GDGLJMJHDBK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GDGLJMJHDBK(
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

            dmahipegcin_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.EEAJLDAOJDP.Builder subBuilder = null;
            if (dfobddpaikm_ != null) {
              subBuilder = dfobddpaikm_.toBuilder();
            }
            dfobddpaikm_ = input.readMessage(POGOProtos.Rpc.EEAJLDAOJDP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dfobddpaikm_);
              dfobddpaikm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            fgfkojpbpjl_ = input.readInt32();
            break;
          }
          case 32: {

            meeaneicbdo_ = input.readInt32();
            break;
          }
          case 40: {

            ieppfaolioi_ = input.readBool();
            break;
          }
          case 49: {

            bbibgiibfgf_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDGLJMJHDBK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDGLJMJHDBK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GDGLJMJHDBK.class, POGOProtos.Rpc.GDGLJMJHDBK.Builder.class);
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private volatile java.lang.Object dmahipegcin_;
  /**
   * <code>string dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override
  public java.lang.String getDmahipegcin() {
    java.lang.Object ref = dmahipegcin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dmahipegcin_ = s;
      return s;
    }
  }
  /**
   * <code>string dmahipegcin = 1;</code>
   * @return The bytes for dmahipegcin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDmahipegcinBytes() {
    java.lang.Object ref = dmahipegcin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dmahipegcin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DFOBDDPAIKM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm_;
  /**
   * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
   * @return Whether the dfobddpaikm field is set.
   */
  @java.lang.Override
  public boolean hasDfobddpaikm() {
    return dfobddpaikm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
   * @return The dfobddpaikm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.EEAJLDAOJDP getDfobddpaikm() {
    return dfobddpaikm_ == null ? POGOProtos.Rpc.EEAJLDAOJDP.getDefaultInstance() : dfobddpaikm_;
  }
  /**
   * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EEAJLDAOJDPOrBuilder getDfobddpaikmOrBuilder() {
    return getDfobddpaikm();
  }

  public static final int FGFKOJPBPJL_FIELD_NUMBER = 3;
  private int fgfkojpbpjl_;
  /**
   * <code>int32 fgfkojpbpjl = 3;</code>
   * @return The fgfkojpbpjl.
   */
  @java.lang.Override
  public int getFgfkojpbpjl() {
    return fgfkojpbpjl_;
  }

  public static final int MEEANEICBDO_FIELD_NUMBER = 4;
  private int meeaneicbdo_;
  /**
   * <code>int32 meeaneicbdo = 4;</code>
   * @return The meeaneicbdo.
   */
  @java.lang.Override
  public int getMeeaneicbdo() {
    return meeaneicbdo_;
  }

  public static final int IEPPFAOLIOI_FIELD_NUMBER = 5;
  private boolean ieppfaolioi_;
  /**
   * <code>bool ieppfaolioi = 5;</code>
   * @return The ieppfaolioi.
   */
  @java.lang.Override
  public boolean getIeppfaolioi() {
    return ieppfaolioi_;
  }

  public static final int BBIBGIIBFGF_FIELD_NUMBER = 6;
  private double bbibgiibfgf_;
  /**
   * <code>double bbibgiibfgf = 6;</code>
   * @return The bbibgiibfgf.
   */
  @java.lang.Override
  public double getBbibgiibfgf() {
    return bbibgiibfgf_;
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
    if (!getDmahipegcinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dmahipegcin_);
    }
    if (dfobddpaikm_ != null) {
      output.writeMessage(2, getDfobddpaikm());
    }
    if (fgfkojpbpjl_ != 0) {
      output.writeInt32(3, fgfkojpbpjl_);
    }
    if (meeaneicbdo_ != 0) {
      output.writeInt32(4, meeaneicbdo_);
    }
    if (ieppfaolioi_ != false) {
      output.writeBool(5, ieppfaolioi_);
    }
    if (bbibgiibfgf_ != 0D) {
      output.writeDouble(6, bbibgiibfgf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDmahipegcinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dmahipegcin_);
    }
    if (dfobddpaikm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDfobddpaikm());
    }
    if (fgfkojpbpjl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fgfkojpbpjl_);
    }
    if (meeaneicbdo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, meeaneicbdo_);
    }
    if (ieppfaolioi_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ieppfaolioi_);
    }
    if (bbibgiibfgf_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, bbibgiibfgf_);
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
    if (!(obj instanceof POGOProtos.Rpc.GDGLJMJHDBK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GDGLJMJHDBK other = (POGOProtos.Rpc.GDGLJMJHDBK) obj;

    if (!getDmahipegcin()
        .equals(other.getDmahipegcin())) return false;
    if (hasDfobddpaikm() != other.hasDfobddpaikm()) return false;
    if (hasDfobddpaikm()) {
      if (!getDfobddpaikm()
          .equals(other.getDfobddpaikm())) return false;
    }
    if (getFgfkojpbpjl()
        != other.getFgfkojpbpjl()) return false;
    if (getMeeaneicbdo()
        != other.getMeeaneicbdo()) return false;
    if (getIeppfaolioi()
        != other.getIeppfaolioi()) return false;
    if (java.lang.Double.doubleToLongBits(getBbibgiibfgf())
        != java.lang.Double.doubleToLongBits(
            other.getBbibgiibfgf())) return false;
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
    hash = (37 * hash) + DMAHIPEGCIN_FIELD_NUMBER;
    hash = (53 * hash) + getDmahipegcin().hashCode();
    if (hasDfobddpaikm()) {
      hash = (37 * hash) + DFOBDDPAIKM_FIELD_NUMBER;
      hash = (53 * hash) + getDfobddpaikm().hashCode();
    }
    hash = (37 * hash) + FGFKOJPBPJL_FIELD_NUMBER;
    hash = (53 * hash) + getFgfkojpbpjl();
    hash = (37 * hash) + MEEANEICBDO_FIELD_NUMBER;
    hash = (53 * hash) + getMeeaneicbdo();
    hash = (37 * hash) + IEPPFAOLIOI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIeppfaolioi());
    hash = (37 * hash) + BBIBGIIBFGF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBbibgiibfgf()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDGLJMJHDBK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GDGLJMJHDBK prototype) {
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
   * ref: GDGLJMJHDBK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GDGLJMJHDBK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GDGLJMJHDBK)
      POGOProtos.Rpc.GDGLJMJHDBKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDGLJMJHDBK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDGLJMJHDBK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GDGLJMJHDBK.class, POGOProtos.Rpc.GDGLJMJHDBK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GDGLJMJHDBK.newBuilder()
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
      dmahipegcin_ = "";

      if (dfobddpaikmBuilder_ == null) {
        dfobddpaikm_ = null;
      } else {
        dfobddpaikm_ = null;
        dfobddpaikmBuilder_ = null;
      }
      fgfkojpbpjl_ = 0;

      meeaneicbdo_ = 0;

      ieppfaolioi_ = false;

      bbibgiibfgf_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDGLJMJHDBK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDGLJMJHDBK getDefaultInstanceForType() {
      return POGOProtos.Rpc.GDGLJMJHDBK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDGLJMJHDBK build() {
      POGOProtos.Rpc.GDGLJMJHDBK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDGLJMJHDBK buildPartial() {
      POGOProtos.Rpc.GDGLJMJHDBK result = new POGOProtos.Rpc.GDGLJMJHDBK(this);
      result.dmahipegcin_ = dmahipegcin_;
      if (dfobddpaikmBuilder_ == null) {
        result.dfobddpaikm_ = dfobddpaikm_;
      } else {
        result.dfobddpaikm_ = dfobddpaikmBuilder_.build();
      }
      result.fgfkojpbpjl_ = fgfkojpbpjl_;
      result.meeaneicbdo_ = meeaneicbdo_;
      result.ieppfaolioi_ = ieppfaolioi_;
      result.bbibgiibfgf_ = bbibgiibfgf_;
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
      if (other instanceof POGOProtos.Rpc.GDGLJMJHDBK) {
        return mergeFrom((POGOProtos.Rpc.GDGLJMJHDBK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GDGLJMJHDBK other) {
      if (other == POGOProtos.Rpc.GDGLJMJHDBK.getDefaultInstance()) return this;
      if (!other.getDmahipegcin().isEmpty()) {
        dmahipegcin_ = other.dmahipegcin_;
        onChanged();
      }
      if (other.hasDfobddpaikm()) {
        mergeDfobddpaikm(other.getDfobddpaikm());
      }
      if (other.getFgfkojpbpjl() != 0) {
        setFgfkojpbpjl(other.getFgfkojpbpjl());
      }
      if (other.getMeeaneicbdo() != 0) {
        setMeeaneicbdo(other.getMeeaneicbdo());
      }
      if (other.getIeppfaolioi() != false) {
        setIeppfaolioi(other.getIeppfaolioi());
      }
      if (other.getBbibgiibfgf() != 0D) {
        setBbibgiibfgf(other.getBbibgiibfgf());
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
      POGOProtos.Rpc.GDGLJMJHDBK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GDGLJMJHDBK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dmahipegcin_ = "";
    /**
     * <code>string dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    public java.lang.String getDmahipegcin() {
      java.lang.Object ref = dmahipegcin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dmahipegcin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dmahipegcin = 1;</code>
     * @return The bytes for dmahipegcin.
     */
    public com.google.protobuf.ByteString
        getDmahipegcinBytes() {
      java.lang.Object ref = dmahipegcin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dmahipegcin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = getDefaultInstance().getDmahipegcin();
      onChanged();
      return this;
    }
    /**
     * <code>string dmahipegcin = 1;</code>
     * @param value The bytes for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EEAJLDAOJDP, POGOProtos.Rpc.EEAJLDAOJDP.Builder, POGOProtos.Rpc.EEAJLDAOJDPOrBuilder> dfobddpaikmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     * @return Whether the dfobddpaikm field is set.
     */
    public boolean hasDfobddpaikm() {
      return dfobddpaikmBuilder_ != null || dfobddpaikm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     * @return The dfobddpaikm.
     */
    public POGOProtos.Rpc.EEAJLDAOJDP getDfobddpaikm() {
      if (dfobddpaikmBuilder_ == null) {
        return dfobddpaikm_ == null ? POGOProtos.Rpc.EEAJLDAOJDP.getDefaultInstance() : dfobddpaikm_;
      } else {
        return dfobddpaikmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public Builder setDfobddpaikm(POGOProtos.Rpc.EEAJLDAOJDP value) {
      if (dfobddpaikmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dfobddpaikm_ = value;
        onChanged();
      } else {
        dfobddpaikmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public Builder setDfobddpaikm(
        POGOProtos.Rpc.EEAJLDAOJDP.Builder builderForValue) {
      if (dfobddpaikmBuilder_ == null) {
        dfobddpaikm_ = builderForValue.build();
        onChanged();
      } else {
        dfobddpaikmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public Builder mergeDfobddpaikm(POGOProtos.Rpc.EEAJLDAOJDP value) {
      if (dfobddpaikmBuilder_ == null) {
        if (dfobddpaikm_ != null) {
          dfobddpaikm_ =
            POGOProtos.Rpc.EEAJLDAOJDP.newBuilder(dfobddpaikm_).mergeFrom(value).buildPartial();
        } else {
          dfobddpaikm_ = value;
        }
        onChanged();
      } else {
        dfobddpaikmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public Builder clearDfobddpaikm() {
      if (dfobddpaikmBuilder_ == null) {
        dfobddpaikm_ = null;
        onChanged();
      } else {
        dfobddpaikm_ = null;
        dfobddpaikmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public POGOProtos.Rpc.EEAJLDAOJDP.Builder getDfobddpaikmBuilder() {
      
      onChanged();
      return getDfobddpaikmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    public POGOProtos.Rpc.EEAJLDAOJDPOrBuilder getDfobddpaikmOrBuilder() {
      if (dfobddpaikmBuilder_ != null) {
        return dfobddpaikmBuilder_.getMessageOrBuilder();
      } else {
        return dfobddpaikm_ == null ?
            POGOProtos.Rpc.EEAJLDAOJDP.getDefaultInstance() : dfobddpaikm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EEAJLDAOJDP dfobddpaikm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EEAJLDAOJDP, POGOProtos.Rpc.EEAJLDAOJDP.Builder, POGOProtos.Rpc.EEAJLDAOJDPOrBuilder> 
        getDfobddpaikmFieldBuilder() {
      if (dfobddpaikmBuilder_ == null) {
        dfobddpaikmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EEAJLDAOJDP, POGOProtos.Rpc.EEAJLDAOJDP.Builder, POGOProtos.Rpc.EEAJLDAOJDPOrBuilder>(
                getDfobddpaikm(),
                getParentForChildren(),
                isClean());
        dfobddpaikm_ = null;
      }
      return dfobddpaikmBuilder_;
    }

    private int fgfkojpbpjl_ ;
    /**
     * <code>int32 fgfkojpbpjl = 3;</code>
     * @return The fgfkojpbpjl.
     */
    @java.lang.Override
    public int getFgfkojpbpjl() {
      return fgfkojpbpjl_;
    }
    /**
     * <code>int32 fgfkojpbpjl = 3;</code>
     * @param value The fgfkojpbpjl to set.
     * @return This builder for chaining.
     */
    public Builder setFgfkojpbpjl(int value) {
      
      fgfkojpbpjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fgfkojpbpjl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFgfkojpbpjl() {
      
      fgfkojpbpjl_ = 0;
      onChanged();
      return this;
    }

    private int meeaneicbdo_ ;
    /**
     * <code>int32 meeaneicbdo = 4;</code>
     * @return The meeaneicbdo.
     */
    @java.lang.Override
    public int getMeeaneicbdo() {
      return meeaneicbdo_;
    }
    /**
     * <code>int32 meeaneicbdo = 4;</code>
     * @param value The meeaneicbdo to set.
     * @return This builder for chaining.
     */
    public Builder setMeeaneicbdo(int value) {
      
      meeaneicbdo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 meeaneicbdo = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeeaneicbdo() {
      
      meeaneicbdo_ = 0;
      onChanged();
      return this;
    }

    private boolean ieppfaolioi_ ;
    /**
     * <code>bool ieppfaolioi = 5;</code>
     * @return The ieppfaolioi.
     */
    @java.lang.Override
    public boolean getIeppfaolioi() {
      return ieppfaolioi_;
    }
    /**
     * <code>bool ieppfaolioi = 5;</code>
     * @param value The ieppfaolioi to set.
     * @return This builder for chaining.
     */
    public Builder setIeppfaolioi(boolean value) {
      
      ieppfaolioi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ieppfaolioi = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIeppfaolioi() {
      
      ieppfaolioi_ = false;
      onChanged();
      return this;
    }

    private double bbibgiibfgf_ ;
    /**
     * <code>double bbibgiibfgf = 6;</code>
     * @return The bbibgiibfgf.
     */
    @java.lang.Override
    public double getBbibgiibfgf() {
      return bbibgiibfgf_;
    }
    /**
     * <code>double bbibgiibfgf = 6;</code>
     * @param value The bbibgiibfgf to set.
     * @return This builder for chaining.
     */
    public Builder setBbibgiibfgf(double value) {
      
      bbibgiibfgf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bbibgiibfgf = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBbibgiibfgf() {
      
      bbibgiibfgf_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GDGLJMJHDBK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GDGLJMJHDBK)
  private static final POGOProtos.Rpc.GDGLJMJHDBK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GDGLJMJHDBK();
  }

  public static POGOProtos.Rpc.GDGLJMJHDBK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GDGLJMJHDBK>
      PARSER = new com.google.protobuf.AbstractParser<GDGLJMJHDBK>() {
    @java.lang.Override
    public GDGLJMJHDBK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GDGLJMJHDBK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GDGLJMJHDBK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GDGLJMJHDBK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GDGLJMJHDBK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

