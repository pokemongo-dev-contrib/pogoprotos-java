// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CJMDGFIPJNI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CJMDGFIPJNI}
 */
public final class CJMDGFIPJNI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CJMDGFIPJNI)
    CJMDGFIPJNIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CJMDGFIPJNI.newBuilder() to construct.
  private CJMDGFIPJNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CJMDGFIPJNI() {
    ghalemcdhah_ = emptyFloatList();
    iilaaedfole_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CJMDGFIPJNI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CJMDGFIPJNI(
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

            jggenglemil_ = input.readInt32();
            break;
          }
          case 16: {

            pepbijdnnam_ = input.readInt32();
            break;
          }
          case 29: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ghalemcdhah_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            ghalemcdhah_.addFloat(input.readFloat());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              ghalemcdhah_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ghalemcdhah_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 37: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              iilaaedfole_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            iilaaedfole_.addFloat(input.readFloat());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              iilaaedfole_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              iilaaedfole_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
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
        ghalemcdhah_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        iilaaedfole_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJMDGFIPJNI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJMDGFIPJNI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CJMDGFIPJNI.class, POGOProtos.Rpc.CJMDGFIPJNI.Builder.class);
  }

  public static final int JGGENGLEMIL_FIELD_NUMBER = 1;
  private int jggenglemil_;
  /**
   * <code>int32 jggenglemil = 1;</code>
   * @return The jggenglemil.
   */
  @java.lang.Override
  public int getJggenglemil() {
    return jggenglemil_;
  }

  public static final int PEPBIJDNNAM_FIELD_NUMBER = 2;
  private int pepbijdnnam_;
  /**
   * <code>int32 pepbijdnnam = 2;</code>
   * @return The pepbijdnnam.
   */
  @java.lang.Override
  public int getPepbijdnnam() {
    return pepbijdnnam_;
  }

  public static final int GHALEMCDHAH_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.FloatList ghalemcdhah_;
  /**
   * <code>repeated float ghalemcdhah = 3;</code>
   * @return A list containing the ghalemcdhah.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getGhalemcdhahList() {
    return ghalemcdhah_;
  }
  /**
   * <code>repeated float ghalemcdhah = 3;</code>
   * @return The count of ghalemcdhah.
   */
  public int getGhalemcdhahCount() {
    return ghalemcdhah_.size();
  }
  /**
   * <code>repeated float ghalemcdhah = 3;</code>
   * @param index The index of the element to return.
   * @return The ghalemcdhah at the given index.
   */
  public float getGhalemcdhah(int index) {
    return ghalemcdhah_.getFloat(index);
  }
  private int ghalemcdhahMemoizedSerializedSize = -1;

  public static final int IILAAEDFOLE_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.FloatList iilaaedfole_;
  /**
   * <code>repeated float iilaaedfole = 4;</code>
   * @return A list containing the iilaaedfole.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getIilaaedfoleList() {
    return iilaaedfole_;
  }
  /**
   * <code>repeated float iilaaedfole = 4;</code>
   * @return The count of iilaaedfole.
   */
  public int getIilaaedfoleCount() {
    return iilaaedfole_.size();
  }
  /**
   * <code>repeated float iilaaedfole = 4;</code>
   * @param index The index of the element to return.
   * @return The iilaaedfole at the given index.
   */
  public float getIilaaedfole(int index) {
    return iilaaedfole_.getFloat(index);
  }
  private int iilaaedfoleMemoizedSerializedSize = -1;

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
    if (jggenglemil_ != 0) {
      output.writeInt32(1, jggenglemil_);
    }
    if (pepbijdnnam_ != 0) {
      output.writeInt32(2, pepbijdnnam_);
    }
    if (getGhalemcdhahList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(ghalemcdhahMemoizedSerializedSize);
    }
    for (int i = 0; i < ghalemcdhah_.size(); i++) {
      output.writeFloatNoTag(ghalemcdhah_.getFloat(i));
    }
    if (getIilaaedfoleList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(iilaaedfoleMemoizedSerializedSize);
    }
    for (int i = 0; i < iilaaedfole_.size(); i++) {
      output.writeFloatNoTag(iilaaedfole_.getFloat(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jggenglemil_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, jggenglemil_);
    }
    if (pepbijdnnam_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pepbijdnnam_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getGhalemcdhahList().size();
      size += dataSize;
      if (!getGhalemcdhahList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ghalemcdhahMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getIilaaedfoleList().size();
      size += dataSize;
      if (!getIilaaedfoleList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      iilaaedfoleMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.CJMDGFIPJNI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CJMDGFIPJNI other = (POGOProtos.Rpc.CJMDGFIPJNI) obj;

    if (getJggenglemil()
        != other.getJggenglemil()) return false;
    if (getPepbijdnnam()
        != other.getPepbijdnnam()) return false;
    if (!getGhalemcdhahList()
        .equals(other.getGhalemcdhahList())) return false;
    if (!getIilaaedfoleList()
        .equals(other.getIilaaedfoleList())) return false;
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
    hash = (37 * hash) + JGGENGLEMIL_FIELD_NUMBER;
    hash = (53 * hash) + getJggenglemil();
    hash = (37 * hash) + PEPBIJDNNAM_FIELD_NUMBER;
    hash = (53 * hash) + getPepbijdnnam();
    if (getGhalemcdhahCount() > 0) {
      hash = (37 * hash) + GHALEMCDHAH_FIELD_NUMBER;
      hash = (53 * hash) + getGhalemcdhahList().hashCode();
    }
    if (getIilaaedfoleCount() > 0) {
      hash = (37 * hash) + IILAAEDFOLE_FIELD_NUMBER;
      hash = (53 * hash) + getIilaaedfoleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJMDGFIPJNI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CJMDGFIPJNI prototype) {
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
   * ref: CJMDGFIPJNI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CJMDGFIPJNI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CJMDGFIPJNI)
      POGOProtos.Rpc.CJMDGFIPJNIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJMDGFIPJNI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJMDGFIPJNI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CJMDGFIPJNI.class, POGOProtos.Rpc.CJMDGFIPJNI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CJMDGFIPJNI.newBuilder()
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
      jggenglemil_ = 0;

      pepbijdnnam_ = 0;

      ghalemcdhah_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      iilaaedfole_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJMDGFIPJNI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJMDGFIPJNI getDefaultInstanceForType() {
      return POGOProtos.Rpc.CJMDGFIPJNI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJMDGFIPJNI build() {
      POGOProtos.Rpc.CJMDGFIPJNI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJMDGFIPJNI buildPartial() {
      POGOProtos.Rpc.CJMDGFIPJNI result = new POGOProtos.Rpc.CJMDGFIPJNI(this);
      int from_bitField0_ = bitField0_;
      result.jggenglemil_ = jggenglemil_;
      result.pepbijdnnam_ = pepbijdnnam_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ghalemcdhah_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ghalemcdhah_ = ghalemcdhah_;
      if (((bitField0_ & 0x00000002) != 0)) {
        iilaaedfole_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.iilaaedfole_ = iilaaedfole_;
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
      if (other instanceof POGOProtos.Rpc.CJMDGFIPJNI) {
        return mergeFrom((POGOProtos.Rpc.CJMDGFIPJNI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CJMDGFIPJNI other) {
      if (other == POGOProtos.Rpc.CJMDGFIPJNI.getDefaultInstance()) return this;
      if (other.getJggenglemil() != 0) {
        setJggenglemil(other.getJggenglemil());
      }
      if (other.getPepbijdnnam() != 0) {
        setPepbijdnnam(other.getPepbijdnnam());
      }
      if (!other.ghalemcdhah_.isEmpty()) {
        if (ghalemcdhah_.isEmpty()) {
          ghalemcdhah_ = other.ghalemcdhah_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGhalemcdhahIsMutable();
          ghalemcdhah_.addAll(other.ghalemcdhah_);
        }
        onChanged();
      }
      if (!other.iilaaedfole_.isEmpty()) {
        if (iilaaedfole_.isEmpty()) {
          iilaaedfole_ = other.iilaaedfole_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureIilaaedfoleIsMutable();
          iilaaedfole_.addAll(other.iilaaedfole_);
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
      POGOProtos.Rpc.CJMDGFIPJNI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CJMDGFIPJNI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int jggenglemil_ ;
    /**
     * <code>int32 jggenglemil = 1;</code>
     * @return The jggenglemil.
     */
    @java.lang.Override
    public int getJggenglemil() {
      return jggenglemil_;
    }
    /**
     * <code>int32 jggenglemil = 1;</code>
     * @param value The jggenglemil to set.
     * @return This builder for chaining.
     */
    public Builder setJggenglemil(int value) {
      
      jggenglemil_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jggenglemil = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJggenglemil() {
      
      jggenglemil_ = 0;
      onChanged();
      return this;
    }

    private int pepbijdnnam_ ;
    /**
     * <code>int32 pepbijdnnam = 2;</code>
     * @return The pepbijdnnam.
     */
    @java.lang.Override
    public int getPepbijdnnam() {
      return pepbijdnnam_;
    }
    /**
     * <code>int32 pepbijdnnam = 2;</code>
     * @param value The pepbijdnnam to set.
     * @return This builder for chaining.
     */
    public Builder setPepbijdnnam(int value) {
      
      pepbijdnnam_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pepbijdnnam = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPepbijdnnam() {
      
      pepbijdnnam_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList ghalemcdhah_ = emptyFloatList();
    private void ensureGhalemcdhahIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ghalemcdhah_ = mutableCopy(ghalemcdhah_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @return A list containing the ghalemcdhah.
     */
    public java.util.List<java.lang.Float>
        getGhalemcdhahList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ghalemcdhah_) : ghalemcdhah_;
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @return The count of ghalemcdhah.
     */
    public int getGhalemcdhahCount() {
      return ghalemcdhah_.size();
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @param index The index of the element to return.
     * @return The ghalemcdhah at the given index.
     */
    public float getGhalemcdhah(int index) {
      return ghalemcdhah_.getFloat(index);
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @param index The index to set the value at.
     * @param value The ghalemcdhah to set.
     * @return This builder for chaining.
     */
    public Builder setGhalemcdhah(
        int index, float value) {
      ensureGhalemcdhahIsMutable();
      ghalemcdhah_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @param value The ghalemcdhah to add.
     * @return This builder for chaining.
     */
    public Builder addGhalemcdhah(float value) {
      ensureGhalemcdhahIsMutable();
      ghalemcdhah_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @param values The ghalemcdhah to add.
     * @return This builder for chaining.
     */
    public Builder addAllGhalemcdhah(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureGhalemcdhahIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ghalemcdhah_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float ghalemcdhah = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGhalemcdhah() {
      ghalemcdhah_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList iilaaedfole_ = emptyFloatList();
    private void ensureIilaaedfoleIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        iilaaedfole_ = mutableCopy(iilaaedfole_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @return A list containing the iilaaedfole.
     */
    public java.util.List<java.lang.Float>
        getIilaaedfoleList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(iilaaedfole_) : iilaaedfole_;
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @return The count of iilaaedfole.
     */
    public int getIilaaedfoleCount() {
      return iilaaedfole_.size();
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @param index The index of the element to return.
     * @return The iilaaedfole at the given index.
     */
    public float getIilaaedfole(int index) {
      return iilaaedfole_.getFloat(index);
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @param index The index to set the value at.
     * @param value The iilaaedfole to set.
     * @return This builder for chaining.
     */
    public Builder setIilaaedfole(
        int index, float value) {
      ensureIilaaedfoleIsMutable();
      iilaaedfole_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @param value The iilaaedfole to add.
     * @return This builder for chaining.
     */
    public Builder addIilaaedfole(float value) {
      ensureIilaaedfoleIsMutable();
      iilaaedfole_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @param values The iilaaedfole to add.
     * @return This builder for chaining.
     */
    public Builder addAllIilaaedfole(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureIilaaedfoleIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, iilaaedfole_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float iilaaedfole = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIilaaedfole() {
      iilaaedfole_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CJMDGFIPJNI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CJMDGFIPJNI)
  private static final POGOProtos.Rpc.CJMDGFIPJNI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CJMDGFIPJNI();
  }

  public static POGOProtos.Rpc.CJMDGFIPJNI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CJMDGFIPJNI>
      PARSER = new com.google.protobuf.AbstractParser<CJMDGFIPJNI>() {
    @java.lang.Override
    public CJMDGFIPJNI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CJMDGFIPJNI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CJMDGFIPJNI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CJMDGFIPJNI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CJMDGFIPJNI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

