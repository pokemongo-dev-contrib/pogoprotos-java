// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KKPAIGDKNLI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KKPAIGDKNLI}
 */
public final class KKPAIGDKNLI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KKPAIGDKNLI)
    KKPAIGDKNLIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KKPAIGDKNLI.newBuilder() to construct.
  private KKPAIGDKNLI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KKPAIGDKNLI() {
    nfnokciaooh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    ilmhnbcplng_ = "";
    meblejahddh_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KKPAIGDKNLI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KKPAIGDKNLI(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nfnokciaooh_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            nfnokciaooh_.add(s);
            break;
          }
          case 16: {

            dfihodeidnd_ = input.readBool();
            break;
          }
          case 24: {

            ldidaklojne_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            ilmhnbcplng_ = s;
            break;
          }
          case 40: {

            aipibdgpped_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            meblejahddh_ = s;
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
        nfnokciaooh_ = nfnokciaooh_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKPAIGDKNLI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKPAIGDKNLI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KKPAIGDKNLI.class, POGOProtos.Rpc.KKPAIGDKNLI.Builder.class);
  }

  public static final int NFNOKCIAOOH_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList nfnokciaooh_;
  /**
   * <code>repeated string nfnokciaooh = 1;</code>
   * @return A list containing the nfnokciaooh.
   */
  public com.google.protobuf.ProtocolStringList
      getNfnokciaoohList() {
    return nfnokciaooh_;
  }
  /**
   * <code>repeated string nfnokciaooh = 1;</code>
   * @return The count of nfnokciaooh.
   */
  public int getNfnokciaoohCount() {
    return nfnokciaooh_.size();
  }
  /**
   * <code>repeated string nfnokciaooh = 1;</code>
   * @param index The index of the element to return.
   * @return The nfnokciaooh at the given index.
   */
  public java.lang.String getNfnokciaooh(int index) {
    return nfnokciaooh_.get(index);
  }
  /**
   * <code>repeated string nfnokciaooh = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the nfnokciaooh at the given index.
   */
  public com.google.protobuf.ByteString
      getNfnokciaoohBytes(int index) {
    return nfnokciaooh_.getByteString(index);
  }

  public static final int DFIHODEIDND_FIELD_NUMBER = 2;
  private boolean dfihodeidnd_;
  /**
   * <code>bool dfihodeidnd = 2;</code>
   * @return The dfihodeidnd.
   */
  @java.lang.Override
  public boolean getDfihodeidnd() {
    return dfihodeidnd_;
  }

  public static final int LDIDAKLOJNE_FIELD_NUMBER = 3;
  private boolean ldidaklojne_;
  /**
   * <code>bool ldidaklojne = 3;</code>
   * @return The ldidaklojne.
   */
  @java.lang.Override
  public boolean getLdidaklojne() {
    return ldidaklojne_;
  }

  public static final int ILMHNBCPLNG_FIELD_NUMBER = 4;
  private volatile java.lang.Object ilmhnbcplng_;
  /**
   * <code>string ilmhnbcplng = 4;</code>
   * @return The ilmhnbcplng.
   */
  @java.lang.Override
  public java.lang.String getIlmhnbcplng() {
    java.lang.Object ref = ilmhnbcplng_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ilmhnbcplng_ = s;
      return s;
    }
  }
  /**
   * <code>string ilmhnbcplng = 4;</code>
   * @return The bytes for ilmhnbcplng.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIlmhnbcplngBytes() {
    java.lang.Object ref = ilmhnbcplng_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ilmhnbcplng_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AIPIBDGPPED_FIELD_NUMBER = 5;
  private boolean aipibdgpped_;
  /**
   * <code>bool aipibdgpped = 5;</code>
   * @return The aipibdgpped.
   */
  @java.lang.Override
  public boolean getAipibdgpped() {
    return aipibdgpped_;
  }

  public static final int MEBLEJAHDDH_FIELD_NUMBER = 6;
  private volatile java.lang.Object meblejahddh_;
  /**
   * <code>string meblejahddh = 6;</code>
   * @return The meblejahddh.
   */
  @java.lang.Override
  public java.lang.String getMeblejahddh() {
    java.lang.Object ref = meblejahddh_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      meblejahddh_ = s;
      return s;
    }
  }
  /**
   * <code>string meblejahddh = 6;</code>
   * @return The bytes for meblejahddh.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMeblejahddhBytes() {
    java.lang.Object ref = meblejahddh_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      meblejahddh_ = b;
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
    for (int i = 0; i < nfnokciaooh_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nfnokciaooh_.getRaw(i));
    }
    if (dfihodeidnd_ != false) {
      output.writeBool(2, dfihodeidnd_);
    }
    if (ldidaklojne_ != false) {
      output.writeBool(3, ldidaklojne_);
    }
    if (!getIlmhnbcplngBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ilmhnbcplng_);
    }
    if (aipibdgpped_ != false) {
      output.writeBool(5, aipibdgpped_);
    }
    if (!getMeblejahddhBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, meblejahddh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < nfnokciaooh_.size(); i++) {
        dataSize += computeStringSizeNoTag(nfnokciaooh_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNfnokciaoohList().size();
    }
    if (dfihodeidnd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dfihodeidnd_);
    }
    if (ldidaklojne_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, ldidaklojne_);
    }
    if (!getIlmhnbcplngBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ilmhnbcplng_);
    }
    if (aipibdgpped_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, aipibdgpped_);
    }
    if (!getMeblejahddhBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, meblejahddh_);
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
    if (!(obj instanceof POGOProtos.Rpc.KKPAIGDKNLI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KKPAIGDKNLI other = (POGOProtos.Rpc.KKPAIGDKNLI) obj;

    if (!getNfnokciaoohList()
        .equals(other.getNfnokciaoohList())) return false;
    if (getDfihodeidnd()
        != other.getDfihodeidnd()) return false;
    if (getLdidaklojne()
        != other.getLdidaklojne()) return false;
    if (!getIlmhnbcplng()
        .equals(other.getIlmhnbcplng())) return false;
    if (getAipibdgpped()
        != other.getAipibdgpped()) return false;
    if (!getMeblejahddh()
        .equals(other.getMeblejahddh())) return false;
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
    if (getNfnokciaoohCount() > 0) {
      hash = (37 * hash) + NFNOKCIAOOH_FIELD_NUMBER;
      hash = (53 * hash) + getNfnokciaoohList().hashCode();
    }
    hash = (37 * hash) + DFIHODEIDND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDfihodeidnd());
    hash = (37 * hash) + LDIDAKLOJNE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLdidaklojne());
    hash = (37 * hash) + ILMHNBCPLNG_FIELD_NUMBER;
    hash = (53 * hash) + getIlmhnbcplng().hashCode();
    hash = (37 * hash) + AIPIBDGPPED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAipibdgpped());
    hash = (37 * hash) + MEBLEJAHDDH_FIELD_NUMBER;
    hash = (53 * hash) + getMeblejahddh().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKPAIGDKNLI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KKPAIGDKNLI prototype) {
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
   * ref: KKPAIGDKNLI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KKPAIGDKNLI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KKPAIGDKNLI)
      POGOProtos.Rpc.KKPAIGDKNLIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKPAIGDKNLI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKPAIGDKNLI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KKPAIGDKNLI.class, POGOProtos.Rpc.KKPAIGDKNLI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KKPAIGDKNLI.newBuilder()
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
      nfnokciaooh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      dfihodeidnd_ = false;

      ldidaklojne_ = false;

      ilmhnbcplng_ = "";

      aipibdgpped_ = false;

      meblejahddh_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKPAIGDKNLI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKPAIGDKNLI getDefaultInstanceForType() {
      return POGOProtos.Rpc.KKPAIGDKNLI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKPAIGDKNLI build() {
      POGOProtos.Rpc.KKPAIGDKNLI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKPAIGDKNLI buildPartial() {
      POGOProtos.Rpc.KKPAIGDKNLI result = new POGOProtos.Rpc.KKPAIGDKNLI(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nfnokciaooh_ = nfnokciaooh_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nfnokciaooh_ = nfnokciaooh_;
      result.dfihodeidnd_ = dfihodeidnd_;
      result.ldidaklojne_ = ldidaklojne_;
      result.ilmhnbcplng_ = ilmhnbcplng_;
      result.aipibdgpped_ = aipibdgpped_;
      result.meblejahddh_ = meblejahddh_;
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
      if (other instanceof POGOProtos.Rpc.KKPAIGDKNLI) {
        return mergeFrom((POGOProtos.Rpc.KKPAIGDKNLI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KKPAIGDKNLI other) {
      if (other == POGOProtos.Rpc.KKPAIGDKNLI.getDefaultInstance()) return this;
      if (!other.nfnokciaooh_.isEmpty()) {
        if (nfnokciaooh_.isEmpty()) {
          nfnokciaooh_ = other.nfnokciaooh_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNfnokciaoohIsMutable();
          nfnokciaooh_.addAll(other.nfnokciaooh_);
        }
        onChanged();
      }
      if (other.getDfihodeidnd() != false) {
        setDfihodeidnd(other.getDfihodeidnd());
      }
      if (other.getLdidaklojne() != false) {
        setLdidaklojne(other.getLdidaklojne());
      }
      if (!other.getIlmhnbcplng().isEmpty()) {
        ilmhnbcplng_ = other.ilmhnbcplng_;
        onChanged();
      }
      if (other.getAipibdgpped() != false) {
        setAipibdgpped(other.getAipibdgpped());
      }
      if (!other.getMeblejahddh().isEmpty()) {
        meblejahddh_ = other.meblejahddh_;
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
      POGOProtos.Rpc.KKPAIGDKNLI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KKPAIGDKNLI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList nfnokciaooh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNfnokciaoohIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nfnokciaooh_ = new com.google.protobuf.LazyStringArrayList(nfnokciaooh_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @return A list containing the nfnokciaooh.
     */
    public com.google.protobuf.ProtocolStringList
        getNfnokciaoohList() {
      return nfnokciaooh_.getUnmodifiableView();
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @return The count of nfnokciaooh.
     */
    public int getNfnokciaoohCount() {
      return nfnokciaooh_.size();
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param index The index of the element to return.
     * @return The nfnokciaooh at the given index.
     */
    public java.lang.String getNfnokciaooh(int index) {
      return nfnokciaooh_.get(index);
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the nfnokciaooh at the given index.
     */
    public com.google.protobuf.ByteString
        getNfnokciaoohBytes(int index) {
      return nfnokciaooh_.getByteString(index);
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param index The index to set the value at.
     * @param value The nfnokciaooh to set.
     * @return This builder for chaining.
     */
    public Builder setNfnokciaooh(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNfnokciaoohIsMutable();
      nfnokciaooh_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param value The nfnokciaooh to add.
     * @return This builder for chaining.
     */
    public Builder addNfnokciaooh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNfnokciaoohIsMutable();
      nfnokciaooh_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param values The nfnokciaooh to add.
     * @return This builder for chaining.
     */
    public Builder addAllNfnokciaooh(
        java.lang.Iterable<java.lang.String> values) {
      ensureNfnokciaoohIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nfnokciaooh_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNfnokciaooh() {
      nfnokciaooh_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string nfnokciaooh = 1;</code>
     * @param value The bytes of the nfnokciaooh to add.
     * @return This builder for chaining.
     */
    public Builder addNfnokciaoohBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNfnokciaoohIsMutable();
      nfnokciaooh_.add(value);
      onChanged();
      return this;
    }

    private boolean dfihodeidnd_ ;
    /**
     * <code>bool dfihodeidnd = 2;</code>
     * @return The dfihodeidnd.
     */
    @java.lang.Override
    public boolean getDfihodeidnd() {
      return dfihodeidnd_;
    }
    /**
     * <code>bool dfihodeidnd = 2;</code>
     * @param value The dfihodeidnd to set.
     * @return This builder for chaining.
     */
    public Builder setDfihodeidnd(boolean value) {
      
      dfihodeidnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dfihodeidnd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDfihodeidnd() {
      
      dfihodeidnd_ = false;
      onChanged();
      return this;
    }

    private boolean ldidaklojne_ ;
    /**
     * <code>bool ldidaklojne = 3;</code>
     * @return The ldidaklojne.
     */
    @java.lang.Override
    public boolean getLdidaklojne() {
      return ldidaklojne_;
    }
    /**
     * <code>bool ldidaklojne = 3;</code>
     * @param value The ldidaklojne to set.
     * @return This builder for chaining.
     */
    public Builder setLdidaklojne(boolean value) {
      
      ldidaklojne_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ldidaklojne = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLdidaklojne() {
      
      ldidaklojne_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object ilmhnbcplng_ = "";
    /**
     * <code>string ilmhnbcplng = 4;</code>
     * @return The ilmhnbcplng.
     */
    public java.lang.String getIlmhnbcplng() {
      java.lang.Object ref = ilmhnbcplng_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ilmhnbcplng_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ilmhnbcplng = 4;</code>
     * @return The bytes for ilmhnbcplng.
     */
    public com.google.protobuf.ByteString
        getIlmhnbcplngBytes() {
      java.lang.Object ref = ilmhnbcplng_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ilmhnbcplng_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ilmhnbcplng = 4;</code>
     * @param value The ilmhnbcplng to set.
     * @return This builder for chaining.
     */
    public Builder setIlmhnbcplng(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ilmhnbcplng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ilmhnbcplng = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIlmhnbcplng() {
      
      ilmhnbcplng_ = getDefaultInstance().getIlmhnbcplng();
      onChanged();
      return this;
    }
    /**
     * <code>string ilmhnbcplng = 4;</code>
     * @param value The bytes for ilmhnbcplng to set.
     * @return This builder for chaining.
     */
    public Builder setIlmhnbcplngBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ilmhnbcplng_ = value;
      onChanged();
      return this;
    }

    private boolean aipibdgpped_ ;
    /**
     * <code>bool aipibdgpped = 5;</code>
     * @return The aipibdgpped.
     */
    @java.lang.Override
    public boolean getAipibdgpped() {
      return aipibdgpped_;
    }
    /**
     * <code>bool aipibdgpped = 5;</code>
     * @param value The aipibdgpped to set.
     * @return This builder for chaining.
     */
    public Builder setAipibdgpped(boolean value) {
      
      aipibdgpped_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool aipibdgpped = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAipibdgpped() {
      
      aipibdgpped_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object meblejahddh_ = "";
    /**
     * <code>string meblejahddh = 6;</code>
     * @return The meblejahddh.
     */
    public java.lang.String getMeblejahddh() {
      java.lang.Object ref = meblejahddh_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        meblejahddh_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string meblejahddh = 6;</code>
     * @return The bytes for meblejahddh.
     */
    public com.google.protobuf.ByteString
        getMeblejahddhBytes() {
      java.lang.Object ref = meblejahddh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        meblejahddh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string meblejahddh = 6;</code>
     * @param value The meblejahddh to set.
     * @return This builder for chaining.
     */
    public Builder setMeblejahddh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      meblejahddh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string meblejahddh = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeblejahddh() {
      
      meblejahddh_ = getDefaultInstance().getMeblejahddh();
      onChanged();
      return this;
    }
    /**
     * <code>string meblejahddh = 6;</code>
     * @param value The bytes for meblejahddh to set.
     * @return This builder for chaining.
     */
    public Builder setMeblejahddhBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      meblejahddh_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KKPAIGDKNLI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KKPAIGDKNLI)
  private static final POGOProtos.Rpc.KKPAIGDKNLI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KKPAIGDKNLI();
  }

  public static POGOProtos.Rpc.KKPAIGDKNLI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KKPAIGDKNLI>
      PARSER = new com.google.protobuf.AbstractParser<KKPAIGDKNLI>() {
    @java.lang.Override
    public KKPAIGDKNLI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KKPAIGDKNLI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KKPAIGDKNLI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KKPAIGDKNLI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KKPAIGDKNLI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

