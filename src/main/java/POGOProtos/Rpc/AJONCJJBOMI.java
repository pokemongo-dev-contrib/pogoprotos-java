// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AJONCJJBOMI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AJONCJJBOMI}
 */
public final class AJONCJJBOMI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AJONCJJBOMI)
    AJONCJJBOMIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AJONCJJBOMI.newBuilder() to construct.
  private AJONCJJBOMI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AJONCJJBOMI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AJONCJJBOMI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AJONCJJBOMI(
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

            bainhpaibme_ = input.readInt32();
            break;
          }
          case 16: {

            kjdphangcgc_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AJONCJJBOMI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AJONCJJBOMI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AJONCJJBOMI.class, POGOProtos.Rpc.AJONCJJBOMI.Builder.class);
  }

  public static final int BAINHPAIBME_FIELD_NUMBER = 1;
  private int bainhpaibme_;
  /**
   * <code>int32 bainhpaibme = 1;</code>
   * @return The bainhpaibme.
   */
  @java.lang.Override
  public int getBainhpaibme() {
    return bainhpaibme_;
  }

  public static final int KJDPHANGCGC_FIELD_NUMBER = 2;
  private long kjdphangcgc_;
  /**
   * <code>int64 kjdphangcgc = 2;</code>
   * @return The kjdphangcgc.
   */
  @java.lang.Override
  public long getKjdphangcgc() {
    return kjdphangcgc_;
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
    if (bainhpaibme_ != 0) {
      output.writeInt32(1, bainhpaibme_);
    }
    if (kjdphangcgc_ != 0L) {
      output.writeInt64(2, kjdphangcgc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bainhpaibme_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bainhpaibme_);
    }
    if (kjdphangcgc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, kjdphangcgc_);
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
    if (!(obj instanceof POGOProtos.Rpc.AJONCJJBOMI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AJONCJJBOMI other = (POGOProtos.Rpc.AJONCJJBOMI) obj;

    if (getBainhpaibme()
        != other.getBainhpaibme()) return false;
    if (getKjdphangcgc()
        != other.getKjdphangcgc()) return false;
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
    hash = (37 * hash) + BAINHPAIBME_FIELD_NUMBER;
    hash = (53 * hash) + getBainhpaibme();
    hash = (37 * hash) + KJDPHANGCGC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKjdphangcgc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AJONCJJBOMI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AJONCJJBOMI prototype) {
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
   * ref: AJONCJJBOMI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AJONCJJBOMI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AJONCJJBOMI)
      POGOProtos.Rpc.AJONCJJBOMIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AJONCJJBOMI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AJONCJJBOMI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AJONCJJBOMI.class, POGOProtos.Rpc.AJONCJJBOMI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AJONCJJBOMI.newBuilder()
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
      bainhpaibme_ = 0;

      kjdphangcgc_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AJONCJJBOMI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AJONCJJBOMI getDefaultInstanceForType() {
      return POGOProtos.Rpc.AJONCJJBOMI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AJONCJJBOMI build() {
      POGOProtos.Rpc.AJONCJJBOMI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AJONCJJBOMI buildPartial() {
      POGOProtos.Rpc.AJONCJJBOMI result = new POGOProtos.Rpc.AJONCJJBOMI(this);
      result.bainhpaibme_ = bainhpaibme_;
      result.kjdphangcgc_ = kjdphangcgc_;
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
      if (other instanceof POGOProtos.Rpc.AJONCJJBOMI) {
        return mergeFrom((POGOProtos.Rpc.AJONCJJBOMI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AJONCJJBOMI other) {
      if (other == POGOProtos.Rpc.AJONCJJBOMI.getDefaultInstance()) return this;
      if (other.getBainhpaibme() != 0) {
        setBainhpaibme(other.getBainhpaibme());
      }
      if (other.getKjdphangcgc() != 0L) {
        setKjdphangcgc(other.getKjdphangcgc());
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
      POGOProtos.Rpc.AJONCJJBOMI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AJONCJJBOMI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bainhpaibme_ ;
    /**
     * <code>int32 bainhpaibme = 1;</code>
     * @return The bainhpaibme.
     */
    @java.lang.Override
    public int getBainhpaibme() {
      return bainhpaibme_;
    }
    /**
     * <code>int32 bainhpaibme = 1;</code>
     * @param value The bainhpaibme to set.
     * @return This builder for chaining.
     */
    public Builder setBainhpaibme(int value) {
      
      bainhpaibme_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bainhpaibme = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBainhpaibme() {
      
      bainhpaibme_ = 0;
      onChanged();
      return this;
    }

    private long kjdphangcgc_ ;
    /**
     * <code>int64 kjdphangcgc = 2;</code>
     * @return The kjdphangcgc.
     */
    @java.lang.Override
    public long getKjdphangcgc() {
      return kjdphangcgc_;
    }
    /**
     * <code>int64 kjdphangcgc = 2;</code>
     * @param value The kjdphangcgc to set.
     * @return This builder for chaining.
     */
    public Builder setKjdphangcgc(long value) {
      
      kjdphangcgc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kjdphangcgc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKjdphangcgc() {
      
      kjdphangcgc_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AJONCJJBOMI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AJONCJJBOMI)
  private static final POGOProtos.Rpc.AJONCJJBOMI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AJONCJJBOMI();
  }

  public static POGOProtos.Rpc.AJONCJJBOMI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AJONCJJBOMI>
      PARSER = new com.google.protobuf.AbstractParser<AJONCJJBOMI>() {
    @java.lang.Override
    public AJONCJJBOMI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AJONCJJBOMI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AJONCJJBOMI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AJONCJJBOMI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AJONCJJBOMI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

