// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KPAKMGPFEPD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KPAKMGPFEPD}
 */
public final class KPAKMGPFEPD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KPAKMGPFEPD)
    KPAKMGPFEPDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KPAKMGPFEPD.newBuilder() to construct.
  private KPAKMGPFEPD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KPAKMGPFEPD() {
    lnegdcbpkda_ = java.util.Collections.emptyList();
    djnmhpbdclg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KPAKMGPFEPD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KPAKMGPFEPD(
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
              lnegdcbpkda_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            lnegdcbpkda_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lnegdcbpkda_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              lnegdcbpkda_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              djnmhpbdclg_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            djnmhpbdclg_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                djnmhpbdclg_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              djnmhpbdclg_.add(rawValue);
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
        lnegdcbpkda_ = java.util.Collections.unmodifiableList(lnegdcbpkda_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        djnmhpbdclg_ = java.util.Collections.unmodifiableList(djnmhpbdclg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPAKMGPFEPD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPAKMGPFEPD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KPAKMGPFEPD.class, POGOProtos.Rpc.KPAKMGPFEPD.Builder.class);
  }

  public static final int LNEGDCBPKDA_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> lnegdcbpkda_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF> lnegdcbpkda_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>() {
            public POGOProtos.Rpc.GPMLDNBDMAF convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.GPMLDNBDMAF result = POGOProtos.Rpc.GPMLDNBDMAF.valueOf(from);
              return result == null ? POGOProtos.Rpc.GPMLDNBDMAF.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
   * @return A list containing the lnegdcbpkda.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GPMLDNBDMAF> getLnegdcbpkdaList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>(lnegdcbpkda_, lnegdcbpkda_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
   * @return The count of lnegdcbpkda.
   */
  @java.lang.Override
  public int getLnegdcbpkdaCount() {
    return lnegdcbpkda_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
   * @param index The index of the element to return.
   * @return The lnegdcbpkda at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GPMLDNBDMAF getLnegdcbpkda(int index) {
    return lnegdcbpkda_converter_.convert(lnegdcbpkda_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
   * @return A list containing the enum numeric values on the wire for lnegdcbpkda.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getLnegdcbpkdaValueList() {
    return lnegdcbpkda_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of lnegdcbpkda at the given index.
   */
  @java.lang.Override
  public int getLnegdcbpkdaValue(int index) {
    return lnegdcbpkda_.get(index);
  }
  private int lnegdcbpkdaMemoizedSerializedSize;

  public static final int DJNMHPBDCLG_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> djnmhpbdclg_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF> djnmhpbdclg_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>() {
            public POGOProtos.Rpc.GPMLDNBDMAF convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.GPMLDNBDMAF result = POGOProtos.Rpc.GPMLDNBDMAF.valueOf(from);
              return result == null ? POGOProtos.Rpc.GPMLDNBDMAF.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
   * @return A list containing the djnmhpbdclg.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GPMLDNBDMAF> getDjnmhpbdclgList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>(djnmhpbdclg_, djnmhpbdclg_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
   * @return The count of djnmhpbdclg.
   */
  @java.lang.Override
  public int getDjnmhpbdclgCount() {
    return djnmhpbdclg_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
   * @param index The index of the element to return.
   * @return The djnmhpbdclg at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GPMLDNBDMAF getDjnmhpbdclg(int index) {
    return djnmhpbdclg_converter_.convert(djnmhpbdclg_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
   * @return A list containing the enum numeric values on the wire for djnmhpbdclg.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getDjnmhpbdclgValueList() {
    return djnmhpbdclg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of djnmhpbdclg at the given index.
   */
  @java.lang.Override
  public int getDjnmhpbdclgValue(int index) {
    return djnmhpbdclg_.get(index);
  }
  private int djnmhpbdclgMemoizedSerializedSize;

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
    if (getLnegdcbpkdaList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(lnegdcbpkdaMemoizedSerializedSize);
    }
    for (int i = 0; i < lnegdcbpkda_.size(); i++) {
      output.writeEnumNoTag(lnegdcbpkda_.get(i));
    }
    if (getDjnmhpbdclgList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(djnmhpbdclgMemoizedSerializedSize);
    }
    for (int i = 0; i < djnmhpbdclg_.size(); i++) {
      output.writeEnumNoTag(djnmhpbdclg_.get(i));
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
      for (int i = 0; i < lnegdcbpkda_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(lnegdcbpkda_.get(i));
      }
      size += dataSize;
      if (!getLnegdcbpkdaList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }lnegdcbpkdaMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < djnmhpbdclg_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(djnmhpbdclg_.get(i));
      }
      size += dataSize;
      if (!getDjnmhpbdclgList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }djnmhpbdclgMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.KPAKMGPFEPD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KPAKMGPFEPD other = (POGOProtos.Rpc.KPAKMGPFEPD) obj;

    if (!lnegdcbpkda_.equals(other.lnegdcbpkda_)) return false;
    if (!djnmhpbdclg_.equals(other.djnmhpbdclg_)) return false;
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
    if (getLnegdcbpkdaCount() > 0) {
      hash = (37 * hash) + LNEGDCBPKDA_FIELD_NUMBER;
      hash = (53 * hash) + lnegdcbpkda_.hashCode();
    }
    if (getDjnmhpbdclgCount() > 0) {
      hash = (37 * hash) + DJNMHPBDCLG_FIELD_NUMBER;
      hash = (53 * hash) + djnmhpbdclg_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPAKMGPFEPD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KPAKMGPFEPD prototype) {
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
   * ref: KPAKMGPFEPD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KPAKMGPFEPD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KPAKMGPFEPD)
      POGOProtos.Rpc.KPAKMGPFEPDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPAKMGPFEPD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPAKMGPFEPD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KPAKMGPFEPD.class, POGOProtos.Rpc.KPAKMGPFEPD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KPAKMGPFEPD.newBuilder()
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
      lnegdcbpkda_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      djnmhpbdclg_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPAKMGPFEPD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPAKMGPFEPD getDefaultInstanceForType() {
      return POGOProtos.Rpc.KPAKMGPFEPD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPAKMGPFEPD build() {
      POGOProtos.Rpc.KPAKMGPFEPD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPAKMGPFEPD buildPartial() {
      POGOProtos.Rpc.KPAKMGPFEPD result = new POGOProtos.Rpc.KPAKMGPFEPD(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lnegdcbpkda_ = java.util.Collections.unmodifiableList(lnegdcbpkda_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lnegdcbpkda_ = lnegdcbpkda_;
      if (((bitField0_ & 0x00000002) != 0)) {
        djnmhpbdclg_ = java.util.Collections.unmodifiableList(djnmhpbdclg_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.djnmhpbdclg_ = djnmhpbdclg_;
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
      if (other instanceof POGOProtos.Rpc.KPAKMGPFEPD) {
        return mergeFrom((POGOProtos.Rpc.KPAKMGPFEPD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KPAKMGPFEPD other) {
      if (other == POGOProtos.Rpc.KPAKMGPFEPD.getDefaultInstance()) return this;
      if (!other.lnegdcbpkda_.isEmpty()) {
        if (lnegdcbpkda_.isEmpty()) {
          lnegdcbpkda_ = other.lnegdcbpkda_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLnegdcbpkdaIsMutable();
          lnegdcbpkda_.addAll(other.lnegdcbpkda_);
        }
        onChanged();
      }
      if (!other.djnmhpbdclg_.isEmpty()) {
        if (djnmhpbdclg_.isEmpty()) {
          djnmhpbdclg_ = other.djnmhpbdclg_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDjnmhpbdclgIsMutable();
          djnmhpbdclg_.addAll(other.djnmhpbdclg_);
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
      POGOProtos.Rpc.KPAKMGPFEPD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KPAKMGPFEPD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> lnegdcbpkda_ =
      java.util.Collections.emptyList();
    private void ensureLnegdcbpkdaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lnegdcbpkda_ = new java.util.ArrayList<java.lang.Integer>(lnegdcbpkda_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @return A list containing the lnegdcbpkda.
     */
    public java.util.List<POGOProtos.Rpc.GPMLDNBDMAF> getLnegdcbpkdaList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>(lnegdcbpkda_, lnegdcbpkda_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @return The count of lnegdcbpkda.
     */
    public int getLnegdcbpkdaCount() {
      return lnegdcbpkda_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param index The index of the element to return.
     * @return The lnegdcbpkda at the given index.
     */
    public POGOProtos.Rpc.GPMLDNBDMAF getLnegdcbpkda(int index) {
      return lnegdcbpkda_converter_.convert(lnegdcbpkda_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param index The index to set the value at.
     * @param value The lnegdcbpkda to set.
     * @return This builder for chaining.
     */
    public Builder setLnegdcbpkda(
        int index, POGOProtos.Rpc.GPMLDNBDMAF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLnegdcbpkdaIsMutable();
      lnegdcbpkda_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param value The lnegdcbpkda to add.
     * @return This builder for chaining.
     */
    public Builder addLnegdcbpkda(POGOProtos.Rpc.GPMLDNBDMAF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLnegdcbpkdaIsMutable();
      lnegdcbpkda_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param values The lnegdcbpkda to add.
     * @return This builder for chaining.
     */
    public Builder addAllLnegdcbpkda(
        java.lang.Iterable<? extends POGOProtos.Rpc.GPMLDNBDMAF> values) {
      ensureLnegdcbpkdaIsMutable();
      for (POGOProtos.Rpc.GPMLDNBDMAF value : values) {
        lnegdcbpkda_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLnegdcbpkda() {
      lnegdcbpkda_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @return A list containing the enum numeric values on the wire for lnegdcbpkda.
     */
    public java.util.List<java.lang.Integer>
    getLnegdcbpkdaValueList() {
      return java.util.Collections.unmodifiableList(lnegdcbpkda_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of lnegdcbpkda at the given index.
     */
    public int getLnegdcbpkdaValue(int index) {
      return lnegdcbpkda_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of lnegdcbpkda at the given index.
     * @return This builder for chaining.
     */
    public Builder setLnegdcbpkdaValue(
        int index, int value) {
      ensureLnegdcbpkdaIsMutable();
      lnegdcbpkda_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param value The enum numeric value on the wire for lnegdcbpkda to add.
     * @return This builder for chaining.
     */
    public Builder addLnegdcbpkdaValue(int value) {
      ensureLnegdcbpkdaIsMutable();
      lnegdcbpkda_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF lnegdcbpkda = 1;</code>
     * @param values The enum numeric values on the wire for lnegdcbpkda to add.
     * @return This builder for chaining.
     */
    public Builder addAllLnegdcbpkdaValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureLnegdcbpkdaIsMutable();
      for (int value : values) {
        lnegdcbpkda_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> djnmhpbdclg_ =
      java.util.Collections.emptyList();
    private void ensureDjnmhpbdclgIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        djnmhpbdclg_ = new java.util.ArrayList<java.lang.Integer>(djnmhpbdclg_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @return A list containing the djnmhpbdclg.
     */
    public java.util.List<POGOProtos.Rpc.GPMLDNBDMAF> getDjnmhpbdclgList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.GPMLDNBDMAF>(djnmhpbdclg_, djnmhpbdclg_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @return The count of djnmhpbdclg.
     */
    public int getDjnmhpbdclgCount() {
      return djnmhpbdclg_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param index The index of the element to return.
     * @return The djnmhpbdclg at the given index.
     */
    public POGOProtos.Rpc.GPMLDNBDMAF getDjnmhpbdclg(int index) {
      return djnmhpbdclg_converter_.convert(djnmhpbdclg_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param index The index to set the value at.
     * @param value The djnmhpbdclg to set.
     * @return This builder for chaining.
     */
    public Builder setDjnmhpbdclg(
        int index, POGOProtos.Rpc.GPMLDNBDMAF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDjnmhpbdclgIsMutable();
      djnmhpbdclg_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param value The djnmhpbdclg to add.
     * @return This builder for chaining.
     */
    public Builder addDjnmhpbdclg(POGOProtos.Rpc.GPMLDNBDMAF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDjnmhpbdclgIsMutable();
      djnmhpbdclg_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param values The djnmhpbdclg to add.
     * @return This builder for chaining.
     */
    public Builder addAllDjnmhpbdclg(
        java.lang.Iterable<? extends POGOProtos.Rpc.GPMLDNBDMAF> values) {
      ensureDjnmhpbdclgIsMutable();
      for (POGOProtos.Rpc.GPMLDNBDMAF value : values) {
        djnmhpbdclg_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDjnmhpbdclg() {
      djnmhpbdclg_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @return A list containing the enum numeric values on the wire for djnmhpbdclg.
     */
    public java.util.List<java.lang.Integer>
    getDjnmhpbdclgValueList() {
      return java.util.Collections.unmodifiableList(djnmhpbdclg_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of djnmhpbdclg at the given index.
     */
    public int getDjnmhpbdclgValue(int index) {
      return djnmhpbdclg_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of djnmhpbdclg at the given index.
     * @return This builder for chaining.
     */
    public Builder setDjnmhpbdclgValue(
        int index, int value) {
      ensureDjnmhpbdclgIsMutable();
      djnmhpbdclg_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param value The enum numeric value on the wire for djnmhpbdclg to add.
     * @return This builder for chaining.
     */
    public Builder addDjnmhpbdclgValue(int value) {
      ensureDjnmhpbdclgIsMutable();
      djnmhpbdclg_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GPMLDNBDMAF djnmhpbdclg = 2;</code>
     * @param values The enum numeric values on the wire for djnmhpbdclg to add.
     * @return This builder for chaining.
     */
    public Builder addAllDjnmhpbdclgValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDjnmhpbdclgIsMutable();
      for (int value : values) {
        djnmhpbdclg_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KPAKMGPFEPD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KPAKMGPFEPD)
  private static final POGOProtos.Rpc.KPAKMGPFEPD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KPAKMGPFEPD();
  }

  public static POGOProtos.Rpc.KPAKMGPFEPD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KPAKMGPFEPD>
      PARSER = new com.google.protobuf.AbstractParser<KPAKMGPFEPD>() {
    @java.lang.Override
    public KPAKMGPFEPD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KPAKMGPFEPD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KPAKMGPFEPD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KPAKMGPFEPD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KPAKMGPFEPD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

