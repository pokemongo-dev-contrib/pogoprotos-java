// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CCBLJPNOBBH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CCBLJPNOBBH}
 */
public final class CCBLJPNOBBH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CCBLJPNOBBH)
    CCBLJPNOBBHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CCBLJPNOBBH.newBuilder() to construct.
  private CCBLJPNOBBH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CCBLJPNOBBH() {
    lkfkjmlndcm_ = "";
    ddmflcmbajg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CCBLJPNOBBH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CCBLJPNOBBH(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            lkfkjmlndcm_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            ddmflcmbajg_ = rawValue;
            break;
          }
          case 34: {
            POGOProtos.Rpc.HIAKFOHHHNM.Builder subBuilder = null;
            if (ckebdoegmhm_ != null) {
              subBuilder = ckebdoegmhm_.toBuilder();
            }
            ckebdoegmhm_ = input.readMessage(POGOProtos.Rpc.HIAKFOHHHNM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ckebdoegmhm_);
              ckebdoegmhm_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCBLJPNOBBH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCBLJPNOBBH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CCBLJPNOBBH.class, POGOProtos.Rpc.CCBLJPNOBBH.Builder.class);
  }

  public static final int LKFKJMLNDCM_FIELD_NUMBER = 1;
  private volatile java.lang.Object lkfkjmlndcm_;
  /**
   * <code>string lkfkjmlndcm = 1;</code>
   * @return The lkfkjmlndcm.
   */
  @java.lang.Override
  public java.lang.String getLkfkjmlndcm() {
    java.lang.Object ref = lkfkjmlndcm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lkfkjmlndcm_ = s;
      return s;
    }
  }
  /**
   * <code>string lkfkjmlndcm = 1;</code>
   * @return The bytes for lkfkjmlndcm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLkfkjmlndcmBytes() {
    java.lang.Object ref = lkfkjmlndcm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lkfkjmlndcm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DDMFLCMBAJG_FIELD_NUMBER = 2;
  private int ddmflcmbajg_;
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
   * @return The enum numeric value on the wire for ddmflcmbajg.
   */
  @java.lang.Override public int getDdmflcmbajgValue() {
    return ddmflcmbajg_;
  }
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
   * @return The ddmflcmbajg.
   */
  @java.lang.Override public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
    return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
  }

  public static final int CKEBDOEGMHM_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm_;
  /**
   * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
   * @return Whether the ckebdoegmhm field is set.
   */
  @java.lang.Override
  public boolean hasCkebdoegmhm() {
    return ckebdoegmhm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
   * @return The ckebdoegmhm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HIAKFOHHHNM getCkebdoegmhm() {
    return ckebdoegmhm_ == null ? POGOProtos.Rpc.HIAKFOHHHNM.getDefaultInstance() : ckebdoegmhm_;
  }
  /**
   * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HIAKFOHHHNMOrBuilder getCkebdoegmhmOrBuilder() {
    return getCkebdoegmhm();
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
    if (!getLkfkjmlndcmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lkfkjmlndcm_);
    }
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, ddmflcmbajg_);
    }
    if (ckebdoegmhm_ != null) {
      output.writeMessage(4, getCkebdoegmhm());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLkfkjmlndcmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lkfkjmlndcm_);
    }
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ddmflcmbajg_);
    }
    if (ckebdoegmhm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCkebdoegmhm());
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
    if (!(obj instanceof POGOProtos.Rpc.CCBLJPNOBBH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CCBLJPNOBBH other = (POGOProtos.Rpc.CCBLJPNOBBH) obj;

    if (!getLkfkjmlndcm()
        .equals(other.getLkfkjmlndcm())) return false;
    if (ddmflcmbajg_ != other.ddmflcmbajg_) return false;
    if (hasCkebdoegmhm() != other.hasCkebdoegmhm()) return false;
    if (hasCkebdoegmhm()) {
      if (!getCkebdoegmhm()
          .equals(other.getCkebdoegmhm())) return false;
    }
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
    hash = (37 * hash) + LKFKJMLNDCM_FIELD_NUMBER;
    hash = (53 * hash) + getLkfkjmlndcm().hashCode();
    hash = (37 * hash) + DDMFLCMBAJG_FIELD_NUMBER;
    hash = (53 * hash) + ddmflcmbajg_;
    if (hasCkebdoegmhm()) {
      hash = (37 * hash) + CKEBDOEGMHM_FIELD_NUMBER;
      hash = (53 * hash) + getCkebdoegmhm().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCBLJPNOBBH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CCBLJPNOBBH prototype) {
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
   * ref: CCBLJPNOBBH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CCBLJPNOBBH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CCBLJPNOBBH)
      POGOProtos.Rpc.CCBLJPNOBBHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCBLJPNOBBH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCBLJPNOBBH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CCBLJPNOBBH.class, POGOProtos.Rpc.CCBLJPNOBBH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CCBLJPNOBBH.newBuilder()
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
      lkfkjmlndcm_ = "";

      ddmflcmbajg_ = 0;

      if (ckebdoegmhmBuilder_ == null) {
        ckebdoegmhm_ = null;
      } else {
        ckebdoegmhm_ = null;
        ckebdoegmhmBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCBLJPNOBBH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCBLJPNOBBH getDefaultInstanceForType() {
      return POGOProtos.Rpc.CCBLJPNOBBH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCBLJPNOBBH build() {
      POGOProtos.Rpc.CCBLJPNOBBH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCBLJPNOBBH buildPartial() {
      POGOProtos.Rpc.CCBLJPNOBBH result = new POGOProtos.Rpc.CCBLJPNOBBH(this);
      result.lkfkjmlndcm_ = lkfkjmlndcm_;
      result.ddmflcmbajg_ = ddmflcmbajg_;
      if (ckebdoegmhmBuilder_ == null) {
        result.ckebdoegmhm_ = ckebdoegmhm_;
      } else {
        result.ckebdoegmhm_ = ckebdoegmhmBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CCBLJPNOBBH) {
        return mergeFrom((POGOProtos.Rpc.CCBLJPNOBBH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CCBLJPNOBBH other) {
      if (other == POGOProtos.Rpc.CCBLJPNOBBH.getDefaultInstance()) return this;
      if (!other.getLkfkjmlndcm().isEmpty()) {
        lkfkjmlndcm_ = other.lkfkjmlndcm_;
        onChanged();
      }
      if (other.ddmflcmbajg_ != 0) {
        setDdmflcmbajgValue(other.getDdmflcmbajgValue());
      }
      if (other.hasCkebdoegmhm()) {
        mergeCkebdoegmhm(other.getCkebdoegmhm());
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
      POGOProtos.Rpc.CCBLJPNOBBH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CCBLJPNOBBH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lkfkjmlndcm_ = "";
    /**
     * <code>string lkfkjmlndcm = 1;</code>
     * @return The lkfkjmlndcm.
     */
    public java.lang.String getLkfkjmlndcm() {
      java.lang.Object ref = lkfkjmlndcm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lkfkjmlndcm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lkfkjmlndcm = 1;</code>
     * @return The bytes for lkfkjmlndcm.
     */
    public com.google.protobuf.ByteString
        getLkfkjmlndcmBytes() {
      java.lang.Object ref = lkfkjmlndcm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lkfkjmlndcm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lkfkjmlndcm = 1;</code>
     * @param value The lkfkjmlndcm to set.
     * @return This builder for chaining.
     */
    public Builder setLkfkjmlndcm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lkfkjmlndcm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lkfkjmlndcm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLkfkjmlndcm() {
      
      lkfkjmlndcm_ = getDefaultInstance().getLkfkjmlndcm();
      onChanged();
      return this;
    }
    /**
     * <code>string lkfkjmlndcm = 1;</code>
     * @param value The bytes for lkfkjmlndcm to set.
     * @return This builder for chaining.
     */
    public Builder setLkfkjmlndcmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lkfkjmlndcm_ = value;
      onChanged();
      return this;
    }

    private int ddmflcmbajg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
     * @return The enum numeric value on the wire for ddmflcmbajg.
     */
    @java.lang.Override public int getDdmflcmbajgValue() {
      return ddmflcmbajg_;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
     * @param value The enum numeric value on the wire for ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajgValue(int value) {
      
      ddmflcmbajg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
     * @return The ddmflcmbajg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
      return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
     * @param value The ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajg(POGOProtos.Rpc.MAGDEIICLAK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ddmflcmbajg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDdmflcmbajg() {
      
      ddmflcmbajg_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HIAKFOHHHNM, POGOProtos.Rpc.HIAKFOHHHNM.Builder, POGOProtos.Rpc.HIAKFOHHHNMOrBuilder> ckebdoegmhmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     * @return Whether the ckebdoegmhm field is set.
     */
    public boolean hasCkebdoegmhm() {
      return ckebdoegmhmBuilder_ != null || ckebdoegmhm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     * @return The ckebdoegmhm.
     */
    public POGOProtos.Rpc.HIAKFOHHHNM getCkebdoegmhm() {
      if (ckebdoegmhmBuilder_ == null) {
        return ckebdoegmhm_ == null ? POGOProtos.Rpc.HIAKFOHHHNM.getDefaultInstance() : ckebdoegmhm_;
      } else {
        return ckebdoegmhmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public Builder setCkebdoegmhm(POGOProtos.Rpc.HIAKFOHHHNM value) {
      if (ckebdoegmhmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ckebdoegmhm_ = value;
        onChanged();
      } else {
        ckebdoegmhmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public Builder setCkebdoegmhm(
        POGOProtos.Rpc.HIAKFOHHHNM.Builder builderForValue) {
      if (ckebdoegmhmBuilder_ == null) {
        ckebdoegmhm_ = builderForValue.build();
        onChanged();
      } else {
        ckebdoegmhmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public Builder mergeCkebdoegmhm(POGOProtos.Rpc.HIAKFOHHHNM value) {
      if (ckebdoegmhmBuilder_ == null) {
        if (ckebdoegmhm_ != null) {
          ckebdoegmhm_ =
            POGOProtos.Rpc.HIAKFOHHHNM.newBuilder(ckebdoegmhm_).mergeFrom(value).buildPartial();
        } else {
          ckebdoegmhm_ = value;
        }
        onChanged();
      } else {
        ckebdoegmhmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public Builder clearCkebdoegmhm() {
      if (ckebdoegmhmBuilder_ == null) {
        ckebdoegmhm_ = null;
        onChanged();
      } else {
        ckebdoegmhm_ = null;
        ckebdoegmhmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public POGOProtos.Rpc.HIAKFOHHHNM.Builder getCkebdoegmhmBuilder() {
      
      onChanged();
      return getCkebdoegmhmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    public POGOProtos.Rpc.HIAKFOHHHNMOrBuilder getCkebdoegmhmOrBuilder() {
      if (ckebdoegmhmBuilder_ != null) {
        return ckebdoegmhmBuilder_.getMessageOrBuilder();
      } else {
        return ckebdoegmhm_ == null ?
            POGOProtos.Rpc.HIAKFOHHHNM.getDefaultInstance() : ckebdoegmhm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HIAKFOHHHNM ckebdoegmhm = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HIAKFOHHHNM, POGOProtos.Rpc.HIAKFOHHHNM.Builder, POGOProtos.Rpc.HIAKFOHHHNMOrBuilder> 
        getCkebdoegmhmFieldBuilder() {
      if (ckebdoegmhmBuilder_ == null) {
        ckebdoegmhmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HIAKFOHHHNM, POGOProtos.Rpc.HIAKFOHHHNM.Builder, POGOProtos.Rpc.HIAKFOHHHNMOrBuilder>(
                getCkebdoegmhm(),
                getParentForChildren(),
                isClean());
        ckebdoegmhm_ = null;
      }
      return ckebdoegmhmBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CCBLJPNOBBH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CCBLJPNOBBH)
  private static final POGOProtos.Rpc.CCBLJPNOBBH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CCBLJPNOBBH();
  }

  public static POGOProtos.Rpc.CCBLJPNOBBH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CCBLJPNOBBH>
      PARSER = new com.google.protobuf.AbstractParser<CCBLJPNOBBH>() {
    @java.lang.Override
    public CCBLJPNOBBH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CCBLJPNOBBH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CCBLJPNOBBH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CCBLJPNOBBH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CCBLJPNOBBH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

