// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CKNMFHOCHKP}
 */
public  final class CKNMFHOCHKP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKNMFHOCHKP)
    CKNMFHOCHKPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKNMFHOCHKP.newBuilder() to construct.
  private CKNMFHOCHKP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKNMFHOCHKP() {
    mlieffcaibf_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKNMFHOCHKP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKNMFHOCHKP(
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

            mlieffcaibf_ = s;
            break;
          }
          case 16: {

            fdolgbamdli_ = input.readInt64();
            break;
          }
          case 25: {

            hohldcmhbkm_ = input.readDouble();
            break;
          }
          case 33: {

            ekeicchnloj_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKNMFHOCHKP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKNMFHOCHKP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKNMFHOCHKP.class, POGOProtos.Rpc.CKNMFHOCHKP.Builder.class);
  }

  public static final int MLIEFFCAIBF_FIELD_NUMBER = 1;
  private volatile java.lang.Object mlieffcaibf_;
  /**
   * <code>string mlieffcaibf = 1;</code>
   * @return The mlieffcaibf.
   */
  public java.lang.String getMlieffcaibf() {
    java.lang.Object ref = mlieffcaibf_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mlieffcaibf_ = s;
      return s;
    }
  }
  /**
   * <code>string mlieffcaibf = 1;</code>
   * @return The bytes for mlieffcaibf.
   */
  public com.google.protobuf.ByteString
      getMlieffcaibfBytes() {
    java.lang.Object ref = mlieffcaibf_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mlieffcaibf_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FDOLGBAMDLI_FIELD_NUMBER = 2;
  private long fdolgbamdli_;
  /**
   * <code>int64 fdolgbamdli = 2;</code>
   * @return The fdolgbamdli.
   */
  public long getFdolgbamdli() {
    return fdolgbamdli_;
  }

  public static final int HOHLDCMHBKM_FIELD_NUMBER = 3;
  private double hohldcmhbkm_;
  /**
   * <code>double hohldcmhbkm = 3;</code>
   * @return The hohldcmhbkm.
   */
  public double getHohldcmhbkm() {
    return hohldcmhbkm_;
  }

  public static final int EKEICCHNLOJ_FIELD_NUMBER = 4;
  private double ekeicchnloj_;
  /**
   * <code>double ekeicchnloj = 4;</code>
   * @return The ekeicchnloj.
   */
  public double getEkeicchnloj() {
    return ekeicchnloj_;
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
    if (!getMlieffcaibfBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mlieffcaibf_);
    }
    if (fdolgbamdli_ != 0L) {
      output.writeInt64(2, fdolgbamdli_);
    }
    if (hohldcmhbkm_ != 0D) {
      output.writeDouble(3, hohldcmhbkm_);
    }
    if (ekeicchnloj_ != 0D) {
      output.writeDouble(4, ekeicchnloj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMlieffcaibfBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mlieffcaibf_);
    }
    if (fdolgbamdli_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fdolgbamdli_);
    }
    if (hohldcmhbkm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, hohldcmhbkm_);
    }
    if (ekeicchnloj_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, ekeicchnloj_);
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
    if (!(obj instanceof POGOProtos.Rpc.CKNMFHOCHKP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKNMFHOCHKP other = (POGOProtos.Rpc.CKNMFHOCHKP) obj;

    if (!getMlieffcaibf()
        .equals(other.getMlieffcaibf())) return false;
    if (getFdolgbamdli()
        != other.getFdolgbamdli()) return false;
    if (java.lang.Double.doubleToLongBits(getHohldcmhbkm())
        != java.lang.Double.doubleToLongBits(
            other.getHohldcmhbkm())) return false;
    if (java.lang.Double.doubleToLongBits(getEkeicchnloj())
        != java.lang.Double.doubleToLongBits(
            other.getEkeicchnloj())) return false;
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
    hash = (37 * hash) + MLIEFFCAIBF_FIELD_NUMBER;
    hash = (53 * hash) + getMlieffcaibf().hashCode();
    hash = (37 * hash) + FDOLGBAMDLI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFdolgbamdli());
    hash = (37 * hash) + HOHLDCMHBKM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHohldcmhbkm()));
    hash = (37 * hash) + EKEICCHNLOJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEkeicchnloj()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKNMFHOCHKP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKNMFHOCHKP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CKNMFHOCHKP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKNMFHOCHKP)
      POGOProtos.Rpc.CKNMFHOCHKPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKNMFHOCHKP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKNMFHOCHKP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKNMFHOCHKP.class, POGOProtos.Rpc.CKNMFHOCHKP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKNMFHOCHKP.newBuilder()
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
      mlieffcaibf_ = "";

      fdolgbamdli_ = 0L;

      hohldcmhbkm_ = 0D;

      ekeicchnloj_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKNMFHOCHKP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKNMFHOCHKP getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKNMFHOCHKP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKNMFHOCHKP build() {
      POGOProtos.Rpc.CKNMFHOCHKP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKNMFHOCHKP buildPartial() {
      POGOProtos.Rpc.CKNMFHOCHKP result = new POGOProtos.Rpc.CKNMFHOCHKP(this);
      result.mlieffcaibf_ = mlieffcaibf_;
      result.fdolgbamdli_ = fdolgbamdli_;
      result.hohldcmhbkm_ = hohldcmhbkm_;
      result.ekeicchnloj_ = ekeicchnloj_;
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
      if (other instanceof POGOProtos.Rpc.CKNMFHOCHKP) {
        return mergeFrom((POGOProtos.Rpc.CKNMFHOCHKP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKNMFHOCHKP other) {
      if (other == POGOProtos.Rpc.CKNMFHOCHKP.getDefaultInstance()) return this;
      if (!other.getMlieffcaibf().isEmpty()) {
        mlieffcaibf_ = other.mlieffcaibf_;
        onChanged();
      }
      if (other.getFdolgbamdli() != 0L) {
        setFdolgbamdli(other.getFdolgbamdli());
      }
      if (other.getHohldcmhbkm() != 0D) {
        setHohldcmhbkm(other.getHohldcmhbkm());
      }
      if (other.getEkeicchnloj() != 0D) {
        setEkeicchnloj(other.getEkeicchnloj());
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
      POGOProtos.Rpc.CKNMFHOCHKP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKNMFHOCHKP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mlieffcaibf_ = "";
    /**
     * <code>string mlieffcaibf = 1;</code>
     * @return The mlieffcaibf.
     */
    public java.lang.String getMlieffcaibf() {
      java.lang.Object ref = mlieffcaibf_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mlieffcaibf_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mlieffcaibf = 1;</code>
     * @return The bytes for mlieffcaibf.
     */
    public com.google.protobuf.ByteString
        getMlieffcaibfBytes() {
      java.lang.Object ref = mlieffcaibf_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mlieffcaibf_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mlieffcaibf = 1;</code>
     * @param value The mlieffcaibf to set.
     * @return This builder for chaining.
     */
    public Builder setMlieffcaibf(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mlieffcaibf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mlieffcaibf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlieffcaibf() {
      
      mlieffcaibf_ = getDefaultInstance().getMlieffcaibf();
      onChanged();
      return this;
    }
    /**
     * <code>string mlieffcaibf = 1;</code>
     * @param value The bytes for mlieffcaibf to set.
     * @return This builder for chaining.
     */
    public Builder setMlieffcaibfBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mlieffcaibf_ = value;
      onChanged();
      return this;
    }

    private long fdolgbamdli_ ;
    /**
     * <code>int64 fdolgbamdli = 2;</code>
     * @return The fdolgbamdli.
     */
    public long getFdolgbamdli() {
      return fdolgbamdli_;
    }
    /**
     * <code>int64 fdolgbamdli = 2;</code>
     * @param value The fdolgbamdli to set.
     * @return This builder for chaining.
     */
    public Builder setFdolgbamdli(long value) {
      
      fdolgbamdli_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fdolgbamdli = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdolgbamdli() {
      
      fdolgbamdli_ = 0L;
      onChanged();
      return this;
    }

    private double hohldcmhbkm_ ;
    /**
     * <code>double hohldcmhbkm = 3;</code>
     * @return The hohldcmhbkm.
     */
    public double getHohldcmhbkm() {
      return hohldcmhbkm_;
    }
    /**
     * <code>double hohldcmhbkm = 3;</code>
     * @param value The hohldcmhbkm to set.
     * @return This builder for chaining.
     */
    public Builder setHohldcmhbkm(double value) {
      
      hohldcmhbkm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double hohldcmhbkm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHohldcmhbkm() {
      
      hohldcmhbkm_ = 0D;
      onChanged();
      return this;
    }

    private double ekeicchnloj_ ;
    /**
     * <code>double ekeicchnloj = 4;</code>
     * @return The ekeicchnloj.
     */
    public double getEkeicchnloj() {
      return ekeicchnloj_;
    }
    /**
     * <code>double ekeicchnloj = 4;</code>
     * @param value The ekeicchnloj to set.
     * @return This builder for chaining.
     */
    public Builder setEkeicchnloj(double value) {
      
      ekeicchnloj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ekeicchnloj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkeicchnloj() {
      
      ekeicchnloj_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKNMFHOCHKP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKNMFHOCHKP)
  private static final POGOProtos.Rpc.CKNMFHOCHKP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKNMFHOCHKP();
  }

  public static POGOProtos.Rpc.CKNMFHOCHKP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKNMFHOCHKP>
      PARSER = new com.google.protobuf.AbstractParser<CKNMFHOCHKP>() {
    @java.lang.Override
    public CKNMFHOCHKP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKNMFHOCHKP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKNMFHOCHKP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKNMFHOCHKP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKNMFHOCHKP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

