// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CFIOELOLEDK}
 */
public  final class CFIOELOLEDK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CFIOELOLEDK)
    CFIOELOLEDKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CFIOELOLEDK.newBuilder() to construct.
  private CFIOELOLEDK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CFIOELOLEDK() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CFIOELOLEDK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CFIOELOLEDK(
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

            fdhnokgfggf_ = input.readInt32();
            break;
          }
          case 16: {

            cbdjadfjhml_ = input.readInt32();
            break;
          }
          case 24: {

            nmnedpcmjmp_ = input.readInt32();
            break;
          }
          case 32: {

            bmhmbcbjcid_ = input.readInt32();
            break;
          }
          case 45: {

            iafimkkfbkg_ = input.readFloat();
            break;
          }
          case 53: {

            fbigjiokjfg_ = input.readFloat();
            break;
          }
          case 56: {

            gjmiemegffb_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CFIOELOLEDK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CFIOELOLEDK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CFIOELOLEDK.class, POGOProtos.Rpc.CFIOELOLEDK.Builder.class);
  }

  public static final int FDHNOKGFGGF_FIELD_NUMBER = 1;
  private int fdhnokgfggf_;
  /**
   * <code>int32 fdhnokgfggf = 1;</code>
   * @return The fdhnokgfggf.
   */
  public int getFdhnokgfggf() {
    return fdhnokgfggf_;
  }

  public static final int CBDJADFJHML_FIELD_NUMBER = 2;
  private int cbdjadfjhml_;
  /**
   * <code>int32 cbdjadfjhml = 2;</code>
   * @return The cbdjadfjhml.
   */
  public int getCbdjadfjhml() {
    return cbdjadfjhml_;
  }

  public static final int NMNEDPCMJMP_FIELD_NUMBER = 3;
  private int nmnedpcmjmp_;
  /**
   * <code>int32 nmnedpcmjmp = 3;</code>
   * @return The nmnedpcmjmp.
   */
  public int getNmnedpcmjmp() {
    return nmnedpcmjmp_;
  }

  public static final int BMHMBCBJCID_FIELD_NUMBER = 4;
  private int bmhmbcbjcid_;
  /**
   * <code>int32 bmhmbcbjcid = 4;</code>
   * @return The bmhmbcbjcid.
   */
  public int getBmhmbcbjcid() {
    return bmhmbcbjcid_;
  }

  public static final int IAFIMKKFBKG_FIELD_NUMBER = 5;
  private float iafimkkfbkg_;
  /**
   * <code>float iafimkkfbkg = 5;</code>
   * @return The iafimkkfbkg.
   */
  public float getIafimkkfbkg() {
    return iafimkkfbkg_;
  }

  public static final int FBIGJIOKJFG_FIELD_NUMBER = 6;
  private float fbigjiokjfg_;
  /**
   * <code>float fbigjiokjfg = 6;</code>
   * @return The fbigjiokjfg.
   */
  public float getFbigjiokjfg() {
    return fbigjiokjfg_;
  }

  public static final int GJMIEMEGFFB_FIELD_NUMBER = 7;
  private int gjmiemegffb_;
  /**
   * <code>int32 gjmiemegffb = 7;</code>
   * @return The gjmiemegffb.
   */
  public int getGjmiemegffb() {
    return gjmiemegffb_;
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
    if (fdhnokgfggf_ != 0) {
      output.writeInt32(1, fdhnokgfggf_);
    }
    if (cbdjadfjhml_ != 0) {
      output.writeInt32(2, cbdjadfjhml_);
    }
    if (nmnedpcmjmp_ != 0) {
      output.writeInt32(3, nmnedpcmjmp_);
    }
    if (bmhmbcbjcid_ != 0) {
      output.writeInt32(4, bmhmbcbjcid_);
    }
    if (iafimkkfbkg_ != 0F) {
      output.writeFloat(5, iafimkkfbkg_);
    }
    if (fbigjiokjfg_ != 0F) {
      output.writeFloat(6, fbigjiokjfg_);
    }
    if (gjmiemegffb_ != 0) {
      output.writeInt32(7, gjmiemegffb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fdhnokgfggf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fdhnokgfggf_);
    }
    if (cbdjadfjhml_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, cbdjadfjhml_);
    }
    if (nmnedpcmjmp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nmnedpcmjmp_);
    }
    if (bmhmbcbjcid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, bmhmbcbjcid_);
    }
    if (iafimkkfbkg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, iafimkkfbkg_);
    }
    if (fbigjiokjfg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, fbigjiokjfg_);
    }
    if (gjmiemegffb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, gjmiemegffb_);
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
    if (!(obj instanceof POGOProtos.Rpc.CFIOELOLEDK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CFIOELOLEDK other = (POGOProtos.Rpc.CFIOELOLEDK) obj;

    if (getFdhnokgfggf()
        != other.getFdhnokgfggf()) return false;
    if (getCbdjadfjhml()
        != other.getCbdjadfjhml()) return false;
    if (getNmnedpcmjmp()
        != other.getNmnedpcmjmp()) return false;
    if (getBmhmbcbjcid()
        != other.getBmhmbcbjcid()) return false;
    if (java.lang.Float.floatToIntBits(getIafimkkfbkg())
        != java.lang.Float.floatToIntBits(
            other.getIafimkkfbkg())) return false;
    if (java.lang.Float.floatToIntBits(getFbigjiokjfg())
        != java.lang.Float.floatToIntBits(
            other.getFbigjiokjfg())) return false;
    if (getGjmiemegffb()
        != other.getGjmiemegffb()) return false;
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
    hash = (37 * hash) + FDHNOKGFGGF_FIELD_NUMBER;
    hash = (53 * hash) + getFdhnokgfggf();
    hash = (37 * hash) + CBDJADFJHML_FIELD_NUMBER;
    hash = (53 * hash) + getCbdjadfjhml();
    hash = (37 * hash) + NMNEDPCMJMP_FIELD_NUMBER;
    hash = (53 * hash) + getNmnedpcmjmp();
    hash = (37 * hash) + BMHMBCBJCID_FIELD_NUMBER;
    hash = (53 * hash) + getBmhmbcbjcid();
    hash = (37 * hash) + IAFIMKKFBKG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIafimkkfbkg());
    hash = (37 * hash) + FBIGJIOKJFG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFbigjiokjfg());
    hash = (37 * hash) + GJMIEMEGFFB_FIELD_NUMBER;
    hash = (53 * hash) + getGjmiemegffb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CFIOELOLEDK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CFIOELOLEDK prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CFIOELOLEDK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CFIOELOLEDK)
      POGOProtos.Rpc.CFIOELOLEDKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CFIOELOLEDK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CFIOELOLEDK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CFIOELOLEDK.class, POGOProtos.Rpc.CFIOELOLEDK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CFIOELOLEDK.newBuilder()
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
      fdhnokgfggf_ = 0;

      cbdjadfjhml_ = 0;

      nmnedpcmjmp_ = 0;

      bmhmbcbjcid_ = 0;

      iafimkkfbkg_ = 0F;

      fbigjiokjfg_ = 0F;

      gjmiemegffb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CFIOELOLEDK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CFIOELOLEDK getDefaultInstanceForType() {
      return POGOProtos.Rpc.CFIOELOLEDK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CFIOELOLEDK build() {
      POGOProtos.Rpc.CFIOELOLEDK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CFIOELOLEDK buildPartial() {
      POGOProtos.Rpc.CFIOELOLEDK result = new POGOProtos.Rpc.CFIOELOLEDK(this);
      result.fdhnokgfggf_ = fdhnokgfggf_;
      result.cbdjadfjhml_ = cbdjadfjhml_;
      result.nmnedpcmjmp_ = nmnedpcmjmp_;
      result.bmhmbcbjcid_ = bmhmbcbjcid_;
      result.iafimkkfbkg_ = iafimkkfbkg_;
      result.fbigjiokjfg_ = fbigjiokjfg_;
      result.gjmiemegffb_ = gjmiemegffb_;
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
      if (other instanceof POGOProtos.Rpc.CFIOELOLEDK) {
        return mergeFrom((POGOProtos.Rpc.CFIOELOLEDK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CFIOELOLEDK other) {
      if (other == POGOProtos.Rpc.CFIOELOLEDK.getDefaultInstance()) return this;
      if (other.getFdhnokgfggf() != 0) {
        setFdhnokgfggf(other.getFdhnokgfggf());
      }
      if (other.getCbdjadfjhml() != 0) {
        setCbdjadfjhml(other.getCbdjadfjhml());
      }
      if (other.getNmnedpcmjmp() != 0) {
        setNmnedpcmjmp(other.getNmnedpcmjmp());
      }
      if (other.getBmhmbcbjcid() != 0) {
        setBmhmbcbjcid(other.getBmhmbcbjcid());
      }
      if (other.getIafimkkfbkg() != 0F) {
        setIafimkkfbkg(other.getIafimkkfbkg());
      }
      if (other.getFbigjiokjfg() != 0F) {
        setFbigjiokjfg(other.getFbigjiokjfg());
      }
      if (other.getGjmiemegffb() != 0) {
        setGjmiemegffb(other.getGjmiemegffb());
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
      POGOProtos.Rpc.CFIOELOLEDK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CFIOELOLEDK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fdhnokgfggf_ ;
    /**
     * <code>int32 fdhnokgfggf = 1;</code>
     * @return The fdhnokgfggf.
     */
    public int getFdhnokgfggf() {
      return fdhnokgfggf_;
    }
    /**
     * <code>int32 fdhnokgfggf = 1;</code>
     * @param value The fdhnokgfggf to set.
     * @return This builder for chaining.
     */
    public Builder setFdhnokgfggf(int value) {
      
      fdhnokgfggf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fdhnokgfggf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdhnokgfggf() {
      
      fdhnokgfggf_ = 0;
      onChanged();
      return this;
    }

    private int cbdjadfjhml_ ;
    /**
     * <code>int32 cbdjadfjhml = 2;</code>
     * @return The cbdjadfjhml.
     */
    public int getCbdjadfjhml() {
      return cbdjadfjhml_;
    }
    /**
     * <code>int32 cbdjadfjhml = 2;</code>
     * @param value The cbdjadfjhml to set.
     * @return This builder for chaining.
     */
    public Builder setCbdjadfjhml(int value) {
      
      cbdjadfjhml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cbdjadfjhml = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCbdjadfjhml() {
      
      cbdjadfjhml_ = 0;
      onChanged();
      return this;
    }

    private int nmnedpcmjmp_ ;
    /**
     * <code>int32 nmnedpcmjmp = 3;</code>
     * @return The nmnedpcmjmp.
     */
    public int getNmnedpcmjmp() {
      return nmnedpcmjmp_;
    }
    /**
     * <code>int32 nmnedpcmjmp = 3;</code>
     * @param value The nmnedpcmjmp to set.
     * @return This builder for chaining.
     */
    public Builder setNmnedpcmjmp(int value) {
      
      nmnedpcmjmp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nmnedpcmjmp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNmnedpcmjmp() {
      
      nmnedpcmjmp_ = 0;
      onChanged();
      return this;
    }

    private int bmhmbcbjcid_ ;
    /**
     * <code>int32 bmhmbcbjcid = 4;</code>
     * @return The bmhmbcbjcid.
     */
    public int getBmhmbcbjcid() {
      return bmhmbcbjcid_;
    }
    /**
     * <code>int32 bmhmbcbjcid = 4;</code>
     * @param value The bmhmbcbjcid to set.
     * @return This builder for chaining.
     */
    public Builder setBmhmbcbjcid(int value) {
      
      bmhmbcbjcid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bmhmbcbjcid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmhmbcbjcid() {
      
      bmhmbcbjcid_ = 0;
      onChanged();
      return this;
    }

    private float iafimkkfbkg_ ;
    /**
     * <code>float iafimkkfbkg = 5;</code>
     * @return The iafimkkfbkg.
     */
    public float getIafimkkfbkg() {
      return iafimkkfbkg_;
    }
    /**
     * <code>float iafimkkfbkg = 5;</code>
     * @param value The iafimkkfbkg to set.
     * @return This builder for chaining.
     */
    public Builder setIafimkkfbkg(float value) {
      
      iafimkkfbkg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float iafimkkfbkg = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIafimkkfbkg() {
      
      iafimkkfbkg_ = 0F;
      onChanged();
      return this;
    }

    private float fbigjiokjfg_ ;
    /**
     * <code>float fbigjiokjfg = 6;</code>
     * @return The fbigjiokjfg.
     */
    public float getFbigjiokjfg() {
      return fbigjiokjfg_;
    }
    /**
     * <code>float fbigjiokjfg = 6;</code>
     * @param value The fbigjiokjfg to set.
     * @return This builder for chaining.
     */
    public Builder setFbigjiokjfg(float value) {
      
      fbigjiokjfg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fbigjiokjfg = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbigjiokjfg() {
      
      fbigjiokjfg_ = 0F;
      onChanged();
      return this;
    }

    private int gjmiemegffb_ ;
    /**
     * <code>int32 gjmiemegffb = 7;</code>
     * @return The gjmiemegffb.
     */
    public int getGjmiemegffb() {
      return gjmiemegffb_;
    }
    /**
     * <code>int32 gjmiemegffb = 7;</code>
     * @param value The gjmiemegffb to set.
     * @return This builder for chaining.
     */
    public Builder setGjmiemegffb(int value) {
      
      gjmiemegffb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gjmiemegffb = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjmiemegffb() {
      
      gjmiemegffb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CFIOELOLEDK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CFIOELOLEDK)
  private static final POGOProtos.Rpc.CFIOELOLEDK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CFIOELOLEDK();
  }

  public static POGOProtos.Rpc.CFIOELOLEDK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CFIOELOLEDK>
      PARSER = new com.google.protobuf.AbstractParser<CFIOELOLEDK>() {
    @java.lang.Override
    public CFIOELOLEDK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CFIOELOLEDK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CFIOELOLEDK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CFIOELOLEDK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CFIOELOLEDK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

