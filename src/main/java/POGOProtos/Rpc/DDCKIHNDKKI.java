// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DDCKIHNDKKI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DDCKIHNDKKI}
 */
public final class DDCKIHNDKKI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DDCKIHNDKKI)
    DDCKIHNDKKIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DDCKIHNDKKI.newBuilder() to construct.
  private DDCKIHNDKKI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DDCKIHNDKKI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DDCKIHNDKKI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DDCKIHNDKKI(
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
          case 13: {

            jfodocieapm_ = input.readFloat();
            break;
          }
          case 21: {

            jaheadhhhhm_ = input.readFloat();
            break;
          }
          case 29: {

            pcmoffglldm_ = input.readFloat();
            break;
          }
          case 37: {

            lemgkffapog_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DDCKIHNDKKI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DDCKIHNDKKI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DDCKIHNDKKI.class, POGOProtos.Rpc.DDCKIHNDKKI.Builder.class);
  }

  public static final int JFODOCIEAPM_FIELD_NUMBER = 1;
  private float jfodocieapm_;
  /**
   * <code>float jfodocieapm = 1;</code>
   * @return The jfodocieapm.
   */
  @java.lang.Override
  public float getJfodocieapm() {
    return jfodocieapm_;
  }

  public static final int JAHEADHHHHM_FIELD_NUMBER = 2;
  private float jaheadhhhhm_;
  /**
   * <code>float jaheadhhhhm = 2;</code>
   * @return The jaheadhhhhm.
   */
  @java.lang.Override
  public float getJaheadhhhhm() {
    return jaheadhhhhm_;
  }

  public static final int PCMOFFGLLDM_FIELD_NUMBER = 3;
  private float pcmoffglldm_;
  /**
   * <code>float pcmoffglldm = 3;</code>
   * @return The pcmoffglldm.
   */
  @java.lang.Override
  public float getPcmoffglldm() {
    return pcmoffglldm_;
  }

  public static final int LEMGKFFAPOG_FIELD_NUMBER = 4;
  private float lemgkffapog_;
  /**
   * <code>float lemgkffapog = 4;</code>
   * @return The lemgkffapog.
   */
  @java.lang.Override
  public float getLemgkffapog() {
    return lemgkffapog_;
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
    if (jfodocieapm_ != 0F) {
      output.writeFloat(1, jfodocieapm_);
    }
    if (jaheadhhhhm_ != 0F) {
      output.writeFloat(2, jaheadhhhhm_);
    }
    if (pcmoffglldm_ != 0F) {
      output.writeFloat(3, pcmoffglldm_);
    }
    if (lemgkffapog_ != 0F) {
      output.writeFloat(4, lemgkffapog_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jfodocieapm_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, jfodocieapm_);
    }
    if (jaheadhhhhm_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, jaheadhhhhm_);
    }
    if (pcmoffglldm_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, pcmoffglldm_);
    }
    if (lemgkffapog_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, lemgkffapog_);
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
    if (!(obj instanceof POGOProtos.Rpc.DDCKIHNDKKI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DDCKIHNDKKI other = (POGOProtos.Rpc.DDCKIHNDKKI) obj;

    if (java.lang.Float.floatToIntBits(getJfodocieapm())
        != java.lang.Float.floatToIntBits(
            other.getJfodocieapm())) return false;
    if (java.lang.Float.floatToIntBits(getJaheadhhhhm())
        != java.lang.Float.floatToIntBits(
            other.getJaheadhhhhm())) return false;
    if (java.lang.Float.floatToIntBits(getPcmoffglldm())
        != java.lang.Float.floatToIntBits(
            other.getPcmoffglldm())) return false;
    if (java.lang.Float.floatToIntBits(getLemgkffapog())
        != java.lang.Float.floatToIntBits(
            other.getLemgkffapog())) return false;
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
    hash = (37 * hash) + JFODOCIEAPM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getJfodocieapm());
    hash = (37 * hash) + JAHEADHHHHM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getJaheadhhhhm());
    hash = (37 * hash) + PCMOFFGLLDM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPcmoffglldm());
    hash = (37 * hash) + LEMGKFFAPOG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLemgkffapog());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DDCKIHNDKKI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DDCKIHNDKKI prototype) {
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
   * ref: DDCKIHNDKKI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DDCKIHNDKKI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DDCKIHNDKKI)
      POGOProtos.Rpc.DDCKIHNDKKIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DDCKIHNDKKI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DDCKIHNDKKI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DDCKIHNDKKI.class, POGOProtos.Rpc.DDCKIHNDKKI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DDCKIHNDKKI.newBuilder()
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
      jfodocieapm_ = 0F;

      jaheadhhhhm_ = 0F;

      pcmoffglldm_ = 0F;

      lemgkffapog_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DDCKIHNDKKI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DDCKIHNDKKI getDefaultInstanceForType() {
      return POGOProtos.Rpc.DDCKIHNDKKI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DDCKIHNDKKI build() {
      POGOProtos.Rpc.DDCKIHNDKKI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DDCKIHNDKKI buildPartial() {
      POGOProtos.Rpc.DDCKIHNDKKI result = new POGOProtos.Rpc.DDCKIHNDKKI(this);
      result.jfodocieapm_ = jfodocieapm_;
      result.jaheadhhhhm_ = jaheadhhhhm_;
      result.pcmoffglldm_ = pcmoffglldm_;
      result.lemgkffapog_ = lemgkffapog_;
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
      if (other instanceof POGOProtos.Rpc.DDCKIHNDKKI) {
        return mergeFrom((POGOProtos.Rpc.DDCKIHNDKKI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DDCKIHNDKKI other) {
      if (other == POGOProtos.Rpc.DDCKIHNDKKI.getDefaultInstance()) return this;
      if (other.getJfodocieapm() != 0F) {
        setJfodocieapm(other.getJfodocieapm());
      }
      if (other.getJaheadhhhhm() != 0F) {
        setJaheadhhhhm(other.getJaheadhhhhm());
      }
      if (other.getPcmoffglldm() != 0F) {
        setPcmoffglldm(other.getPcmoffglldm());
      }
      if (other.getLemgkffapog() != 0F) {
        setLemgkffapog(other.getLemgkffapog());
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
      POGOProtos.Rpc.DDCKIHNDKKI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DDCKIHNDKKI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float jfodocieapm_ ;
    /**
     * <code>float jfodocieapm = 1;</code>
     * @return The jfodocieapm.
     */
    @java.lang.Override
    public float getJfodocieapm() {
      return jfodocieapm_;
    }
    /**
     * <code>float jfodocieapm = 1;</code>
     * @param value The jfodocieapm to set.
     * @return This builder for chaining.
     */
    public Builder setJfodocieapm(float value) {
      
      jfodocieapm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float jfodocieapm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfodocieapm() {
      
      jfodocieapm_ = 0F;
      onChanged();
      return this;
    }

    private float jaheadhhhhm_ ;
    /**
     * <code>float jaheadhhhhm = 2;</code>
     * @return The jaheadhhhhm.
     */
    @java.lang.Override
    public float getJaheadhhhhm() {
      return jaheadhhhhm_;
    }
    /**
     * <code>float jaheadhhhhm = 2;</code>
     * @param value The jaheadhhhhm to set.
     * @return This builder for chaining.
     */
    public Builder setJaheadhhhhm(float value) {
      
      jaheadhhhhm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float jaheadhhhhm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJaheadhhhhm() {
      
      jaheadhhhhm_ = 0F;
      onChanged();
      return this;
    }

    private float pcmoffglldm_ ;
    /**
     * <code>float pcmoffglldm = 3;</code>
     * @return The pcmoffglldm.
     */
    @java.lang.Override
    public float getPcmoffglldm() {
      return pcmoffglldm_;
    }
    /**
     * <code>float pcmoffglldm = 3;</code>
     * @param value The pcmoffglldm to set.
     * @return This builder for chaining.
     */
    public Builder setPcmoffglldm(float value) {
      
      pcmoffglldm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float pcmoffglldm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPcmoffglldm() {
      
      pcmoffglldm_ = 0F;
      onChanged();
      return this;
    }

    private float lemgkffapog_ ;
    /**
     * <code>float lemgkffapog = 4;</code>
     * @return The lemgkffapog.
     */
    @java.lang.Override
    public float getLemgkffapog() {
      return lemgkffapog_;
    }
    /**
     * <code>float lemgkffapog = 4;</code>
     * @param value The lemgkffapog to set.
     * @return This builder for chaining.
     */
    public Builder setLemgkffapog(float value) {
      
      lemgkffapog_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float lemgkffapog = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLemgkffapog() {
      
      lemgkffapog_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DDCKIHNDKKI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DDCKIHNDKKI)
  private static final POGOProtos.Rpc.DDCKIHNDKKI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DDCKIHNDKKI();
  }

  public static POGOProtos.Rpc.DDCKIHNDKKI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DDCKIHNDKKI>
      PARSER = new com.google.protobuf.AbstractParser<DDCKIHNDKKI>() {
    @java.lang.Override
    public DDCKIHNDKKI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DDCKIHNDKKI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DDCKIHNDKKI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DDCKIHNDKKI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DDCKIHNDKKI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

