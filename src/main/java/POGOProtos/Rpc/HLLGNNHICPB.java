// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HLLGNNHICPB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HLLGNNHICPB}
 */
public final class HLLGNNHICPB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HLLGNNHICPB)
    HLLGNNHICPBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HLLGNNHICPB.newBuilder() to construct.
  private HLLGNNHICPB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HLLGNNHICPB() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HLLGNNHICPB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HLLGNNHICPB(
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

            jjmfljpbjlf_ = input.readInt32();
            break;
          }
          case 16: {

            oimkpnllikc_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLLGNNHICPB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLLGNNHICPB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HLLGNNHICPB.class, POGOProtos.Rpc.HLLGNNHICPB.Builder.class);
  }

  public static final int JJMFLJPBJLF_FIELD_NUMBER = 1;
  private int jjmfljpbjlf_;
  /**
   * <code>int32 jjmfljpbjlf = 1;</code>
   * @return The jjmfljpbjlf.
   */
  @java.lang.Override
  public int getJjmfljpbjlf() {
    return jjmfljpbjlf_;
  }

  public static final int OIMKPNLLIKC_FIELD_NUMBER = 2;
  private int oimkpnllikc_;
  /**
   * <code>int32 oimkpnllikc = 2;</code>
   * @return The oimkpnllikc.
   */
  @java.lang.Override
  public int getOimkpnllikc() {
    return oimkpnllikc_;
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
    if (jjmfljpbjlf_ != 0) {
      output.writeInt32(1, jjmfljpbjlf_);
    }
    if (oimkpnllikc_ != 0) {
      output.writeInt32(2, oimkpnllikc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jjmfljpbjlf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, jjmfljpbjlf_);
    }
    if (oimkpnllikc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, oimkpnllikc_);
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
    if (!(obj instanceof POGOProtos.Rpc.HLLGNNHICPB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HLLGNNHICPB other = (POGOProtos.Rpc.HLLGNNHICPB) obj;

    if (getJjmfljpbjlf()
        != other.getJjmfljpbjlf()) return false;
    if (getOimkpnllikc()
        != other.getOimkpnllikc()) return false;
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
    hash = (37 * hash) + JJMFLJPBJLF_FIELD_NUMBER;
    hash = (53 * hash) + getJjmfljpbjlf();
    hash = (37 * hash) + OIMKPNLLIKC_FIELD_NUMBER;
    hash = (53 * hash) + getOimkpnllikc();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HLLGNNHICPB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HLLGNNHICPB prototype) {
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
   * ref: HLLGNNHICPB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HLLGNNHICPB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HLLGNNHICPB)
      POGOProtos.Rpc.HLLGNNHICPBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLLGNNHICPB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLLGNNHICPB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HLLGNNHICPB.class, POGOProtos.Rpc.HLLGNNHICPB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HLLGNNHICPB.newBuilder()
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
      jjmfljpbjlf_ = 0;

      oimkpnllikc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HLLGNNHICPB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLLGNNHICPB getDefaultInstanceForType() {
      return POGOProtos.Rpc.HLLGNNHICPB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLLGNNHICPB build() {
      POGOProtos.Rpc.HLLGNNHICPB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HLLGNNHICPB buildPartial() {
      POGOProtos.Rpc.HLLGNNHICPB result = new POGOProtos.Rpc.HLLGNNHICPB(this);
      result.jjmfljpbjlf_ = jjmfljpbjlf_;
      result.oimkpnllikc_ = oimkpnllikc_;
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
      if (other instanceof POGOProtos.Rpc.HLLGNNHICPB) {
        return mergeFrom((POGOProtos.Rpc.HLLGNNHICPB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HLLGNNHICPB other) {
      if (other == POGOProtos.Rpc.HLLGNNHICPB.getDefaultInstance()) return this;
      if (other.getJjmfljpbjlf() != 0) {
        setJjmfljpbjlf(other.getJjmfljpbjlf());
      }
      if (other.getOimkpnllikc() != 0) {
        setOimkpnllikc(other.getOimkpnllikc());
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
      POGOProtos.Rpc.HLLGNNHICPB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HLLGNNHICPB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jjmfljpbjlf_ ;
    /**
     * <code>int32 jjmfljpbjlf = 1;</code>
     * @return The jjmfljpbjlf.
     */
    @java.lang.Override
    public int getJjmfljpbjlf() {
      return jjmfljpbjlf_;
    }
    /**
     * <code>int32 jjmfljpbjlf = 1;</code>
     * @param value The jjmfljpbjlf to set.
     * @return This builder for chaining.
     */
    public Builder setJjmfljpbjlf(int value) {
      
      jjmfljpbjlf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jjmfljpbjlf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJjmfljpbjlf() {
      
      jjmfljpbjlf_ = 0;
      onChanged();
      return this;
    }

    private int oimkpnllikc_ ;
    /**
     * <code>int32 oimkpnllikc = 2;</code>
     * @return The oimkpnllikc.
     */
    @java.lang.Override
    public int getOimkpnllikc() {
      return oimkpnllikc_;
    }
    /**
     * <code>int32 oimkpnllikc = 2;</code>
     * @param value The oimkpnllikc to set.
     * @return This builder for chaining.
     */
    public Builder setOimkpnllikc(int value) {
      
      oimkpnllikc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 oimkpnllikc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOimkpnllikc() {
      
      oimkpnllikc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HLLGNNHICPB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HLLGNNHICPB)
  private static final POGOProtos.Rpc.HLLGNNHICPB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HLLGNNHICPB();
  }

  public static POGOProtos.Rpc.HLLGNNHICPB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HLLGNNHICPB>
      PARSER = new com.google.protobuf.AbstractParser<HLLGNNHICPB>() {
    @java.lang.Override
    public HLLGNNHICPB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HLLGNNHICPB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HLLGNNHICPB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HLLGNNHICPB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HLLGNNHICPB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

