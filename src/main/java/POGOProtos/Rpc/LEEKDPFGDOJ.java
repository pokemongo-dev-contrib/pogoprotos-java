// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LEEKDPFGDOJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LEEKDPFGDOJ}
 */
public final class LEEKDPFGDOJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LEEKDPFGDOJ)
    LEEKDPFGDOJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LEEKDPFGDOJ.newBuilder() to construct.
  private LEEKDPFGDOJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LEEKDPFGDOJ() {
    obpagkjfkko_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LEEKDPFGDOJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LEEKDPFGDOJ(
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

            obpagkjfkko_ = rawValue;
            break;
          }
          case 16: {

            degelenjajd_ = input.readInt32();
            break;
          }
          case 29: {

            oimhehgpchh_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEEKDPFGDOJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEEKDPFGDOJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LEEKDPFGDOJ.class, POGOProtos.Rpc.LEEKDPFGDOJ.Builder.class);
  }

  public static final int OBPAGKJFKKO_FIELD_NUMBER = 1;
  private int obpagkjfkko_;
  /**
   * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
   * @return The enum numeric value on the wire for obpagkjfkko.
   */
  @java.lang.Override public int getObpagkjfkkoValue() {
    return obpagkjfkko_;
  }
  /**
   * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
   * @return The obpagkjfkko.
   */
  @java.lang.Override public POGOProtos.Rpc.GONGIFHJCLF getObpagkjfkko() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GONGIFHJCLF result = POGOProtos.Rpc.GONGIFHJCLF.valueOf(obpagkjfkko_);
    return result == null ? POGOProtos.Rpc.GONGIFHJCLF.UNRECOGNIZED : result;
  }

  public static final int DEGELENJAJD_FIELD_NUMBER = 2;
  private int degelenjajd_;
  /**
   * <code>int32 degelenjajd = 2;</code>
   * @return The degelenjajd.
   */
  @java.lang.Override
  public int getDegelenjajd() {
    return degelenjajd_;
  }

  public static final int OIMHEHGPCHH_FIELD_NUMBER = 3;
  private float oimhehgpchh_;
  /**
   * <code>float oimhehgpchh = 3;</code>
   * @return The oimhehgpchh.
   */
  @java.lang.Override
  public float getOimhehgpchh() {
    return oimhehgpchh_;
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
    if (obpagkjfkko_ != POGOProtos.Rpc.GONGIFHJCLF.GONGIFHJCLF_INCUBATOR_UNSET.getNumber()) {
      output.writeEnum(1, obpagkjfkko_);
    }
    if (degelenjajd_ != 0) {
      output.writeInt32(2, degelenjajd_);
    }
    if (oimhehgpchh_ != 0F) {
      output.writeFloat(3, oimhehgpchh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (obpagkjfkko_ != POGOProtos.Rpc.GONGIFHJCLF.GONGIFHJCLF_INCUBATOR_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, obpagkjfkko_);
    }
    if (degelenjajd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, degelenjajd_);
    }
    if (oimhehgpchh_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, oimhehgpchh_);
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
    if (!(obj instanceof POGOProtos.Rpc.LEEKDPFGDOJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LEEKDPFGDOJ other = (POGOProtos.Rpc.LEEKDPFGDOJ) obj;

    if (obpagkjfkko_ != other.obpagkjfkko_) return false;
    if (getDegelenjajd()
        != other.getDegelenjajd()) return false;
    if (java.lang.Float.floatToIntBits(getOimhehgpchh())
        != java.lang.Float.floatToIntBits(
            other.getOimhehgpchh())) return false;
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
    hash = (37 * hash) + OBPAGKJFKKO_FIELD_NUMBER;
    hash = (53 * hash) + obpagkjfkko_;
    hash = (37 * hash) + DEGELENJAJD_FIELD_NUMBER;
    hash = (53 * hash) + getDegelenjajd();
    hash = (37 * hash) + OIMHEHGPCHH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOimhehgpchh());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LEEKDPFGDOJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LEEKDPFGDOJ prototype) {
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
   * ref: LEEKDPFGDOJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LEEKDPFGDOJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LEEKDPFGDOJ)
      POGOProtos.Rpc.LEEKDPFGDOJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEEKDPFGDOJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEEKDPFGDOJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LEEKDPFGDOJ.class, POGOProtos.Rpc.LEEKDPFGDOJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LEEKDPFGDOJ.newBuilder()
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
      obpagkjfkko_ = 0;

      degelenjajd_ = 0;

      oimhehgpchh_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LEEKDPFGDOJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEEKDPFGDOJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.LEEKDPFGDOJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEEKDPFGDOJ build() {
      POGOProtos.Rpc.LEEKDPFGDOJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LEEKDPFGDOJ buildPartial() {
      POGOProtos.Rpc.LEEKDPFGDOJ result = new POGOProtos.Rpc.LEEKDPFGDOJ(this);
      result.obpagkjfkko_ = obpagkjfkko_;
      result.degelenjajd_ = degelenjajd_;
      result.oimhehgpchh_ = oimhehgpchh_;
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
      if (other instanceof POGOProtos.Rpc.LEEKDPFGDOJ) {
        return mergeFrom((POGOProtos.Rpc.LEEKDPFGDOJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LEEKDPFGDOJ other) {
      if (other == POGOProtos.Rpc.LEEKDPFGDOJ.getDefaultInstance()) return this;
      if (other.obpagkjfkko_ != 0) {
        setObpagkjfkkoValue(other.getObpagkjfkkoValue());
      }
      if (other.getDegelenjajd() != 0) {
        setDegelenjajd(other.getDegelenjajd());
      }
      if (other.getOimhehgpchh() != 0F) {
        setOimhehgpchh(other.getOimhehgpchh());
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
      POGOProtos.Rpc.LEEKDPFGDOJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LEEKDPFGDOJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int obpagkjfkko_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
     * @return The enum numeric value on the wire for obpagkjfkko.
     */
    @java.lang.Override public int getObpagkjfkkoValue() {
      return obpagkjfkko_;
    }
    /**
     * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
     * @param value The enum numeric value on the wire for obpagkjfkko to set.
     * @return This builder for chaining.
     */
    public Builder setObpagkjfkkoValue(int value) {
      
      obpagkjfkko_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
     * @return The obpagkjfkko.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GONGIFHJCLF getObpagkjfkko() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GONGIFHJCLF result = POGOProtos.Rpc.GONGIFHJCLF.valueOf(obpagkjfkko_);
      return result == null ? POGOProtos.Rpc.GONGIFHJCLF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
     * @param value The obpagkjfkko to set.
     * @return This builder for chaining.
     */
    public Builder setObpagkjfkko(POGOProtos.Rpc.GONGIFHJCLF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      obpagkjfkko_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GONGIFHJCLF obpagkjfkko = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObpagkjfkko() {
      
      obpagkjfkko_ = 0;
      onChanged();
      return this;
    }

    private int degelenjajd_ ;
    /**
     * <code>int32 degelenjajd = 2;</code>
     * @return The degelenjajd.
     */
    @java.lang.Override
    public int getDegelenjajd() {
      return degelenjajd_;
    }
    /**
     * <code>int32 degelenjajd = 2;</code>
     * @param value The degelenjajd to set.
     * @return This builder for chaining.
     */
    public Builder setDegelenjajd(int value) {
      
      degelenjajd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 degelenjajd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDegelenjajd() {
      
      degelenjajd_ = 0;
      onChanged();
      return this;
    }

    private float oimhehgpchh_ ;
    /**
     * <code>float oimhehgpchh = 3;</code>
     * @return The oimhehgpchh.
     */
    @java.lang.Override
    public float getOimhehgpchh() {
      return oimhehgpchh_;
    }
    /**
     * <code>float oimhehgpchh = 3;</code>
     * @param value The oimhehgpchh to set.
     * @return This builder for chaining.
     */
    public Builder setOimhehgpchh(float value) {
      
      oimhehgpchh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float oimhehgpchh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOimhehgpchh() {
      
      oimhehgpchh_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LEEKDPFGDOJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LEEKDPFGDOJ)
  private static final POGOProtos.Rpc.LEEKDPFGDOJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LEEKDPFGDOJ();
  }

  public static POGOProtos.Rpc.LEEKDPFGDOJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LEEKDPFGDOJ>
      PARSER = new com.google.protobuf.AbstractParser<LEEKDPFGDOJ>() {
    @java.lang.Override
    public LEEKDPFGDOJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LEEKDPFGDOJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LEEKDPFGDOJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LEEKDPFGDOJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LEEKDPFGDOJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

