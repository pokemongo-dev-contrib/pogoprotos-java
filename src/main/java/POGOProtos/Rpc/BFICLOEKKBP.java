// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BFICLOEKKBP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BFICLOEKKBP}
 */
public  final class BFICLOEKKBP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BFICLOEKKBP)
    BFICLOEKKBPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BFICLOEKKBP.newBuilder() to construct.
  private BFICLOEKKBP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BFICLOEKKBP() {
    hjaaehnhpej_ = 0;
    jlaglajhboj_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BFICLOEKKBP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BFICLOEKKBP(
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

            hjaaehnhpej_ = rawValue;
            break;
          }
          case 16: {

            opiapbcehbm_ = input.readUInt64();
            break;
          }
          case 24: {

            jjbdiocggag_ = input.readBool();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            jlaglajhboj_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BFICLOEKKBP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BFICLOEKKBP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BFICLOEKKBP.class, POGOProtos.Rpc.BFICLOEKKBP.Builder.class);
  }

  public static final int HJAAEHNHPEJ_FIELD_NUMBER = 1;
  private int hjaaehnhpej_;
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
   * @return The enum numeric value on the wire for hjaaehnhpej.
   */
  public int getHjaaehnhpejValue() {
    return hjaaehnhpej_;
  }
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
   * @return The hjaaehnhpej.
   */
  public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
    return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
  }

  public static final int OPIAPBCEHBM_FIELD_NUMBER = 2;
  private long opiapbcehbm_;
  /**
   * <code>uint64 opiapbcehbm = 2;</code>
   * @return The opiapbcehbm.
   */
  public long getOpiapbcehbm() {
    return opiapbcehbm_;
  }

  public static final int JJBDIOCGGAG_FIELD_NUMBER = 3;
  private boolean jjbdiocggag_;
  /**
   * <code>bool jjbdiocggag = 3;</code>
   * @return The jjbdiocggag.
   */
  public boolean getJjbdiocggag() {
    return jjbdiocggag_;
  }

  public static final int JLAGLAJHBOJ_FIELD_NUMBER = 4;
  private int jlaglajhboj_;
  /**
   * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
   * @return The enum numeric value on the wire for jlaglajhboj.
   */
  public int getJlaglajhbojValue() {
    return jlaglajhboj_;
  }
  /**
   * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
   * @return The jlaglajhboj.
   */
  public POGOProtos.Rpc.FBANPPLEGMC getJlaglajhboj() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FBANPPLEGMC result = POGOProtos.Rpc.FBANPPLEGMC.valueOf(jlaglajhboj_);
    return result == null ? POGOProtos.Rpc.FBANPPLEGMC.UNRECOGNIZED : result;
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
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, hjaaehnhpej_);
    }
    if (opiapbcehbm_ != 0L) {
      output.writeUInt64(2, opiapbcehbm_);
    }
    if (jjbdiocggag_ != false) {
      output.writeBool(3, jjbdiocggag_);
    }
    if (jlaglajhboj_ != POGOProtos.Rpc.FBANPPLEGMC.FBANPPLEGMC_MOVE_UNSET.getNumber()) {
      output.writeEnum(4, jlaglajhboj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hjaaehnhpej_);
    }
    if (opiapbcehbm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, opiapbcehbm_);
    }
    if (jjbdiocggag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, jjbdiocggag_);
    }
    if (jlaglajhboj_ != POGOProtos.Rpc.FBANPPLEGMC.FBANPPLEGMC_MOVE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, jlaglajhboj_);
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
    if (!(obj instanceof POGOProtos.Rpc.BFICLOEKKBP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BFICLOEKKBP other = (POGOProtos.Rpc.BFICLOEKKBP) obj;

    if (hjaaehnhpej_ != other.hjaaehnhpej_) return false;
    if (getOpiapbcehbm()
        != other.getOpiapbcehbm()) return false;
    if (getJjbdiocggag()
        != other.getJjbdiocggag()) return false;
    if (jlaglajhboj_ != other.jlaglajhboj_) return false;
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
    hash = (37 * hash) + HJAAEHNHPEJ_FIELD_NUMBER;
    hash = (53 * hash) + hjaaehnhpej_;
    hash = (37 * hash) + OPIAPBCEHBM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOpiapbcehbm());
    hash = (37 * hash) + JJBDIOCGGAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJjbdiocggag());
    hash = (37 * hash) + JLAGLAJHBOJ_FIELD_NUMBER;
    hash = (53 * hash) + jlaglajhboj_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFICLOEKKBP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BFICLOEKKBP prototype) {
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
   * ref: BFICLOEKKBP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BFICLOEKKBP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BFICLOEKKBP)
      POGOProtos.Rpc.BFICLOEKKBPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BFICLOEKKBP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BFICLOEKKBP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BFICLOEKKBP.class, POGOProtos.Rpc.BFICLOEKKBP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BFICLOEKKBP.newBuilder()
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
      hjaaehnhpej_ = 0;

      opiapbcehbm_ = 0L;

      jjbdiocggag_ = false;

      jlaglajhboj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BFICLOEKKBP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFICLOEKKBP getDefaultInstanceForType() {
      return POGOProtos.Rpc.BFICLOEKKBP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFICLOEKKBP build() {
      POGOProtos.Rpc.BFICLOEKKBP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFICLOEKKBP buildPartial() {
      POGOProtos.Rpc.BFICLOEKKBP result = new POGOProtos.Rpc.BFICLOEKKBP(this);
      result.hjaaehnhpej_ = hjaaehnhpej_;
      result.opiapbcehbm_ = opiapbcehbm_;
      result.jjbdiocggag_ = jjbdiocggag_;
      result.jlaglajhboj_ = jlaglajhboj_;
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
      if (other instanceof POGOProtos.Rpc.BFICLOEKKBP) {
        return mergeFrom((POGOProtos.Rpc.BFICLOEKKBP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BFICLOEKKBP other) {
      if (other == POGOProtos.Rpc.BFICLOEKKBP.getDefaultInstance()) return this;
      if (other.hjaaehnhpej_ != 0) {
        setHjaaehnhpejValue(other.getHjaaehnhpejValue());
      }
      if (other.getOpiapbcehbm() != 0L) {
        setOpiapbcehbm(other.getOpiapbcehbm());
      }
      if (other.getJjbdiocggag() != false) {
        setJjbdiocggag(other.getJjbdiocggag());
      }
      if (other.jlaglajhboj_ != 0) {
        setJlaglajhbojValue(other.getJlaglajhbojValue());
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
      POGOProtos.Rpc.BFICLOEKKBP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BFICLOEKKBP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hjaaehnhpej_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return The enum numeric value on the wire for hjaaehnhpej.
     */
    public int getHjaaehnhpejValue() {
      return hjaaehnhpej_;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @param value The enum numeric value on the wire for hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpejValue(int value) {
      hjaaehnhpej_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return The hjaaehnhpej.
     */
    public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
      return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @param value The hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpej(POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hjaaehnhpej_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjaaehnhpej() {
      
      hjaaehnhpej_ = 0;
      onChanged();
      return this;
    }

    private long opiapbcehbm_ ;
    /**
     * <code>uint64 opiapbcehbm = 2;</code>
     * @return The opiapbcehbm.
     */
    public long getOpiapbcehbm() {
      return opiapbcehbm_;
    }
    /**
     * <code>uint64 opiapbcehbm = 2;</code>
     * @param value The opiapbcehbm to set.
     * @return This builder for chaining.
     */
    public Builder setOpiapbcehbm(long value) {
      
      opiapbcehbm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 opiapbcehbm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpiapbcehbm() {
      
      opiapbcehbm_ = 0L;
      onChanged();
      return this;
    }

    private boolean jjbdiocggag_ ;
    /**
     * <code>bool jjbdiocggag = 3;</code>
     * @return The jjbdiocggag.
     */
    public boolean getJjbdiocggag() {
      return jjbdiocggag_;
    }
    /**
     * <code>bool jjbdiocggag = 3;</code>
     * @param value The jjbdiocggag to set.
     * @return This builder for chaining.
     */
    public Builder setJjbdiocggag(boolean value) {
      
      jjbdiocggag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jjbdiocggag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJjbdiocggag() {
      
      jjbdiocggag_ = false;
      onChanged();
      return this;
    }

    private int jlaglajhboj_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
     * @return The enum numeric value on the wire for jlaglajhboj.
     */
    public int getJlaglajhbojValue() {
      return jlaglajhboj_;
    }
    /**
     * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
     * @param value The enum numeric value on the wire for jlaglajhboj to set.
     * @return This builder for chaining.
     */
    public Builder setJlaglajhbojValue(int value) {
      jlaglajhboj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
     * @return The jlaglajhboj.
     */
    public POGOProtos.Rpc.FBANPPLEGMC getJlaglajhboj() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FBANPPLEGMC result = POGOProtos.Rpc.FBANPPLEGMC.valueOf(jlaglajhboj_);
      return result == null ? POGOProtos.Rpc.FBANPPLEGMC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
     * @param value The jlaglajhboj to set.
     * @return This builder for chaining.
     */
    public Builder setJlaglajhboj(POGOProtos.Rpc.FBANPPLEGMC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jlaglajhboj_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FBANPPLEGMC jlaglajhboj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJlaglajhboj() {
      
      jlaglajhboj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BFICLOEKKBP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BFICLOEKKBP)
  private static final POGOProtos.Rpc.BFICLOEKKBP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BFICLOEKKBP();
  }

  public static POGOProtos.Rpc.BFICLOEKKBP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BFICLOEKKBP>
      PARSER = new com.google.protobuf.AbstractParser<BFICLOEKKBP>() {
    @java.lang.Override
    public BFICLOEKKBP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BFICLOEKKBP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BFICLOEKKBP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BFICLOEKKBP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BFICLOEKKBP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

