// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LIIFAPINKKL}
 */
public  final class LIIFAPINKKL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LIIFAPINKKL)
    LIIFAPINKKLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LIIFAPINKKL.newBuilder() to construct.
  private LIIFAPINKKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LIIFAPINKKL() {
    hjaaehnhpej_ = 0;
    kfgilodebad_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LIIFAPINKKL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LIIFAPINKKL(
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

            hjaaehnhpej_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kfgilodebad_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LIIFAPINKKL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LIIFAPINKKL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LIIFAPINKKL.class, POGOProtos.Rpc.LIIFAPINKKL.Builder.class);
  }

  public static final int HJAAEHNHPEJ_FIELD_NUMBER = 1;
  private int hjaaehnhpej_;
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
   * @return The enum numeric value on the wire for hjaaehnhpej.
   */
  public int getHjaaehnhpejValue() {
    return hjaaehnhpej_;
  }
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
   * @return The hjaaehnhpej.
   */
  public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
    return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
  }

  public static final int KFGILODEBAD_FIELD_NUMBER = 2;
  private int kfgilodebad_;
  /**
   * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
   * @return The enum numeric value on the wire for kfgilodebad.
   */
  public int getKfgilodebadValue() {
    return kfgilodebad_;
  }
  /**
   * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
   * @return The kfgilodebad.
   */
  public POGOProtos.Rpc.MCMBJHLFEDO getKfgilodebad() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MCMBJHLFEDO result = POGOProtos.Rpc.MCMBJHLFEDO.valueOf(kfgilodebad_);
    return result == null ? POGOProtos.Rpc.MCMBJHLFEDO.UNRECOGNIZED : result;
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
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, hjaaehnhpej_);
    }
    if (kfgilodebad_ != POGOProtos.Rpc.MCMBJHLFEDO.MCMBJHLFEDO_UNSET.getNumber()) {
      output.writeEnum(2, kfgilodebad_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hjaaehnhpej_);
    }
    if (kfgilodebad_ != POGOProtos.Rpc.MCMBJHLFEDO.MCMBJHLFEDO_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kfgilodebad_);
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
    if (!(obj instanceof POGOProtos.Rpc.LIIFAPINKKL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LIIFAPINKKL other = (POGOProtos.Rpc.LIIFAPINKKL) obj;

    if (hjaaehnhpej_ != other.hjaaehnhpej_) return false;
    if (kfgilodebad_ != other.kfgilodebad_) return false;
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
    hash = (37 * hash) + HJAAEHNHPEJ_FIELD_NUMBER;
    hash = (53 * hash) + hjaaehnhpej_;
    hash = (37 * hash) + KFGILODEBAD_FIELD_NUMBER;
    hash = (53 * hash) + kfgilodebad_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LIIFAPINKKL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LIIFAPINKKL prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LIIFAPINKKL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LIIFAPINKKL)
      POGOProtos.Rpc.LIIFAPINKKLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LIIFAPINKKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LIIFAPINKKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LIIFAPINKKL.class, POGOProtos.Rpc.LIIFAPINKKL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LIIFAPINKKL.newBuilder()
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
      hjaaehnhpej_ = 0;

      kfgilodebad_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LIIFAPINKKL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LIIFAPINKKL getDefaultInstanceForType() {
      return POGOProtos.Rpc.LIIFAPINKKL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LIIFAPINKKL build() {
      POGOProtos.Rpc.LIIFAPINKKL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LIIFAPINKKL buildPartial() {
      POGOProtos.Rpc.LIIFAPINKKL result = new POGOProtos.Rpc.LIIFAPINKKL(this);
      result.hjaaehnhpej_ = hjaaehnhpej_;
      result.kfgilodebad_ = kfgilodebad_;
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
      if (other instanceof POGOProtos.Rpc.LIIFAPINKKL) {
        return mergeFrom((POGOProtos.Rpc.LIIFAPINKKL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LIIFAPINKKL other) {
      if (other == POGOProtos.Rpc.LIIFAPINKKL.getDefaultInstance()) return this;
      if (other.hjaaehnhpej_ != 0) {
        setHjaaehnhpejValue(other.getHjaaehnhpejValue());
      }
      if (other.kfgilodebad_ != 0) {
        setKfgilodebadValue(other.getKfgilodebadValue());
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
      POGOProtos.Rpc.LIIFAPINKKL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LIIFAPINKKL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hjaaehnhpej_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return The enum numeric value on the wire for hjaaehnhpej.
     */
    public int getHjaaehnhpejValue() {
      return hjaaehnhpej_;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @param value The enum numeric value on the wire for hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpejValue(int value) {
      hjaaehnhpej_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return The hjaaehnhpej.
     */
    public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
      return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @param value The hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpej(POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hjaaehnhpej_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjaaehnhpej() {
      
      hjaaehnhpej_ = 0;
      onChanged();
      return this;
    }

    private int kfgilodebad_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
     * @return The enum numeric value on the wire for kfgilodebad.
     */
    public int getKfgilodebadValue() {
      return kfgilodebad_;
    }
    /**
     * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
     * @param value The enum numeric value on the wire for kfgilodebad to set.
     * @return This builder for chaining.
     */
    public Builder setKfgilodebadValue(int value) {
      kfgilodebad_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
     * @return The kfgilodebad.
     */
    public POGOProtos.Rpc.MCMBJHLFEDO getKfgilodebad() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MCMBJHLFEDO result = POGOProtos.Rpc.MCMBJHLFEDO.valueOf(kfgilodebad_);
      return result == null ? POGOProtos.Rpc.MCMBJHLFEDO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
     * @param value The kfgilodebad to set.
     * @return This builder for chaining.
     */
    public Builder setKfgilodebad(POGOProtos.Rpc.MCMBJHLFEDO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kfgilodebad_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MCMBJHLFEDO kfgilodebad = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKfgilodebad() {
      
      kfgilodebad_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LIIFAPINKKL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LIIFAPINKKL)
  private static final POGOProtos.Rpc.LIIFAPINKKL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LIIFAPINKKL();
  }

  public static POGOProtos.Rpc.LIIFAPINKKL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LIIFAPINKKL>
      PARSER = new com.google.protobuf.AbstractParser<LIIFAPINKKL>() {
    @java.lang.Override
    public LIIFAPINKKL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LIIFAPINKKL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LIIFAPINKKL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LIIFAPINKKL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LIIFAPINKKL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

