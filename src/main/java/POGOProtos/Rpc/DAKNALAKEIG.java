// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DAKNALAKEIG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DAKNALAKEIG}
 */
public final class DAKNALAKEIG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DAKNALAKEIG)
    DAKNALAKEIGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DAKNALAKEIG.newBuilder() to construct.
  private DAKNALAKEIG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DAKNALAKEIG() {
    fhopeldfajc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DAKNALAKEIG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DAKNALAKEIG(
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
            java.lang.String s = input.readStringRequireUtf8();

            fhopeldfajc_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAKNALAKEIG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAKNALAKEIG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DAKNALAKEIG.class, POGOProtos.Rpc.DAKNALAKEIG.Builder.class);
  }

  public static final int FHOPELDFAJC_FIELD_NUMBER = 1;
  private volatile java.lang.Object fhopeldfajc_;
  /**
   * <code>string fhopeldfajc = 1;</code>
   * @return The fhopeldfajc.
   */
  @java.lang.Override
  public java.lang.String getFhopeldfajc() {
    java.lang.Object ref = fhopeldfajc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fhopeldfajc_ = s;
      return s;
    }
  }
  /**
   * <code>string fhopeldfajc = 1;</code>
   * @return The bytes for fhopeldfajc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFhopeldfajcBytes() {
    java.lang.Object ref = fhopeldfajc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fhopeldfajc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getFhopeldfajcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fhopeldfajc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFhopeldfajcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fhopeldfajc_);
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
    if (!(obj instanceof POGOProtos.Rpc.DAKNALAKEIG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DAKNALAKEIG other = (POGOProtos.Rpc.DAKNALAKEIG) obj;

    if (!getFhopeldfajc()
        .equals(other.getFhopeldfajc())) return false;
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
    hash = (37 * hash) + FHOPELDFAJC_FIELD_NUMBER;
    hash = (53 * hash) + getFhopeldfajc().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAKNALAKEIG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DAKNALAKEIG prototype) {
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
   * ref: DAKNALAKEIG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DAKNALAKEIG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DAKNALAKEIG)
      POGOProtos.Rpc.DAKNALAKEIGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAKNALAKEIG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAKNALAKEIG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DAKNALAKEIG.class, POGOProtos.Rpc.DAKNALAKEIG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DAKNALAKEIG.newBuilder()
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
      fhopeldfajc_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAKNALAKEIG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAKNALAKEIG getDefaultInstanceForType() {
      return POGOProtos.Rpc.DAKNALAKEIG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAKNALAKEIG build() {
      POGOProtos.Rpc.DAKNALAKEIG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAKNALAKEIG buildPartial() {
      POGOProtos.Rpc.DAKNALAKEIG result = new POGOProtos.Rpc.DAKNALAKEIG(this);
      result.fhopeldfajc_ = fhopeldfajc_;
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
      if (other instanceof POGOProtos.Rpc.DAKNALAKEIG) {
        return mergeFrom((POGOProtos.Rpc.DAKNALAKEIG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DAKNALAKEIG other) {
      if (other == POGOProtos.Rpc.DAKNALAKEIG.getDefaultInstance()) return this;
      if (!other.getFhopeldfajc().isEmpty()) {
        fhopeldfajc_ = other.fhopeldfajc_;
        onChanged();
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
      POGOProtos.Rpc.DAKNALAKEIG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DAKNALAKEIG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fhopeldfajc_ = "";
    /**
     * <code>string fhopeldfajc = 1;</code>
     * @return The fhopeldfajc.
     */
    public java.lang.String getFhopeldfajc() {
      java.lang.Object ref = fhopeldfajc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fhopeldfajc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fhopeldfajc = 1;</code>
     * @return The bytes for fhopeldfajc.
     */
    public com.google.protobuf.ByteString
        getFhopeldfajcBytes() {
      java.lang.Object ref = fhopeldfajc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fhopeldfajc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fhopeldfajc = 1;</code>
     * @param value The fhopeldfajc to set.
     * @return This builder for chaining.
     */
    public Builder setFhopeldfajc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fhopeldfajc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fhopeldfajc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFhopeldfajc() {
      
      fhopeldfajc_ = getDefaultInstance().getFhopeldfajc();
      onChanged();
      return this;
    }
    /**
     * <code>string fhopeldfajc = 1;</code>
     * @param value The bytes for fhopeldfajc to set.
     * @return This builder for chaining.
     */
    public Builder setFhopeldfajcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fhopeldfajc_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DAKNALAKEIG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DAKNALAKEIG)
  private static final POGOProtos.Rpc.DAKNALAKEIG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DAKNALAKEIG();
  }

  public static POGOProtos.Rpc.DAKNALAKEIG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DAKNALAKEIG>
      PARSER = new com.google.protobuf.AbstractParser<DAKNALAKEIG>() {
    @java.lang.Override
    public DAKNALAKEIG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DAKNALAKEIG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DAKNALAKEIG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DAKNALAKEIG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DAKNALAKEIG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

