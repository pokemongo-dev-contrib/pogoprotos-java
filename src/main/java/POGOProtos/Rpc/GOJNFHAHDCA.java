// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GOJNFHAHDCA}
 */
public  final class GOJNFHAHDCA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GOJNFHAHDCA)
    GOJNFHAHDCAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GOJNFHAHDCA.newBuilder() to construct.
  private GOJNFHAHDCA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GOJNFHAHDCA() {
    kpfineofddn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GOJNFHAHDCA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GOJNFHAHDCA(
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

            kpfineofddn_ = s;
            break;
          }
          case 16: {

            glhgiafpnbh_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOJNFHAHDCA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOJNFHAHDCA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GOJNFHAHDCA.class, POGOProtos.Rpc.GOJNFHAHDCA.Builder.class);
  }

  public static final int KPFINEOFDDN_FIELD_NUMBER = 1;
  private volatile java.lang.Object kpfineofddn_;
  /**
   * <code>string kpfineofddn = 1;</code>
   * @return The kpfineofddn.
   */
  public java.lang.String getKpfineofddn() {
    java.lang.Object ref = kpfineofddn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kpfineofddn_ = s;
      return s;
    }
  }
  /**
   * <code>string kpfineofddn = 1;</code>
   * @return The bytes for kpfineofddn.
   */
  public com.google.protobuf.ByteString
      getKpfineofddnBytes() {
    java.lang.Object ref = kpfineofddn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kpfineofddn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GLHGIAFPNBH_FIELD_NUMBER = 2;
  private long glhgiafpnbh_;
  /**
   * <code>uint64 glhgiafpnbh = 2;</code>
   * @return The glhgiafpnbh.
   */
  public long getGlhgiafpnbh() {
    return glhgiafpnbh_;
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
    if (!getKpfineofddnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kpfineofddn_);
    }
    if (glhgiafpnbh_ != 0L) {
      output.writeUInt64(2, glhgiafpnbh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKpfineofddnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kpfineofddn_);
    }
    if (glhgiafpnbh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, glhgiafpnbh_);
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
    if (!(obj instanceof POGOProtos.Rpc.GOJNFHAHDCA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GOJNFHAHDCA other = (POGOProtos.Rpc.GOJNFHAHDCA) obj;

    if (!getKpfineofddn()
        .equals(other.getKpfineofddn())) return false;
    if (getGlhgiafpnbh()
        != other.getGlhgiafpnbh()) return false;
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
    hash = (37 * hash) + KPFINEOFDDN_FIELD_NUMBER;
    hash = (53 * hash) + getKpfineofddn().hashCode();
    hash = (37 * hash) + GLHGIAFPNBH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGlhgiafpnbh());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOJNFHAHDCA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GOJNFHAHDCA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GOJNFHAHDCA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GOJNFHAHDCA)
      POGOProtos.Rpc.GOJNFHAHDCAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOJNFHAHDCA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOJNFHAHDCA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GOJNFHAHDCA.class, POGOProtos.Rpc.GOJNFHAHDCA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GOJNFHAHDCA.newBuilder()
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
      kpfineofddn_ = "";

      glhgiafpnbh_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOJNFHAHDCA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOJNFHAHDCA getDefaultInstanceForType() {
      return POGOProtos.Rpc.GOJNFHAHDCA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOJNFHAHDCA build() {
      POGOProtos.Rpc.GOJNFHAHDCA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOJNFHAHDCA buildPartial() {
      POGOProtos.Rpc.GOJNFHAHDCA result = new POGOProtos.Rpc.GOJNFHAHDCA(this);
      result.kpfineofddn_ = kpfineofddn_;
      result.glhgiafpnbh_ = glhgiafpnbh_;
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
      if (other instanceof POGOProtos.Rpc.GOJNFHAHDCA) {
        return mergeFrom((POGOProtos.Rpc.GOJNFHAHDCA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GOJNFHAHDCA other) {
      if (other == POGOProtos.Rpc.GOJNFHAHDCA.getDefaultInstance()) return this;
      if (!other.getKpfineofddn().isEmpty()) {
        kpfineofddn_ = other.kpfineofddn_;
        onChanged();
      }
      if (other.getGlhgiafpnbh() != 0L) {
        setGlhgiafpnbh(other.getGlhgiafpnbh());
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
      POGOProtos.Rpc.GOJNFHAHDCA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GOJNFHAHDCA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kpfineofddn_ = "";
    /**
     * <code>string kpfineofddn = 1;</code>
     * @return The kpfineofddn.
     */
    public java.lang.String getKpfineofddn() {
      java.lang.Object ref = kpfineofddn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kpfineofddn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kpfineofddn = 1;</code>
     * @return The bytes for kpfineofddn.
     */
    public com.google.protobuf.ByteString
        getKpfineofddnBytes() {
      java.lang.Object ref = kpfineofddn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kpfineofddn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kpfineofddn = 1;</code>
     * @param value The kpfineofddn to set.
     * @return This builder for chaining.
     */
    public Builder setKpfineofddn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kpfineofddn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kpfineofddn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKpfineofddn() {
      
      kpfineofddn_ = getDefaultInstance().getKpfineofddn();
      onChanged();
      return this;
    }
    /**
     * <code>string kpfineofddn = 1;</code>
     * @param value The bytes for kpfineofddn to set.
     * @return This builder for chaining.
     */
    public Builder setKpfineofddnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kpfineofddn_ = value;
      onChanged();
      return this;
    }

    private long glhgiafpnbh_ ;
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @return The glhgiafpnbh.
     */
    public long getGlhgiafpnbh() {
      return glhgiafpnbh_;
    }
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @param value The glhgiafpnbh to set.
     * @return This builder for chaining.
     */
    public Builder setGlhgiafpnbh(long value) {
      
      glhgiafpnbh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlhgiafpnbh() {
      
      glhgiafpnbh_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GOJNFHAHDCA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GOJNFHAHDCA)
  private static final POGOProtos.Rpc.GOJNFHAHDCA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GOJNFHAHDCA();
  }

  public static POGOProtos.Rpc.GOJNFHAHDCA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GOJNFHAHDCA>
      PARSER = new com.google.protobuf.AbstractParser<GOJNFHAHDCA>() {
    @java.lang.Override
    public GOJNFHAHDCA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GOJNFHAHDCA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GOJNFHAHDCA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GOJNFHAHDCA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GOJNFHAHDCA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

