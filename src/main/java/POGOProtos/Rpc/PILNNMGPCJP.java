// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PILNNMGPCJP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PILNNMGPCJP}
 */
public final class PILNNMGPCJP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PILNNMGPCJP)
    PILNNMGPCJPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PILNNMGPCJP.newBuilder() to construct.
  private PILNNMGPCJP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PILNNMGPCJP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PILNNMGPCJP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PILNNMGPCJP(
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

            nimeibbooam_ = input.readBool();
            break;
          }
          case 16: {

            fpdidikflei_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PILNNMGPCJP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PILNNMGPCJP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PILNNMGPCJP.class, POGOProtos.Rpc.PILNNMGPCJP.Builder.class);
  }

  public static final int NIMEIBBOOAM_FIELD_NUMBER = 1;
  private boolean nimeibbooam_;
  /**
   * <code>bool nimeibbooam = 1;</code>
   * @return The nimeibbooam.
   */
  @java.lang.Override
  public boolean getNimeibbooam() {
    return nimeibbooam_;
  }

  public static final int FPDIDIKFLEI_FIELD_NUMBER = 2;
  private int fpdidikflei_;
  /**
   * <code>uint32 fpdidikflei = 2;</code>
   * @return The fpdidikflei.
   */
  @java.lang.Override
  public int getFpdidikflei() {
    return fpdidikflei_;
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
    if (nimeibbooam_ != false) {
      output.writeBool(1, nimeibbooam_);
    }
    if (fpdidikflei_ != 0) {
      output.writeUInt32(2, fpdidikflei_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nimeibbooam_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, nimeibbooam_);
    }
    if (fpdidikflei_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, fpdidikflei_);
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
    if (!(obj instanceof POGOProtos.Rpc.PILNNMGPCJP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PILNNMGPCJP other = (POGOProtos.Rpc.PILNNMGPCJP) obj;

    if (getNimeibbooam()
        != other.getNimeibbooam()) return false;
    if (getFpdidikflei()
        != other.getFpdidikflei()) return false;
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
    hash = (37 * hash) + NIMEIBBOOAM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNimeibbooam());
    hash = (37 * hash) + FPDIDIKFLEI_FIELD_NUMBER;
    hash = (53 * hash) + getFpdidikflei();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PILNNMGPCJP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PILNNMGPCJP prototype) {
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
   * ref: PILNNMGPCJP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PILNNMGPCJP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PILNNMGPCJP)
      POGOProtos.Rpc.PILNNMGPCJPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PILNNMGPCJP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PILNNMGPCJP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PILNNMGPCJP.class, POGOProtos.Rpc.PILNNMGPCJP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PILNNMGPCJP.newBuilder()
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
      nimeibbooam_ = false;

      fpdidikflei_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PILNNMGPCJP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PILNNMGPCJP getDefaultInstanceForType() {
      return POGOProtos.Rpc.PILNNMGPCJP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PILNNMGPCJP build() {
      POGOProtos.Rpc.PILNNMGPCJP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PILNNMGPCJP buildPartial() {
      POGOProtos.Rpc.PILNNMGPCJP result = new POGOProtos.Rpc.PILNNMGPCJP(this);
      result.nimeibbooam_ = nimeibbooam_;
      result.fpdidikflei_ = fpdidikflei_;
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
      if (other instanceof POGOProtos.Rpc.PILNNMGPCJP) {
        return mergeFrom((POGOProtos.Rpc.PILNNMGPCJP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PILNNMGPCJP other) {
      if (other == POGOProtos.Rpc.PILNNMGPCJP.getDefaultInstance()) return this;
      if (other.getNimeibbooam() != false) {
        setNimeibbooam(other.getNimeibbooam());
      }
      if (other.getFpdidikflei() != 0) {
        setFpdidikflei(other.getFpdidikflei());
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
      POGOProtos.Rpc.PILNNMGPCJP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PILNNMGPCJP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean nimeibbooam_ ;
    /**
     * <code>bool nimeibbooam = 1;</code>
     * @return The nimeibbooam.
     */
    @java.lang.Override
    public boolean getNimeibbooam() {
      return nimeibbooam_;
    }
    /**
     * <code>bool nimeibbooam = 1;</code>
     * @param value The nimeibbooam to set.
     * @return This builder for chaining.
     */
    public Builder setNimeibbooam(boolean value) {
      
      nimeibbooam_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nimeibbooam = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNimeibbooam() {
      
      nimeibbooam_ = false;
      onChanged();
      return this;
    }

    private int fpdidikflei_ ;
    /**
     * <code>uint32 fpdidikflei = 2;</code>
     * @return The fpdidikflei.
     */
    @java.lang.Override
    public int getFpdidikflei() {
      return fpdidikflei_;
    }
    /**
     * <code>uint32 fpdidikflei = 2;</code>
     * @param value The fpdidikflei to set.
     * @return This builder for chaining.
     */
    public Builder setFpdidikflei(int value) {
      
      fpdidikflei_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fpdidikflei = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpdidikflei() {
      
      fpdidikflei_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PILNNMGPCJP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PILNNMGPCJP)
  private static final POGOProtos.Rpc.PILNNMGPCJP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PILNNMGPCJP();
  }

  public static POGOProtos.Rpc.PILNNMGPCJP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PILNNMGPCJP>
      PARSER = new com.google.protobuf.AbstractParser<PILNNMGPCJP>() {
    @java.lang.Override
    public PILNNMGPCJP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PILNNMGPCJP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PILNNMGPCJP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PILNNMGPCJP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PILNNMGPCJP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

