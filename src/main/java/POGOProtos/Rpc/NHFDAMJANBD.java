// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NHFDAMJANBD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NHFDAMJANBD}
 */
public final class NHFDAMJANBD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NHFDAMJANBD)
    NHFDAMJANBDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NHFDAMJANBD.newBuilder() to construct.
  private NHFDAMJANBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NHFDAMJANBD() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NHFDAMJANBD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NHFDAMJANBD(
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

            ocnkfpeaeol_ = input.readBool();
            break;
          }
          case 16: {

            nelphfjogef_ = input.readBool();
            break;
          }
          case 24: {

            hkjfodchmic_ = input.readBool();
            break;
          }
          case 32: {

            fhgbikphhih_ = input.readBool();
            break;
          }
          case 45: {

            ndbckljjpik_ = input.readFloat();
            break;
          }
          case 48: {

            cglhcfgkpoi_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHFDAMJANBD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHFDAMJANBD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NHFDAMJANBD.class, POGOProtos.Rpc.NHFDAMJANBD.Builder.class);
  }

  public static final int OCNKFPEAEOL_FIELD_NUMBER = 1;
  private boolean ocnkfpeaeol_;
  /**
   * <code>bool ocnkfpeaeol = 1;</code>
   * @return The ocnkfpeaeol.
   */
  @java.lang.Override
  public boolean getOcnkfpeaeol() {
    return ocnkfpeaeol_;
  }

  public static final int NELPHFJOGEF_FIELD_NUMBER = 2;
  private boolean nelphfjogef_;
  /**
   * <code>bool nelphfjogef = 2;</code>
   * @return The nelphfjogef.
   */
  @java.lang.Override
  public boolean getNelphfjogef() {
    return nelphfjogef_;
  }

  public static final int HKJFODCHMIC_FIELD_NUMBER = 3;
  private boolean hkjfodchmic_;
  /**
   * <code>bool hkjfodchmic = 3;</code>
   * @return The hkjfodchmic.
   */
  @java.lang.Override
  public boolean getHkjfodchmic() {
    return hkjfodchmic_;
  }

  public static final int FHGBIKPHHIH_FIELD_NUMBER = 4;
  private boolean fhgbikphhih_;
  /**
   * <code>bool fhgbikphhih = 4;</code>
   * @return The fhgbikphhih.
   */
  @java.lang.Override
  public boolean getFhgbikphhih() {
    return fhgbikphhih_;
  }

  public static final int NDBCKLJJPIK_FIELD_NUMBER = 5;
  private float ndbckljjpik_;
  /**
   * <code>float ndbckljjpik = 5;</code>
   * @return The ndbckljjpik.
   */
  @java.lang.Override
  public float getNdbckljjpik() {
    return ndbckljjpik_;
  }

  public static final int CGLHCFGKPOI_FIELD_NUMBER = 6;
  private int cglhcfgkpoi_;
  /**
   * <code>uint32 cglhcfgkpoi = 6;</code>
   * @return The cglhcfgkpoi.
   */
  @java.lang.Override
  public int getCglhcfgkpoi() {
    return cglhcfgkpoi_;
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
    if (ocnkfpeaeol_ != false) {
      output.writeBool(1, ocnkfpeaeol_);
    }
    if (nelphfjogef_ != false) {
      output.writeBool(2, nelphfjogef_);
    }
    if (hkjfodchmic_ != false) {
      output.writeBool(3, hkjfodchmic_);
    }
    if (fhgbikphhih_ != false) {
      output.writeBool(4, fhgbikphhih_);
    }
    if (ndbckljjpik_ != 0F) {
      output.writeFloat(5, ndbckljjpik_);
    }
    if (cglhcfgkpoi_ != 0) {
      output.writeUInt32(6, cglhcfgkpoi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ocnkfpeaeol_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ocnkfpeaeol_);
    }
    if (nelphfjogef_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, nelphfjogef_);
    }
    if (hkjfodchmic_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hkjfodchmic_);
    }
    if (fhgbikphhih_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, fhgbikphhih_);
    }
    if (ndbckljjpik_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, ndbckljjpik_);
    }
    if (cglhcfgkpoi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, cglhcfgkpoi_);
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
    if (!(obj instanceof POGOProtos.Rpc.NHFDAMJANBD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NHFDAMJANBD other = (POGOProtos.Rpc.NHFDAMJANBD) obj;

    if (getOcnkfpeaeol()
        != other.getOcnkfpeaeol()) return false;
    if (getNelphfjogef()
        != other.getNelphfjogef()) return false;
    if (getHkjfodchmic()
        != other.getHkjfodchmic()) return false;
    if (getFhgbikphhih()
        != other.getFhgbikphhih()) return false;
    if (java.lang.Float.floatToIntBits(getNdbckljjpik())
        != java.lang.Float.floatToIntBits(
            other.getNdbckljjpik())) return false;
    if (getCglhcfgkpoi()
        != other.getCglhcfgkpoi()) return false;
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
    hash = (37 * hash) + OCNKFPEAEOL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcnkfpeaeol());
    hash = (37 * hash) + NELPHFJOGEF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNelphfjogef());
    hash = (37 * hash) + HKJFODCHMIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHkjfodchmic());
    hash = (37 * hash) + FHGBIKPHHIH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFhgbikphhih());
    hash = (37 * hash) + NDBCKLJJPIK_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNdbckljjpik());
    hash = (37 * hash) + CGLHCFGKPOI_FIELD_NUMBER;
    hash = (53 * hash) + getCglhcfgkpoi();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHFDAMJANBD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NHFDAMJANBD prototype) {
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
   * ref: NHFDAMJANBD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NHFDAMJANBD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NHFDAMJANBD)
      POGOProtos.Rpc.NHFDAMJANBDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHFDAMJANBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHFDAMJANBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NHFDAMJANBD.class, POGOProtos.Rpc.NHFDAMJANBD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NHFDAMJANBD.newBuilder()
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
      ocnkfpeaeol_ = false;

      nelphfjogef_ = false;

      hkjfodchmic_ = false;

      fhgbikphhih_ = false;

      ndbckljjpik_ = 0F;

      cglhcfgkpoi_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHFDAMJANBD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHFDAMJANBD getDefaultInstanceForType() {
      return POGOProtos.Rpc.NHFDAMJANBD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHFDAMJANBD build() {
      POGOProtos.Rpc.NHFDAMJANBD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHFDAMJANBD buildPartial() {
      POGOProtos.Rpc.NHFDAMJANBD result = new POGOProtos.Rpc.NHFDAMJANBD(this);
      result.ocnkfpeaeol_ = ocnkfpeaeol_;
      result.nelphfjogef_ = nelphfjogef_;
      result.hkjfodchmic_ = hkjfodchmic_;
      result.fhgbikphhih_ = fhgbikphhih_;
      result.ndbckljjpik_ = ndbckljjpik_;
      result.cglhcfgkpoi_ = cglhcfgkpoi_;
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
      if (other instanceof POGOProtos.Rpc.NHFDAMJANBD) {
        return mergeFrom((POGOProtos.Rpc.NHFDAMJANBD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NHFDAMJANBD other) {
      if (other == POGOProtos.Rpc.NHFDAMJANBD.getDefaultInstance()) return this;
      if (other.getOcnkfpeaeol() != false) {
        setOcnkfpeaeol(other.getOcnkfpeaeol());
      }
      if (other.getNelphfjogef() != false) {
        setNelphfjogef(other.getNelphfjogef());
      }
      if (other.getHkjfodchmic() != false) {
        setHkjfodchmic(other.getHkjfodchmic());
      }
      if (other.getFhgbikphhih() != false) {
        setFhgbikphhih(other.getFhgbikphhih());
      }
      if (other.getNdbckljjpik() != 0F) {
        setNdbckljjpik(other.getNdbckljjpik());
      }
      if (other.getCglhcfgkpoi() != 0) {
        setCglhcfgkpoi(other.getCglhcfgkpoi());
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
      POGOProtos.Rpc.NHFDAMJANBD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NHFDAMJANBD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean ocnkfpeaeol_ ;
    /**
     * <code>bool ocnkfpeaeol = 1;</code>
     * @return The ocnkfpeaeol.
     */
    @java.lang.Override
    public boolean getOcnkfpeaeol() {
      return ocnkfpeaeol_;
    }
    /**
     * <code>bool ocnkfpeaeol = 1;</code>
     * @param value The ocnkfpeaeol to set.
     * @return This builder for chaining.
     */
    public Builder setOcnkfpeaeol(boolean value) {
      
      ocnkfpeaeol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ocnkfpeaeol = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcnkfpeaeol() {
      
      ocnkfpeaeol_ = false;
      onChanged();
      return this;
    }

    private boolean nelphfjogef_ ;
    /**
     * <code>bool nelphfjogef = 2;</code>
     * @return The nelphfjogef.
     */
    @java.lang.Override
    public boolean getNelphfjogef() {
      return nelphfjogef_;
    }
    /**
     * <code>bool nelphfjogef = 2;</code>
     * @param value The nelphfjogef to set.
     * @return This builder for chaining.
     */
    public Builder setNelphfjogef(boolean value) {
      
      nelphfjogef_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nelphfjogef = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNelphfjogef() {
      
      nelphfjogef_ = false;
      onChanged();
      return this;
    }

    private boolean hkjfodchmic_ ;
    /**
     * <code>bool hkjfodchmic = 3;</code>
     * @return The hkjfodchmic.
     */
    @java.lang.Override
    public boolean getHkjfodchmic() {
      return hkjfodchmic_;
    }
    /**
     * <code>bool hkjfodchmic = 3;</code>
     * @param value The hkjfodchmic to set.
     * @return This builder for chaining.
     */
    public Builder setHkjfodchmic(boolean value) {
      
      hkjfodchmic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hkjfodchmic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHkjfodchmic() {
      
      hkjfodchmic_ = false;
      onChanged();
      return this;
    }

    private boolean fhgbikphhih_ ;
    /**
     * <code>bool fhgbikphhih = 4;</code>
     * @return The fhgbikphhih.
     */
    @java.lang.Override
    public boolean getFhgbikphhih() {
      return fhgbikphhih_;
    }
    /**
     * <code>bool fhgbikphhih = 4;</code>
     * @param value The fhgbikphhih to set.
     * @return This builder for chaining.
     */
    public Builder setFhgbikphhih(boolean value) {
      
      fhgbikphhih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fhgbikphhih = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFhgbikphhih() {
      
      fhgbikphhih_ = false;
      onChanged();
      return this;
    }

    private float ndbckljjpik_ ;
    /**
     * <code>float ndbckljjpik = 5;</code>
     * @return The ndbckljjpik.
     */
    @java.lang.Override
    public float getNdbckljjpik() {
      return ndbckljjpik_;
    }
    /**
     * <code>float ndbckljjpik = 5;</code>
     * @param value The ndbckljjpik to set.
     * @return This builder for chaining.
     */
    public Builder setNdbckljjpik(float value) {
      
      ndbckljjpik_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ndbckljjpik = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNdbckljjpik() {
      
      ndbckljjpik_ = 0F;
      onChanged();
      return this;
    }

    private int cglhcfgkpoi_ ;
    /**
     * <code>uint32 cglhcfgkpoi = 6;</code>
     * @return The cglhcfgkpoi.
     */
    @java.lang.Override
    public int getCglhcfgkpoi() {
      return cglhcfgkpoi_;
    }
    /**
     * <code>uint32 cglhcfgkpoi = 6;</code>
     * @param value The cglhcfgkpoi to set.
     * @return This builder for chaining.
     */
    public Builder setCglhcfgkpoi(int value) {
      
      cglhcfgkpoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 cglhcfgkpoi = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCglhcfgkpoi() {
      
      cglhcfgkpoi_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NHFDAMJANBD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NHFDAMJANBD)
  private static final POGOProtos.Rpc.NHFDAMJANBD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NHFDAMJANBD();
  }

  public static POGOProtos.Rpc.NHFDAMJANBD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NHFDAMJANBD>
      PARSER = new com.google.protobuf.AbstractParser<NHFDAMJANBD>() {
    @java.lang.Override
    public NHFDAMJANBD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NHFDAMJANBD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NHFDAMJANBD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NHFDAMJANBD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NHFDAMJANBD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

