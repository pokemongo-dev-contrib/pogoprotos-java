// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MJAOOBOPLHG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MJAOOBOPLHG}
 */
public final class MJAOOBOPLHG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MJAOOBOPLHG)
    MJAOOBOPLHGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MJAOOBOPLHG.newBuilder() to construct.
  private MJAOOBOPLHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MJAOOBOPLHG() {
    memlelfabih_ = "";
    lgaeoelhbdl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MJAOOBOPLHG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MJAOOBOPLHG(
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

            memlelfabih_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lgaeoelhbdl_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MJAOOBOPLHG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MJAOOBOPLHG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MJAOOBOPLHG.class, POGOProtos.Rpc.MJAOOBOPLHG.Builder.class);
  }

  public static final int MEMLELFABIH_FIELD_NUMBER = 1;
  private volatile java.lang.Object memlelfabih_;
  /**
   * <code>string memlelfabih = 1;</code>
   * @return The memlelfabih.
   */
  @java.lang.Override
  public java.lang.String getMemlelfabih() {
    java.lang.Object ref = memlelfabih_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      memlelfabih_ = s;
      return s;
    }
  }
  /**
   * <code>string memlelfabih = 1;</code>
   * @return The bytes for memlelfabih.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemlelfabihBytes() {
    java.lang.Object ref = memlelfabih_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      memlelfabih_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LGAEOELHBDL_FIELD_NUMBER = 2;
  private volatile java.lang.Object lgaeoelhbdl_;
  /**
   * <code>string lgaeoelhbdl = 2;</code>
   * @return The lgaeoelhbdl.
   */
  @java.lang.Override
  public java.lang.String getLgaeoelhbdl() {
    java.lang.Object ref = lgaeoelhbdl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lgaeoelhbdl_ = s;
      return s;
    }
  }
  /**
   * <code>string lgaeoelhbdl = 2;</code>
   * @return The bytes for lgaeoelhbdl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLgaeoelhbdlBytes() {
    java.lang.Object ref = lgaeoelhbdl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lgaeoelhbdl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMemlelfabihBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, memlelfabih_);
    }
    if (!getLgaeoelhbdlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lgaeoelhbdl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMemlelfabihBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, memlelfabih_);
    }
    if (!getLgaeoelhbdlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lgaeoelhbdl_);
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
    if (!(obj instanceof POGOProtos.Rpc.MJAOOBOPLHG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MJAOOBOPLHG other = (POGOProtos.Rpc.MJAOOBOPLHG) obj;

    if (!getMemlelfabih()
        .equals(other.getMemlelfabih())) return false;
    if (!getLgaeoelhbdl()
        .equals(other.getLgaeoelhbdl())) return false;
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
    hash = (37 * hash) + MEMLELFABIH_FIELD_NUMBER;
    hash = (53 * hash) + getMemlelfabih().hashCode();
    hash = (37 * hash) + LGAEOELHBDL_FIELD_NUMBER;
    hash = (53 * hash) + getLgaeoelhbdl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MJAOOBOPLHG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MJAOOBOPLHG prototype) {
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
   * ref: MJAOOBOPLHG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MJAOOBOPLHG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MJAOOBOPLHG)
      POGOProtos.Rpc.MJAOOBOPLHGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MJAOOBOPLHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MJAOOBOPLHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MJAOOBOPLHG.class, POGOProtos.Rpc.MJAOOBOPLHG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MJAOOBOPLHG.newBuilder()
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
      memlelfabih_ = "";

      lgaeoelhbdl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MJAOOBOPLHG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MJAOOBOPLHG getDefaultInstanceForType() {
      return POGOProtos.Rpc.MJAOOBOPLHG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MJAOOBOPLHG build() {
      POGOProtos.Rpc.MJAOOBOPLHG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MJAOOBOPLHG buildPartial() {
      POGOProtos.Rpc.MJAOOBOPLHG result = new POGOProtos.Rpc.MJAOOBOPLHG(this);
      result.memlelfabih_ = memlelfabih_;
      result.lgaeoelhbdl_ = lgaeoelhbdl_;
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
      if (other instanceof POGOProtos.Rpc.MJAOOBOPLHG) {
        return mergeFrom((POGOProtos.Rpc.MJAOOBOPLHG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MJAOOBOPLHG other) {
      if (other == POGOProtos.Rpc.MJAOOBOPLHG.getDefaultInstance()) return this;
      if (!other.getMemlelfabih().isEmpty()) {
        memlelfabih_ = other.memlelfabih_;
        onChanged();
      }
      if (!other.getLgaeoelhbdl().isEmpty()) {
        lgaeoelhbdl_ = other.lgaeoelhbdl_;
        onChanged();
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
      POGOProtos.Rpc.MJAOOBOPLHG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MJAOOBOPLHG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object memlelfabih_ = "";
    /**
     * <code>string memlelfabih = 1;</code>
     * @return The memlelfabih.
     */
    public java.lang.String getMemlelfabih() {
      java.lang.Object ref = memlelfabih_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        memlelfabih_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string memlelfabih = 1;</code>
     * @return The bytes for memlelfabih.
     */
    public com.google.protobuf.ByteString
        getMemlelfabihBytes() {
      java.lang.Object ref = memlelfabih_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        memlelfabih_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string memlelfabih = 1;</code>
     * @param value The memlelfabih to set.
     * @return This builder for chaining.
     */
    public Builder setMemlelfabih(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      memlelfabih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string memlelfabih = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemlelfabih() {
      
      memlelfabih_ = getDefaultInstance().getMemlelfabih();
      onChanged();
      return this;
    }
    /**
     * <code>string memlelfabih = 1;</code>
     * @param value The bytes for memlelfabih to set.
     * @return This builder for chaining.
     */
    public Builder setMemlelfabihBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      memlelfabih_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lgaeoelhbdl_ = "";
    /**
     * <code>string lgaeoelhbdl = 2;</code>
     * @return The lgaeoelhbdl.
     */
    public java.lang.String getLgaeoelhbdl() {
      java.lang.Object ref = lgaeoelhbdl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lgaeoelhbdl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lgaeoelhbdl = 2;</code>
     * @return The bytes for lgaeoelhbdl.
     */
    public com.google.protobuf.ByteString
        getLgaeoelhbdlBytes() {
      java.lang.Object ref = lgaeoelhbdl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lgaeoelhbdl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lgaeoelhbdl = 2;</code>
     * @param value The lgaeoelhbdl to set.
     * @return This builder for chaining.
     */
    public Builder setLgaeoelhbdl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lgaeoelhbdl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lgaeoelhbdl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLgaeoelhbdl() {
      
      lgaeoelhbdl_ = getDefaultInstance().getLgaeoelhbdl();
      onChanged();
      return this;
    }
    /**
     * <code>string lgaeoelhbdl = 2;</code>
     * @param value The bytes for lgaeoelhbdl to set.
     * @return This builder for chaining.
     */
    public Builder setLgaeoelhbdlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lgaeoelhbdl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MJAOOBOPLHG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MJAOOBOPLHG)
  private static final POGOProtos.Rpc.MJAOOBOPLHG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MJAOOBOPLHG();
  }

  public static POGOProtos.Rpc.MJAOOBOPLHG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MJAOOBOPLHG>
      PARSER = new com.google.protobuf.AbstractParser<MJAOOBOPLHG>() {
    @java.lang.Override
    public MJAOOBOPLHG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MJAOOBOPLHG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MJAOOBOPLHG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MJAOOBOPLHG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MJAOOBOPLHG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

