// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PAIDHMDMPOB}
 */
public  final class PAIDHMDMPOB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PAIDHMDMPOB)
    PAIDHMDMPOBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PAIDHMDMPOB.newBuilder() to construct.
  private PAIDHMDMPOB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PAIDHMDMPOB() {
    kdahacgcfio_ = 0;
    hnlnhmhaalm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PAIDHMDMPOB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PAIDHMDMPOB(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            kdahacgcfio_ = rawValue;
            break;
          }
          case 16: {

            hickbofpnhi_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hnlnhmhaalm_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PAIDHMDMPOB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PAIDHMDMPOB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PAIDHMDMPOB.class, POGOProtos.Rpc.PAIDHMDMPOB.Builder.class);
  }

  public static final int KDAHACGCFIO_FIELD_NUMBER = 1;
  private int kdahacgcfio_;
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
   * @return The enum numeric value on the wire for kdahacgcfio.
   */
  public int getKdahacgcfioValue() {
    return kdahacgcfio_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
   * @return The kdahacgcfio.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG getKdahacgcfio() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG result = POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.valueOf(kdahacgcfio_);
    return result == null ? POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.UNRECOGNIZED : result;
  }

  public static final int HICKBOFPNHI_FIELD_NUMBER = 2;
  private int hickbofpnhi_;
  /**
   * <code>int32 hickbofpnhi = 2;</code>
   * @return The hickbofpnhi.
   */
  public int getHickbofpnhi() {
    return hickbofpnhi_;
  }

  public static final int HNLNHMHAALM_FIELD_NUMBER = 3;
  private volatile java.lang.Object hnlnhmhaalm_;
  /**
   * <code>string hnlnhmhaalm = 3;</code>
   * @return The hnlnhmhaalm.
   */
  public java.lang.String getHnlnhmhaalm() {
    java.lang.Object ref = hnlnhmhaalm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hnlnhmhaalm_ = s;
      return s;
    }
  }
  /**
   * <code>string hnlnhmhaalm = 3;</code>
   * @return The bytes for hnlnhmhaalm.
   */
  public com.google.protobuf.ByteString
      getHnlnhmhaalmBytes() {
    java.lang.Object ref = hnlnhmhaalm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hnlnhmhaalm_ = b;
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
    if (kdahacgcfio_ != POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.FORM_UNSET.getNumber()) {
      output.writeEnum(1, kdahacgcfio_);
    }
    if (hickbofpnhi_ != 0) {
      output.writeInt32(2, hickbofpnhi_);
    }
    if (!getHnlnhmhaalmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hnlnhmhaalm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kdahacgcfio_ != POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kdahacgcfio_);
    }
    if (hickbofpnhi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hickbofpnhi_);
    }
    if (!getHnlnhmhaalmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hnlnhmhaalm_);
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
    if (!(obj instanceof POGOProtos.Rpc.PAIDHMDMPOB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PAIDHMDMPOB other = (POGOProtos.Rpc.PAIDHMDMPOB) obj;

    if (kdahacgcfio_ != other.kdahacgcfio_) return false;
    if (getHickbofpnhi()
        != other.getHickbofpnhi()) return false;
    if (!getHnlnhmhaalm()
        .equals(other.getHnlnhmhaalm())) return false;
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
    hash = (37 * hash) + KDAHACGCFIO_FIELD_NUMBER;
    hash = (53 * hash) + kdahacgcfio_;
    hash = (37 * hash) + HICKBOFPNHI_FIELD_NUMBER;
    hash = (53 * hash) + getHickbofpnhi();
    hash = (37 * hash) + HNLNHMHAALM_FIELD_NUMBER;
    hash = (53 * hash) + getHnlnhmhaalm().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PAIDHMDMPOB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PAIDHMDMPOB prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PAIDHMDMPOB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PAIDHMDMPOB)
      POGOProtos.Rpc.PAIDHMDMPOBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PAIDHMDMPOB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PAIDHMDMPOB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PAIDHMDMPOB.class, POGOProtos.Rpc.PAIDHMDMPOB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PAIDHMDMPOB.newBuilder()
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
      kdahacgcfio_ = 0;

      hickbofpnhi_ = 0;

      hnlnhmhaalm_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PAIDHMDMPOB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PAIDHMDMPOB getDefaultInstanceForType() {
      return POGOProtos.Rpc.PAIDHMDMPOB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PAIDHMDMPOB build() {
      POGOProtos.Rpc.PAIDHMDMPOB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PAIDHMDMPOB buildPartial() {
      POGOProtos.Rpc.PAIDHMDMPOB result = new POGOProtos.Rpc.PAIDHMDMPOB(this);
      result.kdahacgcfio_ = kdahacgcfio_;
      result.hickbofpnhi_ = hickbofpnhi_;
      result.hnlnhmhaalm_ = hnlnhmhaalm_;
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
      if (other instanceof POGOProtos.Rpc.PAIDHMDMPOB) {
        return mergeFrom((POGOProtos.Rpc.PAIDHMDMPOB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PAIDHMDMPOB other) {
      if (other == POGOProtos.Rpc.PAIDHMDMPOB.getDefaultInstance()) return this;
      if (other.kdahacgcfio_ != 0) {
        setKdahacgcfioValue(other.getKdahacgcfioValue());
      }
      if (other.getHickbofpnhi() != 0) {
        setHickbofpnhi(other.getHickbofpnhi());
      }
      if (!other.getHnlnhmhaalm().isEmpty()) {
        hnlnhmhaalm_ = other.hnlnhmhaalm_;
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
      POGOProtos.Rpc.PAIDHMDMPOB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PAIDHMDMPOB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kdahacgcfio_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
     * @return The enum numeric value on the wire for kdahacgcfio.
     */
    public int getKdahacgcfioValue() {
      return kdahacgcfio_;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
     * @param value The enum numeric value on the wire for kdahacgcfio to set.
     * @return This builder for chaining.
     */
    public Builder setKdahacgcfioValue(int value) {
      kdahacgcfio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
     * @return The kdahacgcfio.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG getKdahacgcfio() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG result = POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.valueOf(kdahacgcfio_);
      return result == null ? POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
     * @param value The kdahacgcfio to set.
     * @return This builder for chaining.
     */
    public Builder setKdahacgcfio(POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kdahacgcfio_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG kdahacgcfio = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKdahacgcfio() {
      
      kdahacgcfio_ = 0;
      onChanged();
      return this;
    }

    private int hickbofpnhi_ ;
    /**
     * <code>int32 hickbofpnhi = 2;</code>
     * @return The hickbofpnhi.
     */
    public int getHickbofpnhi() {
      return hickbofpnhi_;
    }
    /**
     * <code>int32 hickbofpnhi = 2;</code>
     * @param value The hickbofpnhi to set.
     * @return This builder for chaining.
     */
    public Builder setHickbofpnhi(int value) {
      
      hickbofpnhi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hickbofpnhi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHickbofpnhi() {
      
      hickbofpnhi_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object hnlnhmhaalm_ = "";
    /**
     * <code>string hnlnhmhaalm = 3;</code>
     * @return The hnlnhmhaalm.
     */
    public java.lang.String getHnlnhmhaalm() {
      java.lang.Object ref = hnlnhmhaalm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hnlnhmhaalm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hnlnhmhaalm = 3;</code>
     * @return The bytes for hnlnhmhaalm.
     */
    public com.google.protobuf.ByteString
        getHnlnhmhaalmBytes() {
      java.lang.Object ref = hnlnhmhaalm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hnlnhmhaalm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hnlnhmhaalm = 3;</code>
     * @param value The hnlnhmhaalm to set.
     * @return This builder for chaining.
     */
    public Builder setHnlnhmhaalm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hnlnhmhaalm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hnlnhmhaalm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHnlnhmhaalm() {
      
      hnlnhmhaalm_ = getDefaultInstance().getHnlnhmhaalm();
      onChanged();
      return this;
    }
    /**
     * <code>string hnlnhmhaalm = 3;</code>
     * @param value The bytes for hnlnhmhaalm to set.
     * @return This builder for chaining.
     */
    public Builder setHnlnhmhaalmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hnlnhmhaalm_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PAIDHMDMPOB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PAIDHMDMPOB)
  private static final POGOProtos.Rpc.PAIDHMDMPOB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PAIDHMDMPOB();
  }

  public static POGOProtos.Rpc.PAIDHMDMPOB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PAIDHMDMPOB>
      PARSER = new com.google.protobuf.AbstractParser<PAIDHMDMPOB>() {
    @java.lang.Override
    public PAIDHMDMPOB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PAIDHMDMPOB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PAIDHMDMPOB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PAIDHMDMPOB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PAIDHMDMPOB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

