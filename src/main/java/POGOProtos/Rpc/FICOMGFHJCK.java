// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FICOMGFHJCK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FICOMGFHJCK}
 */
public final class FICOMGFHJCK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FICOMGFHJCK)
    FICOMGFHJCKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FICOMGFHJCK.newBuilder() to construct.
  private FICOMGFHJCK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FICOMGFHJCK() {
    giicomkbckj_ = 0;
    jnenlikagpn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FICOMGFHJCK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FICOMGFHJCK(
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
            int rawValue = input.readEnum();

            giicomkbckj_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jnenlikagpn_ = s;
            break;
          }
          case 24: {

            leghneabplb_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FICOMGFHJCK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FICOMGFHJCK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FICOMGFHJCK.class, POGOProtos.Rpc.FICOMGFHJCK.Builder.class);
  }

  public static final int GIICOMKBCKJ_FIELD_NUMBER = 1;
  private int giicomkbckj_;
  /**
   * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
   * @return The enum numeric value on the wire for giicomkbckj.
   */
  @java.lang.Override public int getGiicomkbckjValue() {
    return giicomkbckj_;
  }
  /**
   * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
   * @return The giicomkbckj.
   */
  @java.lang.Override public POGOProtos.Rpc.BJJEKFJHMMJ getGiicomkbckj() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BJJEKFJHMMJ result = POGOProtos.Rpc.BJJEKFJHMMJ.valueOf(giicomkbckj_);
    return result == null ? POGOProtos.Rpc.BJJEKFJHMMJ.UNRECOGNIZED : result;
  }

  public static final int JNENLIKAGPN_FIELD_NUMBER = 2;
  private volatile java.lang.Object jnenlikagpn_;
  /**
   * <code>string jnenlikagpn = 2;</code>
   * @return The jnenlikagpn.
   */
  @java.lang.Override
  public java.lang.String getJnenlikagpn() {
    java.lang.Object ref = jnenlikagpn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jnenlikagpn_ = s;
      return s;
    }
  }
  /**
   * <code>string jnenlikagpn = 2;</code>
   * @return The bytes for jnenlikagpn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJnenlikagpnBytes() {
    java.lang.Object ref = jnenlikagpn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jnenlikagpn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEGHNEABPLB_FIELD_NUMBER = 3;
  private int leghneabplb_;
  /**
   * <code>uint32 leghneabplb = 3;</code>
   * @return The leghneabplb.
   */
  @java.lang.Override
  public int getLeghneabplb() {
    return leghneabplb_;
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
    if (giicomkbckj_ != POGOProtos.Rpc.BJJEKFJHMMJ.BJJEKFJHMMJ_UNDEFINED_ASSET_EVENT.getNumber()) {
      output.writeEnum(1, giicomkbckj_);
    }
    if (!getJnenlikagpnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jnenlikagpn_);
    }
    if (leghneabplb_ != 0) {
      output.writeUInt32(3, leghneabplb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (giicomkbckj_ != POGOProtos.Rpc.BJJEKFJHMMJ.BJJEKFJHMMJ_UNDEFINED_ASSET_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, giicomkbckj_);
    }
    if (!getJnenlikagpnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jnenlikagpn_);
    }
    if (leghneabplb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, leghneabplb_);
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
    if (!(obj instanceof POGOProtos.Rpc.FICOMGFHJCK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FICOMGFHJCK other = (POGOProtos.Rpc.FICOMGFHJCK) obj;

    if (giicomkbckj_ != other.giicomkbckj_) return false;
    if (!getJnenlikagpn()
        .equals(other.getJnenlikagpn())) return false;
    if (getLeghneabplb()
        != other.getLeghneabplb()) return false;
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
    hash = (37 * hash) + GIICOMKBCKJ_FIELD_NUMBER;
    hash = (53 * hash) + giicomkbckj_;
    hash = (37 * hash) + JNENLIKAGPN_FIELD_NUMBER;
    hash = (53 * hash) + getJnenlikagpn().hashCode();
    hash = (37 * hash) + LEGHNEABPLB_FIELD_NUMBER;
    hash = (53 * hash) + getLeghneabplb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FICOMGFHJCK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FICOMGFHJCK prototype) {
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
   * ref: FICOMGFHJCK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FICOMGFHJCK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FICOMGFHJCK)
      POGOProtos.Rpc.FICOMGFHJCKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FICOMGFHJCK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FICOMGFHJCK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FICOMGFHJCK.class, POGOProtos.Rpc.FICOMGFHJCK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FICOMGFHJCK.newBuilder()
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
      giicomkbckj_ = 0;

      jnenlikagpn_ = "";

      leghneabplb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FICOMGFHJCK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FICOMGFHJCK getDefaultInstanceForType() {
      return POGOProtos.Rpc.FICOMGFHJCK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FICOMGFHJCK build() {
      POGOProtos.Rpc.FICOMGFHJCK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FICOMGFHJCK buildPartial() {
      POGOProtos.Rpc.FICOMGFHJCK result = new POGOProtos.Rpc.FICOMGFHJCK(this);
      result.giicomkbckj_ = giicomkbckj_;
      result.jnenlikagpn_ = jnenlikagpn_;
      result.leghneabplb_ = leghneabplb_;
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
      if (other instanceof POGOProtos.Rpc.FICOMGFHJCK) {
        return mergeFrom((POGOProtos.Rpc.FICOMGFHJCK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FICOMGFHJCK other) {
      if (other == POGOProtos.Rpc.FICOMGFHJCK.getDefaultInstance()) return this;
      if (other.giicomkbckj_ != 0) {
        setGiicomkbckjValue(other.getGiicomkbckjValue());
      }
      if (!other.getJnenlikagpn().isEmpty()) {
        jnenlikagpn_ = other.jnenlikagpn_;
        onChanged();
      }
      if (other.getLeghneabplb() != 0) {
        setLeghneabplb(other.getLeghneabplb());
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
      POGOProtos.Rpc.FICOMGFHJCK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FICOMGFHJCK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int giicomkbckj_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
     * @return The enum numeric value on the wire for giicomkbckj.
     */
    @java.lang.Override public int getGiicomkbckjValue() {
      return giicomkbckj_;
    }
    /**
     * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
     * @param value The enum numeric value on the wire for giicomkbckj to set.
     * @return This builder for chaining.
     */
    public Builder setGiicomkbckjValue(int value) {
      
      giicomkbckj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
     * @return The giicomkbckj.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BJJEKFJHMMJ getGiicomkbckj() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BJJEKFJHMMJ result = POGOProtos.Rpc.BJJEKFJHMMJ.valueOf(giicomkbckj_);
      return result == null ? POGOProtos.Rpc.BJJEKFJHMMJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
     * @param value The giicomkbckj to set.
     * @return This builder for chaining.
     */
    public Builder setGiicomkbckj(POGOProtos.Rpc.BJJEKFJHMMJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      giicomkbckj_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BJJEKFJHMMJ giicomkbckj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGiicomkbckj() {
      
      giicomkbckj_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object jnenlikagpn_ = "";
    /**
     * <code>string jnenlikagpn = 2;</code>
     * @return The jnenlikagpn.
     */
    public java.lang.String getJnenlikagpn() {
      java.lang.Object ref = jnenlikagpn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jnenlikagpn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jnenlikagpn = 2;</code>
     * @return The bytes for jnenlikagpn.
     */
    public com.google.protobuf.ByteString
        getJnenlikagpnBytes() {
      java.lang.Object ref = jnenlikagpn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jnenlikagpn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jnenlikagpn = 2;</code>
     * @param value The jnenlikagpn to set.
     * @return This builder for chaining.
     */
    public Builder setJnenlikagpn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jnenlikagpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jnenlikagpn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJnenlikagpn() {
      
      jnenlikagpn_ = getDefaultInstance().getJnenlikagpn();
      onChanged();
      return this;
    }
    /**
     * <code>string jnenlikagpn = 2;</code>
     * @param value The bytes for jnenlikagpn to set.
     * @return This builder for chaining.
     */
    public Builder setJnenlikagpnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jnenlikagpn_ = value;
      onChanged();
      return this;
    }

    private int leghneabplb_ ;
    /**
     * <code>uint32 leghneabplb = 3;</code>
     * @return The leghneabplb.
     */
    @java.lang.Override
    public int getLeghneabplb() {
      return leghneabplb_;
    }
    /**
     * <code>uint32 leghneabplb = 3;</code>
     * @param value The leghneabplb to set.
     * @return This builder for chaining.
     */
    public Builder setLeghneabplb(int value) {
      
      leghneabplb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 leghneabplb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeghneabplb() {
      
      leghneabplb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FICOMGFHJCK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FICOMGFHJCK)
  private static final POGOProtos.Rpc.FICOMGFHJCK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FICOMGFHJCK();
  }

  public static POGOProtos.Rpc.FICOMGFHJCK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FICOMGFHJCK>
      PARSER = new com.google.protobuf.AbstractParser<FICOMGFHJCK>() {
    @java.lang.Override
    public FICOMGFHJCK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FICOMGFHJCK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FICOMGFHJCK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FICOMGFHJCK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FICOMGFHJCK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

