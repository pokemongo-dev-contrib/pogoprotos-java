// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HHLLPHMBLJO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HHLLPHMBLJO}
 */
public final class HHLLPHMBLJO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HHLLPHMBLJO)
    HHLLPHMBLJOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HHLLPHMBLJO.newBuilder() to construct.
  private HHLLPHMBLJO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HHLLPHMBLJO() {
    ldemlflkihp_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HHLLPHMBLJO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HHLLPHMBLJO(
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
              ldemlflkihp_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            ldemlflkihp_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ldemlflkihp_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              ldemlflkihp_.add(rawValue);
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
        ldemlflkihp_ = java.util.Collections.unmodifiableList(ldemlflkihp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HHLLPHMBLJO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HHLLPHMBLJO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HHLLPHMBLJO.class, POGOProtos.Rpc.HHLLPHMBLJO.Builder.class);
  }

  public static final int LDEMLFLKIHP_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> ldemlflkihp_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.MLONBICIPGE> ldemlflkihp_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.MLONBICIPGE>() {
            public POGOProtos.Rpc.MLONBICIPGE convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.MLONBICIPGE result = POGOProtos.Rpc.MLONBICIPGE.valueOf(from);
              return result == null ? POGOProtos.Rpc.MLONBICIPGE.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
   * @return A list containing the ldemlflkihp.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.MLONBICIPGE> getLdemlflkihpList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.MLONBICIPGE>(ldemlflkihp_, ldemlflkihp_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
   * @return The count of ldemlflkihp.
   */
  @java.lang.Override
  public int getLdemlflkihpCount() {
    return ldemlflkihp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
   * @param index The index of the element to return.
   * @return The ldemlflkihp at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLONBICIPGE getLdemlflkihp(int index) {
    return ldemlflkihp_converter_.convert(ldemlflkihp_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
   * @return A list containing the enum numeric values on the wire for ldemlflkihp.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getLdemlflkihpValueList() {
    return ldemlflkihp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ldemlflkihp at the given index.
   */
  @java.lang.Override
  public int getLdemlflkihpValue(int index) {
    return ldemlflkihp_.get(index);
  }
  private int ldemlflkihpMemoizedSerializedSize;

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
    if (getLdemlflkihpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(ldemlflkihpMemoizedSerializedSize);
    }
    for (int i = 0; i < ldemlflkihp_.size(); i++) {
      output.writeEnumNoTag(ldemlflkihp_.get(i));
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
      for (int i = 0; i < ldemlflkihp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(ldemlflkihp_.get(i));
      }
      size += dataSize;
      if (!getLdemlflkihpList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }ldemlflkihpMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.HHLLPHMBLJO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HHLLPHMBLJO other = (POGOProtos.Rpc.HHLLPHMBLJO) obj;

    if (!ldemlflkihp_.equals(other.ldemlflkihp_)) return false;
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
    if (getLdemlflkihpCount() > 0) {
      hash = (37 * hash) + LDEMLFLKIHP_FIELD_NUMBER;
      hash = (53 * hash) + ldemlflkihp_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HHLLPHMBLJO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HHLLPHMBLJO prototype) {
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
   * ref: HHLLPHMBLJO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HHLLPHMBLJO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HHLLPHMBLJO)
      POGOProtos.Rpc.HHLLPHMBLJOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HHLLPHMBLJO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HHLLPHMBLJO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HHLLPHMBLJO.class, POGOProtos.Rpc.HHLLPHMBLJO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HHLLPHMBLJO.newBuilder()
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
      ldemlflkihp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HHLLPHMBLJO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HHLLPHMBLJO getDefaultInstanceForType() {
      return POGOProtos.Rpc.HHLLPHMBLJO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HHLLPHMBLJO build() {
      POGOProtos.Rpc.HHLLPHMBLJO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HHLLPHMBLJO buildPartial() {
      POGOProtos.Rpc.HHLLPHMBLJO result = new POGOProtos.Rpc.HHLLPHMBLJO(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ldemlflkihp_ = java.util.Collections.unmodifiableList(ldemlflkihp_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ldemlflkihp_ = ldemlflkihp_;
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
      if (other instanceof POGOProtos.Rpc.HHLLPHMBLJO) {
        return mergeFrom((POGOProtos.Rpc.HHLLPHMBLJO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HHLLPHMBLJO other) {
      if (other == POGOProtos.Rpc.HHLLPHMBLJO.getDefaultInstance()) return this;
      if (!other.ldemlflkihp_.isEmpty()) {
        if (ldemlflkihp_.isEmpty()) {
          ldemlflkihp_ = other.ldemlflkihp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLdemlflkihpIsMutable();
          ldemlflkihp_.addAll(other.ldemlflkihp_);
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
      POGOProtos.Rpc.HHLLPHMBLJO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HHLLPHMBLJO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> ldemlflkihp_ =
      java.util.Collections.emptyList();
    private void ensureLdemlflkihpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ldemlflkihp_ = new java.util.ArrayList<java.lang.Integer>(ldemlflkihp_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @return A list containing the ldemlflkihp.
     */
    public java.util.List<POGOProtos.Rpc.MLONBICIPGE> getLdemlflkihpList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.MLONBICIPGE>(ldemlflkihp_, ldemlflkihp_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @return The count of ldemlflkihp.
     */
    public int getLdemlflkihpCount() {
      return ldemlflkihp_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param index The index of the element to return.
     * @return The ldemlflkihp at the given index.
     */
    public POGOProtos.Rpc.MLONBICIPGE getLdemlflkihp(int index) {
      return ldemlflkihp_converter_.convert(ldemlflkihp_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param index The index to set the value at.
     * @param value The ldemlflkihp to set.
     * @return This builder for chaining.
     */
    public Builder setLdemlflkihp(
        int index, POGOProtos.Rpc.MLONBICIPGE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLdemlflkihpIsMutable();
      ldemlflkihp_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param value The ldemlflkihp to add.
     * @return This builder for chaining.
     */
    public Builder addLdemlflkihp(POGOProtos.Rpc.MLONBICIPGE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLdemlflkihpIsMutable();
      ldemlflkihp_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param values The ldemlflkihp to add.
     * @return This builder for chaining.
     */
    public Builder addAllLdemlflkihp(
        java.lang.Iterable<? extends POGOProtos.Rpc.MLONBICIPGE> values) {
      ensureLdemlflkihpIsMutable();
      for (POGOProtos.Rpc.MLONBICIPGE value : values) {
        ldemlflkihp_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLdemlflkihp() {
      ldemlflkihp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @return A list containing the enum numeric values on the wire for ldemlflkihp.
     */
    public java.util.List<java.lang.Integer>
    getLdemlflkihpValueList() {
      return java.util.Collections.unmodifiableList(ldemlflkihp_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of ldemlflkihp at the given index.
     */
    public int getLdemlflkihpValue(int index) {
      return ldemlflkihp_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of ldemlflkihp at the given index.
     * @return This builder for chaining.
     */
    public Builder setLdemlflkihpValue(
        int index, int value) {
      ensureLdemlflkihpIsMutable();
      ldemlflkihp_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param value The enum numeric value on the wire for ldemlflkihp to add.
     * @return This builder for chaining.
     */
    public Builder addLdemlflkihpValue(int value) {
      ensureLdemlflkihpIsMutable();
      ldemlflkihp_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MLONBICIPGE ldemlflkihp = 1;</code>
     * @param values The enum numeric values on the wire for ldemlflkihp to add.
     * @return This builder for chaining.
     */
    public Builder addAllLdemlflkihpValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureLdemlflkihpIsMutable();
      for (int value : values) {
        ldemlflkihp_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HHLLPHMBLJO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HHLLPHMBLJO)
  private static final POGOProtos.Rpc.HHLLPHMBLJO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HHLLPHMBLJO();
  }

  public static POGOProtos.Rpc.HHLLPHMBLJO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HHLLPHMBLJO>
      PARSER = new com.google.protobuf.AbstractParser<HHLLPHMBLJO>() {
    @java.lang.Override
    public HHLLPHMBLJO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HHLLPHMBLJO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HHLLPHMBLJO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HHLLPHMBLJO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HHLLPHMBLJO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

