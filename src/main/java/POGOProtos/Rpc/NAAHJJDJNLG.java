// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NAAHJJDJNLG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NAAHJJDJNLG}
 */
public  final class NAAHJJDJNLG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NAAHJJDJNLG)
    NAAHJJDJNLGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NAAHJJDJNLG.newBuilder() to construct.
  private NAAHJJDJNLG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NAAHJJDJNLG() {
    pldglajjgkl_ = "";
    mmkcnikfieg_ = emptyLongList();
    aggadipkfnd_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NAAHJJDJNLG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NAAHJJDJNLG(
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

            pldglajjgkl_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mmkcnikfieg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            mmkcnikfieg_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              mmkcnikfieg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              mmkcnikfieg_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            aggadipkfnd_ = s;
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
        mmkcnikfieg_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NAAHJJDJNLG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NAAHJJDJNLG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NAAHJJDJNLG.class, POGOProtos.Rpc.NAAHJJDJNLG.Builder.class);
  }

  public static final int PLDGLAJJGKL_FIELD_NUMBER = 1;
  private volatile java.lang.Object pldglajjgkl_;
  /**
   * <code>string pldglajjgkl = 1;</code>
   * @return The pldglajjgkl.
   */
  public java.lang.String getPldglajjgkl() {
    java.lang.Object ref = pldglajjgkl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pldglajjgkl_ = s;
      return s;
    }
  }
  /**
   * <code>string pldglajjgkl = 1;</code>
   * @return The bytes for pldglajjgkl.
   */
  public com.google.protobuf.ByteString
      getPldglajjgklBytes() {
    java.lang.Object ref = pldglajjgkl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pldglajjgkl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MMKCNIKFIEG_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList mmkcnikfieg_;
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @return A list containing the mmkcnikfieg.
   */
  public java.util.List<java.lang.Long>
      getMmkcnikfiegList() {
    return mmkcnikfieg_;
  }
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @return The count of mmkcnikfieg.
   */
  public int getMmkcnikfiegCount() {
    return mmkcnikfieg_.size();
  }
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @param index The index of the element to return.
   * @return The mmkcnikfieg at the given index.
   */
  public long getMmkcnikfieg(int index) {
    return mmkcnikfieg_.getLong(index);
  }
  private int mmkcnikfiegMemoizedSerializedSize = -1;

  public static final int AGGADIPKFND_FIELD_NUMBER = 3;
  private volatile java.lang.Object aggadipkfnd_;
  /**
   * <code>string aggadipkfnd = 3;</code>
   * @return The aggadipkfnd.
   */
  public java.lang.String getAggadipkfnd() {
    java.lang.Object ref = aggadipkfnd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggadipkfnd_ = s;
      return s;
    }
  }
  /**
   * <code>string aggadipkfnd = 3;</code>
   * @return The bytes for aggadipkfnd.
   */
  public com.google.protobuf.ByteString
      getAggadipkfndBytes() {
    java.lang.Object ref = aggadipkfnd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggadipkfnd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getPldglajjgklBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pldglajjgkl_);
    }
    if (getMmkcnikfiegList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(mmkcnikfiegMemoizedSerializedSize);
    }
    for (int i = 0; i < mmkcnikfieg_.size(); i++) {
      output.writeUInt64NoTag(mmkcnikfieg_.getLong(i));
    }
    if (!getAggadipkfndBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aggadipkfnd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPldglajjgklBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pldglajjgkl_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < mmkcnikfieg_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(mmkcnikfieg_.getLong(i));
      }
      size += dataSize;
      if (!getMmkcnikfiegList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      mmkcnikfiegMemoizedSerializedSize = dataSize;
    }
    if (!getAggadipkfndBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, aggadipkfnd_);
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
    if (!(obj instanceof POGOProtos.Rpc.NAAHJJDJNLG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NAAHJJDJNLG other = (POGOProtos.Rpc.NAAHJJDJNLG) obj;

    if (!getPldglajjgkl()
        .equals(other.getPldglajjgkl())) return false;
    if (!getMmkcnikfiegList()
        .equals(other.getMmkcnikfiegList())) return false;
    if (!getAggadipkfnd()
        .equals(other.getAggadipkfnd())) return false;
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
    hash = (37 * hash) + PLDGLAJJGKL_FIELD_NUMBER;
    hash = (53 * hash) + getPldglajjgkl().hashCode();
    if (getMmkcnikfiegCount() > 0) {
      hash = (37 * hash) + MMKCNIKFIEG_FIELD_NUMBER;
      hash = (53 * hash) + getMmkcnikfiegList().hashCode();
    }
    hash = (37 * hash) + AGGADIPKFND_FIELD_NUMBER;
    hash = (53 * hash) + getAggadipkfnd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NAAHJJDJNLG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NAAHJJDJNLG prototype) {
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
   * ref: NAAHJJDJNLG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NAAHJJDJNLG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NAAHJJDJNLG)
      POGOProtos.Rpc.NAAHJJDJNLGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NAAHJJDJNLG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NAAHJJDJNLG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NAAHJJDJNLG.class, POGOProtos.Rpc.NAAHJJDJNLG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NAAHJJDJNLG.newBuilder()
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
      pldglajjgkl_ = "";

      mmkcnikfieg_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      aggadipkfnd_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NAAHJJDJNLG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NAAHJJDJNLG getDefaultInstanceForType() {
      return POGOProtos.Rpc.NAAHJJDJNLG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NAAHJJDJNLG build() {
      POGOProtos.Rpc.NAAHJJDJNLG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NAAHJJDJNLG buildPartial() {
      POGOProtos.Rpc.NAAHJJDJNLG result = new POGOProtos.Rpc.NAAHJJDJNLG(this);
      int from_bitField0_ = bitField0_;
      result.pldglajjgkl_ = pldglajjgkl_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mmkcnikfieg_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mmkcnikfieg_ = mmkcnikfieg_;
      result.aggadipkfnd_ = aggadipkfnd_;
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
      if (other instanceof POGOProtos.Rpc.NAAHJJDJNLG) {
        return mergeFrom((POGOProtos.Rpc.NAAHJJDJNLG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NAAHJJDJNLG other) {
      if (other == POGOProtos.Rpc.NAAHJJDJNLG.getDefaultInstance()) return this;
      if (!other.getPldglajjgkl().isEmpty()) {
        pldglajjgkl_ = other.pldglajjgkl_;
        onChanged();
      }
      if (!other.mmkcnikfieg_.isEmpty()) {
        if (mmkcnikfieg_.isEmpty()) {
          mmkcnikfieg_ = other.mmkcnikfieg_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMmkcnikfiegIsMutable();
          mmkcnikfieg_.addAll(other.mmkcnikfieg_);
        }
        onChanged();
      }
      if (!other.getAggadipkfnd().isEmpty()) {
        aggadipkfnd_ = other.aggadipkfnd_;
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
      POGOProtos.Rpc.NAAHJJDJNLG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NAAHJJDJNLG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object pldglajjgkl_ = "";
    /**
     * <code>string pldglajjgkl = 1;</code>
     * @return The pldglajjgkl.
     */
    public java.lang.String getPldglajjgkl() {
      java.lang.Object ref = pldglajjgkl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pldglajjgkl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pldglajjgkl = 1;</code>
     * @return The bytes for pldglajjgkl.
     */
    public com.google.protobuf.ByteString
        getPldglajjgklBytes() {
      java.lang.Object ref = pldglajjgkl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pldglajjgkl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pldglajjgkl = 1;</code>
     * @param value The pldglajjgkl to set.
     * @return This builder for chaining.
     */
    public Builder setPldglajjgkl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pldglajjgkl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pldglajjgkl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPldglajjgkl() {
      
      pldglajjgkl_ = getDefaultInstance().getPldglajjgkl();
      onChanged();
      return this;
    }
    /**
     * <code>string pldglajjgkl = 1;</code>
     * @param value The bytes for pldglajjgkl to set.
     * @return This builder for chaining.
     */
    public Builder setPldglajjgklBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pldglajjgkl_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList mmkcnikfieg_ = emptyLongList();
    private void ensureMmkcnikfiegIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mmkcnikfieg_ = mutableCopy(mmkcnikfieg_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return A list containing the mmkcnikfieg.
     */
    public java.util.List<java.lang.Long>
        getMmkcnikfiegList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(mmkcnikfieg_) : mmkcnikfieg_;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return The count of mmkcnikfieg.
     */
    public int getMmkcnikfiegCount() {
      return mmkcnikfieg_.size();
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param index The index of the element to return.
     * @return The mmkcnikfieg at the given index.
     */
    public long getMmkcnikfieg(int index) {
      return mmkcnikfieg_.getLong(index);
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param index The index to set the value at.
     * @param value The mmkcnikfieg to set.
     * @return This builder for chaining.
     */
    public Builder setMmkcnikfieg(
        int index, long value) {
      ensureMmkcnikfiegIsMutable();
      mmkcnikfieg_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param value The mmkcnikfieg to add.
     * @return This builder for chaining.
     */
    public Builder addMmkcnikfieg(long value) {
      ensureMmkcnikfiegIsMutable();
      mmkcnikfieg_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param values The mmkcnikfieg to add.
     * @return This builder for chaining.
     */
    public Builder addAllMmkcnikfieg(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureMmkcnikfiegIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mmkcnikfieg_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmkcnikfieg() {
      mmkcnikfieg_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object aggadipkfnd_ = "";
    /**
     * <code>string aggadipkfnd = 3;</code>
     * @return The aggadipkfnd.
     */
    public java.lang.String getAggadipkfnd() {
      java.lang.Object ref = aggadipkfnd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggadipkfnd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aggadipkfnd = 3;</code>
     * @return The bytes for aggadipkfnd.
     */
    public com.google.protobuf.ByteString
        getAggadipkfndBytes() {
      java.lang.Object ref = aggadipkfnd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggadipkfnd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aggadipkfnd = 3;</code>
     * @param value The aggadipkfnd to set.
     * @return This builder for chaining.
     */
    public Builder setAggadipkfnd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggadipkfnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aggadipkfnd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAggadipkfnd() {
      
      aggadipkfnd_ = getDefaultInstance().getAggadipkfnd();
      onChanged();
      return this;
    }
    /**
     * <code>string aggadipkfnd = 3;</code>
     * @param value The bytes for aggadipkfnd to set.
     * @return This builder for chaining.
     */
    public Builder setAggadipkfndBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggadipkfnd_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NAAHJJDJNLG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NAAHJJDJNLG)
  private static final POGOProtos.Rpc.NAAHJJDJNLG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NAAHJJDJNLG();
  }

  public static POGOProtos.Rpc.NAAHJJDJNLG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NAAHJJDJNLG>
      PARSER = new com.google.protobuf.AbstractParser<NAAHJJDJNLG>() {
    @java.lang.Override
    public NAAHJJDJNLG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NAAHJJDJNLG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NAAHJJDJNLG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NAAHJJDJNLG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NAAHJJDJNLG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

