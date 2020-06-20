// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DHNIKONHFBJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DHNIKONHFBJ}
 */
public  final class DHNIKONHFBJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DHNIKONHFBJ)
    DHNIKONHFBJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DHNIKONHFBJ.newBuilder() to construct.
  private DHNIKONHFBJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DHNIKONHFBJ() {
    jnndpcfejck_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DHNIKONHFBJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DHNIKONHFBJ(
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

            jnndpcfejck_ = rawValue;
            break;
          }
          case 16: {

            ebnddoihkmh_ = input.readInt32();
            break;
          }
          case 29: {

            mmphbjelbfe_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHNIKONHFBJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHNIKONHFBJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DHNIKONHFBJ.class, POGOProtos.Rpc.DHNIKONHFBJ.Builder.class);
  }

  public static final int JNNDPCFEJCK_FIELD_NUMBER = 1;
  private int jnndpcfejck_;
  /**
   * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
   * @return The enum numeric value on the wire for jnndpcfejck.
   */
  public int getJnndpcfejckValue() {
    return jnndpcfejck_;
  }
  /**
   * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
   * @return The jnndpcfejck.
   */
  public POGOProtos.Rpc.FBGOEGCBGIN getJnndpcfejck() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FBGOEGCBGIN result = POGOProtos.Rpc.FBGOEGCBGIN.valueOf(jnndpcfejck_);
    return result == null ? POGOProtos.Rpc.FBGOEGCBGIN.UNRECOGNIZED : result;
  }

  public static final int EBNDDOIHKMH_FIELD_NUMBER = 2;
  private int ebnddoihkmh_;
  /**
   * <code>int32 ebnddoihkmh = 2;</code>
   * @return The ebnddoihkmh.
   */
  public int getEbnddoihkmh() {
    return ebnddoihkmh_;
  }

  public static final int MMPHBJELBFE_FIELD_NUMBER = 3;
  private float mmphbjelbfe_;
  /**
   * <code>float mmphbjelbfe = 3;</code>
   * @return The mmphbjelbfe.
   */
  public float getMmphbjelbfe() {
    return mmphbjelbfe_;
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
    if (jnndpcfejck_ != POGOProtos.Rpc.FBGOEGCBGIN.FBGOEGCBGIN_INCUBATOR_UNSET.getNumber()) {
      output.writeEnum(1, jnndpcfejck_);
    }
    if (ebnddoihkmh_ != 0) {
      output.writeInt32(2, ebnddoihkmh_);
    }
    if (mmphbjelbfe_ != 0F) {
      output.writeFloat(3, mmphbjelbfe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jnndpcfejck_ != POGOProtos.Rpc.FBGOEGCBGIN.FBGOEGCBGIN_INCUBATOR_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jnndpcfejck_);
    }
    if (ebnddoihkmh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ebnddoihkmh_);
    }
    if (mmphbjelbfe_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, mmphbjelbfe_);
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
    if (!(obj instanceof POGOProtos.Rpc.DHNIKONHFBJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DHNIKONHFBJ other = (POGOProtos.Rpc.DHNIKONHFBJ) obj;

    if (jnndpcfejck_ != other.jnndpcfejck_) return false;
    if (getEbnddoihkmh()
        != other.getEbnddoihkmh()) return false;
    if (java.lang.Float.floatToIntBits(getMmphbjelbfe())
        != java.lang.Float.floatToIntBits(
            other.getMmphbjelbfe())) return false;
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
    hash = (37 * hash) + JNNDPCFEJCK_FIELD_NUMBER;
    hash = (53 * hash) + jnndpcfejck_;
    hash = (37 * hash) + EBNDDOIHKMH_FIELD_NUMBER;
    hash = (53 * hash) + getEbnddoihkmh();
    hash = (37 * hash) + MMPHBJELBFE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMmphbjelbfe());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHNIKONHFBJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DHNIKONHFBJ prototype) {
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
   * ref: DHNIKONHFBJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DHNIKONHFBJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DHNIKONHFBJ)
      POGOProtos.Rpc.DHNIKONHFBJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHNIKONHFBJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHNIKONHFBJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DHNIKONHFBJ.class, POGOProtos.Rpc.DHNIKONHFBJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DHNIKONHFBJ.newBuilder()
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
      jnndpcfejck_ = 0;

      ebnddoihkmh_ = 0;

      mmphbjelbfe_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHNIKONHFBJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHNIKONHFBJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.DHNIKONHFBJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHNIKONHFBJ build() {
      POGOProtos.Rpc.DHNIKONHFBJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHNIKONHFBJ buildPartial() {
      POGOProtos.Rpc.DHNIKONHFBJ result = new POGOProtos.Rpc.DHNIKONHFBJ(this);
      result.jnndpcfejck_ = jnndpcfejck_;
      result.ebnddoihkmh_ = ebnddoihkmh_;
      result.mmphbjelbfe_ = mmphbjelbfe_;
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
      if (other instanceof POGOProtos.Rpc.DHNIKONHFBJ) {
        return mergeFrom((POGOProtos.Rpc.DHNIKONHFBJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DHNIKONHFBJ other) {
      if (other == POGOProtos.Rpc.DHNIKONHFBJ.getDefaultInstance()) return this;
      if (other.jnndpcfejck_ != 0) {
        setJnndpcfejckValue(other.getJnndpcfejckValue());
      }
      if (other.getEbnddoihkmh() != 0) {
        setEbnddoihkmh(other.getEbnddoihkmh());
      }
      if (other.getMmphbjelbfe() != 0F) {
        setMmphbjelbfe(other.getMmphbjelbfe());
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
      POGOProtos.Rpc.DHNIKONHFBJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DHNIKONHFBJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jnndpcfejck_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
     * @return The enum numeric value on the wire for jnndpcfejck.
     */
    public int getJnndpcfejckValue() {
      return jnndpcfejck_;
    }
    /**
     * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
     * @param value The enum numeric value on the wire for jnndpcfejck to set.
     * @return This builder for chaining.
     */
    public Builder setJnndpcfejckValue(int value) {
      jnndpcfejck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
     * @return The jnndpcfejck.
     */
    public POGOProtos.Rpc.FBGOEGCBGIN getJnndpcfejck() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FBGOEGCBGIN result = POGOProtos.Rpc.FBGOEGCBGIN.valueOf(jnndpcfejck_);
      return result == null ? POGOProtos.Rpc.FBGOEGCBGIN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
     * @param value The jnndpcfejck to set.
     * @return This builder for chaining.
     */
    public Builder setJnndpcfejck(POGOProtos.Rpc.FBGOEGCBGIN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jnndpcfejck_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FBGOEGCBGIN jnndpcfejck = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJnndpcfejck() {
      
      jnndpcfejck_ = 0;
      onChanged();
      return this;
    }

    private int ebnddoihkmh_ ;
    /**
     * <code>int32 ebnddoihkmh = 2;</code>
     * @return The ebnddoihkmh.
     */
    public int getEbnddoihkmh() {
      return ebnddoihkmh_;
    }
    /**
     * <code>int32 ebnddoihkmh = 2;</code>
     * @param value The ebnddoihkmh to set.
     * @return This builder for chaining.
     */
    public Builder setEbnddoihkmh(int value) {
      
      ebnddoihkmh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ebnddoihkmh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEbnddoihkmh() {
      
      ebnddoihkmh_ = 0;
      onChanged();
      return this;
    }

    private float mmphbjelbfe_ ;
    /**
     * <code>float mmphbjelbfe = 3;</code>
     * @return The mmphbjelbfe.
     */
    public float getMmphbjelbfe() {
      return mmphbjelbfe_;
    }
    /**
     * <code>float mmphbjelbfe = 3;</code>
     * @param value The mmphbjelbfe to set.
     * @return This builder for chaining.
     */
    public Builder setMmphbjelbfe(float value) {
      
      mmphbjelbfe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float mmphbjelbfe = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmphbjelbfe() {
      
      mmphbjelbfe_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DHNIKONHFBJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DHNIKONHFBJ)
  private static final POGOProtos.Rpc.DHNIKONHFBJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DHNIKONHFBJ();
  }

  public static POGOProtos.Rpc.DHNIKONHFBJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DHNIKONHFBJ>
      PARSER = new com.google.protobuf.AbstractParser<DHNIKONHFBJ>() {
    @java.lang.Override
    public DHNIKONHFBJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DHNIKONHFBJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DHNIKONHFBJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DHNIKONHFBJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DHNIKONHFBJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

