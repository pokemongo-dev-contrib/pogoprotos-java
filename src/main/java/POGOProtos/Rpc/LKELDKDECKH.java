// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LKELDKDECKH}
 */
public  final class LKELDKDECKH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LKELDKDECKH)
    LKELDKDECKHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LKELDKDECKH.newBuilder() to construct.
  private LKELDKDECKH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LKELDKDECKH() {
    jockllghmpd_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LKELDKDECKH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LKELDKDECKH(
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

            jockllghmpd_ = rawValue;
            break;
          }
          case 16: {

            hmjldieajde_ = input.readInt32();
            break;
          }
          case 24: {

            kidbgacjkdo_ = input.readInt32();
            break;
          }
          case 32: {

            fapfmmhekfo_ = input.readInt32();
            break;
          }
          case 40: {

            ghhledibkhp_ = input.readInt32();
            break;
          }
          case 48: {

            jfgobnnjfee_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKELDKDECKH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKELDKDECKH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LKELDKDECKH.class, POGOProtos.Rpc.LKELDKDECKH.Builder.class);
  }

  public static final int JOCKLLGHMPD_FIELD_NUMBER = 1;
  private int jockllghmpd_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
   * @return The enum numeric value on the wire for jockllghmpd.
   */
  public int getJockllghmpdValue() {
    return jockllghmpd_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
   * @return The jockllghmpd.
   */
  public POGOProtos.Rpc.HoloPokemonClass getJockllghmpd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonClass result = POGOProtos.Rpc.HoloPokemonClass.valueOf(jockllghmpd_);
    return result == null ? POGOProtos.Rpc.HoloPokemonClass.UNRECOGNIZED : result;
  }

  public static final int HMJLDIEAJDE_FIELD_NUMBER = 2;
  private int hmjldieajde_;
  /**
   * <code>int32 hmjldieajde = 2;</code>
   * @return The hmjldieajde.
   */
  public int getHmjldieajde() {
    return hmjldieajde_;
  }

  public static final int KIDBGACJKDO_FIELD_NUMBER = 3;
  private int kidbgacjkdo_;
  /**
   * <code>int32 kidbgacjkdo = 3;</code>
   * @return The kidbgacjkdo.
   */
  public int getKidbgacjkdo() {
    return kidbgacjkdo_;
  }

  public static final int FAPFMMHEKFO_FIELD_NUMBER = 4;
  private int fapfmmhekfo_;
  /**
   * <code>int32 fapfmmhekfo = 4;</code>
   * @return The fapfmmhekfo.
   */
  public int getFapfmmhekfo() {
    return fapfmmhekfo_;
  }

  public static final int GHHLEDIBKHP_FIELD_NUMBER = 5;
  private int ghhledibkhp_;
  /**
   * <code>int32 ghhledibkhp = 5;</code>
   * @return The ghhledibkhp.
   */
  public int getGhhledibkhp() {
    return ghhledibkhp_;
  }

  public static final int JFGOBNNJFEE_FIELD_NUMBER = 6;
  private int jfgobnnjfee_;
  /**
   * <code>int32 jfgobnnjfee = 6;</code>
   * @return The jfgobnnjfee.
   */
  public int getJfgobnnjfee() {
    return jfgobnnjfee_;
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
    if (jockllghmpd_ != POGOProtos.Rpc.HoloPokemonClass.POKEMON_CLASS_NORMAL.getNumber()) {
      output.writeEnum(1, jockllghmpd_);
    }
    if (hmjldieajde_ != 0) {
      output.writeInt32(2, hmjldieajde_);
    }
    if (kidbgacjkdo_ != 0) {
      output.writeInt32(3, kidbgacjkdo_);
    }
    if (fapfmmhekfo_ != 0) {
      output.writeInt32(4, fapfmmhekfo_);
    }
    if (ghhledibkhp_ != 0) {
      output.writeInt32(5, ghhledibkhp_);
    }
    if (jfgobnnjfee_ != 0) {
      output.writeInt32(6, jfgobnnjfee_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jockllghmpd_ != POGOProtos.Rpc.HoloPokemonClass.POKEMON_CLASS_NORMAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jockllghmpd_);
    }
    if (hmjldieajde_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hmjldieajde_);
    }
    if (kidbgacjkdo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, kidbgacjkdo_);
    }
    if (fapfmmhekfo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fapfmmhekfo_);
    }
    if (ghhledibkhp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, ghhledibkhp_);
    }
    if (jfgobnnjfee_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, jfgobnnjfee_);
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
    if (!(obj instanceof POGOProtos.Rpc.LKELDKDECKH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LKELDKDECKH other = (POGOProtos.Rpc.LKELDKDECKH) obj;

    if (jockllghmpd_ != other.jockllghmpd_) return false;
    if (getHmjldieajde()
        != other.getHmjldieajde()) return false;
    if (getKidbgacjkdo()
        != other.getKidbgacjkdo()) return false;
    if (getFapfmmhekfo()
        != other.getFapfmmhekfo()) return false;
    if (getGhhledibkhp()
        != other.getGhhledibkhp()) return false;
    if (getJfgobnnjfee()
        != other.getJfgobnnjfee()) return false;
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
    hash = (37 * hash) + JOCKLLGHMPD_FIELD_NUMBER;
    hash = (53 * hash) + jockllghmpd_;
    hash = (37 * hash) + HMJLDIEAJDE_FIELD_NUMBER;
    hash = (53 * hash) + getHmjldieajde();
    hash = (37 * hash) + KIDBGACJKDO_FIELD_NUMBER;
    hash = (53 * hash) + getKidbgacjkdo();
    hash = (37 * hash) + FAPFMMHEKFO_FIELD_NUMBER;
    hash = (53 * hash) + getFapfmmhekfo();
    hash = (37 * hash) + GHHLEDIBKHP_FIELD_NUMBER;
    hash = (53 * hash) + getGhhledibkhp();
    hash = (37 * hash) + JFGOBNNJFEE_FIELD_NUMBER;
    hash = (53 * hash) + getJfgobnnjfee();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKELDKDECKH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LKELDKDECKH prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LKELDKDECKH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LKELDKDECKH)
      POGOProtos.Rpc.LKELDKDECKHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKELDKDECKH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKELDKDECKH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LKELDKDECKH.class, POGOProtos.Rpc.LKELDKDECKH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LKELDKDECKH.newBuilder()
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
      jockllghmpd_ = 0;

      hmjldieajde_ = 0;

      kidbgacjkdo_ = 0;

      fapfmmhekfo_ = 0;

      ghhledibkhp_ = 0;

      jfgobnnjfee_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKELDKDECKH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKELDKDECKH getDefaultInstanceForType() {
      return POGOProtos.Rpc.LKELDKDECKH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKELDKDECKH build() {
      POGOProtos.Rpc.LKELDKDECKH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKELDKDECKH buildPartial() {
      POGOProtos.Rpc.LKELDKDECKH result = new POGOProtos.Rpc.LKELDKDECKH(this);
      result.jockllghmpd_ = jockllghmpd_;
      result.hmjldieajde_ = hmjldieajde_;
      result.kidbgacjkdo_ = kidbgacjkdo_;
      result.fapfmmhekfo_ = fapfmmhekfo_;
      result.ghhledibkhp_ = ghhledibkhp_;
      result.jfgobnnjfee_ = jfgobnnjfee_;
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
      if (other instanceof POGOProtos.Rpc.LKELDKDECKH) {
        return mergeFrom((POGOProtos.Rpc.LKELDKDECKH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LKELDKDECKH other) {
      if (other == POGOProtos.Rpc.LKELDKDECKH.getDefaultInstance()) return this;
      if (other.jockllghmpd_ != 0) {
        setJockllghmpdValue(other.getJockllghmpdValue());
      }
      if (other.getHmjldieajde() != 0) {
        setHmjldieajde(other.getHmjldieajde());
      }
      if (other.getKidbgacjkdo() != 0) {
        setKidbgacjkdo(other.getKidbgacjkdo());
      }
      if (other.getFapfmmhekfo() != 0) {
        setFapfmmhekfo(other.getFapfmmhekfo());
      }
      if (other.getGhhledibkhp() != 0) {
        setGhhledibkhp(other.getGhhledibkhp());
      }
      if (other.getJfgobnnjfee() != 0) {
        setJfgobnnjfee(other.getJfgobnnjfee());
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
      POGOProtos.Rpc.LKELDKDECKH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LKELDKDECKH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jockllghmpd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
     * @return The enum numeric value on the wire for jockllghmpd.
     */
    public int getJockllghmpdValue() {
      return jockllghmpd_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
     * @param value The enum numeric value on the wire for jockllghmpd to set.
     * @return This builder for chaining.
     */
    public Builder setJockllghmpdValue(int value) {
      jockllghmpd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
     * @return The jockllghmpd.
     */
    public POGOProtos.Rpc.HoloPokemonClass getJockllghmpd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonClass result = POGOProtos.Rpc.HoloPokemonClass.valueOf(jockllghmpd_);
      return result == null ? POGOProtos.Rpc.HoloPokemonClass.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
     * @param value The jockllghmpd to set.
     * @return This builder for chaining.
     */
    public Builder setJockllghmpd(POGOProtos.Rpc.HoloPokemonClass value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jockllghmpd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonClass jockllghmpd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJockllghmpd() {
      
      jockllghmpd_ = 0;
      onChanged();
      return this;
    }

    private int hmjldieajde_ ;
    /**
     * <code>int32 hmjldieajde = 2;</code>
     * @return The hmjldieajde.
     */
    public int getHmjldieajde() {
      return hmjldieajde_;
    }
    /**
     * <code>int32 hmjldieajde = 2;</code>
     * @param value The hmjldieajde to set.
     * @return This builder for chaining.
     */
    public Builder setHmjldieajde(int value) {
      
      hmjldieajde_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hmjldieajde = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHmjldieajde() {
      
      hmjldieajde_ = 0;
      onChanged();
      return this;
    }

    private int kidbgacjkdo_ ;
    /**
     * <code>int32 kidbgacjkdo = 3;</code>
     * @return The kidbgacjkdo.
     */
    public int getKidbgacjkdo() {
      return kidbgacjkdo_;
    }
    /**
     * <code>int32 kidbgacjkdo = 3;</code>
     * @param value The kidbgacjkdo to set.
     * @return This builder for chaining.
     */
    public Builder setKidbgacjkdo(int value) {
      
      kidbgacjkdo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kidbgacjkdo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKidbgacjkdo() {
      
      kidbgacjkdo_ = 0;
      onChanged();
      return this;
    }

    private int fapfmmhekfo_ ;
    /**
     * <code>int32 fapfmmhekfo = 4;</code>
     * @return The fapfmmhekfo.
     */
    public int getFapfmmhekfo() {
      return fapfmmhekfo_;
    }
    /**
     * <code>int32 fapfmmhekfo = 4;</code>
     * @param value The fapfmmhekfo to set.
     * @return This builder for chaining.
     */
    public Builder setFapfmmhekfo(int value) {
      
      fapfmmhekfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fapfmmhekfo = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFapfmmhekfo() {
      
      fapfmmhekfo_ = 0;
      onChanged();
      return this;
    }

    private int ghhledibkhp_ ;
    /**
     * <code>int32 ghhledibkhp = 5;</code>
     * @return The ghhledibkhp.
     */
    public int getGhhledibkhp() {
      return ghhledibkhp_;
    }
    /**
     * <code>int32 ghhledibkhp = 5;</code>
     * @param value The ghhledibkhp to set.
     * @return This builder for chaining.
     */
    public Builder setGhhledibkhp(int value) {
      
      ghhledibkhp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ghhledibkhp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGhhledibkhp() {
      
      ghhledibkhp_ = 0;
      onChanged();
      return this;
    }

    private int jfgobnnjfee_ ;
    /**
     * <code>int32 jfgobnnjfee = 6;</code>
     * @return The jfgobnnjfee.
     */
    public int getJfgobnnjfee() {
      return jfgobnnjfee_;
    }
    /**
     * <code>int32 jfgobnnjfee = 6;</code>
     * @param value The jfgobnnjfee to set.
     * @return This builder for chaining.
     */
    public Builder setJfgobnnjfee(int value) {
      
      jfgobnnjfee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jfgobnnjfee = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfgobnnjfee() {
      
      jfgobnnjfee_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LKELDKDECKH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LKELDKDECKH)
  private static final POGOProtos.Rpc.LKELDKDECKH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LKELDKDECKH();
  }

  public static POGOProtos.Rpc.LKELDKDECKH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LKELDKDECKH>
      PARSER = new com.google.protobuf.AbstractParser<LKELDKDECKH>() {
    @java.lang.Override
    public LKELDKDECKH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LKELDKDECKH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LKELDKDECKH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LKELDKDECKH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LKELDKDECKH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

