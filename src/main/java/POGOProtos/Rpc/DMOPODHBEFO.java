// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DMOPODHBEFO}
 */
public  final class DMOPODHBEFO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DMOPODHBEFO)
    DMOPODHBEFOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DMOPODHBEFO.newBuilder() to construct.
  private DMOPODHBEFO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DMOPODHBEFO() {
    bdlijolgmfc_ = "";
    oigkepbfhdp_ = "";
    dlangcndbfi_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DMOPODHBEFO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DMOPODHBEFO(
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

            ienkdjaghfd_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bdlijolgmfc_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            oigkepbfhdp_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dlangcndbfi_ = s;
            break;
          }
          case 41: {

            kggafakoilo_ = input.readDouble();
            break;
          }
          case 49: {

            bimcfcdilla_ = input.readDouble();
            break;
          }
          case 56: {

            kbfignbmclb_ = input.readInt64();
            break;
          }
          case 64: {

            gedaaamghfg_ = input.readInt64();
            break;
          }
          case 72: {

            mjghknnnemp_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMOPODHBEFO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMOPODHBEFO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DMOPODHBEFO.class, POGOProtos.Rpc.DMOPODHBEFO.Builder.class);
  }

  public static final int IENKDJAGHFD_FIELD_NUMBER = 1;
  private long ienkdjaghfd_;
  /**
   * <code>uint64 ienkdjaghfd = 1;</code>
   * @return The ienkdjaghfd.
   */
  public long getIenkdjaghfd() {
    return ienkdjaghfd_;
  }

  public static final int BDLIJOLGMFC_FIELD_NUMBER = 2;
  private volatile java.lang.Object bdlijolgmfc_;
  /**
   * <code>string bdlijolgmfc = 2;</code>
   * @return The bdlijolgmfc.
   */
  public java.lang.String getBdlijolgmfc() {
    java.lang.Object ref = bdlijolgmfc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bdlijolgmfc_ = s;
      return s;
    }
  }
  /**
   * <code>string bdlijolgmfc = 2;</code>
   * @return The bytes for bdlijolgmfc.
   */
  public com.google.protobuf.ByteString
      getBdlijolgmfcBytes() {
    java.lang.Object ref = bdlijolgmfc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bdlijolgmfc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OIGKEPBFHDP_FIELD_NUMBER = 3;
  private volatile java.lang.Object oigkepbfhdp_;
  /**
   * <code>string oigkepbfhdp = 3;</code>
   * @return The oigkepbfhdp.
   */
  public java.lang.String getOigkepbfhdp() {
    java.lang.Object ref = oigkepbfhdp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oigkepbfhdp_ = s;
      return s;
    }
  }
  /**
   * <code>string oigkepbfhdp = 3;</code>
   * @return The bytes for oigkepbfhdp.
   */
  public com.google.protobuf.ByteString
      getOigkepbfhdpBytes() {
    java.lang.Object ref = oigkepbfhdp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oigkepbfhdp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DLANGCNDBFI_FIELD_NUMBER = 4;
  private volatile java.lang.Object dlangcndbfi_;
  /**
   * <code>string dlangcndbfi = 4;</code>
   * @return The dlangcndbfi.
   */
  public java.lang.String getDlangcndbfi() {
    java.lang.Object ref = dlangcndbfi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dlangcndbfi_ = s;
      return s;
    }
  }
  /**
   * <code>string dlangcndbfi = 4;</code>
   * @return The bytes for dlangcndbfi.
   */
  public com.google.protobuf.ByteString
      getDlangcndbfiBytes() {
    java.lang.Object ref = dlangcndbfi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dlangcndbfi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KGGAFAKOILO_FIELD_NUMBER = 5;
  private double kggafakoilo_;
  /**
   * <code>double kggafakoilo = 5;</code>
   * @return The kggafakoilo.
   */
  public double getKggafakoilo() {
    return kggafakoilo_;
  }

  public static final int BIMCFCDILLA_FIELD_NUMBER = 6;
  private double bimcfcdilla_;
  /**
   * <code>double bimcfcdilla = 6;</code>
   * @return The bimcfcdilla.
   */
  public double getBimcfcdilla() {
    return bimcfcdilla_;
  }

  public static final int KBFIGNBMCLB_FIELD_NUMBER = 7;
  private long kbfignbmclb_;
  /**
   * <code>int64 kbfignbmclb = 7;</code>
   * @return The kbfignbmclb.
   */
  public long getKbfignbmclb() {
    return kbfignbmclb_;
  }

  public static final int GEDAAAMGHFG_FIELD_NUMBER = 8;
  private long gedaaamghfg_;
  /**
   * <code>int64 gedaaamghfg = 8;</code>
   * @return The gedaaamghfg.
   */
  public long getGedaaamghfg() {
    return gedaaamghfg_;
  }

  public static final int MJGHKNNNEMP_FIELD_NUMBER = 9;
  private long mjghknnnemp_;
  /**
   * <code>int64 mjghknnnemp = 9;</code>
   * @return The mjghknnnemp.
   */
  public long getMjghknnnemp() {
    return mjghknnnemp_;
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
    if (ienkdjaghfd_ != 0L) {
      output.writeUInt64(1, ienkdjaghfd_);
    }
    if (!getBdlijolgmfcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bdlijolgmfc_);
    }
    if (!getOigkepbfhdpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, oigkepbfhdp_);
    }
    if (!getDlangcndbfiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dlangcndbfi_);
    }
    if (kggafakoilo_ != 0D) {
      output.writeDouble(5, kggafakoilo_);
    }
    if (bimcfcdilla_ != 0D) {
      output.writeDouble(6, bimcfcdilla_);
    }
    if (kbfignbmclb_ != 0L) {
      output.writeInt64(7, kbfignbmclb_);
    }
    if (gedaaamghfg_ != 0L) {
      output.writeInt64(8, gedaaamghfg_);
    }
    if (mjghknnnemp_ != 0L) {
      output.writeInt64(9, mjghknnnemp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ienkdjaghfd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ienkdjaghfd_);
    }
    if (!getBdlijolgmfcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bdlijolgmfc_);
    }
    if (!getOigkepbfhdpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, oigkepbfhdp_);
    }
    if (!getDlangcndbfiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dlangcndbfi_);
    }
    if (kggafakoilo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, kggafakoilo_);
    }
    if (bimcfcdilla_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, bimcfcdilla_);
    }
    if (kbfignbmclb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, kbfignbmclb_);
    }
    if (gedaaamghfg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, gedaaamghfg_);
    }
    if (mjghknnnemp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, mjghknnnemp_);
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
    if (!(obj instanceof POGOProtos.Rpc.DMOPODHBEFO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DMOPODHBEFO other = (POGOProtos.Rpc.DMOPODHBEFO) obj;

    if (getIenkdjaghfd()
        != other.getIenkdjaghfd()) return false;
    if (!getBdlijolgmfc()
        .equals(other.getBdlijolgmfc())) return false;
    if (!getOigkepbfhdp()
        .equals(other.getOigkepbfhdp())) return false;
    if (!getDlangcndbfi()
        .equals(other.getDlangcndbfi())) return false;
    if (java.lang.Double.doubleToLongBits(getKggafakoilo())
        != java.lang.Double.doubleToLongBits(
            other.getKggafakoilo())) return false;
    if (java.lang.Double.doubleToLongBits(getBimcfcdilla())
        != java.lang.Double.doubleToLongBits(
            other.getBimcfcdilla())) return false;
    if (getKbfignbmclb()
        != other.getKbfignbmclb()) return false;
    if (getGedaaamghfg()
        != other.getGedaaamghfg()) return false;
    if (getMjghknnnemp()
        != other.getMjghknnnemp()) return false;
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
    hash = (37 * hash) + IENKDJAGHFD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIenkdjaghfd());
    hash = (37 * hash) + BDLIJOLGMFC_FIELD_NUMBER;
    hash = (53 * hash) + getBdlijolgmfc().hashCode();
    hash = (37 * hash) + OIGKEPBFHDP_FIELD_NUMBER;
    hash = (53 * hash) + getOigkepbfhdp().hashCode();
    hash = (37 * hash) + DLANGCNDBFI_FIELD_NUMBER;
    hash = (53 * hash) + getDlangcndbfi().hashCode();
    hash = (37 * hash) + KGGAFAKOILO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKggafakoilo()));
    hash = (37 * hash) + BIMCFCDILLA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBimcfcdilla()));
    hash = (37 * hash) + KBFIGNBMCLB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKbfignbmclb());
    hash = (37 * hash) + GEDAAAMGHFG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGedaaamghfg());
    hash = (37 * hash) + MJGHKNNNEMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMjghknnnemp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMOPODHBEFO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DMOPODHBEFO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DMOPODHBEFO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DMOPODHBEFO)
      POGOProtos.Rpc.DMOPODHBEFOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMOPODHBEFO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMOPODHBEFO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DMOPODHBEFO.class, POGOProtos.Rpc.DMOPODHBEFO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DMOPODHBEFO.newBuilder()
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
      ienkdjaghfd_ = 0L;

      bdlijolgmfc_ = "";

      oigkepbfhdp_ = "";

      dlangcndbfi_ = "";

      kggafakoilo_ = 0D;

      bimcfcdilla_ = 0D;

      kbfignbmclb_ = 0L;

      gedaaamghfg_ = 0L;

      mjghknnnemp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMOPODHBEFO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMOPODHBEFO getDefaultInstanceForType() {
      return POGOProtos.Rpc.DMOPODHBEFO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMOPODHBEFO build() {
      POGOProtos.Rpc.DMOPODHBEFO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMOPODHBEFO buildPartial() {
      POGOProtos.Rpc.DMOPODHBEFO result = new POGOProtos.Rpc.DMOPODHBEFO(this);
      result.ienkdjaghfd_ = ienkdjaghfd_;
      result.bdlijolgmfc_ = bdlijolgmfc_;
      result.oigkepbfhdp_ = oigkepbfhdp_;
      result.dlangcndbfi_ = dlangcndbfi_;
      result.kggafakoilo_ = kggafakoilo_;
      result.bimcfcdilla_ = bimcfcdilla_;
      result.kbfignbmclb_ = kbfignbmclb_;
      result.gedaaamghfg_ = gedaaamghfg_;
      result.mjghknnnemp_ = mjghknnnemp_;
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
      if (other instanceof POGOProtos.Rpc.DMOPODHBEFO) {
        return mergeFrom((POGOProtos.Rpc.DMOPODHBEFO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DMOPODHBEFO other) {
      if (other == POGOProtos.Rpc.DMOPODHBEFO.getDefaultInstance()) return this;
      if (other.getIenkdjaghfd() != 0L) {
        setIenkdjaghfd(other.getIenkdjaghfd());
      }
      if (!other.getBdlijolgmfc().isEmpty()) {
        bdlijolgmfc_ = other.bdlijolgmfc_;
        onChanged();
      }
      if (!other.getOigkepbfhdp().isEmpty()) {
        oigkepbfhdp_ = other.oigkepbfhdp_;
        onChanged();
      }
      if (!other.getDlangcndbfi().isEmpty()) {
        dlangcndbfi_ = other.dlangcndbfi_;
        onChanged();
      }
      if (other.getKggafakoilo() != 0D) {
        setKggafakoilo(other.getKggafakoilo());
      }
      if (other.getBimcfcdilla() != 0D) {
        setBimcfcdilla(other.getBimcfcdilla());
      }
      if (other.getKbfignbmclb() != 0L) {
        setKbfignbmclb(other.getKbfignbmclb());
      }
      if (other.getGedaaamghfg() != 0L) {
        setGedaaamghfg(other.getGedaaamghfg());
      }
      if (other.getMjghknnnemp() != 0L) {
        setMjghknnnemp(other.getMjghknnnemp());
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
      POGOProtos.Rpc.DMOPODHBEFO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DMOPODHBEFO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ienkdjaghfd_ ;
    /**
     * <code>uint64 ienkdjaghfd = 1;</code>
     * @return The ienkdjaghfd.
     */
    public long getIenkdjaghfd() {
      return ienkdjaghfd_;
    }
    /**
     * <code>uint64 ienkdjaghfd = 1;</code>
     * @param value The ienkdjaghfd to set.
     * @return This builder for chaining.
     */
    public Builder setIenkdjaghfd(long value) {
      
      ienkdjaghfd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ienkdjaghfd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIenkdjaghfd() {
      
      ienkdjaghfd_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object bdlijolgmfc_ = "";
    /**
     * <code>string bdlijolgmfc = 2;</code>
     * @return The bdlijolgmfc.
     */
    public java.lang.String getBdlijolgmfc() {
      java.lang.Object ref = bdlijolgmfc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bdlijolgmfc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bdlijolgmfc = 2;</code>
     * @return The bytes for bdlijolgmfc.
     */
    public com.google.protobuf.ByteString
        getBdlijolgmfcBytes() {
      java.lang.Object ref = bdlijolgmfc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bdlijolgmfc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bdlijolgmfc = 2;</code>
     * @param value The bdlijolgmfc to set.
     * @return This builder for chaining.
     */
    public Builder setBdlijolgmfc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bdlijolgmfc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bdlijolgmfc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdlijolgmfc() {
      
      bdlijolgmfc_ = getDefaultInstance().getBdlijolgmfc();
      onChanged();
      return this;
    }
    /**
     * <code>string bdlijolgmfc = 2;</code>
     * @param value The bytes for bdlijolgmfc to set.
     * @return This builder for chaining.
     */
    public Builder setBdlijolgmfcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bdlijolgmfc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object oigkepbfhdp_ = "";
    /**
     * <code>string oigkepbfhdp = 3;</code>
     * @return The oigkepbfhdp.
     */
    public java.lang.String getOigkepbfhdp() {
      java.lang.Object ref = oigkepbfhdp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oigkepbfhdp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oigkepbfhdp = 3;</code>
     * @return The bytes for oigkepbfhdp.
     */
    public com.google.protobuf.ByteString
        getOigkepbfhdpBytes() {
      java.lang.Object ref = oigkepbfhdp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oigkepbfhdp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oigkepbfhdp = 3;</code>
     * @param value The oigkepbfhdp to set.
     * @return This builder for chaining.
     */
    public Builder setOigkepbfhdp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oigkepbfhdp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string oigkepbfhdp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOigkepbfhdp() {
      
      oigkepbfhdp_ = getDefaultInstance().getOigkepbfhdp();
      onChanged();
      return this;
    }
    /**
     * <code>string oigkepbfhdp = 3;</code>
     * @param value The bytes for oigkepbfhdp to set.
     * @return This builder for chaining.
     */
    public Builder setOigkepbfhdpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oigkepbfhdp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dlangcndbfi_ = "";
    /**
     * <code>string dlangcndbfi = 4;</code>
     * @return The dlangcndbfi.
     */
    public java.lang.String getDlangcndbfi() {
      java.lang.Object ref = dlangcndbfi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dlangcndbfi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dlangcndbfi = 4;</code>
     * @return The bytes for dlangcndbfi.
     */
    public com.google.protobuf.ByteString
        getDlangcndbfiBytes() {
      java.lang.Object ref = dlangcndbfi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dlangcndbfi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dlangcndbfi = 4;</code>
     * @param value The dlangcndbfi to set.
     * @return This builder for chaining.
     */
    public Builder setDlangcndbfi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dlangcndbfi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dlangcndbfi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDlangcndbfi() {
      
      dlangcndbfi_ = getDefaultInstance().getDlangcndbfi();
      onChanged();
      return this;
    }
    /**
     * <code>string dlangcndbfi = 4;</code>
     * @param value The bytes for dlangcndbfi to set.
     * @return This builder for chaining.
     */
    public Builder setDlangcndbfiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dlangcndbfi_ = value;
      onChanged();
      return this;
    }

    private double kggafakoilo_ ;
    /**
     * <code>double kggafakoilo = 5;</code>
     * @return The kggafakoilo.
     */
    public double getKggafakoilo() {
      return kggafakoilo_;
    }
    /**
     * <code>double kggafakoilo = 5;</code>
     * @param value The kggafakoilo to set.
     * @return This builder for chaining.
     */
    public Builder setKggafakoilo(double value) {
      
      kggafakoilo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double kggafakoilo = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearKggafakoilo() {
      
      kggafakoilo_ = 0D;
      onChanged();
      return this;
    }

    private double bimcfcdilla_ ;
    /**
     * <code>double bimcfcdilla = 6;</code>
     * @return The bimcfcdilla.
     */
    public double getBimcfcdilla() {
      return bimcfcdilla_;
    }
    /**
     * <code>double bimcfcdilla = 6;</code>
     * @param value The bimcfcdilla to set.
     * @return This builder for chaining.
     */
    public Builder setBimcfcdilla(double value) {
      
      bimcfcdilla_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bimcfcdilla = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBimcfcdilla() {
      
      bimcfcdilla_ = 0D;
      onChanged();
      return this;
    }

    private long kbfignbmclb_ ;
    /**
     * <code>int64 kbfignbmclb = 7;</code>
     * @return The kbfignbmclb.
     */
    public long getKbfignbmclb() {
      return kbfignbmclb_;
    }
    /**
     * <code>int64 kbfignbmclb = 7;</code>
     * @param value The kbfignbmclb to set.
     * @return This builder for chaining.
     */
    public Builder setKbfignbmclb(long value) {
      
      kbfignbmclb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kbfignbmclb = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbfignbmclb() {
      
      kbfignbmclb_ = 0L;
      onChanged();
      return this;
    }

    private long gedaaamghfg_ ;
    /**
     * <code>int64 gedaaamghfg = 8;</code>
     * @return The gedaaamghfg.
     */
    public long getGedaaamghfg() {
      return gedaaamghfg_;
    }
    /**
     * <code>int64 gedaaamghfg = 8;</code>
     * @param value The gedaaamghfg to set.
     * @return This builder for chaining.
     */
    public Builder setGedaaamghfg(long value) {
      
      gedaaamghfg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gedaaamghfg = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearGedaaamghfg() {
      
      gedaaamghfg_ = 0L;
      onChanged();
      return this;
    }

    private long mjghknnnemp_ ;
    /**
     * <code>int64 mjghknnnemp = 9;</code>
     * @return The mjghknnnemp.
     */
    public long getMjghknnnemp() {
      return mjghknnnemp_;
    }
    /**
     * <code>int64 mjghknnnemp = 9;</code>
     * @param value The mjghknnnemp to set.
     * @return This builder for chaining.
     */
    public Builder setMjghknnnemp(long value) {
      
      mjghknnnemp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mjghknnnemp = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjghknnnemp() {
      
      mjghknnnemp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DMOPODHBEFO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DMOPODHBEFO)
  private static final POGOProtos.Rpc.DMOPODHBEFO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DMOPODHBEFO();
  }

  public static POGOProtos.Rpc.DMOPODHBEFO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DMOPODHBEFO>
      PARSER = new com.google.protobuf.AbstractParser<DMOPODHBEFO>() {
    @java.lang.Override
    public DMOPODHBEFO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DMOPODHBEFO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DMOPODHBEFO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DMOPODHBEFO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DMOPODHBEFO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

