// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BJGGHFDLCNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BJGGHFDLCNN}
 */
public final class BJGGHFDLCNN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BJGGHFDLCNN)
    BJGGHFDLCNNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BJGGHFDLCNN.newBuilder() to construct.
  private BJGGHFDLCNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BJGGHFDLCNN() {
    cllfpijeala_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    hhfnaebffcm_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BJGGHFDLCNN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BJGGHFDLCNN(
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

            clphgbfefki_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cllfpijeala_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            cllfpijeala_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              hhfnaebffcm_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            hhfnaebffcm_.add(s);
            break;
          }
          case 32: {

            objidgcliac_ = input.readBool();
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
        cllfpijeala_ = cllfpijeala_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        hhfnaebffcm_ = hhfnaebffcm_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGGHFDLCNN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGGHFDLCNN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BJGGHFDLCNN.class, POGOProtos.Rpc.BJGGHFDLCNN.Builder.class);
  }

  public static final int CLPHGBFEFKI_FIELD_NUMBER = 1;
  private boolean clphgbfefki_;
  /**
   * <code>bool clphgbfefki = 1;</code>
   * @return The clphgbfefki.
   */
  @java.lang.Override
  public boolean getClphgbfefki() {
    return clphgbfefki_;
  }

  public static final int CLLFPIJEALA_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList cllfpijeala_;
  /**
   * <code>repeated string cllfpijeala = 2;</code>
   * @return A list containing the cllfpijeala.
   */
  public com.google.protobuf.ProtocolStringList
      getCllfpijealaList() {
    return cllfpijeala_;
  }
  /**
   * <code>repeated string cllfpijeala = 2;</code>
   * @return The count of cllfpijeala.
   */
  public int getCllfpijealaCount() {
    return cllfpijeala_.size();
  }
  /**
   * <code>repeated string cllfpijeala = 2;</code>
   * @param index The index of the element to return.
   * @return The cllfpijeala at the given index.
   */
  public java.lang.String getCllfpijeala(int index) {
    return cllfpijeala_.get(index);
  }
  /**
   * <code>repeated string cllfpijeala = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cllfpijeala at the given index.
   */
  public com.google.protobuf.ByteString
      getCllfpijealaBytes(int index) {
    return cllfpijeala_.getByteString(index);
  }

  public static final int HHFNAEBFFCM_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList hhfnaebffcm_;
  /**
   * <code>repeated string hhfnaebffcm = 3;</code>
   * @return A list containing the hhfnaebffcm.
   */
  public com.google.protobuf.ProtocolStringList
      getHhfnaebffcmList() {
    return hhfnaebffcm_;
  }
  /**
   * <code>repeated string hhfnaebffcm = 3;</code>
   * @return The count of hhfnaebffcm.
   */
  public int getHhfnaebffcmCount() {
    return hhfnaebffcm_.size();
  }
  /**
   * <code>repeated string hhfnaebffcm = 3;</code>
   * @param index The index of the element to return.
   * @return The hhfnaebffcm at the given index.
   */
  public java.lang.String getHhfnaebffcm(int index) {
    return hhfnaebffcm_.get(index);
  }
  /**
   * <code>repeated string hhfnaebffcm = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hhfnaebffcm at the given index.
   */
  public com.google.protobuf.ByteString
      getHhfnaebffcmBytes(int index) {
    return hhfnaebffcm_.getByteString(index);
  }

  public static final int OBJIDGCLIAC_FIELD_NUMBER = 4;
  private boolean objidgcliac_;
  /**
   * <code>bool objidgcliac = 4;</code>
   * @return The objidgcliac.
   */
  @java.lang.Override
  public boolean getObjidgcliac() {
    return objidgcliac_;
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
    if (clphgbfefki_ != false) {
      output.writeBool(1, clphgbfefki_);
    }
    for (int i = 0; i < cllfpijeala_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cllfpijeala_.getRaw(i));
    }
    for (int i = 0; i < hhfnaebffcm_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hhfnaebffcm_.getRaw(i));
    }
    if (objidgcliac_ != false) {
      output.writeBool(4, objidgcliac_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clphgbfefki_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, clphgbfefki_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cllfpijeala_.size(); i++) {
        dataSize += computeStringSizeNoTag(cllfpijeala_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCllfpijealaList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hhfnaebffcm_.size(); i++) {
        dataSize += computeStringSizeNoTag(hhfnaebffcm_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHhfnaebffcmList().size();
    }
    if (objidgcliac_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, objidgcliac_);
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
    if (!(obj instanceof POGOProtos.Rpc.BJGGHFDLCNN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BJGGHFDLCNN other = (POGOProtos.Rpc.BJGGHFDLCNN) obj;

    if (getClphgbfefki()
        != other.getClphgbfefki()) return false;
    if (!getCllfpijealaList()
        .equals(other.getCllfpijealaList())) return false;
    if (!getHhfnaebffcmList()
        .equals(other.getHhfnaebffcmList())) return false;
    if (getObjidgcliac()
        != other.getObjidgcliac()) return false;
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
    hash = (37 * hash) + CLPHGBFEFKI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClphgbfefki());
    if (getCllfpijealaCount() > 0) {
      hash = (37 * hash) + CLLFPIJEALA_FIELD_NUMBER;
      hash = (53 * hash) + getCllfpijealaList().hashCode();
    }
    if (getHhfnaebffcmCount() > 0) {
      hash = (37 * hash) + HHFNAEBFFCM_FIELD_NUMBER;
      hash = (53 * hash) + getHhfnaebffcmList().hashCode();
    }
    hash = (37 * hash) + OBJIDGCLIAC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getObjidgcliac());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJGGHFDLCNN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BJGGHFDLCNN prototype) {
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
   * ref: BJGGHFDLCNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BJGGHFDLCNN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BJGGHFDLCNN)
      POGOProtos.Rpc.BJGGHFDLCNNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGGHFDLCNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGGHFDLCNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BJGGHFDLCNN.class, POGOProtos.Rpc.BJGGHFDLCNN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BJGGHFDLCNN.newBuilder()
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
      clphgbfefki_ = false;

      cllfpijeala_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      hhfnaebffcm_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      objidgcliac_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJGGHFDLCNN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGGHFDLCNN getDefaultInstanceForType() {
      return POGOProtos.Rpc.BJGGHFDLCNN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGGHFDLCNN build() {
      POGOProtos.Rpc.BJGGHFDLCNN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJGGHFDLCNN buildPartial() {
      POGOProtos.Rpc.BJGGHFDLCNN result = new POGOProtos.Rpc.BJGGHFDLCNN(this);
      int from_bitField0_ = bitField0_;
      result.clphgbfefki_ = clphgbfefki_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cllfpijeala_ = cllfpijeala_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cllfpijeala_ = cllfpijeala_;
      if (((bitField0_ & 0x00000002) != 0)) {
        hhfnaebffcm_ = hhfnaebffcm_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.hhfnaebffcm_ = hhfnaebffcm_;
      result.objidgcliac_ = objidgcliac_;
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
      if (other instanceof POGOProtos.Rpc.BJGGHFDLCNN) {
        return mergeFrom((POGOProtos.Rpc.BJGGHFDLCNN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BJGGHFDLCNN other) {
      if (other == POGOProtos.Rpc.BJGGHFDLCNN.getDefaultInstance()) return this;
      if (other.getClphgbfefki() != false) {
        setClphgbfefki(other.getClphgbfefki());
      }
      if (!other.cllfpijeala_.isEmpty()) {
        if (cllfpijeala_.isEmpty()) {
          cllfpijeala_ = other.cllfpijeala_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCllfpijealaIsMutable();
          cllfpijeala_.addAll(other.cllfpijeala_);
        }
        onChanged();
      }
      if (!other.hhfnaebffcm_.isEmpty()) {
        if (hhfnaebffcm_.isEmpty()) {
          hhfnaebffcm_ = other.hhfnaebffcm_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureHhfnaebffcmIsMutable();
          hhfnaebffcm_.addAll(other.hhfnaebffcm_);
        }
        onChanged();
      }
      if (other.getObjidgcliac() != false) {
        setObjidgcliac(other.getObjidgcliac());
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
      POGOProtos.Rpc.BJGGHFDLCNN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BJGGHFDLCNN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean clphgbfefki_ ;
    /**
     * <code>bool clphgbfefki = 1;</code>
     * @return The clphgbfefki.
     */
    @java.lang.Override
    public boolean getClphgbfefki() {
      return clphgbfefki_;
    }
    /**
     * <code>bool clphgbfefki = 1;</code>
     * @param value The clphgbfefki to set.
     * @return This builder for chaining.
     */
    public Builder setClphgbfefki(boolean value) {
      
      clphgbfefki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool clphgbfefki = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClphgbfefki() {
      
      clphgbfefki_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList cllfpijeala_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCllfpijealaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cllfpijeala_ = new com.google.protobuf.LazyStringArrayList(cllfpijeala_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @return A list containing the cllfpijeala.
     */
    public com.google.protobuf.ProtocolStringList
        getCllfpijealaList() {
      return cllfpijeala_.getUnmodifiableView();
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @return The count of cllfpijeala.
     */
    public int getCllfpijealaCount() {
      return cllfpijeala_.size();
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param index The index of the element to return.
     * @return The cllfpijeala at the given index.
     */
    public java.lang.String getCllfpijeala(int index) {
      return cllfpijeala_.get(index);
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the cllfpijeala at the given index.
     */
    public com.google.protobuf.ByteString
        getCllfpijealaBytes(int index) {
      return cllfpijeala_.getByteString(index);
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param index The index to set the value at.
     * @param value The cllfpijeala to set.
     * @return This builder for chaining.
     */
    public Builder setCllfpijeala(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCllfpijealaIsMutable();
      cllfpijeala_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param value The cllfpijeala to add.
     * @return This builder for chaining.
     */
    public Builder addCllfpijeala(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCllfpijealaIsMutable();
      cllfpijeala_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param values The cllfpijeala to add.
     * @return This builder for chaining.
     */
    public Builder addAllCllfpijeala(
        java.lang.Iterable<java.lang.String> values) {
      ensureCllfpijealaIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cllfpijeala_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCllfpijeala() {
      cllfpijeala_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cllfpijeala = 2;</code>
     * @param value The bytes of the cllfpijeala to add.
     * @return This builder for chaining.
     */
    public Builder addCllfpijealaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCllfpijealaIsMutable();
      cllfpijeala_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList hhfnaebffcm_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureHhfnaebffcmIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        hhfnaebffcm_ = new com.google.protobuf.LazyStringArrayList(hhfnaebffcm_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @return A list containing the hhfnaebffcm.
     */
    public com.google.protobuf.ProtocolStringList
        getHhfnaebffcmList() {
      return hhfnaebffcm_.getUnmodifiableView();
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @return The count of hhfnaebffcm.
     */
    public int getHhfnaebffcmCount() {
      return hhfnaebffcm_.size();
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param index The index of the element to return.
     * @return The hhfnaebffcm at the given index.
     */
    public java.lang.String getHhfnaebffcm(int index) {
      return hhfnaebffcm_.get(index);
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the hhfnaebffcm at the given index.
     */
    public com.google.protobuf.ByteString
        getHhfnaebffcmBytes(int index) {
      return hhfnaebffcm_.getByteString(index);
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param index The index to set the value at.
     * @param value The hhfnaebffcm to set.
     * @return This builder for chaining.
     */
    public Builder setHhfnaebffcm(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHhfnaebffcmIsMutable();
      hhfnaebffcm_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param value The hhfnaebffcm to add.
     * @return This builder for chaining.
     */
    public Builder addHhfnaebffcm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHhfnaebffcmIsMutable();
      hhfnaebffcm_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param values The hhfnaebffcm to add.
     * @return This builder for chaining.
     */
    public Builder addAllHhfnaebffcm(
        java.lang.Iterable<java.lang.String> values) {
      ensureHhfnaebffcmIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hhfnaebffcm_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHhfnaebffcm() {
      hhfnaebffcm_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hhfnaebffcm = 3;</code>
     * @param value The bytes of the hhfnaebffcm to add.
     * @return This builder for chaining.
     */
    public Builder addHhfnaebffcmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureHhfnaebffcmIsMutable();
      hhfnaebffcm_.add(value);
      onChanged();
      return this;
    }

    private boolean objidgcliac_ ;
    /**
     * <code>bool objidgcliac = 4;</code>
     * @return The objidgcliac.
     */
    @java.lang.Override
    public boolean getObjidgcliac() {
      return objidgcliac_;
    }
    /**
     * <code>bool objidgcliac = 4;</code>
     * @param value The objidgcliac to set.
     * @return This builder for chaining.
     */
    public Builder setObjidgcliac(boolean value) {
      
      objidgcliac_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool objidgcliac = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjidgcliac() {
      
      objidgcliac_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BJGGHFDLCNN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BJGGHFDLCNN)
  private static final POGOProtos.Rpc.BJGGHFDLCNN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BJGGHFDLCNN();
  }

  public static POGOProtos.Rpc.BJGGHFDLCNN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BJGGHFDLCNN>
      PARSER = new com.google.protobuf.AbstractParser<BJGGHFDLCNN>() {
    @java.lang.Override
    public BJGGHFDLCNN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BJGGHFDLCNN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BJGGHFDLCNN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BJGGHFDLCNN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BJGGHFDLCNN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

