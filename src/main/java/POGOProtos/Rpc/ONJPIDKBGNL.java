// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ONJPIDKBGNL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ONJPIDKBGNL}
 */
public  final class ONJPIDKBGNL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ONJPIDKBGNL)
    ONJPIDKBGNLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ONJPIDKBGNL.newBuilder() to construct.
  private ONJPIDKBGNL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ONJPIDKBGNL() {
    dnjeiidkmdp_ = java.util.Collections.emptyList();
    ccpmnhopffe_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ONJPIDKBGNL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ONJPIDKBGNL(
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
              dnjeiidkmdp_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            dnjeiidkmdp_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dnjeiidkmdp_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              dnjeiidkmdp_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 21: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              ccpmnhopffe_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            ccpmnhopffe_.addFloat(input.readFloat());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              ccpmnhopffe_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              ccpmnhopffe_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 25: {

            edaeicajhmh_ = input.readDouble();
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
        dnjeiidkmdp_ = java.util.Collections.unmodifiableList(dnjeiidkmdp_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        ccpmnhopffe_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONJPIDKBGNL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONJPIDKBGNL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ONJPIDKBGNL.class, POGOProtos.Rpc.ONJPIDKBGNL.Builder.class);
  }

  public static final int DNJEIIDKMDP_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> dnjeiidkmdp_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.EAFFLJCABOK> dnjeiidkmdp_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.EAFFLJCABOK>() {
            public POGOProtos.Rpc.EAFFLJCABOK convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(from);
              return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
   * @return A list containing the dnjeiidkmdp.
   */
  public java.util.List<POGOProtos.Rpc.EAFFLJCABOK> getDnjeiidkmdpList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.EAFFLJCABOK>(dnjeiidkmdp_, dnjeiidkmdp_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
   * @return The count of dnjeiidkmdp.
   */
  public int getDnjeiidkmdpCount() {
    return dnjeiidkmdp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
   * @param index The index of the element to return.
   * @return The dnjeiidkmdp at the given index.
   */
  public POGOProtos.Rpc.EAFFLJCABOK getDnjeiidkmdp(int index) {
    return dnjeiidkmdp_converter_.convert(dnjeiidkmdp_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
   * @return A list containing the enum numeric values on the wire for dnjeiidkmdp.
   */
  public java.util.List<java.lang.Integer>
  getDnjeiidkmdpValueList() {
    return dnjeiidkmdp_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dnjeiidkmdp at the given index.
   */
  public int getDnjeiidkmdpValue(int index) {
    return dnjeiidkmdp_.get(index);
  }
  private int dnjeiidkmdpMemoizedSerializedSize;

  public static final int CCPMNHOPFFE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList ccpmnhopffe_;
  /**
   * <code>repeated float ccpmnhopffe = 2;</code>
   * @return A list containing the ccpmnhopffe.
   */
  public java.util.List<java.lang.Float>
      getCcpmnhopffeList() {
    return ccpmnhopffe_;
  }
  /**
   * <code>repeated float ccpmnhopffe = 2;</code>
   * @return The count of ccpmnhopffe.
   */
  public int getCcpmnhopffeCount() {
    return ccpmnhopffe_.size();
  }
  /**
   * <code>repeated float ccpmnhopffe = 2;</code>
   * @param index The index of the element to return.
   * @return The ccpmnhopffe at the given index.
   */
  public float getCcpmnhopffe(int index) {
    return ccpmnhopffe_.getFloat(index);
  }
  private int ccpmnhopffeMemoizedSerializedSize = -1;

  public static final int EDAEICAJHMH_FIELD_NUMBER = 3;
  private double edaeicajhmh_;
  /**
   * <code>double edaeicajhmh = 3;</code>
   * @return The edaeicajhmh.
   */
  public double getEdaeicajhmh() {
    return edaeicajhmh_;
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
    if (getDnjeiidkmdpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(dnjeiidkmdpMemoizedSerializedSize);
    }
    for (int i = 0; i < dnjeiidkmdp_.size(); i++) {
      output.writeEnumNoTag(dnjeiidkmdp_.get(i));
    }
    if (getCcpmnhopffeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(ccpmnhopffeMemoizedSerializedSize);
    }
    for (int i = 0; i < ccpmnhopffe_.size(); i++) {
      output.writeFloatNoTag(ccpmnhopffe_.getFloat(i));
    }
    if (edaeicajhmh_ != 0D) {
      output.writeDouble(3, edaeicajhmh_);
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
      for (int i = 0; i < dnjeiidkmdp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(dnjeiidkmdp_.get(i));
      }
      size += dataSize;
      if (!getDnjeiidkmdpList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }dnjeiidkmdpMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getCcpmnhopffeList().size();
      size += dataSize;
      if (!getCcpmnhopffeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ccpmnhopffeMemoizedSerializedSize = dataSize;
    }
    if (edaeicajhmh_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, edaeicajhmh_);
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
    if (!(obj instanceof POGOProtos.Rpc.ONJPIDKBGNL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ONJPIDKBGNL other = (POGOProtos.Rpc.ONJPIDKBGNL) obj;

    if (!dnjeiidkmdp_.equals(other.dnjeiidkmdp_)) return false;
    if (!getCcpmnhopffeList()
        .equals(other.getCcpmnhopffeList())) return false;
    if (java.lang.Double.doubleToLongBits(getEdaeicajhmh())
        != java.lang.Double.doubleToLongBits(
            other.getEdaeicajhmh())) return false;
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
    if (getDnjeiidkmdpCount() > 0) {
      hash = (37 * hash) + DNJEIIDKMDP_FIELD_NUMBER;
      hash = (53 * hash) + dnjeiidkmdp_.hashCode();
    }
    if (getCcpmnhopffeCount() > 0) {
      hash = (37 * hash) + CCPMNHOPFFE_FIELD_NUMBER;
      hash = (53 * hash) + getCcpmnhopffeList().hashCode();
    }
    hash = (37 * hash) + EDAEICAJHMH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEdaeicajhmh()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONJPIDKBGNL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ONJPIDKBGNL prototype) {
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
   * ref: ONJPIDKBGNL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ONJPIDKBGNL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ONJPIDKBGNL)
      POGOProtos.Rpc.ONJPIDKBGNLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONJPIDKBGNL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONJPIDKBGNL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ONJPIDKBGNL.class, POGOProtos.Rpc.ONJPIDKBGNL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ONJPIDKBGNL.newBuilder()
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
      dnjeiidkmdp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ccpmnhopffe_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      edaeicajhmh_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONJPIDKBGNL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONJPIDKBGNL getDefaultInstanceForType() {
      return POGOProtos.Rpc.ONJPIDKBGNL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONJPIDKBGNL build() {
      POGOProtos.Rpc.ONJPIDKBGNL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONJPIDKBGNL buildPartial() {
      POGOProtos.Rpc.ONJPIDKBGNL result = new POGOProtos.Rpc.ONJPIDKBGNL(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dnjeiidkmdp_ = java.util.Collections.unmodifiableList(dnjeiidkmdp_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dnjeiidkmdp_ = dnjeiidkmdp_;
      if (((bitField0_ & 0x00000002) != 0)) {
        ccpmnhopffe_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.ccpmnhopffe_ = ccpmnhopffe_;
      result.edaeicajhmh_ = edaeicajhmh_;
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
      if (other instanceof POGOProtos.Rpc.ONJPIDKBGNL) {
        return mergeFrom((POGOProtos.Rpc.ONJPIDKBGNL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ONJPIDKBGNL other) {
      if (other == POGOProtos.Rpc.ONJPIDKBGNL.getDefaultInstance()) return this;
      if (!other.dnjeiidkmdp_.isEmpty()) {
        if (dnjeiidkmdp_.isEmpty()) {
          dnjeiidkmdp_ = other.dnjeiidkmdp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDnjeiidkmdpIsMutable();
          dnjeiidkmdp_.addAll(other.dnjeiidkmdp_);
        }
        onChanged();
      }
      if (!other.ccpmnhopffe_.isEmpty()) {
        if (ccpmnhopffe_.isEmpty()) {
          ccpmnhopffe_ = other.ccpmnhopffe_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCcpmnhopffeIsMutable();
          ccpmnhopffe_.addAll(other.ccpmnhopffe_);
        }
        onChanged();
      }
      if (other.getEdaeicajhmh() != 0D) {
        setEdaeicajhmh(other.getEdaeicajhmh());
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
      POGOProtos.Rpc.ONJPIDKBGNL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ONJPIDKBGNL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> dnjeiidkmdp_ =
      java.util.Collections.emptyList();
    private void ensureDnjeiidkmdpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dnjeiidkmdp_ = new java.util.ArrayList<java.lang.Integer>(dnjeiidkmdp_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @return A list containing the dnjeiidkmdp.
     */
    public java.util.List<POGOProtos.Rpc.EAFFLJCABOK> getDnjeiidkmdpList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.EAFFLJCABOK>(dnjeiidkmdp_, dnjeiidkmdp_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @return The count of dnjeiidkmdp.
     */
    public int getDnjeiidkmdpCount() {
      return dnjeiidkmdp_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param index The index of the element to return.
     * @return The dnjeiidkmdp at the given index.
     */
    public POGOProtos.Rpc.EAFFLJCABOK getDnjeiidkmdp(int index) {
      return dnjeiidkmdp_converter_.convert(dnjeiidkmdp_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param index The index to set the value at.
     * @param value The dnjeiidkmdp to set.
     * @return This builder for chaining.
     */
    public Builder setDnjeiidkmdp(
        int index, POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDnjeiidkmdpIsMutable();
      dnjeiidkmdp_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param value The dnjeiidkmdp to add.
     * @return This builder for chaining.
     */
    public Builder addDnjeiidkmdp(POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDnjeiidkmdpIsMutable();
      dnjeiidkmdp_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param values The dnjeiidkmdp to add.
     * @return This builder for chaining.
     */
    public Builder addAllDnjeiidkmdp(
        java.lang.Iterable<? extends POGOProtos.Rpc.EAFFLJCABOK> values) {
      ensureDnjeiidkmdpIsMutable();
      for (POGOProtos.Rpc.EAFFLJCABOK value : values) {
        dnjeiidkmdp_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDnjeiidkmdp() {
      dnjeiidkmdp_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @return A list containing the enum numeric values on the wire for dnjeiidkmdp.
     */
    public java.util.List<java.lang.Integer>
    getDnjeiidkmdpValueList() {
      return java.util.Collections.unmodifiableList(dnjeiidkmdp_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of dnjeiidkmdp at the given index.
     */
    public int getDnjeiidkmdpValue(int index) {
      return dnjeiidkmdp_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of dnjeiidkmdp at the given index.
     * @return This builder for chaining.
     */
    public Builder setDnjeiidkmdpValue(
        int index, int value) {
      ensureDnjeiidkmdpIsMutable();
      dnjeiidkmdp_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param value The enum numeric value on the wire for dnjeiidkmdp to add.
     * @return This builder for chaining.
     */
    public Builder addDnjeiidkmdpValue(int value) {
      ensureDnjeiidkmdpIsMutable();
      dnjeiidkmdp_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EAFFLJCABOK dnjeiidkmdp = 1;</code>
     * @param values The enum numeric values on the wire for dnjeiidkmdp to add.
     * @return This builder for chaining.
     */
    public Builder addAllDnjeiidkmdpValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDnjeiidkmdpIsMutable();
      for (int value : values) {
        dnjeiidkmdp_.add(value);
      }
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList ccpmnhopffe_ = emptyFloatList();
    private void ensureCcpmnhopffeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        ccpmnhopffe_ = mutableCopy(ccpmnhopffe_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @return A list containing the ccpmnhopffe.
     */
    public java.util.List<java.lang.Float>
        getCcpmnhopffeList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(ccpmnhopffe_) : ccpmnhopffe_;
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @return The count of ccpmnhopffe.
     */
    public int getCcpmnhopffeCount() {
      return ccpmnhopffe_.size();
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @param index The index of the element to return.
     * @return The ccpmnhopffe at the given index.
     */
    public float getCcpmnhopffe(int index) {
      return ccpmnhopffe_.getFloat(index);
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @param index The index to set the value at.
     * @param value The ccpmnhopffe to set.
     * @return This builder for chaining.
     */
    public Builder setCcpmnhopffe(
        int index, float value) {
      ensureCcpmnhopffeIsMutable();
      ccpmnhopffe_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @param value The ccpmnhopffe to add.
     * @return This builder for chaining.
     */
    public Builder addCcpmnhopffe(float value) {
      ensureCcpmnhopffeIsMutable();
      ccpmnhopffe_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @param values The ccpmnhopffe to add.
     * @return This builder for chaining.
     */
    public Builder addAllCcpmnhopffe(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureCcpmnhopffeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ccpmnhopffe_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ccpmnhopffe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCcpmnhopffe() {
      ccpmnhopffe_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private double edaeicajhmh_ ;
    /**
     * <code>double edaeicajhmh = 3;</code>
     * @return The edaeicajhmh.
     */
    public double getEdaeicajhmh() {
      return edaeicajhmh_;
    }
    /**
     * <code>double edaeicajhmh = 3;</code>
     * @param value The edaeicajhmh to set.
     * @return This builder for chaining.
     */
    public Builder setEdaeicajhmh(double value) {
      
      edaeicajhmh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double edaeicajhmh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEdaeicajhmh() {
      
      edaeicajhmh_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ONJPIDKBGNL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ONJPIDKBGNL)
  private static final POGOProtos.Rpc.ONJPIDKBGNL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ONJPIDKBGNL();
  }

  public static POGOProtos.Rpc.ONJPIDKBGNL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ONJPIDKBGNL>
      PARSER = new com.google.protobuf.AbstractParser<ONJPIDKBGNL>() {
    @java.lang.Override
    public ONJPIDKBGNL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ONJPIDKBGNL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ONJPIDKBGNL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ONJPIDKBGNL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ONJPIDKBGNL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

