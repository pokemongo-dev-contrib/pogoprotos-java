// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DMMFJJACLEE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DMMFJJACLEE}
 */
public  final class DMMFJJACLEE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DMMFJJACLEE)
    DMMFJJACLEEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DMMFJJACLEE.newBuilder() to construct.
  private DMMFJJACLEE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DMMFJJACLEE() {
    bkokgaafddl_ = com.google.protobuf.ByteString.EMPTY;
    gjicmkobgjk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DMMFJJACLEE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DMMFJJACLEE(
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

            bkokgaafddl_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            gjicmkobgjk_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMMFJJACLEE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMMFJJACLEE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DMMFJJACLEE.class, POGOProtos.Rpc.DMMFJJACLEE.Builder.class);
  }

  public static final int BKOKGAAFDDL_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString bkokgaafddl_;
  /**
   * <code>bytes bkokgaafddl = 1;</code>
   * @return The bkokgaafddl.
   */
  public com.google.protobuf.ByteString getBkokgaafddl() {
    return bkokgaafddl_;
  }

  public static final int GJICMKOBGJK_FIELD_NUMBER = 2;
  private volatile java.lang.Object gjicmkobgjk_;
  /**
   * <code>string gjicmkobgjk = 2;</code>
   * @return The gjicmkobgjk.
   */
  public java.lang.String getGjicmkobgjk() {
    java.lang.Object ref = gjicmkobgjk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gjicmkobgjk_ = s;
      return s;
    }
  }
  /**
   * <code>string gjicmkobgjk = 2;</code>
   * @return The bytes for gjicmkobgjk.
   */
  public com.google.protobuf.ByteString
      getGjicmkobgjkBytes() {
    java.lang.Object ref = gjicmkobgjk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gjicmkobgjk_ = b;
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
    if (!bkokgaafddl_.isEmpty()) {
      output.writeBytes(1, bkokgaafddl_);
    }
    if (!getGjicmkobgjkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gjicmkobgjk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!bkokgaafddl_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, bkokgaafddl_);
    }
    if (!getGjicmkobgjkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gjicmkobgjk_);
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
    if (!(obj instanceof POGOProtos.Rpc.DMMFJJACLEE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DMMFJJACLEE other = (POGOProtos.Rpc.DMMFJJACLEE) obj;

    if (!getBkokgaafddl()
        .equals(other.getBkokgaafddl())) return false;
    if (!getGjicmkobgjk()
        .equals(other.getGjicmkobgjk())) return false;
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
    hash = (37 * hash) + BKOKGAAFDDL_FIELD_NUMBER;
    hash = (53 * hash) + getBkokgaafddl().hashCode();
    hash = (37 * hash) + GJICMKOBGJK_FIELD_NUMBER;
    hash = (53 * hash) + getGjicmkobgjk().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DMMFJJACLEE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DMMFJJACLEE prototype) {
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
   * ref: DMMFJJACLEE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DMMFJJACLEE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DMMFJJACLEE)
      POGOProtos.Rpc.DMMFJJACLEEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMMFJJACLEE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMMFJJACLEE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DMMFJJACLEE.class, POGOProtos.Rpc.DMMFJJACLEE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DMMFJJACLEE.newBuilder()
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
      bkokgaafddl_ = com.google.protobuf.ByteString.EMPTY;

      gjicmkobgjk_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DMMFJJACLEE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMMFJJACLEE getDefaultInstanceForType() {
      return POGOProtos.Rpc.DMMFJJACLEE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMMFJJACLEE build() {
      POGOProtos.Rpc.DMMFJJACLEE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DMMFJJACLEE buildPartial() {
      POGOProtos.Rpc.DMMFJJACLEE result = new POGOProtos.Rpc.DMMFJJACLEE(this);
      result.bkokgaafddl_ = bkokgaafddl_;
      result.gjicmkobgjk_ = gjicmkobgjk_;
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
      if (other instanceof POGOProtos.Rpc.DMMFJJACLEE) {
        return mergeFrom((POGOProtos.Rpc.DMMFJJACLEE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DMMFJJACLEE other) {
      if (other == POGOProtos.Rpc.DMMFJJACLEE.getDefaultInstance()) return this;
      if (other.getBkokgaafddl() != com.google.protobuf.ByteString.EMPTY) {
        setBkokgaafddl(other.getBkokgaafddl());
      }
      if (!other.getGjicmkobgjk().isEmpty()) {
        gjicmkobgjk_ = other.gjicmkobgjk_;
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
      POGOProtos.Rpc.DMMFJJACLEE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DMMFJJACLEE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString bkokgaafddl_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bkokgaafddl = 1;</code>
     * @return The bkokgaafddl.
     */
    public com.google.protobuf.ByteString getBkokgaafddl() {
      return bkokgaafddl_;
    }
    /**
     * <code>bytes bkokgaafddl = 1;</code>
     * @param value The bkokgaafddl to set.
     * @return This builder for chaining.
     */
    public Builder setBkokgaafddl(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bkokgaafddl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bkokgaafddl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBkokgaafddl() {
      
      bkokgaafddl_ = getDefaultInstance().getBkokgaafddl();
      onChanged();
      return this;
    }

    private java.lang.Object gjicmkobgjk_ = "";
    /**
     * <code>string gjicmkobgjk = 2;</code>
     * @return The gjicmkobgjk.
     */
    public java.lang.String getGjicmkobgjk() {
      java.lang.Object ref = gjicmkobgjk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gjicmkobgjk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gjicmkobgjk = 2;</code>
     * @return The bytes for gjicmkobgjk.
     */
    public com.google.protobuf.ByteString
        getGjicmkobgjkBytes() {
      java.lang.Object ref = gjicmkobgjk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gjicmkobgjk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gjicmkobgjk = 2;</code>
     * @param value The gjicmkobgjk to set.
     * @return This builder for chaining.
     */
    public Builder setGjicmkobgjk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gjicmkobgjk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gjicmkobgjk = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjicmkobgjk() {
      
      gjicmkobgjk_ = getDefaultInstance().getGjicmkobgjk();
      onChanged();
      return this;
    }
    /**
     * <code>string gjicmkobgjk = 2;</code>
     * @param value The bytes for gjicmkobgjk to set.
     * @return This builder for chaining.
     */
    public Builder setGjicmkobgjkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gjicmkobgjk_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DMMFJJACLEE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DMMFJJACLEE)
  private static final POGOProtos.Rpc.DMMFJJACLEE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DMMFJJACLEE();
  }

  public static POGOProtos.Rpc.DMMFJJACLEE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DMMFJJACLEE>
      PARSER = new com.google.protobuf.AbstractParser<DMMFJJACLEE>() {
    @java.lang.Override
    public DMMFJJACLEE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DMMFJJACLEE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DMMFJJACLEE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DMMFJJACLEE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DMMFJJACLEE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

