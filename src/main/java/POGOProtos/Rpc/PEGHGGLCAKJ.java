// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PEGHGGLCAKJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PEGHGGLCAKJ}
 */
public final class PEGHGGLCAKJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PEGHGGLCAKJ)
    PEGHGGLCAKJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PEGHGGLCAKJ.newBuilder() to construct.
  private PEGHGGLCAKJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PEGHGGLCAKJ() {
    eekcfncdpod_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    nioifflgjag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PEGHGGLCAKJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PEGHGGLCAKJ(
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

            kpiicnbglca_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              eekcfncdpod_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            eekcfncdpod_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              nioifflgjag_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            nioifflgjag_.add(s);
            break;
          }
          case 32: {

            feghdgiookl_ = input.readBool();
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
        eekcfncdpod_ = eekcfncdpod_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        nioifflgjag_ = nioifflgjag_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEGHGGLCAKJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEGHGGLCAKJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PEGHGGLCAKJ.class, POGOProtos.Rpc.PEGHGGLCAKJ.Builder.class);
  }

  public static final int KPIICNBGLCA_FIELD_NUMBER = 1;
  private boolean kpiicnbglca_;
  /**
   * <code>bool kpiicnbglca = 1;</code>
   * @return The kpiicnbglca.
   */
  @java.lang.Override
  public boolean getKpiicnbglca() {
    return kpiicnbglca_;
  }

  public static final int EEKCFNCDPOD_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList eekcfncdpod_;
  /**
   * <code>repeated string eekcfncdpod = 2;</code>
   * @return A list containing the eekcfncdpod.
   */
  public com.google.protobuf.ProtocolStringList
      getEekcfncdpodList() {
    return eekcfncdpod_;
  }
  /**
   * <code>repeated string eekcfncdpod = 2;</code>
   * @return The count of eekcfncdpod.
   */
  public int getEekcfncdpodCount() {
    return eekcfncdpod_.size();
  }
  /**
   * <code>repeated string eekcfncdpod = 2;</code>
   * @param index The index of the element to return.
   * @return The eekcfncdpod at the given index.
   */
  public java.lang.String getEekcfncdpod(int index) {
    return eekcfncdpod_.get(index);
  }
  /**
   * <code>repeated string eekcfncdpod = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the eekcfncdpod at the given index.
   */
  public com.google.protobuf.ByteString
      getEekcfncdpodBytes(int index) {
    return eekcfncdpod_.getByteString(index);
  }

  public static final int NIOIFFLGJAG_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList nioifflgjag_;
  /**
   * <code>repeated string nioifflgjag = 3;</code>
   * @return A list containing the nioifflgjag.
   */
  public com.google.protobuf.ProtocolStringList
      getNioifflgjagList() {
    return nioifflgjag_;
  }
  /**
   * <code>repeated string nioifflgjag = 3;</code>
   * @return The count of nioifflgjag.
   */
  public int getNioifflgjagCount() {
    return nioifflgjag_.size();
  }
  /**
   * <code>repeated string nioifflgjag = 3;</code>
   * @param index The index of the element to return.
   * @return The nioifflgjag at the given index.
   */
  public java.lang.String getNioifflgjag(int index) {
    return nioifflgjag_.get(index);
  }
  /**
   * <code>repeated string nioifflgjag = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the nioifflgjag at the given index.
   */
  public com.google.protobuf.ByteString
      getNioifflgjagBytes(int index) {
    return nioifflgjag_.getByteString(index);
  }

  public static final int FEGHDGIOOKL_FIELD_NUMBER = 4;
  private boolean feghdgiookl_;
  /**
   * <code>bool feghdgiookl = 4;</code>
   * @return The feghdgiookl.
   */
  @java.lang.Override
  public boolean getFeghdgiookl() {
    return feghdgiookl_;
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
    if (kpiicnbglca_ != false) {
      output.writeBool(1, kpiicnbglca_);
    }
    for (int i = 0; i < eekcfncdpod_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eekcfncdpod_.getRaw(i));
    }
    for (int i = 0; i < nioifflgjag_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nioifflgjag_.getRaw(i));
    }
    if (feghdgiookl_ != false) {
      output.writeBool(4, feghdgiookl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kpiicnbglca_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, kpiicnbglca_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < eekcfncdpod_.size(); i++) {
        dataSize += computeStringSizeNoTag(eekcfncdpod_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEekcfncdpodList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nioifflgjag_.size(); i++) {
        dataSize += computeStringSizeNoTag(nioifflgjag_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNioifflgjagList().size();
    }
    if (feghdgiookl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, feghdgiookl_);
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
    if (!(obj instanceof POGOProtos.Rpc.PEGHGGLCAKJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PEGHGGLCAKJ other = (POGOProtos.Rpc.PEGHGGLCAKJ) obj;

    if (getKpiicnbglca()
        != other.getKpiicnbglca()) return false;
    if (!getEekcfncdpodList()
        .equals(other.getEekcfncdpodList())) return false;
    if (!getNioifflgjagList()
        .equals(other.getNioifflgjagList())) return false;
    if (getFeghdgiookl()
        != other.getFeghdgiookl()) return false;
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
    hash = (37 * hash) + KPIICNBGLCA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKpiicnbglca());
    if (getEekcfncdpodCount() > 0) {
      hash = (37 * hash) + EEKCFNCDPOD_FIELD_NUMBER;
      hash = (53 * hash) + getEekcfncdpodList().hashCode();
    }
    if (getNioifflgjagCount() > 0) {
      hash = (37 * hash) + NIOIFFLGJAG_FIELD_NUMBER;
      hash = (53 * hash) + getNioifflgjagList().hashCode();
    }
    hash = (37 * hash) + FEGHDGIOOKL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFeghdgiookl());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGHGGLCAKJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PEGHGGLCAKJ prototype) {
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
   * ref: PEGHGGLCAKJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PEGHGGLCAKJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PEGHGGLCAKJ)
      POGOProtos.Rpc.PEGHGGLCAKJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEGHGGLCAKJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEGHGGLCAKJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PEGHGGLCAKJ.class, POGOProtos.Rpc.PEGHGGLCAKJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PEGHGGLCAKJ.newBuilder()
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
      kpiicnbglca_ = false;

      eekcfncdpod_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      nioifflgjag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      feghdgiookl_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEGHGGLCAKJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGHGGLCAKJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.PEGHGGLCAKJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGHGGLCAKJ build() {
      POGOProtos.Rpc.PEGHGGLCAKJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGHGGLCAKJ buildPartial() {
      POGOProtos.Rpc.PEGHGGLCAKJ result = new POGOProtos.Rpc.PEGHGGLCAKJ(this);
      int from_bitField0_ = bitField0_;
      result.kpiicnbglca_ = kpiicnbglca_;
      if (((bitField0_ & 0x00000001) != 0)) {
        eekcfncdpod_ = eekcfncdpod_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.eekcfncdpod_ = eekcfncdpod_;
      if (((bitField0_ & 0x00000002) != 0)) {
        nioifflgjag_ = nioifflgjag_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.nioifflgjag_ = nioifflgjag_;
      result.feghdgiookl_ = feghdgiookl_;
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
      if (other instanceof POGOProtos.Rpc.PEGHGGLCAKJ) {
        return mergeFrom((POGOProtos.Rpc.PEGHGGLCAKJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PEGHGGLCAKJ other) {
      if (other == POGOProtos.Rpc.PEGHGGLCAKJ.getDefaultInstance()) return this;
      if (other.getKpiicnbglca() != false) {
        setKpiicnbglca(other.getKpiicnbglca());
      }
      if (!other.eekcfncdpod_.isEmpty()) {
        if (eekcfncdpod_.isEmpty()) {
          eekcfncdpod_ = other.eekcfncdpod_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEekcfncdpodIsMutable();
          eekcfncdpod_.addAll(other.eekcfncdpod_);
        }
        onChanged();
      }
      if (!other.nioifflgjag_.isEmpty()) {
        if (nioifflgjag_.isEmpty()) {
          nioifflgjag_ = other.nioifflgjag_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNioifflgjagIsMutable();
          nioifflgjag_.addAll(other.nioifflgjag_);
        }
        onChanged();
      }
      if (other.getFeghdgiookl() != false) {
        setFeghdgiookl(other.getFeghdgiookl());
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
      POGOProtos.Rpc.PEGHGGLCAKJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PEGHGGLCAKJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean kpiicnbglca_ ;
    /**
     * <code>bool kpiicnbglca = 1;</code>
     * @return The kpiicnbglca.
     */
    @java.lang.Override
    public boolean getKpiicnbglca() {
      return kpiicnbglca_;
    }
    /**
     * <code>bool kpiicnbglca = 1;</code>
     * @param value The kpiicnbglca to set.
     * @return This builder for chaining.
     */
    public Builder setKpiicnbglca(boolean value) {
      
      kpiicnbglca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kpiicnbglca = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKpiicnbglca() {
      
      kpiicnbglca_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList eekcfncdpod_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEekcfncdpodIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eekcfncdpod_ = new com.google.protobuf.LazyStringArrayList(eekcfncdpod_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @return A list containing the eekcfncdpod.
     */
    public com.google.protobuf.ProtocolStringList
        getEekcfncdpodList() {
      return eekcfncdpod_.getUnmodifiableView();
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @return The count of eekcfncdpod.
     */
    public int getEekcfncdpodCount() {
      return eekcfncdpod_.size();
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param index The index of the element to return.
     * @return The eekcfncdpod at the given index.
     */
    public java.lang.String getEekcfncdpod(int index) {
      return eekcfncdpod_.get(index);
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the eekcfncdpod at the given index.
     */
    public com.google.protobuf.ByteString
        getEekcfncdpodBytes(int index) {
      return eekcfncdpod_.getByteString(index);
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param index The index to set the value at.
     * @param value The eekcfncdpod to set.
     * @return This builder for chaining.
     */
    public Builder setEekcfncdpod(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEekcfncdpodIsMutable();
      eekcfncdpod_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param value The eekcfncdpod to add.
     * @return This builder for chaining.
     */
    public Builder addEekcfncdpod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEekcfncdpodIsMutable();
      eekcfncdpod_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param values The eekcfncdpod to add.
     * @return This builder for chaining.
     */
    public Builder addAllEekcfncdpod(
        java.lang.Iterable<java.lang.String> values) {
      ensureEekcfncdpodIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, eekcfncdpod_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEekcfncdpod() {
      eekcfncdpod_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eekcfncdpod = 2;</code>
     * @param value The bytes of the eekcfncdpod to add.
     * @return This builder for chaining.
     */
    public Builder addEekcfncdpodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEekcfncdpodIsMutable();
      eekcfncdpod_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList nioifflgjag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNioifflgjagIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        nioifflgjag_ = new com.google.protobuf.LazyStringArrayList(nioifflgjag_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @return A list containing the nioifflgjag.
     */
    public com.google.protobuf.ProtocolStringList
        getNioifflgjagList() {
      return nioifflgjag_.getUnmodifiableView();
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @return The count of nioifflgjag.
     */
    public int getNioifflgjagCount() {
      return nioifflgjag_.size();
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param index The index of the element to return.
     * @return The nioifflgjag at the given index.
     */
    public java.lang.String getNioifflgjag(int index) {
      return nioifflgjag_.get(index);
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the nioifflgjag at the given index.
     */
    public com.google.protobuf.ByteString
        getNioifflgjagBytes(int index) {
      return nioifflgjag_.getByteString(index);
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param index The index to set the value at.
     * @param value The nioifflgjag to set.
     * @return This builder for chaining.
     */
    public Builder setNioifflgjag(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNioifflgjagIsMutable();
      nioifflgjag_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param value The nioifflgjag to add.
     * @return This builder for chaining.
     */
    public Builder addNioifflgjag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNioifflgjagIsMutable();
      nioifflgjag_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param values The nioifflgjag to add.
     * @return This builder for chaining.
     */
    public Builder addAllNioifflgjag(
        java.lang.Iterable<java.lang.String> values) {
      ensureNioifflgjagIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nioifflgjag_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNioifflgjag() {
      nioifflgjag_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nioifflgjag = 3;</code>
     * @param value The bytes of the nioifflgjag to add.
     * @return This builder for chaining.
     */
    public Builder addNioifflgjagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNioifflgjagIsMutable();
      nioifflgjag_.add(value);
      onChanged();
      return this;
    }

    private boolean feghdgiookl_ ;
    /**
     * <code>bool feghdgiookl = 4;</code>
     * @return The feghdgiookl.
     */
    @java.lang.Override
    public boolean getFeghdgiookl() {
      return feghdgiookl_;
    }
    /**
     * <code>bool feghdgiookl = 4;</code>
     * @param value The feghdgiookl to set.
     * @return This builder for chaining.
     */
    public Builder setFeghdgiookl(boolean value) {
      
      feghdgiookl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool feghdgiookl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeghdgiookl() {
      
      feghdgiookl_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PEGHGGLCAKJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PEGHGGLCAKJ)
  private static final POGOProtos.Rpc.PEGHGGLCAKJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PEGHGGLCAKJ();
  }

  public static POGOProtos.Rpc.PEGHGGLCAKJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PEGHGGLCAKJ>
      PARSER = new com.google.protobuf.AbstractParser<PEGHGGLCAKJ>() {
    @java.lang.Override
    public PEGHGGLCAKJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PEGHGGLCAKJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PEGHGGLCAKJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PEGHGGLCAKJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PEGHGGLCAKJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

