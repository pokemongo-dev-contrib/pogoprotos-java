// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NNLAOAEHMFP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NNLAOAEHMFP}
 */
public final class NNLAOAEHMFP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NNLAOAEHMFP)
    NNLAOAEHMFPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NNLAOAEHMFP.newBuilder() to construct.
  private NNLAOAEHMFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NNLAOAEHMFP() {
    kggnmnbceip_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NNLAOAEHMFP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NNLAOAEHMFP(
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

            kggnmnbceip_ = s;
            break;
          }
          case 16: {

            mlnbcfibmeg_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNLAOAEHMFP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNLAOAEHMFP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NNLAOAEHMFP.class, POGOProtos.Rpc.NNLAOAEHMFP.Builder.class);
  }

  public static final int KGGNMNBCEIP_FIELD_NUMBER = 1;
  private volatile java.lang.Object kggnmnbceip_;
  /**
   * <code>string kggnmnbceip = 1;</code>
   * @return The kggnmnbceip.
   */
  @java.lang.Override
  public java.lang.String getKggnmnbceip() {
    java.lang.Object ref = kggnmnbceip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kggnmnbceip_ = s;
      return s;
    }
  }
  /**
   * <code>string kggnmnbceip = 1;</code>
   * @return The bytes for kggnmnbceip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKggnmnbceipBytes() {
    java.lang.Object ref = kggnmnbceip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kggnmnbceip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MLNBCFIBMEG_FIELD_NUMBER = 2;
  private long mlnbcfibmeg_;
  /**
   * <code>int64 mlnbcfibmeg = 2;</code>
   * @return The mlnbcfibmeg.
   */
  @java.lang.Override
  public long getMlnbcfibmeg() {
    return mlnbcfibmeg_;
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
    if (!getKggnmnbceipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kggnmnbceip_);
    }
    if (mlnbcfibmeg_ != 0L) {
      output.writeInt64(2, mlnbcfibmeg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKggnmnbceipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kggnmnbceip_);
    }
    if (mlnbcfibmeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mlnbcfibmeg_);
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
    if (!(obj instanceof POGOProtos.Rpc.NNLAOAEHMFP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NNLAOAEHMFP other = (POGOProtos.Rpc.NNLAOAEHMFP) obj;

    if (!getKggnmnbceip()
        .equals(other.getKggnmnbceip())) return false;
    if (getMlnbcfibmeg()
        != other.getMlnbcfibmeg()) return false;
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
    hash = (37 * hash) + KGGNMNBCEIP_FIELD_NUMBER;
    hash = (53 * hash) + getKggnmnbceip().hashCode();
    hash = (37 * hash) + MLNBCFIBMEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMlnbcfibmeg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNLAOAEHMFP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NNLAOAEHMFP prototype) {
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
   * ref: NNLAOAEHMFP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NNLAOAEHMFP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NNLAOAEHMFP)
      POGOProtos.Rpc.NNLAOAEHMFPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNLAOAEHMFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNLAOAEHMFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NNLAOAEHMFP.class, POGOProtos.Rpc.NNLAOAEHMFP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NNLAOAEHMFP.newBuilder()
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
      kggnmnbceip_ = "";

      mlnbcfibmeg_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNLAOAEHMFP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNLAOAEHMFP getDefaultInstanceForType() {
      return POGOProtos.Rpc.NNLAOAEHMFP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNLAOAEHMFP build() {
      POGOProtos.Rpc.NNLAOAEHMFP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNLAOAEHMFP buildPartial() {
      POGOProtos.Rpc.NNLAOAEHMFP result = new POGOProtos.Rpc.NNLAOAEHMFP(this);
      result.kggnmnbceip_ = kggnmnbceip_;
      result.mlnbcfibmeg_ = mlnbcfibmeg_;
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
      if (other instanceof POGOProtos.Rpc.NNLAOAEHMFP) {
        return mergeFrom((POGOProtos.Rpc.NNLAOAEHMFP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NNLAOAEHMFP other) {
      if (other == POGOProtos.Rpc.NNLAOAEHMFP.getDefaultInstance()) return this;
      if (!other.getKggnmnbceip().isEmpty()) {
        kggnmnbceip_ = other.kggnmnbceip_;
        onChanged();
      }
      if (other.getMlnbcfibmeg() != 0L) {
        setMlnbcfibmeg(other.getMlnbcfibmeg());
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
      POGOProtos.Rpc.NNLAOAEHMFP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NNLAOAEHMFP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kggnmnbceip_ = "";
    /**
     * <code>string kggnmnbceip = 1;</code>
     * @return The kggnmnbceip.
     */
    public java.lang.String getKggnmnbceip() {
      java.lang.Object ref = kggnmnbceip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kggnmnbceip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kggnmnbceip = 1;</code>
     * @return The bytes for kggnmnbceip.
     */
    public com.google.protobuf.ByteString
        getKggnmnbceipBytes() {
      java.lang.Object ref = kggnmnbceip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kggnmnbceip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kggnmnbceip = 1;</code>
     * @param value The kggnmnbceip to set.
     * @return This builder for chaining.
     */
    public Builder setKggnmnbceip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kggnmnbceip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kggnmnbceip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKggnmnbceip() {
      
      kggnmnbceip_ = getDefaultInstance().getKggnmnbceip();
      onChanged();
      return this;
    }
    /**
     * <code>string kggnmnbceip = 1;</code>
     * @param value The bytes for kggnmnbceip to set.
     * @return This builder for chaining.
     */
    public Builder setKggnmnbceipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kggnmnbceip_ = value;
      onChanged();
      return this;
    }

    private long mlnbcfibmeg_ ;
    /**
     * <code>int64 mlnbcfibmeg = 2;</code>
     * @return The mlnbcfibmeg.
     */
    @java.lang.Override
    public long getMlnbcfibmeg() {
      return mlnbcfibmeg_;
    }
    /**
     * <code>int64 mlnbcfibmeg = 2;</code>
     * @param value The mlnbcfibmeg to set.
     * @return This builder for chaining.
     */
    public Builder setMlnbcfibmeg(long value) {
      
      mlnbcfibmeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mlnbcfibmeg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlnbcfibmeg() {
      
      mlnbcfibmeg_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NNLAOAEHMFP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NNLAOAEHMFP)
  private static final POGOProtos.Rpc.NNLAOAEHMFP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NNLAOAEHMFP();
  }

  public static POGOProtos.Rpc.NNLAOAEHMFP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NNLAOAEHMFP>
      PARSER = new com.google.protobuf.AbstractParser<NNLAOAEHMFP>() {
    @java.lang.Override
    public NNLAOAEHMFP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NNLAOAEHMFP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NNLAOAEHMFP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NNLAOAEHMFP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NNLAOAEHMFP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

