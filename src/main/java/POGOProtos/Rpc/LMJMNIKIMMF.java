// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LMJMNIKIMMF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LMJMNIKIMMF}
 */
public final class LMJMNIKIMMF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LMJMNIKIMMF)
    LMJMNIKIMMFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LMJMNIKIMMF.newBuilder() to construct.
  private LMJMNIKIMMF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LMJMNIKIMMF() {
    kaiamlgepej_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LMJMNIKIMMF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LMJMNIKIMMF(
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
            POGOProtos.Rpc.OKFIHNGEDNG.Builder subBuilder = null;
            if (odngkapjlmb_ != null) {
              subBuilder = odngkapjlmb_.toBuilder();
            }
            odngkapjlmb_ = input.readMessage(POGOProtos.Rpc.OKFIHNGEDNG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(odngkapjlmb_);
              odngkapjlmb_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            kaiamlgepej_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMJMNIKIMMF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMJMNIKIMMF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LMJMNIKIMMF.class, POGOProtos.Rpc.LMJMNIKIMMF.Builder.class);
  }

  public static final int ODNGKAPJLMB_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb_;
  /**
   * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
   * @return Whether the odngkapjlmb field is set.
   */
  @java.lang.Override
  public boolean hasOdngkapjlmb() {
    return odngkapjlmb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
   * @return The odngkapjlmb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.OKFIHNGEDNG getOdngkapjlmb() {
    return odngkapjlmb_ == null ? POGOProtos.Rpc.OKFIHNGEDNG.getDefaultInstance() : odngkapjlmb_;
  }
  /**
   * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.OKFIHNGEDNGOrBuilder getOdngkapjlmbOrBuilder() {
    return getOdngkapjlmb();
  }

  public static final int KAIAMLGEPEJ_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString kaiamlgepej_;
  /**
   * <code>bytes kaiamlgepej = 2;</code>
   * @return The kaiamlgepej.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKaiamlgepej() {
    return kaiamlgepej_;
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
    if (odngkapjlmb_ != null) {
      output.writeMessage(1, getOdngkapjlmb());
    }
    if (!kaiamlgepej_.isEmpty()) {
      output.writeBytes(2, kaiamlgepej_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (odngkapjlmb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOdngkapjlmb());
    }
    if (!kaiamlgepej_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, kaiamlgepej_);
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
    if (!(obj instanceof POGOProtos.Rpc.LMJMNIKIMMF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LMJMNIKIMMF other = (POGOProtos.Rpc.LMJMNIKIMMF) obj;

    if (hasOdngkapjlmb() != other.hasOdngkapjlmb()) return false;
    if (hasOdngkapjlmb()) {
      if (!getOdngkapjlmb()
          .equals(other.getOdngkapjlmb())) return false;
    }
    if (!getKaiamlgepej()
        .equals(other.getKaiamlgepej())) return false;
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
    if (hasOdngkapjlmb()) {
      hash = (37 * hash) + ODNGKAPJLMB_FIELD_NUMBER;
      hash = (53 * hash) + getOdngkapjlmb().hashCode();
    }
    hash = (37 * hash) + KAIAMLGEPEJ_FIELD_NUMBER;
    hash = (53 * hash) + getKaiamlgepej().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMJMNIKIMMF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LMJMNIKIMMF prototype) {
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
   * ref: LMJMNIKIMMF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LMJMNIKIMMF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LMJMNIKIMMF)
      POGOProtos.Rpc.LMJMNIKIMMFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMJMNIKIMMF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMJMNIKIMMF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LMJMNIKIMMF.class, POGOProtos.Rpc.LMJMNIKIMMF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LMJMNIKIMMF.newBuilder()
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
      if (odngkapjlmbBuilder_ == null) {
        odngkapjlmb_ = null;
      } else {
        odngkapjlmb_ = null;
        odngkapjlmbBuilder_ = null;
      }
      kaiamlgepej_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMJMNIKIMMF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMJMNIKIMMF getDefaultInstanceForType() {
      return POGOProtos.Rpc.LMJMNIKIMMF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMJMNIKIMMF build() {
      POGOProtos.Rpc.LMJMNIKIMMF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMJMNIKIMMF buildPartial() {
      POGOProtos.Rpc.LMJMNIKIMMF result = new POGOProtos.Rpc.LMJMNIKIMMF(this);
      if (odngkapjlmbBuilder_ == null) {
        result.odngkapjlmb_ = odngkapjlmb_;
      } else {
        result.odngkapjlmb_ = odngkapjlmbBuilder_.build();
      }
      result.kaiamlgepej_ = kaiamlgepej_;
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
      if (other instanceof POGOProtos.Rpc.LMJMNIKIMMF) {
        return mergeFrom((POGOProtos.Rpc.LMJMNIKIMMF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LMJMNIKIMMF other) {
      if (other == POGOProtos.Rpc.LMJMNIKIMMF.getDefaultInstance()) return this;
      if (other.hasOdngkapjlmb()) {
        mergeOdngkapjlmb(other.getOdngkapjlmb());
      }
      if (other.getKaiamlgepej() != com.google.protobuf.ByteString.EMPTY) {
        setKaiamlgepej(other.getKaiamlgepej());
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
      POGOProtos.Rpc.LMJMNIKIMMF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LMJMNIKIMMF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OKFIHNGEDNG, POGOProtos.Rpc.OKFIHNGEDNG.Builder, POGOProtos.Rpc.OKFIHNGEDNGOrBuilder> odngkapjlmbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     * @return Whether the odngkapjlmb field is set.
     */
    public boolean hasOdngkapjlmb() {
      return odngkapjlmbBuilder_ != null || odngkapjlmb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     * @return The odngkapjlmb.
     */
    public POGOProtos.Rpc.OKFIHNGEDNG getOdngkapjlmb() {
      if (odngkapjlmbBuilder_ == null) {
        return odngkapjlmb_ == null ? POGOProtos.Rpc.OKFIHNGEDNG.getDefaultInstance() : odngkapjlmb_;
      } else {
        return odngkapjlmbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public Builder setOdngkapjlmb(POGOProtos.Rpc.OKFIHNGEDNG value) {
      if (odngkapjlmbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        odngkapjlmb_ = value;
        onChanged();
      } else {
        odngkapjlmbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public Builder setOdngkapjlmb(
        POGOProtos.Rpc.OKFIHNGEDNG.Builder builderForValue) {
      if (odngkapjlmbBuilder_ == null) {
        odngkapjlmb_ = builderForValue.build();
        onChanged();
      } else {
        odngkapjlmbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public Builder mergeOdngkapjlmb(POGOProtos.Rpc.OKFIHNGEDNG value) {
      if (odngkapjlmbBuilder_ == null) {
        if (odngkapjlmb_ != null) {
          odngkapjlmb_ =
            POGOProtos.Rpc.OKFIHNGEDNG.newBuilder(odngkapjlmb_).mergeFrom(value).buildPartial();
        } else {
          odngkapjlmb_ = value;
        }
        onChanged();
      } else {
        odngkapjlmbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public Builder clearOdngkapjlmb() {
      if (odngkapjlmbBuilder_ == null) {
        odngkapjlmb_ = null;
        onChanged();
      } else {
        odngkapjlmb_ = null;
        odngkapjlmbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public POGOProtos.Rpc.OKFIHNGEDNG.Builder getOdngkapjlmbBuilder() {
      
      onChanged();
      return getOdngkapjlmbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    public POGOProtos.Rpc.OKFIHNGEDNGOrBuilder getOdngkapjlmbOrBuilder() {
      if (odngkapjlmbBuilder_ != null) {
        return odngkapjlmbBuilder_.getMessageOrBuilder();
      } else {
        return odngkapjlmb_ == null ?
            POGOProtos.Rpc.OKFIHNGEDNG.getDefaultInstance() : odngkapjlmb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OKFIHNGEDNG odngkapjlmb = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OKFIHNGEDNG, POGOProtos.Rpc.OKFIHNGEDNG.Builder, POGOProtos.Rpc.OKFIHNGEDNGOrBuilder> 
        getOdngkapjlmbFieldBuilder() {
      if (odngkapjlmbBuilder_ == null) {
        odngkapjlmbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.OKFIHNGEDNG, POGOProtos.Rpc.OKFIHNGEDNG.Builder, POGOProtos.Rpc.OKFIHNGEDNGOrBuilder>(
                getOdngkapjlmb(),
                getParentForChildren(),
                isClean());
        odngkapjlmb_ = null;
      }
      return odngkapjlmbBuilder_;
    }

    private com.google.protobuf.ByteString kaiamlgepej_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes kaiamlgepej = 2;</code>
     * @return The kaiamlgepej.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKaiamlgepej() {
      return kaiamlgepej_;
    }
    /**
     * <code>bytes kaiamlgepej = 2;</code>
     * @param value The kaiamlgepej to set.
     * @return This builder for chaining.
     */
    public Builder setKaiamlgepej(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kaiamlgepej_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes kaiamlgepej = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKaiamlgepej() {
      
      kaiamlgepej_ = getDefaultInstance().getKaiamlgepej();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LMJMNIKIMMF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LMJMNIKIMMF)
  private static final POGOProtos.Rpc.LMJMNIKIMMF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LMJMNIKIMMF();
  }

  public static POGOProtos.Rpc.LMJMNIKIMMF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LMJMNIKIMMF>
      PARSER = new com.google.protobuf.AbstractParser<LMJMNIKIMMF>() {
    @java.lang.Override
    public LMJMNIKIMMF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LMJMNIKIMMF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LMJMNIKIMMF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LMJMNIKIMMF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LMJMNIKIMMF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

