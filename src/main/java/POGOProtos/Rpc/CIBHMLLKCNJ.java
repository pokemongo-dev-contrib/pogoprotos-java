// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CIBHMLLKCNJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CIBHMLLKCNJ}
 */
public final class CIBHMLLKCNJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CIBHMLLKCNJ)
    CIBHMLLKCNJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CIBHMLLKCNJ.newBuilder() to construct.
  private CIBHMLLKCNJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CIBHMLLKCNJ() {
    lmfmlhckoie_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CIBHMLLKCNJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CIBHMLLKCNJ(
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

            lmfmlhckoie_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CKBEAAMMANC.Builder subBuilder = null;
            if (cgmdofohjeg_ != null) {
              subBuilder = cgmdofohjeg_.toBuilder();
            }
            cgmdofohjeg_ = input.readMessage(POGOProtos.Rpc.CKBEAAMMANC.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cgmdofohjeg_);
              cgmdofohjeg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            cnnejoldjmb_ = input.readInt64();
            break;
          }
          case 32: {

            mhgliachifj_ = input.readInt64();
            break;
          }
          case 42: {
            POGOProtos.Rpc.GKMHKMJNEII.Builder subBuilder = null;
            if (omjjmibnbmc_ != null) {
              subBuilder = omjjmibnbmc_.toBuilder();
            }
            omjjmibnbmc_ = input.readMessage(POGOProtos.Rpc.GKMHKMJNEII.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(omjjmibnbmc_);
              omjjmibnbmc_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIBHMLLKCNJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIBHMLLKCNJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CIBHMLLKCNJ.class, POGOProtos.Rpc.CIBHMLLKCNJ.Builder.class);
  }

  public static final int LMFMLHCKOIE_FIELD_NUMBER = 1;
  private volatile java.lang.Object lmfmlhckoie_;
  /**
   * <code>string lmfmlhckoie = 1;</code>
   * @return The lmfmlhckoie.
   */
  @java.lang.Override
  public java.lang.String getLmfmlhckoie() {
    java.lang.Object ref = lmfmlhckoie_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lmfmlhckoie_ = s;
      return s;
    }
  }
  /**
   * <code>string lmfmlhckoie = 1;</code>
   * @return The bytes for lmfmlhckoie.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLmfmlhckoieBytes() {
    java.lang.Object ref = lmfmlhckoie_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lmfmlhckoie_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CGMDOFOHJEG_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg_;
  /**
   * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
   * @return Whether the cgmdofohjeg field is set.
   */
  @java.lang.Override
  public boolean hasCgmdofohjeg() {
    return cgmdofohjeg_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
   * @return The cgmdofohjeg.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CKBEAAMMANC getCgmdofohjeg() {
    return cgmdofohjeg_ == null ? POGOProtos.Rpc.CKBEAAMMANC.getDefaultInstance() : cgmdofohjeg_;
  }
  /**
   * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CKBEAAMMANCOrBuilder getCgmdofohjegOrBuilder() {
    return getCgmdofohjeg();
  }

  public static final int CNNEJOLDJMB_FIELD_NUMBER = 3;
  private long cnnejoldjmb_;
  /**
   * <code>int64 cnnejoldjmb = 3;</code>
   * @return The cnnejoldjmb.
   */
  @java.lang.Override
  public long getCnnejoldjmb() {
    return cnnejoldjmb_;
  }

  public static final int MHGLIACHIFJ_FIELD_NUMBER = 4;
  private long mhgliachifj_;
  /**
   * <code>int64 mhgliachifj = 4;</code>
   * @return The mhgliachifj.
   */
  @java.lang.Override
  public long getMhgliachifj() {
    return mhgliachifj_;
  }

  public static final int OMJJMIBNBMC_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc_;
  /**
   * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
   * @return Whether the omjjmibnbmc field is set.
   */
  @java.lang.Override
  public boolean hasOmjjmibnbmc() {
    return omjjmibnbmc_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
   * @return The omjjmibnbmc.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GKMHKMJNEII getOmjjmibnbmc() {
    return omjjmibnbmc_ == null ? POGOProtos.Rpc.GKMHKMJNEII.getDefaultInstance() : omjjmibnbmc_;
  }
  /**
   * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GKMHKMJNEIIOrBuilder getOmjjmibnbmcOrBuilder() {
    return getOmjjmibnbmc();
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
    if (!getLmfmlhckoieBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lmfmlhckoie_);
    }
    if (cgmdofohjeg_ != null) {
      output.writeMessage(2, getCgmdofohjeg());
    }
    if (cnnejoldjmb_ != 0L) {
      output.writeInt64(3, cnnejoldjmb_);
    }
    if (mhgliachifj_ != 0L) {
      output.writeInt64(4, mhgliachifj_);
    }
    if (omjjmibnbmc_ != null) {
      output.writeMessage(5, getOmjjmibnbmc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLmfmlhckoieBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lmfmlhckoie_);
    }
    if (cgmdofohjeg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCgmdofohjeg());
    }
    if (cnnejoldjmb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, cnnejoldjmb_);
    }
    if (mhgliachifj_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, mhgliachifj_);
    }
    if (omjjmibnbmc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getOmjjmibnbmc());
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
    if (!(obj instanceof POGOProtos.Rpc.CIBHMLLKCNJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CIBHMLLKCNJ other = (POGOProtos.Rpc.CIBHMLLKCNJ) obj;

    if (!getLmfmlhckoie()
        .equals(other.getLmfmlhckoie())) return false;
    if (hasCgmdofohjeg() != other.hasCgmdofohjeg()) return false;
    if (hasCgmdofohjeg()) {
      if (!getCgmdofohjeg()
          .equals(other.getCgmdofohjeg())) return false;
    }
    if (getCnnejoldjmb()
        != other.getCnnejoldjmb()) return false;
    if (getMhgliachifj()
        != other.getMhgliachifj()) return false;
    if (hasOmjjmibnbmc() != other.hasOmjjmibnbmc()) return false;
    if (hasOmjjmibnbmc()) {
      if (!getOmjjmibnbmc()
          .equals(other.getOmjjmibnbmc())) return false;
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
    hash = (37 * hash) + LMFMLHCKOIE_FIELD_NUMBER;
    hash = (53 * hash) + getLmfmlhckoie().hashCode();
    if (hasCgmdofohjeg()) {
      hash = (37 * hash) + CGMDOFOHJEG_FIELD_NUMBER;
      hash = (53 * hash) + getCgmdofohjeg().hashCode();
    }
    hash = (37 * hash) + CNNEJOLDJMB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCnnejoldjmb());
    hash = (37 * hash) + MHGLIACHIFJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMhgliachifj());
    if (hasOmjjmibnbmc()) {
      hash = (37 * hash) + OMJJMIBNBMC_FIELD_NUMBER;
      hash = (53 * hash) + getOmjjmibnbmc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CIBHMLLKCNJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CIBHMLLKCNJ prototype) {
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
   * ref: CIBHMLLKCNJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CIBHMLLKCNJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CIBHMLLKCNJ)
      POGOProtos.Rpc.CIBHMLLKCNJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIBHMLLKCNJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIBHMLLKCNJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CIBHMLLKCNJ.class, POGOProtos.Rpc.CIBHMLLKCNJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CIBHMLLKCNJ.newBuilder()
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
      lmfmlhckoie_ = "";

      if (cgmdofohjegBuilder_ == null) {
        cgmdofohjeg_ = null;
      } else {
        cgmdofohjeg_ = null;
        cgmdofohjegBuilder_ = null;
      }
      cnnejoldjmb_ = 0L;

      mhgliachifj_ = 0L;

      if (omjjmibnbmcBuilder_ == null) {
        omjjmibnbmc_ = null;
      } else {
        omjjmibnbmc_ = null;
        omjjmibnbmcBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CIBHMLLKCNJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIBHMLLKCNJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.CIBHMLLKCNJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIBHMLLKCNJ build() {
      POGOProtos.Rpc.CIBHMLLKCNJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CIBHMLLKCNJ buildPartial() {
      POGOProtos.Rpc.CIBHMLLKCNJ result = new POGOProtos.Rpc.CIBHMLLKCNJ(this);
      result.lmfmlhckoie_ = lmfmlhckoie_;
      if (cgmdofohjegBuilder_ == null) {
        result.cgmdofohjeg_ = cgmdofohjeg_;
      } else {
        result.cgmdofohjeg_ = cgmdofohjegBuilder_.build();
      }
      result.cnnejoldjmb_ = cnnejoldjmb_;
      result.mhgliachifj_ = mhgliachifj_;
      if (omjjmibnbmcBuilder_ == null) {
        result.omjjmibnbmc_ = omjjmibnbmc_;
      } else {
        result.omjjmibnbmc_ = omjjmibnbmcBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CIBHMLLKCNJ) {
        return mergeFrom((POGOProtos.Rpc.CIBHMLLKCNJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CIBHMLLKCNJ other) {
      if (other == POGOProtos.Rpc.CIBHMLLKCNJ.getDefaultInstance()) return this;
      if (!other.getLmfmlhckoie().isEmpty()) {
        lmfmlhckoie_ = other.lmfmlhckoie_;
        onChanged();
      }
      if (other.hasCgmdofohjeg()) {
        mergeCgmdofohjeg(other.getCgmdofohjeg());
      }
      if (other.getCnnejoldjmb() != 0L) {
        setCnnejoldjmb(other.getCnnejoldjmb());
      }
      if (other.getMhgliachifj() != 0L) {
        setMhgliachifj(other.getMhgliachifj());
      }
      if (other.hasOmjjmibnbmc()) {
        mergeOmjjmibnbmc(other.getOmjjmibnbmc());
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
      POGOProtos.Rpc.CIBHMLLKCNJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CIBHMLLKCNJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lmfmlhckoie_ = "";
    /**
     * <code>string lmfmlhckoie = 1;</code>
     * @return The lmfmlhckoie.
     */
    public java.lang.String getLmfmlhckoie() {
      java.lang.Object ref = lmfmlhckoie_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lmfmlhckoie_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lmfmlhckoie = 1;</code>
     * @return The bytes for lmfmlhckoie.
     */
    public com.google.protobuf.ByteString
        getLmfmlhckoieBytes() {
      java.lang.Object ref = lmfmlhckoie_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lmfmlhckoie_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lmfmlhckoie = 1;</code>
     * @param value The lmfmlhckoie to set.
     * @return This builder for chaining.
     */
    public Builder setLmfmlhckoie(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lmfmlhckoie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lmfmlhckoie = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLmfmlhckoie() {
      
      lmfmlhckoie_ = getDefaultInstance().getLmfmlhckoie();
      onChanged();
      return this;
    }
    /**
     * <code>string lmfmlhckoie = 1;</code>
     * @param value The bytes for lmfmlhckoie to set.
     * @return This builder for chaining.
     */
    public Builder setLmfmlhckoieBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lmfmlhckoie_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CKBEAAMMANC, POGOProtos.Rpc.CKBEAAMMANC.Builder, POGOProtos.Rpc.CKBEAAMMANCOrBuilder> cgmdofohjegBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     * @return Whether the cgmdofohjeg field is set.
     */
    public boolean hasCgmdofohjeg() {
      return cgmdofohjegBuilder_ != null || cgmdofohjeg_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     * @return The cgmdofohjeg.
     */
    public POGOProtos.Rpc.CKBEAAMMANC getCgmdofohjeg() {
      if (cgmdofohjegBuilder_ == null) {
        return cgmdofohjeg_ == null ? POGOProtos.Rpc.CKBEAAMMANC.getDefaultInstance() : cgmdofohjeg_;
      } else {
        return cgmdofohjegBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public Builder setCgmdofohjeg(POGOProtos.Rpc.CKBEAAMMANC value) {
      if (cgmdofohjegBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cgmdofohjeg_ = value;
        onChanged();
      } else {
        cgmdofohjegBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public Builder setCgmdofohjeg(
        POGOProtos.Rpc.CKBEAAMMANC.Builder builderForValue) {
      if (cgmdofohjegBuilder_ == null) {
        cgmdofohjeg_ = builderForValue.build();
        onChanged();
      } else {
        cgmdofohjegBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public Builder mergeCgmdofohjeg(POGOProtos.Rpc.CKBEAAMMANC value) {
      if (cgmdofohjegBuilder_ == null) {
        if (cgmdofohjeg_ != null) {
          cgmdofohjeg_ =
            POGOProtos.Rpc.CKBEAAMMANC.newBuilder(cgmdofohjeg_).mergeFrom(value).buildPartial();
        } else {
          cgmdofohjeg_ = value;
        }
        onChanged();
      } else {
        cgmdofohjegBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public Builder clearCgmdofohjeg() {
      if (cgmdofohjegBuilder_ == null) {
        cgmdofohjeg_ = null;
        onChanged();
      } else {
        cgmdofohjeg_ = null;
        cgmdofohjegBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public POGOProtos.Rpc.CKBEAAMMANC.Builder getCgmdofohjegBuilder() {
      
      onChanged();
      return getCgmdofohjegFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    public POGOProtos.Rpc.CKBEAAMMANCOrBuilder getCgmdofohjegOrBuilder() {
      if (cgmdofohjegBuilder_ != null) {
        return cgmdofohjegBuilder_.getMessageOrBuilder();
      } else {
        return cgmdofohjeg_ == null ?
            POGOProtos.Rpc.CKBEAAMMANC.getDefaultInstance() : cgmdofohjeg_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CKBEAAMMANC cgmdofohjeg = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CKBEAAMMANC, POGOProtos.Rpc.CKBEAAMMANC.Builder, POGOProtos.Rpc.CKBEAAMMANCOrBuilder> 
        getCgmdofohjegFieldBuilder() {
      if (cgmdofohjegBuilder_ == null) {
        cgmdofohjegBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CKBEAAMMANC, POGOProtos.Rpc.CKBEAAMMANC.Builder, POGOProtos.Rpc.CKBEAAMMANCOrBuilder>(
                getCgmdofohjeg(),
                getParentForChildren(),
                isClean());
        cgmdofohjeg_ = null;
      }
      return cgmdofohjegBuilder_;
    }

    private long cnnejoldjmb_ ;
    /**
     * <code>int64 cnnejoldjmb = 3;</code>
     * @return The cnnejoldjmb.
     */
    @java.lang.Override
    public long getCnnejoldjmb() {
      return cnnejoldjmb_;
    }
    /**
     * <code>int64 cnnejoldjmb = 3;</code>
     * @param value The cnnejoldjmb to set.
     * @return This builder for chaining.
     */
    public Builder setCnnejoldjmb(long value) {
      
      cnnejoldjmb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cnnejoldjmb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCnnejoldjmb() {
      
      cnnejoldjmb_ = 0L;
      onChanged();
      return this;
    }

    private long mhgliachifj_ ;
    /**
     * <code>int64 mhgliachifj = 4;</code>
     * @return The mhgliachifj.
     */
    @java.lang.Override
    public long getMhgliachifj() {
      return mhgliachifj_;
    }
    /**
     * <code>int64 mhgliachifj = 4;</code>
     * @param value The mhgliachifj to set.
     * @return This builder for chaining.
     */
    public Builder setMhgliachifj(long value) {
      
      mhgliachifj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mhgliachifj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhgliachifj() {
      
      mhgliachifj_ = 0L;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GKMHKMJNEII, POGOProtos.Rpc.GKMHKMJNEII.Builder, POGOProtos.Rpc.GKMHKMJNEIIOrBuilder> omjjmibnbmcBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     * @return Whether the omjjmibnbmc field is set.
     */
    public boolean hasOmjjmibnbmc() {
      return omjjmibnbmcBuilder_ != null || omjjmibnbmc_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     * @return The omjjmibnbmc.
     */
    public POGOProtos.Rpc.GKMHKMJNEII getOmjjmibnbmc() {
      if (omjjmibnbmcBuilder_ == null) {
        return omjjmibnbmc_ == null ? POGOProtos.Rpc.GKMHKMJNEII.getDefaultInstance() : omjjmibnbmc_;
      } else {
        return omjjmibnbmcBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public Builder setOmjjmibnbmc(POGOProtos.Rpc.GKMHKMJNEII value) {
      if (omjjmibnbmcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        omjjmibnbmc_ = value;
        onChanged();
      } else {
        omjjmibnbmcBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public Builder setOmjjmibnbmc(
        POGOProtos.Rpc.GKMHKMJNEII.Builder builderForValue) {
      if (omjjmibnbmcBuilder_ == null) {
        omjjmibnbmc_ = builderForValue.build();
        onChanged();
      } else {
        omjjmibnbmcBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public Builder mergeOmjjmibnbmc(POGOProtos.Rpc.GKMHKMJNEII value) {
      if (omjjmibnbmcBuilder_ == null) {
        if (omjjmibnbmc_ != null) {
          omjjmibnbmc_ =
            POGOProtos.Rpc.GKMHKMJNEII.newBuilder(omjjmibnbmc_).mergeFrom(value).buildPartial();
        } else {
          omjjmibnbmc_ = value;
        }
        onChanged();
      } else {
        omjjmibnbmcBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public Builder clearOmjjmibnbmc() {
      if (omjjmibnbmcBuilder_ == null) {
        omjjmibnbmc_ = null;
        onChanged();
      } else {
        omjjmibnbmc_ = null;
        omjjmibnbmcBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public POGOProtos.Rpc.GKMHKMJNEII.Builder getOmjjmibnbmcBuilder() {
      
      onChanged();
      return getOmjjmibnbmcFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    public POGOProtos.Rpc.GKMHKMJNEIIOrBuilder getOmjjmibnbmcOrBuilder() {
      if (omjjmibnbmcBuilder_ != null) {
        return omjjmibnbmcBuilder_.getMessageOrBuilder();
      } else {
        return omjjmibnbmc_ == null ?
            POGOProtos.Rpc.GKMHKMJNEII.getDefaultInstance() : omjjmibnbmc_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GKMHKMJNEII omjjmibnbmc = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GKMHKMJNEII, POGOProtos.Rpc.GKMHKMJNEII.Builder, POGOProtos.Rpc.GKMHKMJNEIIOrBuilder> 
        getOmjjmibnbmcFieldBuilder() {
      if (omjjmibnbmcBuilder_ == null) {
        omjjmibnbmcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GKMHKMJNEII, POGOProtos.Rpc.GKMHKMJNEII.Builder, POGOProtos.Rpc.GKMHKMJNEIIOrBuilder>(
                getOmjjmibnbmc(),
                getParentForChildren(),
                isClean());
        omjjmibnbmc_ = null;
      }
      return omjjmibnbmcBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CIBHMLLKCNJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CIBHMLLKCNJ)
  private static final POGOProtos.Rpc.CIBHMLLKCNJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CIBHMLLKCNJ();
  }

  public static POGOProtos.Rpc.CIBHMLLKCNJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CIBHMLLKCNJ>
      PARSER = new com.google.protobuf.AbstractParser<CIBHMLLKCNJ>() {
    @java.lang.Override
    public CIBHMLLKCNJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CIBHMLLKCNJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CIBHMLLKCNJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CIBHMLLKCNJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CIBHMLLKCNJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

