// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GJIKGFOPDFE}
 */
public  final class GJIKGFOPDFE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GJIKGFOPDFE)
    GJIKGFOPDFEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GJIKGFOPDFE.newBuilder() to construct.
  private GJIKGFOPDFE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GJIKGFOPDFE() {
    feoapcpmbho_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GJIKGFOPDFE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GJIKGFOPDFE(
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

            jkafebjidoh_ = input.readBool();
            break;
          }
          case 16: {

            pacbbkfgphp_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            feoapcpmbho_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJIKGFOPDFE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJIKGFOPDFE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GJIKGFOPDFE.class, POGOProtos.Rpc.GJIKGFOPDFE.Builder.class);
  }

  public static final int JKAFEBJIDOH_FIELD_NUMBER = 1;
  private boolean jkafebjidoh_;
  /**
   * <code>bool jkafebjidoh = 1;</code>
   * @return The jkafebjidoh.
   */
  public boolean getJkafebjidoh() {
    return jkafebjidoh_;
  }

  public static final int PACBBKFGPHP_FIELD_NUMBER = 2;
  private boolean pacbbkfgphp_;
  /**
   * <code>bool pacbbkfgphp = 2;</code>
   * @return The pacbbkfgphp.
   */
  public boolean getPacbbkfgphp() {
    return pacbbkfgphp_;
  }

  public static final int FEOAPCPMBHO_FIELD_NUMBER = 3;
  private volatile java.lang.Object feoapcpmbho_;
  /**
   * <code>string feoapcpmbho = 3;</code>
   * @return The feoapcpmbho.
   */
  public java.lang.String getFeoapcpmbho() {
    java.lang.Object ref = feoapcpmbho_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feoapcpmbho_ = s;
      return s;
    }
  }
  /**
   * <code>string feoapcpmbho = 3;</code>
   * @return The bytes for feoapcpmbho.
   */
  public com.google.protobuf.ByteString
      getFeoapcpmbhoBytes() {
    java.lang.Object ref = feoapcpmbho_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feoapcpmbho_ = b;
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
    if (jkafebjidoh_ != false) {
      output.writeBool(1, jkafebjidoh_);
    }
    if (pacbbkfgphp_ != false) {
      output.writeBool(2, pacbbkfgphp_);
    }
    if (!getFeoapcpmbhoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, feoapcpmbho_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jkafebjidoh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, jkafebjidoh_);
    }
    if (pacbbkfgphp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, pacbbkfgphp_);
    }
    if (!getFeoapcpmbhoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, feoapcpmbho_);
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
    if (!(obj instanceof POGOProtos.Rpc.GJIKGFOPDFE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GJIKGFOPDFE other = (POGOProtos.Rpc.GJIKGFOPDFE) obj;

    if (getJkafebjidoh()
        != other.getJkafebjidoh()) return false;
    if (getPacbbkfgphp()
        != other.getPacbbkfgphp()) return false;
    if (!getFeoapcpmbho()
        .equals(other.getFeoapcpmbho())) return false;
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
    hash = (37 * hash) + JKAFEBJIDOH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJkafebjidoh());
    hash = (37 * hash) + PACBBKFGPHP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPacbbkfgphp());
    hash = (37 * hash) + FEOAPCPMBHO_FIELD_NUMBER;
    hash = (53 * hash) + getFeoapcpmbho().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJIKGFOPDFE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GJIKGFOPDFE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GJIKGFOPDFE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GJIKGFOPDFE)
      POGOProtos.Rpc.GJIKGFOPDFEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJIKGFOPDFE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJIKGFOPDFE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GJIKGFOPDFE.class, POGOProtos.Rpc.GJIKGFOPDFE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GJIKGFOPDFE.newBuilder()
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
      jkafebjidoh_ = false;

      pacbbkfgphp_ = false;

      feoapcpmbho_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJIKGFOPDFE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJIKGFOPDFE getDefaultInstanceForType() {
      return POGOProtos.Rpc.GJIKGFOPDFE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJIKGFOPDFE build() {
      POGOProtos.Rpc.GJIKGFOPDFE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJIKGFOPDFE buildPartial() {
      POGOProtos.Rpc.GJIKGFOPDFE result = new POGOProtos.Rpc.GJIKGFOPDFE(this);
      result.jkafebjidoh_ = jkafebjidoh_;
      result.pacbbkfgphp_ = pacbbkfgphp_;
      result.feoapcpmbho_ = feoapcpmbho_;
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
      if (other instanceof POGOProtos.Rpc.GJIKGFOPDFE) {
        return mergeFrom((POGOProtos.Rpc.GJIKGFOPDFE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GJIKGFOPDFE other) {
      if (other == POGOProtos.Rpc.GJIKGFOPDFE.getDefaultInstance()) return this;
      if (other.getJkafebjidoh() != false) {
        setJkafebjidoh(other.getJkafebjidoh());
      }
      if (other.getPacbbkfgphp() != false) {
        setPacbbkfgphp(other.getPacbbkfgphp());
      }
      if (!other.getFeoapcpmbho().isEmpty()) {
        feoapcpmbho_ = other.feoapcpmbho_;
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
      POGOProtos.Rpc.GJIKGFOPDFE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GJIKGFOPDFE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean jkafebjidoh_ ;
    /**
     * <code>bool jkafebjidoh = 1;</code>
     * @return The jkafebjidoh.
     */
    public boolean getJkafebjidoh() {
      return jkafebjidoh_;
    }
    /**
     * <code>bool jkafebjidoh = 1;</code>
     * @param value The jkafebjidoh to set.
     * @return This builder for chaining.
     */
    public Builder setJkafebjidoh(boolean value) {
      
      jkafebjidoh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jkafebjidoh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkafebjidoh() {
      
      jkafebjidoh_ = false;
      onChanged();
      return this;
    }

    private boolean pacbbkfgphp_ ;
    /**
     * <code>bool pacbbkfgphp = 2;</code>
     * @return The pacbbkfgphp.
     */
    public boolean getPacbbkfgphp() {
      return pacbbkfgphp_;
    }
    /**
     * <code>bool pacbbkfgphp = 2;</code>
     * @param value The pacbbkfgphp to set.
     * @return This builder for chaining.
     */
    public Builder setPacbbkfgphp(boolean value) {
      
      pacbbkfgphp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pacbbkfgphp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPacbbkfgphp() {
      
      pacbbkfgphp_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object feoapcpmbho_ = "";
    /**
     * <code>string feoapcpmbho = 3;</code>
     * @return The feoapcpmbho.
     */
    public java.lang.String getFeoapcpmbho() {
      java.lang.Object ref = feoapcpmbho_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feoapcpmbho_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string feoapcpmbho = 3;</code>
     * @return The bytes for feoapcpmbho.
     */
    public com.google.protobuf.ByteString
        getFeoapcpmbhoBytes() {
      java.lang.Object ref = feoapcpmbho_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feoapcpmbho_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string feoapcpmbho = 3;</code>
     * @param value The feoapcpmbho to set.
     * @return This builder for chaining.
     */
    public Builder setFeoapcpmbho(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      feoapcpmbho_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string feoapcpmbho = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeoapcpmbho() {
      
      feoapcpmbho_ = getDefaultInstance().getFeoapcpmbho();
      onChanged();
      return this;
    }
    /**
     * <code>string feoapcpmbho = 3;</code>
     * @param value The bytes for feoapcpmbho to set.
     * @return This builder for chaining.
     */
    public Builder setFeoapcpmbhoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      feoapcpmbho_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GJIKGFOPDFE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GJIKGFOPDFE)
  private static final POGOProtos.Rpc.GJIKGFOPDFE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GJIKGFOPDFE();
  }

  public static POGOProtos.Rpc.GJIKGFOPDFE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GJIKGFOPDFE>
      PARSER = new com.google.protobuf.AbstractParser<GJIKGFOPDFE>() {
    @java.lang.Override
    public GJIKGFOPDFE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GJIKGFOPDFE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GJIKGFOPDFE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GJIKGFOPDFE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GJIKGFOPDFE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

