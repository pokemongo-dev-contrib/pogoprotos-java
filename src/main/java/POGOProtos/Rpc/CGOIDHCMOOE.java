// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CGOIDHCMOOE}
 */
public  final class CGOIDHCMOOE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CGOIDHCMOOE)
    CGOIDHCMOOEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CGOIDHCMOOE.newBuilder() to construct.
  private CGOIDHCMOOE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CGOIDHCMOOE() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CGOIDHCMOOE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CGOIDHCMOOE(
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

            omghnjpeepe_ = input.readBool();
            break;
          }
          case 16: {

            jojkmbfdngm_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGOIDHCMOOE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGOIDHCMOOE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CGOIDHCMOOE.class, POGOProtos.Rpc.CGOIDHCMOOE.Builder.class);
  }

  public static final int OMGHNJPEEPE_FIELD_NUMBER = 1;
  private boolean omghnjpeepe_;
  /**
   * <code>bool omghnjpeepe = 1;</code>
   * @return The omghnjpeepe.
   */
  public boolean getOmghnjpeepe() {
    return omghnjpeepe_;
  }

  public static final int JOJKMBFDNGM_FIELD_NUMBER = 2;
  private boolean jojkmbfdngm_;
  /**
   * <code>bool jojkmbfdngm = 2;</code>
   * @return The jojkmbfdngm.
   */
  public boolean getJojkmbfdngm() {
    return jojkmbfdngm_;
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
    if (omghnjpeepe_ != false) {
      output.writeBool(1, omghnjpeepe_);
    }
    if (jojkmbfdngm_ != false) {
      output.writeBool(2, jojkmbfdngm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (omghnjpeepe_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, omghnjpeepe_);
    }
    if (jojkmbfdngm_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, jojkmbfdngm_);
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
    if (!(obj instanceof POGOProtos.Rpc.CGOIDHCMOOE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CGOIDHCMOOE other = (POGOProtos.Rpc.CGOIDHCMOOE) obj;

    if (getOmghnjpeepe()
        != other.getOmghnjpeepe()) return false;
    if (getJojkmbfdngm()
        != other.getJojkmbfdngm()) return false;
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
    hash = (37 * hash) + OMGHNJPEEPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOmghnjpeepe());
    hash = (37 * hash) + JOJKMBFDNGM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJojkmbfdngm());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGOIDHCMOOE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CGOIDHCMOOE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CGOIDHCMOOE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CGOIDHCMOOE)
      POGOProtos.Rpc.CGOIDHCMOOEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGOIDHCMOOE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGOIDHCMOOE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CGOIDHCMOOE.class, POGOProtos.Rpc.CGOIDHCMOOE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CGOIDHCMOOE.newBuilder()
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
      omghnjpeepe_ = false;

      jojkmbfdngm_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGOIDHCMOOE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGOIDHCMOOE getDefaultInstanceForType() {
      return POGOProtos.Rpc.CGOIDHCMOOE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGOIDHCMOOE build() {
      POGOProtos.Rpc.CGOIDHCMOOE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGOIDHCMOOE buildPartial() {
      POGOProtos.Rpc.CGOIDHCMOOE result = new POGOProtos.Rpc.CGOIDHCMOOE(this);
      result.omghnjpeepe_ = omghnjpeepe_;
      result.jojkmbfdngm_ = jojkmbfdngm_;
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
      if (other instanceof POGOProtos.Rpc.CGOIDHCMOOE) {
        return mergeFrom((POGOProtos.Rpc.CGOIDHCMOOE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CGOIDHCMOOE other) {
      if (other == POGOProtos.Rpc.CGOIDHCMOOE.getDefaultInstance()) return this;
      if (other.getOmghnjpeepe() != false) {
        setOmghnjpeepe(other.getOmghnjpeepe());
      }
      if (other.getJojkmbfdngm() != false) {
        setJojkmbfdngm(other.getJojkmbfdngm());
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
      POGOProtos.Rpc.CGOIDHCMOOE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CGOIDHCMOOE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean omghnjpeepe_ ;
    /**
     * <code>bool omghnjpeepe = 1;</code>
     * @return The omghnjpeepe.
     */
    public boolean getOmghnjpeepe() {
      return omghnjpeepe_;
    }
    /**
     * <code>bool omghnjpeepe = 1;</code>
     * @param value The omghnjpeepe to set.
     * @return This builder for chaining.
     */
    public Builder setOmghnjpeepe(boolean value) {
      
      omghnjpeepe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool omghnjpeepe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOmghnjpeepe() {
      
      omghnjpeepe_ = false;
      onChanged();
      return this;
    }

    private boolean jojkmbfdngm_ ;
    /**
     * <code>bool jojkmbfdngm = 2;</code>
     * @return The jojkmbfdngm.
     */
    public boolean getJojkmbfdngm() {
      return jojkmbfdngm_;
    }
    /**
     * <code>bool jojkmbfdngm = 2;</code>
     * @param value The jojkmbfdngm to set.
     * @return This builder for chaining.
     */
    public Builder setJojkmbfdngm(boolean value) {
      
      jojkmbfdngm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jojkmbfdngm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJojkmbfdngm() {
      
      jojkmbfdngm_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CGOIDHCMOOE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CGOIDHCMOOE)
  private static final POGOProtos.Rpc.CGOIDHCMOOE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CGOIDHCMOOE();
  }

  public static POGOProtos.Rpc.CGOIDHCMOOE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CGOIDHCMOOE>
      PARSER = new com.google.protobuf.AbstractParser<CGOIDHCMOOE>() {
    @java.lang.Override
    public CGOIDHCMOOE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CGOIDHCMOOE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CGOIDHCMOOE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CGOIDHCMOOE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CGOIDHCMOOE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

