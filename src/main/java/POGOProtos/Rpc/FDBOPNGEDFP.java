// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FDBOPNGEDFP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FDBOPNGEDFP}
 */
public final class FDBOPNGEDFP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FDBOPNGEDFP)
    FDBOPNGEDFPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FDBOPNGEDFP.newBuilder() to construct.
  private FDBOPNGEDFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FDBOPNGEDFP() {
    lcajjpmoafe_ = "";
    khaomhhkaeh_ = "";
    kgkmnojcgnl_ = "";
    lnhoagbbbnn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FDBOPNGEDFP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FDBOPNGEDFP(
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

            lcajjpmoafe_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            khaomhhkaeh_ = s;
            break;
          }
          case 24: {

            hnncljlomgd_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            kgkmnojcgnl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            lnhoagbbbnn_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDBOPNGEDFP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDBOPNGEDFP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FDBOPNGEDFP.class, POGOProtos.Rpc.FDBOPNGEDFP.Builder.class);
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private volatile java.lang.Object lcajjpmoafe_;
  /**
   * <code>string lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override
  public java.lang.String getLcajjpmoafe() {
    java.lang.Object ref = lcajjpmoafe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lcajjpmoafe_ = s;
      return s;
    }
  }
  /**
   * <code>string lcajjpmoafe = 1;</code>
   * @return The bytes for lcajjpmoafe.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLcajjpmoafeBytes() {
    java.lang.Object ref = lcajjpmoafe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lcajjpmoafe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KHAOMHHKAEH_FIELD_NUMBER = 2;
  private volatile java.lang.Object khaomhhkaeh_;
  /**
   * <code>string khaomhhkaeh = 2;</code>
   * @return The khaomhhkaeh.
   */
  @java.lang.Override
  public java.lang.String getKhaomhhkaeh() {
    java.lang.Object ref = khaomhhkaeh_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      khaomhhkaeh_ = s;
      return s;
    }
  }
  /**
   * <code>string khaomhhkaeh = 2;</code>
   * @return The bytes for khaomhhkaeh.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKhaomhhkaehBytes() {
    java.lang.Object ref = khaomhhkaeh_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      khaomhhkaeh_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HNNCLJLOMGD_FIELD_NUMBER = 3;
  private int hnncljlomgd_;
  /**
   * <code>int32 hnncljlomgd = 3;</code>
   * @return The hnncljlomgd.
   */
  @java.lang.Override
  public int getHnncljlomgd() {
    return hnncljlomgd_;
  }

  public static final int KGKMNOJCGNL_FIELD_NUMBER = 4;
  private volatile java.lang.Object kgkmnojcgnl_;
  /**
   * <code>string kgkmnojcgnl = 4;</code>
   * @return The kgkmnojcgnl.
   */
  @java.lang.Override
  public java.lang.String getKgkmnojcgnl() {
    java.lang.Object ref = kgkmnojcgnl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kgkmnojcgnl_ = s;
      return s;
    }
  }
  /**
   * <code>string kgkmnojcgnl = 4;</code>
   * @return The bytes for kgkmnojcgnl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKgkmnojcgnlBytes() {
    java.lang.Object ref = kgkmnojcgnl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kgkmnojcgnl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LNHOAGBBBNN_FIELD_NUMBER = 5;
  private volatile java.lang.Object lnhoagbbbnn_;
  /**
   * <code>string lnhoagbbbnn = 5;</code>
   * @return The lnhoagbbbnn.
   */
  @java.lang.Override
  public java.lang.String getLnhoagbbbnn() {
    java.lang.Object ref = lnhoagbbbnn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lnhoagbbbnn_ = s;
      return s;
    }
  }
  /**
   * <code>string lnhoagbbbnn = 5;</code>
   * @return The bytes for lnhoagbbbnn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLnhoagbbbnnBytes() {
    java.lang.Object ref = lnhoagbbbnn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lnhoagbbbnn_ = b;
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
    if (!getLcajjpmoafeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lcajjpmoafe_);
    }
    if (!getKhaomhhkaehBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, khaomhhkaeh_);
    }
    if (hnncljlomgd_ != 0) {
      output.writeInt32(3, hnncljlomgd_);
    }
    if (!getKgkmnojcgnlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, kgkmnojcgnl_);
    }
    if (!getLnhoagbbbnnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lnhoagbbbnn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLcajjpmoafeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lcajjpmoafe_);
    }
    if (!getKhaomhhkaehBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, khaomhhkaeh_);
    }
    if (hnncljlomgd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hnncljlomgd_);
    }
    if (!getKgkmnojcgnlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, kgkmnojcgnl_);
    }
    if (!getLnhoagbbbnnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lnhoagbbbnn_);
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
    if (!(obj instanceof POGOProtos.Rpc.FDBOPNGEDFP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FDBOPNGEDFP other = (POGOProtos.Rpc.FDBOPNGEDFP) obj;

    if (!getLcajjpmoafe()
        .equals(other.getLcajjpmoafe())) return false;
    if (!getKhaomhhkaeh()
        .equals(other.getKhaomhhkaeh())) return false;
    if (getHnncljlomgd()
        != other.getHnncljlomgd()) return false;
    if (!getKgkmnojcgnl()
        .equals(other.getKgkmnojcgnl())) return false;
    if (!getLnhoagbbbnn()
        .equals(other.getLnhoagbbbnn())) return false;
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
    hash = (37 * hash) + LCAJJPMOAFE_FIELD_NUMBER;
    hash = (53 * hash) + getLcajjpmoafe().hashCode();
    hash = (37 * hash) + KHAOMHHKAEH_FIELD_NUMBER;
    hash = (53 * hash) + getKhaomhhkaeh().hashCode();
    hash = (37 * hash) + HNNCLJLOMGD_FIELD_NUMBER;
    hash = (53 * hash) + getHnncljlomgd();
    hash = (37 * hash) + KGKMNOJCGNL_FIELD_NUMBER;
    hash = (53 * hash) + getKgkmnojcgnl().hashCode();
    hash = (37 * hash) + LNHOAGBBBNN_FIELD_NUMBER;
    hash = (53 * hash) + getLnhoagbbbnn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDBOPNGEDFP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FDBOPNGEDFP prototype) {
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
   * ref: FDBOPNGEDFP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FDBOPNGEDFP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FDBOPNGEDFP)
      POGOProtos.Rpc.FDBOPNGEDFPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDBOPNGEDFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDBOPNGEDFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FDBOPNGEDFP.class, POGOProtos.Rpc.FDBOPNGEDFP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FDBOPNGEDFP.newBuilder()
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
      lcajjpmoafe_ = "";

      khaomhhkaeh_ = "";

      hnncljlomgd_ = 0;

      kgkmnojcgnl_ = "";

      lnhoagbbbnn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDBOPNGEDFP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDBOPNGEDFP getDefaultInstanceForType() {
      return POGOProtos.Rpc.FDBOPNGEDFP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDBOPNGEDFP build() {
      POGOProtos.Rpc.FDBOPNGEDFP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDBOPNGEDFP buildPartial() {
      POGOProtos.Rpc.FDBOPNGEDFP result = new POGOProtos.Rpc.FDBOPNGEDFP(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      result.khaomhhkaeh_ = khaomhhkaeh_;
      result.hnncljlomgd_ = hnncljlomgd_;
      result.kgkmnojcgnl_ = kgkmnojcgnl_;
      result.lnhoagbbbnn_ = lnhoagbbbnn_;
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
      if (other instanceof POGOProtos.Rpc.FDBOPNGEDFP) {
        return mergeFrom((POGOProtos.Rpc.FDBOPNGEDFP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FDBOPNGEDFP other) {
      if (other == POGOProtos.Rpc.FDBOPNGEDFP.getDefaultInstance()) return this;
      if (!other.getLcajjpmoafe().isEmpty()) {
        lcajjpmoafe_ = other.lcajjpmoafe_;
        onChanged();
      }
      if (!other.getKhaomhhkaeh().isEmpty()) {
        khaomhhkaeh_ = other.khaomhhkaeh_;
        onChanged();
      }
      if (other.getHnncljlomgd() != 0) {
        setHnncljlomgd(other.getHnncljlomgd());
      }
      if (!other.getKgkmnojcgnl().isEmpty()) {
        kgkmnojcgnl_ = other.kgkmnojcgnl_;
        onChanged();
      }
      if (!other.getLnhoagbbbnn().isEmpty()) {
        lnhoagbbbnn_ = other.lnhoagbbbnn_;
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
      POGOProtos.Rpc.FDBOPNGEDFP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FDBOPNGEDFP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lcajjpmoafe_ = "";
    /**
     * <code>string lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    public java.lang.String getLcajjpmoafe() {
      java.lang.Object ref = lcajjpmoafe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lcajjpmoafe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lcajjpmoafe = 1;</code>
     * @return The bytes for lcajjpmoafe.
     */
    public com.google.protobuf.ByteString
        getLcajjpmoafeBytes() {
      java.lang.Object ref = lcajjpmoafe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lcajjpmoafe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = getDefaultInstance().getLcajjpmoafe();
      onChanged();
      return this;
    }
    /**
     * <code>string lcajjpmoafe = 1;</code>
     * @param value The bytes for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object khaomhhkaeh_ = "";
    /**
     * <code>string khaomhhkaeh = 2;</code>
     * @return The khaomhhkaeh.
     */
    public java.lang.String getKhaomhhkaeh() {
      java.lang.Object ref = khaomhhkaeh_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        khaomhhkaeh_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string khaomhhkaeh = 2;</code>
     * @return The bytes for khaomhhkaeh.
     */
    public com.google.protobuf.ByteString
        getKhaomhhkaehBytes() {
      java.lang.Object ref = khaomhhkaeh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        khaomhhkaeh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string khaomhhkaeh = 2;</code>
     * @param value The khaomhhkaeh to set.
     * @return This builder for chaining.
     */
    public Builder setKhaomhhkaeh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      khaomhhkaeh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string khaomhhkaeh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKhaomhhkaeh() {
      
      khaomhhkaeh_ = getDefaultInstance().getKhaomhhkaeh();
      onChanged();
      return this;
    }
    /**
     * <code>string khaomhhkaeh = 2;</code>
     * @param value The bytes for khaomhhkaeh to set.
     * @return This builder for chaining.
     */
    public Builder setKhaomhhkaehBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      khaomhhkaeh_ = value;
      onChanged();
      return this;
    }

    private int hnncljlomgd_ ;
    /**
     * <code>int32 hnncljlomgd = 3;</code>
     * @return The hnncljlomgd.
     */
    @java.lang.Override
    public int getHnncljlomgd() {
      return hnncljlomgd_;
    }
    /**
     * <code>int32 hnncljlomgd = 3;</code>
     * @param value The hnncljlomgd to set.
     * @return This builder for chaining.
     */
    public Builder setHnncljlomgd(int value) {
      
      hnncljlomgd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hnncljlomgd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHnncljlomgd() {
      
      hnncljlomgd_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object kgkmnojcgnl_ = "";
    /**
     * <code>string kgkmnojcgnl = 4;</code>
     * @return The kgkmnojcgnl.
     */
    public java.lang.String getKgkmnojcgnl() {
      java.lang.Object ref = kgkmnojcgnl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kgkmnojcgnl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kgkmnojcgnl = 4;</code>
     * @return The bytes for kgkmnojcgnl.
     */
    public com.google.protobuf.ByteString
        getKgkmnojcgnlBytes() {
      java.lang.Object ref = kgkmnojcgnl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kgkmnojcgnl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kgkmnojcgnl = 4;</code>
     * @param value The kgkmnojcgnl to set.
     * @return This builder for chaining.
     */
    public Builder setKgkmnojcgnl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kgkmnojcgnl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kgkmnojcgnl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKgkmnojcgnl() {
      
      kgkmnojcgnl_ = getDefaultInstance().getKgkmnojcgnl();
      onChanged();
      return this;
    }
    /**
     * <code>string kgkmnojcgnl = 4;</code>
     * @param value The bytes for kgkmnojcgnl to set.
     * @return This builder for chaining.
     */
    public Builder setKgkmnojcgnlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kgkmnojcgnl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lnhoagbbbnn_ = "";
    /**
     * <code>string lnhoagbbbnn = 5;</code>
     * @return The lnhoagbbbnn.
     */
    public java.lang.String getLnhoagbbbnn() {
      java.lang.Object ref = lnhoagbbbnn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lnhoagbbbnn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lnhoagbbbnn = 5;</code>
     * @return The bytes for lnhoagbbbnn.
     */
    public com.google.protobuf.ByteString
        getLnhoagbbbnnBytes() {
      java.lang.Object ref = lnhoagbbbnn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lnhoagbbbnn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lnhoagbbbnn = 5;</code>
     * @param value The lnhoagbbbnn to set.
     * @return This builder for chaining.
     */
    public Builder setLnhoagbbbnn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lnhoagbbbnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lnhoagbbbnn = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLnhoagbbbnn() {
      
      lnhoagbbbnn_ = getDefaultInstance().getLnhoagbbbnn();
      onChanged();
      return this;
    }
    /**
     * <code>string lnhoagbbbnn = 5;</code>
     * @param value The bytes for lnhoagbbbnn to set.
     * @return This builder for chaining.
     */
    public Builder setLnhoagbbbnnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lnhoagbbbnn_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FDBOPNGEDFP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FDBOPNGEDFP)
  private static final POGOProtos.Rpc.FDBOPNGEDFP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FDBOPNGEDFP();
  }

  public static POGOProtos.Rpc.FDBOPNGEDFP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FDBOPNGEDFP>
      PARSER = new com.google.protobuf.AbstractParser<FDBOPNGEDFP>() {
    @java.lang.Override
    public FDBOPNGEDFP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FDBOPNGEDFP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FDBOPNGEDFP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FDBOPNGEDFP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FDBOPNGEDFP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

