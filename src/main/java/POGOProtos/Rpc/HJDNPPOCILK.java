// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HJDNPPOCILK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HJDNPPOCILK}
 */
public final class HJDNPPOCILK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HJDNPPOCILK)
    HJDNPPOCILKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HJDNPPOCILK.newBuilder() to construct.
  private HJDNPPOCILK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HJDNPPOCILK() {
    lggibhkhehp_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HJDNPPOCILK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HJDNPPOCILK(
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
              lggibhkhehp_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            lggibhkhehp_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lggibhkhehp_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              lggibhkhehp_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        lggibhkhehp_ = java.util.Collections.unmodifiableList(lggibhkhehp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJDNPPOCILK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJDNPPOCILK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HJDNPPOCILK.class, POGOProtos.Rpc.HJDNPPOCILK.Builder.class);
  }

  public static final int LGGIBHKHEHP_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> lggibhkhehp_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.MPCKBLJLBID> lggibhkhehp_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.MPCKBLJLBID>() {
            public POGOProtos.Rpc.MPCKBLJLBID convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.MPCKBLJLBID result = POGOProtos.Rpc.MPCKBLJLBID.valueOf(from);
              return result == null ? POGOProtos.Rpc.MPCKBLJLBID.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
   * @return A list containing the lggibhkhehp.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.MPCKBLJLBID> getLggibhkhehpList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.MPCKBLJLBID>(lggibhkhehp_, lggibhkhehp_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
   * @return The count of lggibhkhehp.
   */
  @java.lang.Override
  public int getLggibhkhehpCount() {
    return lggibhkhehp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
   * @param index The index of the element to return.
   * @return The lggibhkhehp at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MPCKBLJLBID getLggibhkhehp(int index) {
    return lggibhkhehp_converter_.convert(lggibhkhehp_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
   * @return A list containing the enum numeric values on the wire for lggibhkhehp.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getLggibhkhehpValueList() {
    return lggibhkhehp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of lggibhkhehp at the given index.
   */
  @java.lang.Override
  public int getLggibhkhehpValue(int index) {
    return lggibhkhehp_.get(index);
  }
  private int lggibhkhehpMemoizedSerializedSize;

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
    if (getLggibhkhehpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(lggibhkhehpMemoizedSerializedSize);
    }
    for (int i = 0; i < lggibhkhehp_.size(); i++) {
      output.writeEnumNoTag(lggibhkhehp_.get(i));
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
      for (int i = 0; i < lggibhkhehp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(lggibhkhehp_.get(i));
      }
      size += dataSize;
      if (!getLggibhkhehpList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }lggibhkhehpMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.HJDNPPOCILK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HJDNPPOCILK other = (POGOProtos.Rpc.HJDNPPOCILK) obj;

    if (!lggibhkhehp_.equals(other.lggibhkhehp_)) return false;
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
    if (getLggibhkhehpCount() > 0) {
      hash = (37 * hash) + LGGIBHKHEHP_FIELD_NUMBER;
      hash = (53 * hash) + lggibhkhehp_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HJDNPPOCILK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HJDNPPOCILK prototype) {
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
   * ref: HJDNPPOCILK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HJDNPPOCILK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HJDNPPOCILK)
      POGOProtos.Rpc.HJDNPPOCILKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJDNPPOCILK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJDNPPOCILK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HJDNPPOCILK.class, POGOProtos.Rpc.HJDNPPOCILK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HJDNPPOCILK.newBuilder()
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
      lggibhkhehp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HJDNPPOCILK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJDNPPOCILK getDefaultInstanceForType() {
      return POGOProtos.Rpc.HJDNPPOCILK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJDNPPOCILK build() {
      POGOProtos.Rpc.HJDNPPOCILK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HJDNPPOCILK buildPartial() {
      POGOProtos.Rpc.HJDNPPOCILK result = new POGOProtos.Rpc.HJDNPPOCILK(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lggibhkhehp_ = java.util.Collections.unmodifiableList(lggibhkhehp_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lggibhkhehp_ = lggibhkhehp_;
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
      if (other instanceof POGOProtos.Rpc.HJDNPPOCILK) {
        return mergeFrom((POGOProtos.Rpc.HJDNPPOCILK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HJDNPPOCILK other) {
      if (other == POGOProtos.Rpc.HJDNPPOCILK.getDefaultInstance()) return this;
      if (!other.lggibhkhehp_.isEmpty()) {
        if (lggibhkhehp_.isEmpty()) {
          lggibhkhehp_ = other.lggibhkhehp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLggibhkhehpIsMutable();
          lggibhkhehp_.addAll(other.lggibhkhehp_);
        }
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
      POGOProtos.Rpc.HJDNPPOCILK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HJDNPPOCILK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> lggibhkhehp_ =
      java.util.Collections.emptyList();
    private void ensureLggibhkhehpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lggibhkhehp_ = new java.util.ArrayList<java.lang.Integer>(lggibhkhehp_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @return A list containing the lggibhkhehp.
     */
    public java.util.List<POGOProtos.Rpc.MPCKBLJLBID> getLggibhkhehpList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.MPCKBLJLBID>(lggibhkhehp_, lggibhkhehp_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @return The count of lggibhkhehp.
     */
    public int getLggibhkhehpCount() {
      return lggibhkhehp_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param index The index of the element to return.
     * @return The lggibhkhehp at the given index.
     */
    public POGOProtos.Rpc.MPCKBLJLBID getLggibhkhehp(int index) {
      return lggibhkhehp_converter_.convert(lggibhkhehp_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param index The index to set the value at.
     * @param value The lggibhkhehp to set.
     * @return This builder for chaining.
     */
    public Builder setLggibhkhehp(
        int index, POGOProtos.Rpc.MPCKBLJLBID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLggibhkhehpIsMutable();
      lggibhkhehp_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param value The lggibhkhehp to add.
     * @return This builder for chaining.
     */
    public Builder addLggibhkhehp(POGOProtos.Rpc.MPCKBLJLBID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLggibhkhehpIsMutable();
      lggibhkhehp_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param values The lggibhkhehp to add.
     * @return This builder for chaining.
     */
    public Builder addAllLggibhkhehp(
        java.lang.Iterable<? extends POGOProtos.Rpc.MPCKBLJLBID> values) {
      ensureLggibhkhehpIsMutable();
      for (POGOProtos.Rpc.MPCKBLJLBID value : values) {
        lggibhkhehp_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLggibhkhehp() {
      lggibhkhehp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @return A list containing the enum numeric values on the wire for lggibhkhehp.
     */
    public java.util.List<java.lang.Integer>
    getLggibhkhehpValueList() {
      return java.util.Collections.unmodifiableList(lggibhkhehp_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of lggibhkhehp at the given index.
     */
    public int getLggibhkhehpValue(int index) {
      return lggibhkhehp_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of lggibhkhehp at the given index.
     * @return This builder for chaining.
     */
    public Builder setLggibhkhehpValue(
        int index, int value) {
      ensureLggibhkhehpIsMutable();
      lggibhkhehp_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param value The enum numeric value on the wire for lggibhkhehp to add.
     * @return This builder for chaining.
     */
    public Builder addLggibhkhehpValue(int value) {
      ensureLggibhkhehpIsMutable();
      lggibhkhehp_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MPCKBLJLBID lggibhkhehp = 1;</code>
     * @param values The enum numeric values on the wire for lggibhkhehp to add.
     * @return This builder for chaining.
     */
    public Builder addAllLggibhkhehpValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureLggibhkhehpIsMutable();
      for (int value : values) {
        lggibhkhehp_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HJDNPPOCILK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HJDNPPOCILK)
  private static final POGOProtos.Rpc.HJDNPPOCILK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HJDNPPOCILK();
  }

  public static POGOProtos.Rpc.HJDNPPOCILK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HJDNPPOCILK>
      PARSER = new com.google.protobuf.AbstractParser<HJDNPPOCILK>() {
    @java.lang.Override
    public HJDNPPOCILK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HJDNPPOCILK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HJDNPPOCILK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HJDNPPOCILK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HJDNPPOCILK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

