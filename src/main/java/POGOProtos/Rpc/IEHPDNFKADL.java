// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IEHPDNFKADL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IEHPDNFKADL}
 */
public final class IEHPDNFKADL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IEHPDNFKADL)
    IEHPDNFKADLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IEHPDNFKADL.newBuilder() to construct.
  private IEHPDNFKADL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IEHPDNFKADL() {
    fkcdnfmamnm_ = 0;
    kalphbkocok_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IEHPDNFKADL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IEHPDNFKADL(
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

            fkcdnfmamnm_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kalphbkocok_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IEHPDNFKADL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IEHPDNFKADL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IEHPDNFKADL.class, POGOProtos.Rpc.IEHPDNFKADL.Builder.class);
  }

  public static final int FKCDNFMAMNM_FIELD_NUMBER = 1;
  private int fkcdnfmamnm_;
  /**
   * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
   * @return The enum numeric value on the wire for fkcdnfmamnm.
   */
  @java.lang.Override public int getFkcdnfmamnmValue() {
    return fkcdnfmamnm_;
  }
  /**
   * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
   * @return The fkcdnfmamnm.
   */
  @java.lang.Override public POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN getFkcdnfmamnm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN result = POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.valueOf(fkcdnfmamnm_);
    return result == null ? POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.UNRECOGNIZED : result;
  }

  public static final int KALPHBKOCOK_FIELD_NUMBER = 2;
  private int kalphbkocok_;
  /**
   * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
   * @return The enum numeric value on the wire for kalphbkocok.
   */
  @java.lang.Override public int getKalphbkocokValue() {
    return kalphbkocok_;
  }
  /**
   * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
   * @return The kalphbkocok.
   */
  @java.lang.Override public POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI getKalphbkocok() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI result = POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.valueOf(kalphbkocok_);
    return result == null ? POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.UNRECOGNIZED : result;
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
    if (fkcdnfmamnm_ != POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.POKESTOP_NORMAL.getNumber()) {
      output.writeEnum(1, fkcdnfmamnm_);
    }
    if (kalphbkocok_ != POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(2, kalphbkocok_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fkcdnfmamnm_ != POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.POKESTOP_NORMAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, fkcdnfmamnm_);
    }
    if (kalphbkocok_ != POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kalphbkocok_);
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
    if (!(obj instanceof POGOProtos.Rpc.IEHPDNFKADL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IEHPDNFKADL other = (POGOProtos.Rpc.IEHPDNFKADL) obj;

    if (fkcdnfmamnm_ != other.fkcdnfmamnm_) return false;
    if (kalphbkocok_ != other.kalphbkocok_) return false;
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
    hash = (37 * hash) + FKCDNFMAMNM_FIELD_NUMBER;
    hash = (53 * hash) + fkcdnfmamnm_;
    hash = (37 * hash) + KALPHBKOCOK_FIELD_NUMBER;
    hash = (53 * hash) + kalphbkocok_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEHPDNFKADL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IEHPDNFKADL prototype) {
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
   * ref: IEHPDNFKADL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IEHPDNFKADL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IEHPDNFKADL)
      POGOProtos.Rpc.IEHPDNFKADLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IEHPDNFKADL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IEHPDNFKADL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IEHPDNFKADL.class, POGOProtos.Rpc.IEHPDNFKADL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IEHPDNFKADL.newBuilder()
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
      fkcdnfmamnm_ = 0;

      kalphbkocok_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IEHPDNFKADL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEHPDNFKADL getDefaultInstanceForType() {
      return POGOProtos.Rpc.IEHPDNFKADL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEHPDNFKADL build() {
      POGOProtos.Rpc.IEHPDNFKADL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEHPDNFKADL buildPartial() {
      POGOProtos.Rpc.IEHPDNFKADL result = new POGOProtos.Rpc.IEHPDNFKADL(this);
      result.fkcdnfmamnm_ = fkcdnfmamnm_;
      result.kalphbkocok_ = kalphbkocok_;
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
      if (other instanceof POGOProtos.Rpc.IEHPDNFKADL) {
        return mergeFrom((POGOProtos.Rpc.IEHPDNFKADL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IEHPDNFKADL other) {
      if (other == POGOProtos.Rpc.IEHPDNFKADL.getDefaultInstance()) return this;
      if (other.fkcdnfmamnm_ != 0) {
        setFkcdnfmamnmValue(other.getFkcdnfmamnmValue());
      }
      if (other.kalphbkocok_ != 0) {
        setKalphbkocokValue(other.getKalphbkocokValue());
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
      POGOProtos.Rpc.IEHPDNFKADL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IEHPDNFKADL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fkcdnfmamnm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
     * @return The enum numeric value on the wire for fkcdnfmamnm.
     */
    @java.lang.Override public int getFkcdnfmamnmValue() {
      return fkcdnfmamnm_;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
     * @param value The enum numeric value on the wire for fkcdnfmamnm to set.
     * @return This builder for chaining.
     */
    public Builder setFkcdnfmamnmValue(int value) {
      
      fkcdnfmamnm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
     * @return The fkcdnfmamnm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN getFkcdnfmamnm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN result = POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.valueOf(fkcdnfmamnm_);
      return result == null ? POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
     * @param value The fkcdnfmamnm to set.
     * @return This builder for chaining.
     */
    public Builder setFkcdnfmamnm(POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fkcdnfmamnm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.PAGBIHDAFBN fkcdnfmamnm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFkcdnfmamnm() {
      
      fkcdnfmamnm_ = 0;
      onChanged();
      return this;
    }

    private int kalphbkocok_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
     * @return The enum numeric value on the wire for kalphbkocok.
     */
    @java.lang.Override public int getKalphbkocokValue() {
      return kalphbkocok_;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
     * @param value The enum numeric value on the wire for kalphbkocok to set.
     * @return This builder for chaining.
     */
    public Builder setKalphbkocokValue(int value) {
      
      kalphbkocok_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
     * @return The kalphbkocok.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI getKalphbkocok() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI result = POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.valueOf(kalphbkocok_);
      return result == null ? POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
     * @param value The kalphbkocok to set.
     * @return This builder for chaining.
     */
    public Builder setKalphbkocok(POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kalphbkocok_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MOPKMNANHJA.CMCJOLGAEKI kalphbkocok = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKalphbkocok() {
      
      kalphbkocok_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IEHPDNFKADL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IEHPDNFKADL)
  private static final POGOProtos.Rpc.IEHPDNFKADL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IEHPDNFKADL();
  }

  public static POGOProtos.Rpc.IEHPDNFKADL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IEHPDNFKADL>
      PARSER = new com.google.protobuf.AbstractParser<IEHPDNFKADL>() {
    @java.lang.Override
    public IEHPDNFKADL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IEHPDNFKADL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IEHPDNFKADL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IEHPDNFKADL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IEHPDNFKADL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

