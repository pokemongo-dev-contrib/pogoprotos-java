// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LBKBNFJLFHD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LBKBNFJLFHD}
 */
public final class LBKBNFJLFHD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LBKBNFJLFHD)
    LBKBNFJLFHDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LBKBNFJLFHD.newBuilder() to construct.
  private LBKBNFJLFHD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LBKBNFJLFHD() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LBKBNFJLFHD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LBKBNFJLFHD(
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

            hldeabflgak_ = input.readInt32();
            break;
          }
          case 16: {

            hkfgobdnckj_ = input.readInt32();
            break;
          }
          case 24: {

            gcpagpckknj_ = input.readBool();
            break;
          }
          case 34: {
            POGOProtos.Rpc.BEPKGCKIHAB.Builder subBuilder = null;
            if (gjeainofkac_ != null) {
              subBuilder = gjeainofkac_.toBuilder();
            }
            gjeainofkac_ = input.readMessage(POGOProtos.Rpc.BEPKGCKIHAB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gjeainofkac_);
              gjeainofkac_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBKBNFJLFHD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBKBNFJLFHD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LBKBNFJLFHD.class, POGOProtos.Rpc.LBKBNFJLFHD.Builder.class);
  }

  public static final int HLDEABFLGAK_FIELD_NUMBER = 1;
  private int hldeabflgak_;
  /**
   * <code>int32 hldeabflgak = 1;</code>
   * @return The hldeabflgak.
   */
  @java.lang.Override
  public int getHldeabflgak() {
    return hldeabflgak_;
  }

  public static final int HKFGOBDNCKJ_FIELD_NUMBER = 2;
  private int hkfgobdnckj_;
  /**
   * <code>int32 hkfgobdnckj = 2;</code>
   * @return The hkfgobdnckj.
   */
  @java.lang.Override
  public int getHkfgobdnckj() {
    return hkfgobdnckj_;
  }

  public static final int GCPAGPCKKNJ_FIELD_NUMBER = 3;
  private boolean gcpagpckknj_;
  /**
   * <code>bool gcpagpckknj = 3;</code>
   * @return The gcpagpckknj.
   */
  @java.lang.Override
  public boolean getGcpagpckknj() {
    return gcpagpckknj_;
  }

  public static final int GJEAINOFKAC_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac_;
  /**
   * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
   * @return Whether the gjeainofkac field is set.
   */
  @java.lang.Override
  public boolean hasGjeainofkac() {
    return gjeainofkac_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
   * @return The gjeainofkac.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BEPKGCKIHAB getGjeainofkac() {
    return gjeainofkac_ == null ? POGOProtos.Rpc.BEPKGCKIHAB.getDefaultInstance() : gjeainofkac_;
  }
  /**
   * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BEPKGCKIHABOrBuilder getGjeainofkacOrBuilder() {
    return getGjeainofkac();
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
    if (hldeabflgak_ != 0) {
      output.writeInt32(1, hldeabflgak_);
    }
    if (hkfgobdnckj_ != 0) {
      output.writeInt32(2, hkfgobdnckj_);
    }
    if (gcpagpckknj_ != false) {
      output.writeBool(3, gcpagpckknj_);
    }
    if (gjeainofkac_ != null) {
      output.writeMessage(4, getGjeainofkac());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hldeabflgak_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, hldeabflgak_);
    }
    if (hkfgobdnckj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hkfgobdnckj_);
    }
    if (gcpagpckknj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, gcpagpckknj_);
    }
    if (gjeainofkac_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getGjeainofkac());
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
    if (!(obj instanceof POGOProtos.Rpc.LBKBNFJLFHD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LBKBNFJLFHD other = (POGOProtos.Rpc.LBKBNFJLFHD) obj;

    if (getHldeabflgak()
        != other.getHldeabflgak()) return false;
    if (getHkfgobdnckj()
        != other.getHkfgobdnckj()) return false;
    if (getGcpagpckknj()
        != other.getGcpagpckknj()) return false;
    if (hasGjeainofkac() != other.hasGjeainofkac()) return false;
    if (hasGjeainofkac()) {
      if (!getGjeainofkac()
          .equals(other.getGjeainofkac())) return false;
    }
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
    hash = (37 * hash) + HLDEABFLGAK_FIELD_NUMBER;
    hash = (53 * hash) + getHldeabflgak();
    hash = (37 * hash) + HKFGOBDNCKJ_FIELD_NUMBER;
    hash = (53 * hash) + getHkfgobdnckj();
    hash = (37 * hash) + GCPAGPCKKNJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGcpagpckknj());
    if (hasGjeainofkac()) {
      hash = (37 * hash) + GJEAINOFKAC_FIELD_NUMBER;
      hash = (53 * hash) + getGjeainofkac().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBKBNFJLFHD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LBKBNFJLFHD prototype) {
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
   * ref: LBKBNFJLFHD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LBKBNFJLFHD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LBKBNFJLFHD)
      POGOProtos.Rpc.LBKBNFJLFHDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBKBNFJLFHD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBKBNFJLFHD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LBKBNFJLFHD.class, POGOProtos.Rpc.LBKBNFJLFHD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LBKBNFJLFHD.newBuilder()
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
      hldeabflgak_ = 0;

      hkfgobdnckj_ = 0;

      gcpagpckknj_ = false;

      if (gjeainofkacBuilder_ == null) {
        gjeainofkac_ = null;
      } else {
        gjeainofkac_ = null;
        gjeainofkacBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBKBNFJLFHD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBKBNFJLFHD getDefaultInstanceForType() {
      return POGOProtos.Rpc.LBKBNFJLFHD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBKBNFJLFHD build() {
      POGOProtos.Rpc.LBKBNFJLFHD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBKBNFJLFHD buildPartial() {
      POGOProtos.Rpc.LBKBNFJLFHD result = new POGOProtos.Rpc.LBKBNFJLFHD(this);
      result.hldeabflgak_ = hldeabflgak_;
      result.hkfgobdnckj_ = hkfgobdnckj_;
      result.gcpagpckknj_ = gcpagpckknj_;
      if (gjeainofkacBuilder_ == null) {
        result.gjeainofkac_ = gjeainofkac_;
      } else {
        result.gjeainofkac_ = gjeainofkacBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.LBKBNFJLFHD) {
        return mergeFrom((POGOProtos.Rpc.LBKBNFJLFHD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LBKBNFJLFHD other) {
      if (other == POGOProtos.Rpc.LBKBNFJLFHD.getDefaultInstance()) return this;
      if (other.getHldeabflgak() != 0) {
        setHldeabflgak(other.getHldeabflgak());
      }
      if (other.getHkfgobdnckj() != 0) {
        setHkfgobdnckj(other.getHkfgobdnckj());
      }
      if (other.getGcpagpckknj() != false) {
        setGcpagpckknj(other.getGcpagpckknj());
      }
      if (other.hasGjeainofkac()) {
        mergeGjeainofkac(other.getGjeainofkac());
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
      POGOProtos.Rpc.LBKBNFJLFHD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LBKBNFJLFHD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hldeabflgak_ ;
    /**
     * <code>int32 hldeabflgak = 1;</code>
     * @return The hldeabflgak.
     */
    @java.lang.Override
    public int getHldeabflgak() {
      return hldeabflgak_;
    }
    /**
     * <code>int32 hldeabflgak = 1;</code>
     * @param value The hldeabflgak to set.
     * @return This builder for chaining.
     */
    public Builder setHldeabflgak(int value) {
      
      hldeabflgak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hldeabflgak = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHldeabflgak() {
      
      hldeabflgak_ = 0;
      onChanged();
      return this;
    }

    private int hkfgobdnckj_ ;
    /**
     * <code>int32 hkfgobdnckj = 2;</code>
     * @return The hkfgobdnckj.
     */
    @java.lang.Override
    public int getHkfgobdnckj() {
      return hkfgobdnckj_;
    }
    /**
     * <code>int32 hkfgobdnckj = 2;</code>
     * @param value The hkfgobdnckj to set.
     * @return This builder for chaining.
     */
    public Builder setHkfgobdnckj(int value) {
      
      hkfgobdnckj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hkfgobdnckj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHkfgobdnckj() {
      
      hkfgobdnckj_ = 0;
      onChanged();
      return this;
    }

    private boolean gcpagpckknj_ ;
    /**
     * <code>bool gcpagpckknj = 3;</code>
     * @return The gcpagpckknj.
     */
    @java.lang.Override
    public boolean getGcpagpckknj() {
      return gcpagpckknj_;
    }
    /**
     * <code>bool gcpagpckknj = 3;</code>
     * @param value The gcpagpckknj to set.
     * @return This builder for chaining.
     */
    public Builder setGcpagpckknj(boolean value) {
      
      gcpagpckknj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool gcpagpckknj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcpagpckknj() {
      
      gcpagpckknj_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BEPKGCKIHAB, POGOProtos.Rpc.BEPKGCKIHAB.Builder, POGOProtos.Rpc.BEPKGCKIHABOrBuilder> gjeainofkacBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     * @return Whether the gjeainofkac field is set.
     */
    public boolean hasGjeainofkac() {
      return gjeainofkacBuilder_ != null || gjeainofkac_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     * @return The gjeainofkac.
     */
    public POGOProtos.Rpc.BEPKGCKIHAB getGjeainofkac() {
      if (gjeainofkacBuilder_ == null) {
        return gjeainofkac_ == null ? POGOProtos.Rpc.BEPKGCKIHAB.getDefaultInstance() : gjeainofkac_;
      } else {
        return gjeainofkacBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public Builder setGjeainofkac(POGOProtos.Rpc.BEPKGCKIHAB value) {
      if (gjeainofkacBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gjeainofkac_ = value;
        onChanged();
      } else {
        gjeainofkacBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public Builder setGjeainofkac(
        POGOProtos.Rpc.BEPKGCKIHAB.Builder builderForValue) {
      if (gjeainofkacBuilder_ == null) {
        gjeainofkac_ = builderForValue.build();
        onChanged();
      } else {
        gjeainofkacBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public Builder mergeGjeainofkac(POGOProtos.Rpc.BEPKGCKIHAB value) {
      if (gjeainofkacBuilder_ == null) {
        if (gjeainofkac_ != null) {
          gjeainofkac_ =
            POGOProtos.Rpc.BEPKGCKIHAB.newBuilder(gjeainofkac_).mergeFrom(value).buildPartial();
        } else {
          gjeainofkac_ = value;
        }
        onChanged();
      } else {
        gjeainofkacBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public Builder clearGjeainofkac() {
      if (gjeainofkacBuilder_ == null) {
        gjeainofkac_ = null;
        onChanged();
      } else {
        gjeainofkac_ = null;
        gjeainofkacBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public POGOProtos.Rpc.BEPKGCKIHAB.Builder getGjeainofkacBuilder() {
      
      onChanged();
      return getGjeainofkacFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    public POGOProtos.Rpc.BEPKGCKIHABOrBuilder getGjeainofkacOrBuilder() {
      if (gjeainofkacBuilder_ != null) {
        return gjeainofkacBuilder_.getMessageOrBuilder();
      } else {
        return gjeainofkac_ == null ?
            POGOProtos.Rpc.BEPKGCKIHAB.getDefaultInstance() : gjeainofkac_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BEPKGCKIHAB gjeainofkac = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BEPKGCKIHAB, POGOProtos.Rpc.BEPKGCKIHAB.Builder, POGOProtos.Rpc.BEPKGCKIHABOrBuilder> 
        getGjeainofkacFieldBuilder() {
      if (gjeainofkacBuilder_ == null) {
        gjeainofkacBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BEPKGCKIHAB, POGOProtos.Rpc.BEPKGCKIHAB.Builder, POGOProtos.Rpc.BEPKGCKIHABOrBuilder>(
                getGjeainofkac(),
                getParentForChildren(),
                isClean());
        gjeainofkac_ = null;
      }
      return gjeainofkacBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LBKBNFJLFHD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LBKBNFJLFHD)
  private static final POGOProtos.Rpc.LBKBNFJLFHD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LBKBNFJLFHD();
  }

  public static POGOProtos.Rpc.LBKBNFJLFHD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LBKBNFJLFHD>
      PARSER = new com.google.protobuf.AbstractParser<LBKBNFJLFHD>() {
    @java.lang.Override
    public LBKBNFJLFHD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LBKBNFJLFHD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LBKBNFJLFHD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LBKBNFJLFHD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LBKBNFJLFHD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

