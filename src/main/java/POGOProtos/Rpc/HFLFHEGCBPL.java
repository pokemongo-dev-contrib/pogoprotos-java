// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HFLFHEGCBPL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HFLFHEGCBPL}
 */
public final class HFLFHEGCBPL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HFLFHEGCBPL)
    HFLFHEGCBPLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HFLFHEGCBPL.newBuilder() to construct.
  private HFLFHEGCBPL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HFLFHEGCBPL() {
    nconcpeggaa_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HFLFHEGCBPL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HFLFHEGCBPL(
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

            nconcpeggaa_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFLFHEGCBPL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFLFHEGCBPL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HFLFHEGCBPL.class, POGOProtos.Rpc.HFLFHEGCBPL.Builder.class);
  }

  public static final int NCONCPEGGAA_FIELD_NUMBER = 1;
  private volatile java.lang.Object nconcpeggaa_;
  /**
   * <code>string nconcpeggaa = 1;</code>
   * @return The nconcpeggaa.
   */
  @java.lang.Override
  public java.lang.String getNconcpeggaa() {
    java.lang.Object ref = nconcpeggaa_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nconcpeggaa_ = s;
      return s;
    }
  }
  /**
   * <code>string nconcpeggaa = 1;</code>
   * @return The bytes for nconcpeggaa.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNconcpeggaaBytes() {
    java.lang.Object ref = nconcpeggaa_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nconcpeggaa_ = b;
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
    if (!getNconcpeggaaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nconcpeggaa_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNconcpeggaaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nconcpeggaa_);
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
    if (!(obj instanceof POGOProtos.Rpc.HFLFHEGCBPL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HFLFHEGCBPL other = (POGOProtos.Rpc.HFLFHEGCBPL) obj;

    if (!getNconcpeggaa()
        .equals(other.getNconcpeggaa())) return false;
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
    hash = (37 * hash) + NCONCPEGGAA_FIELD_NUMBER;
    hash = (53 * hash) + getNconcpeggaa().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFLFHEGCBPL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HFLFHEGCBPL prototype) {
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
   * ref: HFLFHEGCBPL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HFLFHEGCBPL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HFLFHEGCBPL)
      POGOProtos.Rpc.HFLFHEGCBPLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFLFHEGCBPL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFLFHEGCBPL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HFLFHEGCBPL.class, POGOProtos.Rpc.HFLFHEGCBPL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HFLFHEGCBPL.newBuilder()
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
      nconcpeggaa_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFLFHEGCBPL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFLFHEGCBPL getDefaultInstanceForType() {
      return POGOProtos.Rpc.HFLFHEGCBPL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFLFHEGCBPL build() {
      POGOProtos.Rpc.HFLFHEGCBPL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFLFHEGCBPL buildPartial() {
      POGOProtos.Rpc.HFLFHEGCBPL result = new POGOProtos.Rpc.HFLFHEGCBPL(this);
      result.nconcpeggaa_ = nconcpeggaa_;
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
      if (other instanceof POGOProtos.Rpc.HFLFHEGCBPL) {
        return mergeFrom((POGOProtos.Rpc.HFLFHEGCBPL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HFLFHEGCBPL other) {
      if (other == POGOProtos.Rpc.HFLFHEGCBPL.getDefaultInstance()) return this;
      if (!other.getNconcpeggaa().isEmpty()) {
        nconcpeggaa_ = other.nconcpeggaa_;
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
      POGOProtos.Rpc.HFLFHEGCBPL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HFLFHEGCBPL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nconcpeggaa_ = "";
    /**
     * <code>string nconcpeggaa = 1;</code>
     * @return The nconcpeggaa.
     */
    public java.lang.String getNconcpeggaa() {
      java.lang.Object ref = nconcpeggaa_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nconcpeggaa_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nconcpeggaa = 1;</code>
     * @return The bytes for nconcpeggaa.
     */
    public com.google.protobuf.ByteString
        getNconcpeggaaBytes() {
      java.lang.Object ref = nconcpeggaa_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nconcpeggaa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nconcpeggaa = 1;</code>
     * @param value The nconcpeggaa to set.
     * @return This builder for chaining.
     */
    public Builder setNconcpeggaa(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nconcpeggaa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nconcpeggaa = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNconcpeggaa() {
      
      nconcpeggaa_ = getDefaultInstance().getNconcpeggaa();
      onChanged();
      return this;
    }
    /**
     * <code>string nconcpeggaa = 1;</code>
     * @param value The bytes for nconcpeggaa to set.
     * @return This builder for chaining.
     */
    public Builder setNconcpeggaaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nconcpeggaa_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HFLFHEGCBPL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HFLFHEGCBPL)
  private static final POGOProtos.Rpc.HFLFHEGCBPL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HFLFHEGCBPL();
  }

  public static POGOProtos.Rpc.HFLFHEGCBPL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HFLFHEGCBPL>
      PARSER = new com.google.protobuf.AbstractParser<HFLFHEGCBPL>() {
    @java.lang.Override
    public HFLFHEGCBPL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HFLFHEGCBPL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HFLFHEGCBPL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HFLFHEGCBPL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HFLFHEGCBPL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

