// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LBOHNNKEBOG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LBOHNNKEBOG}
 */
public final class LBOHNNKEBOG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LBOHNNKEBOG)
    LBOHNNKEBOGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LBOHNNKEBOG.newBuilder() to construct.
  private LBOHNNKEBOG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LBOHNNKEBOG() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LBOHNNKEBOG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LBOHNNKEBOG(
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

            ijeeidglifo_ = input.readInt32();
            break;
          }
          case 16: {

            pgibaaabpag_ = input.readInt64();
            break;
          }
          case 24: {

            mhnmfoanlhd_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBOHNNKEBOG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBOHNNKEBOG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LBOHNNKEBOG.class, POGOProtos.Rpc.LBOHNNKEBOG.Builder.class);
  }

  public static final int IJEEIDGLIFO_FIELD_NUMBER = 1;
  private int ijeeidglifo_;
  /**
   * <code>int32 ijeeidglifo = 1;</code>
   * @return The ijeeidglifo.
   */
  @java.lang.Override
  public int getIjeeidglifo() {
    return ijeeidglifo_;
  }

  public static final int PGIBAAABPAG_FIELD_NUMBER = 2;
  private long pgibaaabpag_;
  /**
   * <code>int64 pgibaaabpag = 2;</code>
   * @return The pgibaaabpag.
   */
  @java.lang.Override
  public long getPgibaaabpag() {
    return pgibaaabpag_;
  }

  public static final int MHNMFOANLHD_FIELD_NUMBER = 3;
  private int mhnmfoanlhd_;
  /**
   * <code>int32 mhnmfoanlhd = 3;</code>
   * @return The mhnmfoanlhd.
   */
  @java.lang.Override
  public int getMhnmfoanlhd() {
    return mhnmfoanlhd_;
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
    if (ijeeidglifo_ != 0) {
      output.writeInt32(1, ijeeidglifo_);
    }
    if (pgibaaabpag_ != 0L) {
      output.writeInt64(2, pgibaaabpag_);
    }
    if (mhnmfoanlhd_ != 0) {
      output.writeInt32(3, mhnmfoanlhd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ijeeidglifo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ijeeidglifo_);
    }
    if (pgibaaabpag_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pgibaaabpag_);
    }
    if (mhnmfoanlhd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mhnmfoanlhd_);
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
    if (!(obj instanceof POGOProtos.Rpc.LBOHNNKEBOG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LBOHNNKEBOG other = (POGOProtos.Rpc.LBOHNNKEBOG) obj;

    if (getIjeeidglifo()
        != other.getIjeeidglifo()) return false;
    if (getPgibaaabpag()
        != other.getPgibaaabpag()) return false;
    if (getMhnmfoanlhd()
        != other.getMhnmfoanlhd()) return false;
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
    hash = (37 * hash) + IJEEIDGLIFO_FIELD_NUMBER;
    hash = (53 * hash) + getIjeeidglifo();
    hash = (37 * hash) + PGIBAAABPAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPgibaaabpag());
    hash = (37 * hash) + MHNMFOANLHD_FIELD_NUMBER;
    hash = (53 * hash) + getMhnmfoanlhd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LBOHNNKEBOG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LBOHNNKEBOG prototype) {
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
   * ref: LBOHNNKEBOG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LBOHNNKEBOG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LBOHNNKEBOG)
      POGOProtos.Rpc.LBOHNNKEBOGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBOHNNKEBOG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBOHNNKEBOG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LBOHNNKEBOG.class, POGOProtos.Rpc.LBOHNNKEBOG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LBOHNNKEBOG.newBuilder()
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
      ijeeidglifo_ = 0;

      pgibaaabpag_ = 0L;

      mhnmfoanlhd_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LBOHNNKEBOG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBOHNNKEBOG getDefaultInstanceForType() {
      return POGOProtos.Rpc.LBOHNNKEBOG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBOHNNKEBOG build() {
      POGOProtos.Rpc.LBOHNNKEBOG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LBOHNNKEBOG buildPartial() {
      POGOProtos.Rpc.LBOHNNKEBOG result = new POGOProtos.Rpc.LBOHNNKEBOG(this);
      result.ijeeidglifo_ = ijeeidglifo_;
      result.pgibaaabpag_ = pgibaaabpag_;
      result.mhnmfoanlhd_ = mhnmfoanlhd_;
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
      if (other instanceof POGOProtos.Rpc.LBOHNNKEBOG) {
        return mergeFrom((POGOProtos.Rpc.LBOHNNKEBOG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LBOHNNKEBOG other) {
      if (other == POGOProtos.Rpc.LBOHNNKEBOG.getDefaultInstance()) return this;
      if (other.getIjeeidglifo() != 0) {
        setIjeeidglifo(other.getIjeeidglifo());
      }
      if (other.getPgibaaabpag() != 0L) {
        setPgibaaabpag(other.getPgibaaabpag());
      }
      if (other.getMhnmfoanlhd() != 0) {
        setMhnmfoanlhd(other.getMhnmfoanlhd());
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
      POGOProtos.Rpc.LBOHNNKEBOG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LBOHNNKEBOG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ijeeidglifo_ ;
    /**
     * <code>int32 ijeeidglifo = 1;</code>
     * @return The ijeeidglifo.
     */
    @java.lang.Override
    public int getIjeeidglifo() {
      return ijeeidglifo_;
    }
    /**
     * <code>int32 ijeeidglifo = 1;</code>
     * @param value The ijeeidglifo to set.
     * @return This builder for chaining.
     */
    public Builder setIjeeidglifo(int value) {
      
      ijeeidglifo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ijeeidglifo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIjeeidglifo() {
      
      ijeeidglifo_ = 0;
      onChanged();
      return this;
    }

    private long pgibaaabpag_ ;
    /**
     * <code>int64 pgibaaabpag = 2;</code>
     * @return The pgibaaabpag.
     */
    @java.lang.Override
    public long getPgibaaabpag() {
      return pgibaaabpag_;
    }
    /**
     * <code>int64 pgibaaabpag = 2;</code>
     * @param value The pgibaaabpag to set.
     * @return This builder for chaining.
     */
    public Builder setPgibaaabpag(long value) {
      
      pgibaaabpag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pgibaaabpag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPgibaaabpag() {
      
      pgibaaabpag_ = 0L;
      onChanged();
      return this;
    }

    private int mhnmfoanlhd_ ;
    /**
     * <code>int32 mhnmfoanlhd = 3;</code>
     * @return The mhnmfoanlhd.
     */
    @java.lang.Override
    public int getMhnmfoanlhd() {
      return mhnmfoanlhd_;
    }
    /**
     * <code>int32 mhnmfoanlhd = 3;</code>
     * @param value The mhnmfoanlhd to set.
     * @return This builder for chaining.
     */
    public Builder setMhnmfoanlhd(int value) {
      
      mhnmfoanlhd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mhnmfoanlhd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhnmfoanlhd() {
      
      mhnmfoanlhd_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LBOHNNKEBOG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LBOHNNKEBOG)
  private static final POGOProtos.Rpc.LBOHNNKEBOG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LBOHNNKEBOG();
  }

  public static POGOProtos.Rpc.LBOHNNKEBOG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LBOHNNKEBOG>
      PARSER = new com.google.protobuf.AbstractParser<LBOHNNKEBOG>() {
    @java.lang.Override
    public LBOHNNKEBOG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LBOHNNKEBOG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LBOHNNKEBOG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LBOHNNKEBOG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LBOHNNKEBOG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

