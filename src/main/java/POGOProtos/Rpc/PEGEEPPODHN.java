// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PEGEEPPODHN}
 */
public  final class PEGEEPPODHN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PEGEEPPODHN)
    PEGEEPPODHNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PEGEEPPODHN.newBuilder() to construct.
  private PEGEEPPODHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PEGEEPPODHN() {
    mlahgofjabo_ = "";
    fhndegggkln_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PEGEEPPODHN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PEGEEPPODHN(
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

            bfcdigjokfl_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            mlahgofjabo_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fhndegggkln_ = new java.util.ArrayList<POGOProtos.Rpc.PHFPDDOHINI>();
              mutable_bitField0_ |= 0x00000001;
            }
            fhndegggkln_.add(
                input.readMessage(POGOProtos.Rpc.PHFPDDOHINI.parser(), extensionRegistry));
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
        fhndegggkln_ = java.util.Collections.unmodifiableList(fhndegggkln_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEGEEPPODHN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEGEEPPODHN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PEGEEPPODHN.class, POGOProtos.Rpc.PEGEEPPODHN.Builder.class);
  }

  public static final int BFCDIGJOKFL_FIELD_NUMBER = 1;
  private long bfcdigjokfl_;
  /**
   * <code>uint64 bfcdigjokfl = 1;</code>
   * @return The bfcdigjokfl.
   */
  public long getBfcdigjokfl() {
    return bfcdigjokfl_;
  }

  public static final int MLAHGOFJABO_FIELD_NUMBER = 2;
  private volatile java.lang.Object mlahgofjabo_;
  /**
   * <code>string mlahgofjabo = 2;</code>
   * @return The mlahgofjabo.
   */
  public java.lang.String getMlahgofjabo() {
    java.lang.Object ref = mlahgofjabo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mlahgofjabo_ = s;
      return s;
    }
  }
  /**
   * <code>string mlahgofjabo = 2;</code>
   * @return The bytes for mlahgofjabo.
   */
  public com.google.protobuf.ByteString
      getMlahgofjaboBytes() {
    java.lang.Object ref = mlahgofjabo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mlahgofjabo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FHNDEGGGKLN_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.PHFPDDOHINI> fhndegggkln_;
  /**
   * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
   */
  public java.util.List<POGOProtos.Rpc.PHFPDDOHINI> getFhndegggklnList() {
    return fhndegggkln_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.PHFPDDOHINIOrBuilder> 
      getFhndegggklnOrBuilderList() {
    return fhndegggkln_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
   */
  public int getFhndegggklnCount() {
    return fhndegggkln_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
   */
  public POGOProtos.Rpc.PHFPDDOHINI getFhndegggkln(int index) {
    return fhndegggkln_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
   */
  public POGOProtos.Rpc.PHFPDDOHINIOrBuilder getFhndegggklnOrBuilder(
      int index) {
    return fhndegggkln_.get(index);
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
    if (bfcdigjokfl_ != 0L) {
      output.writeUInt64(1, bfcdigjokfl_);
    }
    if (!getMlahgofjaboBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mlahgofjabo_);
    }
    for (int i = 0; i < fhndegggkln_.size(); i++) {
      output.writeMessage(3, fhndegggkln_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bfcdigjokfl_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, bfcdigjokfl_);
    }
    if (!getMlahgofjaboBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mlahgofjabo_);
    }
    for (int i = 0; i < fhndegggkln_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, fhndegggkln_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PEGEEPPODHN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PEGEEPPODHN other = (POGOProtos.Rpc.PEGEEPPODHN) obj;

    if (getBfcdigjokfl()
        != other.getBfcdigjokfl()) return false;
    if (!getMlahgofjabo()
        .equals(other.getMlahgofjabo())) return false;
    if (!getFhndegggklnList()
        .equals(other.getFhndegggklnList())) return false;
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
    hash = (37 * hash) + BFCDIGJOKFL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBfcdigjokfl());
    hash = (37 * hash) + MLAHGOFJABO_FIELD_NUMBER;
    hash = (53 * hash) + getMlahgofjabo().hashCode();
    if (getFhndegggklnCount() > 0) {
      hash = (37 * hash) + FHNDEGGGKLN_FIELD_NUMBER;
      hash = (53 * hash) + getFhndegggklnList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEGEEPPODHN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PEGEEPPODHN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PEGEEPPODHN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PEGEEPPODHN)
      POGOProtos.Rpc.PEGEEPPODHNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEGEEPPODHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEGEEPPODHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PEGEEPPODHN.class, POGOProtos.Rpc.PEGEEPPODHN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PEGEEPPODHN.newBuilder()
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
        getFhndegggklnFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bfcdigjokfl_ = 0L;

      mlahgofjabo_ = "";

      if (fhndegggklnBuilder_ == null) {
        fhndegggkln_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fhndegggklnBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEGEEPPODHN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGEEPPODHN getDefaultInstanceForType() {
      return POGOProtos.Rpc.PEGEEPPODHN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGEEPPODHN build() {
      POGOProtos.Rpc.PEGEEPPODHN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEGEEPPODHN buildPartial() {
      POGOProtos.Rpc.PEGEEPPODHN result = new POGOProtos.Rpc.PEGEEPPODHN(this);
      int from_bitField0_ = bitField0_;
      result.bfcdigjokfl_ = bfcdigjokfl_;
      result.mlahgofjabo_ = mlahgofjabo_;
      if (fhndegggklnBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fhndegggkln_ = java.util.Collections.unmodifiableList(fhndegggkln_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fhndegggkln_ = fhndegggkln_;
      } else {
        result.fhndegggkln_ = fhndegggklnBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.PEGEEPPODHN) {
        return mergeFrom((POGOProtos.Rpc.PEGEEPPODHN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PEGEEPPODHN other) {
      if (other == POGOProtos.Rpc.PEGEEPPODHN.getDefaultInstance()) return this;
      if (other.getBfcdigjokfl() != 0L) {
        setBfcdigjokfl(other.getBfcdigjokfl());
      }
      if (!other.getMlahgofjabo().isEmpty()) {
        mlahgofjabo_ = other.mlahgofjabo_;
        onChanged();
      }
      if (fhndegggklnBuilder_ == null) {
        if (!other.fhndegggkln_.isEmpty()) {
          if (fhndegggkln_.isEmpty()) {
            fhndegggkln_ = other.fhndegggkln_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFhndegggklnIsMutable();
            fhndegggkln_.addAll(other.fhndegggkln_);
          }
          onChanged();
        }
      } else {
        if (!other.fhndegggkln_.isEmpty()) {
          if (fhndegggklnBuilder_.isEmpty()) {
            fhndegggklnBuilder_.dispose();
            fhndegggklnBuilder_ = null;
            fhndegggkln_ = other.fhndegggkln_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fhndegggklnBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFhndegggklnFieldBuilder() : null;
          } else {
            fhndegggklnBuilder_.addAllMessages(other.fhndegggkln_);
          }
        }
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
      POGOProtos.Rpc.PEGEEPPODHN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PEGEEPPODHN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long bfcdigjokfl_ ;
    /**
     * <code>uint64 bfcdigjokfl = 1;</code>
     * @return The bfcdigjokfl.
     */
    public long getBfcdigjokfl() {
      return bfcdigjokfl_;
    }
    /**
     * <code>uint64 bfcdigjokfl = 1;</code>
     * @param value The bfcdigjokfl to set.
     * @return This builder for chaining.
     */
    public Builder setBfcdigjokfl(long value) {
      
      bfcdigjokfl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 bfcdigjokfl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBfcdigjokfl() {
      
      bfcdigjokfl_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object mlahgofjabo_ = "";
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return The mlahgofjabo.
     */
    public java.lang.String getMlahgofjabo() {
      java.lang.Object ref = mlahgofjabo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mlahgofjabo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return The bytes for mlahgofjabo.
     */
    public com.google.protobuf.ByteString
        getMlahgofjaboBytes() {
      java.lang.Object ref = mlahgofjabo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mlahgofjabo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @param value The mlahgofjabo to set.
     * @return This builder for chaining.
     */
    public Builder setMlahgofjabo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mlahgofjabo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlahgofjabo() {
      
      mlahgofjabo_ = getDefaultInstance().getMlahgofjabo();
      onChanged();
      return this;
    }
    /**
     * <code>string mlahgofjabo = 2;</code>
     * @param value The bytes for mlahgofjabo to set.
     * @return This builder for chaining.
     */
    public Builder setMlahgofjaboBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mlahgofjabo_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.PHFPDDOHINI> fhndegggkln_ =
      java.util.Collections.emptyList();
    private void ensureFhndegggklnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fhndegggkln_ = new java.util.ArrayList<POGOProtos.Rpc.PHFPDDOHINI>(fhndegggkln_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PHFPDDOHINI, POGOProtos.Rpc.PHFPDDOHINI.Builder, POGOProtos.Rpc.PHFPDDOHINIOrBuilder> fhndegggklnBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.PHFPDDOHINI> getFhndegggklnList() {
      if (fhndegggklnBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fhndegggkln_);
      } else {
        return fhndegggklnBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public int getFhndegggklnCount() {
      if (fhndegggklnBuilder_ == null) {
        return fhndegggkln_.size();
      } else {
        return fhndegggklnBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public POGOProtos.Rpc.PHFPDDOHINI getFhndegggkln(int index) {
      if (fhndegggklnBuilder_ == null) {
        return fhndegggkln_.get(index);
      } else {
        return fhndegggklnBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder setFhndegggkln(
        int index, POGOProtos.Rpc.PHFPDDOHINI value) {
      if (fhndegggklnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFhndegggklnIsMutable();
        fhndegggkln_.set(index, value);
        onChanged();
      } else {
        fhndegggklnBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder setFhndegggkln(
        int index, POGOProtos.Rpc.PHFPDDOHINI.Builder builderForValue) {
      if (fhndegggklnBuilder_ == null) {
        ensureFhndegggklnIsMutable();
        fhndegggkln_.set(index, builderForValue.build());
        onChanged();
      } else {
        fhndegggklnBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder addFhndegggkln(POGOProtos.Rpc.PHFPDDOHINI value) {
      if (fhndegggklnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFhndegggklnIsMutable();
        fhndegggkln_.add(value);
        onChanged();
      } else {
        fhndegggklnBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder addFhndegggkln(
        int index, POGOProtos.Rpc.PHFPDDOHINI value) {
      if (fhndegggklnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFhndegggklnIsMutable();
        fhndegggkln_.add(index, value);
        onChanged();
      } else {
        fhndegggklnBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder addFhndegggkln(
        POGOProtos.Rpc.PHFPDDOHINI.Builder builderForValue) {
      if (fhndegggklnBuilder_ == null) {
        ensureFhndegggklnIsMutable();
        fhndegggkln_.add(builderForValue.build());
        onChanged();
      } else {
        fhndegggklnBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder addFhndegggkln(
        int index, POGOProtos.Rpc.PHFPDDOHINI.Builder builderForValue) {
      if (fhndegggklnBuilder_ == null) {
        ensureFhndegggklnIsMutable();
        fhndegggkln_.add(index, builderForValue.build());
        onChanged();
      } else {
        fhndegggklnBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder addAllFhndegggkln(
        java.lang.Iterable<? extends POGOProtos.Rpc.PHFPDDOHINI> values) {
      if (fhndegggklnBuilder_ == null) {
        ensureFhndegggklnIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fhndegggkln_);
        onChanged();
      } else {
        fhndegggklnBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder clearFhndegggkln() {
      if (fhndegggklnBuilder_ == null) {
        fhndegggkln_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fhndegggklnBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public Builder removeFhndegggkln(int index) {
      if (fhndegggklnBuilder_ == null) {
        ensureFhndegggklnIsMutable();
        fhndegggkln_.remove(index);
        onChanged();
      } else {
        fhndegggklnBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public POGOProtos.Rpc.PHFPDDOHINI.Builder getFhndegggklnBuilder(
        int index) {
      return getFhndegggklnFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public POGOProtos.Rpc.PHFPDDOHINIOrBuilder getFhndegggklnOrBuilder(
        int index) {
      if (fhndegggklnBuilder_ == null) {
        return fhndegggkln_.get(index);  } else {
        return fhndegggklnBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PHFPDDOHINIOrBuilder> 
         getFhndegggklnOrBuilderList() {
      if (fhndegggklnBuilder_ != null) {
        return fhndegggklnBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fhndegggkln_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public POGOProtos.Rpc.PHFPDDOHINI.Builder addFhndegggklnBuilder() {
      return getFhndegggklnFieldBuilder().addBuilder(
          POGOProtos.Rpc.PHFPDDOHINI.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public POGOProtos.Rpc.PHFPDDOHINI.Builder addFhndegggklnBuilder(
        int index) {
      return getFhndegggklnFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PHFPDDOHINI.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PHFPDDOHINI fhndegggkln = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.PHFPDDOHINI.Builder> 
         getFhndegggklnBuilderList() {
      return getFhndegggklnFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PHFPDDOHINI, POGOProtos.Rpc.PHFPDDOHINI.Builder, POGOProtos.Rpc.PHFPDDOHINIOrBuilder> 
        getFhndegggklnFieldBuilder() {
      if (fhndegggklnBuilder_ == null) {
        fhndegggklnBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PHFPDDOHINI, POGOProtos.Rpc.PHFPDDOHINI.Builder, POGOProtos.Rpc.PHFPDDOHINIOrBuilder>(
                fhndegggkln_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fhndegggkln_ = null;
      }
      return fhndegggklnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PEGEEPPODHN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PEGEEPPODHN)
  private static final POGOProtos.Rpc.PEGEEPPODHN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PEGEEPPODHN();
  }

  public static POGOProtos.Rpc.PEGEEPPODHN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PEGEEPPODHN>
      PARSER = new com.google.protobuf.AbstractParser<PEGEEPPODHN>() {
    @java.lang.Override
    public PEGEEPPODHN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PEGEEPPODHN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PEGEEPPODHN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PEGEEPPODHN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PEGEEPPODHN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

