// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HDCIJFIONNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HDCIJFIONNN}
 */
public final class HDCIJFIONNN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HDCIJFIONNN)
    HDCIJFIONNNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HDCIJFIONNN.newBuilder() to construct.
  private HDCIJFIONNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HDCIJFIONNN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HDCIJFIONNN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HDCIJFIONNN(
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

            dbdedahhmhm_ = input.readUInt64();
            break;
          }
          case 16: {

            dpbfndcacig_ = input.readBool();
            break;
          }
          case 24: {

            lmllafgjbjo_ = input.readUInt32();
            break;
          }
          case 32: {

            lioeeeffllh_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDCIJFIONNN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDCIJFIONNN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HDCIJFIONNN.class, POGOProtos.Rpc.HDCIJFIONNN.Builder.class);
  }

  public static final int DBDEDAHHMHM_FIELD_NUMBER = 1;
  private long dbdedahhmhm_;
  /**
   * <code>uint64 dbdedahhmhm = 1;</code>
   * @return The dbdedahhmhm.
   */
  @java.lang.Override
  public long getDbdedahhmhm() {
    return dbdedahhmhm_;
  }

  public static final int DPBFNDCACIG_FIELD_NUMBER = 2;
  private boolean dpbfndcacig_;
  /**
   * <code>bool dpbfndcacig = 2;</code>
   * @return The dpbfndcacig.
   */
  @java.lang.Override
  public boolean getDpbfndcacig() {
    return dpbfndcacig_;
  }

  public static final int LMLLAFGJBJO_FIELD_NUMBER = 3;
  private int lmllafgjbjo_;
  /**
   * <code>uint32 lmllafgjbjo = 3;</code>
   * @return The lmllafgjbjo.
   */
  @java.lang.Override
  public int getLmllafgjbjo() {
    return lmllafgjbjo_;
  }

  public static final int LIOEEEFFLLH_FIELD_NUMBER = 4;
  private int lioeeeffllh_;
  /**
   * <code>int32 lioeeeffllh = 4;</code>
   * @return The lioeeeffllh.
   */
  @java.lang.Override
  public int getLioeeeffllh() {
    return lioeeeffllh_;
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
    if (dbdedahhmhm_ != 0L) {
      output.writeUInt64(1, dbdedahhmhm_);
    }
    if (dpbfndcacig_ != false) {
      output.writeBool(2, dpbfndcacig_);
    }
    if (lmllafgjbjo_ != 0) {
      output.writeUInt32(3, lmllafgjbjo_);
    }
    if (lioeeeffllh_ != 0) {
      output.writeInt32(4, lioeeeffllh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dbdedahhmhm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, dbdedahhmhm_);
    }
    if (dpbfndcacig_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dpbfndcacig_);
    }
    if (lmllafgjbjo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, lmllafgjbjo_);
    }
    if (lioeeeffllh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, lioeeeffllh_);
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
    if (!(obj instanceof POGOProtos.Rpc.HDCIJFIONNN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HDCIJFIONNN other = (POGOProtos.Rpc.HDCIJFIONNN) obj;

    if (getDbdedahhmhm()
        != other.getDbdedahhmhm()) return false;
    if (getDpbfndcacig()
        != other.getDpbfndcacig()) return false;
    if (getLmllafgjbjo()
        != other.getLmllafgjbjo()) return false;
    if (getLioeeeffllh()
        != other.getLioeeeffllh()) return false;
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
    hash = (37 * hash) + DBDEDAHHMHM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDbdedahhmhm());
    hash = (37 * hash) + DPBFNDCACIG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDpbfndcacig());
    hash = (37 * hash) + LMLLAFGJBJO_FIELD_NUMBER;
    hash = (53 * hash) + getLmllafgjbjo();
    hash = (37 * hash) + LIOEEEFFLLH_FIELD_NUMBER;
    hash = (53 * hash) + getLioeeeffllh();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDCIJFIONNN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HDCIJFIONNN prototype) {
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
   * ref: HDCIJFIONNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HDCIJFIONNN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HDCIJFIONNN)
      POGOProtos.Rpc.HDCIJFIONNNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDCIJFIONNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDCIJFIONNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HDCIJFIONNN.class, POGOProtos.Rpc.HDCIJFIONNN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HDCIJFIONNN.newBuilder()
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
      dbdedahhmhm_ = 0L;

      dpbfndcacig_ = false;

      lmllafgjbjo_ = 0;

      lioeeeffllh_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDCIJFIONNN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDCIJFIONNN getDefaultInstanceForType() {
      return POGOProtos.Rpc.HDCIJFIONNN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDCIJFIONNN build() {
      POGOProtos.Rpc.HDCIJFIONNN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDCIJFIONNN buildPartial() {
      POGOProtos.Rpc.HDCIJFIONNN result = new POGOProtos.Rpc.HDCIJFIONNN(this);
      result.dbdedahhmhm_ = dbdedahhmhm_;
      result.dpbfndcacig_ = dpbfndcacig_;
      result.lmllafgjbjo_ = lmllafgjbjo_;
      result.lioeeeffllh_ = lioeeeffllh_;
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
      if (other instanceof POGOProtos.Rpc.HDCIJFIONNN) {
        return mergeFrom((POGOProtos.Rpc.HDCIJFIONNN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HDCIJFIONNN other) {
      if (other == POGOProtos.Rpc.HDCIJFIONNN.getDefaultInstance()) return this;
      if (other.getDbdedahhmhm() != 0L) {
        setDbdedahhmhm(other.getDbdedahhmhm());
      }
      if (other.getDpbfndcacig() != false) {
        setDpbfndcacig(other.getDpbfndcacig());
      }
      if (other.getLmllafgjbjo() != 0) {
        setLmllafgjbjo(other.getLmllafgjbjo());
      }
      if (other.getLioeeeffllh() != 0) {
        setLioeeeffllh(other.getLioeeeffllh());
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
      POGOProtos.Rpc.HDCIJFIONNN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HDCIJFIONNN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long dbdedahhmhm_ ;
    /**
     * <code>uint64 dbdedahhmhm = 1;</code>
     * @return The dbdedahhmhm.
     */
    @java.lang.Override
    public long getDbdedahhmhm() {
      return dbdedahhmhm_;
    }
    /**
     * <code>uint64 dbdedahhmhm = 1;</code>
     * @param value The dbdedahhmhm to set.
     * @return This builder for chaining.
     */
    public Builder setDbdedahhmhm(long value) {
      
      dbdedahhmhm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 dbdedahhmhm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbdedahhmhm() {
      
      dbdedahhmhm_ = 0L;
      onChanged();
      return this;
    }

    private boolean dpbfndcacig_ ;
    /**
     * <code>bool dpbfndcacig = 2;</code>
     * @return The dpbfndcacig.
     */
    @java.lang.Override
    public boolean getDpbfndcacig() {
      return dpbfndcacig_;
    }
    /**
     * <code>bool dpbfndcacig = 2;</code>
     * @param value The dpbfndcacig to set.
     * @return This builder for chaining.
     */
    public Builder setDpbfndcacig(boolean value) {
      
      dpbfndcacig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dpbfndcacig = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDpbfndcacig() {
      
      dpbfndcacig_ = false;
      onChanged();
      return this;
    }

    private int lmllafgjbjo_ ;
    /**
     * <code>uint32 lmllafgjbjo = 3;</code>
     * @return The lmllafgjbjo.
     */
    @java.lang.Override
    public int getLmllafgjbjo() {
      return lmllafgjbjo_;
    }
    /**
     * <code>uint32 lmllafgjbjo = 3;</code>
     * @param value The lmllafgjbjo to set.
     * @return This builder for chaining.
     */
    public Builder setLmllafgjbjo(int value) {
      
      lmllafgjbjo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 lmllafgjbjo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLmllafgjbjo() {
      
      lmllafgjbjo_ = 0;
      onChanged();
      return this;
    }

    private int lioeeeffllh_ ;
    /**
     * <code>int32 lioeeeffllh = 4;</code>
     * @return The lioeeeffllh.
     */
    @java.lang.Override
    public int getLioeeeffllh() {
      return lioeeeffllh_;
    }
    /**
     * <code>int32 lioeeeffllh = 4;</code>
     * @param value The lioeeeffllh to set.
     * @return This builder for chaining.
     */
    public Builder setLioeeeffllh(int value) {
      
      lioeeeffllh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lioeeeffllh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLioeeeffllh() {
      
      lioeeeffllh_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HDCIJFIONNN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HDCIJFIONNN)
  private static final POGOProtos.Rpc.HDCIJFIONNN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HDCIJFIONNN();
  }

  public static POGOProtos.Rpc.HDCIJFIONNN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HDCIJFIONNN>
      PARSER = new com.google.protobuf.AbstractParser<HDCIJFIONNN>() {
    @java.lang.Override
    public HDCIJFIONNN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HDCIJFIONNN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HDCIJFIONNN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HDCIJFIONNN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HDCIJFIONNN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

