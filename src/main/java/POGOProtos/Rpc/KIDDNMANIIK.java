// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KIDDNMANIIK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KIDDNMANIIK}
 */
public final class KIDDNMANIIK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KIDDNMANIIK)
    KIDDNMANIIKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KIDDNMANIIK.newBuilder() to construct.
  private KIDDNMANIIK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KIDDNMANIIK() {
    hiopeabpfei_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KIDDNMANIIK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KIDDNMANIIK(
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
            POGOProtos.Rpc.FDPJDLGIKKO.Builder subBuilder = null;
            if (ahlfnkfhffk_ != null) {
              subBuilder = ahlfnkfhffk_.toBuilder();
            }
            ahlfnkfhffk_ = input.readMessage(POGOProtos.Rpc.FDPJDLGIKKO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ahlfnkfhffk_);
              ahlfnkfhffk_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            bjfoeolcaeo_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hiopeabpfei_ = s;
            break;
          }
          case 34: {
            POGOProtos.Rpc.FDPJDLGIKKO.Builder subBuilder = null;
            if (mlcajcfjmga_ != null) {
              subBuilder = mlcajcfjmga_.toBuilder();
            }
            mlcajcfjmga_ = input.readMessage(POGOProtos.Rpc.FDPJDLGIKKO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mlcajcfjmga_);
              mlcajcfjmga_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            ajobgleaaae_ = input.readInt32();
            break;
          }
          case 48: {

            hphfcpibhed_ = input.readInt64();
            break;
          }
          case 56: {

            djppabfhijn_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIDDNMANIIK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIDDNMANIIK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KIDDNMANIIK.class, POGOProtos.Rpc.KIDDNMANIIK.Builder.class);
  }

  public static final int AHLFNKFHFFK_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk_;
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
   * @return Whether the ahlfnkfhffk field is set.
   */
  @java.lang.Override
  public boolean hasAhlfnkfhffk() {
    return ahlfnkfhffk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
   * @return The ahlfnkfhffk.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FDPJDLGIKKO getAhlfnkfhffk() {
    return ahlfnkfhffk_ == null ? POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : ahlfnkfhffk_;
  }
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FDPJDLGIKKOOrBuilder getAhlfnkfhffkOrBuilder() {
    return getAhlfnkfhffk();
  }

  public static final int BJFOEOLCAEO_FIELD_NUMBER = 2;
  private int bjfoeolcaeo_;
  /**
   * <code>int32 bjfoeolcaeo = 2;</code>
   * @return The bjfoeolcaeo.
   */
  @java.lang.Override
  public int getBjfoeolcaeo() {
    return bjfoeolcaeo_;
  }

  public static final int HIOPEABPFEI_FIELD_NUMBER = 3;
  private volatile java.lang.Object hiopeabpfei_;
  /**
   * <code>string hiopeabpfei = 3;</code>
   * @return The hiopeabpfei.
   */
  @java.lang.Override
  public java.lang.String getHiopeabpfei() {
    java.lang.Object ref = hiopeabpfei_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hiopeabpfei_ = s;
      return s;
    }
  }
  /**
   * <code>string hiopeabpfei = 3;</code>
   * @return The bytes for hiopeabpfei.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHiopeabpfeiBytes() {
    java.lang.Object ref = hiopeabpfei_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hiopeabpfei_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MLCAJCFJMGA_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga_;
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
   * @return Whether the mlcajcfjmga field is set.
   */
  @java.lang.Override
  public boolean hasMlcajcfjmga() {
    return mlcajcfjmga_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
   * @return The mlcajcfjmga.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FDPJDLGIKKO getMlcajcfjmga() {
    return mlcajcfjmga_ == null ? POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : mlcajcfjmga_;
  }
  /**
   * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FDPJDLGIKKOOrBuilder getMlcajcfjmgaOrBuilder() {
    return getMlcajcfjmga();
  }

  public static final int AJOBGLEAAAE_FIELD_NUMBER = 5;
  private int ajobgleaaae_;
  /**
   * <code>int32 ajobgleaaae = 5;</code>
   * @return The ajobgleaaae.
   */
  @java.lang.Override
  public int getAjobgleaaae() {
    return ajobgleaaae_;
  }

  public static final int HPHFCPIBHED_FIELD_NUMBER = 6;
  private long hphfcpibhed_;
  /**
   * <code>int64 hphfcpibhed = 6;</code>
   * @return The hphfcpibhed.
   */
  @java.lang.Override
  public long getHphfcpibhed() {
    return hphfcpibhed_;
  }

  public static final int DJPPABFHIJN_FIELD_NUMBER = 7;
  private int djppabfhijn_;
  /**
   * <code>int32 djppabfhijn = 7;</code>
   * @return The djppabfhijn.
   */
  @java.lang.Override
  public int getDjppabfhijn() {
    return djppabfhijn_;
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
    if (ahlfnkfhffk_ != null) {
      output.writeMessage(1, getAhlfnkfhffk());
    }
    if (bjfoeolcaeo_ != 0) {
      output.writeInt32(2, bjfoeolcaeo_);
    }
    if (!getHiopeabpfeiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hiopeabpfei_);
    }
    if (mlcajcfjmga_ != null) {
      output.writeMessage(4, getMlcajcfjmga());
    }
    if (ajobgleaaae_ != 0) {
      output.writeInt32(5, ajobgleaaae_);
    }
    if (hphfcpibhed_ != 0L) {
      output.writeInt64(6, hphfcpibhed_);
    }
    if (djppabfhijn_ != 0) {
      output.writeInt32(7, djppabfhijn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ahlfnkfhffk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAhlfnkfhffk());
    }
    if (bjfoeolcaeo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, bjfoeolcaeo_);
    }
    if (!getHiopeabpfeiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hiopeabpfei_);
    }
    if (mlcajcfjmga_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMlcajcfjmga());
    }
    if (ajobgleaaae_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, ajobgleaaae_);
    }
    if (hphfcpibhed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, hphfcpibhed_);
    }
    if (djppabfhijn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, djppabfhijn_);
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
    if (!(obj instanceof POGOProtos.Rpc.KIDDNMANIIK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KIDDNMANIIK other = (POGOProtos.Rpc.KIDDNMANIIK) obj;

    if (hasAhlfnkfhffk() != other.hasAhlfnkfhffk()) return false;
    if (hasAhlfnkfhffk()) {
      if (!getAhlfnkfhffk()
          .equals(other.getAhlfnkfhffk())) return false;
    }
    if (getBjfoeolcaeo()
        != other.getBjfoeolcaeo()) return false;
    if (!getHiopeabpfei()
        .equals(other.getHiopeabpfei())) return false;
    if (hasMlcajcfjmga() != other.hasMlcajcfjmga()) return false;
    if (hasMlcajcfjmga()) {
      if (!getMlcajcfjmga()
          .equals(other.getMlcajcfjmga())) return false;
    }
    if (getAjobgleaaae()
        != other.getAjobgleaaae()) return false;
    if (getHphfcpibhed()
        != other.getHphfcpibhed()) return false;
    if (getDjppabfhijn()
        != other.getDjppabfhijn()) return false;
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
    if (hasAhlfnkfhffk()) {
      hash = (37 * hash) + AHLFNKFHFFK_FIELD_NUMBER;
      hash = (53 * hash) + getAhlfnkfhffk().hashCode();
    }
    hash = (37 * hash) + BJFOEOLCAEO_FIELD_NUMBER;
    hash = (53 * hash) + getBjfoeolcaeo();
    hash = (37 * hash) + HIOPEABPFEI_FIELD_NUMBER;
    hash = (53 * hash) + getHiopeabpfei().hashCode();
    if (hasMlcajcfjmga()) {
      hash = (37 * hash) + MLCAJCFJMGA_FIELD_NUMBER;
      hash = (53 * hash) + getMlcajcfjmga().hashCode();
    }
    hash = (37 * hash) + AJOBGLEAAAE_FIELD_NUMBER;
    hash = (53 * hash) + getAjobgleaaae();
    hash = (37 * hash) + HPHFCPIBHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHphfcpibhed());
    hash = (37 * hash) + DJPPABFHIJN_FIELD_NUMBER;
    hash = (53 * hash) + getDjppabfhijn();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIDDNMANIIK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KIDDNMANIIK prototype) {
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
   * ref: KIDDNMANIIK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KIDDNMANIIK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KIDDNMANIIK)
      POGOProtos.Rpc.KIDDNMANIIKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIDDNMANIIK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIDDNMANIIK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KIDDNMANIIK.class, POGOProtos.Rpc.KIDDNMANIIK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KIDDNMANIIK.newBuilder()
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
      if (ahlfnkfhffkBuilder_ == null) {
        ahlfnkfhffk_ = null;
      } else {
        ahlfnkfhffk_ = null;
        ahlfnkfhffkBuilder_ = null;
      }
      bjfoeolcaeo_ = 0;

      hiopeabpfei_ = "";

      if (mlcajcfjmgaBuilder_ == null) {
        mlcajcfjmga_ = null;
      } else {
        mlcajcfjmga_ = null;
        mlcajcfjmgaBuilder_ = null;
      }
      ajobgleaaae_ = 0;

      hphfcpibhed_ = 0L;

      djppabfhijn_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIDDNMANIIK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIDDNMANIIK getDefaultInstanceForType() {
      return POGOProtos.Rpc.KIDDNMANIIK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIDDNMANIIK build() {
      POGOProtos.Rpc.KIDDNMANIIK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIDDNMANIIK buildPartial() {
      POGOProtos.Rpc.KIDDNMANIIK result = new POGOProtos.Rpc.KIDDNMANIIK(this);
      if (ahlfnkfhffkBuilder_ == null) {
        result.ahlfnkfhffk_ = ahlfnkfhffk_;
      } else {
        result.ahlfnkfhffk_ = ahlfnkfhffkBuilder_.build();
      }
      result.bjfoeolcaeo_ = bjfoeolcaeo_;
      result.hiopeabpfei_ = hiopeabpfei_;
      if (mlcajcfjmgaBuilder_ == null) {
        result.mlcajcfjmga_ = mlcajcfjmga_;
      } else {
        result.mlcajcfjmga_ = mlcajcfjmgaBuilder_.build();
      }
      result.ajobgleaaae_ = ajobgleaaae_;
      result.hphfcpibhed_ = hphfcpibhed_;
      result.djppabfhijn_ = djppabfhijn_;
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
      if (other instanceof POGOProtos.Rpc.KIDDNMANIIK) {
        return mergeFrom((POGOProtos.Rpc.KIDDNMANIIK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KIDDNMANIIK other) {
      if (other == POGOProtos.Rpc.KIDDNMANIIK.getDefaultInstance()) return this;
      if (other.hasAhlfnkfhffk()) {
        mergeAhlfnkfhffk(other.getAhlfnkfhffk());
      }
      if (other.getBjfoeolcaeo() != 0) {
        setBjfoeolcaeo(other.getBjfoeolcaeo());
      }
      if (!other.getHiopeabpfei().isEmpty()) {
        hiopeabpfei_ = other.hiopeabpfei_;
        onChanged();
      }
      if (other.hasMlcajcfjmga()) {
        mergeMlcajcfjmga(other.getMlcajcfjmga());
      }
      if (other.getAjobgleaaae() != 0) {
        setAjobgleaaae(other.getAjobgleaaae());
      }
      if (other.getHphfcpibhed() != 0L) {
        setHphfcpibhed(other.getHphfcpibhed());
      }
      if (other.getDjppabfhijn() != 0) {
        setDjppabfhijn(other.getDjppabfhijn());
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
      POGOProtos.Rpc.KIDDNMANIIK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KIDDNMANIIK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder> ahlfnkfhffkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     * @return Whether the ahlfnkfhffk field is set.
     */
    public boolean hasAhlfnkfhffk() {
      return ahlfnkfhffkBuilder_ != null || ahlfnkfhffk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     * @return The ahlfnkfhffk.
     */
    public POGOProtos.Rpc.FDPJDLGIKKO getAhlfnkfhffk() {
      if (ahlfnkfhffkBuilder_ == null) {
        return ahlfnkfhffk_ == null ? POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : ahlfnkfhffk_;
      } else {
        return ahlfnkfhffkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public Builder setAhlfnkfhffk(POGOProtos.Rpc.FDPJDLGIKKO value) {
      if (ahlfnkfhffkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ahlfnkfhffk_ = value;
        onChanged();
      } else {
        ahlfnkfhffkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public Builder setAhlfnkfhffk(
        POGOProtos.Rpc.FDPJDLGIKKO.Builder builderForValue) {
      if (ahlfnkfhffkBuilder_ == null) {
        ahlfnkfhffk_ = builderForValue.build();
        onChanged();
      } else {
        ahlfnkfhffkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public Builder mergeAhlfnkfhffk(POGOProtos.Rpc.FDPJDLGIKKO value) {
      if (ahlfnkfhffkBuilder_ == null) {
        if (ahlfnkfhffk_ != null) {
          ahlfnkfhffk_ =
            POGOProtos.Rpc.FDPJDLGIKKO.newBuilder(ahlfnkfhffk_).mergeFrom(value).buildPartial();
        } else {
          ahlfnkfhffk_ = value;
        }
        onChanged();
      } else {
        ahlfnkfhffkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public Builder clearAhlfnkfhffk() {
      if (ahlfnkfhffkBuilder_ == null) {
        ahlfnkfhffk_ = null;
        onChanged();
      } else {
        ahlfnkfhffk_ = null;
        ahlfnkfhffkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public POGOProtos.Rpc.FDPJDLGIKKO.Builder getAhlfnkfhffkBuilder() {
      
      onChanged();
      return getAhlfnkfhffkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    public POGOProtos.Rpc.FDPJDLGIKKOOrBuilder getAhlfnkfhffkOrBuilder() {
      if (ahlfnkfhffkBuilder_ != null) {
        return ahlfnkfhffkBuilder_.getMessageOrBuilder();
      } else {
        return ahlfnkfhffk_ == null ?
            POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : ahlfnkfhffk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO ahlfnkfhffk = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder> 
        getAhlfnkfhffkFieldBuilder() {
      if (ahlfnkfhffkBuilder_ == null) {
        ahlfnkfhffkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder>(
                getAhlfnkfhffk(),
                getParentForChildren(),
                isClean());
        ahlfnkfhffk_ = null;
      }
      return ahlfnkfhffkBuilder_;
    }

    private int bjfoeolcaeo_ ;
    /**
     * <code>int32 bjfoeolcaeo = 2;</code>
     * @return The bjfoeolcaeo.
     */
    @java.lang.Override
    public int getBjfoeolcaeo() {
      return bjfoeolcaeo_;
    }
    /**
     * <code>int32 bjfoeolcaeo = 2;</code>
     * @param value The bjfoeolcaeo to set.
     * @return This builder for chaining.
     */
    public Builder setBjfoeolcaeo(int value) {
      
      bjfoeolcaeo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bjfoeolcaeo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBjfoeolcaeo() {
      
      bjfoeolcaeo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object hiopeabpfei_ = "";
    /**
     * <code>string hiopeabpfei = 3;</code>
     * @return The hiopeabpfei.
     */
    public java.lang.String getHiopeabpfei() {
      java.lang.Object ref = hiopeabpfei_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hiopeabpfei_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hiopeabpfei = 3;</code>
     * @return The bytes for hiopeabpfei.
     */
    public com.google.protobuf.ByteString
        getHiopeabpfeiBytes() {
      java.lang.Object ref = hiopeabpfei_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hiopeabpfei_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hiopeabpfei = 3;</code>
     * @param value The hiopeabpfei to set.
     * @return This builder for chaining.
     */
    public Builder setHiopeabpfei(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hiopeabpfei_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hiopeabpfei = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHiopeabpfei() {
      
      hiopeabpfei_ = getDefaultInstance().getHiopeabpfei();
      onChanged();
      return this;
    }
    /**
     * <code>string hiopeabpfei = 3;</code>
     * @param value The bytes for hiopeabpfei to set.
     * @return This builder for chaining.
     */
    public Builder setHiopeabpfeiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hiopeabpfei_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder> mlcajcfjmgaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     * @return Whether the mlcajcfjmga field is set.
     */
    public boolean hasMlcajcfjmga() {
      return mlcajcfjmgaBuilder_ != null || mlcajcfjmga_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     * @return The mlcajcfjmga.
     */
    public POGOProtos.Rpc.FDPJDLGIKKO getMlcajcfjmga() {
      if (mlcajcfjmgaBuilder_ == null) {
        return mlcajcfjmga_ == null ? POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : mlcajcfjmga_;
      } else {
        return mlcajcfjmgaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public Builder setMlcajcfjmga(POGOProtos.Rpc.FDPJDLGIKKO value) {
      if (mlcajcfjmgaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mlcajcfjmga_ = value;
        onChanged();
      } else {
        mlcajcfjmgaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public Builder setMlcajcfjmga(
        POGOProtos.Rpc.FDPJDLGIKKO.Builder builderForValue) {
      if (mlcajcfjmgaBuilder_ == null) {
        mlcajcfjmga_ = builderForValue.build();
        onChanged();
      } else {
        mlcajcfjmgaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public Builder mergeMlcajcfjmga(POGOProtos.Rpc.FDPJDLGIKKO value) {
      if (mlcajcfjmgaBuilder_ == null) {
        if (mlcajcfjmga_ != null) {
          mlcajcfjmga_ =
            POGOProtos.Rpc.FDPJDLGIKKO.newBuilder(mlcajcfjmga_).mergeFrom(value).buildPartial();
        } else {
          mlcajcfjmga_ = value;
        }
        onChanged();
      } else {
        mlcajcfjmgaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public Builder clearMlcajcfjmga() {
      if (mlcajcfjmgaBuilder_ == null) {
        mlcajcfjmga_ = null;
        onChanged();
      } else {
        mlcajcfjmga_ = null;
        mlcajcfjmgaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public POGOProtos.Rpc.FDPJDLGIKKO.Builder getMlcajcfjmgaBuilder() {
      
      onChanged();
      return getMlcajcfjmgaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    public POGOProtos.Rpc.FDPJDLGIKKOOrBuilder getMlcajcfjmgaOrBuilder() {
      if (mlcajcfjmgaBuilder_ != null) {
        return mlcajcfjmgaBuilder_.getMessageOrBuilder();
      } else {
        return mlcajcfjmga_ == null ?
            POGOProtos.Rpc.FDPJDLGIKKO.getDefaultInstance() : mlcajcfjmga_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FDPJDLGIKKO mlcajcfjmga = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder> 
        getMlcajcfjmgaFieldBuilder() {
      if (mlcajcfjmgaBuilder_ == null) {
        mlcajcfjmgaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FDPJDLGIKKO, POGOProtos.Rpc.FDPJDLGIKKO.Builder, POGOProtos.Rpc.FDPJDLGIKKOOrBuilder>(
                getMlcajcfjmga(),
                getParentForChildren(),
                isClean());
        mlcajcfjmga_ = null;
      }
      return mlcajcfjmgaBuilder_;
    }

    private int ajobgleaaae_ ;
    /**
     * <code>int32 ajobgleaaae = 5;</code>
     * @return The ajobgleaaae.
     */
    @java.lang.Override
    public int getAjobgleaaae() {
      return ajobgleaaae_;
    }
    /**
     * <code>int32 ajobgleaaae = 5;</code>
     * @param value The ajobgleaaae to set.
     * @return This builder for chaining.
     */
    public Builder setAjobgleaaae(int value) {
      
      ajobgleaaae_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ajobgleaaae = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAjobgleaaae() {
      
      ajobgleaaae_ = 0;
      onChanged();
      return this;
    }

    private long hphfcpibhed_ ;
    /**
     * <code>int64 hphfcpibhed = 6;</code>
     * @return The hphfcpibhed.
     */
    @java.lang.Override
    public long getHphfcpibhed() {
      return hphfcpibhed_;
    }
    /**
     * <code>int64 hphfcpibhed = 6;</code>
     * @param value The hphfcpibhed to set.
     * @return This builder for chaining.
     */
    public Builder setHphfcpibhed(long value) {
      
      hphfcpibhed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hphfcpibhed = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHphfcpibhed() {
      
      hphfcpibhed_ = 0L;
      onChanged();
      return this;
    }

    private int djppabfhijn_ ;
    /**
     * <code>int32 djppabfhijn = 7;</code>
     * @return The djppabfhijn.
     */
    @java.lang.Override
    public int getDjppabfhijn() {
      return djppabfhijn_;
    }
    /**
     * <code>int32 djppabfhijn = 7;</code>
     * @param value The djppabfhijn to set.
     * @return This builder for chaining.
     */
    public Builder setDjppabfhijn(int value) {
      
      djppabfhijn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 djppabfhijn = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDjppabfhijn() {
      
      djppabfhijn_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KIDDNMANIIK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KIDDNMANIIK)
  private static final POGOProtos.Rpc.KIDDNMANIIK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KIDDNMANIIK();
  }

  public static POGOProtos.Rpc.KIDDNMANIIK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KIDDNMANIIK>
      PARSER = new com.google.protobuf.AbstractParser<KIDDNMANIIK>() {
    @java.lang.Override
    public KIDDNMANIIK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KIDDNMANIIK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KIDDNMANIIK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KIDDNMANIIK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KIDDNMANIIK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

