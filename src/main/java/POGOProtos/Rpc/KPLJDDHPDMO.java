// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KPLJDDHPDMO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KPLJDDHPDMO}
 */
public final class KPLJDDHPDMO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KPLJDDHPDMO)
    KPLJDDHPDMOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KPLJDDHPDMO.newBuilder() to construct.
  private KPLJDDHPDMO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KPLJDDHPDMO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KPLJDDHPDMO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KPLJDDHPDMO(
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
            POGOProtos.Rpc.HFAACCOOJGB.Builder subBuilder = null;
            if (lejnbbclhem_ != null) {
              subBuilder = lejnbbclhem_.toBuilder();
            }
            lejnbbclhem_ = input.readMessage(POGOProtos.Rpc.HFAACCOOJGB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lejnbbclhem_);
              lejnbbclhem_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            cklkhafjnob_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLJDDHPDMO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLJDDHPDMO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KPLJDDHPDMO.class, POGOProtos.Rpc.KPLJDDHPDMO.Builder.class);
  }

  public static final int LEJNBBCLHEM_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem_;
  /**
   * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
   * @return Whether the lejnbbclhem field is set.
   */
  @java.lang.Override
  public boolean hasLejnbbclhem() {
    return lejnbbclhem_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
   * @return The lejnbbclhem.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HFAACCOOJGB getLejnbbclhem() {
    return lejnbbclhem_ == null ? POGOProtos.Rpc.HFAACCOOJGB.getDefaultInstance() : lejnbbclhem_;
  }
  /**
   * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HFAACCOOJGBOrBuilder getLejnbbclhemOrBuilder() {
    return getLejnbbclhem();
  }

  public static final int CKLKHAFJNOB_FIELD_NUMBER = 2;
  private boolean cklkhafjnob_;
  /**
   * <code>bool cklkhafjnob = 2;</code>
   * @return The cklkhafjnob.
   */
  @java.lang.Override
  public boolean getCklkhafjnob() {
    return cklkhafjnob_;
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
    if (lejnbbclhem_ != null) {
      output.writeMessage(1, getLejnbbclhem());
    }
    if (cklkhafjnob_ != false) {
      output.writeBool(2, cklkhafjnob_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lejnbbclhem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLejnbbclhem());
    }
    if (cklkhafjnob_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cklkhafjnob_);
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
    if (!(obj instanceof POGOProtos.Rpc.KPLJDDHPDMO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KPLJDDHPDMO other = (POGOProtos.Rpc.KPLJDDHPDMO) obj;

    if (hasLejnbbclhem() != other.hasLejnbbclhem()) return false;
    if (hasLejnbbclhem()) {
      if (!getLejnbbclhem()
          .equals(other.getLejnbbclhem())) return false;
    }
    if (getCklkhafjnob()
        != other.getCklkhafjnob()) return false;
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
    if (hasLejnbbclhem()) {
      hash = (37 * hash) + LEJNBBCLHEM_FIELD_NUMBER;
      hash = (53 * hash) + getLejnbbclhem().hashCode();
    }
    hash = (37 * hash) + CKLKHAFJNOB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCklkhafjnob());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLJDDHPDMO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KPLJDDHPDMO prototype) {
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
   * ref: KPLJDDHPDMO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KPLJDDHPDMO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KPLJDDHPDMO)
      POGOProtos.Rpc.KPLJDDHPDMOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLJDDHPDMO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLJDDHPDMO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KPLJDDHPDMO.class, POGOProtos.Rpc.KPLJDDHPDMO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KPLJDDHPDMO.newBuilder()
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
      if (lejnbbclhemBuilder_ == null) {
        lejnbbclhem_ = null;
      } else {
        lejnbbclhem_ = null;
        lejnbbclhemBuilder_ = null;
      }
      cklkhafjnob_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLJDDHPDMO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLJDDHPDMO getDefaultInstanceForType() {
      return POGOProtos.Rpc.KPLJDDHPDMO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLJDDHPDMO build() {
      POGOProtos.Rpc.KPLJDDHPDMO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLJDDHPDMO buildPartial() {
      POGOProtos.Rpc.KPLJDDHPDMO result = new POGOProtos.Rpc.KPLJDDHPDMO(this);
      if (lejnbbclhemBuilder_ == null) {
        result.lejnbbclhem_ = lejnbbclhem_;
      } else {
        result.lejnbbclhem_ = lejnbbclhemBuilder_.build();
      }
      result.cklkhafjnob_ = cklkhafjnob_;
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
      if (other instanceof POGOProtos.Rpc.KPLJDDHPDMO) {
        return mergeFrom((POGOProtos.Rpc.KPLJDDHPDMO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KPLJDDHPDMO other) {
      if (other == POGOProtos.Rpc.KPLJDDHPDMO.getDefaultInstance()) return this;
      if (other.hasLejnbbclhem()) {
        mergeLejnbbclhem(other.getLejnbbclhem());
      }
      if (other.getCklkhafjnob() != false) {
        setCklkhafjnob(other.getCklkhafjnob());
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
      POGOProtos.Rpc.KPLJDDHPDMO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KPLJDDHPDMO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HFAACCOOJGB, POGOProtos.Rpc.HFAACCOOJGB.Builder, POGOProtos.Rpc.HFAACCOOJGBOrBuilder> lejnbbclhemBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     * @return Whether the lejnbbclhem field is set.
     */
    public boolean hasLejnbbclhem() {
      return lejnbbclhemBuilder_ != null || lejnbbclhem_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     * @return The lejnbbclhem.
     */
    public POGOProtos.Rpc.HFAACCOOJGB getLejnbbclhem() {
      if (lejnbbclhemBuilder_ == null) {
        return lejnbbclhem_ == null ? POGOProtos.Rpc.HFAACCOOJGB.getDefaultInstance() : lejnbbclhem_;
      } else {
        return lejnbbclhemBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public Builder setLejnbbclhem(POGOProtos.Rpc.HFAACCOOJGB value) {
      if (lejnbbclhemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lejnbbclhem_ = value;
        onChanged();
      } else {
        lejnbbclhemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public Builder setLejnbbclhem(
        POGOProtos.Rpc.HFAACCOOJGB.Builder builderForValue) {
      if (lejnbbclhemBuilder_ == null) {
        lejnbbclhem_ = builderForValue.build();
        onChanged();
      } else {
        lejnbbclhemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public Builder mergeLejnbbclhem(POGOProtos.Rpc.HFAACCOOJGB value) {
      if (lejnbbclhemBuilder_ == null) {
        if (lejnbbclhem_ != null) {
          lejnbbclhem_ =
            POGOProtos.Rpc.HFAACCOOJGB.newBuilder(lejnbbclhem_).mergeFrom(value).buildPartial();
        } else {
          lejnbbclhem_ = value;
        }
        onChanged();
      } else {
        lejnbbclhemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public Builder clearLejnbbclhem() {
      if (lejnbbclhemBuilder_ == null) {
        lejnbbclhem_ = null;
        onChanged();
      } else {
        lejnbbclhem_ = null;
        lejnbbclhemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public POGOProtos.Rpc.HFAACCOOJGB.Builder getLejnbbclhemBuilder() {
      
      onChanged();
      return getLejnbbclhemFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    public POGOProtos.Rpc.HFAACCOOJGBOrBuilder getLejnbbclhemOrBuilder() {
      if (lejnbbclhemBuilder_ != null) {
        return lejnbbclhemBuilder_.getMessageOrBuilder();
      } else {
        return lejnbbclhem_ == null ?
            POGOProtos.Rpc.HFAACCOOJGB.getDefaultInstance() : lejnbbclhem_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HFAACCOOJGB lejnbbclhem = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HFAACCOOJGB, POGOProtos.Rpc.HFAACCOOJGB.Builder, POGOProtos.Rpc.HFAACCOOJGBOrBuilder> 
        getLejnbbclhemFieldBuilder() {
      if (lejnbbclhemBuilder_ == null) {
        lejnbbclhemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HFAACCOOJGB, POGOProtos.Rpc.HFAACCOOJGB.Builder, POGOProtos.Rpc.HFAACCOOJGBOrBuilder>(
                getLejnbbclhem(),
                getParentForChildren(),
                isClean());
        lejnbbclhem_ = null;
      }
      return lejnbbclhemBuilder_;
    }

    private boolean cklkhafjnob_ ;
    /**
     * <code>bool cklkhafjnob = 2;</code>
     * @return The cklkhafjnob.
     */
    @java.lang.Override
    public boolean getCklkhafjnob() {
      return cklkhafjnob_;
    }
    /**
     * <code>bool cklkhafjnob = 2;</code>
     * @param value The cklkhafjnob to set.
     * @return This builder for chaining.
     */
    public Builder setCklkhafjnob(boolean value) {
      
      cklkhafjnob_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cklkhafjnob = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCklkhafjnob() {
      
      cklkhafjnob_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KPLJDDHPDMO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KPLJDDHPDMO)
  private static final POGOProtos.Rpc.KPLJDDHPDMO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KPLJDDHPDMO();
  }

  public static POGOProtos.Rpc.KPLJDDHPDMO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KPLJDDHPDMO>
      PARSER = new com.google.protobuf.AbstractParser<KPLJDDHPDMO>() {
    @java.lang.Override
    public KPLJDDHPDMO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KPLJDDHPDMO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KPLJDDHPDMO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KPLJDDHPDMO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KPLJDDHPDMO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

