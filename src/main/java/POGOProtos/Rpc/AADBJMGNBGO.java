// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AADBJMGNBGO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AADBJMGNBGO}
 */
public final class AADBJMGNBGO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AADBJMGNBGO)
    AADBJMGNBGOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AADBJMGNBGO.newBuilder() to construct.
  private AADBJMGNBGO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AADBJMGNBGO() {
    leehhlngfeo_ = "";
    ikfegknamcc_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AADBJMGNBGO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AADBJMGNBGO(
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

            leehhlngfeo_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ikfegknamcc_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            ikfegknamcc_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              ikfegknamcc_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ikfegknamcc_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {

            ehljfpgcdki_ = input.readUInt64();
            break;
          }
          case 33: {

            acbjkipgmcl_ = input.readDouble();
            break;
          }
          case 41: {

            haoplpbmplb_ = input.readDouble();
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
        ikfegknamcc_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AADBJMGNBGO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AADBJMGNBGO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AADBJMGNBGO.class, POGOProtos.Rpc.AADBJMGNBGO.Builder.class);
  }

  public static final int LEEHHLNGFEO_FIELD_NUMBER = 1;
  private volatile java.lang.Object leehhlngfeo_;
  /**
   * <code>string leehhlngfeo = 1;</code>
   * @return The leehhlngfeo.
   */
  @java.lang.Override
  public java.lang.String getLeehhlngfeo() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leehhlngfeo_ = s;
      return s;
    }
  }
  /**
   * <code>string leehhlngfeo = 1;</code>
   * @return The bytes for leehhlngfeo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLeehhlngfeoBytes() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leehhlngfeo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IKFEGKNAMCC_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList ikfegknamcc_;
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @return A list containing the ikfegknamcc.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getIkfegknamccList() {
    return ikfegknamcc_;
  }
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @return The count of ikfegknamcc.
   */
  public int getIkfegknamccCount() {
    return ikfegknamcc_.size();
  }
  /**
   * <code>repeated uint64 ikfegknamcc = 2;</code>
   * @param index The index of the element to return.
   * @return The ikfegknamcc at the given index.
   */
  public long getIkfegknamcc(int index) {
    return ikfegknamcc_.getLong(index);
  }
  private int ikfegknamccMemoizedSerializedSize = -1;

  public static final int EHLJFPGCDKI_FIELD_NUMBER = 3;
  private long ehljfpgcdki_;
  /**
   * <code>uint64 ehljfpgcdki = 3;</code>
   * @return The ehljfpgcdki.
   */
  @java.lang.Override
  public long getEhljfpgcdki() {
    return ehljfpgcdki_;
  }

  public static final int ACBJKIPGMCL_FIELD_NUMBER = 4;
  private double acbjkipgmcl_;
  /**
   * <code>double acbjkipgmcl = 4;</code>
   * @return The acbjkipgmcl.
   */
  @java.lang.Override
  public double getAcbjkipgmcl() {
    return acbjkipgmcl_;
  }

  public static final int HAOPLPBMPLB_FIELD_NUMBER = 5;
  private double haoplpbmplb_;
  /**
   * <code>double haoplpbmplb = 5;</code>
   * @return The haoplpbmplb.
   */
  @java.lang.Override
  public double getHaoplpbmplb() {
    return haoplpbmplb_;
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
    if (!getLeehhlngfeoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, leehhlngfeo_);
    }
    if (getIkfegknamccList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(ikfegknamccMemoizedSerializedSize);
    }
    for (int i = 0; i < ikfegknamcc_.size(); i++) {
      output.writeUInt64NoTag(ikfegknamcc_.getLong(i));
    }
    if (ehljfpgcdki_ != 0L) {
      output.writeUInt64(3, ehljfpgcdki_);
    }
    if (acbjkipgmcl_ != 0D) {
      output.writeDouble(4, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      output.writeDouble(5, haoplpbmplb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLeehhlngfeoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, leehhlngfeo_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ikfegknamcc_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(ikfegknamcc_.getLong(i));
      }
      size += dataSize;
      if (!getIkfegknamccList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ikfegknamccMemoizedSerializedSize = dataSize;
    }
    if (ehljfpgcdki_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, ehljfpgcdki_);
    }
    if (acbjkipgmcl_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, haoplpbmplb_);
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
    if (!(obj instanceof POGOProtos.Rpc.AADBJMGNBGO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AADBJMGNBGO other = (POGOProtos.Rpc.AADBJMGNBGO) obj;

    if (!getLeehhlngfeo()
        .equals(other.getLeehhlngfeo())) return false;
    if (!getIkfegknamccList()
        .equals(other.getIkfegknamccList())) return false;
    if (getEhljfpgcdki()
        != other.getEhljfpgcdki()) return false;
    if (java.lang.Double.doubleToLongBits(getAcbjkipgmcl())
        != java.lang.Double.doubleToLongBits(
            other.getAcbjkipgmcl())) return false;
    if (java.lang.Double.doubleToLongBits(getHaoplpbmplb())
        != java.lang.Double.doubleToLongBits(
            other.getHaoplpbmplb())) return false;
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
    hash = (37 * hash) + LEEHHLNGFEO_FIELD_NUMBER;
    hash = (53 * hash) + getLeehhlngfeo().hashCode();
    if (getIkfegknamccCount() > 0) {
      hash = (37 * hash) + IKFEGKNAMCC_FIELD_NUMBER;
      hash = (53 * hash) + getIkfegknamccList().hashCode();
    }
    hash = (37 * hash) + EHLJFPGCDKI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEhljfpgcdki());
    hash = (37 * hash) + ACBJKIPGMCL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAcbjkipgmcl()));
    hash = (37 * hash) + HAOPLPBMPLB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHaoplpbmplb()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AADBJMGNBGO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AADBJMGNBGO prototype) {
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
   * ref: AADBJMGNBGO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AADBJMGNBGO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AADBJMGNBGO)
      POGOProtos.Rpc.AADBJMGNBGOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AADBJMGNBGO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AADBJMGNBGO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AADBJMGNBGO.class, POGOProtos.Rpc.AADBJMGNBGO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AADBJMGNBGO.newBuilder()
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
      leehhlngfeo_ = "";

      ikfegknamcc_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ehljfpgcdki_ = 0L;

      acbjkipgmcl_ = 0D;

      haoplpbmplb_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AADBJMGNBGO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AADBJMGNBGO getDefaultInstanceForType() {
      return POGOProtos.Rpc.AADBJMGNBGO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AADBJMGNBGO build() {
      POGOProtos.Rpc.AADBJMGNBGO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AADBJMGNBGO buildPartial() {
      POGOProtos.Rpc.AADBJMGNBGO result = new POGOProtos.Rpc.AADBJMGNBGO(this);
      int from_bitField0_ = bitField0_;
      result.leehhlngfeo_ = leehhlngfeo_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ikfegknamcc_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ikfegknamcc_ = ikfegknamcc_;
      result.ehljfpgcdki_ = ehljfpgcdki_;
      result.acbjkipgmcl_ = acbjkipgmcl_;
      result.haoplpbmplb_ = haoplpbmplb_;
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
      if (other instanceof POGOProtos.Rpc.AADBJMGNBGO) {
        return mergeFrom((POGOProtos.Rpc.AADBJMGNBGO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AADBJMGNBGO other) {
      if (other == POGOProtos.Rpc.AADBJMGNBGO.getDefaultInstance()) return this;
      if (!other.getLeehhlngfeo().isEmpty()) {
        leehhlngfeo_ = other.leehhlngfeo_;
        onChanged();
      }
      if (!other.ikfegknamcc_.isEmpty()) {
        if (ikfegknamcc_.isEmpty()) {
          ikfegknamcc_ = other.ikfegknamcc_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIkfegknamccIsMutable();
          ikfegknamcc_.addAll(other.ikfegknamcc_);
        }
        onChanged();
      }
      if (other.getEhljfpgcdki() != 0L) {
        setEhljfpgcdki(other.getEhljfpgcdki());
      }
      if (other.getAcbjkipgmcl() != 0D) {
        setAcbjkipgmcl(other.getAcbjkipgmcl());
      }
      if (other.getHaoplpbmplb() != 0D) {
        setHaoplpbmplb(other.getHaoplpbmplb());
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
      POGOProtos.Rpc.AADBJMGNBGO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AADBJMGNBGO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object leehhlngfeo_ = "";
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return The leehhlngfeo.
     */
    public java.lang.String getLeehhlngfeo() {
      java.lang.Object ref = leehhlngfeo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leehhlngfeo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return The bytes for leehhlngfeo.
     */
    public com.google.protobuf.ByteString
        getLeehhlngfeoBytes() {
      java.lang.Object ref = leehhlngfeo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leehhlngfeo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @param value The leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeehhlngfeo() {
      
      leehhlngfeo_ = getDefaultInstance().getLeehhlngfeo();
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @param value The bytes for leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList ikfegknamcc_ = emptyLongList();
    private void ensureIkfegknamccIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ikfegknamcc_ = mutableCopy(ikfegknamcc_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return A list containing the ikfegknamcc.
     */
    public java.util.List<java.lang.Long>
        getIkfegknamccList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ikfegknamcc_) : ikfegknamcc_;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return The count of ikfegknamcc.
     */
    public int getIkfegknamccCount() {
      return ikfegknamcc_.size();
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param index The index of the element to return.
     * @return The ikfegknamcc at the given index.
     */
    public long getIkfegknamcc(int index) {
      return ikfegknamcc_.getLong(index);
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param index The index to set the value at.
     * @param value The ikfegknamcc to set.
     * @return This builder for chaining.
     */
    public Builder setIkfegknamcc(
        int index, long value) {
      ensureIkfegknamccIsMutable();
      ikfegknamcc_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param value The ikfegknamcc to add.
     * @return This builder for chaining.
     */
    public Builder addIkfegknamcc(long value) {
      ensureIkfegknamccIsMutable();
      ikfegknamcc_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @param values The ikfegknamcc to add.
     * @return This builder for chaining.
     */
    public Builder addAllIkfegknamcc(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIkfegknamccIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ikfegknamcc_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ikfegknamcc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIkfegknamcc() {
      ikfegknamcc_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long ehljfpgcdki_ ;
    /**
     * <code>uint64 ehljfpgcdki = 3;</code>
     * @return The ehljfpgcdki.
     */
    @java.lang.Override
    public long getEhljfpgcdki() {
      return ehljfpgcdki_;
    }
    /**
     * <code>uint64 ehljfpgcdki = 3;</code>
     * @param value The ehljfpgcdki to set.
     * @return This builder for chaining.
     */
    public Builder setEhljfpgcdki(long value) {
      
      ehljfpgcdki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ehljfpgcdki = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEhljfpgcdki() {
      
      ehljfpgcdki_ = 0L;
      onChanged();
      return this;
    }

    private double acbjkipgmcl_ ;
    /**
     * <code>double acbjkipgmcl = 4;</code>
     * @return The acbjkipgmcl.
     */
    @java.lang.Override
    public double getAcbjkipgmcl() {
      return acbjkipgmcl_;
    }
    /**
     * <code>double acbjkipgmcl = 4;</code>
     * @param value The acbjkipgmcl to set.
     * @return This builder for chaining.
     */
    public Builder setAcbjkipgmcl(double value) {
      
      acbjkipgmcl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double acbjkipgmcl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcbjkipgmcl() {
      
      acbjkipgmcl_ = 0D;
      onChanged();
      return this;
    }

    private double haoplpbmplb_ ;
    /**
     * <code>double haoplpbmplb = 5;</code>
     * @return The haoplpbmplb.
     */
    @java.lang.Override
    public double getHaoplpbmplb() {
      return haoplpbmplb_;
    }
    /**
     * <code>double haoplpbmplb = 5;</code>
     * @param value The haoplpbmplb to set.
     * @return This builder for chaining.
     */
    public Builder setHaoplpbmplb(double value) {
      
      haoplpbmplb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double haoplpbmplb = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHaoplpbmplb() {
      
      haoplpbmplb_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AADBJMGNBGO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AADBJMGNBGO)
  private static final POGOProtos.Rpc.AADBJMGNBGO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AADBJMGNBGO();
  }

  public static POGOProtos.Rpc.AADBJMGNBGO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AADBJMGNBGO>
      PARSER = new com.google.protobuf.AbstractParser<AADBJMGNBGO>() {
    @java.lang.Override
    public AADBJMGNBGO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AADBJMGNBGO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AADBJMGNBGO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AADBJMGNBGO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AADBJMGNBGO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

