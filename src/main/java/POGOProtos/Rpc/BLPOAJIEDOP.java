// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BLPOAJIEDOP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BLPOAJIEDOP}
 */
public final class BLPOAJIEDOP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BLPOAJIEDOP)
    BLPOAJIEDOPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BLPOAJIEDOP.newBuilder() to construct.
  private BLPOAJIEDOP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BLPOAJIEDOP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BLPOAJIEDOP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BLPOAJIEDOP(
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

            dbdedahhmhm_ = input.readInt32();
            break;
          }
          case 16: {

            heeghghpjpm_ = input.readInt32();
            break;
          }
          case 29: {

            dcieoglfdoe_ = input.readFloat();
            break;
          }
          case 37: {

            cppdfdlogdg_ = input.readFloat();
            break;
          }
          case 40: {

            mdjgeimkdpa_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLPOAJIEDOP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLPOAJIEDOP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BLPOAJIEDOP.class, POGOProtos.Rpc.BLPOAJIEDOP.Builder.class);
  }

  public static final int DBDEDAHHMHM_FIELD_NUMBER = 1;
  private int dbdedahhmhm_;
  /**
   * <code>int32 dbdedahhmhm = 1;</code>
   * @return The dbdedahhmhm.
   */
  @java.lang.Override
  public int getDbdedahhmhm() {
    return dbdedahhmhm_;
  }

  public static final int HEEGHGHPJPM_FIELD_NUMBER = 2;
  private int heeghghpjpm_;
  /**
   * <code>int32 heeghghpjpm = 2;</code>
   * @return The heeghghpjpm.
   */
  @java.lang.Override
  public int getHeeghghpjpm() {
    return heeghghpjpm_;
  }

  public static final int DCIEOGLFDOE_FIELD_NUMBER = 3;
  private float dcieoglfdoe_;
  /**
   * <code>float dcieoglfdoe = 3;</code>
   * @return The dcieoglfdoe.
   */
  @java.lang.Override
  public float getDcieoglfdoe() {
    return dcieoglfdoe_;
  }

  public static final int CPPDFDLOGDG_FIELD_NUMBER = 4;
  private float cppdfdlogdg_;
  /**
   * <code>float cppdfdlogdg = 4;</code>
   * @return The cppdfdlogdg.
   */
  @java.lang.Override
  public float getCppdfdlogdg() {
    return cppdfdlogdg_;
  }

  public static final int MDJGEIMKDPA_FIELD_NUMBER = 5;
  private int mdjgeimkdpa_;
  /**
   * <code>int32 mdjgeimkdpa = 5;</code>
   * @return The mdjgeimkdpa.
   */
  @java.lang.Override
  public int getMdjgeimkdpa() {
    return mdjgeimkdpa_;
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
    if (dbdedahhmhm_ != 0) {
      output.writeInt32(1, dbdedahhmhm_);
    }
    if (heeghghpjpm_ != 0) {
      output.writeInt32(2, heeghghpjpm_);
    }
    if (dcieoglfdoe_ != 0F) {
      output.writeFloat(3, dcieoglfdoe_);
    }
    if (cppdfdlogdg_ != 0F) {
      output.writeFloat(4, cppdfdlogdg_);
    }
    if (mdjgeimkdpa_ != 0) {
      output.writeInt32(5, mdjgeimkdpa_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dbdedahhmhm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, dbdedahhmhm_);
    }
    if (heeghghpjpm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, heeghghpjpm_);
    }
    if (dcieoglfdoe_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, dcieoglfdoe_);
    }
    if (cppdfdlogdg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, cppdfdlogdg_);
    }
    if (mdjgeimkdpa_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, mdjgeimkdpa_);
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
    if (!(obj instanceof POGOProtos.Rpc.BLPOAJIEDOP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BLPOAJIEDOP other = (POGOProtos.Rpc.BLPOAJIEDOP) obj;

    if (getDbdedahhmhm()
        != other.getDbdedahhmhm()) return false;
    if (getHeeghghpjpm()
        != other.getHeeghghpjpm()) return false;
    if (java.lang.Float.floatToIntBits(getDcieoglfdoe())
        != java.lang.Float.floatToIntBits(
            other.getDcieoglfdoe())) return false;
    if (java.lang.Float.floatToIntBits(getCppdfdlogdg())
        != java.lang.Float.floatToIntBits(
            other.getCppdfdlogdg())) return false;
    if (getMdjgeimkdpa()
        != other.getMdjgeimkdpa()) return false;
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
    hash = (37 * hash) + DBDEDAHHMHM_FIELD_NUMBER;
    hash = (53 * hash) + getDbdedahhmhm();
    hash = (37 * hash) + HEEGHGHPJPM_FIELD_NUMBER;
    hash = (53 * hash) + getHeeghghpjpm();
    hash = (37 * hash) + DCIEOGLFDOE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDcieoglfdoe());
    hash = (37 * hash) + CPPDFDLOGDG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCppdfdlogdg());
    hash = (37 * hash) + MDJGEIMKDPA_FIELD_NUMBER;
    hash = (53 * hash) + getMdjgeimkdpa();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLPOAJIEDOP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BLPOAJIEDOP prototype) {
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
   * ref: BLPOAJIEDOP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BLPOAJIEDOP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BLPOAJIEDOP)
      POGOProtos.Rpc.BLPOAJIEDOPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLPOAJIEDOP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLPOAJIEDOP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BLPOAJIEDOP.class, POGOProtos.Rpc.BLPOAJIEDOP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BLPOAJIEDOP.newBuilder()
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
      dbdedahhmhm_ = 0;

      heeghghpjpm_ = 0;

      dcieoglfdoe_ = 0F;

      cppdfdlogdg_ = 0F;

      mdjgeimkdpa_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLPOAJIEDOP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLPOAJIEDOP getDefaultInstanceForType() {
      return POGOProtos.Rpc.BLPOAJIEDOP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLPOAJIEDOP build() {
      POGOProtos.Rpc.BLPOAJIEDOP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLPOAJIEDOP buildPartial() {
      POGOProtos.Rpc.BLPOAJIEDOP result = new POGOProtos.Rpc.BLPOAJIEDOP(this);
      result.dbdedahhmhm_ = dbdedahhmhm_;
      result.heeghghpjpm_ = heeghghpjpm_;
      result.dcieoglfdoe_ = dcieoglfdoe_;
      result.cppdfdlogdg_ = cppdfdlogdg_;
      result.mdjgeimkdpa_ = mdjgeimkdpa_;
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
      if (other instanceof POGOProtos.Rpc.BLPOAJIEDOP) {
        return mergeFrom((POGOProtos.Rpc.BLPOAJIEDOP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BLPOAJIEDOP other) {
      if (other == POGOProtos.Rpc.BLPOAJIEDOP.getDefaultInstance()) return this;
      if (other.getDbdedahhmhm() != 0) {
        setDbdedahhmhm(other.getDbdedahhmhm());
      }
      if (other.getHeeghghpjpm() != 0) {
        setHeeghghpjpm(other.getHeeghghpjpm());
      }
      if (other.getDcieoglfdoe() != 0F) {
        setDcieoglfdoe(other.getDcieoglfdoe());
      }
      if (other.getCppdfdlogdg() != 0F) {
        setCppdfdlogdg(other.getCppdfdlogdg());
      }
      if (other.getMdjgeimkdpa() != 0) {
        setMdjgeimkdpa(other.getMdjgeimkdpa());
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
      POGOProtos.Rpc.BLPOAJIEDOP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BLPOAJIEDOP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dbdedahhmhm_ ;
    /**
     * <code>int32 dbdedahhmhm = 1;</code>
     * @return The dbdedahhmhm.
     */
    @java.lang.Override
    public int getDbdedahhmhm() {
      return dbdedahhmhm_;
    }
    /**
     * <code>int32 dbdedahhmhm = 1;</code>
     * @param value The dbdedahhmhm to set.
     * @return This builder for chaining.
     */
    public Builder setDbdedahhmhm(int value) {
      
      dbdedahhmhm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dbdedahhmhm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbdedahhmhm() {
      
      dbdedahhmhm_ = 0;
      onChanged();
      return this;
    }

    private int heeghghpjpm_ ;
    /**
     * <code>int32 heeghghpjpm = 2;</code>
     * @return The heeghghpjpm.
     */
    @java.lang.Override
    public int getHeeghghpjpm() {
      return heeghghpjpm_;
    }
    /**
     * <code>int32 heeghghpjpm = 2;</code>
     * @param value The heeghghpjpm to set.
     * @return This builder for chaining.
     */
    public Builder setHeeghghpjpm(int value) {
      
      heeghghpjpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 heeghghpjpm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeeghghpjpm() {
      
      heeghghpjpm_ = 0;
      onChanged();
      return this;
    }

    private float dcieoglfdoe_ ;
    /**
     * <code>float dcieoglfdoe = 3;</code>
     * @return The dcieoglfdoe.
     */
    @java.lang.Override
    public float getDcieoglfdoe() {
      return dcieoglfdoe_;
    }
    /**
     * <code>float dcieoglfdoe = 3;</code>
     * @param value The dcieoglfdoe to set.
     * @return This builder for chaining.
     */
    public Builder setDcieoglfdoe(float value) {
      
      dcieoglfdoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float dcieoglfdoe = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDcieoglfdoe() {
      
      dcieoglfdoe_ = 0F;
      onChanged();
      return this;
    }

    private float cppdfdlogdg_ ;
    /**
     * <code>float cppdfdlogdg = 4;</code>
     * @return The cppdfdlogdg.
     */
    @java.lang.Override
    public float getCppdfdlogdg() {
      return cppdfdlogdg_;
    }
    /**
     * <code>float cppdfdlogdg = 4;</code>
     * @param value The cppdfdlogdg to set.
     * @return This builder for chaining.
     */
    public Builder setCppdfdlogdg(float value) {
      
      cppdfdlogdg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cppdfdlogdg = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCppdfdlogdg() {
      
      cppdfdlogdg_ = 0F;
      onChanged();
      return this;
    }

    private int mdjgeimkdpa_ ;
    /**
     * <code>int32 mdjgeimkdpa = 5;</code>
     * @return The mdjgeimkdpa.
     */
    @java.lang.Override
    public int getMdjgeimkdpa() {
      return mdjgeimkdpa_;
    }
    /**
     * <code>int32 mdjgeimkdpa = 5;</code>
     * @param value The mdjgeimkdpa to set.
     * @return This builder for chaining.
     */
    public Builder setMdjgeimkdpa(int value) {
      
      mdjgeimkdpa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mdjgeimkdpa = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdjgeimkdpa() {
      
      mdjgeimkdpa_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BLPOAJIEDOP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BLPOAJIEDOP)
  private static final POGOProtos.Rpc.BLPOAJIEDOP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BLPOAJIEDOP();
  }

  public static POGOProtos.Rpc.BLPOAJIEDOP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BLPOAJIEDOP>
      PARSER = new com.google.protobuf.AbstractParser<BLPOAJIEDOP>() {
    @java.lang.Override
    public BLPOAJIEDOP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BLPOAJIEDOP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BLPOAJIEDOP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BLPOAJIEDOP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BLPOAJIEDOP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

