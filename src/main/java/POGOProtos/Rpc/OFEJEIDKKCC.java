// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OFEJEIDKKCC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OFEJEIDKKCC}
 */
public final class OFEJEIDKKCC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OFEJEIDKKCC)
    OFEJEIDKKCCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OFEJEIDKKCC.newBuilder() to construct.
  private OFEJEIDKKCC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OFEJEIDKKCC() {
    enlljhnggpn_ = "";
    glankgjddic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OFEJEIDKKCC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OFEJEIDKKCC(
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

            enlljhnggpn_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            glankgjddic_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFEJEIDKKCC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFEJEIDKKCC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OFEJEIDKKCC.class, POGOProtos.Rpc.OFEJEIDKKCC.Builder.class);
  }

  public static final int ENLLJHNGGPN_FIELD_NUMBER = 1;
  private volatile java.lang.Object enlljhnggpn_;
  /**
   * <code>string enlljhnggpn = 1;</code>
   * @return The enlljhnggpn.
   */
  @java.lang.Override
  public java.lang.String getEnlljhnggpn() {
    java.lang.Object ref = enlljhnggpn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enlljhnggpn_ = s;
      return s;
    }
  }
  /**
   * <code>string enlljhnggpn = 1;</code>
   * @return The bytes for enlljhnggpn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEnlljhnggpnBytes() {
    java.lang.Object ref = enlljhnggpn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      enlljhnggpn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GLANKGJDDIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object glankgjddic_;
  /**
   * <code>string glankgjddic = 2;</code>
   * @return The glankgjddic.
   */
  @java.lang.Override
  public java.lang.String getGlankgjddic() {
    java.lang.Object ref = glankgjddic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      glankgjddic_ = s;
      return s;
    }
  }
  /**
   * <code>string glankgjddic = 2;</code>
   * @return The bytes for glankgjddic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGlankgjddicBytes() {
    java.lang.Object ref = glankgjddic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      glankgjddic_ = b;
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
    if (!getEnlljhnggpnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enlljhnggpn_);
    }
    if (!getGlankgjddicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, glankgjddic_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEnlljhnggpnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, enlljhnggpn_);
    }
    if (!getGlankgjddicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, glankgjddic_);
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
    if (!(obj instanceof POGOProtos.Rpc.OFEJEIDKKCC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OFEJEIDKKCC other = (POGOProtos.Rpc.OFEJEIDKKCC) obj;

    if (!getEnlljhnggpn()
        .equals(other.getEnlljhnggpn())) return false;
    if (!getGlankgjddic()
        .equals(other.getGlankgjddic())) return false;
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
    hash = (37 * hash) + ENLLJHNGGPN_FIELD_NUMBER;
    hash = (53 * hash) + getEnlljhnggpn().hashCode();
    hash = (37 * hash) + GLANKGJDDIC_FIELD_NUMBER;
    hash = (53 * hash) + getGlankgjddic().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFEJEIDKKCC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OFEJEIDKKCC prototype) {
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
   * ref: OFEJEIDKKCC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OFEJEIDKKCC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OFEJEIDKKCC)
      POGOProtos.Rpc.OFEJEIDKKCCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFEJEIDKKCC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFEJEIDKKCC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OFEJEIDKKCC.class, POGOProtos.Rpc.OFEJEIDKKCC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OFEJEIDKKCC.newBuilder()
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
      enlljhnggpn_ = "";

      glankgjddic_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFEJEIDKKCC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFEJEIDKKCC getDefaultInstanceForType() {
      return POGOProtos.Rpc.OFEJEIDKKCC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFEJEIDKKCC build() {
      POGOProtos.Rpc.OFEJEIDKKCC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFEJEIDKKCC buildPartial() {
      POGOProtos.Rpc.OFEJEIDKKCC result = new POGOProtos.Rpc.OFEJEIDKKCC(this);
      result.enlljhnggpn_ = enlljhnggpn_;
      result.glankgjddic_ = glankgjddic_;
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
      if (other instanceof POGOProtos.Rpc.OFEJEIDKKCC) {
        return mergeFrom((POGOProtos.Rpc.OFEJEIDKKCC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OFEJEIDKKCC other) {
      if (other == POGOProtos.Rpc.OFEJEIDKKCC.getDefaultInstance()) return this;
      if (!other.getEnlljhnggpn().isEmpty()) {
        enlljhnggpn_ = other.enlljhnggpn_;
        onChanged();
      }
      if (!other.getGlankgjddic().isEmpty()) {
        glankgjddic_ = other.glankgjddic_;
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
      POGOProtos.Rpc.OFEJEIDKKCC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OFEJEIDKKCC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object enlljhnggpn_ = "";
    /**
     * <code>string enlljhnggpn = 1;</code>
     * @return The enlljhnggpn.
     */
    public java.lang.String getEnlljhnggpn() {
      java.lang.Object ref = enlljhnggpn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enlljhnggpn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string enlljhnggpn = 1;</code>
     * @return The bytes for enlljhnggpn.
     */
    public com.google.protobuf.ByteString
        getEnlljhnggpnBytes() {
      java.lang.Object ref = enlljhnggpn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enlljhnggpn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string enlljhnggpn = 1;</code>
     * @param value The enlljhnggpn to set.
     * @return This builder for chaining.
     */
    public Builder setEnlljhnggpn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      enlljhnggpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string enlljhnggpn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnlljhnggpn() {
      
      enlljhnggpn_ = getDefaultInstance().getEnlljhnggpn();
      onChanged();
      return this;
    }
    /**
     * <code>string enlljhnggpn = 1;</code>
     * @param value The bytes for enlljhnggpn to set.
     * @return This builder for chaining.
     */
    public Builder setEnlljhnggpnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      enlljhnggpn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object glankgjddic_ = "";
    /**
     * <code>string glankgjddic = 2;</code>
     * @return The glankgjddic.
     */
    public java.lang.String getGlankgjddic() {
      java.lang.Object ref = glankgjddic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        glankgjddic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string glankgjddic = 2;</code>
     * @return The bytes for glankgjddic.
     */
    public com.google.protobuf.ByteString
        getGlankgjddicBytes() {
      java.lang.Object ref = glankgjddic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        glankgjddic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string glankgjddic = 2;</code>
     * @param value The glankgjddic to set.
     * @return This builder for chaining.
     */
    public Builder setGlankgjddic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      glankgjddic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string glankgjddic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlankgjddic() {
      
      glankgjddic_ = getDefaultInstance().getGlankgjddic();
      onChanged();
      return this;
    }
    /**
     * <code>string glankgjddic = 2;</code>
     * @param value The bytes for glankgjddic to set.
     * @return This builder for chaining.
     */
    public Builder setGlankgjddicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      glankgjddic_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OFEJEIDKKCC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OFEJEIDKKCC)
  private static final POGOProtos.Rpc.OFEJEIDKKCC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OFEJEIDKKCC();
  }

  public static POGOProtos.Rpc.OFEJEIDKKCC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OFEJEIDKKCC>
      PARSER = new com.google.protobuf.AbstractParser<OFEJEIDKKCC>() {
    @java.lang.Override
    public OFEJEIDKKCC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OFEJEIDKKCC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OFEJEIDKKCC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OFEJEIDKKCC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OFEJEIDKKCC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

