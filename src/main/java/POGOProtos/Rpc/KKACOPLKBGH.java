// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.KKACOPLKBGH}
 */
public  final class KKACOPLKBGH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KKACOPLKBGH)
    KKACOPLKBGHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KKACOPLKBGH.newBuilder() to construct.
  private KKACOPLKBGH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KKACOPLKBGH() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KKACOPLKBGH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KKACOPLKBGH(
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

            khmjipgfpml_ = input.readFloat();
            break;
          }
          case 21: {

            glpogjecdgj_ = input.readFloat();
            break;
          }
          case 24: {

            mmlchobhdip_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKACOPLKBGH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKACOPLKBGH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KKACOPLKBGH.class, POGOProtos.Rpc.KKACOPLKBGH.Builder.class);
  }

  public static final int KHMJIPGFPML_FIELD_NUMBER = 1;
  private float khmjipgfpml_;
  /**
   * <code>float khmjipgfpml = 1;</code>
   * @return The khmjipgfpml.
   */
  public float getKhmjipgfpml() {
    return khmjipgfpml_;
  }

  public static final int GLPOGJECDGJ_FIELD_NUMBER = 2;
  private float glpogjecdgj_;
  /**
   * <code>float glpogjecdgj = 2;</code>
   * @return The glpogjecdgj.
   */
  public float getGlpogjecdgj() {
    return glpogjecdgj_;
  }

  public static final int MMLCHOBHDIP_FIELD_NUMBER = 3;
  private boolean mmlchobhdip_;
  /**
   * <code>bool mmlchobhdip = 3;</code>
   * @return The mmlchobhdip.
   */
  public boolean getMmlchobhdip() {
    return mmlchobhdip_;
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
    if (khmjipgfpml_ != 0F) {
      output.writeFloat(1, khmjipgfpml_);
    }
    if (glpogjecdgj_ != 0F) {
      output.writeFloat(2, glpogjecdgj_);
    }
    if (mmlchobhdip_ != false) {
      output.writeBool(3, mmlchobhdip_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (khmjipgfpml_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, khmjipgfpml_);
    }
    if (glpogjecdgj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, glpogjecdgj_);
    }
    if (mmlchobhdip_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, mmlchobhdip_);
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
    if (!(obj instanceof POGOProtos.Rpc.KKACOPLKBGH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KKACOPLKBGH other = (POGOProtos.Rpc.KKACOPLKBGH) obj;

    if (java.lang.Float.floatToIntBits(getKhmjipgfpml())
        != java.lang.Float.floatToIntBits(
            other.getKhmjipgfpml())) return false;
    if (java.lang.Float.floatToIntBits(getGlpogjecdgj())
        != java.lang.Float.floatToIntBits(
            other.getGlpogjecdgj())) return false;
    if (getMmlchobhdip()
        != other.getMmlchobhdip()) return false;
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
    hash = (37 * hash) + KHMJIPGFPML_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getKhmjipgfpml());
    hash = (37 * hash) + GLPOGJECDGJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGlpogjecdgj());
    hash = (37 * hash) + MMLCHOBHDIP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMmlchobhdip());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KKACOPLKBGH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KKACOPLKBGH prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.KKACOPLKBGH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KKACOPLKBGH)
      POGOProtos.Rpc.KKACOPLKBGHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKACOPLKBGH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKACOPLKBGH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KKACOPLKBGH.class, POGOProtos.Rpc.KKACOPLKBGH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KKACOPLKBGH.newBuilder()
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
      khmjipgfpml_ = 0F;

      glpogjecdgj_ = 0F;

      mmlchobhdip_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KKACOPLKBGH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKACOPLKBGH getDefaultInstanceForType() {
      return POGOProtos.Rpc.KKACOPLKBGH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKACOPLKBGH build() {
      POGOProtos.Rpc.KKACOPLKBGH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KKACOPLKBGH buildPartial() {
      POGOProtos.Rpc.KKACOPLKBGH result = new POGOProtos.Rpc.KKACOPLKBGH(this);
      result.khmjipgfpml_ = khmjipgfpml_;
      result.glpogjecdgj_ = glpogjecdgj_;
      result.mmlchobhdip_ = mmlchobhdip_;
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
      if (other instanceof POGOProtos.Rpc.KKACOPLKBGH) {
        return mergeFrom((POGOProtos.Rpc.KKACOPLKBGH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KKACOPLKBGH other) {
      if (other == POGOProtos.Rpc.KKACOPLKBGH.getDefaultInstance()) return this;
      if (other.getKhmjipgfpml() != 0F) {
        setKhmjipgfpml(other.getKhmjipgfpml());
      }
      if (other.getGlpogjecdgj() != 0F) {
        setGlpogjecdgj(other.getGlpogjecdgj());
      }
      if (other.getMmlchobhdip() != false) {
        setMmlchobhdip(other.getMmlchobhdip());
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
      POGOProtos.Rpc.KKACOPLKBGH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KKACOPLKBGH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float khmjipgfpml_ ;
    /**
     * <code>float khmjipgfpml = 1;</code>
     * @return The khmjipgfpml.
     */
    public float getKhmjipgfpml() {
      return khmjipgfpml_;
    }
    /**
     * <code>float khmjipgfpml = 1;</code>
     * @param value The khmjipgfpml to set.
     * @return This builder for chaining.
     */
    public Builder setKhmjipgfpml(float value) {
      
      khmjipgfpml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float khmjipgfpml = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKhmjipgfpml() {
      
      khmjipgfpml_ = 0F;
      onChanged();
      return this;
    }

    private float glpogjecdgj_ ;
    /**
     * <code>float glpogjecdgj = 2;</code>
     * @return The glpogjecdgj.
     */
    public float getGlpogjecdgj() {
      return glpogjecdgj_;
    }
    /**
     * <code>float glpogjecdgj = 2;</code>
     * @param value The glpogjecdgj to set.
     * @return This builder for chaining.
     */
    public Builder setGlpogjecdgj(float value) {
      
      glpogjecdgj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float glpogjecdgj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlpogjecdgj() {
      
      glpogjecdgj_ = 0F;
      onChanged();
      return this;
    }

    private boolean mmlchobhdip_ ;
    /**
     * <code>bool mmlchobhdip = 3;</code>
     * @return The mmlchobhdip.
     */
    public boolean getMmlchobhdip() {
      return mmlchobhdip_;
    }
    /**
     * <code>bool mmlchobhdip = 3;</code>
     * @param value The mmlchobhdip to set.
     * @return This builder for chaining.
     */
    public Builder setMmlchobhdip(boolean value) {
      
      mmlchobhdip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mmlchobhdip = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmlchobhdip() {
      
      mmlchobhdip_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KKACOPLKBGH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KKACOPLKBGH)
  private static final POGOProtos.Rpc.KKACOPLKBGH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KKACOPLKBGH();
  }

  public static POGOProtos.Rpc.KKACOPLKBGH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KKACOPLKBGH>
      PARSER = new com.google.protobuf.AbstractParser<KKACOPLKBGH>() {
    @java.lang.Override
    public KKACOPLKBGH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KKACOPLKBGH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KKACOPLKBGH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KKACOPLKBGH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KKACOPLKBGH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

