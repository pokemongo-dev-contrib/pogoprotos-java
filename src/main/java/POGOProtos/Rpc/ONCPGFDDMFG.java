// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ONCPGFDDMFG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ONCPGFDDMFG}
 */
public final class ONCPGFDDMFG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ONCPGFDDMFG)
    ONCPGFDDMFGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ONCPGFDDMFG.newBuilder() to construct.
  private ONCPGFDDMFG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ONCPGFDDMFG() {
    oeaflehbfop_ = 0;
    bojailmpocm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ONCPGFDDMFG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ONCPGFDDMFG(
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

            oeaflehbfop_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bojailmpocm_ = s;
            break;
          }
          case 24: {

            loiejlocpgk_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONCPGFDDMFG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONCPGFDDMFG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ONCPGFDDMFG.class, POGOProtos.Rpc.ONCPGFDDMFG.Builder.class);
  }

  public static final int OEAFLEHBFOP_FIELD_NUMBER = 1;
  private int oeaflehbfop_;
  /**
   * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
   * @return The enum numeric value on the wire for oeaflehbfop.
   */
  @java.lang.Override public int getOeaflehbfopValue() {
    return oeaflehbfop_;
  }
  /**
   * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
   * @return The oeaflehbfop.
   */
  @java.lang.Override public POGOProtos.Rpc.IEOFEIODMII getOeaflehbfop() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.IEOFEIODMII result = POGOProtos.Rpc.IEOFEIODMII.valueOf(oeaflehbfop_);
    return result == null ? POGOProtos.Rpc.IEOFEIODMII.UNRECOGNIZED : result;
  }

  public static final int BOJAILMPOCM_FIELD_NUMBER = 2;
  private volatile java.lang.Object bojailmpocm_;
  /**
   * <code>string bojailmpocm = 2;</code>
   * @return The bojailmpocm.
   */
  @java.lang.Override
  public java.lang.String getBojailmpocm() {
    java.lang.Object ref = bojailmpocm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bojailmpocm_ = s;
      return s;
    }
  }
  /**
   * <code>string bojailmpocm = 2;</code>
   * @return The bytes for bojailmpocm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBojailmpocmBytes() {
    java.lang.Object ref = bojailmpocm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bojailmpocm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOIEJLOCPGK_FIELD_NUMBER = 3;
  private int loiejlocpgk_;
  /**
   * <code>uint32 loiejlocpgk = 3;</code>
   * @return The loiejlocpgk.
   */
  @java.lang.Override
  public int getLoiejlocpgk() {
    return loiejlocpgk_;
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
    if (oeaflehbfop_ != POGOProtos.Rpc.IEOFEIODMII.IEOFEIODMII_UNDEFINED_ASSET_EVENT.getNumber()) {
      output.writeEnum(1, oeaflehbfop_);
    }
    if (!getBojailmpocmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bojailmpocm_);
    }
    if (loiejlocpgk_ != 0) {
      output.writeUInt32(3, loiejlocpgk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oeaflehbfop_ != POGOProtos.Rpc.IEOFEIODMII.IEOFEIODMII_UNDEFINED_ASSET_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, oeaflehbfop_);
    }
    if (!getBojailmpocmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bojailmpocm_);
    }
    if (loiejlocpgk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, loiejlocpgk_);
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
    if (!(obj instanceof POGOProtos.Rpc.ONCPGFDDMFG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ONCPGFDDMFG other = (POGOProtos.Rpc.ONCPGFDDMFG) obj;

    if (oeaflehbfop_ != other.oeaflehbfop_) return false;
    if (!getBojailmpocm()
        .equals(other.getBojailmpocm())) return false;
    if (getLoiejlocpgk()
        != other.getLoiejlocpgk()) return false;
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
    hash = (37 * hash) + OEAFLEHBFOP_FIELD_NUMBER;
    hash = (53 * hash) + oeaflehbfop_;
    hash = (37 * hash) + BOJAILMPOCM_FIELD_NUMBER;
    hash = (53 * hash) + getBojailmpocm().hashCode();
    hash = (37 * hash) + LOIEJLOCPGK_FIELD_NUMBER;
    hash = (53 * hash) + getLoiejlocpgk();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONCPGFDDMFG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ONCPGFDDMFG prototype) {
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
   * ref: ONCPGFDDMFG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ONCPGFDDMFG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ONCPGFDDMFG)
      POGOProtos.Rpc.ONCPGFDDMFGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONCPGFDDMFG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONCPGFDDMFG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ONCPGFDDMFG.class, POGOProtos.Rpc.ONCPGFDDMFG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ONCPGFDDMFG.newBuilder()
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
      oeaflehbfop_ = 0;

      bojailmpocm_ = "";

      loiejlocpgk_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONCPGFDDMFG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONCPGFDDMFG getDefaultInstanceForType() {
      return POGOProtos.Rpc.ONCPGFDDMFG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONCPGFDDMFG build() {
      POGOProtos.Rpc.ONCPGFDDMFG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONCPGFDDMFG buildPartial() {
      POGOProtos.Rpc.ONCPGFDDMFG result = new POGOProtos.Rpc.ONCPGFDDMFG(this);
      result.oeaflehbfop_ = oeaflehbfop_;
      result.bojailmpocm_ = bojailmpocm_;
      result.loiejlocpgk_ = loiejlocpgk_;
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
      if (other instanceof POGOProtos.Rpc.ONCPGFDDMFG) {
        return mergeFrom((POGOProtos.Rpc.ONCPGFDDMFG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ONCPGFDDMFG other) {
      if (other == POGOProtos.Rpc.ONCPGFDDMFG.getDefaultInstance()) return this;
      if (other.oeaflehbfop_ != 0) {
        setOeaflehbfopValue(other.getOeaflehbfopValue());
      }
      if (!other.getBojailmpocm().isEmpty()) {
        bojailmpocm_ = other.bojailmpocm_;
        onChanged();
      }
      if (other.getLoiejlocpgk() != 0) {
        setLoiejlocpgk(other.getLoiejlocpgk());
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
      POGOProtos.Rpc.ONCPGFDDMFG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ONCPGFDDMFG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oeaflehbfop_ = 0;
    /**
     * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
     * @return The enum numeric value on the wire for oeaflehbfop.
     */
    @java.lang.Override public int getOeaflehbfopValue() {
      return oeaflehbfop_;
    }
    /**
     * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
     * @param value The enum numeric value on the wire for oeaflehbfop to set.
     * @return This builder for chaining.
     */
    public Builder setOeaflehbfopValue(int value) {
      
      oeaflehbfop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
     * @return The oeaflehbfop.
     */
    @java.lang.Override
    public POGOProtos.Rpc.IEOFEIODMII getOeaflehbfop() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.IEOFEIODMII result = POGOProtos.Rpc.IEOFEIODMII.valueOf(oeaflehbfop_);
      return result == null ? POGOProtos.Rpc.IEOFEIODMII.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
     * @param value The oeaflehbfop to set.
     * @return This builder for chaining.
     */
    public Builder setOeaflehbfop(POGOProtos.Rpc.IEOFEIODMII value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      oeaflehbfop_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IEOFEIODMII oeaflehbfop = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOeaflehbfop() {
      
      oeaflehbfop_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bojailmpocm_ = "";
    /**
     * <code>string bojailmpocm = 2;</code>
     * @return The bojailmpocm.
     */
    public java.lang.String getBojailmpocm() {
      java.lang.Object ref = bojailmpocm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bojailmpocm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bojailmpocm = 2;</code>
     * @return The bytes for bojailmpocm.
     */
    public com.google.protobuf.ByteString
        getBojailmpocmBytes() {
      java.lang.Object ref = bojailmpocm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bojailmpocm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bojailmpocm = 2;</code>
     * @param value The bojailmpocm to set.
     * @return This builder for chaining.
     */
    public Builder setBojailmpocm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bojailmpocm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bojailmpocm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBojailmpocm() {
      
      bojailmpocm_ = getDefaultInstance().getBojailmpocm();
      onChanged();
      return this;
    }
    /**
     * <code>string bojailmpocm = 2;</code>
     * @param value The bytes for bojailmpocm to set.
     * @return This builder for chaining.
     */
    public Builder setBojailmpocmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bojailmpocm_ = value;
      onChanged();
      return this;
    }

    private int loiejlocpgk_ ;
    /**
     * <code>uint32 loiejlocpgk = 3;</code>
     * @return The loiejlocpgk.
     */
    @java.lang.Override
    public int getLoiejlocpgk() {
      return loiejlocpgk_;
    }
    /**
     * <code>uint32 loiejlocpgk = 3;</code>
     * @param value The loiejlocpgk to set.
     * @return This builder for chaining.
     */
    public Builder setLoiejlocpgk(int value) {
      
      loiejlocpgk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 loiejlocpgk = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoiejlocpgk() {
      
      loiejlocpgk_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ONCPGFDDMFG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ONCPGFDDMFG)
  private static final POGOProtos.Rpc.ONCPGFDDMFG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ONCPGFDDMFG();
  }

  public static POGOProtos.Rpc.ONCPGFDDMFG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ONCPGFDDMFG>
      PARSER = new com.google.protobuf.AbstractParser<ONCPGFDDMFG>() {
    @java.lang.Override
    public ONCPGFDDMFG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ONCPGFDDMFG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ONCPGFDDMFG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ONCPGFDDMFG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ONCPGFDDMFG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

