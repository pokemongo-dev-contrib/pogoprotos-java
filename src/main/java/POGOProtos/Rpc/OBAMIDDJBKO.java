// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OBAMIDDJBKO}
 */
public  final class OBAMIDDJBKO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OBAMIDDJBKO)
    OBAMIDDJBKOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OBAMIDDJBKO.newBuilder() to construct.
  private OBAMIDDJBKO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OBAMIDDJBKO() {
    nloikbolnga_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OBAMIDDJBKO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OBAMIDDJBKO(
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

            nloikbolnga_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.DFOODNLHKFD.Builder subBuilder = null;
            if (opgpjapbpdm_ != null) {
              subBuilder = opgpjapbpdm_.toBuilder();
            }
            opgpjapbpdm_ = input.readMessage(POGOProtos.Rpc.DFOODNLHKFD.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(opgpjapbpdm_);
              opgpjapbpdm_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OBAMIDDJBKO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OBAMIDDJBKO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OBAMIDDJBKO.class, POGOProtos.Rpc.OBAMIDDJBKO.Builder.class);
  }

  public static final int NLOIKBOLNGA_FIELD_NUMBER = 1;
  private int nloikbolnga_;
  /**
   * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
   * @return The enum numeric value on the wire for nloikbolnga.
   */
  public int getNloikbolngaValue() {
    return nloikbolnga_;
  }
  /**
   * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
   * @return The nloikbolnga.
   */
  public POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG getNloikbolnga() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG result = POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.valueOf(nloikbolnga_);
    return result == null ? POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.UNRECOGNIZED : result;
  }

  public static final int OPGPJAPBPDM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm_;
  /**
   * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
   * @return Whether the opgpjapbpdm field is set.
   */
  public boolean hasOpgpjapbpdm() {
    return opgpjapbpdm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
   * @return The opgpjapbpdm.
   */
  public POGOProtos.Rpc.DFOODNLHKFD getOpgpjapbpdm() {
    return opgpjapbpdm_ == null ? POGOProtos.Rpc.DFOODNLHKFD.getDefaultInstance() : opgpjapbpdm_;
  }
  /**
   * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
   */
  public POGOProtos.Rpc.DFOODNLHKFDOrBuilder getOpgpjapbpdmOrBuilder() {
    return getOpgpjapbpdm();
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
    if (nloikbolnga_ != POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.ILENFAOCNPG_UNSET.getNumber()) {
      output.writeEnum(1, nloikbolnga_);
    }
    if (opgpjapbpdm_ != null) {
      output.writeMessage(2, getOpgpjapbpdm());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nloikbolnga_ != POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.ILENFAOCNPG_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, nloikbolnga_);
    }
    if (opgpjapbpdm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOpgpjapbpdm());
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
    if (!(obj instanceof POGOProtos.Rpc.OBAMIDDJBKO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OBAMIDDJBKO other = (POGOProtos.Rpc.OBAMIDDJBKO) obj;

    if (nloikbolnga_ != other.nloikbolnga_) return false;
    if (hasOpgpjapbpdm() != other.hasOpgpjapbpdm()) return false;
    if (hasOpgpjapbpdm()) {
      if (!getOpgpjapbpdm()
          .equals(other.getOpgpjapbpdm())) return false;
    }
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
    hash = (37 * hash) + NLOIKBOLNGA_FIELD_NUMBER;
    hash = (53 * hash) + nloikbolnga_;
    if (hasOpgpjapbpdm()) {
      hash = (37 * hash) + OPGPJAPBPDM_FIELD_NUMBER;
      hash = (53 * hash) + getOpgpjapbpdm().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBAMIDDJBKO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OBAMIDDJBKO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OBAMIDDJBKO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OBAMIDDJBKO)
      POGOProtos.Rpc.OBAMIDDJBKOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OBAMIDDJBKO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OBAMIDDJBKO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OBAMIDDJBKO.class, POGOProtos.Rpc.OBAMIDDJBKO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OBAMIDDJBKO.newBuilder()
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
      nloikbolnga_ = 0;

      if (opgpjapbpdmBuilder_ == null) {
        opgpjapbpdm_ = null;
      } else {
        opgpjapbpdm_ = null;
        opgpjapbpdmBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OBAMIDDJBKO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBAMIDDJBKO getDefaultInstanceForType() {
      return POGOProtos.Rpc.OBAMIDDJBKO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBAMIDDJBKO build() {
      POGOProtos.Rpc.OBAMIDDJBKO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBAMIDDJBKO buildPartial() {
      POGOProtos.Rpc.OBAMIDDJBKO result = new POGOProtos.Rpc.OBAMIDDJBKO(this);
      result.nloikbolnga_ = nloikbolnga_;
      if (opgpjapbpdmBuilder_ == null) {
        result.opgpjapbpdm_ = opgpjapbpdm_;
      } else {
        result.opgpjapbpdm_ = opgpjapbpdmBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.OBAMIDDJBKO) {
        return mergeFrom((POGOProtos.Rpc.OBAMIDDJBKO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OBAMIDDJBKO other) {
      if (other == POGOProtos.Rpc.OBAMIDDJBKO.getDefaultInstance()) return this;
      if (other.nloikbolnga_ != 0) {
        setNloikbolngaValue(other.getNloikbolngaValue());
      }
      if (other.hasOpgpjapbpdm()) {
        mergeOpgpjapbpdm(other.getOpgpjapbpdm());
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
      POGOProtos.Rpc.OBAMIDDJBKO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OBAMIDDJBKO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nloikbolnga_ = 0;
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return The enum numeric value on the wire for nloikbolnga.
     */
    public int getNloikbolngaValue() {
      return nloikbolnga_;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @param value The enum numeric value on the wire for nloikbolnga to set.
     * @return This builder for chaining.
     */
    public Builder setNloikbolngaValue(int value) {
      nloikbolnga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return The nloikbolnga.
     */
    public POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG getNloikbolnga() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG result = POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.valueOf(nloikbolnga_);
      return result == null ? POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @param value The nloikbolnga to set.
     * @return This builder for chaining.
     */
    public Builder setNloikbolnga(POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nloikbolnga_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNloikbolnga() {
      
      nloikbolnga_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DFOODNLHKFD, POGOProtos.Rpc.DFOODNLHKFD.Builder, POGOProtos.Rpc.DFOODNLHKFDOrBuilder> opgpjapbpdmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     * @return Whether the opgpjapbpdm field is set.
     */
    public boolean hasOpgpjapbpdm() {
      return opgpjapbpdmBuilder_ != null || opgpjapbpdm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     * @return The opgpjapbpdm.
     */
    public POGOProtos.Rpc.DFOODNLHKFD getOpgpjapbpdm() {
      if (opgpjapbpdmBuilder_ == null) {
        return opgpjapbpdm_ == null ? POGOProtos.Rpc.DFOODNLHKFD.getDefaultInstance() : opgpjapbpdm_;
      } else {
        return opgpjapbpdmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public Builder setOpgpjapbpdm(POGOProtos.Rpc.DFOODNLHKFD value) {
      if (opgpjapbpdmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        opgpjapbpdm_ = value;
        onChanged();
      } else {
        opgpjapbpdmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public Builder setOpgpjapbpdm(
        POGOProtos.Rpc.DFOODNLHKFD.Builder builderForValue) {
      if (opgpjapbpdmBuilder_ == null) {
        opgpjapbpdm_ = builderForValue.build();
        onChanged();
      } else {
        opgpjapbpdmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public Builder mergeOpgpjapbpdm(POGOProtos.Rpc.DFOODNLHKFD value) {
      if (opgpjapbpdmBuilder_ == null) {
        if (opgpjapbpdm_ != null) {
          opgpjapbpdm_ =
            POGOProtos.Rpc.DFOODNLHKFD.newBuilder(opgpjapbpdm_).mergeFrom(value).buildPartial();
        } else {
          opgpjapbpdm_ = value;
        }
        onChanged();
      } else {
        opgpjapbpdmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public Builder clearOpgpjapbpdm() {
      if (opgpjapbpdmBuilder_ == null) {
        opgpjapbpdm_ = null;
        onChanged();
      } else {
        opgpjapbpdm_ = null;
        opgpjapbpdmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public POGOProtos.Rpc.DFOODNLHKFD.Builder getOpgpjapbpdmBuilder() {
      
      onChanged();
      return getOpgpjapbpdmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    public POGOProtos.Rpc.DFOODNLHKFDOrBuilder getOpgpjapbpdmOrBuilder() {
      if (opgpjapbpdmBuilder_ != null) {
        return opgpjapbpdmBuilder_.getMessageOrBuilder();
      } else {
        return opgpjapbpdm_ == null ?
            POGOProtos.Rpc.DFOODNLHKFD.getDefaultInstance() : opgpjapbpdm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DFOODNLHKFD opgpjapbpdm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DFOODNLHKFD, POGOProtos.Rpc.DFOODNLHKFD.Builder, POGOProtos.Rpc.DFOODNLHKFDOrBuilder> 
        getOpgpjapbpdmFieldBuilder() {
      if (opgpjapbpdmBuilder_ == null) {
        opgpjapbpdmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.DFOODNLHKFD, POGOProtos.Rpc.DFOODNLHKFD.Builder, POGOProtos.Rpc.DFOODNLHKFDOrBuilder>(
                getOpgpjapbpdm(),
                getParentForChildren(),
                isClean());
        opgpjapbpdm_ = null;
      }
      return opgpjapbpdmBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OBAMIDDJBKO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OBAMIDDJBKO)
  private static final POGOProtos.Rpc.OBAMIDDJBKO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OBAMIDDJBKO();
  }

  public static POGOProtos.Rpc.OBAMIDDJBKO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OBAMIDDJBKO>
      PARSER = new com.google.protobuf.AbstractParser<OBAMIDDJBKO>() {
    @java.lang.Override
    public OBAMIDDJBKO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OBAMIDDJBKO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OBAMIDDJBKO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OBAMIDDJBKO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OBAMIDDJBKO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

