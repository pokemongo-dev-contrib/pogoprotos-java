// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EIJNGFLIGDD}
 */
public  final class EIJNGFLIGDD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EIJNGFLIGDD)
    EIJNGFLIGDDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EIJNGFLIGDD.newBuilder() to construct.
  private EIJNGFLIGDD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EIJNGFLIGDD() {
    ffnbimfkoja_ = "";
    lecljfleiah_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EIJNGFLIGDD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EIJNGFLIGDD(
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

            ffnbimfkoja_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lecljfleiah_ = s;
            break;
          }
          case 24: {

            pdfonbpkenc_ = input.readInt32();
            break;
          }
          case 32: {

            knknopjllpl_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIJNGFLIGDD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIJNGFLIGDD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EIJNGFLIGDD.class, POGOProtos.Rpc.EIJNGFLIGDD.Builder.class);
  }

  public static final int FFNBIMFKOJA_FIELD_NUMBER = 1;
  private volatile java.lang.Object ffnbimfkoja_;
  /**
   * <code>string ffnbimfkoja = 1;</code>
   * @return The ffnbimfkoja.
   */
  public java.lang.String getFfnbimfkoja() {
    java.lang.Object ref = ffnbimfkoja_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ffnbimfkoja_ = s;
      return s;
    }
  }
  /**
   * <code>string ffnbimfkoja = 1;</code>
   * @return The bytes for ffnbimfkoja.
   */
  public com.google.protobuf.ByteString
      getFfnbimfkojaBytes() {
    java.lang.Object ref = ffnbimfkoja_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ffnbimfkoja_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LECLJFLEIAH_FIELD_NUMBER = 2;
  private volatile java.lang.Object lecljfleiah_;
  /**
   * <code>string lecljfleiah = 2;</code>
   * @return The lecljfleiah.
   */
  public java.lang.String getLecljfleiah() {
    java.lang.Object ref = lecljfleiah_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lecljfleiah_ = s;
      return s;
    }
  }
  /**
   * <code>string lecljfleiah = 2;</code>
   * @return The bytes for lecljfleiah.
   */
  public com.google.protobuf.ByteString
      getLecljfleiahBytes() {
    java.lang.Object ref = lecljfleiah_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lecljfleiah_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PDFONBPKENC_FIELD_NUMBER = 3;
  private int pdfonbpkenc_;
  /**
   * <code>int32 pdfonbpkenc = 3;</code>
   * @return The pdfonbpkenc.
   */
  public int getPdfonbpkenc() {
    return pdfonbpkenc_;
  }

  public static final int KNKNOPJLLPL_FIELD_NUMBER = 4;
  private long knknopjllpl_;
  /**
   * <code>int64 knknopjllpl = 4;</code>
   * @return The knknopjllpl.
   */
  public long getKnknopjllpl() {
    return knknopjllpl_;
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
    if (!getFfnbimfkojaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ffnbimfkoja_);
    }
    if (!getLecljfleiahBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lecljfleiah_);
    }
    if (pdfonbpkenc_ != 0) {
      output.writeInt32(3, pdfonbpkenc_);
    }
    if (knknopjllpl_ != 0L) {
      output.writeInt64(4, knknopjllpl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFfnbimfkojaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ffnbimfkoja_);
    }
    if (!getLecljfleiahBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lecljfleiah_);
    }
    if (pdfonbpkenc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pdfonbpkenc_);
    }
    if (knknopjllpl_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, knknopjllpl_);
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
    if (!(obj instanceof POGOProtos.Rpc.EIJNGFLIGDD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EIJNGFLIGDD other = (POGOProtos.Rpc.EIJNGFLIGDD) obj;

    if (!getFfnbimfkoja()
        .equals(other.getFfnbimfkoja())) return false;
    if (!getLecljfleiah()
        .equals(other.getLecljfleiah())) return false;
    if (getPdfonbpkenc()
        != other.getPdfonbpkenc()) return false;
    if (getKnknopjllpl()
        != other.getKnknopjllpl()) return false;
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
    hash = (37 * hash) + FFNBIMFKOJA_FIELD_NUMBER;
    hash = (53 * hash) + getFfnbimfkoja().hashCode();
    hash = (37 * hash) + LECLJFLEIAH_FIELD_NUMBER;
    hash = (53 * hash) + getLecljfleiah().hashCode();
    hash = (37 * hash) + PDFONBPKENC_FIELD_NUMBER;
    hash = (53 * hash) + getPdfonbpkenc();
    hash = (37 * hash) + KNKNOPJLLPL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKnknopjllpl());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIJNGFLIGDD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EIJNGFLIGDD prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EIJNGFLIGDD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EIJNGFLIGDD)
      POGOProtos.Rpc.EIJNGFLIGDDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIJNGFLIGDD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIJNGFLIGDD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EIJNGFLIGDD.class, POGOProtos.Rpc.EIJNGFLIGDD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EIJNGFLIGDD.newBuilder()
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
      ffnbimfkoja_ = "";

      lecljfleiah_ = "";

      pdfonbpkenc_ = 0;

      knknopjllpl_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIJNGFLIGDD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIJNGFLIGDD getDefaultInstanceForType() {
      return POGOProtos.Rpc.EIJNGFLIGDD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIJNGFLIGDD build() {
      POGOProtos.Rpc.EIJNGFLIGDD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIJNGFLIGDD buildPartial() {
      POGOProtos.Rpc.EIJNGFLIGDD result = new POGOProtos.Rpc.EIJNGFLIGDD(this);
      result.ffnbimfkoja_ = ffnbimfkoja_;
      result.lecljfleiah_ = lecljfleiah_;
      result.pdfonbpkenc_ = pdfonbpkenc_;
      result.knknopjllpl_ = knknopjllpl_;
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
      if (other instanceof POGOProtos.Rpc.EIJNGFLIGDD) {
        return mergeFrom((POGOProtos.Rpc.EIJNGFLIGDD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EIJNGFLIGDD other) {
      if (other == POGOProtos.Rpc.EIJNGFLIGDD.getDefaultInstance()) return this;
      if (!other.getFfnbimfkoja().isEmpty()) {
        ffnbimfkoja_ = other.ffnbimfkoja_;
        onChanged();
      }
      if (!other.getLecljfleiah().isEmpty()) {
        lecljfleiah_ = other.lecljfleiah_;
        onChanged();
      }
      if (other.getPdfonbpkenc() != 0) {
        setPdfonbpkenc(other.getPdfonbpkenc());
      }
      if (other.getKnknopjllpl() != 0L) {
        setKnknopjllpl(other.getKnknopjllpl());
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
      POGOProtos.Rpc.EIJNGFLIGDD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EIJNGFLIGDD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ffnbimfkoja_ = "";
    /**
     * <code>string ffnbimfkoja = 1;</code>
     * @return The ffnbimfkoja.
     */
    public java.lang.String getFfnbimfkoja() {
      java.lang.Object ref = ffnbimfkoja_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ffnbimfkoja_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ffnbimfkoja = 1;</code>
     * @return The bytes for ffnbimfkoja.
     */
    public com.google.protobuf.ByteString
        getFfnbimfkojaBytes() {
      java.lang.Object ref = ffnbimfkoja_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ffnbimfkoja_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ffnbimfkoja = 1;</code>
     * @param value The ffnbimfkoja to set.
     * @return This builder for chaining.
     */
    public Builder setFfnbimfkoja(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ffnbimfkoja_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ffnbimfkoja = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfnbimfkoja() {
      
      ffnbimfkoja_ = getDefaultInstance().getFfnbimfkoja();
      onChanged();
      return this;
    }
    /**
     * <code>string ffnbimfkoja = 1;</code>
     * @param value The bytes for ffnbimfkoja to set.
     * @return This builder for chaining.
     */
    public Builder setFfnbimfkojaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ffnbimfkoja_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lecljfleiah_ = "";
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return The lecljfleiah.
     */
    public java.lang.String getLecljfleiah() {
      java.lang.Object ref = lecljfleiah_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lecljfleiah_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return The bytes for lecljfleiah.
     */
    public com.google.protobuf.ByteString
        getLecljfleiahBytes() {
      java.lang.Object ref = lecljfleiah_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lecljfleiah_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @param value The lecljfleiah to set.
     * @return This builder for chaining.
     */
    public Builder setLecljfleiah(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lecljfleiah_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLecljfleiah() {
      
      lecljfleiah_ = getDefaultInstance().getLecljfleiah();
      onChanged();
      return this;
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @param value The bytes for lecljfleiah to set.
     * @return This builder for chaining.
     */
    public Builder setLecljfleiahBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lecljfleiah_ = value;
      onChanged();
      return this;
    }

    private int pdfonbpkenc_ ;
    /**
     * <code>int32 pdfonbpkenc = 3;</code>
     * @return The pdfonbpkenc.
     */
    public int getPdfonbpkenc() {
      return pdfonbpkenc_;
    }
    /**
     * <code>int32 pdfonbpkenc = 3;</code>
     * @param value The pdfonbpkenc to set.
     * @return This builder for chaining.
     */
    public Builder setPdfonbpkenc(int value) {
      
      pdfonbpkenc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pdfonbpkenc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPdfonbpkenc() {
      
      pdfonbpkenc_ = 0;
      onChanged();
      return this;
    }

    private long knknopjllpl_ ;
    /**
     * <code>int64 knknopjllpl = 4;</code>
     * @return The knknopjllpl.
     */
    public long getKnknopjllpl() {
      return knknopjllpl_;
    }
    /**
     * <code>int64 knknopjllpl = 4;</code>
     * @param value The knknopjllpl to set.
     * @return This builder for chaining.
     */
    public Builder setKnknopjllpl(long value) {
      
      knknopjllpl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 knknopjllpl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKnknopjllpl() {
      
      knknopjllpl_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EIJNGFLIGDD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EIJNGFLIGDD)
  private static final POGOProtos.Rpc.EIJNGFLIGDD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EIJNGFLIGDD();
  }

  public static POGOProtos.Rpc.EIJNGFLIGDD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EIJNGFLIGDD>
      PARSER = new com.google.protobuf.AbstractParser<EIJNGFLIGDD>() {
    @java.lang.Override
    public EIJNGFLIGDD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EIJNGFLIGDD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EIJNGFLIGDD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EIJNGFLIGDD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EIJNGFLIGDD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

