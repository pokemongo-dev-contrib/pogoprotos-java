// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ABCJJNCNEEP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ABCJJNCNEEP}
 */
public final class ABCJJNCNEEP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ABCJJNCNEEP)
    ABCJJNCNEEPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ABCJJNCNEEP.newBuilder() to construct.
  private ABCJJNCNEEP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ABCJJNCNEEP() {
    pjbblibfbgp_ = "";
    aemajjmeaio_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ABCJJNCNEEP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ABCJJNCNEEP(
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

            pjbblibfbgp_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            aemajjmeaio_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABCJJNCNEEP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABCJJNCNEEP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ABCJJNCNEEP.class, POGOProtos.Rpc.ABCJJNCNEEP.Builder.class);
  }

  public static final int PJBBLIBFBGP_FIELD_NUMBER = 1;
  private volatile java.lang.Object pjbblibfbgp_;
  /**
   * <code>string pjbblibfbgp = 1;</code>
   * @return The pjbblibfbgp.
   */
  @java.lang.Override
  public java.lang.String getPjbblibfbgp() {
    java.lang.Object ref = pjbblibfbgp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pjbblibfbgp_ = s;
      return s;
    }
  }
  /**
   * <code>string pjbblibfbgp = 1;</code>
   * @return The bytes for pjbblibfbgp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPjbblibfbgpBytes() {
    java.lang.Object ref = pjbblibfbgp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pjbblibfbgp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AEMAJJMEAIO_FIELD_NUMBER = 2;
  private volatile java.lang.Object aemajjmeaio_;
  /**
   * <code>string aemajjmeaio = 2;</code>
   * @return The aemajjmeaio.
   */
  @java.lang.Override
  public java.lang.String getAemajjmeaio() {
    java.lang.Object ref = aemajjmeaio_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aemajjmeaio_ = s;
      return s;
    }
  }
  /**
   * <code>string aemajjmeaio = 2;</code>
   * @return The bytes for aemajjmeaio.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAemajjmeaioBytes() {
    java.lang.Object ref = aemajjmeaio_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aemajjmeaio_ = b;
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
    if (!getPjbblibfbgpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pjbblibfbgp_);
    }
    if (!getAemajjmeaioBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aemajjmeaio_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPjbblibfbgpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pjbblibfbgp_);
    }
    if (!getAemajjmeaioBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, aemajjmeaio_);
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
    if (!(obj instanceof POGOProtos.Rpc.ABCJJNCNEEP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ABCJJNCNEEP other = (POGOProtos.Rpc.ABCJJNCNEEP) obj;

    if (!getPjbblibfbgp()
        .equals(other.getPjbblibfbgp())) return false;
    if (!getAemajjmeaio()
        .equals(other.getAemajjmeaio())) return false;
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
    hash = (37 * hash) + PJBBLIBFBGP_FIELD_NUMBER;
    hash = (53 * hash) + getPjbblibfbgp().hashCode();
    hash = (37 * hash) + AEMAJJMEAIO_FIELD_NUMBER;
    hash = (53 * hash) + getAemajjmeaio().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ABCJJNCNEEP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ABCJJNCNEEP prototype) {
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
   * ref: ABCJJNCNEEP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ABCJJNCNEEP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ABCJJNCNEEP)
      POGOProtos.Rpc.ABCJJNCNEEPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABCJJNCNEEP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABCJJNCNEEP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ABCJJNCNEEP.class, POGOProtos.Rpc.ABCJJNCNEEP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ABCJJNCNEEP.newBuilder()
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
      pjbblibfbgp_ = "";

      aemajjmeaio_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ABCJJNCNEEP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABCJJNCNEEP getDefaultInstanceForType() {
      return POGOProtos.Rpc.ABCJJNCNEEP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABCJJNCNEEP build() {
      POGOProtos.Rpc.ABCJJNCNEEP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ABCJJNCNEEP buildPartial() {
      POGOProtos.Rpc.ABCJJNCNEEP result = new POGOProtos.Rpc.ABCJJNCNEEP(this);
      result.pjbblibfbgp_ = pjbblibfbgp_;
      result.aemajjmeaio_ = aemajjmeaio_;
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
      if (other instanceof POGOProtos.Rpc.ABCJJNCNEEP) {
        return mergeFrom((POGOProtos.Rpc.ABCJJNCNEEP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ABCJJNCNEEP other) {
      if (other == POGOProtos.Rpc.ABCJJNCNEEP.getDefaultInstance()) return this;
      if (!other.getPjbblibfbgp().isEmpty()) {
        pjbblibfbgp_ = other.pjbblibfbgp_;
        onChanged();
      }
      if (!other.getAemajjmeaio().isEmpty()) {
        aemajjmeaio_ = other.aemajjmeaio_;
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
      POGOProtos.Rpc.ABCJJNCNEEP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ABCJJNCNEEP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pjbblibfbgp_ = "";
    /**
     * <code>string pjbblibfbgp = 1;</code>
     * @return The pjbblibfbgp.
     */
    public java.lang.String getPjbblibfbgp() {
      java.lang.Object ref = pjbblibfbgp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pjbblibfbgp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pjbblibfbgp = 1;</code>
     * @return The bytes for pjbblibfbgp.
     */
    public com.google.protobuf.ByteString
        getPjbblibfbgpBytes() {
      java.lang.Object ref = pjbblibfbgp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pjbblibfbgp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pjbblibfbgp = 1;</code>
     * @param value The pjbblibfbgp to set.
     * @return This builder for chaining.
     */
    public Builder setPjbblibfbgp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pjbblibfbgp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pjbblibfbgp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPjbblibfbgp() {
      
      pjbblibfbgp_ = getDefaultInstance().getPjbblibfbgp();
      onChanged();
      return this;
    }
    /**
     * <code>string pjbblibfbgp = 1;</code>
     * @param value The bytes for pjbblibfbgp to set.
     * @return This builder for chaining.
     */
    public Builder setPjbblibfbgpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pjbblibfbgp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object aemajjmeaio_ = "";
    /**
     * <code>string aemajjmeaio = 2;</code>
     * @return The aemajjmeaio.
     */
    public java.lang.String getAemajjmeaio() {
      java.lang.Object ref = aemajjmeaio_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aemajjmeaio_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aemajjmeaio = 2;</code>
     * @return The bytes for aemajjmeaio.
     */
    public com.google.protobuf.ByteString
        getAemajjmeaioBytes() {
      java.lang.Object ref = aemajjmeaio_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aemajjmeaio_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aemajjmeaio = 2;</code>
     * @param value The aemajjmeaio to set.
     * @return This builder for chaining.
     */
    public Builder setAemajjmeaio(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aemajjmeaio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aemajjmeaio = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAemajjmeaio() {
      
      aemajjmeaio_ = getDefaultInstance().getAemajjmeaio();
      onChanged();
      return this;
    }
    /**
     * <code>string aemajjmeaio = 2;</code>
     * @param value The bytes for aemajjmeaio to set.
     * @return This builder for chaining.
     */
    public Builder setAemajjmeaioBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aemajjmeaio_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ABCJJNCNEEP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ABCJJNCNEEP)
  private static final POGOProtos.Rpc.ABCJJNCNEEP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ABCJJNCNEEP();
  }

  public static POGOProtos.Rpc.ABCJJNCNEEP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ABCJJNCNEEP>
      PARSER = new com.google.protobuf.AbstractParser<ABCJJNCNEEP>() {
    @java.lang.Override
    public ABCJJNCNEEP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ABCJJNCNEEP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ABCJJNCNEEP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ABCJJNCNEEP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ABCJJNCNEEP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

