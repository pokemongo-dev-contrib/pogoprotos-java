// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EGLICIAPHEI}
 */
public  final class EGLICIAPHEI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EGLICIAPHEI)
    EGLICIAPHEIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EGLICIAPHEI.newBuilder() to construct.
  private EGLICIAPHEI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EGLICIAPHEI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EGLICIAPHEI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EGLICIAPHEI(
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

            cnjpdcdobga_ = input.readFloat();
            break;
          }
          case 16: {

            blfgakfdcem_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EGLICIAPHEI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EGLICIAPHEI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EGLICIAPHEI.class, POGOProtos.Rpc.EGLICIAPHEI.Builder.class);
  }

  public static final int CNJPDCDOBGA_FIELD_NUMBER = 1;
  private float cnjpdcdobga_;
  /**
   * <code>float cnjpdcdobga = 1;</code>
   * @return The cnjpdcdobga.
   */
  public float getCnjpdcdobga() {
    return cnjpdcdobga_;
  }

  public static final int BLFGAKFDCEM_FIELD_NUMBER = 2;
  private int blfgakfdcem_;
  /**
   * <code>int32 blfgakfdcem = 2;</code>
   * @return The blfgakfdcem.
   */
  public int getBlfgakfdcem() {
    return blfgakfdcem_;
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
    if (cnjpdcdobga_ != 0F) {
      output.writeFloat(1, cnjpdcdobga_);
    }
    if (blfgakfdcem_ != 0) {
      output.writeInt32(2, blfgakfdcem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cnjpdcdobga_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, cnjpdcdobga_);
    }
    if (blfgakfdcem_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, blfgakfdcem_);
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
    if (!(obj instanceof POGOProtos.Rpc.EGLICIAPHEI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EGLICIAPHEI other = (POGOProtos.Rpc.EGLICIAPHEI) obj;

    if (java.lang.Float.floatToIntBits(getCnjpdcdobga())
        != java.lang.Float.floatToIntBits(
            other.getCnjpdcdobga())) return false;
    if (getBlfgakfdcem()
        != other.getBlfgakfdcem()) return false;
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
    hash = (37 * hash) + CNJPDCDOBGA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCnjpdcdobga());
    hash = (37 * hash) + BLFGAKFDCEM_FIELD_NUMBER;
    hash = (53 * hash) + getBlfgakfdcem();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EGLICIAPHEI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EGLICIAPHEI prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EGLICIAPHEI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EGLICIAPHEI)
      POGOProtos.Rpc.EGLICIAPHEIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EGLICIAPHEI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EGLICIAPHEI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EGLICIAPHEI.class, POGOProtos.Rpc.EGLICIAPHEI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EGLICIAPHEI.newBuilder()
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
      cnjpdcdobga_ = 0F;

      blfgakfdcem_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EGLICIAPHEI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EGLICIAPHEI getDefaultInstanceForType() {
      return POGOProtos.Rpc.EGLICIAPHEI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EGLICIAPHEI build() {
      POGOProtos.Rpc.EGLICIAPHEI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EGLICIAPHEI buildPartial() {
      POGOProtos.Rpc.EGLICIAPHEI result = new POGOProtos.Rpc.EGLICIAPHEI(this);
      result.cnjpdcdobga_ = cnjpdcdobga_;
      result.blfgakfdcem_ = blfgakfdcem_;
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
      if (other instanceof POGOProtos.Rpc.EGLICIAPHEI) {
        return mergeFrom((POGOProtos.Rpc.EGLICIAPHEI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EGLICIAPHEI other) {
      if (other == POGOProtos.Rpc.EGLICIAPHEI.getDefaultInstance()) return this;
      if (other.getCnjpdcdobga() != 0F) {
        setCnjpdcdobga(other.getCnjpdcdobga());
      }
      if (other.getBlfgakfdcem() != 0) {
        setBlfgakfdcem(other.getBlfgakfdcem());
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
      POGOProtos.Rpc.EGLICIAPHEI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EGLICIAPHEI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float cnjpdcdobga_ ;
    /**
     * <code>float cnjpdcdobga = 1;</code>
     * @return The cnjpdcdobga.
     */
    public float getCnjpdcdobga() {
      return cnjpdcdobga_;
    }
    /**
     * <code>float cnjpdcdobga = 1;</code>
     * @param value The cnjpdcdobga to set.
     * @return This builder for chaining.
     */
    public Builder setCnjpdcdobga(float value) {
      
      cnjpdcdobga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cnjpdcdobga = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCnjpdcdobga() {
      
      cnjpdcdobga_ = 0F;
      onChanged();
      return this;
    }

    private int blfgakfdcem_ ;
    /**
     * <code>int32 blfgakfdcem = 2;</code>
     * @return The blfgakfdcem.
     */
    public int getBlfgakfdcem() {
      return blfgakfdcem_;
    }
    /**
     * <code>int32 blfgakfdcem = 2;</code>
     * @param value The blfgakfdcem to set.
     * @return This builder for chaining.
     */
    public Builder setBlfgakfdcem(int value) {
      
      blfgakfdcem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 blfgakfdcem = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlfgakfdcem() {
      
      blfgakfdcem_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EGLICIAPHEI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EGLICIAPHEI)
  private static final POGOProtos.Rpc.EGLICIAPHEI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EGLICIAPHEI();
  }

  public static POGOProtos.Rpc.EGLICIAPHEI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EGLICIAPHEI>
      PARSER = new com.google.protobuf.AbstractParser<EGLICIAPHEI>() {
    @java.lang.Override
    public EGLICIAPHEI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EGLICIAPHEI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EGLICIAPHEI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EGLICIAPHEI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EGLICIAPHEI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

