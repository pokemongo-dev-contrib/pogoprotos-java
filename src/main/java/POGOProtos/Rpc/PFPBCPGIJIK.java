// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PFPBCPGIJIK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PFPBCPGIJIK}
 */
public  final class PFPBCPGIJIK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PFPBCPGIJIK)
    PFPBCPGIJIKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PFPBCPGIJIK.newBuilder() to construct.
  private PFPBCPGIJIK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PFPBCPGIJIK() {
    cnednpmelak_ = "";
    kigfnblbcla_ = 0;
    nhfojfjknfa_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PFPBCPGIJIK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PFPBCPGIJIK(
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

            cnednpmelak_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kigfnblbcla_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            nhfojfjknfa_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPBCPGIJIK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPBCPGIJIK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PFPBCPGIJIK.class, POGOProtos.Rpc.PFPBCPGIJIK.Builder.class);
  }

  public static final int CNEDNPMELAK_FIELD_NUMBER = 1;
  private volatile java.lang.Object cnednpmelak_;
  /**
   * <code>string cnednpmelak = 1;</code>
   * @return The cnednpmelak.
   */
  public java.lang.String getCnednpmelak() {
    java.lang.Object ref = cnednpmelak_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cnednpmelak_ = s;
      return s;
    }
  }
  /**
   * <code>string cnednpmelak = 1;</code>
   * @return The bytes for cnednpmelak.
   */
  public com.google.protobuf.ByteString
      getCnednpmelakBytes() {
    java.lang.Object ref = cnednpmelak_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cnednpmelak_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIGFNBLBCLA_FIELD_NUMBER = 2;
  private int kigfnblbcla_;
  /**
   * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
   * @return The enum numeric value on the wire for kigfnblbcla.
   */
  public int getKigfnblbclaValue() {
    return kigfnblbcla_;
  }
  /**
   * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
   * @return The kigfnblbcla.
   */
  public POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM getKigfnblbcla() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM result = POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.valueOf(kigfnblbcla_);
    return result == null ? POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.UNRECOGNIZED : result;
  }

  public static final int NHFOJFJKNFA_FIELD_NUMBER = 3;
  private int nhfojfjknfa_;
  /**
   * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
   * @return The enum numeric value on the wire for nhfojfjknfa.
   */
  public int getNhfojfjknfaValue() {
    return nhfojfjknfa_;
  }
  /**
   * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
   * @return The nhfojfjknfa.
   */
  public POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP getNhfojfjknfa() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP result = POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.valueOf(nhfojfjknfa_);
    return result == null ? POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.UNRECOGNIZED : result;
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
    if (!getCnednpmelakBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cnednpmelak_);
    }
    if (kigfnblbcla_ != POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.IMKDMKFHKPM_CHARACTER_UNSET.getNumber()) {
      output.writeEnum(2, kigfnblbcla_);
    }
    if (nhfojfjknfa_ != POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.PCDEKIAPHCP_EXPRESSION_UNSET.getNumber()) {
      output.writeEnum(3, nhfojfjknfa_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCnednpmelakBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cnednpmelak_);
    }
    if (kigfnblbcla_ != POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.IMKDMKFHKPM_CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kigfnblbcla_);
    }
    if (nhfojfjknfa_ != POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.PCDEKIAPHCP_EXPRESSION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, nhfojfjknfa_);
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
    if (!(obj instanceof POGOProtos.Rpc.PFPBCPGIJIK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PFPBCPGIJIK other = (POGOProtos.Rpc.PFPBCPGIJIK) obj;

    if (!getCnednpmelak()
        .equals(other.getCnednpmelak())) return false;
    if (kigfnblbcla_ != other.kigfnblbcla_) return false;
    if (nhfojfjknfa_ != other.nhfojfjknfa_) return false;
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
    hash = (37 * hash) + CNEDNPMELAK_FIELD_NUMBER;
    hash = (53 * hash) + getCnednpmelak().hashCode();
    hash = (37 * hash) + KIGFNBLBCLA_FIELD_NUMBER;
    hash = (53 * hash) + kigfnblbcla_;
    hash = (37 * hash) + NHFOJFJKNFA_FIELD_NUMBER;
    hash = (53 * hash) + nhfojfjknfa_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPBCPGIJIK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PFPBCPGIJIK prototype) {
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
   * ref: PFPBCPGIJIK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PFPBCPGIJIK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PFPBCPGIJIK)
      POGOProtos.Rpc.PFPBCPGIJIKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPBCPGIJIK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPBCPGIJIK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PFPBCPGIJIK.class, POGOProtos.Rpc.PFPBCPGIJIK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PFPBCPGIJIK.newBuilder()
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
      cnednpmelak_ = "";

      kigfnblbcla_ = 0;

      nhfojfjknfa_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPBCPGIJIK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPBCPGIJIK getDefaultInstanceForType() {
      return POGOProtos.Rpc.PFPBCPGIJIK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPBCPGIJIK build() {
      POGOProtos.Rpc.PFPBCPGIJIK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPBCPGIJIK buildPartial() {
      POGOProtos.Rpc.PFPBCPGIJIK result = new POGOProtos.Rpc.PFPBCPGIJIK(this);
      result.cnednpmelak_ = cnednpmelak_;
      result.kigfnblbcla_ = kigfnblbcla_;
      result.nhfojfjknfa_ = nhfojfjknfa_;
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
      if (other instanceof POGOProtos.Rpc.PFPBCPGIJIK) {
        return mergeFrom((POGOProtos.Rpc.PFPBCPGIJIK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PFPBCPGIJIK other) {
      if (other == POGOProtos.Rpc.PFPBCPGIJIK.getDefaultInstance()) return this;
      if (!other.getCnednpmelak().isEmpty()) {
        cnednpmelak_ = other.cnednpmelak_;
        onChanged();
      }
      if (other.kigfnblbcla_ != 0) {
        setKigfnblbclaValue(other.getKigfnblbclaValue());
      }
      if (other.nhfojfjknfa_ != 0) {
        setNhfojfjknfaValue(other.getNhfojfjknfaValue());
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
      POGOProtos.Rpc.PFPBCPGIJIK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PFPBCPGIJIK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cnednpmelak_ = "";
    /**
     * <code>string cnednpmelak = 1;</code>
     * @return The cnednpmelak.
     */
    public java.lang.String getCnednpmelak() {
      java.lang.Object ref = cnednpmelak_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cnednpmelak_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cnednpmelak = 1;</code>
     * @return The bytes for cnednpmelak.
     */
    public com.google.protobuf.ByteString
        getCnednpmelakBytes() {
      java.lang.Object ref = cnednpmelak_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cnednpmelak_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cnednpmelak = 1;</code>
     * @param value The cnednpmelak to set.
     * @return This builder for chaining.
     */
    public Builder setCnednpmelak(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cnednpmelak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cnednpmelak = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCnednpmelak() {
      
      cnednpmelak_ = getDefaultInstance().getCnednpmelak();
      onChanged();
      return this;
    }
    /**
     * <code>string cnednpmelak = 1;</code>
     * @param value The bytes for cnednpmelak to set.
     * @return This builder for chaining.
     */
    public Builder setCnednpmelakBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cnednpmelak_ = value;
      onChanged();
      return this;
    }

    private int kigfnblbcla_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
     * @return The enum numeric value on the wire for kigfnblbcla.
     */
    public int getKigfnblbclaValue() {
      return kigfnblbcla_;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
     * @param value The enum numeric value on the wire for kigfnblbcla to set.
     * @return This builder for chaining.
     */
    public Builder setKigfnblbclaValue(int value) {
      kigfnblbcla_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
     * @return The kigfnblbcla.
     */
    public POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM getKigfnblbcla() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM result = POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.valueOf(kigfnblbcla_);
      return result == null ? POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
     * @param value The kigfnblbcla to set.
     * @return This builder for chaining.
     */
    public Builder setKigfnblbcla(POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kigfnblbcla_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.IMKDMKFHKPM kigfnblbcla = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKigfnblbcla() {
      
      kigfnblbcla_ = 0;
      onChanged();
      return this;
    }

    private int nhfojfjknfa_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
     * @return The enum numeric value on the wire for nhfojfjknfa.
     */
    public int getNhfojfjknfaValue() {
      return nhfojfjknfa_;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
     * @param value The enum numeric value on the wire for nhfojfjknfa to set.
     * @return This builder for chaining.
     */
    public Builder setNhfojfjknfaValue(int value) {
      nhfojfjknfa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
     * @return The nhfojfjknfa.
     */
    public POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP getNhfojfjknfa() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP result = POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.valueOf(nhfojfjknfa_);
      return result == null ? POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
     * @param value The nhfojfjknfa to set.
     * @return This builder for chaining.
     */
    public Builder setNhfojfjknfa(POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nhfojfjknfa_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EILPNGBLOGP.PCDEKIAPHCP nhfojfjknfa = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNhfojfjknfa() {
      
      nhfojfjknfa_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PFPBCPGIJIK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PFPBCPGIJIK)
  private static final POGOProtos.Rpc.PFPBCPGIJIK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PFPBCPGIJIK();
  }

  public static POGOProtos.Rpc.PFPBCPGIJIK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PFPBCPGIJIK>
      PARSER = new com.google.protobuf.AbstractParser<PFPBCPGIJIK>() {
    @java.lang.Override
    public PFPBCPGIJIK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PFPBCPGIJIK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PFPBCPGIJIK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PFPBCPGIJIK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PFPBCPGIJIK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

