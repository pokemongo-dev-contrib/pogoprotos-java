// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IHIMCDJJJFK}
 */
public  final class IHIMCDJJJFK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IHIMCDJJJFK)
    IHIMCDJJJFKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IHIMCDJJJFK.newBuilder() to construct.
  private IHIMCDJJJFK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IHIMCDJJJFK() {
    kdfbmkgcadd_ = 0;
    aclmjbmlmpn_ = "";
    jmigcjnjkkp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IHIMCDJJJFK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IHIMCDJJJFK(
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

            kdfbmkgcadd_ = rawValue;
            break;
          }
          case 16: {

            mdoodojfdfj_ = input.readBool();
            break;
          }
          case 24: {

            mjiiihpohpi_ = input.readBool();
            break;
          }
          case 32: {

            apmmjlmnonk_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            aclmjbmlmpn_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            jmigcjnjkkp_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IHIMCDJJJFK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IHIMCDJJJFK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IHIMCDJJJFK.class, POGOProtos.Rpc.IHIMCDJJJFK.Builder.class);
  }

  public static final int KDFBMKGCADD_FIELD_NUMBER = 1;
  private int kdfbmkgcadd_;
  /**
   * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
   * @return The enum numeric value on the wire for kdfbmkgcadd.
   */
  public int getKdfbmkgcaddValue() {
    return kdfbmkgcadd_;
  }
  /**
   * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
   * @return The kdfbmkgcadd.
   */
  public POGOProtos.Rpc.LoginActionTelemetryIds getKdfbmkgcadd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LoginActionTelemetryIds result = POGOProtos.Rpc.LoginActionTelemetryIds.valueOf(kdfbmkgcadd_);
    return result == null ? POGOProtos.Rpc.LoginActionTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int MDOODOJFDFJ_FIELD_NUMBER = 2;
  private boolean mdoodojfdfj_;
  /**
   * <code>bool mdoodojfdfj = 2;</code>
   * @return The mdoodojfdfj.
   */
  public boolean getMdoodojfdfj() {
    return mdoodojfdfj_;
  }

  public static final int MJIIIHPOHPI_FIELD_NUMBER = 3;
  private boolean mjiiihpohpi_;
  /**
   * <code>bool mjiiihpohpi = 3;</code>
   * @return The mjiiihpohpi.
   */
  public boolean getMjiiihpohpi() {
    return mjiiihpohpi_;
  }

  public static final int APMMJLMNONK_FIELD_NUMBER = 4;
  private boolean apmmjlmnonk_;
  /**
   * <code>bool apmmjlmnonk = 4;</code>
   * @return The apmmjlmnonk.
   */
  public boolean getApmmjlmnonk() {
    return apmmjlmnonk_;
  }

  public static final int ACLMJBMLMPN_FIELD_NUMBER = 5;
  private volatile java.lang.Object aclmjbmlmpn_;
  /**
   * <code>string aclmjbmlmpn = 5;</code>
   * @return The aclmjbmlmpn.
   */
  public java.lang.String getAclmjbmlmpn() {
    java.lang.Object ref = aclmjbmlmpn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aclmjbmlmpn_ = s;
      return s;
    }
  }
  /**
   * <code>string aclmjbmlmpn = 5;</code>
   * @return The bytes for aclmjbmlmpn.
   */
  public com.google.protobuf.ByteString
      getAclmjbmlmpnBytes() {
    java.lang.Object ref = aclmjbmlmpn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aclmjbmlmpn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JMIGCJNJKKP_FIELD_NUMBER = 6;
  private volatile java.lang.Object jmigcjnjkkp_;
  /**
   * <code>string jmigcjnjkkp = 6;</code>
   * @return The jmigcjnjkkp.
   */
  public java.lang.String getJmigcjnjkkp() {
    java.lang.Object ref = jmigcjnjkkp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jmigcjnjkkp_ = s;
      return s;
    }
  }
  /**
   * <code>string jmigcjnjkkp = 6;</code>
   * @return The bytes for jmigcjnjkkp.
   */
  public com.google.protobuf.ByteString
      getJmigcjnjkkpBytes() {
    java.lang.Object ref = jmigcjnjkkp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jmigcjnjkkp_ = b;
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
    if (kdfbmkgcadd_ != POGOProtos.Rpc.LoginActionTelemetryIds.LOGIN_ACTION_TELEMETRY_IDS_UNDEFINED_LOGIN_ACTION.getNumber()) {
      output.writeEnum(1, kdfbmkgcadd_);
    }
    if (mdoodojfdfj_ != false) {
      output.writeBool(2, mdoodojfdfj_);
    }
    if (mjiiihpohpi_ != false) {
      output.writeBool(3, mjiiihpohpi_);
    }
    if (apmmjlmnonk_ != false) {
      output.writeBool(4, apmmjlmnonk_);
    }
    if (!getAclmjbmlmpnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, aclmjbmlmpn_);
    }
    if (!getJmigcjnjkkpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, jmigcjnjkkp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kdfbmkgcadd_ != POGOProtos.Rpc.LoginActionTelemetryIds.LOGIN_ACTION_TELEMETRY_IDS_UNDEFINED_LOGIN_ACTION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kdfbmkgcadd_);
    }
    if (mdoodojfdfj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, mdoodojfdfj_);
    }
    if (mjiiihpohpi_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, mjiiihpohpi_);
    }
    if (apmmjlmnonk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, apmmjlmnonk_);
    }
    if (!getAclmjbmlmpnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, aclmjbmlmpn_);
    }
    if (!getJmigcjnjkkpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, jmigcjnjkkp_);
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
    if (!(obj instanceof POGOProtos.Rpc.IHIMCDJJJFK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IHIMCDJJJFK other = (POGOProtos.Rpc.IHIMCDJJJFK) obj;

    if (kdfbmkgcadd_ != other.kdfbmkgcadd_) return false;
    if (getMdoodojfdfj()
        != other.getMdoodojfdfj()) return false;
    if (getMjiiihpohpi()
        != other.getMjiiihpohpi()) return false;
    if (getApmmjlmnonk()
        != other.getApmmjlmnonk()) return false;
    if (!getAclmjbmlmpn()
        .equals(other.getAclmjbmlmpn())) return false;
    if (!getJmigcjnjkkp()
        .equals(other.getJmigcjnjkkp())) return false;
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
    hash = (37 * hash) + KDFBMKGCADD_FIELD_NUMBER;
    hash = (53 * hash) + kdfbmkgcadd_;
    hash = (37 * hash) + MDOODOJFDFJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMdoodojfdfj());
    hash = (37 * hash) + MJIIIHPOHPI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMjiiihpohpi());
    hash = (37 * hash) + APMMJLMNONK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getApmmjlmnonk());
    hash = (37 * hash) + ACLMJBMLMPN_FIELD_NUMBER;
    hash = (53 * hash) + getAclmjbmlmpn().hashCode();
    hash = (37 * hash) + JMIGCJNJKKP_FIELD_NUMBER;
    hash = (53 * hash) + getJmigcjnjkkp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHIMCDJJJFK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IHIMCDJJJFK prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IHIMCDJJJFK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IHIMCDJJJFK)
      POGOProtos.Rpc.IHIMCDJJJFKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IHIMCDJJJFK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IHIMCDJJJFK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IHIMCDJJJFK.class, POGOProtos.Rpc.IHIMCDJJJFK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IHIMCDJJJFK.newBuilder()
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
      kdfbmkgcadd_ = 0;

      mdoodojfdfj_ = false;

      mjiiihpohpi_ = false;

      apmmjlmnonk_ = false;

      aclmjbmlmpn_ = "";

      jmigcjnjkkp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IHIMCDJJJFK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHIMCDJJJFK getDefaultInstanceForType() {
      return POGOProtos.Rpc.IHIMCDJJJFK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHIMCDJJJFK build() {
      POGOProtos.Rpc.IHIMCDJJJFK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHIMCDJJJFK buildPartial() {
      POGOProtos.Rpc.IHIMCDJJJFK result = new POGOProtos.Rpc.IHIMCDJJJFK(this);
      result.kdfbmkgcadd_ = kdfbmkgcadd_;
      result.mdoodojfdfj_ = mdoodojfdfj_;
      result.mjiiihpohpi_ = mjiiihpohpi_;
      result.apmmjlmnonk_ = apmmjlmnonk_;
      result.aclmjbmlmpn_ = aclmjbmlmpn_;
      result.jmigcjnjkkp_ = jmigcjnjkkp_;
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
      if (other instanceof POGOProtos.Rpc.IHIMCDJJJFK) {
        return mergeFrom((POGOProtos.Rpc.IHIMCDJJJFK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IHIMCDJJJFK other) {
      if (other == POGOProtos.Rpc.IHIMCDJJJFK.getDefaultInstance()) return this;
      if (other.kdfbmkgcadd_ != 0) {
        setKdfbmkgcaddValue(other.getKdfbmkgcaddValue());
      }
      if (other.getMdoodojfdfj() != false) {
        setMdoodojfdfj(other.getMdoodojfdfj());
      }
      if (other.getMjiiihpohpi() != false) {
        setMjiiihpohpi(other.getMjiiihpohpi());
      }
      if (other.getApmmjlmnonk() != false) {
        setApmmjlmnonk(other.getApmmjlmnonk());
      }
      if (!other.getAclmjbmlmpn().isEmpty()) {
        aclmjbmlmpn_ = other.aclmjbmlmpn_;
        onChanged();
      }
      if (!other.getJmigcjnjkkp().isEmpty()) {
        jmigcjnjkkp_ = other.jmigcjnjkkp_;
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
      POGOProtos.Rpc.IHIMCDJJJFK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IHIMCDJJJFK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kdfbmkgcadd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
     * @return The enum numeric value on the wire for kdfbmkgcadd.
     */
    public int getKdfbmkgcaddValue() {
      return kdfbmkgcadd_;
    }
    /**
     * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
     * @param value The enum numeric value on the wire for kdfbmkgcadd to set.
     * @return This builder for chaining.
     */
    public Builder setKdfbmkgcaddValue(int value) {
      kdfbmkgcadd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
     * @return The kdfbmkgcadd.
     */
    public POGOProtos.Rpc.LoginActionTelemetryIds getKdfbmkgcadd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LoginActionTelemetryIds result = POGOProtos.Rpc.LoginActionTelemetryIds.valueOf(kdfbmkgcadd_);
      return result == null ? POGOProtos.Rpc.LoginActionTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
     * @param value The kdfbmkgcadd to set.
     * @return This builder for chaining.
     */
    public Builder setKdfbmkgcadd(POGOProtos.Rpc.LoginActionTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kdfbmkgcadd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LoginActionTelemetryIds kdfbmkgcadd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKdfbmkgcadd() {
      
      kdfbmkgcadd_ = 0;
      onChanged();
      return this;
    }

    private boolean mdoodojfdfj_ ;
    /**
     * <code>bool mdoodojfdfj = 2;</code>
     * @return The mdoodojfdfj.
     */
    public boolean getMdoodojfdfj() {
      return mdoodojfdfj_;
    }
    /**
     * <code>bool mdoodojfdfj = 2;</code>
     * @param value The mdoodojfdfj to set.
     * @return This builder for chaining.
     */
    public Builder setMdoodojfdfj(boolean value) {
      
      mdoodojfdfj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mdoodojfdfj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdoodojfdfj() {
      
      mdoodojfdfj_ = false;
      onChanged();
      return this;
    }

    private boolean mjiiihpohpi_ ;
    /**
     * <code>bool mjiiihpohpi = 3;</code>
     * @return The mjiiihpohpi.
     */
    public boolean getMjiiihpohpi() {
      return mjiiihpohpi_;
    }
    /**
     * <code>bool mjiiihpohpi = 3;</code>
     * @param value The mjiiihpohpi to set.
     * @return This builder for chaining.
     */
    public Builder setMjiiihpohpi(boolean value) {
      
      mjiiihpohpi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mjiiihpohpi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjiiihpohpi() {
      
      mjiiihpohpi_ = false;
      onChanged();
      return this;
    }

    private boolean apmmjlmnonk_ ;
    /**
     * <code>bool apmmjlmnonk = 4;</code>
     * @return The apmmjlmnonk.
     */
    public boolean getApmmjlmnonk() {
      return apmmjlmnonk_;
    }
    /**
     * <code>bool apmmjlmnonk = 4;</code>
     * @param value The apmmjlmnonk to set.
     * @return This builder for chaining.
     */
    public Builder setApmmjlmnonk(boolean value) {
      
      apmmjlmnonk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool apmmjlmnonk = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearApmmjlmnonk() {
      
      apmmjlmnonk_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object aclmjbmlmpn_ = "";
    /**
     * <code>string aclmjbmlmpn = 5;</code>
     * @return The aclmjbmlmpn.
     */
    public java.lang.String getAclmjbmlmpn() {
      java.lang.Object ref = aclmjbmlmpn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aclmjbmlmpn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aclmjbmlmpn = 5;</code>
     * @return The bytes for aclmjbmlmpn.
     */
    public com.google.protobuf.ByteString
        getAclmjbmlmpnBytes() {
      java.lang.Object ref = aclmjbmlmpn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aclmjbmlmpn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aclmjbmlmpn = 5;</code>
     * @param value The aclmjbmlmpn to set.
     * @return This builder for chaining.
     */
    public Builder setAclmjbmlmpn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aclmjbmlmpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aclmjbmlmpn = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAclmjbmlmpn() {
      
      aclmjbmlmpn_ = getDefaultInstance().getAclmjbmlmpn();
      onChanged();
      return this;
    }
    /**
     * <code>string aclmjbmlmpn = 5;</code>
     * @param value The bytes for aclmjbmlmpn to set.
     * @return This builder for chaining.
     */
    public Builder setAclmjbmlmpnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aclmjbmlmpn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jmigcjnjkkp_ = "";
    /**
     * <code>string jmigcjnjkkp = 6;</code>
     * @return The jmigcjnjkkp.
     */
    public java.lang.String getJmigcjnjkkp() {
      java.lang.Object ref = jmigcjnjkkp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jmigcjnjkkp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jmigcjnjkkp = 6;</code>
     * @return The bytes for jmigcjnjkkp.
     */
    public com.google.protobuf.ByteString
        getJmigcjnjkkpBytes() {
      java.lang.Object ref = jmigcjnjkkp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jmigcjnjkkp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jmigcjnjkkp = 6;</code>
     * @param value The jmigcjnjkkp to set.
     * @return This builder for chaining.
     */
    public Builder setJmigcjnjkkp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jmigcjnjkkp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jmigcjnjkkp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearJmigcjnjkkp() {
      
      jmigcjnjkkp_ = getDefaultInstance().getJmigcjnjkkp();
      onChanged();
      return this;
    }
    /**
     * <code>string jmigcjnjkkp = 6;</code>
     * @param value The bytes for jmigcjnjkkp to set.
     * @return This builder for chaining.
     */
    public Builder setJmigcjnjkkpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jmigcjnjkkp_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IHIMCDJJJFK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IHIMCDJJJFK)
  private static final POGOProtos.Rpc.IHIMCDJJJFK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IHIMCDJJJFK();
  }

  public static POGOProtos.Rpc.IHIMCDJJJFK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IHIMCDJJJFK>
      PARSER = new com.google.protobuf.AbstractParser<IHIMCDJJJFK>() {
    @java.lang.Override
    public IHIMCDJJJFK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IHIMCDJJJFK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IHIMCDJJJFK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IHIMCDJJJFK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IHIMCDJJJFK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

