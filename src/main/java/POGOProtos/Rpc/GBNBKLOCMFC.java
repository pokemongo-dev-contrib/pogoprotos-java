// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GBNBKLOCMFC}
 */
public  final class GBNBKLOCMFC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GBNBKLOCMFC)
    GBNBKLOCMFCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GBNBKLOCMFC.newBuilder() to construct.
  private GBNBKLOCMFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GBNBKLOCMFC() {
    ahokmohelge_ = "";
    dbnkbkjhjah_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GBNBKLOCMFC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GBNBKLOCMFC(
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

            ahokmohelge_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dbnkbkjhjah_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GBNBKLOCMFC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GBNBKLOCMFC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GBNBKLOCMFC.class, POGOProtos.Rpc.GBNBKLOCMFC.Builder.class);
  }

  public static final int AHOKMOHELGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object ahokmohelge_;
  /**
   * <code>string ahokmohelge = 1;</code>
   * @return The ahokmohelge.
   */
  public java.lang.String getAhokmohelge() {
    java.lang.Object ref = ahokmohelge_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ahokmohelge_ = s;
      return s;
    }
  }
  /**
   * <code>string ahokmohelge = 1;</code>
   * @return The bytes for ahokmohelge.
   */
  public com.google.protobuf.ByteString
      getAhokmohelgeBytes() {
    java.lang.Object ref = ahokmohelge_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ahokmohelge_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DBNKBKJHJAH_FIELD_NUMBER = 2;
  private volatile java.lang.Object dbnkbkjhjah_;
  /**
   * <code>string dbnkbkjhjah = 2;</code>
   * @return The dbnkbkjhjah.
   */
  public java.lang.String getDbnkbkjhjah() {
    java.lang.Object ref = dbnkbkjhjah_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dbnkbkjhjah_ = s;
      return s;
    }
  }
  /**
   * <code>string dbnkbkjhjah = 2;</code>
   * @return The bytes for dbnkbkjhjah.
   */
  public com.google.protobuf.ByteString
      getDbnkbkjhjahBytes() {
    java.lang.Object ref = dbnkbkjhjah_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dbnkbkjhjah_ = b;
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
    if (!getAhokmohelgeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ahokmohelge_);
    }
    if (!getDbnkbkjhjahBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dbnkbkjhjah_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAhokmohelgeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ahokmohelge_);
    }
    if (!getDbnkbkjhjahBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dbnkbkjhjah_);
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
    if (!(obj instanceof POGOProtos.Rpc.GBNBKLOCMFC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GBNBKLOCMFC other = (POGOProtos.Rpc.GBNBKLOCMFC) obj;

    if (!getAhokmohelge()
        .equals(other.getAhokmohelge())) return false;
    if (!getDbnkbkjhjah()
        .equals(other.getDbnkbkjhjah())) return false;
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
    hash = (37 * hash) + AHOKMOHELGE_FIELD_NUMBER;
    hash = (53 * hash) + getAhokmohelge().hashCode();
    hash = (37 * hash) + DBNKBKJHJAH_FIELD_NUMBER;
    hash = (53 * hash) + getDbnkbkjhjah().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBNBKLOCMFC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GBNBKLOCMFC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GBNBKLOCMFC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GBNBKLOCMFC)
      POGOProtos.Rpc.GBNBKLOCMFCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GBNBKLOCMFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GBNBKLOCMFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GBNBKLOCMFC.class, POGOProtos.Rpc.GBNBKLOCMFC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GBNBKLOCMFC.newBuilder()
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
      ahokmohelge_ = "";

      dbnkbkjhjah_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GBNBKLOCMFC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBNBKLOCMFC getDefaultInstanceForType() {
      return POGOProtos.Rpc.GBNBKLOCMFC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBNBKLOCMFC build() {
      POGOProtos.Rpc.GBNBKLOCMFC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBNBKLOCMFC buildPartial() {
      POGOProtos.Rpc.GBNBKLOCMFC result = new POGOProtos.Rpc.GBNBKLOCMFC(this);
      result.ahokmohelge_ = ahokmohelge_;
      result.dbnkbkjhjah_ = dbnkbkjhjah_;
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
      if (other instanceof POGOProtos.Rpc.GBNBKLOCMFC) {
        return mergeFrom((POGOProtos.Rpc.GBNBKLOCMFC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GBNBKLOCMFC other) {
      if (other == POGOProtos.Rpc.GBNBKLOCMFC.getDefaultInstance()) return this;
      if (!other.getAhokmohelge().isEmpty()) {
        ahokmohelge_ = other.ahokmohelge_;
        onChanged();
      }
      if (!other.getDbnkbkjhjah().isEmpty()) {
        dbnkbkjhjah_ = other.dbnkbkjhjah_;
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
      POGOProtos.Rpc.GBNBKLOCMFC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GBNBKLOCMFC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ahokmohelge_ = "";
    /**
     * <code>string ahokmohelge = 1;</code>
     * @return The ahokmohelge.
     */
    public java.lang.String getAhokmohelge() {
      java.lang.Object ref = ahokmohelge_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ahokmohelge_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ahokmohelge = 1;</code>
     * @return The bytes for ahokmohelge.
     */
    public com.google.protobuf.ByteString
        getAhokmohelgeBytes() {
      java.lang.Object ref = ahokmohelge_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ahokmohelge_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ahokmohelge = 1;</code>
     * @param value The ahokmohelge to set.
     * @return This builder for chaining.
     */
    public Builder setAhokmohelge(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ahokmohelge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ahokmohelge = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAhokmohelge() {
      
      ahokmohelge_ = getDefaultInstance().getAhokmohelge();
      onChanged();
      return this;
    }
    /**
     * <code>string ahokmohelge = 1;</code>
     * @param value The bytes for ahokmohelge to set.
     * @return This builder for chaining.
     */
    public Builder setAhokmohelgeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ahokmohelge_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dbnkbkjhjah_ = "";
    /**
     * <code>string dbnkbkjhjah = 2;</code>
     * @return The dbnkbkjhjah.
     */
    public java.lang.String getDbnkbkjhjah() {
      java.lang.Object ref = dbnkbkjhjah_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dbnkbkjhjah_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dbnkbkjhjah = 2;</code>
     * @return The bytes for dbnkbkjhjah.
     */
    public com.google.protobuf.ByteString
        getDbnkbkjhjahBytes() {
      java.lang.Object ref = dbnkbkjhjah_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dbnkbkjhjah_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dbnkbkjhjah = 2;</code>
     * @param value The dbnkbkjhjah to set.
     * @return This builder for chaining.
     */
    public Builder setDbnkbkjhjah(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dbnkbkjhjah_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dbnkbkjhjah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbnkbkjhjah() {
      
      dbnkbkjhjah_ = getDefaultInstance().getDbnkbkjhjah();
      onChanged();
      return this;
    }
    /**
     * <code>string dbnkbkjhjah = 2;</code>
     * @param value The bytes for dbnkbkjhjah to set.
     * @return This builder for chaining.
     */
    public Builder setDbnkbkjhjahBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dbnkbkjhjah_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GBNBKLOCMFC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GBNBKLOCMFC)
  private static final POGOProtos.Rpc.GBNBKLOCMFC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GBNBKLOCMFC();
  }

  public static POGOProtos.Rpc.GBNBKLOCMFC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GBNBKLOCMFC>
      PARSER = new com.google.protobuf.AbstractParser<GBNBKLOCMFC>() {
    @java.lang.Override
    public GBNBKLOCMFC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GBNBKLOCMFC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GBNBKLOCMFC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GBNBKLOCMFC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GBNBKLOCMFC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

