// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PDJLNENFJBF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PDJLNENFJBF}
 */
public final class PDJLNENFJBF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PDJLNENFJBF)
    PDJLNENFJBFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDJLNENFJBF.newBuilder() to construct.
  private PDJLNENFJBF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDJLNENFJBF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PDJLNENFJBF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDJLNENFJBF(
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

            nckigamhdpc_ = input.readUInt64();
            break;
          }
          case 16: {

            pgdibegbbpe_ = input.readInt32();
            break;
          }
          case 24: {

            hfblmjemlji_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDJLNENFJBF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDJLNENFJBF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PDJLNENFJBF.class, POGOProtos.Rpc.PDJLNENFJBF.Builder.class);
  }

  public static final int NCKIGAMHDPC_FIELD_NUMBER = 1;
  private long nckigamhdpc_;
  /**
   * <code>uint64 nckigamhdpc = 1;</code>
   * @return The nckigamhdpc.
   */
  @java.lang.Override
  public long getNckigamhdpc() {
    return nckigamhdpc_;
  }

  public static final int PGDIBEGBBPE_FIELD_NUMBER = 2;
  private int pgdibegbbpe_;
  /**
   * <code>int32 pgdibegbbpe = 2;</code>
   * @return The pgdibegbbpe.
   */
  @java.lang.Override
  public int getPgdibegbbpe() {
    return pgdibegbbpe_;
  }

  public static final int HFBLMJEMLJI_FIELD_NUMBER = 3;
  private long hfblmjemlji_;
  /**
   * <code>int64 hfblmjemlji = 3;</code>
   * @return The hfblmjemlji.
   */
  @java.lang.Override
  public long getHfblmjemlji() {
    return hfblmjemlji_;
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
    if (nckigamhdpc_ != 0L) {
      output.writeUInt64(1, nckigamhdpc_);
    }
    if (pgdibegbbpe_ != 0) {
      output.writeInt32(2, pgdibegbbpe_);
    }
    if (hfblmjemlji_ != 0L) {
      output.writeInt64(3, hfblmjemlji_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nckigamhdpc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, nckigamhdpc_);
    }
    if (pgdibegbbpe_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pgdibegbbpe_);
    }
    if (hfblmjemlji_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, hfblmjemlji_);
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
    if (!(obj instanceof POGOProtos.Rpc.PDJLNENFJBF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PDJLNENFJBF other = (POGOProtos.Rpc.PDJLNENFJBF) obj;

    if (getNckigamhdpc()
        != other.getNckigamhdpc()) return false;
    if (getPgdibegbbpe()
        != other.getPgdibegbbpe()) return false;
    if (getHfblmjemlji()
        != other.getHfblmjemlji()) return false;
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
    hash = (37 * hash) + NCKIGAMHDPC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNckigamhdpc());
    hash = (37 * hash) + PGDIBEGBBPE_FIELD_NUMBER;
    hash = (53 * hash) + getPgdibegbbpe();
    hash = (37 * hash) + HFBLMJEMLJI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHfblmjemlji());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PDJLNENFJBF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PDJLNENFJBF prototype) {
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
   * ref: PDJLNENFJBF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PDJLNENFJBF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PDJLNENFJBF)
      POGOProtos.Rpc.PDJLNENFJBFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDJLNENFJBF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDJLNENFJBF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PDJLNENFJBF.class, POGOProtos.Rpc.PDJLNENFJBF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PDJLNENFJBF.newBuilder()
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
      nckigamhdpc_ = 0L;

      pgdibegbbpe_ = 0;

      hfblmjemlji_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PDJLNENFJBF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDJLNENFJBF getDefaultInstanceForType() {
      return POGOProtos.Rpc.PDJLNENFJBF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDJLNENFJBF build() {
      POGOProtos.Rpc.PDJLNENFJBF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PDJLNENFJBF buildPartial() {
      POGOProtos.Rpc.PDJLNENFJBF result = new POGOProtos.Rpc.PDJLNENFJBF(this);
      result.nckigamhdpc_ = nckigamhdpc_;
      result.pgdibegbbpe_ = pgdibegbbpe_;
      result.hfblmjemlji_ = hfblmjemlji_;
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
      if (other instanceof POGOProtos.Rpc.PDJLNENFJBF) {
        return mergeFrom((POGOProtos.Rpc.PDJLNENFJBF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PDJLNENFJBF other) {
      if (other == POGOProtos.Rpc.PDJLNENFJBF.getDefaultInstance()) return this;
      if (other.getNckigamhdpc() != 0L) {
        setNckigamhdpc(other.getNckigamhdpc());
      }
      if (other.getPgdibegbbpe() != 0) {
        setPgdibegbbpe(other.getPgdibegbbpe());
      }
      if (other.getHfblmjemlji() != 0L) {
        setHfblmjemlji(other.getHfblmjemlji());
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
      POGOProtos.Rpc.PDJLNENFJBF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PDJLNENFJBF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long nckigamhdpc_ ;
    /**
     * <code>uint64 nckigamhdpc = 1;</code>
     * @return The nckigamhdpc.
     */
    @java.lang.Override
    public long getNckigamhdpc() {
      return nckigamhdpc_;
    }
    /**
     * <code>uint64 nckigamhdpc = 1;</code>
     * @param value The nckigamhdpc to set.
     * @return This builder for chaining.
     */
    public Builder setNckigamhdpc(long value) {
      
      nckigamhdpc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nckigamhdpc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNckigamhdpc() {
      
      nckigamhdpc_ = 0L;
      onChanged();
      return this;
    }

    private int pgdibegbbpe_ ;
    /**
     * <code>int32 pgdibegbbpe = 2;</code>
     * @return The pgdibegbbpe.
     */
    @java.lang.Override
    public int getPgdibegbbpe() {
      return pgdibegbbpe_;
    }
    /**
     * <code>int32 pgdibegbbpe = 2;</code>
     * @param value The pgdibegbbpe to set.
     * @return This builder for chaining.
     */
    public Builder setPgdibegbbpe(int value) {
      
      pgdibegbbpe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pgdibegbbpe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPgdibegbbpe() {
      
      pgdibegbbpe_ = 0;
      onChanged();
      return this;
    }

    private long hfblmjemlji_ ;
    /**
     * <code>int64 hfblmjemlji = 3;</code>
     * @return The hfblmjemlji.
     */
    @java.lang.Override
    public long getHfblmjemlji() {
      return hfblmjemlji_;
    }
    /**
     * <code>int64 hfblmjemlji = 3;</code>
     * @param value The hfblmjemlji to set.
     * @return This builder for chaining.
     */
    public Builder setHfblmjemlji(long value) {
      
      hfblmjemlji_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hfblmjemlji = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHfblmjemlji() {
      
      hfblmjemlji_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PDJLNENFJBF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PDJLNENFJBF)
  private static final POGOProtos.Rpc.PDJLNENFJBF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PDJLNENFJBF();
  }

  public static POGOProtos.Rpc.PDJLNENFJBF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDJLNENFJBF>
      PARSER = new com.google.protobuf.AbstractParser<PDJLNENFJBF>() {
    @java.lang.Override
    public PDJLNENFJBF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDJLNENFJBF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDJLNENFJBF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDJLNENFJBF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PDJLNENFJBF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

