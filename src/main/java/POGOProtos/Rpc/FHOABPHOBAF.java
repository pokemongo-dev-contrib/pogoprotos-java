// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FHOABPHOBAF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FHOABPHOBAF}
 */
public final class FHOABPHOBAF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FHOABPHOBAF)
    FHOABPHOBAFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FHOABPHOBAF.newBuilder() to construct.
  private FHOABPHOBAF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FHOABPHOBAF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FHOABPHOBAF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FHOABPHOBAF(
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
          case 18: {
            POGOProtos.Rpc.IGIKHPECLLG.Builder subBuilder = null;
            if (aahnlecpglo_ != null) {
              subBuilder = aahnlecpglo_.toBuilder();
            }
            aahnlecpglo_ = input.readMessage(POGOProtos.Rpc.IGIKHPECLLG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(aahnlecpglo_);
              aahnlecpglo_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHOABPHOBAF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHOABPHOBAF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FHOABPHOBAF.class, POGOProtos.Rpc.FHOABPHOBAF.Builder.class);
  }

  public static final int AAHNLECPGLO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo_;
  /**
   * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
   * @return Whether the aahnlecpglo field is set.
   */
  @java.lang.Override
  public boolean hasAahnlecpglo() {
    return aahnlecpglo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
   * @return The aahnlecpglo.
   */
  @java.lang.Override
  public POGOProtos.Rpc.IGIKHPECLLG getAahnlecpglo() {
    return aahnlecpglo_ == null ? POGOProtos.Rpc.IGIKHPECLLG.getDefaultInstance() : aahnlecpglo_;
  }
  /**
   * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.IGIKHPECLLGOrBuilder getAahnlecpgloOrBuilder() {
    return getAahnlecpglo();
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
    if (aahnlecpglo_ != null) {
      output.writeMessage(2, getAahnlecpglo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aahnlecpglo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAahnlecpglo());
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
    if (!(obj instanceof POGOProtos.Rpc.FHOABPHOBAF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FHOABPHOBAF other = (POGOProtos.Rpc.FHOABPHOBAF) obj;

    if (hasAahnlecpglo() != other.hasAahnlecpglo()) return false;
    if (hasAahnlecpglo()) {
      if (!getAahnlecpglo()
          .equals(other.getAahnlecpglo())) return false;
    }
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
    if (hasAahnlecpglo()) {
      hash = (37 * hash) + AAHNLECPGLO_FIELD_NUMBER;
      hash = (53 * hash) + getAahnlecpglo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHOABPHOBAF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FHOABPHOBAF prototype) {
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
   * ref: FHOABPHOBAF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FHOABPHOBAF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FHOABPHOBAF)
      POGOProtos.Rpc.FHOABPHOBAFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHOABPHOBAF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHOABPHOBAF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FHOABPHOBAF.class, POGOProtos.Rpc.FHOABPHOBAF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FHOABPHOBAF.newBuilder()
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
      if (aahnlecpgloBuilder_ == null) {
        aahnlecpglo_ = null;
      } else {
        aahnlecpglo_ = null;
        aahnlecpgloBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHOABPHOBAF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHOABPHOBAF getDefaultInstanceForType() {
      return POGOProtos.Rpc.FHOABPHOBAF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHOABPHOBAF build() {
      POGOProtos.Rpc.FHOABPHOBAF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHOABPHOBAF buildPartial() {
      POGOProtos.Rpc.FHOABPHOBAF result = new POGOProtos.Rpc.FHOABPHOBAF(this);
      if (aahnlecpgloBuilder_ == null) {
        result.aahnlecpglo_ = aahnlecpglo_;
      } else {
        result.aahnlecpglo_ = aahnlecpgloBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.FHOABPHOBAF) {
        return mergeFrom((POGOProtos.Rpc.FHOABPHOBAF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FHOABPHOBAF other) {
      if (other == POGOProtos.Rpc.FHOABPHOBAF.getDefaultInstance()) return this;
      if (other.hasAahnlecpglo()) {
        mergeAahnlecpglo(other.getAahnlecpglo());
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
      POGOProtos.Rpc.FHOABPHOBAF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FHOABPHOBAF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IGIKHPECLLG, POGOProtos.Rpc.IGIKHPECLLG.Builder, POGOProtos.Rpc.IGIKHPECLLGOrBuilder> aahnlecpgloBuilder_;
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     * @return Whether the aahnlecpglo field is set.
     */
    public boolean hasAahnlecpglo() {
      return aahnlecpgloBuilder_ != null || aahnlecpglo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     * @return The aahnlecpglo.
     */
    public POGOProtos.Rpc.IGIKHPECLLG getAahnlecpglo() {
      if (aahnlecpgloBuilder_ == null) {
        return aahnlecpglo_ == null ? POGOProtos.Rpc.IGIKHPECLLG.getDefaultInstance() : aahnlecpglo_;
      } else {
        return aahnlecpgloBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public Builder setAahnlecpglo(POGOProtos.Rpc.IGIKHPECLLG value) {
      if (aahnlecpgloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aahnlecpglo_ = value;
        onChanged();
      } else {
        aahnlecpgloBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public Builder setAahnlecpglo(
        POGOProtos.Rpc.IGIKHPECLLG.Builder builderForValue) {
      if (aahnlecpgloBuilder_ == null) {
        aahnlecpglo_ = builderForValue.build();
        onChanged();
      } else {
        aahnlecpgloBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public Builder mergeAahnlecpglo(POGOProtos.Rpc.IGIKHPECLLG value) {
      if (aahnlecpgloBuilder_ == null) {
        if (aahnlecpglo_ != null) {
          aahnlecpglo_ =
            POGOProtos.Rpc.IGIKHPECLLG.newBuilder(aahnlecpglo_).mergeFrom(value).buildPartial();
        } else {
          aahnlecpglo_ = value;
        }
        onChanged();
      } else {
        aahnlecpgloBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public Builder clearAahnlecpglo() {
      if (aahnlecpgloBuilder_ == null) {
        aahnlecpglo_ = null;
        onChanged();
      } else {
        aahnlecpglo_ = null;
        aahnlecpgloBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public POGOProtos.Rpc.IGIKHPECLLG.Builder getAahnlecpgloBuilder() {
      
      onChanged();
      return getAahnlecpgloFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    public POGOProtos.Rpc.IGIKHPECLLGOrBuilder getAahnlecpgloOrBuilder() {
      if (aahnlecpgloBuilder_ != null) {
        return aahnlecpgloBuilder_.getMessageOrBuilder();
      } else {
        return aahnlecpglo_ == null ?
            POGOProtos.Rpc.IGIKHPECLLG.getDefaultInstance() : aahnlecpglo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IGIKHPECLLG aahnlecpglo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IGIKHPECLLG, POGOProtos.Rpc.IGIKHPECLLG.Builder, POGOProtos.Rpc.IGIKHPECLLGOrBuilder> 
        getAahnlecpgloFieldBuilder() {
      if (aahnlecpgloBuilder_ == null) {
        aahnlecpgloBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.IGIKHPECLLG, POGOProtos.Rpc.IGIKHPECLLG.Builder, POGOProtos.Rpc.IGIKHPECLLGOrBuilder>(
                getAahnlecpglo(),
                getParentForChildren(),
                isClean());
        aahnlecpglo_ = null;
      }
      return aahnlecpgloBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FHOABPHOBAF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FHOABPHOBAF)
  private static final POGOProtos.Rpc.FHOABPHOBAF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FHOABPHOBAF();
  }

  public static POGOProtos.Rpc.FHOABPHOBAF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHOABPHOBAF>
      PARSER = new com.google.protobuf.AbstractParser<FHOABPHOBAF>() {
    @java.lang.Override
    public FHOABPHOBAF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FHOABPHOBAF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FHOABPHOBAF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHOABPHOBAF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FHOABPHOBAF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

