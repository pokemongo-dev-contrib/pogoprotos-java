// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LDMDIAOKHHH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LDMDIAOKHHH}
 */
public final class LDMDIAOKHHH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LDMDIAOKHHH)
    LDMDIAOKHHHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LDMDIAOKHHH.newBuilder() to construct.
  private LDMDIAOKHHH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LDMDIAOKHHH() {
    lfajihkepka_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LDMDIAOKHHH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LDMDIAOKHHH(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lfajihkepka_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            lfajihkepka_.add(s);
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
        lfajihkepka_ = lfajihkepka_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDMDIAOKHHH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDMDIAOKHHH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LDMDIAOKHHH.class, POGOProtos.Rpc.LDMDIAOKHHH.Builder.class);
  }

  public static final int LFAJIHKEPKA_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList lfajihkepka_;
  /**
   * <code>repeated string lfajihkepka = 1;</code>
   * @return A list containing the lfajihkepka.
   */
  public com.google.protobuf.ProtocolStringList
      getLfajihkepkaList() {
    return lfajihkepka_;
  }
  /**
   * <code>repeated string lfajihkepka = 1;</code>
   * @return The count of lfajihkepka.
   */
  public int getLfajihkepkaCount() {
    return lfajihkepka_.size();
  }
  /**
   * <code>repeated string lfajihkepka = 1;</code>
   * @param index The index of the element to return.
   * @return The lfajihkepka at the given index.
   */
  public java.lang.String getLfajihkepka(int index) {
    return lfajihkepka_.get(index);
  }
  /**
   * <code>repeated string lfajihkepka = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the lfajihkepka at the given index.
   */
  public com.google.protobuf.ByteString
      getLfajihkepkaBytes(int index) {
    return lfajihkepka_.getByteString(index);
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
    for (int i = 0; i < lfajihkepka_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lfajihkepka_.getRaw(i));
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
      for (int i = 0; i < lfajihkepka_.size(); i++) {
        dataSize += computeStringSizeNoTag(lfajihkepka_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLfajihkepkaList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.LDMDIAOKHHH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LDMDIAOKHHH other = (POGOProtos.Rpc.LDMDIAOKHHH) obj;

    if (!getLfajihkepkaList()
        .equals(other.getLfajihkepkaList())) return false;
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
    if (getLfajihkepkaCount() > 0) {
      hash = (37 * hash) + LFAJIHKEPKA_FIELD_NUMBER;
      hash = (53 * hash) + getLfajihkepkaList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDMDIAOKHHH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LDMDIAOKHHH prototype) {
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
   * ref: LDMDIAOKHHH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LDMDIAOKHHH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LDMDIAOKHHH)
      POGOProtos.Rpc.LDMDIAOKHHHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDMDIAOKHHH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDMDIAOKHHH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LDMDIAOKHHH.class, POGOProtos.Rpc.LDMDIAOKHHH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LDMDIAOKHHH.newBuilder()
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
      lfajihkepka_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDMDIAOKHHH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDMDIAOKHHH getDefaultInstanceForType() {
      return POGOProtos.Rpc.LDMDIAOKHHH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDMDIAOKHHH build() {
      POGOProtos.Rpc.LDMDIAOKHHH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDMDIAOKHHH buildPartial() {
      POGOProtos.Rpc.LDMDIAOKHHH result = new POGOProtos.Rpc.LDMDIAOKHHH(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lfajihkepka_ = lfajihkepka_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lfajihkepka_ = lfajihkepka_;
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
      if (other instanceof POGOProtos.Rpc.LDMDIAOKHHH) {
        return mergeFrom((POGOProtos.Rpc.LDMDIAOKHHH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LDMDIAOKHHH other) {
      if (other == POGOProtos.Rpc.LDMDIAOKHHH.getDefaultInstance()) return this;
      if (!other.lfajihkepka_.isEmpty()) {
        if (lfajihkepka_.isEmpty()) {
          lfajihkepka_ = other.lfajihkepka_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLfajihkepkaIsMutable();
          lfajihkepka_.addAll(other.lfajihkepka_);
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
      POGOProtos.Rpc.LDMDIAOKHHH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LDMDIAOKHHH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList lfajihkepka_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLfajihkepkaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lfajihkepka_ = new com.google.protobuf.LazyStringArrayList(lfajihkepka_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @return A list containing the lfajihkepka.
     */
    public com.google.protobuf.ProtocolStringList
        getLfajihkepkaList() {
      return lfajihkepka_.getUnmodifiableView();
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @return The count of lfajihkepka.
     */
    public int getLfajihkepkaCount() {
      return lfajihkepka_.size();
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param index The index of the element to return.
     * @return The lfajihkepka at the given index.
     */
    public java.lang.String getLfajihkepka(int index) {
      return lfajihkepka_.get(index);
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the lfajihkepka at the given index.
     */
    public com.google.protobuf.ByteString
        getLfajihkepkaBytes(int index) {
      return lfajihkepka_.getByteString(index);
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param index The index to set the value at.
     * @param value The lfajihkepka to set.
     * @return This builder for chaining.
     */
    public Builder setLfajihkepka(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLfajihkepkaIsMutable();
      lfajihkepka_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param value The lfajihkepka to add.
     * @return This builder for chaining.
     */
    public Builder addLfajihkepka(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLfajihkepkaIsMutable();
      lfajihkepka_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param values The lfajihkepka to add.
     * @return This builder for chaining.
     */
    public Builder addAllLfajihkepka(
        java.lang.Iterable<java.lang.String> values) {
      ensureLfajihkepkaIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, lfajihkepka_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLfajihkepka() {
      lfajihkepka_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string lfajihkepka = 1;</code>
     * @param value The bytes of the lfajihkepka to add.
     * @return This builder for chaining.
     */
    public Builder addLfajihkepkaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLfajihkepkaIsMutable();
      lfajihkepka_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LDMDIAOKHHH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LDMDIAOKHHH)
  private static final POGOProtos.Rpc.LDMDIAOKHHH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LDMDIAOKHHH();
  }

  public static POGOProtos.Rpc.LDMDIAOKHHH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LDMDIAOKHHH>
      PARSER = new com.google.protobuf.AbstractParser<LDMDIAOKHHH>() {
    @java.lang.Override
    public LDMDIAOKHHH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LDMDIAOKHHH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LDMDIAOKHHH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LDMDIAOKHHH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LDMDIAOKHHH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

