// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HJEMPCFCEPP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HJEMPCFCEPP}
 */
public final class HJEMPCFCEPP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HJEMPCFCEPP)
    HJEMPCFCEPPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HJEMPCFCEPP.newBuilder() to construct.
  private HJEMPCFCEPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HJEMPCFCEPP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HJEMPCFCEPP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HJEMPCFCEPP(
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

            oheefjdhnjl_ = input.readInt64();
            break;
          }
          case 21: {

            gphpemjmgfj_ = input.readFloat();
            break;
          }
          case 29: {

            hmlphiolkgf_ = input.readFloat();
            break;
          }
          case 32: {

            hjcnfhfciig_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJEMPCFCEPP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJEMPCFCEPP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HJEMPCFCEPP.class, POGOProtos.Rpc.HJEMPCFCEPP.Builder.class);
  }

  public static final int OHEEFJDHNJL_FIELD_NUMBER = 1;
  private long oheefjdhnjl_;
  /**
   * <code>int64 oheefjdhnjl = 1;</code>
   * @return The oheefjdhnjl.
   */
  @java.lang.Override
  public long getOheefjdhnjl() {
    return oheefjdhnjl_;
  }

  public static final int GPHPEMJMGFJ_FIELD_NUMBER = 2;
  private float gphpemjmgfj_;
  /**
   * <code>float gphpemjmgfj = 2;</code>
   * @return The gphpemjmgfj.
   */
  @java.lang.Override
  public float getGphpemjmgfj() {
    return gphpemjmgfj_;
  }

  public static final int HMLPHIOLKGF_FIELD_NUMBER = 3;
  private float hmlphiolkgf_;
  /**
   * <code>float hmlphiolkgf = 3;</code>
   * @return The hmlphiolkgf.
   */
  @java.lang.Override
  public float getHmlphiolkgf() {
    return hmlphiolkgf_;
  }

  public static final int HJCNFHFCIIG_FIELD_NUMBER = 4;
  private int hjcnfhfciig_;
  /**
   * <code>int32 hjcnfhfciig = 4;</code>
   * @return The hjcnfhfciig.
   */
  @java.lang.Override
  public int getHjcnfhfciig() {
    return hjcnfhfciig_;
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
    if (oheefjdhnjl_ != 0L) {
      output.writeInt64(1, oheefjdhnjl_);
    }
    if (gphpemjmgfj_ != 0F) {
      output.writeFloat(2, gphpemjmgfj_);
    }
    if (hmlphiolkgf_ != 0F) {
      output.writeFloat(3, hmlphiolkgf_);
    }
    if (hjcnfhfciig_ != 0) {
      output.writeInt32(4, hjcnfhfciig_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oheefjdhnjl_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, oheefjdhnjl_);
    }
    if (gphpemjmgfj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, gphpemjmgfj_);
    }
    if (hmlphiolkgf_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, hmlphiolkgf_);
    }
    if (hjcnfhfciig_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, hjcnfhfciig_);
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
    if (!(obj instanceof POGOProtos.Rpc.HJEMPCFCEPP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HJEMPCFCEPP other = (POGOProtos.Rpc.HJEMPCFCEPP) obj;

    if (getOheefjdhnjl()
        != other.getOheefjdhnjl()) return false;
    if (java.lang.Float.floatToIntBits(getGphpemjmgfj())
        != java.lang.Float.floatToIntBits(
            other.getGphpemjmgfj())) return false;
    if (java.lang.Float.floatToIntBits(getHmlphiolkgf())
        != java.lang.Float.floatToIntBits(
            other.getHmlphiolkgf())) return false;
    if (getHjcnfhfciig()
        != other.getHjcnfhfciig()) return false;
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
    hash = (37 * hash) + OHEEFJDHNJL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOheefjdhnjl());
    hash = (37 * hash) + GPHPEMJMGFJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGphpemjmgfj());
    hash = (37 * hash) + HMLPHIOLKGF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHmlphiolkgf());
    hash = (37 * hash) + HJCNFHFCIIG_FIELD_NUMBER;
    hash = (53 * hash) + getHjcnfhfciig();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJEMPCFCEPP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HJEMPCFCEPP prototype) {
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
   * ref: HJEMPCFCEPP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HJEMPCFCEPP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HJEMPCFCEPP)
      POGOProtos.Rpc.HJEMPCFCEPPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJEMPCFCEPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJEMPCFCEPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HJEMPCFCEPP.class, POGOProtos.Rpc.HJEMPCFCEPP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HJEMPCFCEPP.newBuilder()
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
      oheefjdhnjl_ = 0L;

      gphpemjmgfj_ = 0F;

      hmlphiolkgf_ = 0F;

      hjcnfhfciig_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJEMPCFCEPP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJEMPCFCEPP getDefaultInstanceForType() {
      return POGOProtos.Rpc.HJEMPCFCEPP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJEMPCFCEPP build() {
      POGOProtos.Rpc.HJEMPCFCEPP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJEMPCFCEPP buildPartial() {
      POGOProtos.Rpc.HJEMPCFCEPP result = new POGOProtos.Rpc.HJEMPCFCEPP(this);
      result.oheefjdhnjl_ = oheefjdhnjl_;
      result.gphpemjmgfj_ = gphpemjmgfj_;
      result.hmlphiolkgf_ = hmlphiolkgf_;
      result.hjcnfhfciig_ = hjcnfhfciig_;
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
      if (other instanceof POGOProtos.Rpc.HJEMPCFCEPP) {
        return mergeFrom((POGOProtos.Rpc.HJEMPCFCEPP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HJEMPCFCEPP other) {
      if (other == POGOProtos.Rpc.HJEMPCFCEPP.getDefaultInstance()) return this;
      if (other.getOheefjdhnjl() != 0L) {
        setOheefjdhnjl(other.getOheefjdhnjl());
      }
      if (other.getGphpemjmgfj() != 0F) {
        setGphpemjmgfj(other.getGphpemjmgfj());
      }
      if (other.getHmlphiolkgf() != 0F) {
        setHmlphiolkgf(other.getHmlphiolkgf());
      }
      if (other.getHjcnfhfciig() != 0) {
        setHjcnfhfciig(other.getHjcnfhfciig());
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
      POGOProtos.Rpc.HJEMPCFCEPP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HJEMPCFCEPP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long oheefjdhnjl_ ;
    /**
     * <code>int64 oheefjdhnjl = 1;</code>
     * @return The oheefjdhnjl.
     */
    @java.lang.Override
    public long getOheefjdhnjl() {
      return oheefjdhnjl_;
    }
    /**
     * <code>int64 oheefjdhnjl = 1;</code>
     * @param value The oheefjdhnjl to set.
     * @return This builder for chaining.
     */
    public Builder setOheefjdhnjl(long value) {
      
      oheefjdhnjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 oheefjdhnjl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOheefjdhnjl() {
      
      oheefjdhnjl_ = 0L;
      onChanged();
      return this;
    }

    private float gphpemjmgfj_ ;
    /**
     * <code>float gphpemjmgfj = 2;</code>
     * @return The gphpemjmgfj.
     */
    @java.lang.Override
    public float getGphpemjmgfj() {
      return gphpemjmgfj_;
    }
    /**
     * <code>float gphpemjmgfj = 2;</code>
     * @param value The gphpemjmgfj to set.
     * @return This builder for chaining.
     */
    public Builder setGphpemjmgfj(float value) {
      
      gphpemjmgfj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float gphpemjmgfj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGphpemjmgfj() {
      
      gphpemjmgfj_ = 0F;
      onChanged();
      return this;
    }

    private float hmlphiolkgf_ ;
    /**
     * <code>float hmlphiolkgf = 3;</code>
     * @return The hmlphiolkgf.
     */
    @java.lang.Override
    public float getHmlphiolkgf() {
      return hmlphiolkgf_;
    }
    /**
     * <code>float hmlphiolkgf = 3;</code>
     * @param value The hmlphiolkgf to set.
     * @return This builder for chaining.
     */
    public Builder setHmlphiolkgf(float value) {
      
      hmlphiolkgf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float hmlphiolkgf = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHmlphiolkgf() {
      
      hmlphiolkgf_ = 0F;
      onChanged();
      return this;
    }

    private int hjcnfhfciig_ ;
    /**
     * <code>int32 hjcnfhfciig = 4;</code>
     * @return The hjcnfhfciig.
     */
    @java.lang.Override
    public int getHjcnfhfciig() {
      return hjcnfhfciig_;
    }
    /**
     * <code>int32 hjcnfhfciig = 4;</code>
     * @param value The hjcnfhfciig to set.
     * @return This builder for chaining.
     */
    public Builder setHjcnfhfciig(int value) {
      
      hjcnfhfciig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hjcnfhfciig = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjcnfhfciig() {
      
      hjcnfhfciig_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HJEMPCFCEPP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HJEMPCFCEPP)
  private static final POGOProtos.Rpc.HJEMPCFCEPP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HJEMPCFCEPP();
  }

  public static POGOProtos.Rpc.HJEMPCFCEPP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HJEMPCFCEPP>
      PARSER = new com.google.protobuf.AbstractParser<HJEMPCFCEPP>() {
    @java.lang.Override
    public HJEMPCFCEPP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HJEMPCFCEPP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HJEMPCFCEPP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HJEMPCFCEPP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HJEMPCFCEPP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

