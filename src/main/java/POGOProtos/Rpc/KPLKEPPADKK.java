// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KPLKEPPADKK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KPLKEPPADKK}
 */
public final class KPLKEPPADKK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KPLKEPPADKK)
    KPLKEPPADKKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KPLKEPPADKK.newBuilder() to construct.
  private KPLKEPPADKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KPLKEPPADKK() {
    omkipbfoaho_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KPLKEPPADKK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KPLKEPPADKK(
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

            omkipbfoaho_ = s;
            break;
          }
          case 17: {

            nbolglmejnc_ = input.readDouble();
            break;
          }
          case 25: {

            libhmbbcogc_ = input.readDouble();
            break;
          }
          case 33: {

            okeldjlephi_ = input.readDouble();
            break;
          }
          case 41: {

            eidfhhlgpmf_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLKEPPADKK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLKEPPADKK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KPLKEPPADKK.class, POGOProtos.Rpc.KPLKEPPADKK.Builder.class);
  }

  public static final int OMKIPBFOAHO_FIELD_NUMBER = 1;
  private volatile java.lang.Object omkipbfoaho_;
  /**
   * <code>string omkipbfoaho = 1;</code>
   * @return The omkipbfoaho.
   */
  @java.lang.Override
  public java.lang.String getOmkipbfoaho() {
    java.lang.Object ref = omkipbfoaho_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      omkipbfoaho_ = s;
      return s;
    }
  }
  /**
   * <code>string omkipbfoaho = 1;</code>
   * @return The bytes for omkipbfoaho.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOmkipbfoahoBytes() {
    java.lang.Object ref = omkipbfoaho_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      omkipbfoaho_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NBOLGLMEJNC_FIELD_NUMBER = 2;
  private double nbolglmejnc_;
  /**
   * <code>double nbolglmejnc = 2;</code>
   * @return The nbolglmejnc.
   */
  @java.lang.Override
  public double getNbolglmejnc() {
    return nbolglmejnc_;
  }

  public static final int LIBHMBBCOGC_FIELD_NUMBER = 3;
  private double libhmbbcogc_;
  /**
   * <code>double libhmbbcogc = 3;</code>
   * @return The libhmbbcogc.
   */
  @java.lang.Override
  public double getLibhmbbcogc() {
    return libhmbbcogc_;
  }

  public static final int OKELDJLEPHI_FIELD_NUMBER = 4;
  private double okeldjlephi_;
  /**
   * <code>double okeldjlephi = 4;</code>
   * @return The okeldjlephi.
   */
  @java.lang.Override
  public double getOkeldjlephi() {
    return okeldjlephi_;
  }

  public static final int EIDFHHLGPMF_FIELD_NUMBER = 5;
  private double eidfhhlgpmf_;
  /**
   * <code>double eidfhhlgpmf = 5;</code>
   * @return The eidfhhlgpmf.
   */
  @java.lang.Override
  public double getEidfhhlgpmf() {
    return eidfhhlgpmf_;
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
    if (!getOmkipbfoahoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, omkipbfoaho_);
    }
    if (nbolglmejnc_ != 0D) {
      output.writeDouble(2, nbolglmejnc_);
    }
    if (libhmbbcogc_ != 0D) {
      output.writeDouble(3, libhmbbcogc_);
    }
    if (okeldjlephi_ != 0D) {
      output.writeDouble(4, okeldjlephi_);
    }
    if (eidfhhlgpmf_ != 0D) {
      output.writeDouble(5, eidfhhlgpmf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOmkipbfoahoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, omkipbfoaho_);
    }
    if (nbolglmejnc_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, nbolglmejnc_);
    }
    if (libhmbbcogc_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, libhmbbcogc_);
    }
    if (okeldjlephi_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, okeldjlephi_);
    }
    if (eidfhhlgpmf_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, eidfhhlgpmf_);
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
    if (!(obj instanceof POGOProtos.Rpc.KPLKEPPADKK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KPLKEPPADKK other = (POGOProtos.Rpc.KPLKEPPADKK) obj;

    if (!getOmkipbfoaho()
        .equals(other.getOmkipbfoaho())) return false;
    if (java.lang.Double.doubleToLongBits(getNbolglmejnc())
        != java.lang.Double.doubleToLongBits(
            other.getNbolglmejnc())) return false;
    if (java.lang.Double.doubleToLongBits(getLibhmbbcogc())
        != java.lang.Double.doubleToLongBits(
            other.getLibhmbbcogc())) return false;
    if (java.lang.Double.doubleToLongBits(getOkeldjlephi())
        != java.lang.Double.doubleToLongBits(
            other.getOkeldjlephi())) return false;
    if (java.lang.Double.doubleToLongBits(getEidfhhlgpmf())
        != java.lang.Double.doubleToLongBits(
            other.getEidfhhlgpmf())) return false;
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
    hash = (37 * hash) + OMKIPBFOAHO_FIELD_NUMBER;
    hash = (53 * hash) + getOmkipbfoaho().hashCode();
    hash = (37 * hash) + NBOLGLMEJNC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNbolglmejnc()));
    hash = (37 * hash) + LIBHMBBCOGC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLibhmbbcogc()));
    hash = (37 * hash) + OKELDJLEPHI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOkeldjlephi()));
    hash = (37 * hash) + EIDFHHLGPMF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEidfhhlgpmf()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLKEPPADKK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KPLKEPPADKK prototype) {
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
   * ref: KPLKEPPADKK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KPLKEPPADKK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KPLKEPPADKK)
      POGOProtos.Rpc.KPLKEPPADKKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLKEPPADKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLKEPPADKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KPLKEPPADKK.class, POGOProtos.Rpc.KPLKEPPADKK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KPLKEPPADKK.newBuilder()
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
      omkipbfoaho_ = "";

      nbolglmejnc_ = 0D;

      libhmbbcogc_ = 0D;

      okeldjlephi_ = 0D;

      eidfhhlgpmf_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLKEPPADKK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLKEPPADKK getDefaultInstanceForType() {
      return POGOProtos.Rpc.KPLKEPPADKK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLKEPPADKK build() {
      POGOProtos.Rpc.KPLKEPPADKK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLKEPPADKK buildPartial() {
      POGOProtos.Rpc.KPLKEPPADKK result = new POGOProtos.Rpc.KPLKEPPADKK(this);
      result.omkipbfoaho_ = omkipbfoaho_;
      result.nbolglmejnc_ = nbolglmejnc_;
      result.libhmbbcogc_ = libhmbbcogc_;
      result.okeldjlephi_ = okeldjlephi_;
      result.eidfhhlgpmf_ = eidfhhlgpmf_;
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
      if (other instanceof POGOProtos.Rpc.KPLKEPPADKK) {
        return mergeFrom((POGOProtos.Rpc.KPLKEPPADKK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KPLKEPPADKK other) {
      if (other == POGOProtos.Rpc.KPLKEPPADKK.getDefaultInstance()) return this;
      if (!other.getOmkipbfoaho().isEmpty()) {
        omkipbfoaho_ = other.omkipbfoaho_;
        onChanged();
      }
      if (other.getNbolglmejnc() != 0D) {
        setNbolglmejnc(other.getNbolglmejnc());
      }
      if (other.getLibhmbbcogc() != 0D) {
        setLibhmbbcogc(other.getLibhmbbcogc());
      }
      if (other.getOkeldjlephi() != 0D) {
        setOkeldjlephi(other.getOkeldjlephi());
      }
      if (other.getEidfhhlgpmf() != 0D) {
        setEidfhhlgpmf(other.getEidfhhlgpmf());
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
      POGOProtos.Rpc.KPLKEPPADKK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KPLKEPPADKK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object omkipbfoaho_ = "";
    /**
     * <code>string omkipbfoaho = 1;</code>
     * @return The omkipbfoaho.
     */
    public java.lang.String getOmkipbfoaho() {
      java.lang.Object ref = omkipbfoaho_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        omkipbfoaho_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string omkipbfoaho = 1;</code>
     * @return The bytes for omkipbfoaho.
     */
    public com.google.protobuf.ByteString
        getOmkipbfoahoBytes() {
      java.lang.Object ref = omkipbfoaho_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        omkipbfoaho_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string omkipbfoaho = 1;</code>
     * @param value The omkipbfoaho to set.
     * @return This builder for chaining.
     */
    public Builder setOmkipbfoaho(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      omkipbfoaho_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string omkipbfoaho = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOmkipbfoaho() {
      
      omkipbfoaho_ = getDefaultInstance().getOmkipbfoaho();
      onChanged();
      return this;
    }
    /**
     * <code>string omkipbfoaho = 1;</code>
     * @param value The bytes for omkipbfoaho to set.
     * @return This builder for chaining.
     */
    public Builder setOmkipbfoahoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      omkipbfoaho_ = value;
      onChanged();
      return this;
    }

    private double nbolglmejnc_ ;
    /**
     * <code>double nbolglmejnc = 2;</code>
     * @return The nbolglmejnc.
     */
    @java.lang.Override
    public double getNbolglmejnc() {
      return nbolglmejnc_;
    }
    /**
     * <code>double nbolglmejnc = 2;</code>
     * @param value The nbolglmejnc to set.
     * @return This builder for chaining.
     */
    public Builder setNbolglmejnc(double value) {
      
      nbolglmejnc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nbolglmejnc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNbolglmejnc() {
      
      nbolglmejnc_ = 0D;
      onChanged();
      return this;
    }

    private double libhmbbcogc_ ;
    /**
     * <code>double libhmbbcogc = 3;</code>
     * @return The libhmbbcogc.
     */
    @java.lang.Override
    public double getLibhmbbcogc() {
      return libhmbbcogc_;
    }
    /**
     * <code>double libhmbbcogc = 3;</code>
     * @param value The libhmbbcogc to set.
     * @return This builder for chaining.
     */
    public Builder setLibhmbbcogc(double value) {
      
      libhmbbcogc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double libhmbbcogc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLibhmbbcogc() {
      
      libhmbbcogc_ = 0D;
      onChanged();
      return this;
    }

    private double okeldjlephi_ ;
    /**
     * <code>double okeldjlephi = 4;</code>
     * @return The okeldjlephi.
     */
    @java.lang.Override
    public double getOkeldjlephi() {
      return okeldjlephi_;
    }
    /**
     * <code>double okeldjlephi = 4;</code>
     * @param value The okeldjlephi to set.
     * @return This builder for chaining.
     */
    public Builder setOkeldjlephi(double value) {
      
      okeldjlephi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double okeldjlephi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOkeldjlephi() {
      
      okeldjlephi_ = 0D;
      onChanged();
      return this;
    }

    private double eidfhhlgpmf_ ;
    /**
     * <code>double eidfhhlgpmf = 5;</code>
     * @return The eidfhhlgpmf.
     */
    @java.lang.Override
    public double getEidfhhlgpmf() {
      return eidfhhlgpmf_;
    }
    /**
     * <code>double eidfhhlgpmf = 5;</code>
     * @param value The eidfhhlgpmf to set.
     * @return This builder for chaining.
     */
    public Builder setEidfhhlgpmf(double value) {
      
      eidfhhlgpmf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double eidfhhlgpmf = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEidfhhlgpmf() {
      
      eidfhhlgpmf_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KPLKEPPADKK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KPLKEPPADKK)
  private static final POGOProtos.Rpc.KPLKEPPADKK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KPLKEPPADKK();
  }

  public static POGOProtos.Rpc.KPLKEPPADKK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KPLKEPPADKK>
      PARSER = new com.google.protobuf.AbstractParser<KPLKEPPADKK>() {
    @java.lang.Override
    public KPLKEPPADKK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KPLKEPPADKK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KPLKEPPADKK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KPLKEPPADKK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KPLKEPPADKK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

