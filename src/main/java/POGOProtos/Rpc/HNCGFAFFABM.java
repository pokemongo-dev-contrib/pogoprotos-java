// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HNCGFAFFABM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HNCGFAFFABM}
 */
public final class HNCGFAFFABM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HNCGFAFFABM)
    HNCGFAFFABMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HNCGFAFFABM.newBuilder() to construct.
  private HNCGFAFFABM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HNCGFAFFABM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HNCGFAFFABM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HNCGFAFFABM(
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
            POGOProtos.Rpc.AJNNNHJCCGD.Builder subBuilder = null;
            if (jelghdhedjb_ != null) {
              subBuilder = jelghdhedjb_.toBuilder();
            }
            jelghdhedjb_ = input.readMessage(POGOProtos.Rpc.AJNNNHJCCGD.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jelghdhedjb_);
              jelghdhedjb_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNCGFAFFABM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNCGFAFFABM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HNCGFAFFABM.class, POGOProtos.Rpc.HNCGFAFFABM.Builder.class);
  }

  public static final int JELGHDHEDJB_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb_;
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
   * @return Whether the jelghdhedjb field is set.
   */
  @java.lang.Override
  public boolean hasJelghdhedjb() {
    return jelghdhedjb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
   * @return The jelghdhedjb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGD getJelghdhedjb() {
    return jelghdhedjb_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getJelghdhedjbOrBuilder() {
    return getJelghdhedjb();
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
    if (jelghdhedjb_ != null) {
      output.writeMessage(1, getJelghdhedjb());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jelghdhedjb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJelghdhedjb());
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
    if (!(obj instanceof POGOProtos.Rpc.HNCGFAFFABM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HNCGFAFFABM other = (POGOProtos.Rpc.HNCGFAFFABM) obj;

    if (hasJelghdhedjb() != other.hasJelghdhedjb()) return false;
    if (hasJelghdhedjb()) {
      if (!getJelghdhedjb()
          .equals(other.getJelghdhedjb())) return false;
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
    if (hasJelghdhedjb()) {
      hash = (37 * hash) + JELGHDHEDJB_FIELD_NUMBER;
      hash = (53 * hash) + getJelghdhedjb().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNCGFAFFABM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HNCGFAFFABM prototype) {
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
   * ref: HNCGFAFFABM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HNCGFAFFABM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HNCGFAFFABM)
      POGOProtos.Rpc.HNCGFAFFABMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNCGFAFFABM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNCGFAFFABM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HNCGFAFFABM.class, POGOProtos.Rpc.HNCGFAFFABM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HNCGFAFFABM.newBuilder()
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
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNCGFAFFABM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNCGFAFFABM getDefaultInstanceForType() {
      return POGOProtos.Rpc.HNCGFAFFABM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNCGFAFFABM build() {
      POGOProtos.Rpc.HNCGFAFFABM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNCGFAFFABM buildPartial() {
      POGOProtos.Rpc.HNCGFAFFABM result = new POGOProtos.Rpc.HNCGFAFFABM(this);
      if (jelghdhedjbBuilder_ == null) {
        result.jelghdhedjb_ = jelghdhedjb_;
      } else {
        result.jelghdhedjb_ = jelghdhedjbBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.HNCGFAFFABM) {
        return mergeFrom((POGOProtos.Rpc.HNCGFAFFABM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HNCGFAFFABM other) {
      if (other == POGOProtos.Rpc.HNCGFAFFABM.getDefaultInstance()) return this;
      if (other.hasJelghdhedjb()) {
        mergeJelghdhedjb(other.getJelghdhedjb());
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
      POGOProtos.Rpc.HNCGFAFFABM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HNCGFAFFABM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> jelghdhedjbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     * @return Whether the jelghdhedjb field is set.
     */
    public boolean hasJelghdhedjb() {
      return jelghdhedjbBuilder_ != null || jelghdhedjb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     * @return The jelghdhedjb.
     */
    public POGOProtos.Rpc.AJNNNHJCCGD getJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        return jelghdhedjb_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
      } else {
        return jelghdhedjbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public Builder setJelghdhedjb(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (jelghdhedjbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jelghdhedjb_ = value;
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public Builder setJelghdhedjb(
        POGOProtos.Rpc.AJNNNHJCCGD.Builder builderForValue) {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = builderForValue.build();
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public Builder mergeJelghdhedjb(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (jelghdhedjbBuilder_ == null) {
        if (jelghdhedjb_ != null) {
          jelghdhedjb_ =
            POGOProtos.Rpc.AJNNNHJCCGD.newBuilder(jelghdhedjb_).mergeFrom(value).buildPartial();
        } else {
          jelghdhedjb_ = value;
        }
        onChanged();
      } else {
        jelghdhedjbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public Builder clearJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
        onChanged();
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGD.Builder getJelghdhedjbBuilder() {
      
      onChanged();
      return getJelghdhedjbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getJelghdhedjbOrBuilder() {
      if (jelghdhedjbBuilder_ != null) {
        return jelghdhedjbBuilder_.getMessageOrBuilder();
      } else {
        return jelghdhedjb_ == null ?
            POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> 
        getJelghdhedjbFieldBuilder() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder>(
                getJelghdhedjb(),
                getParentForChildren(),
                isClean());
        jelghdhedjb_ = null;
      }
      return jelghdhedjbBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HNCGFAFFABM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HNCGFAFFABM)
  private static final POGOProtos.Rpc.HNCGFAFFABM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HNCGFAFFABM();
  }

  public static POGOProtos.Rpc.HNCGFAFFABM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HNCGFAFFABM>
      PARSER = new com.google.protobuf.AbstractParser<HNCGFAFFABM>() {
    @java.lang.Override
    public HNCGFAFFABM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HNCGFAFFABM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HNCGFAFFABM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HNCGFAFFABM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HNCGFAFFABM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

