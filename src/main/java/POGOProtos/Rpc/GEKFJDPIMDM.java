// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GEKFJDPIMDM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GEKFJDPIMDM}
 */
public final class GEKFJDPIMDM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GEKFJDPIMDM)
    GEKFJDPIMDMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GEKFJDPIMDM.newBuilder() to construct.
  private GEKFJDPIMDM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GEKFJDPIMDM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GEKFJDPIMDM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GEKFJDPIMDM(
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

            hghajfccbej_ = input.readBool();
            break;
          }
          case 16: {

            eoojefgenih_ = input.readInt32();
            break;
          }
          case 24: {

            phdfdogcaeg_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GEKFJDPIMDM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GEKFJDPIMDM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GEKFJDPIMDM.class, POGOProtos.Rpc.GEKFJDPIMDM.Builder.class);
  }

  public static final int HGHAJFCCBEJ_FIELD_NUMBER = 1;
  private boolean hghajfccbej_;
  /**
   * <code>bool hghajfccbej = 1;</code>
   * @return The hghajfccbej.
   */
  @java.lang.Override
  public boolean getHghajfccbej() {
    return hghajfccbej_;
  }

  public static final int EOOJEFGENIH_FIELD_NUMBER = 2;
  private int eoojefgenih_;
  /**
   * <code>int32 eoojefgenih = 2;</code>
   * @return The eoojefgenih.
   */
  @java.lang.Override
  public int getEoojefgenih() {
    return eoojefgenih_;
  }

  public static final int PHDFDOGCAEG_FIELD_NUMBER = 3;
  private long phdfdogcaeg_;
  /**
   * <code>uint64 phdfdogcaeg = 3;</code>
   * @return The phdfdogcaeg.
   */
  @java.lang.Override
  public long getPhdfdogcaeg() {
    return phdfdogcaeg_;
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
    if (hghajfccbej_ != false) {
      output.writeBool(1, hghajfccbej_);
    }
    if (eoojefgenih_ != 0) {
      output.writeInt32(2, eoojefgenih_);
    }
    if (phdfdogcaeg_ != 0L) {
      output.writeUInt64(3, phdfdogcaeg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hghajfccbej_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hghajfccbej_);
    }
    if (eoojefgenih_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, eoojefgenih_);
    }
    if (phdfdogcaeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, phdfdogcaeg_);
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
    if (!(obj instanceof POGOProtos.Rpc.GEKFJDPIMDM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GEKFJDPIMDM other = (POGOProtos.Rpc.GEKFJDPIMDM) obj;

    if (getHghajfccbej()
        != other.getHghajfccbej()) return false;
    if (getEoojefgenih()
        != other.getEoojefgenih()) return false;
    if (getPhdfdogcaeg()
        != other.getPhdfdogcaeg()) return false;
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
    hash = (37 * hash) + HGHAJFCCBEJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHghajfccbej());
    hash = (37 * hash) + EOOJEFGENIH_FIELD_NUMBER;
    hash = (53 * hash) + getEoojefgenih();
    hash = (37 * hash) + PHDFDOGCAEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPhdfdogcaeg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GEKFJDPIMDM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GEKFJDPIMDM prototype) {
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
   * ref: GEKFJDPIMDM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GEKFJDPIMDM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GEKFJDPIMDM)
      POGOProtos.Rpc.GEKFJDPIMDMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GEKFJDPIMDM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GEKFJDPIMDM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GEKFJDPIMDM.class, POGOProtos.Rpc.GEKFJDPIMDM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GEKFJDPIMDM.newBuilder()
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
      hghajfccbej_ = false;

      eoojefgenih_ = 0;

      phdfdogcaeg_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GEKFJDPIMDM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GEKFJDPIMDM getDefaultInstanceForType() {
      return POGOProtos.Rpc.GEKFJDPIMDM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GEKFJDPIMDM build() {
      POGOProtos.Rpc.GEKFJDPIMDM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GEKFJDPIMDM buildPartial() {
      POGOProtos.Rpc.GEKFJDPIMDM result = new POGOProtos.Rpc.GEKFJDPIMDM(this);
      result.hghajfccbej_ = hghajfccbej_;
      result.eoojefgenih_ = eoojefgenih_;
      result.phdfdogcaeg_ = phdfdogcaeg_;
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
      if (other instanceof POGOProtos.Rpc.GEKFJDPIMDM) {
        return mergeFrom((POGOProtos.Rpc.GEKFJDPIMDM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GEKFJDPIMDM other) {
      if (other == POGOProtos.Rpc.GEKFJDPIMDM.getDefaultInstance()) return this;
      if (other.getHghajfccbej() != false) {
        setHghajfccbej(other.getHghajfccbej());
      }
      if (other.getEoojefgenih() != 0) {
        setEoojefgenih(other.getEoojefgenih());
      }
      if (other.getPhdfdogcaeg() != 0L) {
        setPhdfdogcaeg(other.getPhdfdogcaeg());
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
      POGOProtos.Rpc.GEKFJDPIMDM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GEKFJDPIMDM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean hghajfccbej_ ;
    /**
     * <code>bool hghajfccbej = 1;</code>
     * @return The hghajfccbej.
     */
    @java.lang.Override
    public boolean getHghajfccbej() {
      return hghajfccbej_;
    }
    /**
     * <code>bool hghajfccbej = 1;</code>
     * @param value The hghajfccbej to set.
     * @return This builder for chaining.
     */
    public Builder setHghajfccbej(boolean value) {
      
      hghajfccbej_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hghajfccbej = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHghajfccbej() {
      
      hghajfccbej_ = false;
      onChanged();
      return this;
    }

    private int eoojefgenih_ ;
    /**
     * <code>int32 eoojefgenih = 2;</code>
     * @return The eoojefgenih.
     */
    @java.lang.Override
    public int getEoojefgenih() {
      return eoojefgenih_;
    }
    /**
     * <code>int32 eoojefgenih = 2;</code>
     * @param value The eoojefgenih to set.
     * @return This builder for chaining.
     */
    public Builder setEoojefgenih(int value) {
      
      eoojefgenih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 eoojefgenih = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEoojefgenih() {
      
      eoojefgenih_ = 0;
      onChanged();
      return this;
    }

    private long phdfdogcaeg_ ;
    /**
     * <code>uint64 phdfdogcaeg = 3;</code>
     * @return The phdfdogcaeg.
     */
    @java.lang.Override
    public long getPhdfdogcaeg() {
      return phdfdogcaeg_;
    }
    /**
     * <code>uint64 phdfdogcaeg = 3;</code>
     * @param value The phdfdogcaeg to set.
     * @return This builder for chaining.
     */
    public Builder setPhdfdogcaeg(long value) {
      
      phdfdogcaeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 phdfdogcaeg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhdfdogcaeg() {
      
      phdfdogcaeg_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GEKFJDPIMDM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GEKFJDPIMDM)
  private static final POGOProtos.Rpc.GEKFJDPIMDM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GEKFJDPIMDM();
  }

  public static POGOProtos.Rpc.GEKFJDPIMDM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GEKFJDPIMDM>
      PARSER = new com.google.protobuf.AbstractParser<GEKFJDPIMDM>() {
    @java.lang.Override
    public GEKFJDPIMDM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GEKFJDPIMDM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GEKFJDPIMDM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GEKFJDPIMDM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GEKFJDPIMDM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

