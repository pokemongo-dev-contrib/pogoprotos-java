// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EFJBEICFJKP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EFJBEICFJKP}
 */
public  final class EFJBEICFJKP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EFJBEICFJKP)
    EFJBEICFJKPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EFJBEICFJKP.newBuilder() to construct.
  private EFJBEICFJKP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EFJBEICFJKP() {
    mjfadlmehjn_ = "";
    dkgpmdfpooe_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EFJBEICFJKP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EFJBEICFJKP(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            mjfadlmehjn_ = s;
            break;
          }
          case 17: {

            mhalkliedfd_ = input.readDouble();
            break;
          }
          case 25: {

            bapccogppfn_ = input.readDouble();
            break;
          }
          case 33: {

            abaaifobijl_ = input.readDouble();
            break;
          }
          case 41: {

            gjofldhdgml_ = input.readDouble();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            dkgpmdfpooe_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EFJBEICFJKP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EFJBEICFJKP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EFJBEICFJKP.class, POGOProtos.Rpc.EFJBEICFJKP.Builder.class);
  }

  public static final int MJFADLMEHJN_FIELD_NUMBER = 1;
  private volatile java.lang.Object mjfadlmehjn_;
  /**
   * <code>string mjfadlmehjn = 1;</code>
   * @return The mjfadlmehjn.
   */
  public java.lang.String getMjfadlmehjn() {
    java.lang.Object ref = mjfadlmehjn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mjfadlmehjn_ = s;
      return s;
    }
  }
  /**
   * <code>string mjfadlmehjn = 1;</code>
   * @return The bytes for mjfadlmehjn.
   */
  public com.google.protobuf.ByteString
      getMjfadlmehjnBytes() {
    java.lang.Object ref = mjfadlmehjn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mjfadlmehjn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MHALKLIEDFD_FIELD_NUMBER = 2;
  private double mhalkliedfd_;
  /**
   * <code>double mhalkliedfd = 2;</code>
   * @return The mhalkliedfd.
   */
  public double getMhalkliedfd() {
    return mhalkliedfd_;
  }

  public static final int BAPCCOGPPFN_FIELD_NUMBER = 3;
  private double bapccogppfn_;
  /**
   * <code>double bapccogppfn = 3;</code>
   * @return The bapccogppfn.
   */
  public double getBapccogppfn() {
    return bapccogppfn_;
  }

  public static final int ABAAIFOBIJL_FIELD_NUMBER = 4;
  private double abaaifobijl_;
  /**
   * <code>double abaaifobijl = 4;</code>
   * @return The abaaifobijl.
   */
  public double getAbaaifobijl() {
    return abaaifobijl_;
  }

  public static final int GJOFLDHDGML_FIELD_NUMBER = 5;
  private double gjofldhdgml_;
  /**
   * <code>double gjofldhdgml = 5;</code>
   * @return The gjofldhdgml.
   */
  public double getGjofldhdgml() {
    return gjofldhdgml_;
  }

  public static final int DKGPMDFPOOE_FIELD_NUMBER = 6;
  private volatile java.lang.Object dkgpmdfpooe_;
  /**
   * <code>string dkgpmdfpooe = 6;</code>
   * @return The dkgpmdfpooe.
   */
  public java.lang.String getDkgpmdfpooe() {
    java.lang.Object ref = dkgpmdfpooe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dkgpmdfpooe_ = s;
      return s;
    }
  }
  /**
   * <code>string dkgpmdfpooe = 6;</code>
   * @return The bytes for dkgpmdfpooe.
   */
  public com.google.protobuf.ByteString
      getDkgpmdfpooeBytes() {
    java.lang.Object ref = dkgpmdfpooe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dkgpmdfpooe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMjfadlmehjnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mjfadlmehjn_);
    }
    if (mhalkliedfd_ != 0D) {
      output.writeDouble(2, mhalkliedfd_);
    }
    if (bapccogppfn_ != 0D) {
      output.writeDouble(3, bapccogppfn_);
    }
    if (abaaifobijl_ != 0D) {
      output.writeDouble(4, abaaifobijl_);
    }
    if (gjofldhdgml_ != 0D) {
      output.writeDouble(5, gjofldhdgml_);
    }
    if (!getDkgpmdfpooeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, dkgpmdfpooe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMjfadlmehjnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mjfadlmehjn_);
    }
    if (mhalkliedfd_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, mhalkliedfd_);
    }
    if (bapccogppfn_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, bapccogppfn_);
    }
    if (abaaifobijl_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, abaaifobijl_);
    }
    if (gjofldhdgml_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, gjofldhdgml_);
    }
    if (!getDkgpmdfpooeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, dkgpmdfpooe_);
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
    if (!(obj instanceof POGOProtos.Rpc.EFJBEICFJKP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EFJBEICFJKP other = (POGOProtos.Rpc.EFJBEICFJKP) obj;

    if (!getMjfadlmehjn()
        .equals(other.getMjfadlmehjn())) return false;
    if (java.lang.Double.doubleToLongBits(getMhalkliedfd())
        != java.lang.Double.doubleToLongBits(
            other.getMhalkliedfd())) return false;
    if (java.lang.Double.doubleToLongBits(getBapccogppfn())
        != java.lang.Double.doubleToLongBits(
            other.getBapccogppfn())) return false;
    if (java.lang.Double.doubleToLongBits(getAbaaifobijl())
        != java.lang.Double.doubleToLongBits(
            other.getAbaaifobijl())) return false;
    if (java.lang.Double.doubleToLongBits(getGjofldhdgml())
        != java.lang.Double.doubleToLongBits(
            other.getGjofldhdgml())) return false;
    if (!getDkgpmdfpooe()
        .equals(other.getDkgpmdfpooe())) return false;
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
    hash = (37 * hash) + MJFADLMEHJN_FIELD_NUMBER;
    hash = (53 * hash) + getMjfadlmehjn().hashCode();
    hash = (37 * hash) + MHALKLIEDFD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMhalkliedfd()));
    hash = (37 * hash) + BAPCCOGPPFN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBapccogppfn()));
    hash = (37 * hash) + ABAAIFOBIJL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAbaaifobijl()));
    hash = (37 * hash) + GJOFLDHDGML_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGjofldhdgml()));
    hash = (37 * hash) + DKGPMDFPOOE_FIELD_NUMBER;
    hash = (53 * hash) + getDkgpmdfpooe().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EFJBEICFJKP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EFJBEICFJKP prototype) {
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
   * ref: EFJBEICFJKP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EFJBEICFJKP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EFJBEICFJKP)
      POGOProtos.Rpc.EFJBEICFJKPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EFJBEICFJKP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EFJBEICFJKP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EFJBEICFJKP.class, POGOProtos.Rpc.EFJBEICFJKP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EFJBEICFJKP.newBuilder()
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
      mjfadlmehjn_ = "";

      mhalkliedfd_ = 0D;

      bapccogppfn_ = 0D;

      abaaifobijl_ = 0D;

      gjofldhdgml_ = 0D;

      dkgpmdfpooe_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EFJBEICFJKP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EFJBEICFJKP getDefaultInstanceForType() {
      return POGOProtos.Rpc.EFJBEICFJKP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EFJBEICFJKP build() {
      POGOProtos.Rpc.EFJBEICFJKP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EFJBEICFJKP buildPartial() {
      POGOProtos.Rpc.EFJBEICFJKP result = new POGOProtos.Rpc.EFJBEICFJKP(this);
      result.mjfadlmehjn_ = mjfadlmehjn_;
      result.mhalkliedfd_ = mhalkliedfd_;
      result.bapccogppfn_ = bapccogppfn_;
      result.abaaifobijl_ = abaaifobijl_;
      result.gjofldhdgml_ = gjofldhdgml_;
      result.dkgpmdfpooe_ = dkgpmdfpooe_;
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
      if (other instanceof POGOProtos.Rpc.EFJBEICFJKP) {
        return mergeFrom((POGOProtos.Rpc.EFJBEICFJKP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EFJBEICFJKP other) {
      if (other == POGOProtos.Rpc.EFJBEICFJKP.getDefaultInstance()) return this;
      if (!other.getMjfadlmehjn().isEmpty()) {
        mjfadlmehjn_ = other.mjfadlmehjn_;
        onChanged();
      }
      if (other.getMhalkliedfd() != 0D) {
        setMhalkliedfd(other.getMhalkliedfd());
      }
      if (other.getBapccogppfn() != 0D) {
        setBapccogppfn(other.getBapccogppfn());
      }
      if (other.getAbaaifobijl() != 0D) {
        setAbaaifobijl(other.getAbaaifobijl());
      }
      if (other.getGjofldhdgml() != 0D) {
        setGjofldhdgml(other.getGjofldhdgml());
      }
      if (!other.getDkgpmdfpooe().isEmpty()) {
        dkgpmdfpooe_ = other.dkgpmdfpooe_;
        onChanged();
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
      POGOProtos.Rpc.EFJBEICFJKP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EFJBEICFJKP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mjfadlmehjn_ = "";
    /**
     * <code>string mjfadlmehjn = 1;</code>
     * @return The mjfadlmehjn.
     */
    public java.lang.String getMjfadlmehjn() {
      java.lang.Object ref = mjfadlmehjn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mjfadlmehjn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mjfadlmehjn = 1;</code>
     * @return The bytes for mjfadlmehjn.
     */
    public com.google.protobuf.ByteString
        getMjfadlmehjnBytes() {
      java.lang.Object ref = mjfadlmehjn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mjfadlmehjn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mjfadlmehjn = 1;</code>
     * @param value The mjfadlmehjn to set.
     * @return This builder for chaining.
     */
    public Builder setMjfadlmehjn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mjfadlmehjn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mjfadlmehjn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjfadlmehjn() {
      
      mjfadlmehjn_ = getDefaultInstance().getMjfadlmehjn();
      onChanged();
      return this;
    }
    /**
     * <code>string mjfadlmehjn = 1;</code>
     * @param value The bytes for mjfadlmehjn to set.
     * @return This builder for chaining.
     */
    public Builder setMjfadlmehjnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mjfadlmehjn_ = value;
      onChanged();
      return this;
    }

    private double mhalkliedfd_ ;
    /**
     * <code>double mhalkliedfd = 2;</code>
     * @return The mhalkliedfd.
     */
    public double getMhalkliedfd() {
      return mhalkliedfd_;
    }
    /**
     * <code>double mhalkliedfd = 2;</code>
     * @param value The mhalkliedfd to set.
     * @return This builder for chaining.
     */
    public Builder setMhalkliedfd(double value) {
      
      mhalkliedfd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double mhalkliedfd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhalkliedfd() {
      
      mhalkliedfd_ = 0D;
      onChanged();
      return this;
    }

    private double bapccogppfn_ ;
    /**
     * <code>double bapccogppfn = 3;</code>
     * @return The bapccogppfn.
     */
    public double getBapccogppfn() {
      return bapccogppfn_;
    }
    /**
     * <code>double bapccogppfn = 3;</code>
     * @param value The bapccogppfn to set.
     * @return This builder for chaining.
     */
    public Builder setBapccogppfn(double value) {
      
      bapccogppfn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bapccogppfn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBapccogppfn() {
      
      bapccogppfn_ = 0D;
      onChanged();
      return this;
    }

    private double abaaifobijl_ ;
    /**
     * <code>double abaaifobijl = 4;</code>
     * @return The abaaifobijl.
     */
    public double getAbaaifobijl() {
      return abaaifobijl_;
    }
    /**
     * <code>double abaaifobijl = 4;</code>
     * @param value The abaaifobijl to set.
     * @return This builder for chaining.
     */
    public Builder setAbaaifobijl(double value) {
      
      abaaifobijl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double abaaifobijl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbaaifobijl() {
      
      abaaifobijl_ = 0D;
      onChanged();
      return this;
    }

    private double gjofldhdgml_ ;
    /**
     * <code>double gjofldhdgml = 5;</code>
     * @return The gjofldhdgml.
     */
    public double getGjofldhdgml() {
      return gjofldhdgml_;
    }
    /**
     * <code>double gjofldhdgml = 5;</code>
     * @param value The gjofldhdgml to set.
     * @return This builder for chaining.
     */
    public Builder setGjofldhdgml(double value) {
      
      gjofldhdgml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gjofldhdgml = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjofldhdgml() {
      
      gjofldhdgml_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object dkgpmdfpooe_ = "";
    /**
     * <code>string dkgpmdfpooe = 6;</code>
     * @return The dkgpmdfpooe.
     */
    public java.lang.String getDkgpmdfpooe() {
      java.lang.Object ref = dkgpmdfpooe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dkgpmdfpooe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dkgpmdfpooe = 6;</code>
     * @return The bytes for dkgpmdfpooe.
     */
    public com.google.protobuf.ByteString
        getDkgpmdfpooeBytes() {
      java.lang.Object ref = dkgpmdfpooe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dkgpmdfpooe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dkgpmdfpooe = 6;</code>
     * @param value The dkgpmdfpooe to set.
     * @return This builder for chaining.
     */
    public Builder setDkgpmdfpooe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dkgpmdfpooe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dkgpmdfpooe = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDkgpmdfpooe() {
      
      dkgpmdfpooe_ = getDefaultInstance().getDkgpmdfpooe();
      onChanged();
      return this;
    }
    /**
     * <code>string dkgpmdfpooe = 6;</code>
     * @param value The bytes for dkgpmdfpooe to set.
     * @return This builder for chaining.
     */
    public Builder setDkgpmdfpooeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dkgpmdfpooe_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EFJBEICFJKP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EFJBEICFJKP)
  private static final POGOProtos.Rpc.EFJBEICFJKP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EFJBEICFJKP();
  }

  public static POGOProtos.Rpc.EFJBEICFJKP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EFJBEICFJKP>
      PARSER = new com.google.protobuf.AbstractParser<EFJBEICFJKP>() {
    @java.lang.Override
    public EFJBEICFJKP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EFJBEICFJKP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EFJBEICFJKP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EFJBEICFJKP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EFJBEICFJKP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

