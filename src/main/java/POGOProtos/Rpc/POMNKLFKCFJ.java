// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.POMNKLFKCFJ}
 */
public  final class POMNKLFKCFJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.POMNKLFKCFJ)
    POMNKLFKCFJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use POMNKLFKCFJ.newBuilder() to construct.
  private POMNKLFKCFJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private POMNKLFKCFJ() {
    phmgklbmmga_ = "";
    coadjbcnbha_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new POMNKLFKCFJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private POMNKLFKCFJ(
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

            phmgklbmmga_ = s;
            break;
          }
          case 16: {

            cakbmjbeigc_ = input.readInt32();
            break;
          }
          case 24: {

            leglpkpgjgj_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            coadjbcnbha_ = s;
            break;
          }
          case 40: {

            naafggakbff_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_POMNKLFKCFJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_POMNKLFKCFJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.POMNKLFKCFJ.class, POGOProtos.Rpc.POMNKLFKCFJ.Builder.class);
  }

  public static final int PHMGKLBMMGA_FIELD_NUMBER = 1;
  private volatile java.lang.Object phmgklbmmga_;
  /**
   * <code>string phmgklbmmga = 1;</code>
   * @return The phmgklbmmga.
   */
  public java.lang.String getPhmgklbmmga() {
    java.lang.Object ref = phmgklbmmga_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phmgklbmmga_ = s;
      return s;
    }
  }
  /**
   * <code>string phmgklbmmga = 1;</code>
   * @return The bytes for phmgklbmmga.
   */
  public com.google.protobuf.ByteString
      getPhmgklbmmgaBytes() {
    java.lang.Object ref = phmgklbmmga_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phmgklbmmga_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAKBMJBEIGC_FIELD_NUMBER = 2;
  private int cakbmjbeigc_;
  /**
   * <code>int32 cakbmjbeigc = 2;</code>
   * @return The cakbmjbeigc.
   */
  public int getCakbmjbeigc() {
    return cakbmjbeigc_;
  }

  public static final int LEGLPKPGJGJ_FIELD_NUMBER = 3;
  private int leglpkpgjgj_;
  /**
   * <code>int32 leglpkpgjgj = 3;</code>
   * @return The leglpkpgjgj.
   */
  public int getLeglpkpgjgj() {
    return leglpkpgjgj_;
  }

  public static final int COADJBCNBHA_FIELD_NUMBER = 4;
  private volatile java.lang.Object coadjbcnbha_;
  /**
   * <code>string coadjbcnbha = 4;</code>
   * @return The coadjbcnbha.
   */
  public java.lang.String getCoadjbcnbha() {
    java.lang.Object ref = coadjbcnbha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coadjbcnbha_ = s;
      return s;
    }
  }
  /**
   * <code>string coadjbcnbha = 4;</code>
   * @return The bytes for coadjbcnbha.
   */
  public com.google.protobuf.ByteString
      getCoadjbcnbhaBytes() {
    java.lang.Object ref = coadjbcnbha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coadjbcnbha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAAFGGAKBFF_FIELD_NUMBER = 5;
  private long naafggakbff_;
  /**
   * <code>int64 naafggakbff = 5;</code>
   * @return The naafggakbff.
   */
  public long getNaafggakbff() {
    return naafggakbff_;
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
    if (!getPhmgklbmmgaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phmgklbmmga_);
    }
    if (cakbmjbeigc_ != 0) {
      output.writeInt32(2, cakbmjbeigc_);
    }
    if (leglpkpgjgj_ != 0) {
      output.writeInt32(3, leglpkpgjgj_);
    }
    if (!getCoadjbcnbhaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, coadjbcnbha_);
    }
    if (naafggakbff_ != 0L) {
      output.writeInt64(5, naafggakbff_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhmgklbmmgaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phmgklbmmga_);
    }
    if (cakbmjbeigc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, cakbmjbeigc_);
    }
    if (leglpkpgjgj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, leglpkpgjgj_);
    }
    if (!getCoadjbcnbhaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, coadjbcnbha_);
    }
    if (naafggakbff_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, naafggakbff_);
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
    if (!(obj instanceof POGOProtos.Rpc.POMNKLFKCFJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.POMNKLFKCFJ other = (POGOProtos.Rpc.POMNKLFKCFJ) obj;

    if (!getPhmgklbmmga()
        .equals(other.getPhmgklbmmga())) return false;
    if (getCakbmjbeigc()
        != other.getCakbmjbeigc()) return false;
    if (getLeglpkpgjgj()
        != other.getLeglpkpgjgj()) return false;
    if (!getCoadjbcnbha()
        .equals(other.getCoadjbcnbha())) return false;
    if (getNaafggakbff()
        != other.getNaafggakbff()) return false;
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
    hash = (37 * hash) + PHMGKLBMMGA_FIELD_NUMBER;
    hash = (53 * hash) + getPhmgklbmmga().hashCode();
    hash = (37 * hash) + CAKBMJBEIGC_FIELD_NUMBER;
    hash = (53 * hash) + getCakbmjbeigc();
    hash = (37 * hash) + LEGLPKPGJGJ_FIELD_NUMBER;
    hash = (53 * hash) + getLeglpkpgjgj();
    hash = (37 * hash) + COADJBCNBHA_FIELD_NUMBER;
    hash = (53 * hash) + getCoadjbcnbha().hashCode();
    hash = (37 * hash) + NAAFGGAKBFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNaafggakbff());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.POMNKLFKCFJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.POMNKLFKCFJ prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.POMNKLFKCFJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.POMNKLFKCFJ)
      POGOProtos.Rpc.POMNKLFKCFJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_POMNKLFKCFJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_POMNKLFKCFJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.POMNKLFKCFJ.class, POGOProtos.Rpc.POMNKLFKCFJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.POMNKLFKCFJ.newBuilder()
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
      phmgklbmmga_ = "";

      cakbmjbeigc_ = 0;

      leglpkpgjgj_ = 0;

      coadjbcnbha_ = "";

      naafggakbff_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_POMNKLFKCFJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.POMNKLFKCFJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.POMNKLFKCFJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.POMNKLFKCFJ build() {
      POGOProtos.Rpc.POMNKLFKCFJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.POMNKLFKCFJ buildPartial() {
      POGOProtos.Rpc.POMNKLFKCFJ result = new POGOProtos.Rpc.POMNKLFKCFJ(this);
      result.phmgklbmmga_ = phmgklbmmga_;
      result.cakbmjbeigc_ = cakbmjbeigc_;
      result.leglpkpgjgj_ = leglpkpgjgj_;
      result.coadjbcnbha_ = coadjbcnbha_;
      result.naafggakbff_ = naafggakbff_;
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
      if (other instanceof POGOProtos.Rpc.POMNKLFKCFJ) {
        return mergeFrom((POGOProtos.Rpc.POMNKLFKCFJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.POMNKLFKCFJ other) {
      if (other == POGOProtos.Rpc.POMNKLFKCFJ.getDefaultInstance()) return this;
      if (!other.getPhmgklbmmga().isEmpty()) {
        phmgklbmmga_ = other.phmgklbmmga_;
        onChanged();
      }
      if (other.getCakbmjbeigc() != 0) {
        setCakbmjbeigc(other.getCakbmjbeigc());
      }
      if (other.getLeglpkpgjgj() != 0) {
        setLeglpkpgjgj(other.getLeglpkpgjgj());
      }
      if (!other.getCoadjbcnbha().isEmpty()) {
        coadjbcnbha_ = other.coadjbcnbha_;
        onChanged();
      }
      if (other.getNaafggakbff() != 0L) {
        setNaafggakbff(other.getNaafggakbff());
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
      POGOProtos.Rpc.POMNKLFKCFJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.POMNKLFKCFJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phmgklbmmga_ = "";
    /**
     * <code>string phmgklbmmga = 1;</code>
     * @return The phmgklbmmga.
     */
    public java.lang.String getPhmgklbmmga() {
      java.lang.Object ref = phmgklbmmga_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phmgklbmmga_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phmgklbmmga = 1;</code>
     * @return The bytes for phmgklbmmga.
     */
    public com.google.protobuf.ByteString
        getPhmgklbmmgaBytes() {
      java.lang.Object ref = phmgklbmmga_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phmgklbmmga_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phmgklbmmga = 1;</code>
     * @param value The phmgklbmmga to set.
     * @return This builder for chaining.
     */
    public Builder setPhmgklbmmga(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phmgklbmmga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phmgklbmmga = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhmgklbmmga() {
      
      phmgklbmmga_ = getDefaultInstance().getPhmgklbmmga();
      onChanged();
      return this;
    }
    /**
     * <code>string phmgklbmmga = 1;</code>
     * @param value The bytes for phmgklbmmga to set.
     * @return This builder for chaining.
     */
    public Builder setPhmgklbmmgaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phmgklbmmga_ = value;
      onChanged();
      return this;
    }

    private int cakbmjbeigc_ ;
    /**
     * <code>int32 cakbmjbeigc = 2;</code>
     * @return The cakbmjbeigc.
     */
    public int getCakbmjbeigc() {
      return cakbmjbeigc_;
    }
    /**
     * <code>int32 cakbmjbeigc = 2;</code>
     * @param value The cakbmjbeigc to set.
     * @return This builder for chaining.
     */
    public Builder setCakbmjbeigc(int value) {
      
      cakbmjbeigc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cakbmjbeigc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCakbmjbeigc() {
      
      cakbmjbeigc_ = 0;
      onChanged();
      return this;
    }

    private int leglpkpgjgj_ ;
    /**
     * <code>int32 leglpkpgjgj = 3;</code>
     * @return The leglpkpgjgj.
     */
    public int getLeglpkpgjgj() {
      return leglpkpgjgj_;
    }
    /**
     * <code>int32 leglpkpgjgj = 3;</code>
     * @param value The leglpkpgjgj to set.
     * @return This builder for chaining.
     */
    public Builder setLeglpkpgjgj(int value) {
      
      leglpkpgjgj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 leglpkpgjgj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeglpkpgjgj() {
      
      leglpkpgjgj_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object coadjbcnbha_ = "";
    /**
     * <code>string coadjbcnbha = 4;</code>
     * @return The coadjbcnbha.
     */
    public java.lang.String getCoadjbcnbha() {
      java.lang.Object ref = coadjbcnbha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coadjbcnbha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string coadjbcnbha = 4;</code>
     * @return The bytes for coadjbcnbha.
     */
    public com.google.protobuf.ByteString
        getCoadjbcnbhaBytes() {
      java.lang.Object ref = coadjbcnbha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coadjbcnbha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string coadjbcnbha = 4;</code>
     * @param value The coadjbcnbha to set.
     * @return This builder for chaining.
     */
    public Builder setCoadjbcnbha(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      coadjbcnbha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string coadjbcnbha = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoadjbcnbha() {
      
      coadjbcnbha_ = getDefaultInstance().getCoadjbcnbha();
      onChanged();
      return this;
    }
    /**
     * <code>string coadjbcnbha = 4;</code>
     * @param value The bytes for coadjbcnbha to set.
     * @return This builder for chaining.
     */
    public Builder setCoadjbcnbhaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      coadjbcnbha_ = value;
      onChanged();
      return this;
    }

    private long naafggakbff_ ;
    /**
     * <code>int64 naafggakbff = 5;</code>
     * @return The naafggakbff.
     */
    public long getNaafggakbff() {
      return naafggakbff_;
    }
    /**
     * <code>int64 naafggakbff = 5;</code>
     * @param value The naafggakbff to set.
     * @return This builder for chaining.
     */
    public Builder setNaafggakbff(long value) {
      
      naafggakbff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 naafggakbff = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNaafggakbff() {
      
      naafggakbff_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.POMNKLFKCFJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.POMNKLFKCFJ)
  private static final POGOProtos.Rpc.POMNKLFKCFJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.POMNKLFKCFJ();
  }

  public static POGOProtos.Rpc.POMNKLFKCFJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<POMNKLFKCFJ>
      PARSER = new com.google.protobuf.AbstractParser<POMNKLFKCFJ>() {
    @java.lang.Override
    public POMNKLFKCFJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new POMNKLFKCFJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<POMNKLFKCFJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<POMNKLFKCFJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.POMNKLFKCFJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

