// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FPBHLABCFFF}
 */
public  final class FPBHLABCFFF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FPBHLABCFFF)
    FPBHLABCFFFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FPBHLABCFFF.newBuilder() to construct.
  private FPBHLABCFFF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FPBHLABCFFF() {
    bcmkobknmmc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FPBHLABCFFF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FPBHLABCFFF(
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

            bcmkobknmmc_ = s;
            break;
          }
          case 16: {

            dcopjfiephp_ = input.readBool();
            break;
          }
          case 24: {

            mldkiolndpn_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FPBHLABCFFF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FPBHLABCFFF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FPBHLABCFFF.class, POGOProtos.Rpc.FPBHLABCFFF.Builder.class);
  }

  public static final int BCMKOBKNMMC_FIELD_NUMBER = 1;
  private volatile java.lang.Object bcmkobknmmc_;
  /**
   * <code>string bcmkobknmmc = 1;</code>
   * @return The bcmkobknmmc.
   */
  public java.lang.String getBcmkobknmmc() {
    java.lang.Object ref = bcmkobknmmc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bcmkobknmmc_ = s;
      return s;
    }
  }
  /**
   * <code>string bcmkobknmmc = 1;</code>
   * @return The bytes for bcmkobknmmc.
   */
  public com.google.protobuf.ByteString
      getBcmkobknmmcBytes() {
    java.lang.Object ref = bcmkobknmmc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bcmkobknmmc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DCOPJFIEPHP_FIELD_NUMBER = 2;
  private boolean dcopjfiephp_;
  /**
   * <code>bool dcopjfiephp = 2;</code>
   * @return The dcopjfiephp.
   */
  public boolean getDcopjfiephp() {
    return dcopjfiephp_;
  }

  public static final int MLDKIOLNDPN_FIELD_NUMBER = 3;
  private boolean mldkiolndpn_;
  /**
   * <code>bool mldkiolndpn = 3;</code>
   * @return The mldkiolndpn.
   */
  public boolean getMldkiolndpn() {
    return mldkiolndpn_;
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
    if (!getBcmkobknmmcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bcmkobknmmc_);
    }
    if (dcopjfiephp_ != false) {
      output.writeBool(2, dcopjfiephp_);
    }
    if (mldkiolndpn_ != false) {
      output.writeBool(3, mldkiolndpn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBcmkobknmmcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bcmkobknmmc_);
    }
    if (dcopjfiephp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dcopjfiephp_);
    }
    if (mldkiolndpn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, mldkiolndpn_);
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
    if (!(obj instanceof POGOProtos.Rpc.FPBHLABCFFF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FPBHLABCFFF other = (POGOProtos.Rpc.FPBHLABCFFF) obj;

    if (!getBcmkobknmmc()
        .equals(other.getBcmkobknmmc())) return false;
    if (getDcopjfiephp()
        != other.getDcopjfiephp()) return false;
    if (getMldkiolndpn()
        != other.getMldkiolndpn()) return false;
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
    hash = (37 * hash) + BCMKOBKNMMC_FIELD_NUMBER;
    hash = (53 * hash) + getBcmkobknmmc().hashCode();
    hash = (37 * hash) + DCOPJFIEPHP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDcopjfiephp());
    hash = (37 * hash) + MLDKIOLNDPN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMldkiolndpn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPBHLABCFFF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FPBHLABCFFF prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FPBHLABCFFF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FPBHLABCFFF)
      POGOProtos.Rpc.FPBHLABCFFFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FPBHLABCFFF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FPBHLABCFFF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FPBHLABCFFF.class, POGOProtos.Rpc.FPBHLABCFFF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FPBHLABCFFF.newBuilder()
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
      bcmkobknmmc_ = "";

      dcopjfiephp_ = false;

      mldkiolndpn_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FPBHLABCFFF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPBHLABCFFF getDefaultInstanceForType() {
      return POGOProtos.Rpc.FPBHLABCFFF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPBHLABCFFF build() {
      POGOProtos.Rpc.FPBHLABCFFF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPBHLABCFFF buildPartial() {
      POGOProtos.Rpc.FPBHLABCFFF result = new POGOProtos.Rpc.FPBHLABCFFF(this);
      result.bcmkobknmmc_ = bcmkobknmmc_;
      result.dcopjfiephp_ = dcopjfiephp_;
      result.mldkiolndpn_ = mldkiolndpn_;
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
      if (other instanceof POGOProtos.Rpc.FPBHLABCFFF) {
        return mergeFrom((POGOProtos.Rpc.FPBHLABCFFF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FPBHLABCFFF other) {
      if (other == POGOProtos.Rpc.FPBHLABCFFF.getDefaultInstance()) return this;
      if (!other.getBcmkobknmmc().isEmpty()) {
        bcmkobknmmc_ = other.bcmkobknmmc_;
        onChanged();
      }
      if (other.getDcopjfiephp() != false) {
        setDcopjfiephp(other.getDcopjfiephp());
      }
      if (other.getMldkiolndpn() != false) {
        setMldkiolndpn(other.getMldkiolndpn());
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
      POGOProtos.Rpc.FPBHLABCFFF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FPBHLABCFFF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bcmkobknmmc_ = "";
    /**
     * <code>string bcmkobknmmc = 1;</code>
     * @return The bcmkobknmmc.
     */
    public java.lang.String getBcmkobknmmc() {
      java.lang.Object ref = bcmkobknmmc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bcmkobknmmc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bcmkobknmmc = 1;</code>
     * @return The bytes for bcmkobknmmc.
     */
    public com.google.protobuf.ByteString
        getBcmkobknmmcBytes() {
      java.lang.Object ref = bcmkobknmmc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bcmkobknmmc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bcmkobknmmc = 1;</code>
     * @param value The bcmkobknmmc to set.
     * @return This builder for chaining.
     */
    public Builder setBcmkobknmmc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bcmkobknmmc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bcmkobknmmc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBcmkobknmmc() {
      
      bcmkobknmmc_ = getDefaultInstance().getBcmkobknmmc();
      onChanged();
      return this;
    }
    /**
     * <code>string bcmkobknmmc = 1;</code>
     * @param value The bytes for bcmkobknmmc to set.
     * @return This builder for chaining.
     */
    public Builder setBcmkobknmmcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bcmkobknmmc_ = value;
      onChanged();
      return this;
    }

    private boolean dcopjfiephp_ ;
    /**
     * <code>bool dcopjfiephp = 2;</code>
     * @return The dcopjfiephp.
     */
    public boolean getDcopjfiephp() {
      return dcopjfiephp_;
    }
    /**
     * <code>bool dcopjfiephp = 2;</code>
     * @param value The dcopjfiephp to set.
     * @return This builder for chaining.
     */
    public Builder setDcopjfiephp(boolean value) {
      
      dcopjfiephp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dcopjfiephp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDcopjfiephp() {
      
      dcopjfiephp_ = false;
      onChanged();
      return this;
    }

    private boolean mldkiolndpn_ ;
    /**
     * <code>bool mldkiolndpn = 3;</code>
     * @return The mldkiolndpn.
     */
    public boolean getMldkiolndpn() {
      return mldkiolndpn_;
    }
    /**
     * <code>bool mldkiolndpn = 3;</code>
     * @param value The mldkiolndpn to set.
     * @return This builder for chaining.
     */
    public Builder setMldkiolndpn(boolean value) {
      
      mldkiolndpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mldkiolndpn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMldkiolndpn() {
      
      mldkiolndpn_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FPBHLABCFFF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FPBHLABCFFF)
  private static final POGOProtos.Rpc.FPBHLABCFFF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FPBHLABCFFF();
  }

  public static POGOProtos.Rpc.FPBHLABCFFF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FPBHLABCFFF>
      PARSER = new com.google.protobuf.AbstractParser<FPBHLABCFFF>() {
    @java.lang.Override
    public FPBHLABCFFF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FPBHLABCFFF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FPBHLABCFFF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FPBHLABCFFF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FPBHLABCFFF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

