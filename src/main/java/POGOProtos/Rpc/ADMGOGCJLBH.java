// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ADMGOGCJLBH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ADMGOGCJLBH}
 */
public final class ADMGOGCJLBH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ADMGOGCJLBH)
    ADMGOGCJLBHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ADMGOGCJLBH.newBuilder() to construct.
  private ADMGOGCJLBH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ADMGOGCJLBH() {
    ijiocnaifin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ADMGOGCJLBH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ADMGOGCJLBH(
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
            POGOProtos.Rpc.ABNLGKDJMON.Builder subBuilder = null;
            if (ofaneehdcfm_ != null) {
              subBuilder = ofaneehdcfm_.toBuilder();
            }
            ofaneehdcfm_ = input.readMessage(POGOProtos.Rpc.ABNLGKDJMON.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ofaneehdcfm_);
              ofaneehdcfm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ijiocnaifin_ = s;
            break;
          }
          case 24: {

            clpflipidfp_ = input.readInt32();
            break;
          }
          case 32: {

            bmeekmaefei_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADMGOGCJLBH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADMGOGCJLBH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ADMGOGCJLBH.class, POGOProtos.Rpc.ADMGOGCJLBH.Builder.class);
  }

  public static final int OFANEEHDCFM_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm_;
  /**
   * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
   * @return Whether the ofaneehdcfm field is set.
   */
  @java.lang.Override
  public boolean hasOfaneehdcfm() {
    return ofaneehdcfm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
   * @return The ofaneehdcfm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ABNLGKDJMON getOfaneehdcfm() {
    return ofaneehdcfm_ == null ? POGOProtos.Rpc.ABNLGKDJMON.getDefaultInstance() : ofaneehdcfm_;
  }
  /**
   * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ABNLGKDJMONOrBuilder getOfaneehdcfmOrBuilder() {
    return getOfaneehdcfm();
  }

  public static final int IJIOCNAIFIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object ijiocnaifin_;
  /**
   * <code>string ijiocnaifin = 2;</code>
   * @return The ijiocnaifin.
   */
  @java.lang.Override
  public java.lang.String getIjiocnaifin() {
    java.lang.Object ref = ijiocnaifin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ijiocnaifin_ = s;
      return s;
    }
  }
  /**
   * <code>string ijiocnaifin = 2;</code>
   * @return The bytes for ijiocnaifin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIjiocnaifinBytes() {
    java.lang.Object ref = ijiocnaifin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ijiocnaifin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLPFLIPIDFP_FIELD_NUMBER = 3;
  private int clpflipidfp_;
  /**
   * <code>int32 clpflipidfp = 3;</code>
   * @return The clpflipidfp.
   */
  @java.lang.Override
  public int getClpflipidfp() {
    return clpflipidfp_;
  }

  public static final int BMEEKMAEFEI_FIELD_NUMBER = 4;
  private int bmeekmaefei_;
  /**
   * <code>int32 bmeekmaefei = 4;</code>
   * @return The bmeekmaefei.
   */
  @java.lang.Override
  public int getBmeekmaefei() {
    return bmeekmaefei_;
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
    if (ofaneehdcfm_ != null) {
      output.writeMessage(1, getOfaneehdcfm());
    }
    if (!getIjiocnaifinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ijiocnaifin_);
    }
    if (clpflipidfp_ != 0) {
      output.writeInt32(3, clpflipidfp_);
    }
    if (bmeekmaefei_ != 0) {
      output.writeInt32(4, bmeekmaefei_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ofaneehdcfm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOfaneehdcfm());
    }
    if (!getIjiocnaifinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ijiocnaifin_);
    }
    if (clpflipidfp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, clpflipidfp_);
    }
    if (bmeekmaefei_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, bmeekmaefei_);
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
    if (!(obj instanceof POGOProtos.Rpc.ADMGOGCJLBH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ADMGOGCJLBH other = (POGOProtos.Rpc.ADMGOGCJLBH) obj;

    if (hasOfaneehdcfm() != other.hasOfaneehdcfm()) return false;
    if (hasOfaneehdcfm()) {
      if (!getOfaneehdcfm()
          .equals(other.getOfaneehdcfm())) return false;
    }
    if (!getIjiocnaifin()
        .equals(other.getIjiocnaifin())) return false;
    if (getClpflipidfp()
        != other.getClpflipidfp()) return false;
    if (getBmeekmaefei()
        != other.getBmeekmaefei()) return false;
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
    if (hasOfaneehdcfm()) {
      hash = (37 * hash) + OFANEEHDCFM_FIELD_NUMBER;
      hash = (53 * hash) + getOfaneehdcfm().hashCode();
    }
    hash = (37 * hash) + IJIOCNAIFIN_FIELD_NUMBER;
    hash = (53 * hash) + getIjiocnaifin().hashCode();
    hash = (37 * hash) + CLPFLIPIDFP_FIELD_NUMBER;
    hash = (53 * hash) + getClpflipidfp();
    hash = (37 * hash) + BMEEKMAEFEI_FIELD_NUMBER;
    hash = (53 * hash) + getBmeekmaefei();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADMGOGCJLBH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ADMGOGCJLBH prototype) {
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
   * ref: ADMGOGCJLBH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ADMGOGCJLBH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ADMGOGCJLBH)
      POGOProtos.Rpc.ADMGOGCJLBHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADMGOGCJLBH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADMGOGCJLBH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ADMGOGCJLBH.class, POGOProtos.Rpc.ADMGOGCJLBH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ADMGOGCJLBH.newBuilder()
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
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = null;
      } else {
        ofaneehdcfm_ = null;
        ofaneehdcfmBuilder_ = null;
      }
      ijiocnaifin_ = "";

      clpflipidfp_ = 0;

      bmeekmaefei_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADMGOGCJLBH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADMGOGCJLBH getDefaultInstanceForType() {
      return POGOProtos.Rpc.ADMGOGCJLBH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADMGOGCJLBH build() {
      POGOProtos.Rpc.ADMGOGCJLBH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADMGOGCJLBH buildPartial() {
      POGOProtos.Rpc.ADMGOGCJLBH result = new POGOProtos.Rpc.ADMGOGCJLBH(this);
      if (ofaneehdcfmBuilder_ == null) {
        result.ofaneehdcfm_ = ofaneehdcfm_;
      } else {
        result.ofaneehdcfm_ = ofaneehdcfmBuilder_.build();
      }
      result.ijiocnaifin_ = ijiocnaifin_;
      result.clpflipidfp_ = clpflipidfp_;
      result.bmeekmaefei_ = bmeekmaefei_;
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
      if (other instanceof POGOProtos.Rpc.ADMGOGCJLBH) {
        return mergeFrom((POGOProtos.Rpc.ADMGOGCJLBH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ADMGOGCJLBH other) {
      if (other == POGOProtos.Rpc.ADMGOGCJLBH.getDefaultInstance()) return this;
      if (other.hasOfaneehdcfm()) {
        mergeOfaneehdcfm(other.getOfaneehdcfm());
      }
      if (!other.getIjiocnaifin().isEmpty()) {
        ijiocnaifin_ = other.ijiocnaifin_;
        onChanged();
      }
      if (other.getClpflipidfp() != 0) {
        setClpflipidfp(other.getClpflipidfp());
      }
      if (other.getBmeekmaefei() != 0) {
        setBmeekmaefei(other.getBmeekmaefei());
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
      POGOProtos.Rpc.ADMGOGCJLBH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ADMGOGCJLBH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ABNLGKDJMON, POGOProtos.Rpc.ABNLGKDJMON.Builder, POGOProtos.Rpc.ABNLGKDJMONOrBuilder> ofaneehdcfmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     * @return Whether the ofaneehdcfm field is set.
     */
    public boolean hasOfaneehdcfm() {
      return ofaneehdcfmBuilder_ != null || ofaneehdcfm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     * @return The ofaneehdcfm.
     */
    public POGOProtos.Rpc.ABNLGKDJMON getOfaneehdcfm() {
      if (ofaneehdcfmBuilder_ == null) {
        return ofaneehdcfm_ == null ? POGOProtos.Rpc.ABNLGKDJMON.getDefaultInstance() : ofaneehdcfm_;
      } else {
        return ofaneehdcfmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public Builder setOfaneehdcfm(POGOProtos.Rpc.ABNLGKDJMON value) {
      if (ofaneehdcfmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ofaneehdcfm_ = value;
        onChanged();
      } else {
        ofaneehdcfmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public Builder setOfaneehdcfm(
        POGOProtos.Rpc.ABNLGKDJMON.Builder builderForValue) {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = builderForValue.build();
        onChanged();
      } else {
        ofaneehdcfmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public Builder mergeOfaneehdcfm(POGOProtos.Rpc.ABNLGKDJMON value) {
      if (ofaneehdcfmBuilder_ == null) {
        if (ofaneehdcfm_ != null) {
          ofaneehdcfm_ =
            POGOProtos.Rpc.ABNLGKDJMON.newBuilder(ofaneehdcfm_).mergeFrom(value).buildPartial();
        } else {
          ofaneehdcfm_ = value;
        }
        onChanged();
      } else {
        ofaneehdcfmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public Builder clearOfaneehdcfm() {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfm_ = null;
        onChanged();
      } else {
        ofaneehdcfm_ = null;
        ofaneehdcfmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public POGOProtos.Rpc.ABNLGKDJMON.Builder getOfaneehdcfmBuilder() {
      
      onChanged();
      return getOfaneehdcfmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    public POGOProtos.Rpc.ABNLGKDJMONOrBuilder getOfaneehdcfmOrBuilder() {
      if (ofaneehdcfmBuilder_ != null) {
        return ofaneehdcfmBuilder_.getMessageOrBuilder();
      } else {
        return ofaneehdcfm_ == null ?
            POGOProtos.Rpc.ABNLGKDJMON.getDefaultInstance() : ofaneehdcfm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ABNLGKDJMON ofaneehdcfm = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ABNLGKDJMON, POGOProtos.Rpc.ABNLGKDJMON.Builder, POGOProtos.Rpc.ABNLGKDJMONOrBuilder> 
        getOfaneehdcfmFieldBuilder() {
      if (ofaneehdcfmBuilder_ == null) {
        ofaneehdcfmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ABNLGKDJMON, POGOProtos.Rpc.ABNLGKDJMON.Builder, POGOProtos.Rpc.ABNLGKDJMONOrBuilder>(
                getOfaneehdcfm(),
                getParentForChildren(),
                isClean());
        ofaneehdcfm_ = null;
      }
      return ofaneehdcfmBuilder_;
    }

    private java.lang.Object ijiocnaifin_ = "";
    /**
     * <code>string ijiocnaifin = 2;</code>
     * @return The ijiocnaifin.
     */
    public java.lang.String getIjiocnaifin() {
      java.lang.Object ref = ijiocnaifin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ijiocnaifin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ijiocnaifin = 2;</code>
     * @return The bytes for ijiocnaifin.
     */
    public com.google.protobuf.ByteString
        getIjiocnaifinBytes() {
      java.lang.Object ref = ijiocnaifin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ijiocnaifin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ijiocnaifin = 2;</code>
     * @param value The ijiocnaifin to set.
     * @return This builder for chaining.
     */
    public Builder setIjiocnaifin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ijiocnaifin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ijiocnaifin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIjiocnaifin() {
      
      ijiocnaifin_ = getDefaultInstance().getIjiocnaifin();
      onChanged();
      return this;
    }
    /**
     * <code>string ijiocnaifin = 2;</code>
     * @param value The bytes for ijiocnaifin to set.
     * @return This builder for chaining.
     */
    public Builder setIjiocnaifinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ijiocnaifin_ = value;
      onChanged();
      return this;
    }

    private int clpflipidfp_ ;
    /**
     * <code>int32 clpflipidfp = 3;</code>
     * @return The clpflipidfp.
     */
    @java.lang.Override
    public int getClpflipidfp() {
      return clpflipidfp_;
    }
    /**
     * <code>int32 clpflipidfp = 3;</code>
     * @param value The clpflipidfp to set.
     * @return This builder for chaining.
     */
    public Builder setClpflipidfp(int value) {
      
      clpflipidfp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 clpflipidfp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClpflipidfp() {
      
      clpflipidfp_ = 0;
      onChanged();
      return this;
    }

    private int bmeekmaefei_ ;
    /**
     * <code>int32 bmeekmaefei = 4;</code>
     * @return The bmeekmaefei.
     */
    @java.lang.Override
    public int getBmeekmaefei() {
      return bmeekmaefei_;
    }
    /**
     * <code>int32 bmeekmaefei = 4;</code>
     * @param value The bmeekmaefei to set.
     * @return This builder for chaining.
     */
    public Builder setBmeekmaefei(int value) {
      
      bmeekmaefei_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bmeekmaefei = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmeekmaefei() {
      
      bmeekmaefei_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ADMGOGCJLBH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ADMGOGCJLBH)
  private static final POGOProtos.Rpc.ADMGOGCJLBH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ADMGOGCJLBH();
  }

  public static POGOProtos.Rpc.ADMGOGCJLBH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ADMGOGCJLBH>
      PARSER = new com.google.protobuf.AbstractParser<ADMGOGCJLBH>() {
    @java.lang.Override
    public ADMGOGCJLBH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ADMGOGCJLBH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ADMGOGCJLBH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ADMGOGCJLBH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ADMGOGCJLBH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

