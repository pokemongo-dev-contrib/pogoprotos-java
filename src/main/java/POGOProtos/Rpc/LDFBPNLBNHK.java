// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LDFBPNLBNHK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LDFBPNLBNHK}
 */
public final class LDFBPNLBNHK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LDFBPNLBNHK)
    LDFBPNLBNHKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LDFBPNLBNHK.newBuilder() to construct.
  private LDFBPNLBNHK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LDFBPNLBNHK() {
    opilnneefce_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LDFBPNLBNHK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LDFBPNLBNHK(
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

            opilnneefce_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDFBPNLBNHK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDFBPNLBNHK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LDFBPNLBNHK.class, POGOProtos.Rpc.LDFBPNLBNHK.Builder.class);
  }

  public static final int OPILNNEEFCE_FIELD_NUMBER = 1;
  private int opilnneefce_;
  /**
   * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
   * @return The enum numeric value on the wire for opilnneefce.
   */
  @java.lang.Override public int getOpilnneefceValue() {
    return opilnneefce_;
  }
  /**
   * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
   * @return The opilnneefce.
   */
  @java.lang.Override public POGOProtos.Rpc.JACHLOPHBNH getOpilnneefce() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JACHLOPHBNH result = POGOProtos.Rpc.JACHLOPHBNH.valueOf(opilnneefce_);
    return result == null ? POGOProtos.Rpc.JACHLOPHBNH.UNRECOGNIZED : result;
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
    if (opilnneefce_ != POGOProtos.Rpc.JACHLOPHBNH.JACHLOPHBNH_UNDEFINED_EVENT.getNumber()) {
      output.writeEnum(1, opilnneefce_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (opilnneefce_ != POGOProtos.Rpc.JACHLOPHBNH.JACHLOPHBNH_UNDEFINED_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, opilnneefce_);
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
    if (!(obj instanceof POGOProtos.Rpc.LDFBPNLBNHK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LDFBPNLBNHK other = (POGOProtos.Rpc.LDFBPNLBNHK) obj;

    if (opilnneefce_ != other.opilnneefce_) return false;
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
    hash = (37 * hash) + OPILNNEEFCE_FIELD_NUMBER;
    hash = (53 * hash) + opilnneefce_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LDFBPNLBNHK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LDFBPNLBNHK prototype) {
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
   * ref: LDFBPNLBNHK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LDFBPNLBNHK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LDFBPNLBNHK)
      POGOProtos.Rpc.LDFBPNLBNHKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDFBPNLBNHK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDFBPNLBNHK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LDFBPNLBNHK.class, POGOProtos.Rpc.LDFBPNLBNHK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LDFBPNLBNHK.newBuilder()
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
      opilnneefce_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LDFBPNLBNHK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDFBPNLBNHK getDefaultInstanceForType() {
      return POGOProtos.Rpc.LDFBPNLBNHK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDFBPNLBNHK build() {
      POGOProtos.Rpc.LDFBPNLBNHK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LDFBPNLBNHK buildPartial() {
      POGOProtos.Rpc.LDFBPNLBNHK result = new POGOProtos.Rpc.LDFBPNLBNHK(this);
      result.opilnneefce_ = opilnneefce_;
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
      if (other instanceof POGOProtos.Rpc.LDFBPNLBNHK) {
        return mergeFrom((POGOProtos.Rpc.LDFBPNLBNHK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LDFBPNLBNHK other) {
      if (other == POGOProtos.Rpc.LDFBPNLBNHK.getDefaultInstance()) return this;
      if (other.opilnneefce_ != 0) {
        setOpilnneefceValue(other.getOpilnneefceValue());
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
      POGOProtos.Rpc.LDFBPNLBNHK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LDFBPNLBNHK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int opilnneefce_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
     * @return The enum numeric value on the wire for opilnneefce.
     */
    @java.lang.Override public int getOpilnneefceValue() {
      return opilnneefce_;
    }
    /**
     * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
     * @param value The enum numeric value on the wire for opilnneefce to set.
     * @return This builder for chaining.
     */
    public Builder setOpilnneefceValue(int value) {
      
      opilnneefce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
     * @return The opilnneefce.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JACHLOPHBNH getOpilnneefce() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JACHLOPHBNH result = POGOProtos.Rpc.JACHLOPHBNH.valueOf(opilnneefce_);
      return result == null ? POGOProtos.Rpc.JACHLOPHBNH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
     * @param value The opilnneefce to set.
     * @return This builder for chaining.
     */
    public Builder setOpilnneefce(POGOProtos.Rpc.JACHLOPHBNH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      opilnneefce_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JACHLOPHBNH opilnneefce = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpilnneefce() {
      
      opilnneefce_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LDFBPNLBNHK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LDFBPNLBNHK)
  private static final POGOProtos.Rpc.LDFBPNLBNHK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LDFBPNLBNHK();
  }

  public static POGOProtos.Rpc.LDFBPNLBNHK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LDFBPNLBNHK>
      PARSER = new com.google.protobuf.AbstractParser<LDFBPNLBNHK>() {
    @java.lang.Override
    public LDFBPNLBNHK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LDFBPNLBNHK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LDFBPNLBNHK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LDFBPNLBNHK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LDFBPNLBNHK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

