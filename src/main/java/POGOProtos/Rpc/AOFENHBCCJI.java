// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AOFENHBCCJI}
 */
public  final class AOFENHBCCJI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AOFENHBCCJI)
    AOFENHBCCJIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AOFENHBCCJI.newBuilder() to construct.
  private AOFENHBCCJI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AOFENHBCCJI() {
    kefncmfkhhe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AOFENHBCCJI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AOFENHBCCJI(
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

            kbpiagcjhid_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kefncmfkhhe_ = rawValue;
            break;
          }
          case 24: {

            apdafempihc_ = input.readInt32();
            break;
          }
          case 33: {

            kfjioffpcob_ = input.readDouble();
            break;
          }
          case 41: {

            bmojeeolehh_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AOFENHBCCJI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AOFENHBCCJI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AOFENHBCCJI.class, POGOProtos.Rpc.AOFENHBCCJI.Builder.class);
  }

  public static final int KBPIAGCJHID_FIELD_NUMBER = 1;
  private boolean kbpiagcjhid_;
  /**
   * <code>bool kbpiagcjhid = 1;</code>
   * @return The kbpiagcjhid.
   */
  public boolean getKbpiagcjhid() {
    return kbpiagcjhid_;
  }

  public static final int KEFNCMFKHHE_FIELD_NUMBER = 2;
  private int kefncmfkhhe_;
  /**
   * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
   * @return The enum numeric value on the wire for kefncmfkhhe.
   */
  public int getKefncmfkhheValue() {
    return kefncmfkhhe_;
  }
  /**
   * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
   * @return The kefncmfkhhe.
   */
  public POGOProtos.Rpc.LDCFIBLANBA getKefncmfkhhe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LDCFIBLANBA result = POGOProtos.Rpc.LDCFIBLANBA.valueOf(kefncmfkhhe_);
    return result == null ? POGOProtos.Rpc.LDCFIBLANBA.UNRECOGNIZED : result;
  }

  public static final int APDAFEMPIHC_FIELD_NUMBER = 3;
  private int apdafempihc_;
  /**
   * <code>int32 apdafempihc = 3;</code>
   * @return The apdafempihc.
   */
  public int getApdafempihc() {
    return apdafempihc_;
  }

  public static final int KFJIOFFPCOB_FIELD_NUMBER = 4;
  private double kfjioffpcob_;
  /**
   * <code>double kfjioffpcob = 4;</code>
   * @return The kfjioffpcob.
   */
  public double getKfjioffpcob() {
    return kfjioffpcob_;
  }

  public static final int BMOJEEOLEHH_FIELD_NUMBER = 5;
  private double bmojeeolehh_;
  /**
   * <code>double bmojeeolehh = 5;</code>
   * @return The bmojeeolehh.
   */
  public double getBmojeeolehh() {
    return bmojeeolehh_;
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
    if (kbpiagcjhid_ != false) {
      output.writeBool(1, kbpiagcjhid_);
    }
    if (kefncmfkhhe_ != POGOProtos.Rpc.LDCFIBLANBA.LDCFIBLANBA_FAMILY_UNSET.getNumber()) {
      output.writeEnum(2, kefncmfkhhe_);
    }
    if (apdafempihc_ != 0) {
      output.writeInt32(3, apdafempihc_);
    }
    if (kfjioffpcob_ != 0D) {
      output.writeDouble(4, kfjioffpcob_);
    }
    if (bmojeeolehh_ != 0D) {
      output.writeDouble(5, bmojeeolehh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kbpiagcjhid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, kbpiagcjhid_);
    }
    if (kefncmfkhhe_ != POGOProtos.Rpc.LDCFIBLANBA.LDCFIBLANBA_FAMILY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kefncmfkhhe_);
    }
    if (apdafempihc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, apdafempihc_);
    }
    if (kfjioffpcob_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, kfjioffpcob_);
    }
    if (bmojeeolehh_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, bmojeeolehh_);
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
    if (!(obj instanceof POGOProtos.Rpc.AOFENHBCCJI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AOFENHBCCJI other = (POGOProtos.Rpc.AOFENHBCCJI) obj;

    if (getKbpiagcjhid()
        != other.getKbpiagcjhid()) return false;
    if (kefncmfkhhe_ != other.kefncmfkhhe_) return false;
    if (getApdafempihc()
        != other.getApdafempihc()) return false;
    if (java.lang.Double.doubleToLongBits(getKfjioffpcob())
        != java.lang.Double.doubleToLongBits(
            other.getKfjioffpcob())) return false;
    if (java.lang.Double.doubleToLongBits(getBmojeeolehh())
        != java.lang.Double.doubleToLongBits(
            other.getBmojeeolehh())) return false;
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
    hash = (37 * hash) + KBPIAGCJHID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKbpiagcjhid());
    hash = (37 * hash) + KEFNCMFKHHE_FIELD_NUMBER;
    hash = (53 * hash) + kefncmfkhhe_;
    hash = (37 * hash) + APDAFEMPIHC_FIELD_NUMBER;
    hash = (53 * hash) + getApdafempihc();
    hash = (37 * hash) + KFJIOFFPCOB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKfjioffpcob()));
    hash = (37 * hash) + BMOJEEOLEHH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBmojeeolehh()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOFENHBCCJI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AOFENHBCCJI prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AOFENHBCCJI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AOFENHBCCJI)
      POGOProtos.Rpc.AOFENHBCCJIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AOFENHBCCJI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AOFENHBCCJI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AOFENHBCCJI.class, POGOProtos.Rpc.AOFENHBCCJI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AOFENHBCCJI.newBuilder()
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
      kbpiagcjhid_ = false;

      kefncmfkhhe_ = 0;

      apdafempihc_ = 0;

      kfjioffpcob_ = 0D;

      bmojeeolehh_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AOFENHBCCJI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOFENHBCCJI getDefaultInstanceForType() {
      return POGOProtos.Rpc.AOFENHBCCJI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOFENHBCCJI build() {
      POGOProtos.Rpc.AOFENHBCCJI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOFENHBCCJI buildPartial() {
      POGOProtos.Rpc.AOFENHBCCJI result = new POGOProtos.Rpc.AOFENHBCCJI(this);
      result.kbpiagcjhid_ = kbpiagcjhid_;
      result.kefncmfkhhe_ = kefncmfkhhe_;
      result.apdafempihc_ = apdafempihc_;
      result.kfjioffpcob_ = kfjioffpcob_;
      result.bmojeeolehh_ = bmojeeolehh_;
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
      if (other instanceof POGOProtos.Rpc.AOFENHBCCJI) {
        return mergeFrom((POGOProtos.Rpc.AOFENHBCCJI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AOFENHBCCJI other) {
      if (other == POGOProtos.Rpc.AOFENHBCCJI.getDefaultInstance()) return this;
      if (other.getKbpiagcjhid() != false) {
        setKbpiagcjhid(other.getKbpiagcjhid());
      }
      if (other.kefncmfkhhe_ != 0) {
        setKefncmfkhheValue(other.getKefncmfkhheValue());
      }
      if (other.getApdafempihc() != 0) {
        setApdafempihc(other.getApdafempihc());
      }
      if (other.getKfjioffpcob() != 0D) {
        setKfjioffpcob(other.getKfjioffpcob());
      }
      if (other.getBmojeeolehh() != 0D) {
        setBmojeeolehh(other.getBmojeeolehh());
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
      POGOProtos.Rpc.AOFENHBCCJI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AOFENHBCCJI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean kbpiagcjhid_ ;
    /**
     * <code>bool kbpiagcjhid = 1;</code>
     * @return The kbpiagcjhid.
     */
    public boolean getKbpiagcjhid() {
      return kbpiagcjhid_;
    }
    /**
     * <code>bool kbpiagcjhid = 1;</code>
     * @param value The kbpiagcjhid to set.
     * @return This builder for chaining.
     */
    public Builder setKbpiagcjhid(boolean value) {
      
      kbpiagcjhid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kbpiagcjhid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbpiagcjhid() {
      
      kbpiagcjhid_ = false;
      onChanged();
      return this;
    }

    private int kefncmfkhhe_ = 0;
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
     * @return The enum numeric value on the wire for kefncmfkhhe.
     */
    public int getKefncmfkhheValue() {
      return kefncmfkhhe_;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
     * @param value The enum numeric value on the wire for kefncmfkhhe to set.
     * @return This builder for chaining.
     */
    public Builder setKefncmfkhheValue(int value) {
      kefncmfkhhe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
     * @return The kefncmfkhhe.
     */
    public POGOProtos.Rpc.LDCFIBLANBA getKefncmfkhhe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LDCFIBLANBA result = POGOProtos.Rpc.LDCFIBLANBA.valueOf(kefncmfkhhe_);
      return result == null ? POGOProtos.Rpc.LDCFIBLANBA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
     * @param value The kefncmfkhhe to set.
     * @return This builder for chaining.
     */
    public Builder setKefncmfkhhe(POGOProtos.Rpc.LDCFIBLANBA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kefncmfkhhe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA kefncmfkhhe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKefncmfkhhe() {
      
      kefncmfkhhe_ = 0;
      onChanged();
      return this;
    }

    private int apdafempihc_ ;
    /**
     * <code>int32 apdafempihc = 3;</code>
     * @return The apdafempihc.
     */
    public int getApdafempihc() {
      return apdafempihc_;
    }
    /**
     * <code>int32 apdafempihc = 3;</code>
     * @param value The apdafempihc to set.
     * @return This builder for chaining.
     */
    public Builder setApdafempihc(int value) {
      
      apdafempihc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 apdafempihc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearApdafempihc() {
      
      apdafempihc_ = 0;
      onChanged();
      return this;
    }

    private double kfjioffpcob_ ;
    /**
     * <code>double kfjioffpcob = 4;</code>
     * @return The kfjioffpcob.
     */
    public double getKfjioffpcob() {
      return kfjioffpcob_;
    }
    /**
     * <code>double kfjioffpcob = 4;</code>
     * @param value The kfjioffpcob to set.
     * @return This builder for chaining.
     */
    public Builder setKfjioffpcob(double value) {
      
      kfjioffpcob_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double kfjioffpcob = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKfjioffpcob() {
      
      kfjioffpcob_ = 0D;
      onChanged();
      return this;
    }

    private double bmojeeolehh_ ;
    /**
     * <code>double bmojeeolehh = 5;</code>
     * @return The bmojeeolehh.
     */
    public double getBmojeeolehh() {
      return bmojeeolehh_;
    }
    /**
     * <code>double bmojeeolehh = 5;</code>
     * @param value The bmojeeolehh to set.
     * @return This builder for chaining.
     */
    public Builder setBmojeeolehh(double value) {
      
      bmojeeolehh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bmojeeolehh = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmojeeolehh() {
      
      bmojeeolehh_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AOFENHBCCJI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AOFENHBCCJI)
  private static final POGOProtos.Rpc.AOFENHBCCJI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AOFENHBCCJI();
  }

  public static POGOProtos.Rpc.AOFENHBCCJI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AOFENHBCCJI>
      PARSER = new com.google.protobuf.AbstractParser<AOFENHBCCJI>() {
    @java.lang.Override
    public AOFENHBCCJI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AOFENHBCCJI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AOFENHBCCJI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AOFENHBCCJI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AOFENHBCCJI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

