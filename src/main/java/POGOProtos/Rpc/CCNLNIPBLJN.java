// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CCNLNIPBLJN}
 */
public  final class CCNLNIPBLJN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CCNLNIPBLJN)
    CCNLNIPBLJNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CCNLNIPBLJN.newBuilder() to construct.
  private CCNLNIPBLJN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CCNLNIPBLJN() {
    anapoecpjoi_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CCNLNIPBLJN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CCNLNIPBLJN(
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

            anapoecpjoi_ = rawValue;
            break;
          }
          case 21: {

            oommjmghkmj_ = input.readFloat();
            break;
          }
          case 29: {

            lngigiljljm_ = input.readFloat();
            break;
          }
          case 37: {

            odmancknfeb_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCNLNIPBLJN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCNLNIPBLJN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CCNLNIPBLJN.class, POGOProtos.Rpc.CCNLNIPBLJN.Builder.class);
  }

  public static final int ANAPOECPJOI_FIELD_NUMBER = 1;
  private int anapoecpjoi_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
   * @return The enum numeric value on the wire for anapoecpjoi.
   */
  public int getAnapoecpjoiValue() {
    return anapoecpjoi_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
   * @return The anapoecpjoi.
   */
  public POGOProtos.Rpc.HoloPokemonType getAnapoecpjoi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(anapoecpjoi_);
    return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
  }

  public static final int OOMMJMGHKMJ_FIELD_NUMBER = 2;
  private float oommjmghkmj_;
  /**
   * <code>float oommjmghkmj = 2;</code>
   * @return The oommjmghkmj.
   */
  public float getOommjmghkmj() {
    return oommjmghkmj_;
  }

  public static final int LNGIGILJLJM_FIELD_NUMBER = 3;
  private float lngigiljljm_;
  /**
   * <code>float lngigiljljm = 3;</code>
   * @return The lngigiljljm.
   */
  public float getLngigiljljm() {
    return lngigiljljm_;
  }

  public static final int ODMANCKNFEB_FIELD_NUMBER = 4;
  private float odmancknfeb_;
  /**
   * <code>float odmancknfeb = 4;</code>
   * @return The odmancknfeb.
   */
  public float getOdmancknfeb() {
    return odmancknfeb_;
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
    if (anapoecpjoi_ != POGOProtos.Rpc.HoloPokemonType.POKEMON_TYPE_NONE.getNumber()) {
      output.writeEnum(1, anapoecpjoi_);
    }
    if (oommjmghkmj_ != 0F) {
      output.writeFloat(2, oommjmghkmj_);
    }
    if (lngigiljljm_ != 0F) {
      output.writeFloat(3, lngigiljljm_);
    }
    if (odmancknfeb_ != 0F) {
      output.writeFloat(4, odmancknfeb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (anapoecpjoi_ != POGOProtos.Rpc.HoloPokemonType.POKEMON_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, anapoecpjoi_);
    }
    if (oommjmghkmj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, oommjmghkmj_);
    }
    if (lngigiljljm_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, lngigiljljm_);
    }
    if (odmancknfeb_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, odmancknfeb_);
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
    if (!(obj instanceof POGOProtos.Rpc.CCNLNIPBLJN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CCNLNIPBLJN other = (POGOProtos.Rpc.CCNLNIPBLJN) obj;

    if (anapoecpjoi_ != other.anapoecpjoi_) return false;
    if (java.lang.Float.floatToIntBits(getOommjmghkmj())
        != java.lang.Float.floatToIntBits(
            other.getOommjmghkmj())) return false;
    if (java.lang.Float.floatToIntBits(getLngigiljljm())
        != java.lang.Float.floatToIntBits(
            other.getLngigiljljm())) return false;
    if (java.lang.Float.floatToIntBits(getOdmancknfeb())
        != java.lang.Float.floatToIntBits(
            other.getOdmancknfeb())) return false;
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
    hash = (37 * hash) + ANAPOECPJOI_FIELD_NUMBER;
    hash = (53 * hash) + anapoecpjoi_;
    hash = (37 * hash) + OOMMJMGHKMJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOommjmghkmj());
    hash = (37 * hash) + LNGIGILJLJM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLngigiljljm());
    hash = (37 * hash) + ODMANCKNFEB_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOdmancknfeb());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CCNLNIPBLJN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CCNLNIPBLJN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CCNLNIPBLJN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CCNLNIPBLJN)
      POGOProtos.Rpc.CCNLNIPBLJNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCNLNIPBLJN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCNLNIPBLJN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CCNLNIPBLJN.class, POGOProtos.Rpc.CCNLNIPBLJN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CCNLNIPBLJN.newBuilder()
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
      anapoecpjoi_ = 0;

      oommjmghkmj_ = 0F;

      lngigiljljm_ = 0F;

      odmancknfeb_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CCNLNIPBLJN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCNLNIPBLJN getDefaultInstanceForType() {
      return POGOProtos.Rpc.CCNLNIPBLJN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCNLNIPBLJN build() {
      POGOProtos.Rpc.CCNLNIPBLJN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CCNLNIPBLJN buildPartial() {
      POGOProtos.Rpc.CCNLNIPBLJN result = new POGOProtos.Rpc.CCNLNIPBLJN(this);
      result.anapoecpjoi_ = anapoecpjoi_;
      result.oommjmghkmj_ = oommjmghkmj_;
      result.lngigiljljm_ = lngigiljljm_;
      result.odmancknfeb_ = odmancknfeb_;
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
      if (other instanceof POGOProtos.Rpc.CCNLNIPBLJN) {
        return mergeFrom((POGOProtos.Rpc.CCNLNIPBLJN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CCNLNIPBLJN other) {
      if (other == POGOProtos.Rpc.CCNLNIPBLJN.getDefaultInstance()) return this;
      if (other.anapoecpjoi_ != 0) {
        setAnapoecpjoiValue(other.getAnapoecpjoiValue());
      }
      if (other.getOommjmghkmj() != 0F) {
        setOommjmghkmj(other.getOommjmghkmj());
      }
      if (other.getLngigiljljm() != 0F) {
        setLngigiljljm(other.getLngigiljljm());
      }
      if (other.getOdmancknfeb() != 0F) {
        setOdmancknfeb(other.getOdmancknfeb());
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
      POGOProtos.Rpc.CCNLNIPBLJN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CCNLNIPBLJN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int anapoecpjoi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
     * @return The enum numeric value on the wire for anapoecpjoi.
     */
    public int getAnapoecpjoiValue() {
      return anapoecpjoi_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
     * @param value The enum numeric value on the wire for anapoecpjoi to set.
     * @return This builder for chaining.
     */
    public Builder setAnapoecpjoiValue(int value) {
      anapoecpjoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
     * @return The anapoecpjoi.
     */
    public POGOProtos.Rpc.HoloPokemonType getAnapoecpjoi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(anapoecpjoi_);
      return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
     * @param value The anapoecpjoi to set.
     * @return This builder for chaining.
     */
    public Builder setAnapoecpjoi(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      anapoecpjoi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType anapoecpjoi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnapoecpjoi() {
      
      anapoecpjoi_ = 0;
      onChanged();
      return this;
    }

    private float oommjmghkmj_ ;
    /**
     * <code>float oommjmghkmj = 2;</code>
     * @return The oommjmghkmj.
     */
    public float getOommjmghkmj() {
      return oommjmghkmj_;
    }
    /**
     * <code>float oommjmghkmj = 2;</code>
     * @param value The oommjmghkmj to set.
     * @return This builder for chaining.
     */
    public Builder setOommjmghkmj(float value) {
      
      oommjmghkmj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float oommjmghkmj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOommjmghkmj() {
      
      oommjmghkmj_ = 0F;
      onChanged();
      return this;
    }

    private float lngigiljljm_ ;
    /**
     * <code>float lngigiljljm = 3;</code>
     * @return The lngigiljljm.
     */
    public float getLngigiljljm() {
      return lngigiljljm_;
    }
    /**
     * <code>float lngigiljljm = 3;</code>
     * @param value The lngigiljljm to set.
     * @return This builder for chaining.
     */
    public Builder setLngigiljljm(float value) {
      
      lngigiljljm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float lngigiljljm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLngigiljljm() {
      
      lngigiljljm_ = 0F;
      onChanged();
      return this;
    }

    private float odmancknfeb_ ;
    /**
     * <code>float odmancknfeb = 4;</code>
     * @return The odmancknfeb.
     */
    public float getOdmancknfeb() {
      return odmancknfeb_;
    }
    /**
     * <code>float odmancknfeb = 4;</code>
     * @param value The odmancknfeb to set.
     * @return This builder for chaining.
     */
    public Builder setOdmancknfeb(float value) {
      
      odmancknfeb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float odmancknfeb = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOdmancknfeb() {
      
      odmancknfeb_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CCNLNIPBLJN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CCNLNIPBLJN)
  private static final POGOProtos.Rpc.CCNLNIPBLJN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CCNLNIPBLJN();
  }

  public static POGOProtos.Rpc.CCNLNIPBLJN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CCNLNIPBLJN>
      PARSER = new com.google.protobuf.AbstractParser<CCNLNIPBLJN>() {
    @java.lang.Override
    public CCNLNIPBLJN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CCNLNIPBLJN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CCNLNIPBLJN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CCNLNIPBLJN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CCNLNIPBLJN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

