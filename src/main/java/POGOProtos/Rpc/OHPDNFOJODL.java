// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OHPDNFOJODL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OHPDNFOJODL}
 */
public final class OHPDNFOJODL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OHPDNFOJODL)
    OHPDNFOJODLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OHPDNFOJODL.newBuilder() to construct.
  private OHPDNFOJODL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OHPDNFOJODL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OHPDNFOJODL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OHPDNFOJODL(
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
          case 17: {

            feofjpmbhlk_ = input.readDouble();
            break;
          }
          case 25: {

            gmjldohlnmo_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OHPDNFOJODL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OHPDNFOJODL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OHPDNFOJODL.class, POGOProtos.Rpc.OHPDNFOJODL.Builder.class);
  }

  public static final int FEOFJPMBHLK_FIELD_NUMBER = 2;
  private double feofjpmbhlk_;
  /**
   * <code>double feofjpmbhlk = 2;</code>
   * @return The feofjpmbhlk.
   */
  @java.lang.Override
  public double getFeofjpmbhlk() {
    return feofjpmbhlk_;
  }

  public static final int GMJLDOHLNMO_FIELD_NUMBER = 3;
  private double gmjldohlnmo_;
  /**
   * <code>double gmjldohlnmo = 3;</code>
   * @return The gmjldohlnmo.
   */
  @java.lang.Override
  public double getGmjldohlnmo() {
    return gmjldohlnmo_;
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
    if (feofjpmbhlk_ != 0D) {
      output.writeDouble(2, feofjpmbhlk_);
    }
    if (gmjldohlnmo_ != 0D) {
      output.writeDouble(3, gmjldohlnmo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (feofjpmbhlk_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, feofjpmbhlk_);
    }
    if (gmjldohlnmo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, gmjldohlnmo_);
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
    if (!(obj instanceof POGOProtos.Rpc.OHPDNFOJODL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OHPDNFOJODL other = (POGOProtos.Rpc.OHPDNFOJODL) obj;

    if (java.lang.Double.doubleToLongBits(getFeofjpmbhlk())
        != java.lang.Double.doubleToLongBits(
            other.getFeofjpmbhlk())) return false;
    if (java.lang.Double.doubleToLongBits(getGmjldohlnmo())
        != java.lang.Double.doubleToLongBits(
            other.getGmjldohlnmo())) return false;
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
    hash = (37 * hash) + FEOFJPMBHLK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFeofjpmbhlk()));
    hash = (37 * hash) + GMJLDOHLNMO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGmjldohlnmo()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OHPDNFOJODL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OHPDNFOJODL prototype) {
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
   * ref: OHPDNFOJODL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OHPDNFOJODL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OHPDNFOJODL)
      POGOProtos.Rpc.OHPDNFOJODLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OHPDNFOJODL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OHPDNFOJODL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OHPDNFOJODL.class, POGOProtos.Rpc.OHPDNFOJODL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OHPDNFOJODL.newBuilder()
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
      feofjpmbhlk_ = 0D;

      gmjldohlnmo_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OHPDNFOJODL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OHPDNFOJODL getDefaultInstanceForType() {
      return POGOProtos.Rpc.OHPDNFOJODL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OHPDNFOJODL build() {
      POGOProtos.Rpc.OHPDNFOJODL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OHPDNFOJODL buildPartial() {
      POGOProtos.Rpc.OHPDNFOJODL result = new POGOProtos.Rpc.OHPDNFOJODL(this);
      result.feofjpmbhlk_ = feofjpmbhlk_;
      result.gmjldohlnmo_ = gmjldohlnmo_;
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
      if (other instanceof POGOProtos.Rpc.OHPDNFOJODL) {
        return mergeFrom((POGOProtos.Rpc.OHPDNFOJODL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OHPDNFOJODL other) {
      if (other == POGOProtos.Rpc.OHPDNFOJODL.getDefaultInstance()) return this;
      if (other.getFeofjpmbhlk() != 0D) {
        setFeofjpmbhlk(other.getFeofjpmbhlk());
      }
      if (other.getGmjldohlnmo() != 0D) {
        setGmjldohlnmo(other.getGmjldohlnmo());
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
      POGOProtos.Rpc.OHPDNFOJODL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OHPDNFOJODL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double feofjpmbhlk_ ;
    /**
     * <code>double feofjpmbhlk = 2;</code>
     * @return The feofjpmbhlk.
     */
    @java.lang.Override
    public double getFeofjpmbhlk() {
      return feofjpmbhlk_;
    }
    /**
     * <code>double feofjpmbhlk = 2;</code>
     * @param value The feofjpmbhlk to set.
     * @return This builder for chaining.
     */
    public Builder setFeofjpmbhlk(double value) {
      
      feofjpmbhlk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double feofjpmbhlk = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeofjpmbhlk() {
      
      feofjpmbhlk_ = 0D;
      onChanged();
      return this;
    }

    private double gmjldohlnmo_ ;
    /**
     * <code>double gmjldohlnmo = 3;</code>
     * @return The gmjldohlnmo.
     */
    @java.lang.Override
    public double getGmjldohlnmo() {
      return gmjldohlnmo_;
    }
    /**
     * <code>double gmjldohlnmo = 3;</code>
     * @param value The gmjldohlnmo to set.
     * @return This builder for chaining.
     */
    public Builder setGmjldohlnmo(double value) {
      
      gmjldohlnmo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gmjldohlnmo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGmjldohlnmo() {
      
      gmjldohlnmo_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OHPDNFOJODL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OHPDNFOJODL)
  private static final POGOProtos.Rpc.OHPDNFOJODL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OHPDNFOJODL();
  }

  public static POGOProtos.Rpc.OHPDNFOJODL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OHPDNFOJODL>
      PARSER = new com.google.protobuf.AbstractParser<OHPDNFOJODL>() {
    @java.lang.Override
    public OHPDNFOJODL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OHPDNFOJODL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OHPDNFOJODL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OHPDNFOJODL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OHPDNFOJODL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

