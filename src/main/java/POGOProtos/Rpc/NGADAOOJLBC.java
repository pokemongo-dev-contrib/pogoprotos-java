// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NGADAOOJLBC}
 */
public  final class NGADAOOJLBC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NGADAOOJLBC)
    NGADAOOJLBCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NGADAOOJLBC.newBuilder() to construct.
  private NGADAOOJLBC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NGADAOOJLBC() {
    pmbcmaamkae_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NGADAOOJLBC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NGADAOOJLBC(
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

            capibkdihpc_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pmbcmaamkae_ = s;
            break;
          }
          case 29: {

            pghjdmmailo_ = input.readFloat();
            break;
          }
          case 32: {

            pcnahfdijdc_ = input.readBool();
            break;
          }
          case 40: {

            cdpgalkhinl_ = input.readBool();
            break;
          }
          case 53: {

            emgacgalmnp_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGADAOOJLBC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGADAOOJLBC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NGADAOOJLBC.class, POGOProtos.Rpc.NGADAOOJLBC.Builder.class);
  }

  public static final int CAPIBKDIHPC_FIELD_NUMBER = 1;
  private long capibkdihpc_;
  /**
   * <code>uint64 capibkdihpc = 1;</code>
   * @return The capibkdihpc.
   */
  public long getCapibkdihpc() {
    return capibkdihpc_;
  }

  public static final int PMBCMAAMKAE_FIELD_NUMBER = 2;
  private volatile java.lang.Object pmbcmaamkae_;
  /**
   * <code>string pmbcmaamkae = 2;</code>
   * @return The pmbcmaamkae.
   */
  public java.lang.String getPmbcmaamkae() {
    java.lang.Object ref = pmbcmaamkae_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pmbcmaamkae_ = s;
      return s;
    }
  }
  /**
   * <code>string pmbcmaamkae = 2;</code>
   * @return The bytes for pmbcmaamkae.
   */
  public com.google.protobuf.ByteString
      getPmbcmaamkaeBytes() {
    java.lang.Object ref = pmbcmaamkae_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pmbcmaamkae_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PGHJDMMAILO_FIELD_NUMBER = 3;
  private float pghjdmmailo_;
  /**
   * <code>float pghjdmmailo = 3;</code>
   * @return The pghjdmmailo.
   */
  public float getPghjdmmailo() {
    return pghjdmmailo_;
  }

  public static final int PCNAHFDIJDC_FIELD_NUMBER = 4;
  private boolean pcnahfdijdc_;
  /**
   * <code>bool pcnahfdijdc = 4;</code>
   * @return The pcnahfdijdc.
   */
  public boolean getPcnahfdijdc() {
    return pcnahfdijdc_;
  }

  public static final int CDPGALKHINL_FIELD_NUMBER = 5;
  private boolean cdpgalkhinl_;
  /**
   * <code>bool cdpgalkhinl = 5;</code>
   * @return The cdpgalkhinl.
   */
  public boolean getCdpgalkhinl() {
    return cdpgalkhinl_;
  }

  public static final int EMGACGALMNP_FIELD_NUMBER = 6;
  private float emgacgalmnp_;
  /**
   * <code>float emgacgalmnp = 6;</code>
   * @return The emgacgalmnp.
   */
  public float getEmgacgalmnp() {
    return emgacgalmnp_;
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
    if (capibkdihpc_ != 0L) {
      output.writeUInt64(1, capibkdihpc_);
    }
    if (!getPmbcmaamkaeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pmbcmaamkae_);
    }
    if (pghjdmmailo_ != 0F) {
      output.writeFloat(3, pghjdmmailo_);
    }
    if (pcnahfdijdc_ != false) {
      output.writeBool(4, pcnahfdijdc_);
    }
    if (cdpgalkhinl_ != false) {
      output.writeBool(5, cdpgalkhinl_);
    }
    if (emgacgalmnp_ != 0F) {
      output.writeFloat(6, emgacgalmnp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (capibkdihpc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, capibkdihpc_);
    }
    if (!getPmbcmaamkaeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pmbcmaamkae_);
    }
    if (pghjdmmailo_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, pghjdmmailo_);
    }
    if (pcnahfdijdc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, pcnahfdijdc_);
    }
    if (cdpgalkhinl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, cdpgalkhinl_);
    }
    if (emgacgalmnp_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, emgacgalmnp_);
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
    if (!(obj instanceof POGOProtos.Rpc.NGADAOOJLBC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NGADAOOJLBC other = (POGOProtos.Rpc.NGADAOOJLBC) obj;

    if (getCapibkdihpc()
        != other.getCapibkdihpc()) return false;
    if (!getPmbcmaamkae()
        .equals(other.getPmbcmaamkae())) return false;
    if (java.lang.Float.floatToIntBits(getPghjdmmailo())
        != java.lang.Float.floatToIntBits(
            other.getPghjdmmailo())) return false;
    if (getPcnahfdijdc()
        != other.getPcnahfdijdc()) return false;
    if (getCdpgalkhinl()
        != other.getCdpgalkhinl()) return false;
    if (java.lang.Float.floatToIntBits(getEmgacgalmnp())
        != java.lang.Float.floatToIntBits(
            other.getEmgacgalmnp())) return false;
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
    hash = (37 * hash) + CAPIBKDIHPC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCapibkdihpc());
    hash = (37 * hash) + PMBCMAAMKAE_FIELD_NUMBER;
    hash = (53 * hash) + getPmbcmaamkae().hashCode();
    hash = (37 * hash) + PGHJDMMAILO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPghjdmmailo());
    hash = (37 * hash) + PCNAHFDIJDC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPcnahfdijdc());
    hash = (37 * hash) + CDPGALKHINL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCdpgalkhinl());
    hash = (37 * hash) + EMGACGALMNP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEmgacgalmnp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGADAOOJLBC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NGADAOOJLBC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NGADAOOJLBC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NGADAOOJLBC)
      POGOProtos.Rpc.NGADAOOJLBCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGADAOOJLBC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGADAOOJLBC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NGADAOOJLBC.class, POGOProtos.Rpc.NGADAOOJLBC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NGADAOOJLBC.newBuilder()
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
      capibkdihpc_ = 0L;

      pmbcmaamkae_ = "";

      pghjdmmailo_ = 0F;

      pcnahfdijdc_ = false;

      cdpgalkhinl_ = false;

      emgacgalmnp_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGADAOOJLBC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGADAOOJLBC getDefaultInstanceForType() {
      return POGOProtos.Rpc.NGADAOOJLBC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGADAOOJLBC build() {
      POGOProtos.Rpc.NGADAOOJLBC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGADAOOJLBC buildPartial() {
      POGOProtos.Rpc.NGADAOOJLBC result = new POGOProtos.Rpc.NGADAOOJLBC(this);
      result.capibkdihpc_ = capibkdihpc_;
      result.pmbcmaamkae_ = pmbcmaamkae_;
      result.pghjdmmailo_ = pghjdmmailo_;
      result.pcnahfdijdc_ = pcnahfdijdc_;
      result.cdpgalkhinl_ = cdpgalkhinl_;
      result.emgacgalmnp_ = emgacgalmnp_;
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
      if (other instanceof POGOProtos.Rpc.NGADAOOJLBC) {
        return mergeFrom((POGOProtos.Rpc.NGADAOOJLBC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NGADAOOJLBC other) {
      if (other == POGOProtos.Rpc.NGADAOOJLBC.getDefaultInstance()) return this;
      if (other.getCapibkdihpc() != 0L) {
        setCapibkdihpc(other.getCapibkdihpc());
      }
      if (!other.getPmbcmaamkae().isEmpty()) {
        pmbcmaamkae_ = other.pmbcmaamkae_;
        onChanged();
      }
      if (other.getPghjdmmailo() != 0F) {
        setPghjdmmailo(other.getPghjdmmailo());
      }
      if (other.getPcnahfdijdc() != false) {
        setPcnahfdijdc(other.getPcnahfdijdc());
      }
      if (other.getCdpgalkhinl() != false) {
        setCdpgalkhinl(other.getCdpgalkhinl());
      }
      if (other.getEmgacgalmnp() != 0F) {
        setEmgacgalmnp(other.getEmgacgalmnp());
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
      POGOProtos.Rpc.NGADAOOJLBC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NGADAOOJLBC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long capibkdihpc_ ;
    /**
     * <code>uint64 capibkdihpc = 1;</code>
     * @return The capibkdihpc.
     */
    public long getCapibkdihpc() {
      return capibkdihpc_;
    }
    /**
     * <code>uint64 capibkdihpc = 1;</code>
     * @param value The capibkdihpc to set.
     * @return This builder for chaining.
     */
    public Builder setCapibkdihpc(long value) {
      
      capibkdihpc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 capibkdihpc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCapibkdihpc() {
      
      capibkdihpc_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object pmbcmaamkae_ = "";
    /**
     * <code>string pmbcmaamkae = 2;</code>
     * @return The pmbcmaamkae.
     */
    public java.lang.String getPmbcmaamkae() {
      java.lang.Object ref = pmbcmaamkae_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pmbcmaamkae_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pmbcmaamkae = 2;</code>
     * @return The bytes for pmbcmaamkae.
     */
    public com.google.protobuf.ByteString
        getPmbcmaamkaeBytes() {
      java.lang.Object ref = pmbcmaamkae_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pmbcmaamkae_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pmbcmaamkae = 2;</code>
     * @param value The pmbcmaamkae to set.
     * @return This builder for chaining.
     */
    public Builder setPmbcmaamkae(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pmbcmaamkae_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pmbcmaamkae = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPmbcmaamkae() {
      
      pmbcmaamkae_ = getDefaultInstance().getPmbcmaamkae();
      onChanged();
      return this;
    }
    /**
     * <code>string pmbcmaamkae = 2;</code>
     * @param value The bytes for pmbcmaamkae to set.
     * @return This builder for chaining.
     */
    public Builder setPmbcmaamkaeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pmbcmaamkae_ = value;
      onChanged();
      return this;
    }

    private float pghjdmmailo_ ;
    /**
     * <code>float pghjdmmailo = 3;</code>
     * @return The pghjdmmailo.
     */
    public float getPghjdmmailo() {
      return pghjdmmailo_;
    }
    /**
     * <code>float pghjdmmailo = 3;</code>
     * @param value The pghjdmmailo to set.
     * @return This builder for chaining.
     */
    public Builder setPghjdmmailo(float value) {
      
      pghjdmmailo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float pghjdmmailo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPghjdmmailo() {
      
      pghjdmmailo_ = 0F;
      onChanged();
      return this;
    }

    private boolean pcnahfdijdc_ ;
    /**
     * <code>bool pcnahfdijdc = 4;</code>
     * @return The pcnahfdijdc.
     */
    public boolean getPcnahfdijdc() {
      return pcnahfdijdc_;
    }
    /**
     * <code>bool pcnahfdijdc = 4;</code>
     * @param value The pcnahfdijdc to set.
     * @return This builder for chaining.
     */
    public Builder setPcnahfdijdc(boolean value) {
      
      pcnahfdijdc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pcnahfdijdc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPcnahfdijdc() {
      
      pcnahfdijdc_ = false;
      onChanged();
      return this;
    }

    private boolean cdpgalkhinl_ ;
    /**
     * <code>bool cdpgalkhinl = 5;</code>
     * @return The cdpgalkhinl.
     */
    public boolean getCdpgalkhinl() {
      return cdpgalkhinl_;
    }
    /**
     * <code>bool cdpgalkhinl = 5;</code>
     * @param value The cdpgalkhinl to set.
     * @return This builder for chaining.
     */
    public Builder setCdpgalkhinl(boolean value) {
      
      cdpgalkhinl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cdpgalkhinl = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCdpgalkhinl() {
      
      cdpgalkhinl_ = false;
      onChanged();
      return this;
    }

    private float emgacgalmnp_ ;
    /**
     * <code>float emgacgalmnp = 6;</code>
     * @return The emgacgalmnp.
     */
    public float getEmgacgalmnp() {
      return emgacgalmnp_;
    }
    /**
     * <code>float emgacgalmnp = 6;</code>
     * @param value The emgacgalmnp to set.
     * @return This builder for chaining.
     */
    public Builder setEmgacgalmnp(float value) {
      
      emgacgalmnp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float emgacgalmnp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmgacgalmnp() {
      
      emgacgalmnp_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NGADAOOJLBC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NGADAOOJLBC)
  private static final POGOProtos.Rpc.NGADAOOJLBC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NGADAOOJLBC();
  }

  public static POGOProtos.Rpc.NGADAOOJLBC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NGADAOOJLBC>
      PARSER = new com.google.protobuf.AbstractParser<NGADAOOJLBC>() {
    @java.lang.Override
    public NGADAOOJLBC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NGADAOOJLBC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NGADAOOJLBC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NGADAOOJLBC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NGADAOOJLBC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

