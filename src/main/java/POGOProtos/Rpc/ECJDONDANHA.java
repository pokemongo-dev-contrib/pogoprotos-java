// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ECJDONDANHA}
 */
public  final class ECJDONDANHA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ECJDONDANHA)
    ECJDONDANHAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ECJDONDANHA.newBuilder() to construct.
  private ECJDONDANHA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ECJDONDANHA() {
    dfcdneaegnn_ = 0;
    lmpchkoidmi_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ECJDONDANHA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ECJDONDANHA(
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

            dfcdneaegnn_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            lmpchkoidmi_ = rawValue;
            break;
          }
          case 24: {

            mpknfpnlemi_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ECJDONDANHA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ECJDONDANHA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ECJDONDANHA.class, POGOProtos.Rpc.ECJDONDANHA.Builder.class);
  }

  public static final int DFCDNEAEGNN_FIELD_NUMBER = 1;
  private int dfcdneaegnn_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
   * @return The enum numeric value on the wire for dfcdneaegnn.
   */
  public int getDfcdneaegnnValue() {
    return dfcdneaegnn_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
   * @return The dfcdneaegnn.
   */
  public POGOProtos.Rpc.HoloPokemonId getDfcdneaegnn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(dfcdneaegnn_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int LMPCHKOIDMI_FIELD_NUMBER = 2;
  private int lmpchkoidmi_;
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
   * @return The enum numeric value on the wire for lmpchkoidmi.
   */
  public int getLmpchkoidmiValue() {
    return lmpchkoidmi_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
   * @return The lmpchkoidmi.
   */
  public POGOProtos.Rpc.HoloTemporaryEvolutionId getLmpchkoidmi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(lmpchkoidmi_);
    return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
  }

  public static final int MPKNFPNLEMI_FIELD_NUMBER = 3;
  private long mpknfpnlemi_;
  /**
   * <code>int64 mpknfpnlemi = 3;</code>
   * @return The mpknfpnlemi.
   */
  public long getMpknfpnlemi() {
    return mpknfpnlemi_;
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
    if (dfcdneaegnn_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(1, dfcdneaegnn_);
    }
    if (lmpchkoidmi_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      output.writeEnum(2, lmpchkoidmi_);
    }
    if (mpknfpnlemi_ != 0L) {
      output.writeInt64(3, mpknfpnlemi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dfcdneaegnn_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dfcdneaegnn_);
    }
    if (lmpchkoidmi_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, lmpchkoidmi_);
    }
    if (mpknfpnlemi_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, mpknfpnlemi_);
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
    if (!(obj instanceof POGOProtos.Rpc.ECJDONDANHA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ECJDONDANHA other = (POGOProtos.Rpc.ECJDONDANHA) obj;

    if (dfcdneaegnn_ != other.dfcdneaegnn_) return false;
    if (lmpchkoidmi_ != other.lmpchkoidmi_) return false;
    if (getMpknfpnlemi()
        != other.getMpknfpnlemi()) return false;
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
    hash = (37 * hash) + DFCDNEAEGNN_FIELD_NUMBER;
    hash = (53 * hash) + dfcdneaegnn_;
    hash = (37 * hash) + LMPCHKOIDMI_FIELD_NUMBER;
    hash = (53 * hash) + lmpchkoidmi_;
    hash = (37 * hash) + MPKNFPNLEMI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMpknfpnlemi());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECJDONDANHA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ECJDONDANHA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ECJDONDANHA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ECJDONDANHA)
      POGOProtos.Rpc.ECJDONDANHAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ECJDONDANHA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ECJDONDANHA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ECJDONDANHA.class, POGOProtos.Rpc.ECJDONDANHA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ECJDONDANHA.newBuilder()
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
      dfcdneaegnn_ = 0;

      lmpchkoidmi_ = 0;

      mpknfpnlemi_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ECJDONDANHA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECJDONDANHA getDefaultInstanceForType() {
      return POGOProtos.Rpc.ECJDONDANHA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECJDONDANHA build() {
      POGOProtos.Rpc.ECJDONDANHA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECJDONDANHA buildPartial() {
      POGOProtos.Rpc.ECJDONDANHA result = new POGOProtos.Rpc.ECJDONDANHA(this);
      result.dfcdneaegnn_ = dfcdneaegnn_;
      result.lmpchkoidmi_ = lmpchkoidmi_;
      result.mpknfpnlemi_ = mpknfpnlemi_;
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
      if (other instanceof POGOProtos.Rpc.ECJDONDANHA) {
        return mergeFrom((POGOProtos.Rpc.ECJDONDANHA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ECJDONDANHA other) {
      if (other == POGOProtos.Rpc.ECJDONDANHA.getDefaultInstance()) return this;
      if (other.dfcdneaegnn_ != 0) {
        setDfcdneaegnnValue(other.getDfcdneaegnnValue());
      }
      if (other.lmpchkoidmi_ != 0) {
        setLmpchkoidmiValue(other.getLmpchkoidmiValue());
      }
      if (other.getMpknfpnlemi() != 0L) {
        setMpknfpnlemi(other.getMpknfpnlemi());
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
      POGOProtos.Rpc.ECJDONDANHA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ECJDONDANHA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dfcdneaegnn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
     * @return The enum numeric value on the wire for dfcdneaegnn.
     */
    public int getDfcdneaegnnValue() {
      return dfcdneaegnn_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
     * @param value The enum numeric value on the wire for dfcdneaegnn to set.
     * @return This builder for chaining.
     */
    public Builder setDfcdneaegnnValue(int value) {
      dfcdneaegnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
     * @return The dfcdneaegnn.
     */
    public POGOProtos.Rpc.HoloPokemonId getDfcdneaegnn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(dfcdneaegnn_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
     * @param value The dfcdneaegnn to set.
     * @return This builder for chaining.
     */
    public Builder setDfcdneaegnn(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dfcdneaegnn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDfcdneaegnn() {
      
      dfcdneaegnn_ = 0;
      onChanged();
      return this;
    }

    private int lmpchkoidmi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
     * @return The enum numeric value on the wire for lmpchkoidmi.
     */
    public int getLmpchkoidmiValue() {
      return lmpchkoidmi_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
     * @param value The enum numeric value on the wire for lmpchkoidmi to set.
     * @return This builder for chaining.
     */
    public Builder setLmpchkoidmiValue(int value) {
      lmpchkoidmi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
     * @return The lmpchkoidmi.
     */
    public POGOProtos.Rpc.HoloTemporaryEvolutionId getLmpchkoidmi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(lmpchkoidmi_);
      return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
     * @param value The lmpchkoidmi to set.
     * @return This builder for chaining.
     */
    public Builder setLmpchkoidmi(POGOProtos.Rpc.HoloTemporaryEvolutionId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lmpchkoidmi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId lmpchkoidmi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLmpchkoidmi() {
      
      lmpchkoidmi_ = 0;
      onChanged();
      return this;
    }

    private long mpknfpnlemi_ ;
    /**
     * <code>int64 mpknfpnlemi = 3;</code>
     * @return The mpknfpnlemi.
     */
    public long getMpknfpnlemi() {
      return mpknfpnlemi_;
    }
    /**
     * <code>int64 mpknfpnlemi = 3;</code>
     * @param value The mpknfpnlemi to set.
     * @return This builder for chaining.
     */
    public Builder setMpknfpnlemi(long value) {
      
      mpknfpnlemi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mpknfpnlemi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMpknfpnlemi() {
      
      mpknfpnlemi_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ECJDONDANHA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ECJDONDANHA)
  private static final POGOProtos.Rpc.ECJDONDANHA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ECJDONDANHA();
  }

  public static POGOProtos.Rpc.ECJDONDANHA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ECJDONDANHA>
      PARSER = new com.google.protobuf.AbstractParser<ECJDONDANHA>() {
    @java.lang.Override
    public ECJDONDANHA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ECJDONDANHA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ECJDONDANHA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ECJDONDANHA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ECJDONDANHA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

