// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.HDLEOGLECNM}
 */
public  final class HDLEOGLECNM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HDLEOGLECNM)
    HDLEOGLECNMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HDLEOGLECNM.newBuilder() to construct.
  private HDLEOGLECNM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HDLEOGLECNM() {
    jdfandmeiol_ = 0;
    eichmiomjmp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HDLEOGLECNM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HDLEOGLECNM(
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

            jdfandmeiol_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            eichmiomjmp_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDLEOGLECNM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDLEOGLECNM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HDLEOGLECNM.class, POGOProtos.Rpc.HDLEOGLECNM.Builder.class);
  }

  public static final int JDFANDMEIOL_FIELD_NUMBER = 1;
  private int jdfandmeiol_;
  /**
   * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
   * @return The enum numeric value on the wire for jdfandmeiol.
   */
  public int getJdfandmeiolValue() {
    return jdfandmeiol_;
  }
  /**
   * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
   * @return The jdfandmeiol.
   */
  public POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN getJdfandmeiol() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN result = POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.valueOf(jdfandmeiol_);
    return result == null ? POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.UNRECOGNIZED : result;
  }

  public static final int EICHMIOMJMP_FIELD_NUMBER = 2;
  private int eichmiomjmp_;
  /**
   * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
   * @return The enum numeric value on the wire for eichmiomjmp.
   */
  public int getEichmiomjmpValue() {
    return eichmiomjmp_;
  }
  /**
   * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
   * @return The eichmiomjmp.
   */
  public POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG getEichmiomjmp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG result = POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.valueOf(eichmiomjmp_);
    return result == null ? POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.UNRECOGNIZED : result;
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
    if (jdfandmeiol_ != POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.POKESTOP_NORMAL.getNumber()) {
      output.writeEnum(1, jdfandmeiol_);
    }
    if (eichmiomjmp_ != POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(2, eichmiomjmp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jdfandmeiol_ != POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.POKESTOP_NORMAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jdfandmeiol_);
    }
    if (eichmiomjmp_ != POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, eichmiomjmp_);
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
    if (!(obj instanceof POGOProtos.Rpc.HDLEOGLECNM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HDLEOGLECNM other = (POGOProtos.Rpc.HDLEOGLECNM) obj;

    if (jdfandmeiol_ != other.jdfandmeiol_) return false;
    if (eichmiomjmp_ != other.eichmiomjmp_) return false;
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
    hash = (37 * hash) + JDFANDMEIOL_FIELD_NUMBER;
    hash = (53 * hash) + jdfandmeiol_;
    hash = (37 * hash) + EICHMIOMJMP_FIELD_NUMBER;
    hash = (53 * hash) + eichmiomjmp_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDLEOGLECNM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HDLEOGLECNM prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.HDLEOGLECNM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HDLEOGLECNM)
      POGOProtos.Rpc.HDLEOGLECNMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDLEOGLECNM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDLEOGLECNM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HDLEOGLECNM.class, POGOProtos.Rpc.HDLEOGLECNM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HDLEOGLECNM.newBuilder()
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
      jdfandmeiol_ = 0;

      eichmiomjmp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDLEOGLECNM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDLEOGLECNM getDefaultInstanceForType() {
      return POGOProtos.Rpc.HDLEOGLECNM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDLEOGLECNM build() {
      POGOProtos.Rpc.HDLEOGLECNM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDLEOGLECNM buildPartial() {
      POGOProtos.Rpc.HDLEOGLECNM result = new POGOProtos.Rpc.HDLEOGLECNM(this);
      result.jdfandmeiol_ = jdfandmeiol_;
      result.eichmiomjmp_ = eichmiomjmp_;
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
      if (other instanceof POGOProtos.Rpc.HDLEOGLECNM) {
        return mergeFrom((POGOProtos.Rpc.HDLEOGLECNM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HDLEOGLECNM other) {
      if (other == POGOProtos.Rpc.HDLEOGLECNM.getDefaultInstance()) return this;
      if (other.jdfandmeiol_ != 0) {
        setJdfandmeiolValue(other.getJdfandmeiolValue());
      }
      if (other.eichmiomjmp_ != 0) {
        setEichmiomjmpValue(other.getEichmiomjmpValue());
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
      POGOProtos.Rpc.HDLEOGLECNM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HDLEOGLECNM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jdfandmeiol_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
     * @return The enum numeric value on the wire for jdfandmeiol.
     */
    public int getJdfandmeiolValue() {
      return jdfandmeiol_;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
     * @param value The enum numeric value on the wire for jdfandmeiol to set.
     * @return This builder for chaining.
     */
    public Builder setJdfandmeiolValue(int value) {
      jdfandmeiol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
     * @return The jdfandmeiol.
     */
    public POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN getJdfandmeiol() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN result = POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.valueOf(jdfandmeiol_);
      return result == null ? POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
     * @param value The jdfandmeiol to set.
     * @return This builder for chaining.
     */
    public Builder setJdfandmeiol(POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jdfandmeiol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.HCHMHMIINDN jdfandmeiol = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJdfandmeiol() {
      
      jdfandmeiol_ = 0;
      onChanged();
      return this;
    }

    private int eichmiomjmp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
     * @return The enum numeric value on the wire for eichmiomjmp.
     */
    public int getEichmiomjmpValue() {
      return eichmiomjmp_;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
     * @param value The enum numeric value on the wire for eichmiomjmp to set.
     * @return This builder for chaining.
     */
    public Builder setEichmiomjmpValue(int value) {
      eichmiomjmp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
     * @return The eichmiomjmp.
     */
    public POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG getEichmiomjmp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG result = POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.valueOf(eichmiomjmp_);
      return result == null ? POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
     * @param value The eichmiomjmp to set.
     * @return This builder for chaining.
     */
    public Builder setEichmiomjmp(POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eichmiomjmp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHLNIHEFDNG.EMDKFCJLOFG eichmiomjmp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEichmiomjmp() {
      
      eichmiomjmp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HDLEOGLECNM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HDLEOGLECNM)
  private static final POGOProtos.Rpc.HDLEOGLECNM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HDLEOGLECNM();
  }

  public static POGOProtos.Rpc.HDLEOGLECNM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HDLEOGLECNM>
      PARSER = new com.google.protobuf.AbstractParser<HDLEOGLECNM>() {
    @java.lang.Override
    public HDLEOGLECNM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HDLEOGLECNM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HDLEOGLECNM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HDLEOGLECNM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HDLEOGLECNM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

