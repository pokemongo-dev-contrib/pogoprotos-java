// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FIOENAHGCCC}
 */
public  final class FIOENAHGCCC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FIOENAHGCCC)
    FIOENAHGCCCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FIOENAHGCCC.newBuilder() to construct.
  private FIOENAHGCCC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FIOENAHGCCC() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FIOENAHGCCC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FIOENAHGCCC(
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

            mgmjcdgbmdd_ = input.readBool();
            break;
          }
          case 16: {

            lheobdnjoee_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FIOENAHGCCC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FIOENAHGCCC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FIOENAHGCCC.class, POGOProtos.Rpc.FIOENAHGCCC.Builder.class);
  }

  public static final int MGMJCDGBMDD_FIELD_NUMBER = 1;
  private boolean mgmjcdgbmdd_;
  /**
   * <code>bool mgmjcdgbmdd = 1;</code>
   * @return The mgmjcdgbmdd.
   */
  public boolean getMgmjcdgbmdd() {
    return mgmjcdgbmdd_;
  }

  public static final int LHEOBDNJOEE_FIELD_NUMBER = 2;
  private boolean lheobdnjoee_;
  /**
   * <code>bool lheobdnjoee = 2;</code>
   * @return The lheobdnjoee.
   */
  public boolean getLheobdnjoee() {
    return lheobdnjoee_;
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
    if (mgmjcdgbmdd_ != false) {
      output.writeBool(1, mgmjcdgbmdd_);
    }
    if (lheobdnjoee_ != false) {
      output.writeBool(2, lheobdnjoee_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mgmjcdgbmdd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, mgmjcdgbmdd_);
    }
    if (lheobdnjoee_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, lheobdnjoee_);
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
    if (!(obj instanceof POGOProtos.Rpc.FIOENAHGCCC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FIOENAHGCCC other = (POGOProtos.Rpc.FIOENAHGCCC) obj;

    if (getMgmjcdgbmdd()
        != other.getMgmjcdgbmdd()) return false;
    if (getLheobdnjoee()
        != other.getLheobdnjoee()) return false;
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
    hash = (37 * hash) + MGMJCDGBMDD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMgmjcdgbmdd());
    hash = (37 * hash) + LHEOBDNJOEE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLheobdnjoee());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FIOENAHGCCC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FIOENAHGCCC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FIOENAHGCCC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FIOENAHGCCC)
      POGOProtos.Rpc.FIOENAHGCCCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FIOENAHGCCC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FIOENAHGCCC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FIOENAHGCCC.class, POGOProtos.Rpc.FIOENAHGCCC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FIOENAHGCCC.newBuilder()
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
      mgmjcdgbmdd_ = false;

      lheobdnjoee_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FIOENAHGCCC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FIOENAHGCCC getDefaultInstanceForType() {
      return POGOProtos.Rpc.FIOENAHGCCC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FIOENAHGCCC build() {
      POGOProtos.Rpc.FIOENAHGCCC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FIOENAHGCCC buildPartial() {
      POGOProtos.Rpc.FIOENAHGCCC result = new POGOProtos.Rpc.FIOENAHGCCC(this);
      result.mgmjcdgbmdd_ = mgmjcdgbmdd_;
      result.lheobdnjoee_ = lheobdnjoee_;
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
      if (other instanceof POGOProtos.Rpc.FIOENAHGCCC) {
        return mergeFrom((POGOProtos.Rpc.FIOENAHGCCC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FIOENAHGCCC other) {
      if (other == POGOProtos.Rpc.FIOENAHGCCC.getDefaultInstance()) return this;
      if (other.getMgmjcdgbmdd() != false) {
        setMgmjcdgbmdd(other.getMgmjcdgbmdd());
      }
      if (other.getLheobdnjoee() != false) {
        setLheobdnjoee(other.getLheobdnjoee());
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
      POGOProtos.Rpc.FIOENAHGCCC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FIOENAHGCCC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean mgmjcdgbmdd_ ;
    /**
     * <code>bool mgmjcdgbmdd = 1;</code>
     * @return The mgmjcdgbmdd.
     */
    public boolean getMgmjcdgbmdd() {
      return mgmjcdgbmdd_;
    }
    /**
     * <code>bool mgmjcdgbmdd = 1;</code>
     * @param value The mgmjcdgbmdd to set.
     * @return This builder for chaining.
     */
    public Builder setMgmjcdgbmdd(boolean value) {
      
      mgmjcdgbmdd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mgmjcdgbmdd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgmjcdgbmdd() {
      
      mgmjcdgbmdd_ = false;
      onChanged();
      return this;
    }

    private boolean lheobdnjoee_ ;
    /**
     * <code>bool lheobdnjoee = 2;</code>
     * @return The lheobdnjoee.
     */
    public boolean getLheobdnjoee() {
      return lheobdnjoee_;
    }
    /**
     * <code>bool lheobdnjoee = 2;</code>
     * @param value The lheobdnjoee to set.
     * @return This builder for chaining.
     */
    public Builder setLheobdnjoee(boolean value) {
      
      lheobdnjoee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lheobdnjoee = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLheobdnjoee() {
      
      lheobdnjoee_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FIOENAHGCCC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FIOENAHGCCC)
  private static final POGOProtos.Rpc.FIOENAHGCCC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FIOENAHGCCC();
  }

  public static POGOProtos.Rpc.FIOENAHGCCC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FIOENAHGCCC>
      PARSER = new com.google.protobuf.AbstractParser<FIOENAHGCCC>() {
    @java.lang.Override
    public FIOENAHGCCC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FIOENAHGCCC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FIOENAHGCCC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FIOENAHGCCC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FIOENAHGCCC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

