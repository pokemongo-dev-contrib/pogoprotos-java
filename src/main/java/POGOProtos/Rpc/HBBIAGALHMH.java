// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HBBIAGALHMH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HBBIAGALHMH}
 */
public final class HBBIAGALHMH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HBBIAGALHMH)
    HBBIAGALHMHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HBBIAGALHMH.newBuilder() to construct.
  private HBBIAGALHMH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HBBIAGALHMH() {
    enhjbnpjefj_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HBBIAGALHMH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HBBIAGALHMH(
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

            enhjbnpjefj_ = rawValue;
            break;
          }
          case 16: {

            bimlclagmdh_ = input.readInt32();
            break;
          }
          case 24: {

            fifmnjeeehj_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBBIAGALHMH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBBIAGALHMH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HBBIAGALHMH.class, POGOProtos.Rpc.HBBIAGALHMH.Builder.class);
  }

  public static final int ENHJBNPJEFJ_FIELD_NUMBER = 1;
  private int enhjbnpjefj_;
  /**
   * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
   * @return The enum numeric value on the wire for enhjbnpjefj.
   */
  @java.lang.Override public int getEnhjbnpjefjValue() {
    return enhjbnpjefj_;
  }
  /**
   * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
   * @return The enhjbnpjefj.
   */
  @java.lang.Override public POGOProtos.Rpc.IJOEHBCIACP getEnhjbnpjefj() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.IJOEHBCIACP result = POGOProtos.Rpc.IJOEHBCIACP.valueOf(enhjbnpjefj_);
    return result == null ? POGOProtos.Rpc.IJOEHBCIACP.UNRECOGNIZED : result;
  }

  public static final int BIMLCLAGMDH_FIELD_NUMBER = 2;
  private int bimlclagmdh_;
  /**
   * <code>int32 bimlclagmdh = 2;</code>
   * @return The bimlclagmdh.
   */
  @java.lang.Override
  public int getBimlclagmdh() {
    return bimlclagmdh_;
  }

  public static final int FIFMNJEEEHJ_FIELD_NUMBER = 3;
  private int fifmnjeeehj_;
  /**
   * <code>int32 fifmnjeeehj = 3;</code>
   * @return The fifmnjeeehj.
   */
  @java.lang.Override
  public int getFifmnjeeehj() {
    return fifmnjeeehj_;
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
    if (enhjbnpjefj_ != POGOProtos.Rpc.IJOEHBCIACP.IJOEHBCIACP_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      output.writeEnum(1, enhjbnpjefj_);
    }
    if (bimlclagmdh_ != 0) {
      output.writeInt32(2, bimlclagmdh_);
    }
    if (fifmnjeeehj_ != 0) {
      output.writeInt32(3, fifmnjeeehj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enhjbnpjefj_ != POGOProtos.Rpc.IJOEHBCIACP.IJOEHBCIACP_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, enhjbnpjefj_);
    }
    if (bimlclagmdh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, bimlclagmdh_);
    }
    if (fifmnjeeehj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fifmnjeeehj_);
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
    if (!(obj instanceof POGOProtos.Rpc.HBBIAGALHMH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HBBIAGALHMH other = (POGOProtos.Rpc.HBBIAGALHMH) obj;

    if (enhjbnpjefj_ != other.enhjbnpjefj_) return false;
    if (getBimlclagmdh()
        != other.getBimlclagmdh()) return false;
    if (getFifmnjeeehj()
        != other.getFifmnjeeehj()) return false;
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
    hash = (37 * hash) + ENHJBNPJEFJ_FIELD_NUMBER;
    hash = (53 * hash) + enhjbnpjefj_;
    hash = (37 * hash) + BIMLCLAGMDH_FIELD_NUMBER;
    hash = (53 * hash) + getBimlclagmdh();
    hash = (37 * hash) + FIFMNJEEEHJ_FIELD_NUMBER;
    hash = (53 * hash) + getFifmnjeeehj();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBBIAGALHMH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HBBIAGALHMH prototype) {
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
   * ref: HBBIAGALHMH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HBBIAGALHMH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HBBIAGALHMH)
      POGOProtos.Rpc.HBBIAGALHMHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBBIAGALHMH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBBIAGALHMH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HBBIAGALHMH.class, POGOProtos.Rpc.HBBIAGALHMH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HBBIAGALHMH.newBuilder()
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
      enhjbnpjefj_ = 0;

      bimlclagmdh_ = 0;

      fifmnjeeehj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBBIAGALHMH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBBIAGALHMH getDefaultInstanceForType() {
      return POGOProtos.Rpc.HBBIAGALHMH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBBIAGALHMH build() {
      POGOProtos.Rpc.HBBIAGALHMH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBBIAGALHMH buildPartial() {
      POGOProtos.Rpc.HBBIAGALHMH result = new POGOProtos.Rpc.HBBIAGALHMH(this);
      result.enhjbnpjefj_ = enhjbnpjefj_;
      result.bimlclagmdh_ = bimlclagmdh_;
      result.fifmnjeeehj_ = fifmnjeeehj_;
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
      if (other instanceof POGOProtos.Rpc.HBBIAGALHMH) {
        return mergeFrom((POGOProtos.Rpc.HBBIAGALHMH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HBBIAGALHMH other) {
      if (other == POGOProtos.Rpc.HBBIAGALHMH.getDefaultInstance()) return this;
      if (other.enhjbnpjefj_ != 0) {
        setEnhjbnpjefjValue(other.getEnhjbnpjefjValue());
      }
      if (other.getBimlclagmdh() != 0) {
        setBimlclagmdh(other.getBimlclagmdh());
      }
      if (other.getFifmnjeeehj() != 0) {
        setFifmnjeeehj(other.getFifmnjeeehj());
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
      POGOProtos.Rpc.HBBIAGALHMH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HBBIAGALHMH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int enhjbnpjefj_ = 0;
    /**
     * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
     * @return The enum numeric value on the wire for enhjbnpjefj.
     */
    @java.lang.Override public int getEnhjbnpjefjValue() {
      return enhjbnpjefj_;
    }
    /**
     * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
     * @param value The enum numeric value on the wire for enhjbnpjefj to set.
     * @return This builder for chaining.
     */
    public Builder setEnhjbnpjefjValue(int value) {
      
      enhjbnpjefj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
     * @return The enhjbnpjefj.
     */
    @java.lang.Override
    public POGOProtos.Rpc.IJOEHBCIACP getEnhjbnpjefj() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.IJOEHBCIACP result = POGOProtos.Rpc.IJOEHBCIACP.valueOf(enhjbnpjefj_);
      return result == null ? POGOProtos.Rpc.IJOEHBCIACP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
     * @param value The enhjbnpjefj to set.
     * @return This builder for chaining.
     */
    public Builder setEnhjbnpjefj(POGOProtos.Rpc.IJOEHBCIACP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      enhjbnpjefj_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IJOEHBCIACP enhjbnpjefj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnhjbnpjefj() {
      
      enhjbnpjefj_ = 0;
      onChanged();
      return this;
    }

    private int bimlclagmdh_ ;
    /**
     * <code>int32 bimlclagmdh = 2;</code>
     * @return The bimlclagmdh.
     */
    @java.lang.Override
    public int getBimlclagmdh() {
      return bimlclagmdh_;
    }
    /**
     * <code>int32 bimlclagmdh = 2;</code>
     * @param value The bimlclagmdh to set.
     * @return This builder for chaining.
     */
    public Builder setBimlclagmdh(int value) {
      
      bimlclagmdh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bimlclagmdh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBimlclagmdh() {
      
      bimlclagmdh_ = 0;
      onChanged();
      return this;
    }

    private int fifmnjeeehj_ ;
    /**
     * <code>int32 fifmnjeeehj = 3;</code>
     * @return The fifmnjeeehj.
     */
    @java.lang.Override
    public int getFifmnjeeehj() {
      return fifmnjeeehj_;
    }
    /**
     * <code>int32 fifmnjeeehj = 3;</code>
     * @param value The fifmnjeeehj to set.
     * @return This builder for chaining.
     */
    public Builder setFifmnjeeehj(int value) {
      
      fifmnjeeehj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fifmnjeeehj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFifmnjeeehj() {
      
      fifmnjeeehj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HBBIAGALHMH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HBBIAGALHMH)
  private static final POGOProtos.Rpc.HBBIAGALHMH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HBBIAGALHMH();
  }

  public static POGOProtos.Rpc.HBBIAGALHMH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HBBIAGALHMH>
      PARSER = new com.google.protobuf.AbstractParser<HBBIAGALHMH>() {
    @java.lang.Override
    public HBBIAGALHMH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HBBIAGALHMH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HBBIAGALHMH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HBBIAGALHMH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HBBIAGALHMH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

