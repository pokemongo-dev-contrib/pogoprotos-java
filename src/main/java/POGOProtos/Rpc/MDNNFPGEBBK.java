// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MDNNFPGEBBK}
 */
public  final class MDNNFPGEBBK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MDNNFPGEBBK)
    MDNNFPGEBBKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MDNNFPGEBBK.newBuilder() to construct.
  private MDNNFPGEBBK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MDNNFPGEBBK() {
    gfebcpomlbp_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MDNNFPGEBBK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MDNNFPGEBBK(
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
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              gfebcpomlbp_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            gfebcpomlbp_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gfebcpomlbp_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              gfebcpomlbp_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {

            mbjdnibphde_ = input.readInt32();
            break;
          }
          case 24: {

            iggckejingi_ = input.readInt32();
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
        gfebcpomlbp_ = java.util.Collections.unmodifiableList(gfebcpomlbp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MDNNFPGEBBK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MDNNFPGEBBK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MDNNFPGEBBK.class, POGOProtos.Rpc.MDNNFPGEBBK.Builder.class);
  }

  public static final int GFEBCPOMLBP_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> gfebcpomlbp_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloBadgeType> gfebcpomlbp_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>() {
            public POGOProtos.Rpc.HoloBadgeType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloBadgeType result = POGOProtos.Rpc.HoloBadgeType.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloBadgeType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
   * @return A list containing the gfebcpomlbp.
   */
  public java.util.List<POGOProtos.Rpc.HoloBadgeType> getGfebcpomlbpList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(gfebcpomlbp_, gfebcpomlbp_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
   * @return The count of gfebcpomlbp.
   */
  public int getGfebcpomlbpCount() {
    return gfebcpomlbp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
   * @param index The index of the element to return.
   * @return The gfebcpomlbp at the given index.
   */
  public POGOProtos.Rpc.HoloBadgeType getGfebcpomlbp(int index) {
    return gfebcpomlbp_converter_.convert(gfebcpomlbp_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
   * @return A list containing the enum numeric values on the wire for gfebcpomlbp.
   */
  public java.util.List<java.lang.Integer>
  getGfebcpomlbpValueList() {
    return gfebcpomlbp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of gfebcpomlbp at the given index.
   */
  public int getGfebcpomlbpValue(int index) {
    return gfebcpomlbp_.get(index);
  }
  private int gfebcpomlbpMemoizedSerializedSize;

  public static final int MBJDNIBPHDE_FIELD_NUMBER = 2;
  private int mbjdnibphde_;
  /**
   * <code>int32 mbjdnibphde = 2;</code>
   * @return The mbjdnibphde.
   */
  public int getMbjdnibphde() {
    return mbjdnibphde_;
  }

  public static final int IGGCKEJINGI_FIELD_NUMBER = 3;
  private int iggckejingi_;
  /**
   * <code>int32 iggckejingi = 3;</code>
   * @return The iggckejingi.
   */
  public int getIggckejingi() {
    return iggckejingi_;
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
    getSerializedSize();
    if (getGfebcpomlbpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(gfebcpomlbpMemoizedSerializedSize);
    }
    for (int i = 0; i < gfebcpomlbp_.size(); i++) {
      output.writeEnumNoTag(gfebcpomlbp_.get(i));
    }
    if (mbjdnibphde_ != 0) {
      output.writeInt32(2, mbjdnibphde_);
    }
    if (iggckejingi_ != 0) {
      output.writeInt32(3, iggckejingi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < gfebcpomlbp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(gfebcpomlbp_.get(i));
      }
      size += dataSize;
      if (!getGfebcpomlbpList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }gfebcpomlbpMemoizedSerializedSize = dataSize;
    }
    if (mbjdnibphde_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, mbjdnibphde_);
    }
    if (iggckejingi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, iggckejingi_);
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
    if (!(obj instanceof POGOProtos.Rpc.MDNNFPGEBBK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MDNNFPGEBBK other = (POGOProtos.Rpc.MDNNFPGEBBK) obj;

    if (!gfebcpomlbp_.equals(other.gfebcpomlbp_)) return false;
    if (getMbjdnibphde()
        != other.getMbjdnibphde()) return false;
    if (getIggckejingi()
        != other.getIggckejingi()) return false;
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
    if (getGfebcpomlbpCount() > 0) {
      hash = (37 * hash) + GFEBCPOMLBP_FIELD_NUMBER;
      hash = (53 * hash) + gfebcpomlbp_.hashCode();
    }
    hash = (37 * hash) + MBJDNIBPHDE_FIELD_NUMBER;
    hash = (53 * hash) + getMbjdnibphde();
    hash = (37 * hash) + IGGCKEJINGI_FIELD_NUMBER;
    hash = (53 * hash) + getIggckejingi();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MDNNFPGEBBK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MDNNFPGEBBK prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MDNNFPGEBBK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MDNNFPGEBBK)
      POGOProtos.Rpc.MDNNFPGEBBKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MDNNFPGEBBK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MDNNFPGEBBK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MDNNFPGEBBK.class, POGOProtos.Rpc.MDNNFPGEBBK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MDNNFPGEBBK.newBuilder()
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
      gfebcpomlbp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      mbjdnibphde_ = 0;

      iggckejingi_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MDNNFPGEBBK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MDNNFPGEBBK getDefaultInstanceForType() {
      return POGOProtos.Rpc.MDNNFPGEBBK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MDNNFPGEBBK build() {
      POGOProtos.Rpc.MDNNFPGEBBK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MDNNFPGEBBK buildPartial() {
      POGOProtos.Rpc.MDNNFPGEBBK result = new POGOProtos.Rpc.MDNNFPGEBBK(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        gfebcpomlbp_ = java.util.Collections.unmodifiableList(gfebcpomlbp_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.gfebcpomlbp_ = gfebcpomlbp_;
      result.mbjdnibphde_ = mbjdnibphde_;
      result.iggckejingi_ = iggckejingi_;
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
      if (other instanceof POGOProtos.Rpc.MDNNFPGEBBK) {
        return mergeFrom((POGOProtos.Rpc.MDNNFPGEBBK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MDNNFPGEBBK other) {
      if (other == POGOProtos.Rpc.MDNNFPGEBBK.getDefaultInstance()) return this;
      if (!other.gfebcpomlbp_.isEmpty()) {
        if (gfebcpomlbp_.isEmpty()) {
          gfebcpomlbp_ = other.gfebcpomlbp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGfebcpomlbpIsMutable();
          gfebcpomlbp_.addAll(other.gfebcpomlbp_);
        }
        onChanged();
      }
      if (other.getMbjdnibphde() != 0) {
        setMbjdnibphde(other.getMbjdnibphde());
      }
      if (other.getIggckejingi() != 0) {
        setIggckejingi(other.getIggckejingi());
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
      POGOProtos.Rpc.MDNNFPGEBBK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MDNNFPGEBBK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> gfebcpomlbp_ =
      java.util.Collections.emptyList();
    private void ensureGfebcpomlbpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gfebcpomlbp_ = new java.util.ArrayList<java.lang.Integer>(gfebcpomlbp_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @return A list containing the gfebcpomlbp.
     */
    public java.util.List<POGOProtos.Rpc.HoloBadgeType> getGfebcpomlbpList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(gfebcpomlbp_, gfebcpomlbp_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @return The count of gfebcpomlbp.
     */
    public int getGfebcpomlbpCount() {
      return gfebcpomlbp_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param index The index of the element to return.
     * @return The gfebcpomlbp at the given index.
     */
    public POGOProtos.Rpc.HoloBadgeType getGfebcpomlbp(int index) {
      return gfebcpomlbp_converter_.convert(gfebcpomlbp_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param index The index to set the value at.
     * @param value The gfebcpomlbp to set.
     * @return This builder for chaining.
     */
    public Builder setGfebcpomlbp(
        int index, POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGfebcpomlbpIsMutable();
      gfebcpomlbp_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param value The gfebcpomlbp to add.
     * @return This builder for chaining.
     */
    public Builder addGfebcpomlbp(POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGfebcpomlbpIsMutable();
      gfebcpomlbp_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param values The gfebcpomlbp to add.
     * @return This builder for chaining.
     */
    public Builder addAllGfebcpomlbp(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloBadgeType> values) {
      ensureGfebcpomlbpIsMutable();
      for (POGOProtos.Rpc.HoloBadgeType value : values) {
        gfebcpomlbp_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGfebcpomlbp() {
      gfebcpomlbp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @return A list containing the enum numeric values on the wire for gfebcpomlbp.
     */
    public java.util.List<java.lang.Integer>
    getGfebcpomlbpValueList() {
      return java.util.Collections.unmodifiableList(gfebcpomlbp_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gfebcpomlbp at the given index.
     */
    public int getGfebcpomlbpValue(int index) {
      return gfebcpomlbp_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gfebcpomlbp at the given index.
     * @return This builder for chaining.
     */
    public Builder setGfebcpomlbpValue(
        int index, int value) {
      ensureGfebcpomlbpIsMutable();
      gfebcpomlbp_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param value The enum numeric value on the wire for gfebcpomlbp to add.
     * @return This builder for chaining.
     */
    public Builder addGfebcpomlbpValue(int value) {
      ensureGfebcpomlbpIsMutable();
      gfebcpomlbp_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType gfebcpomlbp = 1;</code>
     * @param values The enum numeric values on the wire for gfebcpomlbp to add.
     * @return This builder for chaining.
     */
    public Builder addAllGfebcpomlbpValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureGfebcpomlbpIsMutable();
      for (int value : values) {
        gfebcpomlbp_.add(value);
      }
      onChanged();
      return this;
    }

    private int mbjdnibphde_ ;
    /**
     * <code>int32 mbjdnibphde = 2;</code>
     * @return The mbjdnibphde.
     */
    public int getMbjdnibphde() {
      return mbjdnibphde_;
    }
    /**
     * <code>int32 mbjdnibphde = 2;</code>
     * @param value The mbjdnibphde to set.
     * @return This builder for chaining.
     */
    public Builder setMbjdnibphde(int value) {
      
      mbjdnibphde_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mbjdnibphde = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMbjdnibphde() {
      
      mbjdnibphde_ = 0;
      onChanged();
      return this;
    }

    private int iggckejingi_ ;
    /**
     * <code>int32 iggckejingi = 3;</code>
     * @return The iggckejingi.
     */
    public int getIggckejingi() {
      return iggckejingi_;
    }
    /**
     * <code>int32 iggckejingi = 3;</code>
     * @param value The iggckejingi to set.
     * @return This builder for chaining.
     */
    public Builder setIggckejingi(int value) {
      
      iggckejingi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 iggckejingi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIggckejingi() {
      
      iggckejingi_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MDNNFPGEBBK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MDNNFPGEBBK)
  private static final POGOProtos.Rpc.MDNNFPGEBBK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MDNNFPGEBBK();
  }

  public static POGOProtos.Rpc.MDNNFPGEBBK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MDNNFPGEBBK>
      PARSER = new com.google.protobuf.AbstractParser<MDNNFPGEBBK>() {
    @java.lang.Override
    public MDNNFPGEBBK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MDNNFPGEBBK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MDNNFPGEBBK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MDNNFPGEBBK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MDNNFPGEBBK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

