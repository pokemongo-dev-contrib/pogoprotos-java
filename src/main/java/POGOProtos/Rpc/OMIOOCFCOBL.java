// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OMIOOCFCOBL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OMIOOCFCOBL}
 */
public final class OMIOOCFCOBL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OMIOOCFCOBL)
    OMIOOCFCOBLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OMIOOCFCOBL.newBuilder() to construct.
  private OMIOOCFCOBL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OMIOOCFCOBL() {
    gigaliikfhd_ = java.util.Collections.emptyList();
    kapffmmbapl_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OMIOOCFCOBL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OMIOOCFCOBL(
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
              gigaliikfhd_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            gigaliikfhd_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gigaliikfhd_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              gigaliikfhd_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              kapffmmbapl_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            kapffmmbapl_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                kapffmmbapl_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              kapffmmbapl_.add(rawValue);
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
        gigaliikfhd_ = java.util.Collections.unmodifiableList(gigaliikfhd_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        kapffmmbapl_ = java.util.Collections.unmodifiableList(kapffmmbapl_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OMIOOCFCOBL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OMIOOCFCOBL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OMIOOCFCOBL.class, POGOProtos.Rpc.OMIOOCFCOBL.Builder.class);
  }

  public static final int GIGALIIKFHD_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> gigaliikfhd_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN> gigaliikfhd_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>() {
            public POGOProtos.Rpc.BOPHHCGLLEN convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.BOPHHCGLLEN result = POGOProtos.Rpc.BOPHHCGLLEN.valueOf(from);
              return result == null ? POGOProtos.Rpc.BOPHHCGLLEN.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
   * @return A list containing the gigaliikfhd.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BOPHHCGLLEN> getGigaliikfhdList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>(gigaliikfhd_, gigaliikfhd_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
   * @return The count of gigaliikfhd.
   */
  @java.lang.Override
  public int getGigaliikfhdCount() {
    return gigaliikfhd_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
   * @param index The index of the element to return.
   * @return The gigaliikfhd at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BOPHHCGLLEN getGigaliikfhd(int index) {
    return gigaliikfhd_converter_.convert(gigaliikfhd_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
   * @return A list containing the enum numeric values on the wire for gigaliikfhd.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getGigaliikfhdValueList() {
    return gigaliikfhd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of gigaliikfhd at the given index.
   */
  @java.lang.Override
  public int getGigaliikfhdValue(int index) {
    return gigaliikfhd_.get(index);
  }
  private int gigaliikfhdMemoizedSerializedSize;

  public static final int KAPFFMMBAPL_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> kapffmmbapl_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN> kapffmmbapl_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>() {
            public POGOProtos.Rpc.BOPHHCGLLEN convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.BOPHHCGLLEN result = POGOProtos.Rpc.BOPHHCGLLEN.valueOf(from);
              return result == null ? POGOProtos.Rpc.BOPHHCGLLEN.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
   * @return A list containing the kapffmmbapl.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BOPHHCGLLEN> getKapffmmbaplList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>(kapffmmbapl_, kapffmmbapl_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
   * @return The count of kapffmmbapl.
   */
  @java.lang.Override
  public int getKapffmmbaplCount() {
    return kapffmmbapl_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
   * @param index The index of the element to return.
   * @return The kapffmmbapl at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BOPHHCGLLEN getKapffmmbapl(int index) {
    return kapffmmbapl_converter_.convert(kapffmmbapl_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
   * @return A list containing the enum numeric values on the wire for kapffmmbapl.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getKapffmmbaplValueList() {
    return kapffmmbapl_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of kapffmmbapl at the given index.
   */
  @java.lang.Override
  public int getKapffmmbaplValue(int index) {
    return kapffmmbapl_.get(index);
  }
  private int kapffmmbaplMemoizedSerializedSize;

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
    if (getGigaliikfhdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(gigaliikfhdMemoizedSerializedSize);
    }
    for (int i = 0; i < gigaliikfhd_.size(); i++) {
      output.writeEnumNoTag(gigaliikfhd_.get(i));
    }
    if (getKapffmmbaplList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(kapffmmbaplMemoizedSerializedSize);
    }
    for (int i = 0; i < kapffmmbapl_.size(); i++) {
      output.writeEnumNoTag(kapffmmbapl_.get(i));
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
      for (int i = 0; i < gigaliikfhd_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(gigaliikfhd_.get(i));
      }
      size += dataSize;
      if (!getGigaliikfhdList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }gigaliikfhdMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < kapffmmbapl_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(kapffmmbapl_.get(i));
      }
      size += dataSize;
      if (!getKapffmmbaplList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }kapffmmbaplMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.OMIOOCFCOBL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OMIOOCFCOBL other = (POGOProtos.Rpc.OMIOOCFCOBL) obj;

    if (!gigaliikfhd_.equals(other.gigaliikfhd_)) return false;
    if (!kapffmmbapl_.equals(other.kapffmmbapl_)) return false;
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
    if (getGigaliikfhdCount() > 0) {
      hash = (37 * hash) + GIGALIIKFHD_FIELD_NUMBER;
      hash = (53 * hash) + gigaliikfhd_.hashCode();
    }
    if (getKapffmmbaplCount() > 0) {
      hash = (37 * hash) + KAPFFMMBAPL_FIELD_NUMBER;
      hash = (53 * hash) + kapffmmbapl_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OMIOOCFCOBL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OMIOOCFCOBL prototype) {
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
   * ref: OMIOOCFCOBL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OMIOOCFCOBL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OMIOOCFCOBL)
      POGOProtos.Rpc.OMIOOCFCOBLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OMIOOCFCOBL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OMIOOCFCOBL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OMIOOCFCOBL.class, POGOProtos.Rpc.OMIOOCFCOBL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OMIOOCFCOBL.newBuilder()
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
      gigaliikfhd_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      kapffmmbapl_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OMIOOCFCOBL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OMIOOCFCOBL getDefaultInstanceForType() {
      return POGOProtos.Rpc.OMIOOCFCOBL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OMIOOCFCOBL build() {
      POGOProtos.Rpc.OMIOOCFCOBL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OMIOOCFCOBL buildPartial() {
      POGOProtos.Rpc.OMIOOCFCOBL result = new POGOProtos.Rpc.OMIOOCFCOBL(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        gigaliikfhd_ = java.util.Collections.unmodifiableList(gigaliikfhd_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.gigaliikfhd_ = gigaliikfhd_;
      if (((bitField0_ & 0x00000002) != 0)) {
        kapffmmbapl_ = java.util.Collections.unmodifiableList(kapffmmbapl_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.kapffmmbapl_ = kapffmmbapl_;
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
      if (other instanceof POGOProtos.Rpc.OMIOOCFCOBL) {
        return mergeFrom((POGOProtos.Rpc.OMIOOCFCOBL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OMIOOCFCOBL other) {
      if (other == POGOProtos.Rpc.OMIOOCFCOBL.getDefaultInstance()) return this;
      if (!other.gigaliikfhd_.isEmpty()) {
        if (gigaliikfhd_.isEmpty()) {
          gigaliikfhd_ = other.gigaliikfhd_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGigaliikfhdIsMutable();
          gigaliikfhd_.addAll(other.gigaliikfhd_);
        }
        onChanged();
      }
      if (!other.kapffmmbapl_.isEmpty()) {
        if (kapffmmbapl_.isEmpty()) {
          kapffmmbapl_ = other.kapffmmbapl_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureKapffmmbaplIsMutable();
          kapffmmbapl_.addAll(other.kapffmmbapl_);
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
      POGOProtos.Rpc.OMIOOCFCOBL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OMIOOCFCOBL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> gigaliikfhd_ =
      java.util.Collections.emptyList();
    private void ensureGigaliikfhdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gigaliikfhd_ = new java.util.ArrayList<java.lang.Integer>(gigaliikfhd_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @return A list containing the gigaliikfhd.
     */
    public java.util.List<POGOProtos.Rpc.BOPHHCGLLEN> getGigaliikfhdList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>(gigaliikfhd_, gigaliikfhd_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @return The count of gigaliikfhd.
     */
    public int getGigaliikfhdCount() {
      return gigaliikfhd_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param index The index of the element to return.
     * @return The gigaliikfhd at the given index.
     */
    public POGOProtos.Rpc.BOPHHCGLLEN getGigaliikfhd(int index) {
      return gigaliikfhd_converter_.convert(gigaliikfhd_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param index The index to set the value at.
     * @param value The gigaliikfhd to set.
     * @return This builder for chaining.
     */
    public Builder setGigaliikfhd(
        int index, POGOProtos.Rpc.BOPHHCGLLEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGigaliikfhdIsMutable();
      gigaliikfhd_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param value The gigaliikfhd to add.
     * @return This builder for chaining.
     */
    public Builder addGigaliikfhd(POGOProtos.Rpc.BOPHHCGLLEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGigaliikfhdIsMutable();
      gigaliikfhd_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param values The gigaliikfhd to add.
     * @return This builder for chaining.
     */
    public Builder addAllGigaliikfhd(
        java.lang.Iterable<? extends POGOProtos.Rpc.BOPHHCGLLEN> values) {
      ensureGigaliikfhdIsMutable();
      for (POGOProtos.Rpc.BOPHHCGLLEN value : values) {
        gigaliikfhd_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGigaliikfhd() {
      gigaliikfhd_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @return A list containing the enum numeric values on the wire for gigaliikfhd.
     */
    public java.util.List<java.lang.Integer>
    getGigaliikfhdValueList() {
      return java.util.Collections.unmodifiableList(gigaliikfhd_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gigaliikfhd at the given index.
     */
    public int getGigaliikfhdValue(int index) {
      return gigaliikfhd_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of gigaliikfhd at the given index.
     * @return This builder for chaining.
     */
    public Builder setGigaliikfhdValue(
        int index, int value) {
      ensureGigaliikfhdIsMutable();
      gigaliikfhd_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param value The enum numeric value on the wire for gigaliikfhd to add.
     * @return This builder for chaining.
     */
    public Builder addGigaliikfhdValue(int value) {
      ensureGigaliikfhdIsMutable();
      gigaliikfhd_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN gigaliikfhd = 1;</code>
     * @param values The enum numeric values on the wire for gigaliikfhd to add.
     * @return This builder for chaining.
     */
    public Builder addAllGigaliikfhdValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureGigaliikfhdIsMutable();
      for (int value : values) {
        gigaliikfhd_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> kapffmmbapl_ =
      java.util.Collections.emptyList();
    private void ensureKapffmmbaplIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        kapffmmbapl_ = new java.util.ArrayList<java.lang.Integer>(kapffmmbapl_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @return A list containing the kapffmmbapl.
     */
    public java.util.List<POGOProtos.Rpc.BOPHHCGLLEN> getKapffmmbaplList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.BOPHHCGLLEN>(kapffmmbapl_, kapffmmbapl_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @return The count of kapffmmbapl.
     */
    public int getKapffmmbaplCount() {
      return kapffmmbapl_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param index The index of the element to return.
     * @return The kapffmmbapl at the given index.
     */
    public POGOProtos.Rpc.BOPHHCGLLEN getKapffmmbapl(int index) {
      return kapffmmbapl_converter_.convert(kapffmmbapl_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param index The index to set the value at.
     * @param value The kapffmmbapl to set.
     * @return This builder for chaining.
     */
    public Builder setKapffmmbapl(
        int index, POGOProtos.Rpc.BOPHHCGLLEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKapffmmbaplIsMutable();
      kapffmmbapl_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param value The kapffmmbapl to add.
     * @return This builder for chaining.
     */
    public Builder addKapffmmbapl(POGOProtos.Rpc.BOPHHCGLLEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKapffmmbaplIsMutable();
      kapffmmbapl_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param values The kapffmmbapl to add.
     * @return This builder for chaining.
     */
    public Builder addAllKapffmmbapl(
        java.lang.Iterable<? extends POGOProtos.Rpc.BOPHHCGLLEN> values) {
      ensureKapffmmbaplIsMutable();
      for (POGOProtos.Rpc.BOPHHCGLLEN value : values) {
        kapffmmbapl_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKapffmmbapl() {
      kapffmmbapl_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @return A list containing the enum numeric values on the wire for kapffmmbapl.
     */
    public java.util.List<java.lang.Integer>
    getKapffmmbaplValueList() {
      return java.util.Collections.unmodifiableList(kapffmmbapl_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of kapffmmbapl at the given index.
     */
    public int getKapffmmbaplValue(int index) {
      return kapffmmbapl_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of kapffmmbapl at the given index.
     * @return This builder for chaining.
     */
    public Builder setKapffmmbaplValue(
        int index, int value) {
      ensureKapffmmbaplIsMutable();
      kapffmmbapl_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param value The enum numeric value on the wire for kapffmmbapl to add.
     * @return This builder for chaining.
     */
    public Builder addKapffmmbaplValue(int value) {
      ensureKapffmmbaplIsMutable();
      kapffmmbapl_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BOPHHCGLLEN kapffmmbapl = 2;</code>
     * @param values The enum numeric values on the wire for kapffmmbapl to add.
     * @return This builder for chaining.
     */
    public Builder addAllKapffmmbaplValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureKapffmmbaplIsMutable();
      for (int value : values) {
        kapffmmbapl_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OMIOOCFCOBL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OMIOOCFCOBL)
  private static final POGOProtos.Rpc.OMIOOCFCOBL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OMIOOCFCOBL();
  }

  public static POGOProtos.Rpc.OMIOOCFCOBL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OMIOOCFCOBL>
      PARSER = new com.google.protobuf.AbstractParser<OMIOOCFCOBL>() {
    @java.lang.Override
    public OMIOOCFCOBL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OMIOOCFCOBL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OMIOOCFCOBL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OMIOOCFCOBL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OMIOOCFCOBL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

