// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JGPNPPEMMMG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JGPNPPEMMMG}
 */
public final class JGPNPPEMMMG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JGPNPPEMMMG)
    JGPNPPEMMMGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JGPNPPEMMMG.newBuilder() to construct.
  private JGPNPPEMMMG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JGPNPPEMMMG() {
    dmahipegcin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JGPNPPEMMMG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JGPNPPEMMMG(
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

            dmahipegcin_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.LPPOILIGLKF.Builder subBuilder = null;
            if (hljgelfjdfm_ != null) {
              subBuilder = hljgelfjdfm_.toBuilder();
            }
            hljgelfjdfm_ = input.readMessage(POGOProtos.Rpc.LPPOILIGLKF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hljgelfjdfm_);
              hljgelfjdfm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            jpjedbkamcn_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGPNPPEMMMG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGPNPPEMMMG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JGPNPPEMMMG.class, POGOProtos.Rpc.JGPNPPEMMMG.Builder.class);
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private int dmahipegcin_;
  /**
   * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
   * @return The enum numeric value on the wire for dmahipegcin.
   */
  @java.lang.Override public int getDmahipegcinValue() {
    return dmahipegcin_;
  }
  /**
   * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override public POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH getDmahipegcin() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH result = POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.valueOf(dmahipegcin_);
    return result == null ? POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.UNRECOGNIZED : result;
  }

  public static final int HLJGELFJDFM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm_;
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   * @return Whether the hljgelfjdfm field is set.
   */
  @java.lang.Override
  public boolean hasHljgelfjdfm() {
    return hljgelfjdfm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   * @return The hljgelfjdfm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LPPOILIGLKF getHljgelfjdfm() {
    return hljgelfjdfm_ == null ? POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
  }
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LPPOILIGLKFOrBuilder getHljgelfjdfmOrBuilder() {
    return getHljgelfjdfm();
  }

  public static final int JPJEDBKAMCN_FIELD_NUMBER = 3;
  private boolean jpjedbkamcn_;
  /**
   * <code>bool jpjedbkamcn = 3;</code>
   * @return The jpjedbkamcn.
   */
  @java.lang.Override
  public boolean getJpjedbkamcn() {
    return jpjedbkamcn_;
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
    if (dmahipegcin_ != POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.UNSET.getNumber()) {
      output.writeEnum(1, dmahipegcin_);
    }
    if (hljgelfjdfm_ != null) {
      output.writeMessage(2, getHljgelfjdfm());
    }
    if (jpjedbkamcn_ != false) {
      output.writeBool(3, jpjedbkamcn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dmahipegcin_ != POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dmahipegcin_);
    }
    if (hljgelfjdfm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHljgelfjdfm());
    }
    if (jpjedbkamcn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, jpjedbkamcn_);
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
    if (!(obj instanceof POGOProtos.Rpc.JGPNPPEMMMG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JGPNPPEMMMG other = (POGOProtos.Rpc.JGPNPPEMMMG) obj;

    if (dmahipegcin_ != other.dmahipegcin_) return false;
    if (hasHljgelfjdfm() != other.hasHljgelfjdfm()) return false;
    if (hasHljgelfjdfm()) {
      if (!getHljgelfjdfm()
          .equals(other.getHljgelfjdfm())) return false;
    }
    if (getJpjedbkamcn()
        != other.getJpjedbkamcn()) return false;
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
    hash = (37 * hash) + DMAHIPEGCIN_FIELD_NUMBER;
    hash = (53 * hash) + dmahipegcin_;
    if (hasHljgelfjdfm()) {
      hash = (37 * hash) + HLJGELFJDFM_FIELD_NUMBER;
      hash = (53 * hash) + getHljgelfjdfm().hashCode();
    }
    hash = (37 * hash) + JPJEDBKAMCN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJpjedbkamcn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGPNPPEMMMG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JGPNPPEMMMG prototype) {
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
   * ref: JGPNPPEMMMG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JGPNPPEMMMG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JGPNPPEMMMG)
      POGOProtos.Rpc.JGPNPPEMMMGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGPNPPEMMMG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGPNPPEMMMG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JGPNPPEMMMG.class, POGOProtos.Rpc.JGPNPPEMMMG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JGPNPPEMMMG.newBuilder()
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
      dmahipegcin_ = 0;

      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = null;
      } else {
        hljgelfjdfm_ = null;
        hljgelfjdfmBuilder_ = null;
      }
      jpjedbkamcn_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGPNPPEMMMG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGPNPPEMMMG getDefaultInstanceForType() {
      return POGOProtos.Rpc.JGPNPPEMMMG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGPNPPEMMMG build() {
      POGOProtos.Rpc.JGPNPPEMMMG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGPNPPEMMMG buildPartial() {
      POGOProtos.Rpc.JGPNPPEMMMG result = new POGOProtos.Rpc.JGPNPPEMMMG(this);
      result.dmahipegcin_ = dmahipegcin_;
      if (hljgelfjdfmBuilder_ == null) {
        result.hljgelfjdfm_ = hljgelfjdfm_;
      } else {
        result.hljgelfjdfm_ = hljgelfjdfmBuilder_.build();
      }
      result.jpjedbkamcn_ = jpjedbkamcn_;
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
      if (other instanceof POGOProtos.Rpc.JGPNPPEMMMG) {
        return mergeFrom((POGOProtos.Rpc.JGPNPPEMMMG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JGPNPPEMMMG other) {
      if (other == POGOProtos.Rpc.JGPNPPEMMMG.getDefaultInstance()) return this;
      if (other.dmahipegcin_ != 0) {
        setDmahipegcinValue(other.getDmahipegcinValue());
      }
      if (other.hasHljgelfjdfm()) {
        mergeHljgelfjdfm(other.getHljgelfjdfm());
      }
      if (other.getJpjedbkamcn() != false) {
        setJpjedbkamcn(other.getJpjedbkamcn());
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
      POGOProtos.Rpc.JGPNPPEMMMG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JGPNPPEMMMG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dmahipegcin_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
     * @return The enum numeric value on the wire for dmahipegcin.
     */
    @java.lang.Override public int getDmahipegcinValue() {
      return dmahipegcin_;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
     * @param value The enum numeric value on the wire for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinValue(int value) {
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH getDmahipegcin() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH result = POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.valueOf(dmahipegcin_);
      return result == null ? POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dmahipegcin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJCOGMMHMB.EPCICKNHAJH dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder> hljgelfjdfmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     * @return Whether the hljgelfjdfm field is set.
     */
    public boolean hasHljgelfjdfm() {
      return hljgelfjdfmBuilder_ != null || hljgelfjdfm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     * @return The hljgelfjdfm.
     */
    public POGOProtos.Rpc.LPPOILIGLKF getHljgelfjdfm() {
      if (hljgelfjdfmBuilder_ == null) {
        return hljgelfjdfm_ == null ? POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
      } else {
        return hljgelfjdfmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder setHljgelfjdfm(POGOProtos.Rpc.LPPOILIGLKF value) {
      if (hljgelfjdfmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hljgelfjdfm_ = value;
        onChanged();
      } else {
        hljgelfjdfmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder setHljgelfjdfm(
        POGOProtos.Rpc.LPPOILIGLKF.Builder builderForValue) {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = builderForValue.build();
        onChanged();
      } else {
        hljgelfjdfmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder mergeHljgelfjdfm(POGOProtos.Rpc.LPPOILIGLKF value) {
      if (hljgelfjdfmBuilder_ == null) {
        if (hljgelfjdfm_ != null) {
          hljgelfjdfm_ =
            POGOProtos.Rpc.LPPOILIGLKF.newBuilder(hljgelfjdfm_).mergeFrom(value).buildPartial();
        } else {
          hljgelfjdfm_ = value;
        }
        onChanged();
      } else {
        hljgelfjdfmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder clearHljgelfjdfm() {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = null;
        onChanged();
      } else {
        hljgelfjdfm_ = null;
        hljgelfjdfmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public POGOProtos.Rpc.LPPOILIGLKF.Builder getHljgelfjdfmBuilder() {
      
      onChanged();
      return getHljgelfjdfmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public POGOProtos.Rpc.LPPOILIGLKFOrBuilder getHljgelfjdfmOrBuilder() {
      if (hljgelfjdfmBuilder_ != null) {
        return hljgelfjdfmBuilder_.getMessageOrBuilder();
      } else {
        return hljgelfjdfm_ == null ?
            POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder> 
        getHljgelfjdfmFieldBuilder() {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder>(
                getHljgelfjdfm(),
                getParentForChildren(),
                isClean());
        hljgelfjdfm_ = null;
      }
      return hljgelfjdfmBuilder_;
    }

    private boolean jpjedbkamcn_ ;
    /**
     * <code>bool jpjedbkamcn = 3;</code>
     * @return The jpjedbkamcn.
     */
    @java.lang.Override
    public boolean getJpjedbkamcn() {
      return jpjedbkamcn_;
    }
    /**
     * <code>bool jpjedbkamcn = 3;</code>
     * @param value The jpjedbkamcn to set.
     * @return This builder for chaining.
     */
    public Builder setJpjedbkamcn(boolean value) {
      
      jpjedbkamcn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jpjedbkamcn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJpjedbkamcn() {
      
      jpjedbkamcn_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JGPNPPEMMMG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JGPNPPEMMMG)
  private static final POGOProtos.Rpc.JGPNPPEMMMG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JGPNPPEMMMG();
  }

  public static POGOProtos.Rpc.JGPNPPEMMMG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JGPNPPEMMMG>
      PARSER = new com.google.protobuf.AbstractParser<JGPNPPEMMMG>() {
    @java.lang.Override
    public JGPNPPEMMMG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JGPNPPEMMMG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JGPNPPEMMMG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JGPNPPEMMMG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JGPNPPEMMMG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

