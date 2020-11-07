// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WithPokemonAlignmentProto}
 */
public final class WithPokemonAlignmentProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithPokemonAlignmentProto)
    WithPokemonAlignmentProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithPokemonAlignmentProto.newBuilder() to construct.
  private WithPokemonAlignmentProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithPokemonAlignmentProto() {
    alignment_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithPokemonAlignmentProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithPokemonAlignmentProto(
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
              alignment_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            alignment_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                alignment_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              alignment_.add(rawValue);
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
        alignment_ = java.util.Collections.unmodifiableList(alignment_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithPokemonAlignmentProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithPokemonAlignmentProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithPokemonAlignmentProto.class, POGOProtos.Rpc.WithPokemonAlignmentProto.Builder.class);
  }

  public static final int ALIGNMENT_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> alignment_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.PokemonDisplayProto.Alignment> alignment_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.PokemonDisplayProto.Alignment>() {
            public POGOProtos.Rpc.PokemonDisplayProto.Alignment convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.PokemonDisplayProto.Alignment result = POGOProtos.Rpc.PokemonDisplayProto.Alignment.valueOf(from);
              return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Alignment.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
   * @return A list containing the alignment.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Alignment> getAlignmentList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.PokemonDisplayProto.Alignment>(alignment_, alignment_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
   * @return The count of alignment.
   */
  @java.lang.Override
  public int getAlignmentCount() {
    return alignment_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
   * @param index The index of the element to return.
   * @return The alignment at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto.Alignment getAlignment(int index) {
    return alignment_converter_.convert(alignment_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
   * @return A list containing the enum numeric values on the wire for alignment.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAlignmentValueList() {
    return alignment_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of alignment at the given index.
   */
  @java.lang.Override
  public int getAlignmentValue(int index) {
    return alignment_.get(index);
  }
  private int alignmentMemoizedSerializedSize;

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
    if (getAlignmentList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(alignmentMemoizedSerializedSize);
    }
    for (int i = 0; i < alignment_.size(); i++) {
      output.writeEnumNoTag(alignment_.get(i));
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
      for (int i = 0; i < alignment_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(alignment_.get(i));
      }
      size += dataSize;
      if (!getAlignmentList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }alignmentMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.WithPokemonAlignmentProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithPokemonAlignmentProto other = (POGOProtos.Rpc.WithPokemonAlignmentProto) obj;

    if (!alignment_.equals(other.alignment_)) return false;
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
    if (getAlignmentCount() > 0) {
      hash = (37 * hash) + ALIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + alignment_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithPokemonAlignmentProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithPokemonAlignmentProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WithPokemonAlignmentProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithPokemonAlignmentProto)
      POGOProtos.Rpc.WithPokemonAlignmentProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithPokemonAlignmentProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithPokemonAlignmentProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithPokemonAlignmentProto.class, POGOProtos.Rpc.WithPokemonAlignmentProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithPokemonAlignmentProto.newBuilder()
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
      alignment_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithPokemonAlignmentProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithPokemonAlignmentProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithPokemonAlignmentProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithPokemonAlignmentProto build() {
      POGOProtos.Rpc.WithPokemonAlignmentProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithPokemonAlignmentProto buildPartial() {
      POGOProtos.Rpc.WithPokemonAlignmentProto result = new POGOProtos.Rpc.WithPokemonAlignmentProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        alignment_ = java.util.Collections.unmodifiableList(alignment_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.alignment_ = alignment_;
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
      if (other instanceof POGOProtos.Rpc.WithPokemonAlignmentProto) {
        return mergeFrom((POGOProtos.Rpc.WithPokemonAlignmentProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithPokemonAlignmentProto other) {
      if (other == POGOProtos.Rpc.WithPokemonAlignmentProto.getDefaultInstance()) return this;
      if (!other.alignment_.isEmpty()) {
        if (alignment_.isEmpty()) {
          alignment_ = other.alignment_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAlignmentIsMutable();
          alignment_.addAll(other.alignment_);
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
      POGOProtos.Rpc.WithPokemonAlignmentProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithPokemonAlignmentProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> alignment_ =
      java.util.Collections.emptyList();
    private void ensureAlignmentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        alignment_ = new java.util.ArrayList<java.lang.Integer>(alignment_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @return A list containing the alignment.
     */
    public java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Alignment> getAlignmentList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.PokemonDisplayProto.Alignment>(alignment_, alignment_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @return The count of alignment.
     */
    public int getAlignmentCount() {
      return alignment_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param index The index of the element to return.
     * @return The alignment at the given index.
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Alignment getAlignment(int index) {
      return alignment_converter_.convert(alignment_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param index The index to set the value at.
     * @param value The alignment to set.
     * @return This builder for chaining.
     */
    public Builder setAlignment(
        int index, POGOProtos.Rpc.PokemonDisplayProto.Alignment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAlignmentIsMutable();
      alignment_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param value The alignment to add.
     * @return This builder for chaining.
     */
    public Builder addAlignment(POGOProtos.Rpc.PokemonDisplayProto.Alignment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAlignmentIsMutable();
      alignment_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param values The alignment to add.
     * @return This builder for chaining.
     */
    public Builder addAllAlignment(
        java.lang.Iterable<? extends POGOProtos.Rpc.PokemonDisplayProto.Alignment> values) {
      ensureAlignmentIsMutable();
      for (POGOProtos.Rpc.PokemonDisplayProto.Alignment value : values) {
        alignment_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlignment() {
      alignment_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @return A list containing the enum numeric values on the wire for alignment.
     */
    public java.util.List<java.lang.Integer>
    getAlignmentValueList() {
      return java.util.Collections.unmodifiableList(alignment_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of alignment at the given index.
     */
    public int getAlignmentValue(int index) {
      return alignment_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of alignment at the given index.
     * @return This builder for chaining.
     */
    public Builder setAlignmentValue(
        int index, int value) {
      ensureAlignmentIsMutable();
      alignment_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param value The enum numeric value on the wire for alignment to add.
     * @return This builder for chaining.
     */
    public Builder addAlignmentValue(int value) {
      ensureAlignmentIsMutable();
      alignment_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Alignment alignment = 1;</code>
     * @param values The enum numeric values on the wire for alignment to add.
     * @return This builder for chaining.
     */
    public Builder addAllAlignmentValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureAlignmentIsMutable();
      for (int value : values) {
        alignment_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithPokemonAlignmentProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithPokemonAlignmentProto)
  private static final POGOProtos.Rpc.WithPokemonAlignmentProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithPokemonAlignmentProto();
  }

  public static POGOProtos.Rpc.WithPokemonAlignmentProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithPokemonAlignmentProto>
      PARSER = new com.google.protobuf.AbstractParser<WithPokemonAlignmentProto>() {
    @java.lang.Override
    public WithPokemonAlignmentProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithPokemonAlignmentProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithPokemonAlignmentProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithPokemonAlignmentProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithPokemonAlignmentProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

