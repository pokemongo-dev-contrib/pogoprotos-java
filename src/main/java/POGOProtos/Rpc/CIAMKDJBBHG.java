// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CIAMKDJBBHG}
 */
public  final class CIAMKDJBBHG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CIAMKDJBBHG)
    CIAMKDJBBHGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CIAMKDJBBHG.newBuilder() to construct.
  private CIAMKDJBBHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CIAMKDJBBHG() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CIAMKDJBBHG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CIAMKDJBBHG(
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

            nojohdceoco_ = input.readInt32();
            break;
          }
          case 16: {

            iodlibmalij_ = input.readInt64();
            break;
          }
          case 24: {

            jckecdkeihd_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIAMKDJBBHG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIAMKDJBBHG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CIAMKDJBBHG.class, POGOProtos.Rpc.CIAMKDJBBHG.Builder.class);
  }

  public static final int NOJOHDCEOCO_FIELD_NUMBER = 1;
  private int nojohdceoco_;
  /**
   * <code>int32 nojohdceoco = 1;</code>
   * @return The nojohdceoco.
   */
  public int getNojohdceoco() {
    return nojohdceoco_;
  }

  public static final int IODLIBMALIJ_FIELD_NUMBER = 2;
  private long iodlibmalij_;
  /**
   * <code>int64 iodlibmalij = 2;</code>
   * @return The iodlibmalij.
   */
  public long getIodlibmalij() {
    return iodlibmalij_;
  }

  public static final int JCKECDKEIHD_FIELD_NUMBER = 3;
  private long jckecdkeihd_;
  /**
   * <code>int64 jckecdkeihd = 3;</code>
   * @return The jckecdkeihd.
   */
  public long getJckecdkeihd() {
    return jckecdkeihd_;
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
    if (nojohdceoco_ != 0) {
      output.writeInt32(1, nojohdceoco_);
    }
    if (iodlibmalij_ != 0L) {
      output.writeInt64(2, iodlibmalij_);
    }
    if (jckecdkeihd_ != 0L) {
      output.writeInt64(3, jckecdkeihd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nojohdceoco_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nojohdceoco_);
    }
    if (iodlibmalij_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, iodlibmalij_);
    }
    if (jckecdkeihd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, jckecdkeihd_);
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
    if (!(obj instanceof POGOProtos.Rpc.CIAMKDJBBHG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CIAMKDJBBHG other = (POGOProtos.Rpc.CIAMKDJBBHG) obj;

    if (getNojohdceoco()
        != other.getNojohdceoco()) return false;
    if (getIodlibmalij()
        != other.getIodlibmalij()) return false;
    if (getJckecdkeihd()
        != other.getJckecdkeihd()) return false;
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
    hash = (37 * hash) + NOJOHDCEOCO_FIELD_NUMBER;
    hash = (53 * hash) + getNojohdceoco();
    hash = (37 * hash) + IODLIBMALIJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIodlibmalij());
    hash = (37 * hash) + JCKECDKEIHD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJckecdkeihd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIAMKDJBBHG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CIAMKDJBBHG prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CIAMKDJBBHG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CIAMKDJBBHG)
      POGOProtos.Rpc.CIAMKDJBBHGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIAMKDJBBHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIAMKDJBBHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CIAMKDJBBHG.class, POGOProtos.Rpc.CIAMKDJBBHG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CIAMKDJBBHG.newBuilder()
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
      nojohdceoco_ = 0;

      iodlibmalij_ = 0L;

      jckecdkeihd_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIAMKDJBBHG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIAMKDJBBHG getDefaultInstanceForType() {
      return POGOProtos.Rpc.CIAMKDJBBHG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIAMKDJBBHG build() {
      POGOProtos.Rpc.CIAMKDJBBHG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIAMKDJBBHG buildPartial() {
      POGOProtos.Rpc.CIAMKDJBBHG result = new POGOProtos.Rpc.CIAMKDJBBHG(this);
      result.nojohdceoco_ = nojohdceoco_;
      result.iodlibmalij_ = iodlibmalij_;
      result.jckecdkeihd_ = jckecdkeihd_;
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
      if (other instanceof POGOProtos.Rpc.CIAMKDJBBHG) {
        return mergeFrom((POGOProtos.Rpc.CIAMKDJBBHG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CIAMKDJBBHG other) {
      if (other == POGOProtos.Rpc.CIAMKDJBBHG.getDefaultInstance()) return this;
      if (other.getNojohdceoco() != 0) {
        setNojohdceoco(other.getNojohdceoco());
      }
      if (other.getIodlibmalij() != 0L) {
        setIodlibmalij(other.getIodlibmalij());
      }
      if (other.getJckecdkeihd() != 0L) {
        setJckecdkeihd(other.getJckecdkeihd());
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
      POGOProtos.Rpc.CIAMKDJBBHG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CIAMKDJBBHG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nojohdceoco_ ;
    /**
     * <code>int32 nojohdceoco = 1;</code>
     * @return The nojohdceoco.
     */
    public int getNojohdceoco() {
      return nojohdceoco_;
    }
    /**
     * <code>int32 nojohdceoco = 1;</code>
     * @param value The nojohdceoco to set.
     * @return This builder for chaining.
     */
    public Builder setNojohdceoco(int value) {
      
      nojohdceoco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nojohdceoco = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNojohdceoco() {
      
      nojohdceoco_ = 0;
      onChanged();
      return this;
    }

    private long iodlibmalij_ ;
    /**
     * <code>int64 iodlibmalij = 2;</code>
     * @return The iodlibmalij.
     */
    public long getIodlibmalij() {
      return iodlibmalij_;
    }
    /**
     * <code>int64 iodlibmalij = 2;</code>
     * @param value The iodlibmalij to set.
     * @return This builder for chaining.
     */
    public Builder setIodlibmalij(long value) {
      
      iodlibmalij_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 iodlibmalij = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIodlibmalij() {
      
      iodlibmalij_ = 0L;
      onChanged();
      return this;
    }

    private long jckecdkeihd_ ;
    /**
     * <code>int64 jckecdkeihd = 3;</code>
     * @return The jckecdkeihd.
     */
    public long getJckecdkeihd() {
      return jckecdkeihd_;
    }
    /**
     * <code>int64 jckecdkeihd = 3;</code>
     * @param value The jckecdkeihd to set.
     * @return This builder for chaining.
     */
    public Builder setJckecdkeihd(long value) {
      
      jckecdkeihd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jckecdkeihd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJckecdkeihd() {
      
      jckecdkeihd_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CIAMKDJBBHG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CIAMKDJBBHG)
  private static final POGOProtos.Rpc.CIAMKDJBBHG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CIAMKDJBBHG();
  }

  public static POGOProtos.Rpc.CIAMKDJBBHG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CIAMKDJBBHG>
      PARSER = new com.google.protobuf.AbstractParser<CIAMKDJBBHG>() {
    @java.lang.Override
    public CIAMKDJBBHG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CIAMKDJBBHG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CIAMKDJBBHG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CIAMKDJBBHG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CIAMKDJBBHG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

