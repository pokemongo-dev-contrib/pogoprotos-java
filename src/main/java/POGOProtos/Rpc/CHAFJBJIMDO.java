// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CHAFJBJIMDO}
 */
public  final class CHAFJBJIMDO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CHAFJBJIMDO)
    CHAFJBJIMDOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CHAFJBJIMDO.newBuilder() to construct.
  private CHAFJBJIMDO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CHAFJBJIMDO() {
    dfcdneaegnn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CHAFJBJIMDO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CHAFJBJIMDO(
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

            hhedanfkcjo_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            dfcdneaegnn_ = rawValue;
            break;
          }
          case 24: {

            ojgjjcennpm_ = input.readInt32();
            break;
          }
          case 37: {

            ldbpgidange_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHAFJBJIMDO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHAFJBJIMDO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CHAFJBJIMDO.class, POGOProtos.Rpc.CHAFJBJIMDO.Builder.class);
  }

  public static final int HHEDANFKCJO_FIELD_NUMBER = 1;
  private long hhedanfkcjo_;
  /**
   * <code>int64 hhedanfkcjo = 1;</code>
   * @return The hhedanfkcjo.
   */
  public long getHhedanfkcjo() {
    return hhedanfkcjo_;
  }

  public static final int DFCDNEAEGNN_FIELD_NUMBER = 2;
  private int dfcdneaegnn_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
   * @return The enum numeric value on the wire for dfcdneaegnn.
   */
  public int getDfcdneaegnnValue() {
    return dfcdneaegnn_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
   * @return The dfcdneaegnn.
   */
  public POGOProtos.Rpc.HoloPokemonId getDfcdneaegnn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(dfcdneaegnn_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int OJGJJCENNPM_FIELD_NUMBER = 3;
  private int ojgjjcennpm_;
  /**
   * <code>int32 ojgjjcennpm = 3;</code>
   * @return The ojgjjcennpm.
   */
  public int getOjgjjcennpm() {
    return ojgjjcennpm_;
  }

  public static final int LDBPGIDANGE_FIELD_NUMBER = 4;
  private float ldbpgidange_;
  /**
   * <code>float ldbpgidange = 4;</code>
   * @return The ldbpgidange.
   */
  public float getLdbpgidange() {
    return ldbpgidange_;
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
    if (hhedanfkcjo_ != 0L) {
      output.writeInt64(1, hhedanfkcjo_);
    }
    if (dfcdneaegnn_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(2, dfcdneaegnn_);
    }
    if (ojgjjcennpm_ != 0) {
      output.writeInt32(3, ojgjjcennpm_);
    }
    if (ldbpgidange_ != 0F) {
      output.writeFloat(4, ldbpgidange_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hhedanfkcjo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hhedanfkcjo_);
    }
    if (dfcdneaegnn_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dfcdneaegnn_);
    }
    if (ojgjjcennpm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ojgjjcennpm_);
    }
    if (ldbpgidange_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, ldbpgidange_);
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
    if (!(obj instanceof POGOProtos.Rpc.CHAFJBJIMDO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CHAFJBJIMDO other = (POGOProtos.Rpc.CHAFJBJIMDO) obj;

    if (getHhedanfkcjo()
        != other.getHhedanfkcjo()) return false;
    if (dfcdneaegnn_ != other.dfcdneaegnn_) return false;
    if (getOjgjjcennpm()
        != other.getOjgjjcennpm()) return false;
    if (java.lang.Float.floatToIntBits(getLdbpgidange())
        != java.lang.Float.floatToIntBits(
            other.getLdbpgidange())) return false;
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
    hash = (37 * hash) + HHEDANFKCJO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHhedanfkcjo());
    hash = (37 * hash) + DFCDNEAEGNN_FIELD_NUMBER;
    hash = (53 * hash) + dfcdneaegnn_;
    hash = (37 * hash) + OJGJJCENNPM_FIELD_NUMBER;
    hash = (53 * hash) + getOjgjjcennpm();
    hash = (37 * hash) + LDBPGIDANGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLdbpgidange());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAFJBJIMDO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CHAFJBJIMDO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CHAFJBJIMDO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CHAFJBJIMDO)
      POGOProtos.Rpc.CHAFJBJIMDOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHAFJBJIMDO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHAFJBJIMDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CHAFJBJIMDO.class, POGOProtos.Rpc.CHAFJBJIMDO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CHAFJBJIMDO.newBuilder()
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
      hhedanfkcjo_ = 0L;

      dfcdneaegnn_ = 0;

      ojgjjcennpm_ = 0;

      ldbpgidange_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CHAFJBJIMDO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAFJBJIMDO getDefaultInstanceForType() {
      return POGOProtos.Rpc.CHAFJBJIMDO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAFJBJIMDO build() {
      POGOProtos.Rpc.CHAFJBJIMDO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAFJBJIMDO buildPartial() {
      POGOProtos.Rpc.CHAFJBJIMDO result = new POGOProtos.Rpc.CHAFJBJIMDO(this);
      result.hhedanfkcjo_ = hhedanfkcjo_;
      result.dfcdneaegnn_ = dfcdneaegnn_;
      result.ojgjjcennpm_ = ojgjjcennpm_;
      result.ldbpgidange_ = ldbpgidange_;
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
      if (other instanceof POGOProtos.Rpc.CHAFJBJIMDO) {
        return mergeFrom((POGOProtos.Rpc.CHAFJBJIMDO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CHAFJBJIMDO other) {
      if (other == POGOProtos.Rpc.CHAFJBJIMDO.getDefaultInstance()) return this;
      if (other.getHhedanfkcjo() != 0L) {
        setHhedanfkcjo(other.getHhedanfkcjo());
      }
      if (other.dfcdneaegnn_ != 0) {
        setDfcdneaegnnValue(other.getDfcdneaegnnValue());
      }
      if (other.getOjgjjcennpm() != 0) {
        setOjgjjcennpm(other.getOjgjjcennpm());
      }
      if (other.getLdbpgidange() != 0F) {
        setLdbpgidange(other.getLdbpgidange());
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
      POGOProtos.Rpc.CHAFJBJIMDO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CHAFJBJIMDO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long hhedanfkcjo_ ;
    /**
     * <code>int64 hhedanfkcjo = 1;</code>
     * @return The hhedanfkcjo.
     */
    public long getHhedanfkcjo() {
      return hhedanfkcjo_;
    }
    /**
     * <code>int64 hhedanfkcjo = 1;</code>
     * @param value The hhedanfkcjo to set.
     * @return This builder for chaining.
     */
    public Builder setHhedanfkcjo(long value) {
      
      hhedanfkcjo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hhedanfkcjo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHhedanfkcjo() {
      
      hhedanfkcjo_ = 0L;
      onChanged();
      return this;
    }

    private int dfcdneaegnn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
     * @return The enum numeric value on the wire for dfcdneaegnn.
     */
    public int getDfcdneaegnnValue() {
      return dfcdneaegnn_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
     * @param value The enum numeric value on the wire for dfcdneaegnn to set.
     * @return This builder for chaining.
     */
    public Builder setDfcdneaegnnValue(int value) {
      dfcdneaegnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
     * @return The dfcdneaegnn.
     */
    public POGOProtos.Rpc.HoloPokemonId getDfcdneaegnn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(dfcdneaegnn_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
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
     * <code>.POGOProtos.Rpc.HoloPokemonId dfcdneaegnn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDfcdneaegnn() {
      
      dfcdneaegnn_ = 0;
      onChanged();
      return this;
    }

    private int ojgjjcennpm_ ;
    /**
     * <code>int32 ojgjjcennpm = 3;</code>
     * @return The ojgjjcennpm.
     */
    public int getOjgjjcennpm() {
      return ojgjjcennpm_;
    }
    /**
     * <code>int32 ojgjjcennpm = 3;</code>
     * @param value The ojgjjcennpm to set.
     * @return This builder for chaining.
     */
    public Builder setOjgjjcennpm(int value) {
      
      ojgjjcennpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ojgjjcennpm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjgjjcennpm() {
      
      ojgjjcennpm_ = 0;
      onChanged();
      return this;
    }

    private float ldbpgidange_ ;
    /**
     * <code>float ldbpgidange = 4;</code>
     * @return The ldbpgidange.
     */
    public float getLdbpgidange() {
      return ldbpgidange_;
    }
    /**
     * <code>float ldbpgidange = 4;</code>
     * @param value The ldbpgidange to set.
     * @return This builder for chaining.
     */
    public Builder setLdbpgidange(float value) {
      
      ldbpgidange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ldbpgidange = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLdbpgidange() {
      
      ldbpgidange_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CHAFJBJIMDO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CHAFJBJIMDO)
  private static final POGOProtos.Rpc.CHAFJBJIMDO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CHAFJBJIMDO();
  }

  public static POGOProtos.Rpc.CHAFJBJIMDO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CHAFJBJIMDO>
      PARSER = new com.google.protobuf.AbstractParser<CHAFJBJIMDO>() {
    @java.lang.Override
    public CHAFJBJIMDO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CHAFJBJIMDO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CHAFJBJIMDO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CHAFJBJIMDO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CHAFJBJIMDO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

