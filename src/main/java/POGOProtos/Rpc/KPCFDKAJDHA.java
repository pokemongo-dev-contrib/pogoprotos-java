// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KPCFDKAJDHA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KPCFDKAJDHA}
 */
public final class KPCFDKAJDHA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KPCFDKAJDHA)
    KPCFDKAJDHAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KPCFDKAJDHA.newBuilder() to construct.
  private KPCFDKAJDHA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KPCFDKAJDHA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KPCFDKAJDHA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KPCFDKAJDHA(
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

            epikelgoclb_ = input.readBool();
            break;
          }
          case 16: {

            jklkchlilbm_ = input.readInt32();
            break;
          }
          case 24: {

            ejcglobjjgl_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPCFDKAJDHA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPCFDKAJDHA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KPCFDKAJDHA.class, POGOProtos.Rpc.KPCFDKAJDHA.Builder.class);
  }

  public static final int EPIKELGOCLB_FIELD_NUMBER = 1;
  private boolean epikelgoclb_;
  /**
   * <code>bool epikelgoclb = 1;</code>
   * @return The epikelgoclb.
   */
  @java.lang.Override
  public boolean getEpikelgoclb() {
    return epikelgoclb_;
  }

  public static final int JKLKCHLILBM_FIELD_NUMBER = 2;
  private int jklkchlilbm_;
  /**
   * <code>int32 jklkchlilbm = 2;</code>
   * @return The jklkchlilbm.
   */
  @java.lang.Override
  public int getJklkchlilbm() {
    return jklkchlilbm_;
  }

  public static final int EJCGLOBJJGL_FIELD_NUMBER = 3;
  private boolean ejcglobjjgl_;
  /**
   * <code>bool ejcglobjjgl = 3;</code>
   * @return The ejcglobjjgl.
   */
  @java.lang.Override
  public boolean getEjcglobjjgl() {
    return ejcglobjjgl_;
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
    if (epikelgoclb_ != false) {
      output.writeBool(1, epikelgoclb_);
    }
    if (jklkchlilbm_ != 0) {
      output.writeInt32(2, jklkchlilbm_);
    }
    if (ejcglobjjgl_ != false) {
      output.writeBool(3, ejcglobjjgl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epikelgoclb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, epikelgoclb_);
    }
    if (jklkchlilbm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, jklkchlilbm_);
    }
    if (ejcglobjjgl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, ejcglobjjgl_);
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
    if (!(obj instanceof POGOProtos.Rpc.KPCFDKAJDHA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KPCFDKAJDHA other = (POGOProtos.Rpc.KPCFDKAJDHA) obj;

    if (getEpikelgoclb()
        != other.getEpikelgoclb()) return false;
    if (getJklkchlilbm()
        != other.getJklkchlilbm()) return false;
    if (getEjcglobjjgl()
        != other.getEjcglobjjgl()) return false;
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
    hash = (37 * hash) + EPIKELGOCLB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEpikelgoclb());
    hash = (37 * hash) + JKLKCHLILBM_FIELD_NUMBER;
    hash = (53 * hash) + getJklkchlilbm();
    hash = (37 * hash) + EJCGLOBJJGL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEjcglobjjgl());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPCFDKAJDHA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KPCFDKAJDHA prototype) {
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
   * ref: KPCFDKAJDHA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KPCFDKAJDHA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KPCFDKAJDHA)
      POGOProtos.Rpc.KPCFDKAJDHAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPCFDKAJDHA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPCFDKAJDHA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KPCFDKAJDHA.class, POGOProtos.Rpc.KPCFDKAJDHA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KPCFDKAJDHA.newBuilder()
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
      epikelgoclb_ = false;

      jklkchlilbm_ = 0;

      ejcglobjjgl_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPCFDKAJDHA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPCFDKAJDHA getDefaultInstanceForType() {
      return POGOProtos.Rpc.KPCFDKAJDHA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPCFDKAJDHA build() {
      POGOProtos.Rpc.KPCFDKAJDHA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPCFDKAJDHA buildPartial() {
      POGOProtos.Rpc.KPCFDKAJDHA result = new POGOProtos.Rpc.KPCFDKAJDHA(this);
      result.epikelgoclb_ = epikelgoclb_;
      result.jklkchlilbm_ = jklkchlilbm_;
      result.ejcglobjjgl_ = ejcglobjjgl_;
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
      if (other instanceof POGOProtos.Rpc.KPCFDKAJDHA) {
        return mergeFrom((POGOProtos.Rpc.KPCFDKAJDHA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KPCFDKAJDHA other) {
      if (other == POGOProtos.Rpc.KPCFDKAJDHA.getDefaultInstance()) return this;
      if (other.getEpikelgoclb() != false) {
        setEpikelgoclb(other.getEpikelgoclb());
      }
      if (other.getJklkchlilbm() != 0) {
        setJklkchlilbm(other.getJklkchlilbm());
      }
      if (other.getEjcglobjjgl() != false) {
        setEjcglobjjgl(other.getEjcglobjjgl());
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
      POGOProtos.Rpc.KPCFDKAJDHA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KPCFDKAJDHA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean epikelgoclb_ ;
    /**
     * <code>bool epikelgoclb = 1;</code>
     * @return The epikelgoclb.
     */
    @java.lang.Override
    public boolean getEpikelgoclb() {
      return epikelgoclb_;
    }
    /**
     * <code>bool epikelgoclb = 1;</code>
     * @param value The epikelgoclb to set.
     * @return This builder for chaining.
     */
    public Builder setEpikelgoclb(boolean value) {
      
      epikelgoclb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool epikelgoclb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpikelgoclb() {
      
      epikelgoclb_ = false;
      onChanged();
      return this;
    }

    private int jklkchlilbm_ ;
    /**
     * <code>int32 jklkchlilbm = 2;</code>
     * @return The jklkchlilbm.
     */
    @java.lang.Override
    public int getJklkchlilbm() {
      return jklkchlilbm_;
    }
    /**
     * <code>int32 jklkchlilbm = 2;</code>
     * @param value The jklkchlilbm to set.
     * @return This builder for chaining.
     */
    public Builder setJklkchlilbm(int value) {
      
      jklkchlilbm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jklkchlilbm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJklkchlilbm() {
      
      jklkchlilbm_ = 0;
      onChanged();
      return this;
    }

    private boolean ejcglobjjgl_ ;
    /**
     * <code>bool ejcglobjjgl = 3;</code>
     * @return The ejcglobjjgl.
     */
    @java.lang.Override
    public boolean getEjcglobjjgl() {
      return ejcglobjjgl_;
    }
    /**
     * <code>bool ejcglobjjgl = 3;</code>
     * @param value The ejcglobjjgl to set.
     * @return This builder for chaining.
     */
    public Builder setEjcglobjjgl(boolean value) {
      
      ejcglobjjgl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ejcglobjjgl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEjcglobjjgl() {
      
      ejcglobjjgl_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KPCFDKAJDHA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KPCFDKAJDHA)
  private static final POGOProtos.Rpc.KPCFDKAJDHA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KPCFDKAJDHA();
  }

  public static POGOProtos.Rpc.KPCFDKAJDHA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KPCFDKAJDHA>
      PARSER = new com.google.protobuf.AbstractParser<KPCFDKAJDHA>() {
    @java.lang.Override
    public KPCFDKAJDHA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KPCFDKAJDHA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KPCFDKAJDHA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KPCFDKAJDHA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KPCFDKAJDHA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

