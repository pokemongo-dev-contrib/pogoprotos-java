// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GFLCFFDAIBC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GFLCFFDAIBC}
 */
public final class GFLCFFDAIBC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GFLCFFDAIBC)
    GFLCFFDAIBCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GFLCFFDAIBC.newBuilder() to construct.
  private GFLCFFDAIBC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GFLCFFDAIBC() {
    mfjnddecdff_ = "";
    hjjjglcmfcn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GFLCFFDAIBC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GFLCFFDAIBC(
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

            mfjnddecdff_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hjjjglcmfcn_ = s;
            break;
          }
          case 24: {

            loiejlocpgk_ = input.readInt32();
            break;
          }
          case 32: {

            ljacpnmbfmc_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFLCFFDAIBC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFLCFFDAIBC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GFLCFFDAIBC.class, POGOProtos.Rpc.GFLCFFDAIBC.Builder.class);
  }

  public static final int MFJNDDECDFF_FIELD_NUMBER = 1;
  private volatile java.lang.Object mfjnddecdff_;
  /**
   * <code>string mfjnddecdff = 1;</code>
   * @return The mfjnddecdff.
   */
  @java.lang.Override
  public java.lang.String getMfjnddecdff() {
    java.lang.Object ref = mfjnddecdff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mfjnddecdff_ = s;
      return s;
    }
  }
  /**
   * <code>string mfjnddecdff = 1;</code>
   * @return The bytes for mfjnddecdff.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMfjnddecdffBytes() {
    java.lang.Object ref = mfjnddecdff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mfjnddecdff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HJJJGLCMFCN_FIELD_NUMBER = 2;
  private volatile java.lang.Object hjjjglcmfcn_;
  /**
   * <code>string hjjjglcmfcn = 2;</code>
   * @return The hjjjglcmfcn.
   */
  @java.lang.Override
  public java.lang.String getHjjjglcmfcn() {
    java.lang.Object ref = hjjjglcmfcn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hjjjglcmfcn_ = s;
      return s;
    }
  }
  /**
   * <code>string hjjjglcmfcn = 2;</code>
   * @return The bytes for hjjjglcmfcn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHjjjglcmfcnBytes() {
    java.lang.Object ref = hjjjglcmfcn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hjjjglcmfcn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOIEJLOCPGK_FIELD_NUMBER = 3;
  private int loiejlocpgk_;
  /**
   * <code>int32 loiejlocpgk = 3;</code>
   * @return The loiejlocpgk.
   */
  @java.lang.Override
  public int getLoiejlocpgk() {
    return loiejlocpgk_;
  }

  public static final int LJACPNMBFMC_FIELD_NUMBER = 4;
  private int ljacpnmbfmc_;
  /**
   * <code>uint32 ljacpnmbfmc = 4;</code>
   * @return The ljacpnmbfmc.
   */
  @java.lang.Override
  public int getLjacpnmbfmc() {
    return ljacpnmbfmc_;
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
    if (!getMfjnddecdffBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mfjnddecdff_);
    }
    if (!getHjjjglcmfcnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hjjjglcmfcn_);
    }
    if (loiejlocpgk_ != 0) {
      output.writeInt32(3, loiejlocpgk_);
    }
    if (ljacpnmbfmc_ != 0) {
      output.writeUInt32(4, ljacpnmbfmc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMfjnddecdffBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mfjnddecdff_);
    }
    if (!getHjjjglcmfcnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hjjjglcmfcn_);
    }
    if (loiejlocpgk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, loiejlocpgk_);
    }
    if (ljacpnmbfmc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, ljacpnmbfmc_);
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
    if (!(obj instanceof POGOProtos.Rpc.GFLCFFDAIBC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GFLCFFDAIBC other = (POGOProtos.Rpc.GFLCFFDAIBC) obj;

    if (!getMfjnddecdff()
        .equals(other.getMfjnddecdff())) return false;
    if (!getHjjjglcmfcn()
        .equals(other.getHjjjglcmfcn())) return false;
    if (getLoiejlocpgk()
        != other.getLoiejlocpgk()) return false;
    if (getLjacpnmbfmc()
        != other.getLjacpnmbfmc()) return false;
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
    hash = (37 * hash) + MFJNDDECDFF_FIELD_NUMBER;
    hash = (53 * hash) + getMfjnddecdff().hashCode();
    hash = (37 * hash) + HJJJGLCMFCN_FIELD_NUMBER;
    hash = (53 * hash) + getHjjjglcmfcn().hashCode();
    hash = (37 * hash) + LOIEJLOCPGK_FIELD_NUMBER;
    hash = (53 * hash) + getLoiejlocpgk();
    hash = (37 * hash) + LJACPNMBFMC_FIELD_NUMBER;
    hash = (53 * hash) + getLjacpnmbfmc();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFLCFFDAIBC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GFLCFFDAIBC prototype) {
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
   * ref: GFLCFFDAIBC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GFLCFFDAIBC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GFLCFFDAIBC)
      POGOProtos.Rpc.GFLCFFDAIBCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFLCFFDAIBC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFLCFFDAIBC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GFLCFFDAIBC.class, POGOProtos.Rpc.GFLCFFDAIBC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GFLCFFDAIBC.newBuilder()
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
      mfjnddecdff_ = "";

      hjjjglcmfcn_ = "";

      loiejlocpgk_ = 0;

      ljacpnmbfmc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFLCFFDAIBC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFLCFFDAIBC getDefaultInstanceForType() {
      return POGOProtos.Rpc.GFLCFFDAIBC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFLCFFDAIBC build() {
      POGOProtos.Rpc.GFLCFFDAIBC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFLCFFDAIBC buildPartial() {
      POGOProtos.Rpc.GFLCFFDAIBC result = new POGOProtos.Rpc.GFLCFFDAIBC(this);
      result.mfjnddecdff_ = mfjnddecdff_;
      result.hjjjglcmfcn_ = hjjjglcmfcn_;
      result.loiejlocpgk_ = loiejlocpgk_;
      result.ljacpnmbfmc_ = ljacpnmbfmc_;
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
      if (other instanceof POGOProtos.Rpc.GFLCFFDAIBC) {
        return mergeFrom((POGOProtos.Rpc.GFLCFFDAIBC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GFLCFFDAIBC other) {
      if (other == POGOProtos.Rpc.GFLCFFDAIBC.getDefaultInstance()) return this;
      if (!other.getMfjnddecdff().isEmpty()) {
        mfjnddecdff_ = other.mfjnddecdff_;
        onChanged();
      }
      if (!other.getHjjjglcmfcn().isEmpty()) {
        hjjjglcmfcn_ = other.hjjjglcmfcn_;
        onChanged();
      }
      if (other.getLoiejlocpgk() != 0) {
        setLoiejlocpgk(other.getLoiejlocpgk());
      }
      if (other.getLjacpnmbfmc() != 0) {
        setLjacpnmbfmc(other.getLjacpnmbfmc());
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
      POGOProtos.Rpc.GFLCFFDAIBC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GFLCFFDAIBC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mfjnddecdff_ = "";
    /**
     * <code>string mfjnddecdff = 1;</code>
     * @return The mfjnddecdff.
     */
    public java.lang.String getMfjnddecdff() {
      java.lang.Object ref = mfjnddecdff_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mfjnddecdff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mfjnddecdff = 1;</code>
     * @return The bytes for mfjnddecdff.
     */
    public com.google.protobuf.ByteString
        getMfjnddecdffBytes() {
      java.lang.Object ref = mfjnddecdff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mfjnddecdff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mfjnddecdff = 1;</code>
     * @param value The mfjnddecdff to set.
     * @return This builder for chaining.
     */
    public Builder setMfjnddecdff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mfjnddecdff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mfjnddecdff = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfjnddecdff() {
      
      mfjnddecdff_ = getDefaultInstance().getMfjnddecdff();
      onChanged();
      return this;
    }
    /**
     * <code>string mfjnddecdff = 1;</code>
     * @param value The bytes for mfjnddecdff to set.
     * @return This builder for chaining.
     */
    public Builder setMfjnddecdffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mfjnddecdff_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hjjjglcmfcn_ = "";
    /**
     * <code>string hjjjglcmfcn = 2;</code>
     * @return The hjjjglcmfcn.
     */
    public java.lang.String getHjjjglcmfcn() {
      java.lang.Object ref = hjjjglcmfcn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hjjjglcmfcn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hjjjglcmfcn = 2;</code>
     * @return The bytes for hjjjglcmfcn.
     */
    public com.google.protobuf.ByteString
        getHjjjglcmfcnBytes() {
      java.lang.Object ref = hjjjglcmfcn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hjjjglcmfcn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hjjjglcmfcn = 2;</code>
     * @param value The hjjjglcmfcn to set.
     * @return This builder for chaining.
     */
    public Builder setHjjjglcmfcn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hjjjglcmfcn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hjjjglcmfcn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjjjglcmfcn() {
      
      hjjjglcmfcn_ = getDefaultInstance().getHjjjglcmfcn();
      onChanged();
      return this;
    }
    /**
     * <code>string hjjjglcmfcn = 2;</code>
     * @param value The bytes for hjjjglcmfcn to set.
     * @return This builder for chaining.
     */
    public Builder setHjjjglcmfcnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hjjjglcmfcn_ = value;
      onChanged();
      return this;
    }

    private int loiejlocpgk_ ;
    /**
     * <code>int32 loiejlocpgk = 3;</code>
     * @return The loiejlocpgk.
     */
    @java.lang.Override
    public int getLoiejlocpgk() {
      return loiejlocpgk_;
    }
    /**
     * <code>int32 loiejlocpgk = 3;</code>
     * @param value The loiejlocpgk to set.
     * @return This builder for chaining.
     */
    public Builder setLoiejlocpgk(int value) {
      
      loiejlocpgk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 loiejlocpgk = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoiejlocpgk() {
      
      loiejlocpgk_ = 0;
      onChanged();
      return this;
    }

    private int ljacpnmbfmc_ ;
    /**
     * <code>uint32 ljacpnmbfmc = 4;</code>
     * @return The ljacpnmbfmc.
     */
    @java.lang.Override
    public int getLjacpnmbfmc() {
      return ljacpnmbfmc_;
    }
    /**
     * <code>uint32 ljacpnmbfmc = 4;</code>
     * @param value The ljacpnmbfmc to set.
     * @return This builder for chaining.
     */
    public Builder setLjacpnmbfmc(int value) {
      
      ljacpnmbfmc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 ljacpnmbfmc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLjacpnmbfmc() {
      
      ljacpnmbfmc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GFLCFFDAIBC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GFLCFFDAIBC)
  private static final POGOProtos.Rpc.GFLCFFDAIBC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GFLCFFDAIBC();
  }

  public static POGOProtos.Rpc.GFLCFFDAIBC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GFLCFFDAIBC>
      PARSER = new com.google.protobuf.AbstractParser<GFLCFFDAIBC>() {
    @java.lang.Override
    public GFLCFFDAIBC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GFLCFFDAIBC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GFLCFFDAIBC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GFLCFFDAIBC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GFLCFFDAIBC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

