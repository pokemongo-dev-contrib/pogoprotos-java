// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.HPKBCNMNFKO}
 */
public  final class HPKBCNMNFKO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HPKBCNMNFKO)
    HPKBCNMNFKOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HPKBCNMNFKO.newBuilder() to construct.
  private HPKBCNMNFKO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HPKBCNMNFKO() {
    ofocokhppdn_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HPKBCNMNFKO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HPKBCNMNFKO(
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

            egahchkiegi_ = input.readInt64();
            break;
          }
          case 16: {

            fjjmhjlfiai_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ofocokhppdn_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            ofocokhppdn_.add(rawValue);
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ofocokhppdn_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              ofocokhppdn_.add(rawValue);
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
        ofocokhppdn_ = java.util.Collections.unmodifiableList(ofocokhppdn_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_HPKBCNMNFKO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_HPKBCNMNFKO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HPKBCNMNFKO.class, POGOProtos.Rpc.HPKBCNMNFKO.Builder.class);
  }

  public static final int EGAHCHKIEGI_FIELD_NUMBER = 1;
  private long egahchkiegi_;
  /**
   * <code>int64 egahchkiegi = 1;</code>
   * @return The egahchkiegi.
   */
  public long getEgahchkiegi() {
    return egahchkiegi_;
  }

  public static final int FJJMHJLFIAI_FIELD_NUMBER = 2;
  private long fjjmhjlfiai_;
  /**
   * <code>int64 fjjmhjlfiai = 2;</code>
   * @return The fjjmhjlfiai.
   */
  public long getFjjmhjlfiai() {
    return fjjmhjlfiai_;
  }

  public static final int OFOCOKHPPDN_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> ofocokhppdn_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HCGPCEADABI> ofocokhppdn_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HCGPCEADABI>() {
            public POGOProtos.Rpc.HCGPCEADABI convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HCGPCEADABI result = POGOProtos.Rpc.HCGPCEADABI.valueOf(from);
              return result == null ? POGOProtos.Rpc.HCGPCEADABI.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
   * @return A list containing the ofocokhppdn.
   */
  public java.util.List<POGOProtos.Rpc.HCGPCEADABI> getOfocokhppdnList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HCGPCEADABI>(ofocokhppdn_, ofocokhppdn_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
   * @return The count of ofocokhppdn.
   */
  public int getOfocokhppdnCount() {
    return ofocokhppdn_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
   * @param index The index of the element to return.
   * @return The ofocokhppdn at the given index.
   */
  public POGOProtos.Rpc.HCGPCEADABI getOfocokhppdn(int index) {
    return ofocokhppdn_converter_.convert(ofocokhppdn_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
   * @return A list containing the enum numeric values on the wire for ofocokhppdn.
   */
  public java.util.List<java.lang.Integer>
  getOfocokhppdnValueList() {
    return ofocokhppdn_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ofocokhppdn at the given index.
   */
  public int getOfocokhppdnValue(int index) {
    return ofocokhppdn_.get(index);
  }
  private int ofocokhppdnMemoizedSerializedSize;

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
    if (egahchkiegi_ != 0L) {
      output.writeInt64(1, egahchkiegi_);
    }
    if (fjjmhjlfiai_ != 0L) {
      output.writeInt64(2, fjjmhjlfiai_);
    }
    if (getOfocokhppdnList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(ofocokhppdnMemoizedSerializedSize);
    }
    for (int i = 0; i < ofocokhppdn_.size(); i++) {
      output.writeEnumNoTag(ofocokhppdn_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (egahchkiegi_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, egahchkiegi_);
    }
    if (fjjmhjlfiai_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fjjmhjlfiai_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ofocokhppdn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(ofocokhppdn_.get(i));
      }
      size += dataSize;
      if (!getOfocokhppdnList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }ofocokhppdnMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.HPKBCNMNFKO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HPKBCNMNFKO other = (POGOProtos.Rpc.HPKBCNMNFKO) obj;

    if (getEgahchkiegi()
        != other.getEgahchkiegi()) return false;
    if (getFjjmhjlfiai()
        != other.getFjjmhjlfiai()) return false;
    if (!ofocokhppdn_.equals(other.ofocokhppdn_)) return false;
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
    hash = (37 * hash) + EGAHCHKIEGI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEgahchkiegi());
    hash = (37 * hash) + FJJMHJLFIAI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFjjmhjlfiai());
    if (getOfocokhppdnCount() > 0) {
      hash = (37 * hash) + OFOCOKHPPDN_FIELD_NUMBER;
      hash = (53 * hash) + ofocokhppdn_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPKBCNMNFKO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HPKBCNMNFKO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.HPKBCNMNFKO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HPKBCNMNFKO)
      POGOProtos.Rpc.HPKBCNMNFKOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_HPKBCNMNFKO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_HPKBCNMNFKO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HPKBCNMNFKO.class, POGOProtos.Rpc.HPKBCNMNFKO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HPKBCNMNFKO.newBuilder()
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
      egahchkiegi_ = 0L;

      fjjmhjlfiai_ = 0L;

      ofocokhppdn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_HPKBCNMNFKO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPKBCNMNFKO getDefaultInstanceForType() {
      return POGOProtos.Rpc.HPKBCNMNFKO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPKBCNMNFKO build() {
      POGOProtos.Rpc.HPKBCNMNFKO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPKBCNMNFKO buildPartial() {
      POGOProtos.Rpc.HPKBCNMNFKO result = new POGOProtos.Rpc.HPKBCNMNFKO(this);
      int from_bitField0_ = bitField0_;
      result.egahchkiegi_ = egahchkiegi_;
      result.fjjmhjlfiai_ = fjjmhjlfiai_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ofocokhppdn_ = java.util.Collections.unmodifiableList(ofocokhppdn_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ofocokhppdn_ = ofocokhppdn_;
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
      if (other instanceof POGOProtos.Rpc.HPKBCNMNFKO) {
        return mergeFrom((POGOProtos.Rpc.HPKBCNMNFKO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HPKBCNMNFKO other) {
      if (other == POGOProtos.Rpc.HPKBCNMNFKO.getDefaultInstance()) return this;
      if (other.getEgahchkiegi() != 0L) {
        setEgahchkiegi(other.getEgahchkiegi());
      }
      if (other.getFjjmhjlfiai() != 0L) {
        setFjjmhjlfiai(other.getFjjmhjlfiai());
      }
      if (!other.ofocokhppdn_.isEmpty()) {
        if (ofocokhppdn_.isEmpty()) {
          ofocokhppdn_ = other.ofocokhppdn_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOfocokhppdnIsMutable();
          ofocokhppdn_.addAll(other.ofocokhppdn_);
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
      POGOProtos.Rpc.HPKBCNMNFKO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HPKBCNMNFKO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long egahchkiegi_ ;
    /**
     * <code>int64 egahchkiegi = 1;</code>
     * @return The egahchkiegi.
     */
    public long getEgahchkiegi() {
      return egahchkiegi_;
    }
    /**
     * <code>int64 egahchkiegi = 1;</code>
     * @param value The egahchkiegi to set.
     * @return This builder for chaining.
     */
    public Builder setEgahchkiegi(long value) {
      
      egahchkiegi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 egahchkiegi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEgahchkiegi() {
      
      egahchkiegi_ = 0L;
      onChanged();
      return this;
    }

    private long fjjmhjlfiai_ ;
    /**
     * <code>int64 fjjmhjlfiai = 2;</code>
     * @return The fjjmhjlfiai.
     */
    public long getFjjmhjlfiai() {
      return fjjmhjlfiai_;
    }
    /**
     * <code>int64 fjjmhjlfiai = 2;</code>
     * @param value The fjjmhjlfiai to set.
     * @return This builder for chaining.
     */
    public Builder setFjjmhjlfiai(long value) {
      
      fjjmhjlfiai_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fjjmhjlfiai = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFjjmhjlfiai() {
      
      fjjmhjlfiai_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> ofocokhppdn_ =
      java.util.Collections.emptyList();
    private void ensureOfocokhppdnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ofocokhppdn_ = new java.util.ArrayList<java.lang.Integer>(ofocokhppdn_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @return A list containing the ofocokhppdn.
     */
    public java.util.List<POGOProtos.Rpc.HCGPCEADABI> getOfocokhppdnList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HCGPCEADABI>(ofocokhppdn_, ofocokhppdn_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @return The count of ofocokhppdn.
     */
    public int getOfocokhppdnCount() {
      return ofocokhppdn_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param index The index of the element to return.
     * @return The ofocokhppdn at the given index.
     */
    public POGOProtos.Rpc.HCGPCEADABI getOfocokhppdn(int index) {
      return ofocokhppdn_converter_.convert(ofocokhppdn_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param index The index to set the value at.
     * @param value The ofocokhppdn to set.
     * @return This builder for chaining.
     */
    public Builder setOfocokhppdn(
        int index, POGOProtos.Rpc.HCGPCEADABI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOfocokhppdnIsMutable();
      ofocokhppdn_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param value The ofocokhppdn to add.
     * @return This builder for chaining.
     */
    public Builder addOfocokhppdn(POGOProtos.Rpc.HCGPCEADABI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOfocokhppdnIsMutable();
      ofocokhppdn_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param values The ofocokhppdn to add.
     * @return This builder for chaining.
     */
    public Builder addAllOfocokhppdn(
        java.lang.Iterable<? extends POGOProtos.Rpc.HCGPCEADABI> values) {
      ensureOfocokhppdnIsMutable();
      for (POGOProtos.Rpc.HCGPCEADABI value : values) {
        ofocokhppdn_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfocokhppdn() {
      ofocokhppdn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @return A list containing the enum numeric values on the wire for ofocokhppdn.
     */
    public java.util.List<java.lang.Integer>
    getOfocokhppdnValueList() {
      return java.util.Collections.unmodifiableList(ofocokhppdn_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of ofocokhppdn at the given index.
     */
    public int getOfocokhppdnValue(int index) {
      return ofocokhppdn_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of ofocokhppdn at the given index.
     * @return This builder for chaining.
     */
    public Builder setOfocokhppdnValue(
        int index, int value) {
      ensureOfocokhppdnIsMutable();
      ofocokhppdn_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param value The enum numeric value on the wire for ofocokhppdn to add.
     * @return This builder for chaining.
     */
    public Builder addOfocokhppdnValue(int value) {
      ensureOfocokhppdnIsMutable();
      ofocokhppdn_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HCGPCEADABI ofocokhppdn = 3;</code>
     * @param values The enum numeric values on the wire for ofocokhppdn to add.
     * @return This builder for chaining.
     */
    public Builder addAllOfocokhppdnValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureOfocokhppdnIsMutable();
      for (int value : values) {
        ofocokhppdn_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HPKBCNMNFKO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HPKBCNMNFKO)
  private static final POGOProtos.Rpc.HPKBCNMNFKO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HPKBCNMNFKO();
  }

  public static POGOProtos.Rpc.HPKBCNMNFKO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HPKBCNMNFKO>
      PARSER = new com.google.protobuf.AbstractParser<HPKBCNMNFKO>() {
    @java.lang.Override
    public HPKBCNMNFKO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HPKBCNMNFKO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HPKBCNMNFKO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HPKBCNMNFKO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HPKBCNMNFKO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

