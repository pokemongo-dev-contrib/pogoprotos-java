// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NOMAGBPDOCA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NOMAGBPDOCA}
 */
public  final class NOMAGBPDOCA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NOMAGBPDOCA)
    NOMAGBPDOCAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NOMAGBPDOCA.newBuilder() to construct.
  private NOMAGBPDOCA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NOMAGBPDOCA() {
    gklgkpkgbfe_ = com.google.protobuf.ByteString.EMPTY;
    hdodgokkiho_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NOMAGBPDOCA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NOMAGBPDOCA(
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
            POGOProtos.Rpc.NBPNINIOPDH.Builder subBuilder = null;
            if (bpeeenjgagn_ != null) {
              subBuilder = bpeeenjgagn_.toBuilder();
            }
            bpeeenjgagn_ = input.readMessage(POGOProtos.Rpc.NBPNINIOPDH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bpeeenjgagn_);
              bpeeenjgagn_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            gklgkpkgbfe_ = input.readBytes();
            break;
          }
          case 26: {

            hdodgokkiho_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOMAGBPDOCA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOMAGBPDOCA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NOMAGBPDOCA.class, POGOProtos.Rpc.NOMAGBPDOCA.Builder.class);
  }

  public static final int BPEEENJGAGN_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn_;
  /**
   * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
   * @return Whether the bpeeenjgagn field is set.
   */
  public boolean hasBpeeenjgagn() {
    return bpeeenjgagn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
   * @return The bpeeenjgagn.
   */
  public POGOProtos.Rpc.NBPNINIOPDH getBpeeenjgagn() {
    return bpeeenjgagn_ == null ? POGOProtos.Rpc.NBPNINIOPDH.getDefaultInstance() : bpeeenjgagn_;
  }
  /**
   * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
   */
  public POGOProtos.Rpc.NBPNINIOPDHOrBuilder getBpeeenjgagnOrBuilder() {
    return getBpeeenjgagn();
  }

  public static final int GKLGKPKGBFE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString gklgkpkgbfe_;
  /**
   * <code>bytes gklgkpkgbfe = 2;</code>
   * @return The gklgkpkgbfe.
   */
  public com.google.protobuf.ByteString getGklgkpkgbfe() {
    return gklgkpkgbfe_;
  }

  public static final int HDODGOKKIHO_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString hdodgokkiho_;
  /**
   * <code>bytes hdodgokkiho = 3;</code>
   * @return The hdodgokkiho.
   */
  public com.google.protobuf.ByteString getHdodgokkiho() {
    return hdodgokkiho_;
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
    if (bpeeenjgagn_ != null) {
      output.writeMessage(1, getBpeeenjgagn());
    }
    if (!gklgkpkgbfe_.isEmpty()) {
      output.writeBytes(2, gklgkpkgbfe_);
    }
    if (!hdodgokkiho_.isEmpty()) {
      output.writeBytes(3, hdodgokkiho_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bpeeenjgagn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBpeeenjgagn());
    }
    if (!gklgkpkgbfe_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, gklgkpkgbfe_);
    }
    if (!hdodgokkiho_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, hdodgokkiho_);
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
    if (!(obj instanceof POGOProtos.Rpc.NOMAGBPDOCA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NOMAGBPDOCA other = (POGOProtos.Rpc.NOMAGBPDOCA) obj;

    if (hasBpeeenjgagn() != other.hasBpeeenjgagn()) return false;
    if (hasBpeeenjgagn()) {
      if (!getBpeeenjgagn()
          .equals(other.getBpeeenjgagn())) return false;
    }
    if (!getGklgkpkgbfe()
        .equals(other.getGklgkpkgbfe())) return false;
    if (!getHdodgokkiho()
        .equals(other.getHdodgokkiho())) return false;
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
    if (hasBpeeenjgagn()) {
      hash = (37 * hash) + BPEEENJGAGN_FIELD_NUMBER;
      hash = (53 * hash) + getBpeeenjgagn().hashCode();
    }
    hash = (37 * hash) + GKLGKPKGBFE_FIELD_NUMBER;
    hash = (53 * hash) + getGklgkpkgbfe().hashCode();
    hash = (37 * hash) + HDODGOKKIHO_FIELD_NUMBER;
    hash = (53 * hash) + getHdodgokkiho().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOMAGBPDOCA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NOMAGBPDOCA prototype) {
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
   * ref: NOMAGBPDOCA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NOMAGBPDOCA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NOMAGBPDOCA)
      POGOProtos.Rpc.NOMAGBPDOCAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOMAGBPDOCA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOMAGBPDOCA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NOMAGBPDOCA.class, POGOProtos.Rpc.NOMAGBPDOCA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NOMAGBPDOCA.newBuilder()
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
      if (bpeeenjgagnBuilder_ == null) {
        bpeeenjgagn_ = null;
      } else {
        bpeeenjgagn_ = null;
        bpeeenjgagnBuilder_ = null;
      }
      gklgkpkgbfe_ = com.google.protobuf.ByteString.EMPTY;

      hdodgokkiho_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOMAGBPDOCA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOMAGBPDOCA getDefaultInstanceForType() {
      return POGOProtos.Rpc.NOMAGBPDOCA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOMAGBPDOCA build() {
      POGOProtos.Rpc.NOMAGBPDOCA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOMAGBPDOCA buildPartial() {
      POGOProtos.Rpc.NOMAGBPDOCA result = new POGOProtos.Rpc.NOMAGBPDOCA(this);
      if (bpeeenjgagnBuilder_ == null) {
        result.bpeeenjgagn_ = bpeeenjgagn_;
      } else {
        result.bpeeenjgagn_ = bpeeenjgagnBuilder_.build();
      }
      result.gklgkpkgbfe_ = gklgkpkgbfe_;
      result.hdodgokkiho_ = hdodgokkiho_;
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
      if (other instanceof POGOProtos.Rpc.NOMAGBPDOCA) {
        return mergeFrom((POGOProtos.Rpc.NOMAGBPDOCA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NOMAGBPDOCA other) {
      if (other == POGOProtos.Rpc.NOMAGBPDOCA.getDefaultInstance()) return this;
      if (other.hasBpeeenjgagn()) {
        mergeBpeeenjgagn(other.getBpeeenjgagn());
      }
      if (other.getGklgkpkgbfe() != com.google.protobuf.ByteString.EMPTY) {
        setGklgkpkgbfe(other.getGklgkpkgbfe());
      }
      if (other.getHdodgokkiho() != com.google.protobuf.ByteString.EMPTY) {
        setHdodgokkiho(other.getHdodgokkiho());
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
      POGOProtos.Rpc.NOMAGBPDOCA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NOMAGBPDOCA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NBPNINIOPDH, POGOProtos.Rpc.NBPNINIOPDH.Builder, POGOProtos.Rpc.NBPNINIOPDHOrBuilder> bpeeenjgagnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     * @return Whether the bpeeenjgagn field is set.
     */
    public boolean hasBpeeenjgagn() {
      return bpeeenjgagnBuilder_ != null || bpeeenjgagn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     * @return The bpeeenjgagn.
     */
    public POGOProtos.Rpc.NBPNINIOPDH getBpeeenjgagn() {
      if (bpeeenjgagnBuilder_ == null) {
        return bpeeenjgagn_ == null ? POGOProtos.Rpc.NBPNINIOPDH.getDefaultInstance() : bpeeenjgagn_;
      } else {
        return bpeeenjgagnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public Builder setBpeeenjgagn(POGOProtos.Rpc.NBPNINIOPDH value) {
      if (bpeeenjgagnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bpeeenjgagn_ = value;
        onChanged();
      } else {
        bpeeenjgagnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public Builder setBpeeenjgagn(
        POGOProtos.Rpc.NBPNINIOPDH.Builder builderForValue) {
      if (bpeeenjgagnBuilder_ == null) {
        bpeeenjgagn_ = builderForValue.build();
        onChanged();
      } else {
        bpeeenjgagnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public Builder mergeBpeeenjgagn(POGOProtos.Rpc.NBPNINIOPDH value) {
      if (bpeeenjgagnBuilder_ == null) {
        if (bpeeenjgagn_ != null) {
          bpeeenjgagn_ =
            POGOProtos.Rpc.NBPNINIOPDH.newBuilder(bpeeenjgagn_).mergeFrom(value).buildPartial();
        } else {
          bpeeenjgagn_ = value;
        }
        onChanged();
      } else {
        bpeeenjgagnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public Builder clearBpeeenjgagn() {
      if (bpeeenjgagnBuilder_ == null) {
        bpeeenjgagn_ = null;
        onChanged();
      } else {
        bpeeenjgagn_ = null;
        bpeeenjgagnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public POGOProtos.Rpc.NBPNINIOPDH.Builder getBpeeenjgagnBuilder() {
      
      onChanged();
      return getBpeeenjgagnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    public POGOProtos.Rpc.NBPNINIOPDHOrBuilder getBpeeenjgagnOrBuilder() {
      if (bpeeenjgagnBuilder_ != null) {
        return bpeeenjgagnBuilder_.getMessageOrBuilder();
      } else {
        return bpeeenjgagn_ == null ?
            POGOProtos.Rpc.NBPNINIOPDH.getDefaultInstance() : bpeeenjgagn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NBPNINIOPDH bpeeenjgagn = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NBPNINIOPDH, POGOProtos.Rpc.NBPNINIOPDH.Builder, POGOProtos.Rpc.NBPNINIOPDHOrBuilder> 
        getBpeeenjgagnFieldBuilder() {
      if (bpeeenjgagnBuilder_ == null) {
        bpeeenjgagnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.NBPNINIOPDH, POGOProtos.Rpc.NBPNINIOPDH.Builder, POGOProtos.Rpc.NBPNINIOPDHOrBuilder>(
                getBpeeenjgagn(),
                getParentForChildren(),
                isClean());
        bpeeenjgagn_ = null;
      }
      return bpeeenjgagnBuilder_;
    }

    private com.google.protobuf.ByteString gklgkpkgbfe_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes gklgkpkgbfe = 2;</code>
     * @return The gklgkpkgbfe.
     */
    public com.google.protobuf.ByteString getGklgkpkgbfe() {
      return gklgkpkgbfe_;
    }
    /**
     * <code>bytes gklgkpkgbfe = 2;</code>
     * @param value The gklgkpkgbfe to set.
     * @return This builder for chaining.
     */
    public Builder setGklgkpkgbfe(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gklgkpkgbfe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes gklgkpkgbfe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGklgkpkgbfe() {
      
      gklgkpkgbfe_ = getDefaultInstance().getGklgkpkgbfe();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hdodgokkiho_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hdodgokkiho = 3;</code>
     * @return The hdodgokkiho.
     */
    public com.google.protobuf.ByteString getHdodgokkiho() {
      return hdodgokkiho_;
    }
    /**
     * <code>bytes hdodgokkiho = 3;</code>
     * @param value The hdodgokkiho to set.
     * @return This builder for chaining.
     */
    public Builder setHdodgokkiho(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hdodgokkiho_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hdodgokkiho = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHdodgokkiho() {
      
      hdodgokkiho_ = getDefaultInstance().getHdodgokkiho();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NOMAGBPDOCA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NOMAGBPDOCA)
  private static final POGOProtos.Rpc.NOMAGBPDOCA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NOMAGBPDOCA();
  }

  public static POGOProtos.Rpc.NOMAGBPDOCA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NOMAGBPDOCA>
      PARSER = new com.google.protobuf.AbstractParser<NOMAGBPDOCA>() {
    @java.lang.Override
    public NOMAGBPDOCA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NOMAGBPDOCA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NOMAGBPDOCA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NOMAGBPDOCA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NOMAGBPDOCA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

