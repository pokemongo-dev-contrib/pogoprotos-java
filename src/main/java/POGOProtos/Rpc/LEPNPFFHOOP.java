// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LEPNPFFHOOP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LEPNPFFHOOP}
 */
public final class LEPNPFFHOOP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LEPNPFFHOOP)
    LEPNPFFHOOPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LEPNPFFHOOP.newBuilder() to construct.
  private LEPNPFFHOOP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LEPNPFFHOOP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LEPNPFFHOOP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LEPNPFFHOOP(
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

            ageajmoihbc_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEPNPFFHOOP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEPNPFFHOOP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LEPNPFFHOOP.class, POGOProtos.Rpc.LEPNPFFHOOP.Builder.class);
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

  public static final int AGEAJMOIHBC_FIELD_NUMBER = 2;
  private int ageajmoihbc_;
  /**
   * <code>int32 ageajmoihbc = 2;</code>
   * @return The ageajmoihbc.
   */
  @java.lang.Override
  public int getAgeajmoihbc() {
    return ageajmoihbc_;
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
    if (ageajmoihbc_ != 0) {
      output.writeInt32(2, ageajmoihbc_);
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
    if (ageajmoihbc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ageajmoihbc_);
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
    if (!(obj instanceof POGOProtos.Rpc.LEPNPFFHOOP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LEPNPFFHOOP other = (POGOProtos.Rpc.LEPNPFFHOOP) obj;

    if (getDbdedahhmhm()
        != other.getDbdedahhmhm()) return false;
    if (getAgeajmoihbc()
        != other.getAgeajmoihbc()) return false;
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
    hash = (37 * hash) + AGEAJMOIHBC_FIELD_NUMBER;
    hash = (53 * hash) + getAgeajmoihbc();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEPNPFFHOOP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LEPNPFFHOOP prototype) {
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
   * ref: LEPNPFFHOOP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LEPNPFFHOOP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LEPNPFFHOOP)
      POGOProtos.Rpc.LEPNPFFHOOPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEPNPFFHOOP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEPNPFFHOOP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LEPNPFFHOOP.class, POGOProtos.Rpc.LEPNPFFHOOP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LEPNPFFHOOP.newBuilder()
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

      ageajmoihbc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEPNPFFHOOP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEPNPFFHOOP getDefaultInstanceForType() {
      return POGOProtos.Rpc.LEPNPFFHOOP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEPNPFFHOOP build() {
      POGOProtos.Rpc.LEPNPFFHOOP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEPNPFFHOOP buildPartial() {
      POGOProtos.Rpc.LEPNPFFHOOP result = new POGOProtos.Rpc.LEPNPFFHOOP(this);
      result.dbdedahhmhm_ = dbdedahhmhm_;
      result.ageajmoihbc_ = ageajmoihbc_;
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
      if (other instanceof POGOProtos.Rpc.LEPNPFFHOOP) {
        return mergeFrom((POGOProtos.Rpc.LEPNPFFHOOP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LEPNPFFHOOP other) {
      if (other == POGOProtos.Rpc.LEPNPFFHOOP.getDefaultInstance()) return this;
      if (other.getDbdedahhmhm() != 0L) {
        setDbdedahhmhm(other.getDbdedahhmhm());
      }
      if (other.getAgeajmoihbc() != 0) {
        setAgeajmoihbc(other.getAgeajmoihbc());
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
      POGOProtos.Rpc.LEPNPFFHOOP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LEPNPFFHOOP) e.getUnfinishedMessage();
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

    private int ageajmoihbc_ ;
    /**
     * <code>int32 ageajmoihbc = 2;</code>
     * @return The ageajmoihbc.
     */
    @java.lang.Override
    public int getAgeajmoihbc() {
      return ageajmoihbc_;
    }
    /**
     * <code>int32 ageajmoihbc = 2;</code>
     * @param value The ageajmoihbc to set.
     * @return This builder for chaining.
     */
    public Builder setAgeajmoihbc(int value) {
      
      ageajmoihbc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ageajmoihbc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgeajmoihbc() {
      
      ageajmoihbc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LEPNPFFHOOP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LEPNPFFHOOP)
  private static final POGOProtos.Rpc.LEPNPFFHOOP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LEPNPFFHOOP();
  }

  public static POGOProtos.Rpc.LEPNPFFHOOP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LEPNPFFHOOP>
      PARSER = new com.google.protobuf.AbstractParser<LEPNPFFHOOP>() {
    @java.lang.Override
    public LEPNPFFHOOP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LEPNPFFHOOP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LEPNPFFHOOP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LEPNPFFHOOP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LEPNPFFHOOP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

