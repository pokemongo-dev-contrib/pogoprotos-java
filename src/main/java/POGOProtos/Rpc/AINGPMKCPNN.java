// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AINGPMKCPNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AINGPMKCPNN}
 */
public final class AINGPMKCPNN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AINGPMKCPNN)
    AINGPMKCPNNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AINGPMKCPNN.newBuilder() to construct.
  private AINGPMKCPNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AINGPMKCPNN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AINGPMKCPNN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AINGPMKCPNN(
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
          case 9: {

            jbilchfbokm_ = input.readDouble();
            break;
          }
          case 16: {

            pgipicdogle_ = input.readInt32();
            break;
          }
          case 25: {

            mghljeljbjo_ = input.readDouble();
            break;
          }
          case 32: {

            deebfabgbge_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AINGPMKCPNN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AINGPMKCPNN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AINGPMKCPNN.class, POGOProtos.Rpc.AINGPMKCPNN.Builder.class);
  }

  public static final int JBILCHFBOKM_FIELD_NUMBER = 1;
  private double jbilchfbokm_;
  /**
   * <code>double jbilchfbokm = 1;</code>
   * @return The jbilchfbokm.
   */
  @java.lang.Override
  public double getJbilchfbokm() {
    return jbilchfbokm_;
  }

  public static final int PGIPICDOGLE_FIELD_NUMBER = 2;
  private int pgipicdogle_;
  /**
   * <code>int32 pgipicdogle = 2;</code>
   * @return The pgipicdogle.
   */
  @java.lang.Override
  public int getPgipicdogle() {
    return pgipicdogle_;
  }

  public static final int MGHLJELJBJO_FIELD_NUMBER = 3;
  private double mghljeljbjo_;
  /**
   * <code>double mghljeljbjo = 3;</code>
   * @return The mghljeljbjo.
   */
  @java.lang.Override
  public double getMghljeljbjo() {
    return mghljeljbjo_;
  }

  public static final int DEEBFABGBGE_FIELD_NUMBER = 4;
  private long deebfabgbge_;
  /**
   * <code>int64 deebfabgbge = 4;</code>
   * @return The deebfabgbge.
   */
  @java.lang.Override
  public long getDeebfabgbge() {
    return deebfabgbge_;
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
    if (jbilchfbokm_ != 0D) {
      output.writeDouble(1, jbilchfbokm_);
    }
    if (pgipicdogle_ != 0) {
      output.writeInt32(2, pgipicdogle_);
    }
    if (mghljeljbjo_ != 0D) {
      output.writeDouble(3, mghljeljbjo_);
    }
    if (deebfabgbge_ != 0L) {
      output.writeInt64(4, deebfabgbge_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbilchfbokm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, jbilchfbokm_);
    }
    if (pgipicdogle_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pgipicdogle_);
    }
    if (mghljeljbjo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, mghljeljbjo_);
    }
    if (deebfabgbge_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, deebfabgbge_);
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
    if (!(obj instanceof POGOProtos.Rpc.AINGPMKCPNN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AINGPMKCPNN other = (POGOProtos.Rpc.AINGPMKCPNN) obj;

    if (java.lang.Double.doubleToLongBits(getJbilchfbokm())
        != java.lang.Double.doubleToLongBits(
            other.getJbilchfbokm())) return false;
    if (getPgipicdogle()
        != other.getPgipicdogle()) return false;
    if (java.lang.Double.doubleToLongBits(getMghljeljbjo())
        != java.lang.Double.doubleToLongBits(
            other.getMghljeljbjo())) return false;
    if (getDeebfabgbge()
        != other.getDeebfabgbge()) return false;
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
    hash = (37 * hash) + JBILCHFBOKM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getJbilchfbokm()));
    hash = (37 * hash) + PGIPICDOGLE_FIELD_NUMBER;
    hash = (53 * hash) + getPgipicdogle();
    hash = (37 * hash) + MGHLJELJBJO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMghljeljbjo()));
    hash = (37 * hash) + DEEBFABGBGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDeebfabgbge());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AINGPMKCPNN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AINGPMKCPNN prototype) {
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
   * ref: AINGPMKCPNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AINGPMKCPNN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AINGPMKCPNN)
      POGOProtos.Rpc.AINGPMKCPNNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AINGPMKCPNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AINGPMKCPNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AINGPMKCPNN.class, POGOProtos.Rpc.AINGPMKCPNN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AINGPMKCPNN.newBuilder()
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
      jbilchfbokm_ = 0D;

      pgipicdogle_ = 0;

      mghljeljbjo_ = 0D;

      deebfabgbge_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AINGPMKCPNN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AINGPMKCPNN getDefaultInstanceForType() {
      return POGOProtos.Rpc.AINGPMKCPNN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AINGPMKCPNN build() {
      POGOProtos.Rpc.AINGPMKCPNN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AINGPMKCPNN buildPartial() {
      POGOProtos.Rpc.AINGPMKCPNN result = new POGOProtos.Rpc.AINGPMKCPNN(this);
      result.jbilchfbokm_ = jbilchfbokm_;
      result.pgipicdogle_ = pgipicdogle_;
      result.mghljeljbjo_ = mghljeljbjo_;
      result.deebfabgbge_ = deebfabgbge_;
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
      if (other instanceof POGOProtos.Rpc.AINGPMKCPNN) {
        return mergeFrom((POGOProtos.Rpc.AINGPMKCPNN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AINGPMKCPNN other) {
      if (other == POGOProtos.Rpc.AINGPMKCPNN.getDefaultInstance()) return this;
      if (other.getJbilchfbokm() != 0D) {
        setJbilchfbokm(other.getJbilchfbokm());
      }
      if (other.getPgipicdogle() != 0) {
        setPgipicdogle(other.getPgipicdogle());
      }
      if (other.getMghljeljbjo() != 0D) {
        setMghljeljbjo(other.getMghljeljbjo());
      }
      if (other.getDeebfabgbge() != 0L) {
        setDeebfabgbge(other.getDeebfabgbge());
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
      POGOProtos.Rpc.AINGPMKCPNN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AINGPMKCPNN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double jbilchfbokm_ ;
    /**
     * <code>double jbilchfbokm = 1;</code>
     * @return The jbilchfbokm.
     */
    @java.lang.Override
    public double getJbilchfbokm() {
      return jbilchfbokm_;
    }
    /**
     * <code>double jbilchfbokm = 1;</code>
     * @param value The jbilchfbokm to set.
     * @return This builder for chaining.
     */
    public Builder setJbilchfbokm(double value) {
      
      jbilchfbokm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double jbilchfbokm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbilchfbokm() {
      
      jbilchfbokm_ = 0D;
      onChanged();
      return this;
    }

    private int pgipicdogle_ ;
    /**
     * <code>int32 pgipicdogle = 2;</code>
     * @return The pgipicdogle.
     */
    @java.lang.Override
    public int getPgipicdogle() {
      return pgipicdogle_;
    }
    /**
     * <code>int32 pgipicdogle = 2;</code>
     * @param value The pgipicdogle to set.
     * @return This builder for chaining.
     */
    public Builder setPgipicdogle(int value) {
      
      pgipicdogle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pgipicdogle = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPgipicdogle() {
      
      pgipicdogle_ = 0;
      onChanged();
      return this;
    }

    private double mghljeljbjo_ ;
    /**
     * <code>double mghljeljbjo = 3;</code>
     * @return The mghljeljbjo.
     */
    @java.lang.Override
    public double getMghljeljbjo() {
      return mghljeljbjo_;
    }
    /**
     * <code>double mghljeljbjo = 3;</code>
     * @param value The mghljeljbjo to set.
     * @return This builder for chaining.
     */
    public Builder setMghljeljbjo(double value) {
      
      mghljeljbjo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double mghljeljbjo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMghljeljbjo() {
      
      mghljeljbjo_ = 0D;
      onChanged();
      return this;
    }

    private long deebfabgbge_ ;
    /**
     * <code>int64 deebfabgbge = 4;</code>
     * @return The deebfabgbge.
     */
    @java.lang.Override
    public long getDeebfabgbge() {
      return deebfabgbge_;
    }
    /**
     * <code>int64 deebfabgbge = 4;</code>
     * @param value The deebfabgbge to set.
     * @return This builder for chaining.
     */
    public Builder setDeebfabgbge(long value) {
      
      deebfabgbge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 deebfabgbge = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeebfabgbge() {
      
      deebfabgbge_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AINGPMKCPNN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AINGPMKCPNN)
  private static final POGOProtos.Rpc.AINGPMKCPNN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AINGPMKCPNN();
  }

  public static POGOProtos.Rpc.AINGPMKCPNN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AINGPMKCPNN>
      PARSER = new com.google.protobuf.AbstractParser<AINGPMKCPNN>() {
    @java.lang.Override
    public AINGPMKCPNN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AINGPMKCPNN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AINGPMKCPNN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AINGPMKCPNN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AINGPMKCPNN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

