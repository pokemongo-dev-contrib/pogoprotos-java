// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NDOKEDHKGDL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NDOKEDHKGDL}
 */
public final class NDOKEDHKGDL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NDOKEDHKGDL)
    NDOKEDHKGDLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NDOKEDHKGDL.newBuilder() to construct.
  private NDOKEDHKGDL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NDOKEDHKGDL() {
    igcliicdocg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    agdlgmagkag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NDOKEDHKGDL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NDOKEDHKGDL(
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
          case 8: {

            mlihoifjhhd_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              igcliicdocg_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            igcliicdocg_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              agdlgmagkag_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            agdlgmagkag_.add(s);
            break;
          }
          case 32: {

            kndfcldgcfk_ = input.readBool();
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
        igcliicdocg_ = igcliicdocg_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        agdlgmagkag_ = agdlgmagkag_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NDOKEDHKGDL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NDOKEDHKGDL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NDOKEDHKGDL.class, POGOProtos.Rpc.NDOKEDHKGDL.Builder.class);
  }

  public static final int MLIHOIFJHHD_FIELD_NUMBER = 1;
  private boolean mlihoifjhhd_;
  /**
   * <code>bool mlihoifjhhd = 1;</code>
   * @return The mlihoifjhhd.
   */
  @java.lang.Override
  public boolean getMlihoifjhhd() {
    return mlihoifjhhd_;
  }

  public static final int IGCLIICDOCG_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList igcliicdocg_;
  /**
   * <code>repeated string igcliicdocg = 2;</code>
   * @return A list containing the igcliicdocg.
   */
  public com.google.protobuf.ProtocolStringList
      getIgcliicdocgList() {
    return igcliicdocg_;
  }
  /**
   * <code>repeated string igcliicdocg = 2;</code>
   * @return The count of igcliicdocg.
   */
  public int getIgcliicdocgCount() {
    return igcliicdocg_.size();
  }
  /**
   * <code>repeated string igcliicdocg = 2;</code>
   * @param index The index of the element to return.
   * @return The igcliicdocg at the given index.
   */
  public java.lang.String getIgcliicdocg(int index) {
    return igcliicdocg_.get(index);
  }
  /**
   * <code>repeated string igcliicdocg = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the igcliicdocg at the given index.
   */
  public com.google.protobuf.ByteString
      getIgcliicdocgBytes(int index) {
    return igcliicdocg_.getByteString(index);
  }

  public static final int AGDLGMAGKAG_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList agdlgmagkag_;
  /**
   * <code>repeated string agdlgmagkag = 3;</code>
   * @return A list containing the agdlgmagkag.
   */
  public com.google.protobuf.ProtocolStringList
      getAgdlgmagkagList() {
    return agdlgmagkag_;
  }
  /**
   * <code>repeated string agdlgmagkag = 3;</code>
   * @return The count of agdlgmagkag.
   */
  public int getAgdlgmagkagCount() {
    return agdlgmagkag_.size();
  }
  /**
   * <code>repeated string agdlgmagkag = 3;</code>
   * @param index The index of the element to return.
   * @return The agdlgmagkag at the given index.
   */
  public java.lang.String getAgdlgmagkag(int index) {
    return agdlgmagkag_.get(index);
  }
  /**
   * <code>repeated string agdlgmagkag = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the agdlgmagkag at the given index.
   */
  public com.google.protobuf.ByteString
      getAgdlgmagkagBytes(int index) {
    return agdlgmagkag_.getByteString(index);
  }

  public static final int KNDFCLDGCFK_FIELD_NUMBER = 4;
  private boolean kndfcldgcfk_;
  /**
   * <code>bool kndfcldgcfk = 4;</code>
   * @return The kndfcldgcfk.
   */
  @java.lang.Override
  public boolean getKndfcldgcfk() {
    return kndfcldgcfk_;
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
    if (mlihoifjhhd_ != false) {
      output.writeBool(1, mlihoifjhhd_);
    }
    for (int i = 0; i < igcliicdocg_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, igcliicdocg_.getRaw(i));
    }
    for (int i = 0; i < agdlgmagkag_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, agdlgmagkag_.getRaw(i));
    }
    if (kndfcldgcfk_ != false) {
      output.writeBool(4, kndfcldgcfk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mlihoifjhhd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, mlihoifjhhd_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < igcliicdocg_.size(); i++) {
        dataSize += computeStringSizeNoTag(igcliicdocg_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIgcliicdocgList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < agdlgmagkag_.size(); i++) {
        dataSize += computeStringSizeNoTag(agdlgmagkag_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAgdlgmagkagList().size();
    }
    if (kndfcldgcfk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, kndfcldgcfk_);
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
    if (!(obj instanceof POGOProtos.Rpc.NDOKEDHKGDL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NDOKEDHKGDL other = (POGOProtos.Rpc.NDOKEDHKGDL) obj;

    if (getMlihoifjhhd()
        != other.getMlihoifjhhd()) return false;
    if (!getIgcliicdocgList()
        .equals(other.getIgcliicdocgList())) return false;
    if (!getAgdlgmagkagList()
        .equals(other.getAgdlgmagkagList())) return false;
    if (getKndfcldgcfk()
        != other.getKndfcldgcfk()) return false;
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
    hash = (37 * hash) + MLIHOIFJHHD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMlihoifjhhd());
    if (getIgcliicdocgCount() > 0) {
      hash = (37 * hash) + IGCLIICDOCG_FIELD_NUMBER;
      hash = (53 * hash) + getIgcliicdocgList().hashCode();
    }
    if (getAgdlgmagkagCount() > 0) {
      hash = (37 * hash) + AGDLGMAGKAG_FIELD_NUMBER;
      hash = (53 * hash) + getAgdlgmagkagList().hashCode();
    }
    hash = (37 * hash) + KNDFCLDGCFK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKndfcldgcfk());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NDOKEDHKGDL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NDOKEDHKGDL prototype) {
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
   * ref: NDOKEDHKGDL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NDOKEDHKGDL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NDOKEDHKGDL)
      POGOProtos.Rpc.NDOKEDHKGDLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NDOKEDHKGDL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NDOKEDHKGDL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NDOKEDHKGDL.class, POGOProtos.Rpc.NDOKEDHKGDL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NDOKEDHKGDL.newBuilder()
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
      mlihoifjhhd_ = false;

      igcliicdocg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      agdlgmagkag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      kndfcldgcfk_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NDOKEDHKGDL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NDOKEDHKGDL getDefaultInstanceForType() {
      return POGOProtos.Rpc.NDOKEDHKGDL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NDOKEDHKGDL build() {
      POGOProtos.Rpc.NDOKEDHKGDL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NDOKEDHKGDL buildPartial() {
      POGOProtos.Rpc.NDOKEDHKGDL result = new POGOProtos.Rpc.NDOKEDHKGDL(this);
      int from_bitField0_ = bitField0_;
      result.mlihoifjhhd_ = mlihoifjhhd_;
      if (((bitField0_ & 0x00000001) != 0)) {
        igcliicdocg_ = igcliicdocg_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.igcliicdocg_ = igcliicdocg_;
      if (((bitField0_ & 0x00000002) != 0)) {
        agdlgmagkag_ = agdlgmagkag_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.agdlgmagkag_ = agdlgmagkag_;
      result.kndfcldgcfk_ = kndfcldgcfk_;
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
      if (other instanceof POGOProtos.Rpc.NDOKEDHKGDL) {
        return mergeFrom((POGOProtos.Rpc.NDOKEDHKGDL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NDOKEDHKGDL other) {
      if (other == POGOProtos.Rpc.NDOKEDHKGDL.getDefaultInstance()) return this;
      if (other.getMlihoifjhhd() != false) {
        setMlihoifjhhd(other.getMlihoifjhhd());
      }
      if (!other.igcliicdocg_.isEmpty()) {
        if (igcliicdocg_.isEmpty()) {
          igcliicdocg_ = other.igcliicdocg_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIgcliicdocgIsMutable();
          igcliicdocg_.addAll(other.igcliicdocg_);
        }
        onChanged();
      }
      if (!other.agdlgmagkag_.isEmpty()) {
        if (agdlgmagkag_.isEmpty()) {
          agdlgmagkag_ = other.agdlgmagkag_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAgdlgmagkagIsMutable();
          agdlgmagkag_.addAll(other.agdlgmagkag_);
        }
        onChanged();
      }
      if (other.getKndfcldgcfk() != false) {
        setKndfcldgcfk(other.getKndfcldgcfk());
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
      POGOProtos.Rpc.NDOKEDHKGDL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NDOKEDHKGDL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean mlihoifjhhd_ ;
    /**
     * <code>bool mlihoifjhhd = 1;</code>
     * @return The mlihoifjhhd.
     */
    @java.lang.Override
    public boolean getMlihoifjhhd() {
      return mlihoifjhhd_;
    }
    /**
     * <code>bool mlihoifjhhd = 1;</code>
     * @param value The mlihoifjhhd to set.
     * @return This builder for chaining.
     */
    public Builder setMlihoifjhhd(boolean value) {
      
      mlihoifjhhd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mlihoifjhhd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlihoifjhhd() {
      
      mlihoifjhhd_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList igcliicdocg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIgcliicdocgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        igcliicdocg_ = new com.google.protobuf.LazyStringArrayList(igcliicdocg_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @return A list containing the igcliicdocg.
     */
    public com.google.protobuf.ProtocolStringList
        getIgcliicdocgList() {
      return igcliicdocg_.getUnmodifiableView();
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @return The count of igcliicdocg.
     */
    public int getIgcliicdocgCount() {
      return igcliicdocg_.size();
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param index The index of the element to return.
     * @return The igcliicdocg at the given index.
     */
    public java.lang.String getIgcliicdocg(int index) {
      return igcliicdocg_.get(index);
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the igcliicdocg at the given index.
     */
    public com.google.protobuf.ByteString
        getIgcliicdocgBytes(int index) {
      return igcliicdocg_.getByteString(index);
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param index The index to set the value at.
     * @param value The igcliicdocg to set.
     * @return This builder for chaining.
     */
    public Builder setIgcliicdocg(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIgcliicdocgIsMutable();
      igcliicdocg_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param value The igcliicdocg to add.
     * @return This builder for chaining.
     */
    public Builder addIgcliicdocg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIgcliicdocgIsMutable();
      igcliicdocg_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param values The igcliicdocg to add.
     * @return This builder for chaining.
     */
    public Builder addAllIgcliicdocg(
        java.lang.Iterable<java.lang.String> values) {
      ensureIgcliicdocgIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, igcliicdocg_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgcliicdocg() {
      igcliicdocg_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string igcliicdocg = 2;</code>
     * @param value The bytes of the igcliicdocg to add.
     * @return This builder for chaining.
     */
    public Builder addIgcliicdocgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIgcliicdocgIsMutable();
      igcliicdocg_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList agdlgmagkag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAgdlgmagkagIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        agdlgmagkag_ = new com.google.protobuf.LazyStringArrayList(agdlgmagkag_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @return A list containing the agdlgmagkag.
     */
    public com.google.protobuf.ProtocolStringList
        getAgdlgmagkagList() {
      return agdlgmagkag_.getUnmodifiableView();
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @return The count of agdlgmagkag.
     */
    public int getAgdlgmagkagCount() {
      return agdlgmagkag_.size();
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param index The index of the element to return.
     * @return The agdlgmagkag at the given index.
     */
    public java.lang.String getAgdlgmagkag(int index) {
      return agdlgmagkag_.get(index);
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the agdlgmagkag at the given index.
     */
    public com.google.protobuf.ByteString
        getAgdlgmagkagBytes(int index) {
      return agdlgmagkag_.getByteString(index);
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param index The index to set the value at.
     * @param value The agdlgmagkag to set.
     * @return This builder for chaining.
     */
    public Builder setAgdlgmagkag(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAgdlgmagkagIsMutable();
      agdlgmagkag_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param value The agdlgmagkag to add.
     * @return This builder for chaining.
     */
    public Builder addAgdlgmagkag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAgdlgmagkagIsMutable();
      agdlgmagkag_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param values The agdlgmagkag to add.
     * @return This builder for chaining.
     */
    public Builder addAllAgdlgmagkag(
        java.lang.Iterable<java.lang.String> values) {
      ensureAgdlgmagkagIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, agdlgmagkag_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgdlgmagkag() {
      agdlgmagkag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agdlgmagkag = 3;</code>
     * @param value The bytes of the agdlgmagkag to add.
     * @return This builder for chaining.
     */
    public Builder addAgdlgmagkagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAgdlgmagkagIsMutable();
      agdlgmagkag_.add(value);
      onChanged();
      return this;
    }

    private boolean kndfcldgcfk_ ;
    /**
     * <code>bool kndfcldgcfk = 4;</code>
     * @return The kndfcldgcfk.
     */
    @java.lang.Override
    public boolean getKndfcldgcfk() {
      return kndfcldgcfk_;
    }
    /**
     * <code>bool kndfcldgcfk = 4;</code>
     * @param value The kndfcldgcfk to set.
     * @return This builder for chaining.
     */
    public Builder setKndfcldgcfk(boolean value) {
      
      kndfcldgcfk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kndfcldgcfk = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKndfcldgcfk() {
      
      kndfcldgcfk_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NDOKEDHKGDL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NDOKEDHKGDL)
  private static final POGOProtos.Rpc.NDOKEDHKGDL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NDOKEDHKGDL();
  }

  public static POGOProtos.Rpc.NDOKEDHKGDL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NDOKEDHKGDL>
      PARSER = new com.google.protobuf.AbstractParser<NDOKEDHKGDL>() {
    @java.lang.Override
    public NDOKEDHKGDL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NDOKEDHKGDL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NDOKEDHKGDL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NDOKEDHKGDL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NDOKEDHKGDL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

