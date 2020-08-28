// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LNACFEHFLOI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LNACFEHFLOI}
 */
public final class LNACFEHFLOI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LNACFEHFLOI)
    LNACFEHFLOIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LNACFEHFLOI.newBuilder() to construct.
  private LNACFEHFLOI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LNACFEHFLOI() {
    edjmigajjka_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LNACFEHFLOI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LNACFEHFLOI(
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
              edjmigajjka_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            edjmigajjka_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                edjmigajjka_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              edjmigajjka_.add(rawValue);
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
        edjmigajjka_ = java.util.Collections.unmodifiableList(edjmigajjka_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNACFEHFLOI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNACFEHFLOI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LNACFEHFLOI.class, POGOProtos.Rpc.LNACFEHFLOI.Builder.class);
  }

  public static final int EDJMIGAJJKA_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> edjmigajjka_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.DPIFOJNKKOK> edjmigajjka_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.DPIFOJNKKOK>() {
            public POGOProtos.Rpc.DPIFOJNKKOK convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.DPIFOJNKKOK result = POGOProtos.Rpc.DPIFOJNKKOK.valueOf(from);
              return result == null ? POGOProtos.Rpc.DPIFOJNKKOK.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
   * @return A list containing the edjmigajjka.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.DPIFOJNKKOK> getEdjmigajjkaList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.DPIFOJNKKOK>(edjmigajjka_, edjmigajjka_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
   * @return The count of edjmigajjka.
   */
  @java.lang.Override
  public int getEdjmigajjkaCount() {
    return edjmigajjka_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
   * @param index The index of the element to return.
   * @return The edjmigajjka at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.DPIFOJNKKOK getEdjmigajjka(int index) {
    return edjmigajjka_converter_.convert(edjmigajjka_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
   * @return A list containing the enum numeric values on the wire for edjmigajjka.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getEdjmigajjkaValueList() {
    return edjmigajjka_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of edjmigajjka at the given index.
   */
  @java.lang.Override
  public int getEdjmigajjkaValue(int index) {
    return edjmigajjka_.get(index);
  }
  private int edjmigajjkaMemoizedSerializedSize;

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
    if (getEdjmigajjkaList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(edjmigajjkaMemoizedSerializedSize);
    }
    for (int i = 0; i < edjmigajjka_.size(); i++) {
      output.writeEnumNoTag(edjmigajjka_.get(i));
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
      for (int i = 0; i < edjmigajjka_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(edjmigajjka_.get(i));
      }
      size += dataSize;
      if (!getEdjmigajjkaList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }edjmigajjkaMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.LNACFEHFLOI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LNACFEHFLOI other = (POGOProtos.Rpc.LNACFEHFLOI) obj;

    if (!edjmigajjka_.equals(other.edjmigajjka_)) return false;
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
    if (getEdjmigajjkaCount() > 0) {
      hash = (37 * hash) + EDJMIGAJJKA_FIELD_NUMBER;
      hash = (53 * hash) + edjmigajjka_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNACFEHFLOI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LNACFEHFLOI prototype) {
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
   * ref: LNACFEHFLOI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LNACFEHFLOI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LNACFEHFLOI)
      POGOProtos.Rpc.LNACFEHFLOIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNACFEHFLOI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNACFEHFLOI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LNACFEHFLOI.class, POGOProtos.Rpc.LNACFEHFLOI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LNACFEHFLOI.newBuilder()
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
      edjmigajjka_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNACFEHFLOI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNACFEHFLOI getDefaultInstanceForType() {
      return POGOProtos.Rpc.LNACFEHFLOI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNACFEHFLOI build() {
      POGOProtos.Rpc.LNACFEHFLOI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNACFEHFLOI buildPartial() {
      POGOProtos.Rpc.LNACFEHFLOI result = new POGOProtos.Rpc.LNACFEHFLOI(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        edjmigajjka_ = java.util.Collections.unmodifiableList(edjmigajjka_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.edjmigajjka_ = edjmigajjka_;
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
      if (other instanceof POGOProtos.Rpc.LNACFEHFLOI) {
        return mergeFrom((POGOProtos.Rpc.LNACFEHFLOI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LNACFEHFLOI other) {
      if (other == POGOProtos.Rpc.LNACFEHFLOI.getDefaultInstance()) return this;
      if (!other.edjmigajjka_.isEmpty()) {
        if (edjmigajjka_.isEmpty()) {
          edjmigajjka_ = other.edjmigajjka_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEdjmigajjkaIsMutable();
          edjmigajjka_.addAll(other.edjmigajjka_);
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
      POGOProtos.Rpc.LNACFEHFLOI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LNACFEHFLOI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> edjmigajjka_ =
      java.util.Collections.emptyList();
    private void ensureEdjmigajjkaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        edjmigajjka_ = new java.util.ArrayList<java.lang.Integer>(edjmigajjka_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @return A list containing the edjmigajjka.
     */
    public java.util.List<POGOProtos.Rpc.DPIFOJNKKOK> getEdjmigajjkaList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.DPIFOJNKKOK>(edjmigajjka_, edjmigajjka_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @return The count of edjmigajjka.
     */
    public int getEdjmigajjkaCount() {
      return edjmigajjka_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param index The index of the element to return.
     * @return The edjmigajjka at the given index.
     */
    public POGOProtos.Rpc.DPIFOJNKKOK getEdjmigajjka(int index) {
      return edjmigajjka_converter_.convert(edjmigajjka_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param index The index to set the value at.
     * @param value The edjmigajjka to set.
     * @return This builder for chaining.
     */
    public Builder setEdjmigajjka(
        int index, POGOProtos.Rpc.DPIFOJNKKOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEdjmigajjkaIsMutable();
      edjmigajjka_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param value The edjmigajjka to add.
     * @return This builder for chaining.
     */
    public Builder addEdjmigajjka(POGOProtos.Rpc.DPIFOJNKKOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEdjmigajjkaIsMutable();
      edjmigajjka_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param values The edjmigajjka to add.
     * @return This builder for chaining.
     */
    public Builder addAllEdjmigajjka(
        java.lang.Iterable<? extends POGOProtos.Rpc.DPIFOJNKKOK> values) {
      ensureEdjmigajjkaIsMutable();
      for (POGOProtos.Rpc.DPIFOJNKKOK value : values) {
        edjmigajjka_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEdjmigajjka() {
      edjmigajjka_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @return A list containing the enum numeric values on the wire for edjmigajjka.
     */
    public java.util.List<java.lang.Integer>
    getEdjmigajjkaValueList() {
      return java.util.Collections.unmodifiableList(edjmigajjka_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of edjmigajjka at the given index.
     */
    public int getEdjmigajjkaValue(int index) {
      return edjmigajjka_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of edjmigajjka at the given index.
     * @return This builder for chaining.
     */
    public Builder setEdjmigajjkaValue(
        int index, int value) {
      ensureEdjmigajjkaIsMutable();
      edjmigajjka_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param value The enum numeric value on the wire for edjmigajjka to add.
     * @return This builder for chaining.
     */
    public Builder addEdjmigajjkaValue(int value) {
      ensureEdjmigajjkaIsMutable();
      edjmigajjka_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPIFOJNKKOK edjmigajjka = 1;</code>
     * @param values The enum numeric values on the wire for edjmigajjka to add.
     * @return This builder for chaining.
     */
    public Builder addAllEdjmigajjkaValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureEdjmigajjkaIsMutable();
      for (int value : values) {
        edjmigajjka_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LNACFEHFLOI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LNACFEHFLOI)
  private static final POGOProtos.Rpc.LNACFEHFLOI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LNACFEHFLOI();
  }

  public static POGOProtos.Rpc.LNACFEHFLOI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LNACFEHFLOI>
      PARSER = new com.google.protobuf.AbstractParser<LNACFEHFLOI>() {
    @java.lang.Override
    public LNACFEHFLOI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LNACFEHFLOI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LNACFEHFLOI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LNACFEHFLOI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LNACFEHFLOI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

