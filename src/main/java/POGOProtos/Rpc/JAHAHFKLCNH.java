// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JAHAHFKLCNH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JAHAHFKLCNH}
 */
public final class JAHAHFKLCNH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JAHAHFKLCNH)
    JAHAHFKLCNHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JAHAHFKLCNH.newBuilder() to construct.
  private JAHAHFKLCNH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JAHAHFKLCNH() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JAHAHFKLCNH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JAHAHFKLCNH(
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

            focmpabohjn_ = input.readInt32();
            break;
          }
          case 16: {

            pnflpkmomnj_ = input.readInt32();
            break;
          }
          case 24: {

            eojgilcjbpl_ = input.readInt32();
            break;
          }
          case 32: {

            haamhlpjmaj_ = input.readInt32();
            break;
          }
          case 45: {

            peagelohfnb_ = input.readFloat();
            break;
          }
          case 53: {

            mgedgggaeke_ = input.readFloat();
            break;
          }
          case 56: {

            emdmeigadmh_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JAHAHFKLCNH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JAHAHFKLCNH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JAHAHFKLCNH.class, POGOProtos.Rpc.JAHAHFKLCNH.Builder.class);
  }

  public static final int FOCMPABOHJN_FIELD_NUMBER = 1;
  private int focmpabohjn_;
  /**
   * <code>int32 focmpabohjn = 1;</code>
   * @return The focmpabohjn.
   */
  @java.lang.Override
  public int getFocmpabohjn() {
    return focmpabohjn_;
  }

  public static final int PNFLPKMOMNJ_FIELD_NUMBER = 2;
  private int pnflpkmomnj_;
  /**
   * <code>int32 pnflpkmomnj = 2;</code>
   * @return The pnflpkmomnj.
   */
  @java.lang.Override
  public int getPnflpkmomnj() {
    return pnflpkmomnj_;
  }

  public static final int EOJGILCJBPL_FIELD_NUMBER = 3;
  private int eojgilcjbpl_;
  /**
   * <code>int32 eojgilcjbpl = 3;</code>
   * @return The eojgilcjbpl.
   */
  @java.lang.Override
  public int getEojgilcjbpl() {
    return eojgilcjbpl_;
  }

  public static final int HAAMHLPJMAJ_FIELD_NUMBER = 4;
  private int haamhlpjmaj_;
  /**
   * <code>int32 haamhlpjmaj = 4;</code>
   * @return The haamhlpjmaj.
   */
  @java.lang.Override
  public int getHaamhlpjmaj() {
    return haamhlpjmaj_;
  }

  public static final int PEAGELOHFNB_FIELD_NUMBER = 5;
  private float peagelohfnb_;
  /**
   * <code>float peagelohfnb = 5;</code>
   * @return The peagelohfnb.
   */
  @java.lang.Override
  public float getPeagelohfnb() {
    return peagelohfnb_;
  }

  public static final int MGEDGGGAEKE_FIELD_NUMBER = 6;
  private float mgedgggaeke_;
  /**
   * <code>float mgedgggaeke = 6;</code>
   * @return The mgedgggaeke.
   */
  @java.lang.Override
  public float getMgedgggaeke() {
    return mgedgggaeke_;
  }

  public static final int EMDMEIGADMH_FIELD_NUMBER = 7;
  private int emdmeigadmh_;
  /**
   * <code>int32 emdmeigadmh = 7;</code>
   * @return The emdmeigadmh.
   */
  @java.lang.Override
  public int getEmdmeigadmh() {
    return emdmeigadmh_;
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
    if (focmpabohjn_ != 0) {
      output.writeInt32(1, focmpabohjn_);
    }
    if (pnflpkmomnj_ != 0) {
      output.writeInt32(2, pnflpkmomnj_);
    }
    if (eojgilcjbpl_ != 0) {
      output.writeInt32(3, eojgilcjbpl_);
    }
    if (haamhlpjmaj_ != 0) {
      output.writeInt32(4, haamhlpjmaj_);
    }
    if (peagelohfnb_ != 0F) {
      output.writeFloat(5, peagelohfnb_);
    }
    if (mgedgggaeke_ != 0F) {
      output.writeFloat(6, mgedgggaeke_);
    }
    if (emdmeigadmh_ != 0) {
      output.writeInt32(7, emdmeigadmh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (focmpabohjn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, focmpabohjn_);
    }
    if (pnflpkmomnj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pnflpkmomnj_);
    }
    if (eojgilcjbpl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, eojgilcjbpl_);
    }
    if (haamhlpjmaj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, haamhlpjmaj_);
    }
    if (peagelohfnb_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, peagelohfnb_);
    }
    if (mgedgggaeke_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, mgedgggaeke_);
    }
    if (emdmeigadmh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, emdmeigadmh_);
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
    if (!(obj instanceof POGOProtos.Rpc.JAHAHFKLCNH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JAHAHFKLCNH other = (POGOProtos.Rpc.JAHAHFKLCNH) obj;

    if (getFocmpabohjn()
        != other.getFocmpabohjn()) return false;
    if (getPnflpkmomnj()
        != other.getPnflpkmomnj()) return false;
    if (getEojgilcjbpl()
        != other.getEojgilcjbpl()) return false;
    if (getHaamhlpjmaj()
        != other.getHaamhlpjmaj()) return false;
    if (java.lang.Float.floatToIntBits(getPeagelohfnb())
        != java.lang.Float.floatToIntBits(
            other.getPeagelohfnb())) return false;
    if (java.lang.Float.floatToIntBits(getMgedgggaeke())
        != java.lang.Float.floatToIntBits(
            other.getMgedgggaeke())) return false;
    if (getEmdmeigadmh()
        != other.getEmdmeigadmh()) return false;
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
    hash = (37 * hash) + FOCMPABOHJN_FIELD_NUMBER;
    hash = (53 * hash) + getFocmpabohjn();
    hash = (37 * hash) + PNFLPKMOMNJ_FIELD_NUMBER;
    hash = (53 * hash) + getPnflpkmomnj();
    hash = (37 * hash) + EOJGILCJBPL_FIELD_NUMBER;
    hash = (53 * hash) + getEojgilcjbpl();
    hash = (37 * hash) + HAAMHLPJMAJ_FIELD_NUMBER;
    hash = (53 * hash) + getHaamhlpjmaj();
    hash = (37 * hash) + PEAGELOHFNB_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPeagelohfnb());
    hash = (37 * hash) + MGEDGGGAEKE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMgedgggaeke());
    hash = (37 * hash) + EMDMEIGADMH_FIELD_NUMBER;
    hash = (53 * hash) + getEmdmeigadmh();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JAHAHFKLCNH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JAHAHFKLCNH prototype) {
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
   * ref: JAHAHFKLCNH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JAHAHFKLCNH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JAHAHFKLCNH)
      POGOProtos.Rpc.JAHAHFKLCNHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JAHAHFKLCNH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JAHAHFKLCNH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JAHAHFKLCNH.class, POGOProtos.Rpc.JAHAHFKLCNH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JAHAHFKLCNH.newBuilder()
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
      focmpabohjn_ = 0;

      pnflpkmomnj_ = 0;

      eojgilcjbpl_ = 0;

      haamhlpjmaj_ = 0;

      peagelohfnb_ = 0F;

      mgedgggaeke_ = 0F;

      emdmeigadmh_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JAHAHFKLCNH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JAHAHFKLCNH getDefaultInstanceForType() {
      return POGOProtos.Rpc.JAHAHFKLCNH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JAHAHFKLCNH build() {
      POGOProtos.Rpc.JAHAHFKLCNH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JAHAHFKLCNH buildPartial() {
      POGOProtos.Rpc.JAHAHFKLCNH result = new POGOProtos.Rpc.JAHAHFKLCNH(this);
      result.focmpabohjn_ = focmpabohjn_;
      result.pnflpkmomnj_ = pnflpkmomnj_;
      result.eojgilcjbpl_ = eojgilcjbpl_;
      result.haamhlpjmaj_ = haamhlpjmaj_;
      result.peagelohfnb_ = peagelohfnb_;
      result.mgedgggaeke_ = mgedgggaeke_;
      result.emdmeigadmh_ = emdmeigadmh_;
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
      if (other instanceof POGOProtos.Rpc.JAHAHFKLCNH) {
        return mergeFrom((POGOProtos.Rpc.JAHAHFKLCNH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JAHAHFKLCNH other) {
      if (other == POGOProtos.Rpc.JAHAHFKLCNH.getDefaultInstance()) return this;
      if (other.getFocmpabohjn() != 0) {
        setFocmpabohjn(other.getFocmpabohjn());
      }
      if (other.getPnflpkmomnj() != 0) {
        setPnflpkmomnj(other.getPnflpkmomnj());
      }
      if (other.getEojgilcjbpl() != 0) {
        setEojgilcjbpl(other.getEojgilcjbpl());
      }
      if (other.getHaamhlpjmaj() != 0) {
        setHaamhlpjmaj(other.getHaamhlpjmaj());
      }
      if (other.getPeagelohfnb() != 0F) {
        setPeagelohfnb(other.getPeagelohfnb());
      }
      if (other.getMgedgggaeke() != 0F) {
        setMgedgggaeke(other.getMgedgggaeke());
      }
      if (other.getEmdmeigadmh() != 0) {
        setEmdmeigadmh(other.getEmdmeigadmh());
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
      POGOProtos.Rpc.JAHAHFKLCNH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JAHAHFKLCNH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int focmpabohjn_ ;
    /**
     * <code>int32 focmpabohjn = 1;</code>
     * @return The focmpabohjn.
     */
    @java.lang.Override
    public int getFocmpabohjn() {
      return focmpabohjn_;
    }
    /**
     * <code>int32 focmpabohjn = 1;</code>
     * @param value The focmpabohjn to set.
     * @return This builder for chaining.
     */
    public Builder setFocmpabohjn(int value) {
      
      focmpabohjn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 focmpabohjn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFocmpabohjn() {
      
      focmpabohjn_ = 0;
      onChanged();
      return this;
    }

    private int pnflpkmomnj_ ;
    /**
     * <code>int32 pnflpkmomnj = 2;</code>
     * @return The pnflpkmomnj.
     */
    @java.lang.Override
    public int getPnflpkmomnj() {
      return pnflpkmomnj_;
    }
    /**
     * <code>int32 pnflpkmomnj = 2;</code>
     * @param value The pnflpkmomnj to set.
     * @return This builder for chaining.
     */
    public Builder setPnflpkmomnj(int value) {
      
      pnflpkmomnj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pnflpkmomnj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPnflpkmomnj() {
      
      pnflpkmomnj_ = 0;
      onChanged();
      return this;
    }

    private int eojgilcjbpl_ ;
    /**
     * <code>int32 eojgilcjbpl = 3;</code>
     * @return The eojgilcjbpl.
     */
    @java.lang.Override
    public int getEojgilcjbpl() {
      return eojgilcjbpl_;
    }
    /**
     * <code>int32 eojgilcjbpl = 3;</code>
     * @param value The eojgilcjbpl to set.
     * @return This builder for chaining.
     */
    public Builder setEojgilcjbpl(int value) {
      
      eojgilcjbpl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 eojgilcjbpl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEojgilcjbpl() {
      
      eojgilcjbpl_ = 0;
      onChanged();
      return this;
    }

    private int haamhlpjmaj_ ;
    /**
     * <code>int32 haamhlpjmaj = 4;</code>
     * @return The haamhlpjmaj.
     */
    @java.lang.Override
    public int getHaamhlpjmaj() {
      return haamhlpjmaj_;
    }
    /**
     * <code>int32 haamhlpjmaj = 4;</code>
     * @param value The haamhlpjmaj to set.
     * @return This builder for chaining.
     */
    public Builder setHaamhlpjmaj(int value) {
      
      haamhlpjmaj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 haamhlpjmaj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHaamhlpjmaj() {
      
      haamhlpjmaj_ = 0;
      onChanged();
      return this;
    }

    private float peagelohfnb_ ;
    /**
     * <code>float peagelohfnb = 5;</code>
     * @return The peagelohfnb.
     */
    @java.lang.Override
    public float getPeagelohfnb() {
      return peagelohfnb_;
    }
    /**
     * <code>float peagelohfnb = 5;</code>
     * @param value The peagelohfnb to set.
     * @return This builder for chaining.
     */
    public Builder setPeagelohfnb(float value) {
      
      peagelohfnb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float peagelohfnb = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeagelohfnb() {
      
      peagelohfnb_ = 0F;
      onChanged();
      return this;
    }

    private float mgedgggaeke_ ;
    /**
     * <code>float mgedgggaeke = 6;</code>
     * @return The mgedgggaeke.
     */
    @java.lang.Override
    public float getMgedgggaeke() {
      return mgedgggaeke_;
    }
    /**
     * <code>float mgedgggaeke = 6;</code>
     * @param value The mgedgggaeke to set.
     * @return This builder for chaining.
     */
    public Builder setMgedgggaeke(float value) {
      
      mgedgggaeke_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float mgedgggaeke = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgedgggaeke() {
      
      mgedgggaeke_ = 0F;
      onChanged();
      return this;
    }

    private int emdmeigadmh_ ;
    /**
     * <code>int32 emdmeigadmh = 7;</code>
     * @return The emdmeigadmh.
     */
    @java.lang.Override
    public int getEmdmeigadmh() {
      return emdmeigadmh_;
    }
    /**
     * <code>int32 emdmeigadmh = 7;</code>
     * @param value The emdmeigadmh to set.
     * @return This builder for chaining.
     */
    public Builder setEmdmeigadmh(int value) {
      
      emdmeigadmh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 emdmeigadmh = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmdmeigadmh() {
      
      emdmeigadmh_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JAHAHFKLCNH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JAHAHFKLCNH)
  private static final POGOProtos.Rpc.JAHAHFKLCNH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JAHAHFKLCNH();
  }

  public static POGOProtos.Rpc.JAHAHFKLCNH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JAHAHFKLCNH>
      PARSER = new com.google.protobuf.AbstractParser<JAHAHFKLCNH>() {
    @java.lang.Override
    public JAHAHFKLCNH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JAHAHFKLCNH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JAHAHFKLCNH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JAHAHFKLCNH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JAHAHFKLCNH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

