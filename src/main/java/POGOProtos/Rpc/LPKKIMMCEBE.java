// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LPKKIMMCEBE}
 */
public  final class LPKKIMMCEBE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LPKKIMMCEBE)
    LPKKIMMCEBEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LPKKIMMCEBE.newBuilder() to construct.
  private LPKKIMMCEBE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LPKKIMMCEBE() {
    fpjoohefcdn_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LPKKIMMCEBE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LPKKIMMCEBE(
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
              fpjoohefcdn_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            fpjoohefcdn_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fpjoohefcdn_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              fpjoohefcdn_.add(rawValue);
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
        fpjoohefcdn_ = java.util.Collections.unmodifiableList(fpjoohefcdn_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LPKKIMMCEBE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LPKKIMMCEBE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LPKKIMMCEBE.class, POGOProtos.Rpc.LPKKIMMCEBE.Builder.class);
  }

  public static final int FPJOOHEFCDN_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> fpjoohefcdn_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD> fpjoohefcdn_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>() {
            public POGOProtos.Rpc.DABLMJBNPBD convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(from);
              return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
   * @return A list containing the fpjoohefcdn.
   */
  public java.util.List<POGOProtos.Rpc.DABLMJBNPBD> getFpjoohefcdnList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>(fpjoohefcdn_, fpjoohefcdn_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
   * @return The count of fpjoohefcdn.
   */
  public int getFpjoohefcdnCount() {
    return fpjoohefcdn_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
   * @param index The index of the element to return.
   * @return The fpjoohefcdn at the given index.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getFpjoohefcdn(int index) {
    return fpjoohefcdn_converter_.convert(fpjoohefcdn_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
   * @return A list containing the enum numeric values on the wire for fpjoohefcdn.
   */
  public java.util.List<java.lang.Integer>
  getFpjoohefcdnValueList() {
    return fpjoohefcdn_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fpjoohefcdn at the given index.
   */
  public int getFpjoohefcdnValue(int index) {
    return fpjoohefcdn_.get(index);
  }
  private int fpjoohefcdnMemoizedSerializedSize;

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
    if (getFpjoohefcdnList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(fpjoohefcdnMemoizedSerializedSize);
    }
    for (int i = 0; i < fpjoohefcdn_.size(); i++) {
      output.writeEnumNoTag(fpjoohefcdn_.get(i));
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
      for (int i = 0; i < fpjoohefcdn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(fpjoohefcdn_.get(i));
      }
      size += dataSize;
      if (!getFpjoohefcdnList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }fpjoohefcdnMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.LPKKIMMCEBE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LPKKIMMCEBE other = (POGOProtos.Rpc.LPKKIMMCEBE) obj;

    if (!fpjoohefcdn_.equals(other.fpjoohefcdn_)) return false;
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
    if (getFpjoohefcdnCount() > 0) {
      hash = (37 * hash) + FPJOOHEFCDN_FIELD_NUMBER;
      hash = (53 * hash) + fpjoohefcdn_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LPKKIMMCEBE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LPKKIMMCEBE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LPKKIMMCEBE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LPKKIMMCEBE)
      POGOProtos.Rpc.LPKKIMMCEBEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LPKKIMMCEBE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LPKKIMMCEBE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LPKKIMMCEBE.class, POGOProtos.Rpc.LPKKIMMCEBE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LPKKIMMCEBE.newBuilder()
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
      fpjoohefcdn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LPKKIMMCEBE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LPKKIMMCEBE getDefaultInstanceForType() {
      return POGOProtos.Rpc.LPKKIMMCEBE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LPKKIMMCEBE build() {
      POGOProtos.Rpc.LPKKIMMCEBE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LPKKIMMCEBE buildPartial() {
      POGOProtos.Rpc.LPKKIMMCEBE result = new POGOProtos.Rpc.LPKKIMMCEBE(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fpjoohefcdn_ = java.util.Collections.unmodifiableList(fpjoohefcdn_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fpjoohefcdn_ = fpjoohefcdn_;
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
      if (other instanceof POGOProtos.Rpc.LPKKIMMCEBE) {
        return mergeFrom((POGOProtos.Rpc.LPKKIMMCEBE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LPKKIMMCEBE other) {
      if (other == POGOProtos.Rpc.LPKKIMMCEBE.getDefaultInstance()) return this;
      if (!other.fpjoohefcdn_.isEmpty()) {
        if (fpjoohefcdn_.isEmpty()) {
          fpjoohefcdn_ = other.fpjoohefcdn_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFpjoohefcdnIsMutable();
          fpjoohefcdn_.addAll(other.fpjoohefcdn_);
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
      POGOProtos.Rpc.LPKKIMMCEBE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LPKKIMMCEBE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> fpjoohefcdn_ =
      java.util.Collections.emptyList();
    private void ensureFpjoohefcdnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fpjoohefcdn_ = new java.util.ArrayList<java.lang.Integer>(fpjoohefcdn_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @return A list containing the fpjoohefcdn.
     */
    public java.util.List<POGOProtos.Rpc.DABLMJBNPBD> getFpjoohefcdnList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>(fpjoohefcdn_, fpjoohefcdn_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @return The count of fpjoohefcdn.
     */
    public int getFpjoohefcdnCount() {
      return fpjoohefcdn_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param index The index of the element to return.
     * @return The fpjoohefcdn at the given index.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getFpjoohefcdn(int index) {
      return fpjoohefcdn_converter_.convert(fpjoohefcdn_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param index The index to set the value at.
     * @param value The fpjoohefcdn to set.
     * @return This builder for chaining.
     */
    public Builder setFpjoohefcdn(
        int index, POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFpjoohefcdnIsMutable();
      fpjoohefcdn_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param value The fpjoohefcdn to add.
     * @return This builder for chaining.
     */
    public Builder addFpjoohefcdn(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFpjoohefcdnIsMutable();
      fpjoohefcdn_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param values The fpjoohefcdn to add.
     * @return This builder for chaining.
     */
    public Builder addAllFpjoohefcdn(
        java.lang.Iterable<? extends POGOProtos.Rpc.DABLMJBNPBD> values) {
      ensureFpjoohefcdnIsMutable();
      for (POGOProtos.Rpc.DABLMJBNPBD value : values) {
        fpjoohefcdn_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpjoohefcdn() {
      fpjoohefcdn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @return A list containing the enum numeric values on the wire for fpjoohefcdn.
     */
    public java.util.List<java.lang.Integer>
    getFpjoohefcdnValueList() {
      return java.util.Collections.unmodifiableList(fpjoohefcdn_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fpjoohefcdn at the given index.
     */
    public int getFpjoohefcdnValue(int index) {
      return fpjoohefcdn_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fpjoohefcdn at the given index.
     * @return This builder for chaining.
     */
    public Builder setFpjoohefcdnValue(
        int index, int value) {
      ensureFpjoohefcdnIsMutable();
      fpjoohefcdn_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param value The enum numeric value on the wire for fpjoohefcdn to add.
     * @return This builder for chaining.
     */
    public Builder addFpjoohefcdnValue(int value) {
      ensureFpjoohefcdnIsMutable();
      fpjoohefcdn_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fpjoohefcdn = 1;</code>
     * @param values The enum numeric values on the wire for fpjoohefcdn to add.
     * @return This builder for chaining.
     */
    public Builder addAllFpjoohefcdnValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureFpjoohefcdnIsMutable();
      for (int value : values) {
        fpjoohefcdn_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LPKKIMMCEBE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LPKKIMMCEBE)
  private static final POGOProtos.Rpc.LPKKIMMCEBE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LPKKIMMCEBE();
  }

  public static POGOProtos.Rpc.LPKKIMMCEBE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LPKKIMMCEBE>
      PARSER = new com.google.protobuf.AbstractParser<LPKKIMMCEBE>() {
    @java.lang.Override
    public LPKKIMMCEBE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LPKKIMMCEBE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LPKKIMMCEBE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LPKKIMMCEBE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LPKKIMMCEBE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

