// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PBEEJJGBDEP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PBEEJJGBDEP}
 */
public final class PBEEJJGBDEP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PBEEJJGBDEP)
    PBEEJJGBDEPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PBEEJJGBDEP.newBuilder() to construct.
  private PBEEJJGBDEP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PBEEJJGBDEP() {
    nbeelionjck_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PBEEJJGBDEP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PBEEJJGBDEP(
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

            hpjdnhdapje_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nbeelionjck_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBEEJJGBDEP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBEEJJGBDEP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PBEEJJGBDEP.class, POGOProtos.Rpc.PBEEJJGBDEP.Builder.class);
  }

  public static final int HPJDNHDAPJE_FIELD_NUMBER = 1;
  private long hpjdnhdapje_;
  /**
   * <code>uint64 hpjdnhdapje = 1;</code>
   * @return The hpjdnhdapje.
   */
  @java.lang.Override
  public long getHpjdnhdapje() {
    return hpjdnhdapje_;
  }

  public static final int NBEELIONJCK_FIELD_NUMBER = 2;
  private volatile java.lang.Object nbeelionjck_;
  /**
   * <code>string nbeelionjck = 2;</code>
   * @return The nbeelionjck.
   */
  @java.lang.Override
  public java.lang.String getNbeelionjck() {
    java.lang.Object ref = nbeelionjck_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nbeelionjck_ = s;
      return s;
    }
  }
  /**
   * <code>string nbeelionjck = 2;</code>
   * @return The bytes for nbeelionjck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNbeelionjckBytes() {
    java.lang.Object ref = nbeelionjck_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nbeelionjck_ = b;
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
    if (hpjdnhdapje_ != 0L) {
      output.writeUInt64(1, hpjdnhdapje_);
    }
    if (!getNbeelionjckBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nbeelionjck_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hpjdnhdapje_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, hpjdnhdapje_);
    }
    if (!getNbeelionjckBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nbeelionjck_);
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
    if (!(obj instanceof POGOProtos.Rpc.PBEEJJGBDEP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PBEEJJGBDEP other = (POGOProtos.Rpc.PBEEJJGBDEP) obj;

    if (getHpjdnhdapje()
        != other.getHpjdnhdapje()) return false;
    if (!getNbeelionjck()
        .equals(other.getNbeelionjck())) return false;
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
    hash = (37 * hash) + HPJDNHDAPJE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHpjdnhdapje());
    hash = (37 * hash) + NBEELIONJCK_FIELD_NUMBER;
    hash = (53 * hash) + getNbeelionjck().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBEEJJGBDEP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PBEEJJGBDEP prototype) {
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
   * ref: PBEEJJGBDEP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PBEEJJGBDEP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PBEEJJGBDEP)
      POGOProtos.Rpc.PBEEJJGBDEPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBEEJJGBDEP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBEEJJGBDEP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PBEEJJGBDEP.class, POGOProtos.Rpc.PBEEJJGBDEP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PBEEJJGBDEP.newBuilder()
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
      hpjdnhdapje_ = 0L;

      nbeelionjck_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBEEJJGBDEP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBEEJJGBDEP getDefaultInstanceForType() {
      return POGOProtos.Rpc.PBEEJJGBDEP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBEEJJGBDEP build() {
      POGOProtos.Rpc.PBEEJJGBDEP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBEEJJGBDEP buildPartial() {
      POGOProtos.Rpc.PBEEJJGBDEP result = new POGOProtos.Rpc.PBEEJJGBDEP(this);
      result.hpjdnhdapje_ = hpjdnhdapje_;
      result.nbeelionjck_ = nbeelionjck_;
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
      if (other instanceof POGOProtos.Rpc.PBEEJJGBDEP) {
        return mergeFrom((POGOProtos.Rpc.PBEEJJGBDEP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PBEEJJGBDEP other) {
      if (other == POGOProtos.Rpc.PBEEJJGBDEP.getDefaultInstance()) return this;
      if (other.getHpjdnhdapje() != 0L) {
        setHpjdnhdapje(other.getHpjdnhdapje());
      }
      if (!other.getNbeelionjck().isEmpty()) {
        nbeelionjck_ = other.nbeelionjck_;
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
      POGOProtos.Rpc.PBEEJJGBDEP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PBEEJJGBDEP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long hpjdnhdapje_ ;
    /**
     * <code>uint64 hpjdnhdapje = 1;</code>
     * @return The hpjdnhdapje.
     */
    @java.lang.Override
    public long getHpjdnhdapje() {
      return hpjdnhdapje_;
    }
    /**
     * <code>uint64 hpjdnhdapje = 1;</code>
     * @param value The hpjdnhdapje to set.
     * @return This builder for chaining.
     */
    public Builder setHpjdnhdapje(long value) {
      
      hpjdnhdapje_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 hpjdnhdapje = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHpjdnhdapje() {
      
      hpjdnhdapje_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nbeelionjck_ = "";
    /**
     * <code>string nbeelionjck = 2;</code>
     * @return The nbeelionjck.
     */
    public java.lang.String getNbeelionjck() {
      java.lang.Object ref = nbeelionjck_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nbeelionjck_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nbeelionjck = 2;</code>
     * @return The bytes for nbeelionjck.
     */
    public com.google.protobuf.ByteString
        getNbeelionjckBytes() {
      java.lang.Object ref = nbeelionjck_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nbeelionjck_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nbeelionjck = 2;</code>
     * @param value The nbeelionjck to set.
     * @return This builder for chaining.
     */
    public Builder setNbeelionjck(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nbeelionjck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nbeelionjck = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNbeelionjck() {
      
      nbeelionjck_ = getDefaultInstance().getNbeelionjck();
      onChanged();
      return this;
    }
    /**
     * <code>string nbeelionjck = 2;</code>
     * @param value The bytes for nbeelionjck to set.
     * @return This builder for chaining.
     */
    public Builder setNbeelionjckBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nbeelionjck_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PBEEJJGBDEP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PBEEJJGBDEP)
  private static final POGOProtos.Rpc.PBEEJJGBDEP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PBEEJJGBDEP();
  }

  public static POGOProtos.Rpc.PBEEJJGBDEP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PBEEJJGBDEP>
      PARSER = new com.google.protobuf.AbstractParser<PBEEJJGBDEP>() {
    @java.lang.Override
    public PBEEJJGBDEP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PBEEJJGBDEP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PBEEJJGBDEP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PBEEJJGBDEP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PBEEJJGBDEP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

