// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MFCEPCHNJPO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MFCEPCHNJPO}
 */
public final class MFCEPCHNJPO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MFCEPCHNJPO)
    MFCEPCHNJPOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MFCEPCHNJPO.newBuilder() to construct.
  private MFCEPCHNJPO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MFCEPCHNJPO() {
    idndlbdhpgm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MFCEPCHNJPO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MFCEPCHNJPO(
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

            idndlbdhpgm_ = s;
            break;
          }
          case 16: {

            endllgmapbh_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFCEPCHNJPO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFCEPCHNJPO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MFCEPCHNJPO.class, POGOProtos.Rpc.MFCEPCHNJPO.Builder.class);
  }

  public static final int IDNDLBDHPGM_FIELD_NUMBER = 1;
  private volatile java.lang.Object idndlbdhpgm_;
  /**
   * <code>string idndlbdhpgm = 1;</code>
   * @return The idndlbdhpgm.
   */
  @java.lang.Override
  public java.lang.String getIdndlbdhpgm() {
    java.lang.Object ref = idndlbdhpgm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idndlbdhpgm_ = s;
      return s;
    }
  }
  /**
   * <code>string idndlbdhpgm = 1;</code>
   * @return The bytes for idndlbdhpgm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdndlbdhpgmBytes() {
    java.lang.Object ref = idndlbdhpgm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idndlbdhpgm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDLLGMAPBH_FIELD_NUMBER = 2;
  private long endllgmapbh_;
  /**
   * <code>int64 endllgmapbh = 2;</code>
   * @return The endllgmapbh.
   */
  @java.lang.Override
  public long getEndllgmapbh() {
    return endllgmapbh_;
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
    if (!getIdndlbdhpgmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, idndlbdhpgm_);
    }
    if (endllgmapbh_ != 0L) {
      output.writeInt64(2, endllgmapbh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdndlbdhpgmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, idndlbdhpgm_);
    }
    if (endllgmapbh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, endllgmapbh_);
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
    if (!(obj instanceof POGOProtos.Rpc.MFCEPCHNJPO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MFCEPCHNJPO other = (POGOProtos.Rpc.MFCEPCHNJPO) obj;

    if (!getIdndlbdhpgm()
        .equals(other.getIdndlbdhpgm())) return false;
    if (getEndllgmapbh()
        != other.getEndllgmapbh()) return false;
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
    hash = (37 * hash) + IDNDLBDHPGM_FIELD_NUMBER;
    hash = (53 * hash) + getIdndlbdhpgm().hashCode();
    hash = (37 * hash) + ENDLLGMAPBH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndllgmapbh());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFCEPCHNJPO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MFCEPCHNJPO prototype) {
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
   * ref: MFCEPCHNJPO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MFCEPCHNJPO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MFCEPCHNJPO)
      POGOProtos.Rpc.MFCEPCHNJPOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFCEPCHNJPO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFCEPCHNJPO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MFCEPCHNJPO.class, POGOProtos.Rpc.MFCEPCHNJPO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MFCEPCHNJPO.newBuilder()
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
      idndlbdhpgm_ = "";

      endllgmapbh_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFCEPCHNJPO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFCEPCHNJPO getDefaultInstanceForType() {
      return POGOProtos.Rpc.MFCEPCHNJPO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFCEPCHNJPO build() {
      POGOProtos.Rpc.MFCEPCHNJPO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFCEPCHNJPO buildPartial() {
      POGOProtos.Rpc.MFCEPCHNJPO result = new POGOProtos.Rpc.MFCEPCHNJPO(this);
      result.idndlbdhpgm_ = idndlbdhpgm_;
      result.endllgmapbh_ = endllgmapbh_;
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
      if (other instanceof POGOProtos.Rpc.MFCEPCHNJPO) {
        return mergeFrom((POGOProtos.Rpc.MFCEPCHNJPO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MFCEPCHNJPO other) {
      if (other == POGOProtos.Rpc.MFCEPCHNJPO.getDefaultInstance()) return this;
      if (!other.getIdndlbdhpgm().isEmpty()) {
        idndlbdhpgm_ = other.idndlbdhpgm_;
        onChanged();
      }
      if (other.getEndllgmapbh() != 0L) {
        setEndllgmapbh(other.getEndllgmapbh());
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
      POGOProtos.Rpc.MFCEPCHNJPO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MFCEPCHNJPO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object idndlbdhpgm_ = "";
    /**
     * <code>string idndlbdhpgm = 1;</code>
     * @return The idndlbdhpgm.
     */
    public java.lang.String getIdndlbdhpgm() {
      java.lang.Object ref = idndlbdhpgm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idndlbdhpgm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idndlbdhpgm = 1;</code>
     * @return The bytes for idndlbdhpgm.
     */
    public com.google.protobuf.ByteString
        getIdndlbdhpgmBytes() {
      java.lang.Object ref = idndlbdhpgm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idndlbdhpgm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idndlbdhpgm = 1;</code>
     * @param value The idndlbdhpgm to set.
     * @return This builder for chaining.
     */
    public Builder setIdndlbdhpgm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idndlbdhpgm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idndlbdhpgm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdndlbdhpgm() {
      
      idndlbdhpgm_ = getDefaultInstance().getIdndlbdhpgm();
      onChanged();
      return this;
    }
    /**
     * <code>string idndlbdhpgm = 1;</code>
     * @param value The bytes for idndlbdhpgm to set.
     * @return This builder for chaining.
     */
    public Builder setIdndlbdhpgmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idndlbdhpgm_ = value;
      onChanged();
      return this;
    }

    private long endllgmapbh_ ;
    /**
     * <code>int64 endllgmapbh = 2;</code>
     * @return The endllgmapbh.
     */
    @java.lang.Override
    public long getEndllgmapbh() {
      return endllgmapbh_;
    }
    /**
     * <code>int64 endllgmapbh = 2;</code>
     * @param value The endllgmapbh to set.
     * @return This builder for chaining.
     */
    public Builder setEndllgmapbh(long value) {
      
      endllgmapbh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 endllgmapbh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndllgmapbh() {
      
      endllgmapbh_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MFCEPCHNJPO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MFCEPCHNJPO)
  private static final POGOProtos.Rpc.MFCEPCHNJPO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MFCEPCHNJPO();
  }

  public static POGOProtos.Rpc.MFCEPCHNJPO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MFCEPCHNJPO>
      PARSER = new com.google.protobuf.AbstractParser<MFCEPCHNJPO>() {
    @java.lang.Override
    public MFCEPCHNJPO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MFCEPCHNJPO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MFCEPCHNJPO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MFCEPCHNJPO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MFCEPCHNJPO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

