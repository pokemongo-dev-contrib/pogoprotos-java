// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DFHJHFCIFPP}
 */
public  final class DFHJHFCIFPP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DFHJHFCIFPP)
    DFHJHFCIFPPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DFHJHFCIFPP.newBuilder() to construct.
  private DFHJHFCIFPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DFHJHFCIFPP() {
    faadkigcmfa_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DFHJHFCIFPP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DFHJHFCIFPP(
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

            faadkigcmfa_ = rawValue;
            break;
          }
          case 16: {

            ohonajaajil_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DFHJHFCIFPP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DFHJHFCIFPP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DFHJHFCIFPP.class, POGOProtos.Rpc.DFHJHFCIFPP.Builder.class);
  }

  public static final int FAADKIGCMFA_FIELD_NUMBER = 1;
  private int faadkigcmfa_;
  /**
   * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
   * @return The enum numeric value on the wire for faadkigcmfa.
   */
  public int getFaadkigcmfaValue() {
    return faadkigcmfa_;
  }
  /**
   * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
   * @return The faadkigcmfa.
   */
  public POGOProtos.Rpc.LDCFIBLANBA getFaadkigcmfa() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LDCFIBLANBA result = POGOProtos.Rpc.LDCFIBLANBA.valueOf(faadkigcmfa_);
    return result == null ? POGOProtos.Rpc.LDCFIBLANBA.UNRECOGNIZED : result;
  }

  public static final int OHONAJAAJIL_FIELD_NUMBER = 2;
  private int ohonajaajil_;
  /**
   * <code>int32 ohonajaajil = 2;</code>
   * @return The ohonajaajil.
   */
  public int getOhonajaajil() {
    return ohonajaajil_;
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
    if (faadkigcmfa_ != POGOProtos.Rpc.LDCFIBLANBA.LDCFIBLANBA_FAMILY_UNSET.getNumber()) {
      output.writeEnum(1, faadkigcmfa_);
    }
    if (ohonajaajil_ != 0) {
      output.writeInt32(2, ohonajaajil_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (faadkigcmfa_ != POGOProtos.Rpc.LDCFIBLANBA.LDCFIBLANBA_FAMILY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, faadkigcmfa_);
    }
    if (ohonajaajil_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ohonajaajil_);
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
    if (!(obj instanceof POGOProtos.Rpc.DFHJHFCIFPP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DFHJHFCIFPP other = (POGOProtos.Rpc.DFHJHFCIFPP) obj;

    if (faadkigcmfa_ != other.faadkigcmfa_) return false;
    if (getOhonajaajil()
        != other.getOhonajaajil()) return false;
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
    hash = (37 * hash) + FAADKIGCMFA_FIELD_NUMBER;
    hash = (53 * hash) + faadkigcmfa_;
    hash = (37 * hash) + OHONAJAAJIL_FIELD_NUMBER;
    hash = (53 * hash) + getOhonajaajil();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DFHJHFCIFPP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DFHJHFCIFPP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DFHJHFCIFPP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DFHJHFCIFPP)
      POGOProtos.Rpc.DFHJHFCIFPPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DFHJHFCIFPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DFHJHFCIFPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DFHJHFCIFPP.class, POGOProtos.Rpc.DFHJHFCIFPP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DFHJHFCIFPP.newBuilder()
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
      faadkigcmfa_ = 0;

      ohonajaajil_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DFHJHFCIFPP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DFHJHFCIFPP getDefaultInstanceForType() {
      return POGOProtos.Rpc.DFHJHFCIFPP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DFHJHFCIFPP build() {
      POGOProtos.Rpc.DFHJHFCIFPP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DFHJHFCIFPP buildPartial() {
      POGOProtos.Rpc.DFHJHFCIFPP result = new POGOProtos.Rpc.DFHJHFCIFPP(this);
      result.faadkigcmfa_ = faadkigcmfa_;
      result.ohonajaajil_ = ohonajaajil_;
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
      if (other instanceof POGOProtos.Rpc.DFHJHFCIFPP) {
        return mergeFrom((POGOProtos.Rpc.DFHJHFCIFPP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DFHJHFCIFPP other) {
      if (other == POGOProtos.Rpc.DFHJHFCIFPP.getDefaultInstance()) return this;
      if (other.faadkigcmfa_ != 0) {
        setFaadkigcmfaValue(other.getFaadkigcmfaValue());
      }
      if (other.getOhonajaajil() != 0) {
        setOhonajaajil(other.getOhonajaajil());
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
      POGOProtos.Rpc.DFHJHFCIFPP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DFHJHFCIFPP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int faadkigcmfa_ = 0;
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
     * @return The enum numeric value on the wire for faadkigcmfa.
     */
    public int getFaadkigcmfaValue() {
      return faadkigcmfa_;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
     * @param value The enum numeric value on the wire for faadkigcmfa to set.
     * @return This builder for chaining.
     */
    public Builder setFaadkigcmfaValue(int value) {
      faadkigcmfa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
     * @return The faadkigcmfa.
     */
    public POGOProtos.Rpc.LDCFIBLANBA getFaadkigcmfa() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LDCFIBLANBA result = POGOProtos.Rpc.LDCFIBLANBA.valueOf(faadkigcmfa_);
      return result == null ? POGOProtos.Rpc.LDCFIBLANBA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
     * @param value The faadkigcmfa to set.
     * @return This builder for chaining.
     */
    public Builder setFaadkigcmfa(POGOProtos.Rpc.LDCFIBLANBA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      faadkigcmfa_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LDCFIBLANBA faadkigcmfa = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFaadkigcmfa() {
      
      faadkigcmfa_ = 0;
      onChanged();
      return this;
    }

    private int ohonajaajil_ ;
    /**
     * <code>int32 ohonajaajil = 2;</code>
     * @return The ohonajaajil.
     */
    public int getOhonajaajil() {
      return ohonajaajil_;
    }
    /**
     * <code>int32 ohonajaajil = 2;</code>
     * @param value The ohonajaajil to set.
     * @return This builder for chaining.
     */
    public Builder setOhonajaajil(int value) {
      
      ohonajaajil_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ohonajaajil = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOhonajaajil() {
      
      ohonajaajil_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DFHJHFCIFPP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DFHJHFCIFPP)
  private static final POGOProtos.Rpc.DFHJHFCIFPP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DFHJHFCIFPP();
  }

  public static POGOProtos.Rpc.DFHJHFCIFPP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DFHJHFCIFPP>
      PARSER = new com.google.protobuf.AbstractParser<DFHJHFCIFPP>() {
    @java.lang.Override
    public DFHJHFCIFPP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DFHJHFCIFPP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DFHJHFCIFPP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DFHJHFCIFPP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DFHJHFCIFPP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

