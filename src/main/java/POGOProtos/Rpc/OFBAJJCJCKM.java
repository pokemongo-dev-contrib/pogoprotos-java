// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OFBAJJCJCKM}
 */
public  final class OFBAJJCJCKM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OFBAJJCJCKM)
    OFBAJJCJCKMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OFBAJJCJCKM.newBuilder() to construct.
  private OFBAJJCJCKM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OFBAJJCJCKM() {
    clidjgeobcf_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OFBAJJCJCKM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OFBAJJCJCKM(
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
              clidjgeobcf_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            clidjgeobcf_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                clidjgeobcf_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              clidjgeobcf_.add(rawValue);
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
        clidjgeobcf_ = java.util.Collections.unmodifiableList(clidjgeobcf_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFBAJJCJCKM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFBAJJCJCKM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OFBAJJCJCKM.class, POGOProtos.Rpc.OFBAJJCJCKM.Builder.class);
  }

  public static final int CLIDJGEOBCF_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> clidjgeobcf_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP> clidjgeobcf_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP>() {
            public POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP result = POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP.valueOf(from);
              return result == null ? POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
   * @return A list containing the clidjgeobcf.
   */
  public java.util.List<POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP> getClidjgeobcfList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP>(clidjgeobcf_, clidjgeobcf_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
   * @return The count of clidjgeobcf.
   */
  public int getClidjgeobcfCount() {
    return clidjgeobcf_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
   * @param index The index of the element to return.
   * @return The clidjgeobcf at the given index.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP getClidjgeobcf(int index) {
    return clidjgeobcf_converter_.convert(clidjgeobcf_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
   * @return A list containing the enum numeric values on the wire for clidjgeobcf.
   */
  public java.util.List<java.lang.Integer>
  getClidjgeobcfValueList() {
    return clidjgeobcf_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of clidjgeobcf at the given index.
   */
  public int getClidjgeobcfValue(int index) {
    return clidjgeobcf_.get(index);
  }
  private int clidjgeobcfMemoizedSerializedSize;

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
    if (getClidjgeobcfList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(clidjgeobcfMemoizedSerializedSize);
    }
    for (int i = 0; i < clidjgeobcf_.size(); i++) {
      output.writeEnumNoTag(clidjgeobcf_.get(i));
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
      for (int i = 0; i < clidjgeobcf_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(clidjgeobcf_.get(i));
      }
      size += dataSize;
      if (!getClidjgeobcfList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }clidjgeobcfMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.OFBAJJCJCKM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OFBAJJCJCKM other = (POGOProtos.Rpc.OFBAJJCJCKM) obj;

    if (!clidjgeobcf_.equals(other.clidjgeobcf_)) return false;
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
    if (getClidjgeobcfCount() > 0) {
      hash = (37 * hash) + CLIDJGEOBCF_FIELD_NUMBER;
      hash = (53 * hash) + clidjgeobcf_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OFBAJJCJCKM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OFBAJJCJCKM prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OFBAJJCJCKM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OFBAJJCJCKM)
      POGOProtos.Rpc.OFBAJJCJCKMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFBAJJCJCKM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFBAJJCJCKM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OFBAJJCJCKM.class, POGOProtos.Rpc.OFBAJJCJCKM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OFBAJJCJCKM.newBuilder()
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
      clidjgeobcf_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OFBAJJCJCKM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFBAJJCJCKM getDefaultInstanceForType() {
      return POGOProtos.Rpc.OFBAJJCJCKM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFBAJJCJCKM build() {
      POGOProtos.Rpc.OFBAJJCJCKM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OFBAJJCJCKM buildPartial() {
      POGOProtos.Rpc.OFBAJJCJCKM result = new POGOProtos.Rpc.OFBAJJCJCKM(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        clidjgeobcf_ = java.util.Collections.unmodifiableList(clidjgeobcf_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.clidjgeobcf_ = clidjgeobcf_;
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
      if (other instanceof POGOProtos.Rpc.OFBAJJCJCKM) {
        return mergeFrom((POGOProtos.Rpc.OFBAJJCJCKM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OFBAJJCJCKM other) {
      if (other == POGOProtos.Rpc.OFBAJJCJCKM.getDefaultInstance()) return this;
      if (!other.clidjgeobcf_.isEmpty()) {
        if (clidjgeobcf_.isEmpty()) {
          clidjgeobcf_ = other.clidjgeobcf_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureClidjgeobcfIsMutable();
          clidjgeobcf_.addAll(other.clidjgeobcf_);
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
      POGOProtos.Rpc.OFBAJJCJCKM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OFBAJJCJCKM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> clidjgeobcf_ =
      java.util.Collections.emptyList();
    private void ensureClidjgeobcfIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clidjgeobcf_ = new java.util.ArrayList<java.lang.Integer>(clidjgeobcf_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @return A list containing the clidjgeobcf.
     */
    public java.util.List<POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP> getClidjgeobcfList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP>(clidjgeobcf_, clidjgeobcf_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @return The count of clidjgeobcf.
     */
    public int getClidjgeobcfCount() {
      return clidjgeobcf_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param index The index of the element to return.
     * @return The clidjgeobcf at the given index.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP getClidjgeobcf(int index) {
      return clidjgeobcf_converter_.convert(clidjgeobcf_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param index The index to set the value at.
     * @param value The clidjgeobcf to set.
     * @return This builder for chaining.
     */
    public Builder setClidjgeobcf(
        int index, POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureClidjgeobcfIsMutable();
      clidjgeobcf_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param value The clidjgeobcf to add.
     * @return This builder for chaining.
     */
    public Builder addClidjgeobcf(POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureClidjgeobcfIsMutable();
      clidjgeobcf_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param values The clidjgeobcf to add.
     * @return This builder for chaining.
     */
    public Builder addAllClidjgeobcf(
        java.lang.Iterable<? extends POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP> values) {
      ensureClidjgeobcfIsMutable();
      for (POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP value : values) {
        clidjgeobcf_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClidjgeobcf() {
      clidjgeobcf_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @return A list containing the enum numeric values on the wire for clidjgeobcf.
     */
    public java.util.List<java.lang.Integer>
    getClidjgeobcfValueList() {
      return java.util.Collections.unmodifiableList(clidjgeobcf_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of clidjgeobcf at the given index.
     */
    public int getClidjgeobcfValue(int index) {
      return clidjgeobcf_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of clidjgeobcf at the given index.
     * @return This builder for chaining.
     */
    public Builder setClidjgeobcfValue(
        int index, int value) {
      ensureClidjgeobcfIsMutable();
      clidjgeobcf_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param value The enum numeric value on the wire for clidjgeobcf to add.
     * @return This builder for chaining.
     */
    public Builder addClidjgeobcfValue(int value) {
      ensureClidjgeobcfIsMutable();
      clidjgeobcf_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FFGIEEPEOPM.CJLOMLDKBDP clidjgeobcf = 1;</code>
     * @param values The enum numeric values on the wire for clidjgeobcf to add.
     * @return This builder for chaining.
     */
    public Builder addAllClidjgeobcfValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureClidjgeobcfIsMutable();
      for (int value : values) {
        clidjgeobcf_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OFBAJJCJCKM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OFBAJJCJCKM)
  private static final POGOProtos.Rpc.OFBAJJCJCKM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OFBAJJCJCKM();
  }

  public static POGOProtos.Rpc.OFBAJJCJCKM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OFBAJJCJCKM>
      PARSER = new com.google.protobuf.AbstractParser<OFBAJJCJCKM>() {
    @java.lang.Override
    public OFBAJJCJCKM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OFBAJJCJCKM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OFBAJJCJCKM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OFBAJJCJCKM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OFBAJJCJCKM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

