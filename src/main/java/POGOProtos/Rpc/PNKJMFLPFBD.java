// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PNKJMFLPFBD}
 */
public  final class PNKJMFLPFBD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PNKJMFLPFBD)
    PNKJMFLPFBDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PNKJMFLPFBD.newBuilder() to construct.
  private PNKJMFLPFBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PNKJMFLPFBD() {
    hbcolhijofh_ = 0;
    jafbjhminco_ = 0;
    incliamjepd_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PNKJMFLPFBD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PNKJMFLPFBD(
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

            glhgiafpnbh_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            hbcolhijofh_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            jafbjhminco_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            incliamjepd_ = rawValue;
            break;
          }
          case 40: {

            emdbgfbnjbj_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PNKJMFLPFBD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PNKJMFLPFBD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PNKJMFLPFBD.class, POGOProtos.Rpc.PNKJMFLPFBD.Builder.class);
  }

  public static final int GLHGIAFPNBH_FIELD_NUMBER = 1;
  private long glhgiafpnbh_;
  /**
   * <code>uint64 glhgiafpnbh = 1;</code>
   * @return The glhgiafpnbh.
   */
  public long getGlhgiafpnbh() {
    return glhgiafpnbh_;
  }

  public static final int HBCOLHIJOFH_FIELD_NUMBER = 2;
  private int hbcolhijofh_;
  /**
   * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
   * @return The enum numeric value on the wire for hbcolhijofh.
   */
  public int getHbcolhijofhValue() {
    return hbcolhijofh_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
   * @return The hbcolhijofh.
   */
  public POGOProtos.Rpc.Item getHbcolhijofh() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(hbcolhijofh_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int JAFBJHMINCO_FIELD_NUMBER = 3;
  private int jafbjhminco_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
   * @return The enum numeric value on the wire for jafbjhminco.
   */
  public int getJafbjhmincoValue() {
    return jafbjhminco_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
   * @return The jafbjhminco.
   */
  public POGOProtos.Rpc.HoloPokemonId getJafbjhminco() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(jafbjhminco_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int INCLIAMJEPD_FIELD_NUMBER = 4;
  private int incliamjepd_;
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
   * @return The enum numeric value on the wire for incliamjepd.
   */
  public int getIncliamjepdValue() {
    return incliamjepd_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
   * @return The incliamjepd.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG getIncliamjepd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG result = POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.valueOf(incliamjepd_);
    return result == null ? POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.UNRECOGNIZED : result;
  }

  public static final int EMDBGFBNJBJ_FIELD_NUMBER = 5;
  private boolean emdbgfbnjbj_;
  /**
   * <code>bool emdbgfbnjbj = 5;</code>
   * @return The emdbgfbnjbj.
   */
  public boolean getEmdbgfbnjbj() {
    return emdbgfbnjbj_;
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
    if (glhgiafpnbh_ != 0L) {
      output.writeUInt64(1, glhgiafpnbh_);
    }
    if (hbcolhijofh_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, hbcolhijofh_);
    }
    if (jafbjhminco_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(3, jafbjhminco_);
    }
    if (incliamjepd_ != POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.FORM_UNSET.getNumber()) {
      output.writeEnum(4, incliamjepd_);
    }
    if (emdbgfbnjbj_ != false) {
      output.writeBool(5, emdbgfbnjbj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (glhgiafpnbh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, glhgiafpnbh_);
    }
    if (hbcolhijofh_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, hbcolhijofh_);
    }
    if (jafbjhminco_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, jafbjhminco_);
    }
    if (incliamjepd_ != POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, incliamjepd_);
    }
    if (emdbgfbnjbj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, emdbgfbnjbj_);
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
    if (!(obj instanceof POGOProtos.Rpc.PNKJMFLPFBD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PNKJMFLPFBD other = (POGOProtos.Rpc.PNKJMFLPFBD) obj;

    if (getGlhgiafpnbh()
        != other.getGlhgiafpnbh()) return false;
    if (hbcolhijofh_ != other.hbcolhijofh_) return false;
    if (jafbjhminco_ != other.jafbjhminco_) return false;
    if (incliamjepd_ != other.incliamjepd_) return false;
    if (getEmdbgfbnjbj()
        != other.getEmdbgfbnjbj()) return false;
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
    hash = (37 * hash) + GLHGIAFPNBH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGlhgiafpnbh());
    hash = (37 * hash) + HBCOLHIJOFH_FIELD_NUMBER;
    hash = (53 * hash) + hbcolhijofh_;
    hash = (37 * hash) + JAFBJHMINCO_FIELD_NUMBER;
    hash = (53 * hash) + jafbjhminco_;
    hash = (37 * hash) + INCLIAMJEPD_FIELD_NUMBER;
    hash = (53 * hash) + incliamjepd_;
    hash = (37 * hash) + EMDBGFBNJBJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEmdbgfbnjbj());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PNKJMFLPFBD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PNKJMFLPFBD prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PNKJMFLPFBD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PNKJMFLPFBD)
      POGOProtos.Rpc.PNKJMFLPFBDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PNKJMFLPFBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PNKJMFLPFBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PNKJMFLPFBD.class, POGOProtos.Rpc.PNKJMFLPFBD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PNKJMFLPFBD.newBuilder()
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
      glhgiafpnbh_ = 0L;

      hbcolhijofh_ = 0;

      jafbjhminco_ = 0;

      incliamjepd_ = 0;

      emdbgfbnjbj_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PNKJMFLPFBD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PNKJMFLPFBD getDefaultInstanceForType() {
      return POGOProtos.Rpc.PNKJMFLPFBD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PNKJMFLPFBD build() {
      POGOProtos.Rpc.PNKJMFLPFBD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PNKJMFLPFBD buildPartial() {
      POGOProtos.Rpc.PNKJMFLPFBD result = new POGOProtos.Rpc.PNKJMFLPFBD(this);
      result.glhgiafpnbh_ = glhgiafpnbh_;
      result.hbcolhijofh_ = hbcolhijofh_;
      result.jafbjhminco_ = jafbjhminco_;
      result.incliamjepd_ = incliamjepd_;
      result.emdbgfbnjbj_ = emdbgfbnjbj_;
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
      if (other instanceof POGOProtos.Rpc.PNKJMFLPFBD) {
        return mergeFrom((POGOProtos.Rpc.PNKJMFLPFBD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PNKJMFLPFBD other) {
      if (other == POGOProtos.Rpc.PNKJMFLPFBD.getDefaultInstance()) return this;
      if (other.getGlhgiafpnbh() != 0L) {
        setGlhgiafpnbh(other.getGlhgiafpnbh());
      }
      if (other.hbcolhijofh_ != 0) {
        setHbcolhijofhValue(other.getHbcolhijofhValue());
      }
      if (other.jafbjhminco_ != 0) {
        setJafbjhmincoValue(other.getJafbjhmincoValue());
      }
      if (other.incliamjepd_ != 0) {
        setIncliamjepdValue(other.getIncliamjepdValue());
      }
      if (other.getEmdbgfbnjbj() != false) {
        setEmdbgfbnjbj(other.getEmdbgfbnjbj());
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
      POGOProtos.Rpc.PNKJMFLPFBD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PNKJMFLPFBD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long glhgiafpnbh_ ;
    /**
     * <code>uint64 glhgiafpnbh = 1;</code>
     * @return The glhgiafpnbh.
     */
    public long getGlhgiafpnbh() {
      return glhgiafpnbh_;
    }
    /**
     * <code>uint64 glhgiafpnbh = 1;</code>
     * @param value The glhgiafpnbh to set.
     * @return This builder for chaining.
     */
    public Builder setGlhgiafpnbh(long value) {
      
      glhgiafpnbh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 glhgiafpnbh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlhgiafpnbh() {
      
      glhgiafpnbh_ = 0L;
      onChanged();
      return this;
    }

    private int hbcolhijofh_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
     * @return The enum numeric value on the wire for hbcolhijofh.
     */
    public int getHbcolhijofhValue() {
      return hbcolhijofh_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
     * @param value The enum numeric value on the wire for hbcolhijofh to set.
     * @return This builder for chaining.
     */
    public Builder setHbcolhijofhValue(int value) {
      hbcolhijofh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
     * @return The hbcolhijofh.
     */
    public POGOProtos.Rpc.Item getHbcolhijofh() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(hbcolhijofh_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
     * @param value The hbcolhijofh to set.
     * @return This builder for chaining.
     */
    public Builder setHbcolhijofh(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hbcolhijofh_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item hbcolhijofh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHbcolhijofh() {
      
      hbcolhijofh_ = 0;
      onChanged();
      return this;
    }

    private int jafbjhminco_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
     * @return The enum numeric value on the wire for jafbjhminco.
     */
    public int getJafbjhmincoValue() {
      return jafbjhminco_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
     * @param value The enum numeric value on the wire for jafbjhminco to set.
     * @return This builder for chaining.
     */
    public Builder setJafbjhmincoValue(int value) {
      jafbjhminco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
     * @return The jafbjhminco.
     */
    public POGOProtos.Rpc.HoloPokemonId getJafbjhminco() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(jafbjhminco_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
     * @param value The jafbjhminco to set.
     * @return This builder for chaining.
     */
    public Builder setJafbjhminco(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jafbjhminco_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId jafbjhminco = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJafbjhminco() {
      
      jafbjhminco_ = 0;
      onChanged();
      return this;
    }

    private int incliamjepd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
     * @return The enum numeric value on the wire for incliamjepd.
     */
    public int getIncliamjepdValue() {
      return incliamjepd_;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
     * @param value The enum numeric value on the wire for incliamjepd to set.
     * @return This builder for chaining.
     */
    public Builder setIncliamjepdValue(int value) {
      incliamjepd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
     * @return The incliamjepd.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG getIncliamjepd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG result = POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.valueOf(incliamjepd_);
      return result == null ? POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
     * @param value The incliamjepd to set.
     * @return This builder for chaining.
     */
    public Builder setIncliamjepd(POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      incliamjepd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM.IPMNGAFMANG incliamjepd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncliamjepd() {
      
      incliamjepd_ = 0;
      onChanged();
      return this;
    }

    private boolean emdbgfbnjbj_ ;
    /**
     * <code>bool emdbgfbnjbj = 5;</code>
     * @return The emdbgfbnjbj.
     */
    public boolean getEmdbgfbnjbj() {
      return emdbgfbnjbj_;
    }
    /**
     * <code>bool emdbgfbnjbj = 5;</code>
     * @param value The emdbgfbnjbj to set.
     * @return This builder for chaining.
     */
    public Builder setEmdbgfbnjbj(boolean value) {
      
      emdbgfbnjbj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool emdbgfbnjbj = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmdbgfbnjbj() {
      
      emdbgfbnjbj_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PNKJMFLPFBD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PNKJMFLPFBD)
  private static final POGOProtos.Rpc.PNKJMFLPFBD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PNKJMFLPFBD();
  }

  public static POGOProtos.Rpc.PNKJMFLPFBD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PNKJMFLPFBD>
      PARSER = new com.google.protobuf.AbstractParser<PNKJMFLPFBD>() {
    @java.lang.Override
    public PNKJMFLPFBD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PNKJMFLPFBD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PNKJMFLPFBD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PNKJMFLPFBD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PNKJMFLPFBD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

