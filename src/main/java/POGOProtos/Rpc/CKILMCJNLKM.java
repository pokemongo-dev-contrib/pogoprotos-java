// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CKILMCJNLKM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CKILMCJNLKM}
 */
public final class CKILMCJNLKM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKILMCJNLKM)
    CKILMCJNLKMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKILMCJNLKM.newBuilder() to construct.
  private CKILMCJNLKM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKILMCJNLKM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKILMCJNLKM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKILMCJNLKM(
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
            POGOProtos.Rpc.JAAACDNDHBM.Builder subBuilder = null;
            if (kemglbacmpk_ != null) {
              subBuilder = kemglbacmpk_.toBuilder();
            }
            kemglbacmpk_ = input.readMessage(POGOProtos.Rpc.JAAACDNDHBM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(kemglbacmpk_);
              kemglbacmpk_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKILMCJNLKM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKILMCJNLKM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKILMCJNLKM.class, POGOProtos.Rpc.CKILMCJNLKM.Builder.class);
  }

  public static final int KEMGLBACMPK_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk_;
  /**
   * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
   * @return Whether the kemglbacmpk field is set.
   */
  @java.lang.Override
  public boolean hasKemglbacmpk() {
    return kemglbacmpk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
   * @return The kemglbacmpk.
   */
  @java.lang.Override
  public POGOProtos.Rpc.JAAACDNDHBM getKemglbacmpk() {
    return kemglbacmpk_ == null ? POGOProtos.Rpc.JAAACDNDHBM.getDefaultInstance() : kemglbacmpk_;
  }
  /**
   * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.JAAACDNDHBMOrBuilder getKemglbacmpkOrBuilder() {
    return getKemglbacmpk();
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
    if (kemglbacmpk_ != null) {
      output.writeMessage(1, getKemglbacmpk());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kemglbacmpk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKemglbacmpk());
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
    if (!(obj instanceof POGOProtos.Rpc.CKILMCJNLKM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKILMCJNLKM other = (POGOProtos.Rpc.CKILMCJNLKM) obj;

    if (hasKemglbacmpk() != other.hasKemglbacmpk()) return false;
    if (hasKemglbacmpk()) {
      if (!getKemglbacmpk()
          .equals(other.getKemglbacmpk())) return false;
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
    if (hasKemglbacmpk()) {
      hash = (37 * hash) + KEMGLBACMPK_FIELD_NUMBER;
      hash = (53 * hash) + getKemglbacmpk().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKILMCJNLKM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKILMCJNLKM prototype) {
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
   * ref: CKILMCJNLKM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CKILMCJNLKM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKILMCJNLKM)
      POGOProtos.Rpc.CKILMCJNLKMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKILMCJNLKM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKILMCJNLKM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKILMCJNLKM.class, POGOProtos.Rpc.CKILMCJNLKM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKILMCJNLKM.newBuilder()
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
      if (kemglbacmpkBuilder_ == null) {
        kemglbacmpk_ = null;
      } else {
        kemglbacmpk_ = null;
        kemglbacmpkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKILMCJNLKM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKILMCJNLKM getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKILMCJNLKM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKILMCJNLKM build() {
      POGOProtos.Rpc.CKILMCJNLKM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKILMCJNLKM buildPartial() {
      POGOProtos.Rpc.CKILMCJNLKM result = new POGOProtos.Rpc.CKILMCJNLKM(this);
      if (kemglbacmpkBuilder_ == null) {
        result.kemglbacmpk_ = kemglbacmpk_;
      } else {
        result.kemglbacmpk_ = kemglbacmpkBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CKILMCJNLKM) {
        return mergeFrom((POGOProtos.Rpc.CKILMCJNLKM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKILMCJNLKM other) {
      if (other == POGOProtos.Rpc.CKILMCJNLKM.getDefaultInstance()) return this;
      if (other.hasKemglbacmpk()) {
        mergeKemglbacmpk(other.getKemglbacmpk());
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
      POGOProtos.Rpc.CKILMCJNLKM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKILMCJNLKM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JAAACDNDHBM, POGOProtos.Rpc.JAAACDNDHBM.Builder, POGOProtos.Rpc.JAAACDNDHBMOrBuilder> kemglbacmpkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     * @return Whether the kemglbacmpk field is set.
     */
    public boolean hasKemglbacmpk() {
      return kemglbacmpkBuilder_ != null || kemglbacmpk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     * @return The kemglbacmpk.
     */
    public POGOProtos.Rpc.JAAACDNDHBM getKemglbacmpk() {
      if (kemglbacmpkBuilder_ == null) {
        return kemglbacmpk_ == null ? POGOProtos.Rpc.JAAACDNDHBM.getDefaultInstance() : kemglbacmpk_;
      } else {
        return kemglbacmpkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public Builder setKemglbacmpk(POGOProtos.Rpc.JAAACDNDHBM value) {
      if (kemglbacmpkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kemglbacmpk_ = value;
        onChanged();
      } else {
        kemglbacmpkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public Builder setKemglbacmpk(
        POGOProtos.Rpc.JAAACDNDHBM.Builder builderForValue) {
      if (kemglbacmpkBuilder_ == null) {
        kemglbacmpk_ = builderForValue.build();
        onChanged();
      } else {
        kemglbacmpkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public Builder mergeKemglbacmpk(POGOProtos.Rpc.JAAACDNDHBM value) {
      if (kemglbacmpkBuilder_ == null) {
        if (kemglbacmpk_ != null) {
          kemglbacmpk_ =
            POGOProtos.Rpc.JAAACDNDHBM.newBuilder(kemglbacmpk_).mergeFrom(value).buildPartial();
        } else {
          kemglbacmpk_ = value;
        }
        onChanged();
      } else {
        kemglbacmpkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public Builder clearKemglbacmpk() {
      if (kemglbacmpkBuilder_ == null) {
        kemglbacmpk_ = null;
        onChanged();
      } else {
        kemglbacmpk_ = null;
        kemglbacmpkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public POGOProtos.Rpc.JAAACDNDHBM.Builder getKemglbacmpkBuilder() {
      
      onChanged();
      return getKemglbacmpkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    public POGOProtos.Rpc.JAAACDNDHBMOrBuilder getKemglbacmpkOrBuilder() {
      if (kemglbacmpkBuilder_ != null) {
        return kemglbacmpkBuilder_.getMessageOrBuilder();
      } else {
        return kemglbacmpk_ == null ?
            POGOProtos.Rpc.JAAACDNDHBM.getDefaultInstance() : kemglbacmpk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JAAACDNDHBM kemglbacmpk = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JAAACDNDHBM, POGOProtos.Rpc.JAAACDNDHBM.Builder, POGOProtos.Rpc.JAAACDNDHBMOrBuilder> 
        getKemglbacmpkFieldBuilder() {
      if (kemglbacmpkBuilder_ == null) {
        kemglbacmpkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.JAAACDNDHBM, POGOProtos.Rpc.JAAACDNDHBM.Builder, POGOProtos.Rpc.JAAACDNDHBMOrBuilder>(
                getKemglbacmpk(),
                getParentForChildren(),
                isClean());
        kemglbacmpk_ = null;
      }
      return kemglbacmpkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKILMCJNLKM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKILMCJNLKM)
  private static final POGOProtos.Rpc.CKILMCJNLKM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKILMCJNLKM();
  }

  public static POGOProtos.Rpc.CKILMCJNLKM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKILMCJNLKM>
      PARSER = new com.google.protobuf.AbstractParser<CKILMCJNLKM>() {
    @java.lang.Override
    public CKILMCJNLKM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKILMCJNLKM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKILMCJNLKM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKILMCJNLKM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKILMCJNLKM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

