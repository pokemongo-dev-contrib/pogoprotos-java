// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HEKGIKCKDIL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HEKGIKCKDIL}
 */
public final class HEKGIKCKDIL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HEKGIKCKDIL)
    HEKGIKCKDILOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HEKGIKCKDIL.newBuilder() to construct.
  private HEKGIKCKDIL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HEKGIKCKDIL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HEKGIKCKDIL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HEKGIKCKDIL(
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
          case 13: {

            doahhiclmlj_ = input.readFloat();
            break;
          }
          case 21: {

            gkoflbebikp_ = input.readFloat();
            break;
          }
          case 29: {

            ngbmhggicpg_ = input.readFloat();
            break;
          }
          case 37: {

            cpfpcjdepbc_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HEKGIKCKDIL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HEKGIKCKDIL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HEKGIKCKDIL.class, POGOProtos.Rpc.HEKGIKCKDIL.Builder.class);
  }

  public static final int DOAHHICLMLJ_FIELD_NUMBER = 1;
  private float doahhiclmlj_;
  /**
   * <code>float doahhiclmlj = 1;</code>
   * @return The doahhiclmlj.
   */
  @java.lang.Override
  public float getDoahhiclmlj() {
    return doahhiclmlj_;
  }

  public static final int GKOFLBEBIKP_FIELD_NUMBER = 2;
  private float gkoflbebikp_;
  /**
   * <code>float gkoflbebikp = 2;</code>
   * @return The gkoflbebikp.
   */
  @java.lang.Override
  public float getGkoflbebikp() {
    return gkoflbebikp_;
  }

  public static final int NGBMHGGICPG_FIELD_NUMBER = 3;
  private float ngbmhggicpg_;
  /**
   * <code>float ngbmhggicpg = 3;</code>
   * @return The ngbmhggicpg.
   */
  @java.lang.Override
  public float getNgbmhggicpg() {
    return ngbmhggicpg_;
  }

  public static final int CPFPCJDEPBC_FIELD_NUMBER = 4;
  private float cpfpcjdepbc_;
  /**
   * <code>float cpfpcjdepbc = 4;</code>
   * @return The cpfpcjdepbc.
   */
  @java.lang.Override
  public float getCpfpcjdepbc() {
    return cpfpcjdepbc_;
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
    if (doahhiclmlj_ != 0F) {
      output.writeFloat(1, doahhiclmlj_);
    }
    if (gkoflbebikp_ != 0F) {
      output.writeFloat(2, gkoflbebikp_);
    }
    if (ngbmhggicpg_ != 0F) {
      output.writeFloat(3, ngbmhggicpg_);
    }
    if (cpfpcjdepbc_ != 0F) {
      output.writeFloat(4, cpfpcjdepbc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (doahhiclmlj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, doahhiclmlj_);
    }
    if (gkoflbebikp_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, gkoflbebikp_);
    }
    if (ngbmhggicpg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, ngbmhggicpg_);
    }
    if (cpfpcjdepbc_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, cpfpcjdepbc_);
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
    if (!(obj instanceof POGOProtos.Rpc.HEKGIKCKDIL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HEKGIKCKDIL other = (POGOProtos.Rpc.HEKGIKCKDIL) obj;

    if (java.lang.Float.floatToIntBits(getDoahhiclmlj())
        != java.lang.Float.floatToIntBits(
            other.getDoahhiclmlj())) return false;
    if (java.lang.Float.floatToIntBits(getGkoflbebikp())
        != java.lang.Float.floatToIntBits(
            other.getGkoflbebikp())) return false;
    if (java.lang.Float.floatToIntBits(getNgbmhggicpg())
        != java.lang.Float.floatToIntBits(
            other.getNgbmhggicpg())) return false;
    if (java.lang.Float.floatToIntBits(getCpfpcjdepbc())
        != java.lang.Float.floatToIntBits(
            other.getCpfpcjdepbc())) return false;
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
    hash = (37 * hash) + DOAHHICLMLJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDoahhiclmlj());
    hash = (37 * hash) + GKOFLBEBIKP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGkoflbebikp());
    hash = (37 * hash) + NGBMHGGICPG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNgbmhggicpg());
    hash = (37 * hash) + CPFPCJDEPBC_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCpfpcjdepbc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HEKGIKCKDIL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HEKGIKCKDIL prototype) {
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
   * ref: HEKGIKCKDIL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HEKGIKCKDIL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HEKGIKCKDIL)
      POGOProtos.Rpc.HEKGIKCKDILOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HEKGIKCKDIL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HEKGIKCKDIL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HEKGIKCKDIL.class, POGOProtos.Rpc.HEKGIKCKDIL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HEKGIKCKDIL.newBuilder()
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
      doahhiclmlj_ = 0F;

      gkoflbebikp_ = 0F;

      ngbmhggicpg_ = 0F;

      cpfpcjdepbc_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HEKGIKCKDIL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HEKGIKCKDIL getDefaultInstanceForType() {
      return POGOProtos.Rpc.HEKGIKCKDIL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HEKGIKCKDIL build() {
      POGOProtos.Rpc.HEKGIKCKDIL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HEKGIKCKDIL buildPartial() {
      POGOProtos.Rpc.HEKGIKCKDIL result = new POGOProtos.Rpc.HEKGIKCKDIL(this);
      result.doahhiclmlj_ = doahhiclmlj_;
      result.gkoflbebikp_ = gkoflbebikp_;
      result.ngbmhggicpg_ = ngbmhggicpg_;
      result.cpfpcjdepbc_ = cpfpcjdepbc_;
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
      if (other instanceof POGOProtos.Rpc.HEKGIKCKDIL) {
        return mergeFrom((POGOProtos.Rpc.HEKGIKCKDIL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HEKGIKCKDIL other) {
      if (other == POGOProtos.Rpc.HEKGIKCKDIL.getDefaultInstance()) return this;
      if (other.getDoahhiclmlj() != 0F) {
        setDoahhiclmlj(other.getDoahhiclmlj());
      }
      if (other.getGkoflbebikp() != 0F) {
        setGkoflbebikp(other.getGkoflbebikp());
      }
      if (other.getNgbmhggicpg() != 0F) {
        setNgbmhggicpg(other.getNgbmhggicpg());
      }
      if (other.getCpfpcjdepbc() != 0F) {
        setCpfpcjdepbc(other.getCpfpcjdepbc());
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
      POGOProtos.Rpc.HEKGIKCKDIL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HEKGIKCKDIL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float doahhiclmlj_ ;
    /**
     * <code>float doahhiclmlj = 1;</code>
     * @return The doahhiclmlj.
     */
    @java.lang.Override
    public float getDoahhiclmlj() {
      return doahhiclmlj_;
    }
    /**
     * <code>float doahhiclmlj = 1;</code>
     * @param value The doahhiclmlj to set.
     * @return This builder for chaining.
     */
    public Builder setDoahhiclmlj(float value) {
      
      doahhiclmlj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float doahhiclmlj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoahhiclmlj() {
      
      doahhiclmlj_ = 0F;
      onChanged();
      return this;
    }

    private float gkoflbebikp_ ;
    /**
     * <code>float gkoflbebikp = 2;</code>
     * @return The gkoflbebikp.
     */
    @java.lang.Override
    public float getGkoflbebikp() {
      return gkoflbebikp_;
    }
    /**
     * <code>float gkoflbebikp = 2;</code>
     * @param value The gkoflbebikp to set.
     * @return This builder for chaining.
     */
    public Builder setGkoflbebikp(float value) {
      
      gkoflbebikp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float gkoflbebikp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGkoflbebikp() {
      
      gkoflbebikp_ = 0F;
      onChanged();
      return this;
    }

    private float ngbmhggicpg_ ;
    /**
     * <code>float ngbmhggicpg = 3;</code>
     * @return The ngbmhggicpg.
     */
    @java.lang.Override
    public float getNgbmhggicpg() {
      return ngbmhggicpg_;
    }
    /**
     * <code>float ngbmhggicpg = 3;</code>
     * @param value The ngbmhggicpg to set.
     * @return This builder for chaining.
     */
    public Builder setNgbmhggicpg(float value) {
      
      ngbmhggicpg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ngbmhggicpg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNgbmhggicpg() {
      
      ngbmhggicpg_ = 0F;
      onChanged();
      return this;
    }

    private float cpfpcjdepbc_ ;
    /**
     * <code>float cpfpcjdepbc = 4;</code>
     * @return The cpfpcjdepbc.
     */
    @java.lang.Override
    public float getCpfpcjdepbc() {
      return cpfpcjdepbc_;
    }
    /**
     * <code>float cpfpcjdepbc = 4;</code>
     * @param value The cpfpcjdepbc to set.
     * @return This builder for chaining.
     */
    public Builder setCpfpcjdepbc(float value) {
      
      cpfpcjdepbc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cpfpcjdepbc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpfpcjdepbc() {
      
      cpfpcjdepbc_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HEKGIKCKDIL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HEKGIKCKDIL)
  private static final POGOProtos.Rpc.HEKGIKCKDIL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HEKGIKCKDIL();
  }

  public static POGOProtos.Rpc.HEKGIKCKDIL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HEKGIKCKDIL>
      PARSER = new com.google.protobuf.AbstractParser<HEKGIKCKDIL>() {
    @java.lang.Override
    public HEKGIKCKDIL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HEKGIKCKDIL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HEKGIKCKDIL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HEKGIKCKDIL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HEKGIKCKDIL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

