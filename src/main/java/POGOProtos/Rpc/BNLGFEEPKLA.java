// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BNLGFEEPKLA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BNLGFEEPKLA}
 */
public final class BNLGFEEPKLA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BNLGFEEPKLA)
    BNLGFEEPKLAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BNLGFEEPKLA.newBuilder() to construct.
  private BNLGFEEPKLA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BNLGFEEPKLA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BNLGFEEPKLA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BNLGFEEPKLA(
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

            klnnkffpidb_ = input.readBool();
            break;
          }
          case 18: {
            POGOProtos.Rpc.COOOEKOJFAO.Builder subBuilder = null;
            if (modleahleaf_ != null) {
              subBuilder = modleahleaf_.toBuilder();
            }
            modleahleaf_ = input.readMessage(POGOProtos.Rpc.COOOEKOJFAO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(modleahleaf_);
              modleahleaf_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLGFEEPKLA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLGFEEPKLA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BNLGFEEPKLA.class, POGOProtos.Rpc.BNLGFEEPKLA.Builder.class);
  }

  public static final int KLNNKFFPIDB_FIELD_NUMBER = 1;
  private boolean klnnkffpidb_;
  /**
   * <code>bool klnnkffpidb = 1;</code>
   * @return The klnnkffpidb.
   */
  @java.lang.Override
  public boolean getKlnnkffpidb() {
    return klnnkffpidb_;
  }

  public static final int MODLEAHLEAF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.COOOEKOJFAO modleahleaf_;
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   * @return Whether the modleahleaf field is set.
   */
  @java.lang.Override
  public boolean hasModleahleaf() {
    return modleahleaf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   * @return The modleahleaf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.COOOEKOJFAO getModleahleaf() {
    return modleahleaf_ == null ? POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
  }
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.COOOEKOJFAOOrBuilder getModleahleafOrBuilder() {
    return getModleahleaf();
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
    if (klnnkffpidb_ != false) {
      output.writeBool(1, klnnkffpidb_);
    }
    if (modleahleaf_ != null) {
      output.writeMessage(2, getModleahleaf());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (klnnkffpidb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, klnnkffpidb_);
    }
    if (modleahleaf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModleahleaf());
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
    if (!(obj instanceof POGOProtos.Rpc.BNLGFEEPKLA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BNLGFEEPKLA other = (POGOProtos.Rpc.BNLGFEEPKLA) obj;

    if (getKlnnkffpidb()
        != other.getKlnnkffpidb()) return false;
    if (hasModleahleaf() != other.hasModleahleaf()) return false;
    if (hasModleahleaf()) {
      if (!getModleahleaf()
          .equals(other.getModleahleaf())) return false;
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
    hash = (37 * hash) + KLNNKFFPIDB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKlnnkffpidb());
    if (hasModleahleaf()) {
      hash = (37 * hash) + MODLEAHLEAF_FIELD_NUMBER;
      hash = (53 * hash) + getModleahleaf().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLGFEEPKLA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BNLGFEEPKLA prototype) {
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
   * ref: BNLGFEEPKLA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BNLGFEEPKLA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BNLGFEEPKLA)
      POGOProtos.Rpc.BNLGFEEPKLAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLGFEEPKLA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLGFEEPKLA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BNLGFEEPKLA.class, POGOProtos.Rpc.BNLGFEEPKLA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BNLGFEEPKLA.newBuilder()
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
      klnnkffpidb_ = false;

      if (modleahleafBuilder_ == null) {
        modleahleaf_ = null;
      } else {
        modleahleaf_ = null;
        modleahleafBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLGFEEPKLA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLGFEEPKLA getDefaultInstanceForType() {
      return POGOProtos.Rpc.BNLGFEEPKLA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLGFEEPKLA build() {
      POGOProtos.Rpc.BNLGFEEPKLA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLGFEEPKLA buildPartial() {
      POGOProtos.Rpc.BNLGFEEPKLA result = new POGOProtos.Rpc.BNLGFEEPKLA(this);
      result.klnnkffpidb_ = klnnkffpidb_;
      if (modleahleafBuilder_ == null) {
        result.modleahleaf_ = modleahleaf_;
      } else {
        result.modleahleaf_ = modleahleafBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BNLGFEEPKLA) {
        return mergeFrom((POGOProtos.Rpc.BNLGFEEPKLA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BNLGFEEPKLA other) {
      if (other == POGOProtos.Rpc.BNLGFEEPKLA.getDefaultInstance()) return this;
      if (other.getKlnnkffpidb() != false) {
        setKlnnkffpidb(other.getKlnnkffpidb());
      }
      if (other.hasModleahleaf()) {
        mergeModleahleaf(other.getModleahleaf());
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
      POGOProtos.Rpc.BNLGFEEPKLA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BNLGFEEPKLA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean klnnkffpidb_ ;
    /**
     * <code>bool klnnkffpidb = 1;</code>
     * @return The klnnkffpidb.
     */
    @java.lang.Override
    public boolean getKlnnkffpidb() {
      return klnnkffpidb_;
    }
    /**
     * <code>bool klnnkffpidb = 1;</code>
     * @param value The klnnkffpidb to set.
     * @return This builder for chaining.
     */
    public Builder setKlnnkffpidb(boolean value) {
      
      klnnkffpidb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool klnnkffpidb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKlnnkffpidb() {
      
      klnnkffpidb_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.COOOEKOJFAO modleahleaf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder> modleahleafBuilder_;
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     * @return Whether the modleahleaf field is set.
     */
    public boolean hasModleahleaf() {
      return modleahleafBuilder_ != null || modleahleaf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     * @return The modleahleaf.
     */
    public POGOProtos.Rpc.COOOEKOJFAO getModleahleaf() {
      if (modleahleafBuilder_ == null) {
        return modleahleaf_ == null ? POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
      } else {
        return modleahleafBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder setModleahleaf(POGOProtos.Rpc.COOOEKOJFAO value) {
      if (modleahleafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modleahleaf_ = value;
        onChanged();
      } else {
        modleahleafBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder setModleahleaf(
        POGOProtos.Rpc.COOOEKOJFAO.Builder builderForValue) {
      if (modleahleafBuilder_ == null) {
        modleahleaf_ = builderForValue.build();
        onChanged();
      } else {
        modleahleafBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder mergeModleahleaf(POGOProtos.Rpc.COOOEKOJFAO value) {
      if (modleahleafBuilder_ == null) {
        if (modleahleaf_ != null) {
          modleahleaf_ =
            POGOProtos.Rpc.COOOEKOJFAO.newBuilder(modleahleaf_).mergeFrom(value).buildPartial();
        } else {
          modleahleaf_ = value;
        }
        onChanged();
      } else {
        modleahleafBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder clearModleahleaf() {
      if (modleahleafBuilder_ == null) {
        modleahleaf_ = null;
        onChanged();
      } else {
        modleahleaf_ = null;
        modleahleafBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public POGOProtos.Rpc.COOOEKOJFAO.Builder getModleahleafBuilder() {
      
      onChanged();
      return getModleahleafFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public POGOProtos.Rpc.COOOEKOJFAOOrBuilder getModleahleafOrBuilder() {
      if (modleahleafBuilder_ != null) {
        return modleahleafBuilder_.getMessageOrBuilder();
      } else {
        return modleahleaf_ == null ?
            POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder> 
        getModleahleafFieldBuilder() {
      if (modleahleafBuilder_ == null) {
        modleahleafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder>(
                getModleahleaf(),
                getParentForChildren(),
                isClean());
        modleahleaf_ = null;
      }
      return modleahleafBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BNLGFEEPKLA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BNLGFEEPKLA)
  private static final POGOProtos.Rpc.BNLGFEEPKLA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BNLGFEEPKLA();
  }

  public static POGOProtos.Rpc.BNLGFEEPKLA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BNLGFEEPKLA>
      PARSER = new com.google.protobuf.AbstractParser<BNLGFEEPKLA>() {
    @java.lang.Override
    public BNLGFEEPKLA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BNLGFEEPKLA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BNLGFEEPKLA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BNLGFEEPKLA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BNLGFEEPKLA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

