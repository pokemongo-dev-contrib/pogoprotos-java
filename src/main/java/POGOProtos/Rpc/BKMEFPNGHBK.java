// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BKMEFPNGHBK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BKMEFPNGHBK}
 */
public final class BKMEFPNGHBK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BKMEFPNGHBK)
    BKMEFPNGHBKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BKMEFPNGHBK.newBuilder() to construct.
  private BKMEFPNGHBK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BKMEFPNGHBK() {
    bdojlibebnm_ = 0;
    kpfmhkfgdml_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BKMEFPNGHBK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BKMEFPNGHBK(
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

            bdojlibebnm_ = rawValue;
            break;
          }
          case 16: {

            ncccegnekmn_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            kpfmhkfgdml_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BKMEFPNGHBK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BKMEFPNGHBK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BKMEFPNGHBK.class, POGOProtos.Rpc.BKMEFPNGHBK.Builder.class);
  }

  public static final int BDOJLIBEBNM_FIELD_NUMBER = 1;
  private int bdojlibebnm_;
  /**
   * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
   * @return The enum numeric value on the wire for bdojlibebnm.
   */
  @java.lang.Override public int getBdojlibebnmValue() {
    return bdojlibebnm_;
  }
  /**
   * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
   * @return The bdojlibebnm.
   */
  @java.lang.Override public POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK getBdojlibebnm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK result = POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.valueOf(bdojlibebnm_);
    return result == null ? POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.UNRECOGNIZED : result;
  }

  public static final int NCCCEGNEKMN_FIELD_NUMBER = 2;
  private int ncccegnekmn_;
  /**
   * <code>int32 ncccegnekmn = 2;</code>
   * @return The ncccegnekmn.
   */
  @java.lang.Override
  public int getNcccegnekmn() {
    return ncccegnekmn_;
  }

  public static final int KPFMHKFGDML_FIELD_NUMBER = 3;
  private volatile java.lang.Object kpfmhkfgdml_;
  /**
   * <code>string kpfmhkfgdml = 3;</code>
   * @return The kpfmhkfgdml.
   */
  @java.lang.Override
  public java.lang.String getKpfmhkfgdml() {
    java.lang.Object ref = kpfmhkfgdml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kpfmhkfgdml_ = s;
      return s;
    }
  }
  /**
   * <code>string kpfmhkfgdml = 3;</code>
   * @return The bytes for kpfmhkfgdml.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKpfmhkfgdmlBytes() {
    java.lang.Object ref = kpfmhkfgdml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kpfmhkfgdml_ = b;
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
    if (bdojlibebnm_ != POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.FORM_UNSET.getNumber()) {
      output.writeEnum(1, bdojlibebnm_);
    }
    if (ncccegnekmn_ != 0) {
      output.writeInt32(2, ncccegnekmn_);
    }
    if (!getKpfmhkfgdmlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kpfmhkfgdml_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bdojlibebnm_ != POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, bdojlibebnm_);
    }
    if (ncccegnekmn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ncccegnekmn_);
    }
    if (!getKpfmhkfgdmlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kpfmhkfgdml_);
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
    if (!(obj instanceof POGOProtos.Rpc.BKMEFPNGHBK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BKMEFPNGHBK other = (POGOProtos.Rpc.BKMEFPNGHBK) obj;

    if (bdojlibebnm_ != other.bdojlibebnm_) return false;
    if (getNcccegnekmn()
        != other.getNcccegnekmn()) return false;
    if (!getKpfmhkfgdml()
        .equals(other.getKpfmhkfgdml())) return false;
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
    hash = (37 * hash) + BDOJLIBEBNM_FIELD_NUMBER;
    hash = (53 * hash) + bdojlibebnm_;
    hash = (37 * hash) + NCCCEGNEKMN_FIELD_NUMBER;
    hash = (53 * hash) + getNcccegnekmn();
    hash = (37 * hash) + KPFMHKFGDML_FIELD_NUMBER;
    hash = (53 * hash) + getKpfmhkfgdml().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BKMEFPNGHBK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BKMEFPNGHBK prototype) {
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
   * ref: BKMEFPNGHBK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BKMEFPNGHBK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BKMEFPNGHBK)
      POGOProtos.Rpc.BKMEFPNGHBKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BKMEFPNGHBK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BKMEFPNGHBK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BKMEFPNGHBK.class, POGOProtos.Rpc.BKMEFPNGHBK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BKMEFPNGHBK.newBuilder()
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
      bdojlibebnm_ = 0;

      ncccegnekmn_ = 0;

      kpfmhkfgdml_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BKMEFPNGHBK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BKMEFPNGHBK getDefaultInstanceForType() {
      return POGOProtos.Rpc.BKMEFPNGHBK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BKMEFPNGHBK build() {
      POGOProtos.Rpc.BKMEFPNGHBK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BKMEFPNGHBK buildPartial() {
      POGOProtos.Rpc.BKMEFPNGHBK result = new POGOProtos.Rpc.BKMEFPNGHBK(this);
      result.bdojlibebnm_ = bdojlibebnm_;
      result.ncccegnekmn_ = ncccegnekmn_;
      result.kpfmhkfgdml_ = kpfmhkfgdml_;
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
      if (other instanceof POGOProtos.Rpc.BKMEFPNGHBK) {
        return mergeFrom((POGOProtos.Rpc.BKMEFPNGHBK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BKMEFPNGHBK other) {
      if (other == POGOProtos.Rpc.BKMEFPNGHBK.getDefaultInstance()) return this;
      if (other.bdojlibebnm_ != 0) {
        setBdojlibebnmValue(other.getBdojlibebnmValue());
      }
      if (other.getNcccegnekmn() != 0) {
        setNcccegnekmn(other.getNcccegnekmn());
      }
      if (!other.getKpfmhkfgdml().isEmpty()) {
        kpfmhkfgdml_ = other.kpfmhkfgdml_;
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
      POGOProtos.Rpc.BKMEFPNGHBK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BKMEFPNGHBK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bdojlibebnm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
     * @return The enum numeric value on the wire for bdojlibebnm.
     */
    @java.lang.Override public int getBdojlibebnmValue() {
      return bdojlibebnm_;
    }
    /**
     * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
     * @param value The enum numeric value on the wire for bdojlibebnm to set.
     * @return This builder for chaining.
     */
    public Builder setBdojlibebnmValue(int value) {
      
      bdojlibebnm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
     * @return The bdojlibebnm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK getBdojlibebnm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK result = POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.valueOf(bdojlibebnm_);
      return result == null ? POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
     * @param value The bdojlibebnm to set.
     * @return This builder for chaining.
     */
    public Builder setBdojlibebnm(POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bdojlibebnm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCIPKJLHDFJ.FCGPPIKIHPK bdojlibebnm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdojlibebnm() {
      
      bdojlibebnm_ = 0;
      onChanged();
      return this;
    }

    private int ncccegnekmn_ ;
    /**
     * <code>int32 ncccegnekmn = 2;</code>
     * @return The ncccegnekmn.
     */
    @java.lang.Override
    public int getNcccegnekmn() {
      return ncccegnekmn_;
    }
    /**
     * <code>int32 ncccegnekmn = 2;</code>
     * @param value The ncccegnekmn to set.
     * @return This builder for chaining.
     */
    public Builder setNcccegnekmn(int value) {
      
      ncccegnekmn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ncccegnekmn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNcccegnekmn() {
      
      ncccegnekmn_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object kpfmhkfgdml_ = "";
    /**
     * <code>string kpfmhkfgdml = 3;</code>
     * @return The kpfmhkfgdml.
     */
    public java.lang.String getKpfmhkfgdml() {
      java.lang.Object ref = kpfmhkfgdml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kpfmhkfgdml_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kpfmhkfgdml = 3;</code>
     * @return The bytes for kpfmhkfgdml.
     */
    public com.google.protobuf.ByteString
        getKpfmhkfgdmlBytes() {
      java.lang.Object ref = kpfmhkfgdml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kpfmhkfgdml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kpfmhkfgdml = 3;</code>
     * @param value The kpfmhkfgdml to set.
     * @return This builder for chaining.
     */
    public Builder setKpfmhkfgdml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kpfmhkfgdml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kpfmhkfgdml = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKpfmhkfgdml() {
      
      kpfmhkfgdml_ = getDefaultInstance().getKpfmhkfgdml();
      onChanged();
      return this;
    }
    /**
     * <code>string kpfmhkfgdml = 3;</code>
     * @param value The bytes for kpfmhkfgdml to set.
     * @return This builder for chaining.
     */
    public Builder setKpfmhkfgdmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kpfmhkfgdml_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BKMEFPNGHBK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BKMEFPNGHBK)
  private static final POGOProtos.Rpc.BKMEFPNGHBK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BKMEFPNGHBK();
  }

  public static POGOProtos.Rpc.BKMEFPNGHBK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BKMEFPNGHBK>
      PARSER = new com.google.protobuf.AbstractParser<BKMEFPNGHBK>() {
    @java.lang.Override
    public BKMEFPNGHBK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BKMEFPNGHBK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BKMEFPNGHBK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BKMEFPNGHBK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BKMEFPNGHBK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

