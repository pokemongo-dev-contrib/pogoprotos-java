// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NMHMBPHBPNM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NMHMBPHBPNM}
 */
public  final class NMHMBPHBPNM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NMHMBPHBPNM)
    NMHMBPHBPNMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NMHMBPHBPNM.newBuilder() to construct.
  private NMHMBPHBPNM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NMHMBPHBPNM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NMHMBPHBPNM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NMHMBPHBPNM(
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
            POGOProtos.Rpc.OCBEPKANNHG.Builder subBuilder = null;
            if (gcmlhhodkac_ != null) {
              subBuilder = gcmlhhodkac_.toBuilder();
            }
            gcmlhhodkac_ = input.readMessage(POGOProtos.Rpc.OCBEPKANNHG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gcmlhhodkac_);
              gcmlhhodkac_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMHMBPHBPNM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMHMBPHBPNM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NMHMBPHBPNM.class, POGOProtos.Rpc.NMHMBPHBPNM.Builder.class);
  }

  public static final int GCMLHHODKAC_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac_;
  /**
   * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
   * @return Whether the gcmlhhodkac field is set.
   */
  public boolean hasGcmlhhodkac() {
    return gcmlhhodkac_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
   * @return The gcmlhhodkac.
   */
  public POGOProtos.Rpc.OCBEPKANNHG getGcmlhhodkac() {
    return gcmlhhodkac_ == null ? POGOProtos.Rpc.OCBEPKANNHG.getDefaultInstance() : gcmlhhodkac_;
  }
  /**
   * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
   */
  public POGOProtos.Rpc.OCBEPKANNHGOrBuilder getGcmlhhodkacOrBuilder() {
    return getGcmlhhodkac();
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
    if (gcmlhhodkac_ != null) {
      output.writeMessage(1, getGcmlhhodkac());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcmlhhodkac_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGcmlhhodkac());
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
    if (!(obj instanceof POGOProtos.Rpc.NMHMBPHBPNM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NMHMBPHBPNM other = (POGOProtos.Rpc.NMHMBPHBPNM) obj;

    if (hasGcmlhhodkac() != other.hasGcmlhhodkac()) return false;
    if (hasGcmlhhodkac()) {
      if (!getGcmlhhodkac()
          .equals(other.getGcmlhhodkac())) return false;
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
    if (hasGcmlhhodkac()) {
      hash = (37 * hash) + GCMLHHODKAC_FIELD_NUMBER;
      hash = (53 * hash) + getGcmlhhodkac().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMHMBPHBPNM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NMHMBPHBPNM prototype) {
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
   * ref: NMHMBPHBPNM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NMHMBPHBPNM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NMHMBPHBPNM)
      POGOProtos.Rpc.NMHMBPHBPNMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMHMBPHBPNM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMHMBPHBPNM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NMHMBPHBPNM.class, POGOProtos.Rpc.NMHMBPHBPNM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NMHMBPHBPNM.newBuilder()
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
      if (gcmlhhodkacBuilder_ == null) {
        gcmlhhodkac_ = null;
      } else {
        gcmlhhodkac_ = null;
        gcmlhhodkacBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMHMBPHBPNM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMHMBPHBPNM getDefaultInstanceForType() {
      return POGOProtos.Rpc.NMHMBPHBPNM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMHMBPHBPNM build() {
      POGOProtos.Rpc.NMHMBPHBPNM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMHMBPHBPNM buildPartial() {
      POGOProtos.Rpc.NMHMBPHBPNM result = new POGOProtos.Rpc.NMHMBPHBPNM(this);
      if (gcmlhhodkacBuilder_ == null) {
        result.gcmlhhodkac_ = gcmlhhodkac_;
      } else {
        result.gcmlhhodkac_ = gcmlhhodkacBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NMHMBPHBPNM) {
        return mergeFrom((POGOProtos.Rpc.NMHMBPHBPNM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NMHMBPHBPNM other) {
      if (other == POGOProtos.Rpc.NMHMBPHBPNM.getDefaultInstance()) return this;
      if (other.hasGcmlhhodkac()) {
        mergeGcmlhhodkac(other.getGcmlhhodkac());
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
      POGOProtos.Rpc.NMHMBPHBPNM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NMHMBPHBPNM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OCBEPKANNHG, POGOProtos.Rpc.OCBEPKANNHG.Builder, POGOProtos.Rpc.OCBEPKANNHGOrBuilder> gcmlhhodkacBuilder_;
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     * @return Whether the gcmlhhodkac field is set.
     */
    public boolean hasGcmlhhodkac() {
      return gcmlhhodkacBuilder_ != null || gcmlhhodkac_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     * @return The gcmlhhodkac.
     */
    public POGOProtos.Rpc.OCBEPKANNHG getGcmlhhodkac() {
      if (gcmlhhodkacBuilder_ == null) {
        return gcmlhhodkac_ == null ? POGOProtos.Rpc.OCBEPKANNHG.getDefaultInstance() : gcmlhhodkac_;
      } else {
        return gcmlhhodkacBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public Builder setGcmlhhodkac(POGOProtos.Rpc.OCBEPKANNHG value) {
      if (gcmlhhodkacBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcmlhhodkac_ = value;
        onChanged();
      } else {
        gcmlhhodkacBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public Builder setGcmlhhodkac(
        POGOProtos.Rpc.OCBEPKANNHG.Builder builderForValue) {
      if (gcmlhhodkacBuilder_ == null) {
        gcmlhhodkac_ = builderForValue.build();
        onChanged();
      } else {
        gcmlhhodkacBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public Builder mergeGcmlhhodkac(POGOProtos.Rpc.OCBEPKANNHG value) {
      if (gcmlhhodkacBuilder_ == null) {
        if (gcmlhhodkac_ != null) {
          gcmlhhodkac_ =
            POGOProtos.Rpc.OCBEPKANNHG.newBuilder(gcmlhhodkac_).mergeFrom(value).buildPartial();
        } else {
          gcmlhhodkac_ = value;
        }
        onChanged();
      } else {
        gcmlhhodkacBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public Builder clearGcmlhhodkac() {
      if (gcmlhhodkacBuilder_ == null) {
        gcmlhhodkac_ = null;
        onChanged();
      } else {
        gcmlhhodkac_ = null;
        gcmlhhodkacBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public POGOProtos.Rpc.OCBEPKANNHG.Builder getGcmlhhodkacBuilder() {
      
      onChanged();
      return getGcmlhhodkacFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    public POGOProtos.Rpc.OCBEPKANNHGOrBuilder getGcmlhhodkacOrBuilder() {
      if (gcmlhhodkacBuilder_ != null) {
        return gcmlhhodkacBuilder_.getMessageOrBuilder();
      } else {
        return gcmlhhodkac_ == null ?
            POGOProtos.Rpc.OCBEPKANNHG.getDefaultInstance() : gcmlhhodkac_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OCBEPKANNHG gcmlhhodkac = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OCBEPKANNHG, POGOProtos.Rpc.OCBEPKANNHG.Builder, POGOProtos.Rpc.OCBEPKANNHGOrBuilder> 
        getGcmlhhodkacFieldBuilder() {
      if (gcmlhhodkacBuilder_ == null) {
        gcmlhhodkacBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.OCBEPKANNHG, POGOProtos.Rpc.OCBEPKANNHG.Builder, POGOProtos.Rpc.OCBEPKANNHGOrBuilder>(
                getGcmlhhodkac(),
                getParentForChildren(),
                isClean());
        gcmlhhodkac_ = null;
      }
      return gcmlhhodkacBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NMHMBPHBPNM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NMHMBPHBPNM)
  private static final POGOProtos.Rpc.NMHMBPHBPNM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NMHMBPHBPNM();
  }

  public static POGOProtos.Rpc.NMHMBPHBPNM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NMHMBPHBPNM>
      PARSER = new com.google.protobuf.AbstractParser<NMHMBPHBPNM>() {
    @java.lang.Override
    public NMHMBPHBPNM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NMHMBPHBPNM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NMHMBPHBPNM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NMHMBPHBPNM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NMHMBPHBPNM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

