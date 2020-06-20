// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BACDJAEPEAK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BACDJAEPEAK}
 */
public  final class BACDJAEPEAK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BACDJAEPEAK)
    BACDJAEPEAKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BACDJAEPEAK.newBuilder() to construct.
  private BACDJAEPEAK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BACDJAEPEAK() {
    nloikbolnga_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BACDJAEPEAK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BACDJAEPEAK(
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

            nloikbolnga_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BACDJAEPEAK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BACDJAEPEAK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BACDJAEPEAK.class, POGOProtos.Rpc.BACDJAEPEAK.Builder.class);
  }

  public static final int NLOIKBOLNGA_FIELD_NUMBER = 1;
  private int nloikbolnga_;
  /**
   * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
   * @return The enum numeric value on the wire for nloikbolnga.
   */
  public int getNloikbolngaValue() {
    return nloikbolnga_;
  }
  /**
   * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
   * @return The nloikbolnga.
   */
  public POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG getNloikbolnga() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG result = POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.valueOf(nloikbolnga_);
    return result == null ? POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.UNRECOGNIZED : result;
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
    if (nloikbolnga_ != POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.ILENFAOCNPG_UNSET.getNumber()) {
      output.writeEnum(1, nloikbolnga_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nloikbolnga_ != POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.ILENFAOCNPG_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, nloikbolnga_);
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
    if (!(obj instanceof POGOProtos.Rpc.BACDJAEPEAK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BACDJAEPEAK other = (POGOProtos.Rpc.BACDJAEPEAK) obj;

    if (nloikbolnga_ != other.nloikbolnga_) return false;
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
    hash = (37 * hash) + NLOIKBOLNGA_FIELD_NUMBER;
    hash = (53 * hash) + nloikbolnga_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BACDJAEPEAK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BACDJAEPEAK prototype) {
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
   * ref: BACDJAEPEAK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BACDJAEPEAK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BACDJAEPEAK)
      POGOProtos.Rpc.BACDJAEPEAKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BACDJAEPEAK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BACDJAEPEAK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BACDJAEPEAK.class, POGOProtos.Rpc.BACDJAEPEAK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BACDJAEPEAK.newBuilder()
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
      nloikbolnga_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BACDJAEPEAK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BACDJAEPEAK getDefaultInstanceForType() {
      return POGOProtos.Rpc.BACDJAEPEAK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BACDJAEPEAK build() {
      POGOProtos.Rpc.BACDJAEPEAK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BACDJAEPEAK buildPartial() {
      POGOProtos.Rpc.BACDJAEPEAK result = new POGOProtos.Rpc.BACDJAEPEAK(this);
      result.nloikbolnga_ = nloikbolnga_;
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
      if (other instanceof POGOProtos.Rpc.BACDJAEPEAK) {
        return mergeFrom((POGOProtos.Rpc.BACDJAEPEAK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BACDJAEPEAK other) {
      if (other == POGOProtos.Rpc.BACDJAEPEAK.getDefaultInstance()) return this;
      if (other.nloikbolnga_ != 0) {
        setNloikbolngaValue(other.getNloikbolngaValue());
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
      POGOProtos.Rpc.BACDJAEPEAK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BACDJAEPEAK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nloikbolnga_ = 0;
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return The enum numeric value on the wire for nloikbolnga.
     */
    public int getNloikbolngaValue() {
      return nloikbolnga_;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @param value The enum numeric value on the wire for nloikbolnga to set.
     * @return This builder for chaining.
     */
    public Builder setNloikbolngaValue(int value) {
      nloikbolnga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return The nloikbolnga.
     */
    public POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG getNloikbolnga() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG result = POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.valueOf(nloikbolnga_);
      return result == null ? POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @param value The nloikbolnga to set.
     * @return This builder for chaining.
     */
    public Builder setNloikbolnga(POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nloikbolnga_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.INFOOBMPJID.ILENFAOCNPG nloikbolnga = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNloikbolnga() {
      
      nloikbolnga_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BACDJAEPEAK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BACDJAEPEAK)
  private static final POGOProtos.Rpc.BACDJAEPEAK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BACDJAEPEAK();
  }

  public static POGOProtos.Rpc.BACDJAEPEAK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BACDJAEPEAK>
      PARSER = new com.google.protobuf.AbstractParser<BACDJAEPEAK>() {
    @java.lang.Override
    public BACDJAEPEAK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BACDJAEPEAK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BACDJAEPEAK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BACDJAEPEAK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BACDJAEPEAK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

