// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HCPOEFJOBEC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HCPOEFJOBEC}
 */
public final class HCPOEFJOBEC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HCPOEFJOBEC)
    HCPOEFJOBECOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HCPOEFJOBEC.newBuilder() to construct.
  private HCPOEFJOBEC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HCPOEFJOBEC() {
    jpohffgkkgh_ = com.google.protobuf.ByteString.EMPTY;
    mfolggbbhag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    fjghppmfpoe_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HCPOEFJOBEC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HCPOEFJOBEC(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            POGOProtos.Rpc.FMKAHOBBKHB.Builder subBuilder = null;
            if (bapifimnjnb_ != null) {
              subBuilder = bapifimnjnb_.toBuilder();
            }
            bapifimnjnb_ = input.readMessage(POGOProtos.Rpc.FMKAHOBBKHB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bapifimnjnb_);
              bapifimnjnb_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            jpohffgkkgh_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mfolggbbhag_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            mfolggbbhag_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fjghppmfpoe_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mfolggbbhag_ = mfolggbbhag_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCPOEFJOBEC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCPOEFJOBEC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HCPOEFJOBEC.class, POGOProtos.Rpc.HCPOEFJOBEC.Builder.class);
  }

  public static final int BAPIFIMNJNB_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb_;
  /**
   * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
   * @return Whether the bapifimnjnb field is set.
   */
  @java.lang.Override
  public boolean hasBapifimnjnb() {
    return bapifimnjnb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
   * @return The bapifimnjnb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FMKAHOBBKHB getBapifimnjnb() {
    return bapifimnjnb_ == null ? POGOProtos.Rpc.FMKAHOBBKHB.getDefaultInstance() : bapifimnjnb_;
  }
  /**
   * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FMKAHOBBKHBOrBuilder getBapifimnjnbOrBuilder() {
    return getBapifimnjnb();
  }

  public static final int JPOHFFGKKGH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString jpohffgkkgh_;
  /**
   * <code>bytes jpohffgkkgh = 2;</code>
   * @return The jpohffgkkgh.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJpohffgkkgh() {
    return jpohffgkkgh_;
  }

  public static final int MFOLGGBBHAG_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList mfolggbbhag_;
  /**
   * <code>repeated string mfolggbbhag = 3;</code>
   * @return A list containing the mfolggbbhag.
   */
  public com.google.protobuf.ProtocolStringList
      getMfolggbbhagList() {
    return mfolggbbhag_;
  }
  /**
   * <code>repeated string mfolggbbhag = 3;</code>
   * @return The count of mfolggbbhag.
   */
  public int getMfolggbbhagCount() {
    return mfolggbbhag_.size();
  }
  /**
   * <code>repeated string mfolggbbhag = 3;</code>
   * @param index The index of the element to return.
   * @return The mfolggbbhag at the given index.
   */
  public java.lang.String getMfolggbbhag(int index) {
    return mfolggbbhag_.get(index);
  }
  /**
   * <code>repeated string mfolggbbhag = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the mfolggbbhag at the given index.
   */
  public com.google.protobuf.ByteString
      getMfolggbbhagBytes(int index) {
    return mfolggbbhag_.getByteString(index);
  }

  public static final int FJGHPPMFPOE_FIELD_NUMBER = 4;
  private volatile java.lang.Object fjghppmfpoe_;
  /**
   * <code>string fjghppmfpoe = 4;</code>
   * @return The fjghppmfpoe.
   */
  @java.lang.Override
  public java.lang.String getFjghppmfpoe() {
    java.lang.Object ref = fjghppmfpoe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fjghppmfpoe_ = s;
      return s;
    }
  }
  /**
   * <code>string fjghppmfpoe = 4;</code>
   * @return The bytes for fjghppmfpoe.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFjghppmfpoeBytes() {
    java.lang.Object ref = fjghppmfpoe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fjghppmfpoe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (bapifimnjnb_ != null) {
      output.writeMessage(1, getBapifimnjnb());
    }
    if (!jpohffgkkgh_.isEmpty()) {
      output.writeBytes(2, jpohffgkkgh_);
    }
    for (int i = 0; i < mfolggbbhag_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mfolggbbhag_.getRaw(i));
    }
    if (!getFjghppmfpoeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fjghppmfpoe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bapifimnjnb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBapifimnjnb());
    }
    if (!jpohffgkkgh_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, jpohffgkkgh_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < mfolggbbhag_.size(); i++) {
        dataSize += computeStringSizeNoTag(mfolggbbhag_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMfolggbbhagList().size();
    }
    if (!getFjghppmfpoeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fjghppmfpoe_);
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
    if (!(obj instanceof POGOProtos.Rpc.HCPOEFJOBEC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HCPOEFJOBEC other = (POGOProtos.Rpc.HCPOEFJOBEC) obj;

    if (hasBapifimnjnb() != other.hasBapifimnjnb()) return false;
    if (hasBapifimnjnb()) {
      if (!getBapifimnjnb()
          .equals(other.getBapifimnjnb())) return false;
    }
    if (!getJpohffgkkgh()
        .equals(other.getJpohffgkkgh())) return false;
    if (!getMfolggbbhagList()
        .equals(other.getMfolggbbhagList())) return false;
    if (!getFjghppmfpoe()
        .equals(other.getFjghppmfpoe())) return false;
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
    if (hasBapifimnjnb()) {
      hash = (37 * hash) + BAPIFIMNJNB_FIELD_NUMBER;
      hash = (53 * hash) + getBapifimnjnb().hashCode();
    }
    hash = (37 * hash) + JPOHFFGKKGH_FIELD_NUMBER;
    hash = (53 * hash) + getJpohffgkkgh().hashCode();
    if (getMfolggbbhagCount() > 0) {
      hash = (37 * hash) + MFOLGGBBHAG_FIELD_NUMBER;
      hash = (53 * hash) + getMfolggbbhagList().hashCode();
    }
    hash = (37 * hash) + FJGHPPMFPOE_FIELD_NUMBER;
    hash = (53 * hash) + getFjghppmfpoe().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCPOEFJOBEC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HCPOEFJOBEC prototype) {
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
   * ref: HCPOEFJOBEC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HCPOEFJOBEC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HCPOEFJOBEC)
      POGOProtos.Rpc.HCPOEFJOBECOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCPOEFJOBEC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCPOEFJOBEC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HCPOEFJOBEC.class, POGOProtos.Rpc.HCPOEFJOBEC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HCPOEFJOBEC.newBuilder()
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
      if (bapifimnjnbBuilder_ == null) {
        bapifimnjnb_ = null;
      } else {
        bapifimnjnb_ = null;
        bapifimnjnbBuilder_ = null;
      }
      jpohffgkkgh_ = com.google.protobuf.ByteString.EMPTY;

      mfolggbbhag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      fjghppmfpoe_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCPOEFJOBEC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCPOEFJOBEC getDefaultInstanceForType() {
      return POGOProtos.Rpc.HCPOEFJOBEC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCPOEFJOBEC build() {
      POGOProtos.Rpc.HCPOEFJOBEC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCPOEFJOBEC buildPartial() {
      POGOProtos.Rpc.HCPOEFJOBEC result = new POGOProtos.Rpc.HCPOEFJOBEC(this);
      int from_bitField0_ = bitField0_;
      if (bapifimnjnbBuilder_ == null) {
        result.bapifimnjnb_ = bapifimnjnb_;
      } else {
        result.bapifimnjnb_ = bapifimnjnbBuilder_.build();
      }
      result.jpohffgkkgh_ = jpohffgkkgh_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mfolggbbhag_ = mfolggbbhag_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mfolggbbhag_ = mfolggbbhag_;
      result.fjghppmfpoe_ = fjghppmfpoe_;
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
      if (other instanceof POGOProtos.Rpc.HCPOEFJOBEC) {
        return mergeFrom((POGOProtos.Rpc.HCPOEFJOBEC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HCPOEFJOBEC other) {
      if (other == POGOProtos.Rpc.HCPOEFJOBEC.getDefaultInstance()) return this;
      if (other.hasBapifimnjnb()) {
        mergeBapifimnjnb(other.getBapifimnjnb());
      }
      if (other.getJpohffgkkgh() != com.google.protobuf.ByteString.EMPTY) {
        setJpohffgkkgh(other.getJpohffgkkgh());
      }
      if (!other.mfolggbbhag_.isEmpty()) {
        if (mfolggbbhag_.isEmpty()) {
          mfolggbbhag_ = other.mfolggbbhag_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMfolggbbhagIsMutable();
          mfolggbbhag_.addAll(other.mfolggbbhag_);
        }
        onChanged();
      }
      if (!other.getFjghppmfpoe().isEmpty()) {
        fjghppmfpoe_ = other.fjghppmfpoe_;
        onChanged();
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
      POGOProtos.Rpc.HCPOEFJOBEC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HCPOEFJOBEC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FMKAHOBBKHB, POGOProtos.Rpc.FMKAHOBBKHB.Builder, POGOProtos.Rpc.FMKAHOBBKHBOrBuilder> bapifimnjnbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     * @return Whether the bapifimnjnb field is set.
     */
    public boolean hasBapifimnjnb() {
      return bapifimnjnbBuilder_ != null || bapifimnjnb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     * @return The bapifimnjnb.
     */
    public POGOProtos.Rpc.FMKAHOBBKHB getBapifimnjnb() {
      if (bapifimnjnbBuilder_ == null) {
        return bapifimnjnb_ == null ? POGOProtos.Rpc.FMKAHOBBKHB.getDefaultInstance() : bapifimnjnb_;
      } else {
        return bapifimnjnbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public Builder setBapifimnjnb(POGOProtos.Rpc.FMKAHOBBKHB value) {
      if (bapifimnjnbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bapifimnjnb_ = value;
        onChanged();
      } else {
        bapifimnjnbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public Builder setBapifimnjnb(
        POGOProtos.Rpc.FMKAHOBBKHB.Builder builderForValue) {
      if (bapifimnjnbBuilder_ == null) {
        bapifimnjnb_ = builderForValue.build();
        onChanged();
      } else {
        bapifimnjnbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public Builder mergeBapifimnjnb(POGOProtos.Rpc.FMKAHOBBKHB value) {
      if (bapifimnjnbBuilder_ == null) {
        if (bapifimnjnb_ != null) {
          bapifimnjnb_ =
            POGOProtos.Rpc.FMKAHOBBKHB.newBuilder(bapifimnjnb_).mergeFrom(value).buildPartial();
        } else {
          bapifimnjnb_ = value;
        }
        onChanged();
      } else {
        bapifimnjnbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public Builder clearBapifimnjnb() {
      if (bapifimnjnbBuilder_ == null) {
        bapifimnjnb_ = null;
        onChanged();
      } else {
        bapifimnjnb_ = null;
        bapifimnjnbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public POGOProtos.Rpc.FMKAHOBBKHB.Builder getBapifimnjnbBuilder() {
      
      onChanged();
      return getBapifimnjnbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    public POGOProtos.Rpc.FMKAHOBBKHBOrBuilder getBapifimnjnbOrBuilder() {
      if (bapifimnjnbBuilder_ != null) {
        return bapifimnjnbBuilder_.getMessageOrBuilder();
      } else {
        return bapifimnjnb_ == null ?
            POGOProtos.Rpc.FMKAHOBBKHB.getDefaultInstance() : bapifimnjnb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FMKAHOBBKHB bapifimnjnb = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FMKAHOBBKHB, POGOProtos.Rpc.FMKAHOBBKHB.Builder, POGOProtos.Rpc.FMKAHOBBKHBOrBuilder> 
        getBapifimnjnbFieldBuilder() {
      if (bapifimnjnbBuilder_ == null) {
        bapifimnjnbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FMKAHOBBKHB, POGOProtos.Rpc.FMKAHOBBKHB.Builder, POGOProtos.Rpc.FMKAHOBBKHBOrBuilder>(
                getBapifimnjnb(),
                getParentForChildren(),
                isClean());
        bapifimnjnb_ = null;
      }
      return bapifimnjnbBuilder_;
    }

    private com.google.protobuf.ByteString jpohffgkkgh_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes jpohffgkkgh = 2;</code>
     * @return The jpohffgkkgh.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getJpohffgkkgh() {
      return jpohffgkkgh_;
    }
    /**
     * <code>bytes jpohffgkkgh = 2;</code>
     * @param value The jpohffgkkgh to set.
     * @return This builder for chaining.
     */
    public Builder setJpohffgkkgh(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jpohffgkkgh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes jpohffgkkgh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJpohffgkkgh() {
      
      jpohffgkkgh_ = getDefaultInstance().getJpohffgkkgh();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList mfolggbbhag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMfolggbbhagIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mfolggbbhag_ = new com.google.protobuf.LazyStringArrayList(mfolggbbhag_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @return A list containing the mfolggbbhag.
     */
    public com.google.protobuf.ProtocolStringList
        getMfolggbbhagList() {
      return mfolggbbhag_.getUnmodifiableView();
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @return The count of mfolggbbhag.
     */
    public int getMfolggbbhagCount() {
      return mfolggbbhag_.size();
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param index The index of the element to return.
     * @return The mfolggbbhag at the given index.
     */
    public java.lang.String getMfolggbbhag(int index) {
      return mfolggbbhag_.get(index);
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the mfolggbbhag at the given index.
     */
    public com.google.protobuf.ByteString
        getMfolggbbhagBytes(int index) {
      return mfolggbbhag_.getByteString(index);
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param index The index to set the value at.
     * @param value The mfolggbbhag to set.
     * @return This builder for chaining.
     */
    public Builder setMfolggbbhag(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMfolggbbhagIsMutable();
      mfolggbbhag_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param value The mfolggbbhag to add.
     * @return This builder for chaining.
     */
    public Builder addMfolggbbhag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMfolggbbhagIsMutable();
      mfolggbbhag_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param values The mfolggbbhag to add.
     * @return This builder for chaining.
     */
    public Builder addAllMfolggbbhag(
        java.lang.Iterable<java.lang.String> values) {
      ensureMfolggbbhagIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mfolggbbhag_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfolggbbhag() {
      mfolggbbhag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string mfolggbbhag = 3;</code>
     * @param value The bytes of the mfolggbbhag to add.
     * @return This builder for chaining.
     */
    public Builder addMfolggbbhagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMfolggbbhagIsMutable();
      mfolggbbhag_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object fjghppmfpoe_ = "";
    /**
     * <code>string fjghppmfpoe = 4;</code>
     * @return The fjghppmfpoe.
     */
    public java.lang.String getFjghppmfpoe() {
      java.lang.Object ref = fjghppmfpoe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fjghppmfpoe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fjghppmfpoe = 4;</code>
     * @return The bytes for fjghppmfpoe.
     */
    public com.google.protobuf.ByteString
        getFjghppmfpoeBytes() {
      java.lang.Object ref = fjghppmfpoe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fjghppmfpoe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fjghppmfpoe = 4;</code>
     * @param value The fjghppmfpoe to set.
     * @return This builder for chaining.
     */
    public Builder setFjghppmfpoe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fjghppmfpoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fjghppmfpoe = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFjghppmfpoe() {
      
      fjghppmfpoe_ = getDefaultInstance().getFjghppmfpoe();
      onChanged();
      return this;
    }
    /**
     * <code>string fjghppmfpoe = 4;</code>
     * @param value The bytes for fjghppmfpoe to set.
     * @return This builder for chaining.
     */
    public Builder setFjghppmfpoeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fjghppmfpoe_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HCPOEFJOBEC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HCPOEFJOBEC)
  private static final POGOProtos.Rpc.HCPOEFJOBEC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HCPOEFJOBEC();
  }

  public static POGOProtos.Rpc.HCPOEFJOBEC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HCPOEFJOBEC>
      PARSER = new com.google.protobuf.AbstractParser<HCPOEFJOBEC>() {
    @java.lang.Override
    public HCPOEFJOBEC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HCPOEFJOBEC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HCPOEFJOBEC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HCPOEFJOBEC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HCPOEFJOBEC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

