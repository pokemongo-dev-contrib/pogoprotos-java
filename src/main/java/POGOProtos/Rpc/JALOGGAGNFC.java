// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JALOGGAGNFC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JALOGGAGNFC}
 */
public  final class JALOGGAGNFC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JALOGGAGNFC)
    JALOGGAGNFCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JALOGGAGNFC.newBuilder() to construct.
  private JALOGGAGNFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JALOGGAGNFC() {
    ogmgamcbkko_ = com.google.protobuf.ByteString.EMPTY;
    fomlajcchio_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JALOGGAGNFC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JALOGGAGNFC(
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

            ogmgamcbkko_ = input.readBytes();
            break;
          }
          case 16: {

            jkamhkincpi_ = input.readInt64();
            break;
          }
          case 26: {

            fomlajcchio_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JALOGGAGNFC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JALOGGAGNFC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JALOGGAGNFC.class, POGOProtos.Rpc.JALOGGAGNFC.Builder.class);
  }

  public static final int OGMGAMCBKKO_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString ogmgamcbkko_;
  /**
   * <code>bytes ogmgamcbkko = 1;</code>
   * @return The ogmgamcbkko.
   */
  public com.google.protobuf.ByteString getOgmgamcbkko() {
    return ogmgamcbkko_;
  }

  public static final int JKAMHKINCPI_FIELD_NUMBER = 2;
  private long jkamhkincpi_;
  /**
   * <code>int64 jkamhkincpi = 2;</code>
   * @return The jkamhkincpi.
   */
  public long getJkamhkincpi() {
    return jkamhkincpi_;
  }

  public static final int FOMLAJCCHIO_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString fomlajcchio_;
  /**
   * <code>bytes fomlajcchio = 3;</code>
   * @return The fomlajcchio.
   */
  public com.google.protobuf.ByteString getFomlajcchio() {
    return fomlajcchio_;
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
    if (!ogmgamcbkko_.isEmpty()) {
      output.writeBytes(1, ogmgamcbkko_);
    }
    if (jkamhkincpi_ != 0L) {
      output.writeInt64(2, jkamhkincpi_);
    }
    if (!fomlajcchio_.isEmpty()) {
      output.writeBytes(3, fomlajcchio_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!ogmgamcbkko_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, ogmgamcbkko_);
    }
    if (jkamhkincpi_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jkamhkincpi_);
    }
    if (!fomlajcchio_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, fomlajcchio_);
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
    if (!(obj instanceof POGOProtos.Rpc.JALOGGAGNFC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JALOGGAGNFC other = (POGOProtos.Rpc.JALOGGAGNFC) obj;

    if (!getOgmgamcbkko()
        .equals(other.getOgmgamcbkko())) return false;
    if (getJkamhkincpi()
        != other.getJkamhkincpi()) return false;
    if (!getFomlajcchio()
        .equals(other.getFomlajcchio())) return false;
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
    hash = (37 * hash) + OGMGAMCBKKO_FIELD_NUMBER;
    hash = (53 * hash) + getOgmgamcbkko().hashCode();
    hash = (37 * hash) + JKAMHKINCPI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJkamhkincpi());
    hash = (37 * hash) + FOMLAJCCHIO_FIELD_NUMBER;
    hash = (53 * hash) + getFomlajcchio().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JALOGGAGNFC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JALOGGAGNFC prototype) {
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
   * ref: JALOGGAGNFC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JALOGGAGNFC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JALOGGAGNFC)
      POGOProtos.Rpc.JALOGGAGNFCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JALOGGAGNFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JALOGGAGNFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JALOGGAGNFC.class, POGOProtos.Rpc.JALOGGAGNFC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JALOGGAGNFC.newBuilder()
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
      ogmgamcbkko_ = com.google.protobuf.ByteString.EMPTY;

      jkamhkincpi_ = 0L;

      fomlajcchio_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JALOGGAGNFC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JALOGGAGNFC getDefaultInstanceForType() {
      return POGOProtos.Rpc.JALOGGAGNFC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JALOGGAGNFC build() {
      POGOProtos.Rpc.JALOGGAGNFC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JALOGGAGNFC buildPartial() {
      POGOProtos.Rpc.JALOGGAGNFC result = new POGOProtos.Rpc.JALOGGAGNFC(this);
      result.ogmgamcbkko_ = ogmgamcbkko_;
      result.jkamhkincpi_ = jkamhkincpi_;
      result.fomlajcchio_ = fomlajcchio_;
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
      if (other instanceof POGOProtos.Rpc.JALOGGAGNFC) {
        return mergeFrom((POGOProtos.Rpc.JALOGGAGNFC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JALOGGAGNFC other) {
      if (other == POGOProtos.Rpc.JALOGGAGNFC.getDefaultInstance()) return this;
      if (other.getOgmgamcbkko() != com.google.protobuf.ByteString.EMPTY) {
        setOgmgamcbkko(other.getOgmgamcbkko());
      }
      if (other.getJkamhkincpi() != 0L) {
        setJkamhkincpi(other.getJkamhkincpi());
      }
      if (other.getFomlajcchio() != com.google.protobuf.ByteString.EMPTY) {
        setFomlajcchio(other.getFomlajcchio());
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
      POGOProtos.Rpc.JALOGGAGNFC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JALOGGAGNFC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString ogmgamcbkko_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes ogmgamcbkko = 1;</code>
     * @return The ogmgamcbkko.
     */
    public com.google.protobuf.ByteString getOgmgamcbkko() {
      return ogmgamcbkko_;
    }
    /**
     * <code>bytes ogmgamcbkko = 1;</code>
     * @param value The ogmgamcbkko to set.
     * @return This builder for chaining.
     */
    public Builder setOgmgamcbkko(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ogmgamcbkko_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes ogmgamcbkko = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOgmgamcbkko() {
      
      ogmgamcbkko_ = getDefaultInstance().getOgmgamcbkko();
      onChanged();
      return this;
    }

    private long jkamhkincpi_ ;
    /**
     * <code>int64 jkamhkincpi = 2;</code>
     * @return The jkamhkincpi.
     */
    public long getJkamhkincpi() {
      return jkamhkincpi_;
    }
    /**
     * <code>int64 jkamhkincpi = 2;</code>
     * @param value The jkamhkincpi to set.
     * @return This builder for chaining.
     */
    public Builder setJkamhkincpi(long value) {
      
      jkamhkincpi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jkamhkincpi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkamhkincpi() {
      
      jkamhkincpi_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString fomlajcchio_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes fomlajcchio = 3;</code>
     * @return The fomlajcchio.
     */
    public com.google.protobuf.ByteString getFomlajcchio() {
      return fomlajcchio_;
    }
    /**
     * <code>bytes fomlajcchio = 3;</code>
     * @param value The fomlajcchio to set.
     * @return This builder for chaining.
     */
    public Builder setFomlajcchio(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fomlajcchio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes fomlajcchio = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFomlajcchio() {
      
      fomlajcchio_ = getDefaultInstance().getFomlajcchio();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JALOGGAGNFC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JALOGGAGNFC)
  private static final POGOProtos.Rpc.JALOGGAGNFC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JALOGGAGNFC();
  }

  public static POGOProtos.Rpc.JALOGGAGNFC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JALOGGAGNFC>
      PARSER = new com.google.protobuf.AbstractParser<JALOGGAGNFC>() {
    @java.lang.Override
    public JALOGGAGNFC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JALOGGAGNFC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JALOGGAGNFC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JALOGGAGNFC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JALOGGAGNFC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

