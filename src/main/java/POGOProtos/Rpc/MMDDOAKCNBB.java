// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MMDDOAKCNBB}
 */
public  final class MMDDOAKCNBB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MMDDOAKCNBB)
    MMDDOAKCNBBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MMDDOAKCNBB.newBuilder() to construct.
  private MMDDOAKCNBB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MMDDOAKCNBB() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MMDDOAKCNBB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MMDDOAKCNBB(
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

            cbecogaojkh_ = input.readUInt64();
            break;
          }
          case 17: {

            kmgpcocmljg_ = input.readDouble();
            break;
          }
          case 25: {

            ialganppdok_ = input.readDouble();
            break;
          }
          case 34: {
            POGOProtos.Rpc.JKJPEEMNCDK.Builder subBuilder = null;
            if (acphninimgp_ != null) {
              subBuilder = acphninimgp_.toBuilder();
            }
            acphninimgp_ = input.readMessage(POGOProtos.Rpc.JKJPEEMNCDK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(acphninimgp_);
              acphninimgp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            flkibelolda_ = input.readInt64();
            break;
          }
          case 48: {

            ipkkdmggfan_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MMDDOAKCNBB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MMDDOAKCNBB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MMDDOAKCNBB.class, POGOProtos.Rpc.MMDDOAKCNBB.Builder.class);
  }

  public static final int CBECOGAOJKH_FIELD_NUMBER = 1;
  private long cbecogaojkh_;
  /**
   * <code>uint64 cbecogaojkh = 1;</code>
   * @return The cbecogaojkh.
   */
  public long getCbecogaojkh() {
    return cbecogaojkh_;
  }

  public static final int KMGPCOCMLJG_FIELD_NUMBER = 2;
  private double kmgpcocmljg_;
  /**
   * <code>double kmgpcocmljg = 2;</code>
   * @return The kmgpcocmljg.
   */
  public double getKmgpcocmljg() {
    return kmgpcocmljg_;
  }

  public static final int IALGANPPDOK_FIELD_NUMBER = 3;
  private double ialganppdok_;
  /**
   * <code>double ialganppdok = 3;</code>
   * @return The ialganppdok.
   */
  public double getIalganppdok() {
    return ialganppdok_;
  }

  public static final int ACPHNINIMGP_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.JKJPEEMNCDK acphninimgp_;
  /**
   * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
   * @return Whether the acphninimgp field is set.
   */
  public boolean hasAcphninimgp() {
    return acphninimgp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
   * @return The acphninimgp.
   */
  public POGOProtos.Rpc.JKJPEEMNCDK getAcphninimgp() {
    return acphninimgp_ == null ? POGOProtos.Rpc.JKJPEEMNCDK.getDefaultInstance() : acphninimgp_;
  }
  /**
   * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
   */
  public POGOProtos.Rpc.JKJPEEMNCDKOrBuilder getAcphninimgpOrBuilder() {
    return getAcphninimgp();
  }

  public static final int FLKIBELOLDA_FIELD_NUMBER = 5;
  private long flkibelolda_;
  /**
   * <code>int64 flkibelolda = 5;</code>
   * @return The flkibelolda.
   */
  public long getFlkibelolda() {
    return flkibelolda_;
  }

  public static final int IPKKDMGGFAN_FIELD_NUMBER = 6;
  private boolean ipkkdmggfan_;
  /**
   * <code>bool ipkkdmggfan = 6;</code>
   * @return The ipkkdmggfan.
   */
  public boolean getIpkkdmggfan() {
    return ipkkdmggfan_;
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
    if (cbecogaojkh_ != 0L) {
      output.writeUInt64(1, cbecogaojkh_);
    }
    if (kmgpcocmljg_ != 0D) {
      output.writeDouble(2, kmgpcocmljg_);
    }
    if (ialganppdok_ != 0D) {
      output.writeDouble(3, ialganppdok_);
    }
    if (acphninimgp_ != null) {
      output.writeMessage(4, getAcphninimgp());
    }
    if (flkibelolda_ != 0L) {
      output.writeInt64(5, flkibelolda_);
    }
    if (ipkkdmggfan_ != false) {
      output.writeBool(6, ipkkdmggfan_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cbecogaojkh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, cbecogaojkh_);
    }
    if (kmgpcocmljg_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, kmgpcocmljg_);
    }
    if (ialganppdok_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, ialganppdok_);
    }
    if (acphninimgp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAcphninimgp());
    }
    if (flkibelolda_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, flkibelolda_);
    }
    if (ipkkdmggfan_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, ipkkdmggfan_);
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
    if (!(obj instanceof POGOProtos.Rpc.MMDDOAKCNBB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MMDDOAKCNBB other = (POGOProtos.Rpc.MMDDOAKCNBB) obj;

    if (getCbecogaojkh()
        != other.getCbecogaojkh()) return false;
    if (java.lang.Double.doubleToLongBits(getKmgpcocmljg())
        != java.lang.Double.doubleToLongBits(
            other.getKmgpcocmljg())) return false;
    if (java.lang.Double.doubleToLongBits(getIalganppdok())
        != java.lang.Double.doubleToLongBits(
            other.getIalganppdok())) return false;
    if (hasAcphninimgp() != other.hasAcphninimgp()) return false;
    if (hasAcphninimgp()) {
      if (!getAcphninimgp()
          .equals(other.getAcphninimgp())) return false;
    }
    if (getFlkibelolda()
        != other.getFlkibelolda()) return false;
    if (getIpkkdmggfan()
        != other.getIpkkdmggfan()) return false;
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
    hash = (37 * hash) + CBECOGAOJKH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCbecogaojkh());
    hash = (37 * hash) + KMGPCOCMLJG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKmgpcocmljg()));
    hash = (37 * hash) + IALGANPPDOK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getIalganppdok()));
    if (hasAcphninimgp()) {
      hash = (37 * hash) + ACPHNINIMGP_FIELD_NUMBER;
      hash = (53 * hash) + getAcphninimgp().hashCode();
    }
    hash = (37 * hash) + FLKIBELOLDA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlkibelolda());
    hash = (37 * hash) + IPKKDMGGFAN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIpkkdmggfan());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MMDDOAKCNBB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MMDDOAKCNBB prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MMDDOAKCNBB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MMDDOAKCNBB)
      POGOProtos.Rpc.MMDDOAKCNBBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MMDDOAKCNBB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MMDDOAKCNBB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MMDDOAKCNBB.class, POGOProtos.Rpc.MMDDOAKCNBB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MMDDOAKCNBB.newBuilder()
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
      cbecogaojkh_ = 0L;

      kmgpcocmljg_ = 0D;

      ialganppdok_ = 0D;

      if (acphninimgpBuilder_ == null) {
        acphninimgp_ = null;
      } else {
        acphninimgp_ = null;
        acphninimgpBuilder_ = null;
      }
      flkibelolda_ = 0L;

      ipkkdmggfan_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MMDDOAKCNBB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMDDOAKCNBB getDefaultInstanceForType() {
      return POGOProtos.Rpc.MMDDOAKCNBB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMDDOAKCNBB build() {
      POGOProtos.Rpc.MMDDOAKCNBB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MMDDOAKCNBB buildPartial() {
      POGOProtos.Rpc.MMDDOAKCNBB result = new POGOProtos.Rpc.MMDDOAKCNBB(this);
      result.cbecogaojkh_ = cbecogaojkh_;
      result.kmgpcocmljg_ = kmgpcocmljg_;
      result.ialganppdok_ = ialganppdok_;
      if (acphninimgpBuilder_ == null) {
        result.acphninimgp_ = acphninimgp_;
      } else {
        result.acphninimgp_ = acphninimgpBuilder_.build();
      }
      result.flkibelolda_ = flkibelolda_;
      result.ipkkdmggfan_ = ipkkdmggfan_;
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
      if (other instanceof POGOProtos.Rpc.MMDDOAKCNBB) {
        return mergeFrom((POGOProtos.Rpc.MMDDOAKCNBB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MMDDOAKCNBB other) {
      if (other == POGOProtos.Rpc.MMDDOAKCNBB.getDefaultInstance()) return this;
      if (other.getCbecogaojkh() != 0L) {
        setCbecogaojkh(other.getCbecogaojkh());
      }
      if (other.getKmgpcocmljg() != 0D) {
        setKmgpcocmljg(other.getKmgpcocmljg());
      }
      if (other.getIalganppdok() != 0D) {
        setIalganppdok(other.getIalganppdok());
      }
      if (other.hasAcphninimgp()) {
        mergeAcphninimgp(other.getAcphninimgp());
      }
      if (other.getFlkibelolda() != 0L) {
        setFlkibelolda(other.getFlkibelolda());
      }
      if (other.getIpkkdmggfan() != false) {
        setIpkkdmggfan(other.getIpkkdmggfan());
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
      POGOProtos.Rpc.MMDDOAKCNBB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MMDDOAKCNBB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long cbecogaojkh_ ;
    /**
     * <code>uint64 cbecogaojkh = 1;</code>
     * @return The cbecogaojkh.
     */
    public long getCbecogaojkh() {
      return cbecogaojkh_;
    }
    /**
     * <code>uint64 cbecogaojkh = 1;</code>
     * @param value The cbecogaojkh to set.
     * @return This builder for chaining.
     */
    public Builder setCbecogaojkh(long value) {
      
      cbecogaojkh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 cbecogaojkh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCbecogaojkh() {
      
      cbecogaojkh_ = 0L;
      onChanged();
      return this;
    }

    private double kmgpcocmljg_ ;
    /**
     * <code>double kmgpcocmljg = 2;</code>
     * @return The kmgpcocmljg.
     */
    public double getKmgpcocmljg() {
      return kmgpcocmljg_;
    }
    /**
     * <code>double kmgpcocmljg = 2;</code>
     * @param value The kmgpcocmljg to set.
     * @return This builder for chaining.
     */
    public Builder setKmgpcocmljg(double value) {
      
      kmgpcocmljg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double kmgpcocmljg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKmgpcocmljg() {
      
      kmgpcocmljg_ = 0D;
      onChanged();
      return this;
    }

    private double ialganppdok_ ;
    /**
     * <code>double ialganppdok = 3;</code>
     * @return The ialganppdok.
     */
    public double getIalganppdok() {
      return ialganppdok_;
    }
    /**
     * <code>double ialganppdok = 3;</code>
     * @param value The ialganppdok to set.
     * @return This builder for chaining.
     */
    public Builder setIalganppdok(double value) {
      
      ialganppdok_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ialganppdok = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIalganppdok() {
      
      ialganppdok_ = 0D;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.JKJPEEMNCDK acphninimgp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JKJPEEMNCDK, POGOProtos.Rpc.JKJPEEMNCDK.Builder, POGOProtos.Rpc.JKJPEEMNCDKOrBuilder> acphninimgpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     * @return Whether the acphninimgp field is set.
     */
    public boolean hasAcphninimgp() {
      return acphninimgpBuilder_ != null || acphninimgp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     * @return The acphninimgp.
     */
    public POGOProtos.Rpc.JKJPEEMNCDK getAcphninimgp() {
      if (acphninimgpBuilder_ == null) {
        return acphninimgp_ == null ? POGOProtos.Rpc.JKJPEEMNCDK.getDefaultInstance() : acphninimgp_;
      } else {
        return acphninimgpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public Builder setAcphninimgp(POGOProtos.Rpc.JKJPEEMNCDK value) {
      if (acphninimgpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acphninimgp_ = value;
        onChanged();
      } else {
        acphninimgpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public Builder setAcphninimgp(
        POGOProtos.Rpc.JKJPEEMNCDK.Builder builderForValue) {
      if (acphninimgpBuilder_ == null) {
        acphninimgp_ = builderForValue.build();
        onChanged();
      } else {
        acphninimgpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public Builder mergeAcphninimgp(POGOProtos.Rpc.JKJPEEMNCDK value) {
      if (acphninimgpBuilder_ == null) {
        if (acphninimgp_ != null) {
          acphninimgp_ =
            POGOProtos.Rpc.JKJPEEMNCDK.newBuilder(acphninimgp_).mergeFrom(value).buildPartial();
        } else {
          acphninimgp_ = value;
        }
        onChanged();
      } else {
        acphninimgpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public Builder clearAcphninimgp() {
      if (acphninimgpBuilder_ == null) {
        acphninimgp_ = null;
        onChanged();
      } else {
        acphninimgp_ = null;
        acphninimgpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public POGOProtos.Rpc.JKJPEEMNCDK.Builder getAcphninimgpBuilder() {
      
      onChanged();
      return getAcphninimgpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    public POGOProtos.Rpc.JKJPEEMNCDKOrBuilder getAcphninimgpOrBuilder() {
      if (acphninimgpBuilder_ != null) {
        return acphninimgpBuilder_.getMessageOrBuilder();
      } else {
        return acphninimgp_ == null ?
            POGOProtos.Rpc.JKJPEEMNCDK.getDefaultInstance() : acphninimgp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JKJPEEMNCDK acphninimgp = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JKJPEEMNCDK, POGOProtos.Rpc.JKJPEEMNCDK.Builder, POGOProtos.Rpc.JKJPEEMNCDKOrBuilder> 
        getAcphninimgpFieldBuilder() {
      if (acphninimgpBuilder_ == null) {
        acphninimgpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.JKJPEEMNCDK, POGOProtos.Rpc.JKJPEEMNCDK.Builder, POGOProtos.Rpc.JKJPEEMNCDKOrBuilder>(
                getAcphninimgp(),
                getParentForChildren(),
                isClean());
        acphninimgp_ = null;
      }
      return acphninimgpBuilder_;
    }

    private long flkibelolda_ ;
    /**
     * <code>int64 flkibelolda = 5;</code>
     * @return The flkibelolda.
     */
    public long getFlkibelolda() {
      return flkibelolda_;
    }
    /**
     * <code>int64 flkibelolda = 5;</code>
     * @param value The flkibelolda to set.
     * @return This builder for chaining.
     */
    public Builder setFlkibelolda(long value) {
      
      flkibelolda_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 flkibelolda = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlkibelolda() {
      
      flkibelolda_ = 0L;
      onChanged();
      return this;
    }

    private boolean ipkkdmggfan_ ;
    /**
     * <code>bool ipkkdmggfan = 6;</code>
     * @return The ipkkdmggfan.
     */
    public boolean getIpkkdmggfan() {
      return ipkkdmggfan_;
    }
    /**
     * <code>bool ipkkdmggfan = 6;</code>
     * @param value The ipkkdmggfan to set.
     * @return This builder for chaining.
     */
    public Builder setIpkkdmggfan(boolean value) {
      
      ipkkdmggfan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ipkkdmggfan = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpkkdmggfan() {
      
      ipkkdmggfan_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MMDDOAKCNBB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MMDDOAKCNBB)
  private static final POGOProtos.Rpc.MMDDOAKCNBB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MMDDOAKCNBB();
  }

  public static POGOProtos.Rpc.MMDDOAKCNBB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MMDDOAKCNBB>
      PARSER = new com.google.protobuf.AbstractParser<MMDDOAKCNBB>() {
    @java.lang.Override
    public MMDDOAKCNBB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MMDDOAKCNBB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MMDDOAKCNBB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MMDDOAKCNBB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MMDDOAKCNBB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

