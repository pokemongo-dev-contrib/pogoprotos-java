// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JFEAFCIEBMD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JFEAFCIEBMD}
 */
public final class JFEAFCIEBMD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JFEAFCIEBMD)
    JFEAFCIEBMDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JFEAFCIEBMD.newBuilder() to construct.
  private JFEAFCIEBMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JFEAFCIEBMD() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JFEAFCIEBMD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JFEAFCIEBMD(
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

            okppneppcif_ = input.readFloat();
            break;
          }
          case 16: {

            dbnikaameak_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JFEAFCIEBMD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JFEAFCIEBMD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JFEAFCIEBMD.class, POGOProtos.Rpc.JFEAFCIEBMD.Builder.class);
  }

  public static final int OKPPNEPPCIF_FIELD_NUMBER = 1;
  private float okppneppcif_;
  /**
   * <code>float okppneppcif = 1;</code>
   * @return The okppneppcif.
   */
  @java.lang.Override
  public float getOkppneppcif() {
    return okppneppcif_;
  }

  public static final int DBNIKAAMEAK_FIELD_NUMBER = 2;
  private int dbnikaameak_;
  /**
   * <code>int32 dbnikaameak = 2;</code>
   * @return The dbnikaameak.
   */
  @java.lang.Override
  public int getDbnikaameak() {
    return dbnikaameak_;
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
    if (okppneppcif_ != 0F) {
      output.writeFloat(1, okppneppcif_);
    }
    if (dbnikaameak_ != 0) {
      output.writeInt32(2, dbnikaameak_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (okppneppcif_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, okppneppcif_);
    }
    if (dbnikaameak_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dbnikaameak_);
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
    if (!(obj instanceof POGOProtos.Rpc.JFEAFCIEBMD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JFEAFCIEBMD other = (POGOProtos.Rpc.JFEAFCIEBMD) obj;

    if (java.lang.Float.floatToIntBits(getOkppneppcif())
        != java.lang.Float.floatToIntBits(
            other.getOkppneppcif())) return false;
    if (getDbnikaameak()
        != other.getDbnikaameak()) return false;
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
    hash = (37 * hash) + OKPPNEPPCIF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOkppneppcif());
    hash = (37 * hash) + DBNIKAAMEAK_FIELD_NUMBER;
    hash = (53 * hash) + getDbnikaameak();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JFEAFCIEBMD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JFEAFCIEBMD prototype) {
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
   * ref: JFEAFCIEBMD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JFEAFCIEBMD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JFEAFCIEBMD)
      POGOProtos.Rpc.JFEAFCIEBMDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JFEAFCIEBMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JFEAFCIEBMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JFEAFCIEBMD.class, POGOProtos.Rpc.JFEAFCIEBMD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JFEAFCIEBMD.newBuilder()
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
      okppneppcif_ = 0F;

      dbnikaameak_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JFEAFCIEBMD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JFEAFCIEBMD getDefaultInstanceForType() {
      return POGOProtos.Rpc.JFEAFCIEBMD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JFEAFCIEBMD build() {
      POGOProtos.Rpc.JFEAFCIEBMD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JFEAFCIEBMD buildPartial() {
      POGOProtos.Rpc.JFEAFCIEBMD result = new POGOProtos.Rpc.JFEAFCIEBMD(this);
      result.okppneppcif_ = okppneppcif_;
      result.dbnikaameak_ = dbnikaameak_;
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
      if (other instanceof POGOProtos.Rpc.JFEAFCIEBMD) {
        return mergeFrom((POGOProtos.Rpc.JFEAFCIEBMD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JFEAFCIEBMD other) {
      if (other == POGOProtos.Rpc.JFEAFCIEBMD.getDefaultInstance()) return this;
      if (other.getOkppneppcif() != 0F) {
        setOkppneppcif(other.getOkppneppcif());
      }
      if (other.getDbnikaameak() != 0) {
        setDbnikaameak(other.getDbnikaameak());
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
      POGOProtos.Rpc.JFEAFCIEBMD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JFEAFCIEBMD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float okppneppcif_ ;
    /**
     * <code>float okppneppcif = 1;</code>
     * @return The okppneppcif.
     */
    @java.lang.Override
    public float getOkppneppcif() {
      return okppneppcif_;
    }
    /**
     * <code>float okppneppcif = 1;</code>
     * @param value The okppneppcif to set.
     * @return This builder for chaining.
     */
    public Builder setOkppneppcif(float value) {
      
      okppneppcif_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float okppneppcif = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOkppneppcif() {
      
      okppneppcif_ = 0F;
      onChanged();
      return this;
    }

    private int dbnikaameak_ ;
    /**
     * <code>int32 dbnikaameak = 2;</code>
     * @return The dbnikaameak.
     */
    @java.lang.Override
    public int getDbnikaameak() {
      return dbnikaameak_;
    }
    /**
     * <code>int32 dbnikaameak = 2;</code>
     * @param value The dbnikaameak to set.
     * @return This builder for chaining.
     */
    public Builder setDbnikaameak(int value) {
      
      dbnikaameak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dbnikaameak = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbnikaameak() {
      
      dbnikaameak_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JFEAFCIEBMD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JFEAFCIEBMD)
  private static final POGOProtos.Rpc.JFEAFCIEBMD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JFEAFCIEBMD();
  }

  public static POGOProtos.Rpc.JFEAFCIEBMD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JFEAFCIEBMD>
      PARSER = new com.google.protobuf.AbstractParser<JFEAFCIEBMD>() {
    @java.lang.Override
    public JFEAFCIEBMD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JFEAFCIEBMD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JFEAFCIEBMD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JFEAFCIEBMD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JFEAFCIEBMD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

