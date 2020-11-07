// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaBleFinalizeTransfer}
 */
public final class BelugaBleFinalizeTransfer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaBleFinalizeTransfer)
    BelugaBleFinalizeTransferOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaBleFinalizeTransfer.newBuilder() to construct.
  private BelugaBleFinalizeTransfer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaBleFinalizeTransfer() {
    serverSignature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaBleFinalizeTransfer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaBleFinalizeTransfer(
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
            POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder subBuilder = null;
            if (belugaTransferComplete_ != null) {
              subBuilder = belugaTransferComplete_.toBuilder();
            }
            belugaTransferComplete_ = input.readMessage(POGOProtos.Rpc.BelugaBleTransferCompleteProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(belugaTransferComplete_);
              belugaTransferComplete_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            serverSignature_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleFinalizeTransfer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleFinalizeTransfer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaBleFinalizeTransfer.class, POGOProtos.Rpc.BelugaBleFinalizeTransfer.Builder.class);
  }

  public static final int BELUGA_TRANSFER_COMPLETE_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.BelugaBleTransferCompleteProto belugaTransferComplete_;
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
   * @return Whether the belugaTransferComplete field is set.
   */
  @java.lang.Override
  public boolean hasBelugaTransferComplete() {
    return belugaTransferComplete_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
   * @return The belugaTransferComplete.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferCompleteProto getBelugaTransferComplete() {
    return belugaTransferComplete_ == null ? POGOProtos.Rpc.BelugaBleTransferCompleteProto.getDefaultInstance() : belugaTransferComplete_;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferCompleteProtoOrBuilder getBelugaTransferCompleteOrBuilder() {
    return getBelugaTransferComplete();
  }

  public static final int SERVER_SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString serverSignature_;
  /**
   * <code>bytes server_signature = 2;</code>
   * @return The serverSignature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServerSignature() {
    return serverSignature_;
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
    if (belugaTransferComplete_ != null) {
      output.writeMessage(1, getBelugaTransferComplete());
    }
    if (!serverSignature_.isEmpty()) {
      output.writeBytes(2, serverSignature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (belugaTransferComplete_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBelugaTransferComplete());
    }
    if (!serverSignature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, serverSignature_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaBleFinalizeTransfer)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaBleFinalizeTransfer other = (POGOProtos.Rpc.BelugaBleFinalizeTransfer) obj;

    if (hasBelugaTransferComplete() != other.hasBelugaTransferComplete()) return false;
    if (hasBelugaTransferComplete()) {
      if (!getBelugaTransferComplete()
          .equals(other.getBelugaTransferComplete())) return false;
    }
    if (!getServerSignature()
        .equals(other.getServerSignature())) return false;
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
    if (hasBelugaTransferComplete()) {
      hash = (37 * hash) + BELUGA_TRANSFER_COMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + getBelugaTransferComplete().hashCode();
    }
    hash = (37 * hash) + SERVER_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getServerSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaBleFinalizeTransfer prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaBleFinalizeTransfer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaBleFinalizeTransfer)
      POGOProtos.Rpc.BelugaBleFinalizeTransferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleFinalizeTransfer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleFinalizeTransfer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaBleFinalizeTransfer.class, POGOProtos.Rpc.BelugaBleFinalizeTransfer.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaBleFinalizeTransfer.newBuilder()
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
      if (belugaTransferCompleteBuilder_ == null) {
        belugaTransferComplete_ = null;
      } else {
        belugaTransferComplete_ = null;
        belugaTransferCompleteBuilder_ = null;
      }
      serverSignature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleFinalizeTransfer_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleFinalizeTransfer getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaBleFinalizeTransfer.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleFinalizeTransfer build() {
      POGOProtos.Rpc.BelugaBleFinalizeTransfer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleFinalizeTransfer buildPartial() {
      POGOProtos.Rpc.BelugaBleFinalizeTransfer result = new POGOProtos.Rpc.BelugaBleFinalizeTransfer(this);
      if (belugaTransferCompleteBuilder_ == null) {
        result.belugaTransferComplete_ = belugaTransferComplete_;
      } else {
        result.belugaTransferComplete_ = belugaTransferCompleteBuilder_.build();
      }
      result.serverSignature_ = serverSignature_;
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
      if (other instanceof POGOProtos.Rpc.BelugaBleFinalizeTransfer) {
        return mergeFrom((POGOProtos.Rpc.BelugaBleFinalizeTransfer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaBleFinalizeTransfer other) {
      if (other == POGOProtos.Rpc.BelugaBleFinalizeTransfer.getDefaultInstance()) return this;
      if (other.hasBelugaTransferComplete()) {
        mergeBelugaTransferComplete(other.getBelugaTransferComplete());
      }
      if (other.getServerSignature() != com.google.protobuf.ByteString.EMPTY) {
        setServerSignature(other.getServerSignature());
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
      POGOProtos.Rpc.BelugaBleFinalizeTransfer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaBleFinalizeTransfer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.BelugaBleTransferCompleteProto belugaTransferComplete_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleTransferCompleteProto, POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder, POGOProtos.Rpc.BelugaBleTransferCompleteProtoOrBuilder> belugaTransferCompleteBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     * @return Whether the belugaTransferComplete field is set.
     */
    public boolean hasBelugaTransferComplete() {
      return belugaTransferCompleteBuilder_ != null || belugaTransferComplete_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     * @return The belugaTransferComplete.
     */
    public POGOProtos.Rpc.BelugaBleTransferCompleteProto getBelugaTransferComplete() {
      if (belugaTransferCompleteBuilder_ == null) {
        return belugaTransferComplete_ == null ? POGOProtos.Rpc.BelugaBleTransferCompleteProto.getDefaultInstance() : belugaTransferComplete_;
      } else {
        return belugaTransferCompleteBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public Builder setBelugaTransferComplete(POGOProtos.Rpc.BelugaBleTransferCompleteProto value) {
      if (belugaTransferCompleteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        belugaTransferComplete_ = value;
        onChanged();
      } else {
        belugaTransferCompleteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public Builder setBelugaTransferComplete(
        POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder builderForValue) {
      if (belugaTransferCompleteBuilder_ == null) {
        belugaTransferComplete_ = builderForValue.build();
        onChanged();
      } else {
        belugaTransferCompleteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public Builder mergeBelugaTransferComplete(POGOProtos.Rpc.BelugaBleTransferCompleteProto value) {
      if (belugaTransferCompleteBuilder_ == null) {
        if (belugaTransferComplete_ != null) {
          belugaTransferComplete_ =
            POGOProtos.Rpc.BelugaBleTransferCompleteProto.newBuilder(belugaTransferComplete_).mergeFrom(value).buildPartial();
        } else {
          belugaTransferComplete_ = value;
        }
        onChanged();
      } else {
        belugaTransferCompleteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public Builder clearBelugaTransferComplete() {
      if (belugaTransferCompleteBuilder_ == null) {
        belugaTransferComplete_ = null;
        onChanged();
      } else {
        belugaTransferComplete_ = null;
        belugaTransferCompleteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder getBelugaTransferCompleteBuilder() {
      
      onChanged();
      return getBelugaTransferCompleteFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleTransferCompleteProtoOrBuilder getBelugaTransferCompleteOrBuilder() {
      if (belugaTransferCompleteBuilder_ != null) {
        return belugaTransferCompleteBuilder_.getMessageOrBuilder();
      } else {
        return belugaTransferComplete_ == null ?
            POGOProtos.Rpc.BelugaBleTransferCompleteProto.getDefaultInstance() : belugaTransferComplete_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferCompleteProto beluga_transfer_complete = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleTransferCompleteProto, POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder, POGOProtos.Rpc.BelugaBleTransferCompleteProtoOrBuilder> 
        getBelugaTransferCompleteFieldBuilder() {
      if (belugaTransferCompleteBuilder_ == null) {
        belugaTransferCompleteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BelugaBleTransferCompleteProto, POGOProtos.Rpc.BelugaBleTransferCompleteProto.Builder, POGOProtos.Rpc.BelugaBleTransferCompleteProtoOrBuilder>(
                getBelugaTransferComplete(),
                getParentForChildren(),
                isClean());
        belugaTransferComplete_ = null;
      }
      return belugaTransferCompleteBuilder_;
    }

    private com.google.protobuf.ByteString serverSignature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes server_signature = 2;</code>
     * @return The serverSignature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getServerSignature() {
      return serverSignature_;
    }
    /**
     * <code>bytes server_signature = 2;</code>
     * @param value The serverSignature to set.
     * @return This builder for chaining.
     */
    public Builder setServerSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes server_signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerSignature() {
      
      serverSignature_ = getDefaultInstance().getServerSignature();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaBleFinalizeTransfer)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaBleFinalizeTransfer)
  private static final POGOProtos.Rpc.BelugaBleFinalizeTransfer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaBleFinalizeTransfer();
  }

  public static POGOProtos.Rpc.BelugaBleFinalizeTransfer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaBleFinalizeTransfer>
      PARSER = new com.google.protobuf.AbstractParser<BelugaBleFinalizeTransfer>() {
    @java.lang.Override
    public BelugaBleFinalizeTransfer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaBleFinalizeTransfer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaBleFinalizeTransfer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaBleFinalizeTransfer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleFinalizeTransfer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

