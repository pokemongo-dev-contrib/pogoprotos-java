// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JMAHCBKHKJP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JMAHCBKHKJP}
 */
public  final class JMAHCBKHKJP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JMAHCBKHKJP)
    JMAHCBKHKJPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JMAHCBKHKJP.newBuilder() to construct.
  private JMAHCBKHKJP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JMAHCBKHKJP() {
    dflicbnjoap_ = 0;
    jfbdopempfp_ = "";
    dfgbiiinaoi_ = "";
    gcaclpilpeh_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JMAHCBKHKJP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JMAHCBKHKJP(
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

            dflicbnjoap_ = rawValue;
            break;
          }
          case 16: {

            ojafklaemmg_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            jfbdopempfp_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dfgbiiinaoi_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            gcaclpilpeh_ = s;
            break;
          }
          case 48: {

            icjgocelldd_ = input.readInt64();
            break;
          }
          case 56: {

            mkkgleafmap_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JMAHCBKHKJP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JMAHCBKHKJP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JMAHCBKHKJP.class, POGOProtos.Rpc.JMAHCBKHKJP.Builder.class);
  }

  public static final int DFLICBNJOAP_FIELD_NUMBER = 1;
  private int dflicbnjoap_;
  /**
   * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
   * @return The enum numeric value on the wire for dflicbnjoap.
   */
  public int getDflicbnjoapValue() {
    return dflicbnjoap_;
  }
  /**
   * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
   * @return The dflicbnjoap.
   */
  public POGOProtos.Rpc.HCGPCEADABI getDflicbnjoap() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HCGPCEADABI result = POGOProtos.Rpc.HCGPCEADABI.valueOf(dflicbnjoap_);
    return result == null ? POGOProtos.Rpc.HCGPCEADABI.UNRECOGNIZED : result;
  }

  public static final int OJAFKLAEMMG_FIELD_NUMBER = 2;
  private long ojafklaemmg_;
  /**
   * <code>int64 ojafklaemmg = 2;</code>
   * @return The ojafklaemmg.
   */
  public long getOjafklaemmg() {
    return ojafklaemmg_;
  }

  public static final int JFBDOPEMPFP_FIELD_NUMBER = 3;
  private volatile java.lang.Object jfbdopempfp_;
  /**
   * <code>string jfbdopempfp = 3;</code>
   * @return The jfbdopempfp.
   */
  public java.lang.String getJfbdopempfp() {
    java.lang.Object ref = jfbdopempfp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jfbdopempfp_ = s;
      return s;
    }
  }
  /**
   * <code>string jfbdopempfp = 3;</code>
   * @return The bytes for jfbdopempfp.
   */
  public com.google.protobuf.ByteString
      getJfbdopempfpBytes() {
    java.lang.Object ref = jfbdopempfp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jfbdopempfp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DFGBIIINAOI_FIELD_NUMBER = 4;
  private volatile java.lang.Object dfgbiiinaoi_;
  /**
   * <code>string dfgbiiinaoi = 4;</code>
   * @return The dfgbiiinaoi.
   */
  public java.lang.String getDfgbiiinaoi() {
    java.lang.Object ref = dfgbiiinaoi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dfgbiiinaoi_ = s;
      return s;
    }
  }
  /**
   * <code>string dfgbiiinaoi = 4;</code>
   * @return The bytes for dfgbiiinaoi.
   */
  public com.google.protobuf.ByteString
      getDfgbiiinaoiBytes() {
    java.lang.Object ref = dfgbiiinaoi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dfgbiiinaoi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCACLPILPEH_FIELD_NUMBER = 5;
  private volatile java.lang.Object gcaclpilpeh_;
  /**
   * <code>string gcaclpilpeh = 5;</code>
   * @return The gcaclpilpeh.
   */
  public java.lang.String getGcaclpilpeh() {
    java.lang.Object ref = gcaclpilpeh_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcaclpilpeh_ = s;
      return s;
    }
  }
  /**
   * <code>string gcaclpilpeh = 5;</code>
   * @return The bytes for gcaclpilpeh.
   */
  public com.google.protobuf.ByteString
      getGcaclpilpehBytes() {
    java.lang.Object ref = gcaclpilpeh_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcaclpilpeh_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICJGOCELLDD_FIELD_NUMBER = 6;
  private long icjgocelldd_;
  /**
   * <code>int64 icjgocelldd = 6;</code>
   * @return The icjgocelldd.
   */
  public long getIcjgocelldd() {
    return icjgocelldd_;
  }

  public static final int MKKGLEAFMAP_FIELD_NUMBER = 7;
  private long mkkgleafmap_;
  /**
   * <code>int64 mkkgleafmap = 7;</code>
   * @return The mkkgleafmap.
   */
  public long getMkkgleafmap() {
    return mkkgleafmap_;
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
    if (dflicbnjoap_ != POGOProtos.Rpc.HCGPCEADABI.HCGPCEADABI_BADGE_UNSET.getNumber()) {
      output.writeEnum(1, dflicbnjoap_);
    }
    if (ojafklaemmg_ != 0L) {
      output.writeInt64(2, ojafklaemmg_);
    }
    if (!getJfbdopempfpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jfbdopempfp_);
    }
    if (!getDfgbiiinaoiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dfgbiiinaoi_);
    }
    if (!getGcaclpilpehBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gcaclpilpeh_);
    }
    if (icjgocelldd_ != 0L) {
      output.writeInt64(6, icjgocelldd_);
    }
    if (mkkgleafmap_ != 0L) {
      output.writeInt64(7, mkkgleafmap_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dflicbnjoap_ != POGOProtos.Rpc.HCGPCEADABI.HCGPCEADABI_BADGE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dflicbnjoap_);
    }
    if (ojafklaemmg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, ojafklaemmg_);
    }
    if (!getJfbdopempfpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jfbdopempfp_);
    }
    if (!getDfgbiiinaoiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dfgbiiinaoi_);
    }
    if (!getGcaclpilpehBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gcaclpilpeh_);
    }
    if (icjgocelldd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, icjgocelldd_);
    }
    if (mkkgleafmap_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, mkkgleafmap_);
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
    if (!(obj instanceof POGOProtos.Rpc.JMAHCBKHKJP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JMAHCBKHKJP other = (POGOProtos.Rpc.JMAHCBKHKJP) obj;

    if (dflicbnjoap_ != other.dflicbnjoap_) return false;
    if (getOjafklaemmg()
        != other.getOjafklaemmg()) return false;
    if (!getJfbdopempfp()
        .equals(other.getJfbdopempfp())) return false;
    if (!getDfgbiiinaoi()
        .equals(other.getDfgbiiinaoi())) return false;
    if (!getGcaclpilpeh()
        .equals(other.getGcaclpilpeh())) return false;
    if (getIcjgocelldd()
        != other.getIcjgocelldd()) return false;
    if (getMkkgleafmap()
        != other.getMkkgleafmap()) return false;
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
    hash = (37 * hash) + DFLICBNJOAP_FIELD_NUMBER;
    hash = (53 * hash) + dflicbnjoap_;
    hash = (37 * hash) + OJAFKLAEMMG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOjafklaemmg());
    hash = (37 * hash) + JFBDOPEMPFP_FIELD_NUMBER;
    hash = (53 * hash) + getJfbdopempfp().hashCode();
    hash = (37 * hash) + DFGBIIINAOI_FIELD_NUMBER;
    hash = (53 * hash) + getDfgbiiinaoi().hashCode();
    hash = (37 * hash) + GCACLPILPEH_FIELD_NUMBER;
    hash = (53 * hash) + getGcaclpilpeh().hashCode();
    hash = (37 * hash) + ICJGOCELLDD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIcjgocelldd());
    hash = (37 * hash) + MKKGLEAFMAP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMkkgleafmap());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMAHCBKHKJP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JMAHCBKHKJP prototype) {
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
   * ref: JMAHCBKHKJP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JMAHCBKHKJP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JMAHCBKHKJP)
      POGOProtos.Rpc.JMAHCBKHKJPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JMAHCBKHKJP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JMAHCBKHKJP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JMAHCBKHKJP.class, POGOProtos.Rpc.JMAHCBKHKJP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JMAHCBKHKJP.newBuilder()
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
      dflicbnjoap_ = 0;

      ojafklaemmg_ = 0L;

      jfbdopempfp_ = "";

      dfgbiiinaoi_ = "";

      gcaclpilpeh_ = "";

      icjgocelldd_ = 0L;

      mkkgleafmap_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JMAHCBKHKJP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMAHCBKHKJP getDefaultInstanceForType() {
      return POGOProtos.Rpc.JMAHCBKHKJP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMAHCBKHKJP build() {
      POGOProtos.Rpc.JMAHCBKHKJP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMAHCBKHKJP buildPartial() {
      POGOProtos.Rpc.JMAHCBKHKJP result = new POGOProtos.Rpc.JMAHCBKHKJP(this);
      result.dflicbnjoap_ = dflicbnjoap_;
      result.ojafklaemmg_ = ojafklaemmg_;
      result.jfbdopempfp_ = jfbdopempfp_;
      result.dfgbiiinaoi_ = dfgbiiinaoi_;
      result.gcaclpilpeh_ = gcaclpilpeh_;
      result.icjgocelldd_ = icjgocelldd_;
      result.mkkgleafmap_ = mkkgleafmap_;
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
      if (other instanceof POGOProtos.Rpc.JMAHCBKHKJP) {
        return mergeFrom((POGOProtos.Rpc.JMAHCBKHKJP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JMAHCBKHKJP other) {
      if (other == POGOProtos.Rpc.JMAHCBKHKJP.getDefaultInstance()) return this;
      if (other.dflicbnjoap_ != 0) {
        setDflicbnjoapValue(other.getDflicbnjoapValue());
      }
      if (other.getOjafklaemmg() != 0L) {
        setOjafklaemmg(other.getOjafklaemmg());
      }
      if (!other.getJfbdopempfp().isEmpty()) {
        jfbdopempfp_ = other.jfbdopempfp_;
        onChanged();
      }
      if (!other.getDfgbiiinaoi().isEmpty()) {
        dfgbiiinaoi_ = other.dfgbiiinaoi_;
        onChanged();
      }
      if (!other.getGcaclpilpeh().isEmpty()) {
        gcaclpilpeh_ = other.gcaclpilpeh_;
        onChanged();
      }
      if (other.getIcjgocelldd() != 0L) {
        setIcjgocelldd(other.getIcjgocelldd());
      }
      if (other.getMkkgleafmap() != 0L) {
        setMkkgleafmap(other.getMkkgleafmap());
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
      POGOProtos.Rpc.JMAHCBKHKJP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JMAHCBKHKJP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dflicbnjoap_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
     * @return The enum numeric value on the wire for dflicbnjoap.
     */
    public int getDflicbnjoapValue() {
      return dflicbnjoap_;
    }
    /**
     * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
     * @param value The enum numeric value on the wire for dflicbnjoap to set.
     * @return This builder for chaining.
     */
    public Builder setDflicbnjoapValue(int value) {
      dflicbnjoap_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
     * @return The dflicbnjoap.
     */
    public POGOProtos.Rpc.HCGPCEADABI getDflicbnjoap() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HCGPCEADABI result = POGOProtos.Rpc.HCGPCEADABI.valueOf(dflicbnjoap_);
      return result == null ? POGOProtos.Rpc.HCGPCEADABI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
     * @param value The dflicbnjoap to set.
     * @return This builder for chaining.
     */
    public Builder setDflicbnjoap(POGOProtos.Rpc.HCGPCEADABI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dflicbnjoap_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HCGPCEADABI dflicbnjoap = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDflicbnjoap() {
      
      dflicbnjoap_ = 0;
      onChanged();
      return this;
    }

    private long ojafklaemmg_ ;
    /**
     * <code>int64 ojafklaemmg = 2;</code>
     * @return The ojafklaemmg.
     */
    public long getOjafklaemmg() {
      return ojafklaemmg_;
    }
    /**
     * <code>int64 ojafklaemmg = 2;</code>
     * @param value The ojafklaemmg to set.
     * @return This builder for chaining.
     */
    public Builder setOjafklaemmg(long value) {
      
      ojafklaemmg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ojafklaemmg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjafklaemmg() {
      
      ojafklaemmg_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object jfbdopempfp_ = "";
    /**
     * <code>string jfbdopempfp = 3;</code>
     * @return The jfbdopempfp.
     */
    public java.lang.String getJfbdopempfp() {
      java.lang.Object ref = jfbdopempfp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jfbdopempfp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jfbdopempfp = 3;</code>
     * @return The bytes for jfbdopempfp.
     */
    public com.google.protobuf.ByteString
        getJfbdopempfpBytes() {
      java.lang.Object ref = jfbdopempfp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jfbdopempfp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jfbdopempfp = 3;</code>
     * @param value The jfbdopempfp to set.
     * @return This builder for chaining.
     */
    public Builder setJfbdopempfp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jfbdopempfp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jfbdopempfp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfbdopempfp() {
      
      jfbdopempfp_ = getDefaultInstance().getJfbdopempfp();
      onChanged();
      return this;
    }
    /**
     * <code>string jfbdopempfp = 3;</code>
     * @param value The bytes for jfbdopempfp to set.
     * @return This builder for chaining.
     */
    public Builder setJfbdopempfpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jfbdopempfp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dfgbiiinaoi_ = "";
    /**
     * <code>string dfgbiiinaoi = 4;</code>
     * @return The dfgbiiinaoi.
     */
    public java.lang.String getDfgbiiinaoi() {
      java.lang.Object ref = dfgbiiinaoi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dfgbiiinaoi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dfgbiiinaoi = 4;</code>
     * @return The bytes for dfgbiiinaoi.
     */
    public com.google.protobuf.ByteString
        getDfgbiiinaoiBytes() {
      java.lang.Object ref = dfgbiiinaoi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dfgbiiinaoi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dfgbiiinaoi = 4;</code>
     * @param value The dfgbiiinaoi to set.
     * @return This builder for chaining.
     */
    public Builder setDfgbiiinaoi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dfgbiiinaoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dfgbiiinaoi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDfgbiiinaoi() {
      
      dfgbiiinaoi_ = getDefaultInstance().getDfgbiiinaoi();
      onChanged();
      return this;
    }
    /**
     * <code>string dfgbiiinaoi = 4;</code>
     * @param value The bytes for dfgbiiinaoi to set.
     * @return This builder for chaining.
     */
    public Builder setDfgbiiinaoiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dfgbiiinaoi_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gcaclpilpeh_ = "";
    /**
     * <code>string gcaclpilpeh = 5;</code>
     * @return The gcaclpilpeh.
     */
    public java.lang.String getGcaclpilpeh() {
      java.lang.Object ref = gcaclpilpeh_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcaclpilpeh_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gcaclpilpeh = 5;</code>
     * @return The bytes for gcaclpilpeh.
     */
    public com.google.protobuf.ByteString
        getGcaclpilpehBytes() {
      java.lang.Object ref = gcaclpilpeh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcaclpilpeh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gcaclpilpeh = 5;</code>
     * @param value The gcaclpilpeh to set.
     * @return This builder for chaining.
     */
    public Builder setGcaclpilpeh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gcaclpilpeh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gcaclpilpeh = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcaclpilpeh() {
      
      gcaclpilpeh_ = getDefaultInstance().getGcaclpilpeh();
      onChanged();
      return this;
    }
    /**
     * <code>string gcaclpilpeh = 5;</code>
     * @param value The bytes for gcaclpilpeh to set.
     * @return This builder for chaining.
     */
    public Builder setGcaclpilpehBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gcaclpilpeh_ = value;
      onChanged();
      return this;
    }

    private long icjgocelldd_ ;
    /**
     * <code>int64 icjgocelldd = 6;</code>
     * @return The icjgocelldd.
     */
    public long getIcjgocelldd() {
      return icjgocelldd_;
    }
    /**
     * <code>int64 icjgocelldd = 6;</code>
     * @param value The icjgocelldd to set.
     * @return This builder for chaining.
     */
    public Builder setIcjgocelldd(long value) {
      
      icjgocelldd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 icjgocelldd = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcjgocelldd() {
      
      icjgocelldd_ = 0L;
      onChanged();
      return this;
    }

    private long mkkgleafmap_ ;
    /**
     * <code>int64 mkkgleafmap = 7;</code>
     * @return The mkkgleafmap.
     */
    public long getMkkgleafmap() {
      return mkkgleafmap_;
    }
    /**
     * <code>int64 mkkgleafmap = 7;</code>
     * @param value The mkkgleafmap to set.
     * @return This builder for chaining.
     */
    public Builder setMkkgleafmap(long value) {
      
      mkkgleafmap_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mkkgleafmap = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMkkgleafmap() {
      
      mkkgleafmap_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JMAHCBKHKJP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JMAHCBKHKJP)
  private static final POGOProtos.Rpc.JMAHCBKHKJP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JMAHCBKHKJP();
  }

  public static POGOProtos.Rpc.JMAHCBKHKJP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JMAHCBKHKJP>
      PARSER = new com.google.protobuf.AbstractParser<JMAHCBKHKJP>() {
    @java.lang.Override
    public JMAHCBKHKJP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JMAHCBKHKJP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JMAHCBKHKJP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JMAHCBKHKJP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JMAHCBKHKJP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

