// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ANOMPFPBIPM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ANOMPFPBIPM}
 */
public final class ANOMPFPBIPM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ANOMPFPBIPM)
    ANOMPFPBIPMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ANOMPFPBIPM.newBuilder() to construct.
  private ANOMPFPBIPM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ANOMPFPBIPM() {
    lfcpdhhaefn_ = com.google.protobuf.ByteString.EMPTY;
    lakniimfnlb_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ANOMPFPBIPM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ANOMPFPBIPM(
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

            lfcpdhhaefn_ = input.readBytes();
            break;
          }
          case 16: {

            acccnlfgepn_ = input.readInt64();
            break;
          }
          case 26: {

            lakniimfnlb_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANOMPFPBIPM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANOMPFPBIPM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ANOMPFPBIPM.class, POGOProtos.Rpc.ANOMPFPBIPM.Builder.class);
  }

  public static final int LFCPDHHAEFN_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString lfcpdhhaefn_;
  /**
   * <code>bytes lfcpdhhaefn = 1;</code>
   * @return The lfcpdhhaefn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLfcpdhhaefn() {
    return lfcpdhhaefn_;
  }

  public static final int ACCCNLFGEPN_FIELD_NUMBER = 2;
  private long acccnlfgepn_;
  /**
   * <code>int64 acccnlfgepn = 2;</code>
   * @return The acccnlfgepn.
   */
  @java.lang.Override
  public long getAcccnlfgepn() {
    return acccnlfgepn_;
  }

  public static final int LAKNIIMFNLB_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString lakniimfnlb_;
  /**
   * <code>bytes lakniimfnlb = 3;</code>
   * @return The lakniimfnlb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLakniimfnlb() {
    return lakniimfnlb_;
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
    if (!lfcpdhhaefn_.isEmpty()) {
      output.writeBytes(1, lfcpdhhaefn_);
    }
    if (acccnlfgepn_ != 0L) {
      output.writeInt64(2, acccnlfgepn_);
    }
    if (!lakniimfnlb_.isEmpty()) {
      output.writeBytes(3, lakniimfnlb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!lfcpdhhaefn_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, lfcpdhhaefn_);
    }
    if (acccnlfgepn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, acccnlfgepn_);
    }
    if (!lakniimfnlb_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, lakniimfnlb_);
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
    if (!(obj instanceof POGOProtos.Rpc.ANOMPFPBIPM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ANOMPFPBIPM other = (POGOProtos.Rpc.ANOMPFPBIPM) obj;

    if (!getLfcpdhhaefn()
        .equals(other.getLfcpdhhaefn())) return false;
    if (getAcccnlfgepn()
        != other.getAcccnlfgepn()) return false;
    if (!getLakniimfnlb()
        .equals(other.getLakniimfnlb())) return false;
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
    hash = (37 * hash) + LFCPDHHAEFN_FIELD_NUMBER;
    hash = (53 * hash) + getLfcpdhhaefn().hashCode();
    hash = (37 * hash) + ACCCNLFGEPN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAcccnlfgepn());
    hash = (37 * hash) + LAKNIIMFNLB_FIELD_NUMBER;
    hash = (53 * hash) + getLakniimfnlb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANOMPFPBIPM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ANOMPFPBIPM prototype) {
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
   * ref: ANOMPFPBIPM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ANOMPFPBIPM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ANOMPFPBIPM)
      POGOProtos.Rpc.ANOMPFPBIPMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANOMPFPBIPM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANOMPFPBIPM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ANOMPFPBIPM.class, POGOProtos.Rpc.ANOMPFPBIPM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ANOMPFPBIPM.newBuilder()
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
      lfcpdhhaefn_ = com.google.protobuf.ByteString.EMPTY;

      acccnlfgepn_ = 0L;

      lakniimfnlb_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANOMPFPBIPM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANOMPFPBIPM getDefaultInstanceForType() {
      return POGOProtos.Rpc.ANOMPFPBIPM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANOMPFPBIPM build() {
      POGOProtos.Rpc.ANOMPFPBIPM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANOMPFPBIPM buildPartial() {
      POGOProtos.Rpc.ANOMPFPBIPM result = new POGOProtos.Rpc.ANOMPFPBIPM(this);
      result.lfcpdhhaefn_ = lfcpdhhaefn_;
      result.acccnlfgepn_ = acccnlfgepn_;
      result.lakniimfnlb_ = lakniimfnlb_;
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
      if (other instanceof POGOProtos.Rpc.ANOMPFPBIPM) {
        return mergeFrom((POGOProtos.Rpc.ANOMPFPBIPM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ANOMPFPBIPM other) {
      if (other == POGOProtos.Rpc.ANOMPFPBIPM.getDefaultInstance()) return this;
      if (other.getLfcpdhhaefn() != com.google.protobuf.ByteString.EMPTY) {
        setLfcpdhhaefn(other.getLfcpdhhaefn());
      }
      if (other.getAcccnlfgepn() != 0L) {
        setAcccnlfgepn(other.getAcccnlfgepn());
      }
      if (other.getLakniimfnlb() != com.google.protobuf.ByteString.EMPTY) {
        setLakniimfnlb(other.getLakniimfnlb());
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
      POGOProtos.Rpc.ANOMPFPBIPM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ANOMPFPBIPM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString lfcpdhhaefn_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes lfcpdhhaefn = 1;</code>
     * @return The lfcpdhhaefn.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLfcpdhhaefn() {
      return lfcpdhhaefn_;
    }
    /**
     * <code>bytes lfcpdhhaefn = 1;</code>
     * @param value The lfcpdhhaefn to set.
     * @return This builder for chaining.
     */
    public Builder setLfcpdhhaefn(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lfcpdhhaefn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes lfcpdhhaefn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLfcpdhhaefn() {
      
      lfcpdhhaefn_ = getDefaultInstance().getLfcpdhhaefn();
      onChanged();
      return this;
    }

    private long acccnlfgepn_ ;
    /**
     * <code>int64 acccnlfgepn = 2;</code>
     * @return The acccnlfgepn.
     */
    @java.lang.Override
    public long getAcccnlfgepn() {
      return acccnlfgepn_;
    }
    /**
     * <code>int64 acccnlfgepn = 2;</code>
     * @param value The acccnlfgepn to set.
     * @return This builder for chaining.
     */
    public Builder setAcccnlfgepn(long value) {
      
      acccnlfgepn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 acccnlfgepn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcccnlfgepn() {
      
      acccnlfgepn_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString lakniimfnlb_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes lakniimfnlb = 3;</code>
     * @return The lakniimfnlb.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLakniimfnlb() {
      return lakniimfnlb_;
    }
    /**
     * <code>bytes lakniimfnlb = 3;</code>
     * @param value The lakniimfnlb to set.
     * @return This builder for chaining.
     */
    public Builder setLakniimfnlb(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lakniimfnlb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes lakniimfnlb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLakniimfnlb() {
      
      lakniimfnlb_ = getDefaultInstance().getLakniimfnlb();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ANOMPFPBIPM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ANOMPFPBIPM)
  private static final POGOProtos.Rpc.ANOMPFPBIPM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ANOMPFPBIPM();
  }

  public static POGOProtos.Rpc.ANOMPFPBIPM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ANOMPFPBIPM>
      PARSER = new com.google.protobuf.AbstractParser<ANOMPFPBIPM>() {
    @java.lang.Override
    public ANOMPFPBIPM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ANOMPFPBIPM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ANOMPFPBIPM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ANOMPFPBIPM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ANOMPFPBIPM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

