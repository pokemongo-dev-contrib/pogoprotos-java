// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KIHOBMKMDIF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KIHOBMKMDIF}
 */
public final class KIHOBMKMDIF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KIHOBMKMDIF)
    KIHOBMKMDIFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KIHOBMKMDIF.newBuilder() to construct.
  private KIHOBMKMDIF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KIHOBMKMDIF() {
    lgehoepjopp_ = "";
    gfdflpomhmm_ = "";
    cabijnbbdnm_ = "";
    jdimfdgkbdm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KIHOBMKMDIF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KIHOBMKMDIF(
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

            khdhldofbpb_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lgehoepjopp_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            gfdflpomhmm_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            cabijnbbdnm_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            jdimfdgkbdm_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIHOBMKMDIF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIHOBMKMDIF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KIHOBMKMDIF.class, POGOProtos.Rpc.KIHOBMKMDIF.Builder.class);
  }

  public static final int KHDHLDOFBPB_FIELD_NUMBER = 1;
  private boolean khdhldofbpb_;
  /**
   * <code>bool khdhldofbpb = 1;</code>
   * @return The khdhldofbpb.
   */
  @java.lang.Override
  public boolean getKhdhldofbpb() {
    return khdhldofbpb_;
  }

  public static final int LGEHOEPJOPP_FIELD_NUMBER = 2;
  private volatile java.lang.Object lgehoepjopp_;
  /**
   * <code>string lgehoepjopp = 2;</code>
   * @return The lgehoepjopp.
   */
  @java.lang.Override
  public java.lang.String getLgehoepjopp() {
    java.lang.Object ref = lgehoepjopp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lgehoepjopp_ = s;
      return s;
    }
  }
  /**
   * <code>string lgehoepjopp = 2;</code>
   * @return The bytes for lgehoepjopp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLgehoepjoppBytes() {
    java.lang.Object ref = lgehoepjopp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lgehoepjopp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GFDFLPOMHMM_FIELD_NUMBER = 3;
  private volatile java.lang.Object gfdflpomhmm_;
  /**
   * <code>string gfdflpomhmm = 3;</code>
   * @return The gfdflpomhmm.
   */
  @java.lang.Override
  public java.lang.String getGfdflpomhmm() {
    java.lang.Object ref = gfdflpomhmm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gfdflpomhmm_ = s;
      return s;
    }
  }
  /**
   * <code>string gfdflpomhmm = 3;</code>
   * @return The bytes for gfdflpomhmm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGfdflpomhmmBytes() {
    java.lang.Object ref = gfdflpomhmm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gfdflpomhmm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CABIJNBBDNM_FIELD_NUMBER = 4;
  private volatile java.lang.Object cabijnbbdnm_;
  /**
   * <code>string cabijnbbdnm = 4;</code>
   * @return The cabijnbbdnm.
   */
  @java.lang.Override
  public java.lang.String getCabijnbbdnm() {
    java.lang.Object ref = cabijnbbdnm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cabijnbbdnm_ = s;
      return s;
    }
  }
  /**
   * <code>string cabijnbbdnm = 4;</code>
   * @return The bytes for cabijnbbdnm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCabijnbbdnmBytes() {
    java.lang.Object ref = cabijnbbdnm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cabijnbbdnm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JDIMFDGKBDM_FIELD_NUMBER = 5;
  private volatile java.lang.Object jdimfdgkbdm_;
  /**
   * <code>string jdimfdgkbdm = 5;</code>
   * @return The jdimfdgkbdm.
   */
  @java.lang.Override
  public java.lang.String getJdimfdgkbdm() {
    java.lang.Object ref = jdimfdgkbdm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jdimfdgkbdm_ = s;
      return s;
    }
  }
  /**
   * <code>string jdimfdgkbdm = 5;</code>
   * @return The bytes for jdimfdgkbdm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJdimfdgkbdmBytes() {
    java.lang.Object ref = jdimfdgkbdm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jdimfdgkbdm_ = b;
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
    if (khdhldofbpb_ != false) {
      output.writeBool(1, khdhldofbpb_);
    }
    if (!getLgehoepjoppBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lgehoepjopp_);
    }
    if (!getGfdflpomhmmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gfdflpomhmm_);
    }
    if (!getCabijnbbdnmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cabijnbbdnm_);
    }
    if (!getJdimfdgkbdmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, jdimfdgkbdm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (khdhldofbpb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, khdhldofbpb_);
    }
    if (!getLgehoepjoppBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lgehoepjopp_);
    }
    if (!getGfdflpomhmmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gfdflpomhmm_);
    }
    if (!getCabijnbbdnmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cabijnbbdnm_);
    }
    if (!getJdimfdgkbdmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, jdimfdgkbdm_);
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
    if (!(obj instanceof POGOProtos.Rpc.KIHOBMKMDIF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KIHOBMKMDIF other = (POGOProtos.Rpc.KIHOBMKMDIF) obj;

    if (getKhdhldofbpb()
        != other.getKhdhldofbpb()) return false;
    if (!getLgehoepjopp()
        .equals(other.getLgehoepjopp())) return false;
    if (!getGfdflpomhmm()
        .equals(other.getGfdflpomhmm())) return false;
    if (!getCabijnbbdnm()
        .equals(other.getCabijnbbdnm())) return false;
    if (!getJdimfdgkbdm()
        .equals(other.getJdimfdgkbdm())) return false;
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
    hash = (37 * hash) + KHDHLDOFBPB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKhdhldofbpb());
    hash = (37 * hash) + LGEHOEPJOPP_FIELD_NUMBER;
    hash = (53 * hash) + getLgehoepjopp().hashCode();
    hash = (37 * hash) + GFDFLPOMHMM_FIELD_NUMBER;
    hash = (53 * hash) + getGfdflpomhmm().hashCode();
    hash = (37 * hash) + CABIJNBBDNM_FIELD_NUMBER;
    hash = (53 * hash) + getCabijnbbdnm().hashCode();
    hash = (37 * hash) + JDIMFDGKBDM_FIELD_NUMBER;
    hash = (53 * hash) + getJdimfdgkbdm().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KIHOBMKMDIF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KIHOBMKMDIF prototype) {
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
   * ref: KIHOBMKMDIF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KIHOBMKMDIF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KIHOBMKMDIF)
      POGOProtos.Rpc.KIHOBMKMDIFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIHOBMKMDIF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIHOBMKMDIF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KIHOBMKMDIF.class, POGOProtos.Rpc.KIHOBMKMDIF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KIHOBMKMDIF.newBuilder()
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
      khdhldofbpb_ = false;

      lgehoepjopp_ = "";

      gfdflpomhmm_ = "";

      cabijnbbdnm_ = "";

      jdimfdgkbdm_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KIHOBMKMDIF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIHOBMKMDIF getDefaultInstanceForType() {
      return POGOProtos.Rpc.KIHOBMKMDIF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIHOBMKMDIF build() {
      POGOProtos.Rpc.KIHOBMKMDIF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KIHOBMKMDIF buildPartial() {
      POGOProtos.Rpc.KIHOBMKMDIF result = new POGOProtos.Rpc.KIHOBMKMDIF(this);
      result.khdhldofbpb_ = khdhldofbpb_;
      result.lgehoepjopp_ = lgehoepjopp_;
      result.gfdflpomhmm_ = gfdflpomhmm_;
      result.cabijnbbdnm_ = cabijnbbdnm_;
      result.jdimfdgkbdm_ = jdimfdgkbdm_;
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
      if (other instanceof POGOProtos.Rpc.KIHOBMKMDIF) {
        return mergeFrom((POGOProtos.Rpc.KIHOBMKMDIF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KIHOBMKMDIF other) {
      if (other == POGOProtos.Rpc.KIHOBMKMDIF.getDefaultInstance()) return this;
      if (other.getKhdhldofbpb() != false) {
        setKhdhldofbpb(other.getKhdhldofbpb());
      }
      if (!other.getLgehoepjopp().isEmpty()) {
        lgehoepjopp_ = other.lgehoepjopp_;
        onChanged();
      }
      if (!other.getGfdflpomhmm().isEmpty()) {
        gfdflpomhmm_ = other.gfdflpomhmm_;
        onChanged();
      }
      if (!other.getCabijnbbdnm().isEmpty()) {
        cabijnbbdnm_ = other.cabijnbbdnm_;
        onChanged();
      }
      if (!other.getJdimfdgkbdm().isEmpty()) {
        jdimfdgkbdm_ = other.jdimfdgkbdm_;
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
      POGOProtos.Rpc.KIHOBMKMDIF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KIHOBMKMDIF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean khdhldofbpb_ ;
    /**
     * <code>bool khdhldofbpb = 1;</code>
     * @return The khdhldofbpb.
     */
    @java.lang.Override
    public boolean getKhdhldofbpb() {
      return khdhldofbpb_;
    }
    /**
     * <code>bool khdhldofbpb = 1;</code>
     * @param value The khdhldofbpb to set.
     * @return This builder for chaining.
     */
    public Builder setKhdhldofbpb(boolean value) {
      
      khdhldofbpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool khdhldofbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKhdhldofbpb() {
      
      khdhldofbpb_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object lgehoepjopp_ = "";
    /**
     * <code>string lgehoepjopp = 2;</code>
     * @return The lgehoepjopp.
     */
    public java.lang.String getLgehoepjopp() {
      java.lang.Object ref = lgehoepjopp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lgehoepjopp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lgehoepjopp = 2;</code>
     * @return The bytes for lgehoepjopp.
     */
    public com.google.protobuf.ByteString
        getLgehoepjoppBytes() {
      java.lang.Object ref = lgehoepjopp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lgehoepjopp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lgehoepjopp = 2;</code>
     * @param value The lgehoepjopp to set.
     * @return This builder for chaining.
     */
    public Builder setLgehoepjopp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lgehoepjopp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lgehoepjopp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLgehoepjopp() {
      
      lgehoepjopp_ = getDefaultInstance().getLgehoepjopp();
      onChanged();
      return this;
    }
    /**
     * <code>string lgehoepjopp = 2;</code>
     * @param value The bytes for lgehoepjopp to set.
     * @return This builder for chaining.
     */
    public Builder setLgehoepjoppBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lgehoepjopp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gfdflpomhmm_ = "";
    /**
     * <code>string gfdflpomhmm = 3;</code>
     * @return The gfdflpomhmm.
     */
    public java.lang.String getGfdflpomhmm() {
      java.lang.Object ref = gfdflpomhmm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gfdflpomhmm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gfdflpomhmm = 3;</code>
     * @return The bytes for gfdflpomhmm.
     */
    public com.google.protobuf.ByteString
        getGfdflpomhmmBytes() {
      java.lang.Object ref = gfdflpomhmm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gfdflpomhmm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gfdflpomhmm = 3;</code>
     * @param value The gfdflpomhmm to set.
     * @return This builder for chaining.
     */
    public Builder setGfdflpomhmm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gfdflpomhmm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gfdflpomhmm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGfdflpomhmm() {
      
      gfdflpomhmm_ = getDefaultInstance().getGfdflpomhmm();
      onChanged();
      return this;
    }
    /**
     * <code>string gfdflpomhmm = 3;</code>
     * @param value The bytes for gfdflpomhmm to set.
     * @return This builder for chaining.
     */
    public Builder setGfdflpomhmmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gfdflpomhmm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cabijnbbdnm_ = "";
    /**
     * <code>string cabijnbbdnm = 4;</code>
     * @return The cabijnbbdnm.
     */
    public java.lang.String getCabijnbbdnm() {
      java.lang.Object ref = cabijnbbdnm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cabijnbbdnm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cabijnbbdnm = 4;</code>
     * @return The bytes for cabijnbbdnm.
     */
    public com.google.protobuf.ByteString
        getCabijnbbdnmBytes() {
      java.lang.Object ref = cabijnbbdnm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cabijnbbdnm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cabijnbbdnm = 4;</code>
     * @param value The cabijnbbdnm to set.
     * @return This builder for chaining.
     */
    public Builder setCabijnbbdnm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cabijnbbdnm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cabijnbbdnm = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCabijnbbdnm() {
      
      cabijnbbdnm_ = getDefaultInstance().getCabijnbbdnm();
      onChanged();
      return this;
    }
    /**
     * <code>string cabijnbbdnm = 4;</code>
     * @param value The bytes for cabijnbbdnm to set.
     * @return This builder for chaining.
     */
    public Builder setCabijnbbdnmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cabijnbbdnm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jdimfdgkbdm_ = "";
    /**
     * <code>string jdimfdgkbdm = 5;</code>
     * @return The jdimfdgkbdm.
     */
    public java.lang.String getJdimfdgkbdm() {
      java.lang.Object ref = jdimfdgkbdm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jdimfdgkbdm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jdimfdgkbdm = 5;</code>
     * @return The bytes for jdimfdgkbdm.
     */
    public com.google.protobuf.ByteString
        getJdimfdgkbdmBytes() {
      java.lang.Object ref = jdimfdgkbdm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jdimfdgkbdm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jdimfdgkbdm = 5;</code>
     * @param value The jdimfdgkbdm to set.
     * @return This builder for chaining.
     */
    public Builder setJdimfdgkbdm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jdimfdgkbdm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jdimfdgkbdm = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJdimfdgkbdm() {
      
      jdimfdgkbdm_ = getDefaultInstance().getJdimfdgkbdm();
      onChanged();
      return this;
    }
    /**
     * <code>string jdimfdgkbdm = 5;</code>
     * @param value The bytes for jdimfdgkbdm to set.
     * @return This builder for chaining.
     */
    public Builder setJdimfdgkbdmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jdimfdgkbdm_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KIHOBMKMDIF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KIHOBMKMDIF)
  private static final POGOProtos.Rpc.KIHOBMKMDIF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KIHOBMKMDIF();
  }

  public static POGOProtos.Rpc.KIHOBMKMDIF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KIHOBMKMDIF>
      PARSER = new com.google.protobuf.AbstractParser<KIHOBMKMDIF>() {
    @java.lang.Override
    public KIHOBMKMDIF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KIHOBMKMDIF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KIHOBMKMDIF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KIHOBMKMDIF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KIHOBMKMDIF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

