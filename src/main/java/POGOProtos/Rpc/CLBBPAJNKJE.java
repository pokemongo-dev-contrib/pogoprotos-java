// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CLBBPAJNKJE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CLBBPAJNKJE}
 */
public  final class CLBBPAJNKJE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CLBBPAJNKJE)
    CLBBPAJNKJEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CLBBPAJNKJE.newBuilder() to construct.
  private CLBBPAJNKJE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CLBBPAJNKJE() {
    bdhlbpcghmo_ = "";
    fbmdpanhaie_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CLBBPAJNKJE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CLBBPAJNKJE(
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
            java.lang.String s = input.readStringRequireUtf8();

            bdhlbpcghmo_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            fbmdpanhaie_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLBBPAJNKJE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLBBPAJNKJE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CLBBPAJNKJE.class, POGOProtos.Rpc.CLBBPAJNKJE.Builder.class);
  }

  public static final int BDHLBPCGHMO_FIELD_NUMBER = 1;
  private volatile java.lang.Object bdhlbpcghmo_;
  /**
   * <code>string bdhlbpcghmo = 1;</code>
   * @return The bdhlbpcghmo.
   */
  public java.lang.String getBdhlbpcghmo() {
    java.lang.Object ref = bdhlbpcghmo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bdhlbpcghmo_ = s;
      return s;
    }
  }
  /**
   * <code>string bdhlbpcghmo = 1;</code>
   * @return The bytes for bdhlbpcghmo.
   */
  public com.google.protobuf.ByteString
      getBdhlbpcghmoBytes() {
    java.lang.Object ref = bdhlbpcghmo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bdhlbpcghmo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FBMDPANHAIE_FIELD_NUMBER = 2;
  private int fbmdpanhaie_;
  /**
   * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
   * @return The enum numeric value on the wire for fbmdpanhaie.
   */
  public int getFbmdpanhaieValue() {
    return fbmdpanhaie_;
  }
  /**
   * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
   * @return The fbmdpanhaie.
   */
  public POGOProtos.Rpc.JFNCKCDABLA getFbmdpanhaie() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JFNCKCDABLA result = POGOProtos.Rpc.JFNCKCDABLA.valueOf(fbmdpanhaie_);
    return result == null ? POGOProtos.Rpc.JFNCKCDABLA.UNRECOGNIZED : result;
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
    if (!getBdhlbpcghmoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bdhlbpcghmo_);
    }
    if (fbmdpanhaie_ != POGOProtos.Rpc.JFNCKCDABLA.JFNCKCDABLA_NONE.getNumber()) {
      output.writeEnum(2, fbmdpanhaie_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBdhlbpcghmoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bdhlbpcghmo_);
    }
    if (fbmdpanhaie_ != POGOProtos.Rpc.JFNCKCDABLA.JFNCKCDABLA_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, fbmdpanhaie_);
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
    if (!(obj instanceof POGOProtos.Rpc.CLBBPAJNKJE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CLBBPAJNKJE other = (POGOProtos.Rpc.CLBBPAJNKJE) obj;

    if (!getBdhlbpcghmo()
        .equals(other.getBdhlbpcghmo())) return false;
    if (fbmdpanhaie_ != other.fbmdpanhaie_) return false;
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
    hash = (37 * hash) + BDHLBPCGHMO_FIELD_NUMBER;
    hash = (53 * hash) + getBdhlbpcghmo().hashCode();
    hash = (37 * hash) + FBMDPANHAIE_FIELD_NUMBER;
    hash = (53 * hash) + fbmdpanhaie_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CLBBPAJNKJE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CLBBPAJNKJE prototype) {
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
   * ref: CLBBPAJNKJE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CLBBPAJNKJE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CLBBPAJNKJE)
      POGOProtos.Rpc.CLBBPAJNKJEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLBBPAJNKJE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLBBPAJNKJE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CLBBPAJNKJE.class, POGOProtos.Rpc.CLBBPAJNKJE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CLBBPAJNKJE.newBuilder()
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
      bdhlbpcghmo_ = "";

      fbmdpanhaie_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CLBBPAJNKJE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLBBPAJNKJE getDefaultInstanceForType() {
      return POGOProtos.Rpc.CLBBPAJNKJE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLBBPAJNKJE build() {
      POGOProtos.Rpc.CLBBPAJNKJE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CLBBPAJNKJE buildPartial() {
      POGOProtos.Rpc.CLBBPAJNKJE result = new POGOProtos.Rpc.CLBBPAJNKJE(this);
      result.bdhlbpcghmo_ = bdhlbpcghmo_;
      result.fbmdpanhaie_ = fbmdpanhaie_;
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
      if (other instanceof POGOProtos.Rpc.CLBBPAJNKJE) {
        return mergeFrom((POGOProtos.Rpc.CLBBPAJNKJE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CLBBPAJNKJE other) {
      if (other == POGOProtos.Rpc.CLBBPAJNKJE.getDefaultInstance()) return this;
      if (!other.getBdhlbpcghmo().isEmpty()) {
        bdhlbpcghmo_ = other.bdhlbpcghmo_;
        onChanged();
      }
      if (other.fbmdpanhaie_ != 0) {
        setFbmdpanhaieValue(other.getFbmdpanhaieValue());
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
      POGOProtos.Rpc.CLBBPAJNKJE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CLBBPAJNKJE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bdhlbpcghmo_ = "";
    /**
     * <code>string bdhlbpcghmo = 1;</code>
     * @return The bdhlbpcghmo.
     */
    public java.lang.String getBdhlbpcghmo() {
      java.lang.Object ref = bdhlbpcghmo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bdhlbpcghmo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bdhlbpcghmo = 1;</code>
     * @return The bytes for bdhlbpcghmo.
     */
    public com.google.protobuf.ByteString
        getBdhlbpcghmoBytes() {
      java.lang.Object ref = bdhlbpcghmo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bdhlbpcghmo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bdhlbpcghmo = 1;</code>
     * @param value The bdhlbpcghmo to set.
     * @return This builder for chaining.
     */
    public Builder setBdhlbpcghmo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bdhlbpcghmo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bdhlbpcghmo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdhlbpcghmo() {
      
      bdhlbpcghmo_ = getDefaultInstance().getBdhlbpcghmo();
      onChanged();
      return this;
    }
    /**
     * <code>string bdhlbpcghmo = 1;</code>
     * @param value The bytes for bdhlbpcghmo to set.
     * @return This builder for chaining.
     */
    public Builder setBdhlbpcghmoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bdhlbpcghmo_ = value;
      onChanged();
      return this;
    }

    private int fbmdpanhaie_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
     * @return The enum numeric value on the wire for fbmdpanhaie.
     */
    public int getFbmdpanhaieValue() {
      return fbmdpanhaie_;
    }
    /**
     * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
     * @param value The enum numeric value on the wire for fbmdpanhaie to set.
     * @return This builder for chaining.
     */
    public Builder setFbmdpanhaieValue(int value) {
      fbmdpanhaie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
     * @return The fbmdpanhaie.
     */
    public POGOProtos.Rpc.JFNCKCDABLA getFbmdpanhaie() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JFNCKCDABLA result = POGOProtos.Rpc.JFNCKCDABLA.valueOf(fbmdpanhaie_);
      return result == null ? POGOProtos.Rpc.JFNCKCDABLA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
     * @param value The fbmdpanhaie to set.
     * @return This builder for chaining.
     */
    public Builder setFbmdpanhaie(POGOProtos.Rpc.JFNCKCDABLA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fbmdpanhaie_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JFNCKCDABLA fbmdpanhaie = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbmdpanhaie() {
      
      fbmdpanhaie_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CLBBPAJNKJE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CLBBPAJNKJE)
  private static final POGOProtos.Rpc.CLBBPAJNKJE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CLBBPAJNKJE();
  }

  public static POGOProtos.Rpc.CLBBPAJNKJE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CLBBPAJNKJE>
      PARSER = new com.google.protobuf.AbstractParser<CLBBPAJNKJE>() {
    @java.lang.Override
    public CLBBPAJNKJE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CLBBPAJNKJE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CLBBPAJNKJE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CLBBPAJNKJE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CLBBPAJNKJE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

