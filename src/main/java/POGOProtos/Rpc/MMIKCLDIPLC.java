// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MMIKCLDIPLC}
 */
public  final class MMIKCLDIPLC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MMIKCLDIPLC)
    MMIKCLDIPLCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MMIKCLDIPLC.newBuilder() to construct.
  private MMIKCLDIPLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MMIKCLDIPLC() {
    mcbhgfedcci_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MMIKCLDIPLC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MMIKCLDIPLC(
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

            mcbhgfedcci_ = s;
            break;
          }
          case 16: {

            phabgnfglbg_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MMIKCLDIPLC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MMIKCLDIPLC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MMIKCLDIPLC.class, POGOProtos.Rpc.MMIKCLDIPLC.Builder.class);
  }

  public static final int MCBHGFEDCCI_FIELD_NUMBER = 1;
  private volatile java.lang.Object mcbhgfedcci_;
  /**
   * <code>string mcbhgfedcci = 1;</code>
   * @return The mcbhgfedcci.
   */
  public java.lang.String getMcbhgfedcci() {
    java.lang.Object ref = mcbhgfedcci_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mcbhgfedcci_ = s;
      return s;
    }
  }
  /**
   * <code>string mcbhgfedcci = 1;</code>
   * @return The bytes for mcbhgfedcci.
   */
  public com.google.protobuf.ByteString
      getMcbhgfedcciBytes() {
    java.lang.Object ref = mcbhgfedcci_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mcbhgfedcci_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHABGNFGLBG_FIELD_NUMBER = 2;
  private long phabgnfglbg_;
  /**
   * <code>int64 phabgnfglbg = 2;</code>
   * @return The phabgnfglbg.
   */
  public long getPhabgnfglbg() {
    return phabgnfglbg_;
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
    if (!getMcbhgfedcciBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mcbhgfedcci_);
    }
    if (phabgnfglbg_ != 0L) {
      output.writeInt64(2, phabgnfglbg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMcbhgfedcciBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mcbhgfedcci_);
    }
    if (phabgnfglbg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, phabgnfglbg_);
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
    if (!(obj instanceof POGOProtos.Rpc.MMIKCLDIPLC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MMIKCLDIPLC other = (POGOProtos.Rpc.MMIKCLDIPLC) obj;

    if (!getMcbhgfedcci()
        .equals(other.getMcbhgfedcci())) return false;
    if (getPhabgnfglbg()
        != other.getPhabgnfglbg()) return false;
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
    hash = (37 * hash) + MCBHGFEDCCI_FIELD_NUMBER;
    hash = (53 * hash) + getMcbhgfedcci().hashCode();
    hash = (37 * hash) + PHABGNFGLBG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhabgnfglbg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMIKCLDIPLC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MMIKCLDIPLC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MMIKCLDIPLC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MMIKCLDIPLC)
      POGOProtos.Rpc.MMIKCLDIPLCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MMIKCLDIPLC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MMIKCLDIPLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MMIKCLDIPLC.class, POGOProtos.Rpc.MMIKCLDIPLC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MMIKCLDIPLC.newBuilder()
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
      mcbhgfedcci_ = "";

      phabgnfglbg_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MMIKCLDIPLC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMIKCLDIPLC getDefaultInstanceForType() {
      return POGOProtos.Rpc.MMIKCLDIPLC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMIKCLDIPLC build() {
      POGOProtos.Rpc.MMIKCLDIPLC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMIKCLDIPLC buildPartial() {
      POGOProtos.Rpc.MMIKCLDIPLC result = new POGOProtos.Rpc.MMIKCLDIPLC(this);
      result.mcbhgfedcci_ = mcbhgfedcci_;
      result.phabgnfglbg_ = phabgnfglbg_;
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
      if (other instanceof POGOProtos.Rpc.MMIKCLDIPLC) {
        return mergeFrom((POGOProtos.Rpc.MMIKCLDIPLC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MMIKCLDIPLC other) {
      if (other == POGOProtos.Rpc.MMIKCLDIPLC.getDefaultInstance()) return this;
      if (!other.getMcbhgfedcci().isEmpty()) {
        mcbhgfedcci_ = other.mcbhgfedcci_;
        onChanged();
      }
      if (other.getPhabgnfglbg() != 0L) {
        setPhabgnfglbg(other.getPhabgnfglbg());
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
      POGOProtos.Rpc.MMIKCLDIPLC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MMIKCLDIPLC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mcbhgfedcci_ = "";
    /**
     * <code>string mcbhgfedcci = 1;</code>
     * @return The mcbhgfedcci.
     */
    public java.lang.String getMcbhgfedcci() {
      java.lang.Object ref = mcbhgfedcci_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mcbhgfedcci_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mcbhgfedcci = 1;</code>
     * @return The bytes for mcbhgfedcci.
     */
    public com.google.protobuf.ByteString
        getMcbhgfedcciBytes() {
      java.lang.Object ref = mcbhgfedcci_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mcbhgfedcci_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mcbhgfedcci = 1;</code>
     * @param value The mcbhgfedcci to set.
     * @return This builder for chaining.
     */
    public Builder setMcbhgfedcci(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mcbhgfedcci_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mcbhgfedcci = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMcbhgfedcci() {
      
      mcbhgfedcci_ = getDefaultInstance().getMcbhgfedcci();
      onChanged();
      return this;
    }
    /**
     * <code>string mcbhgfedcci = 1;</code>
     * @param value The bytes for mcbhgfedcci to set.
     * @return This builder for chaining.
     */
    public Builder setMcbhgfedcciBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mcbhgfedcci_ = value;
      onChanged();
      return this;
    }

    private long phabgnfglbg_ ;
    /**
     * <code>int64 phabgnfglbg = 2;</code>
     * @return The phabgnfglbg.
     */
    public long getPhabgnfglbg() {
      return phabgnfglbg_;
    }
    /**
     * <code>int64 phabgnfglbg = 2;</code>
     * @param value The phabgnfglbg to set.
     * @return This builder for chaining.
     */
    public Builder setPhabgnfglbg(long value) {
      
      phabgnfglbg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 phabgnfglbg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhabgnfglbg() {
      
      phabgnfglbg_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MMIKCLDIPLC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MMIKCLDIPLC)
  private static final POGOProtos.Rpc.MMIKCLDIPLC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MMIKCLDIPLC();
  }

  public static POGOProtos.Rpc.MMIKCLDIPLC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MMIKCLDIPLC>
      PARSER = new com.google.protobuf.AbstractParser<MMIKCLDIPLC>() {
    @java.lang.Override
    public MMIKCLDIPLC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MMIKCLDIPLC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MMIKCLDIPLC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MMIKCLDIPLC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MMIKCLDIPLC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

