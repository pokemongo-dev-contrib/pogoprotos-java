// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DNBADCFGFNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DNBADCFGFNN}
 */
public final class DNBADCFGFNN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DNBADCFGFNN)
    DNBADCFGFNNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNBADCFGFNN.newBuilder() to construct.
  private DNBADCFGFNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNBADCFGFNN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNBADCFGFNN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DNBADCFGFNN(
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
            POGOProtos.Rpc.HLLMEPCKDHE.Builder subBuilder = null;
            if (aidkhmpjfie_ != null) {
              subBuilder = aidkhmpjfie_.toBuilder();
            }
            aidkhmpjfie_ = input.readMessage(POGOProtos.Rpc.HLLMEPCKDHE.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(aidkhmpjfie_);
              aidkhmpjfie_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            neoehgghidn_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNBADCFGFNN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNBADCFGFNN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DNBADCFGFNN.class, POGOProtos.Rpc.DNBADCFGFNN.Builder.class);
  }

  public static final int AIDKHMPJFIE_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie_;
  /**
   * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
   * @return Whether the aidkhmpjfie field is set.
   */
  @java.lang.Override
  public boolean hasAidkhmpjfie() {
    return aidkhmpjfie_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
   * @return The aidkhmpjfie.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HLLMEPCKDHE getAidkhmpjfie() {
    return aidkhmpjfie_ == null ? POGOProtos.Rpc.HLLMEPCKDHE.getDefaultInstance() : aidkhmpjfie_;
  }
  /**
   * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HLLMEPCKDHEOrBuilder getAidkhmpjfieOrBuilder() {
    return getAidkhmpjfie();
  }

  public static final int NEOEHGGHIDN_FIELD_NUMBER = 2;
  private long neoehgghidn_;
  /**
   * <code>int64 neoehgghidn = 2;</code>
   * @return The neoehgghidn.
   */
  @java.lang.Override
  public long getNeoehgghidn() {
    return neoehgghidn_;
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
    if (aidkhmpjfie_ != null) {
      output.writeMessage(1, getAidkhmpjfie());
    }
    if (neoehgghidn_ != 0L) {
      output.writeInt64(2, neoehgghidn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aidkhmpjfie_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAidkhmpjfie());
    }
    if (neoehgghidn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, neoehgghidn_);
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
    if (!(obj instanceof POGOProtos.Rpc.DNBADCFGFNN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DNBADCFGFNN other = (POGOProtos.Rpc.DNBADCFGFNN) obj;

    if (hasAidkhmpjfie() != other.hasAidkhmpjfie()) return false;
    if (hasAidkhmpjfie()) {
      if (!getAidkhmpjfie()
          .equals(other.getAidkhmpjfie())) return false;
    }
    if (getNeoehgghidn()
        != other.getNeoehgghidn()) return false;
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
    if (hasAidkhmpjfie()) {
      hash = (37 * hash) + AIDKHMPJFIE_FIELD_NUMBER;
      hash = (53 * hash) + getAidkhmpjfie().hashCode();
    }
    hash = (37 * hash) + NEOEHGGHIDN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNeoehgghidn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNBADCFGFNN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DNBADCFGFNN prototype) {
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
   * ref: DNBADCFGFNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DNBADCFGFNN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DNBADCFGFNN)
      POGOProtos.Rpc.DNBADCFGFNNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNBADCFGFNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNBADCFGFNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DNBADCFGFNN.class, POGOProtos.Rpc.DNBADCFGFNN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DNBADCFGFNN.newBuilder()
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
      if (aidkhmpjfieBuilder_ == null) {
        aidkhmpjfie_ = null;
      } else {
        aidkhmpjfie_ = null;
        aidkhmpjfieBuilder_ = null;
      }
      neoehgghidn_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNBADCFGFNN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNBADCFGFNN getDefaultInstanceForType() {
      return POGOProtos.Rpc.DNBADCFGFNN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNBADCFGFNN build() {
      POGOProtos.Rpc.DNBADCFGFNN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNBADCFGFNN buildPartial() {
      POGOProtos.Rpc.DNBADCFGFNN result = new POGOProtos.Rpc.DNBADCFGFNN(this);
      if (aidkhmpjfieBuilder_ == null) {
        result.aidkhmpjfie_ = aidkhmpjfie_;
      } else {
        result.aidkhmpjfie_ = aidkhmpjfieBuilder_.build();
      }
      result.neoehgghidn_ = neoehgghidn_;
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
      if (other instanceof POGOProtos.Rpc.DNBADCFGFNN) {
        return mergeFrom((POGOProtos.Rpc.DNBADCFGFNN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DNBADCFGFNN other) {
      if (other == POGOProtos.Rpc.DNBADCFGFNN.getDefaultInstance()) return this;
      if (other.hasAidkhmpjfie()) {
        mergeAidkhmpjfie(other.getAidkhmpjfie());
      }
      if (other.getNeoehgghidn() != 0L) {
        setNeoehgghidn(other.getNeoehgghidn());
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
      POGOProtos.Rpc.DNBADCFGFNN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DNBADCFGFNN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HLLMEPCKDHE, POGOProtos.Rpc.HLLMEPCKDHE.Builder, POGOProtos.Rpc.HLLMEPCKDHEOrBuilder> aidkhmpjfieBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     * @return Whether the aidkhmpjfie field is set.
     */
    public boolean hasAidkhmpjfie() {
      return aidkhmpjfieBuilder_ != null || aidkhmpjfie_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     * @return The aidkhmpjfie.
     */
    public POGOProtos.Rpc.HLLMEPCKDHE getAidkhmpjfie() {
      if (aidkhmpjfieBuilder_ == null) {
        return aidkhmpjfie_ == null ? POGOProtos.Rpc.HLLMEPCKDHE.getDefaultInstance() : aidkhmpjfie_;
      } else {
        return aidkhmpjfieBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public Builder setAidkhmpjfie(POGOProtos.Rpc.HLLMEPCKDHE value) {
      if (aidkhmpjfieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aidkhmpjfie_ = value;
        onChanged();
      } else {
        aidkhmpjfieBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public Builder setAidkhmpjfie(
        POGOProtos.Rpc.HLLMEPCKDHE.Builder builderForValue) {
      if (aidkhmpjfieBuilder_ == null) {
        aidkhmpjfie_ = builderForValue.build();
        onChanged();
      } else {
        aidkhmpjfieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public Builder mergeAidkhmpjfie(POGOProtos.Rpc.HLLMEPCKDHE value) {
      if (aidkhmpjfieBuilder_ == null) {
        if (aidkhmpjfie_ != null) {
          aidkhmpjfie_ =
            POGOProtos.Rpc.HLLMEPCKDHE.newBuilder(aidkhmpjfie_).mergeFrom(value).buildPartial();
        } else {
          aidkhmpjfie_ = value;
        }
        onChanged();
      } else {
        aidkhmpjfieBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public Builder clearAidkhmpjfie() {
      if (aidkhmpjfieBuilder_ == null) {
        aidkhmpjfie_ = null;
        onChanged();
      } else {
        aidkhmpjfie_ = null;
        aidkhmpjfieBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public POGOProtos.Rpc.HLLMEPCKDHE.Builder getAidkhmpjfieBuilder() {
      
      onChanged();
      return getAidkhmpjfieFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    public POGOProtos.Rpc.HLLMEPCKDHEOrBuilder getAidkhmpjfieOrBuilder() {
      if (aidkhmpjfieBuilder_ != null) {
        return aidkhmpjfieBuilder_.getMessageOrBuilder();
      } else {
        return aidkhmpjfie_ == null ?
            POGOProtos.Rpc.HLLMEPCKDHE.getDefaultInstance() : aidkhmpjfie_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HLLMEPCKDHE aidkhmpjfie = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HLLMEPCKDHE, POGOProtos.Rpc.HLLMEPCKDHE.Builder, POGOProtos.Rpc.HLLMEPCKDHEOrBuilder> 
        getAidkhmpjfieFieldBuilder() {
      if (aidkhmpjfieBuilder_ == null) {
        aidkhmpjfieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HLLMEPCKDHE, POGOProtos.Rpc.HLLMEPCKDHE.Builder, POGOProtos.Rpc.HLLMEPCKDHEOrBuilder>(
                getAidkhmpjfie(),
                getParentForChildren(),
                isClean());
        aidkhmpjfie_ = null;
      }
      return aidkhmpjfieBuilder_;
    }

    private long neoehgghidn_ ;
    /**
     * <code>int64 neoehgghidn = 2;</code>
     * @return The neoehgghidn.
     */
    @java.lang.Override
    public long getNeoehgghidn() {
      return neoehgghidn_;
    }
    /**
     * <code>int64 neoehgghidn = 2;</code>
     * @param value The neoehgghidn to set.
     * @return This builder for chaining.
     */
    public Builder setNeoehgghidn(long value) {
      
      neoehgghidn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 neoehgghidn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeoehgghidn() {
      
      neoehgghidn_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DNBADCFGFNN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DNBADCFGFNN)
  private static final POGOProtos.Rpc.DNBADCFGFNN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DNBADCFGFNN();
  }

  public static POGOProtos.Rpc.DNBADCFGFNN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNBADCFGFNN>
      PARSER = new com.google.protobuf.AbstractParser<DNBADCFGFNN>() {
    @java.lang.Override
    public DNBADCFGFNN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DNBADCFGFNN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DNBADCFGFNN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNBADCFGFNN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DNBADCFGFNN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

